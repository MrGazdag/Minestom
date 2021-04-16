package net.minestom.server.registry;

import java.lang.String;
import java.util.List;
import net.kyori.adventure.key.Key;
import net.minestom.server.attribute.Attribute;
import net.minestom.server.entity.EntityType;
import net.minestom.server.entity.metadata.villager.VillagerProfession;
import net.minestom.server.entity.metadata.villager.VillagerType;
import net.minestom.server.fluid.Fluid;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockEntity;
import net.minestom.server.instance.block.BlockState;
import net.minestom.server.item.Enchantment;
import net.minestom.server.item.Material;
import net.minestom.server.particle.Particle;
import net.minestom.server.potion.PotionEffect;
import net.minestom.server.potion.PotionType;
import net.minestom.server.sound.SoundEvent;
import net.minestom.server.statistic.StatisticType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AUTOGENERATED
 */
public final class Registries {
  public static final IdCrossMapRegistry.Defaulted<Block> blockRegistry = new IdCrossMapRegistry.Defaulted<>(Block.AIR);
  ;

  public static final IdCrossMapRegistry.Defaulted<BlockState> blockStateRegistry = new IdCrossMapRegistry.Defaulted<>(BlockState.AIR_0);
  ;

  public static final MapRegistry<BlockEntity> blockEntityRegistry = new MapRegistry<>();
  ;

  public static final IdCrossMapRegistry.Defaulted<Fluid> fluidRegistry = new IdCrossMapRegistry.Defaulted<>(Fluid.EMPTY);
  ;

  public static final IdCrossMapRegistry.Defaulted<Material> materialRegistry = new IdCrossMapRegistry.Defaulted<>(Material.AIR);
  ;

  public static final IdCrossMapRegistry<Enchantment> enchantmentRegistry = new IdCrossMapRegistry<>();
  ;

  public static final MapRegistry<Attribute> attributeRegistry = new MapRegistry<>();
  ;

  public static final IdCrossMapRegistry<EntityType> entityTypeRegistry = new IdCrossMapRegistry<>();
  ;

  public static final MapRegistry<VillagerProfession> villagerProfessionRegistry = new MapRegistry<>();
  ;

  public static final MapRegistry<VillagerType> villagerTypeRegistry = new MapRegistry<>();
  ;

  public static final IdCrossMapRegistry<Particle> particleRegistry = new IdCrossMapRegistry<>();
  ;

  public static final MapRegistry.Defaulted<PotionType> potionTypeRegistry = new MapRegistry.Defaulted<>(PotionType.EMPTY);
  ;

  public static final IdCrossMapRegistry<PotionEffect> potionEffectRegistry = new IdCrossMapRegistry<>();
  ;

  public static final IdCrossMapRegistry<SoundEvent> soundEventRegistry = new IdCrossMapRegistry<>();
  ;

  public static final IdCrossMapRegistry<StatisticType> statisticTypeRegistry = new IdCrossMapRegistry<>();
  ;

  /**
   * Returns the corresponding Block matching the given id. Returns 'AIR' if none match.
   */
  @NotNull
  public static Block getBlock(@NotNull String id) {
    return blockRegistry.get(Key.key(id));
  }

  /**
   * Returns the corresponding Block matching the given key. Returns 'AIR' if none match.
   */
  @NotNull
  public static Block getBlock(@NotNull Key key) {
    return blockRegistry.get(key);
  }

  /**
   * Adds the given Block to the registiry with the given id. Returns false if the Block or the id is already registered.
   */
  public static boolean registerBlock(@NotNull Block block) {
    return blockRegistry.register(block);
  }

  public static int getBlockId(@NotNull Block block) {
    return blockRegistry.getId(block);
  }

  @NotNull
  public static Block getBlock(int id) {
    return blockRegistry.get((short) id);
  }

  @NotNull
  public static List<Block> getBlocks() {
    return blockRegistry.values();
  }

  /**
   * Returns the corresponding BlockState matching the given id. Returns 'AIR_0' if none match.
   */
  @NotNull
  public static BlockState getBlockState(@NotNull String id) {
    return blockStateRegistry.get(Key.key(id));
  }

  /**
   * Returns the corresponding BlockState matching the given key. Returns 'AIR_0' if none match.
   */
  @NotNull
  public static BlockState getBlockState(@NotNull Key key) {
    return blockStateRegistry.get(key);
  }

