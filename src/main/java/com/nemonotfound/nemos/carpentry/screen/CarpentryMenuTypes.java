package com.nemonotfound.nemos.carpentry.screen;

import net.minecraft.world.inventory.MenuType;

import static com.nemonotfound.nemos.carpentry.NemosCarpentry.MOD_ID;
import static com.nemonotfound.nemos.carpentry.NemosCarpentry.log;

public class CarpentryMenuTypes {

    public static final MenuType<CarpentryMenu> CARPENTRY_SCREEN_HANDLER = MenuType.register(MOD_ID, CarpentryMenu::new);

    public static void registerScreenHandlerTypes() {
        log.info("Registering screen handlers");
    }

}
