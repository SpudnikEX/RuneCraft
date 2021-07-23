package net.client.model.renderer.item;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

/**
 * {@link SwordItem}
 */
public class VoxelItem extends SwordItem {

    public VoxelItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
}
