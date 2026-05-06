package net.woof.woofexpandedpotions.event;


import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;
import net.woof.woofexpandedpotions.WoofExpandedPotions;
import net.woof.woofexpandedpotions.item.ModItems;
import net.woof.woofexpandedpotions.potion.ModPotions;

@EventBusSubscriber(modid = WoofExpandedPotions.MODID)
public class ModEvents {

    @SubscribeEvent
    public static void onBrewingRecipeRegister(RegisterBrewingRecipesEvent event) {
        PotionBrewing.Builder builder = event.getBuilder();

        builder.addMix(Potions.LONG_STRENGTH, Items.GLOWSTONE_DUST, ModPotions.FULL_STRENGTH_POTION);
        builder.addMix(Potions.STRONG_STRENGTH, Items.REDSTONE, ModPotions.FULL_STRENGTH_POTION);
        builder.addMix(ModPotions.FULL_STRENGTH_POTION, ModItems.VITALITY_POWDER.get(), ModPotions.POTENT_STRENGTH_POTION);
        builder.addMix(ModPotions.FULL_STRENGTH_POTION, ModItems.VITALITY_TONIC.get(), ModPotions.EXTREME_STRENGTH_POTION);
        builder.addMix(ModPotions.FULL_STRENGTH_POTION, ModItems.DURATION_MIX.get(), ModPotions.EVERLASTING_STRENGTH_POTION);

        builder.addMix(Potions.LONG_REGENERATION, Items.GLOWSTONE_DUST, ModPotions.FULL_REGENERATION_POTION);
        builder.addMix(Potions.STRONG_REGENERATION, Items.REDSTONE, ModPotions.FULL_REGENERATION_POTION);
        builder.addMix(ModPotions.FULL_REGENERATION_POTION, ModItems.REGENERATIVE_POWDER.get(), ModPotions.POTENT_REGENERATION_POTION);
        builder.addMix(ModPotions.FULL_REGENERATION_POTION, ModItems.REJUVENATION_TONIC.get(), ModPotions.EXTREME_REGENERATION_POTION);
        builder.addMix(ModPotions.FULL_REGENERATION_POTION, ModItems.DURATION_MIX.get(), ModPotions.EVERLASTING_REGENERATION_POTION);

        builder.addMix(Potions.AWKWARD, Items.COPPER_INGOT, ModPotions.RESISTANCE_POTION);
        builder.addMix(ModPotions.RESISTANCE_POTION, Items.REDSTONE, ModPotions.LONG_RESISTANCE_POTION);
        builder.addMix(ModPotions.RESISTANCE_POTION, Items.GLOWSTONE_DUST, ModPotions.STRONG_RESISTANCE_POTION);
        builder.addMix(ModPotions.LONG_RESISTANCE_POTION, Items.GLOWSTONE_DUST, ModPotions.FULL_RESISTANCE_POTION);
        builder.addMix(ModPotions.STRONG_RESISTANCE_POTION, Items.REDSTONE, ModPotions.FULL_RESISTANCE_POTION);
        builder.addMix(ModPotions.FULL_RESISTANCE_POTION, ModItems.BULWARK_POWDER.get(), ModPotions.POTENT_RESISTANCE_POTION);
        builder.addMix(ModPotions.FULL_RESISTANCE_POTION, ModItems.BULWARK_TONIC.get(), ModPotions.EXTREME_RESISTANCE_POTION);
        builder.addMix(ModPotions.FULL_RESISTANCE_POTION, ModItems.DURATION_MIX.get(), ModPotions.EVERLASTING_RESISTANCE_POTION);

        builder.addMix(ModPotions.FULL_STRENGTH_POTION, Items.COPPER_INGOT, ModPotions.COMBAT_POTION);
        builder.addMix(ModPotions.FULL_RESISTANCE_POTION, Items.BLAZE_POWDER, ModPotions.COMBAT_POTION);
        builder.addMix(ModPotions.EXTREME_STRENGTH_POTION, ModItems.BULWARK_TONIC.get(), ModPotions.EXTREME_COMBAT_POTION);
        builder.addMix(ModPotions.EXTREME_RESISTANCE_POTION, ModItems.VITALITY_TONIC.get(), ModPotions.EXTREME_COMBAT_POTION);
        builder.addMix(ModPotions.COMBAT_POTION, ModItems.VITALITY_BULWARK_MIX_TONIC.get(), ModPotions.EXTREME_COMBAT_POTION);
        builder.addMix(ModPotions.COMBAT_POTION, ModItems.DURATION_MIX.get(), ModPotions.EVERLASTING_COMBAT_POTION);

        builder.addMix(Potions.LONG_FIRE_RESISTANCE, ModItems.NETHER_FIRE_POWDER.get(), ModPotions.LONGLASTING_FIRE_RESISTANCE_POTION);
        builder.addMix(Potions.LONG_FIRE_RESISTANCE, ModItems.NETHER_FIRE_TONIC.get(), ModPotions.PERMANENT_FIRE_RESISTANCE_POTION);

        builder.addMix(Potions.LONG_SWIFTNESS, Items.GLOWSTONE_DUST, ModPotions.FULL_SWIFTNESS_POTION);
        builder.addMix(Potions.STRONG_SWIFTNESS, Items.REDSTONE, ModPotions.FULL_SWIFTNESS_POTION);
        builder.addMix(ModPotions.FULL_SWIFTNESS_POTION, ModItems.FLICKER_POWDER.get(), ModPotions.POTENT_SWIFTNESS_POTION);
        builder.addMix(ModPotions.FULL_SWIFTNESS_POTION, ModItems.VELOCITY_TONIC.get(), ModPotions.EXTREME_SWIFTNESS_POTION);
        builder.addMix(ModPotions.FULL_SWIFTNESS_POTION, ModItems.DURATION_MIX.get(), ModPotions.EVERLASTING_SWIFTNESS_POTION);

        builder.addMix(Potions.LONG_LEAPING, Items.GLOWSTONE_DUST, ModPotions.FULL_LEAPING_POTION);
        builder.addMix(Potions.STRONG_LEAPING, Items.REDSTONE, ModPotions.FULL_LEAPING_POTION);
        builder.addMix(ModPotions.FULL_LEAPING_POTION, ModItems.FLICKER_POWDER.get(), ModPotions.POTENT_LEAPING_POTION);
        builder.addMix(ModPotions.FULL_LEAPING_POTION, ModItems.VELOCITY_TONIC.get(), ModPotions.EXTREME_LEAPING_POTION);
        builder.addMix(ModPotions.FULL_LEAPING_POTION, ModItems.DURATION_MIX.get(), ModPotions.EVERLASTING_LEAPING_POTION);

        builder.addMix(Potions.LONG_SLOWNESS, Items.GLOWSTONE_DUST, ModPotions.FULL_SLOWNESS_POTION);
        builder.addMix(Potions.STRONG_SLOWNESS, Items.REDSTONE, ModPotions.FULL_SLOWNESS_POTION);
        builder.addMix(ModPotions.FULL_SLOWNESS_POTION, ModItems.CORRUPTED_POWDER.get(), ModPotions.POTENT_SLOWNESS_POTION);
        builder.addMix(ModPotions.FULL_SLOWNESS_POTION, ModItems.TORPIDITY_TONIC.get(), ModPotions.EXTREME_SLOWNESS_POTION);
        builder.addMix(ModPotions.FULL_SLOWNESS_POTION, ModItems.DURATION_MIX.get(), ModPotions.EVERLASTING_SLOWNESS_POTION);

        builder.addMix(Potions.LONG_POISON, Items.GLOWSTONE_DUST, ModPotions.FULL_POISON_POTION);
        builder.addMix(Potions.STRONG_POISON, Items.REDSTONE, ModPotions.FULL_POISON_POTION);
        builder.addMix(ModPotions.FULL_POISON_POTION, ModItems.CORRUPTED_POWDER.get(), ModPotions.POTENT_POISON_POTION);
        builder.addMix(ModPotions.FULL_POISON_POTION, ModItems.TORPIDITY_TONIC.get(), ModPotions.EXTREME_POISON_POTION);
        builder.addMix(ModPotions.FULL_POISON_POTION, ModItems.DURATION_MIX.get(), ModPotions.EVERLASTING_POISON_POTION);

        builder.addMix(Potions.STRONG_HARMING, ModItems.CORRUPTED_POWDER.get(), ModPotions.POTENT_HARMING_POTION);
        builder.addMix(Potions.STRONG_HARMING, ModItems.TORPIDITY_TONIC.get(), ModPotions.EXTREME_HARMING_POTION);

        builder.addMix(Potions.LONG_WEAKNESS, ModItems.CORRUPTED_POWDER.get(), ModPotions.LONGLASTING_WEAKNESS_POTION);
        builder.addMix(Potions.LONG_WEAKNESS, ModItems.TORPIDITY_TONIC.get(), ModPotions.PERMANENT_WEAKNESS_POTION);

        builder.addMix(Potions.AWKWARD, Items.COAL, ModPotions.MINING_POTION);
        builder.addMix(ModPotions.MINING_POTION, Items.REDSTONE, ModPotions.LONG_MINING_POTION);
        builder.addMix(ModPotions.MINING_POTION, Items.GLOWSTONE_DUST, ModPotions.STRONG_MINING_POTION);
        builder.addMix(ModPotions.LONG_MINING_POTION, Items.GLOWSTONE_DUST, ModPotions.FULL_MINING_POTION);
        builder.addMix(ModPotions.STRONG_MINING_POTION, Items.REDSTONE, ModPotions.FULL_MINING_POTION);
        builder.addMix(ModPotions.FULL_MINING_POTION, ModItems.MINING_POWDER.get(), ModPotions.POTENT_MINING_POTION);
        builder.addMix(ModPotions.FULL_MINING_POTION, ModItems.MINING_TONIC.get(), ModPotions.EXTREME_MINING_POTION);
        builder.addMix(ModPotions.FULL_MINING_POTION, ModItems.DURATION_MIX.get(), ModPotions.EVERLASTING_MINING_POTION);

        builder.addMix(Potions.LONG_NIGHT_VISION, ModItems.MIDNIGHT_POWDER.get(), ModPotions.LONGLASTING_NIGHT_VISION_POTION);
        builder.addMix(Potions.LONG_NIGHT_VISION, ModItems.MIDNIGHT_TONIC.get(), ModPotions.PERMANENT_NIGHT_VISION_POTION);

        builder.addMix(Potions.LONG_INVISIBILITY, ModItems.INVISIBILITY_POWDER.get(), ModPotions.LONGLASTINGG_INVISIBILITY_POTION);
        builder.addMix(Potions.LONG_INVISIBILITY, ModItems.INVISIBILITY_TONIC.get(), ModPotions.PERMANENT_INVISIBILITY_POTION);

        builder.addMix(Potions.LONG_SLOW_FALLING, ModItems.LIGHT_FALL_POWDER.get(), ModPotions.LONGLASTING_SLOW_FALLING_POTION);
        builder.addMix(Potions.LONG_SLOW_FALLING, ModItems.LIGHT_FALL_TONIC.get(), ModPotions.PERMANENT_SLOW_FALLING_POTION);

        builder.addMix(Potions.LONG_WATER_BREATHING, ModItems.BREATHING_POWDER.get(), ModPotions.LONGLASTING_WATER_BREATHING_POTION);
        builder.addMix(Potions.LONG_WATER_BREATHING, ModItems.BREATHING_TONIC.get(), ModPotions.PERMANENT_WATER_BREATHING_POTION);

        builder.addMix(Potions.STRONG_HEALING, ModItems.REGENERATIVE_POWDER.get(), ModPotions.POTENT_HEALING_POTION);
        builder.addMix(Potions.STRONG_HEALING, ModItems.REJUVENATION_TONIC.get(), ModPotions.EXTREME_HEALING_POTION);

        builder.addMix(Potions.AWKWARD, Items.WITHER_ROSE, ModPotions.WITHERING_POTION);
        builder.addMix(ModPotions.WITHERING_POTION, ModItems.CORRUPTED_POWDER.get(), ModPotions.POTENT_WITHERING_POTION);
        builder.addMix(ModPotions.WITHERING_POTION, ModItems.TORPIDITY_TONIC.get(), ModPotions.EXTREME_WITHERING_POTION);

        builder.addMix(Potions.LONG_TURTLE_MASTER, Items.GLOWSTONE_DUST, ModPotions.FULL_TURTLE_MASTER_POTION);
        builder.addMix(Potions.STRONG_TURTLE_MASTER, Items.REDSTONE, ModPotions.FULL_TURTLE_MASTER_POTION);
        builder.addMix(ModPotions.FULL_TURTLE_MASTER_POTION, ModItems.BULWARK_POWDER.get(), ModPotions.POTENT_TURTLE_MASTER_POTION);
        builder.addMix(ModPotions.FULL_TURTLE_MASTER_POTION, ModItems.BULWARK_TONIC.get(), ModPotions.EXTREME_TURTLE_MASTER_POTION);
    }
}
