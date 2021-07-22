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
	private final ModelPart HelmetLeftFeather6_r1;
	private final ModelPart HelmetLeftFeather5_r1;
	private final ModelPart HelmetLeftFeather4_r1;
	private final ModelPart HelmetLeftFeather3_r1;
	private final ModelPart HelmetLeftFeather2_r1;
	private final ModelPart HelmetLeftFeather1_r1;
	private final ModelPart HelmetLeftFeatherMount3_r1;
	private final ModelPart HelmetLeftFeatherMount2_r1;
	private final ModelPart HelmetLeftFeatherMount1_r1;
	private final ModelPart HelmetRightFeather6_r1;
	private final ModelPart HelmetRightFeather5_r1;
	private final ModelPart HelmetRightFeather4_r1;
	private final ModelPart HelmetRightFeather3_r1;
	private final ModelPart HelmetRightFeather2_r1;
	private final ModelPart HelmetRightFeather1_r1;
	private final ModelPart HelmetRightFeatherMount2_r1;
	private final ModelPart HelmetRightFeatherMount3_r1;
	private final ModelPart HelmetRightFeatherMount1_r1;
	private final ModelPart HelmetLeftTooth3_r1;
	private final ModelPart HelmetLeftTooth2_r1;
	private final ModelPart HelmetLeftTooth1_r1;
	private final ModelPart HelmetLeftToothMount3_r1;
	private final ModelPart HelmetLeftToothMount2_r1;
	private final ModelPart HelmetLeftToothMount1_r1;
	private final ModelPart HelmetRightTooth3_r1;
	private final ModelPart HelmetRightTooth2_r1;
	private final ModelPart HelmetRightTooth1_r1;
	private final ModelPart HelmetRightToothMount3_r1;
	private final ModelPart HelmetRightToothMount2_r1;
	private final ModelPart HelmetRightToothMount1_r1;
	private final ModelPart HelmetLeftside6_r1;
	private final ModelPart HelmetLeftside5_r1;
	private final ModelPart HelmetLeftside4_r1;
	private final ModelPart HelmetLeftside3_r1;
	private final ModelPart HelmetLeftside2_r1;
	private final ModelPart HelmetLeftside1_r1;
	private final ModelPart Helmetrightside6_r1;
	private final ModelPart Helmetrightside5_r1;
	private final ModelPart Helmetrightside4_r1;
	private final ModelPart Helmetrightside3_r1;
	private final ModelPart Helmetrightside2_r1;
	private final ModelPart Helmetrightside1_r1;
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
	private final ModelPart HelmetTop5_r1;
	private final ModelPart HelmetTop4_r1;
	private final ModelPart BODY;
	private final ModelPart RIGHTARM;
	private final ModelPart LEFTARM;
	private final ModelPart RIGHTLEG;
	private final ModelPart LEFTLEG;
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
		HEAD.setTextureOffset(5, 3).addCuboid(0.0F, -8.2F, -4.1F, 5.0F, 1.0F, 7.0F, 0.0F, false);
		HEAD.setTextureOffset(6, 17).addCuboid(3.8F, -5.2F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		HEAD.setTextureOffset(5, 17).addCuboid(-5.6F, -5.2F, -4.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		HEAD.setTextureOffset(5, 3).addCuboid(-4.9F, -8.2F, -4.1F, 5.0F, 1.0F, 7.0F, 0.0F, false);
		HEAD.setTextureOffset(5, 3).addCuboid(-0.7815F, -8.2F, 2.841F, 5.0F, 1.0F, 2.0F, 0.0F, false);
		HEAD.setTextureOffset(5, 3).addCuboid(-3.982F, -8.2F, 2.8021F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		HEAD.setTextureOffset(10, 2).addCuboid(-0.6141F, -7.917F, 3.9153F, 5.0F, 8.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(11, 2).addCuboid(-4.3141F, -7.917F, 3.9153F, 5.0F, 8.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(3, 3).addCuboid(-3.5F, 0.15F, -3.0F, 7.0F, -1.0F, 6.0F, 1.0F, false);
		HEAD.setTextureOffset(30, 43).addCuboid(-6.6F, -4.7F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		HEAD.setTextureOffset(31, 44).addCuboid(5.8F, -4.7F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		HelmetLeftFeather6_r1 = new ModelPart(this);
		HelmetLeftFeather6_r1.setPivot(3.2115F, -0.1948F, 7.497F);
		HEAD.addChild(HelmetLeftFeather6_r1);
		setRotationAngle(HelmetLeftFeather6_r1, -1.0472F, -0.2094F, 0.0F);
		HelmetLeftFeather6_r1.setTextureOffset(2, 59).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		HelmetLeftFeather5_r1 = new ModelPart(this);
		HelmetLeftFeather5_r1.setPivot(3.3041F, -1.1117F, 7.0613F);
		HEAD.addChild(HelmetLeftFeather5_r1);
		setRotationAngle(HelmetLeftFeather5_r1, -0.5934F, -0.2094F, 0.0F);
		HelmetLeftFeather5_r1.setTextureOffset(2, 57).addCuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		HelmetLeftFeather4_r1 = new ModelPart(this);
		HelmetLeftFeather4_r1.setPivot(3.3092F, -3.6174F, 7.5181F);
		HEAD.addChild(HelmetLeftFeather4_r1);
		setRotationAngle(HelmetLeftFeather4_r1, -0.8727F, -0.2094F, 0.0F);
		HelmetLeftFeather4_r1.setTextureOffset(2, 59).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		HelmetLeftFeather3_r1 = new ModelPart(this);
		HelmetLeftFeather3_r1.setPivot(3.4381F, -4.4144F, 6.9118F);
		HEAD.addChild(HelmetLeftFeather3_r1);
		setRotationAngle(HelmetLeftFeather3_r1, -0.4014F, -0.2094F, 0.0F);
		HelmetLeftFeather3_r1.setTextureOffset(2, 57).addCuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		HelmetLeftFeather2_r1 = new ModelPart(this);
		HelmetLeftFeather2_r1.setPivot(3.2657F, -8.3244F, 7.2419F);
		HEAD.addChild(HelmetLeftFeather2_r1);
		setRotationAngle(HelmetLeftFeather2_r1, -0.3316F, -0.2094F, 0.0F);
		HelmetLeftFeather2_r1.setTextureOffset(2, 57).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		HelmetLeftFeather1_r1 = new ModelPart(this);
		HelmetLeftFeather1_r1.setPivot(3.4636F, -8.5449F, 6.3107F);
		HEAD.addChild(HelmetLeftFeather1_r1);
		setRotationAngle(HelmetLeftFeather1_r1, 0.2094F, -0.2094F, 0.0F);
		HelmetLeftFeather1_r1.setTextureOffset(2, 57).addCuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		HelmetLeftFeatherMount3_r1 = new ModelPart(this);
		HelmetLeftFeatherMount3_r1.setPivot(3.8089F, -2.5885F, 4.6864F);
		HEAD.addChild(HelmetLeftFeatherMount3_r1);
		setRotationAngle(HelmetLeftFeatherMount3_r1, -0.4363F, -0.2094F, 0.0F);
		HelmetLeftFeatherMount3_r1.setTextureOffset(5, 17).addCuboid(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		HelmetLeftFeatherMount2_r1 = new ModelPart(this);
		HelmetLeftFeatherMount2_r1.setPivot(4.0021F, -5.4404F, 4.2585F);
		HEAD.addChild(HelmetLeftFeatherMount2_r1);
		setRotationAngle(HelmetLeftFeatherMount2_r1, -0.2618F, -0.2094F, 0.0F);
		HelmetLeftFeatherMount2_r1.setTextureOffset(5, 17).addCuboid(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		HelmetLeftFeatherMount1_r1 = new ModelPart(this);
		HelmetLeftFeatherMount1_r1.setPivot(4.0024F, -7.9026F, 3.7759F);
		HEAD.addChild(HelmetLeftFeatherMount1_r1);
		setRotationAngle(HelmetLeftFeatherMount1_r1, 0.3491F, -0.2094F, 0.0F);
		HelmetLeftFeatherMount1_r1.setTextureOffset(6, 17).addCuboid(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		HelmetRightFeather6_r1 = new ModelPart(this);
		HelmetRightFeather6_r1.setPivot(-3.4083F, -0.2908F, 6.6233F);
		HEAD.addChild(HelmetRightFeather6_r1);
		setRotationAngle(HelmetRightFeather6_r1, -1.0472F, 0.2094F, 0.0F);
		HelmetRightFeather6_r1.setTextureOffset(2, 59).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		HelmetRightFeather5_r1 = new ModelPart(this);
		HelmetRightFeather5_r1.setPivot(-3.501F, -1.2077F, 6.1876F);
		HEAD.addChild(HelmetRightFeather5_r1);
		setRotationAngle(HelmetRightFeather5_r1, -0.5934F, 0.2094F, 0.0F);
		HelmetRightFeather5_r1.setTextureOffset(2, 57).addCuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		HelmetRightFeather4_r1 = new ModelPart(this);
		HelmetRightFeather4_r1.setPivot(-3.2215F, -3.5995F, 7.5025F);
		HEAD.addChild(HelmetRightFeather4_r1);
		setRotationAngle(HelmetRightFeather4_r1, -0.8727F, 0.2094F, 0.0F);
		HelmetRightFeather4_r1.setTextureOffset(2, 59).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		HelmetRightFeather3_r1 = new ModelPart(this);
		HelmetRightFeather3_r1.setPivot(-3.3503F, -4.3966F, 6.8962F);
		HEAD.addChild(HelmetRightFeather3_r1);
		setRotationAngle(HelmetRightFeather3_r1, -0.4014F, 0.2094F, 0.0F);
		HelmetRightFeather3_r1.setTextureOffset(2, 57).addCuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		HelmetRightFeather2_r1 = new ModelPart(this);
		HelmetRightFeather2_r1.setPivot(-3.157F, -7.9928F, 7.2724F);
		HEAD.addChild(HelmetRightFeather2_r1);
		setRotationAngle(HelmetRightFeather2_r1, -0.3316F, 0.2094F, 0.0F);
		HelmetRightFeather2_r1.setTextureOffset(2, 57).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		HelmetRightFeather1_r1 = new ModelPart(this);
		HelmetRightFeather1_r1.setPivot(-3.3549F, -8.2133F, 6.3413F);
		HEAD.addChild(HelmetRightFeather1_r1);
		setRotationAngle(HelmetRightFeather1_r1, 0.2094F, 0.2094F, 0.0F);
		HelmetRightFeather1_r1.setTextureOffset(2, 57).addCuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		HelmetRightFeatherMount2_r1 = new ModelPart(this);
		HelmetRightFeatherMount2_r1.setPivot(-3.8239F, -5.3369F, 4.6156F);
		HEAD.addChild(HelmetRightFeatherMount2_r1);
		setRotationAngle(HelmetRightFeatherMount2_r1, -0.2618F, 0.2094F, 0.0F);
		HelmetRightFeatherMount2_r1.setTextureOffset(5, 17).addCuboid(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		HelmetRightFeatherMount3_r1 = new ModelPart(this);
		HelmetRightFeatherMount3_r1.setPivot(-3.9295F, -2.5279F, 4.1191F);
		HEAD.addChild(HelmetRightFeatherMount3_r1);
		setRotationAngle(HelmetRightFeatherMount3_r1, -0.4363F, 0.2094F, 0.0F);
		HelmetRightFeatherMount3_r1.setTextureOffset(5, 17).addCuboid(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		HelmetRightFeatherMount1_r1 = new ModelPart(this);
		HelmetRightFeatherMount1_r1.setPivot(-3.7465F, -7.8601F, 4.4989F);
		HEAD.addChild(HelmetRightFeatherMount1_r1);
		setRotationAngle(HelmetRightFeatherMount1_r1, 0.3491F, 0.2094F, 0.0F);
		HelmetRightFeatherMount1_r1.setTextureOffset(5, 17).addCuboid(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		HelmetLeftTooth3_r1 = new ModelPart(this);
		HelmetLeftTooth3_r1.setPivot(5.6977F, -6.586F, 3.8574F);
		HEAD.addChild(HelmetLeftTooth3_r1);
		setRotationAngle(HelmetLeftTooth3_r1, -0.7681F, 0.1841F, 0.1872F);
		HelmetLeftTooth3_r1.setTextureOffset(30, 43).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		HelmetLeftTooth2_r1 = new ModelPart(this);
		HelmetLeftTooth2_r1.setPivot(5.0014F, -9.2382F, 0.8133F);
		HEAD.addChild(HelmetLeftTooth2_r1);
		setRotationAngle(HelmetLeftTooth2_r1, -0.2164F, 0.0283F, 0.1278F);
		HelmetLeftTooth2_r1.setTextureOffset(30, 43).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		HelmetLeftTooth1_r1 = new ModelPart(this);
		HelmetLeftTooth1_r1.setPivot(4.4701F, -10.1234F, -2.6778F);
		HEAD.addChild(HelmetLeftTooth1_r1);
		setRotationAngle(HelmetLeftTooth1_r1, -0.2174F, 0.0189F, 0.0852F);
		HelmetLeftTooth1_r1.setTextureOffset(30, 43).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		HelmetLeftToothMount3_r1 = new ModelPart(this);
		HelmetLeftToothMount3_r1.setPivot(5.0507F, -4.8785F, 2.1499F);
		HEAD.addChild(HelmetLeftToothMount3_r1);
		setRotationAngle(HelmetLeftToothMount3_r1, -0.7681F, 0.1841F, 0.1872F);
		HelmetLeftToothMount3_r1.setTextureOffset(5, 3).addCuboid(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		HelmetLeftToothMount2_r1 = new ModelPart(this);
		HelmetLeftToothMount2_r1.setPivot(4.6751F, -6.8183F, 0.2769F);
		HEAD.addChild(HelmetLeftToothMount2_r1);
		setRotationAngle(HelmetLeftToothMount2_r1, -0.2164F, 0.0283F, 0.1278F);
		HelmetLeftToothMount2_r1.setTextureOffset(5, 3).addCuboid(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		HelmetLeftToothMount1_r1 = new ModelPart(this);
		HelmetLeftToothMount1_r1.setPivot(4.2522F, -7.692F, -3.2169F);
		HEAD.addChild(HelmetLeftToothMount1_r1);
		setRotationAngle(HelmetLeftToothMount1_r1, -0.2174F, 0.0189F, 0.0852F);
		HelmetLeftToothMount1_r1.setTextureOffset(5, 3).addCuboid(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		HelmetRightTooth3_r1 = new ModelPart(this);
		HelmetRightTooth3_r1.setPivot(-5.6011F, -6.6043F, 3.8757F);
		HEAD.addChild(HelmetRightTooth3_r1);
		setRotationAngle(HelmetRightTooth3_r1, -0.7681F, -0.1841F, -0.1872F);
		HelmetRightTooth3_r1.setTextureOffset(30, 43).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		HelmetRightTooth2_r1 = new ModelPart(this);
		HelmetRightTooth2_r1.setPivot(-5.0014F, -9.2382F, 0.8133F);
		HEAD.addChild(HelmetRightTooth2_r1);
		setRotationAngle(HelmetRightTooth2_r1, -0.2164F, -0.0283F, -0.1278F);
		HelmetRightTooth2_r1.setTextureOffset(30, 43).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		HelmetRightTooth1_r1 = new ModelPart(this);
		HelmetRightTooth1_r1.setPivot(-4.3704F, -10.1319F, -2.6759F);
		HEAD.addChild(HelmetRightTooth1_r1);
		setRotationAngle(HelmetRightTooth1_r1, -0.2174F, -0.0189F, -0.0852F);
		HelmetRightTooth1_r1.setTextureOffset(30, 43).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		HelmetRightToothMount3_r1 = new ModelPart(this);
		HelmetRightToothMount3_r1.setPivot(-4.9541F, -4.8968F, 2.1682F);
		HEAD.addChild(HelmetRightToothMount3_r1);
		setRotationAngle(HelmetRightToothMount3_r1, -0.7681F, -0.1841F, -0.1872F);
		HelmetRightToothMount3_r1.setTextureOffset(5, 3).addCuboid(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		HelmetRightToothMount2_r1 = new ModelPart(this);
		HelmetRightToothMount2_r1.setPivot(-4.6751F, -6.8183F, 0.2769F);
		HEAD.addChild(HelmetRightToothMount2_r1);
		setRotationAngle(HelmetRightToothMount2_r1, -0.2164F, -0.0283F, -0.1278F);
		HelmetRightToothMount2_r1.setTextureOffset(5, 3).addCuboid(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		HelmetRightToothMount1_r1 = new ModelPart(this);
		HelmetRightToothMount1_r1.setPivot(-4.1525F, -7.7005F, -3.215F);
		HEAD.addChild(HelmetRightToothMount1_r1);
		setRotationAngle(HelmetRightToothMount1_r1, -0.2174F, -0.0189F, -0.0852F);
		HelmetRightToothMount1_r1.setTextureOffset(5, 3).addCuboid(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

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
		HelmetFaceguard6_r1.setPivot(-2.4592F, -6.7586F, -4.2405F);
		HEAD.addChild(HelmetFaceguard6_r1);
		setRotationAngle(HelmetFaceguard6_r1, -0.7734F, -1.2635F, 0.7974F);
		HelmetFaceguard6_r1.setTextureOffset(10, 3).addCuboid(-0.5F, -1.0F, -2.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);

		HelmetFaceguard5_r1 = new ModelPart(this);
		HelmetFaceguard5_r1.setPivot(2.3047F, -6.7586F, -4.2405F);
		HEAD.addChild(HelmetFaceguard5_r1);
		setRotationAngle(HelmetFaceguard5_r1, -0.7734F, 1.2635F, -0.7974F);
		HelmetFaceguard5_r1.setTextureOffset(10, 4).addCuboid(-0.5F, -1.0F, -2.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);

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
		HelmetFaceguard2_r1.setPivot(2.3284F, -1.9142F, -4.1472F);
		HEAD.addChild(HelmetFaceguard2_r1);
		setRotationAngle(HelmetFaceguard2_r1, 2.8529F, -1.3419F, -2.858F);
		HelmetFaceguard2_r1.setTextureOffset(10, 3).addCuboid(-0.5F, -2.0F, -2.5F, 1.0F, 4.0F, 5.0F, 0.0F, false);

		HelmetFaceguard1_r1 = new ModelPart(this);
		HelmetFaceguard1_r1.setPivot(-2.3012F, -1.8877F, -4.1429F);
		HEAD.addChild(HelmetFaceguard1_r1);
		setRotationAngle(HelmetFaceguard1_r1, 0.3048F, -1.3419F, -0.3125F);
		HelmetFaceguard1_r1.setTextureOffset(10, 3).addCuboid(-0.5F, -2.0F, -2.5F, 1.0F, 4.0F, 5.0F, 0.0F, false);

		HelmetBlack2_r1 = new ModelPart(this);
		HelmetBlack2_r1.setPivot(-1.8582F, -5.3F, -3.9925F);
		HEAD.addChild(HelmetBlack2_r1);
		setRotationAngle(HelmetBlack2_r1, 0.0F, -1.3526F, 0.0F);
		HelmetBlack2_r1.setTextureOffset(20, 14).addCuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		HelmetBlack1_r1 = new ModelPart(this);
		HelmetBlack1_r1.setPivot(1.8582F, -5.3F, -3.9925F);
		HEAD.addChild(HelmetBlack1_r1);
		setRotationAngle(HelmetBlack1_r1, 0.0F, 1.3526F, 0.0F);
		HelmetBlack1_r1.setTextureOffset(20, 14).addCuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		HelmetTop5_r1 = new ModelPart(this);
		HelmetTop5_r1.setPivot(-4.1017F, -7.7F, 3.7827F);
		HEAD.addChild(HelmetTop5_r1);
		setRotationAngle(HelmetTop5_r1, -3.1416F, 1.2392F, -3.1416F);
		HelmetTop5_r1.setTextureOffset(5, 3).addCuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		HelmetTop4_r1 = new ModelPart(this);
		HelmetTop4_r1.setPivot(4.149F, -7.7F, 3.7251F);
		HEAD.addChild(HelmetTop4_r1);
		setRotationAngle(HelmetTop4_r1, 0.0F, 1.1694F, 0.0F);
		HelmetTop4_r1.setTextureOffset(5, 3).addCuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		BODY = new ModelPart(this);
		BODY.setPivot(0.0F, 0.0F, 0.0F);
		BODY.setTextureOffset(21, 29).addCuboid(-3.7F, 0.5F, -2.0F, 7.0F, 4.0F, -1.0F, 1.01F, false);
		BODY.setTextureOffset(21, 34).addCuboid(-3.6F, 3.9F, -1.5F, 7.0F, 4.0F, -1.0F, 1.01F, false);
		BODY.setTextureOffset(21, 38).addCuboid(-3.5F, 8.5F, -1.35F, 7.0F, 3.0F, -1.0F, 1.01F, false);
		BODY.setTextureOffset(6, 4).addCuboid(-3.8F, 0.6F, -1.4F, 7.0F, 5.0F, 3.0F, 1.01F, false);
		BODY.setTextureOffset(7, 6).addCuboid(-3.5F, 7.6F, -0.6F, 7.0F, 3.0F, 2.0F, 1.01F, false);
		BODY.setTextureOffset(2, 48).addCuboid(-4.0F, 12.65F, -1.5F, 8.0F, -1.0F, 3.0F, 1.01F, false);

		RIGHTARM = new ModelPart(this);
		RIGHTARM.setPivot(-5.0F, 2.0F, 0.0F);
		RIGHTARM.setTextureOffset(2, 16).addCuboid(-3.0F, -1.3F, -2.0F, 4.0F, 2.0F, 4.0F, 1.3F, false);
		RIGHTARM.setTextureOffset(30, 43).addCuboid(-3.5F, -3.55F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RIGHTARM.setTextureOffset(8, 1).addCuboid(-3.1541F, 6.2548F, -2.2F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		RIGHTARM.setTextureOffset(8, 1).addCuboid(-3.2541F, 1.8548F, -2.4F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		RIGHTARM.setTextureOffset(40, 28).addCuboid(-3.0541F, -2.1452F, -2.1F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		LEFTARM = new ModelPart(this);
		LEFTARM.setPivot(5.0F, 2.0F, 0.0F);
		LEFTARM.setTextureOffset(2, 16).addCuboid(-1.0F, -1.3F, -2.0F, 4.0F, 2.0F, 4.0F, 1.3F, false);
		LEFTARM.setTextureOffset(31, 44).addCuboid(2.5F, -3.55F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LEFTARM.setTextureOffset(8, 1).addCuboid(-1.1541F, 6.2548F, -2.2F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		LEFTARM.setTextureOffset(8, 1).addCuboid(-1.2541F, 1.8548F, -2.4F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		LEFTARM.setTextureOffset(41, 29).addCuboid(-1.0541F, -2.1452F, -2.1F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		RIGHTLEG = new ModelPart(this);
		RIGHTLEG.setPivot(-1.9F, 12.0F, 0.0F);
		RIGHTLEG.setTextureOffset(2, 14).addCuboid(-1.5F, 1.6F, -1.1F, 2.0F, 7.0F, 2.0F, 1.0F, false);
		RIGHTLEG.setTextureOffset(15, 6).addCuboid(-1.7F, 4.5F, -2.4F, 3.0F, 2.0F, 0.0F, 0.0F, false);
		RIGHTLEG.setTextureOffset(12, 6).addCuboid(-1.7F, 5.6F, -1.3F, 3.0F, 0.0F, 2.0F, 1.0F, false);

		LEFTLEG = new ModelPart(this);
		LEFTLEG.setPivot(1.9F, 12.0F, 0.0F);
		LEFTLEG.setTextureOffset(2, 14).addCuboid(-1.1F, 1.6F, -1.1F, 2.0F, 7.0F, 2.0F, 1.0F, false);
		LEFTLEG.setTextureOffset(15, 7).addCuboid(-1.3F, 4.5F, -2.4F, 3.0F, 2.0F, 0.0F, 0.0F, false);
		LEFTLEG.setTextureOffset(11, 6).addCuboid(-1.3F, 5.6F, -1.3F, 3.0F, 0.0F, 2.0F, 1.0F, false);

		RIGHTFOOT = new ModelPart(this);
		RIGHTFOOT.setPivot(0.0F, 24.0F, 0.0F);
		RIGHTFOOT.setTextureOffset(4, 42).addCuboid(-3.5F, -0.4F, -2.5F, 2.0F, 0.0F, 3.0F, 1.0F, false);
		RIGHTFOOT.setTextureOffset(4, 42).addCuboid(-3.6F, -0.7F, -1.3F, 3.0F, 0.0F, 2.0F, 1.0F, false);
		RIGHTFOOT.setTextureOffset(31, 44).addCuboid(-2.2F, -2.0F, -3.3F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		LEFTFOOT = new ModelPart(this);
		LEFTFOOT.setPivot(0.0F, 24.0F, 0.0F);
		LEFTFOOT.setTextureOffset(4, 42).addCuboid(0.55F, -0.7F, -1.3F, 3.0F, 0.0F, 2.0F, 1.0F, false);
		LEFTFOOT.setTextureOffset(4, 42).addCuboid(0.65F, -0.4F, -2.5F, 2.0F, 0.0F, 3.0F, 1.0F, false);
		LEFTFOOT.setTextureOffset(31, 44).addCuboid(1.6F, -2.0F, -3.3F, 0.0F, 0.0F, 0.0F, 0.0F, false);
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