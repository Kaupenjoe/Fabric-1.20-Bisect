package net.kaupenjoe.tutorialmod.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.*;
import net.minecraft.recipe.book.CookingRecipeCategory;
import net.minecraft.util.Identifier;

public class KaupenFurnaceRecipe extends AbstractCookingRecipe {
    public KaupenFurnaceRecipe(Identifier id, String group,
                               CookingRecipeCategory category, Ingredient input, ItemStack output, float experience, int cookTime) {
        super(Type.INSTANCE, id, group, category, input, output, experience, cookTime);
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return null;
    }

    public static class Type implements RecipeType<KaupenFurnaceRecipe> {
        public static final String ID = "kaupen_furnace";
        public static final Type INSTANCE = new Type();
    }

    public static class Serializer {
        public static final String ID = "kaupen_furnace";
        public static final RecipeSerializer<KaupenFurnaceRecipe> INSTANCE = new CookingRecipeSerializer<>(KaupenFurnaceRecipe::new, 50);
    }
}
