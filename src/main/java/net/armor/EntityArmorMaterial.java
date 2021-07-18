package net.armor;

import net.RuneCraft;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.registry.RegisterMaterials;

public class EntityArmorMaterial implements ArmorMaterial {
    // private static final int[] PROTECTION_VALUES = new int[] {A, B, C, D};
    // In which A is helmet, B chestplate, C leggings and D boots.
    // For reference, Leather uses {1, 2, 3, 1}, and Diamond/Netherite {3, 6, 8, 3}

    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[] {3, 6, 8, 3};
    private static int multi = 1;

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * multi;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return multi;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
        // Edit to use sound per item?
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(RegisterMaterials.BRONZE_BAR);
    }

    @Override
    public String getName() {
        return "bronze";
    }

    @Override
    public float getToughness() {
        return 1.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
