package com.nemonotfound.nemos.carpentry;

import com.nemonotfound.nemos.carpentry.datagen.BlockTagGenerator;
import com.nemonotfound.nemos.carpentry.datagen.LootTableGenerator;
import com.nemonotfound.nemos.carpentry.datagen.CarpentryRecipeProvider;
//import com.nemonotfound.nemos.carpentry.datagen.ModelGenerator;
//import com.nemonotfound.nemoscarpentry.datagen.*;
import com.nemonotfound.nemos.carpentry.datagen.langdatagen.EnglishLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class NemosCarpentryDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(CarpentryRecipeProvider::new);
        pack.addProvider(LootTableGenerator::new);
        //TODO: Fix
        //pack.addProvider(ModelGenerator::new);
        pack.addProvider(BlockTagGenerator::new);
        pack.addProvider(EnglishLanguageProvider::new);
    }
}
