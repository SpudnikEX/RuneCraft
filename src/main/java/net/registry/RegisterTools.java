package net.registry;

import net.RuneCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tools.PickaxeBase;

public class RegisterTools {

    public static final Item CHISEL = new ToolItem(ToolMaterials.STONE, new FabricItemSettings().group(RuneCraft.TOOLS));
    public static final Item DEBUG_PICKAXE = new PickaxeBase(ToolMaterials.DIAMOND, 5, 5, new FabricItemSettings().group(RuneCraft.TOOLS));

    public static void register(){

        Registry.register(Registry.ITEM,new Identifier(RuneCraft.MOD_ID,"chisel"),CHISEL);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"debug_pickaxe"),DEBUG_PICKAXE);
    }
}
