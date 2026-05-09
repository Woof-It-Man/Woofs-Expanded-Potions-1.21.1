package net.woof.woofexpandedpotions.network;

import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.woof.woofexpandedpotions.WoofExpandedPotions;

import java.util.ArrayList;
import java.util.List;

public record SpelunkingPayload(List<BlockPos> positions) implements CustomPacketPayload {

    public static final CustomPacketPayload.Type<SpelunkingPayload> TYPE =
            new CustomPacketPayload.Type<>(
                    ResourceLocation.fromNamespaceAndPath(WoofExpandedPotions.MODID, "spelunking_ores"));

    public static final StreamCodec<FriendlyByteBuf, SpelunkingPayload> STREAM_CODEC =
            StreamCodec.of(SpelunkingPayload::encode, SpelunkingPayload::decode);

    private static void encode(FriendlyByteBuf buf, SpelunkingPayload payload) {
        buf.writeInt(payload.positions.size());
        for (BlockPos pos : payload.positions) {
            buf.writeBlockPos(pos);
        }
    }

    private static SpelunkingPayload decode(FriendlyByteBuf buf) {
        int size = buf.readInt();
        List<BlockPos> positions = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            positions.add(buf.readBlockPos());
        }
        return new SpelunkingPayload(positions);
    }

    @Override
    public CustomPacketPayload.Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}