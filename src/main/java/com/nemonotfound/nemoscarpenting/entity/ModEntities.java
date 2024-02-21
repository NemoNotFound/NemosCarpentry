package com.nemonotfound.nemoscarpenting.entity;

import com.nemonotfound.nemoscarpenting.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.nemonotfound.NemosCarpenting.MOD_ID;
import static com.nemonotfound.NemosCarpenting.log;

public class ModEntities {

    public static final BlockEntityType<CarpentingTableBlockEntity> CARPENTING_TABLE_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(MOD_ID, "carpenting_table_block_entity"),
                    FabricBlockEntityTypeBuilder.create(CarpentingTableBlockEntity::new, ModBlocks.CARPENTING_TABLE).build());
    public static final EntityType<ChairEntity> CHAIR_ENTITY = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(MOD_ID, "chair_entity"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, ChairEntity::new)
                    .dimensions(new EntityDimensions(0, 0, true))
                    .fireImmune()
                    .disableSummon()
                    .build());

    public static void registerEntities() {
        log.info("Registering entities");
    }
}
