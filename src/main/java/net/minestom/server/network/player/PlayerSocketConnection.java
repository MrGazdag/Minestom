package net.minestom.server.network.player;

import net.kyori.adventure.translation.GlobalTranslator;
import net.minestom.server.MinecraftServer;
import net.minestom.server.adventure.MinestomAdventure;
import net.minestom.server.entity.Player;
import net.minestom.server.entity.PlayerSkin;
import net.minestom.server.extras.mojangAuth.MojangCrypt;
import net.minestom.server.network.ConnectionState;
import net.minestom.server.network.PacketProcessor;
import net.minestom.server.network.packet.FramedPacket;
import net.minestom.server.network.packet.server.ComponentHoldingServerPacket;
import net.minestom.server.network.packet.server.ServerPacket;
import net.minestom.server.network.packet.server.login.SetCompressionPacket;
import net.minestom.server.network.socket.Server;
import net.minestom.server.network.socket.Worker;
import net.minestom.server.utils.PacketUtils;
import net.minestom.server.utils.Utils;
import net.minestom.server.utils.binary.BinaryBuffer;
import net.minestom.server.utils.validate.Check;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import java.io.IOException;
import java.net.SocketAddress;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.DataFormatException;

/**
 * Represents a socket connection.
 * <p>
 * It is the implementation used for all network client.
 */
@ApiStatus.Internal
public class PlayerSocketConnection extends PlayerConnection {
    private final static Logger LOGGER = LoggerFactory.getLogger(PlayerSocketConnection.class);

    private final Worker worker;
    private final SocketChannel channel;
    private SocketAddress remoteAddress;

    private volatile boolean encrypted = false;
    private volatile boolean compressed = false;

    //Could be null. Only used for Mojang Auth
    private byte[] nonce = new byte[4];
    private Cipher decryptCipher;
    private Cipher encryptCipher;

    // Data from client packets
    private String loginUsername;
    private String serverAddress;
    private int serverPort;
    private int protocolVersion;

    // Used for the login plugin request packet, to retrieve the channel from a message id,
    // cleared once the player enters the play state
    private final Map<Integer, String> pluginRequestMap = new ConcurrentHashMap<>();

    // Bungee
    private UUID bungeeUuid;
    private PlayerSkin bungeeSkin;

    private final BinaryBuffer tickBuffer = BinaryBuffer.ofSize(Server.SOCKET_BUFFER_SIZE);
    private volatile BinaryBuffer cacheBuffer;

    public PlayerSocketConnection(@NotNull Worker worker, @NotNull SocketChannel channel, SocketAddress remoteAddress) {
        super();
        this.worker = worker;
        this.channel = channel;
        this.remoteAddress = remoteAddress;
    }

    public void processPackets(Worker.Context workerContext, PacketProcessor packetProcessor) {
        final var readBuffer = workerContext.readBuffer;
        // Decrypt data
        if (encrypted) {
            final Cipher cipher = decryptCipher;
            final int remainingBytes = readBuffer.readableBytes();
            final byte[] bytes = readBuffer.readRemainingBytes();
            byte[] output = new byte[cipher.getOutputSize(remainingBytes)];
            try {
                cipher.update(bytes, 0, remainingBytes, output, 0);
            } catch (ShortBufferException e) {
                MinecraftServer.getExceptionManager().handleException(e);
                return;
            }
            readBuffer.clear();
            readBuffer.writeBytes(output);
        }
        final int limit = readBuffer.writerOffset();
        // Read all packets
        while (readBuffer.readableBytes() > 0) {
            final var beginMark = readBuffer.mark();
            try {
                // Ensure that the buffer contains the full packet (or wait for next socket read)
                final int packetLength = readBuffer.readVarInt();
                final int readerStart = readBuffer.readerOffset();
                final int packetEnd = readerStart + packetLength;
                if (packetEnd > readBuffer.writerOffset()) {
                    // Integrity fail
                    throw new BufferUnderflowException();
                }
                // Read packet https://wiki.vg/Protocol#Packet_format
                BinaryBuffer content;
                int payloadLength;
                if (!compressed) {
                    // Compression disabled, payload is following
                    content = readBuffer;
                    payloadLength = packetLength;
                } else {
                    final int dataLength = readBuffer.readVarInt();
                    if (dataLength == 0) {
                        // Data is too small to be compressed, payload is following
                        content = readBuffer;
                        payloadLength = packetLength - (content.readerOffset() - readerStart);
                    } else {
                        // Decompress to content buffer
                        content = workerContext.contentBuffer;
                        payloadLength = dataLength;
                        final var contentStartMark = content.mark();
                        try {
                            final var inflater = workerContext.inflater;
                            inflater.setInput(readBuffer.asByteBuffer(readBuffer.readerOffset(), packetEnd));
                            inflater.inflate(content.asByteBuffer(0, content.capacity()));
                            inflater.reset();
                        } catch (DataFormatException e) {
                            MinecraftServer.getExceptionManager().handleException(e);
                        }
                        content.reset(contentStartMark);
                    }
                }
                // Process packet
                ByteBuffer payload = content.asByteBuffer(content.readerOffset(), payloadLength);
                final int packetId = Utils.readVarInt(payload);
                try {
                    packetProcessor.process(this, packetId, payload);
                } catch (Exception e) {
                    // Error while reading the packet
                    MinecraftServer.getExceptionManager().handleException(e);
                    break;
                } finally {
                    if (payload.position() != payload.limit()) {
                        LOGGER.warn("WARNING: Packet 0x{} not fully read ({}), {}",
                                Integer.toHexString(packetId), payload, this);
                    }
                }
                // Position buffer to read the next packet
                readBuffer.reset(packetEnd, limit);
            } catch (BufferUnderflowException e) {
                readBuffer.reset(beginMark);
                this.cacheBuffer = BinaryBuffer.copy(readBuffer);
                break;
            }
        }
    }

