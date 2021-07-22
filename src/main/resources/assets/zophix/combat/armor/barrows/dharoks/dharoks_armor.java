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
	private final ModelPart Helmetrightside6_r1;
	private final ModelPart Helmetrightside5_r1;
	private final ModelPart Helmetrightside4_r1;
	private final ModelPart Helmetrightside3_r1;
	private final ModelPart Helmetrightside2_r1;
	private final ModelPart Helmetrightside1_r1;
	private final ModelPart HelmetLeftside6_r1;
	private final ModelPart HelmetLeftside5_r1;
	private final ModelPart HelmetLeftside4_r1;
	private final ModelPart HelmetLeftside3_r1;
	private final ModelPart HelmetLeftside2_r1;
	private final ModelPart HelmetLeftside1_r1;
	private final ModelPart HelmetFaceguard8_r1;
	private final ModelPart HelmetFaceguard7_r1;
	private final ModelPart HelmetFaceguard6_r1;
	private final ModelPart HelmetFaceguard5_r1;
	private final ModelPart HelmetFaceguard4_r1;
	private final ModelPart HelmetFaceguard3_r1;
	private final ModelPart HelmetFaceguard2_r1;
	private final ModelPart HelmetFaceguard1_r1;
	private final ModelPart HelmetBlack4_r1;
	private final ModelPart HelmetBlack3_r1;
	private final ModelPart HelmetBlack2_r1;
	private final ModelPart HelmetBlack1_r1;
	private final ModelPart HelmetTop3_r1;
	private final ModelPart HelmetTop2_r1;
	private final ModelPart HelmetHorn3_r1;
	private final ModelPart HelmetHorn2_r1;
	private final ModelPart HelmetHorn1_r1;
	private final ModelPart BODY;
	private final ModelPart BodyHorn2_r1;
	private final ModelPart BodyHorn1_r1;
	private final ModelPart BodyHorn2_r2;
	private final ModelPart BodyHorn1_r2;
	private final ModelPart RIGHTARM;
	private final ModelPart RightArmHorn3_r1;
	private final ModelPart RightArmHorn2_r1;
	private final ModelPart RightArmHorn1_r1;
	private final ModelPart RightArmHorn2_r2;
	private final ModelPart RightArmHorn1_r2;
	private final ModelPart RightShoulderHorn3_r1;
	private final ModelPart RightShoulderHorn2_r1;
	private final ModelPart RightShoulderHorn1_r1;
	private final ModelPart RightShoulderHorn3_r2;
	private final ModelPart RightShoulderHorn2_r2;
	private final ModelPart RightShoulderHorn1_r2;
	private final ModelPart RightShoulderHorn3_r3;
	private final ModelPart RightShoulderHorn2_r3;
	private final ModelPart RightShoulderHorn1_r3;
	private final ModelPart LEFTARM;
	private final ModelPart LeftArmHorn3_r1;
	private final ModelPart LeftArmHorn2_r1;
	private final ModelPart LeftArmHorn1_r1;
	private final ModelPart LeftArmHorn2_r2;
	private final ModelPart LeftArmHorn1_r2;
	private final ModelPart RIGHTLEG;
	private final ModelPart RightKneecapHorn2_r1;
	private final ModelPart RightKneecapHorn1_r1;
	private final ModelPart LEFTLEG;
	private final ModelPart LeftKneecapHorn2_r1;
	private final ModelPart LeftKneecapHorn1_r1;
	private final ModelPart RIGHTFOOT;
	private final ModelPart LEFTFOOT;
