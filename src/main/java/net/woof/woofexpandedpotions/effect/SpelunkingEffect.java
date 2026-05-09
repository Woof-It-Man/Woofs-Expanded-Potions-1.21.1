package net.woof.woofexpandedpotions.effect;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.level.block.Block;import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.neoforge.network.PacketDistributor;
import net.woof.woofexpandedpotions.network.SpelunkingPayload;

import java.util.ArrayList;
import java.util.List;

public class SpelunkingEffect extends MobEffect {

    // minecraft:ores covers vanilla ores, c:ores covers modded ores by NeoForge convention
    private static final TagKey<Block> VANILLA_ORES = TagKey.create(
            Registries.BLOCK, ResourceLocation.withDefaultNamespace("ores"));
    private static final TagKey<Block> MODDED_ORES = TagKey.create(
            Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "ores"));

    public SpelunkingEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyEffectTick(LivingEntity entity, int amplifier) {
        // Only run server-side, once per second
        if (!entity.level().isClientSide() && entity.tickCount % 20 == 0) {
            if (entity instanceof ServerPlayer player) {
                // Radius scales with amplifier. Atm it's 15 per level
                int radius = (amplifier + 1) * 15;
                List<BlockPos> orePositions = new ArrayList<>();
                BlockPos center = player.blockPosition();

                for (int x = -radius; x <= radius; x++) {
                    for (int y = -radius; y <= radius; y++) {
                        for (int z = -radius; z <= radius; z++) {
                            // Sphere check so it's a proper radius, not a cube
                            if (x * x + y * y + z * z > radius * radius) continue;
                            BlockPos pos = center.offset(x, y, z);
                            // check for ores, hopefully will detect modded ores if they are added properly
                            if (entity.level().getBlockState(pos).is(VANILLA_ORES)
                                    || entity.level().getBlockState(pos).is(MODDED_ORES)) {
                                orePositions.add(pos);
                            }
                        }
                    }
                }

                PacketDistributor.sendToPlayer(player, new SpelunkingPayload(orePositions));
            }
        }
        return true;
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }
}