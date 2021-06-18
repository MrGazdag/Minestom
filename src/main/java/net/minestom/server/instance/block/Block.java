package net.minestom.server.instance.block;

import net.minestom.server.registry.ProtocolObject;
import net.minestom.server.registry.Registry;
import net.minestom.server.tag.Tag;
import net.minestom.server.tag.TagReadable;
import net.minestom.server.utils.NamespaceID;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jglrxavpok.hephaistos.nbt.NBTCompound;

import java.util.Map;
import java.util.Objects;
import java.util.function.BiPredicate;

/**
 * Represents a block that can be placed anywhere.
 * Block objects are expected to be reusable and therefore do not
 * retain placement data (e.g. block position)
 * <p>
 * Implementations are expected to be immutable.
 */
public interface Block extends ProtocolObject, TagReadable, BlockConstants {

    @Contract(pure = true)
    @NotNull Block withProperty(@NotNull String property, @NotNull String value);

    @Contract(pure = true)
    default <T> @NotNull Block withProperty(@NotNull BlockProperty<T> property, @NotNull T value) {
        return withProperty(property.getName(), value.toString());
    }

    @Contract(pure = true)
    @NotNull Block withNbt(@Nullable NBTCompound compound);

    @Contract(pure = true)
    default <T> @NotNull Block withTag(@NotNull Tag<T> tag, @Nullable T value) {
        var compound = Objects.requireNonNullElseGet(getNbt(), NBTCompound::new);
        tag.write(compound, value);
        return withNbt(compound);
    }

    @Contract(pure = true)
    @NotNull Block withHandler(@Nullable BlockHandler handler);

    @Contract(pure = true)
    @Nullable NBTCompound getNbt();

    @Contract(pure = true)
    @Nullable BlockHandler getHandler();

    @Contract(pure = true)
    @NotNull Map<String, String> getProperties();

    @Contract(pure = true)
    default @NotNull String getProperty(@NotNull String property) {
        return getProperties().get(property);
    }

    @Contract(pure = true)
    default <T> @NotNull String getProperty(@NotNull BlockProperty<T> property) {
        return getProperty(property.getName());
    }

    @Contract(pure = true)
    @NotNull Registry.BlockEntry registry();

    @Override
    default @NotNull NamespaceID getNamespaceId() {
        return NamespaceID.from(registry().namespace());
    }

    @Override
    default int getId() {
        return registry().id();
    }

    default short getStateId() {
        return (short) registry().stateId();
    }

    default boolean isAir() {
        return registry().isAir();
    }

    default boolean isSolid() {
        return registry().isSolid();
    }

    default boolean isLiquid() {
        return registry().isLiquid();
    }

    default boolean compare(@NotNull Block block, @NotNull Comparator comparator) {
        return comparator.test(this, block);
    }

    default boolean compare(@NotNull Block block) {
        return compare(block, Comparator.ID);
    }

    static @Nullable Block fromNamespaceId(@NotNull String namespaceID) {
        return BlockRegistry.get(namespaceID);
    }

    static @Nullable Block fromNamespaceId(@NotNull NamespaceID namespaceID) {
        return fromNamespaceId(namespaceID.asString());
    }

    static @Nullable Block fromStateId(short stateId) {
        return BlockRegistry.getState(stateId);
    }

    static @Nullable Block fromBlockId(int blockId) {
        return BlockRegistry.getId(blockId);
    }

    @FunctionalInterface
    interface Comparator extends BiPredicate<Block, Block> {
        Comparator IDENTITY = (b1, b2) -> b1 == b2;

        Comparator ID = (b1, b2) -> b1.getId() == b2.getId();

        Comparator STATE = (b1, b2) -> b1.getStateId() == b2.getStateId();
    }
}