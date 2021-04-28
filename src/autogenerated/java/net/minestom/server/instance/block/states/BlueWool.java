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
public final class BlueWool {
    public static final BlockState BLUE_WOOL_0 = new BlockState(NamespaceID.from("minecraft:blue_wool_0"), (short) 1395, Block.BLUE_WOOL);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(BLUE_WOOL_0);
    }

    public static void initStates() {
        Block.BLUE_WOOL.addBlockState(BLUE_WOOL_0);
    }
}
