package net.woof.woofexpandedpotions.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.RenderStateShard;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RenderLevelStageEvent;
import net.woof.woofexpandedpotions.WoofExpandedPotions;
import net.woof.woofexpandedpotions.effect.ModEffects;
import net.woof.woofexpandedpotions.network.ClientPayloadHandler;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.VertexFormat;

import java.util.List;
import java.util.OptionalDouble;

@EventBusSubscriber(modid = WoofExpandedPotions.MODID, value = Dist.CLIENT)
public class SpelunkingRenderer {

    private static final RenderType LINES_NO_DEPTH = RenderType.create(
            "spelunking_lines",
            DefaultVertexFormat.POSITION_COLOR_NORMAL,
            VertexFormat.Mode.LINES,
            256,
            false,
            false,
            RenderType.CompositeState.builder()
                    .setShaderState(RenderStateShard.RENDERTYPE_LINES_SHADER)
                    .setLineState(new RenderStateShard.LineStateShard(OptionalDouble.of(2.0)))
                    .setLayeringState(RenderStateShard.VIEW_OFFSET_Z_LAYERING)
                    .setTransparencyState(RenderStateShard.TRANSLUCENT_TRANSPARENCY)
                    .setOutputState(RenderStateShard.ITEM_ENTITY_TARGET)
                    .setWriteMaskState(RenderStateShard.COLOR_DEPTH_WRITE)
                    .setCullState(RenderStateShard.NO_CULL)
                    .setDepthTestState(RenderStateShard.NO_DEPTH_TEST)
                    .createCompositeState(false)
    );

    @SubscribeEvent
    public static void onRenderLevelStage(RenderLevelStageEvent event) {
        if (event.getStage() != RenderLevelStageEvent.Stage.AFTER_TRANSLUCENT_BLOCKS) return;

        Minecraft mc = Minecraft.getInstance();
        Player player = mc.player;
        if (player == null || !player.hasEffect(ModEffects.SPELUNKING)) return;

        List<BlockPos> positions = ClientPayloadHandler.orePositions;
        if (positions.isEmpty()) return;

        PoseStack poseStack = event.getPoseStack();
        var bufferSource = mc.renderBuffers().bufferSource();
        VertexConsumer buffer = bufferSource.getBuffer(LINES_NO_DEPTH);

        double camX = mc.getEntityRenderDispatcher().camera.getPosition().x;
        double camY = mc.getEntityRenderDispatcher().camera.getPosition().y;
        double camZ = mc.getEntityRenderDispatcher().camera.getPosition().z;

        poseStack.pushPose();
        poseStack.translate(-camX, -camY, -camZ);

        for (BlockPos pos : positions) {
            LevelRenderer.renderLineBox(poseStack, buffer,
                    pos.getX() - 0.002, pos.getY() - 0.002, pos.getZ() - 0.002,
                    pos.getX() + 1.002, pos.getY() + 1.002, pos.getZ() + 1.002,
                    0.4f, 0.4f, 0.4f, 0.3f);
        }

        poseStack.popPose();
        bufferSource.endBatch(LINES_NO_DEPTH);
    }
}