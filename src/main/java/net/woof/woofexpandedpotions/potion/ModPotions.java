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
    public static final Holder<Potion> POTENT_STRENGTH_POTION = POTIONS.register("potent_strength_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1800, 2)));
    public static final Holder<Potion> EXTREME_STRENGTH_POTION = POTIONS.register("extreme_strength_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 5200, 2)));
    public static final Holder<Potion> EVERLASTING_STRENGTH_POTION = POTIONS.register("everlasting_strength_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 36000, 0)));

    public static final Holder<Potion> FULL_REGENERATION_POTION = POTIONS.register("full_regeneration_potion", () -> new Potion(new MobEffectInstance(MobEffects.REGENERATION, 800, 1)));
    public static final Holder<Potion> POTENT_REGENERATION_POTION = POTIONS.register("potent_regeneration_potion", () -> new Potion(new MobEffectInstance(MobEffects.REGENERATION, 1200, 2)));
    public static final Holder<Potion> EXTREME_REGENERATION_POTION = POTIONS.register("extreme_regeneration_potion", () -> new Potion(new MobEffectInstance(MobEffects.REGENERATION, 1800, 2)));
    public static final Holder<Potion> EVERLASTING_REGENERATION_POTION = POTIONS.register("everlasting_regeneration_potion", () -> new Potion(new MobEffectInstance(MobEffects.REGENERATION, 6400, 0)));

    //Vanilla doesn't have resistance potions on their own, just the turtle master, so here it is!
    public static final Holder<Potion> RESISTANCE_POTION = POTIONS.register("resistance_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 0)));
    public static final Holder<Potion> LONG_RESISTANCE_POTION = POTIONS.register("long_resistance_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 9600, 0)));
    public static final Holder<Potion> STRONG_RESISTANCE_POTION = POTIONS.register("strong_resistance_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1800, 1)));
    public static final Holder<Potion> FULL_RESISTANCE_POTION = POTIONS.register("full_resistance_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 1)));
    public static final Holder<Potion> POTENT_RESISTANCE_POTION = POTIONS.register("potent_resistance_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1800, 2)));
    public static final Holder<Potion> EXTREME_RESISTANCE_POTION = POTIONS.register("extreme_resistance_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 5200, 2)));
    public static final Holder<Potion> EVERLASTING_RESISTANCE_POTION = POTIONS.register("everlasting_resistance_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 36000, 0)));

    public static final Holder<Potion> FULL_SWIFTNESS_POTION = POTIONS.register("full_swiftness_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 1)));
    public static final Holder<Potion> POTENT_SWIFTNESS_POTION = POTIONS.register("potent_swiftness_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1800, 3)));
    public static final Holder<Potion> EXTREME_SWIFTNESS_POTION = POTIONS.register("extreme_swiftness_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 5200, 3)));
    public static final Holder<Potion> EVERLASTING_SWIFTNESS_POTION = POTIONS.register("everlasting_swiftness_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 36000, 0)));

    public static final Holder<Potion> FULL_LEAPING_POTION = POTIONS.register("full_leaping_potion", () -> new Potion(new MobEffectInstance(MobEffects.JUMP, 3600, 1)));
    public static final Holder<Potion> POTENT_LEAPING_POTION = POTIONS.register("potent_leaping_potion", () -> new Potion(new MobEffectInstance(MobEffects.JUMP, 1800, 2)));
    public static final Holder<Potion> EXTREME_LEAPING_POTION = POTIONS.register("extreme_leaping_potion", () -> new Potion(new MobEffectInstance(MobEffects.JUMP, 5200, 2)));
    public static final Holder<Potion> EVERLASTING_LEAPING_POTION = POTIONS.register("everlasting_leaping_potion", () -> new Potion(new MobEffectInstance(MobEffects.JUMP, 36000, 0)));

    public static final Holder<Potion> FULL_SLOWNESS_POTION = POTIONS.register("full_slowness_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 960, 1)));
    public static final Holder<Potion> POTENT_SLOWNESS_POTION = POTIONS.register("potent_slowness_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 480, 2)));
    public static final Holder<Potion> EXTREME_SLOWNESS_POTION = POTIONS.register("extreme_slowness_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1560, 2)));
    public static final Holder<Potion> EVERLASTING_SLOWNESS_POTION = POTIONS.register("everlasting_slowness_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 12000, 0)));

    public static final Holder<Potion> FULL_POISON_POTION = POTIONS.register("full_poison_potion", () -> new Potion(new MobEffectInstance(MobEffects.POISON, 700, 1)));
    public static final Holder<Potion> POTENT_POISON_POTION = POTIONS.register("potent_poison_potion", () -> new Potion(new MobEffectInstance(MobEffects.POISON, 360, 2)));
    public static final Holder<Potion> EXTREME_POISON_POTION = POTIONS.register("extreme_poison_potion", () -> new Potion(new MobEffectInstance(MobEffects.POISON, 1060, 2)));
    public static final Holder<Potion> EVERLASTING_POISON_POTION = POTIONS.register("everlasting_poison_potion", () -> new Potion(new MobEffectInstance(MobEffects.POISON, 9600, 0)));

    //Same as resistance; no mining potion
    public static final Holder<Potion> MINING_POTION = POTIONS.register("mining_potion", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0)));
    public static final Holder<Potion> LONG_MINING_POTION = POTIONS.register("long_mining_potion", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 9600, 0)));
    public static final Holder<Potion> STRONG_MINING_POTION = POTIONS.register("strong_mining_potion", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 1800, 1)));
    public static final Holder<Potion> FULL_MINING_POTION = POTIONS.register("full_mining_potion", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 1)));
    public static final Holder<Potion> POTENT_MINING_POTION = POTIONS.register("potent_mining_potion", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 2400, 2)));
    public static final Holder<Potion> EXTREME_MINING_POTION = POTIONS.register("extreme_mining_potion", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 6400, 2)));
    public static final Holder<Potion> EVERLASTING_MINING_POTION = POTIONS.register("everlasting_mining_potion", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 72000, 0)));

    public static final Holder<Potion> LONGLASTING_NIGHT_VISION_POTION = POTIONS.register("longlasting_night_vision_potion", () -> new Potion(new MobEffectInstance(MobEffects.NIGHT_VISION, 36000, 0)));
    public static final Holder<Potion> PERMANENT_NIGHT_VISION_POTION = POTIONS.register("permanent_night_vision_potion", () -> new Potion(new MobEffectInstance(MobEffects.NIGHT_VISION, 180000, 0)));

    public static final Holder<Potion> LONGLASTINGG_INVISIBILITY_POTION = POTIONS.register("longlasting_invisibility_potion", () -> new Potion(new MobEffectInstance(MobEffects.INVISIBILITY, 36000, 0)));
    public static final Holder<Potion> PERMANENT_INVISIBILITY_POTION = POTIONS.register("permanent_invisibility_potion", () -> new Potion(new MobEffectInstance(MobEffects.INVISIBILITY, 180000, 0)));

    public static final Holder<Potion> LONGLASTING_SLOW_FALLING_POTION = POTIONS.register("longlasting_slow_falling_potion", () -> new Potion(new MobEffectInstance(MobEffects.SLOW_FALLING, 18000, 0)));
    public static final Holder<Potion> PERMANENT_SLOW_FALLING_POTION = POTIONS.register("permanent_slow_falling_potion", () -> new Potion(new MobEffectInstance(MobEffects.SLOW_FALLING, 90000, 0)));

    public static final Holder<Potion> LONGLASTING_WATER_BREATHING_POTION = POTIONS.register("longlasting_water_breathing_potion", () -> new Potion(new MobEffectInstance(MobEffects.WATER_BREATHING, 36000, 0)));
    public static final Holder<Potion> PERMANENT_WATER_BREATHING_POTION = POTIONS.register("permanent_water_breathing_potion", () -> new Potion(new MobEffectInstance(MobEffects.WATER_BREATHING, 180000, 0)));

    public static final Holder<Potion> POTENT_HEALING_POTION = POTIONS.register("potent_healing_potion", () -> new Potion(new MobEffectInstance(MobEffects.HEAL, 1, 2), new MobEffectInstance(MobEffects.REGENERATION, 300, 0)));
    public static final Holder<Potion> EXTREME_HEALING_POTION = POTIONS.register("extreme_healing_potion", () -> new Potion(new MobEffectInstance(MobEffects.HEAL, 1, 3), new MobEffectInstance(MobEffects.REGENERATION, 600, 1)));

    public static final Holder<Potion> LONGLASTING_FIRE_RESISTANCE_POTION = POTIONS.register("longlasting_fire_resistance_potion", () -> new Potion(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 36000, 0)));
    public static final Holder<Potion> PERMANENT_FIRE_RESISTANCE_POTION = POTIONS.register("permanent_fire_resistance_potion", () -> new Potion(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 180000, 0)));

    public static final Holder<Potion> POTENT_HARMING_POTION = POTIONS.register("potent_harming_potion", () -> new Potion(new MobEffectInstance(MobEffects.HARM, 1, 3)));
    public static final Holder<Potion> EXTREME_HARMING_POTION = POTIONS.register("extreme_harming_potion", () -> new Potion(new MobEffectInstance(MobEffects.HARM, 1, 5)));

    public static final Holder<Potion> LONGLASTING_WEAKNESS_POTION = POTIONS.register("longlasting_weakness_potion", () -> new Potion(new MobEffectInstance(MobEffects.WEAKNESS, 18000, 0)));
    public static final Holder<Potion> PERMANENT_WEAKNESS_POTION = POTIONS.register("permanent_weakness_potion", () -> new Potion(new MobEffectInstance(MobEffects.WEAKNESS, 90000, 0)));

    public static final Holder<Potion> WITHERING_POTION = POTIONS.register("withering_potion", () -> new Potion(new MobEffectInstance(MobEffects.WITHER, 500, 0)));
    public static final Holder<Potion> POTENT_WITHERING_POTION = POTIONS.register("potent_withering_potion", () -> new Potion(new MobEffectInstance(MobEffects.WITHER, 800, 1)));
    public static final Holder<Potion> EXTREME_WITHERING_POTION = POTIONS.register("extreme_withering_potion", () -> new Potion(new MobEffectInstance(MobEffects.WITHER, 800, 5)));

    public static final Holder<Potion> DOLPHIN_GRACE_POTION = POTIONS.register("dolphin_grace_potion", () -> new Potion(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 9600)));
    public static final Holder<Potion> LONGLASTING_DOLPHIN_GRACE_POTION = POTIONS.register("longlasting_dolphin_grace_potion", () -> new Potion(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 36000)));
    public static final Holder<Potion> PERMANENT_DOLPHIN_GRACE_POTION = POTIONS.register("permanent_dolphin_grace_potion", () -> new Potion(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 180000)));

    //2 Combo Potions
    public static final Holder<Potion> COMBAT_POTION = POTIONS.register("combat_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2100, 1), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2100, 1)));
    public static final Holder<Potion> EXTREME_COMBAT_POTION = POTIONS.register("extreme_combat_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 2), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 2)));
    public static final Holder<Potion> EVERLASTING_COMBAT_POTION = POTIONS.register("everlasting_combat_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40000, 0), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40000, 0)));

    public static final Holder<Potion> SWIFT_GUARD_POTION = POTIONS.register("swift_guard_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2100, 1), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2100, 1)));
    public static final Holder<Potion> EXTREME_SWIFT_GUARD_POTION = POTIONS.register("extreme_swift_guard_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000, 2), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 2)));
    public static final Holder<Potion> EVERLASTING_SWIFT_GUARD_POTION = POTIONS.register("everlasting_swift_guard_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40000, 0), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40000, 0)));

    public static final Holder<Potion> BLITZ_POTION = POTIONS.register("blitz_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2100, 1), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2100, 1)));
    public static final Holder<Potion> EXTREME_BLITZ_POTION = POTIONS.register("extreme_blitz_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 2), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000, 2)));
    public static final Holder<Potion> EVERLASTING_BLITZ_POTION = POTIONS.register("everlasting_blitz_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40000, 0), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40000, 0)));

    public static final Holder<Potion> NEPTUNES_DELIGHT_POTION = POTIONS.register("neptunes_delight_potion", () -> new Potion(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 43200), new MobEffectInstance(MobEffects.CONDUIT_POWER, 43200)));
    public static final Holder<Potion> EXTREME_NEPTUNES_DELIGHT_POTION = POTIONS.register("extreme_neptunes_delight_potion", () -> new Potion(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 216000), new MobEffectInstance(MobEffects.CONDUIT_POWER, 216000)));

    public static final Holder<Potion> FULL_TURTLE_MASTER_POTION = POTIONS.register("full_turtle_master_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 500, 5), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 500, 3)));
    public static final Holder<Potion> POTENT_TURTLE_MASTER_POTION = POTIONS.register("potent_turtle_master_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 500, 5), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 500, 4)));
    public static final Holder<Potion> EXTREME_TURTLE_MASTER_POTION = POTIONS.register("extreme_turtle_master_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 500, 5), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 500, 5)));

    public static final Holder<Potion> ACROBAT_POTION = POTIONS.register("acrobat_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 4000, 1), new MobEffectInstance(MobEffects.JUMP, 4000, 1)));
    public static final Holder<Potion> EXTREME_ACROBAT_POTION = POTIONS.register("extreme_acrobat_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000, 2), new MobEffectInstance(MobEffects.JUMP, 6000, 2)));
    public static final Holder<Potion> EVERLASTING_ACROBAT_POTION = POTIONS.register("everlasting_acrobat_potion", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40000, 0), new MobEffectInstance(MobEffects.JUMP, 40000, 0)));

    public static final Holder<Potion> DECAY_POTION = POTIONS.register("decay_potion", () -> new Potion(new MobEffectInstance(MobEffects.POISON, 4000, 1), new MobEffectInstance(MobEffects.WITHER, 4000, 1)));
    public static final Holder<Potion> POTENT_DECAY_POTION = POTIONS.register("potent_decay_potion", () -> new Potion(new MobEffectInstance(MobEffects.POISON, 2400, 2), new MobEffectInstance(MobEffects.WITHER, 2400, 2)));
    public static final Holder<Potion> EXTREME_DECAY_POTION = POTIONS.register("extreme_decay_potion", () -> new Potion(new MobEffectInstance(MobEffects.POISON, 6000, 2), new MobEffectInstance(MobEffects.WITHER, 6000, 2)));
    public static final Holder<Potion> EVERLASTING_DECAY_POTION = POTIONS.register("everlasting_decay_potion", () -> new Potion(new MobEffectInstance(MobEffects.POISON, 40000, 0), new MobEffectInstance(MobEffects.WITHER, 40000, 0)));

    public static final Holder<Potion> BUFFER_POTION = POTIONS.register("buffer_potion", () -> new Potion(new MobEffectInstance(MobEffects.REGENERATION, 900, 1), new MobEffectInstance(MobEffects.ABSORPTION, 4000, 2)));
    public static final Holder<Potion> EXTREME_BUFFER_POTION = POTIONS.register("extreme_buffer_potion", () -> new Potion(new MobEffectInstance(MobEffects.REGENERATION, 1800, 2), new MobEffectInstance(MobEffects.ABSORPTION, 6000, 6)));
    public static final Holder<Potion> EVERLASTING_BUFFER_POTION = POTIONS.register("everlasting_buffer_potion", () -> new Potion(new MobEffectInstance(MobEffects.REGENERATION, 7200, 0), new MobEffectInstance(MobEffects.ABSORPTION, 40000, 1)));

    //Big 3 combos
    public static final Holder<Potion> GLADIATOR_POTION = POTIONS.register("gladiator_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 1), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 1), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 1)));
    public static final Holder<Potion> EXTREME_GLADIATOR_POTION = POTIONS.register("extreme_gladiator_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 7200, 2), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 7200, 2), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 7200, 2)));
    public static final Holder<Potion> EVERLASTING_GLADIATOR_POTION = POTIONS.register("everlasting_gladiator_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 43200, 0), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 43200, 0), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 43200, 0)));

    public static final Holder<Potion> JUGGERNAUT_POTION = POTIONS.register("juggernaut_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 1), new MobEffectInstance(MobEffects.ABSORPTION, 4000, 2), new MobEffectInstance(MobEffects.REGENERATION, 1000, 1)));
    public static final Holder<Potion> EXTREME_JUGGERNAUT_POTION = POTIONS.register("extreme_juggernaut_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 7200, 2), new MobEffectInstance(MobEffects.ABSORPTION, 7200, 6), new MobEffectInstance(MobEffects.REGENERATION, 2400, 2)));
    public static final Holder<Potion> EVERLASTING_JUGGERNAUT_POTION = POTIONS.register("everlasting_juggernaut_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 43200, 0), new MobEffectInstance(MobEffects.ABSORPTION, 43200, 1), new MobEffectInstance(MobEffects.REGENERATION, 9600, 0)));

    public static final Holder<Potion> BERSERKER_POTION = POTIONS.register("berserker_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 1), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 1), new MobEffectInstance(MobEffects.REGENERATION, 1200, 1)));
    public static final Holder<Potion> EXTREME_BERSERKER_POTION = POTIONS.register("extreme_berserker_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 7200, 2), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 7200, 2), new MobEffectInstance(MobEffects.REGENERATION, 7200, 2)));
    public static final Holder<Potion> EVERLASTING_BERSERKER_POTION = POTIONS.register("everlasting_berserker_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 43200, 0), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 43200, 0), new MobEffectInstance(MobEffects.REGENERATION, 43200, 0)));

    public static final Holder<Potion> PHANTOM_POTION = POTIONS.register("phantom_potion", () -> new Potion(new MobEffectInstance(MobEffects.INVISIBILITY, 1200, 0), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 1), new MobEffectInstance(MobEffects.WEAKNESS, 1200, 0)));
    public static final Holder<Potion> EXTREME_PHANTOM_POTION = POTIONS.register("extreme_phantom_potion", () -> new Potion(new MobEffectInstance(MobEffects.INVISIBILITY, 7200, 0), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 7200, 2), new MobEffectInstance(MobEffects.WEAKNESS, 7200, 1)));
    public static final Holder<Potion> EVERLASTING_PHANTOM_POTION = POTIONS.register("everlasting_phantom_potion", () -> new Potion(new MobEffectInstance(MobEffects.INVISIBILITY, 43200, 0), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 43200, 0), new MobEffectInstance(MobEffects.WEAKNESS, 43200, 0)));

    public static void register(IEventBus eventBus){
        POTIONS.register(eventBus);
    }
}
