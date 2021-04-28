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
public final class Jukebox {
    public static final BlockState JUKEBOX_0 = new BlockState(NamespaceID.from("minecraft:jukebox_0"), (short) 3964, Block.JUKEBOX, "has_record=true");

    public static final BlockState JUKEBOX_1 = new BlockState(NamespaceID.from("minecraft:jukebox_1"), (short) 3965, Block.JUKEBOX, "has_record=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(JUKEBOX_0);
        Registry.BLOCK_STATE_REGISTRY.register(JUKEBOX_1);
    }

    public static void initStates() {
        Block.JUKEBOX.addBlockState(JUKEBOX_0);
        Block.JUKEBOX.addBlockState(JUKEBOX_1);
    }
}