public armor() {
		textureWidth = 64;
		textureHeight = 64;
		PlayerHead = new ModelPart(this);
		PlayerHead.setPivot(0.0F, 0.0F, 0.0F);
		PlayerHead.setTextureOffset(32, 28).addCuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		PlayerHead.setTextureOffset(32, 48).addCuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		PlayerBody = new ModelPart(this);
		PlayerBody.setPivot(0.0F, 0.0F, 0.0F);
		PlayerBody.setTextureOffset(40, 28).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		PlayerBody.setTextureOffset(40, 48).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

		PlayerRightArm = new ModelPart(this);
		PlayerRightArm.setPivot(-5.0F, 2.0F, 0.0F);
		PlayerRightArm.setTextureOffset(48, 28).addCuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		PlayerRightArm.setTextureOffset(48, 28).addCuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		PlayerLeftArm = new ModelPart(this);
		PlayerLeftArm.setPivot(5.0F, 2.0F, 0.0F);
		PlayerLeftArm.setTextureOffset(48, 28).addCuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		PlayerLeftArm.setTextureOffset(48, 28).addCuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		PlayerRightLeg = new ModelPart(this);
		PlayerRightLeg.setPivot(-1.9F, 13.0F, 0.0F);
		PlayerRightLeg.setTextureOffset(48, 27).addCuboid(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		PlayerRightLeg.setTextureOffset(48, 27).addCuboid(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		PlayerLeftLeg = new ModelPart(this);
		PlayerLeftLeg.setPivot(1.9F, 12.0F, 0.0F);
		PlayerLeftLeg.setTextureOffset(48, 28).addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		PlayerLeftLeg.setTextureOffset(48, 28).addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		HEAD = new ModelPart(this);
		HEAD.setPivot(0.0F, 0.0F, 0.0F);
		HEAD.setTextureOffset(5, 3).addCuboid(0.0F, -8.2F, -4.1F, 5.0F, 1.0F, 7.0F, 0.0F, false);
		HEAD.setTextureOffset(5, 3).addCuboid(-4.9F, -8.2F, -4.1F, 5.0F, 1.0F, 7.0F, 0.0F, false);
		HEAD.setTextureOffset(5, 3).addCuboid(-0.7815F, -8.2F, 2.841F, 5.0F, 1.0F, 2.0F, 0.0F, false);
		HEAD.setTextureOffset(5, 3).addCuboid(-3.982F, -8.2F, 2.8021F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		HEAD.setTextureOffset(5, 11).addCuboid(-3.0F, -7.5F, -2.75F, 6.0F, -1.0F, 6.0F, 1.0F, false);
		HEAD.setTextureOffset(5, 11).addCuboid(-2.5F, -7.75F, -1.75F, 5.0F, -1.0F, 5.0F, 1.0F, false);
		HEAD.setTextureOffset(3, 3).addCuboid(-3.5F, 0.05F, -3.0F, 7.0F, -1.0F, 6.0F, 1.0F, false);
		HEAD.setTextureOffset(10, 2).addCuboid(-0.1141F, -7.917F, 3.9153F, 4.0F, 8.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(11, 2).addCuboid(-4.3141F, -7.917F, 3.9153F, 4.0F, 8.0F, 1.0F, 0.0F, false);

		Helmetrightside6_r1 = new ModelPart(this);
		Helmetrightside6_r1.setPivot(-4.5078F, -1.8877F, 3.1916F);
		HEAD.addChild(Helmetrightside6_r1);
		setRotationAngle(Helmetrightside6_r1, -0.0254F, 0.3482F, -0.0743F);
		Helmetrightside6_r1.setTextureOffset(13, 4).addCuboid(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, 0.0F, false);

		Helmetrightside5_r1 = new ModelPart(this);
		Helmetrightside5_r1.setPivot(-4.6378F, -4.848F, 3.2389F);
		HEAD.addChild(Helmetrightside5_r1);
		setRotationAngle(Helmetrightside5_r1, 0.0F, 0.3491F, 0.0F);
		Helmetrightside5_r1.setTextureOffset(12, 4).addCuboid(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		Helmetrightside4_r1 = new ModelPart(this);
		Helmetrightside4_r1.setPivot(-4.5733F, -6.8106F, 3.2154F);
		HEAD.addChild(Helmetrightside4_r1);
		setRotationAngle(Helmetrightside4_r1, 0.0254F, 0.3482F, 0.0743F);
		Helmetrightside4_r1.setTextureOffset(12, 4).addCuboid(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		Helmetrightside3_r1 = new ModelPart(this);
		Helmetrightside3_r1.setPivot(-4.7233F, -1.8877F, -0.9326F);
		HEAD.addChild(Helmetrightside3_r1);
		setRotationAngle(Helmetrightside3_r1, 0.0061F, -0.0871F, -0.0701F);
		Helmetrightside3_r1.setTextureOffset(10, 2).addCuboid(-0.5F, -2.0F, -3.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);

		Helmetrightside2_r1 = new ModelPart(this);
		Helmetrightside2_r1.setPivot(-4.8611F, -4.848F, -0.9447F);
		HEAD.addChild(Helmetrightside2_r1);
		setRotationAngle(Helmetrightside2_r1, 0.0F, -0.0873F, 0.0F);
		Helmetrightside2_r1.setTextureOffset(10, 3).addCuboid(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);

		Helmetrightside1_r1 = new ModelPart(this);
		Helmetrightside1_r1.setPivot(-4.7928F, -6.8106F, -0.9387F);
		HEAD.addChild(Helmetrightside1_r1);
		setRotationAngle(Helmetrightside1_r1, -0.0061F, -0.0871F, 0.0701F);
		Helmetrightside1_r1.setTextureOffset(10, 3).addCuboid(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);

		HelmetLeftside6_r1 = new ModelPart(this);
		HelmetLeftside6_r1.setPivot(4.5613F, -1.947F, 3.1829F);
		HEAD.addChild(HelmetLeftside6_r1);
		setRotationAngle(HelmetLeftside6_r1, -0.0254F, -0.3482F, 0.0743F);
		HelmetLeftside6_r1.setTextureOffset(12, 4).addCuboid(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, 0.0F, false);

		HelmetLeftside5_r1 = new ModelPart(this);
		HelmetLeftside5_r1.setPivot(4.6913F, -4.9072F, 3.2302F);
		HEAD.addChild(HelmetLeftside5_r1);
		setRotationAngle(HelmetLeftside5_r1, 0.0F, -0.3491F, 0.0F);
		HelmetLeftside5_r1.setTextureOffset(13, 5).addCuboid(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		HelmetLeftside4_r1 = new ModelPart(this);
		HelmetLeftside4_r1.setPivot(4.6269F, -6.8699F, 3.2068F);
		HEAD.addChild(HelmetLeftside4_r1);
		setRotationAngle(HelmetLeftside4_r1, 0.0254F, -0.3482F, -0.0743F);
		HelmetLeftside4_r1.setTextureOffset(12, 5).addCuboid(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		HelmetLeftside3_r1 = new ModelPart(this);
		HelmetLeftside3_r1.setPivot(4.7768F, -1.947F, -0.9413F);
		HEAD.addChild(HelmetLeftside3_r1);
		setRotationAngle(HelmetLeftside3_r1, 0.0061F, 0.0871F, 0.0701F);
		HelmetLeftside3_r1.setTextureOffset(9, 2).addCuboid(-0.5F, -2.0F, -3.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);

		HelmetLeftside2_r1 = new ModelPart(this);
		HelmetLeftside2_r1.setPivot(4.9146F, -4.9072F, -0.9533F);
		HEAD.addChild(HelmetLeftside2_r1);
		setRotationAngle(HelmetLeftside2_r1, 0.0F, 0.0873F, 0.0F);
		HelmetLeftside2_r1.setTextureOffset(9, 3).addCuboid(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);

		HelmetLeftside1_r1 = new ModelPart(this);
		HelmetLeftside1_r1.setPivot(4.8463F, -6.8699F, -0.9473F);
		HEAD.addChild(HelmetLeftside1_r1);
		setRotationAngle(HelmetLeftside1_r1, -0.0061F, 0.0871F, -0.0701F);
		HelmetLeftside1_r1.setTextureOffset(8, 3).addCuboid(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);

		HelmetFaceguard8_r1 = new ModelPart(this);
		HelmetFaceguard8_r1.setPivot(-3.94F, -4.4398F, -3.9898F);
		HEAD.addChild(HelmetFaceguard8_r1);
		setRotationAngle(HelmetFaceguard8_r1, 0.0873F, 0.2182F, 0.0F);
		HelmetFaceguard8_r1.setTextureOffset(12, 10).addCuboid(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		HelmetFaceguard7_r1 = new ModelPart(this);
		HelmetFaceguard7_r1.setPivot(3.7855F, -4.4398F, -3.9898F);
		HEAD.addChild(HelmetFaceguard7_r1);
		setRotationAngle(HelmetFaceguard7_r1, 0.0873F, -0.2182F, 0.0F);
		HelmetFaceguard7_r1.setTextureOffset(14, 5).addCuboid(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		HelmetFaceguard6_r1 = new ModelPart(this);
		HelmetFaceguard6_r1.setPivot(-2.4103F, -6.7586F, -4.2513F);
		HEAD.addChild(HelmetFaceguard6_r1);
		setRotationAngle(HelmetFaceguard6_r1, -0.7734F, -1.2635F, 0.7974F);
		HelmetFaceguard6_r1.setTextureOffset(10, 3).addCuboid(-0.5F, -1.0F, -2.55F, 1.0F, 2.0F, 5.0F, 0.0F, false);

		HelmetFaceguard5_r1 = new ModelPart(this);
		HelmetFaceguard5_r1.setPivot(2.2559F, -6.7586F, -4.2513F);
		HEAD.addChild(HelmetFaceguard5_r1);
		setRotationAngle(HelmetFaceguard5_r1, -0.7734F, 1.2635F, -0.7974F);
		HelmetFaceguard5_r1.setTextureOffset(10, 4).addCuboid(-0.5F, -1.0F, -2.55F, 1.0F, 2.0F, 5.0F, 0.0F, false);

		HelmetFaceguard4_r1 = new ModelPart(this);
		HelmetFaceguard4_r1.setPivot(0.3625F, -0.3963F, -4.4366F);
		HEAD.addChild(HelmetFaceguard4_r1);
		setRotationAngle(HelmetFaceguard4_r1, 2.8529F, -1.3419F, -2.858F);
		HelmetFaceguard4_r1.setTextureOffset(10, 3).addCuboid(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		HelmetFaceguard3_r1 = new ModelPart(this);
		HelmetFaceguard3_r1.setPivot(2.8055F, -1.9234F, -3.9897F);
		HEAD.addChild(HelmetFaceguard3_r1);
		setRotationAngle(HelmetFaceguard3_r1, 2.8529F, -1.3419F, -2.858F);
		HelmetFaceguard3_r1.setTextureOffset(10, 3).addCuboid(-0.55F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		HelmetFaceguard2_r1 = new ModelPart(this);
		HelmetFaceguard2_r1.setPivot(-0.3152F, -0.3949F, -4.4249F);
		HEAD.addChild(HelmetFaceguard2_r1);
		setRotationAngle(HelmetFaceguard2_r1, 0.3048F, -1.3419F, -0.3125F);
		HelmetFaceguard2_r1.setTextureOffset(10, 3).addCuboid(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		HelmetFaceguard1_r1 = new ModelPart(this);
		HelmetFaceguard1_r1.setPivot(-2.7786F, -1.8912F, -3.986F);
		HEAD.addChild(HelmetFaceguard1_r1);
		setRotationAngle(HelmetFaceguard1_r1, 0.3048F, -1.3419F, -0.3125F);
		HelmetFaceguard1_r1.setTextureOffset(10, 3).addCuboid(-0.55F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		HelmetBlack4_r1 = new ModelPart(this);
		HelmetBlack4_r1.setPivot(0.379F, -2.3441F, -4.1722F);
		HEAD.addChild(HelmetBlack4_r1);
		setRotationAngle(HelmetBlack4_r1, 2.8529F, -1.3419F, -2.858F);
		HelmetBlack4_r1.setTextureOffset(5, 47).addCuboid(-0.55F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		HelmetBlack3_r1 = new ModelPart(this);
		HelmetBlack3_r1.setPivot(-0.3605F, -2.342F, -4.1675F);
		HEAD.addChild(HelmetBlack3_r1);
		setRotationAngle(HelmetBlack3_r1, 0.3048F, -1.3419F, -0.3125F);
		HelmetBlack3_r1.setTextureOffset(5, 47).addCuboid(-0.55F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		HelmetBlack2_r1 = new ModelPart(this);
		HelmetBlack2_r1.setPivot(-1.907F, -4.8F, -3.9816F);
		HEAD.addChild(HelmetBlack2_r1);
		setRotationAngle(HelmetBlack2_r1, 0.0F, -1.3526F, 0.0F);
		HelmetBlack2_r1.setTextureOffset(2, 46).addCuboid(-0.5F, -1.0F, -2.05F, 1.0F, 2.0F, 4.0F, 0.0F, false);

		HelmetBlack1_r1 = new ModelPart(this);
		HelmetBlack1_r1.setPivot(1.8094F, -4.8F, -4.0033F);
		HEAD.addChild(HelmetBlack1_r1);
		setRotationAngle(HelmetBlack1_r1, 0.0F, 1.3526F, 0.0F);
		HelmetBlack1_r1.setTextureOffset(3, 47).addCuboid(-0.5F, -1.0F, -1.95F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		HelmetTop3_r1 = new ModelPart(this);
		HelmetTop3_r1.setPivot(-4.1017F, -7.7F, 3.7827F);
		HEAD.addChild(HelmetTop3_r1);
		setRotationAngle(HelmetTop3_r1, -3.1416F, 1.2392F, -3.1416F);
		HelmetTop3_r1.setTextureOffset(5, 3).addCuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		HelmetTop2_r1 = new ModelPart(this);
		HelmetTop2_r1.setPivot(4.149F, -7.7F, 3.7251F);
		HEAD.addChild(HelmetTop2_r1);
		setRotationAngle(HelmetTop2_r1, 0.0F, 1.1694F, 0.0F);
		HelmetTop2_r1.setTextureOffset(5, 3).addCuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		HelmetHorn3_r1 = new ModelPart(this);
		HelmetHorn3_r1.setPivot(0.0189F, -8.9925F, 0.5252F);
		HEAD.addChild(HelmetHorn3_r1);
		setRotationAngle(HelmetHorn3_r1, 0.0F, 0.0F, 0.0F);
		HelmetHorn3_r1.setTextureOffset(37, 58).addCuboid(-0.7F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		HelmetHorn2_r1 = new ModelPart(this);
		HelmetHorn2_r1.setPivot(0.0189F, -9.9425F, 0.5252F);
		HEAD.addChild(HelmetHorn2_r1);
		setRotationAngle(HelmetHorn2_r1, 0.0F, 0.0F, 0.0F);
		HelmetHorn2_r1.setTextureOffset(37, 58).addCuboid(-0.45F, -0.45F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, false);

		HelmetHorn1_r1 = new ModelPart(this);
		HelmetHorn1_r1.setPivot(0.0189F, -10.8425F, 0.5252F);
		HEAD.addChild(HelmetHorn1_r1);
		setRotationAngle(HelmetHorn1_r1, 0.0F, 0.0F, 0.0F);
		HelmetHorn1_r1.setTextureOffset(37, 58).addCuboid(-0.25F, -0.45F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		BODY = new ModelPart(this);
		BODY.setPivot(0.0F, 0.0F, 0.0F);
		BODY.setTextureOffset(9, 8).addCuboid(-3.5F, 8.5F, -1.35F, 7.0F, 3.0F, -1.0F, 1.01F, false);
		BODY.setTextureOffset(9, 7).addCuboid(-3.7F, 0.5F, -2.0F, 7.0F, 4.0F, -1.0F, 1.01F, false);
		BODY.setTextureOffset(9, 8).addCuboid(-3.6F, 3.9F, -1.5F, 7.0F, 4.0F, -1.0F, 1.01F, false);
		BODY.setTextureOffset(6, 4).addCuboid(-3.8F, 0.6F, -1.4F, 7.0F, 5.0F, 3.0F, 1.01F, false);
		BODY.setTextureOffset(7, 6).addCuboid(-3.5F, 7.6F, -0.6F, 7.0F, 3.0F, 2.0F, 1.01F, false);
		BODY.setTextureOffset(33, 59).addCuboid(-0.5747F, 7.6F, -2.5243F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		BODY.setTextureOffset(33, 59).addCuboid(-0.5747F, 9.6F, -2.5243F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		BODY.setTextureOffset(2, 53).addCuboid(-4.0F, 12.65F, -1.5F, 8.0F, -1.0F, 3.0F, 1.01F, false);

		BodyHorn2_r1 = new ModelPart(this);
		BodyHorn2_r1.setPivot(-0.0258F, 10.0545F, -2.643F);
		BODY.addChild(BodyHorn2_r1);
		setRotationAngle(BodyHorn2_r1, 0.7854F, 0.0F, 0.0F);
		BodyHorn2_r1.setTextureOffset(33, 59).addCuboid(-0.45F, -0.675F, -0.45F, 0.0F, 1.0F, 0.0F, 0.0F, false);

		BodyHorn1_r1 = new ModelPart(this);
		BodyHorn1_r1.setPivot(-0.0357F, 9.312F, -3.3264F);
		BODY.addChild(BodyHorn1_r1);
		setRotationAngle(BodyHorn1_r1, 0.7854F, 0.0F, 0.0F);
		BodyHorn1_r1.setTextureOffset(33, 59).addCuboid(-0.35F, -0.375F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		BodyHorn2_r2 = new ModelPart(this);
		BodyHorn2_r2.setPivot(-0.0258F, 8.0545F, -2.643F);
		BODY.addChild(BodyHorn2_r2);
		setRotationAngle(BodyHorn2_r2, 0.7854F, 0.0F, 0.0F);
		BodyHorn2_r2.setTextureOffset(33, 59).addCuboid(-0.45F, -0.675F, -0.45F, 0.0F, 1.0F, 0.0F, 0.0F, false);

		BodyHorn1_r2 = new ModelPart(this);
		BodyHorn1_r2.setPivot(-0.0357F, 7.312F, -3.3264F);
		BODY.addChild(BodyHorn1_r2);
		setRotationAngle(BodyHorn1_r2, 0.7854F, 0.0F, 0.0F);
		BodyHorn1_r2.setTextureOffset(33, 59).addCuboid(-0.35F, -0.375F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		RIGHTARM = new ModelPart(this);
		RIGHTARM.setPivot(-5.0F, 2.0F, 0.0F);
		RIGHTARM.setTextureOffset(7, 32).addCuboid(-3.0F, -1.3F, -2.0F, 4.0F, 2.0F, 4.0F, 1.5F, false);
		RIGHTARM.setTextureOffset(8, 32).addCuboid(-3.1541F, 4.2548F, -2.1F, 4.0F, 3.0F, 4.0F, 0.0F, false);

		RightArmHorn3_r1 = new ModelPart(this);
		RightArmHorn3_r1.setPivot(-3.3753F, 6.525F, 0.2257F);
		RIGHTARM.addChild(RightArmHorn3_r1);
		setRotationAngle(RightArmHorn3_r1, 0.0F, 1.5708F, 0.0F);
		RightArmHorn3_r1.setTextureOffset(33, 59).addCuboid(-0.55F, -0.625F, -0.35F, 1.0F, 1.0F, 0.0F, 0.0F, true);
		RightArmHorn3_r1.setTextureOffset(33, 59).addCuboid(-0.55F, -2.225F, -0.35F, 1.0F, 1.0F, 0.0F, 0.0F, true);

		RightArmHorn2_r1 = new ModelPart(this);
		RightArmHorn2_r1.setPivot(-3.5742F, 6.3545F, 0.257F);
		RIGHTARM.addChild(RightArmHorn2_r1);
		setRotationAngle(RightArmHorn2_r1, 0.0F, 1.5708F, -0.7854F);
		RightArmHorn2_r1.setTextureOffset(33, 59).addCuboid(-0.45F, -0.675F, -0.45F, 0.0F, 1.0F, 0.0F, 0.0F, true);

		RightArmHorn1_r1 = new ModelPart(this);
		RightArmHorn1_r1.setPivot(-4.0764F, 5.8242F, 0.2736F);
		RIGHTARM.addChild(RightArmHorn1_r1);
		setRotationAngle(RightArmHorn1_r1, 0.0F, 1.5708F, -0.7854F);
		RightArmHorn1_r1.setTextureOffset(33, 59).addCuboid(-0.35F, -0.375F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, true);

		RightArmHorn2_r2 = new ModelPart(this);
		RightArmHorn2_r2.setPivot(-3.5742F, 4.7545F, 0.257F);
		RIGHTARM.addChild(RightArmHorn2_r2);
		setRotationAngle(RightArmHorn2_r2, 0.0F, 1.5708F, -0.7854F);
		RightArmHorn2_r2.setTextureOffset(33, 59).addCuboid(-0.45F, -0.675F, -0.45F, 0.0F, 1.0F, 0.0F, 0.0F, true);

		RightArmHorn1_r2 = new ModelPart(this);
		RightArmHorn1_r2.setPivot(-4.0764F, 4.2242F, 0.2736F);
		RIGHTARM.addChild(RightArmHorn1_r2);
		setRotationAngle(RightArmHorn1_r2, 0.0F, 1.5708F, -0.7854F);
		RightArmHorn1_r2.setTextureOffset(33, 59).addCuboid(-0.35F, -0.375F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, true);

		RightShoulderHorn3_r1 = new ModelPart(this);
		RightShoulderHorn3_r1.setPivot(-4.2106F, -2.475F, -3.2097F);
		RIGHTARM.addChild(RightShoulderHorn3_r1);
		setRotationAngle(RightShoulderHorn3_r1, 0.0F, 0.7854F, 0.0F);
		RightShoulderHorn3_r1.setTextureOffset(33, 59).addCuboid(-0.55F, -0.625F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		RightShoulderHorn2_r1 = new ModelPart(this);
		RightShoulderHorn2_r1.setPivot(-4.4852F, -2.7162F, -3.4843F);
		RIGHTARM.addChild(RightShoulderHorn2_r1);
		setRotationAngle(RightShoulderHorn2_r1, 0.7854F, 0.7854F, 0.0F);
		RightShoulderHorn2_r1.setTextureOffset(33, 59).addCuboid(-0.45F, -0.675F, -0.45F, 0.0F, 1.0F, 0.0F, 0.0F, true);

		RightShoulderHorn1_r1 = new ModelPart(this);
		RightShoulderHorn1_r1.setPivot(-4.9602F, -3.388F, -3.9593F);
		RIGHTARM.addChild(RightShoulderHorn1_r1);
		setRotationAngle(RightShoulderHorn1_r1, 0.7854F, 0.7854F, 0.0F);
		RightShoulderHorn1_r1.setTextureOffset(33, 59).addCuboid(-0.35F, -0.375F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, true);

		RightShoulderHorn3_r2 = new ModelPart(this);
		RightShoulderHorn3_r2.setPivot(-4.2253F, -2.475F, 0.2257F);
		RIGHTARM.addChild(RightShoulderHorn3_r2);
		setRotationAngle(RightShoulderHorn3_r2, 0.0F, 1.5708F, 0.0F);
		RightShoulderHorn3_r2.setTextureOffset(33, 59).addCuboid(-0.55F, -0.625F, -0.5F, 1.0F, 1.0F, 1.0F, 0.3F, true);

		RightShoulderHorn2_r2 = new ModelPart(this);
		RightShoulderHorn2_r2.setPivot(-5.1277F, -2.999F, 0.257F);
		RIGHTARM.addChild(RightShoulderHorn2_r2);
		setRotationAngle(RightShoulderHorn2_r2, 0.0F, 1.5708F, -0.7854F);
		RightShoulderHorn2_r2.setTextureOffset(33, 59).addCuboid(-0.45F, -0.675F, -0.45F, 0.0F, 1.0F, 0.0F, 0.1F, true);

		RightShoulderHorn1_r2 = new ModelPart(this);
		RightShoulderHorn1_r2.setPivot(-5.8421F, -3.7415F, 0.2736F);
		RIGHTARM.addChild(RightShoulderHorn1_r2);
		setRotationAngle(RightShoulderHorn1_r2, 0.0F, 1.5708F, -0.7854F);
		RightShoulderHorn1_r2.setTextureOffset(33, 59).addCuboid(-0.35F, -0.375F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, true);

		RightShoulderHorn3_r3 = new ModelPart(this);
		RightShoulderHorn3_r3.setPivot(-4.2106F, -2.475F, 3.2097F);
		RIGHTARM.addChild(RightShoulderHorn3_r3);
		setRotationAngle(RightShoulderHorn3_r3, 0.0F, -0.7854F, 0.0F);
		RightShoulderHorn3_r3.setTextureOffset(33, 59).addCuboid(-0.55F, -0.625F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		RightShoulderHorn2_r3 = new ModelPart(this);
		RightShoulderHorn2_r3.setPivot(-4.4852F, -2.7162F, 3.4843F);
		RIGHTARM.addChild(RightShoulderHorn2_r3);
		setRotationAngle(RightShoulderHorn2_r3, -0.7854F, -0.7854F, 0.0F);
		RightShoulderHorn2_r3.setTextureOffset(33, 59).addCuboid(-0.45F, -0.675F, -0.45F, 0.0F, 1.0F, 0.0F, 0.0F, true);

		RightShoulderHorn1_r3 = new ModelPart(this);
		RightShoulderHorn1_r3.setPivot(-4.9602F, -3.388F, 3.9593F);
		RIGHTARM.addChild(RightShoulderHorn1_r3);
		setRotationAngle(RightShoulderHorn1_r3, -0.7854F, -0.7854F, 0.0F);
		RightShoulderHorn1_r3.setTextureOffset(33, 59).addCuboid(-0.35F, -0.375F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, true);

		LEFTARM = new ModelPart(this);
		LEFTARM.setPivot(5.0F, 2.0F, 0.0F);
		LEFTARM.setTextureOffset(8, 33).addCuboid(-1.0F, -1.3F, -2.0F, 4.0F, 2.0F, 4.0F, 1.1F, false);
		LEFTARM.setTextureOffset(7, 32).addCuboid(-1.0541F, 4.2548F, -2.1F, 4.0F, 3.0F, 4.0F, 0.0F, false);

		LeftArmHorn3_r1 = new ModelPart(this);
		LeftArmHorn3_r1.setPivot(3.3753F, 6.525F, 0.2257F);
		LEFTARM.addChild(LeftArmHorn3_r1);
		setRotationAngle(LeftArmHorn3_r1, 0.0F, -1.5708F, 0.0F);
		LeftArmHorn3_r1.setTextureOffset(33, 59).addCuboid(-0.55F, -0.625F, -0.35F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		LeftArmHorn3_r1.setTextureOffset(33, 59).addCuboid(-0.55F, -2.225F, -0.35F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		LeftArmHorn2_r1 = new ModelPart(this);
		LeftArmHorn2_r1.setPivot(3.5742F, 6.3545F, 0.257F);
		LEFTARM.addChild(LeftArmHorn2_r1);
		setRotationAngle(LeftArmHorn2_r1, 0.0F, -1.5708F, 0.7854F);
		LeftArmHorn2_r1.setTextureOffset(33, 59).addCuboid(-0.45F, -0.675F, -0.45F, 0.0F, 1.0F, 0.0F, 0.0F, false);

		LeftArmHorn1_r1 = new ModelPart(this);
		LeftArmHorn1_r1.setPivot(4.0764F, 5.8242F, 0.2736F);
		LEFTARM.addChild(LeftArmHorn1_r1);
		setRotationAngle(LeftArmHorn1_r1, 0.0F, -1.5708F, 0.7854F);
		LeftArmHorn1_r1.setTextureOffset(33, 59).addCuboid(-0.35F, -0.375F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		LeftArmHorn2_r2 = new ModelPart(this);
		LeftArmHorn2_r2.setPivot(3.5742F, 4.7545F, 0.257F);
		LEFTARM.addChild(LeftArmHorn2_r2);
		setRotationAngle(LeftArmHorn2_r2, 0.0F, -1.5708F, 0.7854F);
		LeftArmHorn2_r2.setTextureOffset(33, 59).addCuboid(-0.45F, -0.675F, -0.45F, 0.0F, 1.0F, 0.0F, 0.0F, false);

		LeftArmHorn1_r2 = new ModelPart(this);
		LeftArmHorn1_r2.setPivot(4.0764F, 4.2242F, 0.2736F);
		LEFTARM.addChild(LeftArmHorn1_r2);
		setRotationAngle(LeftArmHorn1_r2, 0.0F, -1.5708F, 0.7854F);
		LeftArmHorn1_r2.setTextureOffset(33, 59).addCuboid(-0.35F, -0.375F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		RIGHTLEG = new ModelPart(this);
		RIGHTLEG.setPivot(-1.9F, 12.0F, 0.0F);
		RIGHTLEG.setTextureOffset(13, 31).addCuboid(-1.5F, 1.6F, -1.1F, 2.0F, 7.0F, 2.0F, 1.0F, false);
		RIGHTLEG.setTextureOffset(15, 6).addCuboid(-1.7F, 4.5F, -2.4F, 3.0F, 2.0F, 0.0F, 0.0F, false);
		RIGHTLEG.setTextureOffset(8, 18).addCuboid(-1.7F, 5.6F, -1.3F, 3.0F, 0.0F, 2.0F, 1.0F, false);
		RIGHTLEG.setTextureOffset(33, 59).addCuboid(-0.7253F, 5.1F, -2.5243F, 1.0F, 1.0F, 0.0F, 0.5F, true);

		RightKneecapHorn2_r1 = new ModelPart(this);
		RightKneecapHorn2_r1.setPivot(-0.1753F, 5.5363F, -3.0774F);
		RIGHTLEG.addChild(RightKneecapHorn2_r1);
		setRotationAngle(RightKneecapHorn2_r1, 0.7854F, 0.0F, 0.0F);
		RightKneecapHorn2_r1.setTextureOffset(33, 59).addCuboid(-0.35F, -0.325F, -0.25F, 0.0F, 0.0F, 0.0F, 0.5F, true);

		RightKneecapHorn1_r1 = new ModelPart(this);
		RightKneecapHorn1_r1.setPivot(-0.1753F, 4.9529F, -3.6607F);
		RIGHTLEG.addChild(RightKneecapHorn1_r1);
		setRotationAngle(RightKneecapHorn1_r1, 0.7854F, 0.0F, 0.0F);
		RightKneecapHorn1_r1.setTextureOffset(33, 59).addCuboid(-0.05F, 0.0F, 0.05F, 0.0F, 0.0F, -1.0F, 0.5F, true);

		LEFTLEG = new ModelPart(this);
		LEFTLEG.setPivot(1.9F, 12.0F, 0.0F);
		LEFTLEG.setTextureOffset(13, 31).addCuboid(-1.1F, 1.6F, -1.1F, 2.0F, 7.0F, 2.0F, 1.0F, false);
		LEFTLEG.setTextureOffset(15, 7).addCuboid(-1.3F, 4.5F, -2.4F, 3.0F, 2.0F, 0.0F, 0.0F, false);
		LEFTLEG.setTextureOffset(8, 18).addCuboid(-1.3F, 5.6F, -1.3F, 3.0F, 0.0F, 2.0F, 1.0F, false);
		LEFTLEG.setTextureOffset(33, 59).addCuboid(-0.3747F, 5.1F, -2.5243F, 1.0F, 1.0F, 0.0F, 0.5F, false);

		LeftKneecapHorn2_r1 = new ModelPart(this);
		LeftKneecapHorn2_r1.setPivot(0.1753F, 5.5363F, -3.0774F);
		LEFTLEG.addChild(LeftKneecapHorn2_r1);
		setRotationAngle(LeftKneecapHorn2_r1, 0.7854F, 0.0F, 0.0F);
		LeftKneecapHorn2_r1.setTextureOffset(33, 59).addCuboid(-0.35F, -0.325F, -0.25F, 0.0F, 0.0F, 0.0F, 0.5F, false);

		LeftKneecapHorn1_r1 = new ModelPart(this);
		LeftKneecapHorn1_r1.setPivot(0.1753F, 4.9529F, -3.6607F);
		LEFTLEG.addChild(LeftKneecapHorn1_r1);
		setRotationAngle(LeftKneecapHorn1_r1, 0.7854F, 0.0F, 0.0F);
		LeftKneecapHorn1_r1.setTextureOffset(33, 59).addCuboid(-0.05F, 0.0F, 0.05F, 0.0F, 0.0F, -1.0F, 0.5F, false);

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