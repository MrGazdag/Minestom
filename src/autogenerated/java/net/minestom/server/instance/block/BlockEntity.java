package net.minestom.server.instance.block;

import java.lang.Override;
import java.util.ArrayList;
import java.util.List;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.Keyed;
import net.minestom.server.registry.Registries;
import net.minestom.server.utils.NamespaceID;
import org.jetbrains.annotations.NotNull;

/**
 * AUTOGENERATED
 */
public class BlockEntity implements Keyed {
  public static final List<Block> BLOCKS = new ArrayList<>();

  public static final BlockEntity FURNACE = new BlockEntity(NamespaceID.from("minecraft:furnace"));

  public static final BlockEntity CHEST = new BlockEntity(NamespaceID.from("minecraft:chest"));

  public static final BlockEntity TRAPPED_CHEST = new BlockEntity(NamespaceID.from("minecraft:trapped_chest"));

  public static final BlockEntity ENDER_CHEST = new BlockEntity(NamespaceID.from("minecraft:ender_chest"));

  public static final BlockEntity JUKEBOX = new BlockEntity(NamespaceID.from("minecraft:jukebox"));

  public static final BlockEntity DISPENSER = new BlockEntity(NamespaceID.from("minecraft:dispenser"));

  public static final BlockEntity DROPPER = new BlockEntity(NamespaceID.from("minecraft:dropper"));

  public static final BlockEntity SIGN = new BlockEntity(NamespaceID.from("minecraft:sign"));

  public static final BlockEntity MOB_SPAWNER = new BlockEntity(NamespaceID.from("minecraft:mob_spawner"));

  public static final BlockEntity PISTON = new BlockEntity(NamespaceID.from("minecraft:piston"));

  public static final BlockEntity BREWING_STAND = new BlockEntity(NamespaceID.from("minecraft:brewing_stand"));

  public static final BlockEntity ENCHANTING_TABLE = new BlockEntity(NamespaceID.from("minecraft:enchanting_table"));

  public static final BlockEntity END_PORTAL = new BlockEntity(NamespaceID.from("minecraft:end_portal"));

  public static final BlockEntity BEACON = new BlockEntity(NamespaceID.from("minecraft:beacon"));

  public static final BlockEntity SKULL = new BlockEntity(NamespaceID.from("minecraft:skull"));

  public static final BlockEntity DAYLIGHT_DETECTOR = new BlockEntity(NamespaceID.from("minecraft:daylight_detector"));

  public static final BlockEntity HOPPER = new BlockEntity(NamespaceID.from("minecraft:hopper"));

  public static final BlockEntity COMPARATOR = new BlockEntity(NamespaceID.from("minecraft:comparator"));

  public static final BlockEntity BANNER = new BlockEntity(NamespaceID.from("minecraft:banner"));

  public static final BlockEntity STRUCTURE_BLOCK = new BlockEntity(NamespaceID.from("minecraft:structure_block"));

  public static final BlockEntity END_GATEWAY = new BlockEntity(NamespaceID.from("minecraft:end_gateway"));

  public static final BlockEntity COMMAND_BLOCK = new BlockEntity(NamespaceID.from("minecraft:command_block"));

  public static final BlockEntity SHULKER_BOX = new BlockEntity(NamespaceID.from("minecraft:shulker_box"));

  public static final BlockEntity BED = new BlockEntity(NamespaceID.from("minecraft:bed"));

  public static final BlockEntity CONDUIT = new BlockEntity(NamespaceID.from("minecraft:conduit"));

  public static final BlockEntity BARREL = new BlockEntity(NamespaceID.from("minecraft:barrel"));

  public static final BlockEntity SMOKER = new BlockEntity(NamespaceID.from("minecraft:smoker"));

  public static final BlockEntity BLAST_FURNACE = new BlockEntity(NamespaceID.from("minecraft:blast_furnace"));

  public static final BlockEntity LECTERN = new BlockEntity(NamespaceID.from("minecraft:lectern"));

  public static final BlockEntity BELL = new BlockEntity(NamespaceID.from("minecraft:bell"));

