package net.registry;

import net.RuneCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterMaterials {


    public static final Item BRONZE_BAR = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));

    // Gems
    public static final Item DIAMOND = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item UNCUT_DIAMOND = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));

    public static void register(){


        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"bronze_bar"),BRONZE_BAR);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"diamond"),DIAMOND);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"uncut_diamond"),UNCUT_DIAMOND);
    }
}
