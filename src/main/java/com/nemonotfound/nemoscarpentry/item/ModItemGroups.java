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
        registerItemGroup(ModItems.IRON_SAW);
        registerSeatsItemGroup(ModItems.OAK_CHAIR_FELIX);
        modifyFunctionalItemGroup();
        modifyToolItemGroup();
    }

    private static void registerItemGroup(Item iconItem) {
        ItemGroup ITEM_GROUP = FabricItemGroup.builder()
                .icon(() -> new ItemStack(iconItem))
                .displayName(Text.translatable("Nemo's Carpentry"))
                .entries((context, entries) -> {
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
                    entries.add(ModItems.OAK_CHAIR_FELIX);
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
                })
                .build();

        Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, NEMOS_CARPENTRY_GROUP_ID), ITEM_GROUP);
    }

    private static void registerSeatsItemGroup(Item iconItem) {
        ItemGroup ITEM_GROUP = FabricItemGroup.builder()
                .icon(() -> new ItemStack(iconItem))
                .displayName(Text.translatable("Seats"))
                .entries((context, entries) -> {
                    entries.add(ModItems.OAK_CHAIR_FELIX);
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
                })
                .build();

        Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, NEMOS_CARPENTRY_GROUP_ID + "_seats"), ITEM_GROUP);
    }

    private static void modifyFunctionalItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
            content.addBefore(Items.LADDER, ModItems.ACACIA_LADDER);
            content.addBefore(Items.LADDER, ModItems.BAMBOO_LADDER);
            content.addBefore(Items.LADDER, ModItems.BOUND_BAMBOO_LADDER);
            content.addBefore(Items.LADDER, ModItems.BIRCH_LADDER);
            content.addBefore(Items.LADDER, ModItems.CHERRY_LADDER);
            content.addBefore(Items.LADDER, ModItems.CRIMSON_LADDER);
            content.addBefore(Items.LADDER, ModItems.DARK_OAK_LADDER);
            content.addBefore(Items.LADDER, ModItems.JUNGLE_LADDER);
            content.addBefore(Items.LADDER, ModItems.MANGROVE_LADDER);
            content.addBefore(Items.LADDER, ModItems.SPRUCE_LADDER);
            content.addBefore(Items.LADDER, ModItems.WARPED_LADDER);
            content.add(ModItems.OAK_CHAIR_FELIX);
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
