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
	private final ModelPart LeftHelmetHorn7_r1;
	private final ModelPart LeftHelmetHorn6_r1;
	private final ModelPart LeftHelmetHorn5_r1;
	private final ModelPart LeftHelmetHorn4_r1;
	private final ModelPart LeftHelmetHorn3_r1;
	private final ModelPart LeftHelmetHorn2_r1;
	private final ModelPart LeftHelmetHorn1_r1;
	private final ModelPart RightHelmetHorn7_r1;
	private final ModelPart RightHelmetHorn6_r1;
	private final ModelPart RightHelmetHorn5_r1;
	private final ModelPart RightHelmetHorn4_r1;
	private final ModelPart RightHelmetHorn3_r1;
	private final ModelPart RightHelmetHorn2_r1;
	private final ModelPart RightHelmetHorn1_r1;
	private final ModelPart HelmetTop3_r1;
	private final ModelPart HelmetTop2_r1;
	private final ModelPart Helmetrightside6_r1;
	private final ModelPart Helmetrightside5_r1;
	private final ModelPart Helmetrightside4_r1;
	private final ModelPart Helmetrightside3_r1;
	private final ModelPart Helmetrightside2_r1;
	private final ModelPart Helmetrightside1_r1;
	private final ModelPart Helmetleftside6_r1;
	private final ModelPart Helmetleftside5_r1;
	private final ModelPart Helmetleftside4_r1;
	private final ModelPart Helmetleftside3_r1;
	private final ModelPart HelmetLeftside2_r1;
	private final ModelPart Helmetleftside1_r1;
	private final ModelPart HelmetFaceguard8_r1;
	private final ModelPart HelmetFaceguard7_r1;
	private final ModelPart HelmetFaceguard6_r1;
	private final ModelPart HelmetFaceguard5_r1;
	private final ModelPart HelmetFaceguard4_r1;
	private final ModelPart HelmetFaceguard3_r1;
	private final ModelPart HelmetFaceguard2_r1;
	private final ModelPart HelmetFaceguard1_r1;
	private final ModelPart HelmetBlack2_r1;
	private final ModelPart HelmetBlack1_r1;
	private final ModelPart BODY;
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
		HEAD.setTextureOffset(3, 3).addCuboid(-3.5F, 0.05F, -3.0F, 7.0F, -1.0F, 6.0F, 1.0F, false);
		HEAD.setTextureOffset(10, 2).addCuboid(-0.1141F, -7.917F, 3.9153F, 4.0F, 8.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(11, 2).addCuboid(-4.3141F, -7.917F, 3.9153F, 4.0F, 8.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(5, 3).addCuboid(0.0F, -8.2F, -4.1F, 5.0F, 1.0F, 7.0F, 0.0F, false);
		HEAD.setTextureOffset(5, 3).addCuboid(-4.9F, -8.2F, -4.1F, 5.0F, 1.0F, 7.0F, 0.0F, false);
		HEAD.setTextureOffset(5, 3).addCuboid(-0.7815F, -8.2F, 2.841F, 5.0F, 1.0F, 2.0F, 0.0F, false);
		HEAD.setTextureOffset(5, 3).addCuboid(-3.982F, -8.2F, 2.8021F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		HEAD.setTextureOffset(5, 11).addCuboid(-3.0F, -7.5F, -2.75F, 6.0F, -1.0F, 6.0F, 1.0F, false);
		HEAD.setTextureOffset(5, 11).addCuboid(-2.5F, -7.75F, -1.75F, 5.0F, -1.0F, 5.0F, 1.0F, false);

		LeftHelmetHorn7_r1 = new ModelPart(this);
		LeftHelmetHorn7_r1.setPivot(3.621F, -7.3F, -3.4386F);
		HEAD.addChild(LeftHelmetHorn7_r1);
		setRotationAngle(LeftHelmetHorn7_r1, 0.0F, -0.7854F, 0.0F);
		LeftHelmetHorn7_r1.setTextureOffset(33, 59).addCuboid(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		LeftHelmetHorn6_r1 = new ModelPart(this);
		LeftHelmetHorn6_r1.setPivot(4.2672F, -7.475F, -4.0664F);
		HEAD.addChild(LeftHelmetHorn6_r1);
		setRotationAngle(LeftHelmetHorn6_r1, 0.0F, -0.6545F, 0.0F);
		LeftHelmetHorn6_r1.setTextureOffset(33, 59).addCuboid(-0.75F, -0.925F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftHelmetHorn5_r1 = new ModelPart(this);
		LeftHelmetHorn5_r1.setPivot(4.7566F, -7.675F, -4.8037F);
		HEAD.addChild(LeftHelmetHorn5_r1);
		setRotationAngle(LeftHelmetHorn5_r1, 0.0F, -0.6109F, 0.0F);
		LeftHelmetHorn5_r1.setTextureOffset(33, 59).addCuboid(-0.65F, -0.925F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftHelmetHorn4_r1 = new ModelPart(this);
		LeftHelmetHorn4_r1.setPivot(5.2166F, -7.825F, -5.5363F);
		HEAD.addChild(LeftHelmetHorn4_r1);
		setRotationAngle(LeftHelmetHorn4_r1, 0.0F, -0.4014F, 0.0F);
		LeftHelmetHorn4_r1.setTextureOffset(33, 59).addCuboid(-0.55F, -0.875F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftHelmetHorn3_r1 = new ModelPart(this);
		LeftHelmetHorn3_r1.setPivot(5.4742F, -8.0283F, -6.143F);
		HEAD.addChild(LeftHelmetHorn3_r1);
		setRotationAngle(LeftHelmetHorn3_r1, 0.7854F, -0.4014F, 0.0F);
		LeftHelmetHorn3_r1.setTextureOffset(33, 59).addCuboid(-0.45F, -0.875F, -0.65F, 0.0F, 1.0F, 1.0F, 0.0F, false);

		LeftHelmetHorn2_r1 = new ModelPart(this);
		LeftHelmetHorn2_r1.setPivot(5.8057F, -8.8769F, -6.9241F);
		HEAD.addChild(LeftHelmetHorn2_r1);
		setRotationAngle(LeftHelmetHorn2_r1, 0.7854F, -0.4014F, 0.0F);
		LeftHelmetHorn2_r1.setTextureOffset(33, 59).addCuboid(-0.35F, -0.375F, -0.45F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		LeftHelmetHorn1_r1 = new ModelPart(this);
		LeftHelmetHorn1_r1.setPivot(5.9991F, -9.3718F, -7.3797F);
		HEAD.addChild(LeftHelmetHorn1_r1);
		setRotationAngle(LeftHelmetHorn1_r1, 0.7854F, -0.4014F, 0.0F);
		LeftHelmetHorn1_r1.setTextureOffset(33, 59).addCuboid(-0.25F, -0.375F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		RightHelmetHorn7_r1 = new ModelPart(this);
		RightHelmetHorn7_r1.setPivot(-3.7322F, -7.3F, -3.4393F);
		HEAD.addChild(RightHelmetHorn7_r1);
		setRotationAngle(RightHelmetHorn7_r1, 0.0F, 0.7854F, 0.0F);
		RightHelmetHorn7_r1.setTextureOffset(33, 58).addCuboid(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		RightHelmetHorn6_r1 = new ModelPart(this);
		RightHelmetHorn6_r1.setPivot(-4.3785F, -7.475F, -4.0671F);
		HEAD.addChild(RightHelmetHorn6_r1);
		setRotationAngle(RightHelmetHorn6_r1, 0.0F, 0.6545F, 0.0F);
		RightHelmetHorn6_r1.setTextureOffset(33, 58).addCuboid(-0.75F, -0.925F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		RightHelmetHorn5_r1 = new ModelPart(this);
		RightHelmetHorn5_r1.setPivot(-4.8679F, -7.675F, -4.8044F);
		HEAD.addChild(RightHelmetHorn5_r1);
		setRotationAngle(RightHelmetHorn5_r1, 0.0F, 0.6109F, 0.0F);
		RightHelmetHorn5_r1.setTextureOffset(33, 58).addCuboid(-0.65F, -0.925F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		RightHelmetHorn4_r1 = new ModelPart(this);
		RightHelmetHorn4_r1.setPivot(-5.3279F, -7.825F, -5.537F);
		HEAD.addChild(RightHelmetHorn4_r1);
		setRotationAngle(RightHelmetHorn4_r1, 0.0F, 0.4014F, 0.0F);
		RightHelmetHorn4_r1.setTextureOffset(33, 58).addCuboid(-0.55F, -0.875F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		RightHelmetHorn3_r1 = new ModelPart(this);
		RightHelmetHorn3_r1.setPivot(-5.5854F, -8.0283F, -6.1437F);
		HEAD.addChild(RightHelmetHorn3_r1);
		setRotationAngle(RightHelmetHorn3_r1, 0.7854F, 0.4014F, 0.0F);
		RightHelmetHorn3_r1.setTextureOffset(33, 58).addCuboid(-0.45F, -0.875F, -0.65F, 0.0F, 1.0F, 1.0F, 0.0F, true);

		RightHelmetHorn2_r1 = new ModelPart(this);
		RightHelmetHorn2_r1.setPivot(-5.917F, -8.8769F, -6.9248F);
		HEAD.addChild(RightHelmetHorn2_r1);
		setRotationAngle(RightHelmetHorn2_r1, 0.7854F, 0.4014F, 0.0F);
		RightHelmetHorn2_r1.setTextureOffset(33, 58).addCuboid(-0.35F, -0.375F, -0.45F, 0.0F, 0.0F, 0.0F, 0.0F, true);

		RightHelmetHorn1_r1 = new ModelPart(this);
		RightHelmetHorn1_r1.setPivot(-6.1104F, -9.3718F, -7.3804F);
		HEAD.addChild(RightHelmetHorn1_r1);
		setRotationAngle(RightHelmetHorn1_r1, 0.7854F, 0.4014F, 0.0F);
		RightHelmetHorn1_r1.setTextureOffset(33, 58).addCuboid(-0.25F, -0.375F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, true);

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

		Helmetleftside6_r1 = new ModelPart(this);
		Helmetleftside6_r1.setPivot(4.5613F, -1.947F, 3.1829F);
		HEAD.addChild(Helmetleftside6_r1);
		setRotationAngle(Helmetleftside6_r1, -0.0254F, -0.3482F, 0.0743F);
		Helmetleftside6_r1.setTextureOffset(12, 4).addCuboid(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, 0.0F, false);

		Helmetleftside5_r1 = new ModelPart(this);
		Helmetleftside5_r1.setPivot(4.6913F, -4.9072F, 3.2302F);
		HEAD.addChild(Helmetleftside5_r1);
		setRotationAngle(Helmetleftside5_r1, 0.0F, -0.3491F, 0.0F);
		Helmetleftside5_r1.setTextureOffset(13, 5).addCuboid(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		Helmetleftside4_r1 = new ModelPart(this);
		Helmetleftside4_r1.setPivot(4.6269F, -6.8699F, 3.2068F);
		HEAD.addChild(Helmetleftside4_r1);
		setRotationAngle(Helmetleftside4_r1, 0.0254F, -0.3482F, -0.0743F);
		Helmetleftside4_r1.setTextureOffset(12, 5).addCuboid(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		Helmetleftside3_r1 = new ModelPart(this);
		Helmetleftside3_r1.setPivot(4.7768F, -1.947F, -0.9413F);
		HEAD.addChild(Helmetleftside3_r1);
		setRotationAngle(Helmetleftside3_r1, 0.0061F, 0.0871F, 0.0701F);
		Helmetleftside3_r1.setTextureOffset(9, 2).addCuboid(-0.5F, -2.0F, -3.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);

		HelmetLeftside2_r1 = new ModelPart(this);
		HelmetLeftside2_r1.setPivot(4.9146F, -4.9072F, -0.9533F);
		HEAD.addChild(HelmetLeftside2_r1);
		setRotationAngle(HelmetLeftside2_r1, 0.0F, 0.0873F, 0.0F);
		HelmetLeftside2_r1.setTextureOffset(9, 3).addCuboid(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);

		Helmetleftside1_r1 = new ModelPart(this);
		Helmetleftside1_r1.setPivot(4.8463F, -6.8699F, -0.9473F);
		HEAD.addChild(Helmetleftside1_r1);
		setRotationAngle(Helmetleftside1_r1, -0.0061F, 0.0871F, -0.0701F);
		Helmetleftside1_r1.setTextureOffset(8, 3).addCuboid(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);

		HelmetFaceguard8_r1 = new ModelPart(this);
		HelmetFaceguard8_r1.setPivot(-4.4376F, -4.9379F, -3.9241F);
		HEAD.addChild(HelmetFaceguard8_r1);
		setRotationAngle(HelmetFaceguard8_r1, 0.0873F, 0.2182F, 0.0F);
		HelmetFaceguard8_r1.setTextureOffset(14, 6).addCuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		HelmetFaceguard7_r1 = new ModelPart(this);
		HelmetFaceguard7_r1.setPivot(4.2831F, -4.9379F, -3.9241F);
		HEAD.addChild(HelmetFaceguard7_r1);
		setRotationAngle(HelmetFaceguard7_r1, 0.0873F, -0.2182F, 0.0F);
		HelmetFaceguard7_r1.setTextureOffset(14, 5).addCuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

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
		HelmetFaceguard4_r1.setPivot(-2.3275F, -4.3302F, -4.2611F);
		HEAD.addChild(HelmetFaceguard4_r1);
		setRotationAngle(HelmetFaceguard4_r1, -0.1561F, -1.3499F, 0.16F);
		HelmetFaceguard4_r1.setTextureOffset(10, 4).addCuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		HelmetFaceguard3_r1 = new ModelPart(this);
		HelmetFaceguard3_r1.setPivot(2.3293F, -4.3257F, -4.2571F);
		HEAD.addChild(HelmetFaceguard3_r1);
		setRotationAngle(HelmetFaceguard3_r1, -0.1943F, 1.3484F, -0.1991F);
		HelmetFaceguard3_r1.setTextureOffset(10, 5).addCuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		HelmetFaceguard2_r1 = new ModelPart(this);
		HelmetFaceguard2_r1.setPivot(2.3175F, -1.9174F, -4.0985F);
		HEAD.addChild(HelmetFaceguard2_r1);
		setRotationAngle(HelmetFaceguard2_r1, 2.8529F, -1.3419F, -2.858F);
		HelmetFaceguard2_r1.setTextureOffset(10, 3).addCuboid(-0.55F, -2.0F, -2.5F, 1.0F, 4.0F, 5.0F, 0.0F, false);

		HelmetFaceguard1_r1 = new ModelPart(this);
		HelmetFaceguard1_r1.setPivot(-2.2904F, -1.8912F, -4.0942F);
		HEAD.addChild(HelmetFaceguard1_r1);
		setRotationAngle(HelmetFaceguard1_r1, 0.3048F, -1.3419F, -0.3125F);
		HelmetFaceguard1_r1.setTextureOffset(10, 3).addCuboid(-0.55F, -2.0F, -2.5F, 1.0F, 4.0F, 5.0F, 0.0F, false);

		HelmetBlack2_r1 = new ModelPart(this);
		HelmetBlack2_r1.setPivot(-1.8582F, -5.3F, -3.9925F);
		HEAD.addChild(HelmetBlack2_r1);
		setRotationAngle(HelmetBlack2_r1, 0.0F, -1.3526F, 0.0F);
		HelmetBlack2_r1.setTextureOffset(2, 47).addCuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		HelmetBlack1_r1 = new ModelPart(this);
		HelmetBlack1_r1.setPivot(1.8582F, -5.3F, -3.9925F);
		HEAD.addChild(HelmetBlack1_r1);
		setRotationAngle(HelmetBlack1_r1, 0.0F, 1.3526F, 0.0F);
		HelmetBlack1_r1.setTextureOffset(2, 47).addCuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		BODY = new ModelPart(this);
		BODY.setPivot(0.0F, 0.0F, 0.0F);
		BODY.setTextureOffset(9, 8).addCuboid(-3.5F, 8.5F, -1.35F, 7.0F, 3.0F, -1.0F, 1.01F, false);
		BODY.setTextureOffset(9, 7).addCuboid(-3.7F, 0.5F, -2.0F, 7.0F, 4.0F, -1.0F, 1.01F, false);
		BODY.setTextureOffset(9, 8).addCuboid(-3.6F, 3.9F, -1.5F, 7.0F, 4.0F, -1.0F, 1.01F, false);
		BODY.setTextureOffset(6, 4).addCuboid(-3.8F, 0.6F, -1.4F, 7.0F, 5.0F, 3.0F, 1.01F, false);
		BODY.setTextureOffset(7, 6).addCuboid(-3.5F, 7.6F, -0.6F, 7.0F, 3.0F, 2.0F, 1.01F, false);
		BODY.setTextureOffset(2, 53).addCuboid(-4.0F, 12.65F, -1.5F, 8.0F, -1.0F, 3.0F, 1.01F, false);
		BODY.setTextureOffset(37, 58).addCuboid(2.5F, 3.0F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		BODY.setTextureOffset(37, 58).addCuboid(0.5F, 3.0F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		BODY.setTextureOffset(37, 58).addCuboid(-1.5F, 3.0F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		BODY.setTextureOffset(37, 58).addCuboid(-3.5F, 3.0F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		RIGHTARM = new ModelPart(this);
		RIGHTARM.setPivot(-5.0F, 2.0F, 0.0F);
		RIGHTARM.setTextureOffset(7, 32).addCuboid(-3.3541F, 1.8548F, -2.4F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		RIGHTARM.setTextureOffset(11, 12).addCuboid(-3.1541F, 4.9548F, -2.1F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		LEFTARM = new ModelPart(this);
		LEFTARM.setPivot(5.0F, 2.0F, 0.0F);
		LEFTARM.setTextureOffset(7, 32).addCuboid(-1.2541F, 1.8548F, -2.4F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		LEFTARM.setTextureOffset(10, 10).addCuboid(-1.0541F, 4.9548F, -2.1F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		RIGHTLEG = new ModelPart(this);
		RIGHTLEG.setPivot(-1.9F, 12.0F, 0.0F);
		RIGHTLEG.setTextureOffset(11, 33).addCuboid(-1.65F, 1.6F, -1.15F, 3.0F, 3.0F, 2.0F, 1.0F, false);
		RIGHTLEG.setTextureOffset(11, 33).addCuboid(-3.0181F, 5.3588F, -1.15F, 0.0F, 0.0F, 2.0F, 1.0F, false);
		RIGHTLEG.setTextureOffset(5, 33).addCuboid(-2.5F, 8.05F, -2.5F, 5.0F, 0.0F, 5.0F, 0.0F, false);
		RIGHTLEG.setTextureOffset(5, 33).addCuboid(-2.3F, 8.8F, -2.3F, 4.0F, 0.0F, 4.0F, 0.0F, false);
		RIGHTLEG.setTextureOffset(5, 33).addCuboid(-2.1F, 9.55F, -2.1F, 4.0F, 0.0F, 4.0F, 0.0F, false);
		RIGHTLEG.setTextureOffset(31, 57).addCuboid(-2.4F, 7.95F, -2.4F, 4.0F, 0.0F, 4.0F, 0.0F, false);

		RightLeg1_r1 = new ModelPart(this);
		RightLeg1_r1.setPivot(-2.3943F, 2.8214F, 0.05F);
		RIGHTLEG.addChild(RightLeg1_r1);
		setRotationAngle(RightLeg1_r1, 0.0F, 0.0F, 0.3491F);
		RightLeg1_r1.setTextureOffset(11, 33).addCuboid(0.0F, -1.0F, -1.2F, 0.0F, 2.0F, 2.0F, 1.0F, true);

		LEFTLEG = new ModelPart(this);
		LEFTLEG.setPivot(1.9F, 12.0F, 0.0F);
		LEFTLEG.setTextureOffset(10, 34).addCuboid(-1.45F, 1.6F, -1.15F, 3.0F, 3.0F, 2.0F, 1.0F, false);
		LEFTLEG.setTextureOffset(10, 34).addCuboid(2.9181F, 5.3588F, -1.15F, 0.0F, 0.0F, 2.0F, 1.0F, false);
		LEFTLEG.setTextureOffset(7, 34).addCuboid(-2.1F, 9.55F, -2.1F, 4.0F, 0.0F, 4.0F, 0.0F, false);
		LEFTLEG.setTextureOffset(7, 34).addCuboid(-2.3F, 8.8F, -2.3F, 4.0F, 0.0F, 4.0F, 0.0F, false);
		LEFTLEG.setTextureOffset(7, 34).addCuboid(-2.5F, 8.05F, -2.5F, 5.0F, 0.0F, 5.0F, 0.0F, false);
		LEFTLEG.setTextureOffset(31, 57).addCuboid(-2.4F, 7.95F, -2.4F, 4.0F, 0.0F, 4.0F, 0.0F, false);

		LeftLeg1_r1 = new ModelPart(this);
		LeftLeg1_r1.setPivot(2.2943F, 2.8214F, 0.05F);
		LEFTLEG.addChild(LeftLeg1_r1);
		setRotationAngle(LeftLeg1_r1, 0.0F, 0.0F, -0.3491F);
		LeftLeg1_r1.setTextureOffset(10, 34).addCuboid(0.0F, -1.0F, -1.2F, 0.0F, 2.0F, 2.0F, 1.0F, false);

		RIGHTFOOT = new ModelPart(this);
		RIGHTFOOT.setPivot(0.0F, 24.0F, 0.0F);
		RIGHTFOOT.setTextureOffset(3, 58).addCuboid(-3.2F, -0.7F, -1.3F, 2.0F, 0.0F, 2.0F, 1.0F, false);
		RIGHTFOOT.setTextureOffset(4, 58).addCuboid(-3.1F, -0.4F, -2.5F, 2.0F, 0.0F, 3.0F, 1.0F, false);

		LEFTFOOT = new ModelPart(this);
		LEFTFOOT.setPivot(0.0F, 24.0F, 0.0F);
		LEFTFOOT.setTextureOffset(3, 58).addCuboid(0.55F, -0.7F, -1.3F, 2.0F, 0.0F, 2.0F, 1.0F, false);
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