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
public final class DarkPrismarineSlab {
    public static final BlockState DARK_PRISMARINE_SLAB_0 = new BlockState(NamespaceID.from("minecraft:dark_prismarine_slab_0"), (short) 7860, Block.DARK_PRISMARINE_SLAB, "type=top","waterlogged=true");

    public static final BlockState DARK_PRISMARINE_SLAB_1 = new BlockState(NamespaceID.from("minecraft:dark_prismarine_slab_1"), (short) 7861, Block.DARK_PRISMARINE_SLAB, "type=top","waterlogged=false");

    public static final BlockState DARK_PRISMARINE_SLAB_2 = new BlockState(NamespaceID.from("minecraft:dark_prismarine_slab_2"), (short) 7862, Block.DARK_PRISMARINE_SLAB, "type=bottom","waterlogged=true");

    public static final BlockState DARK_PRISMARINE_SLAB_3 = new BlockState(NamespaceID.from("minecraft:dark_prismarine_slab_3"), (short) 7863, Block.DARK_PRISMARINE_SLAB, "type=bottom","waterlogged=false");

    public static final BlockState DARK_PRISMARINE_SLAB_4 = new BlockState(NamespaceID.from("minecraft:dark_prismarine_slab_4"), (short) 7864, Block.DARK_PRISMARINE_SLAB, "type=double","waterlogged=true");

    public static final BlockState DARK_PRISMARINE_SLAB_5 = new BlockState(NamespaceID.from("minecraft:dark_prismarine_slab_5"), (short) 7865, Block.DARK_PRISMARINE_SLAB, "type=double","waterlogged=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(DARK_PRISMARINE_SLAB_0);
        Registry.BLOCK_STATE_REGISTRY.register(DARK_PRISMARINE_SLAB_1);
        Registry.BLOCK_STATE_REGISTRY.register(DARK_PRISMARINE_SLAB_2);
        Registry.BLOCK_STATE_REGISTRY.register(DARK_PRISMARINE_SLAB_3);
        Registry.BLOCK_STATE_REGISTRY.register(DARK_PRISMARINE_SLAB_4);
        Registry.BLOCK_STATE_REGISTRY.register(DARK_PRISMARINE_SLAB_5);
    }

    public static void initStates() {
        Block.DARK_PRISMARINE_SLAB.addBlockState(DARK_PRISMARINE_SLAB_0);
        Block.DARK_PRISMARINE_SLAB.addBlockState(DARK_PRISMARINE_SLAB_1);
        Block.DARK_PRISMARINE_SLAB.addBlockState(DARK_PRISMARINE_SLAB_2);
        Block.DARK_PRISMARINE_SLAB.addBlockState(DARK_PRISMARINE_SLAB_3);
        Block.DARK_PRISMARINE_SLAB.addBlockState(DARK_PRISMARINE_SLAB_4);
        Block.DARK_PRISMARINE_SLAB.addBlockState(DARK_PRISMARINE_SLAB_5);
    }
}
