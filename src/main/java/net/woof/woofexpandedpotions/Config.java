package net.woof.woofexpandedpotions;

import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.IntValue SPELUNKING_MAX_ORES = BUILDER
            .comment("Maximum number of ore outlines rendered at once when the Spelunking effect is active.",
                    "Ores are sorted by distance so the closest ones are always shown.",
                    "Lower values improve FPS. Default is 1000.")
            .defineInRange("spelunkingMaxOres", 1000, 1, Integer.MAX_VALUE);

    static final ModConfigSpec SPEC = BUILDER.build();
}