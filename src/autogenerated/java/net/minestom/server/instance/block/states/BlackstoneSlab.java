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
public final class BlackstoneSlab {
    public static final BlockState BLACKSTONE_SLAB_0 = new BlockState(NamespaceID.from("minecraft:blackstone_slab_0"), (short) 16252, Block.BLACKSTONE_SLAB, "type=top","waterlogged=true");

    public static final BlockState BLACKSTONE_SLAB_1 = new BlockState(NamespaceID.from("minecraft:blackstone_slab_1"), (short) 16253, Block.BLACKSTONE_SLAB, "type=top","waterlogged=false");

    public static final BlockState BLACKSTONE_SLAB_2 = new BlockState(NamespaceID.from("minecraft:blackstone_slab_2"), (short) 16254, Block.BLACKSTONE_SLAB, "type=bottom","waterlogged=true");

    public static final BlockState BLACKSTONE_SLAB_3 = new BlockState(NamespaceID.from("minecraft:blackstone_slab_3"), (short) 16255, Block.BLACKSTONE_SLAB, "type=bottom","waterlogged=false");

    public static final BlockState BLACKSTONE_SLAB_4 = new BlockState(NamespaceID.from("minecraft:blackstone_slab_4"), (short) 16256, Block.BLACKSTONE_SLAB, "type=double","waterlogged=true");

    public static final BlockState BLACKSTONE_SLAB_5 = new BlockState(NamespaceID.from("minecraft:blackstone_slab_5"), (short) 16257, Block.BLACKSTONE_SLAB, "type=double","waterlogged=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(BLACKSTONE_SLAB_0);
        Registry.BLOCK_STATE_REGISTRY.register(BLACKSTONE_SLAB_1);
        Registry.BLOCK_STATE_REGISTRY.register(BLACKSTONE_SLAB_2);
        Registry.BLOCK_STATE_REGISTRY.register(BLACKSTONE_SLAB_3);
        Registry.BLOCK_STATE_REGISTRY.register(BLACKSTONE_SLAB_4);
        Registry.BLOCK_STATE_REGISTRY.register(BLACKSTONE_SLAB_5);
    }

    public static void initStates() {
        Block.BLACKSTONE_SLAB.addBlockState(BLACKSTONE_SLAB_0);
        Block.BLACKSTONE_SLAB.addBlockState(BLACKSTONE_SLAB_1);
        Block.BLACKSTONE_SLAB.addBlockState(BLACKSTONE_SLAB_2);
        Block.BLACKSTONE_SLAB.addBlockState(BLACKSTONE_SLAB_3);
        Block.BLACKSTONE_SLAB.addBlockState(BLACKSTONE_SLAB_4);
        Block.BLACKSTONE_SLAB.addBlockState(BLACKSTONE_SLAB_5);
    }
}
