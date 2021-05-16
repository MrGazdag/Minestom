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
public final class MagentaWool {
    public static final BlockState MAGENTA_WOOL_0 = new BlockState(NamespaceID.from("minecraft:magenta_wool_0"), (short) 1386, Block.MAGENTA_WOOL, new RawBlockStateData(0.8, 0, true, "NORMAL", true, true, false, false, true, true, 3, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(MAGENTA_WOOL_0);
    }

    public static void initStates() {
        Block.MAGENTA_WOOL.addBlockState(MAGENTA_WOOL_0);
    }
}