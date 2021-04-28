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
public final class BirchWallSign {
    public static final BlockState BIRCH_WALL_SIGN_0 = new BlockState(NamespaceID.from("minecraft:birch_wall_sign_0"), (short) 3751, Block.BIRCH_WALL_SIGN, "facing=north","waterlogged=true");

    public static final BlockState BIRCH_WALL_SIGN_1 = new BlockState(NamespaceID.from("minecraft:birch_wall_sign_1"), (short) 3752, Block.BIRCH_WALL_SIGN, "facing=north","waterlogged=false");

    public static final BlockState BIRCH_WALL_SIGN_2 = new BlockState(NamespaceID.from("minecraft:birch_wall_sign_2"), (short) 3753, Block.BIRCH_WALL_SIGN, "facing=south","waterlogged=true");

    public static final BlockState BIRCH_WALL_SIGN_3 = new BlockState(NamespaceID.from("minecraft:birch_wall_sign_3"), (short) 3754, Block.BIRCH_WALL_SIGN, "facing=south","waterlogged=false");

    public static final BlockState BIRCH_WALL_SIGN_4 = new BlockState(NamespaceID.from("minecraft:birch_wall_sign_4"), (short) 3755, Block.BIRCH_WALL_SIGN, "facing=west","waterlogged=true");

    public static final BlockState BIRCH_WALL_SIGN_5 = new BlockState(NamespaceID.from("minecraft:birch_wall_sign_5"), (short) 3756, Block.BIRCH_WALL_SIGN, "facing=west","waterlogged=false");

    public static final BlockState BIRCH_WALL_SIGN_6 = new BlockState(NamespaceID.from("minecraft:birch_wall_sign_6"), (short) 3757, Block.BIRCH_WALL_SIGN, "facing=east","waterlogged=true");

    public static final BlockState BIRCH_WALL_SIGN_7 = new BlockState(NamespaceID.from("minecraft:birch_wall_sign_7"), (short) 3758, Block.BIRCH_WALL_SIGN, "facing=east","waterlogged=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(BIRCH_WALL_SIGN_0);
        Registry.BLOCK_STATE_REGISTRY.register(BIRCH_WALL_SIGN_1);
        Registry.BLOCK_STATE_REGISTRY.register(BIRCH_WALL_SIGN_2);
        Registry.BLOCK_STATE_REGISTRY.register(BIRCH_WALL_SIGN_3);
        Registry.BLOCK_STATE_REGISTRY.register(BIRCH_WALL_SIGN_4);
        Registry.BLOCK_STATE_REGISTRY.register(BIRCH_WALL_SIGN_5);
        Registry.BLOCK_STATE_REGISTRY.register(BIRCH_WALL_SIGN_6);
        Registry.BLOCK_STATE_REGISTRY.register(BIRCH_WALL_SIGN_7);
    }

    public static void initStates() {
        Block.BIRCH_WALL_SIGN.addBlockState(BIRCH_WALL_SIGN_0);
        Block.BIRCH_WALL_SIGN.addBlockState(BIRCH_WALL_SIGN_1);
        Block.BIRCH_WALL_SIGN.addBlockState(BIRCH_WALL_SIGN_2);
        Block.BIRCH_WALL_SIGN.addBlockState(BIRCH_WALL_SIGN_3);
        Block.BIRCH_WALL_SIGN.addBlockState(BIRCH_WALL_SIGN_4);
        Block.BIRCH_WALL_SIGN.addBlockState(BIRCH_WALL_SIGN_5);
        Block.BIRCH_WALL_SIGN.addBlockState(BIRCH_WALL_SIGN_6);
        Block.BIRCH_WALL_SIGN.addBlockState(BIRCH_WALL_SIGN_7);
    }
}
