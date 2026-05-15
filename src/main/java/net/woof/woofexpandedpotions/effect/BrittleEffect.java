package net.woof.woofexpandedpotions.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.woof.woofexpandedpotions.WoofExpandedPotions;

@EventBusSubscriber(modid = WoofExpandedPotions.MODID)
public class BrittleEffect extends MobEffect {

    public BrittleEffect() {
        super(MobEffectCategory.HARMFUL, 0xADD8E6);
    }

    @SubscribeEvent
    public static void onIncomingDamage(LivingIncomingDamageEvent event) {
        LivingEntity target = event.getEntity();

        if (!target.hasEffect(ModEffects.BRITTLE)) return;

        var brittleEffect = target.getEffect(ModEffects.BRITTLE);
        if (brittleEffect == null) return;

        int amplifier = brittleEffect.getAmplifier();

        // 10% more damage per level: level I = 1.1x, level II = 1.2x, level III = 1.3x
        float multiplier = 1.0f + (amplifier + 1) * 0.1f;
        event.setAmount(event.getAmount() * multiplier);
    }
}