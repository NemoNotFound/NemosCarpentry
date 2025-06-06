package com.nemonotfound.nemos.carpentry.datagen;

import net.minecraft.client.data.Model;
import net.minecraft.client.data.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

import static com.nemonotfound.nemos.carpentry.NemosCarpentry.MOD_ID;

public class ModModels {

    public static final Model PARK_BENCH = item("seats/park_bench_full", TextureKey.LAYER0);
    public static final Model PARK_BENCH_LEFT = block("seats/park_bench_left", TextureKey.ALL, TextureKey.PARTICLE);
    public static final Model PARK_BENCH_RIGHT = block("seats/park_bench_right", TextureKey.ALL, TextureKey.PARTICLE);
    public static final Model CHAIR_LUKAS = block("seats/chair_lukas", TextureKey.ALL, TextureKey.BOTTOM, TextureKey.PARTICLE);
    public static final Model CHAIR_TOMMY = block("seats/chair_tommy", TextureKey.ALL, TextureKey.BOTTOM, TextureKey.PARTICLE);
    public static final Model CHAIR_GREGORY = block("seats/chair_gregory", TextureKey.ALL, TextureKey.BOTTOM, TextureKey.TEXTURE, TextureKey.PARTICLE);
    public static final Model CHAIR_LUKAS_NATURAL = block("seats/chair_lukas_natural", TextureKey.ALL, TextureKey.TEXTURE, TextureKey.BOTTOM, TextureKey.PARTICLE);
    public static final Model CHAIR_TOMMY_NATURAL = block("seats/chair_tommy_natural", TextureKey.ALL, TextureKey.TEXTURE, TextureKey.BOTTOM, TextureKey.PARTICLE);
    public static final Model CHAIR_PASCAL = block("seats/chair_pascal", TextureKey.TEXTURE, TextureKey.BOTTOM, TextureKey.PARTICLE);
    public static final Model CHAIR_PASCAL_WITH_WOOL = block("seats/chair_pascal_with_wool", TextureKey.ALL, TextureKey.TEXTURE, TextureKey.BOTTOM, TextureKey.PARTICLE);
    public static final Model BARBER_CHAIR = block("seats/barber_chair", TextureKey.TEXTURE, TextureKey.BOTTOM, TextureKey.PARTICLE);
    public static final Model BAR_CHAIR = block("seats/bar_chair", TextureKey.TEXTURE, TextureKey.BOTTOM, TextureKey.PARTICLE);
    public static final Model TABLE_THE_CLASSIC = block("tables/table_the_classic", TextureKey.ALL, TextureKey.PARTICLE);
    public static final Model COFFEE_TABLE_PASCAL = block("tables/coffee_table_pascal", TextureKey.TEXTURE, TextureKey.BOTTOM, TextureKey.PARTICLE);
    public static final Model STANDING_TABLE = block("tables/standing_table", TextureKey.ALL, TextureKey.TEXTURE, TextureKey.PARTICLE);
    public static final Model CHAIR = block("seats/chair", TextureKey.ALL, TextureKey.PARTICLE);
    public static final Model CHAIR_FELIX = block("seats/chair_felix", TextureKey.ALL, TextureKey.PARTICLE);
    public static final Model LADDER = block("ladders/ladder", TextureKey.TEXTURE, TextureKey.PARTICLE);
    public static final Model COFFEE_TABLE = block("tables/coffee_table", TextureKey.ALL, TextureKey.TEXTURE, TextureKey.BOTTOM, TextureKey.PARTICLE);
    public static final Model BARREL_SEAT = block("seats/barrel_seat", TextureKey.TEXTURE, TextureKey.SIDE, TextureKey.PARTICLE);
    public static final Model LOG_SEAT = block("seats/log_seat", TextureKey.SIDE, TextureKey.TOP, TextureKey.PARTICLE);

    private static Model block(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(MOD_ID, "block/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    private static Model item(String parent, TextureKey ... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(MOD_ID, "item/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    private static Model block(String parent, String variant, TextureKey ... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(MOD_ID, "block/" + parent)), Optional.of(variant), requiredTextureKeys);
    }
}