    public void consumeCache(BinaryBuffer buffer) {
        if (cacheBuffer != null) {
            buffer.write(cacheBuffer);
            this.cacheBuffer = null;
        }
    }

    /**
     * Sets the encryption key and add the codecs to the pipeline.
     *
     * @param secretKey the secret key to use in the encryption
     * @throws IllegalStateException if encryption is already enabled for this connection
     */
    public void setEncryptionKey(@NotNull SecretKey secretKey) {
        Check.stateCondition(encrypted, "Encryption is already enabled!");
        this.decryptCipher = MojangCrypt.getCipher(2, secretKey);
        this.encryptCipher = MojangCrypt.getCipher(1, secretKey);
        this.encrypted = true;
    }

    /**
     * Enables compression and add a new codec to the pipeline.
     *
     * @throws IllegalStateException if encryption is already enabled for this connection
     */
    public void startCompression() {
        Check.stateCondition(compressed, "Compression is already enabled!");
        final int threshold = MinecraftServer.getCompressionThreshold();
        Check.stateCondition(threshold == 0, "Compression cannot be enabled because the threshold is equal to 0");
        writeAndFlush(new SetCompressionPacket(threshold));
        this.compressed = true;
    }

    /**
     * Writes a packet to the connection channel.
     * <p>
     * All packets are flushed during {@link net.minestom.server.entity.Player#update(long)}.
     *
     * @param serverPacket the packet to write
     */
    @Override
    public void sendPacket(@NotNull ServerPacket serverPacket, boolean skipTranslating) {
        if (!channel.isConnected()) return;
        if (shouldSendPacket(serverPacket)) {
            final Player player = getPlayer();
            if (player != null) {
                // Flush happen during #update()
                if ((MinestomAdventure.AUTOMATIC_COMPONENT_TRANSLATION && !skipTranslating) && serverPacket instanceof ComponentHoldingServerPacket) {
                    serverPacket = ((ComponentHoldingServerPacket) serverPacket).copyWithOperator(component ->
                            GlobalTranslator.render(component, Objects.requireNonNullElseGet(player.getLocale(), MinestomAdventure::getDefaultLocale)));
                }
                write(serverPacket);
            } else {
                // Player is probably not logged yet
                writeAndFlush(serverPacket);
            }
        }
    }

    public void write(@NotNull ByteBuffer buffer) {
        synchronized (tickBuffer) {
            if (!tickBuffer.canWrite(buffer.position())) {
                // Tick buffer is full, flush before appending
                flush();
            }
            this.tickBuffer.write(buffer.flip());
        }
    }

    public void write(@NotNull FramedPacket framedPacket) {
        write(framedPacket.body());
    }

    public void write(@NotNull ServerPacket packet) {
        // TODO write directly to the tick buffer
        write(PacketUtils.createFramedPacket(packet, compressed));
    }

    public void writeAndFlush(@NotNull ServerPacket packet) {
        synchronized (tickBuffer) {
            write(packet);
            flush();
        }
    }

