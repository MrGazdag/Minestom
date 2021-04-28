package net.minestom.server.instance.block.states;

import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;
import net.minestom.server.registry.Registry;
import net.minestom.server.utils.NamespaceID;


/**
 * AUTOGENERATED by BlockGenerator
 */
@Deprecated(
        since = "forever",
        forRemoval = false
)
public final class JungleLog {
    public static final BlockState JUNGLE_LOG_0 = new BlockState(NamespaceID.from("minecraft:jungle_log_0"), (short) 82, Block.JUNGLE_LOG, "axis=x");

    public static final BlockState JUNGLE_LOG_1 = new BlockState(NamespaceID.from("minecraft:jungle_log_1"), (short) 83, Block.JUNGLE_LOG, "axis=y");

    public static final BlockState JUNGLE_LOG_2 = new BlockState(NamespaceID.from("minecraft:jungle_log_2"), (short) 84, Block.JUNGLE_LOG, "axis=z");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(JUNGLE_LOG_0);
        Registry.BLOCK_STATE_REGISTRY.register(JUNGLE_LOG_1);
        Registry.BLOCK_STATE_REGISTRY.register(JUNGLE_LOG_2);
    }

    public static void initStates() {
        Block.JUNGLE_LOG.addBlockState(JUNGLE_LOG_0);
        Block.JUNGLE_LOG.addBlockState(JUNGLE_LOG_1);
        Block.JUNGLE_LOG.addBlockState(JUNGLE_LOG_2);
    }
}
