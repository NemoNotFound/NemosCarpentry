package com.nemonotfound.nemoscarpentry.entity;

import com.nemonotfound.nemoscarpentry.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemoscarpentry.NemosCarpentry.MOD_ID;
import static com.nemonotfound.nemoscarpentry.NemosCarpentry.log;

public class ModBlockEntityTypes {

    public static final BlockEntityType<CarpentersWorkbenchBlockEntity> CARPENTERS_WORKBENCH_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(MOD_ID, "carpenters_workbench_block_entity"),
                    FabricBlockEntityTypeBuilder.create(CarpentersWorkbenchBlockEntity::new, ModBlocks.CARPENTERS_WORKBENCH)
                            .build());

    public static void registerBlockEntityTypes() {
        log.info("Registering block entity types");

        BlockEntityType.CAMPFIRE.addSupportedBlock(ModBlocks.ACACIA_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addSupportedBlock(ModBlocks.ACACIA_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addSupportedBlock(ModBlocks.BIRCH_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addSupportedBlock(ModBlocks.BIRCH_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addSupportedBlock(ModBlocks.CHERRY_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addSupportedBlock(ModBlocks.CHERRY_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addSupportedBlock(ModBlocks.CRIMSON_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addSupportedBlock(ModBlocks.CRIMSON_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addSupportedBlock(ModBlocks.DARK_OAK_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addSupportedBlock(ModBlocks.DARK_OAK_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addSupportedBlock(ModBlocks.JUNGLE_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addSupportedBlock(ModBlocks.JUNGLE_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addSupportedBlock(ModBlocks.MANGROVE_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addSupportedBlock(ModBlocks.MANGROVE_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addSupportedBlock(ModBlocks.SPRUCE_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addSupportedBlock(ModBlocks.SPRUCE_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addSupportedBlock(ModBlocks.WARPED_CAMPFIRE);
        BlockEntityType.CAMPFIRE.addSupportedBlock(ModBlocks.WARPED_SOUL_CAMPFIRE);
    }
}
