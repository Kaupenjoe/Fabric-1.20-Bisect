package net.kaupenjoe.tutorialmod.compat;

import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.kaupenjoe.tutorialmod.block.ModBlocks;
import net.kaupenjoe.tutorialmod.recipe.FiveByFiveCraftingRecipe;
import net.kaupenjoe.tutorialmod.recipe.KaupenFurnaceRecipe;
import net.kaupenjoe.tutorialmod.screen.FiveByFiveCraftingScreen;
import net.kaupenjoe.tutorialmod.screen.KaupenFurnaceScreen;

public class TutorialModREIClientPlugin implements REIClientPlugin {
    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new KaupenFurnaceCategory());
        registry.addWorkstations(KaupenFurnaceCategory.KAUPEN_FURNACE, EntryStacks.of(ModBlocks.KAUPEN_FURNACE));

        // registry.add(new FiveByFiveCategory());
        // registry.addWorkstations(FiveByFiveCategory.FIVE_BY_FIVE, EntryStacks.of(ModBlocks.FIVE_BY_FIVE_CRAFTING));
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(KaupenFurnaceRecipe.class, KaupenFurnaceRecipe.Type.INSTANCE, KaupenFurnaceDisplay::new);

        // registry.registerRecipeFiller(FiveByFiveCraftingRecipe.class, FiveByFiveCraftingRecipe.Type.INSTANCE, FiveByFiveDisplay::new);
    }

    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerClickArea(screen -> new Rectangle(90, 50, 20, 30), KaupenFurnaceScreen.class,
                KaupenFurnaceCategory.KAUPEN_FURNACE);

        // registry.registerClickArea(screen -> new Rectangle(90, 50, 20, 30), FiveByFiveCraftingScreen.class,
        //         FiveByFiveCategory.FIVE_BY_FIVE);
    }
}
