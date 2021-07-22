package net.registry;

import net.RuneCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterMaterials {

    // Update armor materials and item .json

    // Bars
    public static final Item ADAMANTITE_BAR = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item BRONZE_BAR = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item DRAGON_BAR = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item GOLD_BAR = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item IRON_BAR = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item MITHRIL_BAR = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item RUNITE_BAR = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item SILVER_BAR = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item STEEL_BAR = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));

    // Misc
    public static final Item LIMESTONE_BRICK = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item COWHIDE = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item LEATHER = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item HARD_LEATHER = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));

    // Gems
    public static final Item DIAMOND = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item UNCUT_DIAMOND = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));

    public static void register(){

        // Bars
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"adamantite_bar"),ADAMANTITE_BAR);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"bronze_bar"),BRONZE_BAR);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"dragon_bar"),DRAGON_BAR);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"gold_bar"),GOLD_BAR);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"iron_bar"),IRON_BAR);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"mithril_bar"),MITHRIL_BAR);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"runite_bar"),RUNITE_BAR);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"silver_bar"),SILVER_BAR);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"steel_bar"),STEEL_BAR);

        // Misc
        Registry.register(Registry.ITEM,new Identifier(RuneCraft.MOD_ID,"limestone_brick"),LIMESTONE_BRICK);
        Registry.register(Registry.ITEM,new Identifier(RuneCraft.MOD_ID,"cowhide"),COWHIDE);
        Registry.register(Registry.ITEM,new Identifier(RuneCraft.MOD_ID,"leather"),LEATHER);
        Registry.register(Registry.ITEM,new Identifier(RuneCraft.MOD_ID,"hard_leather"),HARD_LEATHER);

        // Gems
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"diamond"),DIAMOND);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"uncut_diamond"),UNCUT_DIAMOND);
    }
}
