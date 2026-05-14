package net.woof.woofexpandedpotions.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.woof.woofexpandedpotions.WoofExpandedPotions;

@EventBusSubscriber(modid = WoofExpandedPotions.MODID)
public class VengeanceEffect extends MobEffect {

    public VengeanceEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xFF4444);
    }

    @SubscribeEvent
    public static void onIncomingDamage(LivingIncomingDamageEvent event) {
        LivingEntity victim = event.getEntity();

        // Check if the victim has the Vengeance effect
        if (!victim.hasEffect(ModEffects.VENGEANCE)) return;

        if (!(event.getSource().getEntity() instanceof LivingEntity attacker)) return;

        // Stop hitting yourself
        if (attacker == victim) return;

        var vengeanceEffect = victim.getEffect(ModEffects.VENGEANCE);
        if (vengeanceEffect == null) return;
        int amplifier = vengeanceEffect.getAmplifier();

        // 1 heart (2 damage) per level: amplifier 0 = 2, amplifier 1 = 4, amplifier 2 = 6
        float damage = 2.0f * (amplifier + 1);

        // Damage type, don't think there's any reason not to use thorns just yet. We'll see.
        attacker.hurt(victim.damageSources().thorns(victim), damage);
    }
}