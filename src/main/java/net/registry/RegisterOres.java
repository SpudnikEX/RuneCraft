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

public class RegisterOres {

    // create .json blockstate, .json block and .json item, loot table and recipe

    public static final Item LIMESTONE = new Item(new FabricItemSettings().group(RuneCraft.ORES));
    public static final Item TIN_ORE = new Item(new FabricItemSettings().group(RuneCraft.ORES));
    public static final Item COPPER_ORE = new Item(new FabricItemSettings().group(RuneCraft.ORES));
    public static final Item ADAMANTITE_ORE = new Item(new FabricItemSettings().group(RuneCraft.ORES));
    public static final Item GOLD_ORE = new Item(new FabricItemSettings().group(RuneCraft.ORES));
    public static final Item IRON_ORE = new Item(new FabricItemSettings().group(RuneCraft.ORES));
    public static final Item MITHRIL_ORE = new Item(new FabricItemSettings().group(RuneCraft.ORES));
    public static final Item RUNITE_ORE = new Item(new FabricItemSettings().group(RuneCraft.ORES));
    public static final Item SILVER_ORE = new Item(new FabricItemSettings().group(RuneCraft.ORES));

    public static final Block LIMESTONE_BLOCK = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(5,5).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
    public static final Block COPPER_ORE_BLOCK = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(5,5).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
    public static final Block TIN_ORE_BLOCK = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(5,5).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
    public static final Block ADAMANTITE_ORE_BLOCK = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(5,5).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
    public static final Block MITHRIL_ORE_BLOCK = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(5,5).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
    public static final Block RUNITE_ORE_BLOCK = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(5,5).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
    public static final Block SILVER_ORE_BLOCK = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(5,5).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());


    private static ConfiguredFeature<?,?> ORE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, COPPER_ORE_BLOCK.getDefaultState(),9))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0,0,240))).spreadHorizontally().repeat(20);


    public static void register(){
        registerBlock("limestone", LIMESTONE, "limestone_block", LIMESTONE_BLOCK);
        registerBlock("tin_ore",TIN_ORE,"tin_ore_block",TIN_ORE_BLOCK);
        registerBlock("copper_ore",COPPER_ORE,"copper_ore_block",COPPER_ORE_BLOCK);
        registerBlock("adamantite_ore",ADAMANTITE_ORE,"adamantite_ore_block",ADAMANTITE_ORE_BLOCK);
        registerBlock("mithril_ore",MITHRIL_ORE,"mithril_ore_block",MITHRIL_ORE_BLOCK);
        registerBlock("runite_ore",RUNITE_ORE,"runite_ore_block",RUNITE_ORE_BLOCK);
        registerBlock("silver_ore",SILVER_ORE,"silver_ore_block",SILVER_ORE_BLOCK);
    }

    private static void registerBlock(String itemPath, Item item, String blockPath, Block block) {
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, itemPath), item);
        Registry.register(Registry.BLOCK, new Identifier(RuneCraft.MOD_ID, blockPath), block);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, blockPath), new BlockItem(block, new Item.Settings().group(RuneCraft.ORES)));
    }

    public static void generateOres(String namespace, String blockPath){
        RegistryKey<ConfiguredFeature<?,?>> gen_copper_overworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(namespace,blockPath));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,gen_copper_overworld.getValue(),ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, gen_copper_overworld);
    }

}
