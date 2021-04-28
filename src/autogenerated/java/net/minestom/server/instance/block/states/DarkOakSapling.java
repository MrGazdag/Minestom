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
public final class DarkOakSapling {
    public static final BlockState DARK_OAK_SAPLING_0 = new BlockState(NamespaceID.from("minecraft:dark_oak_sapling_0"), (short) 31, Block.DARK_OAK_SAPLING, "stage=0");

    public static final BlockState DARK_OAK_SAPLING_1 = new BlockState(NamespaceID.from("minecraft:dark_oak_sapling_1"), (short) 32, Block.DARK_OAK_SAPLING, "stage=1");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(DARK_OAK_SAPLING_0);
        Registry.BLOCK_STATE_REGISTRY.register(DARK_OAK_SAPLING_1);
    }

    public static void initStates() {
        Block.DARK_OAK_SAPLING.addBlockState(DARK_OAK_SAPLING_0);
        Block.DARK_OAK_SAPLING.addBlockState(DARK_OAK_SAPLING_1);
    }
}
