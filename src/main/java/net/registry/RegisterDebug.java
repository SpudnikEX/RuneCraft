package net.registry;

import net.RuneCraft;
//import net.block.ForgeBlock;
//import net.debug.BoxBlock;
//import net.debug.BoxBlockEntity;
//import net.debug.BoxScreen;
//import net.debug.BoxScreenHandler;
import net.debug.BoxBlock;
import net.debug.BoxBlockEntity;
import net.debug.BoxScreenHandler;
import net.debug.PositionedScreen;
//import net.entity.ForgeBlockEntity;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BeehiveBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.gui.screen.ingame.FurnaceScreen;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
//import net.screen.ForgeScreen;
//import net.screen.ForgeScreenHandler;


/**
 * {@link BlockEntityType} {@link Blocks}
 */
public class RegisterDebug {

    public static final Identifier BOX_ID = new Identifier(RuneCraft.MOD_ID,"box_block");
    public static final Block BOX_BLOCK = new BoxBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD));//FabricBlockSettings.copyOf(Blocks.FURNACE));
    public static final Item BOX_BLOCK_ITEM = new BlockItem(BOX_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockEntityType<BoxBlockEntity> BOX_ENTITY = BlockEntityType.Builder.create(BoxBlockEntity::new, BOX_BLOCK).build(null);
    public static final ScreenHandlerType<BoxScreenHandler> BOX_SCREEN_HANDLER =  ScreenHandlerRegistry.registerExtended(BOX_ID, BoxScreenHandler::new);

//    public static final Identifier FORGE_ID = new Identifier(RuneCraft.MOD_ID, "forge_block");
//    public static final Block FORGE_BLOCK = new ForgeBlock(FabricBlockSettings.of(Material.STONE));
//    public static final BlockItem FORGE_BLOCK_ITEM = new BlockItem(FORGE_BLOCK, new FabricItemSettings().group(RuneCraft.MOD_GROUP));
//    public static final BlockEntityType<ForgeBlockEntity> FORGE_BLOCK_ENTITY = BlockEntityType.Builder.create(ForgeBlockEntity::new,FORGE_BLOCK).build(null);
//    public static final ScreenHandlerType<ForgeScreenHandler> FORGE_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(FORGE_ID,ForgeScreenHandler::new);


    public static void register(){
        Registry.register(Registry.BLOCK, BOX_ID, BOX_BLOCK);
        Registry.register(Registry.ITEM, BOX_ID, BOX_BLOCK_ITEM);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, BOX_ID, BOX_ENTITY);

//        Registry.register(Registry.BLOCK, FORGE_ID, FORGE_BLOCK);
//        Registry.register(Registry.ITEM, FORGE_ID,FORGE_BLOCK_ITEM);
//        Registry.register(Registry.BLOCK_ENTITY_TYPE, FORGE_ID,FORGE_BLOCK_ENTITY);

    }

    public static void render(){
//        Registry.register(Registry.SCREEN_HANDLER, FORGE_ID,FORGE_SCREEN_HANDLER);
        ScreenRegistry.register(BOX_SCREEN_HANDLER, PositionedScreen::new);
       // ScreenRegistry.register(FORGE_SCREEN_HANDLER,ForgeScreen::new);
    }
}
