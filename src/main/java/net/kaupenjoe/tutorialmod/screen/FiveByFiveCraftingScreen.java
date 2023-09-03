package net.kaupenjoe.tutorialmod.screen;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class FiveByFiveCraftingScreen extends HandledScreen<FiveByFiveCraftingScreenHandler> {
    private static final Identifier CRAFTING_TABLE_LOCATION = new Identifier(TutorialMod.MOD_ID,
            "textures/gui/five_by_five_crafting_table.png");

    public FiveByFiveCraftingScreen(FiveByFiveCraftingScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        this.titleY = 1000;
        this.playerInventoryTitleY = 1000;
        this.backgroundHeight = 192;
        super.init();
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
        this.drawMouseoverTooltip(context, mouseX, mouseY);
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        int i = this.x;
        int j = (this.height - this.backgroundHeight) / 2;
        context.drawTexture(CRAFTING_TABLE_LOCATION, i, j, 0, 0, this.backgroundWidth, this.backgroundHeight);
    }
}
