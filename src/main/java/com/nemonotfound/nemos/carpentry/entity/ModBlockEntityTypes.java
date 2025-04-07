package com.nemonotfound.nemos.carpentry.entity;

import com.nemonotfound.nemos.carpentry.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemos.carpentry.NemosCarpentry.MOD_ID;
import static com.nemonotfound.nemos.carpentry.NemosCarpentry.log;

public class ModBlockEntityTypes {

    public static final BlockEntityType<CarpentersWorkbenchBlockEntity> CARPENTERS_WORKBENCH_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(MOD_ID, "carpenters_workbench_block_entity"),
                    FabricBlockEntityTypeBuilder.create(CarpentersWorkbenchBlockEntity::new, ModBlocks.CARPENTERS_WORKBENCH)
                            .build());

    public static void registerBlockEntityTypes() {
        log.info("Registering block entity types");
    }
}
