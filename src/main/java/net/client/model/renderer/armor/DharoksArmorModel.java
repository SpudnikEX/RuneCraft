package net.client.model.renderer.armor;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;

public class DharoksArmorModel extends RunecraftArmorModel{

    private final ModelPart HEAD;
    private final ModelPart Helmetrightside6_r1;
    private final ModelPart Helmetrightside5_r1;
    private final ModelPart Helmetrightside4_r1;
    private final ModelPart Helmetrightside3_r1;
    private final ModelPart Helmetrightside2_r1;
    private final ModelPart Helmetrightside1_r1;
    private final ModelPart HelmetLeftside6_r1;
    private final ModelPart HelmetLeftside5_r1;
    private final ModelPart HelmetLeftside4_r1;
    private final ModelPart HelmetLeftside3_r1;
    private final ModelPart HelmetLeftside2_r1;
    private final ModelPart HelmetLeftside1_r1;
    private final ModelPart HelmetFaceguard8_r1;
    private final ModelPart HelmetFaceguard7_r1;
    private final ModelPart HelmetFaceguard6_r1;
    private final ModelPart HelmetFaceguard5_r1;
    private final ModelPart HelmetFaceguard4_r1;
    private final ModelPart HelmetFaceguard3_r1;
    private final ModelPart HelmetFaceguard2_r1;
    private final ModelPart HelmetFaceguard1_r1;
    private final ModelPart HelmetBlack4_r1;
    private final ModelPart HelmetBlack3_r1;
    private final ModelPart HelmetBlack2_r1;
    private final ModelPart HelmetBlack1_r1;
    private final ModelPart HelmetTop3_r1;
    private final ModelPart HelmetTop2_r1;
    private final ModelPart HelmetHorn3_r1;
    private final ModelPart HelmetHorn2_r1;
    private final ModelPart HelmetHorn1_r1;
    private final ModelPart BODY;
    private final ModelPart BodyHorn2_r1;
    private final ModelPart BodyHorn1_r1;
    private final ModelPart BodyHorn2_r2;
    private final ModelPart BodyHorn1_r2;
    private final ModelPart RIGHTARM;
    private final ModelPart RightArmHorn3_r1;
    private final ModelPart RightArmHorn2_r1;
    private final ModelPart RightArmHorn1_r1;
    private final ModelPart RightArmHorn2_r2;
    private final ModelPart RightArmHorn1_r2;
    private final ModelPart RightShoulderHorn4_r1;
    private final ModelPart RightShoulderHorn3_r1;
    private final ModelPart RightShoulderHorn2_r1;
    private final ModelPart RightShoulderHorn3_r2;
    private final ModelPart RightShoulderHorn2_r2;
    private final ModelPart RightShoulderHorn1_r1;
    private final ModelPart RightShoulderHorn3_r3;
    private final ModelPart RightShoulderHorn2_r3;
    private final ModelPart RightShoulderHorn1_r2;
    private final ModelPart LEFTARM;
    private final ModelPart LeftArmHorn3_r1;
    private final ModelPart LeftArmHorn2_r1;
    private final ModelPart LeftArmHorn1_r1;
    private final ModelPart LeftArmHorn2_r2;
    private final ModelPart LeftArmHorn1_r2;
    private final ModelPart RIGHTLEG;
    private final ModelPart RightLegLower_r1;
    private final ModelPart RightLegLower_r2;
    private final ModelPart RightLegLower_r3;
    private final ModelPart RightLegLower_r4;
    private final ModelPart RightLegUpper_r1;
    private final ModelPart RightLegUpper_r2;
    private final ModelPart RightLegUpper_r3;
    private final ModelPart RightLegUpper_r4;
    private final ModelPart RightLegUpper_r5;
    private final ModelPart RightLegUpper_r6;
    private final ModelPart RightLegUpper_r7;
    private final ModelPart RightLegUpper_r8;
    private final ModelPart RightKneecapHorn2_r1;
    private final ModelPart RightKneecapHorn1_r1;
    private final ModelPart LEFTLEG;
    private final ModelPart LeftLegLower_r1;
    private final ModelPart LeftLegLower_r2;
    private final ModelPart LeftLegLower_r3;
    private final ModelPart LeftLegLower_r4;
    private final ModelPart LeftLegUpper_r1;
    private final ModelPart LeftLegUpper_r2;
    private final ModelPart LeftLegUpper_r3;
    private final ModelPart LeftLegUpper_r4;
    private final ModelPart LeftLegUpper_r5;
    private final ModelPart LeftLegUpper_r6;
    private final ModelPart LeftLegUpper_r7;
    private final ModelPart LeftLegUpper_r8;
    private final ModelPart LeftKneecapHorn2_r1;
    private final ModelPart LeftKneecapHorn1_r1;
    private final ModelPart RIGHTFOOT;
    private final ModelPart RightBoot6_r1;
    private final ModelPart RightBoot5_r1;
    private final ModelPart RightBoot3_r1;
    private final ModelPart LEFTFOOT;
    private final ModelPart LeftBoot6_r1;
    private final ModelPart LeftBoot5_r1;
    private final ModelPart LeftBoot3_r1;

