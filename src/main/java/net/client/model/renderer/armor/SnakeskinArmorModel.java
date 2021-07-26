package net.client.model.renderer.armor;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;

public class SnakeskinArmorModel extends RunecraftArmorModel{

    private final ModelPart HEAD;
    private final ModelPart BODY;
    private final ModelPart RIGHTARM;
    private final ModelPart RightShoulder3_r1;
    private final ModelPart RightShoulder2_r1;
    private final ModelPart LEFTARM;
    private final ModelPart LeftShoulder3_r1;
    private final ModelPart LeftShoulder2_r1;
    private final ModelPart RIGHTLEG;
    private final ModelPart LEFTLEG;
    private final ModelPart RIGHTFOOT;
    private final ModelPart LEFTFOOT;

    public SnakeskinArmorModel(EquipmentSlot slot) {
        super(slot);

        textureWidth = 64;
        textureHeight = 64;

        HEAD = new ModelPart(this);
        HEAD.setPivot(0.0F, 0.0F, 0.0F);
        HEAD.setTextureOffset(3, 8).addCuboid(-4.5F, -8.2F, -4.5F, 9.0F, 2.0F, 9.0F, 0.0F, false);
        HEAD.setTextureOffset(7, 10).addCuboid(-3.5F, -8.85F, -3.5F, 7.0F, 1.0F, 7.0F, 0.0F, false);

        BODY = new ModelPart(this);
        BODY.setPivot(0.0F, 0.0F, 0.0F);
        BODY.setTextureOffset(2, 11).addCuboid(-3.0F, 9.2F, -1.05F, 6.0F, 2.0F, 2.0F, 1.2F, false);
        BODY.setTextureOffset(2, 14).addCuboid(-3.5F, 0.8F, -1.6F, 7.0F, 7.0F, 3.0F, 1.1F, false);
        BODY.setTextureOffset(3, 3).addCuboid(-3.5F, 0.8F, -1.8F, 7.0F, 4.0F, -1.0F, 1.2F, false);

        RIGHTARM = new ModelPart(this);
        RIGHTARM.setPivot(-5.0F, 2.0F, 0.0F);
        RIGHTARM.setTextureOffset(20, 11).addCuboid(-2.5F, -1.6F, -2.0F, 3.0F, 1.0F, 4.0F, 0.7F, true);

        RightShoulder3_r1 = new ModelPart(this);
        RightShoulder3_r1.setPivot(0.5796F, -0.37F, 0.0F);
        RIGHTARM.addChild(RightShoulder3_r1);
        setRotationAngle(RightShoulder3_r1, 0.0F, 0.0F, -0.2618F);
        RightShoulder3_r1.setTextureOffset(20, 11).addCuboid(0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 0.6F, true);

        RightShoulder2_r1 = new ModelPart(this);
        RightShoulder2_r1.setPivot(-1.325F, -1.3F, 0.0F);
        RIGHTARM.addChild(RightShoulder2_r1);
        setRotationAngle(RightShoulder2_r1, 0.0F, 0.0F, -1.309F);
        RightShoulder2_r1.setTextureOffset(20, 11).addCuboid(-1.225F, -0.7F, -2.0F, 0.0F, 3.0F, 4.0F, 0.6F, true);

        LEFTARM = new ModelPart(this);
        LEFTARM.setPivot(5.0F, 2.0F, 0.0F);
        LEFTARM.setTextureOffset(20, 11).addCuboid(-0.5F, -1.6F, -2.0F, 3.0F, 1.0F, 4.0F, 0.7F, false);

        LeftShoulder3_r1 = new ModelPart(this);
        LeftShoulder3_r1.setPivot(-0.5796F, -0.37F, 0.0F);
        LEFTARM.addChild(LeftShoulder3_r1);
        setRotationAngle(LeftShoulder3_r1, 0.0F, 0.0F, 0.2618F);
        LeftShoulder3_r1.setTextureOffset(20, 11).addCuboid(0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 0.6F, false);

        LeftShoulder2_r1 = new ModelPart(this);
        LeftShoulder2_r1.setPivot(1.325F, -1.3F, 0.0F);
        LEFTARM.addChild(LeftShoulder2_r1);
        setRotationAngle(LeftShoulder2_r1, 0.0F, 0.0F, 1.309F);
        LeftShoulder2_r1.setTextureOffset(20, 11).addCuboid(1.225F, -0.7F, -2.0F, 0.0F, 3.0F, 4.0F, 0.6F, false);

        RIGHTLEG = new ModelPart(this);
        RIGHTLEG.setPivot(-1.9F, 12.0F, 0.0F);
        RIGHTLEG.setTextureOffset(6, 53).addCuboid(-2.1F, 0.45F, -1.5F, 4.0F, -1.0F, 3.0F, 1.01F, true);
        RIGHTLEG.setTextureOffset(22, 5).addCuboid(-2.0F, 0.55F, -2.0F, 4.0F, 10.0F, 4.0F, 0.1F, false);

        LEFTLEG = new ModelPart(this);
        LEFTLEG.setPivot(1.9F, 12.0F, 0.0F);
        LEFTLEG.setTextureOffset(23, 6).addCuboid(-2.0F, 0.55F, -2.0F, 4.0F, 10.0F, 4.0F, 0.1F, true);
        LEFTLEG.setTextureOffset(6, 53).addCuboid(-1.9F, 0.45F, -1.5F, 4.0F, -1.0F, 3.0F, 1.01F, false);

        RIGHTFOOT = new ModelPart(this);
        RIGHTFOOT.setPivot(-1.9F, 12.0F, 0.0F);
        RIGHTFOOT.setTextureOffset(4, 58).addCuboid(-1.5F, 11.2F, -1.5F, 3.0F, 0.0F, 3.0F, 1.0F, true);
        RIGHTFOOT.setTextureOffset(9, 59).addCuboid(-1.5F, 11.5F, -3.15F, 3.0F, 0.0F, 0.0F, 0.7F, true);

        LEFTFOOT = new ModelPart(this);
        LEFTFOOT.setPivot(1.9F, 12.0F, 0.0F);
        LEFTFOOT.setTextureOffset(4, 58).addCuboid(-1.5F, 11.2F, -1.5F, 3.0F, 0.0F, 3.0F, 1.0F, false);
        LEFTFOOT.setTextureOffset(6, 59).addCuboid(-1.5F, 11.5F, -3.15F, 3.0F, 0.0F, 0.0F, 0.7F, false);

    }

