package net.client.model.renderer.armor;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;

public class VeracsArmorModel extends RunecraftArmorModel{

    private final ModelPart HEAD;
    private final ModelPart LeftHelmetHorn3_r1;
    private final ModelPart RightHelmetHorn3_r1;
    private final ModelPart LeftHelmetFaceGuard2_r1;
    private final ModelPart LeftHelmetFaceGuard1_r1;
    private final ModelPart RightHelmetFaceGuard2_r1;
    private final ModelPart TasleMount2_r1;
    private final ModelPart Tasle1_r1;
    private final ModelPart Tasle3_r1;
    private final ModelPart Tasle4_r1;
    private final ModelPart Tasle5_r1;
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
    private final ModelPart RightLeg3_r1;
    private final ModelPart RightLeg1_r1;
    private final ModelPart LEFTLEG;
    private final ModelPart LeftLeg3_r1;
    private final ModelPart LeftLeg1_r1;
    private final ModelPart RIGHTFOOT;
    private final ModelPart RightBoot6_r1;
    private final ModelPart RightBoot5_r1;
    private final ModelPart RightBoot3_r1;
    private final ModelPart LEFTFOOT;
    private final ModelPart LeftBoot6_r1;
    private final ModelPart LeftBoot5_r1;
    private final ModelPart LeftBoot3_r1;

