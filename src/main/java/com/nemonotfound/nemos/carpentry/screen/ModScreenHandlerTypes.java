package com.nemonotfound.nemos.carpentry.screen;

import net.minecraft.screen.ScreenHandlerType;

import static com.nemonotfound.nemos.carpentry.NemosCarpentry.MOD_ID;
import static com.nemonotfound.nemos.carpentry.NemosCarpentry.log;

public class ModScreenHandlerTypes {

    public static final ScreenHandlerType<CarpentryScreenHandler> CARPENTRY_SCREEN_HANDLER = ScreenHandlerType.register(MOD_ID, CarpentryScreenHandler::new);

    public static void registerScreenHandlerTypes() {
        log.info("Registering screen handlers");
    }

}
