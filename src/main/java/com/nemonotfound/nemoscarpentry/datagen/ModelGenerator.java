package com.nemonotfound.nemoscarpentry.datagen;

import com.nemonotfound.nemoscarpentry.block.ModBlocks;
import com.nemonotfound.nemoscarpentry.block.enums.BenchPart;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemoscarpentry.NemosCarpentry.MOD_ID;

public class ModelGenerator extends FabricModelProvider {

    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
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

        ModModels.PARK_BENCH_LEFT.upload(textureBlock, "_" + left, textureLeft,
                blockStateModelGenerator.modelCollector);
        ModModels.PARK_BENCH_RIGHT.upload(textureBlock, "_" + right, textureRight,
                blockStateModelGenerator.modelCollector);
    }

    private TextureMap getParkBenchPartTexture(String id, String part, Block particleBlock) {
        return TextureMap.all(new Identifier(MOD_ID, "block/seats/" + id + "_park_bench_" + part))
                .put(TextureKey.PARTICLE, TextureMap.getId(particleBlock));
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
