package com.nemonotfound.nemoscarpentry.datagen;

import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

import static com.nemonotfound.nemoscarpentry.NemosCarpentry.MOD_ID;

public class ModModels {

    public static final Model PARK_BENCH = item("seats/park_bench_full", TextureKey.LAYER0);
    public static final Model PARK_BENCH_LEFT = block("seats/park_bench_left", TextureKey.ALL, TextureKey.PARTICLE);
    public static final Model PARK_BENCH_RIGHT = block("seats/park_bench_right", TextureKey.ALL, TextureKey.PARTICLE);
    public static final Model CHAIR_LUKAS = block("seats/chair_lukas", TextureKey.ALL, TextureKey.BOTTOM, TextureKey.PARTICLE);
    public static final Model CHAIR_LUKAS_NATURAL = block("seats/chair_lukas_natural", TextureKey.ALL, TextureKey.TEXTURE, TextureKey.BOTTOM, TextureKey.PARTICLE);
    public static final Model TABLE_THE_CLASSIC = block("tables/table_the_classic", TextureKey.ALL, TextureKey.PARTICLE);
    public static final Model CHAIR = block("seats/chair", TextureKey.ALL, TextureKey.PARTICLE);
    public static final Model CHAIR_FELIX = block("seats/chair_felix", TextureKey.ALL, TextureKey.PARTICLE);
    public static final Model LADDER = block("ladders/ladder", TextureKey.TEXTURE, TextureKey.PARTICLE);
    public static final Model COFFEE_TABLE = block("tables/coffee_table", TextureKey.ALL, TextureKey.TEXTURE, TextureKey.BOTTOM, TextureKey.PARTICLE);
    public static final Model BARREL_SEAT = block("seats/barrel_seat", TextureKey.TEXTURE, TextureKey.SIDE, TextureKey.PARTICLE);

    private static Model block(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(new Identifier(MOD_ID, "block/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    private static Model item(String parent, TextureKey ... requiredTextureKeys) {
        return new Model(Optional.of(new Identifier(MOD_ID, "item/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    private static Model block(String parent, String variant, TextureKey ... requiredTextureKeys) {
        return new Model(Optional.of(new Identifier(MOD_ID, "block/" + parent)), Optional.of(variant), requiredTextureKeys);
    }
}
