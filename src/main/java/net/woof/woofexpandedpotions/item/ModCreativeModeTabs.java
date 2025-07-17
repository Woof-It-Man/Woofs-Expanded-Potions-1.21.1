package net.woof.woofexpandedpotions.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.woof.woofexpandedpotions.WoofExpandedPotions;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WoofExpandedPotions.MODID);

    public static final Supplier<CreativeModeTab> WOOF_EXPANDED_POTIONS_ITEMS_TAB = CREATIVE_MODE_TAB.register("woof_expanded_potions_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALCHEMICAL_ENRICHER.get())).title(Component.translatable("creativetab.woofexpandedpotions.woofexpandedpotions_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Enrichers
                        output.accept(ModItems.ALCHEMICAL_ENRICHER);
                        output.accept(ModItems.SUPREME_STABILIZING_ENRICHER);

                        //Tonics
                        output.accept(ModItems.VITALITY_TONIC);
                        output.accept(ModItems.REJUVENATION_TONIC);
                        output.accept(ModItems.NETHER_FIRE_TONIC);
                        output.accept(ModItems.VELOCITY_TONIC);
                        output.accept(ModItems.TORPIDITY_TONIC);
                        output.accept(ModItems.MINING_TONIC);
                        output.accept(ModItems.HEALTH_TONIC);
                        output.accept(ModItems.MIDNIGHT_TONIC);
                        output.accept(ModItems.INVISIBILITY_TONIC);
                        output.accept(ModItems.RESISTANCE_TONIC);
                        output.accept(ModItems.LIGHT_FALL_TONIC);
                        output.accept(ModItems.BREATHING_TONIC);
                        output.accept(ModItems.WITHERING_POISON_TONIC);

                        //Powders
                        output.accept(ModItems.VITALITY_POWDER);
                        output.accept(ModItems.REGENERATIVE_POWDER);
                        output.accept(ModItems.NETHER_FIRE_POWDER);
                        output.accept(ModItems.FLICKER_POWDER);
                        output.accept(ModItems.MINING_POWDER);
                        output.accept(ModItems.MIDNIGHT_POWDER);
                        output.accept(ModItems.INVISIBILITY_POWDER);
                        output.accept(ModItems.RESISTANCE_POWDER);
                        output.accept(ModItems.LIGHT_FALL_POWDER);
                        output.accept(ModItems.BREATHING_POWDER);
                        output.accept(ModItems.CORRUPTED_POWDER);

                        //Duration Mixes
                        output.accept(ModItems.DURATION_MIX);
                        output.accept(ModItems.ULTRA_DURATION_MIX);

                        //Food
                        output.accept(ModItems.FILLING_MEAL);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
