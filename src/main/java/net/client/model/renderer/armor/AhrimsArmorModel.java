package net.client.model.renderer.armor;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;

public class AhrimsArmorModel extends RunecraftArmorModel{

    private final ModelPart HEAD;
    private final ModelPart BackHood2_r1;
    private final ModelPart FrontHood6_r1;
    private final ModelPart FrontHood5_r1;
    private final ModelPart FrontHood3_r1;
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
    private final ModelPart RightBoot6_r1;
    private final ModelPart RightBoot5_r1;
    private final ModelPart RightBoot3_r1;
    private final ModelPart LEFTFOOT;
    private final ModelPart LeftBoot6_r1;
    private final ModelPart LeftBoot5_r1;
    private final ModelPart LeftBoot3_r1;

    public AhrimsArmorModel(EquipmentSlot slot) {
        super(slot);

        textureWidth = 64;
        textureHeight = 64;

        HEAD = new ModelPart(this);
        HEAD.setPivot(0.0F, 0.0F, 0.0F);
        HEAD.setTextureOffset(4, 49).addCuboid(-3.0F, -5.0F, -3.1F, 6.0F, 4.0F, -2.0F, 1.0F, false);
        HEAD.setTextureOffset(6, 10).addCuboid(-3.0F, -6.95F, -3.0F, 6.0F, -1.0F, 6.0F, 1.1F, false);
        HEAD.setTextureOffset(6, 10).addCuboid(-3.0F, -7.65F, -2.0F, 6.0F, -1.0F, 5.0F, 0.7F, false);
        HEAD.setTextureOffset(6, 10).addCuboid(-3.0F, -0.05F, -3.5F, 6.0F, -1.0F, 7.0F, 1.1F, false);
        HEAD.setTextureOffset(10, 5).addCuboid(3.1F, -6.75F, -4.7F, 1.0F, 6.0F, 9.0F, 0.1F, false);
        HEAD.setTextureOffset(10, 5).addCuboid(-4.1F, -6.75F, -4.7F, 1.0F, 6.0F, 9.0F, 0.1F, true);
        HEAD.setTextureOffset(10, 10).addCuboid(-4.0F, -5.7598F, 3.5515F, 8.0F, 5.0F, 1.0F, 0.1F, false);

        BackHood2_r1 = new ModelPart(this);
        BackHood2_r1.setPivot(0.0F, -6.8041F, 3.3666F);
        HEAD.addChild(BackHood2_r1);
        setRotationAngle(BackHood2_r1, 0.2182F, 0.0F, 0.0F);
        BackHood2_r1.setTextureOffset(10, 10).addCuboid(-4.0F, -0.9F, -0.05F, 8.0F, 2.0F, 1.0F, 0.1F, false);

        FrontHood6_r1 = new ModelPart(this);
        FrontHood6_r1.setPivot(0.0274F, -5.0184F, -3.6355F);
        HEAD.addChild(FrontHood6_r1);
        setRotationAngle(FrontHood6_r1, 0.0436F, 0.0F, 0.0F);
        FrontHood6_r1.setTextureOffset(10, 5).addCuboid(-2.9974F, -1.9113F, -2.1141F, 6.0F, 1.0F, 3.0F, 0.0F, false);

        FrontHood5_r1 = new ModelPart(this);
        FrontHood5_r1.setPivot(0.0274F, -5.0184F, -3.6355F);
        HEAD.addChild(FrontHood5_r1);
        setRotationAngle(FrontHood5_r1, 0.2182F, 0.0F, 0.0F);
        FrontHood5_r1.setTextureOffset(10, 5).addCuboid(-3.8932F, -1.4511F, -1.8836F, 1.0F, 6.0F, 4.0F, 0.0F, true);
        FrontHood5_r1.setTextureOffset(10, 5).addCuboid(2.8385F, -1.4511F, -1.8836F, 1.0F, 6.0F, 4.0F, 0.0F, false);
        FrontHood5_r1.setTextureOffset(15, 9).addCuboid(-4.0932F, -1.5403F, -1.7219F, 1.0F, 4.0F, 3.0F, 0.0F, false);
        FrontHood5_r1.setTextureOffset(10, 9).addCuboid(3.0385F, -1.5403F, -1.7219F, 1.0F, 4.0F, 3.0F, 0.0F, true);

        FrontHood3_r1 = new ModelPart(this);
        FrontHood3_r1.setPivot(0.0274F, -5.0184F, -3.6355F);
        HEAD.addChild(FrontHood3_r1);
        setRotationAngle(FrontHood3_r1, 0.3054F, 0.0F, 0.0F);
        FrontHood3_r1.setTextureOffset(10, 10).addCuboid(-3.9932F, -2.6053F, -1.7356F, 8.0F, 1.0F, 2.0F, 0.1F, false);

        BODY = new ModelPart(this);
        BODY.setPivot(0.0F, 0.0F, 0.0F);
        BODY.setTextureOffset(9, 8).addCuboid(-3.0F, 9.2F, -1.05F, 6.0F, 2.0F, 2.0F, 1.2F, false);
        BODY.setTextureOffset(7, 3).addCuboid(-3.5F, 0.8F, -1.6F, 7.0F, 7.0F, 3.0F, 1.1F, false);
        BODY.setTextureOffset(9, 7).addCuboid(-3.5F, 0.8F, -1.8F, 7.0F, 4.0F, -1.0F, 1.2F, false);

        RIGHTARM = new ModelPart(this);
        RIGHTARM.setPivot(-5.0F, 2.0F, 0.0F);
        RIGHTARM.setTextureOffset(7, 32).addCuboid(-3.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, 0.7F, false);
        RIGHTARM.setTextureOffset(10, 8).addCuboid(-3.0541F, 0.7548F, -2.0F, 4.0F, 8.0F, 4.0F, 0.1F, false);
        RIGHTARM.setTextureOffset(6, 32).addCuboid(-3.0541F, 8.9048F, -2.0F, 4.0F, 1.0F, 4.0F, 0.1F, false);
        RIGHTARM.setTextureOffset(6, 32).addCuboid(-3.0541F, 8.6548F, -2.0F, 4.0F, 2.0F, 4.0F, -0.3F, false);

        LEFTARM = new ModelPart(this);
        LEFTARM.setPivot(5.0F, 2.0F, 0.0F);
        LEFTARM.setTextureOffset(7, 32).addCuboid(-1.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, 0.7F, true);
        LEFTARM.setTextureOffset(10, 8).addCuboid(-0.9459F, 0.7548F, -2.0F, 4.0F, 8.0F, 4.0F, 0.1F, true);
        LEFTARM.setTextureOffset(8, 32).addCuboid(-0.9459F, 8.9048F, -2.0F, 4.0F, 1.0F, 4.0F, 0.1F, true);
        LEFTARM.setTextureOffset(8, 32).addCuboid(-0.9459F, 8.6548F, -2.0F, 4.0F, 2.0F, 4.0F, -0.3F, true);

        RIGHTLEG = new ModelPart(this);
        RIGHTLEG.setPivot(-1.9F, 12.0F, 0.0F);
        RIGHTLEG.setTextureOffset(5, 32).addCuboid(-3.045F, 9.1544F, -3.0F, 6.0F, 1.0F, 6.0F, 0.1F, true);
        RIGHTLEG.setTextureOffset(5, 32).addCuboid(-3.045F, 8.5544F, -3.0F, 6.0F, 1.0F, 6.0F, -0.1F, true);
        RIGHTLEG.setTextureOffset(6, 53).addCuboid(-1.6F, 0.65F, -1.5F, 3.0F, -1.0F, 3.0F, 1.01F, true);

        RightRobe4_r1 = new ModelPart(this);
        RightRobe4_r1.setPivot(0.25F, 5.2462F, 0.5517F);
        RIGHTLEG.addChild(RightRobe4_r1);
        setRotationAngle(RightRobe4_r1, 0.0873F, 0.0F, 0.0F);
        RightRobe4_r1.setTextureOffset(16, 9).addCuboid(-1.25F, -4.0F, 0.9F, 2.0F, 7.0F, 0.0F, 1.1F, true);

        RightRobe3_r1 = new ModelPart(this);
        RightRobe3_r1.setPivot(0.25F, 4.57F, -1.396F);
        RIGHTLEG.addChild(RightRobe3_r1);
        setRotationAngle(RightRobe3_r1, -0.0873F, 0.0F, 0.0F);
        RightRobe3_r1.setTextureOffset(15, 8).addCuboid(-1.25F, -3.4F, 0.0F, 2.0F, 7.0F, 0.0F, 1.1F, true);

        RightRobe2_r1 = new ModelPart(this);
        RightRobe2_r1.setPivot(5.2114F, 3.4332F, 0.05F);
        RIGHTLEG.addChild(RightRobe2_r1);
        setRotationAngle(RightRobe2_r1, 0.0F, 0.0F, -0.0873F);
        RightRobe2_r1.setTextureOffset(16, 32).addCuboid(-3.9F, -2.6F, -1.05F, 0.0F, 7.0F, 2.0F, 1.1F, false);

        RightRobe1_r1 = new ModelPart(this);
        RightRobe1_r1.setPivot(-1.396F, 4.57F, 0.05F);
        RIGHTLEG.addChild(RightRobe1_r1);
        setRotationAngle(RightRobe1_r1, 0.0F, 0.0F, 0.0873F);
        RightRobe1_r1.setTextureOffset(15, 8).addCuboid(0.0F, -3.4F, -1.05F, 0.0F, 7.0F, 2.0F, 1.1F, true);

        LEFTLEG = new ModelPart(this);
        LEFTLEG.setPivot(1.9F, 12.0F, 0.0F);
        LEFTLEG.setTextureOffset(5, 32).addCuboid(-2.955F, 9.1544F, -3.0F, 6.0F, 1.0F, 6.0F, 0.1F, false);
        LEFTLEG.setTextureOffset(5, 32).addCuboid(-2.955F, 8.5544F, -3.0F, 6.0F, 1.0F, 6.0F, -0.1F, false);
        LEFTLEG.setTextureOffset(6, 53).addCuboid(-1.4F, 0.65F, -1.5F, 3.0F, -1.0F, 3.0F, 1.01F, false);

        LeftRobe4_r1 = new ModelPart(this);
        LeftRobe4_r1.setPivot(-0.25F, 5.2462F, 0.5517F);
        LEFTLEG.addChild(LeftRobe4_r1);
        setRotationAngle(LeftRobe4_r1, 0.0873F, 0.0F, 0.0F);
        LeftRobe4_r1.setTextureOffset(15, 8).addCuboid(-0.75F, -4.0F, 0.9F, 2.0F, 7.0F, 0.0F, 1.1F, false);

        LeftRobe3_r1 = new ModelPart(this);
        LeftRobe3_r1.setPivot(-0.25F, 4.57F, -1.396F);
        LEFTLEG.addChild(LeftRobe3_r1);
        setRotationAngle(LeftRobe3_r1, -0.0873F, 0.0F, 0.0F);
        LeftRobe3_r1.setTextureOffset(17, 9).addCuboid(-0.75F, -3.4F, 0.0F, 2.0F, 7.0F, 0.0F, 1.1F, false);

        LeftRobe2_r1 = new ModelPart(this);
        LeftRobe2_r1.setPivot(-5.2114F, 3.4332F, 0.05F);
        LEFTLEG.addChild(LeftRobe2_r1);
        setRotationAngle(LeftRobe2_r1, 0.0F, 0.0F, 0.0873F);
        LeftRobe2_r1.setTextureOffset(16, 32).addCuboid(3.9F, -2.6F, -1.05F, 0.0F, 7.0F, 2.0F, 1.1F, true);

        LeftRobe1_r1 = new ModelPart(this);
        LeftRobe1_r1.setPivot(1.396F, 4.57F, 0.05F);
        LEFTLEG.addChild(LeftRobe1_r1);
        setRotationAngle(LeftRobe1_r1, 0.0F, 0.0F, -0.0873F);
        LeftRobe1_r1.setTextureOffset(11, 8).addCuboid(0.0F, -3.4F, -1.05F, 0.0F, 7.0F, 2.0F, 1.1F, false);

        RIGHTFOOT = new ModelPart(this);
        RIGHTFOOT.setPivot(-1.9F, 12.0F, 0.0F);
        RIGHTFOOT.setTextureOffset(4, 57).addCuboid(-1.5F, 10.2F, -1.5F, 3.0F, 1.0F, 3.0F, 1.0F, true);
        RIGHTFOOT.setTextureOffset(6, 60).addCuboid(-1.0F, 11.3F, -3.15F, 2.0F, 0.0F, 0.0F, 0.9F, true);
        RIGHTFOOT.setTextureOffset(4, 58).addCuboid(-1.5F, 10.2F, -1.5F, 3.0F, -2.0F, 3.0F, 1.2F, true);

        RightBoot6_r1 = new ModelPart(this);
        RightBoot6_r1.setPivot(-8.7017F, 11.2F, 0.2364F);
        RIGHTFOOT.addChild(RightBoot6_r1);
        setRotationAngle(RightBoot6_r1, 0.0F, 0.3054F, 0.0F);
        RightBoot6_r1.setTextureOffset(10, 59).addCuboid(11.5F, 0.1F, 0.0F, -1.0F, 0.0F, 0.0F, 0.9F, true);

        RightBoot5_r1 = new ModelPart(this);
        RightBoot5_r1.setPivot(-1.7891F, 11.2F, -3.0714F);
        RIGHTFOOT.addChild(RightBoot5_r1);
        setRotationAngle(RightBoot5_r1, 0.0F, -0.3054F, 0.0F);
        RightBoot5_r1.setTextureOffset(10, 59).addCuboid(0.5F, 0.1F, 0.0F, -1.0F, 0.0F, 0.0F, 0.9F, true);

        RightBoot3_r1 = new ModelPart(this);
        RightBoot3_r1.setPivot(0.5F, 11.1815F, -2.9549F);
        RIGHTFOOT.addChild(RightBoot3_r1);
        setRotationAngle(RightBoot3_r1, -1.3526F, 0.0F, 0.0F);
        RightBoot3_r1.setTextureOffset(10, 54).addCuboid(-1.5F, 0.1F, -0.2F, 2.0F, 0.0F, 0.0F, 0.8F, true);

        LEFTFOOT = new ModelPart(this);
        LEFTFOOT.setPivot(1.9F, 12.0F, 0.0F);
        LEFTFOOT.setTextureOffset(4, 57).addCuboid(-1.5F, 10.2F, -1.5F, 3.0F, 1.0F, 3.0F, 1.0F, false);
        LEFTFOOT.setTextureOffset(7, 60).addCuboid(-1.0F, 11.3F, -3.15F, 2.0F, 0.0F, 0.0F, 0.9F, false);
        LEFTFOOT.setTextureOffset(4, 58).addCuboid(-1.5F, 10.2F, -1.5F, 3.0F, -2.0F, 3.0F, 1.2F, false);

        LeftBoot6_r1 = new ModelPart(this);
        LeftBoot6_r1.setPivot(8.7017F, 11.3F, 0.2364F);
        LEFTFOOT.addChild(LeftBoot6_r1);
        setRotationAngle(LeftBoot6_r1, 0.0F, -0.3054F, 0.0F);
        LeftBoot6_r1.setTextureOffset(9, 59).addCuboid(-10.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.9F, false);

        LeftBoot5_r1 = new ModelPart(this);
        LeftBoot5_r1.setPivot(1.7891F, 11.3F, -3.0714F);
        LEFTFOOT.addChild(LeftBoot5_r1);
        setRotationAngle(LeftBoot5_r1, 0.0F, 0.3054F, 0.0F);
        LeftBoot5_r1.setTextureOffset(9, 59).addCuboid(0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.9F, false);

        LeftBoot3_r1 = new ModelPart(this);
        LeftBoot3_r1.setPivot(-0.5F, 11.1815F, -2.9549F);
        LEFTFOOT.addChild(LeftBoot3_r1);
        setRotationAngle(LeftBoot3_r1, -1.3526F, 0.0F, 0.0F);
        LeftBoot3_r1.setTextureOffset(11, 54).addCuboid(-0.5F, 0.1F, -0.2F, 2.0F, 0.0F, 0.0F, 0.8F, false);

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
