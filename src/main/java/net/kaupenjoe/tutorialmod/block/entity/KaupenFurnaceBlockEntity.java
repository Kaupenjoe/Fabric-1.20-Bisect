package net.kaupenjoe.tutorialmod.block.entity;

import net.kaupenjoe.tutorialmod.item.ModItems;
import net.kaupenjoe.tutorialmod.recipe.KaupenFurnaceRecipe;
import net.kaupenjoe.tutorialmod.screen.KaupenFurnaceScreen;
import net.kaupenjoe.tutorialmod.screen.KaupenFurnaceScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

import java.util.Map;

public class KaupenFurnaceBlockEntity extends AbstractFurnaceBlockEntity {
    private Map<Item, Integer> BURN_DURATION_MAP = Map.of(
            ModItems.PEAT_BRICKS, 100,
            Items.BLAZE_POWDER, 600);

    public KaupenFurnaceBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.KAUPEN_FURNACE, pos, state, KaupenFurnaceRecipe.Type.INSTANCE);
    }

    @Override
    protected Text getContainerName() {
        return Text.literal("Kaupen Furnace");
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new KaupenFurnaceScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }

    @Override
    protected int getFuelTime(ItemStack fuel) {
        return BURN_DURATION_MAP.getOrDefault(fuel.getItem(), 0);
    }
}
