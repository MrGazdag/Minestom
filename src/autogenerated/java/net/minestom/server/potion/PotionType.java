package net.minestom.server.potion;

import java.lang.Override;
import java.util.List;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.Keyed;
import net.minestom.server.registry.Registries;
import net.minestom.server.utils.NamespaceID;
import org.jetbrains.annotations.NotNull;

/**
 * AUTOGENERATED
 */
public class PotionType implements Keyed {
  public static final PotionType EMPTY = new PotionType(NamespaceID.from("minecraft:empty"));

  public static final PotionType WATER = new PotionType(NamespaceID.from("minecraft:water"));

  public static final PotionType MUNDANE = new PotionType(NamespaceID.from("minecraft:mundane"));

  public static final PotionType THICK = new PotionType(NamespaceID.from("minecraft:thick"));

  public static final PotionType AWKWARD = new PotionType(NamespaceID.from("minecraft:awkward"));

  public static final PotionType NIGHT_VISION = new PotionType(NamespaceID.from("minecraft:night_vision"));

  public static final PotionType LONG_NIGHT_VISION = new PotionType(NamespaceID.from("minecraft:long_night_vision"));

  public static final PotionType INVISIBILITY = new PotionType(NamespaceID.from("minecraft:invisibility"));

  public static final PotionType LONG_INVISIBILITY = new PotionType(NamespaceID.from("minecraft:long_invisibility"));

  public static final PotionType LEAPING = new PotionType(NamespaceID.from("minecraft:leaping"));

  public static final PotionType LONG_LEAPING = new PotionType(NamespaceID.from("minecraft:long_leaping"));

  public static final PotionType STRONG_LEAPING = new PotionType(NamespaceID.from("minecraft:strong_leaping"));

  public static final PotionType FIRE_RESISTANCE = new PotionType(NamespaceID.from("minecraft:fire_resistance"));

  public static final PotionType LONG_FIRE_RESISTANCE = new PotionType(NamespaceID.from("minecraft:long_fire_resistance"));

  public static final PotionType SWIFTNESS = new PotionType(NamespaceID.from("minecraft:swiftness"));

  public static final PotionType LONG_SWIFTNESS = new PotionType(NamespaceID.from("minecraft:long_swiftness"));

  public static final PotionType STRONG_SWIFTNESS = new PotionType(NamespaceID.from("minecraft:strong_swiftness"));

  public static final PotionType SLOWNESS = new PotionType(NamespaceID.from("minecraft:slowness"));

  public static final PotionType LONG_SLOWNESS = new PotionType(NamespaceID.from("minecraft:long_slowness"));

  public static final PotionType STRONG_SLOWNESS = new PotionType(NamespaceID.from("minecraft:strong_slowness"));

  public static final PotionType TURTLE_MASTER = new PotionType(NamespaceID.from("minecraft:turtle_master"));

  public static final PotionType LONG_TURTLE_MASTER = new PotionType(NamespaceID.from("minecraft:long_turtle_master"));

  public static final PotionType STRONG_TURTLE_MASTER = new PotionType(NamespaceID.from("minecraft:strong_turtle_master"));

  public static final PotionType WATER_BREATHING = new PotionType(NamespaceID.from("minecraft:water_breathing"));

  public static final PotionType LONG_WATER_BREATHING = new PotionType(NamespaceID.from("minecraft:long_water_breathing"));

  public static final PotionType HEALING = new PotionType(NamespaceID.from("minecraft:healing"));

  public static final PotionType STRONG_HEALING = new PotionType(NamespaceID.from("minecraft:strong_healing"));

  public static final PotionType HARMING = new PotionType(NamespaceID.from("minecraft:harming"));

  public static final PotionType STRONG_HARMING = new PotionType(NamespaceID.from("minecraft:strong_harming"));

  public static final PotionType POISON = new PotionType(NamespaceID.from("minecraft:poison"));

  public static final PotionType LONG_POISON = new PotionType(NamespaceID.from("minecraft:long_poison"));

