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
public final class GrayWallBanner {
    public static final BlockState GRAY_WALL_BANNER_0 = new BlockState(NamespaceID.from("minecraft:gray_wall_banner_0"), (short) 8185, Block.GRAY_WALL_BANNER, "facing=north");

    public static final BlockState GRAY_WALL_BANNER_1 = new BlockState(NamespaceID.from("minecraft:gray_wall_banner_1"), (short) 8186, Block.GRAY_WALL_BANNER, "facing=south");

    public static final BlockState GRAY_WALL_BANNER_2 = new BlockState(NamespaceID.from("minecraft:gray_wall_banner_2"), (short) 8187, Block.GRAY_WALL_BANNER, "facing=west");

    public static final BlockState GRAY_WALL_BANNER_3 = new BlockState(NamespaceID.from("minecraft:gray_wall_banner_3"), (short) 8188, Block.GRAY_WALL_BANNER, "facing=east");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(GRAY_WALL_BANNER_0);
        Registry.BLOCK_STATE_REGISTRY.register(GRAY_WALL_BANNER_1);
        Registry.BLOCK_STATE_REGISTRY.register(GRAY_WALL_BANNER_2);
        Registry.BLOCK_STATE_REGISTRY.register(GRAY_WALL_BANNER_3);
    }

    public static void initStates() {
        Block.GRAY_WALL_BANNER.addBlockState(GRAY_WALL_BANNER_0);
        Block.GRAY_WALL_BANNER.addBlockState(GRAY_WALL_BANNER_1);
        Block.GRAY_WALL_BANNER.addBlockState(GRAY_WALL_BANNER_2);
        Block.GRAY_WALL_BANNER.addBlockState(GRAY_WALL_BANNER_3);
    }
}
