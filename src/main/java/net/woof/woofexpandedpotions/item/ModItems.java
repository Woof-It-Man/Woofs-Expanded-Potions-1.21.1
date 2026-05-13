package net.woof.woofexpandedpotions.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.woof.woofexpandedpotions.WoofExpandedPotions;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WoofExpandedPotions.MODID);

    //Enrichers
    public static final DeferredItem<Item> ENRICHED_POWDER = ITEMS.register("enriched_powder", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALCHEMICAL_ENRICHER = ITEMS.register("alchemical_enricher", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SUPREME_STABILIZING_ENRICHER = ITEMS.register("supreme_stabilizing_enricher", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DIAMOND_CARROT = ITEMS.register("diamond_carrot", () -> new Item(new Item.Properties().food(ModFoods.DIAMOND_CARROT)));
    public static final DeferredItem<Item> ENCRUSTED_CARROT = ITEMS.register("encrusted_carrot", () -> new Item(new Item.Properties().food(ModFoods.ENCRUSTED_CARROT)));
    //Tonic Base
    public static final DeferredItem<Item> BASE_TONIC = ITEMS.register("base_tonic", () -> new Item(new Item.Properties()));

    //Tonics
    public static final DeferredItem<Item> VITALITY_TONIC = ITEMS.register("vitality_tonic", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REJUVENATION_TONIC = ITEMS.register("rejuvenation_tonic", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULWARK_TONIC = ITEMS.register("bulwark_tonic", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHER_FIRE_TONIC = ITEMS.register("nether_fire_tonic", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VELOCITY_TONIC = ITEMS.register("velocity_tonic", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TORPIDITY_TONIC = ITEMS.register("torpidity_tonic", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MINING_TONIC = ITEMS.register("mining_tonic", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MIDNIGHT_TONIC = ITEMS.register("midnight_tonic", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INVISIBILITY_TONIC = ITEMS.register("invisibility_tonic", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LIGHT_FALL_TONIC = ITEMS.register("light_fall_tonic", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BREATHING_TONIC = ITEMS.register("breathing_tonic", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WITHERING_POISON_TONIC = ITEMS.register("withering_poison_tonic", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIDAL_TONIC = ITEMS.register("tidal_tonic", () -> new Item(new Item.Properties()));

    //Tonic Combos
    public static final DeferredItem<Item> VITALITY_BULWARK_MIX_TONIC = ITEMS.register("vitality_bulwark_mix_tonic", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLICKER_BULWARK_MIX_TONIC = ITEMS.register("flicker_bulwark_mix_tonic", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VITALITY_VELOCITY_MIX_TONIC = ITEMS.register("vitality_velocity_mix_tonic", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REJUVENATION_VELOCITY_MIX_TONIC = ITEMS.register("rejuvenation_velocity_mix_tonic", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GLADIATOR_TONIC = ITEMS.register("gladiator_tonic", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> JUGGERNAUT_TONIC = ITEMS.register("juggernaut_tonic", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BERSERKER_TONIC = ITEMS.register("berserker_tonic", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PHANTOM_TONIC = ITEMS.register("phantom_tonic", () -> new Item(new Item.Properties()));

    //Super Tonics
    public static final DeferredItem<Item> OVERLOAD_TONIC = ITEMS.register("overload_tonic", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PROSPERITY_TONIC = ITEMS.register("prosperity_tonic", () -> new Item(new Item.Properties()));

    //Powders
    public static final DeferredItem<Item> VITALITY_POWDER = ITEMS.register("vitality_powder", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REGENERATIVE_POWDER = ITEMS.register("regenerative_powder", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULWARK_POWDER = ITEMS.register("bulwark_powder", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHER_FIRE_POWDER = ITEMS.register("nether_fire_powder", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLICKER_POWDER = ITEMS.register("flicker_powder", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MINING_POWDER = ITEMS.register("mining_powder", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MIDNIGHT_POWDER = ITEMS.register("midnight_powder", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INVISIBILITY_POWDER = ITEMS.register("invisibility_powder", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LIGHT_FALL_POWDER = ITEMS.register("light_fall_powder", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BREATHING_POWDER = ITEMS.register("breathing_powder", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CORRUPTED_POWDER = ITEMS.register("corrupted_powder", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEEP_POWDER = ITEMS.register("deep_powder", () -> new Item(new Item.Properties()));

    //Duration Mixes
    public static final DeferredItem<Item> DURATION_MIX = ITEMS.register("duration_mix", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ULTRA_DURATION_MIX = ITEMS.register("ultra_duration_mix", () -> new Item(new Item.Properties()));

    //Foods
    public static final DeferredItem<Item> FILLING_MEAL = ITEMS.register("filling_meal", () -> new Item(new Item.Properties().food(ModFoods.FILLING_MEAL)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
