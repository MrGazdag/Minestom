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
public final class Lodestone {
    public static final BlockState LODESTONE_0 = new BlockState(NamespaceID.from("minecraft:lodestone_0"), (short) 15846, Block.LODESTONE);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(LODESTONE_0);
    }

    public static void initStates() {
        Block.LODESTONE.addBlockState(LODESTONE_0);
    }
}
