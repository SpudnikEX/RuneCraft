package net.tools;

import net.minecraft.item.ToolMaterial;

public class PickaxeBase extends net.minecraft.item.PickaxeItem {
    public PickaxeBase(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
