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

    //Full potions
    public static final Holder<Potion> FULL_STRENGTH_POTION = POTIONS.register("full_strength_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 1)));
    public static final Holder<Potion> POTENT_STRENGTH_POTION = POTIONS.register("potent_strength_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 2)));
    public static final Holder<Potion> SUPREME_STRENGTH_POTION = POTIONS.register("supreme_strength_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 3)));
    public static final Holder<Potion> EVERLASTING_STRENGTH_POTION = POTIONS.register("everlasting_strength_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 36000, 1)));

    public static void register(IEventBus eventBus){
        POTIONS.register(eventBus);
    }
}
