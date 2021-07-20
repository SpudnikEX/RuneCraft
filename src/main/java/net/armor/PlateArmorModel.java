// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports

package net.armor;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;

public class PlateArmorModel extends RunecraftArmorModel {

	private final ModelPart HEAD;
	private final ModelPart LeftHelmetFaceGuard2_r1;
	private final ModelPart LeftHelmetFaceGuard1_r1;
	private final ModelPart RightHelmetFaceGuard2_r1;
	private final ModelPart RightHelmetFaceGuard1_r1;
	private final ModelPart TasleMount2_r1;
	private final ModelPart Tasle1_r1;
	private final ModelPart Tasle3_r1;
	private final ModelPart Tasle4_r1;
	private final ModelPart Tasle5_r1;
	private final ModelPart BottomFaceguardBar_r1;
	private final ModelPart TopFaceguardBar_r1;
	private final ModelPart BODY;
	private final ModelPart RIGHTARM;
	private final ModelPart LEFTARM;
	private final ModelPart RIGHTLEG;
	private final ModelPart LEFTLEG;
	private final ModelPart LEFTFOOT;
	private final ModelPart RIGHTFOOT;

	public PlateArmorModel(EquipmentSlot slot) {
		super(slot);
		textureWidth = 64;
		textureHeight = 64;

		HEAD = new ModelPart(this);
		HEAD.setPivot(0.0F, 0.0F, 0.0F);
		HEAD.setTextureOffset(7, 7).addCuboid(-3.0F, -5.0F, -4.0F, -1.0F, 2.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(11, 8).addCuboid(-0.75F, -5.0F, -4.0F, -1.0F, 2.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(8, 7).addCuboid(1.75F, -5.0F, -4.0F, -1.0F, 2.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(6, 7).addCuboid(4.0F, -5.0F, -4.0F, -1.0F, 2.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(22, 16).addCuboid(-3.0F, -6.5F, -3.5F, 6.0F, 5.0F, -2.0F, 1.0F, false);
		HEAD.setTextureOffset(11, 9).addCuboid(-3.0F, -7.0F, -4.0F, 6.0F, 0.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(11, 13).addCuboid(-3.0F, -1.0F, -4.0F, 6.0F, 0.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(22, 24).addCuboid(0.0F, -10.9397F, 7.2096F, 0.0F, -1.0F, 1.0F, 1.0F, false);
		HEAD.setTextureOffset(18, 42).addCuboid(-0.5F, -8.0F, -0.75F, 1.0F, -1.0F, 4.0F, 1.0F, false);
		HEAD.setTextureOffset(22, 45).addCuboid(-0.5F, -8.25F, 4.25F, 1.0F, 0.0F, 0.0F, 1.0F, false);
		HEAD.setTextureOffset(2, 4).addCuboid(-3.5F, 0.25F, -3.5F, 7.0F, -1.0F, 7.0F, 1.0F, false);
		HEAD.setTextureOffset(7, 5).addCuboid(-2.5F, -7.75F, -1.75F, 5.0F, -1.0F, 5.0F, 1.0F, false);
		HEAD.setTextureOffset(4, 6).addCuboid(-3.0F, -7.5F, -2.75F, 6.0F, -1.0F, 6.0F, 1.0F, false);
		HEAD.setTextureOffset(3, 6).addCuboid(-3.5F, -7.25F, -3.5F, 7.0F, -1.0F, 7.0F, 1.0F, false);
		HEAD.setTextureOffset(10, 6).addCuboid(-3.5F, -7.0F, 5.0F, 7.0F, 6.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(10, 1).addCuboid(-3.75F, -7.0F, -3.5F, -1.0F, 6.0F, 7.0F, 1.0F, false);
		HEAD.setTextureOffset(10, 1).addCuboid(4.75F, -7.0F, -3.5F, -1.0F, 6.0F, 7.0F, 1.0F, false);

		LeftHelmetFaceGuard2_r1 = new ModelPart(this);
		LeftHelmetFaceGuard2_r1.setPivot(4.5F, -5.3196F, -3.0388F);
		HEAD.addChild(LeftHelmetFaceGuard2_r1);
		setRotationAngle(LeftHelmetFaceGuard2_r1, -0.6109F, 0.0F, 0.0F);
		LeftHelmetFaceGuard2_r1.setTextureOffset(3, 34).addCuboid(0.5F, 0.9F, -1.5F, -1.0F, -1.0F, 6.0F, 1.0F, false);

		LeftHelmetFaceGuard1_r1 = new ModelPart(this);
		LeftHelmetFaceGuard1_r1.setPivot(4.5F, -1.3944F, -2.5167F);
		HEAD.addChild(LeftHelmetFaceGuard1_r1);
		setRotationAngle(LeftHelmetFaceGuard1_r1, -0.0175F, 0.0F, 0.0F);
		LeftHelmetFaceGuard1_r1.setTextureOffset(5, 35).addCuboid(0.5F, 0.3F, -1.6F, -1.0F, -1.0F, 4.0F, 1.0F, false);

		RightHelmetFaceGuard2_r1 = new ModelPart(this);
		RightHelmetFaceGuard2_r1.setPivot(-4.5F, -4.1315F, -2.0395F);
		HEAD.addChild(RightHelmetFaceGuard2_r1);
		setRotationAngle(RightHelmetFaceGuard2_r1, -0.6109F, 0.0F, 0.0F);
		RightHelmetFaceGuard2_r1.setTextureOffset(3, 34).addCuboid(0.5F, 0.5F, -3.0F, -1.0F, -1.0F, 6.0F, 1.0F, false);

		RightHelmetFaceGuard1_r1 = new ModelPart(this);
		RightHelmetFaceGuard1_r1.setPivot(-4.5F, -1.5874F, -2.1133F);
		HEAD.addChild(RightHelmetFaceGuard1_r1);
		setRotationAngle(RightHelmetFaceGuard1_r1, -0.0175F, 0.0F, 0.0F);
		RightHelmetFaceGuard1_r1.setTextureOffset(5, 35).addCuboid(0.5F, 0.5F, -2.0F, -1.0F, -1.0F, 4.0F, 1.0F, false);

		TasleMount2_r1 = new ModelPart(this);
		TasleMount2_r1.setPivot(0.0F, -9.3247F, 4.72F);
		HEAD.addChild(TasleMount2_r1);
		setRotationAngle(TasleMount2_r1, 0.5236F, 0.0F, 0.0F);
		TasleMount2_r1.setTextureOffset(22, 44).addCuboid(-0.5F, 1.0F, 0.25F, 1.0F, -1.0F, 0.0F, 1.0F, false);

		Tasle1_r1 = new ModelPart(this);
		Tasle1_r1.setPivot(0.0F, -11.0159F, 5.8269F);
		HEAD.addChild(Tasle1_r1);
		setRotationAngle(Tasle1_r1, 1.1781F, 0.0F, 0.0F);
		Tasle1_r1.setTextureOffset(22, 25).addCuboid(0.0F, 1.0F, -1.0F, 0.0F, -1.0F, 1.0F, 1.0F, false);

		Tasle3_r1 = new ModelPart(this);
		Tasle3_r1.setPivot(0.0F, -10.3873F, 8.9096F);
		HEAD.addChild(Tasle3_r1);
		setRotationAngle(Tasle3_r1, 1.7017F, 0.0F, 0.0F);
		Tasle3_r1.setTextureOffset(23, 24).addCuboid(0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 1.0F, 1.0F, false);

		Tasle4_r1 = new ModelPart(this);
		Tasle4_r1.setPivot(0.0F, -7.6852F, 8.6732F);
		HEAD.addChild(Tasle4_r1);
		setRotationAngle(Tasle4_r1, 1.2654F, 0.0F, 0.0F);
		Tasle4_r1.setTextureOffset(22, 23).addCuboid(0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 1.0F, 1.0F, false);

		Tasle5_r1 = new ModelPart(this);
		Tasle5_r1.setPivot(0.0F, -6.0514F, 8.806F);
		HEAD.addChild(Tasle5_r1);
		setRotationAngle(Tasle5_r1, 2.3562F, 0.0F, 0.0F);
		Tasle5_r1.setTextureOffset(23, 25).addCuboid(0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, false);

		BottomFaceguardBar_r1 = new ModelPart(this);
		BottomFaceguardBar_r1.setPivot(0.0F, -1.631F, -4.6129F);
		HEAD.addChild(BottomFaceguardBar_r1);
		setRotationAngle(BottomFaceguardBar_r1, -0.0175F, 0.0F, 0.0F);
		BottomFaceguardBar_r1.setTextureOffset(6, 54).addCuboid(-4.0F, 0.5F, 0.5F, 8.0F, -1.0F, -1.0F, 1.0F, false);

		TopFaceguardBar_r1 = new ModelPart(this);
		TopFaceguardBar_r1.setPivot(0.0F, -6.1413F, -4.8944F);
		HEAD.addChild(TopFaceguardBar_r1);
		setRotationAngle(TopFaceguardBar_r1, -0.5934F, 0.0F, 0.0F);
		TopFaceguardBar_r1.setTextureOffset(6, 54).addCuboid(-4.0F, 0.5F, 0.5F, 8.0F, -1.0F, -1.0F, 1.0F, false);

		BODY = new ModelPart(this);
		BODY.setPivot(0.0F, 0.0F, 0.0F);
		BODY.setTextureOffset(9, 8).addCuboid(-3.5F, 8.5F, -1.35F, 7.0F, 3.0F, -1.0F, 1.01F, false);
		BODY.setTextureOffset(9, 7).addCuboid(-3.5F, 0.5F, -2.0F, 7.0F, 4.0F, -1.0F, 1.01F, false);
		BODY.setTextureOffset(9, 8).addCuboid(-3.5F, 3.9F, -1.5F, 7.0F, 4.0F, -1.0F, 1.01F, false);
		BODY.setTextureOffset(6, 4).addCuboid(-4.0F, 0.6F, -1.4F, 8.0F, 5.0F, 3.0F, 1.01F, false);
		BODY.setTextureOffset(7, 6).addCuboid(-3.5F, 7.6F, -0.6F, 7.0F, 3.0F, 2.0F, 1.01F, false);
		BODY.setTextureOffset(2, 48).addCuboid(-4.0F, 12.65F, -1.5F, 8.0F, -1.0F, 3.0F, 1.01F, false);

		RIGHTARM = new ModelPart(this);
		RIGHTARM.setPivot(-5.0F, 2.0F, 0.0F);
		RIGHTARM.setTextureOffset(2, 16).addCuboid(-3.0F, -1.3F, -2.0F, 4.0F, 2.0F, 4.0F, 1.0F, false);

		LEFTARM = new ModelPart(this);
		LEFTARM.setPivot(5.0F, 2.0F, 0.0F);
		LEFTARM.setTextureOffset(2, 16).addCuboid(-1.0F, -1.3F, -2.0F, 4.0F, 2.0F, 4.0F, 1.0F, false);

		RIGHTLEG = new ModelPart(this);
		RIGHTLEG.setPivot(-1.9F, 12.0F, 0.0F);
		RIGHTLEG.setTextureOffset(10, 2).addCuboid(-1.5F, 0.9F, -0.65F, 3.0F, 10.0F, 2.0F, 1.0F, false);
		RIGHTLEG.setTextureOffset(11, 4).addCuboid(-1.5F, 0.9F, -1.35F, 3.0F, 10.0F, -1.0F, 1.0F, false);
		RIGHTLEG.setTextureOffset(4, 19).addCuboid(-1.55F, 5.0F, -1.5F, 1.0F, 0.0F, 3.0F, 1.0F, false);
		RIGHTLEG.setTextureOffset(5, 19).addCuboid(0.55F, 5.0F, -1.5F, 1.0F, 0.0F, 3.0F, 1.0F, false);

		LEFTLEG = new ModelPart(this);
		LEFTLEG.setPivot(1.9F, 12.0F, 0.0F);
		LEFTLEG.setTextureOffset(13, 2).addCuboid(-1.55F, 0.9F, -0.65F, 3.0F, 10.0F, 2.0F, 1.0F, false);
		LEFTLEG.setTextureOffset(16, 4).addCuboid(-1.55F, 0.9F, -1.35F, 3.0F, 10.0F, -1.0F, 1.0F, false);
		LEFTLEG.setTextureOffset(8, 18).addCuboid(0.55F, 5.0F, -1.5F, 1.0F, 0.0F, 3.0F, 1.0F, false);
		LEFTLEG.setTextureOffset(8, 18).addCuboid(-1.65F, 5.0F, -1.5F, 1.0F, 0.0F, 3.0F, 1.0F, false);

		LEFTFOOT = new ModelPart(this);
		LEFTFOOT.setPivot(1.9f,12f,0);
		LEFTFOOT.setTextureOffset(2, 42).addCuboid(-2.05F, 10.6F, -1.5F, 4.0F, 1.0F, 3.0F, 1.0F, false);
		LEFTFOOT.setTextureOffset(3, 42).addCuboid(-1.55F, 10.6F, -3.0F, 3.0F, 1.0F, 3.0F, 1.0F, false);

		RIGHTFOOT = new ModelPart(this);
		RIGHTFOOT.setPivot(-1.9f,12,0);
		RIGHTFOOT.setTextureOffset(2, 42).addCuboid(-2.0F, 10.6F, -1.5F, 4.0F, 1.0F, 3.0F, 1.0F, false);
		RIGHTFOOT.setTextureOffset(3, 42).addCuboid(-1.5F, 10.6F, -3.0F, 3.0F, 1.0F, 3.0F, 1.0F, false);

}
@Override
public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
}
@Override
public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){

	HEAD.visible = slot == EquipmentSlot.HEAD;
	BODY.visible = slot == EquipmentSlot.CHEST;
	LEFTARM.visible = slot == EquipmentSlot.CHEST;
	RIGHTARM.visible = slot == EquipmentSlot.CHEST;
	LEFTLEG.visible = slot == EquipmentSlot.LEGS;
	RIGHTLEG.visible = slot == EquipmentSlot.LEGS;
	LEFTFOOT.visible = slot == EquipmentSlot.FEET;
	RIGHTFOOT.visible = slot == EquipmentSlot.FEET;

	head = HEAD;
	body = BODY;
	leftArm = LEFTARM;
	rightArm = RIGHTARM;
	if (slot == EquipmentSlot.LEGS) {
		//bipedBody = pantsAnchor;
		leftLeg = LEFTLEG;
		rightLeg = RIGHTLEG;
	} else {
		leftLeg = LEFTFOOT;
		rightLeg = RIGHTFOOT;
	}

		HEAD.render(matrixStack, buffer, packedLight, packedOverlay);
		BODY.render(matrixStack, buffer, packedLight, packedOverlay);
		RIGHTARM.render(matrixStack, buffer, packedLight, packedOverlay);
		LEFTARM.render(matrixStack, buffer, packedLight, packedOverlay);
		RIGHTLEG.render(matrixStack, buffer, packedLight, packedOverlay);
		LEFTLEG.render(matrixStack, buffer, packedLight, packedOverlay);
}
public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
}

	}