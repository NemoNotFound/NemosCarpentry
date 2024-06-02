package com.nemonotfound.nemoscarpentry.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemoscarpentry.NemosCarpentry.MOD_ID;

public class ModItemGroups {

    public static String NEMOS_CARPENTRY_GROUP_ID = "nemos-carpentry";
    public static final RegistryKey<ItemGroup> NEMOS_CARPENTRY =
            getItemGroup(NEMOS_CARPENTRY_GROUP_ID);

    public static void registerItemGroups() {
        registerNemosCarpentryItemGroup(ModItems.IRON_SAW);
        registerSeatsItemGroup(ModItems.OAK_CHAIR_FELIX);
        registerTablesItemGroup(ModItems.OAK_TABLE_THE_CLASSIC);
        registerOutdoorItemGroup(ModItems.SPRUCE_CAMPFIRE);
        modifyFunctionalItemGroup();
        modifyToolItemGroup();
    }

    private static void registerNemosCarpentryItemGroup(Item iconItem) {
        ItemGroup ITEM_GROUP = FabricItemGroup.builder()
                .icon(() -> new ItemStack(iconItem))
                .displayName(Text.translatable("Nemo's Carpentry"))
                .entries((context, entries) -> {
                    entries.add(ModItems.CARPENTERS_WORKBENCH);
                    entries.add(ModItems.WOODEN_SAW);
                    entries.add(ModItems.STONE_SAW);
                    entries.add(ModItems.IRON_SAW);
                    entries.add(ModItems.GOLDEN_SAW);
                    entries.add(ModItems.DIAMOND_SAW);
                    entries.add(ModItems.NETHERITE_SAW);
                    entries.add(ModItems.ACACIA_LADDER);
                    entries.add(ModItems.BAMBOO_LADDER);
                    entries.add(ModItems.BOUND_BAMBOO_LADDER);
                    entries.add(ModItems.BIRCH_LADDER);
                    entries.add(ModItems.CHERRY_LADDER);
                    entries.add(ModItems.CRIMSON_LADDER);
                    entries.add(ModItems.DARK_OAK_LADDER);
                    entries.add(ModItems.JUNGLE_LADDER);
                    entries.add(ModItems.MANGROVE_LADDER);
                    entries.add(ModItems.SPRUCE_LADDER);
                    entries.add(ModItems.WARPED_LADDER);
                    entries.add(ModItems.ACACIA_CHAIR);
                    entries.add(ModItems.BAMBOO_CHAIR);
                    entries.add(ModItems.BIRCH_CHAIR);
                    entries.add(ModItems.CHERRY_CHAIR);
                    entries.add(ModItems.CRIMSON_CHAIR);
                    entries.add(ModItems.DARK_OAK_CHAIR);
                    entries.add(ModItems.JUNGLE_CHAIR);
                    entries.add(ModItems.MANGROVE_CHAIR);
                    entries.add(ModItems.OAK_CHAIR);
                    entries.add(ModItems.SPRUCE_CHAIR);
                    entries.add(ModItems.WARPED_CHAIR);
                    entries.add(ModItems.ACACIA_CHAIR_FELIX);
                    entries.add(ModItems.BAMBOO_CHAIR_FELIX);
                    entries.add(ModItems.BIRCH_CHAIR_FELIX);
                    entries.add(ModItems.CHERRY_CHAIR_FELIX);
                    entries.add(ModItems.CRIMSON_CHAIR_FELIX);
                    entries.add(ModItems.DARK_OAK_CHAIR_FELIX);
                    entries.add(ModItems.JUNGLE_CHAIR_FELIX);
                    entries.add(ModItems.MANGROVE_CHAIR_FELIX);
                    entries.add(ModItems.OAK_CHAIR_FELIX);
                    entries.add(ModItems.SPRUCE_CHAIR_FELIX);
                    entries.add(ModItems.WARPED_CHAIR_FELIX);
                    entries.add(ModItems.ACACIA_CHAIR_LUKAS);
                    entries.add(ModItems.BAMBOO_CHAIR_LUKAS);
                    entries.add(ModItems.BIRCH_CHAIR_LUKAS);
                    entries.add(ModItems.CHERRY_CHAIR_LUKAS);
                    entries.add(ModItems.CRIMSON_CHAIR_LUKAS);
                    entries.add(ModItems.DARK_OAK_CHAIR_LUKAS);
                    entries.add(ModItems.JUNGLE_CHAIR_LUKAS);
                    entries.add(ModItems.MANGROVE_CHAIR_LUKAS);
                    entries.add(ModItems.OAK_CHAIR_LUKAS);
                    entries.add(ModItems.SPRUCE_CHAIR_LUKAS);
                    entries.add(ModItems.WARPED_CHAIR_LUKAS);
                    entries.add(ModItems.ACACIA_PARK_BENCH);
                    entries.add(ModItems.BAMBOO_PARK_BENCH);
                    entries.add(ModItems.BIRCH_PARK_BENCH);
                    entries.add(ModItems.CHERRY_PARK_BENCH);
                    entries.add(ModItems.CRIMSON_PARK_BENCH);
                    entries.add(ModItems.DARK_OAK_PARK_BENCH);
                    entries.add(ModItems.JUNGLE_PARK_BENCH);
                    entries.add(ModItems.MANGROVE_PARK_BENCH);
                    entries.add(ModItems.OAK_PARK_BENCH);
                    entries.add(ModItems.SPRUCE_PARK_BENCH);
                    entries.add(ModItems.WARPED_PARK_BENCH);
                    entries.add(ModItems.ACACIA_LOG_SEAT);
                    entries.add(ModItems.BIRCH_LOG_SEAT);
                    entries.add(ModItems.CHERRY_LOG_SEAT);
                    entries.add(ModItems.CRIMSON_STEM_SEAT);
                    entries.add(ModItems.DARK_OAK_LOG_SEAT);
                    entries.add(ModItems.JUNGLE_LOG_SEAT);
                    entries.add(ModItems.MANGROVE_LOG_SEAT);
                    entries.add(ModItems.OAK_LOG_SEAT);
                    entries.add(ModItems.SPRUCE_LOG_SEAT);
                    entries.add(ModItems.WARPED_STEM_SEAT);
                    entries.add(ModItems.ACACIA_TABLE_THE_CLASSIC);
                    entries.add(ModItems.BAMBOO_TABLE_THE_CLASSIC);
                    entries.add(ModItems.BIRCH_TABLE_THE_CLASSIC);
                    entries.add(ModItems.CHERRY_TABLE_THE_CLASSIC);
                    entries.add(ModItems.CRIMSON_TABLE_THE_CLASSIC);
                    entries.add(ModItems.DARK_OAK_TABLE_THE_CLASSIC);
                    entries.add(ModItems.JUNGLE_TABLE_THE_CLASSIC);
                    entries.add(ModItems.MANGROVE_TABLE_THE_CLASSIC);
                    entries.add(ModItems.OAK_TABLE_THE_CLASSIC);
                    entries.add(ModItems.SPRUCE_TABLE_THE_CLASSIC);
                    entries.add(ModItems.WARPED_TABLE_THE_CLASSIC);
                    entries.add(ModItems.ACACIA_CAMPFIRE);
                    entries.add(ModItems.ACACIA_SOUL_CAMPFIRE);
                    entries.add(ModItems.BIRCH_CAMPFIRE);
                    entries.add(ModItems.BIRCH_SOUL_CAMPFIRE);
                    entries.add(ModItems.CHERRY_CAMPFIRE);
                    entries.add(ModItems.CHERRY_SOUL_CAMPFIRE);
                    entries.add(ModItems.CRIMSON_CAMPFIRE);
                    entries.add(ModItems.CRIMSON_SOUL_CAMPFIRE);
                    entries.add(ModItems.DARK_OAK_CAMPFIRE);
                    entries.add(ModItems.DARK_OAK_SOUL_CAMPFIRE);
                    entries.add(ModItems.JUNGLE_CAMPFIRE);
                    entries.add(ModItems.JUNGLE_SOUL_CAMPFIRE);
                    entries.add(ModItems.MANGROVE_CAMPFIRE);
                    entries.add(ModItems.MANGROVE_SOUL_CAMPFIRE);
                    entries.add(ModItems.SPRUCE_CAMPFIRE);
                    entries.add(ModItems.SPRUCE_SOUL_CAMPFIRE);
                    entries.add(ModItems.WARPED_CAMPFIRE);
                    entries.add(ModItems.WARPED_SOUL_CAMPFIRE);
                })
                .build();

        Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, NEMOS_CARPENTRY_GROUP_ID), ITEM_GROUP);
    }

    private static void registerSeatsItemGroup(Item iconItem) {
        ItemGroup ITEM_GROUP = FabricItemGroup.builder()
                .icon(() -> new ItemStack(iconItem))
                .displayName(Text.translatable("Seats"))
                .entries((context, entries) -> {
                    entries.add(ModItems.ACACIA_CHAIR);
                    entries.add(ModItems.BAMBOO_CHAIR);
                    entries.add(ModItems.BIRCH_CHAIR);
                    entries.add(ModItems.CHERRY_CHAIR);
                    entries.add(ModItems.CRIMSON_CHAIR);
                    entries.add(ModItems.DARK_OAK_CHAIR);
                    entries.add(ModItems.JUNGLE_CHAIR);
                    entries.add(ModItems.MANGROVE_CHAIR);
                    entries.add(ModItems.OAK_CHAIR);
                    entries.add(ModItems.SPRUCE_CHAIR);
                    entries.add(ModItems.WARPED_CHAIR);
                    entries.add(ModItems.ACACIA_CHAIR_FELIX);
                    entries.add(ModItems.BAMBOO_CHAIR_FELIX);
                    entries.add(ModItems.BIRCH_CHAIR_FELIX);
                    entries.add(ModItems.CHERRY_CHAIR_FELIX);
                    entries.add(ModItems.CRIMSON_CHAIR_FELIX);
                    entries.add(ModItems.DARK_OAK_CHAIR_FELIX);
                    entries.add(ModItems.JUNGLE_CHAIR_FELIX);
                    entries.add(ModItems.MANGROVE_CHAIR_FELIX);
                    entries.add(ModItems.OAK_CHAIR_FELIX);
                    entries.add(ModItems.SPRUCE_CHAIR_FELIX);
                    entries.add(ModItems.WARPED_CHAIR_FELIX);
                    entries.add(ModItems.ACACIA_CHAIR_LUKAS);
                    entries.add(ModItems.BAMBOO_CHAIR_LUKAS);
                    entries.add(ModItems.BIRCH_CHAIR_LUKAS);
                    entries.add(ModItems.CHERRY_CHAIR_LUKAS);
                    entries.add(ModItems.CRIMSON_CHAIR_LUKAS);
                    entries.add(ModItems.DARK_OAK_CHAIR_LUKAS);
                    entries.add(ModItems.JUNGLE_CHAIR_LUKAS);
                    entries.add(ModItems.MANGROVE_CHAIR_LUKAS);
                    entries.add(ModItems.OAK_CHAIR_LUKAS);
                    entries.add(ModItems.SPRUCE_CHAIR_LUKAS);
                    entries.add(ModItems.WARPED_CHAIR_LUKAS);
                    entries.add(ModItems.ACACIA_PARK_BENCH);
                    entries.add(ModItems.BAMBOO_PARK_BENCH);
                    entries.add(ModItems.BIRCH_PARK_BENCH);
                    entries.add(ModItems.CHERRY_PARK_BENCH);
                    entries.add(ModItems.CRIMSON_PARK_BENCH);
                    entries.add(ModItems.DARK_OAK_PARK_BENCH);
                    entries.add(ModItems.JUNGLE_PARK_BENCH);
                    entries.add(ModItems.MANGROVE_PARK_BENCH);
                    entries.add(ModItems.OAK_PARK_BENCH);
                    entries.add(ModItems.SPRUCE_PARK_BENCH);
                    entries.add(ModItems.WARPED_PARK_BENCH);
                    entries.add(ModItems.ACACIA_LOG_SEAT);
                    entries.add(ModItems.BIRCH_LOG_SEAT);
                    entries.add(ModItems.CHERRY_LOG_SEAT);
                    entries.add(ModItems.CRIMSON_STEM_SEAT);
                    entries.add(ModItems.DARK_OAK_LOG_SEAT);
                    entries.add(ModItems.JUNGLE_LOG_SEAT);
                    entries.add(ModItems.MANGROVE_LOG_SEAT);
                    entries.add(ModItems.OAK_LOG_SEAT);
                    entries.add(ModItems.SPRUCE_LOG_SEAT);
                    entries.add(ModItems.WARPED_STEM_SEAT);
                })
                .build();

        Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, NEMOS_CARPENTRY_GROUP_ID + "_seats"), ITEM_GROUP);
    }

    private static void registerTablesItemGroup(Item iconItem) {
        ItemGroup ITEM_GROUP = FabricItemGroup.builder()
                .icon(() -> new ItemStack(iconItem))
                .displayName(Text.translatable("Tables"))
                .entries((context, entries) -> {
                    entries.add(ModItems.ACACIA_TABLE_THE_CLASSIC);
                    entries.add(ModItems.BAMBOO_TABLE_THE_CLASSIC);
                    entries.add(ModItems.BIRCH_TABLE_THE_CLASSIC);
                    entries.add(ModItems.CHERRY_TABLE_THE_CLASSIC);
                    entries.add(ModItems.CRIMSON_TABLE_THE_CLASSIC);
                    entries.add(ModItems.DARK_OAK_TABLE_THE_CLASSIC);
                    entries.add(ModItems.JUNGLE_TABLE_THE_CLASSIC);
                    entries.add(ModItems.MANGROVE_TABLE_THE_CLASSIC);
                    entries.add(ModItems.OAK_TABLE_THE_CLASSIC);
                    entries.add(ModItems.SPRUCE_TABLE_THE_CLASSIC);
                    entries.add(ModItems.WARPED_TABLE_THE_CLASSIC);
                })
                .build();

        Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, NEMOS_CARPENTRY_GROUP_ID + "_tables"), ITEM_GROUP);
    }

    private static void registerOutdoorItemGroup(Item iconItem) {
        ItemGroup ITEM_GROUP = FabricItemGroup.builder()
                .icon(() -> new ItemStack(iconItem))
                .displayName(Text.translatable("Outdoor"))
                .entries((context, entries) -> {
                    entries.add(ModItems.ACACIA_LADDER);
                    entries.add(ModItems.BAMBOO_LADDER);
                    entries.add(ModItems.BOUND_BAMBOO_LADDER);
                    entries.add(ModItems.BIRCH_LADDER);
                    entries.add(ModItems.CHERRY_LADDER);
                    entries.add(ModItems.CRIMSON_LADDER);
                    entries.add(ModItems.DARK_OAK_LADDER);
                    entries.add(ModItems.JUNGLE_LADDER);
                    entries.add(ModItems.MANGROVE_LADDER);
                    entries.add(ModItems.SPRUCE_LADDER);
                    entries.add(ModItems.WARPED_LADDER);
                    entries.add(ModItems.ACACIA_PARK_BENCH);
                    entries.add(ModItems.BAMBOO_PARK_BENCH);
                    entries.add(ModItems.BIRCH_PARK_BENCH);
                    entries.add(ModItems.CHERRY_PARK_BENCH);
                    entries.add(ModItems.CRIMSON_PARK_BENCH);
                    entries.add(ModItems.DARK_OAK_PARK_BENCH);
                    entries.add(ModItems.JUNGLE_PARK_BENCH);
                    entries.add(ModItems.MANGROVE_PARK_BENCH);
                    entries.add(ModItems.OAK_PARK_BENCH);
                    entries.add(ModItems.SPRUCE_PARK_BENCH);
                    entries.add(ModItems.WARPED_PARK_BENCH);
                    entries.add(ModItems.ACACIA_LOG_SEAT);
                    entries.add(ModItems.BIRCH_LOG_SEAT);
                    entries.add(ModItems.CHERRY_LOG_SEAT);
                    entries.add(ModItems.CRIMSON_STEM_SEAT);
                    entries.add(ModItems.DARK_OAK_LOG_SEAT);
                    entries.add(ModItems.JUNGLE_LOG_SEAT);
                    entries.add(ModItems.MANGROVE_LOG_SEAT);
                    entries.add(ModItems.OAK_LOG_SEAT);
                    entries.add(ModItems.SPRUCE_LOG_SEAT);
                    entries.add(ModItems.WARPED_STEM_SEAT);
                    entries.add(ModItems.ACACIA_CAMPFIRE);
                    entries.add(ModItems.ACACIA_SOUL_CAMPFIRE);
                    entries.add(ModItems.BIRCH_CAMPFIRE);
                    entries.add(ModItems.BIRCH_SOUL_CAMPFIRE);
                    entries.add(ModItems.CHERRY_CAMPFIRE);
                    entries.add(ModItems.CHERRY_SOUL_CAMPFIRE);
                    entries.add(ModItems.CRIMSON_CAMPFIRE);
                    entries.add(ModItems.CRIMSON_SOUL_CAMPFIRE);
                    entries.add(ModItems.DARK_OAK_CAMPFIRE);
                    entries.add(ModItems.DARK_OAK_SOUL_CAMPFIRE);
                    entries.add(ModItems.JUNGLE_CAMPFIRE);
                    entries.add(ModItems.JUNGLE_SOUL_CAMPFIRE);
                    entries.add(ModItems.MANGROVE_CAMPFIRE);
                    entries.add(ModItems.MANGROVE_SOUL_CAMPFIRE);
                    entries.add(ModItems.SPRUCE_CAMPFIRE);
                    entries.add(ModItems.SPRUCE_SOUL_CAMPFIRE);
                    entries.add(ModItems.WARPED_CAMPFIRE);
                    entries.add(ModItems.WARPED_SOUL_CAMPFIRE);
                })
                .build();

        Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, NEMOS_CARPENTRY_GROUP_ID + "_outdoor"), ITEM_GROUP);
    }

    private static void modifyFunctionalItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
            content.addAfter(Items.CRAFTING_TABLE, ModItems.CARPENTERS_WORKBENCH);
            content.addBefore(Items.LADDER, ModItems.ACACIA_LADDER);
            content.addBefore(Items.LADDER, ModItems.BAMBOO_LADDER);
            content.addBefore(Items.LADDER, ModItems.BOUND_BAMBOO_LADDER);
            content.addBefore(Items.LADDER, ModItems.BIRCH_LADDER);
            content.addBefore(Items.LADDER, ModItems.CHERRY_LADDER);
            content.addBefore(Items.LADDER, ModItems.CRIMSON_LADDER);
            content.addBefore(Items.LADDER, ModItems.DARK_OAK_LADDER);
            content.addBefore(Items.LADDER, ModItems.JUNGLE_LADDER);
            content.addBefore(Items.LADDER, ModItems.MANGROVE_LADDER);
            content.addAfter(Items.LADDER, ModItems.SPRUCE_LADDER);
            content.addAfter(ModItems.SPRUCE_LADDER, ModItems.WARPED_LADDER);
            content.add(ModItems.ACACIA_CHAIR);
            content.add(ModItems.BAMBOO_CHAIR);
            content.add(ModItems.BIRCH_CHAIR);
            content.add(ModItems.CHERRY_CHAIR);
            content.add(ModItems.CRIMSON_CHAIR);
            content.add(ModItems.DARK_OAK_CHAIR);
            content.add(ModItems.JUNGLE_CHAIR);
            content.add(ModItems.MANGROVE_CHAIR);
            content.add(ModItems.OAK_CHAIR);
            content.add(ModItems.SPRUCE_CHAIR);
            content.add(ModItems.WARPED_CHAIR);
            content.add(ModItems.ACACIA_CHAIR_FELIX);
            content.add(ModItems.BAMBOO_CHAIR_FELIX);
            content.add(ModItems.BIRCH_CHAIR_FELIX);
            content.add(ModItems.CHERRY_CHAIR_FELIX);
            content.add(ModItems.CRIMSON_CHAIR_FELIX);
            content.add(ModItems.DARK_OAK_CHAIR_FELIX);
            content.add(ModItems.JUNGLE_CHAIR_FELIX);
            content.add(ModItems.MANGROVE_CHAIR_FELIX);
            content.add(ModItems.OAK_CHAIR_FELIX);
            content.add(ModItems.SPRUCE_CHAIR_FELIX);
            content.add(ModItems.WARPED_CHAIR_FELIX);
            content.add(ModItems.ACACIA_CHAIR_LUKAS);
            content.add(ModItems.BAMBOO_CHAIR_LUKAS);
            content.add(ModItems.BIRCH_CHAIR_LUKAS);
            content.add(ModItems.CHERRY_CHAIR_LUKAS);
            content.add(ModItems.CRIMSON_CHAIR_LUKAS);
            content.add(ModItems.DARK_OAK_CHAIR_LUKAS);
            content.add(ModItems.JUNGLE_CHAIR_LUKAS);
            content.add(ModItems.MANGROVE_CHAIR_LUKAS);
            content.add(ModItems.OAK_CHAIR_LUKAS);
            content.add(ModItems.SPRUCE_CHAIR_LUKAS);
            content.add(ModItems.WARPED_CHAIR_LUKAS);
            content.add(ModItems.ACACIA_PARK_BENCH);
            content.add(ModItems.BAMBOO_PARK_BENCH);
            content.add(ModItems.BIRCH_PARK_BENCH);
            content.add(ModItems.CHERRY_PARK_BENCH);
            content.add(ModItems.CRIMSON_PARK_BENCH);
            content.add(ModItems.DARK_OAK_PARK_BENCH);
            content.add(ModItems.JUNGLE_PARK_BENCH);
            content.add(ModItems.MANGROVE_PARK_BENCH);
            content.add(ModItems.OAK_PARK_BENCH);
            content.add(ModItems.SPRUCE_PARK_BENCH);
            content.add(ModItems.WARPED_PARK_BENCH);
            content.add(ModItems.ACACIA_LOG_SEAT);
            content.add(ModItems.BIRCH_LOG_SEAT);
            content.add(ModItems.CHERRY_LOG_SEAT);
            content.add(ModItems.CRIMSON_STEM_SEAT);
            content.add(ModItems.DARK_OAK_LOG_SEAT);
            content.add(ModItems.JUNGLE_LOG_SEAT);
            content.add(ModItems.MANGROVE_LOG_SEAT);
            content.add(ModItems.OAK_LOG_SEAT);
            content.add(ModItems.SPRUCE_LOG_SEAT);
            content.add(ModItems.WARPED_STEM_SEAT);
            content.add(ModItems.ACACIA_TABLE_THE_CLASSIC);
            content.add(ModItems.BAMBOO_TABLE_THE_CLASSIC);
            content.add(ModItems.BIRCH_TABLE_THE_CLASSIC);
            content.add(ModItems.CHERRY_TABLE_THE_CLASSIC);
            content.add(ModItems.CRIMSON_TABLE_THE_CLASSIC);
            content.add(ModItems.DARK_OAK_TABLE_THE_CLASSIC);
            content.add(ModItems.JUNGLE_TABLE_THE_CLASSIC);
            content.add(ModItems.MANGROVE_TABLE_THE_CLASSIC);
            content.add(ModItems.OAK_TABLE_THE_CLASSIC);
            content.add(ModItems.SPRUCE_TABLE_THE_CLASSIC);
            content.add(ModItems.WARPED_TABLE_THE_CLASSIC);
            content.addBefore(Items.CAMPFIRE, ModItems.ACACIA_CAMPFIRE);
            content.addBefore(Items.CAMPFIRE, ModItems.ACACIA_SOUL_CAMPFIRE);
            content.addBefore(Items.CAMPFIRE, ModItems.BIRCH_CAMPFIRE);
            content.addBefore(Items.CAMPFIRE, ModItems.BIRCH_SOUL_CAMPFIRE);
            content.addBefore(Items.CAMPFIRE, ModItems.CHERRY_CAMPFIRE);
            content.addBefore(Items.CAMPFIRE, ModItems.CHERRY_SOUL_CAMPFIRE);
            content.addBefore(Items.CAMPFIRE, ModItems.CRIMSON_CAMPFIRE);
            content.addBefore(Items.CAMPFIRE, ModItems.CRIMSON_SOUL_CAMPFIRE);
            content.addBefore(Items.CAMPFIRE, ModItems.DARK_OAK_CAMPFIRE);
            content.addBefore(Items.CAMPFIRE, ModItems.DARK_OAK_SOUL_CAMPFIRE);
            content.addBefore(Items.CAMPFIRE, ModItems.JUNGLE_CAMPFIRE);
            content.addBefore(Items.CAMPFIRE, ModItems.JUNGLE_SOUL_CAMPFIRE);
            content.addBefore(Items.CAMPFIRE, ModItems.MANGROVE_CAMPFIRE);
            content.addBefore(Items.CAMPFIRE, ModItems.MANGROVE_SOUL_CAMPFIRE);
            content.addAfter(Items.SOUL_CAMPFIRE, ModItems.SPRUCE_CAMPFIRE);
            content.addAfter(ModItems.SPRUCE_CAMPFIRE, ModItems.SPRUCE_SOUL_CAMPFIRE);
            content.addAfter(ModItems.SPRUCE_SOUL_CAMPFIRE, ModItems.WARPED_CAMPFIRE);
            content.addAfter(ModItems.WARPED_CAMPFIRE, ModItems.WARPED_SOUL_CAMPFIRE);
        });
    }

    private static void modifyToolItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.addAfter(Items.WOODEN_HOE, ModItems.WOODEN_SAW);
            content.addAfter(Items.STONE_HOE,ModItems.STONE_SAW);
            content.addAfter(Items.IRON_HOE,ModItems.IRON_SAW);
            content.addAfter(Items.GOLDEN_HOE,ModItems.GOLDEN_SAW);
            content.addAfter(Items.DIAMOND_HOE,ModItems.DIAMOND_SAW);
            content.addAfter(Items.NETHERITE_HOE,ModItems.NETHERITE_SAW);
        });
    }

    private static RegistryKey<ItemGroup> getItemGroup(String path) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, path));
    }
}
