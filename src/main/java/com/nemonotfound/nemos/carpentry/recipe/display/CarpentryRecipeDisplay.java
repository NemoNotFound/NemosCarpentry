package com.nemonotfound.nemos.carpentry.recipe.display;

import com.nemonotfound.nemos.carpentry.recipe.CarpentryRecipe;
import net.minecraft.item.ItemStack;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.recipe.display.SlotDisplay;

import java.util.List;
import java.util.Optional;

public record CarpentryRecipeDisplay(SlotDisplay optionDisplay, Optional<RecipeEntry<CarpentryRecipe>> recipe) {

    public static PacketCodec<RegistryByteBuf, CarpentryRecipeDisplay> codec() {
        return PacketCodec.tuple(SlotDisplay.PACKET_CODEC,
                CarpentryRecipeDisplay::optionDisplay, display -> new CarpentryRecipeDisplay(display, Optional.empty()));
    }

    public record GroupEntry(List<Ingredient> ingredients, List<Integer> inputCounts, CarpentryRecipeDisplay recipe) {

        public static PacketCodec<RegistryByteBuf, GroupEntry> codec() {
            return PacketCodec.tuple(
                    Ingredient.PACKET_CODEC.collect(PacketCodecs.toList()),
                    GroupEntry::ingredients,
                    PacketCodecs.INTEGER.collect(PacketCodecs.toList()),
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

        public static PacketCodec<RegistryByteBuf, Grouping> codec() {
            return PacketCodec.tuple(
                    GroupEntry.codec().collect(PacketCodecs.toList()),
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
