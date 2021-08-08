//package net.block;
//
//import net.entity.ForgeBlockEntity;
//import net.minecraft.block.*;
//import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
//import net.minecraft.block.entity.BlockEntity;
//import net.minecraft.block.entity.FurnaceBlockEntity;
//import net.minecraft.entity.LivingEntity;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.inventory.Inventory;
//import net.minecraft.item.ItemPlacementContext;
//import net.minecraft.item.ItemStack;
//import net.minecraft.screen.NamedScreenHandlerFactory;
//import net.minecraft.screen.ScreenHandler;
//import net.minecraft.stat.Stats;
//import net.minecraft.state.property.BooleanProperty;
//import net.minecraft.state.property.DirectionProperty;
//import net.minecraft.state.property.Properties;
//import net.minecraft.util.ActionResult;
//import net.minecraft.util.Hand;
//import net.minecraft.util.ItemScatterer;
//import net.minecraft.util.hit.BlockHitResult;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.math.Vec3d;
//import net.minecraft.world.BlockView;
//import net.minecraft.world.World;
//import org.jetbrains.annotations.Nullable;
//
///**
// * See {@link AbstractFurnaceBlock} & {@link FurnaceBlock}
// */
//public class ForgeBlock extends BlockWithEntity {
//
//    private static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
//    public static final BooleanProperty LIT = Properties.LIT;
//
//    protected float speed = 1;
//    protected float fuel = 1;
//    protected float dupe = 1;
//
////    public ForgeBlock(Settings settings, float speedMultiplier, float fuelMultiplier, float dupeChance) {
////        super(settings);
////
////        this.speed = speedMultiplier;
////        this.fuel = fuelMultiplier;
////        this.dupe = dupeChance;
////    }
//
//    public ForgeBlock(Settings settings){
//        super(settings);
//    }
//
//    @Nullable
//    @Override
//    public BlockEntity createBlockEntity(BlockView world) {
//        return new ForgeBlockEntity();
//    }
//
//    public BlockRenderType getRenderType(BlockState state) {
//        return BlockRenderType.MODEL;
//    }
//
//    @Override
//    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
//        if (world.isClient) {
//            return ActionResult.SUCCESS;
//        } else {
//            this.openScreen(world, pos, player);
//            return ActionResult.CONSUME;
//        }
//    }
//
//
//    public void openScreen(World world, BlockPos pos, PlayerEntity player) {
//        BlockEntity blockEntity = world.getBlockEntity(pos);
//        if (blockEntity instanceof ForgeBlockEntity) {
//            player.openHandledScreen((NamedScreenHandlerFactory)blockEntity);
//            // Optional
//            //player.incrementStat(Stats.INTERACT_WITH_FURNACE);
//        }
//    }
//
////    public BlockState getPlacementState(ItemPlacementContext ctx) {
////        return (BlockState)this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
////    }
//
//    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
//        if (itemStack.hasCustomName()) {
//            BlockEntity blockEntity = world.getBlockEntity(pos);
//            if (blockEntity instanceof ForgeBlockEntity) {
//                ((ForgeBlockEntity)blockEntity).setCustomName(itemStack.getName());
//            }
//        }
//
//    }
//
//    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
//        if (!state.isOf(newState.getBlock())) {
//            BlockEntity blockEntity = world.getBlockEntity(pos);
//            if (blockEntity instanceof ForgeBlockEntity) {
//                ItemScatterer.spawn(world, (BlockPos)pos, (Inventory)((ForgeBlockEntity)blockEntity));
//                ((ForgeBlockEntity)blockEntity).method_27354(world, Vec3d.ofCenter(pos));
//                world.updateComparators(pos, this);
//            }
//            super.onStateReplaced(state, world, pos, newState, moved);
//        }
//    }
//
//    public boolean hasComparatorOutput(BlockState state) {
//        return true;
//    }
//
//    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
//        return ScreenHandler.calculateComparatorOutput(world.getBlockEntity(pos));
//    }
//
//}
