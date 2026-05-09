package net.woof.woofexpandedpotions.network;

import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.woof.woofexpandedpotions.effect.ModEffects;

import java.util.Collections;
import java.util.List;

public class ClientPayloadHandler {

    // Volatile so the renderer thread always sees the latest value
    public static volatile List<BlockPos> orePositions = Collections.emptyList();

    public static void handleSpelunkingPayload(SpelunkingPayload payload, IPayloadContext context) {
        context.enqueueWork(() -> {
            Player player = Minecraft.getInstance().player;
            if (player != null && player.hasEffect(ModEffects.SPELUNKING)) {
                orePositions = payload.positions();
            } else {
                // Clear the list if the effect has worn off
                orePositions = Collections.emptyList();
            }
        });
    }
}