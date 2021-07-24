package net.client.model.renderer.item;

import net.minecraft.entity.EntityType;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import java.util.function.Supplier;

/**
 * {@link SwordItem}
 */
public class VoxelItem extends SwordItem {

    private final ToolMaterial material;
    private final float attackDamage;
    private final Supplier<EntityType<VoxelEntity>> typeSupplier;
    private EntityType<VoxelEntity> cachedType = null;

    public VoxelItem(ToolMaterial toolMaterial, Supplier<EntityType<VoxelEntity>> typeSupplier, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        this.material = toolMaterial;
        this.attackDamage = attackDamage + material.getAttackDamage();
        this.typeSupplier = typeSupplier;
    }

    public VoxelItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        this.material = toolMaterial;
        this.attackDamage = attackDamage + material.getAttackDamage();
        this.typeSupplier = null;
    }

    public EntityType<VoxelEntity> getType() {
        if (cachedType == null) {
            cachedType = typeSupplier.get();
        }
        return cachedType;
    }
}
