package net.registry;

import net.RuneCraft;
import net.block.EdibleComponent;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterFood {

    public static final Item RAW_MEAT = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(EdibleComponent.RAW_MEAT));
    public static final Item COOKED_MEAT = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(EdibleComponent.COOKED_MEAT));

    public static void register(){
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "cooked_meat"), COOKED_MEAT);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "raw_meat"), RAW_MEAT);
    }
}
