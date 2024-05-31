package com.nemonotfound.nemoscarpentry.datagen;

import com.nemonotfound.nemoscarpentry.block.LukasChairBlock;
import com.nemonotfound.nemoscarpentry.block.ModBlocks;
import com.nemonotfound.nemoscarpentry.block.ParkBenchBlock;
import com.nemonotfound.nemoscarpentry.block.enums.BenchPart;
import com.nemonotfound.nemoscarpentry.block.enums.ChairPart;
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
    }

    private LootTable.Builder benchDrops(Block block) {
        return this.dropsWithProperty(block, ParkBenchBlock.PART, BenchPart.LEFT);
    }

    private LootTable.Builder chairDrops(Block block) {
        return this.dropsWithProperty(block, LukasChairBlock.PART, ChairPart.LOWER);
    }
}
