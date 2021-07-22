// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports

	package com.example.mod;

	public class armor extends EntityModel<Entity> {
private final ModelPart PlayerHead;
	private final ModelPart PlayerBody;
	private final ModelPart PlayerRightArm;
	private final ModelPart PlayerLeftArm;
	private final ModelPart PlayerRightLeg;
	private final ModelPart PlayerLeftLeg;
	private final ModelPart HEAD;
	private final ModelPart RightHorn6_r1;
	private final ModelPart RightHorn4_r1;
	private final ModelPart RightHorn3_r1;
	private final ModelPart RightHorn2_r1;
	private final ModelPart RightHorn1_r1;
	private final ModelPart LeftHorn6_r1;
	private final ModelPart LeftHorn5_r1;
	private final ModelPart LeftHorn4_r1;
	private final ModelPart LeftHorn3_r1;
	private final ModelPart LeftHorn2_r1;
	private final ModelPart LeftHorn1_r1;
	private final ModelPart LeftHelmetFaceGuard2_r1;
	private final ModelPart LeftHelmetFaceGuard1_r1;
	private final ModelPart RightHelmetFaceGuard2_r1;
	private final ModelPart TasleMount3_r1;
	private final ModelPart Tasle5_r1;
	private final ModelPart Tasle4_r1;
	private final ModelPart Tasle3_r1;
	private final ModelPart Tasle1_r1;
	private final ModelPart BottomFaceguardBar_r1;
	private final ModelPart TopFaceguardBar_r1;
	private final ModelPart BODY;
	private final ModelPart BottomBrassard10_r1;
	private final ModelPart BottomBrassard9_r1;
	private final ModelPart BottomBrassard8_r1;
	private final ModelPart BottomBrassard7_r1;
	private final ModelPart BottomBrassard6_r1;
	private final ModelPart BottomBrassard5_r1;
	private final ModelPart BottomBrassard4_r1;
	private final ModelPart BottomBrassard2_r1;
	private final ModelPart TopBrassard7_r1;
	private final ModelPart TopBrassard6_r1;
	private final ModelPart RIGHTARM;
	private final ModelPart LEFTARM;
	private final ModelPart RIGHTLEG;
	private final ModelPart RightLeg1_r1;
	private final ModelPart LEFTLEG;
	private final ModelPart LeftLeg1_r1;
	private final ModelPart RIGHTFOOT;
	private final ModelPart LEFTFOOT;
public armor() {
		textureWidth = 64;
		textureHeight = 64;
		PlayerHead = new ModelPart(this);
		PlayerHead.setPivot(0.0F, 0.0F, 0.0F);
		PlayerHead.setTextureOffset(32, 48).addCuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		PlayerHead.setTextureOffset(32, 48).addCuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		PlayerBody = new ModelPart(this);
		PlayerBody.setPivot(0.0F, 0.0F, 0.0F);
		PlayerBody.setTextureOffset(40, 48).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		PlayerBody.setTextureOffset(40, 48).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

		PlayerRightArm = new ModelPart(this);
		PlayerRightArm.setPivot(-5.0F, 2.0F, 0.0F);
		PlayerRightArm.setTextureOffset(48, 48).addCuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		PlayerRightArm.setTextureOffset(48, 48).addCuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		PlayerLeftArm = new ModelPart(this);
		PlayerLeftArm.setPivot(5.0F, 2.0F, 0.0F);
		PlayerLeftArm.setTextureOffset(48, 48).addCuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		PlayerLeftArm.setTextureOffset(48, 48).addCuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		PlayerRightLeg = new ModelPart(this);
		PlayerRightLeg.setPivot(-1.9F, 13.0F, 0.0F);
		PlayerRightLeg.setTextureOffset(48, 48).addCuboid(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		PlayerRightLeg.setTextureOffset(48, 48).addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		PlayerLeftLeg = new ModelPart(this);
		PlayerLeftLeg.setPivot(1.9F, 12.0F, 0.0F);
		PlayerLeftLeg.setTextureOffset(48, 48).addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		PlayerLeftLeg.setTextureOffset(48, 48).addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		HEAD = new ModelPart(this);
		HEAD.setPivot(0.0F, 0.0F, 0.0F);
		HEAD.setTextureOffset(14, 35).addCuboid(-3.0F, -5.0F, -4.0F, -1.0F, 2.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(14, 35).addCuboid(-0.75F, -5.0F, -4.0F, -1.0F, 2.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(14, 35).addCuboid(1.75F, -5.0F, -4.0F, -1.0F, 2.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(14, 35).addCuboid(4.0F, -5.0F, -4.0F, -1.0F, 2.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(4, 49).addCuboid(-3.0F, -6.5F, -3.5F, 6.0F, 5.0F, -2.0F, 1.0F, false);
		HEAD.setTextureOffset(11, 13).addCuboid(-3.0F, -7.0F, -4.0F, 6.0F, 0.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(13, 16).addCuboid(-3.0F, -1.0F, -4.0F, 6.0F, 0.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(13, 36).addCuboid(0.0F, -10.9397F, 7.2096F, 0.0F, -1.0F, 1.0F, 1.0F, false);
		HEAD.setTextureOffset(5, 32).addCuboid(-0.5F, -8.0F, -0.75F, 1.0F, -1.0F, 4.0F, 1.0F, false);
		HEAD.setTextureOffset(5, 32).addCuboid(-0.5F, -8.25F, 4.25F, 1.0F, 0.0F, 0.0F, 1.0F, false);
		HEAD.setTextureOffset(2, 10).addCuboid(-3.5F, 0.25F, -3.5F, 7.0F, -1.0F, 7.0F, 1.0F, false);
		HEAD.setTextureOffset(2, 10).addCuboid(-3.5F, -7.25F, -3.5F, 7.0F, -1.0F, 7.0F, 1.0F, false);
		HEAD.setTextureOffset(5, 11).addCuboid(-3.0F, -7.5F, -2.75F, 6.0F, -1.0F, 6.0F, 1.0F, false);
		HEAD.setTextureOffset(5, 11).addCuboid(-2.5F, -7.75F, -1.75F, 5.0F, -1.0F, 5.0F, 1.0F, false);
		HEAD.setTextureOffset(8, 17).addCuboid(-3.5F, -7.0F, 5.0F, 7.0F, 6.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(9, 6).addCuboid(-3.75F, -7.0F, -3.5F, -1.0F, 6.0F, 7.0F, 1.0F, false);
		HEAD.setTextureOffset(10, 6).addCuboid(4.75F, -7.0F, -3.5F, -1.0F, 6.0F, 7.0F, 1.0F, false);

		RightHorn6_r1 = new ModelPart(this);
		RightHorn6_r1.setPivot(-3.5676F, -10.4037F, -2.7041F);
		HEAD.addChild(RightHorn6_r1);
		setRotationAngle(RightHorn6_r1, 0.0F, 0.0F, -0.3927F);
		RightHorn6_r1.setTextureOffset(14, 36).addCuboid(-0.35F, -0.45F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		RightHorn6_r1.setTextureOffset(14, 36).addCuboid(-0.2F, -0.45F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		RightHorn4_r1 = new ModelPart(this);
		RightHorn4_r1.setPivot(-3.2232F, -9.5722F, -2.7041F);
		HEAD.addChild(RightHorn4_r1);
		setRotationAngle(RightHorn4_r1, 0.0F, 0.0F, -0.3927F);
		RightHorn4_r1.setTextureOffset(14, 36).addCuboid(-0.5F, -0.45F, -0.35F, 1.0F, 0.0F, 0.0F, 0.0F, false);

		RightHorn3_r1 = new ModelPart(this);
		RightHorn3_r1.setPivot(-3.2232F, -9.5722F, -2.7041F);
		HEAD.addChild(RightHorn3_r1);
		setRotationAngle(RightHorn3_r1, 0.0F, 0.0F, -0.3927F);
		RightHorn3_r1.setTextureOffset(14, 36).addCuboid(-0.35F, -0.45F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, false);

		RightHorn2_r1 = new ModelPart(this);
		RightHorn2_r1.setPivot(-2.8597F, -8.6945F, -2.7041F);
		HEAD.addChild(RightHorn2_r1);
		setRotationAngle(RightHorn2_r1, 0.0F, 0.0F, -0.3927F);
		RightHorn2_r1.setTextureOffset(14, 36).addCuboid(-0.75F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		RightHorn1_r1 = new ModelPart(this);
		RightHorn1_r1.setPivot(-2.8597F, -8.6945F, -2.7041F);
		HEAD.addChild(RightHorn1_r1);
		setRotationAngle(RightHorn1_r1, 0.0F, 0.0F, -0.3927F);
		RightHorn1_r1.setTextureOffset(14, 36).addCuboid(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftHorn6_r1 = new ModelPart(this);
		LeftHorn6_r1.setPivot(3.5719F, -10.4062F, -2.7748F);
		HEAD.addChild(LeftHorn6_r1);
		setRotationAngle(LeftHorn6_r1, 0.0F, 0.0F, 0.3927F);
		LeftHorn6_r1.setTextureOffset(14, 36).addCuboid(-0.35F, -0.45F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		LeftHorn5_r1 = new ModelPart(this);
		LeftHorn5_r1.setPivot(3.5719F, -10.4062F, -2.7748F);
		HEAD.addChild(LeftHorn5_r1);
		setRotationAngle(LeftHorn5_r1, 0.0F, 0.0F, 0.3927F);
		LeftHorn5_r1.setTextureOffset(14, 36).addCuboid(-0.25F, -0.45F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		LeftHorn4_r1 = new ModelPart(this);
		LeftHorn4_r1.setPivot(3.2275F, -9.5747F, -2.7748F);
		HEAD.addChild(LeftHorn4_r1);
		setRotationAngle(LeftHorn4_r1, 0.0F, 0.0F, 0.3927F);
		LeftHorn4_r1.setTextureOffset(14, 36).addCuboid(-0.45F, -0.45F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		LeftHorn3_r1 = new ModelPart(this);
		LeftHorn3_r1.setPivot(3.2275F, -9.5747F, -2.7748F);
		HEAD.addChild(LeftHorn3_r1);
		setRotationAngle(LeftHorn3_r1, 0.0F, 0.0F, 0.3927F);
		LeftHorn3_r1.setTextureOffset(14, 36).addCuboid(-0.35F, -0.45F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		LeftHorn2_r1 = new ModelPart(this);
		LeftHorn2_r1.setPivot(2.8639F, -8.697F, -2.7748F);
		HEAD.addChild(LeftHorn2_r1);
		setRotationAngle(LeftHorn2_r1, 0.0F, 0.0F, 0.3927F);
		LeftHorn2_r1.setTextureOffset(14, 36).addCuboid(-0.75F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftHorn1_r1 = new ModelPart(this);
		LeftHorn1_r1.setPivot(2.8639F, -8.697F, -2.7748F);
		HEAD.addChild(LeftHorn1_r1);
		setRotationAngle(LeftHorn1_r1, 0.0F, 0.0F, 0.3927F);
		LeftHorn1_r1.setTextureOffset(14, 36).addCuboid(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftHelmetFaceGuard2_r1 = new ModelPart(this);
		LeftHelmetFaceGuard2_r1.setPivot(4.5F, -4.1315F, -2.0395F);
		HEAD.addChild(LeftHelmetFaceGuard2_r1);
		setRotationAngle(LeftHelmetFaceGuard2_r1, -0.6109F, 0.0F, 0.0F);
		LeftHelmetFaceGuard2_r1.setTextureOffset(10, 33).addCuboid(0.5F, 0.5F, -3.0F, -1.0F, -1.0F, 6.0F, 1.0F, false);

		LeftHelmetFaceGuard1_r1 = new ModelPart(this);
		LeftHelmetFaceGuard1_r1.setPivot(4.5F, -1.5874F, -2.1133F);
		HEAD.addChild(LeftHelmetFaceGuard1_r1);
		setRotationAngle(LeftHelmetFaceGuard1_r1, -0.0175F, 0.0F, 0.0F);
		LeftHelmetFaceGuard1_r1.setTextureOffset(12, 35).addCuboid(0.5F, 0.5F, -2.0F, -1.0F, -1.0F, 4.0F, 1.0F, false);
		LeftHelmetFaceGuard1_r1.setTextureOffset(13, 34).addCuboid(-8.5F, 0.5F, -2.0F, -1.0F, -1.0F, 4.0F, 1.0F, false);

		RightHelmetFaceGuard2_r1 = new ModelPart(this);
		RightHelmetFaceGuard2_r1.setPivot(-4.5F, -4.1315F, -2.0395F);
		HEAD.addChild(RightHelmetFaceGuard2_r1);
		setRotationAngle(RightHelmetFaceGuard2_r1, -0.6109F, 0.0F, 0.0F);
		RightHelmetFaceGuard2_r1.setTextureOffset(11, 33).addCuboid(0.5F, 0.5F, -3.0F, -1.0F, -1.0F, 6.0F, 1.0F, false);

		TasleMount3_r1 = new ModelPart(this);
		TasleMount3_r1.setPivot(0.0F, -9.0167F, 5.1865F);
		HEAD.addChild(TasleMount3_r1);
		setRotationAngle(TasleMount3_r1, 0.5236F, 0.0F, 0.0F);
		TasleMount3_r1.setTextureOffset(5, 32).addCuboid(-0.5F, 0.5F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, false);

		Tasle5_r1 = new ModelPart(this);
		Tasle5_r1.setPivot(0.0F, -6.0514F, 8.806F);
		HEAD.addChild(Tasle5_r1);
		setRotationAngle(Tasle5_r1, 2.3562F, 0.0F, 0.0F);
		Tasle5_r1.setTextureOffset(13, 36).addCuboid(0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, false);

		Tasle4_r1 = new ModelPart(this);
		Tasle4_r1.setPivot(0.0F, -7.6852F, 8.6732F);
		HEAD.addChild(Tasle4_r1);
		setRotationAngle(Tasle4_r1, 1.2654F, 0.0F, 0.0F);
		Tasle4_r1.setTextureOffset(13, 36).addCuboid(0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 1.0F, 1.0F, false);

		Tasle3_r1 = new ModelPart(this);
		Tasle3_r1.setPivot(0.0F, -10.3873F, 8.9096F);
		HEAD.addChild(Tasle3_r1);
		setRotationAngle(Tasle3_r1, 1.7017F, 0.0F, 0.0F);
		Tasle3_r1.setTextureOffset(13, 36).addCuboid(0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 1.0F, 1.0F, false);

		Tasle1_r1 = new ModelPart(this);
		Tasle1_r1.setPivot(0.0F, -10.3626F, 6.0975F);
		HEAD.addChild(Tasle1_r1);
		setRotationAngle(Tasle1_r1, 1.1781F, 0.0F, 0.0F);
		Tasle1_r1.setTextureOffset(13, 36).addCuboid(0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 1.0F, 1.0F, false);

		BottomFaceguardBar_r1 = new ModelPart(this);
		BottomFaceguardBar_r1.setPivot(0.0F, -1.631F, -4.6129F);
		HEAD.addChild(BottomFaceguardBar_r1);
		setRotationAngle(BottomFaceguardBar_r1, -0.0175F, 0.0F, 0.0F);
		BottomFaceguardBar_r1.setTextureOffset(10, 36).addCuboid(-4.0F, 0.5F, 0.5F, 8.0F, -1.0F, -1.0F, 1.0F, false);

		TopFaceguardBar_r1 = new ModelPart(this);
		TopFaceguardBar_r1.setPivot(0.0F, -6.1413F, -4.8944F);
		HEAD.addChild(TopFaceguardBar_r1);
		setRotationAngle(TopFaceguardBar_r1, -0.5934F, 0.0F, 0.0F);
		TopFaceguardBar_r1.setTextureOffset(9, 31).addCuboid(-4.0F, 0.5F, 0.5F, 8.0F, -1.0F, -1.0F, 1.0F, false);

		BODY = new ModelPart(this);
		BODY.setPivot(0.0F, 0.0F, 0.0F);
		BODY.setTextureOffset(13, 34).addCuboid(3.7459F, 2.9548F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		BODY.setTextureOffset(13, 34).addCuboid(0.7459F, 2.9548F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		BODY.setTextureOffset(13, 34).addCuboid(-4.45F, 0.25F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		BODY.setTextureOffset(13, 34).addCuboid(0.7459F, 2.9548F, 1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		BODY.setTextureOffset(2, 53).addCuboid(-4.0F, 12.65F, -1.5F, 8.0F, -1.0F, 3.0F, 1.01F, false);

		BottomBrassard10_r1 = new ModelPart(this);
		BottomBrassard10_r1.setPivot(3.3924F, 5.0155F, 2.0F);
		BODY.addChild(BottomBrassard10_r1);
		setRotationAngle(BottomBrassard10_r1, 0.0F, 0.0F, 0.7854F);
		BottomBrassard10_r1.setTextureOffset(13, 34).addCuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		BottomBrassard9_r1 = new ModelPart(this);
		BottomBrassard9_r1.setPivot(1.5233F, 6.5269F, 2.0F);
		BODY.addChild(BottomBrassard9_r1);
		setRotationAngle(BottomBrassard9_r1, 0.0F, 0.0F, 0.9599F);
		BottomBrassard9_r1.setTextureOffset(13, 34).addCuboid(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		BottomBrassard9_r1.setTextureOffset(13, 34).addCuboid(-0.5F, -1.5F, -4.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		BottomBrassard8_r1 = new ModelPart(this);
		BottomBrassard8_r1.setPivot(-0.9894F, 7.9776F, 2.0F);
		BODY.addChild(BottomBrassard8_r1);
		setRotationAngle(BottomBrassard8_r1, 0.0F, 0.0F, 1.1345F);
		BottomBrassard8_r1.setTextureOffset(13, 34).addCuboid(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		BottomBrassard7_r1 = new ModelPart(this);
		BottomBrassard7_r1.setPivot(-3.2221F, 8.793F, 2.0F);
		BODY.addChild(BottomBrassard7_r1);
		setRotationAngle(BottomBrassard7_r1, 0.0F, 0.0F, -0.2182F);
		BottomBrassard7_r1.setTextureOffset(13, 34).addCuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		BottomBrassard6_r1 = new ModelPart(this);
		BottomBrassard6_r1.setPivot(-3.7102F, 8.9012F, 0.0F);
		BODY.addChild(BottomBrassard6_r1);
		setRotationAngle(BottomBrassard6_r1, 0.0F, 0.0F, -0.2182F);
		BottomBrassard6_r1.setTextureOffset(13, 34).addCuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		BottomBrassard5_r1 = new ModelPart(this);
		BottomBrassard5_r1.setPivot(-3.2221F, 8.793F, -2.0F);
		BODY.addChild(BottomBrassard5_r1);
		setRotationAngle(BottomBrassard5_r1, 0.0F, 0.0F, -0.2182F);
		BottomBrassard5_r1.setTextureOffset(13, 34).addCuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		BottomBrassard4_r1 = new ModelPart(this);
		BottomBrassard4_r1.setPivot(-0.9894F, 7.9776F, -2.0F);
		BODY.addChild(BottomBrassard4_r1);
		setRotationAngle(BottomBrassard4_r1, 0.0F, 0.0F, 1.1345F);
		BottomBrassard4_r1.setTextureOffset(13, 34).addCuboid(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		BottomBrassard2_r1 = new ModelPart(this);
		BottomBrassard2_r1.setPivot(3.3924F, 5.0155F, -2.0F);
		BODY.addChild(BottomBrassard2_r1);
		setRotationAngle(BottomBrassard2_r1, 0.0F, 0.0F, 0.7854F);
		BottomBrassard2_r1.setTextureOffset(13, 34).addCuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		BottomBrassard2_r1.setTextureOffset(13, 34).addCuboid(-0.5F, -2.0F, -0.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		TopBrassard7_r1 = new ModelPart(this);
		TopBrassard7_r1.setPivot(-0.5736F, 3.0836F, 2.0F);
		BODY.addChild(TopBrassard7_r1);
		setRotationAngle(TopBrassard7_r1, 0.0F, 0.0F, -1.309F);
		TopBrassard7_r1.setTextureOffset(13, 34).addCuboid(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		TopBrassard7_r1.setTextureOffset(13, 34).addCuboid(-0.5F, -1.5F, -4.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		TopBrassard6_r1 = new ModelPart(this);
		TopBrassard6_r1.setPivot(-2.9795F, 1.8312F, 2.0F);
		BODY.addChild(TopBrassard6_r1);
		setRotationAngle(TopBrassard6_r1, 0.0F, 0.0F, -0.8727F);
		TopBrassard6_r1.setTextureOffset(13, 34).addCuboid(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		TopBrassard6_r1.setTextureOffset(13, 34).addCuboid(-0.5F, -1.5F, -4.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		RIGHTARM = new ModelPart(this);
		RIGHTARM.setPivot(-5.0F, 2.0F, 0.0F);
		

		LEFTARM = new ModelPart(this);
		LEFTARM.setPivot(5.0F, 2.0F, 0.0F);
		LEFTARM.setTextureOffset(11, 33).addCuboid(-0.1F, -1.3F, -2.0F, 2.0F, 2.0F, 4.0F, 1.3F, false);
		LEFTARM.setTextureOffset(11, 33).addCuboid(0.25F, -7.5F, -2.75F, 1.0F, 0.0F, 5.0F, 0.0F, false);
		LEFTARM.setTextureOffset(7, 29).addCuboid(0.25F, -6.6F, -3.75F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		LEFTARM.setTextureOffset(7, 29).addCuboid(0.25F, -5.6F, -4.75F, 1.0F, 6.0F, 9.0F, 0.0F, false);
		LEFTARM.setTextureOffset(7, 29).addCuboid(0.25F, 0.4F, -3.75F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		LEFTARM.setTextureOffset(8, 10).addCuboid(-1.1541F, 6.2548F, -2.2F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		LEFTARM.setTextureOffset(8, 9).addCuboid(-1.2541F, 1.8548F, -2.4F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		LEFTARM.setTextureOffset(7, 7).addCuboid(-1.0541F, -2.1452F, -2.1F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		RIGHTLEG = new ModelPart(this);
		RIGHTLEG.setPivot(-1.9F, 12.0F, 0.0F);
		RIGHTLEG.setTextureOffset(11, 33).addCuboid(-1.65F, 1.6F, -1.15F, 3.0F, 3.0F, 2.0F, 1.0F, false);
		RIGHTLEG.setTextureOffset(11, 33).addCuboid(-3.0181F, 5.3588F, -1.15F, 0.0F, 0.0F, 2.0F, 1.0F, false);

		RightLeg1_r1 = new ModelPart(this);
		RightLeg1_r1.setPivot(-2.3943F, 2.8214F, 0.05F);
		RIGHTLEG.addChild(RightLeg1_r1);
		setRotationAngle(RightLeg1_r1, 0.0F, 0.0F, 0.3491F);
		RightLeg1_r1.setTextureOffset(11, 33).addCuboid(0.0F, -1.0F, -1.2F, 0.0F, 2.0F, 2.0F, 1.0F, true);

		LEFTLEG = new ModelPart(this);
		LEFTLEG.setPivot(1.9F, 12.0F, 0.0F);
		LEFTLEG.setTextureOffset(10, 34).addCuboid(-1.45F, 1.6F, -1.15F, 3.0F, 3.0F, 2.0F, 1.0F, false);
		LEFTLEG.setTextureOffset(10, 34).addCuboid(2.9181F, 5.3588F, -1.15F, 0.0F, 0.0F, 2.0F, 1.0F, false);

		LeftLeg1_r1 = new ModelPart(this);
		LeftLeg1_r1.setPivot(2.2943F, 2.8214F, 0.05F);
		LEFTLEG.addChild(LeftLeg1_r1);
		setRotationAngle(LeftLeg1_r1, 0.0F, 0.0F, -0.3491F);
		LeftLeg1_r1.setTextureOffset(10, 34).addCuboid(0.0F, -1.0F, -1.2F, 0.0F, 2.0F, 2.0F, 1.0F, false);

		RIGHTFOOT = new ModelPart(this);
		RIGHTFOOT.setPivot(0.0F, 24.0F, 0.0F);
		RIGHTFOOT.setTextureOffset(3, 58).addCuboid(-3.6F, -0.7F, -1.3F, 3.0F, 0.0F, 2.0F, 1.0F, false);
		RIGHTFOOT.setTextureOffset(4, 58).addCuboid(-3.5F, -0.4F, -2.5F, 2.0F, 0.0F, 3.0F, 1.0F, false);

		LEFTFOOT = new ModelPart(this);
		LEFTFOOT.setPivot(0.0F, 24.0F, 0.0F);
		LEFTFOOT.setTextureOffset(3, 58).addCuboid(0.55F, -0.7F, -1.3F, 3.0F, 0.0F, 2.0F, 1.0F, false);
		LEFTFOOT.setTextureOffset(4, 58).addCuboid(0.65F, -0.4F, -2.5F, 2.0F, 0.0F, 3.0F, 1.0F, false);
}
@Override
public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
}
@Override
public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		PlayerHead.render(matrixStack, buffer, packedLight, packedOverlay);
		PlayerBody.render(matrixStack, buffer, packedLight, packedOverlay);
		PlayerRightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		PlayerLeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		PlayerRightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		PlayerLeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		HEAD.render(matrixStack, buffer, packedLight, packedOverlay);
		BODY.render(matrixStack, buffer, packedLight, packedOverlay);
		RIGHTARM.render(matrixStack, buffer, packedLight, packedOverlay);
		LEFTARM.render(matrixStack, buffer, packedLight, packedOverlay);
		RIGHTLEG.render(matrixStack, buffer, packedLight, packedOverlay);
		LEFTLEG.render(matrixStack, buffer, packedLight, packedOverlay);
		RIGHTFOOT.render(matrixStack, buffer, packedLight, packedOverlay);
		LEFTFOOT.render(matrixStack, buffer, packedLight, packedOverlay);
}
public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
}

	}