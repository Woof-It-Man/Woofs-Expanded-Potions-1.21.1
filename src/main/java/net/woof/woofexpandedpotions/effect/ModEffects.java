package net.woof.woofexpandedpotions.effect;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.woof.woofexpandedpotions.WoofExpandedPotions;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, WoofExpandedPotions.MODID);

    public static final Holder<MobEffect> SPELUNKING = MOB_EFFECTS.register("spelunking", () -> new SpelunkingEffect(MobEffectCategory.BENEFICIAL, 0x00BFFF));

    public static final Holder<MobEffect> STABILITY = MOB_EFFECTS.register("stability", KnockbackResistanceEffect::new);

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}