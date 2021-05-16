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
public final class WitherRose {
    public static final BlockState WITHER_ROSE_0 = new BlockState(NamespaceID.from("minecraft:wither_rose_0"), (short) 1423, Block.WITHER_ROSE, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(WITHER_ROSE_0);
    }

    public static void initStates() {
        Block.WITHER_ROSE.addBlockState(WITHER_ROSE_0);
    }
}