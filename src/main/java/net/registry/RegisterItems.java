package net.registry;

import net.RuneCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {

    public static final Item LIMESTONE_BRICK = new Item(new FabricItemSettings());

    public static void register(){
        Registry.register(Registry.ITEM,new Identifier(RuneCraft.MOD_ID,"limestone_brick"),LIMESTONE_BRICK);
    }
}
