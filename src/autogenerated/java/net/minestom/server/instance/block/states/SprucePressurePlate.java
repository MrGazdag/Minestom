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
public final class SprucePressurePlate {
    public static final BlockState SPRUCE_PRESSURE_PLATE_0 = new BlockState(NamespaceID.from("minecraft:spruce_pressure_plate_0"), (short) 3875, Block.SPRUCE_PRESSURE_PLATE, "powered=true");

    public static final BlockState SPRUCE_PRESSURE_PLATE_1 = new BlockState(NamespaceID.from("minecraft:spruce_pressure_plate_1"), (short) 3876, Block.SPRUCE_PRESSURE_PLATE, "powered=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(SPRUCE_PRESSURE_PLATE_0);
        Registry.BLOCK_STATE_REGISTRY.register(SPRUCE_PRESSURE_PLATE_1);
    }

    public static void initStates() {
        Block.SPRUCE_PRESSURE_PLATE.addBlockState(SPRUCE_PRESSURE_PLATE_0);
        Block.SPRUCE_PRESSURE_PLATE.addBlockState(SPRUCE_PRESSURE_PLATE_1);
    }
}
