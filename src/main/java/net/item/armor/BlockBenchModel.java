package net.item.armor;

import net.minecraft.client.model.Model;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

import java.util.function.Function;

// BLOCKBENCH GENERATED
//public class custom_model extends EntityModel<Entity> {
//    private final ModelRenderer bone;
//
//    public custom_model() {
//        textureWidth = 16;
//        textureHeight = 16;
//
//        bone = new ModelRenderer(this);
//        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
//        bone.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
//        bone.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
//        bone.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
//        bone.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
//        bone.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
//        bone.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
//        bone.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
//        bone.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
//        bone.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
//        bone.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
//
//        bone2 = new ModelRenderer(this);
//        bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
//        bone.addChild(bone2);
//        bone2.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
//
//    }
//
//    @Override
//    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//        //previously the render function, render code was moved to a method below
//    }
//
//    @Override
//    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
//        bone.render(matrixStack, buffer, packedLight, packedOverlay);
//    }
//
//    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
//        modelRenderer.rotateAngleX = x;
//        modelRenderer.rotateAngleY = y;
//        modelRenderer.rotateAngleZ = z;
//    }
//}


public class BlockBenchModel extends Model {

    public ModelPart part;


    public BlockBenchModel(Function<Identifier, RenderLayer> layerFactory) {
        super(layerFactory);

        // textureWidth = 16
        this.textureWidth = 16;
        // textureHeight = 16
        this.textureHeight = 16;
        // create the model part which will hold all the cuboids
        // this is the same as creating the ModelRenderer
        this.part = new ModelPart(this);
        // setting the textureSize of the ModelPart is not needed as when you create the ModelPart the textureSize is pulled from the Model
        // part.setTextureSize(16, 16);
        part.setPivot(0.0F, 24.0F, 0.0F); // same as setRotationPoint

        //adding cuboids
        // blockbench's .addBox and .setTextureOffset can be converted to addCuboid
        // bone is the group in blockbench
        // setTextureOffset is the textureOffsetU textureOffsetV
        // addBox (x, y, z, sizeX, sizeY, sizeZ, extra, someBoolean)
        // some boolean isnt needed
        // bone.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        // addCouboid(String name, float x, float y, float z, int sizeX, int sizeY, int sizeZ, float extra, int textureOffsetU, int textureOffsetV)
        part.addCuboid("bone", -1.0F, -1.0F, 0.0F, (int)1.0F, (int)1.0F, (int)1.0F, 0.0F, 0, 0);

        // adding a sub ModelPart to our main ModelPart
        ModelPart subPart = new ModelPart(this);
        subPart.setPivot(0.0F, 0.0F, 0.0F);
        part.addChild(subPart);
        subPart.addCuboid("bone2", -1.0F, -1.0F, 0.0F, (int)1.0F, (int)1.0F, (int)1.0F, 0.0F, 0, 0);

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        // when rendering the Model render the root ModelPart
        // a ModelPart can have children ModelParts
        // when calling ModelPart#render all childen will also get rendered
        part.render(matrices, vertices, light, overlay, red, blue, green, alpha);
    }
}