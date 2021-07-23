package net.client.model.renderer.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public abstract class VoxelEntity extends Entity {
    public VoxelEntity(EntityType<?> type, World world) {
        super(type, world);
    }
}
