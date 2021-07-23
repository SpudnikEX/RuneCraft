package net.client.model.renderer.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class ItemEntity extends net.minecraft.entity.ItemEntity {

    public ItemEntity(EntityType<? extends net.minecraft.entity.ItemEntity> entityType, World world) {
        super(entityType, world);
    }
}
