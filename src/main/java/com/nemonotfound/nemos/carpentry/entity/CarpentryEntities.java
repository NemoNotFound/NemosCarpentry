package com.nemonotfound.nemos.carpentry.entity;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import static com.nemonotfound.nemos.carpentry.NemosCarpentry.MOD_ID;
import static com.nemonotfound.nemos.carpentry.NemosCarpentry.log;

public class CarpentryEntities {

    public static final EntityType<ChairEntity> CHAIR_ENTITY = register("chair_entity",
            EntityType.Builder.of(ChairEntity::new, MobCategory.MISC)
                    .sized(0, 0)
                    .fireImmune()
                    .noSummon());

    public static void registerEntities() {
        log.info("Registering entities");
    }

    private static <T extends Entity> EntityType<T> register(String path, EntityType.Builder<T> type) {
        return register(keyOf(path), type);
    }

    private static ResourceKey<EntityType<?>> keyOf(String path) {
        return ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, path));
    }

    private static <T extends Entity> EntityType<T> register(ResourceKey<EntityType<?>> key, EntityType.Builder<T> type) {
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, key, type.build(key));
    }
}
