//package net.entity;
//
//import com.google.common.collect.Lists;
//import com.google.common.collect.Maps;
//import it.unimi.dsi.fastutil.objects.Object2IntMap;
//import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
//import it.unimi.dsi.fastutil.objects.ObjectIterator;
//import net.minecraft.SharedConstants;
//import net.minecraft.block.Blocks;
//import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
//import net.minecraft.block.entity.BlockEntityType;
//import net.minecraft.block.entity.LockableContainerBlockEntity;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.entity.player.PlayerInventory;
//import net.minecraft.inventory.SidedInventory;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemConvertible;
//import net.minecraft.item.ItemStack;
//import net.minecraft.item.Items;
//import net.minecraft.recipe.*;
//import net.minecraft.screen.FurnaceScreenHandler;
//import net.minecraft.screen.PropertyDelegate;
//import net.minecraft.screen.ScreenHandler;
//import net.minecraft.tag.ItemTags;
//import net.minecraft.tag.Tag;
//import net.minecraft.text.Text;
//import net.minecraft.util.Identifier;
//import net.minecraft.util.Tickable;
//import net.minecraft.util.Util;
//import net.minecraft.util.collection.DefaultedList;
//import net.minecraft.util.math.Direction;
//import net.minecraft.util.math.Vec3d;
//import net.minecraft.world.World;
//import net.registry.RegisterDebug;
//import net.screen.ForgeScreenHandler;
//import org.jetbrains.annotations.Nullable;
//
//import java.util.List;
//import java.util.Map;
//
///**
// * {@link AbstractFurnaceBlockEntity}
// */
//public class ForgeBlockEntity  extends LockableContainerBlockEntity implements SidedInventory, RecipeUnlocker, RecipeInputProvider, Tickable {
//
//    private static final int[] TOP_SLOTS = new int[]{0};
//    private static final int[] BOTTOM_SLOTS = new int[]{2, 1};
//    private static final int[] SIDE_SLOTS = new int[]{1};
//    protected DefaultedList<ItemStack> inventory = DefaultedList.ofSize(12,ItemStack.EMPTY);
//    private int burnTime;
//    private int fuelTime;
//    private int cookTime;
//    private int cookTimeTotal;
//    protected final PropertyDelegate propertyDelegate;
//    private final Object2IntOpenHashMap<Identifier> recipesUsed;
//    protected final RecipeType<? extends AbstractCookingRecipe> recipeType;
//
//
//    public ForgeBlockEntity() {
//        this(RegisterDebug.FORGE_BLOCK_ENTITY, RecipeType.SMELTING);
//    }
//
//    protected ForgeBlockEntity(BlockEntityType<?> blockEntityType, RecipeType<? extends AbstractCookingRecipe> recipeType) {
//        super(blockEntityType);
//        this.inventory = DefaultedList.ofSize(3, ItemStack.EMPTY);
//        this.propertyDelegate = new PropertyDelegate() {
//            public int get(int index) {
//                switch(index) {
//                    case 0:
//                        return ForgeBlockEntity.this.burnTime;
//                    case 1:
//                        return ForgeBlockEntity.this.fuelTime;
//                    case 2:
//                        return ForgeBlockEntity.this.cookTime;
//                    case 3:
//                        return ForgeBlockEntity.this.cookTimeTotal;
//                    default:
//                        return 0;
//                }
//            }
//
//            public void set(int index, int value) {
//                switch(index) {
//                    case 0:
//                        ForgeBlockEntity.this.burnTime = value;
//                        break;
//                    case 1:
//                        ForgeBlockEntity.this.fuelTime = value;
//                        break;
//                    case 2:
//                        ForgeBlockEntity.this.cookTime = value;
//                        break;
//                    case 3:
//                        ForgeBlockEntity.this.cookTimeTotal = value;
//                }
//
//            }
//
//            public int size() {
//                return 4;
//            }
//        };
//        this.recipesUsed = new Object2IntOpenHashMap();
//        this.recipeType = recipeType;
//    }
//
//    public static Map<Item, Integer> createFuelTimeMap() {
//        Map<Item, Integer> map = Maps.newLinkedHashMap();
//        addFuel(map, (ItemConvertible)Items.COAL, 1600);
//        addFuel(map, (ItemConvertible)Items.CHARCOAL, 1600);
//        return map;
//    }
//
//    private static void addFuel(Map<Item, Integer> fuelTimes, ItemConvertible item, int fuelTime) {
//        Item item2 = item.asItem();
//        fuelTimes.put(item2, fuelTime);
//    }
//
//    @Override
//    protected Text getContainerName() {
//        return null;
//    }
//
//    @Override
//    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
//        return new ForgeScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
//    }
//
//    /**
//     * Gets the available slot positions that are reachable from a given side.
//     *
//     * @param side
//     */
//    @Override
//    public int[] getAvailableSlots(Direction side) {
//        return new int[0];
//    }
//
//    /**
//     * Determines whether the given stack can be inserted into this inventory at the specified slot position from the given direction.
//     *
//     * @param slot
//     * @param stack
//     * @param dir
//     */
//    @Override
//    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction dir) {
//        return false;
//    }
//
//    /**
//     * Determines whether the given stack can be removed from this inventory at the specified slot position from the given direction.
//     *
//     * @param slot
//     * @param stack
//     * @param dir
//     */
//    @Override
//    public boolean canExtract(int slot, ItemStack stack, Direction dir) {
//        return false;
//    }
//
//    @Override
//    public int size() {
//        return 0;
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return false;
//    }
//
//    /**
//     * Fetches the stack currently stored at the given slot. If the slot is empty,
//     * or is outside the bounds of this inventory, returns see {@link ItemStack#EMPTY}.
//     *
//     * @param slot
//     */
//    @Override
//    public ItemStack getStack(int slot) {
//        return null;
//    }
//
//    /**
//     * Removes a specific number of items from the given slot.
//     *
//     * @param slot
//     * @param amount
//     * @return the removed items as a stack
//     */
//    @Override
//    public ItemStack removeStack(int slot, int amount) {
//        return null;
//    }
//
//    /**
//     * Removes the stack currently stored at the indicated slot.
//     *
//     * @param slot
//     * @return the stack previously stored at the indicated slot.
//     */
//    @Override
//    public ItemStack removeStack(int slot) {
//        return null;
//    }
//
//    @Override
//    public void setStack(int slot, ItemStack stack) {
//
//    }
//
//    @Override
//    public boolean canPlayerUse(PlayerEntity player) {
//        return false;
//    }
//
//    @Override
//    public void provideRecipeInputs(RecipeMatcher finder) {
//
//    }
//
//    @Override
//    public void setLastRecipe(@Nullable Recipe<?> recipe) {
//
//    }
//
//    @Nullable
//    @Override
//    public Recipe<?> getLastRecipe() {
//        return null;
//    }
//
//    @Override
//    public void clear() {
//
//    }
//
//    @Override
//    public void tick() {
//
//    }
//
//    public List<Recipe<?>> method_27354(World world, Vec3d vec3d) {
//        List<Recipe<?>> list = Lists.newArrayList();
//        ObjectIterator var4 = this.recipesUsed.object2IntEntrySet().iterator();
//
//        while(var4.hasNext()) {
//            Object2IntMap.Entry<Identifier> entry = (Object2IntMap.Entry)var4.next();
//            world.getRecipeManager().get((Identifier)entry.getKey()).ifPresent((recipe) -> {
//                list.add(recipe);
//                //dropExperience(world, vec3d, entry.getIntValue(), ((AbstractCookingRecipe)recipe).getExperience());
//            });
//        }
//        return list;
//    }
//}
