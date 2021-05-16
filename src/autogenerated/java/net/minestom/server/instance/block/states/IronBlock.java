package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;
import net.minestom.server.raw_data.RawBlockStateData;
import net.minestom.server.registry.Registry;
import net.minestom.server.utils.NamespaceID;

/**
 * AUTOGENERATED by BlockGenerator
 */
@Deprecated(
        since = "forever",
        forRemoval = false
)
public final class IronBlock {
    public static final BlockState IRON_BLOCK_0 = new BlockState(NamespaceID.from("minecraft:iron_block_0"), (short) 1428, Block.IRON_BLOCK, new RawBlockStateData(5.0, 0, true, "NORMAL", true, false, false, false, true, true, 6, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(IRON_BLOCK_0);
    }

    public static void initStates() {
        Block.IRON_BLOCK.addBlockState(IRON_BLOCK_0);
    }
}