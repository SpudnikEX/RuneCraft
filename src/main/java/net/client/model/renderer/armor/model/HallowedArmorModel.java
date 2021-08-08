package net.client.model.renderer.armor.model;

import net.client.model.renderer.armor.RunecraftArmorModel;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;

public class HallowedArmorModel extends RunecraftArmorModel {
    private final ModelPart HEAD;
    private final ModelPart RightWing_r1;
    private final ModelPart LeftWing_r1;
    private final ModelPart BODY;
    private final ModelPart RIGHTARM;
    private final ModelPart LEFTARM;
    private final ModelPart RIGHTLEG;
    private final ModelPart LEFTLEG;

    private final ModelPart FEET;


    public HallowedArmorModel(EquipmentSlot slot) {
        super(slot);

        textureWidth = 64;
        textureHeight = 64;

        // Head
        HEAD = new ModelPart(this);
        setRotationAngle(HEAD, 0.0F, 0.0F, 0.0F);
        HEAD.setTextureOffset(0, 0).addCuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
        HEAD.setTextureOffset(32, 0).addCuboid(-1.0F, -7.3F, -5.2F, 2.0F, 2.0F, 1.0F, 0.2F, false);

        // Wings
        RightWing_r1 = new ModelPart(this);
        setRotationAngle(RightWing_r1, 0.1745F, 0.2182F, 0.0F);
        RightWing_r1.setTextureOffset(16, 32).addCuboid(5.0F, -6.0F, -2.5F, 1.0F, 3.5F, 6.0F, 0.0F, false);

        LeftWing_r1 = new ModelPart(this);
        setRotationAngle(LeftWing_r1, 0.1745F, -0.2182F, 0.0F);
        LeftWing_r1.setTextureOffset(26, 39).addCuboid(-6.0F, -6.0F, -2.5F, 1.0F, 3.5F, 6.0F, 0.0F, false);

        HEAD.addChild(RightWing_r1);
        HEAD.addChild(LeftWing_r1);

        // Body
        BODY = new ModelPart(this);
        setRotationAngle(BODY,0.0F, 0.0F, 0.0F);
        BODY.setTextureOffset(16, 16).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.9F, false);
        BODY.setTextureOffset(32, 0).addCuboid(-1.0F, 4.0F, -3.6F, 2.0F, 2.0F, 1.0F, 0.4F, false);

        // Arms
        RIGHTARM = new ModelPart(this);
        setRotationAngle(RIGHTARM,-5.0F, 2.0F, 0.0F);
        RIGHTARM.setTextureOffset(40, 32).addCuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.75F, false);

        LEFTARM = new ModelPart(this);
        setRotationAngle(LEFTARM,5.0F, 2.0F, 0.0F);
        LEFTARM.setTextureOffset(40, 16).addCuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.75F, false);

        // Legs
        RIGHTLEG = new ModelPart(this);
        setRotationAngle(RIGHTLEG, -1.9F, 12.0F, 0.0F);
        RIGHTLEG.setTextureOffset(0, 48).addCuboid(-2.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

        LEFTLEG = new ModelPart(this);
        setRotationAngle(LEFTLEG, 1.9F, 12.0F, 0.0F);
        LEFTLEG.setTextureOffset(16, 48).addCuboid(-2.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

        // feet?
        FEET = new ModelPart(this);
        setRotationAngle(FEET, 0,0,0);
        FEET.setTextureOffset(1,0).addCuboid(1,-1,1,12,12,12,false);

    }

    @Override
    public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){

        HEAD.visible = slot == EquipmentSlot.HEAD;
        BODY.visible = slot == EquipmentSlot.CHEST;
        LEFTARM.visible = slot == EquipmentSlot.CHEST;
        RIGHTARM.visible = slot == EquipmentSlot.CHEST;
        LEFTLEG.visible = slot == EquipmentSlot.LEGS;
        RIGHTLEG.visible = slot == EquipmentSlot.LEGS;
        FEET.visible = slot == EquipmentSlot.FEET;

        head = HEAD;
        body = BODY;
        leftArm = LEFTARM;
        rightArm = RIGHTARM;
        if (slot == EquipmentSlot.LEGS) {
            //bipedBody = pantsAnchor;
            leftLeg = LEFTLEG;
            rightLeg = RIGHTLEG;
        } else {
            leftLeg = FEET;
            rightLeg = FEET;
        }

        HEAD.render(matrixStack, buffer, packedLight, packedOverlay);
        BODY.render(matrixStack, buffer, packedLight, packedOverlay);
        RIGHTARM.render(matrixStack, buffer, packedLight, packedOverlay);
        LEFTARM.render(matrixStack, buffer, packedLight, packedOverlay);
        RIGHTLEG.render(matrixStack, buffer, packedLight, packedOverlay);
        LEFTLEG.render(matrixStack, buffer, packedLight, packedOverlay);
        FEET.render(matrixStack, buffer, packedLight, packedOverlay);
    }

}
