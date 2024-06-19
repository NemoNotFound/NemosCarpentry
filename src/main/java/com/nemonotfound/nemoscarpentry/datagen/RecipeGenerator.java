package com.nemonotfound.nemoscarpentry.datagen;

import com.mojang.datafixers.util.Pair;
import com.nemonotfound.nemoscarpentry.block.ModBlocks;
import com.nemonotfound.nemoscarpentry.block.enums.CarpentryTools;
import com.nemonotfound.nemoscarpentry.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.VanillaRecipeProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class RecipeGenerator extends FabricRecipeProvider {

    public RecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        createBoundBambooLadderReceipe(exporter);

        createSawRecipe(exporter);
        createSawRecipe(exporter, ModItems.STONE_SAW, Items.COBBLESTONE);
        createSawRecipe(exporter, ModItems.IRON_SAW, Items.IRON_INGOT);
        createSawRecipe(exporter, ModItems.GOLDEN_SAW, Items.GOLD_INGOT);
        createSawRecipe(exporter, ModItems.DIAMOND_SAW, Items.DIAMOND);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_SAW, RecipeCategory.TOOLS, ModItems.NETHERITE_SAW);

        createCampfireRecipe(exporter, ModBlocks.ACACIA_CAMPFIRE, ItemTags.ACACIA_LOGS);
        createCampfireRecipe(exporter, ModBlocks.BIRCH_CAMPFIRE, ItemTags.BIRCH_LOGS);
        createCampfireRecipe(exporter, ModBlocks.CHERRY_CAMPFIRE, ItemTags.CHERRY_LOGS);
        createCampfireRecipe(exporter, ModBlocks.CRIMSON_CAMPFIRE, ItemTags.CRIMSON_STEMS);
        createCampfireRecipe(exporter, ModBlocks.DARK_OAK_CAMPFIRE, ItemTags.DARK_OAK_LOGS);
        createCampfireRecipe(exporter, ModBlocks.JUNGLE_CAMPFIRE, ItemTags.JUNGLE_LOGS);
        createCampfireRecipe(exporter, ModBlocks.MANGROVE_CAMPFIRE, ItemTags.MANGROVE_LOGS);
        createCampfireRecipe(exporter, ModBlocks.SPRUCE_CAMPFIRE, ItemTags.SPRUCE_LOGS);
        createCampfireRecipe(exporter, ModBlocks.WARPED_CAMPFIRE, ItemTags.WARPED_STEMS);

        createSoulCampfireRecipe(exporter, ModBlocks.ACACIA_SOUL_CAMPFIRE, ItemTags.ACACIA_LOGS);
        createSoulCampfireRecipe(exporter, ModBlocks.BIRCH_SOUL_CAMPFIRE, ItemTags.BIRCH_LOGS);
        createSoulCampfireRecipe(exporter, ModBlocks.CHERRY_SOUL_CAMPFIRE, ItemTags.CHERRY_LOGS);
        createSoulCampfireRecipe(exporter, ModBlocks.CRIMSON_SOUL_CAMPFIRE, ItemTags.CRIMSON_STEMS);
        createSoulCampfireRecipe(exporter, ModBlocks.DARK_OAK_SOUL_CAMPFIRE, ItemTags.DARK_OAK_LOGS);
        createSoulCampfireRecipe(exporter, ModBlocks.JUNGLE_SOUL_CAMPFIRE, ItemTags.JUNGLE_LOGS);
        createSoulCampfireRecipe(exporter, ModBlocks.MANGROVE_SOUL_CAMPFIRE, ItemTags.MANGROVE_LOGS);
        createSoulCampfireRecipe(exporter, ModBlocks.SPRUCE_SOUL_CAMPFIRE, ItemTags.SPRUCE_LOGS);
        createSoulCampfireRecipe(exporter, ModBlocks.WARPED_SOUL_CAMPFIRE, ItemTags.WARPED_STEMS);

        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.ACACIA_PLANKS, 1)),
                ModBlocks.ACACIA_LADDER, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BAMBOO_PLANKS, 1)),
                ModBlocks.BAMBOO_LADDER, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BIRCH_PLANKS, 1)),
                ModBlocks.BIRCH_LADDER, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CHERRY_PLANKS, 1)),
                ModBlocks.CHERRY_LADDER, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CRIMSON_PLANKS, 1)),
                ModBlocks.CRIMSON_LADDER, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.DARK_OAK_PLANKS, 1)),
                ModBlocks.DARK_OAK_LADDER, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.JUNGLE_PLANKS, 1)),
                ModBlocks.JUNGLE_LADDER, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.MANGROVE_PLANKS, 1)),
                ModBlocks.MANGROVE_LADDER, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.OAK_PLANKS, 1)),
                Blocks.LADDER, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.SPRUCE_PLANKS, 1)),
                ModBlocks.SPRUCE_LADDER, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.WARPED_PLANKS, 1)),
                ModBlocks.WARPED_LADDER, 2, CarpentryTools.SAW.asString());

        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.ACACIA_PLANKS, 1)),
                ModBlocks.ACACIA_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BAMBOO_PLANKS, 1)),
                ModBlocks.BAMBOO_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BIRCH_PLANKS, 1)),
                ModBlocks.BIRCH_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CHERRY_PLANKS, 1)),
                ModBlocks.CHERRY_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CRIMSON_PLANKS, 1)),
                ModBlocks.CRIMSON_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.DARK_OAK_PLANKS, 1)),
                ModBlocks.DARK_OAK_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.JUNGLE_PLANKS, 1)),
                ModBlocks.JUNGLE_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.MANGROVE_PLANKS, 1)),
                ModBlocks.MANGROVE_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.OAK_PLANKS, 1)),
                ModBlocks.OAK_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.SPRUCE_PLANKS, 1)),
                ModBlocks.SPRUCE_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.WARPED_PLANKS, 1)),
                ModBlocks.WARPED_CHAIR, 1, CarpentryTools.SAW.asString());

        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.ACACIA_PLANKS, 1)),
                ModBlocks.ACACIA_CHAIR_FELIX, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BAMBOO_PLANKS, 1)),
                ModBlocks.BAMBOO_CHAIR_FELIX, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BIRCH_PLANKS, 1)),
                ModBlocks.BIRCH_CHAIR_FELIX, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CHERRY_PLANKS, 1)),
                ModBlocks.CHERRY_CHAIR_FELIX, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CRIMSON_PLANKS, 1)),
                ModBlocks.CRIMSON_CHAIR_FELIX, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.DARK_OAK_PLANKS, 1)),
                ModBlocks.DARK_OAK_CHAIR_FELIX, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.JUNGLE_PLANKS, 1)),
                ModBlocks.JUNGLE_CHAIR_FELIX, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.MANGROVE_PLANKS, 1)),
                ModBlocks.MANGROVE_CHAIR_FELIX, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.OAK_PLANKS, 1)),
                ModBlocks.OAK_CHAIR_FELIX, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.SPRUCE_PLANKS, 1)),
                ModBlocks.SPRUCE_CHAIR_FELIX, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.WARPED_PLANKS, 1)),
                ModBlocks.WARPED_CHAIR_FELIX, 1, CarpentryTools.SAW.asString());

        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.ACACIA_LOG, 1)),
                ModBlocks.ACACIA_LOG_SEAT, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BIRCH_LOG, 1)),
                ModBlocks.BIRCH_LOG_SEAT, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CHERRY_LOG, 1)),
                ModBlocks.CHERRY_LOG_SEAT, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CRIMSON_STEM, 1)),
                ModBlocks.CRIMSON_STEM_SEAT, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.DARK_OAK_LOG, 1)),
                ModBlocks.DARK_OAK_LOG_SEAT, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.JUNGLE_LOG, 1)),
                ModBlocks.JUNGLE_LOG_SEAT, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.MANGROVE_LOG, 1)),
                ModBlocks.MANGROVE_LOG_SEAT, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.OAK_LOG, 1)),
                ModBlocks.OAK_LOG_SEAT, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.SPRUCE_LOG, 1)),
                ModBlocks.SPRUCE_LOG_SEAT, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.WARPED_STEM, 1)),
                ModBlocks.WARPED_STEM_SEAT, 2, CarpentryTools.SAW.asString());

        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.ACACIA_PLANKS, 2)),
                ModBlocks.ACACIA_PARK_BENCH, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BAMBOO_PLANKS, 2)),
                ModBlocks.BAMBOO_PARK_BENCH, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BIRCH_PLANKS, 2)),
                ModBlocks.BIRCH_PARK_BENCH, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CHERRY_PLANKS, 2)),
                ModBlocks.CHERRY_PARK_BENCH, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CRIMSON_PLANKS, 2)),
                ModBlocks.CRIMSON_PARK_BENCH, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.DARK_OAK_PLANKS, 2)),
                ModBlocks.DARK_OAK_PARK_BENCH, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.JUNGLE_PLANKS, 2)),
                ModBlocks.JUNGLE_PARK_BENCH, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.MANGROVE_PLANKS, 2)),
                ModBlocks.MANGROVE_PARK_BENCH, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.OAK_PLANKS, 2)),
                ModBlocks.OAK_PARK_BENCH, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.SPRUCE_PLANKS, 2)),
                ModBlocks.SPRUCE_PARK_BENCH, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.WARPED_PLANKS, 2)),
                ModBlocks.WARPED_PARK_BENCH, 1, CarpentryTools.SAW.asString());

        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.ACACIA_PLANKS, 2)),
                ModItems.ACACIA_CHAIR_LUKAS, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BAMBOO_PLANKS, 2)),
                ModItems.BAMBOO_CHAIR_LUKAS, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BIRCH_PLANKS, 2)),
                ModItems.BIRCH_CHAIR_LUKAS, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CHERRY_PLANKS, 2)),
                ModItems.CHERRY_CHAIR_LUKAS, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CRIMSON_PLANKS, 2)),
                ModItems.CRIMSON_CHAIR_LUKAS, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.DARK_OAK_PLANKS, 2)),
                ModItems.DARK_OAK_CHAIR_LUKAS, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.JUNGLE_PLANKS, 2)),
                ModItems.JUNGLE_CHAIR_LUKAS, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.MANGROVE_PLANKS, 2)),
                ModItems.MANGROVE_CHAIR_LUKAS, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.OAK_PLANKS, 2)),
                ModItems.OAK_CHAIR_LUKAS, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.SPRUCE_PLANKS, 2)),
                ModItems.SPRUCE_CHAIR_LUKAS, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.WARPED_PLANKS, 2)),
                ModItems.WARPED_CHAIR_LUKAS, 1, CarpentryTools.SAW.asString());


        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CHERRY_PLANKS, 2)),
                ModItems.CHERRY_GLASS_DOOR_FRAME, 2, CarpentryTools.SAW.asString());

        createTableTheClassicRecipes(exporter);
        createStandingTableRecipes(exporter);
        createChairLukasNaturalRecipes(exporter);
        createCoffeeTableRecipes(exporter);
        createBarrelSeatRecipes(exporter);
        createChairTommyRecipes(exporter);
        createChairTommyNaturalRecipes(exporter);
        createChairGregoryRecipes(exporter);
        createBarberChairRecipes(exporter);
        createBarChairRecipes(exporter);
        createTablePascalRecipes(exporter);
        createPascalChairRecipes(exporter);
    }

    private void createTableTheClassicRecipes(RecipeExporter exporter) {
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.ACACIA_PLANKS, 1)),
                ModBlocks.ACACIA_TABLE_THE_CLASSIC, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BAMBOO_PLANKS, 1)),
                ModBlocks.BAMBOO_TABLE_THE_CLASSIC, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BIRCH_PLANKS, 1)),
                ModBlocks.BIRCH_TABLE_THE_CLASSIC, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CHERRY_PLANKS, 1)),
                ModBlocks.CHERRY_TABLE_THE_CLASSIC, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CRIMSON_PLANKS, 1)),
                ModBlocks.CRIMSON_TABLE_THE_CLASSIC, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.DARK_OAK_PLANKS, 1)),
                ModBlocks.DARK_OAK_TABLE_THE_CLASSIC, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.JUNGLE_PLANKS, 1)),
                ModBlocks.JUNGLE_TABLE_THE_CLASSIC, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.MANGROVE_PLANKS, 1)),
                ModBlocks.MANGROVE_TABLE_THE_CLASSIC, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.OAK_PLANKS, 1)),
                ModBlocks.OAK_TABLE_THE_CLASSIC, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.SPRUCE_PLANKS, 1)),
                ModBlocks.SPRUCE_TABLE_THE_CLASSIC, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.WARPED_PLANKS, 1)),
                ModBlocks.WARPED_TABLE_THE_CLASSIC, 1, CarpentryTools.SAW.asString());
    }

    private void createTablePascalRecipes(RecipeExporter exporter) {
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.ACACIA_PLANKS, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModBlocks.ACACIA_COFFEE_TABLE_PASCAL, 4, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BAMBOO_PLANKS, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModBlocks.BAMBOO_COFFEE_TABLE_PASCAL, 4, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BIRCH_PLANKS, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModBlocks.BIRCH_COFFEE_TABLE_PASCAL, 4, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CHERRY_PLANKS, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModBlocks.CHERRY_COFFEE_TABLE_PASCAL, 4, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CRIMSON_PLANKS, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModBlocks.CRIMSON_COFFEE_TABLE_PASCAL, 4, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.DARK_OAK_PLANKS, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModBlocks.DARK_OAK_COFFEE_TABLE_PASCAL, 4, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.JUNGLE_PLANKS, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModBlocks.JUNGLE_COFFEE_TABLE_PASCAL, 4, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.MANGROVE_PLANKS, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModBlocks.MANGROVE_COFFEE_TABLE_PASCAL, 4, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.OAK_PLANKS, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModBlocks.OAK_COFFEE_TABLE_PASCAL, 4, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.SPRUCE_PLANKS, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModBlocks.SPRUCE_COFFEE_TABLE_PASCAL, 4, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.WARPED_PLANKS, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModBlocks.WARPED_COFFEE_TABLE_PASCAL, 4, CarpentryTools.SAW.asString());
    }

    private void createStandingTableRecipes(RecipeExporter exporter) {
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.ACACIA_LOG, 1)),
                ModBlocks.ACACIA_STANDING_TABLE, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BAMBOO_BLOCK, 1)),
                ModBlocks.BAMBOO_STANDING_TABLE, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BIRCH_LOG, 1)),
                ModBlocks.BIRCH_STANDING_TABLE, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CHERRY_LOG, 1)),
                ModBlocks.CHERRY_STANDING_TABLE, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CRIMSON_STEM, 1)),
                ModBlocks.CRIMSON_STANDING_TABLE, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.DARK_OAK_LOG, 1)),
                ModBlocks.DARK_OAK_STANDING_TABLE, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.JUNGLE_LOG, 1)),
                ModBlocks.JUNGLE_STANDING_TABLE, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.MANGROVE_LOG, 1)),
                ModBlocks.MANGROVE_STANDING_TABLE, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.OAK_LOG, 1)),
                ModBlocks.OAK_STANDING_TABLE, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.SPRUCE_LOG, 1)),
                ModBlocks.SPRUCE_STANDING_TABLE, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.WARPED_STEM, 1)),
                ModBlocks.WARPED_STANDING_TABLE, 1, CarpentryTools.SAW.asString());
    }

    private void createChairLukasNaturalRecipes(RecipeExporter exporter) {
        createCarpentryRecipe(exporter, Pair.of(Blocks.ACACIA_PLANKS, 1), Pair.of(ItemTags.ACACIA_LOGS, 1),
                ModItems.ACACIA_CHAIR_LUKAS_NATURAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.BAMBOO_PLANKS, 1), Pair.of(ItemTags.BAMBOO_BLOCKS, 1),
                ModItems.BAMBOO_CHAIR_LUKAS_NATURAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.BIRCH_PLANKS, 1), Pair.of(ItemTags.BIRCH_LOGS, 1),
                ModItems.BIRCH_CHAIR_LUKAS_NATURAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.CHERRY_PLANKS, 1), Pair.of(ItemTags.CHERRY_LOGS, 1),
                ModItems.CHERRY_CHAIR_LUKAS_NATURAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.CRIMSON_PLANKS, 1), Pair.of(ItemTags.CRIMSON_STEMS, 1),
                ModItems.CRIMSON_CHAIR_LUKAS_NATURAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.DARK_OAK_PLANKS, 1), Pair.of(ItemTags.DARK_OAK_LOGS, 1),
                ModItems.DARK_OAK_CHAIR_LUKAS_NATURAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.JUNGLE_PLANKS, 1), Pair.of(ItemTags.JUNGLE_LOGS, 1),
                ModItems.JUNGLE_CHAIR_LUKAS_NATURAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.MANGROVE_PLANKS, 1), Pair.of(ItemTags.MANGROVE_LOGS, 1),
                ModItems.MANGROVE_CHAIR_LUKAS_NATURAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.OAK_PLANKS, 1), Pair.of(ItemTags.OAK_LOGS, 1),
                ModItems.OAK_CHAIR_LUKAS_NATURAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.SPRUCE_PLANKS, 1), Pair.of(ItemTags.SPRUCE_LOGS, 1),
                ModItems.SPRUCE_CHAIR_LUKAS_NATURAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.WARPED_PLANKS, 1), Pair.of(ItemTags.WARPED_STEMS, 1),
                ModItems.WARPED_CHAIR_LUKAS_NATURAL, 1, CarpentryTools.SAW.asString());
    }

    private void createChairTommyRecipes(RecipeExporter exporter) {
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.ACACIA_PLANKS, 2)),
                ModItems.ACACIA_CHAIR_TOMMY, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BAMBOO_PLANKS, 2)),
                ModItems.BAMBOO_CHAIR_TOMMY, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BIRCH_PLANKS, 2)),
                ModItems.BIRCH_CHAIR_TOMMY, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CHERRY_PLANKS, 2)),
                ModItems.CHERRY_CHAIR_TOMMY, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CRIMSON_PLANKS, 2)),
                ModItems.CRIMSON_CHAIR_TOMMY, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.DARK_OAK_PLANKS, 2)),
                ModItems.DARK_OAK_CHAIR_TOMMY, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.JUNGLE_PLANKS, 2)),
                ModItems.JUNGLE_CHAIR_TOMMY, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.MANGROVE_PLANKS, 2)),
                ModItems.MANGROVE_CHAIR_TOMMY, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.OAK_PLANKS, 2)),
                ModItems.OAK_CHAIR_TOMMY, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.SPRUCE_PLANKS, 2)),
                ModItems.SPRUCE_CHAIR_TOMMY, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.WARPED_PLANKS, 2)),
                ModItems.WARPED_CHAIR_TOMMY, 1, CarpentryTools.SAW.asString());
    }

    private void createChairTommyNaturalRecipes(RecipeExporter exporter) {
        createCarpentryRecipe(exporter, Pair.of(Blocks.ACACIA_PLANKS, 1), Pair.of(ItemTags.ACACIA_LOGS, 1),
                ModItems.ACACIA_CHAIR_TOMMY_NATURAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.BAMBOO_PLANKS, 1), Pair.of(ItemTags.BAMBOO_BLOCKS, 1),
                ModItems.BAMBOO_CHAIR_TOMMY_NATURAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.BIRCH_PLANKS, 1), Pair.of(ItemTags.BIRCH_LOGS, 1),
                ModItems.BIRCH_CHAIR_TOMMY_NATURAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.CHERRY_PLANKS, 1), Pair.of(ItemTags.CHERRY_LOGS, 1),
                ModItems.CHERRY_CHAIR_TOMMY_NATURAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.CRIMSON_PLANKS, 1), Pair.of(ItemTags.CRIMSON_STEMS, 1),
                ModItems.CRIMSON_CHAIR_TOMMY_NATURAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.DARK_OAK_PLANKS, 1), Pair.of(ItemTags.DARK_OAK_LOGS, 1),
                ModItems.DARK_OAK_CHAIR_TOMMY_NATURAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.JUNGLE_PLANKS, 1), Pair.of(ItemTags.JUNGLE_LOGS, 1),
                ModItems.JUNGLE_CHAIR_TOMMY_NATURAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.MANGROVE_PLANKS, 1), Pair.of(ItemTags.MANGROVE_LOGS, 1),
                ModItems.MANGROVE_CHAIR_TOMMY_NATURAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.OAK_PLANKS, 1), Pair.of(ItemTags.OAK_LOGS, 1),
                ModItems.OAK_CHAIR_TOMMY_NATURAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.SPRUCE_PLANKS, 1), Pair.of(ItemTags.SPRUCE_LOGS, 1),
                ModItems.SPRUCE_CHAIR_TOMMY_NATURAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.WARPED_PLANKS, 1), Pair.of(ItemTags.WARPED_STEMS, 1),
                ModItems.WARPED_CHAIR_TOMMY_NATURAL, 1, CarpentryTools.SAW.asString());
    }

    private void createCoffeeTableRecipes(RecipeExporter exporter) {
        createCarpentryRecipe(exporter, Pair.of(Blocks.ACACIA_PLANKS, 1), Pair.of(ItemTags.ACACIA_LOGS, 1),
                ModItems.ACACIA_COFFEE_TABLE, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.BAMBOO_PLANKS, 1), Pair.of(ItemTags.BAMBOO_BLOCKS, 1),
                ModItems.BAMBOO_COFFEE_TABLE, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.BIRCH_PLANKS, 1), Pair.of(ItemTags.BIRCH_LOGS, 1),
                ModItems.BIRCH_COFFEE_TABLE, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.CHERRY_PLANKS, 1), Pair.of(ItemTags.CHERRY_LOGS, 1),
                ModItems.CHERRY_COFFEE_TABLE, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.CRIMSON_PLANKS, 1), Pair.of(ItemTags.CRIMSON_STEMS, 1),
                ModItems.CRIMSON_COFFEE_TABLE, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.DARK_OAK_PLANKS, 1), Pair.of(ItemTags.DARK_OAK_LOGS, 1),
                ModItems.DARK_OAK_COFFEE_TABLE, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.JUNGLE_PLANKS, 1), Pair.of(ItemTags.JUNGLE_LOGS, 1),
                ModItems.JUNGLE_COFFEE_TABLE, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.MANGROVE_PLANKS, 1), Pair.of(ItemTags.MANGROVE_LOGS, 1),
                ModItems.MANGROVE_COFFEE_TABLE, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.OAK_PLANKS, 1), Pair.of(ItemTags.OAK_LOGS, 1),
                ModItems.OAK_COFFEE_TABLE, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.SPRUCE_PLANKS, 1), Pair.of(ItemTags.SPRUCE_LOGS, 1),
                ModItems.SPRUCE_COFFEE_TABLE, 2, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.WARPED_PLANKS, 1), Pair.of(ItemTags.WARPED_STEMS, 1),
                ModItems.WARPED_COFFEE_TABLE, 2, CarpentryTools.SAW.asString());
    }

    private void createBarrelSeatRecipes(RecipeExporter exporter) {
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.ACACIA_PLANKS, 1), Pair.of(Items.IRON_INGOT, 1)),
                ModItems.ACACIA_BARREL_SEAT, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BAMBOO_PLANKS, 1), Pair.of(Items.IRON_INGOT, 1)),
                ModItems.BAMBOO_BARREL_SEAT, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BIRCH_PLANKS, 1), Pair.of(Items.IRON_INGOT, 1)),
                ModItems.BIRCH_BARREL_SEAT, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CHERRY_PLANKS, 1), Pair.of(Items.IRON_INGOT, 1)),
                ModItems.CHERRY_BARREL_SEAT, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CRIMSON_PLANKS, 1), Pair.of(Items.IRON_INGOT, 1)),
                ModItems.CRIMSON_BARREL_SEAT, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.DARK_OAK_PLANKS, 1), Pair.of(Items.IRON_INGOT, 1)),
                ModItems.DARK_OAK_BARREL_SEAT, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.JUNGLE_PLANKS, 1), Pair.of(Items.IRON_INGOT, 1)),
                ModItems.JUNGLE_BARREL_SEAT, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.MANGROVE_PLANKS, 1), Pair.of(Items.IRON_INGOT, 1)),
                ModItems.MANGROVE_BARREL_SEAT, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.OAK_PLANKS, 1), Pair.of(Items.IRON_INGOT, 1)),
                ModItems.OAK_BARREL_SEAT, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.SPRUCE_PLANKS, 1), Pair.of(Items.IRON_INGOT, 1)),
                ModItems.SPRUCE_BARREL_SEAT, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.WARPED_PLANKS, 1), Pair.of(Items.IRON_INGOT, 1)),
                ModItems.WARPED_BARREL_SEAT, 1, CarpentryTools.SAW.asString());
    }

    private void createChairGregoryRecipes(RecipeExporter exporter) {
        createCarpentryRecipe(exporter, Pair.of(Blocks.ACACIA_PLANKS, 1), Pair.of(ItemTags.ACACIA_LOGS, 1),
                ModItems.ACACIA_CHAIR_GREGORY, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.BAMBOO_PLANKS, 1), Pair.of(ItemTags.BAMBOO_BLOCKS, 1),
                ModItems.BAMBOO_CHAIR_GREGORY, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.BIRCH_PLANKS, 1), Pair.of(ItemTags.BIRCH_LOGS, 1),
                ModItems.BIRCH_CHAIR_GREGORY, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.CHERRY_PLANKS, 1), Pair.of(ItemTags.CHERRY_LOGS, 1),
                ModItems.CHERRY_CHAIR_GREGORY, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.CRIMSON_PLANKS, 1), Pair.of(ItemTags.CRIMSON_STEMS, 1),
                ModItems.CRIMSON_CHAIR_GREGORY, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.DARK_OAK_PLANKS, 1), Pair.of(ItemTags.DARK_OAK_LOGS, 1),
                ModItems.DARK_OAK_CHAIR_GREGORY, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.JUNGLE_PLANKS, 1), Pair.of(ItemTags.JUNGLE_LOGS, 1),
                ModItems.JUNGLE_CHAIR_GREGORY, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.MANGROVE_PLANKS, 1), Pair.of(ItemTags.MANGROVE_LOGS, 1),
                ModItems.MANGROVE_CHAIR_GREGORY, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.OAK_PLANKS, 1), Pair.of(ItemTags.OAK_LOGS, 1),
                ModItems.OAK_CHAIR_GREGORY, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.SPRUCE_PLANKS, 1), Pair.of(ItemTags.SPRUCE_LOGS, 1),
                ModItems.SPRUCE_CHAIR_GREGORY, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, Pair.of(Blocks.WARPED_PLANKS, 1), Pair.of(ItemTags.WARPED_STEMS, 1),
                ModItems.WARPED_CHAIR_GREGORY, 1, CarpentryTools.SAW.asString());
    }

    private void createBarberChairRecipes(RecipeExporter exporter) {
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.WHITE_WOOL, 1), Pair.of(Blocks.GOLD_BLOCK, 1)),
                ModItems.WHITE_BARBER_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.LIGHT_GRAY_WOOL, 1), Pair.of(Blocks.GOLD_BLOCK, 1)),
                ModItems.LIGHT_GRAY_BARBER_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.GRAY_WOOL, 1), Pair.of(Blocks.GOLD_BLOCK, 1)),
                ModItems.GRAY_BARBER_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BLACK_WOOL, 1), Pair.of(Blocks.GOLD_BLOCK, 1)),
                ModItems.BLACK_BARBER_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BROWN_WOOL, 1), Pair.of(Blocks.GOLD_BLOCK, 1)),
                ModItems.BROWN_BARBER_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.RED_WOOL, 1), Pair.of(Blocks.GOLD_BLOCK, 1)),
                ModItems.RED_BARBER_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.ORANGE_WOOL, 1), Pair.of(Blocks.GOLD_BLOCK, 1)),
                ModItems.ORANGE_BARBER_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.YELLOW_WOOL, 1), Pair.of(Blocks.GOLD_BLOCK, 1)),
                ModItems.YELLOW_BARBER_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.LIME_WOOL, 1), Pair.of(Blocks.GOLD_BLOCK, 1)),
                ModItems.LIME_BARBER_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.GREEN_WOOL, 1), Pair.of(Blocks.GOLD_BLOCK, 1)),
                ModItems.GREEN_BARBER_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CYAN_WOOL, 1), Pair.of(Blocks.GOLD_BLOCK, 1)),
                ModItems.CYAN_BARBER_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.LIGHT_BLUE_WOOL, 1), Pair.of(Blocks.GOLD_BLOCK, 1)),
                ModItems.LIGHT_BLUE_BARBER_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BLUE_WOOL, 1), Pair.of(Blocks.GOLD_BLOCK, 1)),
                ModItems.BLUE_BARBER_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.PURPLE_WOOL, 1), Pair.of(Blocks.GOLD_BLOCK, 1)),
                ModItems.PURPLE_BARBER_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.MAGENTA_WOOL, 1), Pair.of(Blocks.GOLD_BLOCK, 1)),
                ModItems.MAGENTA_BARBER_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.PINK_WOOL, 1), Pair.of(Blocks.GOLD_BLOCK, 1)),
                ModItems.PINK_BARBER_CHAIR, 1, CarpentryTools.SAW.asString());
    }

    private void createBarChairRecipes(RecipeExporter exporter) {
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.WHITE_WOOL, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.WHITE_BAR_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.LIGHT_GRAY_WOOL, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.LIGHT_GRAY_BAR_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.GRAY_WOOL, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.GRAY_BAR_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BLACK_WOOL, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.BLACK_BAR_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BROWN_WOOL, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.BROWN_BAR_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.RED_WOOL, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.RED_BAR_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.ORANGE_WOOL, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.ORANGE_BAR_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.YELLOW_WOOL, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.YELLOW_BAR_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.LIME_WOOL, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.LIME_BAR_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.GREEN_WOOL, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.GREEN_BAR_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CYAN_WOOL, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.CYAN_BAR_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.LIGHT_BLUE_WOOL, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.LIGHT_BLUE_BAR_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BLUE_WOOL, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.BLUE_BAR_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.PURPLE_WOOL, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.PURPLE_BAR_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.MAGENTA_WOOL, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.MAGENTA_BAR_CHAIR, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.PINK_WOOL, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.PINK_BAR_CHAIR, 1, CarpentryTools.SAW.asString());
    }

    private void createPascalChairRecipes(RecipeExporter exporter) {
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.ACACIA_PLANKS, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.ACACIA_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.ACACIA_CHAIR_PASCAL, 1), Pair.of(Blocks.WHITE_WOOL, 1)),
                ModItems.ACACIA_WHITE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.ACACIA_CHAIR_PASCAL, 1), Pair.of(Blocks.LIGHT_GRAY_WOOL, 1)),
                ModItems.ACACIA_LIGHT_GRAY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.ACACIA_CHAIR_PASCAL, 1), Pair.of(Blocks.GRAY_WOOL, 1)),
                ModItems.ACACIA_GRAY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.ACACIA_CHAIR_PASCAL, 1), Pair.of(Blocks.BLACK_WOOL, 1)),
                ModItems.ACACIA_BLACK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.ACACIA_CHAIR_PASCAL, 1), Pair.of(Blocks.BROWN_WOOL, 1)),
                ModItems.ACACIA_BROWN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.ACACIA_CHAIR_PASCAL, 1), Pair.of(Blocks.RED_WOOL, 1)),
                ModItems.ACACIA_RED_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.ACACIA_CHAIR_PASCAL, 1), Pair.of(Blocks.ORANGE_WOOL, 1)),
                ModItems.ACACIA_ORANGE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.ACACIA_CHAIR_PASCAL, 1), Pair.of(Blocks.YELLOW_WOOL, 1)),
                ModItems.ACACIA_YELLOW_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.ACACIA_CHAIR_PASCAL, 1), Pair.of(Blocks.LIME_WOOL, 1)),
                ModItems.ACACIA_LIME_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.ACACIA_CHAIR_PASCAL, 1), Pair.of(Blocks.GREEN_WOOL, 1)),
                ModItems.ACACIA_GREEN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.ACACIA_CHAIR_PASCAL, 1), Pair.of(Blocks.CYAN_WOOL, 1)),
                ModItems.ACACIA_CYAN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.ACACIA_CHAIR_PASCAL, 1), Pair.of(Blocks.LIGHT_BLUE_WOOL, 1)),
                ModItems.ACACIA_LIGHT_BLUE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.ACACIA_CHAIR_PASCAL, 1), Pair.of(Blocks.BLUE_WOOL, 1)),
                ModItems.ACACIA_BLUE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.ACACIA_CHAIR_PASCAL, 1), Pair.of(Blocks.PURPLE_WOOL, 1)),
                ModItems.ACACIA_PURPLE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.ACACIA_CHAIR_PASCAL, 1), Pair.of(Blocks.MAGENTA_WOOL, 1)),
                ModItems.ACACIA_MAGENTA_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.ACACIA_CHAIR_PASCAL, 1), Pair.of(Blocks.PINK_WOOL, 1)),
                ModItems.ACACIA_PINK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BAMBOO_PLANKS, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.BAMBOO_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BAMBOO_CHAIR_PASCAL, 1), Pair.of(Blocks.WHITE_WOOL, 1)),
                ModItems.BAMBOO_WHITE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BAMBOO_CHAIR_PASCAL, 1), Pair.of(Blocks.LIGHT_GRAY_WOOL, 1)),
                ModItems.BAMBOO_LIGHT_GRAY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BAMBOO_CHAIR_PASCAL, 1), Pair.of(Blocks.GRAY_WOOL, 1)),
                ModItems.BAMBOO_GRAY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BAMBOO_CHAIR_PASCAL, 1), Pair.of(Blocks.BLACK_WOOL, 1)),
                ModItems.BAMBOO_BLACK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BAMBOO_CHAIR_PASCAL, 1), Pair.of(Blocks.BROWN_WOOL, 1)),
                ModItems.BAMBOO_BROWN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BAMBOO_CHAIR_PASCAL, 1), Pair.of(Blocks.RED_WOOL, 1)),
                ModItems.BAMBOO_RED_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BAMBOO_CHAIR_PASCAL, 1), Pair.of(Blocks.ORANGE_WOOL, 1)),
                ModItems.BAMBOO_ORANGE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BAMBOO_CHAIR_PASCAL, 1), Pair.of(Blocks.YELLOW_WOOL, 1)),
                ModItems.BAMBOO_YELLOW_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BAMBOO_CHAIR_PASCAL, 1), Pair.of(Blocks.LIME_WOOL, 1)),
                ModItems.BAMBOO_LIME_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BAMBOO_CHAIR_PASCAL, 1), Pair.of(Blocks.GREEN_WOOL, 1)),
                ModItems.BAMBOO_GREEN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BAMBOO_CHAIR_PASCAL, 1), Pair.of(Blocks.CYAN_WOOL, 1)),
                ModItems.BAMBOO_CYAN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BAMBOO_CHAIR_PASCAL, 1), Pair.of(Blocks.LIGHT_BLUE_WOOL, 1)),
                ModItems.BAMBOO_LIGHT_BLUE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BAMBOO_CHAIR_PASCAL, 1), Pair.of(Blocks.BLUE_WOOL, 1)),
                ModItems.BAMBOO_BLUE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BAMBOO_CHAIR_PASCAL, 1), Pair.of(Blocks.PURPLE_WOOL, 1)),
                ModItems.BAMBOO_PURPLE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BAMBOO_CHAIR_PASCAL, 1), Pair.of(Blocks.MAGENTA_WOOL, 1)),
                ModItems.BAMBOO_MAGENTA_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BAMBOO_CHAIR_PASCAL, 1), Pair.of(Blocks.PINK_WOOL, 1)),
                ModItems.BAMBOO_PINK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BIRCH_PLANKS, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.BIRCH_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BIRCH_CHAIR_PASCAL, 1), Pair.of(Blocks.WHITE_WOOL, 1)),
                ModItems.BIRCH_WHITE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BIRCH_CHAIR_PASCAL, 1), Pair.of(Blocks.LIGHT_GRAY_WOOL, 1)),
                ModItems.BIRCH_LIGHT_GRAY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BIRCH_CHAIR_PASCAL, 1), Pair.of(Blocks.GRAY_WOOL, 1)),
                ModItems.BIRCH_GRAY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BIRCH_CHAIR_PASCAL, 1), Pair.of(Blocks.BLACK_WOOL, 1)),
                ModItems.BIRCH_BLACK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BIRCH_CHAIR_PASCAL, 1), Pair.of(Blocks.BROWN_WOOL, 1)),
                ModItems.BIRCH_BROWN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BIRCH_CHAIR_PASCAL, 1), Pair.of(Blocks.RED_WOOL, 1)),
                ModItems.BIRCH_RED_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BIRCH_CHAIR_PASCAL, 1), Pair.of(Blocks.ORANGE_WOOL, 1)),
                ModItems.BIRCH_ORANGE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BIRCH_CHAIR_PASCAL, 1), Pair.of(Blocks.YELLOW_WOOL, 1)),
                ModItems.BIRCH_YELLOW_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BIRCH_CHAIR_PASCAL, 1), Pair.of(Blocks.LIME_WOOL, 1)),
                ModItems.BIRCH_LIME_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BIRCH_CHAIR_PASCAL, 1), Pair.of(Blocks.GREEN_WOOL, 1)),
                ModItems.BIRCH_GREEN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BIRCH_CHAIR_PASCAL, 1), Pair.of(Blocks.CYAN_WOOL, 1)),
                ModItems.BIRCH_CYAN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BIRCH_CHAIR_PASCAL, 1), Pair.of(Blocks.LIGHT_BLUE_WOOL, 1)),
                ModItems.BIRCH_LIGHT_BLUE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BIRCH_CHAIR_PASCAL, 1), Pair.of(Blocks.BLUE_WOOL, 1)),
                ModItems.BIRCH_BLUE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BIRCH_CHAIR_PASCAL, 1), Pair.of(Blocks.PURPLE_WOOL, 1)),
                ModItems.BIRCH_PURPLE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BIRCH_CHAIR_PASCAL, 1), Pair.of(Blocks.MAGENTA_WOOL, 1)),
                ModItems.BIRCH_MAGENTA_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.BIRCH_CHAIR_PASCAL, 1), Pair.of(Blocks.PINK_WOOL, 1)),
                ModItems.BIRCH_PINK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CHERRY_PLANKS, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.CHERRY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CHERRY_CHAIR_PASCAL, 1), Pair.of(Blocks.WHITE_WOOL, 1)),
                ModItems.CHERRY_WHITE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CHERRY_CHAIR_PASCAL, 1), Pair.of(Blocks.LIGHT_GRAY_WOOL, 1)),
                ModItems.CHERRY_LIGHT_GRAY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CHERRY_CHAIR_PASCAL, 1), Pair.of(Blocks.GRAY_WOOL, 1)),
                ModItems.CHERRY_GRAY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CHERRY_CHAIR_PASCAL, 1), Pair.of(Blocks.BLACK_WOOL, 1)),
                ModItems.CHERRY_BLACK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CHERRY_CHAIR_PASCAL, 1), Pair.of(Blocks.BROWN_WOOL, 1)),
                ModItems.CHERRY_BROWN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CHERRY_CHAIR_PASCAL, 1), Pair.of(Blocks.RED_WOOL, 1)),
                ModItems.CHERRY_RED_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CHERRY_CHAIR_PASCAL, 1), Pair.of(Blocks.ORANGE_WOOL, 1)),
                ModItems.CHERRY_ORANGE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CHERRY_CHAIR_PASCAL, 1), Pair.of(Blocks.YELLOW_WOOL, 1)),
                ModItems.CHERRY_YELLOW_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CHERRY_CHAIR_PASCAL, 1), Pair.of(Blocks.LIME_WOOL, 1)),
                ModItems.CHERRY_LIME_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CHERRY_CHAIR_PASCAL, 1), Pair.of(Blocks.GREEN_WOOL, 1)),
                ModItems.CHERRY_GREEN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CHERRY_CHAIR_PASCAL, 1), Pair.of(Blocks.CYAN_WOOL, 1)),
                ModItems.CHERRY_CYAN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CHERRY_CHAIR_PASCAL, 1), Pair.of(Blocks.LIGHT_BLUE_WOOL, 1)),
                ModItems.CHERRY_LIGHT_BLUE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CHERRY_CHAIR_PASCAL, 1), Pair.of(Blocks.BLUE_WOOL, 1)),
                ModItems.CHERRY_BLUE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CHERRY_CHAIR_PASCAL, 1), Pair.of(Blocks.PURPLE_WOOL, 1)),
                ModItems.CHERRY_PURPLE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CHERRY_CHAIR_PASCAL, 1), Pair.of(Blocks.MAGENTA_WOOL, 1)),
                ModItems.CHERRY_MAGENTA_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CHERRY_CHAIR_PASCAL, 1), Pair.of(Blocks.PINK_WOOL, 1)),
                ModItems.CHERRY_PINK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.CRIMSON_PLANKS, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.CRIMSON_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CRIMSON_CHAIR_PASCAL, 1), Pair.of(Blocks.WHITE_WOOL, 1)),
                ModItems.CRIMSON_WHITE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CRIMSON_CHAIR_PASCAL, 1), Pair.of(Blocks.LIGHT_GRAY_WOOL, 1)),
                ModItems.CRIMSON_LIGHT_GRAY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CRIMSON_CHAIR_PASCAL, 1), Pair.of(Blocks.GRAY_WOOL, 1)),
                ModItems.CRIMSON_GRAY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CRIMSON_CHAIR_PASCAL, 1), Pair.of(Blocks.BLACK_WOOL, 1)),
                ModItems.CRIMSON_BLACK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CRIMSON_CHAIR_PASCAL, 1), Pair.of(Blocks.BROWN_WOOL, 1)),
                ModItems.CRIMSON_BROWN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CRIMSON_CHAIR_PASCAL, 1), Pair.of(Blocks.RED_WOOL, 1)),
                ModItems.CRIMSON_RED_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CRIMSON_CHAIR_PASCAL, 1), Pair.of(Blocks.ORANGE_WOOL, 1)),
                ModItems.CRIMSON_ORANGE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CRIMSON_CHAIR_PASCAL, 1), Pair.of(Blocks.YELLOW_WOOL, 1)),
                ModItems.CRIMSON_YELLOW_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CRIMSON_CHAIR_PASCAL, 1), Pair.of(Blocks.LIME_WOOL, 1)),
                ModItems.CRIMSON_LIME_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CRIMSON_CHAIR_PASCAL, 1), Pair.of(Blocks.GREEN_WOOL, 1)),
                ModItems.CRIMSON_GREEN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CRIMSON_CHAIR_PASCAL, 1), Pair.of(Blocks.CYAN_WOOL, 1)),
                ModItems.CRIMSON_CYAN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CRIMSON_CHAIR_PASCAL, 1), Pair.of(Blocks.LIGHT_BLUE_WOOL, 1)),
                ModItems.CRIMSON_LIGHT_BLUE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CRIMSON_CHAIR_PASCAL, 1), Pair.of(Blocks.BLUE_WOOL, 1)),
                ModItems.CRIMSON_BLUE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CRIMSON_CHAIR_PASCAL, 1), Pair.of(Blocks.PURPLE_WOOL, 1)),
                ModItems.CRIMSON_PURPLE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CRIMSON_CHAIR_PASCAL, 1), Pair.of(Blocks.MAGENTA_WOOL, 1)),
                ModItems.CRIMSON_MAGENTA_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.CRIMSON_CHAIR_PASCAL, 1), Pair.of(Blocks.PINK_WOOL, 1)),
                ModItems.CRIMSON_PINK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.DARK_OAK_PLANKS, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.DARK_OAK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.WHITE_WOOL, 1)),
                ModItems.DARK_OAK_WHITE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.LIGHT_GRAY_WOOL, 1)),
                ModItems.DARK_OAK_LIGHT_GRAY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.GRAY_WOOL, 1)),
                ModItems.DARK_OAK_GRAY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.BLACK_WOOL, 1)),
                ModItems.DARK_OAK_BLACK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.BROWN_WOOL, 1)),
                ModItems.DARK_OAK_BROWN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.RED_WOOL, 1)),
                ModItems.DARK_OAK_RED_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.ORANGE_WOOL, 1)),
                ModItems.DARK_OAK_ORANGE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.YELLOW_WOOL, 1)),
                ModItems.DARK_OAK_YELLOW_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.LIME_WOOL, 1)),
                ModItems.DARK_OAK_LIME_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.GREEN_WOOL, 1)),
                ModItems.DARK_OAK_GREEN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.CYAN_WOOL, 1)),
                ModItems.DARK_OAK_CYAN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.LIGHT_BLUE_WOOL, 1)),
                ModItems.DARK_OAK_LIGHT_BLUE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.BLUE_WOOL, 1)),
                ModItems.DARK_OAK_BLUE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.PURPLE_WOOL, 1)),
                ModItems.DARK_OAK_PURPLE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.MAGENTA_WOOL, 1)),
                ModItems.DARK_OAK_MAGENTA_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.PINK_WOOL, 1)),
                ModItems.DARK_OAK_PINK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.JUNGLE_PLANKS, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.JUNGLE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.JUNGLE_CHAIR_PASCAL, 1), Pair.of(Blocks.WHITE_WOOL, 1)),
                ModItems.JUNGLE_WHITE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.JUNGLE_CHAIR_PASCAL, 1), Pair.of(Blocks.LIGHT_GRAY_WOOL, 1)),
                ModItems.JUNGLE_LIGHT_GRAY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.JUNGLE_CHAIR_PASCAL, 1), Pair.of(Blocks.GRAY_WOOL, 1)),
                ModItems.JUNGLE_GRAY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.JUNGLE_CHAIR_PASCAL, 1), Pair.of(Blocks.BLACK_WOOL, 1)),
                ModItems.JUNGLE_BLACK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.JUNGLE_CHAIR_PASCAL, 1), Pair.of(Blocks.BROWN_WOOL, 1)),
                ModItems.JUNGLE_BROWN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.JUNGLE_CHAIR_PASCAL, 1), Pair.of(Blocks.RED_WOOL, 1)),
                ModItems.JUNGLE_RED_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.JUNGLE_CHAIR_PASCAL, 1), Pair.of(Blocks.ORANGE_WOOL, 1)),
                ModItems.JUNGLE_ORANGE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.JUNGLE_CHAIR_PASCAL, 1), Pair.of(Blocks.YELLOW_WOOL, 1)),
                ModItems.JUNGLE_YELLOW_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.JUNGLE_CHAIR_PASCAL, 1), Pair.of(Blocks.LIME_WOOL, 1)),
                ModItems.JUNGLE_LIME_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.JUNGLE_CHAIR_PASCAL, 1), Pair.of(Blocks.GREEN_WOOL, 1)),
                ModItems.JUNGLE_GREEN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.JUNGLE_CHAIR_PASCAL, 1), Pair.of(Blocks.CYAN_WOOL, 1)),
                ModItems.JUNGLE_CYAN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.JUNGLE_CHAIR_PASCAL, 1), Pair.of(Blocks.LIGHT_BLUE_WOOL, 1)),
                ModItems.JUNGLE_LIGHT_BLUE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.JUNGLE_CHAIR_PASCAL, 1), Pair.of(Blocks.BLUE_WOOL, 1)),
                ModItems.JUNGLE_BLUE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.JUNGLE_CHAIR_PASCAL, 1), Pair.of(Blocks.PURPLE_WOOL, 1)),
                ModItems.JUNGLE_PURPLE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.JUNGLE_CHAIR_PASCAL, 1), Pair.of(Blocks.MAGENTA_WOOL, 1)),
                ModItems.JUNGLE_MAGENTA_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.JUNGLE_CHAIR_PASCAL, 1), Pair.of(Blocks.PINK_WOOL, 1)),
                ModItems.JUNGLE_PINK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.MANGROVE_PLANKS, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.MANGROVE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.MANGROVE_CHAIR_PASCAL, 1), Pair.of(Blocks.WHITE_WOOL, 1)),
                ModItems.MANGROVE_WHITE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.MANGROVE_CHAIR_PASCAL, 1), Pair.of(Blocks.LIGHT_GRAY_WOOL, 1)),
                ModItems.MANGROVE_LIGHT_GRAY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.MANGROVE_CHAIR_PASCAL, 1), Pair.of(Blocks.GRAY_WOOL, 1)),
                ModItems.MANGROVE_GRAY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.MANGROVE_CHAIR_PASCAL, 1), Pair.of(Blocks.BLACK_WOOL, 1)),
                ModItems.MANGROVE_BLACK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.MANGROVE_CHAIR_PASCAL, 1), Pair.of(Blocks.BROWN_WOOL, 1)),
                ModItems.MANGROVE_BROWN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.MANGROVE_CHAIR_PASCAL, 1), Pair.of(Blocks.RED_WOOL, 1)),
                ModItems.MANGROVE_RED_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.MANGROVE_CHAIR_PASCAL, 1), Pair.of(Blocks.ORANGE_WOOL, 1)),
                ModItems.MANGROVE_ORANGE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.MANGROVE_CHAIR_PASCAL, 1), Pair.of(Blocks.YELLOW_WOOL, 1)),
                ModItems.MANGROVE_YELLOW_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.MANGROVE_CHAIR_PASCAL, 1), Pair.of(Blocks.LIME_WOOL, 1)),
                ModItems.MANGROVE_LIME_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.MANGROVE_CHAIR_PASCAL, 1), Pair.of(Blocks.GREEN_WOOL, 1)),
                ModItems.MANGROVE_GREEN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.MANGROVE_CHAIR_PASCAL, 1), Pair.of(Blocks.CYAN_WOOL, 1)),
                ModItems.MANGROVE_CYAN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.MANGROVE_CHAIR_PASCAL, 1), Pair.of(Blocks.LIGHT_BLUE_WOOL, 1)),
                ModItems.MANGROVE_LIGHT_BLUE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.MANGROVE_CHAIR_PASCAL, 1), Pair.of(Blocks.BLUE_WOOL, 1)),
                ModItems.MANGROVE_BLUE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.MANGROVE_CHAIR_PASCAL, 1), Pair.of(Blocks.PURPLE_WOOL, 1)),
                ModItems.MANGROVE_PURPLE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.MANGROVE_CHAIR_PASCAL, 1), Pair.of(Blocks.MAGENTA_WOOL, 1)),
                ModItems.MANGROVE_MAGENTA_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.MANGROVE_CHAIR_PASCAL, 1), Pair.of(Blocks.PINK_WOOL, 1)),
                ModItems.MANGROVE_PINK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.OAK_PLANKS, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.OAK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.WHITE_WOOL, 1)),
                ModItems.OAK_WHITE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.LIGHT_GRAY_WOOL, 1)),
                ModItems.OAK_LIGHT_GRAY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.GRAY_WOOL, 1)),
                ModItems.OAK_GRAY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.BLACK_WOOL, 1)),
                ModItems.OAK_BLACK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.BROWN_WOOL, 1)),
                ModItems.OAK_BROWN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.RED_WOOL, 1)),
                ModItems.OAK_RED_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.ORANGE_WOOL, 1)),
                ModItems.OAK_ORANGE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.YELLOW_WOOL, 1)),
                ModItems.OAK_YELLOW_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.LIME_WOOL, 1)),
                ModItems.OAK_LIME_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.GREEN_WOOL, 1)),
                ModItems.OAK_GREEN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.CYAN_WOOL, 1)),
                ModItems.OAK_CYAN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.LIGHT_BLUE_WOOL, 1)),
                ModItems.OAK_LIGHT_BLUE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.BLUE_WOOL, 1)),
                ModItems.OAK_BLUE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.PURPLE_WOOL, 1)),
                ModItems.OAK_PURPLE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.MAGENTA_WOOL, 1)),
                ModItems.OAK_MAGENTA_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.OAK_CHAIR_PASCAL, 1), Pair.of(Blocks.PINK_WOOL, 1)),
                ModItems.OAK_PINK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.SPRUCE_PLANKS, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.SPRUCE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.SPRUCE_CHAIR_PASCAL, 1), Pair.of(Blocks.WHITE_WOOL, 1)),
                ModItems.SPRUCE_WHITE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.SPRUCE_CHAIR_PASCAL, 1), Pair.of(Blocks.LIGHT_GRAY_WOOL, 1)),
                ModItems.SPRUCE_LIGHT_GRAY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.SPRUCE_CHAIR_PASCAL, 1), Pair.of(Blocks.GRAY_WOOL, 1)),
                ModItems.SPRUCE_GRAY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.SPRUCE_CHAIR_PASCAL, 1), Pair.of(Blocks.BLACK_WOOL, 1)),
                ModItems.SPRUCE_BLACK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.SPRUCE_CHAIR_PASCAL, 1), Pair.of(Blocks.BROWN_WOOL, 1)),
                ModItems.SPRUCE_BROWN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.SPRUCE_CHAIR_PASCAL, 1), Pair.of(Blocks.RED_WOOL, 1)),
                ModItems.SPRUCE_RED_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.SPRUCE_CHAIR_PASCAL, 1), Pair.of(Blocks.ORANGE_WOOL, 1)),
                ModItems.SPRUCE_ORANGE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.SPRUCE_CHAIR_PASCAL, 1), Pair.of(Blocks.YELLOW_WOOL, 1)),
                ModItems.SPRUCE_YELLOW_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.SPRUCE_CHAIR_PASCAL, 1), Pair.of(Blocks.LIME_WOOL, 1)),
                ModItems.SPRUCE_LIME_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.SPRUCE_CHAIR_PASCAL, 1), Pair.of(Blocks.GREEN_WOOL, 1)),
                ModItems.SPRUCE_GREEN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.SPRUCE_CHAIR_PASCAL, 1), Pair.of(Blocks.CYAN_WOOL, 1)),
                ModItems.SPRUCE_CYAN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.SPRUCE_CHAIR_PASCAL, 1), Pair.of(Blocks.LIGHT_BLUE_WOOL, 1)),
                ModItems.SPRUCE_LIGHT_BLUE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.SPRUCE_CHAIR_PASCAL, 1), Pair.of(Blocks.BLUE_WOOL, 1)),
                ModItems.SPRUCE_BLUE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.SPRUCE_CHAIR_PASCAL, 1), Pair.of(Blocks.PURPLE_WOOL, 1)),
                ModItems.SPRUCE_PURPLE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.SPRUCE_CHAIR_PASCAL, 1), Pair.of(Blocks.MAGENTA_WOOL, 1)),
                ModItems.SPRUCE_MAGENTA_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.SPRUCE_CHAIR_PASCAL, 1), Pair.of(Blocks.PINK_WOOL, 1)),
                ModItems.SPRUCE_PINK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.WARPED_PLANKS, 1), Pair.of(Blocks.IRON_BLOCK, 1)),
                ModItems.WARPED_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.WARPED_CHAIR_PASCAL, 1), Pair.of(Blocks.WHITE_WOOL, 1)),
                ModItems.WARPED_WHITE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.WARPED_CHAIR_PASCAL, 1), Pair.of(Blocks.LIGHT_GRAY_WOOL, 1)),
                ModItems.WARPED_LIGHT_GRAY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.WARPED_CHAIR_PASCAL, 1), Pair.of(Blocks.GRAY_WOOL, 1)),
                ModItems.WARPED_GRAY_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.WARPED_CHAIR_PASCAL, 1), Pair.of(Blocks.BLACK_WOOL, 1)),
                ModItems.WARPED_BLACK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.WARPED_CHAIR_PASCAL, 1), Pair.of(Blocks.BROWN_WOOL, 1)),
                ModItems.WARPED_BROWN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.WARPED_CHAIR_PASCAL, 1), Pair.of(Blocks.RED_WOOL, 1)),
                ModItems.WARPED_RED_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.WARPED_CHAIR_PASCAL, 1), Pair.of(Blocks.ORANGE_WOOL, 1)),
                ModItems.WARPED_ORANGE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.WARPED_CHAIR_PASCAL, 1), Pair.of(Blocks.YELLOW_WOOL, 1)),
                ModItems.WARPED_YELLOW_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.WARPED_CHAIR_PASCAL, 1), Pair.of(Blocks.LIME_WOOL, 1)),
                ModItems.WARPED_LIME_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.WARPED_CHAIR_PASCAL, 1), Pair.of(Blocks.GREEN_WOOL, 1)),
                ModItems.WARPED_GREEN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.WARPED_CHAIR_PASCAL, 1), Pair.of(Blocks.CYAN_WOOL, 1)),
                ModItems.WARPED_CYAN_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.WARPED_CHAIR_PASCAL, 1), Pair.of(Blocks.LIGHT_BLUE_WOOL, 1)),
                ModItems.WARPED_LIGHT_BLUE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.WARPED_CHAIR_PASCAL, 1), Pair.of(Blocks.BLUE_WOOL, 1)),
                ModItems.WARPED_BLUE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.WARPED_CHAIR_PASCAL, 1), Pair.of(Blocks.PURPLE_WOOL, 1)),
                ModItems.WARPED_PURPLE_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.WARPED_CHAIR_PASCAL, 1), Pair.of(Blocks.MAGENTA_WOOL, 1)),
                ModItems.WARPED_MAGENTA_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        createCarpentryRecipe(exporter, List.of(Pair.of(ModBlocks.WARPED_CHAIR_PASCAL, 1), Pair.of(Blocks.PINK_WOOL, 1)),
                ModItems.WARPED_PINK_CHAIR_PASCAL, 1, CarpentryTools.SAW.asString());
        
    }

    private void createSawRecipe(RecipeExporter exporter) {
        TagKey<Item> planks = ItemTags.PLANKS;

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_SAW, 1)
                .input('#', planks).input('S', Items.STICK)
                .pattern("#  ").pattern(" #S").pattern(" SS")
                .criterion("has_planks", VanillaRecipeProvider.conditionsFromTag(planks))
                .offerTo(exporter);
    }

    private void createSawRecipe(RecipeExporter exporter, Item saw, Item input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, saw, 1)
                .input('#', input).input('S', Items.STICK)
                .pattern("#  ").pattern(" #S").pattern(" SS")
                .criterion(FabricRecipeProvider.hasItem(input), VanillaRecipeProvider.conditionsFromItem(input))
                .offerTo(exporter);
    }

    private void createCampfireRecipe(RecipeExporter exporter, Block result, TagKey<Item> log) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, result)
                .input('L', log).input('S', Items.STICK).input('C', ItemTags.COALS)
                .pattern(" S ").pattern("SCS").pattern("LLL")
                .criterion("has_stick", VanillaRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion("has_coal", VanillaRecipeProvider.conditionsFromTag(ItemTags.COALS))
                .offerTo(exporter);
    }

    private void createSoulCampfireRecipe(RecipeExporter exporter, Block result, TagKey<Item> log) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, result)
                .input('L', log).input('S', Items.STICK).input('#', ItemTags.SOUL_FIRE_BASE_BLOCKS)
                .pattern(" S ").pattern("S#S").pattern("LLL")
                .criterion("has_soul_sand", VanillaRecipeProvider.conditionsFromTag(ItemTags.SOUL_FIRE_BASE_BLOCKS))
                .offerTo(exporter);
    }

    private void createCarpentryRecipe(RecipeExporter exporter, List<Pair<ItemConvertible, Integer>> ingredients, ItemConvertible output,
                                       int outputCount, String tool) {
        CarpentryRecipeJsonBuilder builder = CarpentryRecipeJsonBuilder
                .create(RecipeCategory.DECORATIONS, output, outputCount, tool);

        addIngredientsToRecipe(builder, ingredients);

        builder.criterion(FabricRecipeProvider.hasItem(output), conditionsFromItem(output))
                .offerTo(exporter, new Identifier(getRecipeName(output) + "_carpentry"));
    }

    private void createCarpentryRecipe(RecipeExporter exporter, Pair<ItemConvertible, Integer> ingredientPair,
                                       Pair<TagKey<Item>, Integer> secondIngredientPair, ItemConvertible output,
                                       int outputCount, String tool) {
        ItemConvertible firstIngredient = ingredientPair.getFirst();
        TagKey<Item> secondIngredient = secondIngredientPair.getFirst();

        CarpentryRecipeJsonBuilder builder = CarpentryRecipeJsonBuilder
                .create(RecipeCategory.DECORATIONS, output, outputCount, tool)
                .input(Ingredient.ofItems(firstIngredient), ingredientPair.getSecond())
                .criterion(hasItem(firstIngredient), conditionsFromItem(firstIngredient))
                .input(Ingredient.fromTag(secondIngredientPair.getFirst()), secondIngredientPair.getSecond())
                .criterion("has_logs", conditionsFromTag(secondIngredient));

        builder.criterion(FabricRecipeProvider.hasItem(output), conditionsFromItem(output))
                .offerTo(exporter, new Identifier(getRecipeName(output) + "_carpentry"));
    }

    private void addIngredientsToRecipe(CarpentryRecipeJsonBuilder builder, List<Pair<ItemConvertible, Integer>> ingredients) {
        for (Pair<ItemConvertible, Integer> ingredientPair : ingredients) {
            ItemConvertible ingredient = ingredientPair.getFirst();

            builder.input(Ingredient.ofItems(ingredient), ingredientPair.getSecond())
                    .criterion(hasItem(ingredient), conditionsFromItem(ingredient));
        }
    }

    private void createBoundBambooLadderReceipe(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BOUND_BAMBOO_LADDER, 3)
                .input('B', Items.BAMBOO).input('S', Items.STRING)
                .pattern("B B").pattern("BSB").pattern("B B")
                .criterion("has_bamboo", VanillaRecipeProvider.conditionsFromItem(Items.BAMBOO))
                .offerTo(exporter);
    }
}
