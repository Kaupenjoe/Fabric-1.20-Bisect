package net.kaupenjoe.tutorialmod;

import net.fabricmc.api.ClientModInitializer;
import net.kaupenjoe.tutorialmod.screen.FiveByFiveCraftingScreen;
import net.kaupenjoe.tutorialmod.screen.KaupenFurnaceScreen;
import net.kaupenjoe.tutorialmod.screen.ModScreenHandlers;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class TutorialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.FIVE_BY_FIVE_CRAFTING, FiveByFiveCraftingScreen::new);
        HandledScreens.register(ModScreenHandlers.KAUPEN_FURNACE_SCREEN_HANDLER, KaupenFurnaceScreen::new);
    }
}