  public static final BlockEntity JIGSAW = new BlockEntity(NamespaceID.from("minecraft:jigsaw"));

  public static final BlockEntity CAMPFIRE = new BlockEntity(NamespaceID.from("minecraft:campfire"));

  public static final BlockEntity BEEHIVE = new BlockEntity(NamespaceID.from("minecraft:beehive"));

  static {
    FURNACE.addBlock(Registries.getBlock("minecraft:furnace"));
    CHEST.addBlock(Registries.getBlock("minecraft:chest"));
    TRAPPED_CHEST.addBlock(Registries.getBlock("minecraft:trapped_chest"));
    ENDER_CHEST.addBlock(Registries.getBlock("minecraft:ender_chest"));
    JUKEBOX.addBlock(Registries.getBlock("minecraft:jukebox"));
    DISPENSER.addBlock(Registries.getBlock("minecraft:dispenser"));
    DROPPER.addBlock(Registries.getBlock("minecraft:dropper"));
    SIGN.addBlock(Registries.getBlock("minecraft:oak_sign"));
    SIGN.addBlock(Registries.getBlock("minecraft:spruce_sign"));
    SIGN.addBlock(Registries.getBlock("minecraft:birch_sign"));
    SIGN.addBlock(Registries.getBlock("minecraft:acacia_sign"));
    SIGN.addBlock(Registries.getBlock("minecraft:jungle_sign"));
    SIGN.addBlock(Registries.getBlock("minecraft:dark_oak_sign"));
    SIGN.addBlock(Registries.getBlock("minecraft:oak_wall_sign"));
    SIGN.addBlock(Registries.getBlock("minecraft:spruce_wall_sign"));
    SIGN.addBlock(Registries.getBlock("minecraft:birch_wall_sign"));
    SIGN.addBlock(Registries.getBlock("minecraft:acacia_wall_sign"));
    SIGN.addBlock(Registries.getBlock("minecraft:jungle_wall_sign"));
    SIGN.addBlock(Registries.getBlock("minecraft:dark_oak_wall_sign"));
    SIGN.addBlock(Registries.getBlock("minecraft:crimson_sign"));
    SIGN.addBlock(Registries.getBlock("minecraft:crimson_wall_sign"));
    SIGN.addBlock(Registries.getBlock("minecraft:warped_sign"));
    SIGN.addBlock(Registries.getBlock("minecraft:warped_wall_sign"));
    MOB_SPAWNER.addBlock(Registries.getBlock("minecraft:spawner"));
    PISTON.addBlock(Registries.getBlock("minecraft:moving_piston"));
    BREWING_STAND.addBlock(Registries.getBlock("minecraft:brewing_stand"));
    ENCHANTING_TABLE.addBlock(Registries.getBlock("minecraft:enchanting_table"));
    END_PORTAL.addBlock(Registries.getBlock("minecraft:end_portal"));
    BEACON.addBlock(Registries.getBlock("minecraft:beacon"));
    SKULL.addBlock(Registries.getBlock("minecraft:skeleton_skull"));
    SKULL.addBlock(Registries.getBlock("minecraft:skeleton_wall_skull"));
    SKULL.addBlock(Registries.getBlock("minecraft:creeper_head"));
    SKULL.addBlock(Registries.getBlock("minecraft:creeper_wall_head"));
    SKULL.addBlock(Registries.getBlock("minecraft:dragon_head"));
    SKULL.addBlock(Registries.getBlock("minecraft:dragon_wall_head"));
    SKULL.addBlock(Registries.getBlock("minecraft:zombie_head"));
    SKULL.addBlock(Registries.getBlock("minecraft:zombie_wall_head"));
    SKULL.addBlock(Registries.getBlock("minecraft:wither_skeleton_skull"));
    SKULL.addBlock(Registries.getBlock("minecraft:wither_skeleton_wall_skull"));
    SKULL.addBlock(Registries.getBlock("minecraft:player_head"));
    SKULL.addBlock(Registries.getBlock("minecraft:player_wall_head"));
    DAYLIGHT_DETECTOR.addBlock(Registries.getBlock("minecraft:daylight_detector"));
    HOPPER.addBlock(Registries.getBlock("minecraft:hopper"));
    COMPARATOR.addBlock(Registries.getBlock("minecraft:comparator"));
    BANNER.addBlock(Registries.getBlock("minecraft:white_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:orange_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:magenta_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:light_blue_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:yellow_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:lime_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:pink_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:gray_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:light_gray_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:cyan_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:purple_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:blue_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:brown_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:green_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:red_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:black_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:white_wall_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:orange_wall_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:magenta_wall_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:light_blue_wall_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:yellow_wall_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:lime_wall_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:pink_wall_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:gray_wall_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:light_gray_wall_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:cyan_wall_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:purple_wall_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:blue_wall_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:brown_wall_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:green_wall_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:red_wall_banner"));
    BANNER.addBlock(Registries.getBlock("minecraft:black_wall_banner"));
    STRUCTURE_BLOCK.addBlock(Registries.getBlock("minecraft:structure_block"));
    END_GATEWAY.addBlock(Registries.getBlock("minecraft:end_gateway"));
    COMMAND_BLOCK.addBlock(Registries.getBlock("minecraft:command_block"));
    COMMAND_BLOCK.addBlock(Registries.getBlock("minecraft:chain_command_block"));
    COMMAND_BLOCK.addBlock(Registries.getBlock("minecraft:repeating_command_block"));
    SHULKER_BOX.addBlock(Registries.getBlock("minecraft:shulker_box"));
    SHULKER_BOX.addBlock(Registries.getBlock("minecraft:black_shulker_box"));
    SHULKER_BOX.addBlock(Registries.getBlock("minecraft:blue_shulker_box"));
    SHULKER_BOX.addBlock(Registries.getBlock("minecraft:brown_shulker_box"));
    SHULKER_BOX.addBlock(Registries.getBlock("minecraft:cyan_shulker_box"));
    SHULKER_BOX.addBlock(Registries.getBlock("minecraft:gray_shulker_box"));
    SHULKER_BOX.addBlock(Registries.getBlock("minecraft:green_shulker_box"));
    SHULKER_BOX.addBlock(Registries.getBlock("minecraft:light_blue_shulker_box"));
    SHULKER_BOX.addBlock(Registries.getBlock("minecraft:light_gray_shulker_box"));
    SHULKER_BOX.addBlock(Registries.getBlock("minecraft:lime_shulker_box"));
    SHULKER_BOX.addBlock(Registries.getBlock("minecraft:magenta_shulker_box"));
    SHULKER_BOX.addBlock(Registries.getBlock("minecraft:orange_shulker_box"));
    SHULKER_BOX.addBlock(Registries.getBlock("minecraft:pink_shulker_box"));
    SHULKER_BOX.addBlock(Registries.getBlock("minecraft:purple_shulker_box"));
    SHULKER_BOX.addBlock(Registries.getBlock("minecraft:red_shulker_box"));
    SHULKER_BOX.addBlock(Registries.getBlock("minecraft:white_shulker_box"));
    SHULKER_BOX.addBlock(Registries.getBlock("minecraft:yellow_shulker_box"));
    BED.addBlock(Registries.getBlock("minecraft:red_bed"));
    BED.addBlock(Registries.getBlock("minecraft:black_bed"));
    BED.addBlock(Registries.getBlock("minecraft:blue_bed"));
    BED.addBlock(Registries.getBlock("minecraft:brown_bed"));
    BED.addBlock(Registries.getBlock("minecraft:cyan_bed"));
    BED.addBlock(Registries.getBlock("minecraft:gray_bed"));
    BED.addBlock(Registries.getBlock("minecraft:green_bed"));
    BED.addBlock(Registries.getBlock("minecraft:light_blue_bed"));
    BED.addBlock(Registries.getBlock("minecraft:light_gray_bed"));
    BED.addBlock(Registries.getBlock("minecraft:lime_bed"));
    BED.addBlock(Registries.getBlock("minecraft:magenta_bed"));
    BED.addBlock(Registries.getBlock("minecraft:orange_bed"));
    BED.addBlock(Registries.getBlock("minecraft:pink_bed"));
    BED.addBlock(Registries.getBlock("minecraft:purple_bed"));
    BED.addBlock(Registries.getBlock("minecraft:white_bed"));
    BED.addBlock(Registries.getBlock("minecraft:yellow_bed"));
    CONDUIT.addBlock(Registries.getBlock("minecraft:conduit"));
    BARREL.addBlock(Registries.getBlock("minecraft:barrel"));
    SMOKER.addBlock(Registries.getBlock("minecraft:smoker"));
    BLAST_FURNACE.addBlock(Registries.getBlock("minecraft:blast_furnace"));
    LECTERN.addBlock(Registries.getBlock("minecraft:lectern"));
    BELL.addBlock(Registries.getBlock("minecraft:bell"));
    JIGSAW.addBlock(Registries.getBlock("minecraft:jigsaw"));
    CAMPFIRE.addBlock(Registries.getBlock("minecraft:campfire"));
    CAMPFIRE.addBlock(Registries.getBlock("minecraft:soul_campfire"));
    BEEHIVE.addBlock(Registries.getBlock("minecraft:bee_nest"));
    BEEHIVE.addBlock(Registries.getBlock("minecraft:beehive"));
  }
  static {
    Registries.registerBlockEntity(FURNACE);
    Registries.registerBlockEntity(CHEST);
    Registries.registerBlockEntity(TRAPPED_CHEST);
    Registries.registerBlockEntity(ENDER_CHEST);
    Registries.registerBlockEntity(JUKEBOX);
    Registries.registerBlockEntity(DISPENSER);
    Registries.registerBlockEntity(DROPPER);
    Registries.registerBlockEntity(SIGN);
    Registries.registerBlockEntity(MOB_SPAWNER);
    Registries.registerBlockEntity(PISTON);
    Registries.registerBlockEntity(BREWING_STAND);
    Registries.registerBlockEntity(ENCHANTING_TABLE);
    Registries.registerBlockEntity(END_PORTAL);
    Registries.registerBlockEntity(BEACON);
    Registries.registerBlockEntity(SKULL);
    Registries.registerBlockEntity(DAYLIGHT_DETECTOR);
    Registries.registerBlockEntity(HOPPER);
    Registries.registerBlockEntity(COMPARATOR);
    Registries.registerBlockEntity(BANNER);
    Registries.registerBlockEntity(STRUCTURE_BLOCK);
    Registries.registerBlockEntity(END_GATEWAY);
    Registries.registerBlockEntity(COMMAND_BLOCK);
    Registries.registerBlockEntity(SHULKER_BOX);
    Registries.registerBlockEntity(BED);
    Registries.registerBlockEntity(CONDUIT);
    Registries.registerBlockEntity(BARREL);
    Registries.registerBlockEntity(SMOKER);
    Registries.registerBlockEntity(BLAST_FURNACE);
    Registries.registerBlockEntity(LECTERN);
    Registries.registerBlockEntity(BELL);
    Registries.registerBlockEntity(JIGSAW);
    Registries.registerBlockEntity(CAMPFIRE);
    Registries.registerBlockEntity(BEEHIVE);
  }
  static {
    BLOCKS.add(Registries.getBlock("minecraft:furnace"));
    BLOCKS.add(Registries.getBlock("minecraft:chest"));
    BLOCKS.add(Registries.getBlock("minecraft:trapped_chest"));
    BLOCKS.add(Registries.getBlock("minecraft:ender_chest"));
    BLOCKS.add(Registries.getBlock("minecraft:jukebox"));
    BLOCKS.add(Registries.getBlock("minecraft:dispenser"));
    BLOCKS.add(Registries.getBlock("minecraft:dropper"));
    BLOCKS.add(Registries.getBlock("minecraft:oak_sign"));
    BLOCKS.add(Registries.getBlock("minecraft:spruce_sign"));
    BLOCKS.add(Registries.getBlock("minecraft:birch_sign"));
    BLOCKS.add(Registries.getBlock("minecraft:acacia_sign"));
    BLOCKS.add(Registries.getBlock("minecraft:jungle_sign"));
    BLOCKS.add(Registries.getBlock("minecraft:dark_oak_sign"));
    BLOCKS.add(Registries.getBlock("minecraft:oak_wall_sign"));
    BLOCKS.add(Registries.getBlock("minecraft:spruce_wall_sign"));
    BLOCKS.add(Registries.getBlock("minecraft:birch_wall_sign"));
    BLOCKS.add(Registries.getBlock("minecraft:acacia_wall_sign"));
    BLOCKS.add(Registries.getBlock("minecraft:jungle_wall_sign"));
    BLOCKS.add(Registries.getBlock("minecraft:dark_oak_wall_sign"));
    BLOCKS.add(Registries.getBlock("minecraft:crimson_sign"));
    BLOCKS.add(Registries.getBlock("minecraft:crimson_wall_sign"));
    BLOCKS.add(Registries.getBlock("minecraft:warped_sign"));
    BLOCKS.add(Registries.getBlock("minecraft:warped_wall_sign"));
    BLOCKS.add(Registries.getBlock("minecraft:spawner"));
    BLOCKS.add(Registries.getBlock("minecraft:moving_piston"));
    BLOCKS.add(Registries.getBlock("minecraft:brewing_stand"));
    BLOCKS.add(Registries.getBlock("minecraft:enchanting_table"));
    BLOCKS.add(Registries.getBlock("minecraft:end_portal"));
    BLOCKS.add(Registries.getBlock("minecraft:beacon"));
    BLOCKS.add(Registries.getBlock("minecraft:skeleton_skull"));
    BLOCKS.add(Registries.getBlock("minecraft:skeleton_wall_skull"));
    BLOCKS.add(Registries.getBlock("minecraft:creeper_head"));
    BLOCKS.add(Registries.getBlock("minecraft:creeper_wall_head"));
    BLOCKS.add(Registries.getBlock("minecraft:dragon_head"));
    BLOCKS.add(Registries.getBlock("minecraft:dragon_wall_head"));
    BLOCKS.add(Registries.getBlock("minecraft:zombie_head"));
    BLOCKS.add(Registries.getBlock("minecraft:zombie_wall_head"));
    BLOCKS.add(Registries.getBlock("minecraft:wither_skeleton_skull"));
    BLOCKS.add(Registries.getBlock("minecraft:wither_skeleton_wall_skull"));
    BLOCKS.add(Registries.getBlock("minecraft:player_head"));
    BLOCKS.add(Registries.getBlock("minecraft:player_wall_head"));
    BLOCKS.add(Registries.getBlock("minecraft:daylight_detector"));
    BLOCKS.add(Registries.getBlock("minecraft:hopper"));
    BLOCKS.add(Registries.getBlock("minecraft:comparator"));
    BLOCKS.add(Registries.getBlock("minecraft:white_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:orange_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:magenta_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:light_blue_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:yellow_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:lime_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:pink_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:gray_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:light_gray_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:cyan_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:purple_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:blue_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:brown_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:green_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:red_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:black_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:white_wall_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:orange_wall_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:magenta_wall_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:light_blue_wall_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:yellow_wall_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:lime_wall_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:pink_wall_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:gray_wall_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:light_gray_wall_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:cyan_wall_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:purple_wall_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:blue_wall_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:brown_wall_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:green_wall_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:red_wall_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:black_wall_banner"));
    BLOCKS.add(Registries.getBlock("minecraft:structure_block"));
    BLOCKS.add(Registries.getBlock("minecraft:end_gateway"));
    BLOCKS.add(Registries.getBlock("minecraft:command_block"));
    BLOCKS.add(Registries.getBlock("minecraft:chain_command_block"));
    BLOCKS.add(Registries.getBlock("minecraft:repeating_command_block"));
    BLOCKS.add(Registries.getBlock("minecraft:shulker_box"));
    BLOCKS.add(Registries.getBlock("minecraft:black_shulker_box"));
    BLOCKS.add(Registries.getBlock("minecraft:blue_shulker_box"));
    BLOCKS.add(Registries.getBlock("minecraft:brown_shulker_box"));
    BLOCKS.add(Registries.getBlock("minecraft:cyan_shulker_box"));
    BLOCKS.add(Registries.getBlock("minecraft:gray_shulker_box"));
    BLOCKS.add(Registries.getBlock("minecraft:green_shulker_box"));
    BLOCKS.add(Registries.getBlock("minecraft:light_blue_shulker_box"));
    BLOCKS.add(Registries.getBlock("minecraft:light_gray_shulker_box"));
    BLOCKS.add(Registries.getBlock("minecraft:lime_shulker_box"));
    BLOCKS.add(Registries.getBlock("minecraft:magenta_shulker_box"));
    BLOCKS.add(Registries.getBlock("minecraft:orange_shulker_box"));
    BLOCKS.add(Registries.getBlock("minecraft:pink_shulker_box"));
    BLOCKS.add(Registries.getBlock("minecraft:purple_shulker_box"));
    BLOCKS.add(Registries.getBlock("minecraft:red_shulker_box"));
    BLOCKS.add(Registries.getBlock("minecraft:white_shulker_box"));
    BLOCKS.add(Registries.getBlock("minecraft:yellow_shulker_box"));
    BLOCKS.add(Registries.getBlock("minecraft:red_bed"));
    BLOCKS.add(Registries.getBlock("minecraft:black_bed"));
    BLOCKS.add(Registries.getBlock("minecraft:blue_bed"));
    BLOCKS.add(Registries.getBlock("minecraft:brown_bed"));
    BLOCKS.add(Registries.getBlock("minecraft:cyan_bed"));
    BLOCKS.add(Registries.getBlock("minecraft:gray_bed"));
    BLOCKS.add(Registries.getBlock("minecraft:green_bed"));
    BLOCKS.add(Registries.getBlock("minecraft:light_blue_bed"));
    BLOCKS.add(Registries.getBlock("minecraft:light_gray_bed"));
    BLOCKS.add(Registries.getBlock("minecraft:lime_bed"));
    BLOCKS.add(Registries.getBlock("minecraft:magenta_bed"));
    BLOCKS.add(Registries.getBlock("minecraft:orange_bed"));
    BLOCKS.add(Registries.getBlock("minecraft:pink_bed"));
    BLOCKS.add(Registries.getBlock("minecraft:purple_bed"));
    BLOCKS.add(Registries.getBlock("minecraft:white_bed"));
    BLOCKS.add(Registries.getBlock("minecraft:yellow_bed"));
    BLOCKS.add(Registries.getBlock("minecraft:conduit"));
    BLOCKS.add(Registries.getBlock("minecraft:barrel"));
    BLOCKS.add(Registries.getBlock("minecraft:smoker"));
    BLOCKS.add(Registries.getBlock("minecraft:blast_furnace"));
    BLOCKS.add(Registries.getBlock("minecraft:lectern"));
    BLOCKS.add(Registries.getBlock("minecraft:bell"));
    BLOCKS.add(Registries.getBlock("minecraft:jigsaw"));
    BLOCKS.add(Registries.getBlock("minecraft:campfire"));
    BLOCKS.add(Registries.getBlock("minecraft:soul_campfire"));
    BLOCKS.add(Registries.getBlock("minecraft:bee_nest"));
    BLOCKS.add(Registries.getBlock("minecraft:beehive"));
  }

  @NotNull
  private final NamespaceID id;

  @NotNull
  private final List<Block> blocks = new ArrayList<>();

  protected BlockEntity(@NotNull NamespaceID id) {
    this.id = id;
  }

  @Override
  @NotNull
  public Key key() {
    return this.id;
  }

  @NotNull
  public NamespaceID getId() {
    return this.id;
  }

  private void addBlock(@NotNull Block block) {
    this.blocks.add(block);
  }

  @NotNull
  public List<Block> getBlocks() {
    return this.blocks;
  }

  @NotNull
  public static List<BlockEntity> values() {
    return Registries.getBlockEntities();
  }
}
