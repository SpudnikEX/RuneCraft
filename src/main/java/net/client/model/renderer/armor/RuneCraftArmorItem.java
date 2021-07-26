package net.client.model.renderer.armor;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class RuneCraftArmorItem extends ArmorItem {

    @Environment(EnvType.CLIENT)
    private BipedEntityModel<LivingEntity> model;
    public final EquipmentSlot slot;
    private final RunecraftArmorModel.Type type;
    private final RunecraftArmorMaterials material;


    public RuneCraftArmorItem(RunecraftArmorModel.Type type, RunecraftArmorMaterials material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
        this.slot = slot;
        this.type = type;
        this.material = material;
    }

    @Environment(EnvType.CLIENT)
    public BipedEntityModel<LivingEntity> getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlot armorSlot, BipedEntityModel<LivingEntity> original) {
        if (model == null) {
            model = provideArmorModelForSlot(slot);
        }
        return model;
    }

    @Environment(EnvType.CLIENT)
    protected BipedEntityModel<LivingEntity> provideArmorModelForSlot(EquipmentSlot slot) {
        return getType(slot);
    }

    @NotNull
    public final String getArmorTexture(ItemStack stack, EquipmentSlot slot) {
        String path = "runecraft:textures/item/armor/";
        if(material != null && material.getName() != null)
            return path + material.getName() + "/" + material.getName() + "_model.png";
        else
            return "minecraft:textures/item/armor/iron_layer_1"; // fallback
    }

    protected RunecraftArmorModel getType(EquipmentSlot slot){
        switch (type){
            case PLATE -> {
                return new PlateArmorModel(slot);
            }
            case DRAGON -> {
                return new DragonArmorModel(slot);
            }
            case AHRIMS -> {
                return new AhrimsArmorModel(slot);
            }
            case DHAROKS -> {
                return new DharoksArmorModel(slot);
            }
            case GUTHANS -> {
                return new GuthansArmorModel(slot);
            }
            case KHARILS -> {
                return new KharilsArmorModel(slot);
            }
            case TORAGS -> {
                return new ToragsArmorModel(slot);
            }
            case VERACS -> {
                return new VeracsArmorModel(slot);
            }
            case LEATHER -> {
                return new LeatherArmorModel(slot);
            }
            case FROGLEATHER -> {
                return new FrogleatherArmorModel(slot);
            }
            case SNAKESKIN -> {
                return new SnakeskinArmorModel(slot);
            }
            case RANGER -> {
                return new RangerArmorModel(slot);
            }
            case SARADOMINGHIDE -> {
                return new SaradominghideArmorModel(slot);
            }
            case ZAMORAKGHIDE -> {
                return new ZamorakghideArmorModel(slot);
            }
            case GUTHIXGHIDE -> {
                return new GuthixghideArmorModel(slot);
            }
            default -> {
                return new RunecraftArmorModel(slot);
            }
        }
    }
}
