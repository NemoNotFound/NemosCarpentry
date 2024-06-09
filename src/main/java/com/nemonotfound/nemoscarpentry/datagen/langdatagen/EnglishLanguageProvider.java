package com.nemonotfound.nemoscarpentry.datagen.langdatagen;

import com.nemonotfound.nemoscarpentry.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class EnglishLanguageProvider extends FabricLanguageProvider {

    public EnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.ACACIA_COFFEE_TABLE, "Acacia Coffee Table");
        translationBuilder.add(ModBlocks.BAMBOO_COFFEE_TABLE, "Bamboo Coffee Table");
        translationBuilder.add(ModBlocks.BIRCH_COFFEE_TABLE, "Birch Coffee Table");
        translationBuilder.add(ModBlocks.CHERRY_COFFEE_TABLE, "Cherry Coffee Table");
        translationBuilder.add(ModBlocks.CRIMSON_COFFEE_TABLE, "Crimson Coffee Table");
        translationBuilder.add(ModBlocks.DARK_OAK_COFFEE_TABLE, "Dark_Oak Coffee Table");
        translationBuilder.add(ModBlocks.JUNGLE_COFFEE_TABLE, "Jungle Coffee Table");
        translationBuilder.add(ModBlocks.MANGROVE_COFFEE_TABLE, "Mangrove Coffee Table");
        translationBuilder.add(ModBlocks.OAK_COFFEE_TABLE, "Oak Coffee Table");
        translationBuilder.add(ModBlocks.SPRUCE_COFFEE_TABLE, "Spruce Coffee Table");
        translationBuilder.add(ModBlocks.WARPED_COFFEE_TABLE, "Warped Coffee Table");
        translationBuilder.add(ModBlocks.ACACIA_BARREL_SEAT, "Acacia Barrel Seats");
        translationBuilder.add(ModBlocks.BAMBOO_BARREL_SEAT, "Bamboo Barrel Seats");
        translationBuilder.add(ModBlocks.BIRCH_BARREL_SEAT, "Birch Barrel Seats");
        translationBuilder.add(ModBlocks.CHERRY_BARREL_SEAT, "Cherry Barrel Seats");
        translationBuilder.add(ModBlocks.CRIMSON_BARREL_SEAT, "Crimson Barrel Seats");
        translationBuilder.add(ModBlocks.DARK_OAK_BARREL_SEAT, "Dark_Oak Barrel Seats");
        translationBuilder.add(ModBlocks.JUNGLE_BARREL_SEAT, "Jungle Barrel Seats");
        translationBuilder.add(ModBlocks.MANGROVE_BARREL_SEAT, "Mangrove Barrel Seats");
        translationBuilder.add(ModBlocks.OAK_BARREL_SEAT, "Oak Barrel Seats");
        translationBuilder.add(ModBlocks.SPRUCE_BARREL_SEAT, "Spruce Barrel Seats");
        translationBuilder.add(ModBlocks.WARPED_BARREL_SEAT, "Warped Barrel Seats");

        try {
            Optional<Path> optionalPath = dataOutput.getModContainer().findPath("en_us.json");

            if (optionalPath.isPresent()) {
                translationBuilder.add(optionalPath.get());
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