  /**
   * Adds the given BlockState to the registiry with the given id. Returns false if the BlockState or the id is already registered.
   */
  public static boolean registerBlockState(@NotNull BlockState blockstate) {
    return blockStateRegistry.register(blockstate);
  }

  public static int getBlockStateId(@NotNull BlockState blockstate) {
    return blockStateRegistry.getId(blockstate);
  }

  @NotNull
  public static BlockState getBlockState(int id) {
    return blockStateRegistry.get((short) id);
  }

  @NotNull
  public static List<BlockState> getBlockStates() {
    return blockStateRegistry.values();
  }

  /**
   * Returns the corresponding BlockEntity matching the given id. Returns null if none match.
   */
  @Nullable
  public static BlockEntity getBlockEntity(@NotNull String id) {
    return blockEntityRegistry.get(Key.key(id));
  }

  /**
   * Returns the corresponding BlockEntity matching the given key. Returns null if none match.
   */
  @Nullable
  public static BlockEntity getBlockEntity(@NotNull Key key) {
    return blockEntityRegistry.get(key);
  }

  /**
   * Adds the given BlockEntity to the registiry with the given id. Returns false if the BlockEntity or the id is already registered.
   */
  public static boolean registerBlockEntity(@NotNull BlockEntity blockentity) {
    return blockEntityRegistry.register(blockentity);
  }

  @NotNull
  public static List<BlockEntity> getBlockEntities() {
    return blockEntityRegistry.values();
  }

  /**
   * Returns the corresponding Fluid matching the given id. Returns 'EMPTY' if none match.
   */
  @NotNull
  public static Fluid getFluid(@NotNull String id) {
    return fluidRegistry.get(Key.key(id));
  }

  /**
   * Returns the corresponding Fluid matching the given key. Returns 'EMPTY' if none match.
   */
  @NotNull
  public static Fluid getFluid(@NotNull Key key) {
    return fluidRegistry.get(key);
  }

  /**
   * Adds the given Fluid to the registiry with the given id. Returns false if the Fluid or the id is already registered.
   */
  public static boolean registerFluid(@NotNull Fluid fluid) {
    return fluidRegistry.register(fluid);
  }

  public static int getFluidId(@NotNull Fluid fluid) {
    return fluidRegistry.getId(fluid);
  }

  @NotNull
  public static Fluid getFluid(int id) {
    return fluidRegistry.get((short) id);
  }

  @NotNull
  public static List<Fluid> getFluids() {
    return fluidRegistry.values();
  }

  /**
   * Returns the corresponding Material matching the given id. Returns 'AIR' if none match.
   */
  @NotNull
  public static Material getMaterial(@NotNull String id) {
    return materialRegistry.get(Key.key(id));
  }

  /**
   * Returns the corresponding Material matching the given key. Returns 'AIR' if none match.
   */
  @NotNull
  public static Material getMaterial(@NotNull Key key) {
    return materialRegistry.get(key);
  }

  /**
   * Adds the given Material to the registiry with the given id. Returns false if the Material or the id is already registered.
   */
  public static boolean registerMaterial(@NotNull Material material) {
    return materialRegistry.register(material);
  }

  public static int getMaterialId(@NotNull Material material) {
    return materialRegistry.getId(material);
  }

  @NotNull
  public static Material getMaterial(int id) {
    return materialRegistry.get((short) id);
  }

  @NotNull
  public static List<Material> getMaterials() {
    return materialRegistry.values();
  }

  /**
   * Returns the corresponding Enchantment matching the given id. Returns null if none match.
   */
  @Nullable
  public static Enchantment getEnchantment(@NotNull String id) {
    return enchantmentRegistry.get(Key.key(id));
  }

  /**
   * Returns the corresponding Enchantment matching the given key. Returns null if none match.
   */
  @Nullable
  public static Enchantment getEnchantment(@NotNull Key key) {
    return enchantmentRegistry.get(key);
  }

  /**
   * Adds the given Enchantment to the registiry with the given id. Returns false if the Enchantment or the id is already registered.
   */
  public static boolean registerEnchantment(@NotNull Enchantment enchantment) {
    return enchantmentRegistry.register(enchantment);
  }

  public static int getEnchantmentId(@NotNull Enchantment enchantment) {
    return enchantmentRegistry.getId(enchantment);
  }

  @Nullable
  public static Enchantment getEnchantment(int id) {
    return enchantmentRegistry.get((short) id);
  }

