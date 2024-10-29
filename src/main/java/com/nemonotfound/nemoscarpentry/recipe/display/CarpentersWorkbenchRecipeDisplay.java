package com.nemonotfound.nemoscarpentry.recipe.display;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.recipe.display.RecipeDisplay;
import net.minecraft.recipe.display.SlotDisplay;

import java.util.List;
import java.util.Optional;

public record CarpentersWorkbenchRecipeDisplay(List<SlotDisplay> ingredients, Optional<SlotDisplay> tool, SlotDisplay result, SlotDisplay craftingStation) implements RecipeDisplay {

    public static final MapCodec<CarpentersWorkbenchRecipeDisplay> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(
                            SlotDisplay.CODEC.listOf().fieldOf("ingredients").forGetter(CarpentersWorkbenchRecipeDisplay::ingredients),
                            SlotDisplay.CODEC.optionalFieldOf("ingredients").forGetter(CarpentersWorkbenchRecipeDisplay::tool),
                            SlotDisplay.CODEC.fieldOf("result").forGetter(CarpentersWorkbenchRecipeDisplay::result),
                            SlotDisplay.CODEC.fieldOf("crafting_station").forGetter(CarpentersWorkbenchRecipeDisplay::craftingStation)
                    )
                    .apply(instance, CarpentersWorkbenchRecipeDisplay::new)
    );

    public static final PacketCodec<RegistryByteBuf, CarpentersWorkbenchRecipeDisplay> PACKET_CODEC = PacketCodec.tuple(
            SlotDisplay.PACKET_CODEC.collect(PacketCodecs.toList()),
            CarpentersWorkbenchRecipeDisplay::ingredients,
            PacketCodecs.optional(SlotDisplay.PACKET_CODEC),
            CarpentersWorkbenchRecipeDisplay::tool,
            SlotDisplay.PACKET_CODEC,
            CarpentersWorkbenchRecipeDisplay::result,
            SlotDisplay.PACKET_CODEC,
            CarpentersWorkbenchRecipeDisplay::craftingStation,
            CarpentersWorkbenchRecipeDisplay::new
    );
    public static final Serializer<CarpentersWorkbenchRecipeDisplay> SERIALIZER = new Serializer<>(CODEC, PACKET_CODEC);

    @Override
    public Serializer<CarpentersWorkbenchRecipeDisplay> serializer() {
        return SERIALIZER;
    }
}
