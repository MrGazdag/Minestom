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
public final class Peony {
    public static final BlockState PEONY_0 = new BlockState(NamespaceID.from("minecraft:peony_0"), (short) 7895, Block.PEONY, "half=upper");

    public static final BlockState PEONY_1 = new BlockState(NamespaceID.from("minecraft:peony_1"), (short) 7896, Block.PEONY, "half=lower");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(PEONY_0);
        Registry.BLOCK_STATE_REGISTRY.register(PEONY_1);
    }

    public static void initStates() {
        Block.PEONY.addBlockState(PEONY_0);
        Block.PEONY.addBlockState(PEONY_1);
    }
}
