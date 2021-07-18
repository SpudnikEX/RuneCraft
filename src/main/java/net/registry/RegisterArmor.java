package net.registry;

import net.RuneCraft;
//import net.armor.BronzeArmorModel;
import net.armor.BronzeArmorMaterial;
import net.armor.HallowedArmor;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderingRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterArmor {

    public static final ArmorMaterial CUSTOM_ARMOR_MATERIAL = new BronzeArmorMaterial() {
    };
    public static final ArmorItem BRONZE_HELMET = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(RuneCraft.MOD_GROUP));

    public static final ArmorItem HALLOWED_HELMET = new HallowedArmor(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings().group(RuneCraft.MOD_GROUP)));
    public static final ArmorItem HALLOWED_CHESTPLATE = new HallowedArmor(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings().group(RuneCraft.MOD_GROUP)));
    public static final ArmorItem HALLOWED_LEGGINGS = new HallowedArmor(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings().group(RuneCraft.MOD_GROUP)));
    public static final ArmorItem HALLOWED_BOOTS = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings().group(RuneCraft.MOD_GROUP)));

    public static final Item CUSTOM_MATERIAL_HELMET = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item CUSTOM_MATERIAL_CHESTPLATE = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item CUSTOM_MATERIAL_LEGGINGS = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item CUSTOM_MATERIAL_BOOTS = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));


    public static void register(){
        Registry.register(Registry.ITEM,new Identifier(RuneCraft.MOD_ID,"bronze_helmet"),BRONZE_HELMET);

        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "hallowed_helmet"), HALLOWED_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "hallowed_chestplate"), HALLOWED_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "hallowed_leggings"), HALLOWED_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RuneCraft.MOD_ID, "hallowed_boots"), HALLOWED_BOOTS);

        Registry.register(Registry.ITEM, new Identifier("runecraft", "custom_material_helmet"), CUSTOM_MATERIAL_HELMET);
        Registry.register(Registry.ITEM, new Identifier("runecraft", "custom_material_chestplate"), CUSTOM_MATERIAL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("runecraft", "custom_material_leggings"), CUSTOM_MATERIAL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("runecraft", "custom_material_boots"), CUSTOM_MATERIAL_BOOTS);

        renderArmorModels();
    }

    public static void renderArmorModels(){
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



//        Registering an Item Color Provider
//
//        Items are similar; the difference is the context provided. Instead of having a state, world, or position, you have access to the ItemStack.
//
//                ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x3495eb, COLORED_ITEM);
    }
}
