package net.minestom.server.item;

import java.lang.Override;
import java.util.List;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.Keyed;
import net.minestom.server.registry.Registries;
import net.minestom.server.utils.NamespaceID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AUTOGENERATED
 */
public class Enchantment implements Keyed {
  public static final Enchantment ALL_DAMAGE_PROTECTION = new Enchantment(NamespaceID.from("minecraft:protection"));

  public static final Enchantment FIRE_PROTECTION = new Enchantment(NamespaceID.from("minecraft:fire_protection"));

  public static final Enchantment FALL_PROTECTION = new Enchantment(NamespaceID.from("minecraft:feather_falling"));

  public static final Enchantment BLAST_PROTECTION = new Enchantment(NamespaceID.from("minecraft:blast_protection"));

  public static final Enchantment PROJECTILE_PROTECTION = new Enchantment(NamespaceID.from("minecraft:projectile_protection"));

  public static final Enchantment RESPIRATION = new Enchantment(NamespaceID.from("minecraft:respiration"));

  public static final Enchantment AQUA_AFFINITY = new Enchantment(NamespaceID.from("minecraft:aqua_affinity"));

  public static final Enchantment THORNS = new Enchantment(NamespaceID.from("minecraft:thorns"));

  public static final Enchantment DEPTH_STRIDER = new Enchantment(NamespaceID.from("minecraft:depth_strider"));

  public static final Enchantment FROST_WALKER = new Enchantment(NamespaceID.from("minecraft:frost_walker"));

  public static final Enchantment BINDING_CURSE = new Enchantment(NamespaceID.from("minecraft:binding_curse"));

  public static final Enchantment SOUL_SPEED = new Enchantment(NamespaceID.from("minecraft:soul_speed"));

  public static final Enchantment SHARPNESS = new Enchantment(NamespaceID.from("minecraft:sharpness"));

  public static final Enchantment SMITE = new Enchantment(NamespaceID.from("minecraft:smite"));

  public static final Enchantment BANE_OF_ARTHROPODS = new Enchantment(NamespaceID.from("minecraft:bane_of_arthropods"));

  public static final Enchantment KNOCKBACK = new Enchantment(NamespaceID.from("minecraft:knockback"));

  public static final Enchantment FIRE_ASPECT = new Enchantment(NamespaceID.from("minecraft:fire_aspect"));

  public static final Enchantment MOB_LOOTING = new Enchantment(NamespaceID.from("minecraft:looting"));

  public static final Enchantment SWEEPING_EDGE = new Enchantment(NamespaceID.from("minecraft:sweeping"));

  public static final Enchantment BLOCK_EFFICIENCY = new Enchantment(NamespaceID.from("minecraft:efficiency"));

  public static final Enchantment SILK_TOUCH = new Enchantment(NamespaceID.from("minecraft:silk_touch"));

  public static final Enchantment UNBREAKING = new Enchantment(NamespaceID.from("minecraft:unbreaking"));

  public static final Enchantment BLOCK_FORTUNE = new Enchantment(NamespaceID.from("minecraft:fortune"));

  public static final Enchantment POWER_ARROWS = new Enchantment(NamespaceID.from("minecraft:power"));

  public static final Enchantment PUNCH_ARROWS = new Enchantment(NamespaceID.from("minecraft:punch"));

  public static final Enchantment FLAMING_ARROWS = new Enchantment(NamespaceID.from("minecraft:flame"));

  public static final Enchantment INFINITY_ARROWS = new Enchantment(NamespaceID.from("minecraft:infinity"));

  public static final Enchantment FISHING_LUCK = new Enchantment(NamespaceID.from("minecraft:luck_of_the_sea"));

  public static final Enchantment FISHING_SPEED = new Enchantment(NamespaceID.from("minecraft:lure"));

  public static final Enchantment LOYALTY = new Enchantment(NamespaceID.from("minecraft:loyalty"));

  public static final Enchantment IMPALING = new Enchantment(NamespaceID.from("minecraft:impaling"));

  public static final Enchantment RIPTIDE = new Enchantment(NamespaceID.from("minecraft:riptide"));

  public static final Enchantment CHANNELING = new Enchantment(NamespaceID.from("minecraft:channeling"));

  public static final Enchantment MULTISHOT = new Enchantment(NamespaceID.from("minecraft:multishot"));

  public static final Enchantment QUICK_CHARGE = new Enchantment(NamespaceID.from("minecraft:quick_charge"));

  public static final Enchantment PIERCING = new Enchantment(NamespaceID.from("minecraft:piercing"));

  public static final Enchantment MENDING = new Enchantment(NamespaceID.from("minecraft:mending"));

  public static final Enchantment VANISHING_CURSE = new Enchantment(NamespaceID.from("minecraft:vanishing_curse"));

  static {
    Registries.registerEnchantment(ALL_DAMAGE_PROTECTION);
    Registries.registerEnchantment(FIRE_PROTECTION);
    Registries.registerEnchantment(FALL_PROTECTION);
    Registries.registerEnchantment(BLAST_PROTECTION);
    Registries.registerEnchantment(PROJECTILE_PROTECTION);
    Registries.registerEnchantment(RESPIRATION);
    Registries.registerEnchantment(AQUA_AFFINITY);
    Registries.registerEnchantment(THORNS);
    Registries.registerEnchantment(DEPTH_STRIDER);
    Registries.registerEnchantment(FROST_WALKER);
    Registries.registerEnchantment(BINDING_CURSE);
    Registries.registerEnchantment(SOUL_SPEED);
    Registries.registerEnchantment(SHARPNESS);
    Registries.registerEnchantment(SMITE);
    Registries.registerEnchantment(BANE_OF_ARTHROPODS);
    Registries.registerEnchantment(KNOCKBACK);
    Registries.registerEnchantment(FIRE_ASPECT);
    Registries.registerEnchantment(MOB_LOOTING);
    Registries.registerEnchantment(SWEEPING_EDGE);
    Registries.registerEnchantment(BLOCK_EFFICIENCY);
    Registries.registerEnchantment(SILK_TOUCH);
    Registries.registerEnchantment(UNBREAKING);
    Registries.registerEnchantment(BLOCK_FORTUNE);
    Registries.registerEnchantment(POWER_ARROWS);
    Registries.registerEnchantment(PUNCH_ARROWS);
    Registries.registerEnchantment(FLAMING_ARROWS);
    Registries.registerEnchantment(INFINITY_ARROWS);
    Registries.registerEnchantment(FISHING_LUCK);
    Registries.registerEnchantment(FISHING_SPEED);
    Registries.registerEnchantment(LOYALTY);
    Registries.registerEnchantment(IMPALING);
    Registries.registerEnchantment(RIPTIDE);
    Registries.registerEnchantment(CHANNELING);
    Registries.registerEnchantment(MULTISHOT);
    Registries.registerEnchantment(QUICK_CHARGE);
    Registries.registerEnchantment(PIERCING);
    Registries.registerEnchantment(MENDING);
    Registries.registerEnchantment(VANISHING_CURSE);
  }

  @NotNull
  private final NamespaceID id;

  protected Enchantment(@NotNull NamespaceID id) {
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

  public int getNumericalId() {
    return Registries.getEnchantmentId(this);
  }

  @Nullable
  public static Enchantment fromId(int id) {
    return Registries.getEnchantment(id);
  }

  @NotNull
  public static List<Enchantment> values() {
    return Registries.getEnchantments();
  }
}
