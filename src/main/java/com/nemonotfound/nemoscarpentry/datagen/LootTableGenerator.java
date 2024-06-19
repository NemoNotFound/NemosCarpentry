package com.nemonotfound.nemoscarpentry.datagen;

import com.nemonotfound.nemoscarpentry.block.ModBlocks;
import com.nemonotfound.nemoscarpentry.block.enums.BenchPart;
import com.nemonotfound.nemoscarpentry.block.enums.ChairPart;
import com.nemonotfound.nemoscarpentry.block.seats.ParkBenchBlock;
import com.nemonotfound.nemoscarpentry.property.ModProperties;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.data.server.loottable.vanilla.VanillaBlockLootTableGenerator;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class LootTableGenerator extends FabricBlockLootTableProvider {

    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        this.addDrop(ModBlocks.ACACIA_CAMPFIRE, (Block block) -> BlockLootTableGenerator.dropsWithSilkTouch(block,
                this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.CHARCOAL)
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f))))));
        this.addDrop(ModBlocks.BIRCH_CAMPFIRE, (Block block) -> BlockLootTableGenerator.dropsWithSilkTouch(block,
                this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.CHARCOAL)
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f))))));
        this.addDrop(ModBlocks.CHERRY_CAMPFIRE, (Block block) -> BlockLootTableGenerator.dropsWithSilkTouch(block,
                this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.CHARCOAL)
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f))))));
        this.addDrop(ModBlocks.CRIMSON_CAMPFIRE, (Block block) -> BlockLootTableGenerator.dropsWithSilkTouch(block,
                this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.CHARCOAL)
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f))))));
        this.addDrop(ModBlocks.DARK_OAK_CAMPFIRE, (Block block) -> BlockLootTableGenerator.dropsWithSilkTouch(block,
                this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.CHARCOAL)
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f))))));
        this.addDrop(ModBlocks.JUNGLE_CAMPFIRE, (Block block) -> BlockLootTableGenerator.dropsWithSilkTouch(block,
                this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.CHARCOAL)
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f))))));
        this.addDrop(ModBlocks.MANGROVE_CAMPFIRE, (Block block) -> BlockLootTableGenerator.dropsWithSilkTouch(block,
                this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.CHARCOAL)
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f))))));
        this.addDrop(ModBlocks.SPRUCE_CAMPFIRE, (Block block) -> BlockLootTableGenerator.dropsWithSilkTouch(block,
                this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.CHARCOAL)
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f))))));
        this.addDrop(ModBlocks.WARPED_CAMPFIRE, (Block block) -> BlockLootTableGenerator.dropsWithSilkTouch(block,
                this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.CHARCOAL)
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f))))));
        this.addDrop(ModBlocks.ACACIA_SOUL_CAMPFIRE, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block,
                this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.SOUL_SOIL)
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f))))));
        this.addDrop(ModBlocks.BIRCH_SOUL_CAMPFIRE, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block,
                this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.SOUL_SOIL)
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f))))));
        this.addDrop(ModBlocks.CHERRY_SOUL_CAMPFIRE, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block,
                this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.SOUL_SOIL)
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f))))));
        this.addDrop(ModBlocks.CRIMSON_SOUL_CAMPFIRE, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block,
                this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.SOUL_SOIL)
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f))))));
        this.addDrop(ModBlocks.DARK_OAK_SOUL_CAMPFIRE, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block,
                this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.SOUL_SOIL)
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f))))));
        this.addDrop(ModBlocks.JUNGLE_SOUL_CAMPFIRE, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block,
                this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.SOUL_SOIL)
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f))))));
        this.addDrop(ModBlocks.MANGROVE_SOUL_CAMPFIRE, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block,
                this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.SOUL_SOIL)
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f))))));
        this.addDrop(ModBlocks.SPRUCE_SOUL_CAMPFIRE, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block,
                this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.SOUL_SOIL)
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f))))));
        this.addDrop(ModBlocks.WARPED_SOUL_CAMPFIRE, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block,
                this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.SOUL_SOIL)
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f))))));

        this.addDrop(ModBlocks.ACACIA_LADDER);
        this.addDrop(ModBlocks.BAMBOO_LADDER);
        this.addDrop(ModBlocks.BOUND_BAMBOO_LADDER);
        this.addDrop(ModBlocks.BIRCH_LADDER);
        this.addDrop(ModBlocks.CHERRY_LADDER);
        this.addDrop(ModBlocks.CRIMSON_LADDER);
        this.addDrop(ModBlocks.DARK_OAK_LADDER);
        this.addDrop(ModBlocks.JUNGLE_LADDER);
        this.addDrop(ModBlocks.MANGROVE_LADDER);
        this.addDrop(ModBlocks.SPRUCE_LADDER);
        this.addDrop(ModBlocks.WARPED_LADDER);

        this.addDrop(ModBlocks.ACACIA_TABLE_THE_CLASSIC);
        this.addDrop(ModBlocks.BAMBOO_TABLE_THE_CLASSIC);
        this.addDrop(ModBlocks.BIRCH_TABLE_THE_CLASSIC);
        this.addDrop(ModBlocks.CHERRY_TABLE_THE_CLASSIC);
        this.addDrop(ModBlocks.CRIMSON_TABLE_THE_CLASSIC);
        this.addDrop(ModBlocks.DARK_OAK_TABLE_THE_CLASSIC);
        this.addDrop(ModBlocks.JUNGLE_TABLE_THE_CLASSIC);
        this.addDrop(ModBlocks.MANGROVE_TABLE_THE_CLASSIC);
        this.addDrop(ModBlocks.OAK_TABLE_THE_CLASSIC);
        this.addDrop(ModBlocks.SPRUCE_TABLE_THE_CLASSIC);
        this.addDrop(ModBlocks.WARPED_TABLE_THE_CLASSIC);

        this.addDrop(ModBlocks.ACACIA_COFFEE_TABLE_PASCAL);
        this.addDrop(ModBlocks.BAMBOO_COFFEE_TABLE_PASCAL);
        this.addDrop(ModBlocks.BIRCH_COFFEE_TABLE_PASCAL);
        this.addDrop(ModBlocks.CHERRY_COFFEE_TABLE_PASCAL);
        this.addDrop(ModBlocks.CRIMSON_COFFEE_TABLE_PASCAL);
        this.addDrop(ModBlocks.DARK_OAK_COFFEE_TABLE_PASCAL);
        this.addDrop(ModBlocks.JUNGLE_COFFEE_TABLE_PASCAL);
        this.addDrop(ModBlocks.MANGROVE_COFFEE_TABLE_PASCAL);
        this.addDrop(ModBlocks.OAK_COFFEE_TABLE_PASCAL);
        this.addDrop(ModBlocks.SPRUCE_COFFEE_TABLE_PASCAL);
        this.addDrop(ModBlocks.WARPED_COFFEE_TABLE_PASCAL);

        this.addDrop(ModBlocks.ACACIA_STANDING_TABLE);
        this.addDrop(ModBlocks.BAMBOO_STANDING_TABLE);
        this.addDrop(ModBlocks.BIRCH_STANDING_TABLE);
        this.addDrop(ModBlocks.CHERRY_STANDING_TABLE);
        this.addDrop(ModBlocks.CRIMSON_STANDING_TABLE);
        this.addDrop(ModBlocks.DARK_OAK_STANDING_TABLE);
        this.addDrop(ModBlocks.JUNGLE_STANDING_TABLE);
        this.addDrop(ModBlocks.MANGROVE_STANDING_TABLE);
        this.addDrop(ModBlocks.OAK_STANDING_TABLE);
        this.addDrop(ModBlocks.SPRUCE_STANDING_TABLE);
        this.addDrop(ModBlocks.WARPED_STANDING_TABLE);

        this.addDrop(ModBlocks.ACACIA_CHAIR);
        this.addDrop(ModBlocks.BAMBOO_CHAIR);
        this.addDrop(ModBlocks.BIRCH_CHAIR);
        this.addDrop(ModBlocks.CHERRY_CHAIR);
        this.addDrop(ModBlocks.CRIMSON_CHAIR);
        this.addDrop(ModBlocks.DARK_OAK_CHAIR);
        this.addDrop(ModBlocks.JUNGLE_CHAIR);
        this.addDrop(ModBlocks.MANGROVE_CHAIR);
        this.addDrop(ModBlocks.OAK_CHAIR);
        this.addDrop(ModBlocks.SPRUCE_CHAIR);
        this.addDrop(ModBlocks.WARPED_CHAIR);

        this.addDrop(ModBlocks.ACACIA_CHAIR_FELIX);
        this.addDrop(ModBlocks.BAMBOO_CHAIR_FELIX);
        this.addDrop(ModBlocks.BIRCH_CHAIR_FELIX);
        this.addDrop(ModBlocks.CHERRY_CHAIR_FELIX);
        this.addDrop(ModBlocks.CRIMSON_CHAIR_FELIX);
        this.addDrop(ModBlocks.DARK_OAK_CHAIR_FELIX);
        this.addDrop(ModBlocks.JUNGLE_CHAIR_FELIX);
        this.addDrop(ModBlocks.MANGROVE_CHAIR_FELIX);
        this.addDrop(ModBlocks.OAK_CHAIR_FELIX);
        this.addDrop(ModBlocks.SPRUCE_CHAIR_FELIX);
        this.addDrop(ModBlocks.WARPED_CHAIR_FELIX);

        this.addDrop(ModBlocks.ACACIA_PARK_BENCH, this::benchDrops);
        this.addDrop(ModBlocks.BAMBOO_PARK_BENCH, this::benchDrops);
        this.addDrop(ModBlocks.BIRCH_PARK_BENCH, this::benchDrops);
        this.addDrop(ModBlocks.CHERRY_PARK_BENCH, this::benchDrops);
        this.addDrop(ModBlocks.CRIMSON_PARK_BENCH, this::benchDrops);
        this.addDrop(ModBlocks.DARK_OAK_PARK_BENCH, this::benchDrops);
        this.addDrop(ModBlocks.JUNGLE_PARK_BENCH, this::benchDrops);
        this.addDrop(ModBlocks.MANGROVE_PARK_BENCH, this::benchDrops);
        this.addDrop(ModBlocks.OAK_PARK_BENCH, this::benchDrops);
        this.addDrop(ModBlocks.SPRUCE_PARK_BENCH, this::benchDrops);
        this.addDrop(ModBlocks.WARPED_PARK_BENCH, this::benchDrops);

        this.addDrop(ModBlocks.ACACIA_CHAIR_LUKAS, this::chairDrops);
        this.addDrop(ModBlocks.BAMBOO_CHAIR_LUKAS, this::chairDrops);
        this.addDrop(ModBlocks.BIRCH_CHAIR_LUKAS, this::chairDrops);
        this.addDrop(ModBlocks.CHERRY_CHAIR_LUKAS, this::chairDrops);
        this.addDrop(ModBlocks.CRIMSON_CHAIR_LUKAS, this::chairDrops);
        this.addDrop(ModBlocks.DARK_OAK_CHAIR_LUKAS, this::chairDrops);
        this.addDrop(ModBlocks.JUNGLE_CHAIR_LUKAS, this::chairDrops);
        this.addDrop(ModBlocks.MANGROVE_CHAIR_LUKAS, this::chairDrops);
        this.addDrop(ModBlocks.OAK_CHAIR_LUKAS, this::chairDrops);
        this.addDrop(ModBlocks.SPRUCE_CHAIR_LUKAS, this::chairDrops);
        this.addDrop(ModBlocks.WARPED_CHAIR_LUKAS, this::chairDrops);

        this.addDrop(ModBlocks.ACACIA_CHAIR_LUKAS_NATURAL, this::chairDrops);
        this.addDrop(ModBlocks.BAMBOO_CHAIR_LUKAS_NATURAL, this::chairDrops);
        this.addDrop(ModBlocks.BIRCH_CHAIR_LUKAS_NATURAL, this::chairDrops);
        this.addDrop(ModBlocks.CHERRY_CHAIR_LUKAS_NATURAL, this::chairDrops);
        this.addDrop(ModBlocks.CRIMSON_CHAIR_LUKAS_NATURAL, this::chairDrops);
        this.addDrop(ModBlocks.DARK_OAK_CHAIR_LUKAS_NATURAL, this::chairDrops);
        this.addDrop(ModBlocks.JUNGLE_CHAIR_LUKAS_NATURAL, this::chairDrops);
        this.addDrop(ModBlocks.MANGROVE_CHAIR_LUKAS_NATURAL, this::chairDrops);
        this.addDrop(ModBlocks.OAK_CHAIR_LUKAS_NATURAL, this::chairDrops);
        this.addDrop(ModBlocks.SPRUCE_CHAIR_LUKAS_NATURAL, this::chairDrops);
        this.addDrop(ModBlocks.WARPED_CHAIR_LUKAS_NATURAL, this::chairDrops);

        this.addDrop(ModBlocks.ACACIA_CHAIR_TOMMY, this::chairDrops);
        this.addDrop(ModBlocks.BAMBOO_CHAIR_TOMMY, this::chairDrops);
        this.addDrop(ModBlocks.BIRCH_CHAIR_TOMMY, this::chairDrops);
        this.addDrop(ModBlocks.CHERRY_CHAIR_TOMMY, this::chairDrops);
        this.addDrop(ModBlocks.CRIMSON_CHAIR_TOMMY, this::chairDrops);
        this.addDrop(ModBlocks.DARK_OAK_CHAIR_TOMMY, this::chairDrops);
        this.addDrop(ModBlocks.JUNGLE_CHAIR_TOMMY, this::chairDrops);
        this.addDrop(ModBlocks.MANGROVE_CHAIR_TOMMY, this::chairDrops);
        this.addDrop(ModBlocks.OAK_CHAIR_TOMMY, this::chairDrops);
        this.addDrop(ModBlocks.SPRUCE_CHAIR_TOMMY, this::chairDrops);
        this.addDrop(ModBlocks.WARPED_CHAIR_TOMMY, this::chairDrops);

        this.addDrop(ModBlocks.ACACIA_CHAIR_TOMMY_NATURAL, this::chairDrops);
        this.addDrop(ModBlocks.BAMBOO_CHAIR_TOMMY_NATURAL, this::chairDrops);
        this.addDrop(ModBlocks.BIRCH_CHAIR_TOMMY_NATURAL, this::chairDrops);
        this.addDrop(ModBlocks.CHERRY_CHAIR_TOMMY_NATURAL, this::chairDrops);
        this.addDrop(ModBlocks.CRIMSON_CHAIR_TOMMY_NATURAL, this::chairDrops);
        this.addDrop(ModBlocks.DARK_OAK_CHAIR_TOMMY_NATURAL, this::chairDrops);
        this.addDrop(ModBlocks.JUNGLE_CHAIR_TOMMY_NATURAL, this::chairDrops);
        this.addDrop(ModBlocks.MANGROVE_CHAIR_TOMMY_NATURAL, this::chairDrops);
        this.addDrop(ModBlocks.OAK_CHAIR_TOMMY_NATURAL, this::chairDrops);
        this.addDrop(ModBlocks.SPRUCE_CHAIR_TOMMY_NATURAL, this::chairDrops);
        this.addDrop(ModBlocks.WARPED_CHAIR_TOMMY_NATURAL, this::chairDrops);

        this.addDrop(ModBlocks.ACACIA_CHAIR_GREGORY, this::chairDrops);
        this.addDrop(ModBlocks.BAMBOO_CHAIR_GREGORY, this::chairDrops);
        this.addDrop(ModBlocks.BIRCH_CHAIR_GREGORY, this::chairDrops);
        this.addDrop(ModBlocks.CHERRY_CHAIR_GREGORY, this::chairDrops);
        this.addDrop(ModBlocks.CRIMSON_CHAIR_GREGORY, this::chairDrops);
        this.addDrop(ModBlocks.DARK_OAK_CHAIR_GREGORY, this::chairDrops);
        this.addDrop(ModBlocks.JUNGLE_CHAIR_GREGORY, this::chairDrops);
        this.addDrop(ModBlocks.MANGROVE_CHAIR_GREGORY, this::chairDrops);
        this.addDrop(ModBlocks.OAK_CHAIR_GREGORY, this::chairDrops);
        this.addDrop(ModBlocks.SPRUCE_CHAIR_GREGORY, this::chairDrops);
        this.addDrop(ModBlocks.WARPED_CHAIR_GREGORY, this::chairDrops);
        
        this.addDrop(ModBlocks.ACACIA_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.ACACIA_WHITE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.ACACIA_LIGHT_GRAY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.ACACIA_GRAY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.ACACIA_BLACK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.ACACIA_BROWN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.ACACIA_RED_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.ACACIA_ORANGE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.ACACIA_YELLOW_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.ACACIA_LIME_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.ACACIA_GREEN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.ACACIA_CYAN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.ACACIA_LIGHT_BLUE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.ACACIA_BLUE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.ACACIA_PURPLE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.ACACIA_MAGENTA_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.ACACIA_PINK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BAMBOO_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BAMBOO_WHITE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BAMBOO_LIGHT_GRAY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BAMBOO_GRAY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BAMBOO_BLACK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BAMBOO_BROWN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BAMBOO_RED_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BAMBOO_ORANGE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BAMBOO_YELLOW_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BAMBOO_LIME_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BAMBOO_GREEN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BAMBOO_CYAN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BAMBOO_LIGHT_BLUE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BAMBOO_BLUE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BAMBOO_PURPLE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BAMBOO_MAGENTA_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BAMBOO_PINK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BIRCH_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BIRCH_WHITE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BIRCH_LIGHT_GRAY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BIRCH_GRAY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BIRCH_BLACK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BIRCH_BROWN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BIRCH_RED_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BIRCH_ORANGE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BIRCH_YELLOW_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BIRCH_LIME_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BIRCH_GREEN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BIRCH_CYAN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BIRCH_LIGHT_BLUE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BIRCH_BLUE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BIRCH_PURPLE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BIRCH_MAGENTA_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.BIRCH_PINK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CHERRY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CHERRY_WHITE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CHERRY_LIGHT_GRAY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CHERRY_GRAY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CHERRY_BLACK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CHERRY_BROWN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CHERRY_RED_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CHERRY_ORANGE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CHERRY_YELLOW_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CHERRY_LIME_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CHERRY_GREEN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CHERRY_CYAN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CHERRY_LIGHT_BLUE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CHERRY_BLUE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CHERRY_PURPLE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CHERRY_MAGENTA_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CHERRY_PINK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CRIMSON_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CRIMSON_WHITE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CRIMSON_LIGHT_GRAY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CRIMSON_GRAY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CRIMSON_BLACK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CRIMSON_BROWN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CRIMSON_RED_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CRIMSON_ORANGE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CRIMSON_YELLOW_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CRIMSON_LIME_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CRIMSON_GREEN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CRIMSON_CYAN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CRIMSON_LIGHT_BLUE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CRIMSON_BLUE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CRIMSON_PURPLE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CRIMSON_MAGENTA_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.CRIMSON_PINK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.DARK_OAK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.DARK_OAK_WHITE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.DARK_OAK_LIGHT_GRAY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.DARK_OAK_GRAY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.DARK_OAK_BLACK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.DARK_OAK_BROWN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.DARK_OAK_RED_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.DARK_OAK_ORANGE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.DARK_OAK_YELLOW_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.DARK_OAK_LIME_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.DARK_OAK_GREEN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.DARK_OAK_CYAN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.DARK_OAK_LIGHT_BLUE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.DARK_OAK_BLUE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.DARK_OAK_PURPLE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.DARK_OAK_MAGENTA_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.DARK_OAK_PINK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.JUNGLE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.JUNGLE_WHITE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.JUNGLE_LIGHT_GRAY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.JUNGLE_GRAY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.JUNGLE_BLACK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.JUNGLE_BROWN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.JUNGLE_RED_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.JUNGLE_ORANGE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.JUNGLE_YELLOW_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.JUNGLE_LIME_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.JUNGLE_GREEN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.JUNGLE_CYAN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.JUNGLE_LIGHT_BLUE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.JUNGLE_BLUE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.JUNGLE_PURPLE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.JUNGLE_MAGENTA_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.JUNGLE_PINK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.MANGROVE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.MANGROVE_WHITE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.MANGROVE_LIGHT_GRAY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.MANGROVE_GRAY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.MANGROVE_BLACK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.MANGROVE_BROWN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.MANGROVE_RED_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.MANGROVE_ORANGE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.MANGROVE_YELLOW_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.MANGROVE_LIME_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.MANGROVE_GREEN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.MANGROVE_CYAN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.MANGROVE_LIGHT_BLUE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.MANGROVE_BLUE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.MANGROVE_PURPLE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.MANGROVE_MAGENTA_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.MANGROVE_PINK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.OAK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.OAK_WHITE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.OAK_LIGHT_GRAY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.OAK_GRAY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.OAK_BLACK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.OAK_BROWN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.OAK_RED_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.OAK_ORANGE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.OAK_YELLOW_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.OAK_LIME_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.OAK_GREEN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.OAK_CYAN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.OAK_LIGHT_BLUE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.OAK_BLUE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.OAK_PURPLE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.OAK_MAGENTA_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.OAK_PINK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.SPRUCE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.SPRUCE_WHITE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.SPRUCE_LIGHT_GRAY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.SPRUCE_GRAY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.SPRUCE_BLACK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.SPRUCE_BROWN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.SPRUCE_RED_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.SPRUCE_ORANGE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.SPRUCE_YELLOW_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.SPRUCE_LIME_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.SPRUCE_GREEN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.SPRUCE_CYAN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.SPRUCE_LIGHT_BLUE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.SPRUCE_BLUE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.SPRUCE_PURPLE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.SPRUCE_MAGENTA_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.SPRUCE_PINK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.WARPED_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.WARPED_WHITE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.WARPED_LIGHT_GRAY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.WARPED_GRAY_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.WARPED_BLACK_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.WARPED_BROWN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.WARPED_RED_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.WARPED_ORANGE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.WARPED_YELLOW_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.WARPED_LIME_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.WARPED_GREEN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.WARPED_CYAN_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.WARPED_LIGHT_BLUE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.WARPED_BLUE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.WARPED_PURPLE_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.WARPED_MAGENTA_CHAIR_PASCAL, this::chairDrops);
        this.addDrop(ModBlocks.WARPED_PINK_CHAIR_PASCAL, this::chairDrops);
        
        this.addDrop(ModBlocks.WHITE_BARBER_CHAIR);
        this.addDrop(ModBlocks.LIGHT_GRAY_BARBER_CHAIR);
        this.addDrop(ModBlocks.GRAY_BARBER_CHAIR);
        this.addDrop(ModBlocks.BLACK_BARBER_CHAIR);
        this.addDrop(ModBlocks.BROWN_BARBER_CHAIR);
        this.addDrop(ModBlocks.RED_BARBER_CHAIR);
        this.addDrop(ModBlocks.ORANGE_BARBER_CHAIR);
        this.addDrop(ModBlocks.YELLOW_BARBER_CHAIR);
        this.addDrop(ModBlocks.LIME_BARBER_CHAIR);
        this.addDrop(ModBlocks.GREEN_BARBER_CHAIR);
        this.addDrop(ModBlocks.CYAN_BARBER_CHAIR);
        this.addDrop(ModBlocks.LIGHT_BLUE_BARBER_CHAIR);
        this.addDrop(ModBlocks.BLUE_BARBER_CHAIR);
        this.addDrop(ModBlocks.PURPLE_BARBER_CHAIR);
        this.addDrop(ModBlocks.MAGENTA_BARBER_CHAIR);
        this.addDrop(ModBlocks.PINK_BARBER_CHAIR);

        this.addDrop(ModBlocks.WHITE_BAR_CHAIR);
        this.addDrop(ModBlocks.LIGHT_GRAY_BAR_CHAIR);
        this.addDrop(ModBlocks.GRAY_BAR_CHAIR);
        this.addDrop(ModBlocks.BLACK_BAR_CHAIR);
        this.addDrop(ModBlocks.BROWN_BAR_CHAIR);
        this.addDrop(ModBlocks.RED_BAR_CHAIR);
        this.addDrop(ModBlocks.ORANGE_BAR_CHAIR);
        this.addDrop(ModBlocks.YELLOW_BAR_CHAIR);
        this.addDrop(ModBlocks.LIME_BAR_CHAIR);
        this.addDrop(ModBlocks.GREEN_BAR_CHAIR);
        this.addDrop(ModBlocks.CYAN_BAR_CHAIR);
        this.addDrop(ModBlocks.LIGHT_BLUE_BAR_CHAIR);
        this.addDrop(ModBlocks.BLUE_BAR_CHAIR);
        this.addDrop(ModBlocks.PURPLE_BAR_CHAIR);
        this.addDrop(ModBlocks.MAGENTA_BAR_CHAIR);
        this.addDrop(ModBlocks.PINK_BAR_CHAIR);

        this.addDrop(ModBlocks.ACACIA_COFFEE_TABLE);
        this.addDrop(ModBlocks.BAMBOO_COFFEE_TABLE);
        this.addDrop(ModBlocks.BIRCH_COFFEE_TABLE);
        this.addDrop(ModBlocks.CHERRY_COFFEE_TABLE);
        this.addDrop(ModBlocks.CRIMSON_COFFEE_TABLE);
        this.addDrop(ModBlocks.DARK_OAK_COFFEE_TABLE);
        this.addDrop(ModBlocks.JUNGLE_COFFEE_TABLE);
        this.addDrop(ModBlocks.MANGROVE_COFFEE_TABLE);
        this.addDrop(ModBlocks.OAK_COFFEE_TABLE);
        this.addDrop(ModBlocks.SPRUCE_COFFEE_TABLE);
        this.addDrop(ModBlocks.WARPED_COFFEE_TABLE);

        this.addDrop(ModBlocks.ACACIA_BARREL_SEAT);
        this.addDrop(ModBlocks.BAMBOO_BARREL_SEAT);
        this.addDrop(ModBlocks.BIRCH_BARREL_SEAT);
        this.addDrop(ModBlocks.CHERRY_BARREL_SEAT);
        this.addDrop(ModBlocks.CRIMSON_BARREL_SEAT);
        this.addDrop(ModBlocks.DARK_OAK_BARREL_SEAT);
        this.addDrop(ModBlocks.JUNGLE_BARREL_SEAT);
        this.addDrop(ModBlocks.MANGROVE_BARREL_SEAT);
        this.addDrop(ModBlocks.OAK_BARREL_SEAT);
        this.addDrop(ModBlocks.SPRUCE_BARREL_SEAT);
        this.addDrop(ModBlocks.WARPED_BARREL_SEAT);
    }

    private LootTable.Builder benchDrops(Block block) {
        return this.dropsWithProperty(block, ParkBenchBlock.PART, BenchPart.LEFT);
    }

    private LootTable.Builder chairDrops(Block block) {
        return this.dropsWithProperty(block, ModProperties.CHAIR_PART, ChairPart.LOWER);
    }
}
