package net.woof.woofexpandedpotions.event;


import net.minecraft.world.item.Item;
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
        builder.addMix(ModPotions.FULL_STRENGTH_POTION, ModItems.VITALITY_TONIC.get(), ModPotions.POTENT_STRENGTH_POTION);
        builder.addMix(ModPotions.FULL_STRENGTH_POTION, ModItems.DURATION_MIX.get(), ModPotions.EVERLASTING_STRENGTH_POTION);
        builder.addMix(ModPotions.POTENT_STRENGTH_POTION, ModItems.SUPREME_STABILIZING_ENRICHER.get(), ModPotions.SUPREME_STRENGTH_POTION);

        builder.addMix(Potions.LONG_REGENERATION, Items.GLOWSTONE_DUST, ModPotions.FULL_REGENERATION_POTION);
        builder.addMix(Potions.STRONG_REGENERATION, Items.REDSTONE, ModPotions.FULL_REGENERATION_POTION);
        builder.addMix(ModPotions.FULL_REGENERATION_POTION, ModItems.REJUVENATION_TONIC.get(), ModPotions.POTENT_REGENERATION_POTION);
        builder.addMix(ModPotions.FULL_REGENERATION_POTION, ModItems.DURATION_MIX.get(), ModPotions.EVERLASTING_REGENERATION_POTION);
        builder.addMix(ModPotions.POTENT_REGENERATION_POTION, ModItems.SUPREME_STABILIZING_ENRICHER.get(), ModPotions.SUPREME_REGENERATION_POTION);

        builder.addMix(Potions.AWKWARD, Items.COPPER_INGOT, ModPotions.RESISTANCE_POTION);
        builder.addMix(ModPotions.RESISTANCE_POTION, Items.REDSTONE, ModPotions.LONG_RESISTANCE_POTION);
        builder.addMix(ModPotions.RESISTANCE_POTION, Items.GLOWSTONE_DUST, ModPotions.STRONG_RESISTANCE_POTION);
        builder.addMix(ModPotions.LONG_RESISTANCE_POTION, Items.GLOWSTONE_DUST, ModPotions.FULL_RESISTANCE_POTION);
        builder.addMix(ModPotions.STRONG_RESISTANCE_POTION, Items.REDSTONE, ModPotions.FULL_RESISTANCE_POTION);
        builder.addMix(ModPotions.FULL_RESISTANCE_POTION, ModItems.RESISTANCE_TONIC.get(), ModPotions.POTENT_RESISTANCE_POTION);
        builder.addMix(ModPotions.FULL_RESISTANCE_POTION, ModItems.DURATION_MIX.get(), ModPotions.EVERLASTING_RESISTANCE_POTION);
        builder.addMix(ModPotions.POTENT_RESISTANCE_POTION, ModItems.SUPREME_STABILIZING_ENRICHER.get(), ModPotions.SUPREME_RESISTANCE_POTION);

        builder.addMix(ModPotions.FULL_STRENGTH_POTION, Items.COPPER_INGOT, ModPotions.COMBAT_POTION);
        builder.addMix(ModPotions.FULL_RESISTANCE_POTION, Items.BLAZE_POWDER, ModPotions.COMBAT_POTION);
        builder.addMix(ModPotions.POTENT_STRENGTH_POTION, ModItems.RESISTANCE_TONIC.get(), ModPotions.POTENT_COMBAT_POTION);
        builder.addMix(ModPotions.POTENT_RESISTANCE_POTION, ModItems.VITALITY_TONIC.get(), ModPotions.POTENT_COMBAT_POTION);
        builder.addMix(ModPotions.COMBAT_POTION, ModItems.VITALITY_RESISTANCE_MIX_TONIC.get(), ModPotions.POTENT_COMBAT_POTION);
        builder.addMix(ModPotions.POTENT_COMBAT_POTION, ModItems.SUPREME_STABILIZING_ENRICHER.get(), ModPotions.SUPREME_COMBAT_POTION);
        builder.addMix(ModPotions.SUPREME_STRENGTH_POTION, ModItems.RESISTANCE_TONIC.get(), ModPotions.SUPREME_COMBAT_POTION);
        builder.addMix(ModPotions.SUPREME_RESISTANCE_POTION, ModItems.VITALITY_TONIC.get(), ModPotions.SUPREME_COMBAT_POTION);

        builder.addMix(Potions.LONG_FIRE_RESISTANCE, ModItems.DURATION_MIX.get(), ModPotions.EVERLASTING_FIRE_RESISTANCE_POTION);

        builder.addMix(Potions.LONG_SWIFTNESS, Items.GLOWSTONE_DUST, ModPotions.FULL_SWIFTNESS_POTION);
        builder.addMix(Potions.STRONG_SWIFTNESS, Items.REDSTONE, ModPotions.FULL_SWIFTNESS_POTION);
        builder.addMix(ModPotions.FULL_SWIFTNESS_POTION, ModItems.VELOCITY_TONIC.get(), ModPotions.POTENT_SWIFTNESS_POTION);
        builder.addMix(ModPotions.FULL_SWIFTNESS_POTION, ModItems.DURATION_MIX.get(), ModPotions.EVERLASTING_SWIFTNESS_POTION);
        builder.addMix(ModPotions.POTENT_SWIFTNESS_POTION, ModItems.SUPREME_STABILIZING_ENRICHER.get(), ModPotions.SUPREME_SWIFTNESS_POTION);

        builder.addMix(Potions.LONG_LEAPING, Items.GLOWSTONE_DUST, ModPotions.FULL_LEAPING_POTION);
        builder.addMix(Potions.STRONG_LEAPING, Items.REDSTONE, ModPotions.FULL_LEAPING_POTION);
        builder.addMix(ModPotions.FULL_LEAPING_POTION, ModItems.VELOCITY_TONIC.get(), ModPotions.POTENT_LEAPING_POTION);
        builder.addMix(ModPotions.FULL_LEAPING_POTION, ModItems.DURATION_MIX.get(), ModPotions.EVERLASTING_LEAPING_POTION);
        builder.addMix(ModPotions.POTENT_LEAPING_POTION, ModItems.SUPREME_STABILIZING_ENRICHER.get(), ModPotions.SUPREME_LEAPING_POTION);

        builder.addMix(Potions.LONG_SLOWNESS, Items.GLOWSTONE_DUST, ModPotions.FULL_SLOWNESS_POTION);
        builder.addMix(Potions.STRONG_SLOWNESS, Items.REDSTONE, ModPotions.FULL_SLOWNESS_POTION);
        builder.addMix(ModPotions.FULL_SLOWNESS_POTION, ModItems.TORPIDITY_TONIC.get(), ModPotions.POTENT_SLOWNESS_POTION);
        builder.addMix(ModPotions.FULL_SLOWNESS_POTION, ModItems.DURATION_MIX.get(), ModPotions.EVERLASTING_SLOWNESS_POTION);
        builder.addMix(ModPotions.POTENT_SLOWNESS_POTION, ModItems.SUPREME_STABILIZING_ENRICHER.get(), ModPotions.SUPREME_SLOWNESS_POTION);
    }
}
