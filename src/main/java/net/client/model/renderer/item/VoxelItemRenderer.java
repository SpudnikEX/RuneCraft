package net.client.model.renderer.item;

import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.Vector3d;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3f;

/**
 * {@link ItemRenderer}
 */

public enum VoxelItemRenderer {
    INSTANCE;

    private final VoxelEntityModel spearEntityModel = new VoxelEntityModel();

    public boolean render(LivingEntity entity, ItemStack stack, ModelTransformation.Mode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, BakedModel model) {
        if(renderMode == ModelTransformation.Mode.GUI || renderMode == ModelTransformation.Mode.GROUND || renderMode == ModelTransformation.Mode.FIXED) {
            return false;
        }

        matrices.push();

        model.getTransformation().getTransformation(renderMode).apply(leftHanded, matrices);

        if(entity != null && entity.isUsingItem() && entity.getActiveItem() == stack && (renderMode == ModelTransformation.Mode.THIRD_PERSON_LEFT_HAND || renderMode == ModelTransformation.Mode.THIRD_PERSON_RIGHT_HAND)) {
            matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(180));
            matrices.translate(0, 2.1, 0);
        } else {
            matrices.translate(0, 0.85, 0);
        }

        matrices.scale(2.0F, -2.0F, -2.0F);
        VertexConsumer spear = ItemRenderer.getArmorGlintConsumer(
            vertexConsumers,
            this.spearEntityModel.getLayer(VoxelEntityRenderer.getTexture(((VoxelItem)stack.getItem()).getType())),
            false,
            stack.hasGlint()
        );
        this.spearEntityModel.render(matrices, spear, light, overlay, 1.0F, 1.0F, 1.0F, 1.0F);

        matrices.pop();
        return true;
    }
}
