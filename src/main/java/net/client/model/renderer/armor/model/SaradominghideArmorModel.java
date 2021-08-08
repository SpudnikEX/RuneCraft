package net.client.model.renderer.armor.model;

import net.client.model.renderer.armor.RunecraftArmorModel;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;

public class SaradominghideArmorModel extends RunecraftArmorModel {

    private final ModelPart HEAD;
    private final ModelPart HeadDiamond_r1;
    private final ModelPart BackCoif_r1;
    private final ModelPart RightCoif_r1;
    private final ModelPart LeftCoif_r1;
    private final ModelPart BODY;
    private final ModelPart SaradominSymbol_r1;
    private final ModelPart SaradominSymbol_r2;
    private final ModelPart SaradominSymbol_r3;
    private final ModelPart SaradominSymbol_r4;
    private final ModelPart SaradominSymbol_r5;
    private final ModelPart SaradominSymbol_r6;
    private final ModelPart SaradominSymbol_r7;
    private final ModelPart SaradominSymbol_r8;
    private final ModelPart ChestDiamond_r1;
    private final ModelPart RIGHTARM;
    private final ModelPart LEFTARM;
    private final ModelPart RIGHTLEG;
    private final ModelPart RightLegKneecap_r1;
    private final ModelPart LEFTLEG;
    private final ModelPart LeftLegKneecap_r1;
    private final ModelPart LeftLegKneecap_r2;
    private final ModelPart RIGHTFOOT;
    private final ModelPart LEFTFOOT;

