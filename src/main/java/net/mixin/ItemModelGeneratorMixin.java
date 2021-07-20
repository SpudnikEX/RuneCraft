//package net.mixin;
//
////import me.pepperbell.itemmodelfix.ItemModelFix;
//import net.minecraft.client.render.model.json.ItemModelGenerator;
//import net.minecraft.client.render.model.json.ModelElement;
//import net.minecraft.client.render.model.json.ModelElementFace;
//import net.minecraft.client.texture.Sprite;
//import net.minecraft.util.math.Direction;
//import net.util.ModelGenerationType;
//import net.util.ModelUtil;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
//import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
//
//import java.util.List;
//import java.util.Map;
//
//@Mixin(ItemModelGenerator.class)
//public class ItemModelGeneratorMixin {
//
//	private ModelGenerationType HEAD_GEN_TYPE = ModelGenerationType.PIXEL;
//	private ModelGenerationType TAIL_GEN_TYPE = ModelGenerationType.UNLERP;
//
//	@Inject(at = @At(value = "HEAD"), method = "addLayerElements(ILjava/lang/String;Lnet/minecraft/client/texture/Sprite;)Ljava/util/List;", cancellable = true)
//	private void onHeadAddLayerElements(int layer, String key, Sprite sprite, CallbackInfoReturnable<List<ModelElement>> cir) {
//		if (HEAD_GEN_TYPE == ModelGenerationType.OUTLINE) {
//			//ItemModelFix.getConfig().getOptions().generationType
//			cir.setReturnValue(ModelUtil.createOutlineLayerElements(layer, key, sprite));
//		} else if (HEAD_GEN_TYPE == ModelGenerationType.PIXEL) {
//			//ItemModelFix.getConfig().getOptions().generationType
//			cir.setReturnValue(ModelUtil.createPixelLayerElements(layer, key, sprite));
//		}
//	}
//
//	@Inject(at = @At(value = "TAIL"), method = "addLayerElements(ILjava/lang/String;Lnet/minecraft/client/texture/Sprite;)Ljava/util/List;", locals = LocalCapture.CAPTURE_FAILHARD)
//	private void onTailAddLayerElements(int layer, String key, Sprite sprite, CallbackInfoReturnable<List<ModelElement>> cir, Map<Direction, ModelElementFace> map, List<ModelElement> list) {
//		if (TAIL_GEN_TYPE == ModelGenerationType.UNLERP) {
//			//ItemModelFix.getConfig().getOptions().generationType
//			ModelUtil.unlerpElements(list, sprite.getAnimationFrameDelta());
//		}
//	}
//}
