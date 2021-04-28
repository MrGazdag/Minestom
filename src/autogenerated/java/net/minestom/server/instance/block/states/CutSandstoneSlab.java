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
public final class CutSandstoneSlab {
    public static final BlockState CUT_SANDSTONE_SLAB_0 = new BlockState(NamespaceID.from("minecraft:cut_sandstone_slab_0"), (short) 8358, Block.CUT_SANDSTONE_SLAB, "type=top","waterlogged=true");

    public static final BlockState CUT_SANDSTONE_SLAB_1 = new BlockState(NamespaceID.from("minecraft:cut_sandstone_slab_1"), (short) 8359, Block.CUT_SANDSTONE_SLAB, "type=top","waterlogged=false");

    public static final BlockState CUT_SANDSTONE_SLAB_2 = new BlockState(NamespaceID.from("minecraft:cut_sandstone_slab_2"), (short) 8360, Block.CUT_SANDSTONE_SLAB, "type=bottom","waterlogged=true");

    public static final BlockState CUT_SANDSTONE_SLAB_3 = new BlockState(NamespaceID.from("minecraft:cut_sandstone_slab_3"), (short) 8361, Block.CUT_SANDSTONE_SLAB, "type=bottom","waterlogged=false");

    public static final BlockState CUT_SANDSTONE_SLAB_4 = new BlockState(NamespaceID.from("minecraft:cut_sandstone_slab_4"), (short) 8362, Block.CUT_SANDSTONE_SLAB, "type=double","waterlogged=true");

    public static final BlockState CUT_SANDSTONE_SLAB_5 = new BlockState(NamespaceID.from("minecraft:cut_sandstone_slab_5"), (short) 8363, Block.CUT_SANDSTONE_SLAB, "type=double","waterlogged=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(CUT_SANDSTONE_SLAB_0);
        Registry.BLOCK_STATE_REGISTRY.register(CUT_SANDSTONE_SLAB_1);
        Registry.BLOCK_STATE_REGISTRY.register(CUT_SANDSTONE_SLAB_2);
        Registry.BLOCK_STATE_REGISTRY.register(CUT_SANDSTONE_SLAB_3);
        Registry.BLOCK_STATE_REGISTRY.register(CUT_SANDSTONE_SLAB_4);
        Registry.BLOCK_STATE_REGISTRY.register(CUT_SANDSTONE_SLAB_5);
    }

    public static void initStates() {
        Block.CUT_SANDSTONE_SLAB.addBlockState(CUT_SANDSTONE_SLAB_0);
        Block.CUT_SANDSTONE_SLAB.addBlockState(CUT_SANDSTONE_SLAB_1);
        Block.CUT_SANDSTONE_SLAB.addBlockState(CUT_SANDSTONE_SLAB_2);
        Block.CUT_SANDSTONE_SLAB.addBlockState(CUT_SANDSTONE_SLAB_3);
        Block.CUT_SANDSTONE_SLAB.addBlockState(CUT_SANDSTONE_SLAB_4);
        Block.CUT_SANDSTONE_SLAB.addBlockState(CUT_SANDSTONE_SLAB_5);
    }
}
