//package net.screen;
//
//import com.mojang.blaze3d.systems.RenderSystem;
//import net.minecraft.client.gui.screen.ingame.HandledScreen;
//import net.minecraft.client.gui.screen.recipebook.AbstractFurnaceRecipeBookScreen;
//import net.minecraft.client.gui.screen.recipebook.FurnaceRecipeBookScreen;
//import net.minecraft.client.gui.screen.recipebook.RecipeBookProvider;
//import net.minecraft.client.gui.screen.recipebook.RecipeBookWidget;
//import net.minecraft.client.gui.widget.TexturedButtonWidget;
//import net.minecraft.client.util.math.MatrixStack;
//import net.minecraft.entity.player.PlayerInventory;
//import net.minecraft.screen.AbstractFurnaceScreenHandler;
//import net.minecraft.screen.AbstractRecipeScreenHandler;
//import net.minecraft.screen.FurnaceScreenHandler;
//import net.minecraft.screen.ScreenHandler;
//import net.minecraft.screen.slot.Slot;
//import net.minecraft.screen.slot.SlotActionType;
//import net.minecraft.text.StringVisitable;
//import net.minecraft.text.Text;
//import net.minecraft.util.Identifier;
//
///**
// * {@link net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen} {@link net.minecraft.client.gui.screen.ingame.FurnaceScreen}
// *
// */
//public class ForgeScreen extends HandledScreen<ScreenHandler> {
//
//    private static final Identifier TEXTURE = new Identifier("textures/gui/container/furnace.png");
//
//
//    private static final Identifier RECIPE_BUTTON_TEXTURE = new Identifier("textures/gui/recipe_button.png");
//    //public final AbstractFurnaceRecipeBookScreen recipeBook;
//    private boolean narrow;
//    //private final Identifier background;
//    private final ForgeScreenHandler handler;
//
//    public ForgeScreen(ScreenHandler handler, PlayerInventory inventory, Text title) {
//        super(handler,inventory,title);
//
//        this.handler = (ForgeScreenHandler) handler;
////        this.recipeBook = new FurnaceRecipeBookScreen();
////        this.background = TEXTURE;
//        this.backgroundWidth = 176;
//        this.backgroundHeight = 173;
//        this.titleX += 34;
//        this.playerInventoryTitleY = this.backgroundHeight - 93;
//    }
//
////    protected ForgeScreen(T handler, AbstractFurnaceRecipeBookScreen recipeBook, PlayerInventory inventory, Text title, Identifier background) {
////        super(handler, inventory, title);
////        this.recipeBook = recipeBook;
////        this.background = background;
////    }
//
//
//
//    public void tick() {
//        super.tick();
//        //this.recipeBook.update();
//    }
//
//    @Override
//    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
//        this.renderBackground(matrices);
//        super.render(matrices, mouseX, mouseY, delta);
//        this.drawMouseoverTooltip(matrices, mouseX, mouseY);
//    }
//
//    @Override
//    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
//        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
//        this.client.getTextureManager().bindTexture(this.TEXTURE);
//        int i = this.x;
//        int j = this.y;
//        this.drawTexture(matrices, i, j, 0, 0, this.backgroundWidth, this.backgroundHeight);
//        int l;
//        if ((this.handler).isBurning()) {
//            l = (this.handler).getFuelProgress();
//            this.drawTexture(matrices, i + 56, j + 36 + 12 - l, 176, 12 - l, 14, l + 1);
//        }
//
//        l = (this.handler).getCookProgress();
//        this.drawTexture(matrices, i + 79, j + 34, 176, 14, l + 1, 16);
//    }
//}
