// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports

	package com.example.mod;

	public class kite_shield extends EntityModel<Entity> {
private final ModelPart Shield;
	private final ModelPart Shield_r1;
	private final ModelPart Shield_r2;
	private final ModelPart ShieldFrame_r1;
	private final ModelPart ShieldFrame_r2;
	private final ModelPart bone2;
	private final ModelPart bone3;
public kite_shield() {
		textureWidth = 16;
		textureHeight = 16;
		Shield = new ModelPart(this);
		Shield.setPivot(0.0F, 24.0F, 0.0F);
		Shield.setTextureOffset(60, 62).addCuboid(-11.4692F, -9.3776F, 6.7475F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Shield.setTextureOffset(60, 62).addCuboid(-11.4692F, -9.3776F, 6.7475F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Shield.setTextureOffset(60, 62).addCuboid(-9.0119F, -9.5053F, 1.3573F, 1.0F, 1.0F, 15.0F, 0.0F, false);

		Shield_r1 = new ModelPart(this);
		Shield_r1.setPivot(-9.1941F, -8.8805F, 7.8415F);
		Shield.addChild(Shield_r1);
		setRotationAngle(Shield_r1, 0.0F, 0.0F, 0.3927F);
		Shield_r1.setTextureOffset(60, 62).addCuboid(0.6326F, -0.2602F, -6.109F, 1.0F, 2.0F, 13.0F, 0.0F, false);
		Shield_r1.setTextureOffset(60, 62).addCuboid(0.6326F, 2.1898F, -7.209F, 1.0F, 2.0F, 13.0F, 0.0F, false);
		Shield_r1.setTextureOffset(60, 62).addCuboid(0.7326F, -0.1102F, 0.191F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		Shield_r1.setTextureOffset(60, 62).addCuboid(0.5326F, 4.5398F, -8.209F, 1.0F, 1.0F, 14.0F, 0.0F, false);

		Shield_r2 = new ModelPart(this);
		Shield_r2.setPivot(-9.1941F, -8.8805F, 7.8415F);
		Shield.addChild(Shield_r2);
		setRotationAngle(Shield_r2, 0.0F, 0.0F, -0.3927F);
		Shield_r2.setTextureOffset(60, 62).addCuboid(0.6304F, -2.1344F, -6.209F, 1.0F, 2.0F, 13.0F, 0.0F, false);
		Shield_r2.setTextureOffset(60, 62).addCuboid(0.6304F, -4.5344F, -7.209F, 1.0F, 2.0F, 13.0F, 0.0F, false);
		Shield_r2.setTextureOffset(60, 62).addCuboid(0.7304F, -4.5344F, 0.191F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		Shield_r2.setTextureOffset(74, 62).addCuboid(0.5304F, -5.4344F, -8.209F, 1.0F, 0.0F, 14.0F, 0.0F, true);

		ShieldFrame_r1 = new ModelPart(this);
		ShieldFrame_r1.setPivot(-9.1941F, -8.8805F, 7.8415F);
		Shield.addChild(ShieldFrame_r1);
		setRotationAngle(ShieldFrame_r1, -0.3927F, 0.0F, 0.3927F);
		ShieldFrame_r1.setTextureOffset(60, 62).addCuboid(0.5326F, -3.4128F, 6.7473F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		ShieldFrame_r1.setTextureOffset(60, 62).addCuboid(0.5326F, 1.3357F, -5.8469F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		ShieldFrame_r2 = new ModelPart(this);
		ShieldFrame_r2.setPivot(-9.1941F, -8.8805F, 7.8415F);
		Shield.addChild(ShieldFrame_r2);
		setRotationAngle(ShieldFrame_r2, 0.3927F, 0.0F, -0.3927F);
		ShieldFrame_r2.setTextureOffset(60, 62).addCuboid(0.5304F, -2.6515F, 6.7994F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		ShieldFrame_r2.setTextureOffset(60, 62).addCuboid(0.5304F, -7.3307F, -5.8489F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone2 = new ModelPart(this);
		bone2.setPivot(0.0F, 0.0F, 0.0F);
		Shield.addChild(bone2);
		

		bone3 = new ModelPart(this);
		bone3.setPivot(0.0F, 0.0F, 0.0F);
		Shield.addChild(bone3);
		
}
@Override
public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
}
@Override
public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		Shield.render(matrixStack, buffer, packedLight, packedOverlay);
}
public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
}

	}