package net.client.model.renderer.item;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class VoxelEntity extends ItemEntity {

    //private static final TrackedData<Boolean> ENCHANTMENT_GLINT;
    private ItemStack stack;
    private final Set<UUID> piercedEntities = new HashSet<>();

    public VoxelEntity(EntityType<? extends VoxelEntity> entityType, World world, VoxelItem item) {
        super(entityType, world);
        this.stack = new ItemStack(item);
    }

    public VoxelEntity(World world, VoxelItem item, ItemStack stack) {
        super(item.getType(), world);
        this.stack = new ItemStack(item);
        this.stack = stack.copy();
        //this.dataTracker.set(ENCHANTMENT_GLINT, stack.hasGlint());
    }

    public VoxelEntity(World world, LivingEntity owner, VoxelItem item, ItemStack stack) {
        super(item.getType(), world);
        this.stack = new ItemStack(item);
        this.stack = stack.copy();
        //this.dataTracker.set(ENCHANTMENT_GLINT, stack.hasGlint());
    }

    public boolean isEnchanted() {
        return false;
    }

//    @Environment(EnvType.CLIENT)
//    public boolean isEnchanted() {
//        return (Boolean)this.dataTracker.get(ENCHANTED);
//    }
}
