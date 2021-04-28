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
public final class DeadTubeCoral {
    public static final BlockState DEAD_TUBE_CORAL_0 = new BlockState(NamespaceID.from("minecraft:dead_tube_coral_0"), (short) 9524, Block.DEAD_TUBE_CORAL, "waterlogged=true");

    public static final BlockState DEAD_TUBE_CORAL_1 = new BlockState(NamespaceID.from("minecraft:dead_tube_coral_1"), (short) 9525, Block.DEAD_TUBE_CORAL, "waterlogged=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(DEAD_TUBE_CORAL_0);
        Registry.BLOCK_STATE_REGISTRY.register(DEAD_TUBE_CORAL_1);
    }

    public static void initStates() {
        Block.DEAD_TUBE_CORAL.addBlockState(DEAD_TUBE_CORAL_0);
        Block.DEAD_TUBE_CORAL.addBlockState(DEAD_TUBE_CORAL_1);
    }
}
