package com.nemonotfound.nemoscarpentry;

import com.nemonotfound.nemoscarpentry.datagen.BlockTagGenerator;
import com.nemonotfound.nemoscarpentry.datagen.LootTableGenerator;
import com.nemonotfound.nemoscarpentry.datagen.ModelGenerator;
import com.nemonotfound.nemoscarpentry.datagen.RecipeGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class NemosCarpentryDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(RecipeGenerator::new);
        pack.addProvider(LootTableGenerator::new);
        pack.addProvider(ModelGenerator::new);
        pack.addProvider(BlockTagGenerator::new);
    }
}
