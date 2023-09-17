package net.kaupenjoe.tutorialmod.screen;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen;
import net.minecraft.client.gui.screen.recipebook.AbstractFurnaceRecipeBookScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class KaupenFurnaceScreen extends AbstractFurnaceScreen<KaupenFurnaceScreenHandler> {
    private static final Identifier TEXTURE = new Identifier(TutorialMod.MOD_ID, "textures/gui/kaupen_furnace.png");

    public KaupenFurnaceScreen(KaupenFurnaceScreenHandler handler, PlayerInventory inventory, Text title) {
        this(handler, new KaupenFurnaceRecipeBookComponent(), inventory, title, TEXTURE);
    }

    private KaupenFurnaceScreen(KaupenFurnaceScreenHandler handler, AbstractFurnaceRecipeBookScreen recipeBook,
                               PlayerInventory inventory, Text title, Identifier background) {
        super(handler, recipeBook, inventory, title, background);
    }
}
