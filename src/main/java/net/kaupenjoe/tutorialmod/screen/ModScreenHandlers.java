package net.kaupenjoe.tutorialmod.screen;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<FiveByFiveCraftingScreenHandler> FIVE_BY_FIVE_CRAFTING =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(TutorialMod.MOD_ID, "five_by_five_crafting"),
                    new ScreenHandlerType<>(FiveByFiveCraftingScreenHandler::new, FeatureFlags.VANILLA_FEATURES));

    public static final ScreenHandlerType<KaupenFurnaceScreenHandler> KAUPEN_FURNACE_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(TutorialMod.MOD_ID, "kaupen_furnace_screen_handler"),
                    new ScreenHandlerType<>(KaupenFurnaceScreenHandler::new, FeatureFlags.VANILLA_FEATURES));

    public static void registerScreenHandlers() {
        TutorialMod.LOGGER.info("Registering Screen Hanlders " + TutorialMod.MOD_ID);
    }
}