  @NotNull
  public static List<Enchantment> getEnchantments() {
    return enchantmentRegistry.values();
  }

  /**
   * Returns the corresponding Attribute matching the given id. Returns null if none match.
   */
  @Nullable
  public static Attribute getAttribute(@NotNull String id) {
    return attributeRegistry.get(Key.key(id));
  }

  /**
   * Returns the corresponding Attribute matching the given key. Returns null if none match.
   */
  @Nullable
  public static Attribute getAttribute(@NotNull Key key) {
    return attributeRegistry.get(key);
  }

  /**
   * Adds the given Attribute to the registiry with the given id. Returns false if the Attribute or the id is already registered.
   */
  public static boolean registerAttribute(@NotNull Attribute attribute) {
    return attributeRegistry.register(attribute);
  }

  @NotNull
  public static List<Attribute> getAttributes() {
    return attributeRegistry.values();
  }

  /**
   * Returns the corresponding EntityType matching the given id. Returns null if none match.
   */
  @Nullable
  public static EntityType getEntityType(@NotNull String id) {
    return entityTypeRegistry.get(Key.key(id));
  }

  /**
   * Returns the corresponding EntityType matching the given key. Returns null if none match.
   */
  @Nullable
  public static EntityType getEntityType(@NotNull Key key) {
    return entityTypeRegistry.get(key);
  }

  /**
   * Adds the given EntityType to the registiry with the given id. Returns false if the EntityType or the id is already registered.
   */
  public static boolean registerEntityType(@NotNull EntityType entitytype) {
    return entityTypeRegistry.register(entitytype);
  }

  public static int getEntityTypeId(@NotNull EntityType entitytype) {
    return entityTypeRegistry.getId(entitytype);
  }

  @Nullable
  public static EntityType getEntityType(int id) {
    return entityTypeRegistry.get((short) id);
  }

  @NotNull
  public static List<EntityType> getEntityTypes() {
    return entityTypeRegistry.values();
  }

  /**
   * Returns the corresponding VillagerProfession matching the given id. Returns null if none match.
   */
  @Nullable
  public static VillagerProfession getVillagerProfession(@NotNull String id) {
    return villagerProfessionRegistry.get(Key.key(id));
  }

  /**
   * Returns the corresponding VillagerProfession matching the given key. Returns null if none match.
   */
  @Nullable
  public static VillagerProfession getVillagerProfession(@NotNull Key key) {
    return villagerProfessionRegistry.get(key);
  }

  /**
   * Adds the given VillagerProfession to the registiry with the given id. Returns false if the VillagerProfession or the id is already registered.
   */
  public static boolean registerVillagerProfession(@NotNull VillagerProfession villagerprofession) {
    return villagerProfessionRegistry.register(villagerprofession);
  }

  @NotNull
  public static List<VillagerProfession> getVillagerProfessions() {
    return villagerProfessionRegistry.values();
  }

  /**
   * Returns the corresponding VillagerType matching the given id. Returns null if none match.
   */
  @Nullable
  public static VillagerType getVillagerType(@NotNull String id) {
    return villagerTypeRegistry.get(Key.key(id));
  }

  /**
   * Returns the corresponding VillagerType matching the given key. Returns null if none match.
   */
  @Nullable
  public static VillagerType getVillagerType(@NotNull Key key) {
    return villagerTypeRegistry.get(key);
  }

  /**
   * Adds the given VillagerType to the registiry with the given id. Returns false if the VillagerType or the id is already registered.
   */
  public static boolean registerVillagerType(@NotNull VillagerType villagertype) {
    return villagerTypeRegistry.register(villagertype);
  }

  @NotNull
  public static List<VillagerType> getVillagerTypes() {
    return villagerTypeRegistry.values();
  }

  /**
   * Returns the corresponding Particle matching the given id. Returns null if none match.
   */
  @Nullable
  public static Particle getParticle(@NotNull String id) {
    return particleRegistry.get(Key.key(id));
  }

  /**
   * Returns the corresponding Particle matching the given key. Returns null if none match.
   */
  @Nullable
  public static Particle getParticle(@NotNull Key key) {
    return particleRegistry.get(key);
  }

  /**
   * Adds the given Particle to the registiry with the given id. Returns false if the Particle or the id is already registered.
   */
  public static boolean registerParticle(@NotNull Particle particle) {
    return particleRegistry.register(particle);
  }

  public static int getParticleId(@NotNull Particle particle) {
    return particleRegistry.getId(particle);
  }

