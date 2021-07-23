package net.client.model.renderer.armor;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;

public class AhrimsArmorModel extends RunecraftArmorModel{

    private final ModelPart HEAD;
    private final ModelPart BODY;
    private final ModelPart RIGHTARM;
    private final ModelPart LEFTARM;
    private final ModelPart RIGHTLEG;
    private final ModelPart RightRobe4_r1;
    private final ModelPart RightRobe3_r1;
    private final ModelPart RightRobe2_r1;
    private final ModelPart RightRobe1_r1;
    private final ModelPart LEFTLEG;
    private final ModelPart LeftRobe4_r1;
    private final ModelPart LeftRobe3_r1;
    private final ModelPart LeftRobe2_r1;
    private final ModelPart LeftRobe1_r1;
    private final ModelPart RIGHTFOOT;
    private final ModelPart LEFTFOOT;

    public AhrimsArmorModel(EquipmentSlot slot) {
        super(slot);

        textureWidth = 64;
        textureHeight = 64;

        HEAD = new ModelPart(this);
        HEAD.setPivot(0.0F, 0.0F, 0.0F);
        HEAD.setTextureOffset(4, 49).addCuboid(-3.0F, -5.5F, -3.4F, 6.0F, 4.0F, -2.0F, 1.0F, false);
        HEAD.setTextureOffset(15, 11).addCuboid(-3.5171F, -6.1F, -6.1778F, 7.0F, 1.0F, 1.0F, 0.0F, false);
        HEAD.setTextureOffset(6, 10).addCuboid(-3.5F, -0.75F, -3.5F, 7.0F, 0.0F, 7.0F, 1.0F, false);
        HEAD.setTextureOffset(9, 9).addCuboid(-3.9659F, -6.55F, 3.954F, 8.0F, 5.0F, 1.0F, 0.2F, false);
        HEAD.setTextureOffset(8, 7).addCuboid(-0.9659F, -8.75F, -5.196F, 2.0F, 2.0F, 10.0F, 0.0F, false);
        HEAD.setTextureOffset(2, 8).addCuboid(-4.0F, -8.0F, -4.5F, 8.0F, 1.0F, 9.0F, 0.1F, false);
        HEAD.setTextureOffset(2, 8).addCuboid(-3.9659F, -7.05F, -4.446F, 8.0F, 1.0F, 9.0F, 0.3F, false);
        HEAD.setTextureOffset(8, 7).addCuboid(1.0341F, -8.75F, -3.946F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        HEAD.setTextureOffset(8, 7).addCuboid(2.0341F, -8.75F, -2.446F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        HEAD.setTextureOffset(8, 7).addCuboid(-2.9659F, -8.75F, -2.446F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        HEAD.setTextureOffset(8, 7).addCuboid(-1.9659F, -8.75F, -3.946F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        HEAD.setTextureOffset(8, 7).addCuboid(-2.9659F, -7.75F, -4.946F, 2.0F, 1.0F, 8.0F, 0.0F, false);
        HEAD.setTextureOffset(8, 7).addCuboid(1.0341F, -7.75F, -4.946F, 2.0F, 1.0F, 8.0F, 0.0F, false);
        HEAD.setTextureOffset(15, 11).addCuboid(-0.4057F, -8.1F, -5.708F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        HEAD.setTextureOffset(15, 11).addCuboid(-0.4057F, -7.1F, -5.958F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        HEAD.setTextureOffset(15, 11).addCuboid(0.4057F, -7.1F, -5.708F, 3.0F, 1.0F, 2.0F, 0.0F, false);
        HEAD.setTextureOffset(15, 11).addCuboid(-3.4057F, -7.1F, -5.708F, 3.0F, 1.0F, 2.0F, 0.0F, false);
        HEAD.setTextureOffset(15, 11).addCuboid(-4.6243F, -4.1F, -5.5237F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        HEAD.setTextureOffset(15, 11).addCuboid(-4.4171F, -6.1F, -5.6778F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        HEAD.setTextureOffset(15, 11).addCuboid(-1.3943F, -7.1F, 3.4957F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        HEAD.setTextureOffset(15, 11).addCuboid(3.4171F, -6.1F, -5.6778F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        HEAD.setTextureOffset(15, 11).addCuboid(3.6243F, -4.1F, -5.5237F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        HEAD.setTextureOffset(15, 11).addCuboid(-0.0057F, -7.1F, 3.4957F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        HEAD.setTextureOffset(10, 5).addCuboid(3.7F, -6.25F, -4.7F, 1.0F, 5.0F, 9.0F, 0.0F, false);
        HEAD.setTextureOffset(10, 5).addCuboid(-4.7F, -6.25F, -4.7F, 1.0F, 5.0F, 9.0F, 0.0F, true);

        BODY = new ModelPart(this);
        BODY.setPivot(0.0F, 0.0F, 0.0F);
        BODY.setTextureOffset(9, 8).addCuboid(-3.0F, 9.2F, -1.05F, 6.0F, 2.0F, 2.0F, 1.2F, false);
        BODY.setTextureOffset(7, 3).addCuboid(-3.5F, 0.8F, -1.6F, 7.0F, 7.0F, 3.0F, 1.1F, false);
        BODY.setTextureOffset(9, 7).addCuboid(-3.5F, 0.8F, -1.8F, 7.0F, 4.0F, -1.0F, 1.2F, false);

        RIGHTARM = new ModelPart(this);
        RIGHTARM.setPivot(-5.0F, 2.0F, 0.0F);
        RIGHTARM.setTextureOffset(7, 32).addCuboid(-3.0F, -1.5F, -2.0F, 4.0F, 2.0F, 4.0F, 0.7F, false);
        RIGHTARM.setTextureOffset(9, 7).addCuboid(-3.0541F, 1.2548F, -2.0F, 4.0F, 8.0F, 4.0F, 0.1F, false);

        LEFTARM = new ModelPart(this);
        LEFTARM.setPivot(5.0F, 2.0F, 0.0F);
        LEFTARM.setTextureOffset(10, 8).addCuboid(-0.9459F, 1.2548F, -2.0F, 4.0F, 8.0F, 4.0F, 0.1F, true);
        LEFTARM.setTextureOffset(7, 32).addCuboid(-1.0F, -1.5F, -2.0F, 4.0F, 2.0F, 4.0F, 0.7F, true);

        RIGHTLEG = new ModelPart(this);
        RIGHTLEG.setPivot(-1.9F, 12.0F, 0.0F);
        RIGHTLEG.setTextureOffset(5, 32).addCuboid(-3.045F, 9.1544F, -3.0F, 6.0F, 1.0F, 6.0F, 0.1F, true);
        RIGHTLEG.setTextureOffset(5, 32).addCuboid(-3.045F, 8.5544F, -3.0F, 6.0F, 1.0F, 6.0F, -0.1F, true);
        RIGHTLEG.setTextureOffset(6, 53).addCuboid(-1.6F, 0.65F, -1.5F, 3.0F, -1.0F, 3.0F, 1.01F, true);

        RightRobe4_r1 = new ModelPart(this);
        RightRobe4_r1.setPivot(0.25F, 5.2462F, 0.5517F);
        RIGHTLEG.addChild(RightRobe4_r1);
        setRotationAngle(RightRobe4_r1, 0.0873F, 0.0F, 0.0F);
        RightRobe4_r1.setTextureOffset(16, 32).addCuboid(-1.25F, -4.0F, 0.9F, 2.0F, 7.0F, 0.0F, 1.1F, true);

        RightRobe3_r1 = new ModelPart(this);
        RightRobe3_r1.setPivot(0.25F, 4.57F, -1.396F);
        RIGHTLEG.addChild(RightRobe3_r1);
        setRotationAngle(RightRobe3_r1, -0.0873F, 0.0F, 0.0F);
        RightRobe3_r1.setTextureOffset(16, 32).addCuboid(-1.25F, -3.4F, 0.0F, 2.0F, 7.0F, 0.0F, 1.1F, true);

        RightRobe2_r1 = new ModelPart(this);
        RightRobe2_r1.setPivot(5.2114F, 3.4332F, 0.05F);
        RIGHTLEG.addChild(RightRobe2_r1);
        setRotationAngle(RightRobe2_r1, 0.0F, 0.0F, -0.0873F);
        RightRobe2_r1.setTextureOffset(16, 32).addCuboid(-3.9F, -2.6F, -1.05F, 0.0F, 7.0F, 2.0F, 1.1F, false);

        RightRobe1_r1 = new ModelPart(this);
        RightRobe1_r1.setPivot(-1.396F, 4.57F, 0.05F);
        RIGHTLEG.addChild(RightRobe1_r1);
        setRotationAngle(RightRobe1_r1, 0.0F, 0.0F, 0.0873F);
        RightRobe1_r1.setTextureOffset(16, 32).addCuboid(0.0F, -3.4F, -1.05F, 0.0F, 7.0F, 2.0F, 1.1F, true);

        LEFTLEG = new ModelPart(this);
        LEFTLEG.setPivot(1.9F, 12.0F, 0.0F);
        LEFTLEG.setTextureOffset(5, 32).addCuboid(-2.955F, 9.1544F, -3.0F, 6.0F, 1.0F, 6.0F, 0.1F, false);
        LEFTLEG.setTextureOffset(5, 32).addCuboid(-2.955F, 8.5544F, -3.0F, 6.0F, 1.0F, 6.0F, -0.1F, false);
        LEFTLEG.setTextureOffset(6, 53).addCuboid(-1.4F, 0.65F, -1.5F, 3.0F, -1.0F, 3.0F, 1.01F, false);

        LeftRobe4_r1 = new ModelPart(this);
        LeftRobe4_r1.setPivot(-0.25F, 5.2462F, 0.5517F);
        LEFTLEG.addChild(LeftRobe4_r1);
        setRotationAngle(LeftRobe4_r1, 0.0873F, 0.0F, 0.0F);
        LeftRobe4_r1.setTextureOffset(16, 32).addCuboid(-0.75F, -4.0F, 0.9F, 2.0F, 7.0F, 0.0F, 1.1F, false);

        LeftRobe3_r1 = new ModelPart(this);
        LeftRobe3_r1.setPivot(-0.25F, 4.57F, -1.396F);
        LEFTLEG.addChild(LeftRobe3_r1);
        setRotationAngle(LeftRobe3_r1, -0.0873F, 0.0F, 0.0F);
        LeftRobe3_r1.setTextureOffset(16, 32).addCuboid(-0.75F, -3.4F, 0.0F, 2.0F, 7.0F, 0.0F, 1.1F, false);

        LeftRobe2_r1 = new ModelPart(this);
        LeftRobe2_r1.setPivot(-5.2114F, 3.4332F, 0.05F);
        LEFTLEG.addChild(LeftRobe2_r1);
        setRotationAngle(LeftRobe2_r1, 0.0F, 0.0F, 0.0873F);
        LeftRobe2_r1.setTextureOffset(16, 32).addCuboid(3.9F, -2.6F, -1.05F, 0.0F, 7.0F, 2.0F, 1.1F, true);

        LeftRobe1_r1 = new ModelPart(this);
        LeftRobe1_r1.setPivot(1.396F, 4.57F, 0.05F);
        LEFTLEG.addChild(LeftRobe1_r1);
        setRotationAngle(LeftRobe1_r1, 0.0F, 0.0F, -0.0873F);
        LeftRobe1_r1.setTextureOffset(16, 32).addCuboid(0.0F, -3.4F, -1.05F, 0.0F, 7.0F, 2.0F, 1.1F, false);

        RIGHTFOOT = new ModelPart(this);
        RIGHTFOOT.setPivot(-1.9F, 12.0F, 0.0F);
        RIGHTFOOT.setTextureOffset(4, 58).addCuboid(-1.5F, 11.2F, -1.5F, 3.0F, 0.0F, 3.0F, 1.0F, true);
        RIGHTFOOT.setTextureOffset(4, 58).addCuboid(-1.5F, 11.5F, -3.15F, 3.0F, 0.0F, 0.0F, 0.7F, true);

        LEFTFOOT = new ModelPart(this);
        LEFTFOOT.setPivot(1.9F, 12.0F, 0.0F);
        LEFTFOOT.setTextureOffset(4, 58).addCuboid(-1.5F, 11.2F, -1.5F, 3.0F, 0.0F, 3.0F, 1.0F, false);
        LEFTFOOT.setTextureOffset(4, 58).addCuboid(-1.5F, 11.5F, -3.15F, 3.0F, 0.0F, 0.0F, 0.7F, false);

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
