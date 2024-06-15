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
        translationBuilder.add(ModBlocks.ACACIA_TABLE_THE_CLASSIC, "Acacia Table \"The Classic\"");
        translationBuilder.add(ModBlocks.BAMBOO_TABLE_THE_CLASSIC, "Bamboo Table \"The Classic\"");
        translationBuilder.add(ModBlocks.BIRCH_TABLE_THE_CLASSIC, "Birch Table \"The Classic\"");
        translationBuilder.add(ModBlocks.CHERRY_TABLE_THE_CLASSIC, "Cherry Table \"The Classic\"");
        translationBuilder.add(ModBlocks.CRIMSON_TABLE_THE_CLASSIC, "Crimson Table \"The Classic\"");
        translationBuilder.add(ModBlocks.DARK_OAK_TABLE_THE_CLASSIC, "Dark_Oak Table \"The Classic\"");
        translationBuilder.add(ModBlocks.JUNGLE_TABLE_THE_CLASSIC, "Jungle Table \"The Classic\"");
        translationBuilder.add(ModBlocks.MANGROVE_TABLE_THE_CLASSIC, "Mangrove Table \"The Classic\"");
        translationBuilder.add(ModBlocks.OAK_TABLE_THE_CLASSIC, "Oak Table \"The Classic\"");
        translationBuilder.add(ModBlocks.SPRUCE_TABLE_THE_CLASSIC, "Spruce Table \"The Classic\"");
        translationBuilder.add(ModBlocks.WARPED_TABLE_THE_CLASSIC, "Warped Table \"The Classic\"");

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

        translationBuilder.add(ModBlocks.ACACIA_STANDING_TABLE, "Acacia Standing Table");
        translationBuilder.add(ModBlocks.BAMBOO_STANDING_TABLE, "Bamboo Standing Table");
        translationBuilder.add(ModBlocks.BIRCH_STANDING_TABLE, "Birch Standing Table");
        translationBuilder.add(ModBlocks.CHERRY_STANDING_TABLE, "Cherry Standing Table");
        translationBuilder.add(ModBlocks.CRIMSON_STANDING_TABLE, "Crimson Standing Table");
        translationBuilder.add(ModBlocks.DARK_OAK_STANDING_TABLE, "Dark_Oak Standing Table");
        translationBuilder.add(ModBlocks.JUNGLE_STANDING_TABLE, "Jungle Standing Table");
        translationBuilder.add(ModBlocks.MANGROVE_STANDING_TABLE, "Mangrove Standing Table");
        translationBuilder.add(ModBlocks.OAK_STANDING_TABLE, "Oak Standing Table");
        translationBuilder.add(ModBlocks.SPRUCE_STANDING_TABLE, "Spruce Standing Table");
        translationBuilder.add(ModBlocks.WARPED_STANDING_TABLE, "Warped Standing Table");

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
        
        translationBuilder.add(ModBlocks.ACACIA_CHAIR_TOMMY, "Acacia Chair \"Tommy\"");
        translationBuilder.add(ModBlocks.BAMBOO_CHAIR_TOMMY, "Bamboo Chair \"Tommy\"");
        translationBuilder.add(ModBlocks.BIRCH_CHAIR_TOMMY, "Birch Chair \"Tommy\"");
        translationBuilder.add(ModBlocks.CHERRY_CHAIR_TOMMY, "Cherry Chair \"Tommy\"");
        translationBuilder.add(ModBlocks.CRIMSON_CHAIR_TOMMY, "Crimson Chair \"Tommy\"");
        translationBuilder.add(ModBlocks.DARK_OAK_CHAIR_TOMMY, "Dark Oak Chair \"Tommy\"");
        translationBuilder.add(ModBlocks.JUNGLE_CHAIR_TOMMY, "Jungle Chair \"Tommy\"");
        translationBuilder.add(ModBlocks.MANGROVE_CHAIR_TOMMY, "Mangrove Chair \"Tommy\"");
        translationBuilder.add(ModBlocks.OAK_CHAIR_TOMMY, "Oak Chair \"Tommy\"");
        translationBuilder.add(ModBlocks.SPRUCE_CHAIR_TOMMY, "Spruce Chair \"Tommy\"");
        translationBuilder.add(ModBlocks.WARPED_CHAIR_TOMMY, "Warped Chair \"Tommy\"");

        translationBuilder.add(ModBlocks.ACACIA_CHAIR_TOMMY_NATURAL, "Acacia Chair \"Tommy\" - Natural");
        translationBuilder.add(ModBlocks.BAMBOO_CHAIR_TOMMY_NATURAL, "Bamboo Chair \"Tommy\" - Natural");
        translationBuilder.add(ModBlocks.BIRCH_CHAIR_TOMMY_NATURAL, "Birch Chair \"Tommy\" - Natural");
        translationBuilder.add(ModBlocks.CHERRY_CHAIR_TOMMY_NATURAL, "Cherry Chair \"Tommy\" - Natural");
        translationBuilder.add(ModBlocks.CRIMSON_CHAIR_TOMMY_NATURAL, "Crimson Chair \"Tommy\" - Natural");
        translationBuilder.add(ModBlocks.DARK_OAK_CHAIR_TOMMY_NATURAL, "Dark Oak Chair \"Tommy\" - Natural");
        translationBuilder.add(ModBlocks.JUNGLE_CHAIR_TOMMY_NATURAL, "Jungle Chair \"Tommy\" - Natural");
        translationBuilder.add(ModBlocks.MANGROVE_CHAIR_TOMMY_NATURAL, "Mangrove Chair \"Tommy\" - Natural");
        translationBuilder.add(ModBlocks.OAK_CHAIR_TOMMY_NATURAL, "Oak Chair \"Tommy\" - Natural");
        translationBuilder.add(ModBlocks.SPRUCE_CHAIR_TOMMY_NATURAL, "Spruce Chair \"Tommy\" - Natural");
        translationBuilder.add(ModBlocks.WARPED_CHAIR_TOMMY_NATURAL, "Warped Chair \"Tommy\" - Natural");

        translationBuilder.add(ModBlocks.ACACIA_CHAIR_GREGORY, "Acacia Chair \"Gregory\"");
        translationBuilder.add(ModBlocks.BAMBOO_CHAIR_GREGORY, "Bamboo Chair \"Gregory\"");
        translationBuilder.add(ModBlocks.BIRCH_CHAIR_GREGORY, "Birch Chair \"Gregory\"");
        translationBuilder.add(ModBlocks.CHERRY_CHAIR_GREGORY, "Cherry Chair \"Gregory\"");
        translationBuilder.add(ModBlocks.CRIMSON_CHAIR_GREGORY, "Crimson Chair \"Gregory\"");
        translationBuilder.add(ModBlocks.DARK_OAK_CHAIR_GREGORY, "Dark Oak Chair \"Gregory\"");
        translationBuilder.add(ModBlocks.JUNGLE_CHAIR_GREGORY, "Jungle Chair \"Gregory\"");
        translationBuilder.add(ModBlocks.MANGROVE_CHAIR_GREGORY, "Mangrove Chair \"Gregory\"");
        translationBuilder.add(ModBlocks.OAK_CHAIR_GREGORY, "Oak Chair \"Gregory\"");
        translationBuilder.add(ModBlocks.SPRUCE_CHAIR_GREGORY, "Spruce Chair \"Gregory\"");
        translationBuilder.add(ModBlocks.WARPED_CHAIR_GREGORY, "Warped Chair \"Gregory\"");

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
