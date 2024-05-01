package com.nemonotfound.nemoscarpentry.item;

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

import static com.nemonotfound.nemoscarpentry.NemosCarpentry.MOD_ID;

public class ModItems {

    public static final Item WOODEN_SAW = registerItem("wooden_saw", new SawItem(ToolMaterials.WOOD,
            new Item.Settings()), ItemGroups.TOOLS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Item STONE_SAW = registerItem("stone_saw", new SawItem(ToolMaterials.STONE,
            new Item.Settings()), ItemGroups.TOOLS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Item IRON_SAW = registerItem("iron_saw", new SawItem(ToolMaterials.IRON,
            new Item.Settings()), ItemGroups.TOOLS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Item GOLDEN_SAW = registerItem("golden_saw", new SawItem(ToolMaterials.GOLD,
            new Item.Settings()), ItemGroups.TOOLS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Item DIAMOND_SAW = registerItem("diamond_saw", new SawItem(ToolMaterials.DIAMOND,
            new Item.Settings()), ItemGroups.TOOLS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Item NETHERITE_SAW = registerItem("netherite_saw", new SawItem(ToolMaterials.NETHERITE,
            new Item.Settings()), ItemGroups.TOOLS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Item ACACIA_GLASS_DOOR_FRAME = registerItem("acacia_glass_door_frame",
            new Item(new Item.Settings()), ModItemGroups.NEMOS_CARPENTRY);
    public static final Item BAMBOO_GLASS_DOOR_FRAME = registerItem("bamboo_glass_door_frame",
            new Item(new Item.Settings()), ModItemGroups.NEMOS_CARPENTRY);
    public static final Item BIRCH_GLASS_DOOR_FRAME = registerItem("birch_glass_door_frame",
            new Item(new Item.Settings()), ModItemGroups.NEMOS_CARPENTRY);
    public static final Item CHERRY_GLASS_DOOR_FRAME = registerItem("cherry_glass_door_frame",
            new Item(new Item.Settings()), ModItemGroups.NEMOS_CARPENTRY);
    public static final Item CRIMSON_GLASS_DOOR_FRAME = registerItem("crimson_glass_door_frame",
            new Item(new Item.Settings()), ModItemGroups.NEMOS_CARPENTRY);
    public static final Item DARK_OAK_GLASS_DOOR_FRAME = registerItem("dark_oak_glass_door_frame",
            new Item(new Item.Settings()), ModItemGroups.NEMOS_CARPENTRY);
    public static final Item JUNGLE_GLASS_DOOR_FRAME = registerItem("jungle_glass_door_frame",
            new Item(new Item.Settings()), ModItemGroups.NEMOS_CARPENTRY);
    public static final Item MANGROVE_GLASS_DOOR_FRAME = registerItem("mangrove_glass_door_frame",
            new Item(new Item.Settings()), ModItemGroups.NEMOS_CARPENTRY);
    public static final Item OAK_GLASS_DOOR_FRAME = registerItem("oak_glass_door_frame",
            new Item(new Item.Settings()), ModItemGroups.NEMOS_CARPENTRY);
    public static final Item SPRUCE_GLASS_DOOR_FRAME = registerItem("spruce_glass_door_frame",
            new Item(new Item.Settings()), ModItemGroups.NEMOS_CARPENTRY);
    public static final Item WARPED_GLASS_DOOR_FRAME = registerItem("warped_glass_door_frame",
            new Item(new Item.Settings()), ModItemGroups.NEMOS_CARPENTRY);

    private static Item registerItem(String path, Item item, RegistryKey<ItemGroup>... itemGroups) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(MOD_ID, path), item);
        Arrays.stream(itemGroups).forEach(itemGroup -> ItemGroupEvents.modifyEntriesEvent(itemGroup)
                .register(content -> content.add(item)));

        return registeredItem;
    }

}
