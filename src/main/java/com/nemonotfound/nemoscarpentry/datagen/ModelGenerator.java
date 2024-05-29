package com.nemonotfound.nemoscarpentry.datagen;

import com.nemonotfound.nemoscarpentry.block.ModBlocks;
import com.nemonotfound.nemoscarpentry.block.enums.BenchPart;
import com.nemonotfound.nemoscarpentry.property.ModProperties;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

import static com.nemonotfound.nemoscarpentry.NemosCarpentry.MOD_ID;

public class ModelGenerator extends FabricModelProvider {

    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        generateChairModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.ACACIA_LOG, ModBlocks.ACACIA_CHAIR_LUKAS, ModModels.CHAIR_LUKAS);
        generateChairModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, ModBlocks.BAMBOO_CHAIR_LUKAS, ModModels.CHAIR_LUKAS);
        generateChairModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.BIRCH_LOG, ModBlocks.BIRCH_CHAIR_LUKAS, ModModels.CHAIR_LUKAS);
        generateChairModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.CHERRY_LOG, ModBlocks.CHERRY_CHAIR_LUKAS, ModModels.CHAIR_LUKAS);
        generateChairModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_STEM, ModBlocks.CRIMSON_CHAIR_LUKAS, ModModels.CHAIR_LUKAS);
        generateChairModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_LOG, ModBlocks.DARK_OAK_CHAIR_LUKAS, ModModels.CHAIR_LUKAS);
        generateChairModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_LOG, ModBlocks.JUNGLE_CHAIR_LUKAS, ModModels.CHAIR_LUKAS);
        generateChairModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_LOG, ModBlocks.MANGROVE_CHAIR_LUKAS, ModModels.CHAIR_LUKAS);
        generateChairModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.OAK_LOG, ModBlocks.OAK_CHAIR_LUKAS, ModModels.CHAIR_LUKAS);
        generateChairModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_LOG, ModBlocks.SPRUCE_CHAIR_LUKAS, ModModels.CHAIR_LUKAS);
        generateChairModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.WARPED_STEM, ModBlocks.WARPED_CHAIR_LUKAS, ModModels.CHAIR_LUKAS);

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

    private void generateChairModel(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block chairBlock, Model model) {
        TextureMap textureMap = TextureMap.all(textureBlock)
                .put(TextureKey.BOTTOM, TextureMap.getId(textureBlock))
                .put(TextureKey.PARTICLE, TextureMap.getId(textureBlock));
        Identifier chairModelId = model.upload(chairBlock, textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createChairBlockState(chairBlock, chairModelId));
    }

    private void generateChairModel(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block secondTextureLog, Block chairBlock, Model model) {
        TextureMap textureMap = TextureMap.all(textureBlock)
                .put(TextureKey.BOTTOM, TextureMap.getId(secondTextureLog).withSuffixedPath("_top"))
                .put(TextureKey.PARTICLE, TextureMap.getId(textureBlock));
        Identifier chairModelId = model.upload(chairBlock, textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createChairBlockState(chairBlock, chairModelId));
    }

    private static BlockStateSupplier createChairBlockState(Block block, Identifier chairModelId) {
        BlockStateVariantMap.SingleProperty<Direction> blockStateVariantMap = BlockStateVariantMap
                .create(Properties.HORIZONTAL_FACING);

        return VariantsBlockStateSupplier.create(block)
                .coordinate(fillChairVariantMap(blockStateVariantMap, chairModelId));
    }

    private static BlockStateVariantMap.SingleProperty<Direction> fillChairVariantMap
            (BlockStateVariantMap.SingleProperty<Direction> blockStateVariantMap, Identifier chairModelId) {
        return blockStateVariantMap.register(Direction.EAST, createRotatedBlockStateVariant(chairModelId, VariantSettings.Rotation.R90))
                .register(Direction.SOUTH, createRotatedBlockStateVariant(chairModelId, VariantSettings.Rotation.R180))
                .register(Direction.WEST, createRotatedBlockStateVariant(chairModelId, VariantSettings.Rotation.R270))
                .register(Direction.NORTH, createBlockStateVariant(chairModelId));
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
    }
}
