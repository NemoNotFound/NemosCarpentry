package com.nemonotfound;

import com.nemonotfound.nemoscarpenting.entity.ModEntities;
import com.nemonotfound.nemoscarpenting.item.ModItemGroups;
import com.nemonotfound.nemoscarpenting.recipe.CarpentingRecipe;
import com.nemonotfound.nemoscarpenting.screen.CarpentingScreenHandler;
import net.fabricmc.api.ModInitializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NemosCarpenting implements ModInitializer {

	//TODO: REFACTOR
	public static final String MOD_ID = "nemos-carpenting";
    public static final Logger log = LoggerFactory.getLogger(MOD_ID);
	public static final ScreenHandlerType<CarpentingScreenHandler> CARPENTING_SCREEN_HANDLER =
			ScreenHandlerType.register("carpenting", CarpentingScreenHandler::new);
	public static RecipeType<CarpentingRecipe> CARPENTING;

	@Override
	public void onInitialize() {
		log.info("Thank you for using Nemo's Furniture!");
		CARPENTING = Registry.register(Registries.RECIPE_TYPE, new Identifier(MOD_ID, CarpentingRecipe.Type.ID), CarpentingRecipe.Type.INSTANCE);
		Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(MOD_ID, CarpentingRecipe.Serializer.ID), CarpentingRecipe.Serializer.INSTANCE);
		ModItemGroups.registerItemGroups();
		ModEntities.registerEntities();
	}
}