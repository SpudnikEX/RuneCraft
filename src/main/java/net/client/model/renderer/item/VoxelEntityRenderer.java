//package net.client.model.renderer.item;
//
//import net.minecraft.client.render.OverlayTexture;
//import net.minecraft.client.render.VertexConsumer;
//import net.minecraft.client.render.VertexConsumerProvider;
//import net.minecraft.client.render.entity.EntityRenderDispatcher;
//import net.minecraft.client.render.entity.EntityRenderer;
//import net.minecraft.client.render.item.ItemRenderer;
//import net.minecraft.client.util.math.MatrixStack;
//import net.minecraft.util.Identifier;
//import net.minecraft.util.math.MathHelper;
//import net.minecraft.util.math.Vec3f;
//
//public class VoxelEntityRenderer extends EntityRenderer<VoxelEntity> {
//
//    public static final Identifier TEXTURE = new Identifier("textures/entity/trident.png");
//    private final VoxelEntityModel model = new VoxelEntityModel();
//
//    public VoxelEntityRenderer(EntityRenderDispatcher dispatcher) {
//        super(dispatcher);
//    }
//
//    @Override
//    public void render(VoxelEntity entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
//        matrices.push();
//        matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(MathHelper.lerp(tickDelta, entity.prevYaw, entity.yaw) - 90.0F));
//        matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(MathHelper.lerp(tickDelta, entity.prevPitch, entity.pitch) + 90.0F));
//        VertexConsumer vertexConsumer = ItemRenderer.getDirectItemGlintConsumer(vertexConsumers, this.model.getLayer(this.getTexture(entity)), false, entity.isEnchanted());
//        this.model.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
//        matrices.pop();
//        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
//    }
//
//    @Override
//    public Identifier getTexture(VoxelEntity entity) {
//        return TEXTURE;
//    }
//}
