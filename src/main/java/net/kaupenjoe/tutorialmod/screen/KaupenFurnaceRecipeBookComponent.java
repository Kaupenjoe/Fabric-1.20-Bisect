package net.kaupenjoe.tutorialmod.screen;

import net.kaupenjoe.tutorialmod.item.ModItems;
import net.minecraft.client.gui.screen.recipebook.AbstractFurnaceRecipeBookScreen;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.Set;

public class KaupenFurnaceRecipeBookComponent extends AbstractFurnaceRecipeBookScreen {
    @Override
    protected Set<Item> getAllowedFuels() {
        return Set.of(ModItems.PEAT_BRICKS, Items.BLAZE_POWDER);
    }
}
