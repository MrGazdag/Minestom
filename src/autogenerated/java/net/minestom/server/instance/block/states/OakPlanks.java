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
public final class OakPlanks {
    public static final BlockState OAK_PLANKS_0 = new BlockState(NamespaceID.from("minecraft:oak_planks_0"), (short) 15, Block.OAK_PLANKS);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(OAK_PLANKS_0);
    }

    public static void initStates() {
        Block.OAK_PLANKS.addBlockState(OAK_PLANKS_0);
    }
}
