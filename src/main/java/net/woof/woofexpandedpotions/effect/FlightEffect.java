package net.woof.woofexpandedpotions.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.NeoForgeMod;
import net.woof.woofexpandedpotions.WoofExpandedPotions;

public class FlightEffect extends MobEffect {

    public FlightEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xADD8E6);

        this.addAttributeModifier(
                NeoForgeMod.CREATIVE_FLIGHT,
                ResourceLocation.fromNamespaceAndPath(WoofExpandedPotions.MODID, "flight_effect"),
                1.0,
                AttributeModifier.Operation.ADD_VALUE
        );
    }

    @Override
    public boolean applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity instanceof Player player) {
            player.getAbilities().setFlyingSpeed(0.013f * (amplifier + 1));
            player.onUpdateAbilities();
        }
        return true;
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }
}