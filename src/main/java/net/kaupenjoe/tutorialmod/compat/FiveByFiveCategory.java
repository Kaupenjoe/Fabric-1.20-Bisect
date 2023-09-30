package net.kaupenjoe.tutorialmod.compat;

import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.block.ModBlocks;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.LinkedList;
import java.util.List;

// Not currently working

// Done with the help:
// https://github.com/TeamGalacticraft/Galacticraft/tree/main (MIT License)
public class FiveByFiveCategory implements DisplayCategory<BasicDisplay> {
    public final static Identifier TEXTURE = new Identifier(TutorialMod.MOD_ID, "textures/gui/five_by_five_crafting_table.png");
    public static final CategoryIdentifier<FiveByFiveDisplay> FIVE_BY_FIVE =
            CategoryIdentifier.of(TutorialMod.MOD_ID, "five_by_five_crafting");


    @Override
    public CategoryIdentifier<? extends BasicDisplay> getCategoryIdentifier() {
        return FIVE_BY_FIVE;
    }

    @Override
    public Text getTitle() {
        return Text.literal("5x5 Crafting");
    }

    @Override
    public Renderer getIcon() {
        return EntryStacks.of(ModBlocks.FIVE_BY_FIVE_CRAFTING.asItem().getDefaultStack());
    }

    @Override
    public List<Widget> setupDisplay(BasicDisplay display, Rectangle bounds) {
        final Point startPoint = new Point(bounds.getCenterX() - 87, bounds.getCenterY() - 35);
        List<Widget> widgets = new LinkedList<>();
        widgets.add(Widgets.createTexturedWidget(TEXTURE,
                new Rectangle(startPoint.x, startPoint.y, 175, 82)));

        for(int i = 0; i < 5; ++i) {
            for(int j = 0; j < 5; ++j) {
                widgets.add(Widgets.createSlot(new Point(12 + startPoint.x + j * 18, 11 + startPoint.y + i * 18))
                        .entries(display.getInputEntries().get(i + j * 5)));
            }
        }

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 141, startPoint.y + 48))
                .markOutput().entries(display.getOutputEntries().get(0)));


        return widgets;
    }

    @Override
    public int getDisplayHeight() {
        return 90;
    }
}
