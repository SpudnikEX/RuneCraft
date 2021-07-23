package net.registry;

import net.RuneCraft;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.item.tool.CraftingItem;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.item.tool.PickaxeBase;

public class RegisterTools {

    public static final Item CHISEL = new CraftingItem(new FabricItemSettings().group(RuneCraft.TOOLS));
    public static final Item DEBUG_PICKAXE = new PickaxeBase(ToolMaterials.DIAMOND, 5, 5, new FabricItemSettings().group(RuneCraft.TOOLS));
//    public static final TridentItem

    public static void register(){
        Registry.register(Registry.ITEM,new Identifier(RuneCraft.MOD_ID,"chisel"),CHISEL);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"debug_pickaxe"),DEBUG_PICKAXE);
    }
}
