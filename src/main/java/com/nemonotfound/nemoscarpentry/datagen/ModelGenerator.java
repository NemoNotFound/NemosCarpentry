package com.nemonotfound.nemoscarpentry.datagen;

import com.nemonotfound.nemoscarpentry.block.ModBlocks;
import com.nemonotfound.nemoscarpentry.block.enums.BenchPart;
import com.nemonotfound.nemoscarpentry.item.ModItems;
import com.nemonotfound.nemoscarpentry.property.ModProperties;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.registry.Registries;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

import static com.nemonotfound.nemoscarpentry.NemosCarpentry.MOD_ID;

//TODO: definitely needs refactoring, but too lazy now
public class ModelGenerator extends FabricModelProvider {

    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        generateChairLukasModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.ACACIA_LOG, ModBlocks.ACACIA_CHAIR_LUKAS, ModModels.CHAIR_LUKAS);
        generateChairLukasModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, ModBlocks.BAMBOO_CHAIR_LUKAS, ModModels.CHAIR_LUKAS);
        generateChairLukasModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.BIRCH_LOG, ModBlocks.BIRCH_CHAIR_LUKAS, ModModels.CHAIR_LUKAS);
        generateChairLukasModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.CHERRY_LOG, ModBlocks.CHERRY_CHAIR_LUKAS, ModModels.CHAIR_LUKAS);
        generateChairLukasModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_STEM, ModBlocks.CRIMSON_CHAIR_LUKAS, ModModels.CHAIR_LUKAS);
        generateChairLukasModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_LOG, ModBlocks.DARK_OAK_CHAIR_LUKAS, ModModels.CHAIR_LUKAS);
        generateChairLukasModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_LOG, ModBlocks.JUNGLE_CHAIR_LUKAS, ModModels.CHAIR_LUKAS);
        generateChairLukasModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_LOG, ModBlocks.MANGROVE_CHAIR_LUKAS, ModModels.CHAIR_LUKAS);
        generateChairLukasModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.OAK_LOG, ModBlocks.OAK_CHAIR_LUKAS, ModModels.CHAIR_LUKAS);
        generateChairLukasModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_LOG, ModBlocks.SPRUCE_CHAIR_LUKAS, ModModels.CHAIR_LUKAS);
        generateChairLukasModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.WARPED_STEM, ModBlocks.WARPED_CHAIR_LUKAS, ModModels.CHAIR_LUKAS);

        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.ACACIA_LOG, ModBlocks.ACACIA_CHAIR_LUKAS_NATURAL, ModModels.CHAIR_LUKAS_NATURAL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_BLOCK, ModBlocks.BAMBOO_CHAIR_LUKAS_NATURAL, ModModels.CHAIR_LUKAS_NATURAL);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.BIRCH_LOG, ModBlocks.BIRCH_CHAIR_LUKAS_NATURAL, ModModels.CHAIR_LUKAS_NATURAL);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.CHERRY_LOG, ModBlocks.CHERRY_CHAIR_LUKAS_NATURAL, ModModels.CHAIR_LUKAS_NATURAL);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_STEM, ModBlocks.CRIMSON_CHAIR_LUKAS_NATURAL, ModModels.CHAIR_LUKAS_NATURAL);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_LOG, ModBlocks.DARK_OAK_CHAIR_LUKAS_NATURAL, ModModels.CHAIR_LUKAS_NATURAL);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_LOG, ModBlocks.JUNGLE_CHAIR_LUKAS_NATURAL, ModModels.CHAIR_LUKAS_NATURAL);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_LOG, ModBlocks.MANGROVE_CHAIR_LUKAS_NATURAL, ModModels.CHAIR_LUKAS_NATURAL);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.OAK_LOG, ModBlocks.OAK_CHAIR_LUKAS_NATURAL, ModModels.CHAIR_LUKAS_NATURAL);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_LOG, ModBlocks.SPRUCE_CHAIR_LUKAS_NATURAL, ModModels.CHAIR_LUKAS_NATURAL);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.WARPED_STEM, ModBlocks.WARPED_CHAIR_LUKAS_NATURAL, ModModels.CHAIR_LUKAS_NATURAL);

        generateChairLukasModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.ACACIA_LOG, ModBlocks.ACACIA_CHAIR_TOMMY, ModModels.CHAIR_TOMMY);
        generateChairLukasModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, ModBlocks.BAMBOO_CHAIR_TOMMY, ModModels.CHAIR_TOMMY);
        generateChairLukasModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.BIRCH_LOG, ModBlocks.BIRCH_CHAIR_TOMMY, ModModels.CHAIR_TOMMY);
        generateChairLukasModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.CHERRY_LOG, ModBlocks.CHERRY_CHAIR_TOMMY, ModModels.CHAIR_TOMMY);
        generateChairLukasModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_STEM, ModBlocks.CRIMSON_CHAIR_TOMMY, ModModels.CHAIR_TOMMY);
        generateChairLukasModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_LOG, ModBlocks.DARK_OAK_CHAIR_TOMMY, ModModels.CHAIR_TOMMY);
        generateChairLukasModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_LOG, ModBlocks.JUNGLE_CHAIR_TOMMY, ModModels.CHAIR_TOMMY);
        generateChairLukasModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_LOG, ModBlocks.MANGROVE_CHAIR_TOMMY, ModModels.CHAIR_TOMMY);
        generateChairLukasModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.OAK_LOG, ModBlocks.OAK_CHAIR_TOMMY, ModModels.CHAIR_TOMMY);
        generateChairLukasModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_LOG, ModBlocks.SPRUCE_CHAIR_TOMMY, ModModels.CHAIR_TOMMY);
        generateChairLukasModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.WARPED_STEM, ModBlocks.WARPED_CHAIR_TOMMY, ModModels.CHAIR_TOMMY);

        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.ACACIA_LOG, ModBlocks.ACACIA_CHAIR_TOMMY_NATURAL, ModModels.CHAIR_TOMMY_NATURAL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_BLOCK, ModBlocks.BAMBOO_CHAIR_TOMMY_NATURAL, ModModels.CHAIR_TOMMY_NATURAL);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.BIRCH_LOG, ModBlocks.BIRCH_CHAIR_TOMMY_NATURAL, ModModels.CHAIR_TOMMY_NATURAL);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.CHERRY_LOG, ModBlocks.CHERRY_CHAIR_TOMMY_NATURAL, ModModels.CHAIR_TOMMY_NATURAL);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_STEM, ModBlocks.CRIMSON_CHAIR_TOMMY_NATURAL, ModModels.CHAIR_TOMMY_NATURAL);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_LOG, ModBlocks.DARK_OAK_CHAIR_TOMMY_NATURAL, ModModels.CHAIR_TOMMY_NATURAL);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_LOG, ModBlocks.JUNGLE_CHAIR_TOMMY_NATURAL, ModModels.CHAIR_TOMMY_NATURAL);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_LOG, ModBlocks.MANGROVE_CHAIR_TOMMY_NATURAL, ModModels.CHAIR_TOMMY_NATURAL);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.OAK_LOG, ModBlocks.OAK_CHAIR_TOMMY_NATURAL, ModModels.CHAIR_TOMMY_NATURAL);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_LOG, ModBlocks.SPRUCE_CHAIR_TOMMY_NATURAL, ModModels.CHAIR_TOMMY_NATURAL);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.WARPED_STEM, ModBlocks.WARPED_CHAIR_TOMMY_NATURAL, ModModels.CHAIR_TOMMY_NATURAL);

        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.ACACIA_LOG, ModBlocks.ACACIA_CHAIR_GREGORY, ModModels.CHAIR_GREGORY);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_BLOCK, ModBlocks.BAMBOO_CHAIR_GREGORY, ModModels.CHAIR_GREGORY);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.BIRCH_LOG, ModBlocks.BIRCH_CHAIR_GREGORY, ModModels.CHAIR_GREGORY);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.CHERRY_LOG, ModBlocks.CHERRY_CHAIR_GREGORY, ModModels.CHAIR_GREGORY);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_STEM, ModBlocks.CRIMSON_CHAIR_GREGORY, ModModels.CHAIR_GREGORY);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_LOG, ModBlocks.DARK_OAK_CHAIR_GREGORY, ModModels.CHAIR_GREGORY);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_LOG, ModBlocks.JUNGLE_CHAIR_GREGORY, ModModels.CHAIR_GREGORY);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_LOG, ModBlocks.MANGROVE_CHAIR_GREGORY, ModModels.CHAIR_GREGORY);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.OAK_LOG, ModBlocks.OAK_CHAIR_GREGORY, ModModels.CHAIR_GREGORY);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_LOG, ModBlocks.SPRUCE_CHAIR_GREGORY, ModModels.CHAIR_GREGORY);
        generateAllTextureBottomModelModelWithSuffixedPath(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.WARPED_STEM, ModBlocks.WARPED_CHAIR_GREGORY, ModModels.CHAIR_GREGORY);

        generateParkBenchModel(blockStateModelGenerator, "acacia", Blocks.ACACIA_PLANKS, ModBlocks.ACACIA_PARK_BENCH);
        generateParkBenchModel(blockStateModelGenerator, "bamboo", Blocks.BAMBOO_PLANKS, ModBlocks.BAMBOO_PARK_BENCH);
        generateParkBenchModel(blockStateModelGenerator, "birch", Blocks.BIRCH_PLANKS, ModBlocks.BIRCH_PARK_BENCH);
        generateParkBenchModel(blockStateModelGenerator, "cherry", Blocks.CHERRY_PLANKS, ModBlocks.CHERRY_PARK_BENCH);
        generateParkBenchModel(blockStateModelGenerator, "crimson", Blocks.CRIMSON_PLANKS, ModBlocks.CRIMSON_PARK_BENCH);
        generateParkBenchModel(blockStateModelGenerator, "dark_oak", Blocks.DARK_OAK_PLANKS, ModBlocks.DARK_OAK_PARK_BENCH);
        generateParkBenchModel(blockStateModelGenerator, "jungle", Blocks.JUNGLE_PLANKS, ModBlocks.JUNGLE_PARK_BENCH);
        generateParkBenchModel(blockStateModelGenerator, "mangrove", Blocks.MANGROVE_PLANKS, ModBlocks.MANGROVE_PARK_BENCH);
        generateParkBenchModel(blockStateModelGenerator, "oak", Blocks.OAK_PLANKS, ModBlocks.OAK_PARK_BENCH);
        generateParkBenchModel(blockStateModelGenerator, "spruce", Blocks.SPRUCE_PLANKS, ModBlocks.SPRUCE_PARK_BENCH);
        generateParkBenchModel(blockStateModelGenerator, "warped", Blocks.WARPED_PLANKS, ModBlocks.WARPED_PARK_BENCH);

        generateBlockModel(blockStateModelGenerator, ModBlocks.ACACIA_TABLE_THE_CLASSIC, Blocks.ACACIA_PLANKS, ModModels.TABLE_THE_CLASSIC);
        generateBlockModel(blockStateModelGenerator, ModBlocks.BAMBOO_TABLE_THE_CLASSIC, Blocks.BAMBOO_PLANKS, ModModels.TABLE_THE_CLASSIC);
        generateBlockModel(blockStateModelGenerator, ModBlocks.BIRCH_TABLE_THE_CLASSIC, Blocks.BIRCH_PLANKS, ModModels.TABLE_THE_CLASSIC);
        generateBlockModel(blockStateModelGenerator, ModBlocks.CHERRY_TABLE_THE_CLASSIC, Blocks.CHERRY_PLANKS, ModModels.TABLE_THE_CLASSIC);
        generateBlockModel(blockStateModelGenerator, ModBlocks.CRIMSON_TABLE_THE_CLASSIC, Blocks.CRIMSON_PLANKS, ModModels.TABLE_THE_CLASSIC);
        generateBlockModel(blockStateModelGenerator, ModBlocks.DARK_OAK_TABLE_THE_CLASSIC, Blocks.DARK_OAK_PLANKS, ModModels.TABLE_THE_CLASSIC);
        generateBlockModel(blockStateModelGenerator, ModBlocks.JUNGLE_TABLE_THE_CLASSIC, Blocks.JUNGLE_PLANKS, ModModels.TABLE_THE_CLASSIC);
        generateBlockModel(blockStateModelGenerator, ModBlocks.MANGROVE_TABLE_THE_CLASSIC, Blocks.MANGROVE_PLANKS, ModModels.TABLE_THE_CLASSIC);
        generateBlockModel(blockStateModelGenerator, ModBlocks.OAK_TABLE_THE_CLASSIC, Blocks.OAK_PLANKS, ModModels.TABLE_THE_CLASSIC);
        generateBlockModel(blockStateModelGenerator, ModBlocks.SPRUCE_TABLE_THE_CLASSIC, Blocks.SPRUCE_PLANKS, ModModels.TABLE_THE_CLASSIC);
        generateBlockModel(blockStateModelGenerator, ModBlocks.WARPED_TABLE_THE_CLASSIC, Blocks.WARPED_PLANKS, ModModels.TABLE_THE_CLASSIC);

        generateChairModel(blockStateModelGenerator, ModBlocks.ACACIA_CHAIR, Blocks.ACACIA_PLANKS, ModModels.CHAIR);
        generateChairModel(blockStateModelGenerator, ModBlocks.BAMBOO_CHAIR, Blocks.BAMBOO_PLANKS, ModModels.CHAIR);
        generateChairModel(blockStateModelGenerator, ModBlocks.BIRCH_CHAIR, Blocks.BIRCH_PLANKS, ModModels.CHAIR);
        generateChairModel(blockStateModelGenerator, ModBlocks.CHERRY_CHAIR, Blocks.CHERRY_PLANKS, ModModels.CHAIR);
        generateChairModel(blockStateModelGenerator, ModBlocks.CRIMSON_CHAIR, Blocks.CRIMSON_PLANKS, ModModels.CHAIR);
        generateChairModel(blockStateModelGenerator, ModBlocks.DARK_OAK_CHAIR, Blocks.DARK_OAK_PLANKS, ModModels.CHAIR);
        generateChairModel(blockStateModelGenerator, ModBlocks.JUNGLE_CHAIR, Blocks.JUNGLE_PLANKS, ModModels.CHAIR);
        generateChairModel(blockStateModelGenerator, ModBlocks.MANGROVE_CHAIR, Blocks.MANGROVE_PLANKS, ModModels.CHAIR);
        generateChairModel(blockStateModelGenerator, ModBlocks.OAK_CHAIR, Blocks.OAK_PLANKS, ModModels.CHAIR);
        generateChairModel(blockStateModelGenerator, ModBlocks.SPRUCE_CHAIR, Blocks.SPRUCE_PLANKS, ModModels.CHAIR);
        generateChairModel(blockStateModelGenerator, ModBlocks.WARPED_CHAIR, Blocks.WARPED_PLANKS, ModModels.CHAIR);

        generateChairModel(blockStateModelGenerator, ModBlocks.ACACIA_CHAIR_FELIX, Blocks.ACACIA_PLANKS, ModModels.CHAIR_FELIX);
        generateChairModel(blockStateModelGenerator, ModBlocks.BAMBOO_CHAIR_FELIX, Blocks.BAMBOO_PLANKS, ModModels.CHAIR_FELIX);
        generateChairModel(blockStateModelGenerator, ModBlocks.BIRCH_CHAIR_FELIX, Blocks.BIRCH_PLANKS, ModModels.CHAIR_FELIX);
        generateChairModel(blockStateModelGenerator, ModBlocks.CHERRY_CHAIR_FELIX, Blocks.CHERRY_PLANKS, ModModels.CHAIR_FELIX);
        generateChairModel(blockStateModelGenerator, ModBlocks.CRIMSON_CHAIR_FELIX, Blocks.CRIMSON_PLANKS, ModModels.CHAIR_FELIX);
        generateChairModel(blockStateModelGenerator, ModBlocks.DARK_OAK_CHAIR_FELIX, Blocks.DARK_OAK_PLANKS, ModModels.CHAIR_FELIX);
        generateChairModel(blockStateModelGenerator, ModBlocks.JUNGLE_CHAIR_FELIX, Blocks.JUNGLE_PLANKS, ModModels.CHAIR_FELIX);
        generateChairModel(blockStateModelGenerator, ModBlocks.MANGROVE_CHAIR_FELIX, Blocks.MANGROVE_PLANKS, ModModels.CHAIR_FELIX);
        generateChairModel(blockStateModelGenerator, ModBlocks.OAK_CHAIR_FELIX, Blocks.OAK_PLANKS, ModModels.CHAIR_FELIX);
        generateChairModel(blockStateModelGenerator, ModBlocks.SPRUCE_CHAIR_FELIX, Blocks.SPRUCE_PLANKS, ModModels.CHAIR_FELIX);
        generateChairModel(blockStateModelGenerator, ModBlocks.WARPED_CHAIR_FELIX, Blocks.WARPED_PLANKS, ModModels.CHAIR_FELIX);

        generateLadderBlockModel(ModBlocks.ACACIA_LADDER, blockStateModelGenerator);
        generateLadderBlockModel(ModBlocks.BAMBOO_LADDER, blockStateModelGenerator);
        generateLadderBlockModel(ModBlocks.BOUND_BAMBOO_LADDER, blockStateModelGenerator);
        generateLadderBlockModel(ModBlocks.BIRCH_LADDER, blockStateModelGenerator);
        generateLadderBlockModel(ModBlocks.CHERRY_LADDER, blockStateModelGenerator);
        generateLadderBlockModel(ModBlocks.CRIMSON_LADDER, blockStateModelGenerator);
        generateLadderBlockModel(ModBlocks.DARK_OAK_LADDER, blockStateModelGenerator);
        generateLadderBlockModel(ModBlocks.JUNGLE_LADDER, blockStateModelGenerator);
        generateLadderBlockModel(ModBlocks.MANGROVE_LADDER, blockStateModelGenerator);
        generateLadderBlockModel(ModBlocks.SPRUCE_LADDER, blockStateModelGenerator);
        generateLadderBlockModel(ModBlocks.WARPED_LADDER, blockStateModelGenerator);

        generateBlockModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.ACACIA_LOG, ModBlocks.ACACIA_COFFEE_TABLE, ModModels.COFFEE_TABLE);
        generateBlockModelForBamboo(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.BAMBOO_BLOCK, ModBlocks.BAMBOO_COFFEE_TABLE, ModModels.COFFEE_TABLE);
        generateBlockModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.BIRCH_LOG, ModBlocks.BIRCH_COFFEE_TABLE, ModModels.COFFEE_TABLE);
        generateBlockModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.CHERRY_LOG, ModBlocks.CHERRY_COFFEE_TABLE, ModModels.COFFEE_TABLE);
        generateBlockModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_STEM, ModBlocks.CRIMSON_COFFEE_TABLE, ModModels.COFFEE_TABLE);
        generateBlockModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_LOG, ModBlocks.DARK_OAK_COFFEE_TABLE, ModModels.COFFEE_TABLE);
        generateBlockModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_LOG, ModBlocks.JUNGLE_COFFEE_TABLE, ModModels.COFFEE_TABLE);
        generateBlockModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_LOG, ModBlocks.MANGROVE_COFFEE_TABLE, ModModels.COFFEE_TABLE);
        generateBlockModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.OAK_LOG, ModBlocks.OAK_COFFEE_TABLE, ModModels.COFFEE_TABLE);
        generateBlockModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_LOG, ModBlocks.SPRUCE_COFFEE_TABLE, ModModels.COFFEE_TABLE);
        generateBlockModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.WARPED_STEM, ModBlocks.WARPED_COFFEE_TABLE, ModModels.COFFEE_TABLE);

        generateBarrelSeatModel(blockStateModelGenerator, ModBlocks.ACACIA_BARREL_SEAT, Blocks.ACACIA_PLANKS, ModModels.BARREL_SEAT);
        generateBarrelSeatModel(blockStateModelGenerator, ModBlocks.BAMBOO_BARREL_SEAT, Blocks.BAMBOO_PLANKS, ModModels.BARREL_SEAT);
        generateBarrelSeatModel(blockStateModelGenerator, ModBlocks.BIRCH_BARREL_SEAT, Blocks.BIRCH_PLANKS, ModModels.BARREL_SEAT);
        generateBarrelSeatModel(blockStateModelGenerator, ModBlocks.CHERRY_BARREL_SEAT, Blocks.CHERRY_PLANKS, ModModels.BARREL_SEAT);
        generateBarrelSeatModel(blockStateModelGenerator, ModBlocks.CRIMSON_BARREL_SEAT, Blocks.CRIMSON_PLANKS, ModModels.BARREL_SEAT);
        generateBarrelSeatModel(blockStateModelGenerator, ModBlocks.DARK_OAK_BARREL_SEAT, Blocks.DARK_OAK_PLANKS, ModModels.BARREL_SEAT);
        generateBarrelSeatModel(blockStateModelGenerator, ModBlocks.JUNGLE_BARREL_SEAT, Blocks.JUNGLE_PLANKS, ModModels.BARREL_SEAT);
        generateBarrelSeatModel(blockStateModelGenerator, ModBlocks.MANGROVE_BARREL_SEAT, Blocks.MANGROVE_PLANKS, ModModels.BARREL_SEAT);
        generateBarrelSeatModel(blockStateModelGenerator, ModBlocks.OAK_BARREL_SEAT, Blocks.OAK_PLANKS, ModModels.BARREL_SEAT);
        generateBarrelSeatModel(blockStateModelGenerator, ModBlocks.SPRUCE_BARREL_SEAT, Blocks.SPRUCE_PLANKS, ModModels.BARREL_SEAT);
        generateBarrelSeatModel(blockStateModelGenerator, ModBlocks.WARPED_BARREL_SEAT, Blocks.WARPED_PLANKS, ModModels.BARREL_SEAT);

        generateAllTextureModel(blockStateModelGenerator, Blocks.ACACIA_LOG, Blocks.ACACIA_PLANKS, ModBlocks.ACACIA_STANDING_TABLE, ModModels.STANDING_TABLE);
        generateAllTextureModel(blockStateModelGenerator, Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_PLANKS, ModBlocks.BAMBOO_STANDING_TABLE, ModModels.STANDING_TABLE);
        generateAllTextureModel(blockStateModelGenerator, Blocks.BIRCH_LOG, Blocks.BIRCH_PLANKS, ModBlocks.BIRCH_STANDING_TABLE, ModModels.STANDING_TABLE);
        generateAllTextureModel(blockStateModelGenerator, Blocks.CHERRY_LOG, Blocks.CHERRY_PLANKS, ModBlocks.CHERRY_STANDING_TABLE, ModModels.STANDING_TABLE);
        generateAllTextureModel(blockStateModelGenerator, Blocks.CRIMSON_STEM, Blocks.CRIMSON_PLANKS, ModBlocks.CRIMSON_STANDING_TABLE, ModModels.STANDING_TABLE);
        generateAllTextureModel(blockStateModelGenerator, Blocks.DARK_OAK_LOG, Blocks.DARK_OAK_PLANKS, ModBlocks.DARK_OAK_STANDING_TABLE, ModModels.STANDING_TABLE);
        generateAllTextureModel(blockStateModelGenerator, Blocks.JUNGLE_LOG, Blocks.JUNGLE_PLANKS, ModBlocks.JUNGLE_STANDING_TABLE, ModModels.STANDING_TABLE);
        generateAllTextureModel(blockStateModelGenerator, Blocks.MANGROVE_LOG, Blocks.MANGROVE_PLANKS, ModBlocks.MANGROVE_STANDING_TABLE, ModModels.STANDING_TABLE);
        generateAllTextureModel(blockStateModelGenerator, Blocks.OAK_LOG, Blocks.OAK_PLANKS, ModBlocks.OAK_STANDING_TABLE, ModModels.STANDING_TABLE);
        generateAllTextureModel(blockStateModelGenerator, Blocks.SPRUCE_LOG, Blocks.SPRUCE_PLANKS, ModBlocks.SPRUCE_STANDING_TABLE, ModModels.STANDING_TABLE);
        generateAllTextureModel(blockStateModelGenerator, Blocks.WARPED_STEM, Blocks.WARPED_PLANKS, ModBlocks.WARPED_STANDING_TABLE, ModModels.STANDING_TABLE);

        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.WHITE_WOOL, Blocks.GOLD_BLOCK, ModBlocks.WHITE_BARBER_CHAIR, ModModels.BARBER_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.LIGHT_GRAY_WOOL, Blocks.GOLD_BLOCK, ModBlocks.LIGHT_GRAY_BARBER_CHAIR, ModModels.BARBER_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.GRAY_WOOL, Blocks.GOLD_BLOCK, ModBlocks.GRAY_BARBER_CHAIR, ModModels.BARBER_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.BLACK_WOOL, Blocks.GOLD_BLOCK, ModBlocks.BLACK_BARBER_CHAIR, ModModels.BARBER_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.BROWN_WOOL, Blocks.GOLD_BLOCK, ModBlocks.BROWN_BARBER_CHAIR, ModModels.BARBER_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.RED_WOOL, Blocks.GOLD_BLOCK, ModBlocks.RED_BARBER_CHAIR, ModModels.BARBER_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.ORANGE_WOOL, Blocks.GOLD_BLOCK, ModBlocks.ORANGE_BARBER_CHAIR, ModModels.BARBER_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.YELLOW_WOOL, Blocks.GOLD_BLOCK, ModBlocks.YELLOW_BARBER_CHAIR, ModModels.BARBER_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.LIME_WOOL, Blocks.GOLD_BLOCK, ModBlocks.LIME_BARBER_CHAIR, ModModels.BARBER_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.GREEN_WOOL, Blocks.GOLD_BLOCK, ModBlocks.GREEN_BARBER_CHAIR, ModModels.BARBER_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.CYAN_WOOL, Blocks.GOLD_BLOCK, ModBlocks.CYAN_BARBER_CHAIR, ModModels.BARBER_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.LIGHT_BLUE_WOOL, Blocks.GOLD_BLOCK, ModBlocks.LIGHT_BLUE_BARBER_CHAIR, ModModels.BARBER_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.BLUE_WOOL, Blocks.GOLD_BLOCK, ModBlocks.BLUE_BARBER_CHAIR, ModModels.BARBER_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.PURPLE_WOOL, Blocks.GOLD_BLOCK, ModBlocks.PURPLE_BARBER_CHAIR, ModModels.BARBER_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.MAGENTA_WOOL, Blocks.GOLD_BLOCK, ModBlocks.MAGENTA_BARBER_CHAIR, ModModels.BARBER_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.PINK_WOOL, Blocks.GOLD_BLOCK, ModBlocks.PINK_BARBER_CHAIR, ModModels.BARBER_CHAIR);

        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.WHITE_WOOL, Blocks.IRON_BLOCK, ModBlocks.WHITE_BAR_CHAIR, ModModels.BAR_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.LIGHT_GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.LIGHT_GRAY_BAR_CHAIR, ModModels.BAR_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.GRAY_BAR_CHAIR, ModModels.BAR_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.BLACK_WOOL, Blocks.IRON_BLOCK, ModBlocks.BLACK_BAR_CHAIR, ModModels.BAR_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.BROWN_WOOL, Blocks.IRON_BLOCK, ModBlocks.BROWN_BAR_CHAIR, ModModels.BAR_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.RED_WOOL, Blocks.IRON_BLOCK, ModBlocks.RED_BAR_CHAIR, ModModels.BAR_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.ORANGE_WOOL, Blocks.IRON_BLOCK, ModBlocks.ORANGE_BAR_CHAIR, ModModels.BAR_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.YELLOW_WOOL, Blocks.IRON_BLOCK, ModBlocks.YELLOW_BAR_CHAIR, ModModels.BAR_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.LIME_WOOL, Blocks.IRON_BLOCK, ModBlocks.LIME_BAR_CHAIR, ModModels.BAR_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.GREEN_WOOL, Blocks.IRON_BLOCK, ModBlocks.GREEN_BAR_CHAIR, ModModels.BAR_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.CYAN_WOOL, Blocks.IRON_BLOCK, ModBlocks.CYAN_BAR_CHAIR, ModModels.BAR_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.LIGHT_BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.LIGHT_BLUE_BAR_CHAIR, ModModels.BAR_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.BLUE_BAR_CHAIR, ModModels.BAR_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.PURPLE_WOOL, Blocks.IRON_BLOCK, ModBlocks.PURPLE_BAR_CHAIR, ModModels.BAR_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.MAGENTA_WOOL, Blocks.IRON_BLOCK, ModBlocks.MAGENTA_BAR_CHAIR, ModModels.BAR_CHAIR);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.PINK_WOOL, Blocks.IRON_BLOCK, ModBlocks.PINK_BAR_CHAIR, ModModels.BAR_CHAIR);

        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.IRON_BLOCK, ModBlocks.ACACIA_COFFEE_TABLE_PASCAL, ModModels.COFFEE_TABLE_PASCAL);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.IRON_BLOCK, ModBlocks.BAMBOO_COFFEE_TABLE_PASCAL, ModModels.COFFEE_TABLE_PASCAL);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.IRON_BLOCK, ModBlocks.BIRCH_COFFEE_TABLE_PASCAL, ModModels.COFFEE_TABLE_PASCAL);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.IRON_BLOCK, ModBlocks.CHERRY_COFFEE_TABLE_PASCAL, ModModels.COFFEE_TABLE_PASCAL);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.IRON_BLOCK, ModBlocks.CRIMSON_COFFEE_TABLE_PASCAL, ModModels.COFFEE_TABLE_PASCAL);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.IRON_BLOCK, ModBlocks.DARK_OAK_COFFEE_TABLE_PASCAL, ModModels.COFFEE_TABLE_PASCAL);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.IRON_BLOCK, ModBlocks.JUNGLE_COFFEE_TABLE_PASCAL, ModModels.COFFEE_TABLE_PASCAL);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.IRON_BLOCK, ModBlocks.MANGROVE_COFFEE_TABLE_PASCAL, ModModels.COFFEE_TABLE_PASCAL);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.IRON_BLOCK, ModBlocks.OAK_COFFEE_TABLE_PASCAL, ModModels.COFFEE_TABLE_PASCAL);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.IRON_BLOCK, ModBlocks.SPRUCE_COFFEE_TABLE_PASCAL, ModModels.COFFEE_TABLE_PASCAL);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.IRON_BLOCK, ModBlocks.WARPED_COFFEE_TABLE_PASCAL, ModModels.COFFEE_TABLE_PASCAL);

        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.IRON_BLOCK, ModBlocks.ACACIA_CHAIR_PASCAL, ModModels.CHAIR_PASCAL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.WHITE_WOOL, Blocks.IRON_BLOCK, ModBlocks.ACACIA_WHITE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.LIGHT_GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.ACACIA_LIGHT_GRAY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.ACACIA_GRAY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.BLACK_WOOL, Blocks.IRON_BLOCK, ModBlocks.ACACIA_BLACK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.BROWN_WOOL, Blocks.IRON_BLOCK, ModBlocks.ACACIA_BROWN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.RED_WOOL, Blocks.IRON_BLOCK, ModBlocks.ACACIA_RED_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.ORANGE_WOOL, Blocks.IRON_BLOCK, ModBlocks.ACACIA_ORANGE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.YELLOW_WOOL, Blocks.IRON_BLOCK, ModBlocks.ACACIA_YELLOW_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.LIME_WOOL, Blocks.IRON_BLOCK, ModBlocks.ACACIA_LIME_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.GREEN_WOOL, Blocks.IRON_BLOCK, ModBlocks.ACACIA_GREEN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.CYAN_WOOL, Blocks.IRON_BLOCK, ModBlocks.ACACIA_CYAN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.LIGHT_BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.ACACIA_LIGHT_BLUE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.ACACIA_BLUE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.PURPLE_WOOL, Blocks.IRON_BLOCK, ModBlocks.ACACIA_PURPLE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.MAGENTA_WOOL, Blocks.IRON_BLOCK, ModBlocks.ACACIA_MAGENTA_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.PINK_WOOL, Blocks.IRON_BLOCK, ModBlocks.ACACIA_PINK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.IRON_BLOCK, ModBlocks.BAMBOO_CHAIR_PASCAL, ModModels.CHAIR_PASCAL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.WHITE_WOOL, Blocks.IRON_BLOCK, ModBlocks.BAMBOO_WHITE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.LIGHT_GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.BAMBOO_LIGHT_GRAY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.BAMBOO_GRAY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.BLACK_WOOL, Blocks.IRON_BLOCK, ModBlocks.BAMBOO_BLACK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.BROWN_WOOL, Blocks.IRON_BLOCK, ModBlocks.BAMBOO_BROWN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.RED_WOOL, Blocks.IRON_BLOCK, ModBlocks.BAMBOO_RED_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.ORANGE_WOOL, Blocks.IRON_BLOCK, ModBlocks.BAMBOO_ORANGE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.YELLOW_WOOL, Blocks.IRON_BLOCK, ModBlocks.BAMBOO_YELLOW_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.LIME_WOOL, Blocks.IRON_BLOCK, ModBlocks.BAMBOO_LIME_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.GREEN_WOOL, Blocks.IRON_BLOCK, ModBlocks.BAMBOO_GREEN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.CYAN_WOOL, Blocks.IRON_BLOCK, ModBlocks.BAMBOO_CYAN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.LIGHT_BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.BAMBOO_LIGHT_BLUE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.BAMBOO_BLUE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.PURPLE_WOOL, Blocks.IRON_BLOCK, ModBlocks.BAMBOO_PURPLE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.MAGENTA_WOOL, Blocks.IRON_BLOCK, ModBlocks.BAMBOO_MAGENTA_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.PINK_WOOL, Blocks.IRON_BLOCK, ModBlocks.BAMBOO_PINK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.IRON_BLOCK, ModBlocks.BIRCH_CHAIR_PASCAL, ModModels.CHAIR_PASCAL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.WHITE_WOOL, Blocks.IRON_BLOCK, ModBlocks.BIRCH_WHITE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.LIGHT_GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.BIRCH_LIGHT_GRAY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.BIRCH_GRAY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.BLACK_WOOL, Blocks.IRON_BLOCK, ModBlocks.BIRCH_BLACK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.BROWN_WOOL, Blocks.IRON_BLOCK, ModBlocks.BIRCH_BROWN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.RED_WOOL, Blocks.IRON_BLOCK, ModBlocks.BIRCH_RED_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.ORANGE_WOOL, Blocks.IRON_BLOCK, ModBlocks.BIRCH_ORANGE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.YELLOW_WOOL, Blocks.IRON_BLOCK, ModBlocks.BIRCH_YELLOW_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.LIME_WOOL, Blocks.IRON_BLOCK, ModBlocks.BIRCH_LIME_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.GREEN_WOOL, Blocks.IRON_BLOCK, ModBlocks.BIRCH_GREEN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.CYAN_WOOL, Blocks.IRON_BLOCK, ModBlocks.BIRCH_CYAN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.LIGHT_BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.BIRCH_LIGHT_BLUE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.BIRCH_BLUE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.PURPLE_WOOL, Blocks.IRON_BLOCK, ModBlocks.BIRCH_PURPLE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.MAGENTA_WOOL, Blocks.IRON_BLOCK, ModBlocks.BIRCH_MAGENTA_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.PINK_WOOL, Blocks.IRON_BLOCK, ModBlocks.BIRCH_PINK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.IRON_BLOCK, ModBlocks.CHERRY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.WHITE_WOOL, Blocks.IRON_BLOCK, ModBlocks.CHERRY_WHITE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.LIGHT_GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.CHERRY_LIGHT_GRAY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.CHERRY_GRAY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.BLACK_WOOL, Blocks.IRON_BLOCK, ModBlocks.CHERRY_BLACK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.BROWN_WOOL, Blocks.IRON_BLOCK, ModBlocks.CHERRY_BROWN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.RED_WOOL, Blocks.IRON_BLOCK, ModBlocks.CHERRY_RED_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.ORANGE_WOOL, Blocks.IRON_BLOCK, ModBlocks.CHERRY_ORANGE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.YELLOW_WOOL, Blocks.IRON_BLOCK, ModBlocks.CHERRY_YELLOW_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.LIME_WOOL, Blocks.IRON_BLOCK, ModBlocks.CHERRY_LIME_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.GREEN_WOOL, Blocks.IRON_BLOCK, ModBlocks.CHERRY_GREEN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.CYAN_WOOL, Blocks.IRON_BLOCK, ModBlocks.CHERRY_CYAN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.LIGHT_BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.CHERRY_LIGHT_BLUE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.CHERRY_BLUE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.PURPLE_WOOL, Blocks.IRON_BLOCK, ModBlocks.CHERRY_PURPLE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.MAGENTA_WOOL, Blocks.IRON_BLOCK, ModBlocks.CHERRY_MAGENTA_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.PINK_WOOL, Blocks.IRON_BLOCK, ModBlocks.CHERRY_PINK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.IRON_BLOCK, ModBlocks.CRIMSON_CHAIR_PASCAL, ModModels.CHAIR_PASCAL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.WHITE_WOOL, Blocks.IRON_BLOCK, ModBlocks.CRIMSON_WHITE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.LIGHT_GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.CRIMSON_LIGHT_GRAY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.CRIMSON_GRAY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.BLACK_WOOL, Blocks.IRON_BLOCK, ModBlocks.CRIMSON_BLACK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.BROWN_WOOL, Blocks.IRON_BLOCK, ModBlocks.CRIMSON_BROWN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.RED_WOOL, Blocks.IRON_BLOCK, ModBlocks.CRIMSON_RED_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.ORANGE_WOOL, Blocks.IRON_BLOCK, ModBlocks.CRIMSON_ORANGE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.YELLOW_WOOL, Blocks.IRON_BLOCK, ModBlocks.CRIMSON_YELLOW_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.LIME_WOOL, Blocks.IRON_BLOCK, ModBlocks.CRIMSON_LIME_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.GREEN_WOOL, Blocks.IRON_BLOCK, ModBlocks.CRIMSON_GREEN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.CYAN_WOOL, Blocks.IRON_BLOCK, ModBlocks.CRIMSON_CYAN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.LIGHT_BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.CRIMSON_LIGHT_BLUE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.CRIMSON_BLUE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.PURPLE_WOOL, Blocks.IRON_BLOCK, ModBlocks.CRIMSON_PURPLE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.MAGENTA_WOOL, Blocks.IRON_BLOCK, ModBlocks.CRIMSON_MAGENTA_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.PINK_WOOL, Blocks.IRON_BLOCK, ModBlocks.CRIMSON_PINK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.IRON_BLOCK, ModBlocks.DARK_OAK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.WHITE_WOOL, Blocks.IRON_BLOCK, ModBlocks.DARK_OAK_WHITE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.LIGHT_GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.DARK_OAK_LIGHT_GRAY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.DARK_OAK_GRAY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.BLACK_WOOL, Blocks.IRON_BLOCK, ModBlocks.DARK_OAK_BLACK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.BROWN_WOOL, Blocks.IRON_BLOCK, ModBlocks.DARK_OAK_BROWN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.RED_WOOL, Blocks.IRON_BLOCK, ModBlocks.DARK_OAK_RED_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.ORANGE_WOOL, Blocks.IRON_BLOCK, ModBlocks.DARK_OAK_ORANGE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.YELLOW_WOOL, Blocks.IRON_BLOCK, ModBlocks.DARK_OAK_YELLOW_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.LIME_WOOL, Blocks.IRON_BLOCK, ModBlocks.DARK_OAK_LIME_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.GREEN_WOOL, Blocks.IRON_BLOCK, ModBlocks.DARK_OAK_GREEN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.CYAN_WOOL, Blocks.IRON_BLOCK, ModBlocks.DARK_OAK_CYAN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.LIGHT_BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.DARK_OAK_LIGHT_BLUE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.DARK_OAK_BLUE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.PURPLE_WOOL, Blocks.IRON_BLOCK, ModBlocks.DARK_OAK_PURPLE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.MAGENTA_WOOL, Blocks.IRON_BLOCK, ModBlocks.DARK_OAK_MAGENTA_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.PINK_WOOL, Blocks.IRON_BLOCK, ModBlocks.DARK_OAK_PINK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.IRON_BLOCK, ModBlocks.JUNGLE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.WHITE_WOOL, Blocks.IRON_BLOCK, ModBlocks.JUNGLE_WHITE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.LIGHT_GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.JUNGLE_LIGHT_GRAY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.JUNGLE_GRAY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.BLACK_WOOL, Blocks.IRON_BLOCK, ModBlocks.JUNGLE_BLACK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.BROWN_WOOL, Blocks.IRON_BLOCK, ModBlocks.JUNGLE_BROWN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.RED_WOOL, Blocks.IRON_BLOCK, ModBlocks.JUNGLE_RED_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.ORANGE_WOOL, Blocks.IRON_BLOCK, ModBlocks.JUNGLE_ORANGE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.YELLOW_WOOL, Blocks.IRON_BLOCK, ModBlocks.JUNGLE_YELLOW_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.LIME_WOOL, Blocks.IRON_BLOCK, ModBlocks.JUNGLE_LIME_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.GREEN_WOOL, Blocks.IRON_BLOCK, ModBlocks.JUNGLE_GREEN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.CYAN_WOOL, Blocks.IRON_BLOCK, ModBlocks.JUNGLE_CYAN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.LIGHT_BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.JUNGLE_LIGHT_BLUE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.JUNGLE_BLUE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.PURPLE_WOOL, Blocks.IRON_BLOCK, ModBlocks.JUNGLE_PURPLE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.MAGENTA_WOOL, Blocks.IRON_BLOCK, ModBlocks.JUNGLE_MAGENTA_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.PINK_WOOL, Blocks.IRON_BLOCK, ModBlocks.JUNGLE_PINK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.IRON_BLOCK, ModBlocks.MANGROVE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.WHITE_WOOL, Blocks.IRON_BLOCK, ModBlocks.MANGROVE_WHITE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.LIGHT_GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.MANGROVE_LIGHT_GRAY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.MANGROVE_GRAY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.BLACK_WOOL, Blocks.IRON_BLOCK, ModBlocks.MANGROVE_BLACK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.BROWN_WOOL, Blocks.IRON_BLOCK, ModBlocks.MANGROVE_BROWN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.RED_WOOL, Blocks.IRON_BLOCK, ModBlocks.MANGROVE_RED_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.ORANGE_WOOL, Blocks.IRON_BLOCK, ModBlocks.MANGROVE_ORANGE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.YELLOW_WOOL, Blocks.IRON_BLOCK, ModBlocks.MANGROVE_YELLOW_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.LIME_WOOL, Blocks.IRON_BLOCK, ModBlocks.MANGROVE_LIME_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.GREEN_WOOL, Blocks.IRON_BLOCK, ModBlocks.MANGROVE_GREEN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.CYAN_WOOL, Blocks.IRON_BLOCK, ModBlocks.MANGROVE_CYAN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.LIGHT_BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.MANGROVE_LIGHT_BLUE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.MANGROVE_BLUE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.PURPLE_WOOL, Blocks.IRON_BLOCK, ModBlocks.MANGROVE_PURPLE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.MAGENTA_WOOL, Blocks.IRON_BLOCK, ModBlocks.MANGROVE_MAGENTA_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.PINK_WOOL, Blocks.IRON_BLOCK, ModBlocks.MANGROVE_PINK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.IRON_BLOCK, ModBlocks.OAK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.WHITE_WOOL, Blocks.IRON_BLOCK, ModBlocks.OAK_WHITE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.LIGHT_GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.OAK_LIGHT_GRAY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.OAK_GRAY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.BLACK_WOOL, Blocks.IRON_BLOCK, ModBlocks.OAK_BLACK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.BROWN_WOOL, Blocks.IRON_BLOCK, ModBlocks.OAK_BROWN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.RED_WOOL, Blocks.IRON_BLOCK, ModBlocks.OAK_RED_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.ORANGE_WOOL, Blocks.IRON_BLOCK, ModBlocks.OAK_ORANGE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.YELLOW_WOOL, Blocks.IRON_BLOCK, ModBlocks.OAK_YELLOW_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.LIME_WOOL, Blocks.IRON_BLOCK, ModBlocks.OAK_LIME_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.GREEN_WOOL, Blocks.IRON_BLOCK, ModBlocks.OAK_GREEN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.CYAN_WOOL, Blocks.IRON_BLOCK, ModBlocks.OAK_CYAN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.LIGHT_BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.OAK_LIGHT_BLUE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.OAK_BLUE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.PURPLE_WOOL, Blocks.IRON_BLOCK, ModBlocks.OAK_PURPLE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.MAGENTA_WOOL, Blocks.IRON_BLOCK, ModBlocks.OAK_MAGENTA_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.PINK_WOOL, Blocks.IRON_BLOCK, ModBlocks.OAK_PINK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.IRON_BLOCK, ModBlocks.SPRUCE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.WHITE_WOOL, Blocks.IRON_BLOCK, ModBlocks.SPRUCE_WHITE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.LIGHT_GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.SPRUCE_LIGHT_GRAY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.SPRUCE_GRAY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.BLACK_WOOL, Blocks.IRON_BLOCK, ModBlocks.SPRUCE_BLACK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.BROWN_WOOL, Blocks.IRON_BLOCK, ModBlocks.SPRUCE_BROWN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.RED_WOOL, Blocks.IRON_BLOCK, ModBlocks.SPRUCE_RED_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.ORANGE_WOOL, Blocks.IRON_BLOCK, ModBlocks.SPRUCE_ORANGE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.YELLOW_WOOL, Blocks.IRON_BLOCK, ModBlocks.SPRUCE_YELLOW_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.LIME_WOOL, Blocks.IRON_BLOCK, ModBlocks.SPRUCE_LIME_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.GREEN_WOOL, Blocks.IRON_BLOCK, ModBlocks.SPRUCE_GREEN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.CYAN_WOOL, Blocks.IRON_BLOCK, ModBlocks.SPRUCE_CYAN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.LIGHT_BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.SPRUCE_LIGHT_BLUE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.SPRUCE_BLUE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.PURPLE_WOOL, Blocks.IRON_BLOCK, ModBlocks.SPRUCE_PURPLE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.MAGENTA_WOOL, Blocks.IRON_BLOCK, ModBlocks.SPRUCE_MAGENTA_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.PINK_WOOL, Blocks.IRON_BLOCK, ModBlocks.SPRUCE_PINK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalTextureBottomModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.IRON_BLOCK, ModBlocks.WARPED_CHAIR_PASCAL, ModModels.CHAIR_PASCAL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.WHITE_WOOL, Blocks.IRON_BLOCK, ModBlocks.WARPED_WHITE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.LIGHT_GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.WARPED_LIGHT_GRAY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.GRAY_WOOL, Blocks.IRON_BLOCK, ModBlocks.WARPED_GRAY_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.BLACK_WOOL, Blocks.IRON_BLOCK, ModBlocks.WARPED_BLACK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.BROWN_WOOL, Blocks.IRON_BLOCK, ModBlocks.WARPED_BROWN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.RED_WOOL, Blocks.IRON_BLOCK, ModBlocks.WARPED_RED_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.ORANGE_WOOL, Blocks.IRON_BLOCK, ModBlocks.WARPED_ORANGE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.YELLOW_WOOL, Blocks.IRON_BLOCK, ModBlocks.WARPED_YELLOW_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.LIME_WOOL, Blocks.IRON_BLOCK, ModBlocks.WARPED_LIME_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.GREEN_WOOL, Blocks.IRON_BLOCK, ModBlocks.WARPED_GREEN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.CYAN_WOOL, Blocks.IRON_BLOCK, ModBlocks.WARPED_CYAN_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.LIGHT_BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.WARPED_LIGHT_BLUE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.BLUE_WOOL, Blocks.IRON_BLOCK, ModBlocks.WARPED_BLUE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.PURPLE_WOOL, Blocks.IRON_BLOCK, ModBlocks.WARPED_PURPLE_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.MAGENTA_WOOL, Blocks.IRON_BLOCK, ModBlocks.WARPED_MAGENTA_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
        generateDirectionalAllTextureBottomModelModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.PINK_WOOL, Blocks.IRON_BLOCK, ModBlocks.WARPED_PINK_CHAIR_PASCAL, ModModels.CHAIR_PASCAL_WITH_WOOL);
    }

    private void generateLadderBlockModel(Block block, BlockStateModelGenerator blockStateModelGenerator) {
        TextureMap textureMap = TextureMap.texture(block).put(TextureKey.PARTICLE, TextureMap.getId(block));
        ModModels.LADDER.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(block);
    }

    private void generateBarrelSeatModel(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureBlock, Model model) {
        Identifier identifier = Registries.BLOCK.getId(block);
        TextureMap textureMap = TextureMap.texture(textureBlock).put(TextureKey.SIDE, identifier
                        .withPath("block/dark_iron_block")).put(TextureKey.PARTICLE, TextureMap.getId(textureBlock));
        model.upload(block, textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(block);
    }

    private void generateBlockModel(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureBlock, Model model) {
        TextureMap textureMap = TextureMap.all(textureBlock).put(TextureKey.PARTICLE, TextureMap.getId(textureBlock));
        Identifier modelId = model.upload(block, textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier
                .create(block, BlockStateVariant.create().put(VariantSettings.MODEL, modelId)));
    }

    private void generateBlockModel(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block secondTextureBlock, Block block, Model model) {
        TextureMap textureMap = TextureMap.all(textureBlock)
                .put(TextureKey.TEXTURE, TextureMap.getId(secondTextureBlock))
                .put(TextureKey.BOTTOM, TextureMap.getId(secondTextureBlock).withSuffixedPath("_top"))
                .put(TextureKey.PARTICLE, TextureMap.getId(textureBlock));
        Identifier modelId = model.upload(block, textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier
                .create(block, BlockStateVariant.create().put(VariantSettings.MODEL, modelId)));
    }

    private void generateBlockModelForBamboo(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block secondTextureBlock, Block block, Model model) {
        TextureMap textureMap = TextureMap.all(textureBlock)
                .put(TextureKey.TEXTURE, TextureMap.getId(secondTextureBlock))
                .put(TextureKey.BOTTOM, TextureMap.getId(secondTextureBlock))
                .put(TextureKey.PARTICLE, TextureMap.getId(textureBlock));
        Identifier modelId = model.upload(block, textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier
                .create(block, BlockStateVariant.create().put(VariantSettings.MODEL, modelId)));
    }

    private void generateParkBenchModel(BlockStateModelGenerator blockStateModelGenerator, String id, Block particleBlock,
                                        Block textureBlock) {
        String left = BenchPart.LEFT.asString();
        String right = BenchPart.RIGHT.asString();
        TextureMap textureLeft = getParkBenchPartTexture(id, left, particleBlock);
        TextureMap textureRight = getParkBenchPartTexture(id, right, particleBlock);

        Identifier parkBenchLeftModelId = ModModels.PARK_BENCH_LEFT.upload(textureBlock, "_" + left, textureLeft,
                blockStateModelGenerator.modelCollector);
        Identifier parkBenchRightModelId = ModModels.PARK_BENCH_RIGHT.upload(textureBlock, "_" + right, textureRight,
                blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createBenchBlockState(textureBlock, parkBenchLeftModelId, parkBenchRightModelId));
    }

    private TextureMap getParkBenchPartTexture(String id, String part, Block particleBlock) {
        return TextureMap.all(Identifier.of(MOD_ID, "block/seats/" + id + "_park_bench_" + part))
                .put(TextureKey.PARTICLE, TextureMap.getId(particleBlock));
    }

    private static BlockStateSupplier createBenchBlockState(Block benchBlock, Identifier leftBenchModelId, Identifier rightBenchModelId) {
        BlockStateVariantMap.DoubleProperty<Direction, BenchPart> blockStateVariantMap = BlockStateVariantMap
                .create(Properties.HORIZONTAL_FACING, ModProperties.BENCH_BLOCK_PART);

        return VariantsBlockStateSupplier.create(benchBlock)
                .coordinate(fillBenchVariantMap(blockStateVariantMap, leftBenchModelId, rightBenchModelId));
    }

    private static BlockStateVariantMap.DoubleProperty<Direction, BenchPart> fillBenchVariantMap(BlockStateVariantMap.DoubleProperty<Direction, BenchPart> variantMap, Identifier leftBenchModelId, Identifier rightBenchModelId) {
        return variantMap.register(Direction.EAST, BenchPart.LEFT, createRotatedBlockStateVariant(leftBenchModelId, VariantSettings.Rotation.R90))
                .register(Direction.SOUTH, BenchPart.LEFT, createRotatedBlockStateVariant(leftBenchModelId, VariantSettings.Rotation.R180))
                .register(Direction.WEST, BenchPart.LEFT, createRotatedBlockStateVariant(leftBenchModelId, VariantSettings.Rotation.R270))
                .register(Direction.NORTH, BenchPart.LEFT, createBlockStateVariant(leftBenchModelId))
                .register(Direction.EAST, BenchPart.RIGHT, createRotatedBlockStateVariant(rightBenchModelId, VariantSettings.Rotation.R90))
                .register(Direction.SOUTH, BenchPart.RIGHT, createRotatedBlockStateVariant(rightBenchModelId, VariantSettings.Rotation.R180))
                .register(Direction.WEST, BenchPart.RIGHT, createRotatedBlockStateVariant(rightBenchModelId, VariantSettings.Rotation.R270))
                .register(Direction.NORTH, BenchPart.RIGHT, createBlockStateVariant(rightBenchModelId));
    }

    private void generateChairLukasModel(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block chairBlock, Model model) {
        TextureMap textureMap = TextureMap.all(textureBlock)
                .put(TextureKey.BOTTOM, TextureMap.getId(textureBlock))
                .put(TextureKey.PARTICLE, TextureMap.getId(textureBlock));
        Identifier chairModelId = model.upload(chairBlock, textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createDirectionalBlockState(chairBlock, chairModelId));
    }

    private void generateChairLukasModel(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block secondTextureLog, Block chairBlock, Model model) {
        TextureMap textureMap = TextureMap.all(textureBlock)
                .put(TextureKey.BOTTOM, TextureMap.getId(secondTextureLog).withSuffixedPath("_top"))
                .put(TextureKey.PARTICLE, TextureMap.getId(textureBlock));
        Identifier chairModelId = model.upload(chairBlock, textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createDirectionalBlockState(chairBlock, chairModelId));
    }

    private void generateAllTextureModel(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block secondTextureLog, Block block, Model model) {
        TextureMap textureMap = TextureMap.all(textureBlock)
                .put(TextureKey.TEXTURE, TextureMap.getId(secondTextureLog))
                .put(TextureKey.PARTICLE, TextureMap.getId(textureBlock));
        Identifier modelId = model.upload(block, textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier
                .create(block, BlockStateVariant.create().put(VariantSettings.MODEL, modelId)));
    }

    private void generateDirectionalTextureBottomModel(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block secondTextureLog, Block block, Model model) {
        TextureMap textureMap = TextureMap.texture(textureBlock)
                .put(TextureKey.BOTTOM, TextureMap.getId(secondTextureLog))
                .put(TextureKey.PARTICLE, TextureMap.getId(textureBlock));
        Identifier modelId = model.upload(block, textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createDirectionalBlockState(block, modelId));
    }

    private void generateAllTextureBottomModelModelWithSuffixedPath(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block secondTextureLog, Block block, Model model) {
        TextureMap textureMap = TextureMap.all(textureBlock)
                .put(TextureKey.TEXTURE, TextureMap.getId(secondTextureLog))
                .put(TextureKey.BOTTOM, TextureMap.getId(secondTextureLog).withSuffixedPath("_top"))
                .put(TextureKey.PARTICLE, TextureMap.getId(textureBlock));
        Identifier modelId = model.upload(block, textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createDirectionalBlockState(block, modelId));
    }

    private void generateDirectionalAllTextureBottomModelModel(BlockStateModelGenerator blockStateModelGenerator,
                                                               Block allBlock, Block textureBlock, Block bottomBlock, Block block, Model model) {
        TextureMap textureMap = TextureMap.all(allBlock)
                .put(TextureKey.TEXTURE, TextureMap.getId(textureBlock))
                .put(TextureKey.BOTTOM, TextureMap.getId(bottomBlock))
                .put(TextureKey.PARTICLE, TextureMap.getId(allBlock));
        Identifier chairModelId = model.upload(block, textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createDirectionalBlockState(block, chairModelId));
    }

    private void generateChairModel(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureBlock, Model model) {
        TextureMap textureMap = TextureMap.all(textureBlock).put(TextureKey.PARTICLE, TextureMap.getId(textureBlock));
        Identifier modelId = model.upload(block, textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createDirectionalBlockState(block, modelId));
    }

    private static BlockStateSupplier createDirectionalBlockState(Block block, Identifier modelId) {
        BlockStateVariantMap.SingleProperty<Direction> blockStateVariantMap = BlockStateVariantMap
                .create(Properties.HORIZONTAL_FACING);

        return VariantsBlockStateSupplier.create(block)
                .coordinate(fillDirectionalVariantMap(blockStateVariantMap, modelId));
    }

    private static BlockStateVariantMap.SingleProperty<Direction> fillDirectionalVariantMap
            (BlockStateVariantMap.SingleProperty<Direction> blockStateVariantMap, Identifier modelId) {
        return blockStateVariantMap.register(Direction.EAST, createRotatedBlockStateVariant(modelId, VariantSettings.Rotation.R90))
                .register(Direction.SOUTH, createRotatedBlockStateVariant(modelId, VariantSettings.Rotation.R180))
                .register(Direction.WEST, createRotatedBlockStateVariant(modelId, VariantSettings.Rotation.R270))
                .register(Direction.NORTH, createBlockStateVariant(modelId));
    }

    private static BlockStateVariant createRotatedBlockStateVariant(Identifier modelId, VariantSettings.Rotation rotation) {
        return createBlockStateVariant(modelId)
                .put(VariantSettings.Y, rotation);
    }

    private static BlockStateVariant createBlockStateVariant(Identifier modelId) {
        return BlockStateVariant.create()
                .put(VariantSettings.MODEL, modelId);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        registerGeneratedBlockModel(ModBlocks.ACACIA_LADDER, itemModelGenerator);
        registerGeneratedBlockModel(ModBlocks.BAMBOO_LADDER, itemModelGenerator);
        registerGeneratedBlockModel(ModBlocks.BOUND_BAMBOO_LADDER, itemModelGenerator);
        registerGeneratedBlockModel(ModBlocks.BIRCH_LADDER, itemModelGenerator);
        registerGeneratedBlockModel(ModBlocks.CHERRY_LADDER, itemModelGenerator);
        registerGeneratedBlockModel(ModBlocks.CRIMSON_LADDER, itemModelGenerator);
        registerGeneratedBlockModel(ModBlocks.DARK_OAK_LADDER, itemModelGenerator);
        registerGeneratedBlockModel(ModBlocks.JUNGLE_LADDER, itemModelGenerator);
        registerGeneratedBlockModel(ModBlocks.MANGROVE_LADDER, itemModelGenerator);
        registerGeneratedBlockModel(ModBlocks.SPRUCE_LADDER, itemModelGenerator);
        registerGeneratedBlockModel(ModBlocks.WARPED_LADDER, itemModelGenerator);

        itemModelGenerator.register(ModBlocks.ACACIA_PARK_BENCH.asItem(), ModModels.PARK_BENCH);
        itemModelGenerator.register(ModBlocks.BAMBOO_PARK_BENCH.asItem(), ModModels.PARK_BENCH);
        itemModelGenerator.register(ModBlocks.BIRCH_PARK_BENCH.asItem(), ModModels.PARK_BENCH);
        itemModelGenerator.register(ModBlocks.CHERRY_PARK_BENCH.asItem(), ModModels.PARK_BENCH);
        itemModelGenerator.register(ModBlocks.CRIMSON_PARK_BENCH.asItem(), ModModels.PARK_BENCH);
        itemModelGenerator.register(ModBlocks.DARK_OAK_PARK_BENCH.asItem(), ModModels.PARK_BENCH);
        itemModelGenerator.register(ModBlocks.JUNGLE_PARK_BENCH.asItem(), ModModels.PARK_BENCH);
        itemModelGenerator.register(ModBlocks.MANGROVE_PARK_BENCH.asItem(), ModModels.PARK_BENCH);
        itemModelGenerator.register(ModBlocks.OAK_PARK_BENCH.asItem(), ModModels.PARK_BENCH);
        itemModelGenerator.register(ModBlocks.SPRUCE_PARK_BENCH.asItem(), ModModels.PARK_BENCH);
        itemModelGenerator.register(ModBlocks.WARPED_PARK_BENCH.asItem(), ModModels.PARK_BENCH);

        itemModelGenerator.register(ModItems.WOODEN_SAW, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_SAW, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_SAW, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_SAW, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_SAW, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_SAW, Models.HANDHELD);
    }

    private void registerGeneratedBlockModel(Block block, ItemModelGenerator itemModelGenerator) {
        Models.GENERATED.upload(ModelIds.getItemModelId(block.asItem()), TextureMap.layer0(block), itemModelGenerator.writer);
    }
}
