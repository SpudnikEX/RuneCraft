package net;

import net.block.EdibleComponent;
import net.block.OreBlock;

import net.client.model.renderer.item.VoxelEntities;
import net.client.model.renderer.item.VoxelItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.registry.*;

public class RuneCraft implements ModInitializer{

    public static final String MOD_ID = "runecraft";
    public static final String MOD_ARMOR_MODELS = "runecraft:textures/models/armor/"; // Use in Armor Classes

    // This uses the model of the new material you created as an icon, but you can reference to whatever you like
    public static final ItemGroup MOD_GROUP = FabricItemGroupBuilder.create(new Identifier(MOD_ID, "main")).icon(() -> new ItemStack(RegisterOres.TIN_ORE)).build();
    public static final ItemGroup ARMORS = FabricItemGroupBuilder.create(new Identifier(MOD_ID, "armors")).icon(() -> new ItemStack(RegisterArmor.BRONZE_HELMET)).build();
    public static final ItemGroup ORES = FabricItemGroupBuilder.create(new Identifier(MOD_ID, "ores")).icon(() -> new ItemStack(RegisterOres.COPPER_ORE)).build();
    public static final ItemGroup FOOD = FabricItemGroupBuilder.create(new Identifier(MOD_ID, "food")).icon(() -> new ItemStack(RegisterFood.COOKED_MEAT)).build();
    public static final ItemGroup TOOLS = FabricItemGroupBuilder.create(new Identifier(MOD_ID, "tools")).icon(() -> new ItemStack(RegisterTools.CHISEL)).build();
    public static final ItemGroup MATERIALS = FabricItemGroupBuilder.create(new Identifier(MOD_ID, "materials")).icon(() -> new ItemStack(RegisterMaterials.BRONZE_BAR)).build();


    // Debug Item
    public static final Item DEBUG_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));
    //public static final CapeItem CAPE_ITEM = new CapeItem(new FabricItemSettings().group(MOD_GROUP));


 // Register Mod Items
    @Override
    public void onInitialize() {

        RegisterArmor.register();
        RegisterBlocks.register();
        RegisterFood.register();
        RegisterMaterials.register();
        RegisterOres.register();
        RegisterTools.register();

        RegisterDebug.register();

        VoxelItems.register();
        VoxelEntities.register();

        Registry.register(Registry.ITEM, new Identifier("runecraft", "debug_item"), DEBUG_ITEM);
    }
}
