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
	private final ModelPart LeftHat10_r1;
	private final ModelPart LeftHat9_r1;
	private final ModelPart LeftHat8_r1;
	private final ModelPart LeftHat7_r1;
	private final ModelPart LeftHat4_r1;
	private final ModelPart LeftHat3_r1;
	private final ModelPart RightHat10_r1;
	private final ModelPart RightHat9_r1;
	private final ModelPart RightHat8_r1;
	private final ModelPart RightHat7_r1;
	private final ModelPart RightHat4_r1;
	private final ModelPart RightHat3_r1;
	private final ModelPart BODY;
	private final ModelPart RIGHTARM;
	private final ModelPart LEFTARM;
	private final ModelPart RIGHTLEG;
	private final ModelPart RightRobe10_r1;
	private final ModelPart RightRobe9_r1;
	private final ModelPart RightRobe8_r1;
	private final ModelPart RightRobe7_r1;
	private final ModelPart RightRobe4_r1;
	private final ModelPart RightRobe3_r1;
	private final ModelPart RightRobe2_r1;
	private final ModelPart RightRobe1_r1;
	private final ModelPart LEFTLEG;
	private final ModelPart LeftRobe10_r1;
	private final ModelPart LeftRobe9_r1;
	private final ModelPart LeftRobe8_r1;
	private final ModelPart LeftRobe7_r1;
	private final ModelPart LeftRobe4_r1;
	private final ModelPart LeftRobe3_r1;
	private final ModelPart LeftRobe2_r1;
	private final ModelPart LeftRobe1_r1;
	private final ModelPart RIGHTFOOT;
	private final ModelPart LEFTFOOT;
