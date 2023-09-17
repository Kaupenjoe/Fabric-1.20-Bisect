package net.kaupenjoe.tutorialmod.recipe;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(TutorialMod.MOD_ID, FiveByFiveCraftingRecipe.Serializer.ID),
                FiveByFiveCraftingRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(TutorialMod.MOD_ID, FiveByFiveCraftingRecipe.Type.ID),
                FiveByFiveCraftingRecipe.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(TutorialMod.MOD_ID, KaupenFurnaceRecipe.Serializer.ID),
                KaupenFurnaceRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(TutorialMod.MOD_ID, KaupenFurnaceRecipe.Type.ID),
                KaupenFurnaceRecipe.Type.INSTANCE);

        TutorialMod.LOGGER.info("Registering Recipes " + TutorialMod.MOD_ID);
    }
}
