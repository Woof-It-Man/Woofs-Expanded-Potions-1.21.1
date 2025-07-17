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
    }
}
