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


    public static void register(){
        //Registry.register(Registry.ITEM,new Identifier(RuneCraft.MOD_ID,"bronze_helmet"),BRONZE_HELMET);

        //Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "hallowed_helmet"), HALLOWED_HELMET);
        //Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "hallowed_chestplate"), HALLOWED_CHESTPLATE);
        //Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "hallowed_leggings"), HALLOWED_LEGGINGS);
        //Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "hallowed_boots"), HALLOWED_BOOTS);

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
    }
}
