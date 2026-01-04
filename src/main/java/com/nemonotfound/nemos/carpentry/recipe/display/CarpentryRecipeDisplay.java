package com.nemonotfound.nemos.carpentry.recipe.display;

import com.nemonotfound.nemos.carpentry.recipe.CarpentryRecipe;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.display.SlotDisplay;

import java.util.List;
import java.util.Optional;

public record CarpentryRecipeDisplay(SlotDisplay optionDisplay, Optional<RecipeHolder<CarpentryRecipe>> recipe) {

    public static StreamCodec<RegistryFriendlyByteBuf, CarpentryRecipeDisplay> codec() {
        return StreamCodec.composite(SlotDisplay.STREAM_CODEC,
                CarpentryRecipeDisplay::optionDisplay, display -> new CarpentryRecipeDisplay(display, Optional.empty()));
    }

    public record GroupEntry(List<Ingredient> ingredients, List<Integer> inputCounts, CarpentryRecipeDisplay recipe) {

        public static StreamCodec<RegistryFriendlyByteBuf, GroupEntry> codec() {
            return StreamCodec.composite(
                    Ingredient.CONTENTS_STREAM_CODEC.apply(ByteBufCodecs.list()),
                    GroupEntry::ingredients,
                    ByteBufCodecs.INT.apply(ByteBufCodecs.list()),
                    GroupEntry::inputCounts,
                    CarpentryRecipeDisplay.codec(),
                    GroupEntry::recipe,
                    GroupEntry::new
            );
        }
    }

    public record Grouping(List<GroupEntry> entries) {

        public static Grouping empty() {
            return new Grouping(List.of());
        }

        public static StreamCodec<RegistryFriendlyByteBuf, Grouping> codec() {
            return StreamCodec.composite(
                    GroupEntry.codec().apply(ByteBufCodecs.list()),
                    Grouping::entries, Grouping::new
            );
        }

        public boolean contains(ItemStack stack) {
            return this.entries.stream().anyMatch(entry -> entry.ingredients.get(0).test(stack));
        }

        public Grouping filter(ItemStack stack) {
            return new Grouping(this.entries.stream().filter(entry -> entry.ingredients.get(0).test(stack)).toList());
        }

        public boolean isEmpty() {
            return this.entries.isEmpty();
        }

        public int size() {
            return this.entries.size();
        }
    }
}
