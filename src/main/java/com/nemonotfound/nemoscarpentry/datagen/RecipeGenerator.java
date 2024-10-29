package com.nemonotfound.nemoscarpentry.datagen;

import com.mojang.datafixers.util.Pair;
import com.nemonotfound.nemoscarpentry.block.ModBlocks;
import com.nemonotfound.nemoscarpentry.block.enums.CarpentryTools;
import com.nemonotfound.nemoscarpentry.item.ModItems;
import com.nemonotfound.nemoscarpentry.recipe.CarpentryRecipeJsonBuilder;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class RecipeGenerator extends FabricRecipeProvider {

    public RecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected net.minecraft.data.server.recipe.RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new net.minecraft.data.server.recipe.RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createBoundBambooLadderReceipe(exporter);

                createSawRecipe(exporter);
                createSawRecipe(exporter, ModItems.STONE_SAW, Items.COBBLESTONE);
                createSawRecipe(exporter, ModItems.IRON_SAW, Items.IRON_INGOT);
                createSawRecipe(exporter, ModItems.GOLDEN_SAW, Items.GOLD_INGOT);
                createSawRecipe(exporter, ModItems.DIAMOND_SAW, Items.DIAMOND);
                offerNetheriteUpgradeRecipe(ModItems.DIAMOND_SAW, RecipeCategory.TOOLS, ModItems.NETHERITE_SAW);

                createCarpentryRecipe(List.of(Blocks.ACACIA_PLANKS), List.of(1), ModBlocks.ACACIA_LADDER, 2, true);
                createCarpentryRecipe(List.of(Blocks.BAMBOO_PLANKS), List.of(1), ModBlocks.BAMBOO_LADDER, 2, true);
                createCarpentryRecipe(List.of(Blocks.BIRCH_PLANKS), List.of(1), ModBlocks.BIRCH_LADDER, 2, true);
                createCarpentryRecipe(List.of(Blocks.CHERRY_PLANKS), List.of(1), ModBlocks.CHERRY_LADDER, 2, true);
                createCarpentryRecipe(List.of(Blocks.CRIMSON_PLANKS), List.of(1), ModBlocks.CRIMSON_LADDER, 2, true);
                createCarpentryRecipe(List.of(Blocks.DARK_OAK_PLANKS), List.of(1), ModBlocks.DARK_OAK_LADDER, 2, true);
                createCarpentryRecipe(List.of(Blocks.JUNGLE_PLANKS), List.of(1), ModBlocks.JUNGLE_LADDER, 2, true);
                createCarpentryRecipe(List.of(Blocks.MANGROVE_PLANKS), List.of(1), ModBlocks.MANGROVE_LADDER, 2, true);
                createCarpentryRecipe(List.of(Blocks.OAK_PLANKS), List.of(1), Blocks.LADDER, 2, true);
                createCarpentryRecipe(List.of(Blocks.SPRUCE_PLANKS), List.of(1), ModBlocks.SPRUCE_LADDER, 2, true);
                createCarpentryRecipe(List.of(Blocks.WARPED_PLANKS), List.of(1), ModBlocks.WARPED_LADDER, 2, true);

                createCarpentryRecipe(List.of(Blocks.ACACIA_PLANKS), List.of(1), ModBlocks.ACACIA_CHAIR, 1, true);
                createCarpentryRecipe(List.of(Blocks.BAMBOO_PLANKS), List.of(1), ModBlocks.BAMBOO_CHAIR, 1, true);
                createCarpentryRecipe(List.of(Blocks.BIRCH_PLANKS), List.of(1), ModBlocks.BIRCH_CHAIR, 1, true);
                createCarpentryRecipe(List.of(Blocks.CHERRY_PLANKS), List.of(1), ModBlocks.CHERRY_CHAIR, 1, true);
                createCarpentryRecipe(List.of(Blocks.CRIMSON_PLANKS), List.of(1), ModBlocks.CRIMSON_CHAIR, 1, true);
                createCarpentryRecipe(List.of(Blocks.DARK_OAK_PLANKS), List.of(1), ModBlocks.DARK_OAK_CHAIR, 1, true);
                createCarpentryRecipe(List.of(Blocks.JUNGLE_PLANKS), List.of(1), ModBlocks.JUNGLE_CHAIR, 1, true);
                createCarpentryRecipe(List.of(Blocks.MANGROVE_PLANKS), List.of(1), ModBlocks.MANGROVE_CHAIR, 1, true);
                createCarpentryRecipe(List.of(Blocks.OAK_PLANKS), List.of(1), ModBlocks.OAK_CHAIR, 1, true);
                createCarpentryRecipe(List.of(Blocks.SPRUCE_PLANKS), List.of(1), ModBlocks.SPRUCE_CHAIR, 1, true);
                createCarpentryRecipe(List.of(Blocks.WARPED_PLANKS), List.of(1), ModBlocks.WARPED_CHAIR, 1, true);

                createCarpentryRecipe(List.of(Blocks.ACACIA_PLANKS), List.of(1), ModBlocks.ACACIA_CHAIR_FELIX, 1, true);
                createCarpentryRecipe(List.of(Blocks.BAMBOO_PLANKS), List.of(1), ModBlocks.BAMBOO_CHAIR_FELIX, 1, true);
                createCarpentryRecipe(List.of(Blocks.BIRCH_PLANKS), List.of(1), ModBlocks.BIRCH_CHAIR_FELIX, 1, true);
                createCarpentryRecipe(List.of(Blocks.CHERRY_PLANKS), List.of(1), ModBlocks.CHERRY_CHAIR_FELIX, 1, true);
                createCarpentryRecipe(List.of(Blocks.CRIMSON_PLANKS), List.of(1), ModBlocks.CRIMSON_CHAIR_FELIX, 1, true);
                createCarpentryRecipe(List.of(Blocks.DARK_OAK_PLANKS), List.of(1), ModBlocks.DARK_OAK_CHAIR_FELIX, 1, true);
                createCarpentryRecipe(List.of(Blocks.JUNGLE_PLANKS), List.of(1), ModBlocks.JUNGLE_CHAIR_FELIX, 1, true);
                createCarpentryRecipe(List.of(Blocks.MANGROVE_PLANKS), List.of(1), ModBlocks.MANGROVE_CHAIR_FELIX, 1, true);
                createCarpentryRecipe(List.of(Blocks.OAK_PLANKS), List.of(1), ModBlocks.OAK_CHAIR_FELIX, 1, true);
                createCarpentryRecipe(List.of(Blocks.SPRUCE_PLANKS), List.of(1), ModBlocks.SPRUCE_CHAIR_FELIX, 1, true);
                createCarpentryRecipe(List.of(Blocks.WARPED_PLANKS), List.of(1), ModBlocks.WARPED_CHAIR_FELIX, 1, true);

                createCarpentryRecipe(List.of(Blocks.ACACIA_LOG), List.of(1), ModBlocks.ACACIA_LOG_SEAT, 2, true);
                createCarpentryRecipe(List.of(Blocks.BIRCH_LOG), List.of(1), ModBlocks.BIRCH_LOG_SEAT, 2, true);
                createCarpentryRecipe(List.of(Blocks.CHERRY_LOG), List.of(1), ModBlocks.CHERRY_LOG_SEAT, 2, true);
                createCarpentryRecipe(List.of(Blocks.CRIMSON_STEM), List.of(1), ModBlocks.CRIMSON_STEM_SEAT, 2, true);
                createCarpentryRecipe(List.of(Blocks.DARK_OAK_LOG), List.of(1), ModBlocks.DARK_OAK_LOG_SEAT, 2, true);
                createCarpentryRecipe(List.of(Blocks.JUNGLE_LOG), List.of(1), ModBlocks.JUNGLE_LOG_SEAT, 2, true);
                createCarpentryRecipe(List.of(Blocks.MANGROVE_LOG), List.of(1), ModBlocks.MANGROVE_LOG_SEAT, 2, true);
                createCarpentryRecipe(List.of(Blocks.OAK_LOG), List.of(1), ModBlocks.OAK_LOG_SEAT, 2, true);
                createCarpentryRecipe(List.of(Blocks.SPRUCE_LOG), List.of(1), ModBlocks.SPRUCE_LOG_SEAT, 2, true);
                createCarpentryRecipe(List.of(Blocks.WARPED_STEM), List.of(1), ModBlocks.WARPED_STEM_SEAT, 2, true);

                createCarpentryRecipe(List.of(Blocks.ACACIA_PLANKS), List.of(2), ModBlocks.ACACIA_PARK_BENCH, 1, true);
                createCarpentryRecipe(List.of(Blocks.BAMBOO_PLANKS), List.of(2), ModBlocks.BAMBOO_PARK_BENCH, 1, true);
                createCarpentryRecipe(List.of(Blocks.BIRCH_PLANKS), List.of(2), ModBlocks.BIRCH_PARK_BENCH, 1, true);
                createCarpentryRecipe(List.of(Blocks.CHERRY_PLANKS), List.of(2), ModBlocks.CHERRY_PARK_BENCH, 1, true);
                createCarpentryRecipe(List.of(Blocks.CRIMSON_PLANKS), List.of(2), ModBlocks.CRIMSON_PARK_BENCH, 1, true);
                createCarpentryRecipe(List.of(Blocks.DARK_OAK_PLANKS), List.of(2), ModBlocks.DARK_OAK_PARK_BENCH, 1, true);
                createCarpentryRecipe(List.of(Blocks.JUNGLE_PLANKS), List.of(2), ModBlocks.JUNGLE_PARK_BENCH, 1, true);
                createCarpentryRecipe(List.of(Blocks.MANGROVE_PLANKS), List.of(2), ModBlocks.MANGROVE_PARK_BENCH, 1, true);
                createCarpentryRecipe(List.of(Blocks.OAK_PLANKS), List.of(2), ModBlocks.OAK_PARK_BENCH, 1, true);
                createCarpentryRecipe(List.of(Blocks.SPRUCE_PLANKS), List.of(2), ModBlocks.SPRUCE_PARK_BENCH, 1, true);
                createCarpentryRecipe(List.of(Blocks.WARPED_PLANKS), List.of(2), ModBlocks.WARPED_PARK_BENCH, 1, true);

                createCarpentryRecipe(List.of(Blocks.ACACIA_PLANKS), List.of(2), ModItems.ACACIA_CHAIR_LUKAS, 1, true);
                createCarpentryRecipe(List.of(Blocks.BAMBOO_PLANKS), List.of(2), ModItems.BAMBOO_CHAIR_LUKAS, 1, true);
                createCarpentryRecipe(List.of(Blocks.BIRCH_PLANKS), List.of(2), ModItems.BIRCH_CHAIR_LUKAS, 1, true);
                createCarpentryRecipe(List.of(Blocks.CHERRY_PLANKS), List.of(2), ModItems.CHERRY_CHAIR_LUKAS, 1, true);
                createCarpentryRecipe(List.of(Blocks.CRIMSON_PLANKS), List.of(2), ModItems.CRIMSON_CHAIR_LUKAS, 1, true);
                createCarpentryRecipe(List.of(Blocks.DARK_OAK_PLANKS), List.of(2), ModItems.DARK_OAK_CHAIR_LUKAS, 1, true);
                createCarpentryRecipe(List.of(Blocks.JUNGLE_PLANKS), List.of(2), ModItems.JUNGLE_CHAIR_LUKAS, 1, true);
                createCarpentryRecipe(List.of(Blocks.MANGROVE_PLANKS), List.of(2), ModItems.MANGROVE_CHAIR_LUKAS, 1, true);
                createCarpentryRecipe(List.of(Blocks.OAK_PLANKS), List.of(2), ModItems.OAK_CHAIR_LUKAS, 1, true);
                createCarpentryRecipe(List.of(Blocks.SPRUCE_PLANKS), List.of(2), ModItems.SPRUCE_CHAIR_LUKAS, 1, true);
                createCarpentryRecipe(List.of(Blocks.WARPED_PLANKS), List.of(2), ModItems.WARPED_CHAIR_LUKAS, 1, true);

                createCarpentryRecipe(List.of(Blocks.CHERRY_PLANKS), List.of(2), ModItems.CHERRY_GLASS_DOOR_FRAME, 2, true);

                createTableTheClassicRecipes();
                createStandingTableRecipes();
                createChairLukasNaturalRecipes();
                createCoffeeTableRecipes();
                createBarrelSeatRecipes();
                createChairTommyRecipes();
                createChairTommyNaturalRecipes();
                createChairGregoryRecipes();
                createBarberChairRecipes();
                createBarChairRecipes();
                createTablePascalRecipes();
                createPascalChairRecipes();
            }

            private void createTableTheClassicRecipes() {
                createCarpentryRecipe(List.of(Blocks.ACACIA_PLANKS), List.of(1), ModBlocks.ACACIA_TABLE_THE_CLASSIC, 1, true);
                createCarpentryRecipe(List.of(Blocks.BAMBOO_PLANKS), List.of(1), ModBlocks.BAMBOO_TABLE_THE_CLASSIC, 1, true);
                createCarpentryRecipe(List.of(Blocks.BIRCH_PLANKS), List.of(1), ModBlocks.BIRCH_TABLE_THE_CLASSIC, 1, true);
                createCarpentryRecipe(List.of(Blocks.CHERRY_PLANKS), List.of(1), ModBlocks.CHERRY_TABLE_THE_CLASSIC, 1, true);
                createCarpentryRecipe(List.of(Blocks.CRIMSON_PLANKS), List.of(1), ModBlocks.CRIMSON_TABLE_THE_CLASSIC, 1, true);
                createCarpentryRecipe(List.of(Blocks.DARK_OAK_PLANKS), List.of(1), ModBlocks.DARK_OAK_TABLE_THE_CLASSIC, 1, true);
                createCarpentryRecipe(List.of(Blocks.JUNGLE_PLANKS), List.of(1), ModBlocks.JUNGLE_TABLE_THE_CLASSIC, 1, true);
                createCarpentryRecipe(List.of(Blocks.MANGROVE_PLANKS), List.of(1), ModBlocks.MANGROVE_TABLE_THE_CLASSIC, 1, true);
                createCarpentryRecipe(List.of(Blocks.OAK_PLANKS), List.of(1), ModBlocks.OAK_TABLE_THE_CLASSIC, 1, true);
                createCarpentryRecipe(List.of(Blocks.SPRUCE_PLANKS), List.of(1), ModBlocks.SPRUCE_TABLE_THE_CLASSIC, 1, true);
                createCarpentryRecipe(List.of(Blocks.WARPED_PLANKS), List.of(1), ModBlocks.WARPED_TABLE_THE_CLASSIC, 1, true);
            }

            private void createTablePascalRecipes() {
                createCarpentryRecipe(List.of(Blocks.ACACIA_PLANKS, Blocks.IRON_BLOCK), List.of(1, 1), ModBlocks.ACACIA_COFFEE_TABLE_PASCAL, 4, true);
                createCarpentryRecipe(List.of(Blocks.BAMBOO_PLANKS, Blocks.IRON_BLOCK), List.of(1, 1), ModBlocks.BAMBOO_COFFEE_TABLE_PASCAL, 4, true);
                createCarpentryRecipe(List.of(Blocks.BIRCH_PLANKS, Blocks.IRON_BLOCK), List.of(1, 1), ModBlocks.BIRCH_COFFEE_TABLE_PASCAL, 4, true);
                createCarpentryRecipe(List.of(Blocks.CHERRY_PLANKS, Blocks.IRON_BLOCK), List.of(1, 1), ModBlocks.CHERRY_COFFEE_TABLE_PASCAL, 4, true);
                createCarpentryRecipe(List.of(Blocks.CRIMSON_PLANKS, Blocks.IRON_BLOCK), List.of(1, 1), ModBlocks.CRIMSON_COFFEE_TABLE_PASCAL, 4, true);
                createCarpentryRecipe(List.of(Blocks.DARK_OAK_PLANKS, Blocks.IRON_BLOCK), List.of(1, 1), ModBlocks.DARK_OAK_COFFEE_TABLE_PASCAL, 4, true);
                createCarpentryRecipe(List.of(Blocks.JUNGLE_PLANKS, Blocks.IRON_BLOCK), List.of(1, 1), ModBlocks.JUNGLE_COFFEE_TABLE_PASCAL, 4, true);
                createCarpentryRecipe(List.of(Blocks.MANGROVE_PLANKS, Blocks.IRON_BLOCK), List.of(1, 1), ModBlocks.MANGROVE_COFFEE_TABLE_PASCAL, 4, true);
                createCarpentryRecipe(List.of(Blocks.OAK_PLANKS, Blocks.IRON_BLOCK), List.of(1, 1), ModBlocks.OAK_COFFEE_TABLE_PASCAL, 4, true);
                createCarpentryRecipe(List.of(Blocks.SPRUCE_PLANKS, Blocks.IRON_BLOCK), List.of(1, 1), ModBlocks.SPRUCE_COFFEE_TABLE_PASCAL, 4, true);
                createCarpentryRecipe(List.of(Blocks.WARPED_PLANKS, Blocks.IRON_BLOCK), List.of(1, 1), ModBlocks.WARPED_COFFEE_TABLE_PASCAL, 4, true);
            }

            private void createStandingTableRecipes() {
                createCarpentryRecipe(List.of(Blocks.ACACIA_LOG), List.of(1), ModBlocks.ACACIA_STANDING_TABLE, 1, true);
                createCarpentryRecipe(List.of(Blocks.BAMBOO_BLOCK), List.of(1), ModBlocks.BAMBOO_STANDING_TABLE, 1, true);
                createCarpentryRecipe(List.of(Blocks.BIRCH_LOG), List.of(1), ModBlocks.BIRCH_STANDING_TABLE, 1, true);
                createCarpentryRecipe(List.of(Blocks.CHERRY_LOG), List.of(1), ModBlocks.CHERRY_STANDING_TABLE, 1, true);
                createCarpentryRecipe(List.of(Blocks.CRIMSON_STEM), List.of(1), ModBlocks.CRIMSON_STANDING_TABLE, 1, true);
                createCarpentryRecipe(List.of(Blocks.DARK_OAK_LOG), List.of(1), ModBlocks.DARK_OAK_STANDING_TABLE, 1, true);
                createCarpentryRecipe(List.of(Blocks.JUNGLE_LOG), List.of(1), ModBlocks.JUNGLE_STANDING_TABLE, 1, true);
                createCarpentryRecipe(List.of(Blocks.MANGROVE_LOG), List.of(1), ModBlocks.MANGROVE_STANDING_TABLE, 1, true);
                createCarpentryRecipe(List.of(Blocks.OAK_LOG), List.of(1), ModBlocks.OAK_STANDING_TABLE, 1, true);
                createCarpentryRecipe(List.of(Blocks.SPRUCE_LOG), List.of(1), ModBlocks.SPRUCE_STANDING_TABLE, 1, true);
                createCarpentryRecipe(List.of(Blocks.WARPED_STEM), List.of(1), ModBlocks.WARPED_STANDING_TABLE, 1, true);
            }

            private void createChairLukasNaturalRecipes() {
                createCarpentryRecipe(Blocks.ACACIA_PLANKS, ItemTags.ACACIA_LOGS, List.of(1, 1), ModItems.ACACIA_CHAIR_LUKAS_NATURAL, 1, true);
                createCarpentryRecipe(Blocks.BAMBOO_PLANKS, ItemTags.BAMBOO_BLOCKS, List.of(1, 1), ModItems.BAMBOO_CHAIR_LUKAS_NATURAL, 1, true);
                createCarpentryRecipe(Blocks.BIRCH_PLANKS, ItemTags.BIRCH_LOGS, List.of(1, 1), ModItems.BIRCH_CHAIR_LUKAS_NATURAL, 1, true);
                createCarpentryRecipe(Blocks.CHERRY_PLANKS, ItemTags.CHERRY_LOGS, List.of(1, 1), ModItems.CHERRY_CHAIR_LUKAS_NATURAL, 1, true);
                createCarpentryRecipe(Blocks.CRIMSON_PLANKS, ItemTags.CRIMSON_STEMS, List.of(1, 1), ModItems.CRIMSON_CHAIR_LUKAS_NATURAL, 1, true);
                createCarpentryRecipe(Blocks.DARK_OAK_PLANKS, ItemTags.DARK_OAK_LOGS, List.of(1, 1), ModItems.DARK_OAK_CHAIR_LUKAS_NATURAL, 1, true);
                createCarpentryRecipe(Blocks.JUNGLE_PLANKS, ItemTags.JUNGLE_LOGS, List.of(1, 1), ModItems.JUNGLE_CHAIR_LUKAS_NATURAL, 1, true);
                createCarpentryRecipe(Blocks.MANGROVE_PLANKS, ItemTags.MANGROVE_LOGS, List.of(1, 1), ModItems.MANGROVE_CHAIR_LUKAS_NATURAL, 1, true);
                createCarpentryRecipe(Blocks.OAK_PLANKS, ItemTags.OAK_LOGS, List.of(1, 1), ModItems.OAK_CHAIR_LUKAS_NATURAL, 1, true);
                createCarpentryRecipe(Blocks.SPRUCE_PLANKS, ItemTags.SPRUCE_LOGS, List.of(1, 1), ModItems.SPRUCE_CHAIR_LUKAS_NATURAL, 1, true);
                createCarpentryRecipe(Blocks.WARPED_PLANKS, ItemTags.WARPED_STEMS, List.of(1, 1), ModItems.WARPED_CHAIR_LUKAS_NATURAL, 1, true);
            }

            private void createChairTommyRecipes() {
                createCarpentryRecipe(List.of(Blocks.ACACIA_PLANKS), List.of(2), ModItems.ACACIA_CHAIR_TOMMY, 1, true);
                createCarpentryRecipe(List.of(Blocks.BAMBOO_PLANKS), List.of(2), ModItems.BAMBOO_CHAIR_TOMMY, 1, true);
                createCarpentryRecipe(List.of(Blocks.BIRCH_PLANKS), List.of(2), ModItems.BIRCH_CHAIR_TOMMY, 1, true);
                createCarpentryRecipe(List.of(Blocks.CHERRY_PLANKS), List.of(2), ModItems.CHERRY_CHAIR_TOMMY, 1, true);
                createCarpentryRecipe(List.of(Blocks.CRIMSON_PLANKS), List.of(2), ModItems.CRIMSON_CHAIR_TOMMY, 1, true);
                createCarpentryRecipe(List.of(Blocks.DARK_OAK_PLANKS), List.of(2), ModItems.DARK_OAK_CHAIR_TOMMY, 1, true);
                createCarpentryRecipe(List.of(Blocks.JUNGLE_PLANKS), List.of(2), ModItems.JUNGLE_CHAIR_TOMMY, 1, true);
                createCarpentryRecipe(List.of(Blocks.MANGROVE_PLANKS), List.of(2), ModItems.MANGROVE_CHAIR_TOMMY, 1, true);
                createCarpentryRecipe(List.of(Blocks.OAK_PLANKS), List.of(2), ModItems.OAK_CHAIR_TOMMY, 1, true);
                createCarpentryRecipe(List.of(Blocks.SPRUCE_PLANKS), List.of(2), ModItems.SPRUCE_CHAIR_TOMMY, 1, true);
                createCarpentryRecipe(List.of(Blocks.WARPED_PLANKS), List.of(2), ModItems.WARPED_CHAIR_TOMMY, 1, true);
            }

            private void createChairTommyNaturalRecipes() {
                createCarpentryRecipe(Blocks.ACACIA_PLANKS, ItemTags.ACACIA_LOGS, List.of(1, 1), ModItems.ACACIA_CHAIR_TOMMY_NATURAL, 1, true);
                createCarpentryRecipe(Blocks.BAMBOO_PLANKS, ItemTags.BAMBOO_BLOCKS, List.of(1, 1), ModItems.BAMBOO_CHAIR_TOMMY_NATURAL, 1, true);
                createCarpentryRecipe(Blocks.BIRCH_PLANKS, ItemTags.BIRCH_LOGS, List.of(1, 1), ModItems.BIRCH_CHAIR_TOMMY_NATURAL, 1, true);
                createCarpentryRecipe(Blocks.CHERRY_PLANKS, ItemTags.CHERRY_LOGS, List.of(1, 1), ModItems.CHERRY_CHAIR_TOMMY_NATURAL, 1, true);
                createCarpentryRecipe(Blocks.CRIMSON_PLANKS, ItemTags.CRIMSON_STEMS, List.of(1, 1), ModItems.CRIMSON_CHAIR_TOMMY_NATURAL, 1, true);
                createCarpentryRecipe(Blocks.DARK_OAK_PLANKS, ItemTags.DARK_OAK_LOGS, List.of(1, 1), ModItems.DARK_OAK_CHAIR_TOMMY_NATURAL, 1, true);
                createCarpentryRecipe(Blocks.JUNGLE_PLANKS, ItemTags.JUNGLE_LOGS, List.of(1, 1), ModItems.JUNGLE_CHAIR_TOMMY_NATURAL, 1, true);
                createCarpentryRecipe(Blocks.MANGROVE_PLANKS, ItemTags.MANGROVE_LOGS, List.of(1, 1), ModItems.MANGROVE_CHAIR_TOMMY_NATURAL, 1, true);
                createCarpentryRecipe(Blocks.OAK_PLANKS, ItemTags.OAK_LOGS, List.of(1, 1), ModItems.OAK_CHAIR_TOMMY_NATURAL, 1, true);
                createCarpentryRecipe(Blocks.SPRUCE_PLANKS, ItemTags.SPRUCE_LOGS, List.of(1, 1), ModItems.SPRUCE_CHAIR_TOMMY_NATURAL, 1, true);
                createCarpentryRecipe(Blocks.WARPED_PLANKS, ItemTags.WARPED_STEMS, List.of(1, 1), ModItems.WARPED_CHAIR_TOMMY_NATURAL, 1, true);
            }

            private void createCoffeeTableRecipes() {
                createCarpentryRecipe(Blocks.ACACIA_PLANKS, ItemTags.ACACIA_LOGS, List.of(1, 1), ModItems.ACACIA_COFFEE_TABLE, 2, true);
                createCarpentryRecipe(Blocks.BAMBOO_PLANKS, ItemTags.BAMBOO_BLOCKS, List.of(1, 1), ModItems.BAMBOO_COFFEE_TABLE, 2, true);
                createCarpentryRecipe(Blocks.BIRCH_PLANKS, ItemTags.BIRCH_LOGS, List.of(1, 1), ModItems.BIRCH_COFFEE_TABLE, 2, true);
                createCarpentryRecipe(Blocks.CHERRY_PLANKS, ItemTags.CHERRY_LOGS, List.of(1, 1), ModItems.CHERRY_COFFEE_TABLE, 2, true);
                createCarpentryRecipe(Blocks.CRIMSON_PLANKS, ItemTags.CRIMSON_STEMS, List.of(1, 1), ModItems.CRIMSON_COFFEE_TABLE, 2, true);
                createCarpentryRecipe(Blocks.DARK_OAK_PLANKS, ItemTags.DARK_OAK_LOGS, List.of(1, 1), ModItems.DARK_OAK_COFFEE_TABLE, 2, true);
                createCarpentryRecipe(Blocks.JUNGLE_PLANKS, ItemTags.JUNGLE_LOGS, List.of(1, 1), ModItems.JUNGLE_COFFEE_TABLE, 2, true);
                createCarpentryRecipe(Blocks.MANGROVE_PLANKS, ItemTags.MANGROVE_LOGS, List.of(1, 1), ModItems.MANGROVE_COFFEE_TABLE, 2, true);
                createCarpentryRecipe(Blocks.OAK_PLANKS, ItemTags.OAK_LOGS, List.of(1, 1), ModItems.OAK_COFFEE_TABLE, 2, true);
                createCarpentryRecipe(Blocks.SPRUCE_PLANKS, ItemTags.SPRUCE_LOGS, List.of(1, 1), ModItems.SPRUCE_COFFEE_TABLE, 2, true);
                createCarpentryRecipe(Blocks.WARPED_PLANKS, ItemTags.WARPED_STEMS, List.of(1, 1), ModItems.WARPED_COFFEE_TABLE, 2, true);
            }

            private void createBarrelSeatRecipes() {
                createCarpentryRecipe(List.of(Blocks.ACACIA_PLANKS, Items.IRON_INGOT), List.of(1, 1), ModItems.ACACIA_BARREL_SEAT, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.BAMBOO_PLANKS, Items.IRON_INGOT), List.of(1, 1), ModItems.BAMBOO_BARREL_SEAT, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.BIRCH_PLANKS, Items.IRON_INGOT), List.of(1, 1), ModItems.BIRCH_BARREL_SEAT, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.CHERRY_PLANKS, Items.IRON_INGOT), List.of(1, 1), ModItems.CHERRY_BARREL_SEAT, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.CRIMSON_PLANKS, Items.IRON_INGOT), List.of(1, 1), ModItems.CRIMSON_BARREL_SEAT, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.DARK_OAK_PLANKS, Items.IRON_INGOT), List.of(1, 1), ModItems.DARK_OAK_BARREL_SEAT, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.JUNGLE_PLANKS, Items.IRON_INGOT), List.of(1, 1), ModItems.JUNGLE_BARREL_SEAT, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.MANGROVE_PLANKS, Items.IRON_INGOT), List.of(1, 1), ModItems.MANGROVE_BARREL_SEAT, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.OAK_PLANKS, Items.IRON_INGOT), List.of(1, 1), ModItems.OAK_BARREL_SEAT, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.SPRUCE_PLANKS, Items.IRON_INGOT), List.of(1, 1), ModItems.SPRUCE_BARREL_SEAT, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.WARPED_PLANKS, Items.IRON_INGOT), List.of(1, 1), ModItems.WARPED_BARREL_SEAT, 1, true)
                ;
            }

            private void createChairGregoryRecipes() {
                createCarpentryRecipe(Blocks.ACACIA_PLANKS, ItemTags.ACACIA_LOGS, List.of(1, 1), ModItems.ACACIA_CHAIR_GREGORY, 1, true);
                createCarpentryRecipe(Blocks.BAMBOO_PLANKS, ItemTags.BAMBOO_BLOCKS, List.of(1, 1), ModItems.BAMBOO_CHAIR_GREGORY, 1, true);
                createCarpentryRecipe(Blocks.BIRCH_PLANKS, ItemTags.BIRCH_LOGS, List.of(1, 1), ModItems.BIRCH_CHAIR_GREGORY, 1, true);
                createCarpentryRecipe(Blocks.CHERRY_PLANKS, ItemTags.CHERRY_LOGS, List.of(1, 1), ModItems.CHERRY_CHAIR_GREGORY, 1, true);
                createCarpentryRecipe(Blocks.CRIMSON_PLANKS, ItemTags.CRIMSON_STEMS, List.of(1, 1), ModItems.CRIMSON_CHAIR_GREGORY, 1, true);
                createCarpentryRecipe(Blocks.DARK_OAK_PLANKS, ItemTags.DARK_OAK_LOGS, List.of(1, 1), ModItems.DARK_OAK_CHAIR_GREGORY, 1, true);
                createCarpentryRecipe(Blocks.JUNGLE_PLANKS, ItemTags.JUNGLE_LOGS, List.of(1, 1), ModItems.JUNGLE_CHAIR_GREGORY, 1, true);
                createCarpentryRecipe(Blocks.MANGROVE_PLANKS, ItemTags.MANGROVE_LOGS, List.of(1, 1), ModItems.MANGROVE_CHAIR_GREGORY, 1, true);
                createCarpentryRecipe(Blocks.OAK_PLANKS, ItemTags.OAK_LOGS, List.of(1, 1), ModItems.OAK_CHAIR_GREGORY, 1, true);
                createCarpentryRecipe(Blocks.SPRUCE_PLANKS, ItemTags.SPRUCE_LOGS, List.of(1, 1), ModItems.SPRUCE_CHAIR_GREGORY, 1, true);
                createCarpentryRecipe(Blocks.WARPED_PLANKS, ItemTags.WARPED_STEMS, List.of(1, 1), ModItems.WARPED_CHAIR_GREGORY, 1, true);
            }

            private void createBarberChairRecipes() {
                createCarpentryRecipe(List.of(Blocks.WHITE_WOOL, Blocks.GOLD_BLOCK), List.of(1, 1), ModItems.WHITE_BARBER_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.LIGHT_GRAY_WOOL, Blocks.GOLD_BLOCK), List.of(1, 1), ModItems.LIGHT_GRAY_BARBER_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.GRAY_WOOL, Blocks.GOLD_BLOCK), List.of(1, 1), ModItems.GRAY_BARBER_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.BLACK_WOOL, Blocks.GOLD_BLOCK), List.of(1, 1), ModItems.BLACK_BARBER_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.BROWN_WOOL, Blocks.GOLD_BLOCK), List.of(1, 1), ModItems.BROWN_BARBER_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.RED_WOOL, Blocks.GOLD_BLOCK), List.of(1, 1), ModItems.RED_BARBER_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.ORANGE_WOOL, Blocks.GOLD_BLOCK), List.of(1, 1), ModItems.ORANGE_BARBER_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.YELLOW_WOOL, Blocks.GOLD_BLOCK), List.of(1, 1), ModItems.YELLOW_BARBER_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.LIME_WOOL, Blocks.GOLD_BLOCK), List.of(1, 1), ModItems.LIME_BARBER_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.GREEN_WOOL, Blocks.GOLD_BLOCK), List.of(1, 1), ModItems.GREEN_BARBER_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.CYAN_WOOL, Blocks.GOLD_BLOCK), List.of(1, 1), ModItems.CYAN_BARBER_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.LIGHT_BLUE_WOOL, Blocks.GOLD_BLOCK), List.of(1, 1), ModItems.LIGHT_BLUE_BARBER_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.BLUE_WOOL, Blocks.GOLD_BLOCK), List.of(1, 1), ModItems.BLUE_BARBER_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.PURPLE_WOOL, Blocks.GOLD_BLOCK), List.of(1, 1), ModItems.PURPLE_BARBER_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.MAGENTA_WOOL, Blocks.GOLD_BLOCK), List.of(1, 1), ModItems.MAGENTA_BARBER_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.PINK_WOOL, Blocks.GOLD_BLOCK), List.of(1, 1), ModItems.PINK_BARBER_CHAIR, 1, true)
                ;
            }

            private void createBarChairRecipes() {
                createCarpentryRecipe(List.of(Blocks.WHITE_WOOL, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.WHITE_BAR_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.LIGHT_GRAY_WOOL, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.LIGHT_GRAY_BAR_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.GRAY_WOOL, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.GRAY_BAR_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.BLACK_WOOL, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.BLACK_BAR_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.BROWN_WOOL, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.BROWN_BAR_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.RED_WOOL, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.RED_BAR_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.ORANGE_WOOL, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.ORANGE_BAR_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.YELLOW_WOOL, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.YELLOW_BAR_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.LIME_WOOL, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.LIME_BAR_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.GREEN_WOOL, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.GREEN_BAR_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.CYAN_WOOL, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.CYAN_BAR_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.LIGHT_BLUE_WOOL, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.LIGHT_BLUE_BAR_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.BLUE_WOOL, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.BLUE_BAR_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.PURPLE_WOOL, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.PURPLE_BAR_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.MAGENTA_WOOL, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.MAGENTA_BAR_CHAIR, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.PINK_WOOL, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.PINK_BAR_CHAIR, 1, true)
                ;
            }

            private void createPascalChairRecipes() {
                createCarpentryRecipe(List.of(Blocks.ACACIA_PLANKS, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.ACACIA_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.ACACIA_CHAIR_PASCAL, Blocks.WHITE_WOOL), List.of(1, 1), ModItems.ACACIA_WHITE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.ACACIA_CHAIR_PASCAL, Blocks.LIGHT_GRAY_WOOL), List.of(1, 1), ModItems.ACACIA_LIGHT_GRAY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.ACACIA_CHAIR_PASCAL, Blocks.GRAY_WOOL), List.of(1, 1), ModItems.ACACIA_GRAY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.ACACIA_CHAIR_PASCAL, Blocks.BLACK_WOOL), List.of(1, 1), ModItems.ACACIA_BLACK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.ACACIA_CHAIR_PASCAL, Blocks.BROWN_WOOL), List.of(1, 1), ModItems.ACACIA_BROWN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.ACACIA_CHAIR_PASCAL, Blocks.RED_WOOL), List.of(1, 1), ModItems.ACACIA_RED_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.ACACIA_CHAIR_PASCAL, Blocks.ORANGE_WOOL), List.of(1, 1), ModItems.ACACIA_ORANGE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.ACACIA_CHAIR_PASCAL, Blocks.YELLOW_WOOL), List.of(1, 1), ModItems.ACACIA_YELLOW_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.ACACIA_CHAIR_PASCAL, Blocks.LIME_WOOL), List.of(1, 1), ModItems.ACACIA_LIME_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.ACACIA_CHAIR_PASCAL, Blocks.GREEN_WOOL), List.of(1, 1), ModItems.ACACIA_GREEN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.ACACIA_CHAIR_PASCAL, Blocks.CYAN_WOOL), List.of(1, 1), ModItems.ACACIA_CYAN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.ACACIA_CHAIR_PASCAL, Blocks.LIGHT_BLUE_WOOL), List.of(1, 1), ModItems.ACACIA_LIGHT_BLUE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.ACACIA_CHAIR_PASCAL, Blocks.BLUE_WOOL), List.of(1, 1), ModItems.ACACIA_BLUE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.ACACIA_CHAIR_PASCAL, Blocks.PURPLE_WOOL), List.of(1, 1), ModItems.ACACIA_PURPLE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.ACACIA_CHAIR_PASCAL, Blocks.MAGENTA_WOOL), List.of(1, 1), ModItems.ACACIA_MAGENTA_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.ACACIA_CHAIR_PASCAL, Blocks.PINK_WOOL), List.of(1, 1), ModItems.ACACIA_PINK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.BAMBOO_PLANKS, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.BAMBOO_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BAMBOO_CHAIR_PASCAL, Blocks.WHITE_WOOL), List.of(1, 1), ModItems.BAMBOO_WHITE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BAMBOO_CHAIR_PASCAL, Blocks.LIGHT_GRAY_WOOL), List.of(1, 1), ModItems.BAMBOO_LIGHT_GRAY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BAMBOO_CHAIR_PASCAL, Blocks.GRAY_WOOL), List.of(1, 1), ModItems.BAMBOO_GRAY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BAMBOO_CHAIR_PASCAL, Blocks.BLACK_WOOL), List.of(1, 1), ModItems.BAMBOO_BLACK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BAMBOO_CHAIR_PASCAL, Blocks.BROWN_WOOL), List.of(1, 1), ModItems.BAMBOO_BROWN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BAMBOO_CHAIR_PASCAL, Blocks.RED_WOOL), List.of(1, 1), ModItems.BAMBOO_RED_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BAMBOO_CHAIR_PASCAL, Blocks.ORANGE_WOOL), List.of(1, 1), ModItems.BAMBOO_ORANGE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BAMBOO_CHAIR_PASCAL, Blocks.YELLOW_WOOL), List.of(1, 1), ModItems.BAMBOO_YELLOW_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BAMBOO_CHAIR_PASCAL, Blocks.LIME_WOOL), List.of(1, 1), ModItems.BAMBOO_LIME_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BAMBOO_CHAIR_PASCAL, Blocks.GREEN_WOOL), List.of(1, 1), ModItems.BAMBOO_GREEN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BAMBOO_CHAIR_PASCAL, Blocks.CYAN_WOOL), List.of(1, 1), ModItems.BAMBOO_CYAN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BAMBOO_CHAIR_PASCAL, Blocks.LIGHT_BLUE_WOOL), List.of(1, 1), ModItems.BAMBOO_LIGHT_BLUE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BAMBOO_CHAIR_PASCAL, Blocks.BLUE_WOOL), List.of(1, 1), ModItems.BAMBOO_BLUE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BAMBOO_CHAIR_PASCAL, Blocks.PURPLE_WOOL), List.of(1, 1), ModItems.BAMBOO_PURPLE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BAMBOO_CHAIR_PASCAL, Blocks.MAGENTA_WOOL), List.of(1, 1), ModItems.BAMBOO_MAGENTA_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BAMBOO_CHAIR_PASCAL, Blocks.PINK_WOOL), List.of(1, 1), ModItems.BAMBOO_PINK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.BIRCH_PLANKS, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.BIRCH_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BIRCH_CHAIR_PASCAL, Blocks.WHITE_WOOL), List.of(1, 1), ModItems.BIRCH_WHITE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BIRCH_CHAIR_PASCAL, Blocks.LIGHT_GRAY_WOOL), List.of(1, 1), ModItems.BIRCH_LIGHT_GRAY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BIRCH_CHAIR_PASCAL, Blocks.GRAY_WOOL), List.of(1, 1), ModItems.BIRCH_GRAY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BIRCH_CHAIR_PASCAL, Blocks.BLACK_WOOL), List.of(1, 1), ModItems.BIRCH_BLACK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BIRCH_CHAIR_PASCAL, Blocks.BROWN_WOOL), List.of(1, 1), ModItems.BIRCH_BROWN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BIRCH_CHAIR_PASCAL, Blocks.RED_WOOL), List.of(1, 1), ModItems.BIRCH_RED_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BIRCH_CHAIR_PASCAL, Blocks.ORANGE_WOOL), List.of(1, 1), ModItems.BIRCH_ORANGE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BIRCH_CHAIR_PASCAL, Blocks.YELLOW_WOOL), List.of(1, 1), ModItems.BIRCH_YELLOW_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BIRCH_CHAIR_PASCAL, Blocks.LIME_WOOL), List.of(1, 1), ModItems.BIRCH_LIME_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BIRCH_CHAIR_PASCAL, Blocks.GREEN_WOOL), List.of(1, 1), ModItems.BIRCH_GREEN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BIRCH_CHAIR_PASCAL, Blocks.CYAN_WOOL), List.of(1, 1), ModItems.BIRCH_CYAN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BIRCH_CHAIR_PASCAL, Blocks.LIGHT_BLUE_WOOL), List.of(1, 1), ModItems.BIRCH_LIGHT_BLUE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BIRCH_CHAIR_PASCAL, Blocks.BLUE_WOOL), List.of(1, 1), ModItems.BIRCH_BLUE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BIRCH_CHAIR_PASCAL, Blocks.PURPLE_WOOL), List.of(1, 1), ModItems.BIRCH_PURPLE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BIRCH_CHAIR_PASCAL, Blocks.MAGENTA_WOOL), List.of(1, 1), ModItems.BIRCH_MAGENTA_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.BIRCH_CHAIR_PASCAL, Blocks.PINK_WOOL), List.of(1, 1), ModItems.BIRCH_PINK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.CHERRY_PLANKS, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.CHERRY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CHERRY_CHAIR_PASCAL, Blocks.WHITE_WOOL), List.of(1, 1), ModItems.CHERRY_WHITE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CHERRY_CHAIR_PASCAL, Blocks.LIGHT_GRAY_WOOL), List.of(1, 1), ModItems.CHERRY_LIGHT_GRAY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CHERRY_CHAIR_PASCAL, Blocks.GRAY_WOOL), List.of(1, 1), ModItems.CHERRY_GRAY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CHERRY_CHAIR_PASCAL, Blocks.BLACK_WOOL), List.of(1, 1), ModItems.CHERRY_BLACK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CHERRY_CHAIR_PASCAL, Blocks.BROWN_WOOL), List.of(1, 1), ModItems.CHERRY_BROWN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CHERRY_CHAIR_PASCAL, Blocks.RED_WOOL), List.of(1, 1), ModItems.CHERRY_RED_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CHERRY_CHAIR_PASCAL, Blocks.ORANGE_WOOL), List.of(1, 1), ModItems.CHERRY_ORANGE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CHERRY_CHAIR_PASCAL, Blocks.YELLOW_WOOL), List.of(1, 1), ModItems.CHERRY_YELLOW_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CHERRY_CHAIR_PASCAL, Blocks.LIME_WOOL), List.of(1, 1), ModItems.CHERRY_LIME_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CHERRY_CHAIR_PASCAL, Blocks.GREEN_WOOL), List.of(1, 1), ModItems.CHERRY_GREEN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CHERRY_CHAIR_PASCAL, Blocks.CYAN_WOOL), List.of(1, 1), ModItems.CHERRY_CYAN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CHERRY_CHAIR_PASCAL, Blocks.LIGHT_BLUE_WOOL), List.of(1, 1), ModItems.CHERRY_LIGHT_BLUE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CHERRY_CHAIR_PASCAL, Blocks.BLUE_WOOL), List.of(1, 1), ModItems.CHERRY_BLUE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CHERRY_CHAIR_PASCAL, Blocks.PURPLE_WOOL), List.of(1, 1), ModItems.CHERRY_PURPLE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CHERRY_CHAIR_PASCAL, Blocks.MAGENTA_WOOL), List.of(1, 1), ModItems.CHERRY_MAGENTA_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CHERRY_CHAIR_PASCAL, Blocks.PINK_WOOL), List.of(1, 1), ModItems.CHERRY_PINK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.CRIMSON_PLANKS, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.CRIMSON_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CRIMSON_CHAIR_PASCAL, Blocks.WHITE_WOOL), List.of(1, 1), ModItems.CRIMSON_WHITE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CRIMSON_CHAIR_PASCAL, Blocks.LIGHT_GRAY_WOOL), List.of(1, 1), ModItems.CRIMSON_LIGHT_GRAY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CRIMSON_CHAIR_PASCAL, Blocks.GRAY_WOOL), List.of(1, 1), ModItems.CRIMSON_GRAY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CRIMSON_CHAIR_PASCAL, Blocks.BLACK_WOOL), List.of(1, 1), ModItems.CRIMSON_BLACK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CRIMSON_CHAIR_PASCAL, Blocks.BROWN_WOOL), List.of(1, 1), ModItems.CRIMSON_BROWN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CRIMSON_CHAIR_PASCAL, Blocks.RED_WOOL), List.of(1, 1), ModItems.CRIMSON_RED_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CRIMSON_CHAIR_PASCAL, Blocks.ORANGE_WOOL), List.of(1, 1), ModItems.CRIMSON_ORANGE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CRIMSON_CHAIR_PASCAL, Blocks.YELLOW_WOOL), List.of(1, 1), ModItems.CRIMSON_YELLOW_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CRIMSON_CHAIR_PASCAL, Blocks.LIME_WOOL), List.of(1, 1), ModItems.CRIMSON_LIME_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CRIMSON_CHAIR_PASCAL, Blocks.GREEN_WOOL), List.of(1, 1), ModItems.CRIMSON_GREEN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CRIMSON_CHAIR_PASCAL, Blocks.CYAN_WOOL), List.of(1, 1), ModItems.CRIMSON_CYAN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CRIMSON_CHAIR_PASCAL, Blocks.LIGHT_BLUE_WOOL), List.of(1, 1), ModItems.CRIMSON_LIGHT_BLUE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CRIMSON_CHAIR_PASCAL, Blocks.BLUE_WOOL), List.of(1, 1), ModItems.CRIMSON_BLUE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CRIMSON_CHAIR_PASCAL, Blocks.PURPLE_WOOL), List.of(1, 1), ModItems.CRIMSON_PURPLE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CRIMSON_CHAIR_PASCAL, Blocks.MAGENTA_WOOL), List.of(1, 1), ModItems.CRIMSON_MAGENTA_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.CRIMSON_CHAIR_PASCAL, Blocks.PINK_WOOL), List.of(1, 1), ModItems.CRIMSON_PINK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.DARK_OAK_PLANKS, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.DARK_OAK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, Blocks.WHITE_WOOL), List.of(1, 1), ModItems.DARK_OAK_WHITE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, Blocks.LIGHT_GRAY_WOOL), List.of(1, 1), ModItems.DARK_OAK_LIGHT_GRAY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, Blocks.GRAY_WOOL), List.of(1, 1), ModItems.DARK_OAK_GRAY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, Blocks.BLACK_WOOL), List.of(1, 1), ModItems.DARK_OAK_BLACK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, Blocks.BROWN_WOOL), List.of(1, 1), ModItems.DARK_OAK_BROWN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, Blocks.RED_WOOL), List.of(1, 1), ModItems.DARK_OAK_RED_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, Blocks.ORANGE_WOOL), List.of(1, 1), ModItems.DARK_OAK_ORANGE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, Blocks.YELLOW_WOOL), List.of(1, 1), ModItems.DARK_OAK_YELLOW_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, Blocks.LIME_WOOL), List.of(1, 1), ModItems.DARK_OAK_LIME_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, Blocks.GREEN_WOOL), List.of(1, 1), ModItems.DARK_OAK_GREEN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, Blocks.CYAN_WOOL), List.of(1, 1), ModItems.DARK_OAK_CYAN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, Blocks.LIGHT_BLUE_WOOL), List.of(1, 1), ModItems.DARK_OAK_LIGHT_BLUE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, Blocks.BLUE_WOOL), List.of(1, 1), ModItems.DARK_OAK_BLUE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, Blocks.PURPLE_WOOL), List.of(1, 1), ModItems.DARK_OAK_PURPLE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, Blocks.MAGENTA_WOOL), List.of(1, 1), ModItems.DARK_OAK_MAGENTA_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.DARK_OAK_CHAIR_PASCAL, Blocks.PINK_WOOL), List.of(1, 1), ModItems.DARK_OAK_PINK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.JUNGLE_PLANKS, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.JUNGLE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.JUNGLE_CHAIR_PASCAL, Blocks.WHITE_WOOL), List.of(1, 1), ModItems.JUNGLE_WHITE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.JUNGLE_CHAIR_PASCAL, Blocks.LIGHT_GRAY_WOOL), List.of(1, 1), ModItems.JUNGLE_LIGHT_GRAY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.JUNGLE_CHAIR_PASCAL, Blocks.GRAY_WOOL), List.of(1, 1), ModItems.JUNGLE_GRAY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.JUNGLE_CHAIR_PASCAL, Blocks.BLACK_WOOL), List.of(1, 1), ModItems.JUNGLE_BLACK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.JUNGLE_CHAIR_PASCAL, Blocks.BROWN_WOOL), List.of(1, 1), ModItems.JUNGLE_BROWN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.JUNGLE_CHAIR_PASCAL, Blocks.RED_WOOL), List.of(1, 1), ModItems.JUNGLE_RED_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.JUNGLE_CHAIR_PASCAL, Blocks.ORANGE_WOOL), List.of(1, 1), ModItems.JUNGLE_ORANGE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.JUNGLE_CHAIR_PASCAL, Blocks.YELLOW_WOOL), List.of(1, 1), ModItems.JUNGLE_YELLOW_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.JUNGLE_CHAIR_PASCAL, Blocks.LIME_WOOL), List.of(1, 1), ModItems.JUNGLE_LIME_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.JUNGLE_CHAIR_PASCAL, Blocks.GREEN_WOOL), List.of(1, 1), ModItems.JUNGLE_GREEN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.JUNGLE_CHAIR_PASCAL, Blocks.CYAN_WOOL), List.of(1, 1), ModItems.JUNGLE_CYAN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.JUNGLE_CHAIR_PASCAL, Blocks.LIGHT_BLUE_WOOL), List.of(1, 1), ModItems.JUNGLE_LIGHT_BLUE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.JUNGLE_CHAIR_PASCAL, Blocks.BLUE_WOOL), List.of(1, 1), ModItems.JUNGLE_BLUE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.JUNGLE_CHAIR_PASCAL, Blocks.PURPLE_WOOL), List.of(1, 1), ModItems.JUNGLE_PURPLE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.JUNGLE_CHAIR_PASCAL, Blocks.MAGENTA_WOOL), List.of(1, 1), ModItems.JUNGLE_MAGENTA_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.JUNGLE_CHAIR_PASCAL, Blocks.PINK_WOOL), List.of(1, 1), ModItems.JUNGLE_PINK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.MANGROVE_PLANKS, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.MANGROVE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.MANGROVE_CHAIR_PASCAL, Blocks.WHITE_WOOL), List.of(1, 1), ModItems.MANGROVE_WHITE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.MANGROVE_CHAIR_PASCAL, Blocks.LIGHT_GRAY_WOOL), List.of(1, 1), ModItems.MANGROVE_LIGHT_GRAY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.MANGROVE_CHAIR_PASCAL, Blocks.GRAY_WOOL), List.of(1, 1), ModItems.MANGROVE_GRAY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.MANGROVE_CHAIR_PASCAL, Blocks.BLACK_WOOL), List.of(1, 1), ModItems.MANGROVE_BLACK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.MANGROVE_CHAIR_PASCAL, Blocks.BROWN_WOOL), List.of(1, 1), ModItems.MANGROVE_BROWN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.MANGROVE_CHAIR_PASCAL, Blocks.RED_WOOL), List.of(1, 1), ModItems.MANGROVE_RED_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.MANGROVE_CHAIR_PASCAL, Blocks.ORANGE_WOOL), List.of(1, 1), ModItems.MANGROVE_ORANGE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.MANGROVE_CHAIR_PASCAL, Blocks.YELLOW_WOOL), List.of(1, 1), ModItems.MANGROVE_YELLOW_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.MANGROVE_CHAIR_PASCAL, Blocks.LIME_WOOL), List.of(1, 1), ModItems.MANGROVE_LIME_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.MANGROVE_CHAIR_PASCAL, Blocks.GREEN_WOOL), List.of(1, 1), ModItems.MANGROVE_GREEN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.MANGROVE_CHAIR_PASCAL, Blocks.CYAN_WOOL), List.of(1, 1), ModItems.MANGROVE_CYAN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.MANGROVE_CHAIR_PASCAL, Blocks.LIGHT_BLUE_WOOL), List.of(1, 1), ModItems.MANGROVE_LIGHT_BLUE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.MANGROVE_CHAIR_PASCAL, Blocks.BLUE_WOOL), List.of(1, 1), ModItems.MANGROVE_BLUE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.MANGROVE_CHAIR_PASCAL, Blocks.PURPLE_WOOL), List.of(1, 1), ModItems.MANGROVE_PURPLE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.MANGROVE_CHAIR_PASCAL, Blocks.MAGENTA_WOOL), List.of(1, 1), ModItems.MANGROVE_MAGENTA_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.MANGROVE_CHAIR_PASCAL, Blocks.PINK_WOOL), List.of(1, 1), ModItems.MANGROVE_PINK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.OAK_PLANKS, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.OAK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.OAK_CHAIR_PASCAL, Blocks.WHITE_WOOL), List.of(1, 1), ModItems.OAK_WHITE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.OAK_CHAIR_PASCAL, Blocks.LIGHT_GRAY_WOOL), List.of(1, 1), ModItems.OAK_LIGHT_GRAY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.OAK_CHAIR_PASCAL, Blocks.GRAY_WOOL), List.of(1, 1), ModItems.OAK_GRAY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.OAK_CHAIR_PASCAL, Blocks.BLACK_WOOL), List.of(1, 1), ModItems.OAK_BLACK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.OAK_CHAIR_PASCAL, Blocks.BROWN_WOOL), List.of(1, 1), ModItems.OAK_BROWN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.OAK_CHAIR_PASCAL, Blocks.RED_WOOL), List.of(1, 1), ModItems.OAK_RED_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.OAK_CHAIR_PASCAL, Blocks.ORANGE_WOOL), List.of(1, 1), ModItems.OAK_ORANGE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.OAK_CHAIR_PASCAL, Blocks.YELLOW_WOOL), List.of(1, 1), ModItems.OAK_YELLOW_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.OAK_CHAIR_PASCAL, Blocks.LIME_WOOL), List.of(1, 1), ModItems.OAK_LIME_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.OAK_CHAIR_PASCAL, Blocks.GREEN_WOOL), List.of(1, 1), ModItems.OAK_GREEN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.OAK_CHAIR_PASCAL, Blocks.CYAN_WOOL), List.of(1, 1), ModItems.OAK_CYAN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.OAK_CHAIR_PASCAL, Blocks.LIGHT_BLUE_WOOL), List.of(1, 1), ModItems.OAK_LIGHT_BLUE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.OAK_CHAIR_PASCAL, Blocks.BLUE_WOOL), List.of(1, 1), ModItems.OAK_BLUE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.OAK_CHAIR_PASCAL, Blocks.PURPLE_WOOL), List.of(1, 1), ModItems.OAK_PURPLE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.OAK_CHAIR_PASCAL, Blocks.MAGENTA_WOOL), List.of(1, 1), ModItems.OAK_MAGENTA_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.OAK_CHAIR_PASCAL, Blocks.PINK_WOOL), List.of(1, 1), ModItems.OAK_PINK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.SPRUCE_PLANKS, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.SPRUCE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.SPRUCE_CHAIR_PASCAL, Blocks.WHITE_WOOL), List.of(1, 1), ModItems.SPRUCE_WHITE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.SPRUCE_CHAIR_PASCAL, Blocks.LIGHT_GRAY_WOOL), List.of(1, 1), ModItems.SPRUCE_LIGHT_GRAY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.SPRUCE_CHAIR_PASCAL, Blocks.GRAY_WOOL), List.of(1, 1), ModItems.SPRUCE_GRAY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.SPRUCE_CHAIR_PASCAL, Blocks.BLACK_WOOL), List.of(1, 1), ModItems.SPRUCE_BLACK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.SPRUCE_CHAIR_PASCAL, Blocks.BROWN_WOOL), List.of(1, 1), ModItems.SPRUCE_BROWN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.SPRUCE_CHAIR_PASCAL, Blocks.RED_WOOL), List.of(1, 1), ModItems.SPRUCE_RED_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.SPRUCE_CHAIR_PASCAL, Blocks.ORANGE_WOOL), List.of(1, 1), ModItems.SPRUCE_ORANGE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.SPRUCE_CHAIR_PASCAL, Blocks.YELLOW_WOOL), List.of(1, 1), ModItems.SPRUCE_YELLOW_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.SPRUCE_CHAIR_PASCAL, Blocks.LIME_WOOL), List.of(1, 1), ModItems.SPRUCE_LIME_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.SPRUCE_CHAIR_PASCAL, Blocks.GREEN_WOOL), List.of(1, 1), ModItems.SPRUCE_GREEN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.SPRUCE_CHAIR_PASCAL, Blocks.CYAN_WOOL), List.of(1, 1), ModItems.SPRUCE_CYAN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.SPRUCE_CHAIR_PASCAL, Blocks.LIGHT_BLUE_WOOL), List.of(1, 1), ModItems.SPRUCE_LIGHT_BLUE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.SPRUCE_CHAIR_PASCAL, Blocks.BLUE_WOOL), List.of(1, 1), ModItems.SPRUCE_BLUE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.SPRUCE_CHAIR_PASCAL, Blocks.PURPLE_WOOL), List.of(1, 1), ModItems.SPRUCE_PURPLE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.SPRUCE_CHAIR_PASCAL, Blocks.MAGENTA_WOOL), List.of(1, 1), ModItems.SPRUCE_MAGENTA_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.SPRUCE_CHAIR_PASCAL, Blocks.PINK_WOOL), List.of(1, 1), ModItems.SPRUCE_PINK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(Blocks.WARPED_PLANKS, Blocks.IRON_BLOCK), List.of(1, 1), ModItems.WARPED_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.WARPED_CHAIR_PASCAL, Blocks.WHITE_WOOL), List.of(1, 1), ModItems.WARPED_WHITE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.WARPED_CHAIR_PASCAL, Blocks.LIGHT_GRAY_WOOL), List.of(1, 1), ModItems.WARPED_LIGHT_GRAY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.WARPED_CHAIR_PASCAL, Blocks.GRAY_WOOL), List.of(1, 1), ModItems.WARPED_GRAY_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.WARPED_CHAIR_PASCAL, Blocks.BLACK_WOOL), List.of(1, 1), ModItems.WARPED_BLACK_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.WARPED_CHAIR_PASCAL, Blocks.BROWN_WOOL), List.of(1, 1), ModItems.WARPED_BROWN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.WARPED_CHAIR_PASCAL, Blocks.RED_WOOL), List.of(1, 1), ModItems.WARPED_RED_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.WARPED_CHAIR_PASCAL, Blocks.ORANGE_WOOL), List.of(1, 1), ModItems.WARPED_ORANGE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.WARPED_CHAIR_PASCAL, Blocks.YELLOW_WOOL), List.of(1, 1), ModItems.WARPED_YELLOW_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.WARPED_CHAIR_PASCAL, Blocks.LIME_WOOL), List.of(1, 1), ModItems.WARPED_LIME_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.WARPED_CHAIR_PASCAL, Blocks.GREEN_WOOL), List.of(1, 1), ModItems.WARPED_GREEN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.WARPED_CHAIR_PASCAL, Blocks.CYAN_WOOL), List.of(1, 1), ModItems.WARPED_CYAN_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.WARPED_CHAIR_PASCAL, Blocks.LIGHT_BLUE_WOOL), List.of(1, 1), ModItems.WARPED_LIGHT_BLUE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.WARPED_CHAIR_PASCAL, Blocks.BLUE_WOOL), List.of(1, 1), ModItems.WARPED_BLUE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.WARPED_CHAIR_PASCAL, Blocks.PURPLE_WOOL), List.of(1, 1), ModItems.WARPED_PURPLE_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.WARPED_CHAIR_PASCAL, Blocks.MAGENTA_WOOL), List.of(1, 1), ModItems.WARPED_MAGENTA_CHAIR_PASCAL, 1, true)
                ;
                createCarpentryRecipe(List.of(ModBlocks.WARPED_CHAIR_PASCAL, Blocks.PINK_WOOL), List.of(1, 1), ModItems.WARPED_PINK_CHAIR_PASCAL, 1, true)
                ;

            }

            private void createSawRecipe(RecipeExporter exporter) {
                TagKey<Item> planks = ItemTags.PLANKS;

                this.createShaped(RecipeCategory.TOOLS, ModItems.WOODEN_SAW, 1).input('#', planks).input('S', Items.STICK).pattern("#  ").pattern(" #S").pattern(" SS").criterion("has_planks", conditionsFromTag(planks)).offerTo(exporter);
            }

            private void createSawRecipe(RecipeExporter exporter, Item saw, Item input) {
                this.createShaped(RecipeCategory.TOOLS, saw, 1).input('#', input).input('S', Items.STICK).pattern("#  ").pattern(" #S").pattern(" SS").criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
            }

            private void createCarpentryRecipe(List<ItemConvertible> itemConvertibles, List<Integer> inputCounts, ItemConvertible output, int outputCount, boolean requiresTool) {
                List<Ingredient> ingredients = new ArrayList<>();
                for (ItemConvertible itemConvertible : itemConvertibles) {
                    ingredients.add(Ingredient.ofItem(itemConvertible));
                }

                CarpentryRecipeJsonBuilder builder = CarpentryRecipeJsonBuilder.createCarpentry(RecipeCategory.DECORATIONS, ingredients, inputCounts, output, outputCount, requiresTool);

                builder.criterion(hasItem(output), conditionsFromItem(output)).offerTo(exporter, getRecipeName(output) + "_carpentry");
            }

            private void createCarpentryRecipe(ItemConvertible itemConvertible, TagKey<Item> itemTag, List<Integer> inputCounts, ItemConvertible output, int outputCount, boolean requiresTool) {
                List<Ingredient> ingredients = new ArrayList<>();
                ingredients.add(Ingredient.ofItem(itemConvertible));
                ingredients.add(Ingredient.fromTag(wrapperLookup.getOrThrow(RegistryKeys.ITEM).getOrThrow(itemTag)));

                CarpentryRecipeJsonBuilder builder = CarpentryRecipeJsonBuilder.createCarpentry(RecipeCategory.DECORATIONS, ingredients, inputCounts, output, outputCount, requiresTool);

                builder.criterion(hasItem(output), conditionsFromItem(output)).offerTo(exporter, getRecipeName(output) + "_carpentry");
            }

            private void createBoundBambooLadderReceipe(RecipeExporter exporter) {
                this.createShaped(RecipeCategory.DECORATIONS, ModBlocks.BOUND_BAMBOO_LADDER, 3).input('B', Items.BAMBOO).input('S', Items.STRING).pattern("B B").pattern("BSB").pattern("B B").criterion("has_bamboo", conditionsFromItem(Items.BAMBOO)).offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "Nemo's Carpentry Recipes";
    }
}
