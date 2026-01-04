package com.nemonotfound.nemos.carpentry.recipe.display;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.crafting.display.RecipeDisplay;
import net.minecraft.world.item.crafting.display.SlotDisplay;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public record CarpentersWorkbenchRecipeDisplay(List<SlotDisplay> ingredients, SlotDisplay result, SlotDisplay craftingStation) implements RecipeDisplay {

    public static final MapCodec<CarpentersWorkbenchRecipeDisplay> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(
                            SlotDisplay.CODEC.listOf().fieldOf("ingredients").forGetter(CarpentersWorkbenchRecipeDisplay::ingredients),
                            SlotDisplay.CODEC.fieldOf("result").forGetter(CarpentersWorkbenchRecipeDisplay::result),
                            SlotDisplay.CODEC.fieldOf("crafting_station").forGetter(CarpentersWorkbenchRecipeDisplay::craftingStation)
                    )
                    .apply(instance, CarpentersWorkbenchRecipeDisplay::new)
    );

    public static final StreamCodec<RegistryFriendlyByteBuf, CarpentersWorkbenchRecipeDisplay> PACKET_CODEC = StreamCodec.composite(
            SlotDisplay.STREAM_CODEC.apply(ByteBufCodecs.list()),
            CarpentersWorkbenchRecipeDisplay::ingredients,
            SlotDisplay.STREAM_CODEC,
            CarpentersWorkbenchRecipeDisplay::result,
            SlotDisplay.STREAM_CODEC,
            CarpentersWorkbenchRecipeDisplay::craftingStation,
            CarpentersWorkbenchRecipeDisplay::new
    );
    public static final Type<@NotNull CarpentersWorkbenchRecipeDisplay> SERIALIZER = new Type<>(CODEC, PACKET_CODEC);

    @Override
    public @NotNull Type<@NotNull CarpentersWorkbenchRecipeDisplay> type() {
        return SERIALIZER;
    }
}
