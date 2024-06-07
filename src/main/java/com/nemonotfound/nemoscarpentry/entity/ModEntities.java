package com.nemonotfound.nemoscarpentry.entity;

import com.nemonotfound.nemoscarpentry.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemoscarpentry.NemosCarpentry.MOD_ID;
import static com.nemonotfound.nemoscarpentry.NemosCarpentry.log;

public class ModEntities {

    public static final BlockEntityType<CarpentersWorkbenchBlockEntity> CARPENTERS_WORKBENCH_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(MOD_ID, "carpenters_workbench_block_entity"),
                    BlockEntityType.Builder.create(CarpentersWorkbenchBlockEntity::new, ModBlocks.CARPENTERS_WORKBENCH)
                            .build());
    public static final EntityType<ChairEntity> CHAIR_ENTITY = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(MOD_ID, "chair_entity"),
            EntityType.Builder.create(ChairEntity::new, SpawnGroup.MISC)
                    .dimensions(0, 0)
                    .makeFireImmune()
                    .disableSummon()
                    .build());

    public static final BlockEntityType<CustomCampfireBlockEntity> CUSTOM_CAMPFIRE_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of("custom_campfire_block_entity"),
                    BlockEntityType.Builder.create(CustomCampfireBlockEntity::new, ModBlocks.ACACIA_CAMPFIRE,
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
