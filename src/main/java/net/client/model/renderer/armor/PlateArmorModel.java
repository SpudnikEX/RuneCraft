// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports

package net.client.model.renderer.armor;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;

public class PlateArmorModel extends RunecraftArmorModel {

	private final ModelPart HEAD;
	private final ModelPart LeftHelmetFaceGuard2_r1;
	private final ModelPart LeftHelmetFaceGuard1_r1;
	private final ModelPart RightHelmetFaceGuard2_r1;
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
	//private final ModelPart RIGHTFOOT;
	//private final ModelPart LEFTFOOT;

	public PlateArmorModel(EquipmentSlot slot) {
		super(slot);

		textureWidth = 64;
		textureHeight = 64;

		HEAD = new ModelPart(this);
		HEAD.setPivot(0.0F, -5.5412F, 0.2525F);
		HEAD.setTextureOffset(22, 16).addCuboid(-3.0F, -0.9588F, -3.7525F, 6.0F, 5.0F, -2.0F, 1.0F, false);
		HEAD.setTextureOffset(13, 54).addCuboid(-3.0F, 0.5412F, -4.2525F, -1.0F, 2.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(13, 54).addCuboid(-0.75F, 0.5412F, -4.2525F, -1.0F, 2.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(13, 54).addCuboid(1.75F, 0.5412F, -4.2525F, -1.0F, 2.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(13, 54).addCuboid(4.0F, 0.5412F, -4.2525F, -1.0F, 2.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(11, 6).addCuboid(-3.0F, -1.4588F, -4.2525F, 6.0F, 0.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(11, 7).addCuboid(-3.0F, 4.5412F, -4.2525F, 6.0F, 0.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(22, 24).addCuboid(0.0F, -5.3986F, 6.9571F, 0.0F, -1.0F, 1.0F, 1.0F, false);
		HEAD.setTextureOffset(18, 42).addCuboid(-0.5F, -2.4588F, -1.0025F, 1.0F, -1.0F, 4.0F, 1.0F, false);
		HEAD.setTextureOffset(22, 45).addCuboid(-0.5F, -2.7088F, 3.9975F, 1.0F, 0.0F, 0.0F, 1.0F, false);
		HEAD.setTextureOffset(2, 4).addCuboid(-3.5F, 5.7912F, -3.7525F, 7.0F, -1.0F, 7.0F, 1.0F, false);
		HEAD.setTextureOffset(7, 5).addCuboid(-2.5F, -2.2088F, -2.0025F, 5.0F, -1.0F, 5.0F, 1.0F, false);
		HEAD.setTextureOffset(4, 6).addCuboid(-3.0F, -1.9588F, -3.0025F, 6.0F, -1.0F, 6.0F, 1.0F, false);
		HEAD.setTextureOffset(3, 6).addCuboid(-3.5F, -1.7088F, -3.7525F, 7.0F, -1.0F, 7.0F, 1.0F, false);
		HEAD.setTextureOffset(10, 6).addCuboid(-3.5F, -1.4588F, 4.7475F, 7.0F, 6.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(10, 1).addCuboid(-3.75F, -1.4588F, -3.7525F, -1.0F, 6.0F, 7.0F, 1.0F, false);
		HEAD.setTextureOffset(10, 1).addCuboid(4.75F, -1.4588F, -3.7525F, -1.0F, 6.0F, 7.0F, 1.0F, false);

		LeftHelmetFaceGuard2_r1 = new ModelPart(this);
		LeftHelmetFaceGuard2_r1.setPivot(4.5F, 1.4096F, -2.292F);
		HEAD.addChild(LeftHelmetFaceGuard2_r1);
		setRotationAngle(LeftHelmetFaceGuard2_r1, -0.6109F, 0.0F, 0.0F);
		LeftHelmetFaceGuard2_r1.setTextureOffset(3, 34).addCuboid(0.5F, 0.5F, -3.0F, -1.0F, -1.0F, 6.0F, 1.0F, false);

		LeftHelmetFaceGuard1_r1 = new ModelPart(this);
		LeftHelmetFaceGuard1_r1.setPivot(4.5F, 3.9538F, -2.3658F);
		HEAD.addChild(LeftHelmetFaceGuard1_r1);
		setRotationAngle(LeftHelmetFaceGuard1_r1, -0.0175F, 0.0F, 0.0F);
		LeftHelmetFaceGuard1_r1.setTextureOffset(5, 35).addCuboid(0.5F, 0.5F, -2.0F, -1.0F, -1.0F, 4.0F, 1.0F, false);
		LeftHelmetFaceGuard1_r1.setTextureOffset(5, 35).addCuboid(-8.5F, 0.5F, -2.0F, -1.0F, -1.0F, 4.0F, 1.0F, false);

		RightHelmetFaceGuard2_r1 = new ModelPart(this);
		RightHelmetFaceGuard2_r1.setPivot(-4.5F, 1.4096F, -2.292F);
		HEAD.addChild(RightHelmetFaceGuard2_r1);
		setRotationAngle(RightHelmetFaceGuard2_r1, -0.6109F, 0.0F, 0.0F);
		RightHelmetFaceGuard2_r1.setTextureOffset(3, 34).addCuboid(0.5F, 0.5F, -3.0F, -1.0F, -1.0F, 6.0F, 1.0F, false);

		TasleMount2_r1 = new ModelPart(this);
		TasleMount2_r1.setPivot(0.0F, -3.4755F, 4.934F);
		HEAD.addChild(TasleMount2_r1);
		setRotationAngle(TasleMount2_r1, 0.5236F, 0.0F, 0.0F);
		TasleMount2_r1.setTextureOffset(22, 44).addCuboid(-0.5F, 0.5F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, false);

		Tasle1_r1 = new ModelPart(this);
		Tasle1_r1.setPivot(0.0F, -4.8214F, 5.845F);
		HEAD.addChild(Tasle1_r1);
		setRotationAngle(Tasle1_r1, 1.1781F, 0.0F, 0.0F);
		Tasle1_r1.setTextureOffset(22, 25).addCuboid(0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 1.0F, 1.0F, false);

		Tasle3_r1 = new ModelPart(this);
		Tasle3_r1.setPivot(0.0F, -4.8461F, 8.6572F);
		HEAD.addChild(Tasle3_r1);
		setRotationAngle(Tasle3_r1, 1.7017F, 0.0F, 0.0F);
		Tasle3_r1.setTextureOffset(23, 24).addCuboid(0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 1.0F, 1.0F, false);

		Tasle4_r1 = new ModelPart(this);
		Tasle4_r1.setPivot(0.0F, -2.144F, 8.4208F);
		HEAD.addChild(Tasle4_r1);
		setRotationAngle(Tasle4_r1, 1.2654F, 0.0F, 0.0F);
		Tasle4_r1.setTextureOffset(22, 23).addCuboid(0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 1.0F, 1.0F, false);

		Tasle5_r1 = new ModelPart(this);
		Tasle5_r1.setPivot(0.0F, -0.5102F, 8.5535F);
		HEAD.addChild(Tasle5_r1);
		setRotationAngle(Tasle5_r1, 2.3562F, 0.0F, 0.0F);
		Tasle5_r1.setTextureOffset(23, 25).addCuboid(0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, false);

		BottomFaceguardBar_r1 = new ModelPart(this);
		BottomFaceguardBar_r1.setPivot(0.0F, 3.9102F, -4.8654F);
		HEAD.addChild(BottomFaceguardBar_r1);
		setRotationAngle(BottomFaceguardBar_r1, -0.0175F, 0.0F, 0.0F);
		BottomFaceguardBar_r1.setTextureOffset(6, 54).addCuboid(-4.0F, 0.5F, 0.5F, 8.0F, -1.0F, -1.0F, 1.0F, false);

		TopFaceguardBar_r1 = new ModelPart(this);
		TopFaceguardBar_r1.setPivot(0.0F, -0.6001F, -5.1469F);
		HEAD.addChild(TopFaceguardBar_r1);
		setRotationAngle(TopFaceguardBar_r1, -0.5934F, 0.0F, 0.0F);
		TopFaceguardBar_r1.setTextureOffset(6, 54).addCuboid(-4.0F, 0.5F, 0.5F, 8.0F, -1.0F, -1.0F, 1.0F, false);

		BODY = new ModelPart(this);
		BODY.setPivot(0.0F, 7.125F, -0.975F);
		BODY.setTextureOffset(9, 8).addCuboid(-3.5F, 1.375F, -0.375F, 7.0F, 3.0F, -1.0F, 1.01F, false);
		BODY.setTextureOffset(9, 7).addCuboid(-3.7F, -6.625F, -1.025F, 7.0F, 4.0F, -1.0F, 1.01F, false);
		BODY.setTextureOffset(9, 8).addCuboid(-3.6F, -3.225F, -0.525F, 7.0F, 4.0F, -1.0F, 1.01F, false);
		BODY.setTextureOffset(6, 4).addCuboid(-3.8F, -6.525F, -0.425F, 7.0F, 5.0F, 3.0F, 1.01F, false);
		BODY.setTextureOffset(7, 6).addCuboid(-3.5F, 0.475F, 0.375F, 7.0F, 3.0F, 2.0F, 1.01F, false);
		BODY.setTextureOffset(2, 48).addCuboid(-4.0F, 5.525F, -0.525F, 8.0F, -1.0F, 3.0F, 1.01F, false);

		RIGHTARM = new ModelPart(this);
		RIGHTARM.setPivot(-5.9656F, 5.2161F, -0.0125F);
		RIGHTARM.setTextureOffset(2, 16).addCuboid(-2.0344F, -4.5161F, -1.9875F, 4.0F, 2.0F, 4.0F, 1.3F, false);
		RIGHTARM.setTextureOffset(8, 1).addCuboid(-2.0385F, 2.9887F, -2.5375F, 4.0F, 3.0F, 5.0F, 0.0F, false);
		RIGHTARM.setTextureOffset(8, 1).addCuboid(-2.2885F, -1.3613F, -2.3875F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		RIGHTARM.setTextureOffset(20, 28).addCuboid(-2.0885F, -5.3613F, -2.0875F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		LEFTARM = new ModelPart(this);
		LEFTARM.setPivot(6.0365F, 5.2161F, -0.0125F);
		LEFTARM.setTextureOffset(2, 16).addCuboid(-2.0365F, -4.5161F, -1.9875F, 4.0F, 2.0F, 4.0F, 1.3F, false);
		LEFTARM.setTextureOffset(8, 1).addCuboid(-2.0324F, 2.9887F, -2.5375F, 4.0F, 3.0F, 5.0F, 0.0F, true);
		LEFTARM.setTextureOffset(8, 1).addCuboid(-2.2906F, -1.3613F, -2.3875F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		LEFTARM.setTextureOffset(20, 28).addCuboid(-2.0906F, -5.3613F, -2.0875F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		RIGHTLEG = new ModelPart(this);
		RIGHTLEG.setPivot(-2.1F, 17.55F, -0.7333F);
		RIGHTLEG.setTextureOffset(2, 14).addCuboid(-1.3F, -3.95F, -0.3667F, 2.0F, 7.0F, 2.0F, 1.0F, false);
		RIGHTLEG.setTextureOffset(15, 6).addCuboid(-1.5F, -1.05F, -1.6667F, 3.0F, 2.0F, 0.0F, 0.0F, false);
		RIGHTLEG.setTextureOffset(12, 6).addCuboid(-1.5F, 0.05F, -0.5667F, 3.0F, 0.0F, 2.0F, 1.0F, false);

		LEFTLEG = new ModelPart(this);
		LEFTLEG.setPivot(2.1F, 17.55F, -0.7333F);
		LEFTLEG.setTextureOffset(2, 14).addCuboid(-1.3F, -3.95F, -0.3667F, 2.0F, 7.0F, 2.0F, 1.0F, false);
		LEFTLEG.setTextureOffset(15, 7).addCuboid(-1.5F, -1.05F, -1.6667F, 3.0F, 2.0F, 0.0F, 0.0F, false);
		LEFTLEG.setTextureOffset(11, 6).addCuboid(-1.5F, 0.05F, -0.5667F, 3.0F, 0.0F, 2.0F, 1.0F, false);
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
		//LEFTFOOT.visible = slot == EquipmentSlot.FEET;
		//RIGHTFOOT.visible = slot == EquipmentSlot.FEET;
		hat.visible = false;

		head = HEAD;
		body = BODY;
		rightArm = RIGHTARM;
		leftArm = LEFTARM;
		if (slot == EquipmentSlot.LEGS) {
			rightLeg = RIGHTLEG;
			leftLeg = LEFTLEG;
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