    public VeracsArmorModel(EquipmentSlot slot) {
        super(slot);

        textureWidth = 64;
        textureHeight = 64;

        HEAD = new ModelPart(this);
        HEAD.setPivot(0.0F, 0.0F, 0.0F);
        HEAD.setTextureOffset(4, 50).addCuboid(-3.0F, -5.5F, -3.7F, 6.0F, 3.0F, -2.0F, 1.0F, false);
        HEAD.setTextureOffset(13, 54).addCuboid(-3.0F, -5.0F, -4.0F, -1.0F, 2.0F, -1.0F, 1.0F, false);
        HEAD.setTextureOffset(13, 54).addCuboid(-0.75F, -5.0F, -4.0F, -1.0F, 2.0F, -1.0F, 1.0F, false);
        HEAD.setTextureOffset(13, 54).addCuboid(1.75F, -5.0F, -4.0F, -1.0F, 2.0F, -1.0F, 1.0F, false);
        HEAD.setTextureOffset(13, 54).addCuboid(4.0F, -5.0F, -4.0F, -1.0F, 2.0F, -1.0F, 1.0F, false);
        HEAD.setTextureOffset(12, 9).addCuboid(-3.5F, -7.0F, -3.6F, 7.0F, 6.0F, 0.0F, 1.0F, false);
        HEAD.setTextureOffset(13, 54).addCuboid(0.0F, -10.9397F, 7.2096F, 0.0F, -1.0F, 1.0F, 1.0F, false);
        HEAD.setTextureOffset(10, 34).addCuboid(-0.5F, -8.0F, -0.75F, 1.0F, -1.0F, 4.0F, 1.0F, false);
        HEAD.setTextureOffset(10, 34).addCuboid(-0.5F, -8.25F, 4.25F, 1.0F, 0.0F, 0.0F, 1.0F, false);
        HEAD.setTextureOffset(6, 10).addCuboid(-3.5F, 0.25F, -3.5F, 7.0F, -1.0F, 7.0F, 1.0F, false);
        HEAD.setTextureOffset(10, 13).addCuboid(-2.5F, -7.75F, -1.75F, 5.0F, -1.0F, 4.0F, 1.0F, false);
        HEAD.setTextureOffset(7, 10).addCuboid(-3.0F, -7.5F, -2.75F, 6.0F, -1.0F, 6.0F, 1.0F, false);
        HEAD.setTextureOffset(6, 10).addCuboid(-3.5F, -7.25F, -3.5F, 7.0F, -1.0F, 7.0F, 1.0F, false);
        HEAD.setTextureOffset(12, 11).addCuboid(-3.5F, -7.0F, 4.6F, 7.0F, 6.0F, -1.0F, 1.0F, false);
        HEAD.setTextureOffset(13, 6).addCuboid(-3.55F, -7.0F, -3.5F, -1.0F, 6.0F, 7.0F, 1.0F, false);
        HEAD.setTextureOffset(12, 6).addCuboid(4.55F, -7.0F, -3.5F, -1.0F, 6.0F, 7.0F, 1.0F, false);

        LeftHelmetHorn3_r1 = new ModelPart(this);
        LeftHelmetHorn3_r1.setPivot(3.3F, -9.9667F, -3.1F);
        HEAD.addChild(LeftHelmetHorn3_r1);
        setRotationAngle(LeftHelmetHorn3_r1, 0.0F, 0.7854F, 0.2618F);
        LeftHelmetHorn3_r1.setTextureOffset(15, 36).addCuboid(-0.5F, -1.1333F, -0.5F, 1.0F, 1.0F, 1.0F, -0.1F, false);
        LeftHelmetHorn3_r1.setTextureOffset(15, 36).addCuboid(-0.5F, -0.2333F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        LeftHelmetHorn3_r1.setTextureOffset(15, 36).addCuboid(-0.5F, 0.7667F, -0.5F, 1.0F, 1.0F, 1.0F, 0.1F, false);

        RightHelmetHorn3_r1 = new ModelPart(this);
        RightHelmetHorn3_r1.setPivot(-3.3F, -9.9667F, -3.1F);
        HEAD.addChild(RightHelmetHorn3_r1);
        setRotationAngle(RightHelmetHorn3_r1, 0.0F, -0.7854F, -0.2618F);
        RightHelmetHorn3_r1.setTextureOffset(15, 36).addCuboid(-0.5F, -1.1333F, -0.5F, 1.0F, 1.0F, 1.0F, -0.1F, true);
        RightHelmetHorn3_r1.setTextureOffset(15, 36).addCuboid(-0.5F, -0.2333F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        RightHelmetHorn3_r1.setTextureOffset(15, 36).addCuboid(-0.5F, 0.7667F, -0.5F, 1.0F, 1.0F, 1.0F, 0.1F, true);

        LeftHelmetFaceGuard2_r1 = new ModelPart(this);
        LeftHelmetFaceGuard2_r1.setPivot(4.5F, -4.1315F, -2.0395F);
        HEAD.addChild(LeftHelmetFaceGuard2_r1);
        setRotationAngle(LeftHelmetFaceGuard2_r1, -0.6109F, 0.0F, 0.0F);
        LeftHelmetFaceGuard2_r1.setTextureOffset(14, 51).addCuboid(0.5F, 0.5F, -2.0F, -1.0F, -1.0F, 5.0F, 1.0F, false);

        LeftHelmetFaceGuard1_r1 = new ModelPart(this);
        LeftHelmetFaceGuard1_r1.setPivot(4.5F, -1.5874F, -2.1133F);
        HEAD.addChild(LeftHelmetFaceGuard1_r1);
        setRotationAngle(LeftHelmetFaceGuard1_r1, -0.0175F, 0.0F, 0.0F);
        LeftHelmetFaceGuard1_r1.setTextureOffset(16, 53).addCuboid(0.5F, 0.5F, -1.0F, -1.0F, -1.0F, 3.0F, 1.0F, false);
        LeftHelmetFaceGuard1_r1.setTextureOffset(9, 53).addCuboid(-8.5F, 0.5F, -1.0F, -1.0F, -1.0F, 3.0F, 1.0F, false);

        RightHelmetFaceGuard2_r1 = new ModelPart(this);
        RightHelmetFaceGuard2_r1.setPivot(-4.5F, -4.1315F, -2.0395F);
        HEAD.addChild(RightHelmetFaceGuard2_r1);
        setRotationAngle(RightHelmetFaceGuard2_r1, -0.6109F, 0.0F, 0.0F);
        RightHelmetFaceGuard2_r1.setTextureOffset(14, 51).addCuboid(0.5F, 0.5F, -2.0F, -1.0F, -1.0F, 5.0F, 1.0F, false);

        TasleMount2_r1 = new ModelPart(this);
        TasleMount2_r1.setPivot(0.0F, -9.0167F, 5.1865F);
        HEAD.addChild(TasleMount2_r1);
        setRotationAngle(TasleMount2_r1, 0.5236F, 0.0F, 0.0F);
        TasleMount2_r1.setTextureOffset(10, 34).addCuboid(-0.5F, 0.5F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, false);

        Tasle1_r1 = new ModelPart(this);
        Tasle1_r1.setPivot(0.0F, -10.3626F, 6.0975F);
        HEAD.addChild(Tasle1_r1);
        setRotationAngle(Tasle1_r1, 1.1781F, 0.0F, 0.0F);
        Tasle1_r1.setTextureOffset(13, 54).addCuboid(0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 1.0F, 1.0F, false);

        Tasle3_r1 = new ModelPart(this);
        Tasle3_r1.setPivot(0.0F, -10.3873F, 8.9096F);
        HEAD.addChild(Tasle3_r1);
        setRotationAngle(Tasle3_r1, 1.7017F, 0.0F, 0.0F);
        Tasle3_r1.setTextureOffset(13, 54).addCuboid(0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 1.0F, 1.0F, false);

        Tasle4_r1 = new ModelPart(this);
        Tasle4_r1.setPivot(0.0F, -7.6852F, 8.6732F);
        HEAD.addChild(Tasle4_r1);
        setRotationAngle(Tasle4_r1, 1.2654F, 0.0F, 0.0F);
        Tasle4_r1.setTextureOffset(13, 54).addCuboid(0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 1.0F, 1.0F, false);

        Tasle5_r1 = new ModelPart(this);
        Tasle5_r1.setPivot(0.0F, -6.0514F, 8.806F);
        HEAD.addChild(Tasle5_r1);
        setRotationAngle(Tasle5_r1, 2.3562F, 0.0F, 0.0F);
        Tasle5_r1.setTextureOffset(13, 54).addCuboid(0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, false);

        BottomFaceguardBar_r1 = new ModelPart(this);
        BottomFaceguardBar_r1.setPivot(0.0F, -1.631F, -4.6129F);
        HEAD.addChild(BottomFaceguardBar_r1);
        setRotationAngle(BottomFaceguardBar_r1, -0.0175F, 0.0F, 0.0F);
        BottomFaceguardBar_r1.setTextureOffset(6, 55).addCuboid(-4.0F, 0.5F, 0.5F, 8.0F, -1.0F, -1.0F, 1.0F, false);

        TopFaceguardBar_r1 = new ModelPart(this);
        TopFaceguardBar_r1.setPivot(0.0F, -6.1413F, -4.8944F);
        HEAD.addChild(TopFaceguardBar_r1);
        setRotationAngle(TopFaceguardBar_r1, -0.5934F, 0.0F, 0.0F);
        TopFaceguardBar_r1.setTextureOffset(6, 55).addCuboid(-4.0F, 0.5F, 0.5F, 8.0F, -1.0F, -1.0F, 1.0F, false);

        BODY = new ModelPart(this);
        BODY.setPivot(0.0F, 0.0F, 0.0F);
        BODY.setTextureOffset(13, 34).addCuboid(3.7459F, 2.9548F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
        BODY.setTextureOffset(13, 34).addCuboid(0.7459F, 2.9548F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        BODY.setTextureOffset(13, 34).addCuboid(-4.45F, 0.25F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
        BODY.setTextureOffset(13, 34).addCuboid(0.7459F, 2.9548F, 1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        BODY.setTextureOffset(31, 46).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 11.0F, 4.0F, 0.1F, false);
        BODY.setTextureOffset(3, 53).addCuboid(-3.5F, 12.05F, -1.5F, 7.0F, -1.0F, 3.0F, 1.0F, false);

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
        RIGHTARM.setTextureOffset(36, 47).addCuboid(-3.0F, -2.3F, -2.0F, 4.0F, 11.0F, 4.0F, 0.1F, false);
        RIGHTARM.setTextureOffset(6, 32).addCuboid(-3.0541F, 8.9048F, -2.0F, 4.0F, 1.0F, 4.0F, 0.1F, false);
        RIGHTARM.setTextureOffset(6, 32).addCuboid(-3.0541F, 8.6548F, -2.0F, 4.0F, 2.0F, 4.0F, -0.3F, false);

        LEFTARM = new ModelPart(this);
        LEFTARM.setPivot(5.0F, 2.0F, 0.0F);
        LEFTARM.setTextureOffset(8, 33).addCuboid(-1.0F, -1.3F, -2.0F, 4.0F, 2.0F, 4.0F, 1.3F, true);
        LEFTARM.setTextureOffset(9, 34).addCuboid(0.25F, -7.6F, -2.75F, 1.0F, 1.0F, 5.0F, 0.0F, false);
        LEFTARM.setTextureOffset(8, 31).addCuboid(0.25F, -6.6F, -3.75F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        LEFTARM.setTextureOffset(6, 28).addCuboid(0.25F, -5.6F, -4.75F, 1.0F, 6.0F, 9.0F, 0.0F, false);
        LEFTARM.setTextureOffset(7, 32).addCuboid(0.25F, 0.4F, -3.75F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        LEFTARM.setTextureOffset(9, 9).addCuboid(-0.9959F, 6.2048F, -2.55F, 4.0F, 3.0F, 5.0F, 0.2F, true);
        LEFTARM.setTextureOffset(8, 9).addCuboid(-0.9959F, 1.9548F, -2.6F, 4.0F, 3.0F, 5.0F, 0.2F, true);
        LEFTARM.setTextureOffset(7, 33).addCuboid(-0.9459F, 5.1548F, -2.0F, 4.0F, 1.0F, 4.0F, 0.1F, true);
        LEFTARM.setTextureOffset(6, 32).addCuboid(-0.9459F, 8.6548F, -2.0F, 4.0F, 2.0F, 4.0F, -0.3F, true);
        LEFTARM.setTextureOffset(6, 32).addCuboid(-0.9459F, 8.9048F, -2.0F, 4.0F, 1.0F, 4.0F, 0.1F, true);

        RIGHTLEG = new ModelPart(this);
        RIGHTLEG.setPivot(-1.9F, 12.0F, 0.0F);
        RIGHTLEG.setTextureOffset(10, 34).addCuboid(-1.55F, 1.5F, -1.05F, 3.0F, 4.0F, 2.0F, 1.2F, true);
        RIGHTLEG.setTextureOffset(35, 46).addCuboid(-2.0F, 1.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.1F, false);
        RIGHTLEG.setTextureOffset(7, 53).addCuboid(-1.6F, 0.75F, -1.5F, 3.0F, -1.0F, 3.0F, 0.8F, true);

        RightLeg3_r1 = new ModelPart(this);
        RightLeg3_r1.setPivot(-2.0388F, 5.0397F, -0.25F);
        RIGHTLEG.addChild(RightLeg3_r1);
        setRotationAngle(RightLeg3_r1, 0.0F, 0.0F, -0.3927F);
        RightLeg3_r1.setTextureOffset(10, 34).addCuboid(-0.1F, 0.1F, -0.8F, 0.0F, 0.0F, 2.0F, 1.1F, true);

        RightLeg1_r1 = new ModelPart(this);
        RightLeg1_r1.setPivot(-2.0497F, 2.7235F, -0.25F);
        RIGHTLEG.addChild(RightLeg1_r1);
        setRotationAngle(RightLeg1_r1, 0.0F, 0.0F, 0.192F);
        RightLeg1_r1.setTextureOffset(10, 34).addCuboid(0.0F, -1.0F, -0.8F, 0.0F, 2.0F, 2.0F, 1.1F, true);

        LEFTLEG = new ModelPart(this);
        LEFTLEG.setPivot(1.9F, 12.0F, 0.0F);
        LEFTLEG.setTextureOffset(10, 34).addCuboid(-1.45F, 1.5F, -1.05F, 3.0F, 4.0F, 2.0F, 1.2F, false);
        LEFTLEG.setTextureOffset(35, 46).addCuboid(-2.0F, 1.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.1F, false);
        LEFTLEG.setTextureOffset(7, 53).addCuboid(-1.4F, 0.75F, -1.5F, 3.0F, -1.0F, 3.0F, 0.8F, false);

        LeftLeg3_r1 = new ModelPart(this);
        LeftLeg3_r1.setPivot(2.0388F, 5.0397F, -0.25F);
        LEFTLEG.addChild(LeftLeg3_r1);
        setRotationAngle(LeftLeg3_r1, 0.0F, 0.0F, 0.3927F);
        LeftLeg3_r1.setTextureOffset(10, 34).addCuboid(0.1F, 0.1F, -0.8F, 0.0F, 0.0F, 2.0F, 1.1F, false);

        LeftLeg1_r1 = new ModelPart(this);
        LeftLeg1_r1.setPivot(2.0497F, 2.7235F, -0.25F);
        LEFTLEG.addChild(LeftLeg1_r1);
        setRotationAngle(LeftLeg1_r1, 0.0F, 0.0F, -0.192F);
        LeftLeg1_r1.setTextureOffset(10, 34).addCuboid(0.0F, -1.0F, -0.8F, 0.0F, 2.0F, 2.0F, 1.1F, false);

        RIGHTFOOT = new ModelPart(this);
        RIGHTFOOT.setPivot(-1.9F, 12.0F, 0.0F);
        RIGHTFOOT.setTextureOffset(4, 57).addCuboid(-1.5F, 10.2F, -1.5F, 3.0F, 1.0F, 3.0F, 1.0F, true);
        RIGHTFOOT.setTextureOffset(6, 60).addCuboid(-1.0F, 11.3F, -3.15F, 2.0F, 0.0F, 0.0F, 0.9F, true);
        RIGHTFOOT.setTextureOffset(4, 58).addCuboid(-1.5F, 10.2F, -1.5F, 3.0F, -2.0F, 3.0F, 1.2F, true);

        RightBoot6_r1 = new ModelPart(this);
        RightBoot6_r1.setPivot(-8.7017F, 11.2F, 0.2364F);
        RIGHTFOOT.addChild(RightBoot6_r1);
        setRotationAngle(RightBoot6_r1, 0.0F, 0.3054F, 0.0F);
        RightBoot6_r1.setTextureOffset(10, 59).addCuboid(11.5F, 0.1F, 0.0F, -1.0F, 0.0F, 0.0F, 0.9F, true);

        RightBoot5_r1 = new ModelPart(this);
        RightBoot5_r1.setPivot(-1.7891F, 11.2F, -3.0714F);
        RIGHTFOOT.addChild(RightBoot5_r1);
        setRotationAngle(RightBoot5_r1, 0.0F, -0.3054F, 0.0F);
        RightBoot5_r1.setTextureOffset(10, 59).addCuboid(0.5F, 0.1F, 0.0F, -1.0F, 0.0F, 0.0F, 0.9F, true);

        RightBoot3_r1 = new ModelPart(this);
        RightBoot3_r1.setPivot(0.5F, 11.1815F, -2.9549F);
        RIGHTFOOT.addChild(RightBoot3_r1);
        setRotationAngle(RightBoot3_r1, -1.3526F, 0.0F, 0.0F);
        RightBoot3_r1.setTextureOffset(10, 54).addCuboid(-1.5F, 0.1F, -0.2F, 2.0F, 0.0F, 0.0F, 0.8F, true);

        LEFTFOOT = new ModelPart(this);
        LEFTFOOT.setPivot(1.9F, 12.0F, 0.0F);
        LEFTFOOT.setTextureOffset(4, 57).addCuboid(-1.5F, 10.2F, -1.5F, 3.0F, 1.0F, 3.0F, 1.0F, false);
        LEFTFOOT.setTextureOffset(7, 60).addCuboid(-1.0F, 11.3F, -3.15F, 2.0F, 0.0F, 0.0F, 0.9F, false);
        LEFTFOOT.setTextureOffset(4, 58).addCuboid(-1.5F, 10.2F, -1.5F, 3.0F, -2.0F, 3.0F, 1.2F, false);

        LeftBoot6_r1 = new ModelPart(this);
        LeftBoot6_r1.setPivot(8.7017F, 11.3F, 0.2364F);
        LEFTFOOT.addChild(LeftBoot6_r1);
        setRotationAngle(LeftBoot6_r1, 0.0F, -0.3054F, 0.0F);
        LeftBoot6_r1.setTextureOffset(9, 59).addCuboid(-10.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.9F, false);

        LeftBoot5_r1 = new ModelPart(this);
        LeftBoot5_r1.setPivot(1.7891F, 11.3F, -3.0714F);
        LEFTFOOT.addChild(LeftBoot5_r1);
        setRotationAngle(LeftBoot5_r1, 0.0F, 0.3054F, 0.0F);
        LeftBoot5_r1.setTextureOffset(9, 59).addCuboid(0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.9F, false);

        LeftBoot3_r1 = new ModelPart(this);
        LeftBoot3_r1.setPivot(-0.5F, 11.1815F, -2.9549F);
        LEFTFOOT.addChild(LeftBoot3_r1);
        setRotationAngle(LeftBoot3_r1, -1.3526F, 0.0F, 0.0F);
        LeftBoot3_r1.setTextureOffset(11, 54).addCuboid(-0.5F, 0.1F, -0.2F, 2.0F, 0.0F, 0.0F, 0.8F, false);

    }

    @Override
    public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {

        HEAD.visible = slot == EquipmentSlot.HEAD;
        BODY.visible = slot == EquipmentSlot.CHEST;
        RIGHTARM.visible = slot == EquipmentSlot.CHEST;
        LEFTARM.visible = slot == EquipmentSlot.CHEST;
        RIGHTLEG.visible = slot == EquipmentSlot.LEGS;
        LEFTLEG.visible = slot == EquipmentSlot.LEGS;
        LEFTFOOT.visible = slot == EquipmentSlot.FEET;
        RIGHTFOOT.visible = slot == EquipmentSlot.FEET;
        hat.visible = false;

        head = HEAD;
        body = BODY;
        rightArm = RIGHTARM;
        leftArm = LEFTARM;
        if (slot == EquipmentSlot.LEGS) {
            rightLeg = RIGHTLEG;
            leftLeg = LEFTLEG;
        } else {
            rightLeg = RIGHTFOOT;
            leftLeg = LEFTFOOT;
        }

        super.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);

//		HEAD.visible = slot == EquipmentSlot.HEAD;
//		BODY.visible = slot == EquipmentSlot.CHEST;
//		LEFTARM.visible = slot == EquipmentSlot.CHEST;
//		RIGHTARM.visible = slot == EquipmentSlot.CHEST;
//		LEFTLEG.visible = slot == EquipmentSlot.LEGS;
//		RIGHTLEG.visible = slot == EquipmentSlot.LEGS;
//		LEFTFOOT.visible = slot == EquipmentSlot.FEET;
//		RIGHTFOOT.visible = slot == EquipmentSlot.FEET;
//
//		head = HEAD;
//		body = BODY;
//		leftArm = LEFTARM;
//		rightArm = RIGHTARM;
//		if (slot == EquipmentSlot.LEGS) {
//			//bipedBody = pantsAnchor;
//			leftLeg = LEFTLEG;
//			rightLeg = RIGHTLEG;
//		} else {
//			leftLeg = LEFTFOOT;
//			rightLeg = RIGHTFOOT;
//		}
//
//		HEAD.render(matrixStack, buffer, packedLight, packedOverlay);
//		BODY.render(matrixStack, buffer, packedLight, packedOverlay);
//		RIGHTARM.render(matrixStack, buffer, packedLight, packedOverlay);
//		LEFTARM.render(matrixStack, buffer, packedLight, packedOverlay);
//		RIGHTLEG.render(matrixStack, buffer, packedLight, packedOverlay);
//		LEFTLEG.render(matrixStack, buffer, packedLight, packedOverlay);
//		LEFTFOOT.render(matrixStack, buffer, packedLight, packedOverlay);
//		RIGHTFOOT.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelPart bone, float x, float y, float z) {
        bone.pitch = x;
        bone.yaw = y;
        bone.roll = z;
    }
}
