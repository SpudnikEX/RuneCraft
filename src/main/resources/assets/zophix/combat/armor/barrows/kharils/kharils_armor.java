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
	private final ModelPart RightLeg3_r1;
	private final ModelPart RightLeg1_r1;
	private final ModelPart LEFTLEG;
	private final ModelPart LeftLeg3_r1;
	private final ModelPart LeftLeg1_r1;
	private final ModelPart RIGHTFOOT;
	private final ModelPart LEFTFOOT;
public armor() {
		textureWidth = 64;
		textureHeight = 64;
		PlayerHead = new ModelPart(this);
		PlayerHead.setPivot(0.0F, 0.0F, 0.0F);
		PlayerHead.setTextureOffset(32, 28).addCuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		PlayerBody = new ModelPart(this);
		PlayerBody.setPivot(0.0F, 0.0F, 0.0F);
		PlayerBody.setTextureOffset(40, 28).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		PlayerRightArm = new ModelPart(this);
		PlayerRightArm.setPivot(-5.0F, 2.0F, 0.0F);
		PlayerRightArm.setTextureOffset(48, 28).addCuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		PlayerLeftArm = new ModelPart(this);
		PlayerLeftArm.setPivot(5.0F, 2.0F, 0.0F);
		PlayerLeftArm.setTextureOffset(48, 28).addCuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		PlayerRightLeg = new ModelPart(this);
		PlayerRightLeg.setPivot(-1.9F, 13.0F, 0.0F);
		PlayerRightLeg.setTextureOffset(48, 28).addCuboid(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		PlayerLeftLeg = new ModelPart(this);
		PlayerLeftLeg.setPivot(1.9F, 12.0F, 0.0F);
		PlayerLeftLeg.setTextureOffset(48, 28).addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		HEAD = new ModelPart(this);
		HEAD.setPivot(0.0F, 0.0F, 0.0F);
		HEAD.setTextureOffset(4, 7).addCuboid(-4.5F, -0.65F, -4.25F, 9.0F, 1.0F, 9.0F, -0.1F, false);
		HEAD.setTextureOffset(4, 7).addCuboid(-3.9787F, -3.6213F, -5.25F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(4, 7).addCuboid(-0.4171F, -4.0111F, -5.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(4, 7).addCuboid(-3.0F, -3.15F, -5.3F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(4, 7).addCuboid(-2.45F, -2.15F, -5.3F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(4, 7).addCuboid(-2.0F, -1.5F, -5.25F, 4.0F, 1.0F, 1.0F, 0.0F, false);
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
		Mask5_r1.setPivot(3.4142F, -2.6213F, -4.75F);
		HEAD.addChild(Mask5_r1);
		setRotationAngle(Mask5_r1, 0.0F, 0.0F, -0.7854F);
		Mask5_r1.setTextureOffset(4, 7).addCuboid(-2.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Mask4_r1 = new ModelPart(this);
		Mask4_r1.setPivot(-3.4142F, -2.6213F, -4.75F);
		HEAD.addChild(Mask4_r1);
		setRotationAngle(Mask4_r1, 0.0F, 0.0F, 0.7854F);
		Mask4_r1.setTextureOffset(4, 7).addCuboid(-0.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		Mask6_r1 = new ModelPart(this);
		Mask6_r1.setPivot(3.7699F, -3.1213F, -4.5505F);
		HEAD.addChild(Mask6_r1);
		setRotationAngle(Mask6_r1, 0.0F, 0.3927F, 0.0F);
		Mask6_r1.setTextureOffset(4, 7).addCuboid(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		Mask5_r2 = new ModelPart(this);
		Mask5_r2.setPivot(-3.7272F, -3.1213F, -4.5505F);
		HEAD.addChild(Mask5_r2);
		setRotationAngle(Mask5_r2, 0.0F, -0.3927F, 0.0F);
		Mask5_r2.setTextureOffset(4, 7).addCuboid(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		Mask3_r1 = new ModelPart(this);
		Mask3_r1.setPivot(-0.7484F, -3.4631F, -5.7F);
		HEAD.addChild(Mask3_r1);
		setRotationAngle(Mask3_r1, 0.0F, 0.0F, -0.1309F);
		Mask3_r1.setTextureOffset(4, 7).addCuboid(-1.6F, -0.5F, 0.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);

		Mask2_r1 = new ModelPart(this);
		Mask2_r1.setPivot(0.9142F, -3.4631F, -5.7F);
		HEAD.addChild(Mask2_r1);
		setRotationAngle(Mask2_r1, 0.0F, 0.0F, 0.1309F);
		Mask2_r1.setTextureOffset(4, 7).addCuboid(-0.4F, -0.5F, 0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		BODY = new ModelPart(this);
		BODY.setPivot(0.0F, 0.0F, 0.0F);
		BODY.setTextureOffset(37, 57).addCuboid(1.8496F, 2.8389F, -4.0833F, 1.0F, 1.0F, 1.0F, -0.3F, false);
		BODY.setTextureOffset(37, 57).addCuboid(1.8496F, 2.8389F, -3.7833F, 1.0F, 1.0F, 1.0F, -0.2F, false);
		BODY.setTextureOffset(37, 57).addCuboid(1.8496F, 2.8389F, -3.3833F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		BODY.setTextureOffset(37, 57).addCuboid(3.0496F, 10.1389F, -3.3833F, 1.0F, 1.0F, 1.0F, -0.3F, false);
		BODY.setTextureOffset(37, 57).addCuboid(3.0496F, 10.1389F, -3.0833F, 1.0F, 1.0F, 1.0F, -0.2F, false);
		BODY.setTextureOffset(37, 57).addCuboid(3.0496F, 10.1389F, -2.6833F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		BODY.setTextureOffset(37, 57).addCuboid(2.4496F, 6.3389F, -3.7833F, 1.0F, 1.0F, 1.0F, -0.3F, false);
		BODY.setTextureOffset(37, 57).addCuboid(2.4496F, 6.3389F, -3.4833F, 1.0F, 1.0F, 1.0F, -0.2F, false);
		BODY.setTextureOffset(37, 57).addCuboid(2.4496F, 6.3389F, -3.0833F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		BODY.setTextureOffset(37, 57).addCuboid(-2.8496F, 2.8389F, -4.0833F, 1.0F, 1.0F, 1.0F, -0.3F, true);
		BODY.setTextureOffset(37, 57).addCuboid(-2.8496F, 2.8389F, -3.7833F, 1.0F, 1.0F, 1.0F, -0.2F, true);
		BODY.setTextureOffset(37, 57).addCuboid(-2.8496F, 2.8389F, -3.3833F, 1.0F, 1.0F, 1.0F, -0.1F, true);
		BODY.setTextureOffset(37, 57).addCuboid(-4.0496F, 10.1389F, -3.3833F, 1.0F, 1.0F, 1.0F, -0.3F, true);
		BODY.setTextureOffset(37, 57).addCuboid(-4.0496F, 10.1389F, -3.0833F, 1.0F, 1.0F, 1.0F, -0.2F, true);
		BODY.setTextureOffset(37, 57).addCuboid(-4.0496F, 10.1389F, -2.6833F, 1.0F, 1.0F, 1.0F, -0.1F, true);
		BODY.setTextureOffset(37, 57).addCuboid(-3.4496F, 6.3389F, -3.7833F, 1.0F, 1.0F, 1.0F, -0.3F, true);
		BODY.setTextureOffset(37, 57).addCuboid(-3.4496F, 6.3389F, -3.4833F, 1.0F, 1.0F, 1.0F, -0.2F, true);
		BODY.setTextureOffset(37, 57).addCuboid(-3.4496F, 6.3389F, -3.0833F, 1.0F, 1.0F, 1.0F, -0.1F, true);
		BODY.setTextureOffset(37, 57).addCuboid(-0.2496F, 4.7389F, -3.9833F, 1.0F, 1.0F, 1.0F, -0.3F, true);
		BODY.setTextureOffset(37, 57).addCuboid(-0.2496F, 4.7389F, -3.6833F, 1.0F, 1.0F, 1.0F, -0.2F, true);
		BODY.setTextureOffset(37, 57).addCuboid(-0.2496F, 4.7389F, -3.2833F, 1.0F, 1.0F, 1.0F, -0.1F, true);
		BODY.setTextureOffset(37, 57).addCuboid(-0.7496F, 8.3389F, -3.5833F, 1.0F, 1.0F, 1.0F, -0.3F, true);
		BODY.setTextureOffset(37, 57).addCuboid(-0.7496F, 8.3389F, -3.2833F, 1.0F, 1.0F, 1.0F, -0.2F, true);
		BODY.setTextureOffset(37, 57).addCuboid(-0.7496F, 8.3389F, -2.8833F, 1.0F, 1.0F, 1.0F, -0.1F, true);
		BODY.setTextureOffset(9, 8).addCuboid(-3.0F, 9.2F, -1.05F, 6.0F, 2.0F, 2.0F, 1.2F, false);
		BODY.setTextureOffset(7, 3).addCuboid(-3.5F, 0.8F, -1.6F, 7.0F, 7.0F, 3.0F, 1.1F, false);
		BODY.setTextureOffset(9, 7).addCuboid(-3.5F, 0.8F, -1.8F, 7.0F, 4.0F, -1.0F, 1.2F, false);

		RIGHTARM = new ModelPart(this);
		RIGHTARM.setPivot(-5.0F, 2.0F, 0.0F);
		RIGHTARM.setTextureOffset(9, 33).addCuboid(-2.5F, -1.1F, -2.0F, 3.0F, 2.0F, 4.0F, 1.0F, true);
		RIGHTARM.setTextureOffset(12, 10).addCuboid(-3.0F, 5.25F, -2.0F, 4.0F, 4.0F, 4.0F, 0.1F, true);
		RIGHTARM.setTextureOffset(12, 10).addCuboid(-3.0F, 1.05F, -2.0F, 4.0F, 4.0F, 4.0F, 0.4F, true);
		RIGHTARM.setTextureOffset(36, 57).addCuboid(-4.4829F, -3.6611F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, true);
		RIGHTARM.setTextureOffset(36, 57).addCuboid(-4.2829F, -3.2611F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, true);
		RIGHTARM.setTextureOffset(36, 57).addCuboid(-4.0329F, -2.7611F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		RightShoulderSpike3_r1 = new ModelPart(this);
		RightShoulderSpike3_r1.setPivot(-3.2329F, -1.7521F, -2.8816F);
		RIGHTARM.addChild(RightShoulderSpike3_r1);
		setRotationAngle(RightShoulderSpike3_r1, 0.5236F, 0.0F, 0.0F);
		RightShoulderSpike3_r1.setTextureOffset(36, 57).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		RightShoulderSpike2_r1 = new ModelPart(this);
		RightShoulderSpike2_r1.setPivot(-3.5329F, -2.2717F, -3.1816F);
		RIGHTARM.addChild(RightShoulderSpike2_r1);
		setRotationAngle(RightShoulderSpike2_r1, 0.5236F, 0.0F, 0.0F);
		RightShoulderSpike2_r1.setTextureOffset(36, 57).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, true);

		RightShoulderSpike1_r1 = new ModelPart(this);
		RightShoulderSpike1_r1.setPivot(-3.7329F, -2.6181F, -3.3816F);
		RIGHTARM.addChild(RightShoulderSpike1_r1);
		setRotationAngle(RightShoulderSpike1_r1, 0.5236F, 0.0F, 0.0F);
		RightShoulderSpike1_r1.setTextureOffset(36, 57).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, true);

		RightShoulderSpike3_r2 = new ModelPart(this);
		RightShoulderSpike3_r2.setPivot(-3.2329F, -1.7521F, 2.8816F);
		RIGHTARM.addChild(RightShoulderSpike3_r2);
		setRotationAngle(RightShoulderSpike3_r2, -0.5236F, 0.0F, 0.0F);
		RightShoulderSpike3_r2.setTextureOffset(36, 57).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		RightShoulderSpike2_r2 = new ModelPart(this);
		RightShoulderSpike2_r2.setPivot(-3.5329F, -2.2717F, 3.1816F);
		RIGHTARM.addChild(RightShoulderSpike2_r2);
		setRotationAngle(RightShoulderSpike2_r2, -0.5236F, 0.0F, 0.0F);
		RightShoulderSpike2_r2.setTextureOffset(36, 57).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, true);

		RightShoulderSpike1_r2 = new ModelPart(this);
		RightShoulderSpike1_r2.setPivot(-3.7329F, -2.6181F, 3.3816F);
		RIGHTARM.addChild(RightShoulderSpike1_r2);
		setRotationAngle(RightShoulderSpike1_r2, -0.5236F, 0.0F, 0.0F);
		RightShoulderSpike1_r2.setTextureOffset(36, 57).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, true);

		LEFTARM = new ModelPart(this);
		LEFTARM.setPivot(5.0F, 2.0F, 0.0F);
		LEFTARM.setTextureOffset(9, 33).addCuboid(-0.5F, -1.1F, -2.0F, 3.0F, 2.0F, 4.0F, 1.0F, false);
		LEFTARM.setTextureOffset(12, 10).addCuboid(-1.0F, 5.25F, -2.0F, 4.0F, 4.0F, 4.0F, 0.1F, false);
		LEFTARM.setTextureOffset(12, 10).addCuboid(-1.0F, 1.05F, -2.0F, 4.0F, 4.0F, 4.0F, 0.4F, false);
		LEFTARM.setTextureOffset(36, 57).addCuboid(3.4829F, -3.6611F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, false);
		LEFTARM.setTextureOffset(36, 57).addCuboid(3.2829F, -3.2611F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);
		LEFTARM.setTextureOffset(36, 57).addCuboid(3.0329F, -2.7611F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftShoulderSpike3_r1 = new ModelPart(this);
		LeftShoulderSpike3_r1.setPivot(3.2329F, -1.7521F, -2.8816F);
		LEFTARM.addChild(LeftShoulderSpike3_r1);
		setRotationAngle(LeftShoulderSpike3_r1, 0.5236F, 0.0F, 0.0F);
		LeftShoulderSpike3_r1.setTextureOffset(36, 57).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftShoulderSpike2_r1 = new ModelPart(this);
		LeftShoulderSpike2_r1.setPivot(3.5329F, -2.2717F, -3.1816F);
		LEFTARM.addChild(LeftShoulderSpike2_r1);
		setRotationAngle(LeftShoulderSpike2_r1, 0.5236F, 0.0F, 0.0F);
		LeftShoulderSpike2_r1.setTextureOffset(36, 57).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

		LeftShoulderSpike1_r1 = new ModelPart(this);
		LeftShoulderSpike1_r1.setPivot(3.7329F, -2.6181F, -3.3816F);
		LEFTARM.addChild(LeftShoulderSpike1_r1);
		setRotationAngle(LeftShoulderSpike1_r1, 0.5236F, 0.0F, 0.0F);
		LeftShoulderSpike1_r1.setTextureOffset(36, 57).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, false);

		LeftShoulderSpike3_r2 = new ModelPart(this);
		LeftShoulderSpike3_r2.setPivot(3.2329F, -1.7521F, 2.8816F);
		LEFTARM.addChild(LeftShoulderSpike3_r2);
		setRotationAngle(LeftShoulderSpike3_r2, -0.5236F, 0.0F, 0.0F);
		LeftShoulderSpike3_r2.setTextureOffset(36, 57).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftShoulderSpike2_r2 = new ModelPart(this);
		LeftShoulderSpike2_r2.setPivot(3.5329F, -2.2717F, 3.1816F);
		LEFTARM.addChild(LeftShoulderSpike2_r2);
		setRotationAngle(LeftShoulderSpike2_r2, -0.5236F, 0.0F, 0.0F);
		LeftShoulderSpike2_r2.setTextureOffset(36, 57).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

		LeftShoulderSpike1_r2 = new ModelPart(this);
		LeftShoulderSpike1_r2.setPivot(3.7329F, -2.6181F, 3.3816F);
		LEFTARM.addChild(LeftShoulderSpike1_r2);
		setRotationAngle(LeftShoulderSpike1_r2, -0.5236F, 0.0F, 0.0F);
		LeftShoulderSpike1_r2.setTextureOffset(36, 57).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, false);

		RIGHTLEG = new ModelPart(this);
		RIGHTLEG.setPivot(-1.9F, 12.0F, 0.0F);
		RIGHTLEG.setTextureOffset(10, 34).addCuboid(-1.65F, 1.5F, -0.95F, 3.0F, 4.0F, 2.0F, 1.2F, true);
		RIGHTLEG.setTextureOffset(12, 7).addCuboid(-2.0F, 6.7F, -2.0F, 4.0F, 4.0F, 4.0F, 0.1F, false);
		RIGHTLEG.setTextureOffset(2, 53).addCuboid(-2.1F, 0.45F, -1.5F, 4.0F, -1.0F, 3.0F, 1.01F, true);
		RIGHTLEG.setTextureOffset(37, 57).addCuboid(-1.1496F, 0.9389F, -3.3833F, 1.0F, 1.0F, 1.0F, -0.3F, true);
		RIGHTLEG.setTextureOffset(37, 57).addCuboid(-1.1496F, 0.9389F, -3.0833F, 1.0F, 1.0F, 1.0F, -0.2F, true);
		RIGHTLEG.setTextureOffset(37, 57).addCuboid(-1.1496F, 0.9389F, -2.6833F, 1.0F, 1.0F, 1.0F, -0.1F, true);
		RIGHTLEG.setTextureOffset(37, 57).addCuboid(-2.0496F, 3.5389F, -3.3833F, 1.0F, 1.0F, 1.0F, -0.3F, true);
		RIGHTLEG.setTextureOffset(37, 57).addCuboid(-2.0496F, 3.5389F, -3.0833F, 1.0F, 1.0F, 1.0F, -0.2F, true);
		RIGHTLEG.setTextureOffset(37, 57).addCuboid(-2.0496F, 3.5389F, -2.6833F, 1.0F, 1.0F, 1.0F, -0.1F, true);

		RightLeg3_r1 = new ModelPart(this);
		RightLeg3_r1.setPivot(-2.16F, 5.1762F, -0.15F);
		RIGHTLEG.addChild(RightLeg3_r1);
		setRotationAngle(RightLeg3_r1, 0.0F, 0.0F, -0.3927F);
		RightLeg3_r1.setTextureOffset(10, 34).addCuboid(0.0F, 0.1F, -0.8F, 0.0F, 0.0F, 2.0F, 1.2F, true);

		RightLeg1_r1 = new ModelPart(this);
		RightLeg1_r1.setPivot(-2.0918F, 2.6886F, -0.15F);
		RIGHTLEG.addChild(RightLeg1_r1);
		setRotationAngle(RightLeg1_r1, 0.0F, 0.0F, 0.192F);
		RightLeg1_r1.setTextureOffset(10, 34).addCuboid(0.0F, -1.0F, -0.8F, 0.0F, 2.0F, 2.0F, 1.2F, true);

		LEFTLEG = new ModelPart(this);
		LEFTLEG.setPivot(1.9F, 12.0F, 0.0F);
		LEFTLEG.setTextureOffset(10, 34).addCuboid(-1.35F, 1.5F, -0.95F, 3.0F, 4.0F, 2.0F, 1.2F, false);
		LEFTLEG.setTextureOffset(12, 7).addCuboid(-2.0F, 6.7F, -2.0F, 4.0F, 4.0F, 4.0F, 0.1F, true);
		LEFTLEG.setTextureOffset(2, 53).addCuboid(-1.9F, 0.45F, -1.5F, 4.0F, -1.0F, 3.0F, 1.01F, false);
		LEFTLEG.setTextureOffset(37, 57).addCuboid(0.1496F, 0.9389F, -3.3833F, 1.0F, 1.0F, 1.0F, -0.3F, false);
		LEFTLEG.setTextureOffset(37, 57).addCuboid(0.1496F, 0.9389F, -3.0833F, 1.0F, 1.0F, 1.0F, -0.2F, false);
		LEFTLEG.setTextureOffset(37, 57).addCuboid(0.1496F, 0.9389F, -2.6833F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		LEFTLEG.setTextureOffset(37, 57).addCuboid(1.0496F, 3.5389F, -3.3833F, 1.0F, 1.0F, 1.0F, -0.3F, false);
		LEFTLEG.setTextureOffset(37, 57).addCuboid(1.0496F, 3.5389F, -3.0833F, 1.0F, 1.0F, 1.0F, -0.2F, false);
		LEFTLEG.setTextureOffset(37, 57).addCuboid(1.0496F, 3.5389F, -2.6833F, 1.0F, 1.0F, 1.0F, -0.1F, false);

		LeftLeg3_r1 = new ModelPart(this);
		LeftLeg3_r1.setPivot(2.16F, 5.1762F, -0.15F);
		LEFTLEG.addChild(LeftLeg3_r1);
		setRotationAngle(LeftLeg3_r1, 0.0F, 0.0F, 0.3927F);
		LeftLeg3_r1.setTextureOffset(10, 34).addCuboid(0.0F, 0.1F, -0.8F, 0.0F, 0.0F, 2.0F, 1.2F, false);

		LeftLeg1_r1 = new ModelPart(this);
		LeftLeg1_r1.setPivot(2.0918F, 2.6886F, -0.15F);
		LEFTLEG.addChild(LeftLeg1_r1);
		setRotationAngle(LeftLeg1_r1, 0.0F, 0.0F, -0.192F);
		LeftLeg1_r1.setTextureOffset(10, 34).addCuboid(0.0F, -1.0F, -0.8F, 0.0F, 2.0F, 2.0F, 1.2F, false);

		RIGHTFOOT = new ModelPart(this);
		RIGHTFOOT.setPivot(-1.9F, 12.0F, 0.0F);
		RIGHTFOOT.setTextureOffset(4, 58).addCuboid(-1.5F, 11.5F, -1.5F, 3.0F, 0.0F, 3.0F, 1.0F, true);
		RIGHTFOOT.setTextureOffset(4, 58).addCuboid(-1.5F, 11.8F, -3.15F, 3.0F, 0.0F, 0.0F, 0.7F, true);

		LEFTFOOT = new ModelPart(this);
		LEFTFOOT.setPivot(1.9F, 12.0F, 0.0F);
		LEFTFOOT.setTextureOffset(3, 58).addCuboid(-1.5F, 11.5F, -1.5F, 3.0F, 0.0F, 3.0F, 1.0F, false);
		LEFTFOOT.setTextureOffset(3, 58).addCuboid(-1.5F, 11.8F, -3.15F, 3.0F, 0.0F, 0.0F, 0.7F, false);
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