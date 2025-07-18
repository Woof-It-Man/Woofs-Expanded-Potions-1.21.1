package net.woof.woofexpandedpotions.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

import java.util.function.Supplier;

public class ModFoods {
    public static final FoodProperties FILLING_MEAL = new FoodProperties.Builder().nutrition(20).saturationModifier(1f).effect(()-> new MobEffectInstance(MobEffects.SATURATION, 200, 0), 1f).build();
}
