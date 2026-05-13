package net.woof.woofexpandedpotions.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties FILLING_MEAL = new FoodProperties.Builder().nutrition(20).saturationModifier(1f).effect(()-> new MobEffectInstance(MobEffects.SATURATION, 200, 0), 1f).build();

    public static final FoodProperties DIAMOND_CARROT = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(1f)
            .effect(() -> new MobEffectInstance(MobEffects.SATURATION, 300, 0), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 80, 1), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 400, 0), 1f)
            .build();

    public static final FoodProperties ENCRUSTED_CARROT = new FoodProperties.Builder()
            .nutrition(15)
            .saturationModifier(1f)
            .effect(() -> new MobEffectInstance(MobEffects.SATURATION, 600, 0), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 160, 2), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.WITHER, 240, 0), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1800, 1), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 3), 1f)
            .build();

}