    @Override
    public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {

        HEAD.visible = slot == EquipmentSlot.HEAD;
        BODY.visible = slot == EquipmentSlot.CHEST;
        RIGHTARM.visible = slot == EquipmentSlot.CHEST;
        LEFTARM.visible = slot == EquipmentSlot.CHEST;
        RIGHTLEG.visible = slot == EquipmentSlot.LEGS;
        LEFTLEG.visible = slot == EquipmentSlot.LEGS;
        LEFTFOOT.visible = slot == EquipmentSlot.FEET;
        RIGHTFOOT.visible = slot == EquipmentSlot.FEET;
        hat.visible = false;

        head = HEAD;
        body = BODY;
        rightArm = RIGHTARM;
        leftArm = LEFTARM;
        if (slot == EquipmentSlot.LEGS) {
            rightLeg = RIGHTLEG;
            leftLeg = LEFTLEG;
        } else {
            rightLeg = RIGHTFOOT;
            leftLeg = LEFTFOOT;
        }

        super.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);

//		HEAD.visible = slot == EquipmentSlot.HEAD;
//		BODY.visible = slot == EquipmentSlot.CHEST;
//		LEFTARM.visible = slot == EquipmentSlot.CHEST;
//		RIGHTARM.visible = slot == EquipmentSlot.CHEST;
//		LEFTLEG.visible = slot == EquipmentSlot.LEGS;
//		RIGHTLEG.visible = slot == EquipmentSlot.LEGS;
//		LEFTFOOT.visible = slot == EquipmentSlot.FEET;
//		RIGHTFOOT.visible = slot == EquipmentSlot.FEET;
//
//		head = HEAD;
//		body = BODY;
//		leftArm = LEFTARM;
//		rightArm = RIGHTARM;
//		if (slot == EquipmentSlot.LEGS) {
//			//bipedBody = pantsAnchor;
//			leftLeg = LEFTLEG;
//			rightLeg = RIGHTLEG;
//		} else {
//			leftLeg = LEFTFOOT;
//			rightLeg = RIGHTFOOT;
//		}
//
//		HEAD.render(matrixStack, buffer, packedLight, packedOverlay);
//		BODY.render(matrixStack, buffer, packedLight, packedOverlay);
//		RIGHTARM.render(matrixStack, buffer, packedLight, packedOverlay);
//		LEFTARM.render(matrixStack, buffer, packedLight, packedOverlay);
//		RIGHTLEG.render(matrixStack, buffer, packedLight, packedOverlay);
//		LEFTLEG.render(matrixStack, buffer, packedLight, packedOverlay);
//		LEFTFOOT.render(matrixStack, buffer, packedLight, packedOverlay);
//		RIGHTFOOT.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelPart bone, float x, float y, float z) {
        bone.pitch = x;
        bone.yaw = y;
        bone.roll = z;
    }
}