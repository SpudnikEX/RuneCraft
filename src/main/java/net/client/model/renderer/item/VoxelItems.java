package net.client.model.renderer.item;

import net.RuneCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VoxelItems {

    public static final VoxelItem VOXEL_ITEM = new VoxelItem(ToolMaterials.DIAMOND,() -> VoxelEntities.VOXEL_ENTITY, 0,0, new FabricItemSettings().group(RuneCraft.TOOLS));

    public static void register(){
        Registry.register(Registry.ITEM,new Identifier(RuneCraft.MOD_ID,"voxel_item"),VOXEL_ITEM);
    }
}
