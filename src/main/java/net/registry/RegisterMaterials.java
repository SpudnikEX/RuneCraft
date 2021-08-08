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
    public static final Item BRONZE_BAR = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item IRON_BAR = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item STEEL_BAR = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item SILVER_BAR = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item GOLD_BAR = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item MITHRIL_BAR = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item ADAMANTITE_BAR = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item RUNITE_BAR = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item DRAGONITE_BAR = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));

    // Misc
    public static final Item LIMESTONE_BRICK = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item COWHIDE = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item LEATHER = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item HARD_LEATHER = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));

    // Gems
    public static final Item DIAMOND = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item UNCUT_DIAMOND = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));

    // Wood
    public static final Item OAK_LOGS = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item OAK_PLANK = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item SPRUCE_LOGS = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item SPRUCE_PLANK = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item BIRCH_LOGS = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item BIRCH_PLANK = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item ACACIA_LOGS = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item ACACIA_PLANK = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item JUNGLE_LOGS = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item JUNGLE_PLANK = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item DARK_OAK_LOGS = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item DARK_OAK_PLANK = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item CRIMSON_LOGS = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item CRIMSON_PLANK = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item WARPED_LOGS = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));
    public static final Item WARPED_PLANK = new Item(new FabricItemSettings().group(RuneCraft.MATERIALS));


    public static void register(){

        // Bars
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"bronze_bar"),BRONZE_BAR);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"iron_bar"),IRON_BAR);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"steel_bar"),STEEL_BAR);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"silver_bar"),SILVER_BAR);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"gold_bar"),GOLD_BAR);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"mithril_bar"),MITHRIL_BAR);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"adamantite_bar"),ADAMANTITE_BAR);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"runite_bar"),RUNITE_BAR);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"dragonite_bar"),DRAGONITE_BAR);

        // Misc
        Registry.register(Registry.ITEM,new Identifier(RuneCraft.MOD_ID,"limestone_brick"),LIMESTONE_BRICK);
        Registry.register(Registry.ITEM,new Identifier(RuneCraft.MOD_ID,"cowhide"),COWHIDE);
        Registry.register(Registry.ITEM,new Identifier(RuneCraft.MOD_ID,"leather"),LEATHER);
        Registry.register(Registry.ITEM,new Identifier(RuneCraft.MOD_ID,"hard_leather"),HARD_LEATHER);

        // Gems
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"diamond"),DIAMOND);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"uncut_diamond"),UNCUT_DIAMOND);

        // Wood
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"oak_logs"),OAK_LOGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"oak_plank"),OAK_PLANK);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"spruce_logs"),SPRUCE_LOGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"spruce_plank"),SPRUCE_PLANK);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"birch_logs"),BIRCH_LOGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"birch_plank"),BIRCH_PLANK);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"acacia_logs"),ACACIA_LOGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"acacia_plank"),ACACIA_PLANK);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"jungle_logs"),JUNGLE_LOGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"jungle_plank"),JUNGLE_PLANK);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"dark_oak_logs"),DARK_OAK_LOGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"dark_oak_plank"),DARK_OAK_PLANK);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"crimson_logs"),CRIMSON_LOGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"crimson_plank"),CRIMSON_PLANK);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"warped_logs"),WARPED_LOGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID,"warped_plank"),WARPED_PLANK);

    }
}
