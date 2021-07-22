package net.registry;

import net.RuneCraft;
import net.block.OreBlock;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
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

public class RegisterBlocks {

    public static final Item DEBUG_BLOCK_ITEM = new Item(new FabricItemSettings());
    public static final Block DEBUG_BLOCK = new OreBlock(FabricBlockSettings.of(Material.STONE));

    public static void register(){
        registerBlock("four_sided",DEBUG_BLOCK_ITEM,"four_sided_furnace",DEBUG_BLOCK);
    }

    private static void registerBlock(String itemPath, Item item, String blockPath, Block block) {
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, itemPath), item);
        Registry.register(Registry.BLOCK, new Identifier(RuneCraft.MOD_ID, blockPath), block);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, blockPath), new BlockItem(block, new Item.Settings().group(RuneCraft.ORES)));
    }

}
