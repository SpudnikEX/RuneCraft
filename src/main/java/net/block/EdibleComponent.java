package net.block;

import net.minecraft.item.FoodComponent;

public class EdibleComponent {

    public static final FoodComponent RAW_MEAT = new FoodComponent.Builder().hunger(2).saturationModifier(6).build();
    public static final FoodComponent COOKED_MEAT = new FoodComponent.Builder().hunger(8).saturationModifier(12).build();

    public static final FoodComponent RAW_CHICKEN = new FoodComponent.Builder().hunger(2).saturationModifier(6).build();
    public static final FoodComponent COOKED_CHICKEN = new FoodComponent.Builder().hunger(8).saturationModifier(12).build();

    public static final FoodComponent RAW_RABBIT = new FoodComponent.Builder().hunger(2).saturationModifier(6).build();
    public static final FoodComponent COOKED_RABBIT = new FoodComponent.Builder().hunger(8).saturationModifier(12).build();
}