public armor() {
		textureWidth = 64;
		textureHeight = 64;
		PlayerHead = new ModelPart(this);
		PlayerHead.setPivot(0.0F, 0.0F, 0.0F);
		PlayerHead.setTextureOffset(32, 48).addCuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		PlayerBody = new ModelPart(this);
		PlayerBody.setPivot(0.0F, 0.0F, 0.0F);
		PlayerBody.setTextureOffset(40, 48).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		PlayerRightArm = new ModelPart(this);
		PlayerRightArm.setPivot(-5.0F, 2.0F, 0.0F);
		PlayerRightArm.setTextureOffset(48, 48).addCuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		PlayerLeftArm = new ModelPart(this);
		PlayerLeftArm.setPivot(5.0F, 2.0F, 0.0F);
		PlayerLeftArm.setTextureOffset(48, 48).addCuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		PlayerRightLeg = new ModelPart(this);
		PlayerRightLeg.setPivot(-1.9F, 13.0F, 0.0F);
		PlayerRightLeg.setTextureOffset(48, 48).addCuboid(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		PlayerLeftLeg = new ModelPart(this);
		PlayerLeftLeg.setPivot(1.9F, 12.0F, 0.0F);
		PlayerLeftLeg.setTextureOffset(48, 48).addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		PlayerLeftLeg.setTextureOffset(48, 48).addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		HEAD = new ModelPart(this);
		HEAD.setPivot(0.0F, 0.0F, 0.0F);
		HEAD.setTextureOffset(4, 49).addCuboid(-3.0F, -6.5F, -3.4F, 6.0F, 5.0F, -2.0F, 1.0F, false);
		HEAD.setTextureOffset(15, 11).addCuboid(-3.5171F, -6.1F, -6.1778F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(6, 10).addCuboid(-3.5F, -0.75F, -3.5F, 7.0F, 0.0F, 7.0F, 1.0F, false);
		HEAD.setTextureOffset(9, 9).addCuboid(-3.9659F, -6.95F, 3.554F, 8.0F, 6.0F, 1.0F, 0.2F, false);
		HEAD.setTextureOffset(8, 7).addCuboid(-0.9659F, -8.75F, -5.446F, 2.0F, 2.0F, 9.0F, 0.0F, false);
		HEAD.setTextureOffset(2, 8).addCuboid(-4.1F, -8.1F, -4.5F, 8.0F, 1.0F, 9.0F, 0.0F, false);
		HEAD.setTextureOffset(8, 7).addCuboid(-3.9659F, -6.95F, -4.446F, 8.0F, 1.0F, 8.0F, 0.2F, false);
		HEAD.setTextureOffset(8, 7).addCuboid(1.0341F, -8.75F, -4.446F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		HEAD.setTextureOffset(8, 7).addCuboid(2.0341F, -8.75F, -2.446F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		HEAD.setTextureOffset(8, 7).addCuboid(-2.9659F, -8.75F, -2.446F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		HEAD.setTextureOffset(8, 7).addCuboid(-1.9659F, -8.75F, -4.446F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		HEAD.setTextureOffset(8, 7).addCuboid(-2.9659F, -7.75F, -4.946F, 2.0F, 1.0F, 8.0F, 0.0F, false);
		HEAD.setTextureOffset(8, 7).addCuboid(1.0341F, -7.75F, -4.946F, 2.0F, 1.0F, 8.0F, 0.0F, false);
		HEAD.setTextureOffset(15, 11).addCuboid(-0.4057F, -8.1F, -5.708F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(15, 11).addCuboid(-0.4057F, -7.1F, -5.958F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(15, 11).addCuboid(0.4057F, -7.1F, -5.708F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(15, 11).addCuboid(-3.4057F, -7.1F, -5.708F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(15, 11).addCuboid(-4.6243F, -4.1F, -5.5237F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(15, 11).addCuboid(-4.4171F, -6.1F, -5.6778F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		HEAD.setTextureOffset(15, 11).addCuboid(-4.9392F, -6.1F, -0.712F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		HEAD.setTextureOffset(15, 11).addCuboid(-5.1464F, -4.1F, -0.7579F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		HEAD.setTextureOffset(15, 11).addCuboid(-1.4405F, -6.1F, 4.5914F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(15, 11).addCuboid(-1.517F, -4.1F, 4.7762F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(15, 11).addCuboid(-1.3943F, -7.1F, 3.4957F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		HEAD.setTextureOffset(15, 11).addCuboid(3.4171F, -6.1F, -5.6778F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		HEAD.setTextureOffset(15, 11).addCuboid(3.6243F, -4.1F, -5.5237F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(15, 11).addCuboid(3.9392F, -6.1F, -0.712F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		HEAD.setTextureOffset(15, 11).addCuboid(4.1464F, -4.1F, -0.7579F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		HEAD.setTextureOffset(15, 11).addCuboid(-0.0595F, -6.1F, 4.5914F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(15, 11).addCuboid(-0.083F, -4.1F, 4.7762F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(15, 11).addCuboid(-0.0057F, -7.1F, 3.4957F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		LeftHat10_r1 = new ModelPart(this);
		LeftHat10_r1.setPivot(2.7577F, -2.6F, 4.7211F);
		HEAD.addChild(LeftHat10_r1);
		setRotationAngle(LeftHat10_r1, 0.0F, 0.3927F, 0.0F);
		LeftHat10_r1.setTextureOffset(15, 11).addCuboid(-1.55F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		LeftHat9_r1 = new ModelPart(this);
		LeftHat9_r1.setPivot(2.635F, -5.1F, 4.5554F);
		HEAD.addChild(LeftHat9_r1);
		setRotationAngle(LeftHat9_r1, 0.0F, 0.3927F, 0.0F);
		LeftHat9_r1.setTextureOffset(15, 11).addCuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		LeftHat8_r1 = new ModelPart(this);
		LeftHat8_r1.setPivot(4.3018F, -2.6F, 3.4746F);
		HEAD.addChild(LeftHat8_r1);
		setRotationAngle(LeftHat8_r1, 0.0F, -0.3927F, 0.0F);
		LeftHat8_r1.setTextureOffset(15, 11).addCuboid(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		LeftHat7_r1 = new ModelPart(this);
		LeftHat7_r1.setPivot(4.1137F, -5.1F, 3.3743F);
		HEAD.addChild(LeftHat7_r1);
		setRotationAngle(LeftHat7_r1, 0.0F, -0.3927F, 0.0F);
		LeftHat7_r1.setTextureOffset(15, 11).addCuboid(-0.5F, -1.0F, -0.95F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		LeftHat4_r1 = new ModelPart(this);
		LeftHat4_r1.setPivot(4.3896F, -2.6F, -2.6755F);
		HEAD.addChild(LeftHat4_r1);
		setRotationAngle(LeftHat4_r1, 0.0F, 0.1309F, 0.0F);
		LeftHat4_r1.setTextureOffset(15, 11).addCuboid(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);

		LeftHat3_r1 = new ModelPart(this);
		LeftHat3_r1.setPivot(4.1824F, -5.1F, -2.6296F);
		HEAD.addChild(LeftHat3_r1);
		setRotationAngle(LeftHat3_r1, 0.0F, 0.1309F, 0.0F);
		LeftHat3_r1.setTextureOffset(15, 11).addCuboid(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);

		RightHat10_r1 = new ModelPart(this);
		RightHat10_r1.setPivot(-2.7577F, -2.6F, 4.7211F);
		HEAD.addChild(RightHat10_r1);
		setRotationAngle(RightHat10_r1, 0.0F, -0.3927F, 0.0F);
		RightHat10_r1.setTextureOffset(15, 11).addCuboid(-1.55F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		RightHat9_r1 = new ModelPart(this);
		RightHat9_r1.setPivot(-2.635F, -5.1F, 4.5554F);
		HEAD.addChild(RightHat9_r1);
		setRotationAngle(RightHat9_r1, 0.0F, -0.3927F, 0.0F);
		RightHat9_r1.setTextureOffset(15, 11).addCuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		RightHat8_r1 = new ModelPart(this);
		RightHat8_r1.setPivot(-4.3018F, -2.6F, 3.4746F);
		HEAD.addChild(RightHat8_r1);
		setRotationAngle(RightHat8_r1, 0.0F, 0.3927F, 0.0F);
		RightHat8_r1.setTextureOffset(15, 11).addCuboid(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		RightHat7_r1 = new ModelPart(this);
		RightHat7_r1.setPivot(-4.1137F, -5.1F, 3.3743F);
		HEAD.addChild(RightHat7_r1);
		setRotationAngle(RightHat7_r1, 0.0F, 0.3927F, 0.0F);
		RightHat7_r1.setTextureOffset(15, 11).addCuboid(-0.5F, -1.0F, -0.95F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		RightHat4_r1 = new ModelPart(this);
		RightHat4_r1.setPivot(-4.3896F, -2.6F, -2.6755F);
		HEAD.addChild(RightHat4_r1);
		setRotationAngle(RightHat4_r1, 0.0F, -0.1309F, 0.0F);
		RightHat4_r1.setTextureOffset(15, 11).addCuboid(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);

		RightHat3_r1 = new ModelPart(this);
		RightHat3_r1.setPivot(-4.1824F, -5.1F, -2.6296F);
		HEAD.addChild(RightHat3_r1);
		setRotationAngle(RightHat3_r1, 0.0F, -0.1309F, 0.0F);
		RightHat3_r1.setTextureOffset(15, 11).addCuboid(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);

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
		RIGHTLEG.setTextureOffset(18, 32).addCuboid(-3.25F, 9.3F, -2.25F, 6.0F, 1.0F, 4.0F, 0.0F, false);
		RIGHTLEG.setTextureOffset(5, 32).addCuboid(-2.25F, 9.3F, -3.25F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		RIGHTLEG.setTextureOffset(6, 53).addCuboid(-1.6F, 0.55F, -1.5F, 3.0F, -1.0F, 3.0F, 1.01F, true);

		RightRobe10_r1 = new ModelPart(this);
		RightRobe10_r1.setPivot(2.4621F, 9.8F, 2.4722F);
		RIGHTLEG.addChild(RightRobe10_r1);
		setRotationAngle(RightRobe10_r1, 0.0F, 0.7854F, 0.0F);
		RightRobe10_r1.setTextureOffset(18, 32).addCuboid(-0.7F, -0.5F, -0.4F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		RightRobe9_r1 = new ModelPart(this);
		RightRobe9_r1.setPivot(2.4621F, 9.8F, -2.4722F);
		RIGHTLEG.addChild(RightRobe9_r1);
		setRotationAngle(RightRobe9_r1, 0.0F, -0.7854F, 0.0F);
		RightRobe9_r1.setTextureOffset(18, 32).addCuboid(-0.7F, -0.5F, -0.4F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		RightRobe8_r1 = new ModelPart(this);
		RightRobe8_r1.setPivot(-2.4621F, 9.8F, 2.4722F);
		RIGHTLEG.addChild(RightRobe8_r1);
		setRotationAngle(RightRobe8_r1, 0.0F, -0.7854F, 0.0F);
		RightRobe8_r1.setTextureOffset(18, 32).addCuboid(-0.7F, -0.5F, -0.4F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		RightRobe7_r1 = new ModelPart(this);
		RightRobe7_r1.setPivot(-2.4621F, 9.8F, -2.4722F);
		RIGHTLEG.addChild(RightRobe7_r1);
		setRotationAngle(RightRobe7_r1, 0.0F, 0.7854F, 0.0F);
		RightRobe7_r1.setTextureOffset(18, 32).addCuboid(-0.7F, -0.5F, -0.4F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		RightRobe4_r1 = new ModelPart(this);
		RightRobe4_r1.setPivot(0.0F, 4.9043F, 1.8616F);
		RIGHTLEG.addChild(RightRobe4_r1);
		setRotationAngle(RightRobe4_r1, 0.0873F, 0.0F, 0.0F);
		RightRobe4_r1.setTextureOffset(18, 32).addCuboid(-1.25F, -3.5F, 0.0F, 2.0F, 7.0F, 0.0F, 1.0F, false);

		RightRobe3_r1 = new ModelPart(this);
		RightRobe3_r1.setPivot(0.0F, 4.9043F, -1.8616F);
		RIGHTLEG.addChild(RightRobe3_r1);
		setRotationAngle(RightRobe3_r1, -0.0873F, 0.0F, 0.0F);
		RightRobe3_r1.setTextureOffset(18, 32).addCuboid(-1.25F, -3.5F, 0.0F, 2.0F, 7.0F, 0.0F, 1.0F, false);

		RightRobe2_r1 = new ModelPart(this);
		RightRobe2_r1.setPivot(1.8616F, 4.9043F, 0.0F);
		RIGHTLEG.addChild(RightRobe2_r1);
		setRotationAngle(RightRobe2_r1, 0.0F, 0.0F, -0.0873F);
		RightRobe2_r1.setTextureOffset(18, 32).addCuboid(0.0F, -3.5F, -1.25F, 0.0F, 7.0F, 2.0F, 1.0F, true);

		RightRobe1_r1 = new ModelPart(this);
		RightRobe1_r1.setPivot(-1.8616F, 4.9043F, 0.0F);
		RIGHTLEG.addChild(RightRobe1_r1);
		setRotationAngle(RightRobe1_r1, 0.0F, 0.0F, 0.0873F);
		RightRobe1_r1.setTextureOffset(18, 32).addCuboid(0.0F, -3.5F, -1.25F, 0.0F, 7.0F, 2.0F, 1.0F, false);

		LEFTLEG = new ModelPart(this);
		LEFTLEG.setPivot(1.9F, 12.0F, 0.0F);
		LEFTLEG.setTextureOffset(5, 32).addCuboid(-3.25F, 9.3F, -2.25F, 6.0F, 1.0F, 4.0F, 0.0F, false);
		LEFTLEG.setTextureOffset(6, 32).addCuboid(-2.25F, 9.3F, -3.25F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		LEFTLEG.setTextureOffset(6, 53).addCuboid(-1.4F, 0.55F, -1.5F, 3.0F, -1.0F, 3.0F, 1.01F, false);

		LeftRobe10_r1 = new ModelPart(this);
		LeftRobe10_r1.setPivot(-2.4621F, 9.8F, 2.4722F);
		LEFTLEG.addChild(LeftRobe10_r1);
		setRotationAngle(LeftRobe10_r1, 0.0F, -0.7854F, 0.0F);
		LeftRobe10_r1.setTextureOffset(16, 32).addCuboid(-0.7F, -0.5F, -0.4F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		LeftRobe9_r1 = new ModelPart(this);
		LeftRobe9_r1.setPivot(-2.4621F, 9.8F, -2.4722F);
		LEFTLEG.addChild(LeftRobe9_r1);
		setRotationAngle(LeftRobe9_r1, 0.0F, 0.7854F, 0.0F);
		LeftRobe9_r1.setTextureOffset(16, 32).addCuboid(-0.7F, -0.5F, -0.4F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		LeftRobe8_r1 = new ModelPart(this);
		LeftRobe8_r1.setPivot(2.4621F, 9.8F, 2.4722F);
		LEFTLEG.addChild(LeftRobe8_r1);
		setRotationAngle(LeftRobe8_r1, 0.0F, 0.7854F, 0.0F);
		LeftRobe8_r1.setTextureOffset(16, 32).addCuboid(-0.7F, -0.5F, -0.4F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		LeftRobe7_r1 = new ModelPart(this);
		LeftRobe7_r1.setPivot(2.4621F, 9.8F, -2.4722F);
		LEFTLEG.addChild(LeftRobe7_r1);
		setRotationAngle(LeftRobe7_r1, 0.0F, -0.7854F, 0.0F);
		LeftRobe7_r1.setTextureOffset(16, 32).addCuboid(-0.7F, -0.5F, -0.4F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		LeftRobe4_r1 = new ModelPart(this);
		LeftRobe4_r1.setPivot(0.0F, 4.9043F, 1.8616F);
		LEFTLEG.addChild(LeftRobe4_r1);
		setRotationAngle(LeftRobe4_r1, 0.0873F, 0.0F, 0.0F);
		LeftRobe4_r1.setTextureOffset(16, 32).addCuboid(-1.25F, -3.5F, 0.0F, 2.0F, 7.0F, 0.0F, 1.0F, false);

		LeftRobe3_r1 = new ModelPart(this);
		LeftRobe3_r1.setPivot(0.0F, 4.9043F, -1.8616F);
		LEFTLEG.addChild(LeftRobe3_r1);
		setRotationAngle(LeftRobe3_r1, -0.0873F, 0.0F, 0.0F);
		LeftRobe3_r1.setTextureOffset(16, 32).addCuboid(-1.25F, -3.5F, 0.0F, 2.0F, 7.0F, 0.0F, 1.0F, false);

		LeftRobe2_r1 = new ModelPart(this);
		LeftRobe2_r1.setPivot(-1.8616F, 4.9043F, 0.0F);
		LEFTLEG.addChild(LeftRobe2_r1);
		setRotationAngle(LeftRobe2_r1, 0.0F, 0.0F, 0.0873F);
		LeftRobe2_r1.setTextureOffset(16, 32).addCuboid(0.0F, -3.5F, -1.25F, 0.0F, 7.0F, 2.0F, 1.0F, true);

		LeftRobe1_r1 = new ModelPart(this);
		LeftRobe1_r1.setPivot(1.8616F, 4.9043F, 0.0F);
		LEFTLEG.addChild(LeftRobe1_r1);
		setRotationAngle(LeftRobe1_r1, 0.0F, 0.0F, -0.0873F);
		LeftRobe1_r1.setTextureOffset(16, 32).addCuboid(0.0F, -3.5F, -1.25F, 0.0F, 7.0F, 2.0F, 1.0F, false);

		RIGHTFOOT = new ModelPart(this);
		RIGHTFOOT.setPivot(-1.9F, 12.0F, 0.0F);
		RIGHTFOOT.setTextureOffset(4, 59).addCuboid(-1.7F, 11.3F, -1.3F, 3.0F, 0.0F, 2.0F, 1.1F, false);
		RIGHTFOOT.setTextureOffset(4, 58).addCuboid(-1.6F, 11.6F, -2.5F, 2.0F, 0.0F, 3.0F, 1.0F, false);

		LEFTFOOT = new ModelPart(this);
		LEFTFOOT.setPivot(1.9F, 12.0F, 0.0F);
		LEFTFOOT.setTextureOffset(5, 58).addCuboid(-1.35F, 11.3F, -1.3F, 3.0F, 0.0F, 2.0F, 1.1F, false);
		LEFTFOOT.setTextureOffset(5, 58).addCuboid(-1.25F, 11.6F, -2.5F, 2.0F, 0.0F, 3.0F, 1.0F, false);
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