    public DharoksArmorModel(EquipmentSlot slot) {
        super(slot);

        textureWidth = 64;
        textureHeight = 64;

        HEAD = new ModelPart(this);
        HEAD.setPivot(0.0F, 0.0F, 0.0F);
        HEAD.setTextureOffset(5, 3).addCuboid(0.0F, -8.2F, -4.1F, 5.0F, 1.0F, 7.0F, 0.0F, false);
        HEAD.setTextureOffset(5, 3).addCuboid(-4.9F, -8.2F, -4.1F, 5.0F, 1.0F, 7.0F, 0.0F, false);
        HEAD.setTextureOffset(5, 3).addCuboid(-0.7815F, -8.2F, 2.841F, 5.0F, 1.0F, 2.0F, 0.0F, false);
        HEAD.setTextureOffset(5, 3).addCuboid(-3.982F, -8.2F, 2.8021F, 4.0F, 1.0F, 2.0F, 0.0F, false);
        HEAD.setTextureOffset(5, 11).addCuboid(-3.0F, -7.5F, -2.75F, 6.0F, -1.0F, 6.0F, 1.0F, false);
        HEAD.setTextureOffset(5, 11).addCuboid(-2.5F, -7.75F, -1.75F, 5.0F, -1.0F, 5.0F, 1.0F, false);
        HEAD.setTextureOffset(3, 3).addCuboid(-3.5F, 0.15F, -3.0F, 7.0F, -1.0F, 6.0F, 1.0F, false);
        HEAD.setTextureOffset(10, 2).addCuboid(-4.5141F, -7.717F, 3.1153F, 9.0F, 8.0F, 2.0F, -0.2F, false);

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

        HelmetFaceguard8_r1 = new ModelPart(this);
        HelmetFaceguard8_r1.setPivot(-3.94F, -4.4398F, -3.9898F);
        HEAD.addChild(HelmetFaceguard8_r1);
        setRotationAngle(HelmetFaceguard8_r1, 0.0873F, 0.2182F, 0.0F);
        HelmetFaceguard8_r1.setTextureOffset(12, 10).addCuboid(-1.0F, -1.5F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        HelmetFaceguard7_r1 = new ModelPart(this);
        HelmetFaceguard7_r1.setPivot(3.7855F, -4.4398F, -3.9898F);
        HEAD.addChild(HelmetFaceguard7_r1);
        setRotationAngle(HelmetFaceguard7_r1, 0.0873F, -0.2182F, 0.0F);
        HelmetFaceguard7_r1.setTextureOffset(14, 5).addCuboid(-1.0F, -1.5F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

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
        HelmetFaceguard4_r1.setPivot(0.3417F, -0.4856F, -4.4406F);
        HEAD.addChild(HelmetFaceguard4_r1);
        setRotationAngle(HelmetFaceguard4_r1, 2.8529F, -1.3419F, -2.858F);
        HelmetFaceguard4_r1.setTextureOffset(10, 3).addCuboid(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        HelmetFaceguard3_r1 = new ModelPart(this);
        HelmetFaceguard3_r1.setPivot(2.7844F, -1.913F, -3.9873F);
        HEAD.addChild(HelmetFaceguard3_r1);
        setRotationAngle(HelmetFaceguard3_r1, 2.8529F, -1.3419F, -2.858F);
        HelmetFaceguard3_r1.setTextureOffset(10, 3).addCuboid(-0.55F, -2.1F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

        HelmetFaceguard2_r1 = new ModelPart(this);
        HelmetFaceguard2_r1.setPivot(-0.3873F, -0.4831F, -4.4394F);
        HEAD.addChild(HelmetFaceguard2_r1);
        setRotationAngle(HelmetFaceguard2_r1, 0.3048F, -1.3419F, -0.3125F);
        HelmetFaceguard2_r1.setTextureOffset(10, 3).addCuboid(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        HelmetFaceguard1_r1 = new ModelPart(this);
        HelmetFaceguard1_r1.setPivot(-2.8492F, -1.8797F, -3.9936F);
        HEAD.addChild(HelmetFaceguard1_r1);
        setRotationAngle(HelmetFaceguard1_r1, 0.3048F, -1.3419F, -0.3125F);
        HelmetFaceguard1_r1.setTextureOffset(10, 3).addCuboid(-0.55F, -2.1F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

        HelmetBlack4_r1 = new ModelPart(this);
        HelmetBlack4_r1.setPivot(0.379F, -2.3441F, -4.1722F);
        HEAD.addChild(HelmetBlack4_r1);
        setRotationAngle(HelmetBlack4_r1, 2.8529F, -1.3419F, -2.858F);
        HelmetBlack4_r1.setTextureOffset(5, 47).addCuboid(-0.55F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        HelmetBlack3_r1 = new ModelPart(this);
        HelmetBlack3_r1.setPivot(-0.3605F, -2.342F, -4.1675F);
        HEAD.addChild(HelmetBlack3_r1);
        setRotationAngle(HelmetBlack3_r1, 0.3048F, -1.3419F, -0.3125F);
        HelmetBlack3_r1.setTextureOffset(5, 47).addCuboid(-0.55F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        HelmetBlack2_r1 = new ModelPart(this);
        HelmetBlack2_r1.setPivot(-1.907F, -4.8F, -3.9816F);
        HEAD.addChild(HelmetBlack2_r1);
        setRotationAngle(HelmetBlack2_r1, 0.0F, -1.3526F, 0.0F);
        HelmetBlack2_r1.setTextureOffset(2, 46).addCuboid(-0.5F, -1.0F, -2.05F, 1.0F, 2.0F, 4.0F, 0.0F, false);

        HelmetBlack1_r1 = new ModelPart(this);
        HelmetBlack1_r1.setPivot(1.8094F, -4.8F, -4.0033F);
        HEAD.addChild(HelmetBlack1_r1);
        setRotationAngle(HelmetBlack1_r1, 0.0F, 1.3526F, 0.0F);
        HelmetBlack1_r1.setTextureOffset(3, 47).addCuboid(-0.5F, -1.0F, -1.95F, 1.0F, 2.0F, 3.0F, 0.0F, false);

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

        HelmetHorn3_r1 = new ModelPart(this);
        HelmetHorn3_r1.setPivot(0.0189F, -8.9925F, 0.5252F);
        HEAD.addChild(HelmetHorn3_r1);
        setRotationAngle(HelmetHorn3_r1, 0.0F, 0.0F, 0.0F);
        HelmetHorn3_r1.setTextureOffset(37, 58).addCuboid(-0.5F, 0.0F, -0.25F, 1.0F, 1.0F, 1.0F, 0.4F, false);

        HelmetHorn2_r1 = new ModelPart(this);
        HelmetHorn2_r1.setPivot(0.4689F, -10.3425F, 0.3752F);
        HEAD.addChild(HelmetHorn2_r1);
        setRotationAngle(HelmetHorn2_r1, 0.0F, 0.0F, 0.0F);
        HelmetHorn2_r1.setTextureOffset(37, 58).addCuboid(-0.95F, 0.35F, -0.1F, 1.0F, 1.0F, 1.0F, 0.1F, false);

        HelmetHorn1_r1 = new ModelPart(this);
        HelmetHorn1_r1.setPivot(0.2689F, -11.3425F, 0.9752F);
        HEAD.addChild(HelmetHorn1_r1);
        setRotationAngle(HelmetHorn1_r1, 0.0F, 0.0F, 0.0F);
        HelmetHorn1_r1.setTextureOffset(37, 58).addCuboid(-0.75F, 0.55F, -0.7F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        BODY = new ModelPart(this);
        BODY.setPivot(0.0F, 0.0F, 0.0F);
        BODY.setTextureOffset(9, 8).addCuboid(-3.5F, 8.5F, -1.35F, 7.0F, 2.0F, -1.0F, 1.01F, false);
        BODY.setTextureOffset(9, 7).addCuboid(-3.7F, 0.5F, -2.0F, 7.0F, 4.0F, -1.0F, 1.01F, false);
        BODY.setTextureOffset(9, 8).addCuboid(-3.6F, 3.9F, -1.5F, 7.0F, 4.0F, -1.0F, 1.01F, false);
        BODY.setTextureOffset(6, 4).addCuboid(-3.8F, 0.6F, -1.4F, 7.0F, 5.0F, 3.0F, 1.01F, false);
        BODY.setTextureOffset(7, 6).addCuboid(-3.5F, 7.6F, -0.6F, 7.0F, 3.0F, 2.0F, 1.01F, false);
        BODY.setTextureOffset(33, 59).addCuboid(-0.5747F, 9.85F, -2.7243F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        BODY.setTextureOffset(33, 59).addCuboid(-0.5747F, 7.85F, -2.9243F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        BODY.setTextureOffset(3, 53).addCuboid(-3.5F, 12.05F, -1.5F, 7.0F, -1.0F, 3.0F, 1.0F, false);

        BodyHorn2_r1 = new ModelPart(this);
        BodyHorn2_r1.setPivot(-0.1247F, 8.1252F, -3.0127F);
        BODY.addChild(BodyHorn2_r1);
        setRotationAngle(BodyHorn2_r1, 0.7854F, 0.0F, 0.0F);
        BodyHorn2_r1.setTextureOffset(33, 59).addCuboid(-0.45F, -0.325F, -0.55F, 1.0F, 1.0F, 1.0F, -0.1F, false);

        BodyHorn1_r1 = new ModelPart(this);
        BodyHorn1_r1.setPivot(-0.0247F, 7.8424F, -3.5784F);
        BODY.addChild(BodyHorn1_r1);
        setRotationAngle(BodyHorn1_r1, 0.7854F, 0.0F, 0.0F);
        BodyHorn1_r1.setTextureOffset(33, 59).addCuboid(-0.55F, -0.325F, -0.35F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        BodyHorn2_r2 = new ModelPart(this);
        BodyHorn2_r2.setPivot(-0.1247F, 10.1252F, -2.8127F);
        BODY.addChild(BodyHorn2_r2);
        setRotationAngle(BodyHorn2_r2, 0.7854F, 0.0F, 0.0F);
        BodyHorn2_r2.setTextureOffset(33, 59).addCuboid(-0.45F, -0.325F, -0.55F, 1.0F, 1.0F, 1.0F, -0.1F, false);

        BodyHorn1_r2 = new ModelPart(this);
        BodyHorn1_r2.setPivot(-0.0247F, 9.8424F, -3.3784F);
        BODY.addChild(BodyHorn1_r2);
        setRotationAngle(BodyHorn1_r2, 0.7854F, 0.0F, 0.0F);
        BodyHorn1_r2.setTextureOffset(33, 59).addCuboid(-0.55F, -0.325F, -0.35F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        RIGHTARM = new ModelPart(this);
        RIGHTARM.setPivot(-5.0F, 2.0F, 0.0F);
        RIGHTARM.setTextureOffset(7, 32).addCuboid(-3.0F, -1.3F, -2.0F, 4.0F, 2.0F, 4.0F, 1.5F, false);
        RIGHTARM.setTextureOffset(8, 32).addCuboid(-3.0541F, 4.2548F, -2.0F, 4.0F, 3.0F, 4.0F, 0.2F, false);
        RIGHTARM.setTextureOffset(35, 35).addCuboid(-3.0F, -2.3F, -2.0F, 4.0F, 11.0F, 4.0F, 0.1F, false);
        RIGHTARM.setTextureOffset(6, 32).addCuboid(-3.0541F, 8.9048F, -2.0F, 4.0F, 1.0F, 4.0F, 0.1F, false);
        RIGHTARM.setTextureOffset(6, 32).addCuboid(-3.0541F, 8.6548F, -2.0F, 4.0F, 2.0F, 4.0F, -0.3F, false);

        RightArmHorn3_r1 = new ModelPart(this);
        RightArmHorn3_r1.setPivot(-3.0753F, 6.425F, 0.1257F);
        RIGHTARM.addChild(RightArmHorn3_r1);
        setRotationAngle(RightArmHorn3_r1, 0.0F, 1.5708F, 0.0F);
        RightArmHorn3_r1.setTextureOffset(33, 59).addCuboid(-0.45F, -0.375F, -0.35F, 1.0F, 1.0F, 0.0F, 0.0F, true);
        RightArmHorn3_r1.setTextureOffset(33, 59).addCuboid(-0.45F, -1.975F, -0.35F, 1.0F, 1.0F, 0.0F, 0.0F, true);

        RightArmHorn2_r1 = new ModelPart(this);
        RightArmHorn2_r1.setPivot(-2.8772F, 6.9616F, -0.3743F);
        RIGHTARM.addChild(RightArmHorn2_r1);
        setRotationAngle(RightArmHorn2_r1, 0.0F, 1.5708F, -0.7854F);
        RightArmHorn2_r1.setTextureOffset(33, 59).addCuboid(-0.95F, -1.225F, -0.55F, 1.0F, 1.0F, 1.0F, -0.1F, true);

        RightArmHorn1_r1 = new ModelPart(this);
        RightArmHorn1_r1.setPivot(-4.2208F, 6.0424F, 0.0257F);
        RIGHTARM.addChild(RightArmHorn1_r1);
        setRotationAngle(RightArmHorn1_r1, 0.0F, 1.5708F, -0.7854F);
        RightArmHorn1_r1.setTextureOffset(33, 59).addCuboid(-0.55F, -0.325F, -0.25F, 1.0F, 1.0F, 1.0F, -0.2F, true);

        RightArmHorn2_r2 = new ModelPart(this);
        RightArmHorn2_r2.setPivot(-2.8772F, 5.3616F, -0.3743F);
        RIGHTARM.addChild(RightArmHorn2_r2);
        setRotationAngle(RightArmHorn2_r2, 0.0F, 1.5708F, -0.7854F);
        RightArmHorn2_r2.setTextureOffset(33, 59).addCuboid(-0.95F, -1.225F, -0.55F, 1.0F, 1.0F, 1.0F, -0.1F, true);

        RightArmHorn1_r2 = new ModelPart(this);
        RightArmHorn1_r2.setPivot(-4.2208F, 4.4424F, 0.0257F);
        RIGHTARM.addChild(RightArmHorn1_r2);
        setRotationAngle(RightArmHorn1_r2, 0.0F, 1.5708F, -0.7854F);
        RightArmHorn1_r2.setTextureOffset(33, 59).addCuboid(-0.55F, -0.325F, -0.25F, 1.0F, 1.0F, 1.0F, -0.2F, true);

        RightShoulderHorn4_r1 = new ModelPart(this);
        RightShoulderHorn4_r1.setPivot(-4.2106F, -2.475F, 3.2097F);
        RIGHTARM.addChild(RightShoulderHorn4_r1);
        setRotationAngle(RightShoulderHorn4_r1, 0.0F, -0.7854F, 0.0F);
        RightShoulderHorn4_r1.setTextureOffset(33, 59).addCuboid(-0.55F, -0.375F, -0.4F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        RightShoulderHorn3_r1 = new ModelPart(this);
        RightShoulderHorn3_r1.setPivot(-4.7474F, -2.6455F, 3.7465F);
        RIGHTARM.addChild(RightShoulderHorn3_r1);
        setRotationAngle(RightShoulderHorn3_r1, -0.7854F, -0.7854F, 0.0F);
        RightShoulderHorn3_r1.setTextureOffset(33, 59).addCuboid(-0.55F, -0.325F, -0.55F, 1.0F, 1.0F, 1.0F, -0.1F, true);

        RightShoulderHorn2_r1 = new ModelPart(this);
        RightShoulderHorn2_r1.setPivot(-5.0767F, -3.0698F, 4.2172F);
        RIGHTARM.addChild(RightShoulderHorn2_r1);
        setRotationAngle(RightShoulderHorn2_r1, -0.7854F, -0.7854F, 0.0F);
        RightShoulderHorn2_r1.setTextureOffset(33, 59).addCuboid(-0.65F, -0.025F, -0.65F, 1.0F, 1.0F, 1.0F, -0.2F, true);

        RightShoulderHorn3_r2 = new ModelPart(this);
        RightShoulderHorn3_r2.setPivot(-4.2106F, -2.475F, -3.2097F);
        RIGHTARM.addChild(RightShoulderHorn3_r2);
        setRotationAngle(RightShoulderHorn3_r2, 0.0F, 0.7854F, 0.0F);
        RightShoulderHorn3_r2.setTextureOffset(33, 59).addCuboid(-0.55F, -0.375F, -0.6F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        RightShoulderHorn2_r2 = new ModelPart(this);
        RightShoulderHorn2_r2.setPivot(-4.7474F, -2.6455F, -3.7465F);
        RIGHTARM.addChild(RightShoulderHorn2_r2);
        setRotationAngle(RightShoulderHorn2_r2, 0.7854F, 0.7854F, 0.0F);
        RightShoulderHorn2_r2.setTextureOffset(33, 59).addCuboid(-0.55F, -0.325F, -0.45F, 1.0F, 1.0F, 1.0F, -0.1F, true);

        RightShoulderHorn1_r1 = new ModelPart(this);
        RightShoulderHorn1_r1.setPivot(-5.0767F, -3.0698F, -4.2172F);
        RIGHTARM.addChild(RightShoulderHorn1_r1);
        setRotationAngle(RightShoulderHorn1_r1, 0.7854F, 0.7854F, 0.0F);
        RightShoulderHorn1_r1.setTextureOffset(33, 59).addCuboid(-0.65F, -0.025F, -0.35F, 1.0F, 1.0F, 1.0F, -0.2F, true);

        RightShoulderHorn3_r3 = new ModelPart(this);
        RightShoulderHorn3_r3.setPivot(-4.2253F, -2.475F, 0.2257F);
        RIGHTARM.addChild(RightShoulderHorn3_r3);
        setRotationAngle(RightShoulderHorn3_r3, 0.0F, 1.5708F, 0.0F);
        RightShoulderHorn3_r3.setTextureOffset(46, 56).addCuboid(-0.45F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, 0.4F, true);

        RightShoulderHorn2_r3 = new ModelPart(this);
        RightShoulderHorn2_r3.setPivot(-5.2844F, -2.3869F, 0.2257F);
        RIGHTARM.addChild(RightShoulderHorn2_r3);
        setRotationAngle(RightShoulderHorn2_r3, 0.0F, 1.5708F, -0.7854F);
        RightShoulderHorn2_r3.setTextureOffset(30, 59).addCuboid(-0.45F, -0.625F, 0.05F, 1.0F, 1.0F, 1.0F, 0.1F, true);

        RightShoulderHorn1_r2 = new ModelPart(this);
        RightShoulderHorn1_r2.setPivot(-5.9915F, -3.5183F, -0.0743F);
        RIGHTARM.addChild(RightShoulderHorn1_r2);
        setRotationAngle(RightShoulderHorn1_r2, 0.0F, 1.5708F, -0.7854F);
        RightShoulderHorn1_r2.setTextureOffset(33, 59).addCuboid(-0.75F, -0.025F, -0.25F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        LEFTARM = new ModelPart(this);
        LEFTARM.setPivot(5.0F, 2.0F, 0.0F);
        LEFTARM.setTextureOffset(8, 33).addCuboid(-1.0F, -1.3F, -2.0F, 4.0F, 2.0F, 4.0F, 1.1F, false);
        LEFTARM.setTextureOffset(7, 32).addCuboid(-0.9541F, 4.2548F, -2.0F, 4.0F, 3.0F, 4.0F, 0.2F, false);
        LEFTARM.setTextureOffset(35, 35).addCuboid(-1.0F, -2.3F, -2.0F, 4.0F, 11.0F, 4.0F, 0.1F, true);
        LEFTARM.setTextureOffset(6, 32).addCuboid(-0.9459F, 8.6548F, -2.0F, 4.0F, 2.0F, 4.0F, -0.3F, true);
        LEFTARM.setTextureOffset(6, 32).addCuboid(-0.9459F, 8.9048F, -2.0F, 4.0F, 1.0F, 4.0F, 0.1F, true);

        LeftArmHorn3_r1 = new ModelPart(this);
        LeftArmHorn3_r1.setPivot(3.0753F, 6.55F, 0.0757F);
        LEFTARM.addChild(LeftArmHorn3_r1);
        setRotationAngle(LeftArmHorn3_r1, 0.0F, -1.5708F, 0.0F);
        LeftArmHorn3_r1.setTextureOffset(33, 59).addCuboid(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        LeftArmHorn3_r1.setTextureOffset(33, 59).addCuboid(-0.5F, -2.1F, -0.35F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        LeftArmHorn2_r1 = new ModelPart(this);
        LeftArmHorn2_r1.setPivot(3.4253F, 6.4843F, 0.0757F);
        LEFTARM.addChild(LeftArmHorn2_r1);
        setRotationAngle(LeftArmHorn2_r1, 0.0F, -1.5708F, 0.7854F);
        LeftArmHorn2_r1.setTextureOffset(33, 59).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.1F, false);

        LeftArmHorn1_r1 = new ModelPart(this);
        LeftArmHorn1_r1.setPivot(3.9202F, 5.9893F, 0.0757F);
        LEFTARM.addChild(LeftArmHorn1_r1);
        setRotationAngle(LeftArmHorn1_r1, 0.0F, -1.5708F, 0.7854F);
        LeftArmHorn1_r1.setTextureOffset(33, 59).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        LeftArmHorn2_r2 = new ModelPart(this);
        LeftArmHorn2_r2.setPivot(3.4253F, 4.8843F, 0.0757F);
        LEFTARM.addChild(LeftArmHorn2_r2);
        setRotationAngle(LeftArmHorn2_r2, 0.0F, -1.5708F, 0.7854F);
        LeftArmHorn2_r2.setTextureOffset(33, 59).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.1F, false);

        LeftArmHorn1_r2 = new ModelPart(this);
        LeftArmHorn1_r2.setPivot(3.9202F, 4.3893F, 0.0757F);
        LEFTARM.addChild(LeftArmHorn1_r2);
        setRotationAngle(LeftArmHorn1_r2, 0.0F, -1.5708F, 0.7854F);
        LeftArmHorn1_r2.setTextureOffset(33, 59).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        RIGHTLEG = new ModelPart(this);
        RIGHTLEG.setPivot(-1.9F, 12.0F, 0.0F);
        RIGHTLEG.setTextureOffset(9, 33).addCuboid(-1.5F, 3.7F, -2.9F, 3.0F, 3.0F, 1.0F, -0.1F, true);
        RIGHTLEG.setTextureOffset(6, 34).addCuboid(-2.0F, 5.2F, -2.0F, 4.0F, 0.0F, 4.0F, 0.7F, true);
        RIGHTLEG.setTextureOffset(45, 55).addCuboid(-0.4753F, 4.65F, -2.6243F, 1.0F, 1.0F, 1.0F, 0.6F, true);
        RIGHTLEG.setTextureOffset(7, 53).addCuboid(-1.6F, 0.75F, -1.5F, 3.0F, -1.0F, 3.0F, 0.8F, true);

        RightLegLower_r1 = new ModelPart(this);
        RightLegLower_r1.setPivot(-1.5F, 2.5F, 0.0F);
        RIGHTLEG.addChild(RightLegLower_r1);
        setRotationAngle(RightLegLower_r1, 0.0873F, 0.0F, 0.0F);
        RightLegLower_r1.setTextureOffset(16, 6).addCuboid(0.55F, 3.9F, -2.1F, 2.0F, 2.0F, 0.0F, 0.8F, true);

        RightLegLower_r2 = new ModelPart(this);
        RightLegLower_r2.setPivot(-1.5F, 2.5F, 0.0F);
        RIGHTLEG.addChild(RightLegLower_r2);
        setRotationAngle(RightLegLower_r2, 0.0F, 0.0F, -0.1309F);
        RightLegLower_r2.setTextureOffset(16, 6).addCuboid(-0.8F, 4.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.8F, true);

        RightLegLower_r3 = new ModelPart(this);
        RightLegLower_r3.setPivot(-1.5F, 2.5F, 0.0F);
        RIGHTLEG.addChild(RightLegLower_r3);
        setRotationAngle(RightLegLower_r3, -0.0873F, 0.0F, 0.0F);
        RightLegLower_r3.setTextureOffset(16, 6).addCuboid(0.55F, 3.9F, 2.1F, 2.0F, 2.0F, 0.0F, 0.8F, true);

        RightLegLower_r4 = new ModelPart(this);
        RightLegLower_r4.setPivot(-1.5F, 2.5F, 0.0F);
        RIGHTLEG.addChild(RightLegLower_r4);
        setRotationAngle(RightLegLower_r4, 0.0F, 0.0F, 0.1309F);
        RightLegLower_r4.setTextureOffset(16, 6).addCuboid(3.7F, 3.6F, -1.5F, 0.0F, 2.0F, 3.0F, 0.8F, true);

        RightLegUpper_r1 = new ModelPart(this);
        RightLegUpper_r1.setPivot(-4.6837F, -3.789F, 0.0F);
        RIGHTLEG.addChild(RightLegUpper_r1);
        setRotationAngle(RightLegUpper_r1, 0.0F, 0.0F, -0.1309F);
        RightLegUpper_r1.setTextureOffset(16, 6).addCuboid(5.7F, 5.6F, -1.5F, 0.0F, 0.0F, 3.0F, 0.6F, true);

        RightLegUpper_r2 = new ModelPart(this);
        RightLegUpper_r2.setPivot(-1.5F, -2.0F, 0.0F);
        RIGHTLEG.addChild(RightLegUpper_r2);
        setRotationAngle(RightLegUpper_r2, 0.0F, 0.0F, 0.1309F);
        RightLegUpper_r2.setTextureOffset(16, 6).addCuboid(3.7F, 3.6F, -1.5F, 0.0F, 2.0F, 3.0F, 0.6F, true);

        RightLegUpper_r3 = new ModelPart(this);
        RightLegUpper_r3.setPivot(-1.5F, -4.63F, -1.8503F);
        RIGHTLEG.addChild(RightLegUpper_r3);
        setRotationAngle(RightLegUpper_r3, 0.0873F, 0.0F, 0.0F);
        RightLegUpper_r3.setTextureOffset(16, 6).addCuboid(0.55F, 5.9F, 3.1F, 2.0F, 0.0F, 0.0F, 0.6F, true);

        RightLegUpper_r4 = new ModelPart(this);
        RightLegUpper_r4.setPivot(-1.5F, -2.0F, 0.0F);
        RIGHTLEG.addChild(RightLegUpper_r4);
        setRotationAngle(RightLegUpper_r4, -0.0873F, 0.0F, 0.0F);
        RightLegUpper_r4.setTextureOffset(16, 6).addCuboid(0.55F, 3.9F, 2.1F, 2.0F, 2.0F, 0.0F, 0.6F, true);

        RightLegUpper_r5 = new ModelPart(this);
        RightLegUpper_r5.setPivot(-1.5F, -4.7172F, 0.8541F);
        RIGHTLEG.addChild(RightLegUpper_r5);
        setRotationAngle(RightLegUpper_r5, -0.0873F, 0.0F, 0.0F);
        RightLegUpper_r5.setTextureOffset(16, 6).addCuboid(0.55F, 5.9F, -2.1F, 2.0F, 0.0F, 0.0F, 0.6F, true);

        RightLegUpper_r6 = new ModelPart(this);
        RightLegUpper_r6.setPivot(-1.5F, -2.0F, 0.0F);
        RIGHTLEG.addChild(RightLegUpper_r6);
        setRotationAngle(RightLegUpper_r6, 0.0873F, 0.0F, 0.0F);
        RightLegUpper_r6.setTextureOffset(16, 6).addCuboid(0.55F, 3.9F, -2.1F, 2.0F, 2.0F, 0.0F, 0.6F, true);

        RightLegUpper_r7 = new ModelPart(this);
        RightLegUpper_r7.setPivot(-0.1947F, -4.8072F, 0.0F);
        RIGHTLEG.addChild(RightLegUpper_r7);
        setRotationAngle(RightLegUpper_r7, 0.0F, 0.0F, 0.1309F);
        RightLegUpper_r7.setTextureOffset(16, 6).addCuboid(-0.8F, 6.0F, -1.5F, 0.0F, 0.0F, 3.0F, 0.6F, true);

        RightLegUpper_r8 = new ModelPart(this);
        RightLegUpper_r8.setPivot(-1.5F, -2.0F, 0.0F);
        RIGHTLEG.addChild(RightLegUpper_r8);
        setRotationAngle(RightLegUpper_r8, 0.0F, 0.0F, -0.1309F);
        RightLegUpper_r8.setTextureOffset(16, 6).addCuboid(-0.8F, 4.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.6F, true);

        RightKneecapHorn2_r1 = new ModelPart(this);
        RightKneecapHorn2_r1.setPivot(-0.7253F, 4.0049F, -3.7016F);
        RIGHTLEG.addChild(RightKneecapHorn2_r1);
        setRotationAngle(RightKneecapHorn2_r1, 0.7854F, 0.0F, 0.0F);
        RightKneecapHorn2_r1.setTextureOffset(36, 58).addCuboid(0.75F, 1.225F, -0.45F, 0.0F, 0.0F, 0.0F, 0.7F, true);

        RightKneecapHorn1_r1 = new ModelPart(this);
        RightKneecapHorn1_r1.setPivot(-0.2253F, 5.6313F, -3.2067F);
        RIGHTLEG.addChild(RightKneecapHorn1_r1);
        setRotationAngle(RightKneecapHorn1_r1, 0.7854F, 0.0F, 0.0F);
        RightKneecapHorn1_r1.setTextureOffset(34, 58).addCuboid(-0.25F, -1.575F, -0.15F, 1.0F, 1.0F, 1.0F, -0.1F, true);

        LEFTLEG = new ModelPart(this);
        LEFTLEG.setPivot(1.9F, 12.0F, 0.0F);
        LEFTLEG.setTextureOffset(9, 33).addCuboid(-1.5F, 3.7F, -2.9F, 3.0F, 3.0F, 1.0F, -0.1F, false);
        LEFTLEG.setTextureOffset(6, 34).addCuboid(-2.0F, 5.2F, -2.0F, 4.0F, 0.0F, 4.0F, 0.7F, false);
        LEFTLEG.setTextureOffset(45, 55).addCuboid(-0.5247F, 4.65F, -2.6243F, 1.0F, 1.0F, 1.0F, 0.6F, false);
        LEFTLEG.setTextureOffset(7, 53).addCuboid(-1.4F, 0.75F, -1.5F, 3.0F, -1.0F, 3.0F, 0.8F, false);

        LeftLegLower_r1 = new ModelPart(this);
        LeftLegLower_r1.setPivot(1.5F, 2.5F, 0.0F);
        LEFTLEG.addChild(LeftLegLower_r1);
        setRotationAngle(LeftLegLower_r1, 0.0873F, 0.0F, 0.0F);
        LeftLegLower_r1.setTextureOffset(16, 6).addCuboid(-2.55F, 3.9F, -2.1F, 2.0F, 2.0F, 0.0F, 0.8F, false);

        LeftLegLower_r2 = new ModelPart(this);
        LeftLegLower_r2.setPivot(1.5F, 2.5F, 0.0F);
        LEFTLEG.addChild(LeftLegLower_r2);
        setRotationAngle(LeftLegLower_r2, 0.0F, 0.0F, 0.1309F);
        LeftLegLower_r2.setTextureOffset(16, 6).addCuboid(0.8F, 4.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.8F, false);

        LeftLegLower_r3 = new ModelPart(this);
        LeftLegLower_r3.setPivot(1.5F, 2.5F, 0.0F);
        LEFTLEG.addChild(LeftLegLower_r3);
        setRotationAngle(LeftLegLower_r3, -0.0873F, 0.0F, 0.0F);
        LeftLegLower_r3.setTextureOffset(16, 6).addCuboid(-2.55F, 3.9F, 2.1F, 2.0F, 2.0F, 0.0F, 0.8F, false);

        LeftLegLower_r4 = new ModelPart(this);
        LeftLegLower_r4.setPivot(1.5F, 2.5F, 0.0F);
        LEFTLEG.addChild(LeftLegLower_r4);
        setRotationAngle(LeftLegLower_r4, 0.0F, 0.0F, -0.1309F);
        LeftLegLower_r4.setTextureOffset(16, 6).addCuboid(-3.7F, 3.6F, -1.5F, 0.0F, 2.0F, 3.0F, 0.8F, false);

        LeftLegUpper_r1 = new ModelPart(this);
        LeftLegUpper_r1.setPivot(4.6837F, -3.789F, 0.0F);
        LEFTLEG.addChild(LeftLegUpper_r1);
        setRotationAngle(LeftLegUpper_r1, 0.0F, 0.0F, 0.1309F);
        LeftLegUpper_r1.setTextureOffset(16, 6).addCuboid(-5.7F, 5.6F, -1.5F, 0.0F, 0.0F, 3.0F, 0.6F, false);

        LeftLegUpper_r2 = new ModelPart(this);
        LeftLegUpper_r2.setPivot(1.5F, -2.0F, 0.0F);
        LEFTLEG.addChild(LeftLegUpper_r2);
        setRotationAngle(LeftLegUpper_r2, 0.0F, 0.0F, -0.1309F);
        LeftLegUpper_r2.setTextureOffset(16, 6).addCuboid(-3.7F, 3.6F, -1.5F, 0.0F, 2.0F, 3.0F, 0.6F, false);

        LeftLegUpper_r3 = new ModelPart(this);
        LeftLegUpper_r3.setPivot(1.5F, -4.63F, -1.8503F);
        LEFTLEG.addChild(LeftLegUpper_r3);
        setRotationAngle(LeftLegUpper_r3, 0.0873F, 0.0F, 0.0F);
        LeftLegUpper_r3.setTextureOffset(16, 6).addCuboid(-2.55F, 5.9F, 3.1F, 2.0F, 0.0F, 0.0F, 0.6F, false);

        LeftLegUpper_r4 = new ModelPart(this);
        LeftLegUpper_r4.setPivot(1.5F, -2.0F, 0.0F);
        LEFTLEG.addChild(LeftLegUpper_r4);
        setRotationAngle(LeftLegUpper_r4, -0.0873F, 0.0F, 0.0F);
        LeftLegUpper_r4.setTextureOffset(16, 6).addCuboid(-2.55F, 3.9F, 2.1F, 2.0F, 2.0F, 0.0F, 0.6F, false);

        LeftLegUpper_r5 = new ModelPart(this);
        LeftLegUpper_r5.setPivot(1.5F, -4.7172F, 0.8541F);
        LEFTLEG.addChild(LeftLegUpper_r5);
        setRotationAngle(LeftLegUpper_r5, -0.0873F, 0.0F, 0.0F);
        LeftLegUpper_r5.setTextureOffset(16, 6).addCuboid(-2.55F, 5.9F, -2.1F, 2.0F, 0.0F, 0.0F, 0.6F, false);

        LeftLegUpper_r6 = new ModelPart(this);
        LeftLegUpper_r6.setPivot(1.5F, -2.0F, 0.0F);
        LEFTLEG.addChild(LeftLegUpper_r6);
        setRotationAngle(LeftLegUpper_r6, 0.0873F, 0.0F, 0.0F);
        LeftLegUpper_r6.setTextureOffset(16, 6).addCuboid(-2.55F, 3.9F, -2.1F, 2.0F, 2.0F, 0.0F, 0.6F, false);

        LeftLegUpper_r7 = new ModelPart(this);
        LeftLegUpper_r7.setPivot(0.1947F, -4.8072F, 0.0F);
        LEFTLEG.addChild(LeftLegUpper_r7);
        setRotationAngle(LeftLegUpper_r7, 0.0F, 0.0F, -0.1309F);
        LeftLegUpper_r7.setTextureOffset(16, 6).addCuboid(0.8F, 6.0F, -1.5F, 0.0F, 0.0F, 3.0F, 0.6F, false);

        LeftLegUpper_r8 = new ModelPart(this);
        LeftLegUpper_r8.setPivot(1.5F, -2.0F, 0.0F);
        LEFTLEG.addChild(LeftLegUpper_r8);
        setRotationAngle(LeftLegUpper_r8, 0.0F, 0.0F, 0.1309F);
        LeftLegUpper_r8.setTextureOffset(16, 6).addCuboid(0.8F, 4.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.6F, false);

        LeftKneecapHorn2_r1 = new ModelPart(this);
        LeftKneecapHorn2_r1.setPivot(0.7253F, 4.0049F, -3.7016F);
        LEFTLEG.addChild(LeftKneecapHorn2_r1);
        setRotationAngle(LeftKneecapHorn2_r1, 0.7854F, 0.0F, 0.0F);
        LeftKneecapHorn2_r1.setTextureOffset(36, 58).addCuboid(-0.75F, 1.225F, -0.45F, 0.0F, 0.0F, 0.0F, 0.7F, false);

        LeftKneecapHorn1_r1 = new ModelPart(this);
        LeftKneecapHorn1_r1.setPivot(0.2253F, 5.6313F, -3.2067F);
        LEFTLEG.addChild(LeftKneecapHorn1_r1);
        setRotationAngle(LeftKneecapHorn1_r1, 0.7854F, 0.0F, 0.0F);
        LeftKneecapHorn1_r1.setTextureOffset(34, 58).addCuboid(-0.75F, -1.575F, -0.15F, 1.0F, 1.0F, 1.0F, -0.1F, false);

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