  public static final PotionType STRONG_POISON = new PotionType(NamespaceID.from("minecraft:strong_poison"));

  public static final PotionType REGENERATION = new PotionType(NamespaceID.from("minecraft:regeneration"));

  public static final PotionType LONG_REGENERATION = new PotionType(NamespaceID.from("minecraft:long_regeneration"));

  public static final PotionType STRONG_REGENERATION = new PotionType(NamespaceID.from("minecraft:strong_regeneration"));

  public static final PotionType STRENGTH = new PotionType(NamespaceID.from("minecraft:strength"));

  public static final PotionType LONG_STRENGTH = new PotionType(NamespaceID.from("minecraft:long_strength"));

  public static final PotionType STRONG_STRENGTH = new PotionType(NamespaceID.from("minecraft:strong_strength"));

  public static final PotionType WEAKNESS = new PotionType(NamespaceID.from("minecraft:weakness"));

  public static final PotionType LONG_WEAKNESS = new PotionType(NamespaceID.from("minecraft:long_weakness"));

  public static final PotionType LUCK = new PotionType(NamespaceID.from("minecraft:luck"));

  public static final PotionType SLOW_FALLING = new PotionType(NamespaceID.from("minecraft:slow_falling"));

  public static final PotionType LONG_SLOW_FALLING = new PotionType(NamespaceID.from("minecraft:long_slow_falling"));

  static {
    Registries.registerPotionType(EMPTY);
    Registries.registerPotionType(WATER);
    Registries.registerPotionType(MUNDANE);
    Registries.registerPotionType(THICK);
    Registries.registerPotionType(AWKWARD);
    Registries.registerPotionType(NIGHT_VISION);
    Registries.registerPotionType(LONG_NIGHT_VISION);
    Registries.registerPotionType(INVISIBILITY);
    Registries.registerPotionType(LONG_INVISIBILITY);
    Registries.registerPotionType(LEAPING);
    Registries.registerPotionType(LONG_LEAPING);
    Registries.registerPotionType(STRONG_LEAPING);
    Registries.registerPotionType(FIRE_RESISTANCE);
    Registries.registerPotionType(LONG_FIRE_RESISTANCE);
    Registries.registerPotionType(SWIFTNESS);
    Registries.registerPotionType(LONG_SWIFTNESS);
    Registries.registerPotionType(STRONG_SWIFTNESS);
    Registries.registerPotionType(SLOWNESS);
    Registries.registerPotionType(LONG_SLOWNESS);
    Registries.registerPotionType(STRONG_SLOWNESS);
    Registries.registerPotionType(TURTLE_MASTER);
    Registries.registerPotionType(LONG_TURTLE_MASTER);
    Registries.registerPotionType(STRONG_TURTLE_MASTER);
    Registries.registerPotionType(WATER_BREATHING);
    Registries.registerPotionType(LONG_WATER_BREATHING);
    Registries.registerPotionType(HEALING);
    Registries.registerPotionType(STRONG_HEALING);
    Registries.registerPotionType(HARMING);
    Registries.registerPotionType(STRONG_HARMING);
    Registries.registerPotionType(POISON);
    Registries.registerPotionType(LONG_POISON);
    Registries.registerPotionType(STRONG_POISON);
    Registries.registerPotionType(REGENERATION);
    Registries.registerPotionType(LONG_REGENERATION);
    Registries.registerPotionType(STRONG_REGENERATION);
    Registries.registerPotionType(STRENGTH);
    Registries.registerPotionType(LONG_STRENGTH);
    Registries.registerPotionType(STRONG_STRENGTH);
    Registries.registerPotionType(WEAKNESS);
    Registries.registerPotionType(LONG_WEAKNESS);
    Registries.registerPotionType(LUCK);
    Registries.registerPotionType(SLOW_FALLING);
    Registries.registerPotionType(LONG_SLOW_FALLING);
  }

  @NotNull
  private final NamespaceID id;

  protected PotionType(@NotNull NamespaceID id) {
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

  @NotNull
  public static List<PotionType> values() {
    return Registries.getPotionTypes();
  }
}
