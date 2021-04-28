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
public final class ZombieWallHead {
    public static final BlockState ZOMBIE_WALL_HEAD_0 = new BlockState(NamespaceID.from("minecraft:zombie_wall_head_0"), (short) 6550, Block.ZOMBIE_WALL_HEAD, "facing=north");

    public static final BlockState ZOMBIE_WALL_HEAD_1 = new BlockState(NamespaceID.from("minecraft:zombie_wall_head_1"), (short) 6551, Block.ZOMBIE_WALL_HEAD, "facing=south");

    public static final BlockState ZOMBIE_WALL_HEAD_2 = new BlockState(NamespaceID.from("minecraft:zombie_wall_head_2"), (short) 6552, Block.ZOMBIE_WALL_HEAD, "facing=west");

    public static final BlockState ZOMBIE_WALL_HEAD_3 = new BlockState(NamespaceID.from("minecraft:zombie_wall_head_3"), (short) 6553, Block.ZOMBIE_WALL_HEAD, "facing=east");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(ZOMBIE_WALL_HEAD_0);
        Registry.BLOCK_STATE_REGISTRY.register(ZOMBIE_WALL_HEAD_1);
        Registry.BLOCK_STATE_REGISTRY.register(ZOMBIE_WALL_HEAD_2);
        Registry.BLOCK_STATE_REGISTRY.register(ZOMBIE_WALL_HEAD_3);
    }

    public static void initStates() {
        Block.ZOMBIE_WALL_HEAD.addBlockState(ZOMBIE_WALL_HEAD_0);
        Block.ZOMBIE_WALL_HEAD.addBlockState(ZOMBIE_WALL_HEAD_1);
        Block.ZOMBIE_WALL_HEAD.addBlockState(ZOMBIE_WALL_HEAD_2);
        Block.ZOMBIE_WALL_HEAD.addBlockState(ZOMBIE_WALL_HEAD_3);
    }
}
