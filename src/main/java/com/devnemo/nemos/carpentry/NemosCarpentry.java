package com.devnemo.nemos.carpentry;

import com.devnemo.nemos.carpentry.entity.ModEntities;
import com.devnemo.nemos.carpentry.item.ModItemGroups;
import com.devnemo.nemos.carpentry.recipe.ModRecipeSerializer;
import com.devnemo.nemos.carpentry.recipe.ModRecipeTypes;
import com.devnemo.nemos.carpentry.recipe.book.ModRecipeBookCategory;
import com.devnemo.nemos.carpentry.recipe.display.ModRecipeDisplays;
import com.devnemo.nemos.carpentry.screen.ModScreenHandlerTypes;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NemosCarpentry implements ModInitializer {

	public static final String MOD_ID = "nemos-carpentry";
    public static final Logger log = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		log.info("Thank you for using Nemo's Carpentry!");
		ModRecipeDisplays.registerRecipeDisplays();
		ModScreenHandlerTypes.registerScreenHandlerTypes();
		ModRecipeTypes.registerRecipeTypes();
		ModRecipeSerializer.registerRecipeSerializer();
		ModItemGroups.registerItemGroups();
		ModEntities.registerEntities();
		ModRecipeBookCategory.registerRecipeBookCategories();
	}
}