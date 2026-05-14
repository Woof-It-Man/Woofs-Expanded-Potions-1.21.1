package net.woof.woofexpandedpotions.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.woof.woofexpandedpotions.WoofExpandedPotions;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;

@EventBusSubscriber(modid = WoofExpandedPotions.MODID)
public class VengeanceEffect extends MobEffect {

    public VengeanceEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xFF4444);
    }

    @Override
    public void onEffectAdded(LivingEntity entity, int amplifier) {
        if (amplifier >= 10 && entity instanceof net.minecraft.server.level.ServerPlayer player) {
            player.getServer().getPlayerList().broadcastSystemMessage(
                    Component.translatable("chat.type.text", player.getDisplayName(), Component.literal("TASTE VENGEANCE!")),
                    false
            );
        }
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
        // Have been considering making the damage higher so the potion will likely have shorter
        // duration. This is because it's a bit inspired by Runescape's Vengeance.
        // May just made a new supreme potion for it, though. But I'll need to think about it.
        float damage = 2.0f * (amplifier + 1);

        // Damage type, don't think there's any reason not to use thorns just yet. We'll see.
        attacker.hurt(victim.damageSources().thorns(victim), damage);
    }
}