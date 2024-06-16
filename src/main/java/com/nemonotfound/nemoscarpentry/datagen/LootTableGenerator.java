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
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class LootTableGenerator extends FabricBlockLootTableProvider {

    public LootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
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

        this.addDrop(ModBlocks.ACACIA_TABLE_PASCAL);
        this.addDrop(ModBlocks.BAMBOO_TABLE_PASCAL);
        this.addDrop(ModBlocks.BIRCH_TABLE_PASCAL);
        this.addDrop(ModBlocks.CHERRY_TABLE_PASCAL);
        this.addDrop(ModBlocks.CRIMSON_TABLE_PASCAL);
        this.addDrop(ModBlocks.DARK_OAK_TABLE_PASCAL);
        this.addDrop(ModBlocks.JUNGLE_TABLE_PASCAL);
        this.addDrop(ModBlocks.MANGROVE_TABLE_PASCAL);
        this.addDrop(ModBlocks.OAK_TABLE_PASCAL);
        this.addDrop(ModBlocks.SPRUCE_TABLE_PASCAL);
        this.addDrop(ModBlocks.WARPED_TABLE_PASCAL);

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
