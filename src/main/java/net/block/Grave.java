//package net.block;
//
//import net.entity.GraveBlockEntity;
//import net.minecraft.block.Block;
//import net.minecraft.block.BlockState;
//import net.minecraft.block.Blocks;
//import net.minecraft.block.entity.BlockEntity;
//import net.minecraft.block.entity.ChestBlockEntity;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.item.ItemStack;
//import net.minecraft.state.property.Properties;
//import net.minecraft.util.collection.DefaultedList;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.math.Vec3d;
//import net.minecraft.util.math.Vec3i;
//import net.minecraft.world.World;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class Grave {
//
//    public static void place(World world, Vec3d pos, PlayerEntity player) {
//        if (world.isClient) return;
//
//        BlockPos blockPos = new BlockPos(pos.x, pos.y - 1, pos.z);
//
//        BlockState blockState = world.getBlockState(blockPos);
//        Block block = blockState.getBlock();
//
//        //GravestoneBlockEntity gravestoneBlockEntity = new GravestoneBlockEntity();
//        GraveBlockEntity graveBlockEntity = new GraveBlockEntity();
//
//        DefaultedList<ItemStack> combinedInventory = DefaultedList.of();
//
//        combinedInventory.addAll(player.inventory.main);
//        combinedInventory.addAll(player.inventory.armor);
//        combinedInventory.addAll(player.inventory.offHand);
//
//        for (GravestonesApi gravestonesApi : Gravestones.apiMods) {
//            combinedInventory.addAll(gravestonesApi.getInventory(player));
//        }
//
//        graveBlockEntity.setItems(combinedInventory);
//        graveBlockEntity.setGraveOwner(player.getGameProfile());
//        graveBlockEntity.setXp(player.totalExperience);
//
//        player.totalExperience = 0;
//        player.experienceProgress = 0;
//        player.experienceLevel = 0;
//
//        if(blockPos.getY() < 0) {
//            blockPos = new BlockPos(blockPos.getX(), 10, blockPos.getZ());
//        }
//
//        for (BlockPos gravePos : BlockPos.iterateOutwards(blockPos.add(new Vec3i(0, 1, 0)), 5, 5, 5)) {
//            if(canPlace(world, block, gravePos)) {
//                world.setBlockState(gravePos, Gravestones.GRAVESTONE.getDefaultState().with(Properties.HORIZONTAL_FACING, player.getHorizontalFacing()));
//                world.setBlockEntity(gravePos, gravestoneBlockEntity);
//
//                gravestoneBlockEntity.sync();
//                block.onBreak(world, blockPos, blockState, player);
//
//                if (GravestonesConfig.getConfig().mainSettings.sendGraveCoordinates) {
//                    player.sendMessage(new TranslatableText("text.gravestones.grave_coordinates", gravePos.getX(), gravePos.getY(), gravePos.getZ()), false);
//                }
//                System.out.println("[Gravestones] Gravestone spawned at: " + gravePos.getX() + ", " + gravePos.getY() + ", " + gravePos.getZ());
//
//                break;
//            }
//        }
//    }
//
//    private static boolean canPlace(World world, Block block, BlockPos blockPos) {
//        BlockEntity blockEntity = world.getBlockEntity(blockPos);
//
//        if(blockEntity != null) return false;
//
//        Set<Block> blackListedBlocks = new HashSet<Block>() {{
//            add(Blocks.BEDROCK);
//        }};
//
//        if(blackListedBlocks.contains(block)) return false;
//
//        return !(blockPos.getY() < 0 || blockPos.getY() > 255);
//    }
//}
