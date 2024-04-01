package com.nemonotfound.nemoscarpentry.entity;

import com.nemonotfound.nemoscarpentry.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemoscarpentry.NemosCarpentry.MOD_ID;
import static com.nemonotfound.nemoscarpentry.NemosCarpentry.log;

public class ModEntities {

    public static final BlockEntityType<CarpentryTableBlockEntity> CARPENTERS_WORKBENCH_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(MOD_ID, "carpenters_workbench_block_entity"),
                    FabricBlockEntityTypeBuilder.create(CarpentryTableBlockEntity::new, ModBlocks.CARPENTERS_WORKBENCH).build());
    public static final EntityType<ChairEntity> CHAIR_ENTITY = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(MOD_ID, "chair_entity"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, ChairEntity::new)
                    .dimensions(new EntityDimensions(0, 0, true))
                    .fireImmune()
                    .disableSummon()
                    .build());

    public static final BlockEntityType<CustomCampfireBlockEntity> CUSTOM_CAMPFIRE_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier("custom_campfire_block_entity"),
                    FabricBlockEntityTypeBuilder.create(CustomCampfireBlockEntity::new, ModBlocks.ACACIA_CAMPFIRE,
                            ModBlocks.ACACIA_SOUL_CAMPFIRE, ModBlocks.BIRCH_CAMPFIRE,
                            ModBlocks.BIRCH_SOUL_CAMPFIRE, ModBlocks.CHERRY_CAMPFIRE,
                            ModBlocks.CHERRY_SOUL_CAMPFIRE, ModBlocks.CRIMSON_CAMPFIRE,
                            ModBlocks.CRIMSON_SOUL_CAMPFIRE, ModBlocks.DARK_OAK_CAMPFIRE,
                            ModBlocks.DARK_OAK_SOUL_CAMPFIRE, ModBlocks.JUNGLE_CAMPFIRE,
                            ModBlocks.JUNGLE_SOUL_CAMPFIRE, ModBlocks.MANGROVE_CAMPFIRE,
                            ModBlocks.MANGROVE_SOUL_CAMPFIRE, ModBlocks.SPRUCE_CAMPFIRE,
                            ModBlocks.SPRUCE_SOUL_CAMPFIRE, ModBlocks.WARPED_CAMPFIRE,
                            ModBlocks.WARPED_SOUL_CAMPFIRE).build());

    public static void registerEntities() {
        log.info("Registering entities");
    }
}
