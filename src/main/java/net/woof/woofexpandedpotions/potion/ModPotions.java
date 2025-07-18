package net.woof.woofexpandedpotions.potion;

import net.woof.woofexpandedpotions.WoofExpandedPotions;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(BuiltInRegistries.POTION, WoofExpandedPotions.MODID);

    public static final Holder<Potion> FULL_STRENGTH_POTION = POTIONS.register("full_strength_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 1)));
    public static final Holder<Potion> POTENT_STRENGTH_POTION = POTIONS.register("potent_strength_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 2)));
    public static final Holder<Potion> SUPREME_STRENGTH_POTION = POTIONS.register("supreme_strength_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 3)));
    public static final Holder<Potion> EVERLASTING_STRENGTH_POTION = POTIONS.register("everlasting_strength_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 36000, 1)));

    public static final Holder<Potion> FULL_REGENERATION_POTION = POTIONS.register("full_regeneration_potion", () -> new Potion(new MobEffectInstance(MobEffects.REGENERATION, 800, 1)));
    public static final Holder<Potion> POTENT_REGENERATION_POTION = POTIONS.register("potent_regeneration_potion", () -> new Potion(new MobEffectInstance(MobEffects.REGENERATION, 1200, 2)));
    public static final Holder<Potion> SUPREME_REGENERATION_POTION = POTIONS.register("supreme_regeneration_potion", () -> new Potion(new MobEffectInstance(MobEffects.REGENERATION, 1500, 3)));
    public static final Holder<Potion> EVERLASTING_REGENERATION_POTION = POTIONS.register("everlasting_regeneration_potion", () -> new Potion(new MobEffectInstance(MobEffects.REGENERATION, 6400, 1)));

    //Vanilla doesn't have resistance potions on their own, just the turtle master, so here it is!
    public static final Holder<Potion> RESISTANCE_POTION = POTIONS.register("resistance_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 0)));
    public static final Holder<Potion> LONG_RESISTANCE_POTION = POTIONS.register("long_resistance_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 9600, 0)));
    public static final Holder<Potion> STRONG_RESISTANCE_POTION = POTIONS.register("strong_resistance_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1800, 1)));
    public static final Holder<Potion> FULL_RESISTANCE_POTION = POTIONS.register("full_resistance_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 1)));
    public static final Holder<Potion> POTENT_RESISTANCE_POTION = POTIONS.register("potent_resistance_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 2)));
    public static final Holder<Potion> SUPREME_RESISTANCE_POTION = POTIONS.register("supreme_resistance_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 3)));
    public static final Holder<Potion> EVERLASTING_RESISTANCE_POTION = POTIONS.register("everlasting_resistance_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 36000, 1)));

    public static final Holder<Potion> EVERLASTING_FIRE_RESISTANCE_POTION = POTIONS.register("everlasting_fire_resistance_potion", () -> new Potion(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 36000, 0)));

    public static final Holder<Potion> FULL_SWIFTNESS_POTION = POTIONS.register("full_swiftness_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 1)));
    public static final Holder<Potion> POTENT_SWIFTNESS_POTION = POTIONS.register("potent_swiftness_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 3)));
    public static final Holder<Potion> SUPREME_SWIFTNESS_POTION = POTIONS.register("supreme_swiftness_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 7)));
    public static final Holder<Potion> EVERLASTING_SWIFTNESS_POTION = POTIONS.register("everlasting_swiftness_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 36000, 1)));

    public static final Holder<Potion> FULL_LEAPING_POTION = POTIONS.register("full_leaping_potion", () -> new Potion(new MobEffectInstance(MobEffects.JUMP, 3600, 1)));
    public static final Holder<Potion> POTENT_LEAPING_POTION = POTIONS.register("potent_leaping_potion", () -> new Potion(new MobEffectInstance(MobEffects.JUMP, 3600, 2)));
    public static final Holder<Potion> SUPREME_LEAPING_POTION = POTIONS.register("supreme_leaping_potion", () -> new Potion(new MobEffectInstance(MobEffects.JUMP, 3600, 3)));
    public static final Holder<Potion> EVERLASTING_LEAPING_POTION = POTIONS.register("everlasting_leaping_potion", () -> new Potion(new MobEffectInstance(MobEffects.JUMP, 36000, 1)));

    public static final Holder<Potion> FULL_SLOWNESS_POTION = POTIONS.register("full_slowness_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 960, 2)));
    public static final Holder<Potion> POTENT_SLOWNESS_POTION = POTIONS.register("potent_slowness_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 960, 3)));
    public static final Holder<Potion> SUPREME_SLOWNESS_POTION = POTIONS.register("supreme_slowness_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 960, 5)));
    public static final Holder<Potion> EVERLASTING_SLOWNESS_POTION = POTIONS.register("everlasting_slowness_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 12000, 1)));

    public static final Holder<Potion> FULL_POISON_POTION = POTIONS.register("full_poison_potion", () -> new Potion(new MobEffectInstance(MobEffects.POISON, 700, 1)));
    public static final Holder<Potion> POTENT_POISON_POTION = POTIONS.register("potent_poison_potion", () -> new Potion(new MobEffectInstance(MobEffects.POISON, 700, 2)));
    public static final Holder<Potion> SUPREME_POISON_POTION = POTIONS.register("supreme_poison_potion", () -> new Potion(new MobEffectInstance(MobEffects.POISON, 700, 5)));
    public static final Holder<Potion> EVERLASTING_POISON_POTION = POTIONS.register("everlasting_poison_potion", () -> new Potion(new MobEffectInstance(MobEffects.POISON, 9600, 1)));

    public static final Holder<Potion> POTENT_HARMING_POTION = POTIONS.register("potent_harming_potion", () -> new Potion(new MobEffectInstance(MobEffects.HARM, 2, 3)));

    public static final Holder<Potion> EVERLASTING_WEAKNESS_POTION = POTIONS.register("everlasting_weakness_potion", () -> new Potion(new MobEffectInstance(MobEffects.WEAKNESS, 18000, 0)));

    //Same as resistance; no mining potion
    public static final Holder<Potion> MINING_POTION = POTIONS.register("mining_potion", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 6000, 0)));
    public static final Holder<Potion> LONG_MINING_POTION = POTIONS.register("long_mining_potion", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 12000, 0)));
    public static final Holder<Potion> STRONG_MINING_POTION = POTIONS.register("strong_mining_potion", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 1)));
    public static final Holder<Potion> FULL_MINING_POTION = POTIONS.register("full_mining_potion", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 12000, 1)));
    public static final Holder<Potion> POTENT_MINING_POTION = POTIONS.register("potent_mining_potion", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 12000, 2)));
    public static final Holder<Potion> SUPREME_MINING_POTION = POTIONS.register("supreme_mining_potion", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 12000, 3)));
    public static final Holder<Potion> EVERLASTING_MINING_POTION = POTIONS.register("everlasting_mining_potion", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 72000, 1)));

    public static final Holder<Potion> EVERLASTING_NIGHT_VISION_POTION = POTIONS.register("everlasting_night_vision_potion", () -> new Potion(new MobEffectInstance(MobEffects.NIGHT_VISION, 36000, 0)));

    public static final Holder<Potion> EVERLASTING_INVISIBILITY_POTION = POTIONS.register("everlasting_invisibility_potion", () -> new Potion(new MobEffectInstance(MobEffects.INVISIBILITY, 36000, 0)));

    public static final Holder<Potion> EVERLASTING_SLOW_FALLING_POTION = POTIONS.register("everlasting_slow_falling_potion", () -> new Potion(new MobEffectInstance(MobEffects.SLOW_FALLING, 18000, 0)));

    public static final Holder<Potion> EVERLASTING_WATER_BREATHING_POTION = POTIONS.register("everlasting_water_breathing_potion", () -> new Potion(new MobEffectInstance(MobEffects.WATER_BREATHING, 36000, 0)));

    public static final Holder<Potion> POTENT_HEALING_POTION = POTIONS.register("potent_healing_potion", () -> new Potion(new MobEffectInstance(MobEffects.HEAL, 1, 3)));
    public static final Holder<Potion> POTENT_REJUVENATION_POTION = POTIONS.register("potent_rejuvenation_potion", () -> new Potion(new MobEffectInstance(MobEffects.HEAL, 1, 3), new MobEffectInstance(MobEffects.REGENERATION, 1200, 2)));
    public static final Holder<Potion> SUPREME_REJUVENATION_POTION = POTIONS.register("supreme_rejuvenation_potion", () -> new Potion(new MobEffectInstance(MobEffects.HEAL, 1, 3), new MobEffectInstance(MobEffects.REGENERATION, 1500, 3)));

    public static final Holder<Potion> WITHERING_POTION = POTIONS.register("withering_potion", () -> new Potion(new MobEffectInstance(MobEffects.WITHER, 500, 0)));
    public static final Holder<Potion> POTENT_WITHERING_POTION = POTIONS.register("potent_withering_potion", () -> new Potion(new MobEffectInstance(MobEffects.WITHER, 500, 1)));
    public static final Holder<Potion> SUPREME_WITHERING_POTION = POTIONS.register("supreme_withering_potion", () -> new Potion(new MobEffectInstance(MobEffects.WITHER, 500, 5)));

    //Combinations of strength and resistance for combat
    public static final Holder<Potion> COMBAT_POTION = POTIONS.register("combat_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 1), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 1)));
    public static final Holder<Potion> POTENT_COMBAT_POTION = POTIONS.register("potent_combat_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 2), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 2)));
    public static final Holder<Potion> SUPREME_COMBAT_POTION = POTIONS.register("supreme_combat_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 3), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 3)));
    public static final Holder<Potion> EVERLASTING_COMBAT_POTION = POTIONS.register("everlasting_combat_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 36000, 1), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 36000, 1)));

    public static final Holder<Potion> FULL_TURTLE_MASTER_POTION = POTIONS.register("full_turtle_master_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 500, 5), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 500, 3)));
    public static final Holder<Potion> POTENT_TURTLE_MASTER_POTION = POTIONS.register("potent_turtle_master_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 500, 5), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 500, 4)));
    public static final Holder<Potion> SUPREME_TURTLE_MASTER_POTION = POTIONS.register("supreme_turtle_master_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 500, 5), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 500, 5)));


    public static void register(IEventBus eventBus){
        POTIONS.register(eventBus);
    }
}
