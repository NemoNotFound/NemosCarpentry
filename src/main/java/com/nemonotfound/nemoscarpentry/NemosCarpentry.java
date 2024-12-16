package com.nemonotfound.nemoscarpentry;

import com.nemonotfound.nemoscarpentry.entity.ModBlockEntityTypes;
import com.nemonotfound.nemoscarpentry.entity.ModEntities;
import com.nemonotfound.nemoscarpentry.item.ModItemGroups;
import com.nemonotfound.nemoscarpentry.recipe.ModRecipeSerializer;
import com.nemonotfound.nemoscarpentry.recipe.ModRecipeTypes;
import com.nemonotfound.nemoscarpentry.recipe.book.ModRecipeBookCategory;
import com.nemonotfound.nemoscarpentry.recipe.display.ModRecipeDisplays;
import com.nemonotfound.nemoscarpentry.screen.ModScreenHandlerTypes;
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
		ModBlockEntityTypes.registerBlockEntityTypes();
	}
}