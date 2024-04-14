package com.nemonotfound.nemoscarpentry.datagen;

import com.mojang.datafixers.util.Pair;
import com.nemonotfound.nemoscarpentry.block.ModBlocks;
import com.nemonotfound.nemoscarpentry.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.VanillaRecipeProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Map;

public class RecipeGenerator extends FabricRecipeProvider {

    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        createChairRecipes(exporter);

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

        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.ACACIA_PLANKS, 2)),
                ModBlocks.ACACIA_PARK_BENCH, 1, "saw");
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.BAMBOO_PLANKS, 2)),
                ModBlocks.BAMBOO_PARK_BENCH, 1, "saw");
        createCarpentryRecipe(exporter, List.of(Pair.of(Blocks.OAK_PLANKS, 2)),
                ModBlocks.OAK_PARK_BENCH, 1, "saw");


        CarpentryRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.CHERRY_GLASS_DOOR_FRAME, 2, "saw")
                .input(Ingredient.ofItems(Items.CHERRY_PLANKS), 2)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CHERRY_GLASS_DOOR_FRAME),
                        conditionsFromItem(ModItems.CHERRY_GLASS_DOOR_FRAME)).criterion(hasItem(Blocks.CHERRY_PLANKS),
                        conditionsFromItem(Blocks.CHERRY_PLANKS)).offerTo(exporter,
                        new Identifier(getRecipeName(ModItems.CHERRY_GLASS_DOOR_FRAME) + "_carpentry"));
    }

    private void createChairRecipes(RecipeExporter exporter) {
        List<Block> allWoodenPlanks = RecipeGenerationHelper.getAllWoodenPlanks();
        List<Block> allLogs = RecipeGenerationHelper.getAllLogs();
        Map<Block, Block> chairMap = RecipeGenerationHelper.getChairMap();
        Map<Block, Block> felixChairMap = RecipeGenerationHelper.getFelixChairMap();
        Map<Block, Block> logSeatMap = RecipeGenerationHelper.getLogSeatMap();
        String tool = "saw";

        for (Block planks:allWoodenPlanks) {
            createCarpentryRecipeJson(exporter, planks, chairMap, 1, tool);
            createCarpentryRecipeJson(exporter, planks, felixChairMap, 1, tool);
        }

        for (Block logs:allLogs) {
            createCarpentryRecipeJson(exporter, logs, logSeatMap, 2, tool);
        }
    }

    private void createCampfireRecipe(RecipeExporter exporter, Block result, TagKey<Item> log) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, result).input('L',
                        log).input('S', Items.STICK).input('C',
                        ItemTags.COALS).pattern(" S ").pattern("SCS").pattern("LLL")
                .criterion("has_stick", VanillaRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion("has_coal", VanillaRecipeProvider.conditionsFromTag(ItemTags.COALS)).offerTo(exporter);
    }

    private void createSoulCampfireRecipe(RecipeExporter exporter, Block result, TagKey<Item> log) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, result)
                .input('L', log).input('S', Items.STICK).input('#', ItemTags.SOUL_FIRE_BASE_BLOCKS)
                .pattern(" S ").pattern("S#S").pattern("LLL")
                .criterion("has_soul_sand", VanillaRecipeProvider.conditionsFromTag(ItemTags.SOUL_FIRE_BASE_BLOCKS))
                .offerTo(exporter);
    }

    private void createCarpentryRecipe(RecipeExporter exporter, List<Pair<Block, Integer>> ingredients, Block output, int outputCount, String tool) {
        CarpentryRecipeJsonBuilder builder = CarpentryRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, outputCount, tool);

        for (Pair<Block, Integer> ingredientPair : ingredients) {
            Block ingredient = ingredientPair.getFirst();

            builder.input(Ingredient.ofItems(ingredient), ingredientPair.getSecond())
                    .criterion(hasItem(ingredient), conditionsFromItem(ingredient));
        }

        builder.criterion(FabricRecipeProvider.hasItem(output), conditionsFromItem(output))
                .offerTo(exporter, new Identifier(getRecipeName(output) + "_carpentry"));
    }

    private void createCarpentryRecipeJson(RecipeExporter exporter, Block block, Map<Block, Block> inputToOutputMap, int count, String tool) {
        Block output = inputToOutputMap.get(block);

        CarpentryRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, count, tool)
                .input(Ingredient.ofItems(block))
                .criterion(FabricRecipeProvider.hasItem(output),
                        conditionsFromItem(output)).criterion(hasItem(block),
                        conditionsFromItem(block)).offerTo(exporter, new Identifier(getRecipeName(output) + "_carpentry"));
    }
}
