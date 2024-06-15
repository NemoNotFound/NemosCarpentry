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
        generateAllTextureBottomModelModelWithoutSuffixedPath(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.BAMBOO_BLOCK, ModBlocks.BAMBOO_CHAIR_LUKAS_NATURAL, ModModels.CHAIR_LUKAS_NATURAL);
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
        generateAllTextureBottomModelModelWithoutSuffixedPath(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.BAMBOO_BLOCK, ModBlocks.BAMBOO_CHAIR_TOMMY_NATURAL, ModModels.CHAIR_TOMMY_NATURAL);
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
        generateAllTextureBottomModelModelWithoutSuffixedPath(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.BAMBOO_BLOCK, ModBlocks.BAMBOO_CHAIR_GREGORY, ModModels.CHAIR_GREGORY);
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
        Identifier modelId = model.upload(block, textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier
                .create(block, BlockStateVariant.create().put(VariantSettings.MODEL, modelId)));
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
        return TextureMap.all(new Identifier(MOD_ID, "block/seats/" + id + "_park_bench_" + part))
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

    private void generateAllTextureBottomModelModelWithSuffixedPath(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block secondTextureLog, Block chairBlock, Model model) {
        TextureMap textureMap = TextureMap.all(textureBlock)
                .put(TextureKey.TEXTURE, TextureMap.getId(secondTextureLog))
                .put(TextureKey.BOTTOM, TextureMap.getId(secondTextureLog).withSuffixedPath("_top"))
                .put(TextureKey.PARTICLE, TextureMap.getId(textureBlock));
        Identifier chairModelId = model.upload(chairBlock, textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createDirectionalBlockState(chairBlock, chairModelId));
    }

    private void generateAllTextureBottomModelModelWithoutSuffixedPath(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block secondTextureLog, Block chairBlock, Model model) {
        TextureMap textureMap = TextureMap.all(textureBlock)
                .put(TextureKey.TEXTURE, TextureMap.getId(secondTextureLog))
                .put(TextureKey.BOTTOM, TextureMap.getId(secondTextureLog))
                .put(TextureKey.PARTICLE, TextureMap.getId(textureBlock));
        Identifier chairModelId = model.upload(chairBlock, textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createDirectionalBlockState(chairBlock, chairModelId));
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

        itemModelGenerator.register(ModBlocks.ACACIA_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.BIRCH_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.CHERRY_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.CRIMSON_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.DARK_OAK_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.JUNGLE_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.MANGROVE_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.SPRUCE_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.WARPED_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.ACACIA_SOUL_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.BIRCH_SOUL_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.CHERRY_SOUL_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.CRIMSON_SOUL_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.DARK_OAK_SOUL_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.JUNGLE_SOUL_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.MANGROVE_SOUL_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.SPRUCE_SOUL_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.WARPED_SOUL_CAMPFIRE.asItem(), Models.GENERATED);

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
