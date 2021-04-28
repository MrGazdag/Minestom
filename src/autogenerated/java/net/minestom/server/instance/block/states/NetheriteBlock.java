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
public final class NetheriteBlock {
    public static final BlockState NETHERITE_BLOCK_0 = new BlockState(NamespaceID.from("minecraft:netherite_block_0"), (short) 15834, Block.NETHERITE_BLOCK);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(NETHERITE_BLOCK_0);
    }

    public static void initStates() {
        Block.NETHERITE_BLOCK.addBlockState(NETHERITE_BLOCK_0);
    }
}
