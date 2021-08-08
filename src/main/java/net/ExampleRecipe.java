package net;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class ExampleRecipe implements Recipe<Inventory> {

    /**
     * Determines whether this recipe matches the contents currently placed inside the available crafting grid.
     *
     * @param inventory
     * @param world
     */
    @Override
    public boolean matches(Inventory inventory, World world) {
        return false;
    }

    /**
     * Crafts this recipe.
     *
     * <p>This method may perform side effects on the {@code inventory} argument.</p>
     *
     * <p>This method should return a new item stack on each call.</p>
     *
     * @param inventory
     * @return the resulting item stack
     */
    @Override
    public ItemStack craft(Inventory inventory) {
        return null;
    }

    /**
     * Determines whether this recipe's pattern will fit into the available crafting area.
     *
     * @param width
     * @param height
     */
    @Override
    public boolean fits(int width, int height) {
        return false;
    }

    @Override
    public ItemStack getOutput() {
        return null;
    }

    @Override
    public Identifier getId() {
        return null;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return null;
    }

    @Override
    public RecipeType<?> getType() {
        return null;
    }
}
