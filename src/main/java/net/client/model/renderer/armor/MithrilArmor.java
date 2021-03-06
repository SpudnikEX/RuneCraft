package net.client.model.renderer.armor;

import net.client.model.renderer.armor.model.PlateArmorModel;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class MithrilArmor extends ArmorItem {
    @Environment(EnvType.CLIENT)
    private BipedEntityModel<LivingEntity> model;
    public final EquipmentSlot type;


    public MithrilArmor(ArmorMaterial mat, EquipmentSlot type, Settings props) {
        super(mat, type, props);
        this.type = type;
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
        return new PlateArmorModel(slot);
    }

    @NotNull
    public final String getArmorTexture(ItemStack stack, EquipmentSlot slot) {
        return "runecraft:textures/item/armor/mithril/mithril_model.png";
    } // textures/models/armor/bronze_model.png
}
