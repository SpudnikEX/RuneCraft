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
	private final ModelPart RIGHTFOOT;
	private final ModelPart LEFTFOOT;
	private final ModelPart HEAD;
	private final ModelPart BackCoif_r1;
	private final ModelPart LeftCoif_r1;
	private final ModelPart RightCoif_r1;
	private final ModelPart Mask5_r1;
	private final ModelPart Mask4_r1;
	private final ModelPart Mask6_r1;
	private final ModelPart Mask5_r2;
	private final ModelPart Mask3_r1;
	private final ModelPart Mask2_r1;
	private final ModelPart BODY;
	private final ModelPart RIGHTARM;
	private final ModelPart RightShoulderSpike3_r1;
	private final ModelPart RightShoulderSpike2_r1;
	private final ModelPart RightShoulderSpike1_r1;
	private final ModelPart RightShoulderSpike3_r2;
	private final ModelPart RightShoulderSpike2_r2;
	private final ModelPart RightShoulderSpike1_r2;
	private final ModelPart LEFTARM;
	private final ModelPart LeftShoulderSpike3_r1;
	private final ModelPart LeftShoulderSpike2_r1;
	private final ModelPart LeftShoulderSpike1_r1;
	private final ModelPart LeftShoulderSpike3_r2;
	private final ModelPart LeftShoulderSpike2_r2;
	private final ModelPart LeftShoulderSpike1_r2;
	private final ModelPart RIGHTLEG;
	private final ModelPart RightLeg1_r1;
	private final ModelPart LEFTLEG;
	private final ModelPart LeftLeg1_r1;
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
		PlayerBody.setTextureOffset(40, 28).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

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
		PlayerRightLeg.setTextureOffset(48, 28).addCuboid(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		PlayerRightLeg.setTextureOffset(48, 28).addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		PlayerLeftLeg = new ModelPart(this);
		PlayerLeftLeg.setPivot(1.9F, 12.0F, 0.0F);
		PlayerLeftLeg.setTextureOffset(48, 28).addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		PlayerLeftLeg.setTextureOffset(48, 28).addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		RIGHTFOOT = new ModelPart(this);
		RIGHTFOOT.setPivot(0.0F, 24.0F, 0.0F);
		RIGHTFOOT.setTextureOffset(3, 58).addCuboid(-3.2F, -0.7F, -1.3F, 2.0F, 0.0F, 2.0F, 1.0F, false);
		RIGHTFOOT.setTextureOffset(4, 58).addCuboid(-3.1F, -0.4F, -2.5F, 2.0F, 0.0F, 3.0F, 1.0F, false);

		LEFTFOOT = new ModelPart(this);
		LEFTFOOT.setPivot(0.0F, 24.0F, 0.0F);
		LEFTFOOT.setTextureOffset(3, 58).addCuboid(0.55F, -0.7F, -1.3F, 2.0F, 0.0F, 2.0F, 1.0F, false);
		LEFTFOOT.setTextureOffset(4, 58).addCuboid(0.65F, -0.4F, -2.5F, 2.0F, 0.0F, 3.0F, 1.0F, false);

		HEAD = new ModelPart(this);
		HEAD.setPivot(0.0F, 0.0F, 0.0F);
		HEAD.setTextureOffset(4, 7).addCuboid(-4.45F, -0.75F, -4.25F, 8.0F, 0.0F, 8.0F, 0.0F, false);
		HEAD.setTextureOffset(4, 7).addCuboid(-4.5F, -3.75F, -5.0F, 9.0F, 1.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(4, 7).addCuboid(-0.5171F, -4.0111F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(4, 7).addCuboid(-3.25F, -2.75F, -5.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(4, 7).addCuboid(-2.35F, -1.75F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(10, 10).addCuboid(-2.5F, -9.5F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		HEAD.setTextureOffset(7, 10).addCuboid(-3.5F, -8.85F, -3.5F, 7.0F, 1.0F, 7.0F, 0.0F, false);
		HEAD.setTextureOffset(3, 8).addCuboid(-4.5F, -8.1F, -4.5F, 9.0F, 1.0F, 9.0F, 0.0F, false);

		BackCoif_r1 = new ModelPart(this);
		BackCoif_r1.setPivot(0.0F, -3.5647F, 4.4611F);
		HEAD.addChild(BackCoif_r1);
		setRotationAngle(BackCoif_r1, 0.1309F, 0.0F, 0.0F);
		BackCoif_r1.setTextureOffset(4, 7).addCuboid(-4.5F, -3.5F, -0.5F, 9.0F, 7.0F, 1.0F, 0.0F, false);

		LeftCoif_r1 = new ModelPart(this);
		LeftCoif_r1.setPivot(4.422F, -3.8621F, 0.0F);
		HEAD.addChild(LeftCoif_r1);
		setRotationAngle(LeftCoif_r1, 0.0F, 0.0F, -0.1309F);
		LeftCoif_r1.setTextureOffset(4, 7).addCuboid(-0.5F, -3.5F, -4.5F, 1.0F, 7.0F, 9.0F, 0.0F, false);

		RightCoif_r1 = new ModelPart(this);
		RightCoif_r1.setPivot(-4.422F, -3.8621F, 0.0F);
		HEAD.addChild(RightCoif_r1);
		setRotationAngle(RightCoif_r1, 0.0F, 0.0F, 0.1309F);
		RightCoif_r1.setTextureOffset(4, 7).addCuboid(-0.5F, -3.5F, -4.5F, 1.0F, 7.0F, 9.0F, 0.0F, false);

		Mask5_r1 = new ModelPart(this);
		Mask5_r1.setPivot(3.7642F, -2.7713F, -4.5F);
		HEAD.addChild(Mask5_r1);
		setRotationAngle(Mask5_r1, 0.0F, 0.0F, -0.7854F);
		Mask5_r1.setTextureOffset(4, 7).addCuboid(-2.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Mask4_r1 = new ModelPart(this);
		Mask4_r1.setPivot(-3.7642F, -2.7713F, -4.5F);
		HEAD.addChild(Mask4_r1);
		setRotationAngle(Mask4_r1, 0.0F, 0.0F, 0.7854F);
		Mask4_r1.setTextureOffset(4, 7).addCuboid(-0.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		Mask6_r1 = new ModelPart(this);
		Mask6_r1.setPivot(4.2485F, -3.25F, -4.3005F);
		HEAD.addChild(Mask6_r1);
		setRotationAngle(Mask6_r1, 0.0F, 0.3927F, 0.0F);
		Mask6_r1.setTextureOffset(4, 7).addCuboid(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Mask5_r2 = new ModelPart(this);
		Mask5_r2.setPivot(-4.2485F, -3.25F, -4.3005F);
		HEAD.addChild(Mask5_r2);
		setRotationAngle(Mask5_r2, 0.0F, -0.3927F, 0.0F);
		Mask5_r2.setTextureOffset(4, 7).addCuboid(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Mask3_r1 = new ModelPart(this);
		Mask3_r1.setPivot(-0.8484F, -3.4631F, -5.5F);
		HEAD.addChild(Mask3_r1);
		setRotationAngle(Mask3_r1, 0.0F, 0.0F, -0.1309F);
		Mask3_r1.setTextureOffset(4, 7).addCuboid(-1.6F, -0.5F, 0.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);

		Mask2_r1 = new ModelPart(this);
		Mask2_r1.setPivot(0.9142F, -3.4631F, -5.5F);
		HEAD.addChild(Mask2_r1);
		setRotationAngle(Mask2_r1, 0.0F, 0.0F, 0.1309F);
		Mask2_r1.setTextureOffset(4, 7).addCuboid(-0.4F, -0.5F, 0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		BODY = new ModelPart(this);
		BODY.setPivot(0.0F, 0.0F, 0.0F);
		BODY.setTextureOffset(5, 35).addCuboid(-4.0F, 0.9F, -1.7F, 8.0F, 5.0F, 3.0F, 1.01F, false);
		BODY.setTextureOffset(5, 35).addCuboid(-3.7F, 7.9F, -1.4F, 7.0F, 0.0F, 2.0F, 1.01F, false);
		BODY.setTextureOffset(5, 35).addCuboid(-3.4F, 10.6F, -1.1F, 6.0F, 0.0F, 2.0F, 1.01F, false);
		BODY.setTextureOffset(2, 53).addCuboid(-4.0F, 12.65F, -1.5F, 8.0F, -1.0F, 3.0F, 1.01F, false);
		BODY.setTextureOffset(37, 57).addCuboid(3.0496F, 9.5889F, -3.4833F, 1.0F, 1.0F, 1.0F, -0.3F, false);
		BODY.setTextureOffset(37, 57).addCuboid(3.2496F, 9.7389F, -2.9833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		BODY.setTextureOffset(37, 57).addCuboid(3.1496F, 9.6389F, -2.5833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		BODY.setTextureOffset(37, 57).addCuboid(-4.4504F, 1.1889F, -3.9833F, 1.0F, 1.0F, 1.0F, -0.3F, false);
		BODY.setTextureOffset(37, 57).addCuboid(-4.2504F, 1.3389F, -3.4833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		BODY.setTextureOffset(37, 57).addCuboid(-4.3504F, 1.2389F, -3.0833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		BODY.setTextureOffset(37, 57).addCuboid(-0.6504F, 3.0889F, -3.9833F, 1.0F, 1.0F, 1.0F, -0.3F, false);
		BODY.setTextureOffset(37, 57).addCuboid(-0.4504F, 3.2389F, -3.4833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		BODY.setTextureOffset(37, 57).addCuboid(-0.5504F, 3.1389F, -3.0833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		BODY.setTextureOffset(37, 57).addCuboid(-3.2004F, 5.1889F, -3.9833F, 1.0F, 1.0F, 1.0F, -0.3F, false);
		BODY.setTextureOffset(37, 57).addCuboid(-3.0004F, 5.3389F, -3.4833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		BODY.setTextureOffset(37, 57).addCuboid(-3.1004F, 5.2389F, -3.0833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		BODY.setTextureOffset(37, 57).addCuboid(2.5496F, 5.2889F, -3.9833F, 1.0F, 1.0F, 1.0F, -0.3F, false);
		BODY.setTextureOffset(37, 57).addCuboid(2.7496F, 5.4389F, -3.4833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		BODY.setTextureOffset(37, 57).addCuboid(2.6496F, 5.3389F, -3.0833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		BODY.setTextureOffset(37, 57).addCuboid(-4.0504F, 9.1889F, -3.4833F, 1.0F, 1.0F, 1.0F, -0.3F, false);
		BODY.setTextureOffset(37, 57).addCuboid(-3.8504F, 9.3389F, -2.9833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		BODY.setTextureOffset(37, 57).addCuboid(-3.9504F, 9.2389F, -2.5833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		BODY.setTextureOffset(37, 57).addCuboid(3.3496F, 1.3889F, -3.9833F, 1.0F, 1.0F, 1.0F, -0.3F, false);
		BODY.setTextureOffset(37, 57).addCuboid(3.5496F, 1.5389F, -3.4833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		BODY.setTextureOffset(37, 57).addCuboid(3.4496F, 1.4389F, -3.0833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		BODY.setTextureOffset(37, 57).addCuboid(-0.3504F, 7.5389F, -3.6833F, 1.0F, 1.0F, 1.0F, -0.3F, false);
		BODY.setTextureOffset(37, 57).addCuboid(-0.1504F, 7.6889F, -3.1833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		BODY.setTextureOffset(37, 57).addCuboid(-0.2504F, 7.5889F, -2.7833F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		RIGHTARM = new ModelPart(this);
		RIGHTARM.setPivot(-5.0F, 2.0F, 0.0F);
		RIGHTARM.setTextureOffset(8, 32).addCuboid(-2.75F, -1.3F, -2.0F, 2.0F, 2.0F, 4.0F, 1.0F, true);
		RIGHTARM.setTextureOffset(14, 8).addCuboid(-3.1459F, 5.8548F, -2.1F, 4.0F, 4.0F, 4.0F, 0.0F, true);
		RIGHTARM.setTextureOffset(14, 8).addCuboid(-3.4459F, 1.8548F, -2.6F, 4.0F, 4.0F, 5.0F, 0.0F, true);
		RIGHTARM.setTextureOffset(37, 57).addCuboid(-4.7829F, -3.6611F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, false);
		RIGHTARM.setTextureOffset(37, 57).addCuboid(-4.5829F, -3.2611F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);
		RIGHTARM.setTextureOffset(37, 57).addCuboid(-4.3329F, -2.7611F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		RightShoulderSpike3_r1 = new ModelPart(this);
		RightShoulderSpike3_r1.setPivot(-3.7829F, -2.0843F, 2.7803F);
		RIGHTARM.addChild(RightShoulderSpike3_r1);
		setRotationAngle(RightShoulderSpike3_r1, -0.7854F, 0.0F, 0.0F);
		RightShoulderSpike3_r1.setTextureOffset(36, 57).addCuboid(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		RightShoulderSpike2_r1 = new ModelPart(this);
		RightShoulderSpike2_r1.setPivot(-3.9079F, -2.3014F, 3.0632F);
		RIGHTARM.addChild(RightShoulderSpike2_r1);
		setRotationAngle(RightShoulderSpike2_r1, -0.7854F, 0.0F, 0.0F);
		RightShoulderSpike2_r1.setTextureOffset(36, 57).addCuboid(-0.675F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, true);

		RightShoulderSpike1_r1 = new ModelPart(this);
		RightShoulderSpike1_r1.setPivot(-4.1579F, -2.4893F, 3.2753F);
		RIGHTARM.addChild(RightShoulderSpike1_r1);
		setRotationAngle(RightShoulderSpike1_r1, -0.7854F, 0.0F, 0.0F);
		RightShoulderSpike1_r1.setTextureOffset(36, 57).addCuboid(-0.625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, true);

		RightShoulderSpike3_r2 = new ModelPart(this);
		RightShoulderSpike3_r2.setPivot(-3.7829F, -2.0843F, -2.7803F);
		RIGHTARM.addChild(RightShoulderSpike3_r2);
		setRotationAngle(RightShoulderSpike3_r2, 0.7854F, 0.0F, 0.0F);
		RightShoulderSpike3_r2.setTextureOffset(36, 57).addCuboid(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		RightShoulderSpike2_r2 = new ModelPart(this);
		RightShoulderSpike2_r2.setPivot(-3.9079F, -2.5136F, -3.1339F);
		RIGHTARM.addChild(RightShoulderSpike2_r2);
		setRotationAngle(RightShoulderSpike2_r2, 0.7854F, 0.0F, 0.0F);
		RightShoulderSpike2_r2.setTextureOffset(36, 57).addCuboid(-0.675F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, true);

		RightShoulderSpike1_r2 = new ModelPart(this);
		RightShoulderSpike1_r2.setPivot(-4.1579F, -2.7721F, -3.4167F);
		RIGHTARM.addChild(RightShoulderSpike1_r2);
		setRotationAngle(RightShoulderSpike1_r2, 0.7854F, 0.0F, 0.0F);
		RightShoulderSpike1_r2.setTextureOffset(36, 57).addCuboid(-0.625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, true);

		LEFTARM = new ModelPart(this);
		LEFTARM.setPivot(5.0F, 2.0F, 0.0F);
		LEFTARM.setTextureOffset(9, 33).addCuboid(-0.1F, -1.3F, -2.0F, 2.0F, 2.0F, 4.0F, 1.0F, false);
		LEFTARM.setTextureOffset(12, 10).addCuboid(-1.0541F, 5.8548F, -2.1F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		LEFTARM.setTextureOffset(12, 10).addCuboid(-1.4541F, 1.8548F, -2.6F, 4.0F, 4.0F, 5.0F, 0.0F, false);
		LEFTARM.setTextureOffset(36, 57).addCuboid(3.5329F, -3.6611F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, false);
		LEFTARM.setTextureOffset(36, 57).addCuboid(3.2329F, -3.2611F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);
		LEFTARM.setTextureOffset(36, 57).addCuboid(3.2329F, -2.7611F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftShoulderSpike3_r1 = new ModelPart(this);
		LeftShoulderSpike3_r1.setPivot(3.7829F, -2.0843F, 2.7803F);
		LEFTARM.addChild(LeftShoulderSpike3_r1);
		setRotationAngle(LeftShoulderSpike3_r1, -0.7854F, 0.0F, 0.0F);
		LeftShoulderSpike3_r1.setTextureOffset(36, 57).addCuboid(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftShoulderSpike2_r1 = new ModelPart(this);
		LeftShoulderSpike2_r1.setPivot(3.9079F, -2.3014F, 3.0632F);
		LEFTARM.addChild(LeftShoulderSpike2_r1);
		setRotationAngle(LeftShoulderSpike2_r1, -0.7854F, 0.0F, 0.0F);
		LeftShoulderSpike2_r1.setTextureOffset(36, 57).addCuboid(-0.675F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

		LeftShoulderSpike1_r1 = new ModelPart(this);
		LeftShoulderSpike1_r1.setPivot(4.1579F, -2.4893F, 3.2753F);
		LEFTARM.addChild(LeftShoulderSpike1_r1);
		setRotationAngle(LeftShoulderSpike1_r1, -0.7854F, 0.0F, 0.0F);
		LeftShoulderSpike1_r1.setTextureOffset(36, 57).addCuboid(-0.625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, false);

		LeftShoulderSpike3_r2 = new ModelPart(this);
		LeftShoulderSpike3_r2.setPivot(3.7829F, -2.0843F, -2.7803F);
		LEFTARM.addChild(LeftShoulderSpike3_r2);
		setRotationAngle(LeftShoulderSpike3_r2, 0.7854F, 0.0F, 0.0F);
		LeftShoulderSpike3_r2.setTextureOffset(36, 57).addCuboid(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftShoulderSpike2_r2 = new ModelPart(this);
		LeftShoulderSpike2_r2.setPivot(3.9079F, -2.5136F, -3.1339F);
		LEFTARM.addChild(LeftShoulderSpike2_r2);
		setRotationAngle(LeftShoulderSpike2_r2, 0.7854F, 0.0F, 0.0F);
		LeftShoulderSpike2_r2.setTextureOffset(36, 57).addCuboid(-0.675F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

		LeftShoulderSpike1_r2 = new ModelPart(this);
		LeftShoulderSpike1_r2.setPivot(4.1579F, -2.7721F, -3.4167F);
		LEFTARM.addChild(LeftShoulderSpike1_r2);
		setRotationAngle(LeftShoulderSpike1_r2, 0.7854F, 0.0F, 0.0F);
		LeftShoulderSpike1_r2.setTextureOffset(36, 57).addCuboid(-0.625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, false);

		RIGHTLEG = new ModelPart(this);
		RIGHTLEG.setPivot(-1.9F, 12.0F, 0.0F);
		RIGHTLEG.setTextureOffset(11, 33).addCuboid(-1.65F, 1.6F, -1.15F, 3.0F, 3.0F, 2.0F, 1.0F, false);
		RIGHTLEG.setTextureOffset(11, 33).addCuboid(-3.0181F, 5.3588F, -1.15F, 0.0F, 0.0F, 2.0F, 1.0F, false);
		RIGHTLEG.setTextureOffset(12, 7).addCuboid(-2.1F, 6.3F, -2.1F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		RIGHTLEG.setTextureOffset(37, 59).addCuboid(-2.0504F, 4.6389F, -3.4833F, 1.0F, 1.0F, 1.0F, -0.3F, false);
		RIGHTLEG.setTextureOffset(37, 59).addCuboid(-1.8504F, 4.7889F, -2.9833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		RIGHTLEG.setTextureOffset(37, 59).addCuboid(-1.9504F, 4.6889F, -2.5833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		RIGHTLEG.setTextureOffset(37, 59).addCuboid(-2.1504F, 1.2389F, -3.4833F, 1.0F, 1.0F, 1.0F, -0.3F, false);
		RIGHTLEG.setTextureOffset(37, 59).addCuboid(-1.9504F, 1.3889F, -2.9833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		RIGHTLEG.setTextureOffset(37, 59).addCuboid(-2.0504F, 1.2889F, -2.5833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		RIGHTLEG.setTextureOffset(37, 59).addCuboid(-0.6504F, 2.9389F, -3.4833F, 1.0F, 1.0F, 1.0F, -0.3F, false);
		RIGHTLEG.setTextureOffset(37, 59).addCuboid(-0.4504F, 3.0889F, -2.9833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		RIGHTLEG.setTextureOffset(37, 59).addCuboid(-0.5504F, 2.9889F, -2.5833F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		RightLeg1_r1 = new ModelPart(this);
		RightLeg1_r1.setPivot(-2.3943F, 2.8214F, 0.05F);
		RIGHTLEG.addChild(RightLeg1_r1);
		setRotationAngle(RightLeg1_r1, 0.0F, 0.0F, 0.3491F);
		RightLeg1_r1.setTextureOffset(11, 33).addCuboid(0.0F, -1.0F, -1.2F, 0.0F, 2.0F, 2.0F, 1.0F, true);

		LEFTLEG = new ModelPart(this);
		LEFTLEG.setPivot(1.9F, 12.0F, 0.0F);
		LEFTLEG.setTextureOffset(10, 34).addCuboid(-1.45F, 1.6F, -1.15F, 3.0F, 3.0F, 2.0F, 1.0F, false);
		LEFTLEG.setTextureOffset(10, 34).addCuboid(2.9181F, 5.3588F, -1.15F, 0.0F, 0.0F, 2.0F, 1.0F, false);
		LEFTLEG.setTextureOffset(12, 7).addCuboid(-2.1F, 6.3F, -2.1F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		LEFTLEG.setTextureOffset(32, 59).addCuboid(-0.3504F, 2.8389F, -3.4833F, 1.0F, 1.0F, 1.0F, -0.3F, false);
		LEFTLEG.setTextureOffset(32, 59).addCuboid(-0.1504F, 2.9889F, -2.9833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		LEFTLEG.setTextureOffset(32, 59).addCuboid(-0.2504F, 2.8889F, -2.5833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		LEFTLEG.setTextureOffset(32, 59).addCuboid(1.3496F, 1.1389F, -3.4833F, 1.0F, 1.0F, 1.0F, -0.3F, false);
		LEFTLEG.setTextureOffset(32, 59).addCuboid(1.5496F, 1.2889F, -2.9833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		LEFTLEG.setTextureOffset(32, 59).addCuboid(1.4496F, 1.1889F, -2.5833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		LEFTLEG.setTextureOffset(32, 59).addCuboid(1.5496F, 4.9389F, -3.4833F, 1.0F, 1.0F, 1.0F, -0.3F, false);
		LEFTLEG.setTextureOffset(32, 59).addCuboid(1.7496F, 5.0889F, -2.9833F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		LEFTLEG.setTextureOffset(32, 59).addCuboid(1.6496F, 4.9889F, -2.5833F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		LeftLeg1_r1 = new ModelPart(this);
		LeftLeg1_r1.setPivot(2.2943F, 2.8214F, 0.05F);
		LEFTLEG.addChild(LeftLeg1_r1);
		setRotationAngle(LeftLeg1_r1, 0.0F, 0.0F, -0.3491F);
		LeftLeg1_r1.setTextureOffset(10, 34).addCuboid(0.0F, -1.0F, -1.2F, 0.0F, 2.0F, 2.0F, 1.0F, false);
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
		RIGHTFOOT.render(matrixStack, buffer, packedLight, packedOverlay);
		LEFTFOOT.render(matrixStack, buffer, packedLight, packedOverlay);
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