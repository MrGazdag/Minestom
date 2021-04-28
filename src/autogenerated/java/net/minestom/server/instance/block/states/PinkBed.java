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
public final class PinkBed {
    public static final BlockState PINK_BED_0 = new BlockState(NamespaceID.from("minecraft:pink_bed_0"), (short) 1145, Block.PINK_BED, "facing=north","occupied=true","part=head");

    public static final BlockState PINK_BED_1 = new BlockState(NamespaceID.from("minecraft:pink_bed_1"), (short) 1146, Block.PINK_BED, "facing=north","occupied=true","part=foot");

    public static final BlockState PINK_BED_2 = new BlockState(NamespaceID.from("minecraft:pink_bed_2"), (short) 1147, Block.PINK_BED, "facing=north","occupied=false","part=head");

    public static final BlockState PINK_BED_3 = new BlockState(NamespaceID.from("minecraft:pink_bed_3"), (short) 1148, Block.PINK_BED, "facing=north","occupied=false","part=foot");

    public static final BlockState PINK_BED_4 = new BlockState(NamespaceID.from("minecraft:pink_bed_4"), (short) 1149, Block.PINK_BED, "facing=south","occupied=true","part=head");

    public static final BlockState PINK_BED_5 = new BlockState(NamespaceID.from("minecraft:pink_bed_5"), (short) 1150, Block.PINK_BED, "facing=south","occupied=true","part=foot");

    public static final BlockState PINK_BED_6 = new BlockState(NamespaceID.from("minecraft:pink_bed_6"), (short) 1151, Block.PINK_BED, "facing=south","occupied=false","part=head");

    public static final BlockState PINK_BED_7 = new BlockState(NamespaceID.from("minecraft:pink_bed_7"), (short) 1152, Block.PINK_BED, "facing=south","occupied=false","part=foot");

    public static final BlockState PINK_BED_8 = new BlockState(NamespaceID.from("minecraft:pink_bed_8"), (short) 1153, Block.PINK_BED, "facing=west","occupied=true","part=head");

    public static final BlockState PINK_BED_9 = new BlockState(NamespaceID.from("minecraft:pink_bed_9"), (short) 1154, Block.PINK_BED, "facing=west","occupied=true","part=foot");

    public static final BlockState PINK_BED_10 = new BlockState(NamespaceID.from("minecraft:pink_bed_10"), (short) 1155, Block.PINK_BED, "facing=west","occupied=false","part=head");

    public static final BlockState PINK_BED_11 = new BlockState(NamespaceID.from("minecraft:pink_bed_11"), (short) 1156, Block.PINK_BED, "facing=west","occupied=false","part=foot");

    public static final BlockState PINK_BED_12 = new BlockState(NamespaceID.from("minecraft:pink_bed_12"), (short) 1157, Block.PINK_BED, "facing=east","occupied=true","part=head");

    public static final BlockState PINK_BED_13 = new BlockState(NamespaceID.from("minecraft:pink_bed_13"), (short) 1158, Block.PINK_BED, "facing=east","occupied=true","part=foot");

    public static final BlockState PINK_BED_14 = new BlockState(NamespaceID.from("minecraft:pink_bed_14"), (short) 1159, Block.PINK_BED, "facing=east","occupied=false","part=head");

    public static final BlockState PINK_BED_15 = new BlockState(NamespaceID.from("minecraft:pink_bed_15"), (short) 1160, Block.PINK_BED, "facing=east","occupied=false","part=foot");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(PINK_BED_0);
        Registry.BLOCK_STATE_REGISTRY.register(PINK_BED_1);
        Registry.BLOCK_STATE_REGISTRY.register(PINK_BED_2);
        Registry.BLOCK_STATE_REGISTRY.register(PINK_BED_3);
        Registry.BLOCK_STATE_REGISTRY.register(PINK_BED_4);
        Registry.BLOCK_STATE_REGISTRY.register(PINK_BED_5);
        Registry.BLOCK_STATE_REGISTRY.register(PINK_BED_6);
        Registry.BLOCK_STATE_REGISTRY.register(PINK_BED_7);
        Registry.BLOCK_STATE_REGISTRY.register(PINK_BED_8);
        Registry.BLOCK_STATE_REGISTRY.register(PINK_BED_9);
        Registry.BLOCK_STATE_REGISTRY.register(PINK_BED_10);
        Registry.BLOCK_STATE_REGISTRY.register(PINK_BED_11);
        Registry.BLOCK_STATE_REGISTRY.register(PINK_BED_12);
        Registry.BLOCK_STATE_REGISTRY.register(PINK_BED_13);
        Registry.BLOCK_STATE_REGISTRY.register(PINK_BED_14);
        Registry.BLOCK_STATE_REGISTRY.register(PINK_BED_15);
    }

    public static void initStates() {
        Block.PINK_BED.addBlockState(PINK_BED_0);
        Block.PINK_BED.addBlockState(PINK_BED_1);
        Block.PINK_BED.addBlockState(PINK_BED_2);
        Block.PINK_BED.addBlockState(PINK_BED_3);
        Block.PINK_BED.addBlockState(PINK_BED_4);
        Block.PINK_BED.addBlockState(PINK_BED_5);
        Block.PINK_BED.addBlockState(PINK_BED_6);
        Block.PINK_BED.addBlockState(PINK_BED_7);
        Block.PINK_BED.addBlockState(PINK_BED_8);
        Block.PINK_BED.addBlockState(PINK_BED_9);
        Block.PINK_BED.addBlockState(PINK_BED_10);
        Block.PINK_BED.addBlockState(PINK_BED_11);
        Block.PINK_BED.addBlockState(PINK_BED_12);
        Block.PINK_BED.addBlockState(PINK_BED_13);
        Block.PINK_BED.addBlockState(PINK_BED_14);
        Block.PINK_BED.addBlockState(PINK_BED_15);
    }
}
