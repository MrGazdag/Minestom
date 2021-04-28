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
public final class Carrots {
    public static final BlockState CARROTS_0 = new BlockState(NamespaceID.from("minecraft:carrots_0"), (short) 6334, Block.CARROTS, "age=0");

    public static final BlockState CARROTS_1 = new BlockState(NamespaceID.from("minecraft:carrots_1"), (short) 6335, Block.CARROTS, "age=1");

    public static final BlockState CARROTS_2 = new BlockState(NamespaceID.from("minecraft:carrots_2"), (short) 6336, Block.CARROTS, "age=2");

    public static final BlockState CARROTS_3 = new BlockState(NamespaceID.from("minecraft:carrots_3"), (short) 6337, Block.CARROTS, "age=3");

    public static final BlockState CARROTS_4 = new BlockState(NamespaceID.from("minecraft:carrots_4"), (short) 6338, Block.CARROTS, "age=4");

    public static final BlockState CARROTS_5 = new BlockState(NamespaceID.from("minecraft:carrots_5"), (short) 6339, Block.CARROTS, "age=5");

    public static final BlockState CARROTS_6 = new BlockState(NamespaceID.from("minecraft:carrots_6"), (short) 6340, Block.CARROTS, "age=6");

    public static final BlockState CARROTS_7 = new BlockState(NamespaceID.from("minecraft:carrots_7"), (short) 6341, Block.CARROTS, "age=7");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(CARROTS_0);
        Registry.BLOCK_STATE_REGISTRY.register(CARROTS_1);
        Registry.BLOCK_STATE_REGISTRY.register(CARROTS_2);
        Registry.BLOCK_STATE_REGISTRY.register(CARROTS_3);
        Registry.BLOCK_STATE_REGISTRY.register(CARROTS_4);
        Registry.BLOCK_STATE_REGISTRY.register(CARROTS_5);
        Registry.BLOCK_STATE_REGISTRY.register(CARROTS_6);
        Registry.BLOCK_STATE_REGISTRY.register(CARROTS_7);
    }

    public static void initStates() {
        Block.CARROTS.addBlockState(CARROTS_0);
        Block.CARROTS.addBlockState(CARROTS_1);
        Block.CARROTS.addBlockState(CARROTS_2);
        Block.CARROTS.addBlockState(CARROTS_3);
        Block.CARROTS.addBlockState(CARROTS_4);
        Block.CARROTS.addBlockState(CARROTS_5);
        Block.CARROTS.addBlockState(CARROTS_6);
        Block.CARROTS.addBlockState(CARROTS_7);
    }
}
