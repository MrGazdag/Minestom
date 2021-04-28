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
public final class WarpedWartBlock {
    public static final BlockState WARPED_WART_BLOCK_0 = new BlockState(NamespaceID.from("minecraft:warped_wart_block_0"), (short) 14980, Block.WARPED_WART_BLOCK);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(WARPED_WART_BLOCK_0);
    }

    public static void initStates() {
        Block.WARPED_WART_BLOCK.addBlockState(WARPED_WART_BLOCK_0);
    }
}
