package com.nemonotfound.nemoscarpentry.item;

import com.nemonotfound.nemoscarpentry.block.ModBlocks;
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
                    entries.add(ModItems.ACACIA_CHAIR_LUKAS_NATURAL);
                    entries.add(ModItems.BAMBOO_CHAIR_LUKAS_NATURAL);
                    entries.add(ModItems.BIRCH_CHAIR_LUKAS_NATURAL);
                    entries.add(ModItems.CHERRY_CHAIR_LUKAS_NATURAL);
                    entries.add(ModItems.CRIMSON_CHAIR_LUKAS_NATURAL);
                    entries.add(ModItems.DARK_OAK_CHAIR_LUKAS_NATURAL);
                    entries.add(ModItems.JUNGLE_CHAIR_LUKAS_NATURAL);
                    entries.add(ModItems.MANGROVE_CHAIR_LUKAS_NATURAL);
                    entries.add(ModItems.OAK_CHAIR_LUKAS_NATURAL);
                    entries.add(ModItems.SPRUCE_CHAIR_LUKAS_NATURAL);
                    entries.add(ModItems.WARPED_CHAIR_LUKAS_NATURAL);
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
                    entries.add(ModBlocks.ACACIA_BARREL_SEAT);
                    entries.add(ModBlocks.BAMBOO_BARREL_SEAT);
                    entries.add(ModBlocks.BIRCH_BARREL_SEAT);
                    entries.add(ModBlocks.CHERRY_BARREL_SEAT);
                    entries.add(ModBlocks.CRIMSON_BARREL_SEAT);
                    entries.add(ModBlocks.DARK_OAK_BARREL_SEAT);
                    entries.add(ModBlocks.JUNGLE_BARREL_SEAT);
                    entries.add(ModBlocks.MANGROVE_BARREL_SEAT);
                    entries.add(ModBlocks.OAK_BARREL_SEAT);
                    entries.add(ModBlocks.SPRUCE_BARREL_SEAT);
                    entries.add(ModBlocks.WARPED_BARREL_SEAT);
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
                    entries.add(ModItems.ACACIA_COFFEE_TABLE);
                    entries.add(ModItems.BAMBOO_COFFEE_TABLE);
                    entries.add(ModItems.BIRCH_COFFEE_TABLE);
                    entries.add(ModItems.CHERRY_COFFEE_TABLE);
                    entries.add(ModItems.CRIMSON_COFFEE_TABLE);
                    entries.add(ModItems.DARK_OAK_COFFEE_TABLE);
                    entries.add(ModItems.JUNGLE_COFFEE_TABLE);
                    entries.add(ModItems.MANGROVE_COFFEE_TABLE);
                    entries.add(ModItems.OAK_COFFEE_TABLE);
                    entries.add(ModItems.SPRUCE_COFFEE_TABLE);
                    entries.add(ModItems.WARPED_COFFEE_TABLE);
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
                    entries.add(ModItems.ACACIA_CHAIR_LUKAS_NATURAL);
                    entries.add(ModItems.BAMBOO_CHAIR_LUKAS_NATURAL);
                    entries.add(ModItems.BIRCH_CHAIR_LUKAS_NATURAL);
                    entries.add(ModItems.CHERRY_CHAIR_LUKAS_NATURAL);
                    entries.add(ModItems.CRIMSON_CHAIR_LUKAS_NATURAL);
                    entries.add(ModItems.DARK_OAK_CHAIR_LUKAS_NATURAL);
                    entries.add(ModItems.JUNGLE_CHAIR_LUKAS_NATURAL);
                    entries.add(ModItems.MANGROVE_CHAIR_LUKAS_NATURAL);
                    entries.add(ModItems.OAK_CHAIR_LUKAS_NATURAL);
                    entries.add(ModItems.SPRUCE_CHAIR_LUKAS_NATURAL);
                    entries.add(ModItems.WARPED_CHAIR_LUKAS_NATURAL);
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
                    entries.add(ModBlocks.ACACIA_BARREL_SEAT);
                    entries.add(ModBlocks.BAMBOO_BARREL_SEAT);
                    entries.add(ModBlocks.BIRCH_BARREL_SEAT);
                    entries.add(ModBlocks.CHERRY_BARREL_SEAT);
                    entries.add(ModBlocks.CRIMSON_BARREL_SEAT);
                    entries.add(ModBlocks.DARK_OAK_BARREL_SEAT);
                    entries.add(ModBlocks.JUNGLE_BARREL_SEAT);
                    entries.add(ModBlocks.MANGROVE_BARREL_SEAT);
                    entries.add(ModBlocks.OAK_BARREL_SEAT);
                    entries.add(ModBlocks.SPRUCE_BARREL_SEAT);
                    entries.add(ModBlocks.WARPED_BARREL_SEAT);
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
                    entries.add(ModItems.ACACIA_COFFEE_TABLE);
                    entries.add(ModItems.BAMBOO_COFFEE_TABLE);
                    entries.add(ModItems.BIRCH_COFFEE_TABLE);
                    entries.add(ModItems.CHERRY_COFFEE_TABLE);
                    entries.add(ModItems.CRIMSON_COFFEE_TABLE);
                    entries.add(ModItems.DARK_OAK_COFFEE_TABLE);
                    entries.add(ModItems.JUNGLE_COFFEE_TABLE);
                    entries.add(ModItems.MANGROVE_COFFEE_TABLE);
                    entries.add(ModItems.OAK_COFFEE_TABLE);
                    entries.add(ModItems.SPRUCE_COFFEE_TABLE);
                    entries.add(ModItems.WARPED_COFFEE_TABLE);
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
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.addAfter(Items.CRAFTING_TABLE, ModItems.CARPENTERS_WORKBENCH);
            entries.addBefore(Items.LADDER, ModItems.ACACIA_LADDER);
            entries.addBefore(Items.LADDER, ModItems.BAMBOO_LADDER);
            entries.addBefore(Items.LADDER, ModItems.BOUND_BAMBOO_LADDER);
            entries.addBefore(Items.LADDER, ModItems.BIRCH_LADDER);
            entries.addBefore(Items.LADDER, ModItems.CHERRY_LADDER);
            entries.addBefore(Items.LADDER, ModItems.CRIMSON_LADDER);
            entries.addBefore(Items.LADDER, ModItems.DARK_OAK_LADDER);
            entries.addBefore(Items.LADDER, ModItems.JUNGLE_LADDER);
            entries.addBefore(Items.LADDER, ModItems.MANGROVE_LADDER);
            entries.addAfter(Items.LADDER, ModItems.SPRUCE_LADDER);
            entries.addAfter(ModItems.SPRUCE_LADDER, ModItems.WARPED_LADDER);
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
            entries.add(ModItems.ACACIA_CHAIR_LUKAS_NATURAL);
            entries.add(ModItems.BAMBOO_CHAIR_LUKAS_NATURAL);
            entries.add(ModItems.BIRCH_CHAIR_LUKAS_NATURAL);
            entries.add(ModItems.CHERRY_CHAIR_LUKAS_NATURAL);
            entries.add(ModItems.CRIMSON_CHAIR_LUKAS_NATURAL);
            entries.add(ModItems.DARK_OAK_CHAIR_LUKAS_NATURAL);
            entries.add(ModItems.JUNGLE_CHAIR_LUKAS_NATURAL);
            entries.add(ModItems.MANGROVE_CHAIR_LUKAS_NATURAL);
            entries.add(ModItems.OAK_CHAIR_LUKAS_NATURAL);
            entries.add(ModItems.SPRUCE_CHAIR_LUKAS_NATURAL);
            entries.add(ModItems.WARPED_CHAIR_LUKAS_NATURAL);
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
            entries.add(ModBlocks.ACACIA_BARREL_SEAT);
            entries.add(ModBlocks.BAMBOO_BARREL_SEAT);
            entries.add(ModBlocks.BIRCH_BARREL_SEAT);
            entries.add(ModBlocks.CHERRY_BARREL_SEAT);
            entries.add(ModBlocks.CRIMSON_BARREL_SEAT);
            entries.add(ModBlocks.DARK_OAK_BARREL_SEAT);
            entries.add(ModBlocks.JUNGLE_BARREL_SEAT);
            entries.add(ModBlocks.MANGROVE_BARREL_SEAT);
            entries.add(ModBlocks.OAK_BARREL_SEAT);
            entries.add(ModBlocks.SPRUCE_BARREL_SEAT);
            entries.add(ModBlocks.WARPED_BARREL_SEAT);
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
            entries.add(ModItems.ACACIA_COFFEE_TABLE);
            entries.add(ModItems.BAMBOO_COFFEE_TABLE);
            entries.add(ModItems.BIRCH_COFFEE_TABLE);
            entries.add(ModItems.CHERRY_COFFEE_TABLE);
            entries.add(ModItems.CRIMSON_COFFEE_TABLE);
            entries.add(ModItems.DARK_OAK_COFFEE_TABLE);
            entries.add(ModItems.JUNGLE_COFFEE_TABLE);
            entries.add(ModItems.MANGROVE_COFFEE_TABLE);
            entries.add(ModItems.OAK_COFFEE_TABLE);
            entries.add(ModItems.SPRUCE_COFFEE_TABLE);
            entries.add(ModItems.WARPED_COFFEE_TABLE);
            entries.addBefore(Items.CAMPFIRE, ModItems.ACACIA_CAMPFIRE);
            entries.addBefore(Items.CAMPFIRE, ModItems.ACACIA_SOUL_CAMPFIRE);
            entries.addBefore(Items.CAMPFIRE, ModItems.BIRCH_CAMPFIRE);
            entries.addBefore(Items.CAMPFIRE, ModItems.BIRCH_SOUL_CAMPFIRE);
            entries.addBefore(Items.CAMPFIRE, ModItems.CHERRY_CAMPFIRE);
            entries.addBefore(Items.CAMPFIRE, ModItems.CHERRY_SOUL_CAMPFIRE);
            entries.addBefore(Items.CAMPFIRE, ModItems.CRIMSON_CAMPFIRE);
            entries.addBefore(Items.CAMPFIRE, ModItems.CRIMSON_SOUL_CAMPFIRE);
            entries.addBefore(Items.CAMPFIRE, ModItems.DARK_OAK_CAMPFIRE);
            entries.addBefore(Items.CAMPFIRE, ModItems.DARK_OAK_SOUL_CAMPFIRE);
            entries.addBefore(Items.CAMPFIRE, ModItems.JUNGLE_CAMPFIRE);
            entries.addBefore(Items.CAMPFIRE, ModItems.JUNGLE_SOUL_CAMPFIRE);
            entries.addBefore(Items.CAMPFIRE, ModItems.MANGROVE_CAMPFIRE);
            entries.addBefore(Items.CAMPFIRE, ModItems.MANGROVE_SOUL_CAMPFIRE);
            entries.addAfter(Items.SOUL_CAMPFIRE, ModItems.SPRUCE_CAMPFIRE);
            entries.addAfter(ModItems.SPRUCE_CAMPFIRE, ModItems.SPRUCE_SOUL_CAMPFIRE);
            entries.addAfter(ModItems.SPRUCE_SOUL_CAMPFIRE, ModItems.WARPED_CAMPFIRE);
            entries.addAfter(ModItems.WARPED_CAMPFIRE, ModItems.WARPED_SOUL_CAMPFIRE);
        });
    }

    private static void modifyToolItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.addAfter(Items.WOODEN_HOE, ModItems.WOODEN_SAW);
            entries.addAfter(Items.STONE_HOE,ModItems.STONE_SAW);
            entries.addAfter(Items.IRON_HOE,ModItems.IRON_SAW);
            entries.addAfter(Items.GOLDEN_HOE,ModItems.GOLDEN_SAW);
            entries.addAfter(Items.DIAMOND_HOE,ModItems.DIAMOND_SAW);
            entries.addAfter(Items.NETHERITE_HOE,ModItems.NETHERITE_SAW);
        });
    }

    private static RegistryKey<ItemGroup> getItemGroup(String path) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, path));
    }
}
