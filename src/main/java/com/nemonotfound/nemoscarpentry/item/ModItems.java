package com.nemonotfound.nemoscarpentry.item;

import com.nemonotfound.nemoscarpentry.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import java.util.Arrays;

import static com.nemonotfound.nemoscarpentry.NemosCarpentry.MOD_ID;

public class ModItems {

    public static final Item WOODEN_SAW = registerItem("wooden_saw", new SawItem(ToolMaterials.WOOD,
            new Item.Settings()));
    public static final Item STONE_SAW = registerItem("stone_saw", new SawItem(ToolMaterials.STONE,
            new Item.Settings()));
    public static final Item IRON_SAW = registerItem("iron_saw", new SawItem(ToolMaterials.IRON,
            new Item.Settings()));
    public static final Item GOLDEN_SAW = registerItem("golden_saw", new SawItem(ToolMaterials.GOLD,
            new Item.Settings()));
    public static final Item DIAMOND_SAW = registerItem("diamond_saw", new SawItem(ToolMaterials.DIAMOND,
            new Item.Settings()));
    public static final Item NETHERITE_SAW = registerItem("netherite_saw", new SawItem(ToolMaterials.NETHERITE,
            new Item.Settings()));
    public static final Item ACACIA_LADDER = registerBlockItem("acacia_ladder", ModBlocks.ACACIA_LADDER);
    public static final Item BAMBOO_LADDER = registerBlockItem("bamboo_ladder", ModBlocks.BAMBOO_LADDER);
    public static final Item BOUND_BAMBOO_LADDER = registerBlockItem("bound_bamboo_ladder", ModBlocks.BOUND_BAMBOO_LADDER);
    public static final Item BIRCH_LADDER = registerBlockItem("birch_ladder", ModBlocks.BIRCH_LADDER);
    public static final Item CHERRY_LADDER = registerBlockItem("cherry_ladder", ModBlocks.CHERRY_LADDER);
    public static final Item CRIMSON_LADDER = registerBlockItem("crimson_ladder", ModBlocks.CRIMSON_LADDER);
    public static final Item DARK_OAK_LADDER = registerBlockItem("dark_oak_ladder", ModBlocks.DARK_OAK_LADDER);
    public static final Item JUNGLE_LADDER = registerBlockItem("jungle_ladder", ModBlocks.JUNGLE_LADDER);
    public static final Item MANGROVE_LADDER = registerBlockItem("mangrove_ladder", ModBlocks.MANGROVE_LADDER);
    public static final Item SPRUCE_LADDER = registerBlockItem("spruce_ladder", ModBlocks.SPRUCE_LADDER);
    public static final Item WARPED_LADDER = registerBlockItem("warped_ladder", ModBlocks.WARPED_LADDER);
    public static final Item ACACIA_TABLE_THE_CLASSIC = registerBlockItem("acacia_table_the_classic", ModBlocks.ACACIA_TABLE_THE_CLASSIC);
    public static final Item BAMBOO_TABLE_THE_CLASSIC = registerBlockItem("bamboo_table_the_classic", ModBlocks.BAMBOO_TABLE_THE_CLASSIC);
    public static final Item BIRCH_TABLE_THE_CLASSIC = registerBlockItem("birch_table_the_classic", ModBlocks.BIRCH_TABLE_THE_CLASSIC);
    public static final Item CHERRY_TABLE_THE_CLASSIC = registerBlockItem("cherry_table_the_classic", ModBlocks.CHERRY_TABLE_THE_CLASSIC);
    public static final Item CRIMSON_TABLE_THE_CLASSIC = registerBlockItem("crimson_table_the_classic", ModBlocks.CRIMSON_TABLE_THE_CLASSIC);
    public static final Item DARK_OAK_TABLE_THE_CLASSIC = registerBlockItem("dark_oak_table_the_classic", ModBlocks.DARK_OAK_TABLE_THE_CLASSIC);
    public static final Item JUNGLE_TABLE_THE_CLASSIC = registerBlockItem("jungle_table_the_classic", ModBlocks.JUNGLE_TABLE_THE_CLASSIC);
    public static final Item MANGROVE_TABLE_THE_CLASSIC = registerBlockItem("mangrove_table_the_classic", ModBlocks.MANGROVE_TABLE_THE_CLASSIC);
    public static final Item OAK_TABLE_THE_CLASSIC = registerBlockItem("oak_table_the_classic", ModBlocks.OAK_TABLE_THE_CLASSIC);
    public static final Item SPRUCE_TABLE_THE_CLASSIC = registerBlockItem("spruce_table_the_classic", ModBlocks.SPRUCE_TABLE_THE_CLASSIC);
    public static final Item WARPED_TABLE_THE_CLASSIC = registerBlockItem("warped_table_the_classic", ModBlocks.WARPED_TABLE_THE_CLASSIC);
    public static final Item OAK_CHAIR_FELIX = registerBlockItem("oak_chair_felix", ModBlocks.OAK_CHAIR_FELIX);
    public static final Item ACACIA_CHAIR_LUKAS = registerBlockItem("acacia_chair_lukas", ModBlocks.ACACIA_CHAIR_LUKAS);
    public static final Item BAMBOO_CHAIR_LUKAS = registerBlockItem("bamboo_chair_lukas", ModBlocks.BAMBOO_CHAIR_LUKAS);
    public static final Item BIRCH_CHAIR_LUKAS = registerBlockItem("birch_chair_lukas", ModBlocks.BIRCH_CHAIR_LUKAS);
    public static final Item CHERRY_CHAIR_LUKAS = registerBlockItem("cherry_chair_lukas", ModBlocks.CHERRY_CHAIR_LUKAS);
    public static final Item CRIMSON_CHAIR_LUKAS = registerBlockItem("crimson_chair_lukas", ModBlocks.CRIMSON_CHAIR_LUKAS);
    public static final Item DARK_OAK_CHAIR_LUKAS = registerBlockItem("dark_oak_chair_lukas", ModBlocks.DARK_OAK_CHAIR_LUKAS);
    public static final Item JUNGLE_CHAIR_LUKAS = registerBlockItem("jungle_chair_lukas", ModBlocks.JUNGLE_CHAIR_LUKAS);
    public static final Item MANGROVE_CHAIR_LUKAS = registerBlockItem("mangrove_chair_lukas", ModBlocks.MANGROVE_CHAIR_LUKAS);
    public static final Item OAK_CHAIR_LUKAS = registerBlockItem("oak_chair_lukas", ModBlocks.OAK_CHAIR_LUKAS);
    public static final Item SPRUCE_CHAIR_LUKAS = registerBlockItem("spruce_chair_lukas", ModBlocks.SPRUCE_CHAIR_LUKAS);
    public static final Item WARPED_CHAIR_LUKAS = registerBlockItem("warped_chair_lukas", ModBlocks.WARPED_CHAIR_LUKAS);
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

    @SafeVarargs
    private static Item registerItem(String path, Item item, RegistryKey<ItemGroup>... itemGroups) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(MOD_ID, path), item);
        Arrays.stream(itemGroups).forEach(itemGroup -> ItemGroupEvents.modifyEntriesEvent(itemGroup)
                .register(content -> content.add(item)));

        return registeredItem;
    }

    private static Item registerBlockItem(String path, Block block) {
        BlockItem blockItem = new BlockItem(block, new Item.Settings());

        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, path), blockItem);
    }

}
