package net.client.model.renderer.item;

import net.RuneCraft;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VoxelEntities {

    public static final EntityType<VoxelEntity> VOXEL_ENTITY = FabricEntityTypeBuilder.<VoxelEntity>create(SpawnGroup.MISC, (type, world) -> new VoxelEntity(type,world,VoxelItems.VOXEL_ITEM)).build();

    public static void register(){
        Registry.register(Registry.ENTITY_TYPE, new Identifier(RuneCraft.MOD_ID,"voxel_item"),VOXEL_ENTITY);
    }

    public static void render(){
        EntityRendererRegistry.INSTANCE.register(VOXEL_ENTITY,((manager, context) -> new VoxelEntityRenderer(manager)));
    }
}
