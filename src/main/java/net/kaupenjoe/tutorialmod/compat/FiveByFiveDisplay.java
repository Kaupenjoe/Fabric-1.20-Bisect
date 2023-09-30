package net.kaupenjoe.tutorialmod.compat;

import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.annotation.Nullable;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.kaupenjoe.tutorialmod.recipe.FiveByFiveCraftingRecipe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FiveByFiveDisplay extends BasicDisplay {
    public FiveByFiveDisplay(List<EntryIngredient> inputs, List<EntryIngredient> outputs) {
        super(inputs, outputs);
    }

    public FiveByFiveDisplay(@Nullable FiveByFiveCraftingRecipe recipe) {
        super(getInputList(recipe), List.of(EntryIngredient.of(EntryStacks.of(recipe.getOutput(null)))));
    }

    private static List<EntryIngredient> getInputList(FiveByFiveCraftingRecipe recipe) {
        if(recipe == null) return Collections.emptyList();
        return new ArrayList<>(recipe.getIngredients().stream().map(EntryIngredients::ofIngredient).toList());
    }

    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return FiveByFiveCategory.FIVE_BY_FIVE;
    }
}