    @Override
    public void flush() {
        if (!channel.isOpen()) return;
        synchronized (tickBuffer) {
            if (tickBuffer.readableBytes() == 0) return;
            try {
                if (encrypted) {
                    final Cipher cipher = encryptCipher;
                    // Encrypt data first
                    final int remainingBytes = tickBuffer.readableBytes();
                    final byte[] bytes = tickBuffer.readRemainingBytes();
                    byte[] outTempArray = new byte[cipher.getOutputSize(remainingBytes)];
                    cipher.update(bytes, 0, remainingBytes, outTempArray);
                    this.tickBuffer.clear();
                    this.tickBuffer.writeBytes(outTempArray);
                }
                this.tickBuffer.writeChannel(channel);
            } catch (IOException e) {
                MinecraftServer.getExceptionManager().handleException(e);
            } catch (ShortBufferException e) {
                e.printStackTrace();
            } finally {
                this.tickBuffer.clear();
            }
        }
    }

    @Override
    public @NotNull SocketAddress getRemoteAddress() {
        return remoteAddress;
    }

    /**
     * Changes the internal remote address field.
     * <p>
     * Mostly unsafe, used internally when interacting with a proxy.
     *
     * @param remoteAddress the new connection remote address
     */
    @ApiStatus.Internal
    public void setRemoteAddress(@NotNull SocketAddress remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    @Override
    public void disconnect() {
        this.worker.disconnect(this, channel);
    }

    public @NotNull SocketChannel getChannel() {
        return channel;
    }

    /**
     * Retrieves the username received from the client during connection.
     * <p>
     * This value has not been checked and could be anything.
     *
     * @return the username given by the client, unchecked
     */
    public @Nullable String getLoginUsername() {
        return loginUsername;
    }

    /**
     * Sets the internal login username field.
     *
     * @param loginUsername the new login username field
     */
    public void UNSAFE_setLoginUsername(@NotNull String loginUsername) {
        this.loginUsername = loginUsername;
    }

    /**
     * Gets the server address that the client used to connect.
     * <p>
     * WARNING: it is given by the client, it is possible for it to be wrong.
     *
     * @return the server address used
     */
    @Override
    public @Nullable String getServerAddress() {
        return serverAddress;
    }

    /**
     * Gets the server port that the client used to connect.
     * <p>
     * WARNING: it is given by the client, it is possible for it to be wrong.
     *
     * @return the server port used
     */
    @Override
    public int getServerPort() {
        return serverPort;
    }

    /**
     * Gets the protocol version of a client.
     *
     * @return protocol version of client.
     */
    @Override
    public int getProtocolVersion() {
        return protocolVersion;
    }

    /**
     * Used in {@link net.minestom.server.network.packet.client.handshake.HandshakePacket} to change the internal fields.
     *
     * @param serverAddress   the server address which the client used
     * @param serverPort      the server port which the client used
     * @param protocolVersion the protocol version which the client used
     */
    public void refreshServerInformation(@Nullable String serverAddress, int serverPort, int protocolVersion) {
        this.serverAddress = serverAddress;
        this.serverPort = serverPort;
        this.protocolVersion = protocolVersion;
    }

    public @Nullable UUID getBungeeUuid() {
        return bungeeUuid;
    }

    public void UNSAFE_setBungeeUuid(UUID bungeeUuid) {
        this.bungeeUuid = bungeeUuid;
    }

    public @Nullable PlayerSkin getBungeeSkin() {
        return bungeeSkin;
    }

    public void UNSAFE_setBungeeSkin(PlayerSkin bungeeSkin) {
        this.bungeeSkin = bungeeSkin;
    }

    /**
     * Adds an entry to the plugin request map.
     * <p>
     * Only working if {@link #getConnectionState()} is {@link net.minestom.server.network.ConnectionState#LOGIN}.
     *
     * @param messageId the message id
     * @param channel   the packet channel
     * @throws IllegalStateException if a messageId with the value {@code messageId} already exists for this connection
     */
    public void addPluginRequestEntry(int messageId, @NotNull String channel) {
        if (!getConnectionState().equals(ConnectionState.LOGIN)) {
            return;
        }
        Check.stateCondition(pluginRequestMap.containsKey(messageId), "You cannot have two messageId with the same value");
        this.pluginRequestMap.put(messageId, channel);
    }

    /**
     * Gets a request channel from a message id, previously cached using {@link #addPluginRequestEntry(int, String)}.
     * <p>
     * Be aware that the internal map is cleared once the player enters the play state.
     *
     * @param messageId the message id
     * @return the channel linked to the message id, null if not found
     */
    public @Nullable String getPluginRequestChannel(int messageId) {
        return pluginRequestMap.get(messageId);
    }

    @Override
    public void setConnectionState(@NotNull ConnectionState connectionState) {
        super.setConnectionState(connectionState);
        // Clear the plugin request map (since it is not used anymore)
        if (connectionState.equals(ConnectionState.PLAY)) {
            this.pluginRequestMap.clear();
        }
    }

    public byte[] getNonce() {
        return nonce;
    }

    public void setNonce(byte[] nonce) {
        this.nonce = nonce;
    }
}
