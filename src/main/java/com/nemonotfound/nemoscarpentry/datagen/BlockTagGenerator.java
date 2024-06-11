package com.nemonotfound.nemoscarpentry.datagen;

import com.nemonotfound.nemoscarpentry.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {

    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.ACACIA_BARREL_SEAT)
                .add(ModBlocks.BAMBOO_BARREL_SEAT)
                .add(ModBlocks.BIRCH_BARREL_SEAT)
                .add(ModBlocks.CHERRY_BARREL_SEAT)
                .add(ModBlocks.CRIMSON_BARREL_SEAT)
                .add(ModBlocks.DARK_OAK_BARREL_SEAT)
                .add(ModBlocks.JUNGLE_BARREL_SEAT)
                .add(ModBlocks.MANGROVE_BARREL_SEAT)
                .add(ModBlocks.OAK_BARREL_SEAT)
                .add(ModBlocks.SPRUCE_BARREL_SEAT)
                .add(ModBlocks.WARPED_BARREL_SEAT)
                .add(ModBlocks.ACACIA_LADDER)
                .add(ModBlocks.BAMBOO_LADDER)
                .add(ModBlocks.BIRCH_LADDER)
                .add(ModBlocks.CHERRY_LADDER)
                .add(ModBlocks.CRIMSON_LADDER)
                .add(ModBlocks.DARK_OAK_LADDER)
                .add(ModBlocks.JUNGLE_LADDER)
                .add(ModBlocks.MANGROVE_LADDER)
                .add(ModBlocks.SPRUCE_LADDER)
                .add(ModBlocks.WARPED_LADDER)
                .add(ModBlocks.ACACIA_TABLE_THE_CLASSIC)
                .add(ModBlocks.BAMBOO_TABLE_THE_CLASSIC)
                .add(ModBlocks.BIRCH_TABLE_THE_CLASSIC)
                .add(ModBlocks.CHERRY_TABLE_THE_CLASSIC)
                .add(ModBlocks.CRIMSON_TABLE_THE_CLASSIC)
                .add(ModBlocks.DARK_OAK_TABLE_THE_CLASSIC)
                .add(ModBlocks.JUNGLE_TABLE_THE_CLASSIC)
                .add(ModBlocks.MANGROVE_TABLE_THE_CLASSIC)
                .add(ModBlocks.OAK_TABLE_THE_CLASSIC)
                .add(ModBlocks.SPRUCE_TABLE_THE_CLASSIC)
                .add(ModBlocks.WARPED_TABLE_THE_CLASSIC)
                .add(ModBlocks.ACACIA_CHAIR)
                .add(ModBlocks.BAMBOO_CHAIR)
                .add(ModBlocks.BIRCH_CHAIR)
                .add(ModBlocks.CHERRY_CHAIR)
                .add(ModBlocks.CRIMSON_CHAIR)
                .add(ModBlocks.DARK_OAK_CHAIR)
                .add(ModBlocks.JUNGLE_CHAIR)
                .add(ModBlocks.MANGROVE_CHAIR)
                .add(ModBlocks.OAK_CHAIR)
                .add(ModBlocks.SPRUCE_CHAIR)
                .add(ModBlocks.WARPED_CHAIR)
                .add(ModBlocks.ACACIA_CHAIR_FELIX)
                .add(ModBlocks.BAMBOO_CHAIR_FELIX)
                .add(ModBlocks.BIRCH_CHAIR_FELIX)
                .add(ModBlocks.CHERRY_CHAIR_FELIX)
                .add(ModBlocks.CRIMSON_CHAIR_FELIX)
                .add(ModBlocks.DARK_OAK_CHAIR_FELIX)
                .add(ModBlocks.JUNGLE_CHAIR_FELIX)
                .add(ModBlocks.MANGROVE_CHAIR_FELIX)
                .add(ModBlocks.OAK_CHAIR_FELIX)
                .add(ModBlocks.SPRUCE_CHAIR_FELIX)
                .add(ModBlocks.WARPED_CHAIR_FELIX)
                .add(ModBlocks.ACACIA_LOG_SEAT)
                .add(ModBlocks.BIRCH_LOG_SEAT)
                .add(ModBlocks.CHERRY_LOG_SEAT)
                .add(ModBlocks.CRIMSON_STEM_SEAT)
                .add(ModBlocks.DARK_OAK_LOG_SEAT)
                .add(ModBlocks.JUNGLE_LOG_SEAT)
                .add(ModBlocks.MANGROVE_LOG_SEAT)
                .add(ModBlocks.OAK_LOG_SEAT)
                .add(ModBlocks.SPRUCE_LOG_SEAT)
                .add(ModBlocks.WARPED_STEM_SEAT)
                .add(ModBlocks.ACACIA_PARK_BENCH)
                .add(ModBlocks.BAMBOO_PARK_BENCH)
                .add(ModBlocks.BIRCH_PARK_BENCH)
                .add(ModBlocks.CHERRY_PARK_BENCH)
                .add(ModBlocks.CRIMSON_PARK_BENCH)
                .add(ModBlocks.DARK_OAK_PARK_BENCH)
                .add(ModBlocks.JUNGLE_PARK_BENCH)
                .add(ModBlocks.MANGROVE_PARK_BENCH)
                .add(ModBlocks.OAK_PARK_BENCH)
                .add(ModBlocks.SPRUCE_PARK_BENCH)
                .add(ModBlocks.WARPED_PARK_BENCH)
                .add(ModBlocks.CARPENTERS_WORKBENCH)
                .add(ModBlocks.ACACIA_GLASS_DOOR)
                .add(ModBlocks.BAMBOO_GLASS_DOOR)
                .add(ModBlocks.BIRCH_GLASS_DOOR)
                .add(ModBlocks.CHERRY_GLASS_DOOR)
                .add(ModBlocks.CRIMSON_GLASS_DOOR)
                .add(ModBlocks.DARK_OAK_GLASS_DOOR)
                .add(ModBlocks.JUNGLE_GLASS_DOOR)
                .add(ModBlocks.MANGROVE_GLASS_DOOR)
                .add(ModBlocks.OAK_GLASS_DOOR)
                .add(ModBlocks.SPRUCE_GLASS_DOOR)
                .add(ModBlocks.WARPED_GLASS_DOOR)
                .add(ModBlocks.ACACIA_WHITE_STAINED_GLASS_DOOR)
                .add(ModBlocks.BAMBOO_WHITE_STAINED_GLASS_DOOR)
                .add(ModBlocks.BIRCH_WHITE_STAINED_GLASS_DOOR)
                .add(ModBlocks.CHERRY_WHITE_STAINED_GLASS_DOOR)
                .add(ModBlocks.CRIMSON_WHITE_STAINED_GLASS_DOOR)
                .add(ModBlocks.DARK_OAK_WHITE_STAINED_GLASS_DOOR)
                .add(ModBlocks.JUNGLE_WHITE_STAINED_GLASS_DOOR)
                .add(ModBlocks.MANGROVE_WHITE_STAINED_GLASS_DOOR)
                .add(ModBlocks.OAK_WHITE_STAINED_GLASS_DOOR)
                .add(ModBlocks.SPRUCE_WHITE_STAINED_GLASS_DOOR)
                .add(ModBlocks.WARPED_WHITE_STAINED_GLASS_DOOR)
                .add(ModBlocks.ACACIA_LIGHT_GRAY_STAINED_GLASS_DOOR)
                .add(ModBlocks.BAMBOO_LIGHT_GRAY_STAINED_GLASS_DOOR)
                .add(ModBlocks.BIRCH_LIGHT_GRAY_STAINED_GLASS_DOOR)
                .add(ModBlocks.CHERRY_LIGHT_GRAY_STAINED_GLASS_DOOR)
                .add(ModBlocks.CRIMSON_LIGHT_GRAY_STAINED_GLASS_DOOR)
                .add(ModBlocks.DARK_OAK_LIGHT_GRAY_STAINED_GLASS_DOOR)
                .add(ModBlocks.JUNGLE_LIGHT_GRAY_STAINED_GLASS_DOOR)
                .add(ModBlocks.MANGROVE_LIGHT_GRAY_STAINED_GLASS_DOOR)
                .add(ModBlocks.OAK_LIGHT_GRAY_STAINED_GLASS_DOOR)
                .add(ModBlocks.SPRUCE_LIGHT_GRAY_STAINED_GLASS_DOOR)
                .add(ModBlocks.WARPED_LIGHT_GRAY_STAINED_GLASS_DOOR)
                .add(ModBlocks.ACACIA_GRAY_STAINED_GLASS_DOOR)
                .add(ModBlocks.BAMBOO_GRAY_STAINED_GLASS_DOOR)
                .add(ModBlocks.BIRCH_GRAY_STAINED_GLASS_DOOR)
                .add(ModBlocks.CHERRY_GRAY_STAINED_GLASS_DOOR)
                .add(ModBlocks.CRIMSON_GRAY_STAINED_GLASS_DOOR)
                .add(ModBlocks.DARK_OAK_GRAY_STAINED_GLASS_DOOR)
                .add(ModBlocks.JUNGLE_GRAY_STAINED_GLASS_DOOR)
                .add(ModBlocks.MANGROVE_GRAY_STAINED_GLASS_DOOR)
                .add(ModBlocks.OAK_GRAY_STAINED_GLASS_DOOR)
                .add(ModBlocks.SPRUCE_GRAY_STAINED_GLASS_DOOR)
                .add(ModBlocks.WARPED_GRAY_STAINED_GLASS_DOOR)
                .add(ModBlocks.ACACIA_BLACK_STAINED_GLASS_DOOR)
                .add(ModBlocks.BAMBOO_BLACK_STAINED_GLASS_DOOR)
                .add(ModBlocks.BIRCH_BLACK_STAINED_GLASS_DOOR)
                .add(ModBlocks.CHERRY_BLACK_STAINED_GLASS_DOOR)
                .add(ModBlocks.CRIMSON_BLACK_STAINED_GLASS_DOOR)
                .add(ModBlocks.DARK_OAK_BLACK_STAINED_GLASS_DOOR)
                .add(ModBlocks.JUNGLE_BLACK_STAINED_GLASS_DOOR)
                .add(ModBlocks.MANGROVE_BLACK_STAINED_GLASS_DOOR)
                .add(ModBlocks.OAK_BLACK_STAINED_GLASS_DOOR)
                .add(ModBlocks.SPRUCE_BLACK_STAINED_GLASS_DOOR)
                .add(ModBlocks.WARPED_BLACK_STAINED_GLASS_DOOR)
                .add(ModBlocks.ACACIA_BROWN_STAINED_GLASS_DOOR)
                .add(ModBlocks.BAMBOO_BROWN_STAINED_GLASS_DOOR)
                .add(ModBlocks.BIRCH_BROWN_STAINED_GLASS_DOOR)
                .add(ModBlocks.CHERRY_BROWN_STAINED_GLASS_DOOR)
                .add(ModBlocks.CRIMSON_BROWN_STAINED_GLASS_DOOR)
                .add(ModBlocks.DARK_OAK_BROWN_STAINED_GLASS_DOOR)
                .add(ModBlocks.JUNGLE_BROWN_STAINED_GLASS_DOOR)
                .add(ModBlocks.MANGROVE_BROWN_STAINED_GLASS_DOOR)
                .add(ModBlocks.OAK_BROWN_STAINED_GLASS_DOOR)
                .add(ModBlocks.SPRUCE_BROWN_STAINED_GLASS_DOOR)
                .add(ModBlocks.WARPED_BROWN_STAINED_GLASS_DOOR)
                .add(ModBlocks.ACACIA_RED_STAINED_GLASS_DOOR)
                .add(ModBlocks.BAMBOO_RED_STAINED_GLASS_DOOR)
                .add(ModBlocks.BIRCH_RED_STAINED_GLASS_DOOR)
                .add(ModBlocks.CHERRY_RED_STAINED_GLASS_DOOR)
                .add(ModBlocks.CRIMSON_RED_STAINED_GLASS_DOOR)
                .add(ModBlocks.DARK_OAK_RED_STAINED_GLASS_DOOR)
                .add(ModBlocks.JUNGLE_RED_STAINED_GLASS_DOOR)
                .add(ModBlocks.MANGROVE_RED_STAINED_GLASS_DOOR)
                .add(ModBlocks.OAK_RED_STAINED_GLASS_DOOR)
                .add(ModBlocks.SPRUCE_RED_STAINED_GLASS_DOOR)
                .add(ModBlocks.WARPED_RED_STAINED_GLASS_DOOR)
                .add(ModBlocks.ACACIA_ORANGE_STAINED_GLASS_DOOR)
                .add(ModBlocks.BAMBOO_ORANGE_STAINED_GLASS_DOOR)
                .add(ModBlocks.BIRCH_ORANGE_STAINED_GLASS_DOOR)
                .add(ModBlocks.CHERRY_ORANGE_STAINED_GLASS_DOOR)
                .add(ModBlocks.CRIMSON_ORANGE_STAINED_GLASS_DOOR)
                .add(ModBlocks.DARK_OAK_ORANGE_STAINED_GLASS_DOOR)
                .add(ModBlocks.JUNGLE_ORANGE_STAINED_GLASS_DOOR)
                .add(ModBlocks.MANGROVE_ORANGE_STAINED_GLASS_DOOR)
                .add(ModBlocks.OAK_ORANGE_STAINED_GLASS_DOOR)
                .add(ModBlocks.SPRUCE_ORANGE_STAINED_GLASS_DOOR)
                .add(ModBlocks.WARPED_ORANGE_STAINED_GLASS_DOOR)
                .add(ModBlocks.ACACIA_YELLOW_STAINED_GLASS_DOOR)
                .add(ModBlocks.BAMBOO_YELLOW_STAINED_GLASS_DOOR)
                .add(ModBlocks.BIRCH_YELLOW_STAINED_GLASS_DOOR)
                .add(ModBlocks.CHERRY_YELLOW_STAINED_GLASS_DOOR)
                .add(ModBlocks.CRIMSON_YELLOW_STAINED_GLASS_DOOR)
                .add(ModBlocks.DARK_OAK_YELLOW_STAINED_GLASS_DOOR)
                .add(ModBlocks.JUNGLE_YELLOW_STAINED_GLASS_DOOR)
                .add(ModBlocks.MANGROVE_YELLOW_STAINED_GLASS_DOOR)
                .add(ModBlocks.OAK_YELLOW_STAINED_GLASS_DOOR)
                .add(ModBlocks.SPRUCE_YELLOW_STAINED_GLASS_DOOR)
                .add(ModBlocks.WARPED_YELLOW_STAINED_GLASS_DOOR)
                .add(ModBlocks.ACACIA_LIME_STAINED_GLASS_DOOR)
                .add(ModBlocks.BAMBOO_LIME_STAINED_GLASS_DOOR)
                .add(ModBlocks.BIRCH_LIME_STAINED_GLASS_DOOR)
                .add(ModBlocks.CHERRY_LIME_STAINED_GLASS_DOOR)
                .add(ModBlocks.CRIMSON_LIME_STAINED_GLASS_DOOR)
                .add(ModBlocks.DARK_OAK_LIME_STAINED_GLASS_DOOR)
                .add(ModBlocks.JUNGLE_LIME_STAINED_GLASS_DOOR)
                .add(ModBlocks.MANGROVE_LIME_STAINED_GLASS_DOOR)
                .add(ModBlocks.OAK_LIME_STAINED_GLASS_DOOR)
                .add(ModBlocks.SPRUCE_LIME_STAINED_GLASS_DOOR)
                .add(ModBlocks.WARPED_LIME_STAINED_GLASS_DOOR)
                .add(ModBlocks.ACACIA_GREEN_STAINED_GLASS_DOOR)
                .add(ModBlocks.BAMBOO_GREEN_STAINED_GLASS_DOOR)
                .add(ModBlocks.BIRCH_GREEN_STAINED_GLASS_DOOR)
                .add(ModBlocks.CHERRY_GREEN_STAINED_GLASS_DOOR)
                .add(ModBlocks.CRIMSON_GREEN_STAINED_GLASS_DOOR)
                .add(ModBlocks.DARK_OAK_GREEN_STAINED_GLASS_DOOR)
                .add(ModBlocks.JUNGLE_GREEN_STAINED_GLASS_DOOR)
                .add(ModBlocks.MANGROVE_GREEN_STAINED_GLASS_DOOR)
                .add(ModBlocks.OAK_GREEN_STAINED_GLASS_DOOR)
                .add(ModBlocks.SPRUCE_GREEN_STAINED_GLASS_DOOR)
                .add(ModBlocks.WARPED_GREEN_STAINED_GLASS_DOOR)
                .add(ModBlocks.ACACIA_CYAN_STAINED_GLASS_DOOR)
                .add(ModBlocks.BAMBOO_CYAN_STAINED_GLASS_DOOR)
                .add(ModBlocks.BIRCH_CYAN_STAINED_GLASS_DOOR)
                .add(ModBlocks.CHERRY_CYAN_STAINED_GLASS_DOOR)
                .add(ModBlocks.CRIMSON_CYAN_STAINED_GLASS_DOOR)
                .add(ModBlocks.DARK_OAK_CYAN_STAINED_GLASS_DOOR)
                .add(ModBlocks.JUNGLE_CYAN_STAINED_GLASS_DOOR)
                .add(ModBlocks.MANGROVE_CYAN_STAINED_GLASS_DOOR)
                .add(ModBlocks.OAK_CYAN_STAINED_GLASS_DOOR)
                .add(ModBlocks.SPRUCE_CYAN_STAINED_GLASS_DOOR)
                .add(ModBlocks.WARPED_CYAN_STAINED_GLASS_DOOR)
                .add(ModBlocks.ACACIA_LIGHT_BLUE_STAINED_GLASS_DOOR)
                .add(ModBlocks.BAMBOO_LIGHT_BLUE_STAINED_GLASS_DOOR)
                .add(ModBlocks.BIRCH_LIGHT_BLUE_STAINED_GLASS_DOOR)
                .add(ModBlocks.CHERRY_LIGHT_BLUE_STAINED_GLASS_DOOR)
                .add(ModBlocks.CRIMSON_LIGHT_BLUE_STAINED_GLASS_DOOR)
                .add(ModBlocks.DARK_OAK_LIGHT_BLUE_STAINED_GLASS_DOOR)
                .add(ModBlocks.JUNGLE_LIGHT_BLUE_STAINED_GLASS_DOOR)
                .add(ModBlocks.MANGROVE_LIGHT_BLUE_STAINED_GLASS_DOOR)
                .add(ModBlocks.OAK_LIGHT_BLUE_STAINED_GLASS_DOOR)
                .add(ModBlocks.SPRUCE_LIGHT_BLUE_STAINED_GLASS_DOOR)
                .add(ModBlocks.WARPED_LIGHT_BLUE_STAINED_GLASS_DOOR)
                .add(ModBlocks.ACACIA_BLUE_STAINED_GLASS_DOOR)
                .add(ModBlocks.BAMBOO_BLUE_STAINED_GLASS_DOOR)
                .add(ModBlocks.BIRCH_BLUE_STAINED_GLASS_DOOR)
                .add(ModBlocks.CHERRY_BLUE_STAINED_GLASS_DOOR)
                .add(ModBlocks.CRIMSON_BLUE_STAINED_GLASS_DOOR)
                .add(ModBlocks.DARK_OAK_BLUE_STAINED_GLASS_DOOR)
                .add(ModBlocks.JUNGLE_BLUE_STAINED_GLASS_DOOR)
                .add(ModBlocks.MANGROVE_BLUE_STAINED_GLASS_DOOR)
                .add(ModBlocks.OAK_BLUE_STAINED_GLASS_DOOR)
                .add(ModBlocks.SPRUCE_BLUE_STAINED_GLASS_DOOR)
                .add(ModBlocks.WARPED_BLUE_STAINED_GLASS_DOOR)
                .add(ModBlocks.ACACIA_PURPLE_STAINED_GLASS_DOOR)
                .add(ModBlocks.BAMBOO_PURPLE_STAINED_GLASS_DOOR)
                .add(ModBlocks.BIRCH_PURPLE_STAINED_GLASS_DOOR)
                .add(ModBlocks.CHERRY_PURPLE_STAINED_GLASS_DOOR)
                .add(ModBlocks.CRIMSON_PURPLE_STAINED_GLASS_DOOR)
                .add(ModBlocks.DARK_OAK_PURPLE_STAINED_GLASS_DOOR)
                .add(ModBlocks.JUNGLE_PURPLE_STAINED_GLASS_DOOR)
                .add(ModBlocks.MANGROVE_PURPLE_STAINED_GLASS_DOOR)
                .add(ModBlocks.OAK_PURPLE_STAINED_GLASS_DOOR)
                .add(ModBlocks.SPRUCE_PURPLE_STAINED_GLASS_DOOR)
                .add(ModBlocks.WARPED_PURPLE_STAINED_GLASS_DOOR)
                .add(ModBlocks.ACACIA_MAGENTA_STAINED_GLASS_DOOR)
                .add(ModBlocks.BAMBOO_MAGENTA_STAINED_GLASS_DOOR)
                .add(ModBlocks.BIRCH_MAGENTA_STAINED_GLASS_DOOR)
                .add(ModBlocks.CHERRY_MAGENTA_STAINED_GLASS_DOOR)
                .add(ModBlocks.CRIMSON_MAGENTA_STAINED_GLASS_DOOR)
                .add(ModBlocks.DARK_OAK_MAGENTA_STAINED_GLASS_DOOR)
                .add(ModBlocks.JUNGLE_MAGENTA_STAINED_GLASS_DOOR)
                .add(ModBlocks.MANGROVE_MAGENTA_STAINED_GLASS_DOOR)
                .add(ModBlocks.OAK_MAGENTA_STAINED_GLASS_DOOR)
                .add(ModBlocks.SPRUCE_MAGENTA_STAINED_GLASS_DOOR)
                .add(ModBlocks.WARPED_MAGENTA_STAINED_GLASS_DOOR)
                .add(ModBlocks.ACACIA_PINK_STAINED_GLASS_DOOR)
                .add(ModBlocks.BAMBOO_PINK_STAINED_GLASS_DOOR)
                .add(ModBlocks.BIRCH_PINK_STAINED_GLASS_DOOR)
                .add(ModBlocks.CHERRY_PINK_STAINED_GLASS_DOOR)
                .add(ModBlocks.CRIMSON_PINK_STAINED_GLASS_DOOR)
                .add(ModBlocks.DARK_OAK_PINK_STAINED_GLASS_DOOR)
                .add(ModBlocks.JUNGLE_PINK_STAINED_GLASS_DOOR)
                .add(ModBlocks.MANGROVE_PINK_STAINED_GLASS_DOOR)
                .add(ModBlocks.OAK_PINK_STAINED_GLASS_DOOR)
                .add(ModBlocks.SPRUCE_PINK_STAINED_GLASS_DOOR)
                .add(ModBlocks.WARPED_PINK_STAINED_GLASS_DOOR)
                .add(ModBlocks.ACACIA_CAMPFIRE)
                .add(ModBlocks.ACACIA_SOUL_CAMPFIRE)
                .add(ModBlocks.BIRCH_CAMPFIRE)
                .add(ModBlocks.BIRCH_SOUL_CAMPFIRE)
                .add(ModBlocks.CHERRY_CAMPFIRE)
                .add(ModBlocks.CHERRY_SOUL_CAMPFIRE)
                .add(ModBlocks.CRIMSON_CAMPFIRE)
                .add(ModBlocks.CRIMSON_SOUL_CAMPFIRE)
                .add(ModBlocks.DARK_OAK_CAMPFIRE)
                .add(ModBlocks.DARK_OAK_SOUL_CAMPFIRE)
                .add(ModBlocks.JUNGLE_CAMPFIRE)
                .add(ModBlocks.JUNGLE_SOUL_CAMPFIRE)
                .add(ModBlocks.MANGROVE_CAMPFIRE)
                .add(ModBlocks.MANGROVE_SOUL_CAMPFIRE)
                .add(ModBlocks.SPRUCE_CAMPFIRE)
                .add(ModBlocks.SPRUCE_SOUL_CAMPFIRE)
                .add(ModBlocks.WARPED_CAMPFIRE)
                .add(ModBlocks.WARPED_SOUL_CAMPFIRE)
                .add(ModBlocks.ACACIA_CHAIR_LUKAS)
                .add(ModBlocks.BAMBOO_CHAIR_LUKAS)
                .add(ModBlocks.BIRCH_CHAIR_LUKAS)
                .add(ModBlocks.CHERRY_CHAIR_LUKAS)
                .add(ModBlocks.CRIMSON_CHAIR_LUKAS)
                .add(ModBlocks.DARK_OAK_CHAIR_LUKAS)
                .add(ModBlocks.JUNGLE_CHAIR_LUKAS)
                .add(ModBlocks.MANGROVE_CHAIR_LUKAS)
                .add(ModBlocks.OAK_CHAIR_LUKAS)
                .add(ModBlocks.SPRUCE_CHAIR_LUKAS)
                .add(ModBlocks.WARPED_CHAIR_LUKAS)
                .add(ModBlocks.ACACIA_CHAIR_LUKAS_NATURAL)
                .add(ModBlocks.BAMBOO_CHAIR_LUKAS_NATURAL)
                .add(ModBlocks.BIRCH_CHAIR_LUKAS_NATURAL)
                .add(ModBlocks.CHERRY_CHAIR_LUKAS_NATURAL)
                .add(ModBlocks.CRIMSON_CHAIR_LUKAS_NATURAL)
                .add(ModBlocks.DARK_OAK_CHAIR_LUKAS_NATURAL)
                .add(ModBlocks.JUNGLE_CHAIR_LUKAS_NATURAL)
                .add(ModBlocks.MANGROVE_CHAIR_LUKAS_NATURAL)
                .add(ModBlocks.OAK_CHAIR_LUKAS_NATURAL)
                .add(ModBlocks.SPRUCE_CHAIR_LUKAS_NATURAL)
                .add(ModBlocks.WARPED_CHAIR_LUKAS_NATURAL)
                .add(ModBlocks.ACACIA_CHAIR_TOMMY)
                .add(ModBlocks.BAMBOO_CHAIR_TOMMY)
                .add(ModBlocks.BIRCH_CHAIR_TOMMY)
                .add(ModBlocks.CHERRY_CHAIR_TOMMY)
                .add(ModBlocks.CRIMSON_CHAIR_TOMMY)
                .add(ModBlocks.DARK_OAK_CHAIR_TOMMY)
                .add(ModBlocks.JUNGLE_CHAIR_TOMMY)
                .add(ModBlocks.MANGROVE_CHAIR_TOMMY)
                .add(ModBlocks.OAK_CHAIR_TOMMY)
                .add(ModBlocks.SPRUCE_CHAIR_TOMMY)
                .add(ModBlocks.WARPED_CHAIR_TOMMY)
                .add(ModBlocks.ACACIA_CHAIR_TOMMY_NATURAL)
                .add(ModBlocks.BAMBOO_CHAIR_TOMMY_NATURAL)
                .add(ModBlocks.BIRCH_CHAIR_TOMMY_NATURAL)
                .add(ModBlocks.CHERRY_CHAIR_TOMMY_NATURAL)
                .add(ModBlocks.CRIMSON_CHAIR_TOMMY_NATURAL)
                .add(ModBlocks.DARK_OAK_CHAIR_TOMMY_NATURAL)
                .add(ModBlocks.JUNGLE_CHAIR_TOMMY_NATURAL)
                .add(ModBlocks.MANGROVE_CHAIR_TOMMY_NATURAL)
                .add(ModBlocks.OAK_CHAIR_TOMMY_NATURAL)
                .add(ModBlocks.SPRUCE_CHAIR_TOMMY_NATURAL)
                .add(ModBlocks.WARPED_CHAIR_TOMMY_NATURAL)
                .add(ModBlocks.ACACIA_COFFEE_TABLE)
                .add(ModBlocks.BAMBOO_COFFEE_TABLE)
                .add(ModBlocks.BIRCH_COFFEE_TABLE)
                .add(ModBlocks.CHERRY_COFFEE_TABLE)
                .add(ModBlocks.CRIMSON_COFFEE_TABLE)
                .add(ModBlocks.DARK_OAK_COFFEE_TABLE)
                .add(ModBlocks.JUNGLE_COFFEE_TABLE)
                .add(ModBlocks.MANGROVE_COFFEE_TABLE)
                .add(ModBlocks.OAK_COFFEE_TABLE)
                .add(ModBlocks.SPRUCE_COFFEE_TABLE)
                .add(ModBlocks.WARPED_COFFEE_TABLE);

        getOrCreateTagBuilder(BlockTags.CLIMBABLE)
                .add(ModBlocks.ACACIA_LADDER)
                .add(ModBlocks.BAMBOO_LADDER)
                .add(ModBlocks.BIRCH_LADDER)
                .add(ModBlocks.BOUND_BAMBOO_LADDER)
                .add(ModBlocks.CHERRY_LADDER)
                .add(ModBlocks.CRIMSON_LADDER)
                .add(ModBlocks.DARK_OAK_LADDER)
                .add(ModBlocks.JUNGLE_LADDER)
                .add(ModBlocks.MANGROVE_LADDER)
                .add(ModBlocks.SPRUCE_LADDER)
                .add(ModBlocks.WARPED_LADDER);

        getOrCreateTagBuilder(BlockTags.CAMPFIRES)
                .add(ModBlocks.ACACIA_CAMPFIRE)
                .add(ModBlocks.ACACIA_SOUL_CAMPFIRE)
                .add(ModBlocks.BIRCH_CAMPFIRE)
                .add(ModBlocks.BIRCH_SOUL_CAMPFIRE)
                .add(ModBlocks.CHERRY_CAMPFIRE)
                .add(ModBlocks.CHERRY_SOUL_CAMPFIRE)
                .add(ModBlocks.CRIMSON_CAMPFIRE)
                .add(ModBlocks.CRIMSON_SOUL_CAMPFIRE)
                .add(ModBlocks.DARK_OAK_CAMPFIRE)
                .add(ModBlocks.DARK_OAK_SOUL_CAMPFIRE)
                .add(ModBlocks.JUNGLE_CAMPFIRE)
                .add(ModBlocks.JUNGLE_SOUL_CAMPFIRE)
                .add(ModBlocks.MANGROVE_CAMPFIRE)
                .add(ModBlocks.MANGROVE_SOUL_CAMPFIRE)
                .add(ModBlocks.SPRUCE_CAMPFIRE)
                .add(ModBlocks.SPRUCE_SOUL_CAMPFIRE)
                .add(ModBlocks.WARPED_CAMPFIRE)
                .add(ModBlocks.WARPED_SOUL_CAMPFIRE);
    }
}
