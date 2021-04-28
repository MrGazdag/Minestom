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
public final class RedCarpet {
    public static final BlockState RED_CARPET_0 = new BlockState(NamespaceID.from("minecraft:red_carpet_0"), (short) 7884, Block.RED_CARPET);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(RED_CARPET_0);
    }

    public static void initStates() {
        Block.RED_CARPET.addBlockState(RED_CARPET_0);
    }
}
