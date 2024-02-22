package com.nemonotfound.nemoscarpenting.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import java.util.Arrays;

import static com.nemonotfound.NemosCarpenting.MOD_ID;

public class ModItems {

    public static final Item WOODEN_SAW = registerItem("wooden_saw", new SawItem(ToolMaterials.WOOD,
            new FabricItemSettings()), ItemGroups.TOOLS, ModItemGroups.NEMOS_FURNITURE);
    public static final Item STONE_SAW = registerItem("stone_saw", new SawItem(ToolMaterials.STONE,
            new FabricItemSettings()), ItemGroups.TOOLS, ModItemGroups.NEMOS_FURNITURE);
    public static final Item IRON_SAW = registerItem("iron_saw", new SawItem(ToolMaterials.IRON,
            new FabricItemSettings()), ItemGroups.TOOLS, ModItemGroups.NEMOS_FURNITURE);
    public static final Item GOLDEN_SAW = registerItem("golden_saw", new SawItem(ToolMaterials.GOLD,
            new FabricItemSettings()), ItemGroups.TOOLS, ModItemGroups.NEMOS_FURNITURE);
    public static final Item DIAMOND_SAW = registerItem("diamond_saw", new SawItem(ToolMaterials.DIAMOND,
            new FabricItemSettings()), ItemGroups.TOOLS, ModItemGroups.NEMOS_FURNITURE);
    public static final Item NETHERITE_SAW = registerItem("netherite_saw", new SawItem(ToolMaterials.NETHERITE,
            new FabricItemSettings()), ItemGroups.TOOLS, ModItemGroups.NEMOS_FURNITURE);
    public static final Item ACACIA_CHAIR_SEAT = registerItem("acacia_chair_seat", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item BAMBOO_CHAIR_SEAT = registerItem("bamboo_chair_seat", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item BIRCH_CHAIR_SEAT = registerItem("birch_chair_seat", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item CHERRY_CHAIR_SEAT = registerItem("cherry_chair_seat", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item CRIMSON_CHAIR_SEAT = registerItem("crimson_chair_seat", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item DARK_OAK_CHAIR_SEAT = registerItem("dark_oak_chair_seat", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item JUNGLE_CHAIR_SEAT = registerItem("jungle_chair_seat", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item MANGROVE_CHAIR_SEAT = registerItem("mangrove_chair_seat", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item OAK_CHAIR_SEAT = registerItem("oak_chair_seat", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item SPRUCE_CHAIR_SEAT = registerItem("spruce_chair_seat", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item WARPED_CHAIR_SEAT = registerItem("warped_chair_seat", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item ACACIA_CHAIR_LEG = registerItem("acacia_chair_leg", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item BAMBOO_CHAIR_LEG = registerItem("bamboo_chair_leg", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item BIRCH_CHAIR_LEG = registerItem("birch_chair_leg", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item CHERRY_CHAIR_LEG = registerItem("cherry_chair_leg", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item CRIMSON_CHAIR_LEG = registerItem("crimson_chair_leg", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item DARK_OAK_CHAIR_LEG = registerItem("dark_oak_chair_leg", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item JUNGLE_CHAIR_LEG = registerItem("jungle_chair_leg", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item MANGROVE_CHAIR_LEG = registerItem("mangrove_chair_leg", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item OAK_CHAIR_LEG = registerItem("oak_chair_leg", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item SPRUCE_CHAIR_LEG = registerItem("spruce_chair_leg", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item WARPED_CHAIR_LEG = registerItem("warped_chair_leg", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item ACACIA_TABLETOP_THE_CLASSIC = registerItem("acacia_tabletop_the_classic",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item BAMBOO_TABLETOP_THE_CLASSIC = registerItem("bamboo_tabletop_the_classic",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item BIRCH_TABLETOP_THE_CLASSIC = registerItem("birch_tabletop_the_classic",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item CHERRY_TABLETOP_THE_CLASSIC = registerItem("cherry_tabletop_the_classic",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item CRIMSON_TABLETOP_THE_CLASSIC = registerItem("crimson_tabletop_the_classic",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item DARK_OAK_TABLETOP_THE_CLASSIC = registerItem("dark_oak_tabletop_the_classic",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item JUNGLE_TABLETOP_THE_CLASSIC = registerItem("jungle_tabletop_the_classic",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item MANGROVE_TABLETOP_THE_CLASSIC = registerItem("mangrove_tabletop_the_classic",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item OAK_TABLETOP_THE_CLASSIC = registerItem("oak_tabletop_the_classic",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item SPRUCE_TABLETOP_THE_CLASSIC = registerItem("spruce_tabletop_the_classic",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item WARPED_TABLETOP_THE_CLASSIC = registerItem("warped_tabletop_the_classic",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);

    public static final Item ACACIA_TABLE_LEG_THE_CLASSIC = registerItem("acacia_table_leg_the_classic",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item BAMBOO_TABLE_LEG_THE_CLASSIC = registerItem("bamboo_table_leg_the_classic",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item BIRCH_TABLE_LEG_THE_CLASSIC = registerItem("birch_table_leg_the_classic",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item CHERRY_TABLE_LEG_THE_CLASSIC = registerItem("cherry_table_leg_the_classic",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item CRIMSON_TABLE_LEG_THE_CLASSIC = registerItem("crimson_table_leg_the_classic",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item DARK_OAK_TABLE_LEG_THE_CLASSIC = registerItem("dark_oak_table_leg_the_classic",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item JUNGLE_TABLE_LEG_THE_CLASSIC = registerItem("jungle_table_leg_the_classic",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item MANGROVE_TABLE_LEG_THE_CLASSIC = registerItem("mangrove_table_leg_the_classic",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item OAK_TABLE_LEG_THE_CLASSIC = registerItem("oak_table_leg_the_classic",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item SPRUCE_TABLE_LEG_THE_CLASSIC = registerItem("spruce_table_leg_the_classic",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item WARPED_TABLE_LEG_THE_CLASSIC = registerItem("warped_table_leg_the_classic",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item ACACIA_DOOR_GLASS_FRONT_FRAME = registerItem("acacia_door_glass_front_frame",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item BAMBOO_DOOR_GLASS_FRONT_FRAME = registerItem("bamboo_door_glass_front_frame",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item BIRCH_DOOR_GLASS_FRONT_FRAME = registerItem("birch_door_glass_front_frame",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item CHERRY_DOOR_GLASS_FRONT_FRAME = registerItem("cherry_door_glass_front_frame",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item CRIMSON_DOOR_GLASS_FRONT_FRAME = registerItem("crimson_door_glass_front_frame",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item DARK_OAK_DOOR_GLASS_FRONT_FRAME = registerItem("dark_oak_door_glass_front_frame",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item JUNGLE_DOOR_GLASS_FRONT_FRAME = registerItem("jungle_door_glass_front_frame",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item MANGROVE_DOOR_GLASS_FRONT_FRAME = registerItem("mangrove_door_glass_front_frame",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item OAK_DOOR_GLASS_FRONT_FRAME = registerItem("oak_door_glass_front_frame",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item SPRUCE_DOOR_GLASS_FRONT_FRAME = registerItem("spruce_door_glass_front_frame",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);
    public static final Item WARPED_DOOR_GLASS_FRONT_FRAME = registerItem("warped_door_glass_front_frame",
            new Item(new FabricItemSettings()), ModItemGroups.NEMOS_FURNITURE);

    private static Item registerItem(String path, Item item, RegistryKey<ItemGroup>... itemGroups) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(MOD_ID, path), item);
        Arrays.stream(itemGroups).forEach(itemGroup -> ItemGroupEvents.modifyEntriesEvent(itemGroup)
                .register(content -> content.add(item)));

        return registeredItem;
    }

}
