package com.nemonotfound.nemoscarpentry.item;

import com.nemonotfound.nemoscarpentry.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import java.util.Arrays;

import static com.nemonotfound.nemoscarpentry.NemosCarpentry.MOD_ID;

public class ModItems {

    public static final Item CARPENTERS_WORKBENCH = registerBlockItem("carpenters_workbench", ModBlocks.CARPENTERS_WORKBENCH);
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
    public static final Item ACACIA_COFFEE_TABLE_PASCAL = registerBlockItem("acacia_coffee_table_pascal", ModBlocks.ACACIA_COFFEE_TABLE_PASCAL);
    public static final Item BAMBOO_COFFEE_TABLE_PASCAL = registerBlockItem("bamboo_coffee_table_pascal", ModBlocks.BAMBOO_COFFEE_TABLE_PASCAL);
    public static final Item BIRCH_COFFEE_TABLE_PASCAL = registerBlockItem("birch_coffee_table_pascal", ModBlocks.BIRCH_COFFEE_TABLE_PASCAL);
    public static final Item CHERRY_COFFEE_TABLE_PASCAL = registerBlockItem("cherry_coffee_table_pascal", ModBlocks.CHERRY_COFFEE_TABLE_PASCAL);
    public static final Item CRIMSON_COFFEE_TABLE_PASCAL = registerBlockItem("crimson_coffee_table_pascal", ModBlocks.CRIMSON_COFFEE_TABLE_PASCAL);
    public static final Item DARK_OAK_COFFEE_TABLE_PASCAL = registerBlockItem("dark_oak_coffee_table_pascal", ModBlocks.DARK_OAK_COFFEE_TABLE_PASCAL);
    public static final Item JUNGLE_COFFEE_TABLE_PASCAL = registerBlockItem("jungle_coffee_table_pascal", ModBlocks.JUNGLE_COFFEE_TABLE_PASCAL);
    public static final Item MANGROVE_COFFEE_TABLE_PASCAL = registerBlockItem("mangrove_coffee_table_pascal", ModBlocks.MANGROVE_COFFEE_TABLE_PASCAL);
    public static final Item OAK_COFFEE_TABLE_PASCAL = registerBlockItem("oak_coffee_table_pascal", ModBlocks.OAK_COFFEE_TABLE_PASCAL);
    public static final Item SPRUCE_COFFEE_TABLE_PASCAL = registerBlockItem("spruce_coffee_table_pascal", ModBlocks.SPRUCE_COFFEE_TABLE_PASCAL);
    public static final Item WARPED_COFFEE_TABLE_PASCAL = registerBlockItem("warped_coffee_table_pascal", ModBlocks.WARPED_COFFEE_TABLE_PASCAL);
    public static final Item ACACIA_STANDING_TABLE = registerBlockItem("acacia_standing_table", ModBlocks.ACACIA_STANDING_TABLE);
    public static final Item BAMBOO_STANDING_TABLE = registerBlockItem("bamboo_standing_table", ModBlocks.BAMBOO_STANDING_TABLE);
    public static final Item BIRCH_STANDING_TABLE = registerBlockItem("birch_standing_table", ModBlocks.BIRCH_STANDING_TABLE);
    public static final Item CHERRY_STANDING_TABLE = registerBlockItem("cherry_standing_table", ModBlocks.CHERRY_STANDING_TABLE);
    public static final Item CRIMSON_STANDING_TABLE = registerBlockItem("crimson_standing_table", ModBlocks.CRIMSON_STANDING_TABLE);
    public static final Item DARK_OAK_STANDING_TABLE = registerBlockItem("dark_oak_standing_table", ModBlocks.DARK_OAK_STANDING_TABLE);
    public static final Item JUNGLE_STANDING_TABLE = registerBlockItem("jungle_standing_table", ModBlocks.JUNGLE_STANDING_TABLE);
    public static final Item MANGROVE_STANDING_TABLE = registerBlockItem("mangrove_standing_table", ModBlocks.MANGROVE_STANDING_TABLE);
    public static final Item OAK_STANDING_TABLE = registerBlockItem("oak_standing_table", ModBlocks.OAK_STANDING_TABLE);
    public static final Item SPRUCE_STANDING_TABLE = registerBlockItem("spruce_standing_table", ModBlocks.SPRUCE_STANDING_TABLE);
    public static final Item WARPED_STANDING_TABLE = registerBlockItem("warped_standing_table", ModBlocks.WARPED_STANDING_TABLE);
    public static final Item ACACIA_CHAIR = registerBlockItem("acacia_chair", ModBlocks.ACACIA_CHAIR);
    public static final Item BAMBOO_CHAIR = registerBlockItem("bamboo_chair", ModBlocks.BAMBOO_CHAIR);
    public static final Item BIRCH_CHAIR = registerBlockItem("birch_chair", ModBlocks.BIRCH_CHAIR);
    public static final Item CHERRY_CHAIR = registerBlockItem("cherry_chair", ModBlocks.CHERRY_CHAIR);
    public static final Item CRIMSON_CHAIR = registerBlockItem("crimson_chair", ModBlocks.CRIMSON_CHAIR);
    public static final Item DARK_OAK_CHAIR = registerBlockItem("dark_oak_chair", ModBlocks.DARK_OAK_CHAIR);
    public static final Item JUNGLE_CHAIR = registerBlockItem("jungle_chair", ModBlocks.JUNGLE_CHAIR);
    public static final Item MANGROVE_CHAIR = registerBlockItem("mangrove_chair", ModBlocks.MANGROVE_CHAIR);
    public static final Item OAK_CHAIR = registerBlockItem("oak_chair", ModBlocks.OAK_CHAIR);
    public static final Item SPRUCE_CHAIR = registerBlockItem("spruce_chair", ModBlocks.SPRUCE_CHAIR);
    public static final Item WARPED_CHAIR = registerBlockItem("warped_chair", ModBlocks.WARPED_CHAIR);
    public static final Item ACACIA_CHAIR_FELIX = registerBlockItem("acacia_chair_felix", ModBlocks.ACACIA_CHAIR_FELIX);
    public static final Item BAMBOO_CHAIR_FELIX = registerBlockItem("bamboo_chair_felix", ModBlocks.BAMBOO_CHAIR_FELIX);
    public static final Item BIRCH_CHAIR_FELIX = registerBlockItem("birch_chair_felix", ModBlocks.BIRCH_CHAIR_FELIX);
    public static final Item CHERRY_CHAIR_FELIX = registerBlockItem("cherry_chair_felix", ModBlocks.CHERRY_CHAIR_FELIX);
    public static final Item CRIMSON_CHAIR_FELIX = registerBlockItem("crimson_chair_felix", ModBlocks.CRIMSON_CHAIR_FELIX);
    public static final Item DARK_OAK_CHAIR_FELIX = registerBlockItem("dark_oak_chair_felix", ModBlocks.DARK_OAK_CHAIR_FELIX);
    public static final Item JUNGLE_CHAIR_FELIX = registerBlockItem("jungle_chair_felix", ModBlocks.JUNGLE_CHAIR_FELIX);
    public static final Item MANGROVE_CHAIR_FELIX = registerBlockItem("mangrove_chair_felix", ModBlocks.MANGROVE_CHAIR_FELIX);
    public static final Item OAK_CHAIR_FELIX = registerBlockItem("oak_chair_felix", ModBlocks.OAK_CHAIR_FELIX);
    public static final Item SPRUCE_CHAIR_FELIX = registerBlockItem("spruce_chair_felix", ModBlocks.SPRUCE_CHAIR_FELIX);
    public static final Item WARPED_CHAIR_FELIX = registerBlockItem("warped_chair_felix", ModBlocks.WARPED_CHAIR_FELIX);
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
    public static final Item ACACIA_CHAIR_LUKAS_NATURAL = registerBlockItem("acacia_chair_lukas_natural", ModBlocks.ACACIA_CHAIR_LUKAS_NATURAL);
    public static final Item BAMBOO_CHAIR_LUKAS_NATURAL = registerBlockItem("bamboo_chair_lukas_natural", ModBlocks.BAMBOO_CHAIR_LUKAS_NATURAL);
    public static final Item BIRCH_CHAIR_LUKAS_NATURAL = registerBlockItem("birch_chair_lukas_natural", ModBlocks.BIRCH_CHAIR_LUKAS_NATURAL);
    public static final Item CHERRY_CHAIR_LUKAS_NATURAL = registerBlockItem("cherry_chair_lukas_natural", ModBlocks.CHERRY_CHAIR_LUKAS_NATURAL);
    public static final Item CRIMSON_CHAIR_LUKAS_NATURAL = registerBlockItem("crimson_chair_lukas_natural", ModBlocks.CRIMSON_CHAIR_LUKAS_NATURAL);
    public static final Item DARK_OAK_CHAIR_LUKAS_NATURAL = registerBlockItem("dark_oak_chair_lukas_natural", ModBlocks.DARK_OAK_CHAIR_LUKAS_NATURAL);
    public static final Item JUNGLE_CHAIR_LUKAS_NATURAL = registerBlockItem("jungle_chair_lukas_natural", ModBlocks.JUNGLE_CHAIR_LUKAS_NATURAL);
    public static final Item MANGROVE_CHAIR_LUKAS_NATURAL = registerBlockItem("mangrove_chair_lukas_natural", ModBlocks.MANGROVE_CHAIR_LUKAS_NATURAL);
    public static final Item OAK_CHAIR_LUKAS_NATURAL = registerBlockItem("oak_chair_lukas_natural", ModBlocks.OAK_CHAIR_LUKAS_NATURAL);
    public static final Item SPRUCE_CHAIR_LUKAS_NATURAL = registerBlockItem("spruce_chair_lukas_natural", ModBlocks.SPRUCE_CHAIR_LUKAS_NATURAL);
    public static final Item WARPED_CHAIR_LUKAS_NATURAL = registerBlockItem("warped_chair_lukas_natural", ModBlocks.WARPED_CHAIR_LUKAS_NATURAL);
    public static final Item ACACIA_CHAIR_TOMMY = registerBlockItem("acacia_chair_tommy", ModBlocks.ACACIA_CHAIR_TOMMY);
    public static final Item BAMBOO_CHAIR_TOMMY = registerBlockItem("bamboo_chair_tommy", ModBlocks.BAMBOO_CHAIR_TOMMY);
    public static final Item BIRCH_CHAIR_TOMMY = registerBlockItem("birch_chair_tommy", ModBlocks.BIRCH_CHAIR_TOMMY);
    public static final Item CHERRY_CHAIR_TOMMY = registerBlockItem("cherry_chair_tommy", ModBlocks.CHERRY_CHAIR_TOMMY);
    public static final Item CRIMSON_CHAIR_TOMMY = registerBlockItem("crimson_chair_tommy", ModBlocks.CRIMSON_CHAIR_TOMMY);
    public static final Item DARK_OAK_CHAIR_TOMMY = registerBlockItem("dark_oak_chair_tommy", ModBlocks.DARK_OAK_CHAIR_TOMMY);
    public static final Item JUNGLE_CHAIR_TOMMY = registerBlockItem("jungle_chair_tommy", ModBlocks.JUNGLE_CHAIR_TOMMY);
    public static final Item MANGROVE_CHAIR_TOMMY = registerBlockItem("mangrove_chair_tommy", ModBlocks.MANGROVE_CHAIR_TOMMY);
    public static final Item OAK_CHAIR_TOMMY = registerBlockItem("oak_chair_tommy", ModBlocks.OAK_CHAIR_TOMMY);
    public static final Item SPRUCE_CHAIR_TOMMY = registerBlockItem("spruce_chair_tommy", ModBlocks.SPRUCE_CHAIR_TOMMY);
    public static final Item WARPED_CHAIR_TOMMY = registerBlockItem("warped_chair_tommy", ModBlocks.WARPED_CHAIR_TOMMY);
    public static final Item ACACIA_CHAIR_TOMMY_NATURAL = registerBlockItem("acacia_chair_tommy_natural", ModBlocks.ACACIA_CHAIR_TOMMY_NATURAL);
    public static final Item BAMBOO_CHAIR_TOMMY_NATURAL = registerBlockItem("bamboo_chair_tommy_natural", ModBlocks.BAMBOO_CHAIR_TOMMY_NATURAL);
    public static final Item BIRCH_CHAIR_TOMMY_NATURAL = registerBlockItem("birch_chair_tommy_natural", ModBlocks.BIRCH_CHAIR_TOMMY_NATURAL);
    public static final Item CHERRY_CHAIR_TOMMY_NATURAL = registerBlockItem("cherry_chair_tommy_natural", ModBlocks.CHERRY_CHAIR_TOMMY_NATURAL);
    public static final Item CRIMSON_CHAIR_TOMMY_NATURAL = registerBlockItem("crimson_chair_tommy_natural", ModBlocks.CRIMSON_CHAIR_TOMMY_NATURAL);
    public static final Item DARK_OAK_CHAIR_TOMMY_NATURAL = registerBlockItem("dark_oak_chair_tommy_natural", ModBlocks.DARK_OAK_CHAIR_TOMMY_NATURAL);
    public static final Item JUNGLE_CHAIR_TOMMY_NATURAL = registerBlockItem("jungle_chair_tommy_natural", ModBlocks.JUNGLE_CHAIR_TOMMY_NATURAL);
    public static final Item MANGROVE_CHAIR_TOMMY_NATURAL = registerBlockItem("mangrove_chair_tommy_natural", ModBlocks.MANGROVE_CHAIR_TOMMY_NATURAL);
    public static final Item OAK_CHAIR_TOMMY_NATURAL = registerBlockItem("oak_chair_tommy_natural", ModBlocks.OAK_CHAIR_TOMMY_NATURAL);
    public static final Item SPRUCE_CHAIR_TOMMY_NATURAL = registerBlockItem("spruce_chair_tommy_natural", ModBlocks.SPRUCE_CHAIR_TOMMY_NATURAL);
    public static final Item WARPED_CHAIR_TOMMY_NATURAL = registerBlockItem("warped_chair_tommy_natural", ModBlocks.WARPED_CHAIR_TOMMY_NATURAL);
    public static final Item ACACIA_CHAIR_GREGORY = registerBlockItem("acacia_chair_gregory", ModBlocks.ACACIA_CHAIR_GREGORY);
    public static final Item BAMBOO_CHAIR_GREGORY = registerBlockItem("bamboo_chair_gregory", ModBlocks.BAMBOO_CHAIR_GREGORY);
    public static final Item BIRCH_CHAIR_GREGORY = registerBlockItem("birch_chair_gregory", ModBlocks.BIRCH_CHAIR_GREGORY);
    public static final Item CHERRY_CHAIR_GREGORY = registerBlockItem("cherry_chair_gregory", ModBlocks.CHERRY_CHAIR_GREGORY);
    public static final Item CRIMSON_CHAIR_GREGORY = registerBlockItem("crimson_chair_gregory", ModBlocks.CRIMSON_CHAIR_GREGORY);
    public static final Item DARK_OAK_CHAIR_GREGORY = registerBlockItem("dark_oak_chair_gregory", ModBlocks.DARK_OAK_CHAIR_GREGORY);
    public static final Item JUNGLE_CHAIR_GREGORY = registerBlockItem("jungle_chair_gregory", ModBlocks.JUNGLE_CHAIR_GREGORY);
    public static final Item MANGROVE_CHAIR_GREGORY = registerBlockItem("mangrove_chair_gregory", ModBlocks.MANGROVE_CHAIR_GREGORY);
    public static final Item OAK_CHAIR_GREGORY = registerBlockItem("oak_chair_gregory", ModBlocks.OAK_CHAIR_GREGORY);
    public static final Item SPRUCE_CHAIR_GREGORY = registerBlockItem("spruce_chair_gregory", ModBlocks.SPRUCE_CHAIR_GREGORY);
    public static final Item WARPED_CHAIR_GREGORY = registerBlockItem("warped_chair_gregory", ModBlocks.WARPED_CHAIR_GREGORY);
    public static final Item WHITE_BARBER_CHAIR = registerBlockItem("white_barber_chair", ModBlocks.WHITE_BARBER_CHAIR);
    public static final Item LIGHT_GRAY_BARBER_CHAIR = registerBlockItem("light_gray_barber_chair", ModBlocks.LIGHT_GRAY_BARBER_CHAIR);
    public static final Item GRAY_BARBER_CHAIR = registerBlockItem("gray_barber_chair", ModBlocks.GRAY_BARBER_CHAIR);
    public static final Item BLACK_BARBER_CHAIR = registerBlockItem("black_barber_chair", ModBlocks.BLACK_BARBER_CHAIR);
    public static final Item BROWN_BARBER_CHAIR = registerBlockItem("brown_barber_chair", ModBlocks.BROWN_BARBER_CHAIR);
    public static final Item RED_BARBER_CHAIR = registerBlockItem("red_barber_chair", ModBlocks.RED_BARBER_CHAIR);
    public static final Item ORANGE_BARBER_CHAIR = registerBlockItem("orange_barber_chair", ModBlocks.ORANGE_BARBER_CHAIR);
    public static final Item YELLOW_BARBER_CHAIR = registerBlockItem("yellow_barber_chair", ModBlocks.YELLOW_BARBER_CHAIR);
    public static final Item LIME_BARBER_CHAIR = registerBlockItem("lime_barber_chair", ModBlocks.LIME_BARBER_CHAIR);
    public static final Item GREEN_BARBER_CHAIR = registerBlockItem("green_barber_chair", ModBlocks.GREEN_BARBER_CHAIR);
    public static final Item CYAN_BARBER_CHAIR = registerBlockItem("cyan_barber_chair", ModBlocks.CYAN_BARBER_CHAIR);
    public static final Item LIGHT_BLUE_BARBER_CHAIR = registerBlockItem("light_blue_barber_chair", ModBlocks.LIGHT_BLUE_BARBER_CHAIR);
    public static final Item BLUE_BARBER_CHAIR = registerBlockItem("blue_barber_chair", ModBlocks.BLUE_BARBER_CHAIR);
    public static final Item PURPLE_BARBER_CHAIR = registerBlockItem("purple_barber_chair", ModBlocks.PURPLE_BARBER_CHAIR);
    public static final Item MAGENTA_BARBER_CHAIR = registerBlockItem("magenta_barber_chair", ModBlocks.MAGENTA_BARBER_CHAIR);
    public static final Item PINK_BARBER_CHAIR = registerBlockItem("pink_barber_chair", ModBlocks.PINK_BARBER_CHAIR);
    public static final Item WHITE_BAR_CHAIR = registerBlockItem("white_bar_chair", ModBlocks.WHITE_BAR_CHAIR);
    public static final Item LIGHT_GRAY_BAR_CHAIR = registerBlockItem("light_gray_bar_chair", ModBlocks.LIGHT_GRAY_BAR_CHAIR);
    public static final Item GRAY_BAR_CHAIR = registerBlockItem("gray_bar_chair", ModBlocks.GRAY_BAR_CHAIR);
    public static final Item BLACK_BAR_CHAIR = registerBlockItem("black_bar_chair", ModBlocks.BLACK_BAR_CHAIR);
    public static final Item BROWN_BAR_CHAIR = registerBlockItem("brown_bar_chair", ModBlocks.BROWN_BAR_CHAIR);
    public static final Item RED_BAR_CHAIR = registerBlockItem("red_bar_chair", ModBlocks.RED_BAR_CHAIR);
    public static final Item ORANGE_BAR_CHAIR = registerBlockItem("orange_bar_chair", ModBlocks.ORANGE_BAR_CHAIR);
    public static final Item YELLOW_BAR_CHAIR = registerBlockItem("yellow_bar_chair", ModBlocks.YELLOW_BAR_CHAIR);
    public static final Item LIME_BAR_CHAIR = registerBlockItem("lime_bar_chair", ModBlocks.LIME_BAR_CHAIR);
    public static final Item GREEN_BAR_CHAIR = registerBlockItem("green_bar_chair", ModBlocks.GREEN_BAR_CHAIR);
    public static final Item CYAN_BAR_CHAIR = registerBlockItem("cyan_bar_chair", ModBlocks.CYAN_BAR_CHAIR);
    public static final Item LIGHT_BLUE_BAR_CHAIR = registerBlockItem("light_blue_bar_chair", ModBlocks.LIGHT_BLUE_BAR_CHAIR);
    public static final Item BLUE_BAR_CHAIR = registerBlockItem("blue_bar_chair", ModBlocks.BLUE_BAR_CHAIR);
    public static final Item PURPLE_BAR_CHAIR = registerBlockItem("purple_bar_chair", ModBlocks.PURPLE_BAR_CHAIR);
    public static final Item MAGENTA_BAR_CHAIR = registerBlockItem("magenta_bar_chair", ModBlocks.MAGENTA_BAR_CHAIR);
    public static final Item PINK_BAR_CHAIR = registerBlockItem("pink_bar_chair", ModBlocks.PINK_BAR_CHAIR);
    public static final Item ACACIA_PARK_BENCH = registerBlockItem("acacia_park_bench", ModBlocks.ACACIA_PARK_BENCH);
    public static final Item BAMBOO_PARK_BENCH = registerBlockItem("bamboo_park_bench", ModBlocks.BAMBOO_PARK_BENCH);
    public static final Item BIRCH_PARK_BENCH = registerBlockItem("birch_park_bench", ModBlocks.BIRCH_PARK_BENCH);
    public static final Item CHERRY_PARK_BENCH = registerBlockItem("cherry_park_bench", ModBlocks.CHERRY_PARK_BENCH);
    public static final Item CRIMSON_PARK_BENCH = registerBlockItem("crimson_park_bench", ModBlocks.CRIMSON_PARK_BENCH);
    public static final Item DARK_OAK_PARK_BENCH = registerBlockItem("dark_oak_park_bench", ModBlocks.DARK_OAK_PARK_BENCH);
    public static final Item JUNGLE_PARK_BENCH = registerBlockItem("jungle_park_bench", ModBlocks.JUNGLE_PARK_BENCH);
    public static final Item MANGROVE_PARK_BENCH = registerBlockItem("mangrove_park_bench", ModBlocks.MANGROVE_PARK_BENCH);
    public static final Item OAK_PARK_BENCH = registerBlockItem("oak_park_bench", ModBlocks.OAK_PARK_BENCH);
    public static final Item SPRUCE_PARK_BENCH = registerBlockItem("spruce_park_bench", ModBlocks.SPRUCE_PARK_BENCH);
    public static final Item WARPED_PARK_BENCH = registerBlockItem("warped_park_bench", ModBlocks.WARPED_PARK_BENCH);
    public static final Item ACACIA_LOG_SEAT = registerBlockItem("acacia_log_seat", ModBlocks.ACACIA_LOG_SEAT);
    public static final Item BIRCH_LOG_SEAT = registerBlockItem("birch_log_seat", ModBlocks.BIRCH_LOG_SEAT);
    public static final Item CHERRY_LOG_SEAT = registerBlockItem("cherry_log_seat", ModBlocks.CHERRY_LOG_SEAT);
    public static final Item CRIMSON_STEM_SEAT = registerBlockItem("crimson_stem_seat", ModBlocks.CRIMSON_STEM_SEAT);
    public static final Item DARK_OAK_LOG_SEAT = registerBlockItem("dark_oak_log_seat", ModBlocks.DARK_OAK_LOG_SEAT);
    public static final Item JUNGLE_LOG_SEAT = registerBlockItem("jungle_log_seat", ModBlocks.JUNGLE_LOG_SEAT);
    public static final Item MANGROVE_LOG_SEAT = registerBlockItem("mangrove_log_seat", ModBlocks.MANGROVE_LOG_SEAT);
    public static final Item OAK_LOG_SEAT = registerBlockItem("oak_log_seat", ModBlocks.OAK_LOG_SEAT);
    public static final Item SPRUCE_LOG_SEAT = registerBlockItem("spruce_log_seat", ModBlocks.SPRUCE_LOG_SEAT);
    public static final Item WARPED_STEM_SEAT = registerBlockItem("warped_stem_seat", ModBlocks.WARPED_STEM_SEAT);
    public static final Item ACACIA_BARREL_SEAT = registerBlockItem("acacia_barrel_seat", ModBlocks.ACACIA_BARREL_SEAT);
    public static final Item BAMBOO_BARREL_SEAT = registerBlockItem("bamboo_barrel_seat", ModBlocks.BAMBOO_BARREL_SEAT);
    public static final Item BIRCH_BARREL_SEAT = registerBlockItem("birch_barrel_seat", ModBlocks.BIRCH_BARREL_SEAT);
    public static final Item CHERRY_BARREL_SEAT = registerBlockItem("cherry_barrel_seat", ModBlocks.CHERRY_BARREL_SEAT);
    public static final Item CRIMSON_BARREL_SEAT = registerBlockItem("crimson_barrel_seat", ModBlocks.CRIMSON_BARREL_SEAT);
    public static final Item DARK_OAK_BARREL_SEAT = registerBlockItem("dark_oak_barrel_seat", ModBlocks.DARK_OAK_BARREL_SEAT);
    public static final Item JUNGLE_BARREL_SEAT = registerBlockItem("jungle_barrel_seat", ModBlocks.JUNGLE_BARREL_SEAT);
    public static final Item MANGROVE_BARREL_SEAT = registerBlockItem("mangrove_barrel_seat", ModBlocks.MANGROVE_BARREL_SEAT);
    public static final Item OAK_BARREL_SEAT = registerBlockItem("oak_barrel_seat", ModBlocks.OAK_BARREL_SEAT);
    public static final Item SPRUCE_BARREL_SEAT = registerBlockItem("spruce_barrel_seat", ModBlocks.SPRUCE_BARREL_SEAT);
    public static final Item WARPED_BARREL_SEAT = registerBlockItem("warped_barrel_seat", ModBlocks.WARPED_BARREL_SEAT);
    public static final Item ACACIA_CAMPFIRE = registerBlockItem("acacia_campfire", ModBlocks.ACACIA_CAMPFIRE);
    public static final Item BIRCH_CAMPFIRE = registerBlockItem("birch_campfire", ModBlocks.BIRCH_CAMPFIRE);
    public static final Item CHERRY_CAMPFIRE = registerBlockItem("cherry_campfire", ModBlocks.CHERRY_CAMPFIRE);
    public static final Item CRIMSON_CAMPFIRE = registerBlockItem("crimson_campfire", ModBlocks.CRIMSON_CAMPFIRE);
    public static final Item DARK_OAK_CAMPFIRE = registerBlockItem("dark_oak_campfire", ModBlocks.DARK_OAK_CAMPFIRE);
    public static final Item JUNGLE_CAMPFIRE = registerBlockItem("jungle_campfire", ModBlocks.JUNGLE_CAMPFIRE);
    public static final Item MANGROVE_CAMPFIRE = registerBlockItem("mangrove_campfire", ModBlocks.MANGROVE_CAMPFIRE);
    public static final Item SPRUCE_CAMPFIRE = registerBlockItem("spruce_campfire", ModBlocks.SPRUCE_CAMPFIRE);
    public static final Item WARPED_CAMPFIRE = registerBlockItem("warped_campfire", ModBlocks.WARPED_CAMPFIRE);
    public static final Item ACACIA_SOUL_CAMPFIRE = registerBlockItem("acacia_soul_campfire", ModBlocks.ACACIA_SOUL_CAMPFIRE);
    public static final Item BIRCH_SOUL_CAMPFIRE = registerBlockItem("birch_soul_campfire", ModBlocks.BIRCH_SOUL_CAMPFIRE);
    public static final Item CHERRY_SOUL_CAMPFIRE = registerBlockItem("cherry_soul_campfire", ModBlocks.CHERRY_SOUL_CAMPFIRE);
    public static final Item CRIMSON_SOUL_CAMPFIRE = registerBlockItem("crimson_soul_campfire", ModBlocks.CRIMSON_SOUL_CAMPFIRE);
    public static final Item DARK_OAK_SOUL_CAMPFIRE = registerBlockItem("dark_oak_soul_campfire", ModBlocks.DARK_OAK_SOUL_CAMPFIRE);
    public static final Item JUNGLE_SOUL_CAMPFIRE = registerBlockItem("jungle_soul_campfire", ModBlocks.JUNGLE_SOUL_CAMPFIRE);
    public static final Item MANGROVE_SOUL_CAMPFIRE = registerBlockItem("mangrove_soul_campfire", ModBlocks.MANGROVE_SOUL_CAMPFIRE);
    public static final Item SPRUCE_SOUL_CAMPFIRE = registerBlockItem("spruce_soul_campfire", ModBlocks.SPRUCE_SOUL_CAMPFIRE);
    public static final Item WARPED_SOUL_CAMPFIRE = registerBlockItem("warped_soul_campfire", ModBlocks.WARPED_SOUL_CAMPFIRE);
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
    public static final Item ACACIA_COFFEE_TABLE = registerBlockItem("acacia_coffee_table", ModBlocks.ACACIA_COFFEE_TABLE);
    public static final Item BAMBOO_COFFEE_TABLE = registerBlockItem("bamboo_coffee_table", ModBlocks.BAMBOO_COFFEE_TABLE);
    public static final Item BIRCH_COFFEE_TABLE = registerBlockItem("birch_coffee_table", ModBlocks.BIRCH_COFFEE_TABLE);
    public static final Item CHERRY_COFFEE_TABLE = registerBlockItem("cherry_coffee_table", ModBlocks.CHERRY_COFFEE_TABLE);
    public static final Item CRIMSON_COFFEE_TABLE = registerBlockItem("crimson_coffee_table", ModBlocks.CRIMSON_COFFEE_TABLE);
    public static final Item DARK_OAK_COFFEE_TABLE = registerBlockItem("dark_oak_coffee_table", ModBlocks.DARK_OAK_COFFEE_TABLE);
    public static final Item JUNGLE_COFFEE_TABLE = registerBlockItem("jungle_coffee_table", ModBlocks.JUNGLE_COFFEE_TABLE);
    public static final Item MANGROVE_COFFEE_TABLE = registerBlockItem("mangrove_coffee_table", ModBlocks.MANGROVE_COFFEE_TABLE);
    public static final Item OAK_COFFEE_TABLE = registerBlockItem("oak_coffee_table", ModBlocks.OAK_COFFEE_TABLE);
    public static final Item SPRUCE_COFFEE_TABLE = registerBlockItem("spruce_coffee_table", ModBlocks.SPRUCE_COFFEE_TABLE);
    public static final Item WARPED_COFFEE_TABLE = registerBlockItem("warped_coffee_table", ModBlocks.WARPED_COFFEE_TABLE);

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
