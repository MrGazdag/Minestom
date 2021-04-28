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
public final class SoulLantern {
    public static final BlockState SOUL_LANTERN_0 = new BlockState(NamespaceID.from("minecraft:soul_lantern_0"), (short) 14894, Block.SOUL_LANTERN, "hanging=true","waterlogged=true");

    public static final BlockState SOUL_LANTERN_1 = new BlockState(NamespaceID.from("minecraft:soul_lantern_1"), (short) 14895, Block.SOUL_LANTERN, "hanging=true","waterlogged=false");

    public static final BlockState SOUL_LANTERN_2 = new BlockState(NamespaceID.from("minecraft:soul_lantern_2"), (short) 14896, Block.SOUL_LANTERN, "hanging=false","waterlogged=true");

    public static final BlockState SOUL_LANTERN_3 = new BlockState(NamespaceID.from("minecraft:soul_lantern_3"), (short) 14897, Block.SOUL_LANTERN, "hanging=false","waterlogged=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(SOUL_LANTERN_0);
        Registry.BLOCK_STATE_REGISTRY.register(SOUL_LANTERN_1);
        Registry.BLOCK_STATE_REGISTRY.register(SOUL_LANTERN_2);
        Registry.BLOCK_STATE_REGISTRY.register(SOUL_LANTERN_3);
    }

    public static void initStates() {
        Block.SOUL_LANTERN.addBlockState(SOUL_LANTERN_0);
        Block.SOUL_LANTERN.addBlockState(SOUL_LANTERN_1);
        Block.SOUL_LANTERN.addBlockState(SOUL_LANTERN_2);
        Block.SOUL_LANTERN.addBlockState(SOUL_LANTERN_3);
    }
}
