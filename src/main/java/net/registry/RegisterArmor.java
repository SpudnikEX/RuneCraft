package net.registry;

import net.RuneCraft;
//import net.armor.BronzeArmorModel;
import net.armor.*;
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

    public static final ArmorItem ADAMANTITE_HELMET = new AdamantiteArmor(RunecraftArmorMaterials.ADAMANTITE, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem ADAMANTITE_CHESTPLATE = new AdamantiteArmor(RunecraftArmorMaterials.ADAMANTITE, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem ADAMANTITE_LEGGINGS = new AdamantiteArmor(RunecraftArmorMaterials.ADAMANTITE, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem ADAMANTITE_BOOTS = new AdamantiteArmor(RunecraftArmorMaterials.ADAMANTITE, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem BRONZE_HELMET = new BronzeArmor(RunecraftArmorMaterials.BRONZE, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem BRONZE_CHESTPLATE = new BronzeArmor(RunecraftArmorMaterials.BRONZE, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem BRONZE_LEGGINGS = new BronzeArmor(RunecraftArmorMaterials.BRONZE, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem BRONZE_BOOTS = new BronzeArmor(RunecraftArmorMaterials.BRONZE, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem DRAGON_HELMET = new DragonArmor(RunecraftArmorMaterials.DRAGON, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem DRAGON_CHESTPLATE = new DragonArmor(RunecraftArmorMaterials.DRAGON, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem DRAGON_LEGGINGS = new DragonArmor(RunecraftArmorMaterials.DRAGON, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem DRAGON_BOOTS = new DragonArmor(RunecraftArmorMaterials.DRAGON, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem GOLD_HELMET = new GoldArmor(RunecraftArmorMaterials.GOLD, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem GOLD_CHESTPLATE = new GoldArmor(RunecraftArmorMaterials.GOLD, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem GOLD_LEGGINGS = new GoldArmor(RunecraftArmorMaterials.GOLD, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem GOLD_BOOTS = new GoldArmor(RunecraftArmorMaterials.GOLD, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem IRON_HELMET = new IronArmor(RunecraftArmorMaterials.IRON, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem IRON_CHESTPLATE = new IronArmor(RunecraftArmorMaterials.IRON, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem IRON_LEGGINGS = new IronArmor(RunecraftArmorMaterials.IRON, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem IRON_BOOTS = new IronArmor(RunecraftArmorMaterials.IRON, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem MITHRIL_HELMET = new MithrilArmor(RunecraftArmorMaterials.MITHRIL, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem MITHRIL_CHESTPLATE = new MithrilArmor(RunecraftArmorMaterials.MITHRIL, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem MITHRIL_LEGGINGS = new MithrilArmor(RunecraftArmorMaterials.MITHRIL, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem MITHRIL_BOOTS = new MithrilArmor(RunecraftArmorMaterials.MITHRIL, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem RUNITE_HELMET = new RuniteArmor(RunecraftArmorMaterials.RUNITE, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem RUNITE_CHESTPLATE = new RuniteArmor(RunecraftArmorMaterials.RUNITE, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem RUNITE_LEGGINGS = new RuniteArmor(RunecraftArmorMaterials.RUNITE, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem RUNITE_BOOTS = new RuniteArmor(RunecraftArmorMaterials.RUNITE, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem SILVER_HELMET = new SilverArmor(RunecraftArmorMaterials.SILVER, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem SILVER_CHESTPLATE = new SilverArmor(RunecraftArmorMaterials.SILVER, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem SILVER_LEGGINGS = new SilverArmor(RunecraftArmorMaterials.SILVER, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem SILVER_BOOTS = new SilverArmor(RunecraftArmorMaterials.SILVER, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem STEEL_HELMET = new SteelArmor(RunecraftArmorMaterials.STEEL, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem STEEL_CHESTPLATE = new SteelArmor(RunecraftArmorMaterials.STEEL, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem STEEL_LEGGINGS = new SteelArmor(RunecraftArmorMaterials.STEEL, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem STEEL_BOOTS = new SteelArmor(RunecraftArmorMaterials.STEEL, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));

    public static final ArmorItem HALLOWED_HELMET = new HallowedArmor(RunecraftArmorMaterials.HALLOW, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem HALLOWED_CHESTPLATE = new HallowedArmor(RunecraftArmorMaterials.HALLOW, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem HALLOWED_LEGGINGS = new HallowedArmor(RunecraftArmorMaterials.HALLOW, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.ARMORS)));
    public static final ArmorItem HALLOWED_BOOTS = new HallowedArmor(RunecraftArmorMaterials.HALLOW, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.ARMORS)));


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

    }

    // If this is not called, armor will get rendered as normal armor with re-texure!
    public static void render(){
        // Parameters for model provider
        // BipedEntityModel<LivingEntity> getArmorModel(LivingEntity entity, ItemStack stack, EquipmentSlot slot, BipedEntityModel<LivingEntity> defaultModel);

        ArmorRenderingRegistry.ModelProvider modelProvider = (entity, stack, slot, original) -> ((HallowedArmor) stack.getItem()).getArmorModel(entity, stack, slot, original);
        ArmorRenderingRegistry.TextureProvider textureProvider = (entity, stack, slot, secondLayer, suffix, original) -> new Identifier(((HallowedArmor) stack.getItem()).getArmorTexture(stack, slot));
        ArmorRenderingRegistry.registerModel(modelProvider, HALLOWED_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, HALLOWED_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, HALLOWED_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, HALLOWED_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, HALLOWED_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, HALLOWED_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, HALLOWED_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, HALLOWED_BOOTS);

        modelProvider = (entity, stack, slot, original) -> ((AdamantiteArmor) stack.getItem()).getArmorModel(entity, stack, slot, original);
        textureProvider = (entity, stack, slot, secondLayer, suffix, original) -> new Identifier(((AdamantiteArmor) stack.getItem()).getArmorTexture(stack, slot));
        ArmorRenderingRegistry.registerModel(modelProvider, ADAMANTITE_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, ADAMANTITE_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, ADAMANTITE_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, ADAMANTITE_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, ADAMANTITE_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, ADAMANTITE_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, ADAMANTITE_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, ADAMANTITE_BOOTS);

        modelProvider = (entity, stack, slot, original) -> ((BronzeArmor) stack.getItem()).getArmorModel(entity, stack, slot, original);
        textureProvider = (entity, stack, slot, secondLayer, suffix, original) -> new Identifier(((BronzeArmor) stack.getItem()).getArmorTexture(stack, slot));
        ArmorRenderingRegistry.registerModel(modelProvider, BRONZE_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, BRONZE_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, BRONZE_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, BRONZE_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, BRONZE_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, BRONZE_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, BRONZE_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, BRONZE_BOOTS);

        modelProvider = (entity, stack, slot, original) -> ((DragonArmor) stack.getItem()).getArmorModel(entity, stack, slot, original);
        textureProvider = (entity, stack, slot, secondLayer, suffix, original) -> new Identifier(((DragonArmor) stack.getItem()).getArmorTexture(stack, slot));
        ArmorRenderingRegistry.registerModel(modelProvider, DRAGON_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, DRAGON_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, DRAGON_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, DRAGON_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, DRAGON_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, DRAGON_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, DRAGON_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, DRAGON_BOOTS);

        modelProvider = (entity, stack, slot, original) -> ((GoldArmor) stack.getItem()).getArmorModel(entity, stack, slot, original);
        textureProvider = (entity, stack, slot, secondLayer, suffix, original) -> new Identifier(((GoldArmor) stack.getItem()).getArmorTexture(stack, slot));
        ArmorRenderingRegistry.registerModel(modelProvider, GOLD_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, GOLD_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, GOLD_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, GOLD_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, GOLD_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, GOLD_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, GOLD_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, GOLD_BOOTS);

        modelProvider = (entity, stack, slot, original) -> ((IronArmor) stack.getItem()).getArmorModel(entity, stack, slot, original);
        textureProvider = (entity, stack, slot, secondLayer, suffix, original) -> new Identifier(((IronArmor) stack.getItem()).getArmorTexture(stack, slot));
        ArmorRenderingRegistry.registerModel(modelProvider, IRON_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, IRON_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, IRON_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, IRON_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, IRON_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, IRON_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, IRON_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, IRON_BOOTS);

        modelProvider = (entity, stack, slot, original) -> ((MithrilArmor) stack.getItem()).getArmorModel(entity, stack, slot, original);
        textureProvider = (entity, stack, slot, secondLayer, suffix, original) -> new Identifier(((MithrilArmor) stack.getItem()).getArmorTexture(stack, slot));
        ArmorRenderingRegistry.registerModel(modelProvider, MITHRIL_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, MITHRIL_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, MITHRIL_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, MITHRIL_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, MITHRIL_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, MITHRIL_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, MITHRIL_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, MITHRIL_BOOTS);

        modelProvider = (entity, stack, slot, original) -> ((RuniteArmor) stack.getItem()).getArmorModel(entity, stack, slot, original);
        textureProvider = (entity, stack, slot, secondLayer, suffix, original) -> new Identifier(((RuniteArmor) stack.getItem()).getArmorTexture(stack, slot));
        ArmorRenderingRegistry.registerModel(modelProvider, RUNITE_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, RUNITE_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, RUNITE_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, RUNITE_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, RUNITE_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, RUNITE_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, RUNITE_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, RUNITE_BOOTS);

        modelProvider = (entity, stack, slot, original) -> ((SilverArmor) stack.getItem()).getArmorModel(entity, stack, slot, original);
        textureProvider = (entity, stack, slot, secondLayer, suffix, original) -> new Identifier(((SilverArmor) stack.getItem()).getArmorTexture(stack, slot));
        ArmorRenderingRegistry.registerModel(modelProvider, SILVER_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, SILVER_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, SILVER_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, SILVER_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, SILVER_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, SILVER_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, SILVER_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, SILVER_BOOTS);

        modelProvider = (entity, stack, slot, original) -> ((SteelArmor) stack.getItem()).getArmorModel(entity, stack, slot, original);
        textureProvider = (entity, stack, slot, secondLayer, suffix, original) -> new Identifier(((SteelArmor) stack.getItem()).getArmorTexture(stack, slot));
        ArmorRenderingRegistry.registerModel(modelProvider, STEEL_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, STEEL_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, STEEL_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, STEEL_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, STEEL_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, STEEL_LEGGINGS);
        ArmorRenderingRegistry.registerModel(modelProvider, STEEL_BOOTS);
        ArmorRenderingRegistry.registerTexture(textureProvider, STEEL_BOOTS);
    }
}
