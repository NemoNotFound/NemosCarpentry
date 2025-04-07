package com.nemonotfound.nemos.carpentry.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemos.carpentry.NemosCarpentry.MOD_ID;
import static com.nemonotfound.nemos.carpentry.NemosCarpentry.log;

public class ModEntities {

    public static final EntityType<ChairEntity> CHAIR_ENTITY = register("chair_entity",
            EntityType.Builder.create(ChairEntity::new, SpawnGroup.MISC)
                    .dimensions(0, 0)
                    .makeFireImmune()
                    .disableSummon());

    public static void registerEntities() {
        log.info("Registering entities");
    }

    private static <T extends Entity> EntityType<T> register(String path, EntityType.Builder<T> type) {
        return register(keyOf(path), type);
    }

    private static RegistryKey<EntityType<?>> keyOf(String path) {
        return RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(MOD_ID, path));
    }

    private static <T extends Entity> EntityType<T> register(RegistryKey<EntityType<?>> key, EntityType.Builder<T> type) {
        return Registry.register(Registries.ENTITY_TYPE, key, type.build(key));
    }
}
