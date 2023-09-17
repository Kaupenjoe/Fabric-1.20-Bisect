package net.kaupenjoe.tutorialmod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<KaupenFurnaceBlockEntity> KAUPEN_FURNACE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(TutorialMod.MOD_ID, "kaupen_furnace"),
                    FabricBlockEntityTypeBuilder.create(KaupenFurnaceBlockEntity::new,
                            ModBlocks.KAUPEN_FURNACE).build());

    public static void registerBlockEntities() {

    }
}
