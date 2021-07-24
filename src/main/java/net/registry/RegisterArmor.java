package net.registry;

import net.RuneCraft;
//import net.client.model.renderer.armor.BronzeArmorModel;
import net.client.model.renderer.armor.*;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderingRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * {@link RunecraftArmorMaterials}
 */
public class RegisterArmor {

    // Create armor class and change string directory, create Material entry, register new item below, register with renderer below, create .json entry for each item

    public static final ArmorItem ADAMANTITE_HELMET = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.ADAMANTITE, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem ADAMANTITE_CHESTPLATE = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.ADAMANTITE, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem ADAMANTITE_LEGGINGS = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.ADAMANTITE, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem ADAMANTITE_BOOTS = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.ADAMANTITE, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem BRONZE_HELMET = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.BRONZE, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem BRONZE_CHESTPLATE = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.BRONZE, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem BRONZE_LEGGINGS = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.BRONZE, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem BRONZE_BOOTS = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.BRONZE, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem DRAGON_HELMET = new RuneCraftArmorItem(RunecraftArmorModel.Type.DRAGON, RunecraftArmorMaterials.DRAGON, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem DRAGON_CHESTPLATE = new RuneCraftArmorItem(RunecraftArmorModel.Type.DRAGON,RunecraftArmorMaterials.DRAGON, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem DRAGON_LEGGINGS = new RuneCraftArmorItem(RunecraftArmorModel.Type.DRAGON, RunecraftArmorMaterials.DRAGON, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem DRAGON_BOOTS = new RuneCraftArmorItem(RunecraftArmorModel.Type.DRAGON, RunecraftArmorMaterials.DRAGON, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem GOLD_HELMET = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.GOLD, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem GOLD_CHESTPLATE = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.GOLD, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem GOLD_LEGGINGS = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.GOLD, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem GOLD_BOOTS = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.GOLD, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem IRON_HELMET = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.IRON, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem IRON_CHESTPLATE = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.IRON, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem IRON_LEGGINGS = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.IRON, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem IRON_BOOTS = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.IRON, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem MITHRIL_HELMET = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.MITHRIL, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem MITHRIL_CHESTPLATE = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.MITHRIL, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem MITHRIL_LEGGINGS = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.MITHRIL, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem MITHRIL_BOOTS = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.MITHRIL, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem RUNITE_HELMET = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.RUNITE, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem RUNITE_CHESTPLATE = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.RUNITE, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem RUNITE_LEGGINGS = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.RUNITE, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem RUNITE_BOOTS = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.RUNITE, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem SILVER_HELMET = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.SILVER, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem SILVER_CHESTPLATE = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.SILVER, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem SILVER_LEGGINGS = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.SILVER, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem SILVER_BOOTS = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.SILVER, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem STEEL_HELMET = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.STEEL, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem STEEL_CHESTPLATE = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.STEEL, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem STEEL_LEGGINGS = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.STEEL, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem STEEL_BOOTS = new RuneCraftArmorItem(RunecraftArmorModel.Type.PLATE, RunecraftArmorMaterials.STEEL, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem AHRIMS_HELMET = new RuneCraftArmorItem(RunecraftArmorModel.Type.AHRIMS, RunecraftArmorMaterials.AHRIMS, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem AHRIMS_CHESTPLATE = new RuneCraftArmorItem(RunecraftArmorModel.Type.AHRIMS, RunecraftArmorMaterials.AHRIMS, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem AHRIMS_LEGGINGS = new RuneCraftArmorItem(RunecraftArmorModel.Type.AHRIMS, RunecraftArmorMaterials.AHRIMS, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem AHRIMS_BOOTS = new RuneCraftArmorItem(RunecraftArmorModel.Type.AHRIMS, RunecraftArmorMaterials.AHRIMS, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem DHAROKS_HELMET = new RuneCraftArmorItem(RunecraftArmorModel.Type.DHAROKS, RunecraftArmorMaterials.DHAROKS, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem DHAROKS_CHESTPLATE = new RuneCraftArmorItem(RunecraftArmorModel.Type.DHAROKS, RunecraftArmorMaterials.DHAROKS, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem DHAROKS_LEGGINGS = new RuneCraftArmorItem(RunecraftArmorModel.Type.DHAROKS, RunecraftArmorMaterials.DHAROKS, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem DHAROKS_BOOTS = new RuneCraftArmorItem(RunecraftArmorModel.Type.DHAROKS, RunecraftArmorMaterials.DHAROKS, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem GUTHANS_HELMET = new RuneCraftArmorItem(RunecraftArmorModel.Type.GUTHANS, RunecraftArmorMaterials.GUTHANS, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem GUTHANS_CHESTPLATE = new RuneCraftArmorItem(RunecraftArmorModel.Type.GUTHANS, RunecraftArmorMaterials.GUTHANS, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem GUTHANS_LEGGINGS = new RuneCraftArmorItem(RunecraftArmorModel.Type.GUTHANS, RunecraftArmorMaterials.GUTHANS, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem GUTHANS_BOOTS = new RuneCraftArmorItem(RunecraftArmorModel.Type.GUTHANS, RunecraftArmorMaterials.GUTHANS, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem KHARILS_HELMET = new RuneCraftArmorItem(RunecraftArmorModel.Type.KHARILS, RunecraftArmorMaterials.KHARILS, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem KHARILS_CHESTPLATE = new RuneCraftArmorItem(RunecraftArmorModel.Type.KHARILS, RunecraftArmorMaterials.KHARILS, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem KHARILS_LEGGINGS = new RuneCraftArmorItem(RunecraftArmorModel.Type.KHARILS, RunecraftArmorMaterials.KHARILS, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem KHARILS_BOOTS = new RuneCraftArmorItem(RunecraftArmorModel.Type.KHARILS, RunecraftArmorMaterials.KHARILS, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem TORAGS_HELMET = new RuneCraftArmorItem(RunecraftArmorModel.Type.TORAGS, RunecraftArmorMaterials.TORAGS, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem TORAGS_CHESTPLATE = new RuneCraftArmorItem(RunecraftArmorModel.Type.TORAGS, RunecraftArmorMaterials.TORAGS, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem TORAGS_LEGGINGS = new RuneCraftArmorItem(RunecraftArmorModel.Type.TORAGS, RunecraftArmorMaterials.TORAGS, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem TORAGS_BOOTS = new RuneCraftArmorItem(RunecraftArmorModel.Type.TORAGS, RunecraftArmorMaterials.TORAGS, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem VERACS_HELMET = new RuneCraftArmorItem(RunecraftArmorModel.Type.VERACS, RunecraftArmorMaterials.VERACS, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem VERACS_CHESTPLATE = new RuneCraftArmorItem(RunecraftArmorModel.Type.VERACS, RunecraftArmorMaterials.VERACS, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem VERACS_LEGGINGS = new RuneCraftArmorItem(RunecraftArmorModel.Type.VERACS, RunecraftArmorMaterials.VERACS, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem VERACS_BOOTS = new RuneCraftArmorItem(RunecraftArmorModel.Type.VERACS, RunecraftArmorMaterials.VERACS, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem LEATHER_HELMET = new RuneCraftArmorItem(RunecraftArmorModel.Type.LEATHER, RunecraftArmorMaterials.LEATHER, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem LEATHER_CHESTPLATE = new RuneCraftArmorItem(RunecraftArmorModel.Type.LEATHER, RunecraftArmorMaterials.LEATHER, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem LEATHER_LEGGINGS = new RuneCraftArmorItem(RunecraftArmorModel.Type.LEATHER, RunecraftArmorMaterials.LEATHER, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem LEATHER_BOOTS = new RuneCraftArmorItem(RunecraftArmorModel.Type.LEATHER, RunecraftArmorMaterials.LEATHER, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem FROGLEATHER_CHESTPLATE = new RuneCraftArmorItem(RunecraftArmorModel.Type.FROGLEATHER, RunecraftArmorMaterials.FROGLEATHER, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem FROGLEATHER_LEGGINGS = new RuneCraftArmorItem(RunecraftArmorModel.Type.FROGLEATHER, RunecraftArmorMaterials.FROGLEATHER, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem FROGLEATHER_BOOTS = new RuneCraftArmorItem(RunecraftArmorModel.Type.FROGLEATHER, RunecraftArmorMaterials.FROGLEATHER, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem SNAKESKIN_HELMET = new RuneCraftArmorItem(RunecraftArmorModel.Type.SNAKESKIN, RunecraftArmorMaterials.SNAKESKIN, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem SNAKESKIN_CHESTPLATE = new RuneCraftArmorItem(RunecraftArmorModel.Type.SNAKESKIN, RunecraftArmorMaterials.SNAKESKIN, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem SNAKESKIN_LEGGINGS = new RuneCraftArmorItem(RunecraftArmorModel.Type.SNAKESKIN, RunecraftArmorMaterials.SNAKESKIN, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem SNAKESKIN_BOOTS = new RuneCraftArmorItem(RunecraftArmorModel.Type.SNAKESKIN, RunecraftArmorMaterials.SNAKESKIN, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem RANGER_HELMET = new RuneCraftArmorItem(RunecraftArmorModel.Type.RANGER, RunecraftArmorMaterials.RANGER, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem RANGER_CHESTPLATE = new RuneCraftArmorItem(RunecraftArmorModel.Type.RANGER, RunecraftArmorMaterials.RANGER, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem RANGER_LEGGINGS = new RuneCraftArmorItem(RunecraftArmorModel.Type.RANGER, RunecraftArmorMaterials.RANGER, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem RANGER_BOOTS = new RuneCraftArmorItem(RunecraftArmorModel.Type.RANGER, RunecraftArmorMaterials.RANGER, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem SARADOMINGHIDE_HELMET = new RuneCraftArmorItem(RunecraftArmorModel.Type.SARADOMINGHIDE, RunecraftArmorMaterials.SARADOMINGHIDE, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem SARADOMINGHIDE_CHESTPLATE = new RuneCraftArmorItem(RunecraftArmorModel.Type.SARADOMINGHIDE, RunecraftArmorMaterials.SARADOMINGHIDE, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem SARADOMINGHIDE_LEGGINGS = new RuneCraftArmorItem(RunecraftArmorModel.Type.SARADOMINGHIDE, RunecraftArmorMaterials.SARADOMINGHIDE, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem SARADOMINGHIDE_BOOTS = new RuneCraftArmorItem(RunecraftArmorModel.Type.SARADOMINGHIDE, RunecraftArmorMaterials.SARADOMINGHIDE, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem ZAMORAKGHIDE_HELMET = new RuneCraftArmorItem(RunecraftArmorModel.Type.ZAMORAKGHIDE, RunecraftArmorMaterials.ZAMORAKGHIDE, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem ZAMORAKGHIDE_CHESTPLATE = new RuneCraftArmorItem(RunecraftArmorModel.Type.ZAMORAKGHIDE, RunecraftArmorMaterials.ZAMORAKGHIDE, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem ZAMORAKGHIDE_LEGGINGS = new RuneCraftArmorItem(RunecraftArmorModel.Type.ZAMORAKGHIDE, RunecraftArmorMaterials.ZAMORAKGHIDE, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem ZAMORAKGHIDE_BOOTS = new RuneCraftArmorItem(RunecraftArmorModel.Type.ZAMORAKGHIDE, RunecraftArmorMaterials.ZAMORAKGHIDE, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem GUTHIXGHIDE_HELMET = new RuneCraftArmorItem(RunecraftArmorModel.Type.GUTHIXGHIDE, RunecraftArmorMaterials.GUTHIXGHIDE, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem GUTHIXGHIDE_CHESTPLATE = new RuneCraftArmorItem(RunecraftArmorModel.Type.GUTHIXGHIDE, RunecraftArmorMaterials.GUTHIXGHIDE, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem GUTHIXGHIDE_LEGGINGS = new RuneCraftArmorItem(RunecraftArmorModel.Type.GUTHIXGHIDE, RunecraftArmorMaterials.GUTHIXGHIDE, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem GUTHIXGHIDE_BOOTS = new RuneCraftArmorItem(RunecraftArmorModel.Type.GUTHIXGHIDE, RunecraftArmorMaterials.GUTHIXGHIDE, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static void register(){

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "adamantite_helmet"), ADAMANTITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "adamantite_chestplate"), ADAMANTITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "adamantite_leggings"), ADAMANTITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "adamantite_boots"), ADAMANTITE_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "bronze_helmet"), BRONZE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "bronze_chestplate"), BRONZE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "bronze_leggings"), BRONZE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "bronze_boots"), BRONZE_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "dragon_helmet"), DRAGON_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "dragon_chestplate"), DRAGON_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "dragon_leggings"), DRAGON_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "dragon_boots"), DRAGON_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "gold_helmet"), GOLD_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "gold_chestplate"), GOLD_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "gold_leggings"), GOLD_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "gold_boots"), GOLD_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "iron_helmet"), IRON_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "iron_chestplate"), IRON_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "iron_leggings"), IRON_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "iron_boots"), IRON_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "mithril_helmet"), MITHRIL_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "mithril_chestplate"), MITHRIL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "mithril_leggings"), MITHRIL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "mithril_boots"), MITHRIL_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "runite_helmet"), RUNITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "runite_chestplate"), RUNITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "runite_leggings"), RUNITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "runite_boots"), RUNITE_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "silver_helmet"), SILVER_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "silver_chestplate"), SILVER_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "silver_leggings"), SILVER_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "silver_boots"), SILVER_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "steel_helmet"), STEEL_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "steel_chestplate"), STEEL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "steel_leggings"), STEEL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "steel_boots"), STEEL_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "ahrims_helmet"), AHRIMS_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "ahrims_chestplate"), AHRIMS_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "ahrims_leggings"), AHRIMS_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "ahrims_boots"), AHRIMS_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "dharoks_helmet"), DHAROKS_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "dharoks_chestplate"), DHAROKS_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "dharoks_leggings"), DHAROKS_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "dharoks_boots"), DHAROKS_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "guthans_helmet"), GUTHANS_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "guthans_chestplate"), GUTHANS_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "guthans_leggings"), GUTHANS_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "guthans_boots"), GUTHANS_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "torags_helmet"), TORAGS_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "torags_chestplate"), TORAGS_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "torags_leggings"), TORAGS_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "torags_boots"), TORAGS_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "kharils_helmet"), KHARILS_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "kharils_chestplate"), KHARILS_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "kharils_leggings"), KHARILS_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "kharils_boots"), KHARILS_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "veracs_helmet"), VERACS_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "veracs_chestplate"), VERACS_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "veracs_leggings"), VERACS_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "veracs_boots"), VERACS_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "leather_helmet"), LEATHER_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "leather_chestplate"), LEATHER_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "leather_leggings"), LEATHER_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "leather_boots"), LEATHER_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "frogleather_chestplate"), FROGLEATHER_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "frogleather_leggings"), FROGLEATHER_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "frogleather_boots"), FROGLEATHER_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "snakeskin_helmet"), SNAKESKIN_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "snakeskin_chestplate"), SNAKESKIN_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "snakeskin_leggings"), SNAKESKIN_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "snakeskin_boots"), SNAKESKIN_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "ranger_helmet"), RANGER_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "ranger_chestplate"), RANGER_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "ranger_leggings"), RANGER_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "ranger_boots"), RANGER_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "saradominghide_helmet"), SARADOMINGHIDE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "saradominghide_chestplate"), SARADOMINGHIDE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "saradominghide_leggings"), SARADOMINGHIDE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "saradominghide_boots"), SARADOMINGHIDE_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "zamorakghide_helmet"), ZAMORAKGHIDE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "zamorakghide_chestplate"), ZAMORAKGHIDE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "zamorakghide_leggings"), ZAMORAKGHIDE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "zamorakghide_boots"), ZAMORAKGHIDE_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "guthixghide_helmet"), GUTHIXGHIDE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "guthixghide_chestplate"), GUTHIXGHIDE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "guthixghide_leggings"), GUTHIXGHIDE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "guthixghide_boots"), GUTHIXGHIDE_BOOTS);
    }

    // If this is not called, armor will get rendered as normal armor with re-texure!
    public static void render(){
        // Parameters for model provider
        // BipedEntityModel<LivingEntity> getArmorModel(LivingEntity entity, ItemStack stack, EquipmentSlot slot, BipedEntityModel<LivingEntity> defaultModel);

        ArmorRenderingRegistry.ModelProvider modelProvider = (entity, stack, slot, original) -> ((RuneCraftArmorItem) stack.getItem()).getArmorModel(entity, stack, slot, original);
        ArmorRenderingRegistry.TextureProvider textureProvider = (entity, stack, slot, secondLayer, suffix, original) -> new Identifier(((RuneCraftArmorItem) stack.getItem()).getArmorTexture(stack, slot));

        ArmorRenderingRegistry.registerModel(modelProvider, ADAMANTITE_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, ADAMANTITE_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, ADAMANTITE_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, ADAMANTITE_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, ADAMANTITE_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, ADAMANTITE_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, ADAMANTITE_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, ADAMANTITE_BOOTS);

        ArmorRenderingRegistry.registerModel(modelProvider, BRONZE_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, BRONZE_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, BRONZE_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, BRONZE_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, BRONZE_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, BRONZE_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, BRONZE_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, BRONZE_BOOTS);

        ArmorRenderingRegistry.registerModel(modelProvider, DRAGON_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, DRAGON_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, DRAGON_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, DRAGON_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, DRAGON_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, DRAGON_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, DRAGON_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, DRAGON_BOOTS);

        ArmorRenderingRegistry.registerModel(modelProvider, GOLD_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, GOLD_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, GOLD_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, GOLD_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, GOLD_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, GOLD_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, GOLD_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, GOLD_BOOTS);

        ArmorRenderingRegistry.registerModel(modelProvider, IRON_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, IRON_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, IRON_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, IRON_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, IRON_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, IRON_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, IRON_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, IRON_BOOTS);

        ArmorRenderingRegistry.registerModel(modelProvider, MITHRIL_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, MITHRIL_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, MITHRIL_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, MITHRIL_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, MITHRIL_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, MITHRIL_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, MITHRIL_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, MITHRIL_BOOTS);

        ArmorRenderingRegistry.registerModel(modelProvider, RUNITE_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, RUNITE_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, RUNITE_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, RUNITE_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, RUNITE_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, RUNITE_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, RUNITE_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, RUNITE_BOOTS);

        ArmorRenderingRegistry.registerModel(modelProvider, SILVER_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, SILVER_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, SILVER_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, SILVER_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, SILVER_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, SILVER_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, SILVER_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, SILVER_BOOTS);

        ArmorRenderingRegistry.registerModel(modelProvider, STEEL_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, STEEL_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, STEEL_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, STEEL_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, STEEL_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, STEEL_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, STEEL_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, STEEL_BOOTS);

        ArmorRenderingRegistry.registerModel(modelProvider, AHRIMS_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, AHRIMS_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, AHRIMS_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, AHRIMS_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, AHRIMS_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, AHRIMS_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, AHRIMS_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, AHRIMS_BOOTS);

        ArmorRenderingRegistry.registerModel(modelProvider, DHAROKS_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, DHAROKS_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, DHAROKS_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, DHAROKS_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, DHAROKS_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, DHAROKS_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, DHAROKS_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, DHAROKS_BOOTS);

        ArmorRenderingRegistry.registerModel(modelProvider, GUTHANS_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, GUTHANS_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, GUTHANS_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, GUTHANS_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, GUTHANS_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, GUTHANS_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, GUTHANS_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, GUTHANS_BOOTS);

        ArmorRenderingRegistry.registerModel(modelProvider, KHARILS_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, KHARILS_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, KHARILS_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, KHARILS_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, KHARILS_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, KHARILS_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, KHARILS_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, KHARILS_BOOTS);

        ArmorRenderingRegistry.registerModel(modelProvider, TORAGS_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, TORAGS_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, TORAGS_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, TORAGS_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, TORAGS_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, TORAGS_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, TORAGS_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, TORAGS_BOOTS);

        ArmorRenderingRegistry.registerModel(modelProvider, VERACS_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, VERACS_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, VERACS_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, VERACS_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, VERACS_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, VERACS_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, VERACS_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, VERACS_BOOTS);

        ArmorRenderingRegistry.registerModel(modelProvider, LEATHER_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, LEATHER_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, LEATHER_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, LEATHER_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, LEATHER_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, LEATHER_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, LEATHER_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, LEATHER_BOOTS);

        ArmorRenderingRegistry.registerModel(modelProvider, FROGLEATHER_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, FROGLEATHER_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, FROGLEATHER_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, FROGLEATHER_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, FROGLEATHER_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, FROGLEATHER_BOOTS);

        ArmorRenderingRegistry.registerModel(modelProvider, SNAKESKIN_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, SNAKESKIN_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, SNAKESKIN_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, SNAKESKIN_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, SNAKESKIN_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, SNAKESKIN_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, SNAKESKIN_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, SNAKESKIN_BOOTS);

        ArmorRenderingRegistry.registerModel(modelProvider, RANGER_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, RANGER_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, RANGER_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, RANGER_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, RANGER_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, RANGER_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, RANGER_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, RANGER_BOOTS);

        ArmorRenderingRegistry.registerModel(modelProvider, SARADOMINGHIDE_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, SARADOMINGHIDE_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, SARADOMINGHIDE_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, SARADOMINGHIDE_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, SARADOMINGHIDE_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, SARADOMINGHIDE_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, SARADOMINGHIDE_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, SARADOMINGHIDE_BOOTS);

        ArmorRenderingRegistry.registerModel(modelProvider, ZAMORAKGHIDE_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, ZAMORAKGHIDE_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, ZAMORAKGHIDE_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, ZAMORAKGHIDE_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, ZAMORAKGHIDE_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, ZAMORAKGHIDE_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, ZAMORAKGHIDE_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, ZAMORAKGHIDE_BOOTS);

        ArmorRenderingRegistry.registerModel(modelProvider, GUTHIXGHIDE_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, GUTHIXGHIDE_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, GUTHIXGHIDE_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, GUTHIXGHIDE_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, GUTHIXGHIDE_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, GUTHIXGHIDE_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, GUTHIXGHIDE_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, GUTHIXGHIDE_BOOTS);
    }
}
