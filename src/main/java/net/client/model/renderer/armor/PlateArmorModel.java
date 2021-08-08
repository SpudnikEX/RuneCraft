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
	private final ModelPart RightShoulder_r1;
	private final ModelPart RightShoulder_r2;
	private final ModelPart RightShoulder_r3;
	private final ModelPart RightShoulder_r4;
	private final ModelPart RightShoulder_r5;
	private final ModelPart RightShoulder_r6;
	private final ModelPart LEFTARM;
	private final ModelPart LeftShoulder_r1;
	private final ModelPart LeftShoulder_r2;
	private final ModelPart LeftShoulder_r3;
	private final ModelPart LeftShoulder_r4;
	private final ModelPart LeftShoulder_r5;
	private final ModelPart LeftShoulder_r6;
	private final ModelPart RIGHTLEG;
	private final ModelPart RightLeg_r1;
	private final ModelPart RightLeg_r2;
	private final ModelPart RightLeg_r3;
	private final ModelPart RightLeg_r4;
	private final ModelPart RightLeg_r5;
	private final ModelPart RightLeg_r6;
	private final ModelPart RightLeg_r7;
	private final ModelPart RightLeg_r8;
	private final ModelPart LEFTLEG;
	private final ModelPart LeftLeg_r1;
	private final ModelPart LeftLeg_r2;
	private final ModelPart LeftLeg_r3;
	private final ModelPart LeftLeg_r4;
	private final ModelPart LeftLeg_r5;
	private final ModelPart LeftLeg_r6;
	private final ModelPart LeftLeg_r7;
	private final ModelPart LeftLeg_r8;
	private final ModelPart RIGHTFOOT;
	private final ModelPart RightBoot6_r1;
	private final ModelPart RightBoot5_r1;
	private final ModelPart RightBoot3_r1;
	private final ModelPart LEFTFOOT;
	private final ModelPart LeftBoot6_r1;
	private final ModelPart LeftBoot5_r1;
	private final ModelPart LeftBoot3_r1;

	public PlateArmorModel(EquipmentSlot slot) {
		super(slot);

		textureWidth = 64;
		textureHeight = 64;

		HEAD = new ModelPart(this);
		HEAD.setPivot(0.0F, 0.0F, 0.0F);
		HEAD.setTextureOffset(22, 17).addCuboid(-3.0F, -5.5F, -3.7F, 6.0F, 3.0F, -2.0F, 1.0F, false);
		HEAD.setTextureOffset(13, 54).addCuboid(-3.0F, -5.0F, -4.0F, -1.0F, 2.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(13, 54).addCuboid(-0.75F, -5.0F, -4.0F, -1.0F, 2.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(13, 54).addCuboid(1.75F, -5.0F, -4.0F, -1.0F, 2.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(13, 54).addCuboid(4.0F, -5.0F, -4.0F, -1.0F, 2.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(9, 4).addCuboid(-3.5F, -7.0F, -3.6F, 7.0F, 6.0F, 0.0F, 1.0F, false);
		HEAD.setTextureOffset(22, 24).addCuboid(0.0F, -11.1397F, 7.3096F, 0.0F, -1.0F, 1.0F, 1.0F, false);
		HEAD.setTextureOffset(18, 42).addCuboid(-0.5F, -8.0F, -0.75F, 1.0F, -1.0F, 4.0F, 1.0F, false);
		HEAD.setTextureOffset(22, 45).addCuboid(-0.5F, -8.25F, 4.25F, 1.0F, 0.0F, 0.0F, 1.0F, false);
		HEAD.setTextureOffset(2, 4).addCuboid(-3.5F, 0.25F, -3.5F, 7.0F, -1.0F, 7.0F, 1.0F, false);
		HEAD.setTextureOffset(7, 5).addCuboid(-2.5F, -7.75F, -1.75F, 5.0F, -1.0F, 4.0F, 1.0F, false);
		HEAD.setTextureOffset(4, 6).addCuboid(-3.0F, -7.5F, -2.75F, 6.0F, -1.0F, 6.0F, 1.0F, false);
		HEAD.setTextureOffset(3, 6).addCuboid(-3.5F, -7.25F, -3.5F, 7.0F, -1.0F, 7.0F, 1.0F, false);
		HEAD.setTextureOffset(10, 6).addCuboid(-3.5F, -7.0F, 4.6F, 7.0F, 6.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(10, 1).addCuboid(-3.55F, -7.0F, -3.5F, -1.0F, 6.0F, 7.0F, 1.0F, false);
		HEAD.setTextureOffset(10, 1).addCuboid(4.55F, -7.0F, -3.5F, -1.0F, 6.0F, 7.0F, 1.0F, false);

		LeftHelmetFaceGuard2_r1 = new ModelPart(this);
		LeftHelmetFaceGuard2_r1.setPivot(4.5F, -4.1315F, -2.0395F);
		HEAD.addChild(LeftHelmetFaceGuard2_r1);
		setRotationAngle(LeftHelmetFaceGuard2_r1, -0.6109F, 0.0F, 0.0F);
		LeftHelmetFaceGuard2_r1.setTextureOffset(3, 34).addCuboid(0.5F, 0.5F, -2.0F, -1.0F, -1.0F, 5.0F, 1.0F, false);

		LeftHelmetFaceGuard1_r1 = new ModelPart(this);
		LeftHelmetFaceGuard1_r1.setPivot(4.5F, -1.5874F, -2.1133F);
		HEAD.addChild(LeftHelmetFaceGuard1_r1);
		setRotationAngle(LeftHelmetFaceGuard1_r1, -0.0175F, 0.0F, 0.0F);
		LeftHelmetFaceGuard1_r1.setTextureOffset(5, 35).addCuboid(0.5F, 0.5F, -1.0F, -1.0F, -1.0F, 3.0F, 1.0F, false);
		LeftHelmetFaceGuard1_r1.setTextureOffset(5, 35).addCuboid(-8.5F, 0.5F, -1.0F, -1.0F, -1.0F, 3.0F, 1.0F, false);

		RightHelmetFaceGuard2_r1 = new ModelPart(this);
		RightHelmetFaceGuard2_r1.setPivot(-4.5F, -4.1315F, -2.0395F);
		HEAD.addChild(RightHelmetFaceGuard2_r1);
		setRotationAngle(RightHelmetFaceGuard2_r1, -0.6109F, 0.0F, 0.0F);
		RightHelmetFaceGuard2_r1.setTextureOffset(3, 34).addCuboid(0.5F, 0.5F, -2.0F, -1.0F, -1.0F, 5.0F, 1.0F, false);

		TasleMount2_r1 = new ModelPart(this);
		TasleMount2_r1.setPivot(0.0F, -9.0167F, 5.1865F);
		HEAD.addChild(TasleMount2_r1);
		setRotationAngle(TasleMount2_r1, 0.5236F, 0.0F, 0.0F);
		TasleMount2_r1.setTextureOffset(22, 44).addCuboid(-0.5F, 0.5F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, false);

		Tasle1_r1 = new ModelPart(this);
		Tasle1_r1.setPivot(0.0F, -10.5626F, 6.1975F);
		HEAD.addChild(Tasle1_r1);
		setRotationAngle(Tasle1_r1, 1.1781F, 0.0F, 0.0F);
		Tasle1_r1.setTextureOffset(22, 25).addCuboid(0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 1.0F, 1.0F, false);

		Tasle3_r1 = new ModelPart(this);
		Tasle3_r1.setPivot(0.0F, -10.5873F, 9.0096F);
		HEAD.addChild(Tasle3_r1);
		setRotationAngle(Tasle3_r1, 1.7017F, 0.0F, 0.0F);
		Tasle3_r1.setTextureOffset(23, 24).addCuboid(0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 1.0F, 1.0F, false);

		Tasle4_r1 = new ModelPart(this);
		Tasle4_r1.setPivot(0.0F, -7.8852F, 8.7732F);
		HEAD.addChild(Tasle4_r1);
		setRotationAngle(Tasle4_r1, 1.2654F, 0.0F, 0.0F);
		Tasle4_r1.setTextureOffset(22, 23).addCuboid(0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 1.0F, 1.0F, false);

		Tasle5_r1 = new ModelPart(this);
		Tasle5_r1.setPivot(0.0F, -6.2514F, 8.906F);
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
		BODY.setTextureOffset(9, 8).addCuboid(-3.0F, 8.8F, -1.05F, 6.0F, 2.0F, 2.0F, 1.2F, false);
		BODY.setTextureOffset(7, 3).addCuboid(-3.5F, 0.8F, -1.6F, 7.0F, 7.0F, 3.0F, 1.1F, false);
		BODY.setTextureOffset(9, 7).addCuboid(-3.5F, 0.8F, -1.8F, 7.0F, 4.0F, -1.0F, 1.2F, false);
		BODY.setTextureOffset(2, 48).addCuboid(-3.5F, 12.05F, -1.5F, 7.0F, -1.0F, 3.0F, 1.01F, false);

		RIGHTARM = new ModelPart(this);
		RIGHTARM.setPivot(-5.0F, 2.0F, 0.0F);
		RIGHTARM.setTextureOffset(2, 16).addCuboid(-3.0F, -1.3F, -2.0F, 3.0F, 2.0F, 4.0F, 1.3F, false);
		RIGHTARM.setTextureOffset(12, 3).addCuboid(-3.0041F, 1.9548F, -2.0F, 4.0F, 3.0F, 4.0F, 0.2F, false);
		RIGHTARM.setTextureOffset(12, 3).addCuboid(-3.0041F, 6.3548F, -2.0F, 4.0F, 3.0F, 4.0F, 0.2F, false);
		RIGHTARM.setTextureOffset(2, 16).addCuboid(-3.0541F, 5.1548F, -2.0F, 4.0F, 1.0F, 4.0F, 0.1F, false);
		RIGHTARM.setTextureOffset(20, 31).addCuboid(-3.0541F, 8.9048F, -2.0F, 4.0F, 1.0F, 4.0F, 0.1F, false);
		RIGHTARM.setTextureOffset(20, 31).addCuboid(-3.0541F, 8.6548F, -2.0F, 4.0F, 2.0F, 4.0F, -0.3F, false);

		RightShoulder_r1 = new ModelPart(this);
		RightShoulder_r1.setPivot(-1.4715F, 1.443F, 0.0F);
		RIGHTARM.addChild(RightShoulder_r1);
		setRotationAngle(RightShoulder_r1, 0.0F, 0.0F, 1.1781F);
		RightShoulder_r1.setTextureOffset(2, 16).addCuboid(0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 1.2F, false);

		RightShoulder_r2 = new ModelPart(this);
		RightShoulder_r2.setPivot(-0.9388F, -2.0367F, 0.0F);
		RIGHTARM.addChild(RightShoulder_r2);
		setRotationAngle(RightShoulder_r2, 0.0F, 0.0F, -1.3526F);
		RightShoulder_r2.setTextureOffset(2, 16).addCuboid(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 5.0F, 0.7F, false);

		RightShoulder_r3 = new ModelPart(this);
		RightShoulder_r3.setPivot(-3.0572F, -2.1292F, 0.0F);
		RIGHTARM.addChild(RightShoulder_r3);
		setRotationAngle(RightShoulder_r3, 0.0F, 0.0F, 1.4399F);
		RightShoulder_r3.setTextureOffset(2, 16).addCuboid(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 5.0F, 0.7F, false);

		RightShoulder_r4 = new ModelPart(this);
		RightShoulder_r4.setPivot(0.4021F, 2.6981F, 0.0F);
		RIGHTARM.addChild(RightShoulder_r4);
		setRotationAngle(RightShoulder_r4, 0.0F, 0.0F, 0.1309F);
		RightShoulder_r4.setTextureOffset(2, 16).addCuboid(-4.7F, -4.0F, -2.5F, 0.0F, 1.0F, 5.0F, 0.7F, false);

		RightShoulder_r5 = new ModelPart(this);
		RightShoulder_r5.setPivot(-2.7153F, 3.6943F, 0.0F);
		RIGHTARM.addChild(RightShoulder_r5);
		setRotationAngle(RightShoulder_r5, 0.0F, 0.0F, -0.1309F);
		RightShoulder_r5.setTextureOffset(2, 16).addCuboid(-0.2F, -3.0F, -2.0F, 0.0F, 0.0F, 4.0F, 1.2F, false);

		RightShoulder_r6 = new ModelPart(this);
		RightShoulder_r6.setPivot(-2.6015F, 1.2964F, 0.0F);
		RIGHTARM.addChild(RightShoulder_r6);
		setRotationAngle(RightShoulder_r6, 0.0F, 0.0F, -1.1781F);
		RightShoulder_r6.setTextureOffset(2, 16).addCuboid(-0.2F, -0.1F, -2.0F, 0.0F, 0.0F, 4.0F, 1.2F, false);

		LEFTARM = new ModelPart(this);
		LEFTARM.setPivot(5.0F, 2.0F, 0.0F);
		LEFTARM.setTextureOffset(2, 16).addCuboid(0.0F, -1.3F, -2.0F, 3.0F, 2.0F, 4.0F, 1.3F, true);
		LEFTARM.setTextureOffset(12, 3).addCuboid(-0.9959F, 6.3548F, -2.0F, 4.0F, 3.0F, 4.0F, 0.2F, true);
		LEFTARM.setTextureOffset(12, 3).addCuboid(-0.9959F, 1.9548F, -2.0F, 4.0F, 3.0F, 4.0F, 0.2F, true);
		LEFTARM.setTextureOffset(2, 16).addCuboid(-0.9459F, 5.1548F, -2.0F, 4.0F, 1.0F, 4.0F, 0.1F, true);
		LEFTARM.setTextureOffset(20, 32).addCuboid(-0.9459F, 8.9048F, -2.0F, 4.0F, 1.0F, 4.0F, 0.1F, true);
		LEFTARM.setTextureOffset(20, 32).addCuboid(-0.9459F, 8.6548F, -2.0F, 4.0F, 2.0F, 4.0F, -0.3F, true);

		LeftShoulder_r1 = new ModelPart(this);
		LeftShoulder_r1.setPivot(1.4715F, 1.443F, 0.0F);
		LEFTARM.addChild(LeftShoulder_r1);
		setRotationAngle(LeftShoulder_r1, 0.0F, 0.0F, -1.1781F);
		LeftShoulder_r1.setTextureOffset(2, 16).addCuboid(0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 1.2F, true);

		LeftShoulder_r2 = new ModelPart(this);
		LeftShoulder_r2.setPivot(0.9388F, -2.0367F, 0.0F);
		LEFTARM.addChild(LeftShoulder_r2);
		setRotationAngle(LeftShoulder_r2, 0.0F, 0.0F, 1.3526F);
		LeftShoulder_r2.setTextureOffset(2, 16).addCuboid(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 5.0F, 0.7F, true);

		LeftShoulder_r3 = new ModelPart(this);
		LeftShoulder_r3.setPivot(3.0572F, -2.1292F, 0.0F);
		LEFTARM.addChild(LeftShoulder_r3);
		setRotationAngle(LeftShoulder_r3, 0.0F, 0.0F, -1.4399F);
		LeftShoulder_r3.setTextureOffset(2, 16).addCuboid(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 5.0F, 0.7F, true);

		LeftShoulder_r4 = new ModelPart(this);
		LeftShoulder_r4.setPivot(-0.4021F, 2.6981F, 0.0F);
		LEFTARM.addChild(LeftShoulder_r4);
		setRotationAngle(LeftShoulder_r4, 0.0F, 0.0F, -0.1309F);
		LeftShoulder_r4.setTextureOffset(2, 16).addCuboid(4.7F, -4.0F, -2.5F, 0.0F, 1.0F, 5.0F, 0.7F, true);

		LeftShoulder_r5 = new ModelPart(this);
		LeftShoulder_r5.setPivot(2.7153F, 3.6943F, 0.0F);
		LEFTARM.addChild(LeftShoulder_r5);
		setRotationAngle(LeftShoulder_r5, 0.0F, 0.0F, 0.1309F);
		LeftShoulder_r5.setTextureOffset(2, 16).addCuboid(0.2F, -3.0F, -2.0F, 0.0F, 0.0F, 4.0F, 1.2F, true);

		LeftShoulder_r6 = new ModelPart(this);
		LeftShoulder_r6.setPivot(2.6015F, 1.2964F, 0.0F);
		LEFTARM.addChild(LeftShoulder_r6);
		setRotationAngle(LeftShoulder_r6, 0.0F, 0.0F, 1.1781F);
		LeftShoulder_r6.setTextureOffset(2, 16).addCuboid(0.2F, -0.1F, -2.0F, 0.0F, 0.0F, 4.0F, 1.2F, true);

		RIGHTLEG = new ModelPart(this);
		RIGHTLEG.setPivot(-1.9F, 12.0F, 0.0F);
		RIGHTLEG.setTextureOffset(4, 15).addCuboid(-1.5F, 4.8F, -1.5F, 3.0F, 5.0F, 3.0F, 0.6F, true);
		RIGHTLEG.setTextureOffset(13, 7).addCuboid(-1.5F, 3.4F, -2.4F, 3.0F, 3.0F, 0.0F, -0.1F, true);
		RIGHTLEG.setTextureOffset(13, 7).addCuboid(-1.5F, 4.9F, -1.5F, 3.0F, 0.0F, 3.0F, 0.7F, true);

		RightLeg_r1 = new ModelPart(this);
		RightLeg_r1.setPivot(-1.05F, -2.6175F, 0.0934F);
		RIGHTLEG.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, -0.0873F, 0.0F, 0.0F);
		RightLeg_r1.setTextureOffset(6, 16).addCuboid(-0.45F, 3.9F, 2.1F, 3.0F, 3.0F, 0.0F, 0.5F, true);

		RightLeg_r2 = new ModelPart(this);
		RightLeg_r2.setPivot(-1.05F, -5.1528F, -0.7607F);
		RIGHTLEG.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.0873F, 0.0F, 0.0F);
		RightLeg_r2.setTextureOffset(6, 16).addCuboid(-0.45F, 5.9F, 2.1F, 3.0F, 0.0F, 0.0F, 0.5F, true);

		RightLeg_r3 = new ModelPart(this);
		RightLeg_r3.setPivot(-1.05F, -2.6175F, -0.0934F);
		RIGHTLEG.addChild(RightLeg_r3);
		setRotationAngle(RightLeg_r3, 0.0873F, 0.0F, 0.0F);
		RightLeg_r3.setTextureOffset(6, 16).addCuboid(-0.45F, 3.9F, -2.1F, 3.0F, 3.0F, 0.0F, 0.5F, true);

		RightLeg_r4 = new ModelPart(this);
		RightLeg_r4.setPivot(-1.05F, -5.1528F, 0.7607F);
		RIGHTLEG.addChild(RightLeg_r4);
		setRotationAngle(RightLeg_r4, -0.0873F, 0.0F, 0.0F);
		RightLeg_r4.setTextureOffset(6, 16).addCuboid(-0.45F, 5.9F, -2.1F, 3.0F, 0.0F, 0.0F, 0.5F, true);

		RightLeg_r5 = new ModelPart(this);
		RightLeg_r5.setPivot(0.3947F, -5.3072F, 0.0F);
		RIGHTLEG.addChild(RightLeg_r5);
		setRotationAngle(RightLeg_r5, 0.0F, 0.0F, -0.1309F);
		RightLeg_r5.setTextureOffset(6, 16).addCuboid(0.8F, 6.0F, -1.5F, 0.0F, 0.0F, 3.0F, 0.5F, false);

		RightLeg_r6 = new ModelPart(this);
		RightLeg_r6.setPivot(-1.7F, -2.6722F, 0.0F);
		RIGHTLEG.addChild(RightLeg_r6);
		setRotationAngle(RightLeg_r6, 0.0F, 0.0F, -0.1309F);
		RightLeg_r6.setTextureOffset(6, 16).addCuboid(-0.8F, 4.0F, -1.5F, 0.0F, 3.0F, 3.0F, 0.5F, true);

		RightLeg_r7 = new ModelPart(this);
		RightLeg_r7.setPivot(-0.3947F, -5.3072F, 0.0F);
		RIGHTLEG.addChild(RightLeg_r7);
		setRotationAngle(RightLeg_r7, 0.0F, 0.0F, 0.1309F);
		RightLeg_r7.setTextureOffset(6, 16).addCuboid(-0.8F, 6.0F, -1.5F, 0.0F, 0.0F, 3.0F, 0.5F, true);

		RightLeg_r8 = new ModelPart(this);
		RightLeg_r8.setPivot(1.7F, -2.6722F, 0.0F);
		RIGHTLEG.addChild(RightLeg_r8);
		setRotationAngle(RightLeg_r8, 0.0F, 0.0F, 0.1309F);
		RightLeg_r8.setTextureOffset(6, 16).addCuboid(0.8F, 4.0F, -1.5F, 0.0F, 3.0F, 3.0F, 0.5F, false);

		LEFTLEG = new ModelPart(this);
		LEFTLEG.setPivot(1.9F, 12.0F, 0.0F);
		LEFTLEG.setTextureOffset(4, 15).addCuboid(-1.5F, 4.8F, -1.5F, 3.0F, 5.0F, 3.0F, 0.6F, false);
		LEFTLEG.setTextureOffset(13, 7).addCuboid(-1.5F, 3.4F, -2.4F, 3.0F, 3.0F, 0.0F, -0.1F, false);
		LEFTLEG.setTextureOffset(13, 7).addCuboid(-1.5F, 4.9F, -1.5F, 3.0F, 0.0F, 3.0F, 0.7F, false);

		LeftLeg_r1 = new ModelPart(this);
		LeftLeg_r1.setPivot(1.05F, -2.6175F, 0.0934F);
		LEFTLEG.addChild(LeftLeg_r1);
		setRotationAngle(LeftLeg_r1, -0.0873F, 0.0F, 0.0F);
		LeftLeg_r1.setTextureOffset(6, 18).addCuboid(-2.55F, 3.9F, 2.1F, 3.0F, 3.0F, 0.0F, 0.5F, false);

		LeftLeg_r2 = new ModelPart(this);
		LeftLeg_r2.setPivot(1.05F, -5.1528F, -0.7607F);
		LEFTLEG.addChild(LeftLeg_r2);
		setRotationAngle(LeftLeg_r2, 0.0873F, 0.0F, 0.0F);
		LeftLeg_r2.setTextureOffset(6, 18).addCuboid(-2.55F, 5.9F, 2.1F, 3.0F, 0.0F, 0.0F, 0.5F, false);

		LeftLeg_r3 = new ModelPart(this);
		LeftLeg_r3.setPivot(1.05F, -2.6175F, -0.0934F);
		LEFTLEG.addChild(LeftLeg_r3);
		setRotationAngle(LeftLeg_r3, 0.0873F, 0.0F, 0.0F);
		LeftLeg_r3.setTextureOffset(6, 18).addCuboid(-2.55F, 3.9F, -2.1F, 3.0F, 3.0F, 0.0F, 0.5F, false);

		LeftLeg_r4 = new ModelPart(this);
		LeftLeg_r4.setPivot(1.05F, -5.1528F, 0.7607F);
		LEFTLEG.addChild(LeftLeg_r4);
		setRotationAngle(LeftLeg_r4, -0.0873F, 0.0F, 0.0F);
		LeftLeg_r4.setTextureOffset(6, 18).addCuboid(-2.55F, 5.9F, -2.1F, 3.0F, 0.0F, 0.0F, 0.5F, false);

		LeftLeg_r5 = new ModelPart(this);
		LeftLeg_r5.setPivot(-0.3947F, -5.3072F, 0.0F);
		LEFTLEG.addChild(LeftLeg_r5);
		setRotationAngle(LeftLeg_r5, 0.0F, 0.0F, 0.1309F);
		LeftLeg_r5.setTextureOffset(6, 18).addCuboid(-0.8F, 6.0F, -1.5F, 0.0F, 0.0F, 3.0F, 0.5F, true);

		LeftLeg_r6 = new ModelPart(this);
		LeftLeg_r6.setPivot(1.7F, -2.6722F, 0.0F);
		LEFTLEG.addChild(LeftLeg_r6);
		setRotationAngle(LeftLeg_r6, 0.0F, 0.0F, 0.1309F);
		LeftLeg_r6.setTextureOffset(7, 16).addCuboid(0.8F, 4.0F, -1.5F, 0.0F, 3.0F, 3.0F, 0.5F, false);

		LeftLeg_r7 = new ModelPart(this);
		LeftLeg_r7.setPivot(0.3947F, -5.3072F, 0.0F);
		LEFTLEG.addChild(LeftLeg_r7);
		setRotationAngle(LeftLeg_r7, 0.0F, 0.0F, -0.1309F);
		LeftLeg_r7.setTextureOffset(6, 18).addCuboid(0.8F, 6.0F, -1.5F, 0.0F, 0.0F, 3.0F, 0.5F, false);

		LeftLeg_r8 = new ModelPart(this);
		LeftLeg_r8.setPivot(-1.7F, -2.6722F, 0.0F);
		LEFTLEG.addChild(LeftLeg_r8);
		setRotationAngle(LeftLeg_r8, 0.0F, 0.0F, -0.1309F);
		LeftLeg_r8.setTextureOffset(7, 16).addCuboid(-0.8F, 4.0F, -1.5F, 0.0F, 3.0F, 3.0F, 0.5F, true);

		RIGHTFOOT = new ModelPart(this);
		RIGHTFOOT.setPivot(-1.9F, 12.0F, 0.0F);
		RIGHTFOOT.setTextureOffset(3, 42).addCuboid(-1.5F, 10.2F, -1.5F, 3.0F, 1.0F, 3.0F, 1.0F, true);
		RIGHTFOOT.setTextureOffset(5, 44).addCuboid(-1.0F, 11.3F, -3.15F, 2.0F, 0.0F, 0.0F, 0.9F, true);
		RIGHTFOOT.setTextureOffset(10, 7).addCuboid(-1.5F, 10.3F, -1.5F, 3.0F, -2.0F, 3.0F, 1.2F, true);

		RightBoot6_r1 = new ModelPart(this);
		RightBoot6_r1.setPivot(-8.7017F, 11.2F, 0.2364F);
		RIGHTFOOT.addChild(RightBoot6_r1);
		setRotationAngle(RightBoot6_r1, 0.0F, 0.3054F, 0.0F);
		RightBoot6_r1.setTextureOffset(5, 44).addCuboid(11.5F, 0.1F, 0.0F, -1.0F, 0.0F, 0.0F, 0.9F, true);

		RightBoot5_r1 = new ModelPart(this);
		RightBoot5_r1.setPivot(-1.7891F, 11.2F, -3.0714F);
		RIGHTFOOT.addChild(RightBoot5_r1);
		setRotationAngle(RightBoot5_r1, 0.0F, -0.3054F, 0.0F);
		RightBoot5_r1.setTextureOffset(5, 44).addCuboid(0.5F, 0.1F, 0.0F, -1.0F, 0.0F, 0.0F, 0.9F, true);

		RightBoot3_r1 = new ModelPart(this);
		RightBoot3_r1.setPivot(0.5F, 11.1815F, -2.9549F);
		RIGHTFOOT.addChild(RightBoot3_r1);
		setRotationAngle(RightBoot3_r1, -1.3526F, 0.0F, 0.0F);
		RightBoot3_r1.setTextureOffset(14, 7).addCuboid(-1.5F, 0.1F, -0.2F, 2.0F, 0.0F, 0.0F, 0.8F, true);

		LEFTFOOT = new ModelPart(this);
		LEFTFOOT.setPivot(1.9F, 12.0F, 0.0F);
		LEFTFOOT.setTextureOffset(3, 42).addCuboid(-1.5F, 10.2F, -1.5F, 3.0F, 1.0F, 3.0F, 1.0F, false);
		LEFTFOOT.setTextureOffset(5, 44).addCuboid(-1.0F, 11.3F, -3.15F, 2.0F, 0.0F, 0.0F, 0.9F, false);
		LEFTFOOT.setTextureOffset(10, 7).addCuboid(-1.5F, 10.3F, -1.5F, 3.0F, -2.0F, 3.0F, 1.2F, false);

		LeftBoot6_r1 = new ModelPart(this);
		LeftBoot6_r1.setPivot(8.7017F, 11.3F, 0.2364F);
		LEFTFOOT.addChild(LeftBoot6_r1);
		setRotationAngle(LeftBoot6_r1, 0.0F, -0.3054F, 0.0F);
		LeftBoot6_r1.setTextureOffset(5, 44).addCuboid(-10.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.9F, false);

		LeftBoot5_r1 = new ModelPart(this);
		LeftBoot5_r1.setPivot(1.7891F, 11.3F, -3.0714F);
		LEFTFOOT.addChild(LeftBoot5_r1);
		setRotationAngle(LeftBoot5_r1, 0.0F, 0.3054F, 0.0F);
		LeftBoot5_r1.setTextureOffset(5, 44).addCuboid(0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.9F, false);

		LeftBoot3_r1 = new ModelPart(this);
		LeftBoot3_r1.setPivot(-0.5F, 11.1815F, -2.9549F);
		LEFTFOOT.addChild(LeftBoot3_r1);
		setRotationAngle(LeftBoot3_r1, -1.3526F, 0.0F, 0.0F);
		LeftBoot3_r1.setTextureOffset(14, 7).addCuboid(-0.5F, 0.1F, -0.2F, 2.0F, 0.0F, 0.0F, 0.8F, false);

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