    public SaradominghideArmorModel(EquipmentSlot slot) {
        super(slot);

        textureWidth = 64;
        textureHeight = 64;

        HEAD = new ModelPart(this);
        HEAD.setPivot(0.0F, 0.0F, 0.0F);
        HEAD.setTextureOffset(3, 8).addCuboid(-4.5F, -8.2F, -4.5F, 9.0F, 1.0F, 9.0F, 0.0F, false);
        HEAD.setTextureOffset(10, 51).addCuboid(-5.0F, -7.95F, -4.9F, 10.0F, 1.0F, 4.0F, -0.2F, false);
        HEAD.setTextureOffset(7, 10).addCuboid(-3.5F, -8.85F, -3.5F, 7.0F, 1.0F, 7.0F, 0.0F, false);
        HEAD.setTextureOffset(10, 10).addCuboid(-2.5F, -9.5F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);

        HeadDiamond_r1 = new ModelPart(this);
        HeadDiamond_r1.setPivot(-0.2121F, 2.9989F, -3.0F);
        HEAD.addChild(HeadDiamond_r1);
        setRotationAngle(HeadDiamond_r1, 0.0F, 0.0F, 0.7854F);
        HeadDiamond_r1.setTextureOffset(26, 55).addCuboid(-7.25F, -7.25F, -0.6F, 0.0F, 0.0F, -2.0F, 1.2F, false);

        BackCoif_r1 = new ModelPart(this);
        BackCoif_r1.setPivot(0.0F, -3.5525F, 4.375F);
        HEAD.addChild(BackCoif_r1);
        setRotationAngle(BackCoif_r1, 0.1309F, 0.0F, 0.0F);
        BackCoif_r1.setTextureOffset(4, 7).addCuboid(-4.5F, -3.6F, -0.4F, 9.0F, 8.0F, 1.0F, 0.0F, false);

        RightCoif_r1 = new ModelPart(this);
        RightCoif_r1.setPivot(-4.422F, -3.8621F, 0.0F);
        HEAD.addChild(RightCoif_r1);
        setRotationAngle(RightCoif_r1, 0.0F, 0.0F, 0.1309F);
        RightCoif_r1.setTextureOffset(4, 7).addCuboid(-0.5F, -3.5F, -1.5F, 1.0F, 8.0F, 6.0F, 0.0F, false);
        RightCoif_r1.setTextureOffset(4, 7).addCuboid(-0.5F, -3.5F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
        RightCoif_r1.setTextureOffset(4, 7).addCuboid(-0.5F, -3.5F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        LeftCoif_r1 = new ModelPart(this);
        LeftCoif_r1.setPivot(4.422F, -3.8621F, 0.0F);
        HEAD.addChild(LeftCoif_r1);
        setRotationAngle(LeftCoif_r1, 0.0F, 0.0F, -0.1309F);
        LeftCoif_r1.setTextureOffset(4, 7).addCuboid(-0.5F, -3.5F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        LeftCoif_r1.setTextureOffset(4, 7).addCuboid(-0.5F, -3.5F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        LeftCoif_r1.setTextureOffset(4, 7).addCuboid(-0.5F, -3.5F, -1.5F, 1.0F, 8.0F, 6.0F, 0.0F, false);

        BODY = new ModelPart(this);
        BODY.setPivot(0.0F, 0.0F, 0.0F);
        BODY.setTextureOffset(2, 11).addCuboid(-3.0F, 9.2F, -1.05F, 6.0F, 2.0F, 2.0F, 1.2F, false);
        BODY.setTextureOffset(2, 14).addCuboid(-3.5F, 0.8F, -1.6F, 7.0F, 7.0F, 3.0F, 1.1F, false);
        BODY.setTextureOffset(3, 3).addCuboid(-3.5F, 0.8F, -1.8F, 7.0F, 4.0F, -1.0F, 1.2F, false);
        BODY.setTextureOffset(40, 40).addCuboid(-0.2121F, 3.6776F, -2.8F, 0.0F, 0.0F, 0.0F, 0.5F, false);
        BODY.setTextureOffset(40, 40).addCuboid(-0.2121F, 4.7776F, -3.1F, 0.0F, 0.0F, 0.0F, 0.2F, false);
        BODY.setTextureOffset(40, 40).addCuboid(-0.2121F, 4.3776F, -3.1F, 0.0F, 0.0F, 0.0F, 0.2F, false);
        BODY.setTextureOffset(40, 40).addCuboid(-0.2121F, 2.9776F, -3.1F, 0.0F, 0.0F, 0.0F, 0.2F, false);
        BODY.setTextureOffset(40, 40).addCuboid(-0.2121F, 2.5776F, -3.1F, 0.0F, 0.0F, 0.0F, 0.2F, false);
        BODY.setTextureOffset(40, 40).addCuboid(-1.3121F, 3.6776F, -3.1F, 0.0F, 0.0F, 0.0F, 0.2F, false);
        BODY.setTextureOffset(40, 40).addCuboid(-0.9121F, 3.6776F, -3.1F, 0.0F, 0.0F, 0.0F, 0.2F, false);
        BODY.setTextureOffset(40, 40).addCuboid(0.8879F, 3.6776F, -3.1F, 0.0F, 0.0F, 0.0F, 0.2F, false);
        BODY.setTextureOffset(40, 40).addCuboid(0.4879F, 3.6776F, -3.1F, 0.0F, 0.0F, 0.0F, 0.2F, false);

        SaradominSymbol_r1 = new ModelPart(this);
        SaradominSymbol_r1.setPivot(-1.7524F, 1.7343F, -2.6F);
        BODY.addChild(SaradominSymbol_r1);
        setRotationAngle(SaradominSymbol_r1, 0.0F, 0.0F, -0.2618F);
        SaradominSymbol_r1.setTextureOffset(38, 41).addCuboid(0.55F, 2.6F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r1.setTextureOffset(38, 41).addCuboid(0.55F, 2.8F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r1.setTextureOffset(38, 41).addCuboid(0.55F, 3.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r1.setTextureOffset(38, 41).addCuboid(0.55F, 3.8F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r1.setTextureOffset(38, 41).addCuboid(0.55F, 3.6F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r1.setTextureOffset(38, 41).addCuboid(0.55F, 3.2F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r1.setTextureOffset(38, 41).addCuboid(0.55F, 3.4F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);

        SaradominSymbol_r2 = new ModelPart(this);
        SaradominSymbol_r2.setPivot(1.135F, 1.6825F, -2.6F);
        BODY.addChild(SaradominSymbol_r2);
        setRotationAngle(SaradominSymbol_r2, 0.0F, 0.0F, 0.2618F);
        SaradominSymbol_r2.setTextureOffset(38, 41).addCuboid(-0.35F, 3.6F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r2.setTextureOffset(38, 41).addCuboid(-0.35F, 3.8F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r2.setTextureOffset(38, 41).addCuboid(-0.35F, 3.2F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r2.setTextureOffset(38, 41).addCuboid(-0.35F, 3.4F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r2.setTextureOffset(38, 41).addCuboid(-0.35F, 2.6F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r2.setTextureOffset(38, 41).addCuboid(-0.35F, 2.8F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r2.setTextureOffset(38, 41).addCuboid(-0.35F, 3.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);

        SaradominSymbol_r3 = new ModelPart(this);
        SaradominSymbol_r3.setPivot(-1.0277F, 2.9163F, -2.6F);
        BODY.addChild(SaradominSymbol_r3);
        setRotationAngle(SaradominSymbol_r3, 0.0F, 0.0F, 0.2618F);
        SaradominSymbol_r3.setTextureOffset(38, 41).addCuboid(0.55F, -1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r3.setTextureOffset(38, 41).addCuboid(0.55F, -0.8F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r3.setTextureOffset(38, 41).addCuboid(0.55F, -0.6F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r3.setTextureOffset(38, 41).addCuboid(0.55F, -0.4F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r3.setTextureOffset(38, 41).addCuboid(0.55F, -0.2F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r3.setTextureOffset(38, 41).addCuboid(0.55F, 0.2F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r3.setTextureOffset(38, 41).addCuboid(0.55F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);

        SaradominSymbol_r4 = new ModelPart(this);
        SaradominSymbol_r4.setPivot(0.4103F, 2.9681F, -2.6F);
        BODY.addChild(SaradominSymbol_r4);
        setRotationAngle(SaradominSymbol_r4, 0.0F, 0.0F, -0.2618F);
        SaradominSymbol_r4.setTextureOffset(38, 41).addCuboid(-0.35F, -1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r4.setTextureOffset(38, 41).addCuboid(-0.35F, -0.8F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r4.setTextureOffset(38, 41).addCuboid(-0.35F, -0.6F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r4.setTextureOffset(38, 41).addCuboid(-0.35F, -0.4F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r4.setTextureOffset(38, 41).addCuboid(-0.35F, -0.2F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r4.setTextureOffset(38, 41).addCuboid(-0.35F, 0.2F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r4.setTextureOffset(38, 41).addCuboid(-0.35F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);

        SaradominSymbol_r5 = new ModelPart(this);
        SaradominSymbol_r5.setPivot(-0.6344F, 44.9617F, -2.6F);
        BODY.addChild(SaradominSymbol_r5);
        setRotationAngle(SaradominSymbol_r5, 0.0F, 0.0F, -0.2618F);
        SaradominSymbol_r5.setTextureOffset(38, 41).addCuboid(10.75F, -40.2F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r5.setTextureOffset(38, 41).addCuboid(10.55F, -40.2F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r5.setTextureOffset(38, 41).addCuboid(10.35F, -40.2F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r5.setTextureOffset(38, 41).addCuboid(9.55F, -40.2F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r5.setTextureOffset(38, 41).addCuboid(9.75F, -40.2F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r5.setTextureOffset(38, 41).addCuboid(9.95F, -40.2F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r5.setTextureOffset(38, 41).addCuboid(10.15F, -40.2F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);

        SaradominSymbol_r6 = new ModelPart(this);
        SaradominSymbol_r6.setPivot(-0.6379F, 2.9776F, -2.6F);
        BODY.addChild(SaradominSymbol_r6);
        setRotationAngle(SaradominSymbol_r6, 0.0F, 0.0F, 0.2618F);
        SaradominSymbol_r6.setTextureOffset(38, 41).addCuboid(-0.95F, 1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r6.setTextureOffset(38, 41).addCuboid(-0.75F, 1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r6.setTextureOffset(38, 41).addCuboid(-0.55F, 1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r6.setTextureOffset(38, 41).addCuboid(-0.35F, 1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r6.setTextureOffset(38, 41).addCuboid(-0.15F, 1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r6.setTextureOffset(38, 41).addCuboid(0.25F, 1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);
        SaradominSymbol_r6.setTextureOffset(38, 41).addCuboid(0.05F, 1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, true);

        SaradominSymbol_r7 = new ModelPart(this);
        SaradominSymbol_r7.setPivot(0.2344F, 44.9617F, -2.6F);
        BODY.addChild(SaradominSymbol_r7);
        setRotationAngle(SaradominSymbol_r7, 0.0F, 0.0F, 0.2618F);
        SaradominSymbol_r7.setTextureOffset(38, 41).addCuboid(-9.55F, -40.2F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r7.setTextureOffset(38, 41).addCuboid(-9.75F, -40.2F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r7.setTextureOffset(38, 41).addCuboid(-9.95F, -40.2F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r7.setTextureOffset(38, 41).addCuboid(-10.15F, -40.2F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r7.setTextureOffset(38, 41).addCuboid(-10.35F, -40.2F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r7.setTextureOffset(38, 41).addCuboid(-10.75F, -40.2F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r7.setTextureOffset(38, 41).addCuboid(-10.55F, -40.2F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);

        SaradominSymbol_r8 = new ModelPart(this);
        SaradominSymbol_r8.setPivot(0.2379F, 2.9776F, -2.6F);
        BODY.addChild(SaradominSymbol_r8);
        setRotationAngle(SaradominSymbol_r8, 0.0F, 0.0F, -0.2618F);
        SaradominSymbol_r8.setTextureOffset(38, 41).addCuboid(0.95F, 1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r8.setTextureOffset(38, 41).addCuboid(0.75F, 1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r8.setTextureOffset(38, 41).addCuboid(0.55F, 1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r8.setTextureOffset(38, 41).addCuboid(0.35F, 1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r8.setTextureOffset(38, 41).addCuboid(-0.25F, 1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r8.setTextureOffset(38, 41).addCuboid(0.15F, 1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);
        SaradominSymbol_r8.setTextureOffset(38, 41).addCuboid(-0.05F, 1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.1F, false);

        ChestDiamond_r1 = new ModelPart(this);
        ChestDiamond_r1.setPivot(-0.2121F, 2.9989F, -3.0F);
        BODY.addChild(ChestDiamond_r1);
        setRotationAngle(ChestDiamond_r1, 0.0F, 0.0F, 0.7854F);
        ChestDiamond_r1.setTextureOffset(26, 9).addCuboid(0.0F, 0.0F, 1.3F, 1.0F, 1.0F, -1.0F, 1.5F, false);
        ChestDiamond_r1.setTextureOffset(24, 54).addCuboid(0.0F, 0.0F, 1.5F, 1.0F, 1.0F, -1.0F, 1.6F, false);

        RIGHTARM = new ModelPart(this);
        RIGHTARM.setPivot(-5.0F, 2.0F, 0.0F);
        RIGHTARM.setTextureOffset(22, 9).addCuboid(-2.5F, -1.3F, -2.0F, 3.0F, 2.0F, 4.0F, 0.8F, true);
        RIGHTARM.setTextureOffset(17, 51).addCuboid(-2.5F, -2.3F, -2.0F, 5.0F, 0.0F, 4.0F, 0.2F, true);

        LEFTARM = new ModelPart(this);
        LEFTARM.setPivot(5.0F, 2.0F, 0.0F);
        LEFTARM.setTextureOffset(20, 11).addCuboid(-0.5F, -1.3F, -2.0F, 3.0F, 2.0F, 4.0F, 0.8F, false);
        LEFTARM.setTextureOffset(18, 51).addCuboid(-2.5F, -2.3F, -2.0F, 5.0F, 0.0F, 4.0F, 0.2F, false);

        RIGHTLEG = new ModelPart(this);
        RIGHTLEG.setPivot(-1.9F, 12.0F, 0.0F);
        RIGHTLEG.setTextureOffset(15, 52).addCuboid(-2.1F, 0.45F, -1.5F, 4.0F, -1.0F, 3.0F, 1.01F, true);
        RIGHTLEG.setTextureOffset(22, 5).addCuboid(-2.0F, 0.55F, -2.0F, 4.0F, 10.0F, 4.0F, 0.2F, false);

        RightLegKneecap_r1 = new ModelPart(this);
        RightLegKneecap_r1.setPivot(-0.1671F, 5.8269F, -1.5F);
        RIGHTLEG.addChild(RightLegKneecap_r1);
        setRotationAngle(RightLegKneecap_r1, -0.6981F, 0.0F, 0.0F);
        RightLegKneecap_r1.setTextureOffset(25, 18).addCuboid(-0.9F, 0.1F, -0.5F, 2.0F, 0.0F, 0.0F, 0.7F, false);

        LEFTLEG = new ModelPart(this);
        LEFTLEG.setPivot(1.9F, 12.0F, 0.0F);
        LEFTLEG.setTextureOffset(23, 6).addCuboid(-2.0F, 0.55F, -2.0F, 4.0F, 10.0F, 4.0F, 0.2F, true);
        LEFTLEG.setTextureOffset(19, 52).addCuboid(-1.9F, 0.45F, -1.5F, 4.0F, -1.0F, 3.0F, 1.01F, false);

        LeftLegKneecap_r1 = new ModelPart(this);
        LeftLegKneecap_r1.setPivot(0.1671F, 5.8269F, -1.5F);
        LEFTLEG.addChild(LeftLegKneecap_r1);
        setRotationAngle(LeftLegKneecap_r1, 0.0F, 0.0F, 0.7854F);
        LeftLegKneecap_r1.setTextureOffset(23, 51).addCuboid(-1.2F, -3.9F, -0.5F, 0.0F, 0.0F, 4.0F, 0.5F, true);

        LeftLegKneecap_r2 = new ModelPart(this);
        LeftLegKneecap_r2.setPivot(0.1671F, 5.8269F, -1.5F);
        LEFTLEG.addChild(LeftLegKneecap_r2);
        setRotationAngle(LeftLegKneecap_r2, -0.6981F, 0.0F, 0.0F);
        LeftLegKneecap_r2.setTextureOffset(25, 18).addCuboid(-1.1F, 0.1F, -0.5F, 2.0F, 0.0F, 0.0F, 0.7F, true);

        RIGHTFOOT = new ModelPart(this);
        RIGHTFOOT.setPivot(-1.9F, 12.0F, 0.0F);
        RIGHTFOOT.setTextureOffset(4, 58).addCuboid(-1.5F, 11.2F, -1.5F, 3.0F, 0.0F, 3.0F, 1.0F, true);
        RIGHTFOOT.setTextureOffset(9, 59).addCuboid(-1.5F, 11.5F, -3.15F, 3.0F, 0.0F, 0.0F, 0.7F, true);
        RIGHTFOOT.setTextureOffset(24, 53).addCuboid(-2.0F, 11.0F, -3.15F, 4.0F, 1.0F, 0.0F, 0.3F, true);

        LEFTFOOT = new ModelPart(this);
        LEFTFOOT.setPivot(1.9F, 12.0F, 0.0F);
        LEFTFOOT.setTextureOffset(4, 58).addCuboid(-1.5F, 11.2F, -1.5F, 3.0F, 0.0F, 3.0F, 1.0F, false);
        LEFTFOOT.setTextureOffset(6, 59).addCuboid(-1.5F, 11.5F, -3.15F, 3.0F, 0.0F, 0.0F, 0.7F, false);
        LEFTFOOT.setTextureOffset(24, 53).addCuboid(-2.0F, 11.0F, -3.15F, 4.0F, 1.0F, 0.0F, 0.3F, false);

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