  @Nullable
  public static Particle getParticle(int id) {
    return particleRegistry.get((short) id);
  }

  @NotNull
  public static List<Particle> getParticles() {
    return particleRegistry.values();
  }

  /**
   * Returns the corresponding PotionType matching the given id. Returns 'EMPTY' if none match.
   */
  @NotNull
  public static PotionType getPotionType(@NotNull String id) {
    return potionTypeRegistry.get(Key.key(id));
  }

  /**
   * Returns the corresponding PotionType matching the given key. Returns 'EMPTY' if none match.
   */
  @NotNull
  public static PotionType getPotionType(@NotNull Key key) {
    return potionTypeRegistry.get(key);
  }

  /**
   * Adds the given PotionType to the registiry with the given id. Returns false if the PotionType or the id is already registered.
   */
  public static boolean registerPotionType(@NotNull PotionType potiontype) {
    return potionTypeRegistry.register(potiontype);
  }

  @NotNull
  public static List<PotionType> getPotionTypes() {
    return potionTypeRegistry.values();
  }

  /**
   * Returns the corresponding PotionEffect matching the given id. Returns null if none match.
   */
  @Nullable
  public static PotionEffect getPotionEffect(@NotNull String id) {
    return potionEffectRegistry.get(Key.key(id));
  }

  /**
   * Returns the corresponding PotionEffect matching the given key. Returns null if none match.
   */
  @Nullable
  public static PotionEffect getPotionEffect(@NotNull Key key) {
    return potionEffectRegistry.get(key);
  }

  /**
   * Adds the given PotionEffect to the registiry with the given id. Returns false if the PotionEffect or the id is already registered.
   */
  public static boolean registerPotionEffect(@NotNull PotionEffect potioneffect) {
    return potionEffectRegistry.register(potioneffect);
  }

  public static int getPotionEffectId(@NotNull PotionEffect potioneffect) {
    return potionEffectRegistry.getId(potioneffect);
  }

  @Nullable
  public static PotionEffect getPotionEffect(int id) {
    return potionEffectRegistry.get((short) id);
  }

  @NotNull
  public static List<PotionEffect> getPotionEffects() {
    return potionEffectRegistry.values();
  }

  /**
   * Returns the corresponding SoundEvent matching the given id. Returns null if none match.
   */
  @Nullable
  public static SoundEvent getSoundEvent(@NotNull String id) {
    return soundEventRegistry.get(Key.key(id));
  }

  /**
   * Returns the corresponding SoundEvent matching the given key. Returns null if none match.
   */
  @Nullable
  public static SoundEvent getSoundEvent(@NotNull Key key) {
    return soundEventRegistry.get(key);
  }

  /**
   * Adds the given SoundEvent to the registiry with the given id. Returns false if the SoundEvent or the id is already registered.
   */
  public static boolean registerSoundEvent(@NotNull SoundEvent soundevent) {
    return soundEventRegistry.register(soundevent);
  }

  public static int getSoundEventId(@NotNull SoundEvent soundevent) {
    return soundEventRegistry.getId(soundevent);
  }

  @Nullable
  public static SoundEvent getSoundEvent(int id) {
    return soundEventRegistry.get((short) id);
  }

  @NotNull
  public static List<SoundEvent> getSoundEvents() {
    return soundEventRegistry.values();
  }

  /**
   * Returns the corresponding StatisticType matching the given id. Returns null if none match.
   */
  @Nullable
  public static StatisticType getStatisticType(@NotNull String id) {
    return statisticTypeRegistry.get(Key.key(id));
  }

  /**
   * Returns the corresponding StatisticType matching the given key. Returns null if none match.
   */
  @Nullable
  public static StatisticType getStatisticType(@NotNull Key key) {
    return statisticTypeRegistry.get(key);
  }

  /**
   * Adds the given StatisticType to the registiry with the given id. Returns false if the StatisticType or the id is already registered.
   */
  public static boolean registerStatisticType(@NotNull StatisticType statistictype) {
    return statisticTypeRegistry.register(statistictype);
  }

  public static int getStatisticTypeId(@NotNull StatisticType statistictype) {
    return statisticTypeRegistry.getId(statistictype);
  }

  @Nullable
  public static StatisticType getStatisticType(int id) {
    return statisticTypeRegistry.get((short) id);
  }

  @NotNull
  public static List<StatisticType> getStatisticTypes() {
    return statisticTypeRegistry.values();
  }
}
