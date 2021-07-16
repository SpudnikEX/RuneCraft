package net;

import net.block.CopperOreBlock;
import net.block.OreBlock;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
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

public class RuneCraft implements ModInitializer{

    public Item item = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static final Item TIN_ORE = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Block TIN_ORE_BLOCK = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(5,5).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());


    public static final Item COPPER_ORE = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Block COPPER_ORE_BLOCK = new CopperOreBlock(FabricBlockSettings.of(Material.STONE).strength(5,5).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());

    public static final Item BRONZE_BAR = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));

    public static final Item DIAMOND = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item UNCUT_DIAMOND = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));

    private static ConfiguredFeature<?,?> ORE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, COPPER_ORE_BLOCK.getDefaultState(),9))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0,0,240))).spreadHorizontally().repeat(20);


    @Override
    public void onInitialize() {
    Registry.register(Registry.ITEM, new Identifier("runecraft","debug_item"),item);

    Registry.register(Registry.ITEM, new Identifier("runecraft","copper_ore"),COPPER_ORE);
    Registry.register(Registry.BLOCK, new Identifier("runecraft","copper_ore_block"), COPPER_ORE_BLOCK);
    Registry.register(Registry.ITEM, new Identifier("runecraft","copper_ore_block"),new BlockItem(COPPER_ORE_BLOCK,new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    RegistryKey<ConfiguredFeature<?,?>> gen_copper_overworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("runecraft","copper_ore_block"));
    Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,gen_copper_overworld.getValue(),ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, gen_copper_overworld);

        Registry.register(Registry.ITEM, new Identifier("runecraft","tin_ore"),TIN_ORE);
        Registry.register(Registry.BLOCK, new Identifier("runecraft","tin_ore_block"), TIN_ORE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("runecraft","tin_ore_block"),new BlockItem(TIN_ORE_BLOCK,new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));


        Registry.register(Registry.ITEM, new Identifier("runecraft","bronze_bar"),BRONZE_BAR);

        Registry.register(Registry.ITEM, new Identifier("runecraft","diamond"),DIAMOND);
        Registry.register(Registry.ITEM, new Identifier("runecraft","uncut_diamond"),UNCUT_DIAMOND);
    }
}
