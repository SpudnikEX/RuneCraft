// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class steve extends EntityModel<Entity> {
	private final ModelRenderer PlayerHead;
	private final ModelRenderer PlayerBody;
	private final ModelRenderer PlayerRightArm;
	private final ModelRenderer PlayerLeftArm;
	private final ModelRenderer PlayerRightLeg;
	private final ModelRenderer PlayerLeftLeg;
	private final ModelRenderer HEAD;
	private final ModelRenderer LeftHelmetFaceGuard2_r1;
	private final ModelRenderer LeftHelmetFaceGuard1_r1;
	private final ModelRenderer RightHelmetFaceGuard2_r1;
	private final ModelRenderer RightHelmetFaceGuard1_r1;
	private final ModelRenderer TasleMount2_r1;
	private final ModelRenderer Tasle1_r1;
	private final ModelRenderer Tasle3_r1;
	private final ModelRenderer Tasle4_r1;
	private final ModelRenderer Tasle5_r1;
	private final ModelRenderer BottomFaceguardBar_r1;
	private final ModelRenderer TopFaceguardBar_r1;
	private final ModelRenderer BODY;
	private final ModelRenderer RIGHTARM;
	private final ModelRenderer LEFTARM;
	private final ModelRenderer RIGHTLEG;
	private final ModelRenderer LEFTLEG;
	private final ModelRenderer RIGHTFOOT;
	private final ModelRenderer LEFTFOOT;

	public steve() {
		textureWidth = 64;
		textureHeight = 64;

		PlayerHead = new ModelRenderer(this);
		PlayerHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		PlayerHead.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		PlayerHead.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		PlayerBody = new ModelRenderer(this);
		PlayerBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		PlayerBody.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		PlayerBody.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

		PlayerRightArm = new ModelRenderer(this);
		PlayerRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		PlayerRightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		PlayerRightArm.setTextureOffset(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		PlayerLeftArm = new ModelRenderer(this);
		PlayerLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		PlayerLeftArm.setTextureOffset(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		PlayerLeftArm.setTextureOffset(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		PlayerRightLeg = new ModelRenderer(this);
		PlayerRightLeg.setRotationPoint(-1.9F, 13.0F, 0.0F);
		PlayerRightLeg.setTextureOffset(0, 16).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		PlayerRightLeg.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		PlayerLeftLeg = new ModelRenderer(this);
		PlayerLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		PlayerLeftLeg.setTextureOffset(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		PlayerLeftLeg.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		HEAD = new ModelRenderer(this);
		HEAD.setRotationPoint(0.0F, 0.0F, 0.0F);
		HEAD.setTextureOffset(7, 7).addBox(-3.0F, -5.0F, -4.0F, -1.0F, 2.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(11, 8).addBox(-0.75F, -5.0F, -4.0F, -1.0F, 2.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(8, 7).addBox(1.75F, -5.0F, -4.0F, -1.0F, 2.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(6, 7).addBox(4.0F, -5.0F, -4.0F, -1.0F, 2.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(22, 16).addBox(-3.0F, -6.5F, -3.5F, 6.0F, 5.0F, -2.0F, 1.0F, false);
		HEAD.setTextureOffset(11, 9).addBox(-3.0F, -7.0F, -4.0F, 6.0F, 0.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(11, 13).addBox(-3.0F, -1.0F, -4.0F, 6.0F, 0.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(22, 24).addBox(0.0F, -10.9397F, 7.2096F, 0.0F, -1.0F, 1.0F, 1.0F, false);
		HEAD.setTextureOffset(18, 42).addBox(-0.5F, -8.0F, -0.75F, 1.0F, -1.0F, 4.0F, 1.0F, false);
		HEAD.setTextureOffset(22, 45).addBox(-0.5F, -8.25F, 4.25F, 1.0F, 0.0F, 0.0F, 1.0F, false);
		HEAD.setTextureOffset(2, 4).addBox(-3.5F, 0.25F, -3.5F, 7.0F, -1.0F, 7.0F, 1.0F, false);
		HEAD.setTextureOffset(7, 5).addBox(-2.5F, -7.75F, -1.75F, 5.0F, -1.0F, 5.0F, 1.0F, false);
		HEAD.setTextureOffset(4, 6).addBox(-3.0F, -7.5F, -2.75F, 6.0F, -1.0F, 6.0F, 1.0F, false);
		HEAD.setTextureOffset(3, 6).addBox(-3.5F, -7.25F, -3.5F, 7.0F, -1.0F, 7.0F, 1.0F, false);
		HEAD.setTextureOffset(10, 6).addBox(-3.5F, -7.0F, 5.0F, 7.0F, 6.0F, -1.0F, 1.0F, false);
		HEAD.setTextureOffset(10, 1).addBox(-3.75F, -7.0F, -3.5F, -1.0F, 6.0F, 7.0F, 1.0F, false);
		HEAD.setTextureOffset(10, 1).addBox(4.75F, -7.0F, -3.5F, -1.0F, 6.0F, 7.0F, 1.0F, false);

		LeftHelmetFaceGuard2_r1 = new ModelRenderer(this);
		LeftHelmetFaceGuard2_r1.setRotationPoint(4.5F, -5.3196F, -3.0388F);
		HEAD.addChild(LeftHelmetFaceGuard2_r1);
		setRotationAngle(LeftHelmetFaceGuard2_r1, -0.6109F, 0.0F, 0.0F);
		LeftHelmetFaceGuard2_r1.setTextureOffset(3, 34).addBox(0.5F, 0.9F, -1.5F, -1.0F, -1.0F, 6.0F, 1.0F, false);

		LeftHelmetFaceGuard1_r1 = new ModelRenderer(this);
		LeftHelmetFaceGuard1_r1.setRotationPoint(4.5F, -1.3944F, -2.5167F);
		HEAD.addChild(LeftHelmetFaceGuard1_r1);
		setRotationAngle(LeftHelmetFaceGuard1_r1, -0.0175F, 0.0F, 0.0F);
		LeftHelmetFaceGuard1_r1.setTextureOffset(5, 35).addBox(0.5F, 0.3F, -1.6F, -1.0F, -1.0F, 4.0F, 1.0F, false);

		RightHelmetFaceGuard2_r1 = new ModelRenderer(this);
		RightHelmetFaceGuard2_r1.setRotationPoint(-4.5F, -4.1315F, -2.0395F);
		HEAD.addChild(RightHelmetFaceGuard2_r1);
		setRotationAngle(RightHelmetFaceGuard2_r1, -0.6109F, 0.0F, 0.0F);
		RightHelmetFaceGuard2_r1.setTextureOffset(3, 34).addBox(0.5F, 0.5F, -3.0F, -1.0F, -1.0F, 6.0F, 1.0F, false);

		RightHelmetFaceGuard1_r1 = new ModelRenderer(this);
		RightHelmetFaceGuard1_r1.setRotationPoint(-4.5F, -1.5874F, -2.1133F);
		HEAD.addChild(RightHelmetFaceGuard1_r1);
		setRotationAngle(RightHelmetFaceGuard1_r1, -0.0175F, 0.0F, 0.0F);
		RightHelmetFaceGuard1_r1.setTextureOffset(5, 35).addBox(0.5F, 0.5F, -2.0F, -1.0F, -1.0F, 4.0F, 1.0F, false);

		TasleMount2_r1 = new ModelRenderer(this);
		TasleMount2_r1.setRotationPoint(0.0F, -9.3247F, 4.72F);
		HEAD.addChild(TasleMount2_r1);
		setRotationAngle(TasleMount2_r1, 0.5236F, 0.0F, 0.0F);
		TasleMount2_r1.setTextureOffset(22, 44).addBox(-0.5F, 1.0F, 0.25F, 1.0F, -1.0F, 0.0F, 1.0F, false);

		Tasle1_r1 = new ModelRenderer(this);
		Tasle1_r1.setRotationPoint(0.0F, -11.0159F, 5.8269F);
		HEAD.addChild(Tasle1_r1);
		setRotationAngle(Tasle1_r1, 1.1781F, 0.0F, 0.0F);
		Tasle1_r1.setTextureOffset(22, 25).addBox(0.0F, 1.0F, -1.0F, 0.0F, -1.0F, 1.0F, 1.0F, false);

		Tasle3_r1 = new ModelRenderer(this);
		Tasle3_r1.setRotationPoint(0.0F, -10.3873F, 8.9096F);
		HEAD.addChild(Tasle3_r1);
		setRotationAngle(Tasle3_r1, 1.7017F, 0.0F, 0.0F);
		Tasle3_r1.setTextureOffset(23, 24).addBox(0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 1.0F, 1.0F, false);

		Tasle4_r1 = new ModelRenderer(this);
		Tasle4_r1.setRotationPoint(0.0F, -7.6852F, 8.6732F);
		HEAD.addChild(Tasle4_r1);
		setRotationAngle(Tasle4_r1, 1.2654F, 0.0F, 0.0F);
		Tasle4_r1.setTextureOffset(22, 23).addBox(0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 1.0F, 1.0F, false);

		Tasle5_r1 = new ModelRenderer(this);
		Tasle5_r1.setRotationPoint(0.0F, -6.0514F, 8.806F);
		HEAD.addChild(Tasle5_r1);
		setRotationAngle(Tasle5_r1, 2.3562F, 0.0F, 0.0F);
		Tasle5_r1.setTextureOffset(23, 25).addBox(0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, false);

		BottomFaceguardBar_r1 = new ModelRenderer(this);
		BottomFaceguardBar_r1.setRotationPoint(0.0F, -1.631F, -4.6129F);
		HEAD.addChild(BottomFaceguardBar_r1);
		setRotationAngle(BottomFaceguardBar_r1, -0.0175F, 0.0F, 0.0F);
		BottomFaceguardBar_r1.setTextureOffset(6, 54).addBox(-4.0F, 0.5F, 0.5F, 8.0F, -1.0F, -1.0F, 1.0F, false);

		TopFaceguardBar_r1 = new ModelRenderer(this);
		TopFaceguardBar_r1.setRotationPoint(0.0F, -6.1413F, -4.8944F);
		HEAD.addChild(TopFaceguardBar_r1);
		setRotationAngle(TopFaceguardBar_r1, -0.5934F, 0.0F, 0.0F);
		TopFaceguardBar_r1.setTextureOffset(6, 54).addBox(-4.0F, 0.5F, 0.5F, 8.0F, -1.0F, -1.0F, 1.0F, false);

		BODY = new ModelRenderer(this);
		BODY.setRotationPoint(0.0F, 0.0F, 0.0F);
		BODY.setTextureOffset(9, 8).addBox(-3.5F, 8.5F, -1.35F, 7.0F, 3.0F, -1.0F, 1.01F, false);
		BODY.setTextureOffset(9, 7).addBox(-3.5F, 0.5F, -2.0F, 7.0F, 4.0F, -1.0F, 1.01F, false);
		BODY.setTextureOffset(9, 8).addBox(-3.5F, 3.9F, -1.5F, 7.0F, 4.0F, -1.0F, 1.01F, false);
		BODY.setTextureOffset(6, 4).addBox(-4.0F, 0.6F, -1.4F, 8.0F, 5.0F, 3.0F, 1.01F, false);
		BODY.setTextureOffset(7, 6).addBox(-3.5F, 7.6F, -0.6F, 7.0F, 3.0F, 2.0F, 1.01F, false);
		BODY.setTextureOffset(2, 48).addBox(-4.0F, 12.65F, -1.5F, 8.0F, -1.0F, 3.0F, 1.01F, false);

		RIGHTARM = new ModelRenderer(this);
		RIGHTARM.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RIGHTARM.setTextureOffset(2, 16).addBox(-3.0F, -1.3F, -2.0F, 4.0F, 2.0F, 4.0F, 1.0F, false);

		LEFTARM = new ModelRenderer(this);
		LEFTARM.setRotationPoint(5.0F, 2.0F, 0.0F);
		LEFTARM.setTextureOffset(2, 16).addBox(-1.0F, -1.3F, -2.0F, 4.0F, 2.0F, 4.0F, 1.0F, false);

		RIGHTLEG = new ModelRenderer(this);
		RIGHTLEG.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RIGHTLEG.setTextureOffset(10, 2).addBox(-1.5F, 0.9F, -0.65F, 3.0F, 9.0F, 2.0F, 1.0F, false);
		RIGHTLEG.setTextureOffset(11, 4).addBox(-1.5F, 0.9F, -1.35F, 3.0F, 9.0F, -1.0F, 1.0F, false);
		RIGHTLEG.setTextureOffset(4, 19).addBox(-1.55F, 5.0F, -1.5F, 1.0F, 0.0F, 3.0F, 1.0F, false);
		RIGHTLEG.setTextureOffset(5, 19).addBox(0.55F, 5.0F, -1.5F, 1.0F, 0.0F, 3.0F, 1.0F, false);

		LEFTLEG = new ModelRenderer(this);
		LEFTLEG.setRotationPoint(1.9F, 12.0F, 0.0F);
		LEFTLEG.setTextureOffset(13, 2).addBox(-1.55F, 0.9F, -0.65F, 3.0F, 9.0F, 2.0F, 1.0F, false);
		LEFTLEG.setTextureOffset(16, 4).addBox(-1.55F, 0.9F, -1.35F, 3.0F, 9.0F, -1.0F, 1.0F, false);
		LEFTLEG.setTextureOffset(8, 18).addBox(0.55F, 5.0F, -1.5F, 1.0F, 0.0F, 3.0F, 1.0F, false);
		LEFTLEG.setTextureOffset(8, 18).addBox(-1.65F, 5.0F, -1.5F, 1.0F, 0.0F, 3.0F, 1.0F, false);

		RIGHTFOOT = new ModelRenderer(this);
		RIGHTFOOT.setRotationPoint(0.0F, 24.0F, 0.0F);
		RIGHTFOOT.setTextureOffset(2, 42).addBox(-3.9F, -1.4F, -1.5F, 4.0F, 1.0F, 3.0F, 1.0F, false);
		RIGHTFOOT.setTextureOffset(3, 42).addBox(-3.4F, -1.4F, -3.0F, 3.0F, 1.0F, 3.0F, 1.0F, false);

		LEFTFOOT = new ModelRenderer(this);
		LEFTFOOT.setRotationPoint(0.0F, 24.0F, 0.0F);
		LEFTFOOT.setTextureOffset(2, 42).addBox(-0.15F, -1.4F, -1.5F, 4.0F, 1.0F, 3.0F, 1.0F, false);
		LEFTFOOT.setTextureOffset(3, 42).addBox(0.35F, -1.4F, -3.0F, 3.0F, 1.0F, 3.0F, 1.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
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

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}