package com.nemonotfound;

import com.nemonotfound.nemoscarpenting.entity.ModEntities;
import com.nemonotfound.nemoscarpenting.item.ModItemGroups;
import com.nemonotfound.nemoscarpenting.recipe.CarpentingRecipe;
import com.nemonotfound.nemoscarpenting.recipe.WoodcutterSerializer;
import com.nemonotfound.nemoscarpenting.recipe.WoodcuttingRecipe;
import com.nemonotfound.nemoscarpenting.screen.CarpentingScreenHandler;
import com.nemonotfound.nemoscarpenting.screen.WoodcutterScreenHandler;
import net.fabricmc.api.ModInitializer;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NemosCarpenting implements ModInitializer {

	//TODO: REFACTOR
	public static final String MOD_ID = "nemos-furniture";
    public static final Logger log = LoggerFactory.getLogger(MOD_ID);
	public static final ScreenHandlerType<WoodcutterScreenHandler> WOODCUTTER_SCREEN_HANDLER =
			ScreenHandlerType.register("woodcutter", WoodcutterScreenHandler::new);
	public static final ScreenHandlerType<CarpentingScreenHandler> CARPENTING_SCREEN_HANDLER =
			ScreenHandlerType.register("carpenting", CarpentingScreenHandler::new);
	public static RecipeType<WoodcuttingRecipe> WOODCUTTING;
	public static RecipeType<CarpentingRecipe> CARPENTING;
	public static WoodcutterSerializer WOODCUTTING_RECIPE_RECIPE_SERIALIZER;

	@Override
	public void onInitialize() {
		log.info("Thank you for using Nemo's Furniture!");
		WOODCUTTING = RecipeType.register("woodcutting");
		CARPENTING = Registry.register(Registries.RECIPE_TYPE, new Identifier(MOD_ID, CarpentingRecipe.Type.ID), CarpentingRecipe.Type.INSTANCE);
		Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(MOD_ID, CarpentingRecipe.Serializer.ID), CarpentingRecipe.Serializer.INSTANCE);
		WOODCUTTING_RECIPE_RECIPE_SERIALIZER = RecipeSerializer.register("woodcutting", new WoodcutterSerializer(WoodcuttingRecipe::new));
		ModItemGroups.registerItemGroups();
		ModEntities.registerEntities();
	}
}