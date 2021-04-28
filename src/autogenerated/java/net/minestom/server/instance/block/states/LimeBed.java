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
public final class LimeBed {
    public static final BlockState LIME_BED_0 = new BlockState(NamespaceID.from("minecraft:lime_bed_0"), (short) 1129, Block.LIME_BED, "facing=north","occupied=true","part=head");

    public static final BlockState LIME_BED_1 = new BlockState(NamespaceID.from("minecraft:lime_bed_1"), (short) 1130, Block.LIME_BED, "facing=north","occupied=true","part=foot");

    public static final BlockState LIME_BED_2 = new BlockState(NamespaceID.from("minecraft:lime_bed_2"), (short) 1131, Block.LIME_BED, "facing=north","occupied=false","part=head");

    public static final BlockState LIME_BED_3 = new BlockState(NamespaceID.from("minecraft:lime_bed_3"), (short) 1132, Block.LIME_BED, "facing=north","occupied=false","part=foot");

    public static final BlockState LIME_BED_4 = new BlockState(NamespaceID.from("minecraft:lime_bed_4"), (short) 1133, Block.LIME_BED, "facing=south","occupied=true","part=head");

    public static final BlockState LIME_BED_5 = new BlockState(NamespaceID.from("minecraft:lime_bed_5"), (short) 1134, Block.LIME_BED, "facing=south","occupied=true","part=foot");

    public static final BlockState LIME_BED_6 = new BlockState(NamespaceID.from("minecraft:lime_bed_6"), (short) 1135, Block.LIME_BED, "facing=south","occupied=false","part=head");

    public static final BlockState LIME_BED_7 = new BlockState(NamespaceID.from("minecraft:lime_bed_7"), (short) 1136, Block.LIME_BED, "facing=south","occupied=false","part=foot");

    public static final BlockState LIME_BED_8 = new BlockState(NamespaceID.from("minecraft:lime_bed_8"), (short) 1137, Block.LIME_BED, "facing=west","occupied=true","part=head");

    public static final BlockState LIME_BED_9 = new BlockState(NamespaceID.from("minecraft:lime_bed_9"), (short) 1138, Block.LIME_BED, "facing=west","occupied=true","part=foot");

    public static final BlockState LIME_BED_10 = new BlockState(NamespaceID.from("minecraft:lime_bed_10"), (short) 1139, Block.LIME_BED, "facing=west","occupied=false","part=head");

    public static final BlockState LIME_BED_11 = new BlockState(NamespaceID.from("minecraft:lime_bed_11"), (short) 1140, Block.LIME_BED, "facing=west","occupied=false","part=foot");

    public static final BlockState LIME_BED_12 = new BlockState(NamespaceID.from("minecraft:lime_bed_12"), (short) 1141, Block.LIME_BED, "facing=east","occupied=true","part=head");

    public static final BlockState LIME_BED_13 = new BlockState(NamespaceID.from("minecraft:lime_bed_13"), (short) 1142, Block.LIME_BED, "facing=east","occupied=true","part=foot");

    public static final BlockState LIME_BED_14 = new BlockState(NamespaceID.from("minecraft:lime_bed_14"), (short) 1143, Block.LIME_BED, "facing=east","occupied=false","part=head");

    public static final BlockState LIME_BED_15 = new BlockState(NamespaceID.from("minecraft:lime_bed_15"), (short) 1144, Block.LIME_BED, "facing=east","occupied=false","part=foot");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(LIME_BED_0);
        Registry.BLOCK_STATE_REGISTRY.register(LIME_BED_1);
        Registry.BLOCK_STATE_REGISTRY.register(LIME_BED_2);
        Registry.BLOCK_STATE_REGISTRY.register(LIME_BED_3);
        Registry.BLOCK_STATE_REGISTRY.register(LIME_BED_4);
        Registry.BLOCK_STATE_REGISTRY.register(LIME_BED_5);
        Registry.BLOCK_STATE_REGISTRY.register(LIME_BED_6);
        Registry.BLOCK_STATE_REGISTRY.register(LIME_BED_7);
        Registry.BLOCK_STATE_REGISTRY.register(LIME_BED_8);
        Registry.BLOCK_STATE_REGISTRY.register(LIME_BED_9);
        Registry.BLOCK_STATE_REGISTRY.register(LIME_BED_10);
        Registry.BLOCK_STATE_REGISTRY.register(LIME_BED_11);
        Registry.BLOCK_STATE_REGISTRY.register(LIME_BED_12);
        Registry.BLOCK_STATE_REGISTRY.register(LIME_BED_13);
        Registry.BLOCK_STATE_REGISTRY.register(LIME_BED_14);
        Registry.BLOCK_STATE_REGISTRY.register(LIME_BED_15);
    }

    public static void initStates() {
        Block.LIME_BED.addBlockState(LIME_BED_0);
        Block.LIME_BED.addBlockState(LIME_BED_1);
        Block.LIME_BED.addBlockState(LIME_BED_2);
        Block.LIME_BED.addBlockState(LIME_BED_3);
        Block.LIME_BED.addBlockState(LIME_BED_4);
        Block.LIME_BED.addBlockState(LIME_BED_5);
        Block.LIME_BED.addBlockState(LIME_BED_6);
        Block.LIME_BED.addBlockState(LIME_BED_7);
        Block.LIME_BED.addBlockState(LIME_BED_8);
        Block.LIME_BED.addBlockState(LIME_BED_9);
        Block.LIME_BED.addBlockState(LIME_BED_10);
        Block.LIME_BED.addBlockState(LIME_BED_11);
        Block.LIME_BED.addBlockState(LIME_BED_12);
        Block.LIME_BED.addBlockState(LIME_BED_13);
        Block.LIME_BED.addBlockState(LIME_BED_14);
        Block.LIME_BED.addBlockState(LIME_BED_15);
    }
}
