package com.nemonotfound.nemoscarpentry.datagen;

import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

import static com.nemonotfound.nemoscarpentry.NemosCarpentry.MOD_ID;

public class ModModels {

    public static final Model PARK_BENCH = item("seats/parents/park_bench_full", TextureKey.LAYER0);
    public static final Model PARK_BENCH_LEFT = block("seats/parents/park_bench_left", TextureKey.ALL, TextureKey.PARTICLE);
    public static final Model PARK_BENCH_RIGHT = block("seats/parents/park_bench_right", TextureKey.ALL, TextureKey.PARTICLE);

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
