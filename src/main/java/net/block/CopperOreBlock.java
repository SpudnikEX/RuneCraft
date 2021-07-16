package net.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class CopperOreBlock extends Block {
    
    public CopperOreBlock(Settings settings) {
        super(settings);
    }

    private int getExperienceWhenMined(Random random){
        return MathHelper.nextInt(random,0,2);
    }

    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
        super.onStacksDropped(state, world, pos, stack);
        if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
            int i = this.getExperienceWhenMined(world.random);
            if (i > 0) {
                this.dropExperience(world, pos, i);
            }
        }

    }
}
