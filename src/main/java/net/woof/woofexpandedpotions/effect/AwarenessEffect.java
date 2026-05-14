package net.woof.woofexpandedpotions.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class AwarenessEffect extends MobEffect {

    public AwarenessEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xFFD700);
    }

    @Override
    public boolean applyEffectTick(LivingEntity entity, int amplifier) {
        // Only run server-side, once per second
        if (!entity.level().isClientSide() && entity.tickCount % 20 == 0) {
            int radius = (amplifier + 1) * 10;
            AABB searchBox = entity.getBoundingBox().inflate(radius);

            // Find all living entities nearby
            List<LivingEntity> nearby = entity.level().getEntitiesOfClass(
                    LivingEntity.class, searchBox,
                    e -> e != entity
            );

            for (LivingEntity target : nearby) {
                target.addEffect(new MobEffectInstance(MobEffects.GLOWING, 60, 0, false, false));
            }
        }
        return true;
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }
}