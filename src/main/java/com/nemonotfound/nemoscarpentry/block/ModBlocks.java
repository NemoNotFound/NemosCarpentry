package com.nemonotfound.nemoscarpentry.block;

import com.nemonotfound.nemoscarpentry.block.seats.*;
import com.nemonotfound.nemoscarpentry.block.tables.StandingTableBlock;
import com.nemonotfound.nemoscarpentry.block.tables.CoffeeTableBlock;
import com.nemonotfound.nemoscarpentry.block.tables.TableBlock;
import com.nemonotfound.nemoscarpentry.block.tables.TablePascalBlock;
import com.nemonotfound.nemoscarpentry.item.ModItemGroups;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.Arrays;

import static com.nemonotfound.nemoscarpentry.NemosCarpentry.MOD_ID;
import static net.minecraft.block.Blocks.*;

public class ModBlocks {

    public static final Block DARK_OAK_LADDER = registerBlock("dark_oak_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)));
    public static final Block ACACIA_LADDER = registerBlock("acacia_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)));
    public static final Block BIRCH_LADDER = registerBlock("birch_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)));
    public static final Block SPRUCE_LADDER = registerBlock("spruce_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)));
    public static final Block WARPED_LADDER = registerBlock("warped_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)));
    public static final Block BAMBOO_LADDER = registerBlock("bamboo_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)));
    public static final Block CRIMSON_LADDER = registerBlock("crimson_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)));
    public static final Block MANGROVE_LADDER = registerBlock("mangrove_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)));
    public static final Block JUNGLE_LADDER = registerBlock("jungle_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)));
    public static final Block BOUND_BAMBOO_LADDER = registerBlock("bound_bamboo_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)));
    public static final Block CHERRY_LADDER = registerBlock("cherry_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)));
    public static final Block ACACIA_TABLE_THE_CLASSIC = registerBlock("acacia_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block BAMBOO_TABLE_THE_CLASSIC = registerBlock("bamboo_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BIRCH_TABLE_THE_CLASSIC = registerBlock("birch_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block CHERRY_TABLE_THE_CLASSIC = registerBlock("cherry_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CRIMSON_TABLE_THE_CLASSIC = registerBlock("crimson_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_TABLE_THE_CLASSIC = registerBlock("dark_oak_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block JUNGLE_TABLE_THE_CLASSIC = registerBlock("jungle_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_TABLE_THE_CLASSIC = registerBlock("mangrove_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block OAK_TABLE_THE_CLASSIC = registerBlock("oak_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block SPRUCE_TABLE_THE_CLASSIC = registerBlock("spruce_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block WARPED_TABLE_THE_CLASSIC = registerBlock("warped_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block ACACIA_COFFEE_TABLE_PASCAL = registerBlock("acacia_coffee_table_pascal",
            new TablePascalBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block BAMBOO_COFFEE_TABLE_PASCAL = registerBlock("bamboo_coffee_table_pascal",
            new TablePascalBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BIRCH_COFFEE_TABLE_PASCAL = registerBlock("birch_coffee_table_pascal",
            new TablePascalBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block CHERRY_COFFEE_TABLE_PASCAL = registerBlock("cherry_coffee_table_pascal",
            new TablePascalBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CRIMSON_COFFEE_TABLE_PASCAL = registerBlock("crimson_coffee_table_pascal",
            new TablePascalBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_COFFEE_TABLE_PASCAL = registerBlock("dark_oak_coffee_table_pascal",
            new TablePascalBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block JUNGLE_COFFEE_TABLE_PASCAL = registerBlock("jungle_coffee_table_pascal",
            new TablePascalBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_COFFEE_TABLE_PASCAL = registerBlock("mangrove_coffee_table_pascal",
            new TablePascalBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block OAK_COFFEE_TABLE_PASCAL = registerBlock("oak_coffee_table_pascal",
            new TablePascalBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block SPRUCE_COFFEE_TABLE_PASCAL = registerBlock("spruce_coffee_table_pascal",
            new TablePascalBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block WARPED_COFFEE_TABLE_PASCAL = registerBlock("warped_coffee_table_pascal",
            new TablePascalBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block ACACIA_STANDING_TABLE = registerBlock("acacia_standing_table",
            new StandingTableBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block BAMBOO_STANDING_TABLE = registerBlock("bamboo_standing_table",
            new StandingTableBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BIRCH_STANDING_TABLE = registerBlock("birch_standing_table",
            new StandingTableBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block CHERRY_STANDING_TABLE = registerBlock("cherry_standing_table",
            new StandingTableBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CRIMSON_STANDING_TABLE = registerBlock("crimson_standing_table",
            new StandingTableBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_STANDING_TABLE = registerBlock("dark_oak_standing_table",
            new StandingTableBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block JUNGLE_STANDING_TABLE = registerBlock("jungle_standing_table",
            new StandingTableBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_STANDING_TABLE = registerBlock("mangrove_standing_table",
            new StandingTableBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block OAK_STANDING_TABLE = registerBlock("oak_standing_table",
            new StandingTableBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block SPRUCE_STANDING_TABLE = registerBlock("spruce_standing_table",
            new StandingTableBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block WARPED_STANDING_TABLE = registerBlock("warped_standing_table",
            new StandingTableBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block ACACIA_CHAIR = registerBlock("acacia_chair",
            new ChairBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block BAMBOO_CHAIR = registerBlock("bamboo_chair",
            new ChairBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BIRCH_CHAIR = registerBlock("birch_chair",
            new ChairBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block CHERRY_CHAIR = registerBlock("cherry_chair",
            new ChairBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CRIMSON_CHAIR = registerBlock("crimson_chair",
            new ChairBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_CHAIR = registerBlock("dark_oak_chair",
            new ChairBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block JUNGLE_CHAIR = registerBlock("jungle_chair",
            new ChairBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_CHAIR = registerBlock("mangrove_chair",
            new ChairBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block OAK_CHAIR = registerBlock("oak_chair",
            new ChairBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block SPRUCE_CHAIR = registerBlock("spruce_chair",
            new ChairBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block WARPED_CHAIR = registerBlock("warped_chair",
            new ChairBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block ACACIA_CHAIR_FELIX = registerBlock("acacia_chair_felix",
            new FelixChairBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block BAMBOO_CHAIR_FELIX = registerBlock("bamboo_chair_felix",
            new FelixChairBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BIRCH_CHAIR_FELIX = registerBlock("birch_chair_felix",
            new FelixChairBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block CHERRY_CHAIR_FELIX = registerBlock("cherry_chair_felix",
            new FelixChairBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CRIMSON_CHAIR_FELIX = registerBlock("crimson_chair_felix",
            new FelixChairBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_CHAIR_FELIX = registerBlock("dark_oak_chair_felix",
            new FelixChairBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block JUNGLE_CHAIR_FELIX = registerBlock("jungle_chair_felix",
            new FelixChairBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_CHAIR_FELIX = registerBlock("mangrove_chair_felix",
            new FelixChairBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block OAK_CHAIR_FELIX = registerBlock("oak_chair_felix",
            new FelixChairBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block SPRUCE_CHAIR_FELIX = registerBlock("spruce_chair_felix",
            new FelixChairBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block WARPED_CHAIR_FELIX = registerBlock("warped_chair_felix",
            new FelixChairBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block ACACIA_CHAIR_LUKAS = registerBlock("acacia_chair_lukas",
            new LukasChairBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block BAMBOO_CHAIR_LUKAS = registerBlock("bamboo_chair_lukas",
            new LukasChairBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BIRCH_CHAIR_LUKAS = registerBlock("birch_chair_lukas",
            new LukasChairBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block CHERRY_CHAIR_LUKAS = registerBlock("cherry_chair_lukas",
            new LukasChairBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CRIMSON_CHAIR_LUKAS = registerBlock("crimson_chair_lukas",
            new LukasChairBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_CHAIR_LUKAS = registerBlock("dark_oak_chair_lukas",
            new LukasChairBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block JUNGLE_CHAIR_LUKAS = registerBlock("jungle_chair_lukas",
            new LukasChairBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_CHAIR_LUKAS = registerBlock("mangrove_chair_lukas",
            new LukasChairBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block OAK_CHAIR_LUKAS = registerBlock("oak_chair_lukas",
            new LukasChairBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block SPRUCE_CHAIR_LUKAS = registerBlock("spruce_chair_lukas",
            new LukasChairBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block WARPED_CHAIR_LUKAS = registerBlock("warped_chair_lukas",
            new LukasChairBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block ACACIA_CHAIR_LUKAS_NATURAL = registerBlock("acacia_chair_lukas_natural",
            new LukasChairBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block BAMBOO_CHAIR_LUKAS_NATURAL = registerBlock("bamboo_chair_lukas_natural",
            new LukasChairBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BIRCH_CHAIR_LUKAS_NATURAL = registerBlock("birch_chair_lukas_natural",
            new LukasChairBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block CHERRY_CHAIR_LUKAS_NATURAL = registerBlock("cherry_chair_lukas_natural",
            new LukasChairBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CRIMSON_CHAIR_LUKAS_NATURAL = registerBlock("crimson_chair_lukas_natural",
            new LukasChairBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_CHAIR_LUKAS_NATURAL = registerBlock("dark_oak_chair_lukas_natural",
            new LukasChairBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block JUNGLE_CHAIR_LUKAS_NATURAL = registerBlock("jungle_chair_lukas_natural",
            new LukasChairBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_CHAIR_LUKAS_NATURAL = registerBlock("mangrove_chair_lukas_natural",
            new LukasChairBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block OAK_CHAIR_LUKAS_NATURAL = registerBlock("oak_chair_lukas_natural",
            new LukasChairBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block SPRUCE_CHAIR_LUKAS_NATURAL = registerBlock("spruce_chair_lukas_natural",
            new LukasChairBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block WARPED_CHAIR_LUKAS_NATURAL = registerBlock("warped_chair_lukas_natural",
            new LukasChairBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block ACACIA_CHAIR_TOMMY = registerBlock("acacia_chair_tommy",
            new TommyChairBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block BAMBOO_CHAIR_TOMMY = registerBlock("bamboo_chair_tommy",
            new TommyChairBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BIRCH_CHAIR_TOMMY = registerBlock("birch_chair_tommy",
            new TommyChairBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block CHERRY_CHAIR_TOMMY = registerBlock("cherry_chair_tommy",
            new TommyChairBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CRIMSON_CHAIR_TOMMY = registerBlock("crimson_chair_tommy",
            new TommyChairBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_CHAIR_TOMMY = registerBlock("dark_oak_chair_tommy",
            new TommyChairBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block JUNGLE_CHAIR_TOMMY = registerBlock("jungle_chair_tommy",
            new TommyChairBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_CHAIR_TOMMY = registerBlock("mangrove_chair_tommy",
            new TommyChairBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block OAK_CHAIR_TOMMY = registerBlock("oak_chair_tommy",
            new TommyChairBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block SPRUCE_CHAIR_TOMMY = registerBlock("spruce_chair_tommy",
            new TommyChairBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block WARPED_CHAIR_TOMMY = registerBlock("warped_chair_tommy",
            new TommyChairBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block ACACIA_CHAIR_TOMMY_NATURAL = registerBlock("acacia_chair_tommy_natural",
            new TommyChairBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block BAMBOO_CHAIR_TOMMY_NATURAL = registerBlock("bamboo_chair_tommy_natural",
            new TommyChairBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BIRCH_CHAIR_TOMMY_NATURAL = registerBlock("birch_chair_tommy_natural",
            new TommyChairBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block CHERRY_CHAIR_TOMMY_NATURAL = registerBlock("cherry_chair_tommy_natural",
            new TommyChairBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CRIMSON_CHAIR_TOMMY_NATURAL = registerBlock("crimson_chair_tommy_natural",
            new TommyChairBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_CHAIR_TOMMY_NATURAL = registerBlock("dark_oak_chair_tommy_natural",
            new TommyChairBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block JUNGLE_CHAIR_TOMMY_NATURAL = registerBlock("jungle_chair_tommy_natural",
            new TommyChairBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_CHAIR_TOMMY_NATURAL = registerBlock("mangrove_chair_tommy_natural",
            new TommyChairBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block OAK_CHAIR_TOMMY_NATURAL = registerBlock("oak_chair_tommy_natural",
            new TommyChairBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block SPRUCE_CHAIR_TOMMY_NATURAL = registerBlock("spruce_chair_tommy_natural",
            new TommyChairBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block WARPED_CHAIR_TOMMY_NATURAL = registerBlock("warped_chair_tommy_natural",
            new TommyChairBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block ACACIA_CHAIR_GREGORY = registerBlock("acacia_chair_gregory",
            new GregoryChairBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block BAMBOO_CHAIR_GREGORY = registerBlock("bamboo_chair_gregory",
            new GregoryChairBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BIRCH_CHAIR_GREGORY = registerBlock("birch_chair_gregory",
            new GregoryChairBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block CHERRY_CHAIR_GREGORY = registerBlock("cherry_chair_gregory",
            new GregoryChairBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CRIMSON_CHAIR_GREGORY = registerBlock("crimson_chair_gregory",
            new GregoryChairBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_CHAIR_GREGORY = registerBlock("dark_oak_chair_gregory",
            new GregoryChairBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block JUNGLE_CHAIR_GREGORY = registerBlock("jungle_chair_gregory",
            new GregoryChairBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_CHAIR_GREGORY = registerBlock("mangrove_chair_gregory",
            new GregoryChairBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block OAK_CHAIR_GREGORY = registerBlock("oak_chair_gregory",
            new GregoryChairBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block SPRUCE_CHAIR_GREGORY = registerBlock("spruce_chair_gregory",
            new GregoryChairBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block WARPED_CHAIR_GREGORY = registerBlock("warped_chair_gregory",
            new GregoryChairBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block ACACIA_CHAIR_PASCAL = registerBlock("acacia_chair_pascal",
            new PascalChairBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block ACACIA_WHITE_CHAIR_PASCAL = registerBlock("acacia_white_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block ACACIA_LIGHT_GRAY_CHAIR_PASCAL = registerBlock("acacia_light_gray_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block ACACIA_GRAY_CHAIR_PASCAL = registerBlock("acacia_gray_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block ACACIA_BLACK_CHAIR_PASCAL = registerBlock("acacia_black_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block ACACIA_BROWN_CHAIR_PASCAL = registerBlock("acacia_brown_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block ACACIA_RED_CHAIR_PASCAL = registerBlock("acacia_red_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block ACACIA_ORANGE_CHAIR_PASCAL = registerBlock("acacia_orange_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block ACACIA_YELLOW_CHAIR_PASCAL = registerBlock("acacia_yellow_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block ACACIA_LIME_CHAIR_PASCAL = registerBlock("acacia_lime_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block ACACIA_GREEN_CHAIR_PASCAL = registerBlock("acacia_green_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block ACACIA_CYAN_CHAIR_PASCAL = registerBlock("acacia_cyan_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block ACACIA_LIGHT_BLUE_CHAIR_PASCAL = registerBlock("acacia_light_blue_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block ACACIA_BLUE_CHAIR_PASCAL = registerBlock("acacia_blue_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block ACACIA_PURPLE_CHAIR_PASCAL = registerBlock("acacia_purple_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block ACACIA_MAGENTA_CHAIR_PASCAL = registerBlock("acacia_magenta_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block ACACIA_PINK_CHAIR_PASCAL = registerBlock("acacia_pink_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block BAMBOO_CHAIR_PASCAL = registerBlock("bamboo_chair_pascal",
            new PascalChairBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BAMBOO_WHITE_CHAIR_PASCAL = registerBlock("bamboo_white_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BAMBOO_LIGHT_GRAY_CHAIR_PASCAL = registerBlock("bamboo_light_gray_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BAMBOO_GRAY_CHAIR_PASCAL = registerBlock("bamboo_gray_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BAMBOO_BLACK_CHAIR_PASCAL = registerBlock("bamboo_black_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BAMBOO_BROWN_CHAIR_PASCAL = registerBlock("bamboo_brown_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BAMBOO_RED_CHAIR_PASCAL = registerBlock("bamboo_red_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BAMBOO_ORANGE_CHAIR_PASCAL = registerBlock("bamboo_orange_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BAMBOO_YELLOW_CHAIR_PASCAL = registerBlock("bamboo_yellow_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BAMBOO_LIME_CHAIR_PASCAL = registerBlock("bamboo_lime_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BAMBOO_GREEN_CHAIR_PASCAL = registerBlock("bamboo_green_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BAMBOO_CYAN_CHAIR_PASCAL = registerBlock("bamboo_cyan_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BAMBOO_LIGHT_BLUE_CHAIR_PASCAL = registerBlock("bamboo_light_blue_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BAMBOO_BLUE_CHAIR_PASCAL = registerBlock("bamboo_blue_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BAMBOO_PURPLE_CHAIR_PASCAL = registerBlock("bamboo_purple_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BAMBOO_MAGENTA_CHAIR_PASCAL = registerBlock("bamboo_magenta_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BAMBOO_PINK_CHAIR_PASCAL = registerBlock("bamboo_pink_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BIRCH_CHAIR_PASCAL = registerBlock("birch_chair_pascal",
            new PascalChairBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block BIRCH_WHITE_CHAIR_PASCAL = registerBlock("birch_white_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block BIRCH_LIGHT_GRAY_CHAIR_PASCAL = registerBlock("birch_light_gray_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block BIRCH_GRAY_CHAIR_PASCAL = registerBlock("birch_gray_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block BIRCH_BLACK_CHAIR_PASCAL = registerBlock("birch_black_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block BIRCH_BROWN_CHAIR_PASCAL = registerBlock("birch_brown_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block BIRCH_RED_CHAIR_PASCAL = registerBlock("birch_red_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block BIRCH_ORANGE_CHAIR_PASCAL = registerBlock("birch_orange_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block BIRCH_YELLOW_CHAIR_PASCAL = registerBlock("birch_yellow_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block BIRCH_LIME_CHAIR_PASCAL = registerBlock("birch_lime_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block BIRCH_GREEN_CHAIR_PASCAL = registerBlock("birch_green_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block BIRCH_CYAN_CHAIR_PASCAL = registerBlock("birch_cyan_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block BIRCH_LIGHT_BLUE_CHAIR_PASCAL = registerBlock("birch_light_blue_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block BIRCH_BLUE_CHAIR_PASCAL = registerBlock("birch_blue_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block BIRCH_PURPLE_CHAIR_PASCAL = registerBlock("birch_purple_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block BIRCH_MAGENTA_CHAIR_PASCAL = registerBlock("birch_magenta_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block BIRCH_PINK_CHAIR_PASCAL = registerBlock("birch_pink_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block CHERRY_CHAIR_PASCAL = registerBlock("cherry_chair_pascal",
            new PascalChairBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CHERRY_WHITE_CHAIR_PASCAL = registerBlock("cherry_white_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CHERRY_LIGHT_GRAY_CHAIR_PASCAL = registerBlock("cherry_light_gray_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CHERRY_GRAY_CHAIR_PASCAL = registerBlock("cherry_gray_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CHERRY_BLACK_CHAIR_PASCAL = registerBlock("cherry_black_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CHERRY_BROWN_CHAIR_PASCAL = registerBlock("cherry_brown_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CHERRY_RED_CHAIR_PASCAL = registerBlock("cherry_red_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CHERRY_ORANGE_CHAIR_PASCAL = registerBlock("cherry_orange_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CHERRY_YELLOW_CHAIR_PASCAL = registerBlock("cherry_yellow_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CHERRY_LIME_CHAIR_PASCAL = registerBlock("cherry_lime_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CHERRY_GREEN_CHAIR_PASCAL = registerBlock("cherry_green_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CHERRY_CYAN_CHAIR_PASCAL = registerBlock("cherry_cyan_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CHERRY_LIGHT_BLUE_CHAIR_PASCAL = registerBlock("cherry_light_blue_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CHERRY_BLUE_CHAIR_PASCAL = registerBlock("cherry_blue_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CHERRY_PURPLE_CHAIR_PASCAL = registerBlock("cherry_purple_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CHERRY_MAGENTA_CHAIR_PASCAL = registerBlock("cherry_magenta_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CHERRY_PINK_CHAIR_PASCAL = registerBlock("cherry_pink_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CRIMSON_CHAIR_PASCAL = registerBlock("crimson_chair_pascal",
            new PascalChairBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block CRIMSON_WHITE_CHAIR_PASCAL = registerBlock("crimson_white_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block CRIMSON_LIGHT_GRAY_CHAIR_PASCAL = registerBlock("crimson_light_gray_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block CRIMSON_GRAY_CHAIR_PASCAL = registerBlock("crimson_gray_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block CRIMSON_BLACK_CHAIR_PASCAL = registerBlock("crimson_black_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block CRIMSON_BROWN_CHAIR_PASCAL = registerBlock("crimson_brown_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block CRIMSON_RED_CHAIR_PASCAL = registerBlock("crimson_red_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block CRIMSON_ORANGE_CHAIR_PASCAL = registerBlock("crimson_orange_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block CRIMSON_YELLOW_CHAIR_PASCAL = registerBlock("crimson_yellow_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block CRIMSON_LIME_CHAIR_PASCAL = registerBlock("crimson_lime_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block CRIMSON_GREEN_CHAIR_PASCAL = registerBlock("crimson_green_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block CRIMSON_CYAN_CHAIR_PASCAL = registerBlock("crimson_cyan_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block CRIMSON_LIGHT_BLUE_CHAIR_PASCAL = registerBlock("crimson_light_blue_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block CRIMSON_BLUE_CHAIR_PASCAL = registerBlock("crimson_blue_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block CRIMSON_PURPLE_CHAIR_PASCAL = registerBlock("crimson_purple_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block CRIMSON_MAGENTA_CHAIR_PASCAL = registerBlock("crimson_magenta_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block CRIMSON_PINK_CHAIR_PASCAL = registerBlock("crimson_pink_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_CHAIR_PASCAL = registerBlock("dark_oak_chair_pascal",
            new PascalChairBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_WHITE_CHAIR_PASCAL = registerBlock("dark_oak_white_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_LIGHT_GRAY_CHAIR_PASCAL = registerBlock("dark_oak_light_gray_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_GRAY_CHAIR_PASCAL = registerBlock("dark_oak_gray_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_BLACK_CHAIR_PASCAL = registerBlock("dark_oak_black_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_BROWN_CHAIR_PASCAL = registerBlock("dark_oak_brown_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_RED_CHAIR_PASCAL = registerBlock("dark_oak_red_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_ORANGE_CHAIR_PASCAL = registerBlock("dark_oak_orange_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_YELLOW_CHAIR_PASCAL = registerBlock("dark_oak_yellow_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_LIME_CHAIR_PASCAL = registerBlock("dark_oak_lime_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_GREEN_CHAIR_PASCAL = registerBlock("dark_oak_green_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_CYAN_CHAIR_PASCAL = registerBlock("dark_oak_cyan_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_LIGHT_BLUE_CHAIR_PASCAL = registerBlock("dark_oak_light_blue_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_BLUE_CHAIR_PASCAL = registerBlock("dark_oak_blue_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_PURPLE_CHAIR_PASCAL = registerBlock("dark_oak_purple_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_MAGENTA_CHAIR_PASCAL = registerBlock("dark_oak_magenta_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_PINK_CHAIR_PASCAL = registerBlock("dark_oak_pink_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block JUNGLE_CHAIR_PASCAL = registerBlock("jungle_chair_pascal",
            new PascalChairBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block JUNGLE_WHITE_CHAIR_PASCAL = registerBlock("jungle_white_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block JUNGLE_LIGHT_GRAY_CHAIR_PASCAL = registerBlock("jungle_light_gray_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block JUNGLE_GRAY_CHAIR_PASCAL = registerBlock("jungle_gray_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block JUNGLE_BLACK_CHAIR_PASCAL = registerBlock("jungle_black_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block JUNGLE_BROWN_CHAIR_PASCAL = registerBlock("jungle_brown_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block JUNGLE_RED_CHAIR_PASCAL = registerBlock("jungle_red_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block JUNGLE_ORANGE_CHAIR_PASCAL = registerBlock("jungle_orange_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block JUNGLE_YELLOW_CHAIR_PASCAL = registerBlock("jungle_yellow_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block JUNGLE_LIME_CHAIR_PASCAL = registerBlock("jungle_lime_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block JUNGLE_GREEN_CHAIR_PASCAL = registerBlock("jungle_green_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block JUNGLE_CYAN_CHAIR_PASCAL = registerBlock("jungle_cyan_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block JUNGLE_LIGHT_BLUE_CHAIR_PASCAL = registerBlock("jungle_light_blue_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block JUNGLE_BLUE_CHAIR_PASCAL = registerBlock("jungle_blue_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block JUNGLE_PURPLE_CHAIR_PASCAL = registerBlock("jungle_purple_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block JUNGLE_MAGENTA_CHAIR_PASCAL = registerBlock("jungle_magenta_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block JUNGLE_PINK_CHAIR_PASCAL = registerBlock("jungle_pink_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_CHAIR_PASCAL = registerBlock("mangrove_chair_pascal",
            new PascalChairBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_WHITE_CHAIR_PASCAL = registerBlock("mangrove_white_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_LIGHT_GRAY_CHAIR_PASCAL = registerBlock("mangrove_light_gray_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_GRAY_CHAIR_PASCAL = registerBlock("mangrove_gray_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_BLACK_CHAIR_PASCAL = registerBlock("mangrove_black_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_BROWN_CHAIR_PASCAL = registerBlock("mangrove_brown_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_RED_CHAIR_PASCAL = registerBlock("mangrove_red_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_ORANGE_CHAIR_PASCAL = registerBlock("mangrove_orange_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_YELLOW_CHAIR_PASCAL = registerBlock("mangrove_yellow_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_LIME_CHAIR_PASCAL = registerBlock("mangrove_lime_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_GREEN_CHAIR_PASCAL = registerBlock("mangrove_green_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_CYAN_CHAIR_PASCAL = registerBlock("mangrove_cyan_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_LIGHT_BLUE_CHAIR_PASCAL = registerBlock("mangrove_light_blue_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_BLUE_CHAIR_PASCAL = registerBlock("mangrove_blue_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_PURPLE_CHAIR_PASCAL = registerBlock("mangrove_purple_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_MAGENTA_CHAIR_PASCAL = registerBlock("mangrove_magenta_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_PINK_CHAIR_PASCAL = registerBlock("mangrove_pink_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block OAK_CHAIR_PASCAL = registerBlock("oak_chair_pascal",
            new PascalChairBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block OAK_WHITE_CHAIR_PASCAL = registerBlock("oak_white_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block OAK_LIGHT_GRAY_CHAIR_PASCAL = registerBlock("oak_light_gray_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block OAK_GRAY_CHAIR_PASCAL = registerBlock("oak_gray_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block OAK_BLACK_CHAIR_PASCAL = registerBlock("oak_black_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block OAK_BROWN_CHAIR_PASCAL = registerBlock("oak_brown_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block OAK_RED_CHAIR_PASCAL = registerBlock("oak_red_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block OAK_ORANGE_CHAIR_PASCAL = registerBlock("oak_orange_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block OAK_YELLOW_CHAIR_PASCAL = registerBlock("oak_yellow_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block OAK_LIME_CHAIR_PASCAL = registerBlock("oak_lime_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block OAK_GREEN_CHAIR_PASCAL = registerBlock("oak_green_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block OAK_CYAN_CHAIR_PASCAL = registerBlock("oak_cyan_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block OAK_LIGHT_BLUE_CHAIR_PASCAL = registerBlock("oak_light_blue_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block OAK_BLUE_CHAIR_PASCAL = registerBlock("oak_blue_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block OAK_PURPLE_CHAIR_PASCAL = registerBlock("oak_purple_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block OAK_MAGENTA_CHAIR_PASCAL = registerBlock("oak_magenta_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block OAK_PINK_CHAIR_PASCAL = registerBlock("oak_pink_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block SPRUCE_CHAIR_PASCAL = registerBlock("spruce_chair_pascal",
            new PascalChairBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block SPRUCE_WHITE_CHAIR_PASCAL = registerBlock("spruce_white_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block SPRUCE_LIGHT_GRAY_CHAIR_PASCAL = registerBlock("spruce_light_gray_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block SPRUCE_GRAY_CHAIR_PASCAL = registerBlock("spruce_gray_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block SPRUCE_BLACK_CHAIR_PASCAL = registerBlock("spruce_black_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block SPRUCE_BROWN_CHAIR_PASCAL = registerBlock("spruce_brown_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block SPRUCE_RED_CHAIR_PASCAL = registerBlock("spruce_red_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block SPRUCE_ORANGE_CHAIR_PASCAL = registerBlock("spruce_orange_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block SPRUCE_YELLOW_CHAIR_PASCAL = registerBlock("spruce_yellow_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block SPRUCE_LIME_CHAIR_PASCAL = registerBlock("spruce_lime_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block SPRUCE_GREEN_CHAIR_PASCAL = registerBlock("spruce_green_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block SPRUCE_CYAN_CHAIR_PASCAL = registerBlock("spruce_cyan_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block SPRUCE_LIGHT_BLUE_CHAIR_PASCAL = registerBlock("spruce_light_blue_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block SPRUCE_BLUE_CHAIR_PASCAL = registerBlock("spruce_blue_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block SPRUCE_PURPLE_CHAIR_PASCAL = registerBlock("spruce_purple_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block SPRUCE_MAGENTA_CHAIR_PASCAL = registerBlock("spruce_magenta_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block SPRUCE_PINK_CHAIR_PASCAL = registerBlock("spruce_pink_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block WARPED_CHAIR_PASCAL = registerBlock("warped_chair_pascal",
            new PascalChairBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block WARPED_WHITE_CHAIR_PASCAL = registerBlock("warped_white_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block WARPED_LIGHT_GRAY_CHAIR_PASCAL = registerBlock("warped_light_gray_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block WARPED_GRAY_CHAIR_PASCAL = registerBlock("warped_gray_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block WARPED_BLACK_CHAIR_PASCAL = registerBlock("warped_black_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block WARPED_BROWN_CHAIR_PASCAL = registerBlock("warped_brown_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block WARPED_RED_CHAIR_PASCAL = registerBlock("warped_red_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block WARPED_ORANGE_CHAIR_PASCAL = registerBlock("warped_orange_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block WARPED_YELLOW_CHAIR_PASCAL = registerBlock("warped_yellow_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block WARPED_LIME_CHAIR_PASCAL = registerBlock("warped_lime_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block WARPED_GREEN_CHAIR_PASCAL = registerBlock("warped_green_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block WARPED_CYAN_CHAIR_PASCAL = registerBlock("warped_cyan_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block WARPED_LIGHT_BLUE_CHAIR_PASCAL = registerBlock("warped_light_blue_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block WARPED_BLUE_CHAIR_PASCAL = registerBlock("warped_blue_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block WARPED_PURPLE_CHAIR_PASCAL = registerBlock("warped_purple_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block WARPED_MAGENTA_CHAIR_PASCAL = registerBlock("warped_magenta_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block WARPED_PINK_CHAIR_PASCAL = registerBlock("warped_pink_chair_pascal",
            new PascalChairWoolBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block WHITE_BARBER_CHAIR = registerBlock("white_barber_chair",
            new BarberChairBlock(AbstractBlock.Settings.copy(WHITE_WOOL).nonOpaque()));
    public static final Block LIGHT_GRAY_BARBER_CHAIR = registerBlock("light_gray_barber_chair",
            new BarberChairBlock(AbstractBlock.Settings.copy(LIGHT_GRAY_WOOL).nonOpaque()));
    public static final Block GRAY_BARBER_CHAIR = registerBlock("gray_barber_chair",
            new BarberChairBlock(AbstractBlock.Settings.copy(GRAY_WOOL).nonOpaque()));
    public static final Block BLACK_BARBER_CHAIR = registerBlock("black_barber_chair",
            new BarberChairBlock(AbstractBlock.Settings.copy(BLACK_WOOL).nonOpaque()));
    public static final Block BROWN_BARBER_CHAIR = registerBlock("brown_barber_chair",
            new BarberChairBlock(AbstractBlock.Settings.copy(BROWN_WOOL).nonOpaque()));
    public static final Block RED_BARBER_CHAIR = registerBlock("red_barber_chair",
            new BarberChairBlock(AbstractBlock.Settings.copy(RED_WOOL).nonOpaque()));
    public static final Block ORANGE_BARBER_CHAIR = registerBlock("orange_barber_chair",
            new BarberChairBlock(AbstractBlock.Settings.copy(ORANGE_WOOL).nonOpaque()));
    public static final Block YELLOW_BARBER_CHAIR = registerBlock("yellow_barber_chair",
            new BarberChairBlock(AbstractBlock.Settings.copy(YELLOW_WOOL).nonOpaque()));
    public static final Block LIME_BARBER_CHAIR = registerBlock("lime_barber_chair",
            new BarberChairBlock(AbstractBlock.Settings.copy(LIME_WOOL).nonOpaque()));
    public static final Block GREEN_BARBER_CHAIR = registerBlock("green_barber_chair",
            new BarberChairBlock(AbstractBlock.Settings.copy(GREEN_WOOL).nonOpaque()));
    public static final Block CYAN_BARBER_CHAIR = registerBlock("cyan_barber_chair",
            new BarberChairBlock(AbstractBlock.Settings.copy(CYAN_WOOL).nonOpaque()));
    public static final Block LIGHT_BLUE_BARBER_CHAIR = registerBlock("light_blue_barber_chair",
            new BarberChairBlock(AbstractBlock.Settings.copy(LIGHT_BLUE_WOOL).nonOpaque()));
    public static final Block BLUE_BARBER_CHAIR = registerBlock("blue_barber_chair",
            new BarberChairBlock(AbstractBlock.Settings.copy(BLUE_WOOL).nonOpaque()));
    public static final Block PURPLE_BARBER_CHAIR = registerBlock("purple_barber_chair",
            new BarberChairBlock(AbstractBlock.Settings.copy(PURPLE_WOOL).nonOpaque()));
    public static final Block MAGENTA_BARBER_CHAIR = registerBlock("magenta_barber_chair",
            new BarberChairBlock(AbstractBlock.Settings.copy(MAGENTA_WOOL).nonOpaque()));
    public static final Block PINK_BARBER_CHAIR = registerBlock("pink_barber_chair",
            new BarberChairBlock(AbstractBlock.Settings.copy(PINK_WOOL).nonOpaque()));
    public static final Block WHITE_BAR_CHAIR = registerBlock("white_bar_chair",
            new BarChairBlock(AbstractBlock.Settings.copy(WHITE_WOOL).nonOpaque()));
    public static final Block LIGHT_GRAY_BAR_CHAIR = registerBlock("light_gray_bar_chair",
            new BarChairBlock(AbstractBlock.Settings.copy(LIGHT_GRAY_WOOL).nonOpaque()));
    public static final Block GRAY_BAR_CHAIR = registerBlock("gray_bar_chair",
            new BarChairBlock(AbstractBlock.Settings.copy(GRAY_WOOL).nonOpaque()));
    public static final Block BLACK_BAR_CHAIR = registerBlock("black_bar_chair",
            new BarChairBlock(AbstractBlock.Settings.copy(BLACK_WOOL).nonOpaque()));
    public static final Block BROWN_BAR_CHAIR = registerBlock("brown_bar_chair",
            new BarChairBlock(AbstractBlock.Settings.copy(BROWN_WOOL).nonOpaque()));
    public static final Block RED_BAR_CHAIR = registerBlock("red_bar_chair",
            new BarChairBlock(AbstractBlock.Settings.copy(RED_WOOL).nonOpaque()));
    public static final Block ORANGE_BAR_CHAIR = registerBlock("orange_bar_chair",
            new BarChairBlock(AbstractBlock.Settings.copy(ORANGE_WOOL).nonOpaque()));
    public static final Block YELLOW_BAR_CHAIR = registerBlock("yellow_bar_chair",
            new BarChairBlock(AbstractBlock.Settings.copy(YELLOW_WOOL).nonOpaque()));
    public static final Block LIME_BAR_CHAIR = registerBlock("lime_bar_chair",
            new BarChairBlock(AbstractBlock.Settings.copy(LIME_WOOL).nonOpaque()));
    public static final Block GREEN_BAR_CHAIR = registerBlock("green_bar_chair",
            new BarChairBlock(AbstractBlock.Settings.copy(GREEN_WOOL).nonOpaque()));
    public static final Block CYAN_BAR_CHAIR = registerBlock("cyan_bar_chair",
            new BarChairBlock(AbstractBlock.Settings.copy(CYAN_WOOL).nonOpaque()));
    public static final Block LIGHT_BLUE_BAR_CHAIR = registerBlock("light_blue_bar_chair",
            new BarChairBlock(AbstractBlock.Settings.copy(LIGHT_BLUE_WOOL).nonOpaque()));
    public static final Block BLUE_BAR_CHAIR = registerBlock("blue_bar_chair",
            new BarChairBlock(AbstractBlock.Settings.copy(BLUE_WOOL).nonOpaque()));
    public static final Block PURPLE_BAR_CHAIR = registerBlock("purple_bar_chair",
            new BarChairBlock(AbstractBlock.Settings.copy(PURPLE_WOOL).nonOpaque()));
    public static final Block MAGENTA_BAR_CHAIR = registerBlock("magenta_bar_chair",
            new BarChairBlock(AbstractBlock.Settings.copy(MAGENTA_WOOL).nonOpaque()));
    public static final Block PINK_BAR_CHAIR = registerBlock("pink_bar_chair",
            new BarChairBlock(AbstractBlock.Settings.copy(PINK_WOOL).nonOpaque()));
    public static final Block ACACIA_LOG_SEAT = registerBlock("acacia_log_seat",
            new LogSeat(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block BIRCH_LOG_SEAT = registerBlock("birch_log_seat",
            new LogSeat(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block CHERRY_LOG_SEAT = registerBlock("cherry_log_seat",
            new LogSeat(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CRIMSON_STEM_SEAT = registerBlock("crimson_stem_seat",
            new LogSeat(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_LOG_SEAT = registerBlock("dark_oak_log_seat",
            new LogSeat(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block JUNGLE_LOG_SEAT = registerBlock("jungle_log_seat",
            new LogSeat(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_LOG_SEAT = registerBlock("mangrove_log_seat",
            new LogSeat(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block OAK_LOG_SEAT = registerBlock("oak_log_seat",
            new LogSeat(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block SPRUCE_LOG_SEAT = registerBlock("spruce_log_seat",
            new LogSeat(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block WARPED_STEM_SEAT = registerBlock("warped_stem_seat",
            new LogSeat(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block ACACIA_PARK_BENCH = registerBlock("acacia_park_bench",
            new ParkBenchBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block BAMBOO_PARK_BENCH = registerBlock("bamboo_park_bench",
            new ParkBenchBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BIRCH_PARK_BENCH = registerBlock("birch_park_bench",
            new ParkBenchBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block CHERRY_PARK_BENCH = registerBlock("cherry_park_bench",
            new ParkBenchBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CRIMSON_PARK_BENCH = registerBlock("crimson_park_bench",
            new ParkBenchBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_PARK_BENCH = registerBlock("dark_oak_park_bench",
            new ParkBenchBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block JUNGLE_PARK_BENCH = registerBlock("jungle_park_bench",
            new ParkBenchBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_PARK_BENCH = registerBlock("mangrove_park_bench",
            new ParkBenchBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block OAK_PARK_BENCH = registerBlock("oak_park_bench",
            new ParkBenchBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block SPRUCE_PARK_BENCH = registerBlock("spruce_park_bench",
            new ParkBenchBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block WARPED_PARK_BENCH = registerBlock("warped_park_bench",
            new ParkBenchBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block ACACIA_BARREL_SEAT = registerBlock("acacia_barrel_seat",
            new BarrelSeatBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block BAMBOO_BARREL_SEAT = registerBlock("bamboo_barrel_seat",
            new BarrelSeatBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BIRCH_BARREL_SEAT = registerBlock("birch_barrel_seat",
            new BarrelSeatBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block CHERRY_BARREL_SEAT = registerBlock("cherry_barrel_seat",
            new BarrelSeatBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CRIMSON_BARREL_SEAT = registerBlock("crimson_barrel_seat",
            new BarrelSeatBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_BARREL_SEAT = registerBlock("dark_oak_barrel_seat",
            new BarrelSeatBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block JUNGLE_BARREL_SEAT = registerBlock("jungle_barrel_seat",
            new BarrelSeatBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_BARREL_SEAT = registerBlock("mangrove_barrel_seat",
            new BarrelSeatBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block OAK_BARREL_SEAT = registerBlock("oak_barrel_seat",
            new BarrelSeatBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block SPRUCE_BARREL_SEAT = registerBlock("spruce_barrel_seat",
            new BarrelSeatBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block WARPED_BARREL_SEAT = registerBlock("warped_barrel_seat",
            new BarrelSeatBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));
    public static final Block CARPENTERS_WORKBENCH = registerBlock("carpenters_workbench", new CarpentersWorkbenchBlock(AbstractBlock.Settings.create()
            .mapColor(MapColor.OAK_TAN)
            .instrument(Instrument.BASS)
            .strength(2.5f)
            .sounds(BlockSoundGroup.WOOD)
            .burnable()));
    public static final Block ACACIA_GLASS_DOOR = registerBlock("acacia_glass_door", new DoorBlock(AbstractBlock.Settings.create()
                        .mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                        .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_GLASS_DOOR = registerBlock("bamboo_glass_door", new DoorBlock(AbstractBlock.Settings.create()
                        .mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                        .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_GLASS_DOOR = registerBlock("birch_glass_door", new DoorBlock(AbstractBlock.Settings.create()
                        .mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                        .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_GLASS_DOOR = registerBlock("cherry_glass_door", new DoorBlock(AbstractBlock.Settings.create()
                        .mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                        .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_GLASS_DOOR = registerBlock("crimson_glass_door", new DoorBlock(AbstractBlock.Settings.create()
                        .mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                        .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_GLASS_DOOR = registerBlock("dark_oak_glass_door", new DoorBlock(AbstractBlock.Settings.create()
                        .mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                        .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_GLASS_DOOR = registerBlock("jungle_glass_door", new DoorBlock(AbstractBlock.Settings.create()
                        .mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                        .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_GLASS_DOOR = registerBlock("mangrove_glass_door", new DoorBlock(AbstractBlock.Settings.create()
                        .mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                        .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_GLASS_DOOR = registerBlock("oak_glass_door", new DoorBlock(AbstractBlock.Settings.create()
                        .mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                        .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_GLASS_DOOR = registerBlock("spruce_glass_door", new DoorBlock(AbstractBlock.Settings.create()
                        .mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                        .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_GLASS_DOOR = registerBlock("warped_glass_door", new DoorBlock(AbstractBlock.Settings.create()
                        .mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                        .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_WHITE_STAINED_GLASS_DOOR = registerBlock("acacia_white_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("acacia_light_gray_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_GRAY_STAINED_GLASS_DOOR = registerBlock("acacia_gray_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_BLACK_STAINED_GLASS_DOOR = registerBlock("acacia_black_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_BROWN_STAINED_GLASS_DOOR = registerBlock("acacia_brown_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_RED_STAINED_GLASS_DOOR = registerBlock("acacia_red_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_ORANGE_STAINED_GLASS_DOOR = registerBlock("acacia_orange_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_YELLOW_STAINED_GLASS_DOOR = registerBlock("acacia_yellow_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_LIME_STAINED_GLASS_DOOR = registerBlock("acacia_lime_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_GREEN_STAINED_GLASS_DOOR = registerBlock("acacia_green_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_CYAN_STAINED_GLASS_DOOR = registerBlock("acacia_cyan_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("acacia_light_blue_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_BLUE_STAINED_GLASS_DOOR = registerBlock("acacia_blue_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_PURPLE_STAINED_GLASS_DOOR = registerBlock("acacia_purple_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_MAGENTA_STAINED_GLASS_DOOR = registerBlock("acacia_magenta_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_PINK_STAINED_GLASS_DOOR = registerBlock("acacia_pink_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_WHITE_STAINED_GLASS_DOOR = registerBlock("bamboo_white_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("bamboo_light_gray_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_GRAY_STAINED_GLASS_DOOR = registerBlock("bamboo_gray_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_BLACK_STAINED_GLASS_DOOR = registerBlock("bamboo_black_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_BROWN_STAINED_GLASS_DOOR = registerBlock("bamboo_brown_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_RED_STAINED_GLASS_DOOR = registerBlock("bamboo_red_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_ORANGE_STAINED_GLASS_DOOR = registerBlock("bamboo_orange_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_YELLOW_STAINED_GLASS_DOOR = registerBlock("bamboo_yellow_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_LIME_STAINED_GLASS_DOOR = registerBlock("bamboo_lime_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_GREEN_STAINED_GLASS_DOOR = registerBlock("bamboo_green_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_CYAN_STAINED_GLASS_DOOR = registerBlock("bamboo_cyan_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("bamboo_light_blue_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_BLUE_STAINED_GLASS_DOOR = registerBlock("bamboo_blue_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_PURPLE_STAINED_GLASS_DOOR = registerBlock("bamboo_purple_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_MAGENTA_STAINED_GLASS_DOOR = registerBlock("bamboo_magenta_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_PINK_STAINED_GLASS_DOOR = registerBlock("bamboo_pink_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_WHITE_STAINED_GLASS_DOOR = registerBlock("birch_white_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("birch_light_gray_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_GRAY_STAINED_GLASS_DOOR = registerBlock("birch_gray_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_BLACK_STAINED_GLASS_DOOR = registerBlock("birch_black_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_BROWN_STAINED_GLASS_DOOR = registerBlock("birch_brown_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_RED_STAINED_GLASS_DOOR = registerBlock("birch_red_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_ORANGE_STAINED_GLASS_DOOR = registerBlock("birch_orange_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_YELLOW_STAINED_GLASS_DOOR = registerBlock("birch_yellow_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_LIME_STAINED_GLASS_DOOR = registerBlock("birch_lime_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_GREEN_STAINED_GLASS_DOOR = registerBlock("birch_green_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_CYAN_STAINED_GLASS_DOOR = registerBlock("birch_cyan_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("birch_light_blue_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_BLUE_STAINED_GLASS_DOOR = registerBlock("birch_blue_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_PURPLE_STAINED_GLASS_DOOR = registerBlock("birch_purple_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_MAGENTA_STAINED_GLASS_DOOR = registerBlock("birch_magenta_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_PINK_STAINED_GLASS_DOOR = registerBlock("birch_pink_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_WHITE_STAINED_GLASS_DOOR = registerBlock("cherry_white_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("cherry_light_gray_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_GRAY_STAINED_GLASS_DOOR = registerBlock("cherry_gray_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_BLACK_STAINED_GLASS_DOOR = registerBlock("cherry_black_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_BROWN_STAINED_GLASS_DOOR = registerBlock("cherry_brown_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_RED_STAINED_GLASS_DOOR = registerBlock("cherry_red_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_ORANGE_STAINED_GLASS_DOOR = registerBlock("cherry_orange_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_YELLOW_STAINED_GLASS_DOOR = registerBlock("cherry_yellow_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_LIME_STAINED_GLASS_DOOR = registerBlock("cherry_lime_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_GREEN_STAINED_GLASS_DOOR = registerBlock("cherry_green_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_CYAN_STAINED_GLASS_DOOR = registerBlock("cherry_cyan_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("cherry_light_blue_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_BLUE_STAINED_GLASS_DOOR = registerBlock("cherry_blue_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_PURPLE_STAINED_GLASS_DOOR = registerBlock("cherry_purple_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_MAGENTA_STAINED_GLASS_DOOR = registerBlock("cherry_magenta_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_PINK_STAINED_GLASS_DOOR = registerBlock("cherry_pink_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_WHITE_STAINED_GLASS_DOOR = registerBlock("crimson_white_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("crimson_light_gray_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_GRAY_STAINED_GLASS_DOOR = registerBlock("crimson_gray_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_BLACK_STAINED_GLASS_DOOR = registerBlock("crimson_black_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_BROWN_STAINED_GLASS_DOOR = registerBlock("crimson_brown_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_RED_STAINED_GLASS_DOOR = registerBlock("crimson_red_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_ORANGE_STAINED_GLASS_DOOR = registerBlock("crimson_orange_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_YELLOW_STAINED_GLASS_DOOR = registerBlock("crimson_yellow_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_LIME_STAINED_GLASS_DOOR = registerBlock("crimson_lime_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_GREEN_STAINED_GLASS_DOOR = registerBlock("crimson_green_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_CYAN_STAINED_GLASS_DOOR = registerBlock("crimson_cyan_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("crimson_light_blue_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_BLUE_STAINED_GLASS_DOOR = registerBlock("crimson_blue_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_PURPLE_STAINED_GLASS_DOOR = registerBlock("crimson_purple_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_MAGENTA_STAINED_GLASS_DOOR = registerBlock("crimson_magenta_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_PINK_STAINED_GLASS_DOOR = registerBlock("crimson_pink_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_WHITE_STAINED_GLASS_DOOR = registerBlock("dark_oak_white_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("dark_oak_light_gray_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_GRAY_STAINED_GLASS_DOOR = registerBlock("dark_oak_gray_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_BLACK_STAINED_GLASS_DOOR = registerBlock("dark_oak_black_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_BROWN_STAINED_GLASS_DOOR = registerBlock("dark_oak_brown_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_RED_STAINED_GLASS_DOOR = registerBlock("dark_oak_red_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_ORANGE_STAINED_GLASS_DOOR = registerBlock("dark_oak_orange_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_YELLOW_STAINED_GLASS_DOOR = registerBlock("dark_oak_yellow_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_LIME_STAINED_GLASS_DOOR = registerBlock("dark_oak_lime_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_GREEN_STAINED_GLASS_DOOR = registerBlock("dark_oak_green_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_CYAN_STAINED_GLASS_DOOR = registerBlock("dark_oak_cyan_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("dark_oak_light_blue_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_BLUE_STAINED_GLASS_DOOR = registerBlock("dark_oak_blue_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_PURPLE_STAINED_GLASS_DOOR = registerBlock("dark_oak_purple_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_MAGENTA_STAINED_GLASS_DOOR = registerBlock("dark_oak_magenta_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_PINK_STAINED_GLASS_DOOR = registerBlock("dark_oak_pink_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_WHITE_STAINED_GLASS_DOOR = registerBlock("jungle_white_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("jungle_light_gray_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_GRAY_STAINED_GLASS_DOOR = registerBlock("jungle_gray_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_BLACK_STAINED_GLASS_DOOR = registerBlock("jungle_black_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_BROWN_STAINED_GLASS_DOOR = registerBlock("jungle_brown_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_RED_STAINED_GLASS_DOOR = registerBlock("jungle_red_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_ORANGE_STAINED_GLASS_DOOR = registerBlock("jungle_orange_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_YELLOW_STAINED_GLASS_DOOR = registerBlock("jungle_yellow_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_LIME_STAINED_GLASS_DOOR = registerBlock("jungle_lime_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_GREEN_STAINED_GLASS_DOOR = registerBlock("jungle_green_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_CYAN_STAINED_GLASS_DOOR = registerBlock("jungle_cyan_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("jungle_light_blue_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_BLUE_STAINED_GLASS_DOOR = registerBlock("jungle_blue_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_PURPLE_STAINED_GLASS_DOOR = registerBlock("jungle_purple_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_MAGENTA_STAINED_GLASS_DOOR = registerBlock("jungle_magenta_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_PINK_STAINED_GLASS_DOOR = registerBlock("jungle_pink_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_WHITE_STAINED_GLASS_DOOR = registerBlock("mangrove_white_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("mangrove_light_gray_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_GRAY_STAINED_GLASS_DOOR = registerBlock("mangrove_gray_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_BLACK_STAINED_GLASS_DOOR = registerBlock("mangrove_black_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_BROWN_STAINED_GLASS_DOOR = registerBlock("mangrove_brown_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_RED_STAINED_GLASS_DOOR = registerBlock("mangrove_red_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_ORANGE_STAINED_GLASS_DOOR = registerBlock("mangrove_orange_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_YELLOW_STAINED_GLASS_DOOR = registerBlock("mangrove_yellow_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_LIME_STAINED_GLASS_DOOR = registerBlock("mangrove_lime_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_GREEN_STAINED_GLASS_DOOR = registerBlock("mangrove_green_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_CYAN_STAINED_GLASS_DOOR = registerBlock("mangrove_cyan_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("mangrove_light_blue_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_BLUE_STAINED_GLASS_DOOR = registerBlock("mangrove_blue_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_PURPLE_STAINED_GLASS_DOOR = registerBlock("mangrove_purple_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_MAGENTA_STAINED_GLASS_DOOR = registerBlock("mangrove_magenta_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_PINK_STAINED_GLASS_DOOR = registerBlock("mangrove_pink_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_WHITE_STAINED_GLASS_DOOR = registerBlock("oak_white_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("oak_light_gray_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_GRAY_STAINED_GLASS_DOOR = registerBlock("oak_gray_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_BLACK_STAINED_GLASS_DOOR = registerBlock("oak_black_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_BROWN_STAINED_GLASS_DOOR = registerBlock("oak_brown_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_RED_STAINED_GLASS_DOOR = registerBlock("oak_red_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_ORANGE_STAINED_GLASS_DOOR = registerBlock("oak_orange_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_YELLOW_STAINED_GLASS_DOOR = registerBlock("oak_yellow_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_LIME_STAINED_GLASS_DOOR = registerBlock("oak_lime_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_GREEN_STAINED_GLASS_DOOR = registerBlock("oak_green_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_CYAN_STAINED_GLASS_DOOR = registerBlock("oak_cyan_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("oak_light_blue_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_BLUE_STAINED_GLASS_DOOR = registerBlock("oak_blue_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_PURPLE_STAINED_GLASS_DOOR = registerBlock("oak_purple_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_MAGENTA_STAINED_GLASS_DOOR = registerBlock("oak_magenta_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_PINK_STAINED_GLASS_DOOR = registerBlock("oak_pink_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_WHITE_STAINED_GLASS_DOOR = registerBlock("spruce_white_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("spruce_light_gray_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_GRAY_STAINED_GLASS_DOOR = registerBlock("spruce_gray_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_BLACK_STAINED_GLASS_DOOR = registerBlock("spruce_black_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_BROWN_STAINED_GLASS_DOOR = registerBlock("spruce_brown_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_RED_STAINED_GLASS_DOOR = registerBlock("spruce_red_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_ORANGE_STAINED_GLASS_DOOR = registerBlock("spruce_orange_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_YELLOW_STAINED_GLASS_DOOR = registerBlock("spruce_yellow_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_LIME_STAINED_GLASS_DOOR = registerBlock("spruce_lime_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_GREEN_STAINED_GLASS_DOOR = registerBlock("spruce_green_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_CYAN_STAINED_GLASS_DOOR = registerBlock("spruce_cyan_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("spruce_light_blue_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_BLUE_STAINED_GLASS_DOOR = registerBlock("spruce_blue_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_PURPLE_STAINED_GLASS_DOOR = registerBlock("spruce_purple_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_MAGENTA_STAINED_GLASS_DOOR = registerBlock("spruce_magenta_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_PINK_STAINED_GLASS_DOOR = registerBlock("spruce_pink_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_WHITE_STAINED_GLASS_DOOR = registerBlock("warped_white_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("warped_light_gray_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_GRAY_STAINED_GLASS_DOOR = registerBlock("warped_gray_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_BLACK_STAINED_GLASS_DOOR = registerBlock("warped_black_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_BROWN_STAINED_GLASS_DOOR = registerBlock("warped_brown_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_RED_STAINED_GLASS_DOOR = registerBlock("warped_red_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_ORANGE_STAINED_GLASS_DOOR = registerBlock("warped_orange_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_YELLOW_STAINED_GLASS_DOOR = registerBlock("warped_yellow_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_LIME_STAINED_GLASS_DOOR = registerBlock("warped_lime_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_GREEN_STAINED_GLASS_DOOR = registerBlock("warped_green_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_CYAN_STAINED_GLASS_DOOR = registerBlock("warped_cyan_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("warped_light_blue_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_BLUE_STAINED_GLASS_DOOR = registerBlock("warped_blue_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_PURPLE_STAINED_GLASS_DOOR = registerBlock("warped_purple_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_MAGENTA_STAINED_GLASS_DOOR = registerBlock("warped_magenta_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_PINK_STAINED_GLASS_DOOR = registerBlock("warped_pink_stained_glass_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_CAMPFIRE = registerBlock("acacia_campfire",
            new CustomCampfireBlock(true, 1, AbstractBlock.Settings.create().mapColor(ACACIA_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()));
    public static final Block BIRCH_CAMPFIRE = registerBlock("birch_campfire",
            new CustomCampfireBlock(true, 1, AbstractBlock.Settings.create().mapColor(BIRCH_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()));
    public static final Block CHERRY_CAMPFIRE = registerBlock("cherry_campfire",
            new CustomCampfireBlock(true, 1, AbstractBlock.Settings.create().mapColor(CHERRY_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()));
    public static final Block CRIMSON_CAMPFIRE = registerBlock("crimson_campfire",
            new CustomCampfireBlock(true, 1, AbstractBlock.Settings.create().mapColor(CRIMSON_STEM.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()));
    public static final Block DARK_OAK_CAMPFIRE = registerBlock("dark_oak_campfire",
            new CustomCampfireBlock(true, 1, AbstractBlock.Settings.create().mapColor(DARK_OAK_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()));
    public static final Block JUNGLE_CAMPFIRE = registerBlock("jungle_campfire",
            new CustomCampfireBlock(true, 1, AbstractBlock.Settings.create().mapColor(JUNGLE_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()));
    public static final Block MANGROVE_CAMPFIRE = registerBlock("mangrove_campfire",
            new CustomCampfireBlock(true, 1, AbstractBlock.Settings.create().mapColor(MANGROVE_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()));
    public static final Block SPRUCE_CAMPFIRE = registerBlock("spruce_campfire",
            new CustomCampfireBlock(true, 1, AbstractBlock.Settings.create().mapColor(SPRUCE_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()));
    public static final Block WARPED_CAMPFIRE = registerBlock("warped_campfire",
            new CustomCampfireBlock(true, 1, AbstractBlock.Settings.create().mapColor(WARPED_STEM.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()));
    public static final Block ACACIA_SOUL_CAMPFIRE = registerBlock("acacia_soul_campfire",
            new CustomCampfireBlock(true, 1, AbstractBlock.Settings.create().mapColor(ACACIA_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()));
    public static final Block BIRCH_SOUL_CAMPFIRE = registerBlock("birch_soul_campfire",
            new CustomCampfireBlock(true, 1, AbstractBlock.Settings.create().mapColor(BIRCH_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()));
    public static final Block CHERRY_SOUL_CAMPFIRE = registerBlock("cherry_soul_campfire",
            new CustomCampfireBlock(true, 1, AbstractBlock.Settings.create().mapColor(CHERRY_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()));
    public static final Block CRIMSON_SOUL_CAMPFIRE = registerBlock("crimson_soul_campfire",
            new CustomCampfireBlock(true, 1, AbstractBlock.Settings.create().mapColor(CRIMSON_STEM.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()));
    public static final Block DARK_OAK_SOUL_CAMPFIRE = registerBlock("dark_oak_soul_campfire",
            new CustomCampfireBlock(true, 1, AbstractBlock.Settings.create().mapColor(DARK_OAK_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()));
    public static final Block JUNGLE_SOUL_CAMPFIRE = registerBlock("jungle_soul_campfire",
            new CustomCampfireBlock(true, 1, AbstractBlock.Settings.create().mapColor(JUNGLE_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()));
    public static final Block MANGROVE_SOUL_CAMPFIRE = registerBlock("mangrove_soul_campfire",
            new CustomCampfireBlock(true, 1, AbstractBlock.Settings.create().mapColor(MANGROVE_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()));
    public static final Block SPRUCE_SOUL_CAMPFIRE = registerBlock("spruce_soul_campfire",
            new CustomCampfireBlock(true, 1, AbstractBlock.Settings.create().mapColor(SPRUCE_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()));
    public static final Block WARPED_SOUL_CAMPFIRE = registerBlock("warped_soul_campfire",
            new CustomCampfireBlock(true, 1, AbstractBlock.Settings.create().mapColor(WARPED_STEM.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()));
    public static final Block ACACIA_COFFEE_TABLE = registerBlock("acacia_coffee_table",
            new CoffeeTableBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()));
    public static final Block BAMBOO_COFFEE_TABLE = registerBlock("bamboo_coffee_table",
            new CoffeeTableBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()));
    public static final Block BIRCH_COFFEE_TABLE = registerBlock("birch_coffee_table",
            new CoffeeTableBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()));
    public static final Block CHERRY_COFFEE_TABLE = registerBlock("cherry_coffee_table",
            new CoffeeTableBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()));
    public static final Block CRIMSON_COFFEE_TABLE = registerBlock("crimson_coffee_table",
            new CoffeeTableBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()));
    public static final Block DARK_OAK_COFFEE_TABLE = registerBlock("dark_oak_coffee_table",
            new CoffeeTableBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()));
    public static final Block JUNGLE_COFFEE_TABLE = registerBlock("jungle_coffee_table",
            new CoffeeTableBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()));
    public static final Block MANGROVE_COFFEE_TABLE = registerBlock("mangrove_coffee_table",
            new CoffeeTableBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()));
    public static final Block OAK_COFFEE_TABLE = registerBlock("oak_coffee_table",
            new CoffeeTableBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()));
    public static final Block SPRUCE_COFFEE_TABLE = registerBlock("spruce_coffee_table",
            new CoffeeTableBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()));
    public static final Block WARPED_COFFEE_TABLE = registerBlock("warped_coffee_table",
            new CoffeeTableBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()));

    @SafeVarargs
    private static Block registerBlock(String path, Block block, RegistryKey<ItemGroup>... itemGroups) {
        Block registeredBlock = Registry.register(Registries.BLOCK, new Identifier(MOD_ID, path), block);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, path), new BlockItem(block, new Item.Settings()));

        Arrays.stream(itemGroups).forEach(itemGroup -> ItemGroupEvents.modifyEntriesEvent(itemGroup)
                .register(content -> content.add(block)));

        return registeredBlock;
    }

    private static Block registerBlock(String path, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(MOD_ID, path), block);
    }
}
