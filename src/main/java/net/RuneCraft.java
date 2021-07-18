package net;

import net.block.EdibleComponent;
import net.block.OreBlock;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
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

    // This uses the model of the new material you created as an icon, but you can reference to whatever you like
    public static final ItemGroup MOD_GROUP = FabricItemGroupBuilder.create(new Identifier(MOD_ID, "main")).icon(() -> new ItemStack(RegisterOres.TIN_ORE)).build();

    // Debug Item
    public Item item = new Item(new Item.Settings().group(ItemGroup.MISC));


 // Register Mod Items
    @Override
    public void onInitialize() {

        RegisterArmor.register();
        RegisterBlocks.register();
        RegisterFood.register();
        RegisterMaterials.register();
        RegisterOres.register();

        Registry.register(Registry.ITEM, new Identifier("runecraft", "debug_item"), item);
    }
}
