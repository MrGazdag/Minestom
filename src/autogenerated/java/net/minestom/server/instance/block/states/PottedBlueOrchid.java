package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;
import net.minestom.server.registry.Registries;
import net.minestom.server.utils.NamespaceID;

/**
 * AUTOGENERATED
 */
@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedBlueOrchid {
  public static final BlockState POTTED_BLUE_ORCHID_0 = new BlockState(NamespaceID.from("minecraft:potted_blue_orchid_0"), (short) 6319, Block.POTTED_BLUE_ORCHID);

  static {
    Registries.registerBlockState(POTTED_BLUE_ORCHID_0);
  }

  public static void initStates() {
    Block.POTTED_BLUE_ORCHID.addBlockState(POTTED_BLUE_ORCHID_0);
  }
}