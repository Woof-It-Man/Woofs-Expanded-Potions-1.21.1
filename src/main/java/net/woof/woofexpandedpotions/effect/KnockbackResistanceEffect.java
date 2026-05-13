package net.woof.woofexpandedpotions.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.resources.ResourceLocation;
import net.woof.woofexpandedpotions.WoofExpandedPotions;

public class KnockbackResistanceEffect extends MobEffect {

    public KnockbackResistanceEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xC8A882);

        // 10% knockback resistance per amplifier level
        // AttributeModifier value of 0.1 = 10% since knockback resistance is on a 0.0-1.0 scale
        this.addAttributeModifier(
                Attributes.KNOCKBACK_RESISTANCE,
                ResourceLocation.fromNamespaceAndPath(WoofExpandedPotions.MODID, "stability_knockback_resistance"),
                0.1,
                AttributeModifier.Operation.ADD_VALUE
        );
    }
}