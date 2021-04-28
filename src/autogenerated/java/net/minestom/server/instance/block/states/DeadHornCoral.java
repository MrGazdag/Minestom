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
public final class DeadHornCoral {
    public static final BlockState DEAD_HORN_CORAL_0 = new BlockState(NamespaceID.from("minecraft:dead_horn_coral_0"), (short) 9532, Block.DEAD_HORN_CORAL, "waterlogged=true");

    public static final BlockState DEAD_HORN_CORAL_1 = new BlockState(NamespaceID.from("minecraft:dead_horn_coral_1"), (short) 9533, Block.DEAD_HORN_CORAL, "waterlogged=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(DEAD_HORN_CORAL_0);
        Registry.BLOCK_STATE_REGISTRY.register(DEAD_HORN_CORAL_1);
    }

    public static void initStates() {
        Block.DEAD_HORN_CORAL.addBlockState(DEAD_HORN_CORAL_0);
        Block.DEAD_HORN_CORAL.addBlockState(DEAD_HORN_CORAL_1);
    }
}
