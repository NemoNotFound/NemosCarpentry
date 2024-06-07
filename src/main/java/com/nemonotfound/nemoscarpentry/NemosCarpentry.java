package com.nemonotfound.nemoscarpentry;

import com.nemonotfound.nemoscarpentry.entity.ModEntities;
import com.nemonotfound.nemoscarpentry.item.ModItemGroups;
import com.nemonotfound.nemoscarpentry.recipe.CarpentryRecipe;
import com.nemonotfound.nemoscarpentry.screen.CarpentryScreenHandler;
import net.fabricmc.api.ModInitializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NemosCarpentry implements ModInitializer {

	//TODO: REFACTOR
	public static final String MOD_ID = "nemos-carpentry";
    public static final Logger log = LoggerFactory.getLogger(MOD_ID);
	public static final ScreenHandlerType<CarpentryScreenHandler> CARPENTRY_SCREEN_HANDLER =
			ScreenHandlerType.register("carpentry", CarpentryScreenHandler::new);
	public static RecipeType<CarpentryRecipe> CARPENTRY;

	@Override
	public void onInitialize() {
		log.info("Thank you for using Nemo's Carpentry!");
		CARPENTRY = Registry.register(Registries.RECIPE_TYPE, Identifier.of(MOD_ID, CarpentryRecipe.Type.ID), CarpentryRecipe.Type.INSTANCE);
		Registry.register(Registries.RECIPE_SERIALIZER, Identifier.of(MOD_ID, CarpentryRecipe.Serializer.ID), CarpentryRecipe.Serializer.INSTANCE);
		ModItemGroups.registerItemGroups();
		ModEntities.registerEntities();
	}
}