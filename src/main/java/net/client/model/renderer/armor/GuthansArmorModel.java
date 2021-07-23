package net.client.model.renderer.armor;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;

public class GuthansArmorModel extends RunecraftArmorModel{

    private final ModelPart HEAD;
    private final ModelPart LeftHelmetHorn6_r1;
    private final ModelPart LeftHelmetHorn5_r1;
    private final ModelPart LeftHelmetHorn4_r1;
    private final ModelPart LeftHelmetHorn3_r1;
    private final ModelPart LeftHelmetHorn2_r1;
    private final ModelPart LeftHelmetHorn1_r1;
    private final ModelPart RightHelmetHorn6_r1;
    private final ModelPart RightHelmetHorn5_r1;
    private final ModelPart RightHelmetHorn4_r1;
    private final ModelPart RightHelmetHorn3_r1;
    private final ModelPart RightHelmetHorn2_r1;
    private final ModelPart RightHelmetHorn1_r1;
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
    private final ModelPart BODY;
    private final ModelPart RIGHTARM;
    private final ModelPart LEFTARM;
    private final ModelPart RIGHTLEG;
    private final ModelPart RightLeg3_r1;
    private final ModelPart RightLeg1_r1;
    private final ModelPart LEFTLEG;
    private final ModelPart LeftLeg3_r1;
    private final ModelPart LeftLeg1_r1;
    private final ModelPart RIGHTFOOT;
    private final ModelPart LEFTFOOT;

    public GuthansArmorModel(EquipmentSlot slot) {
        super(slot);

        textureWidth = 64;
        textureHeight = 64;

        HEAD = new ModelPart(this);
        HEAD.setPivot(0.0F, 0.0F, 0.0F);
        HEAD.setTextureOffset(5, 5).addCuboid(0.0F, -8.2F, -4.1F, 5.0F, 1.0F, 7.0F, 0.0F, false);
        HEAD.setTextureOffset(6, 5).addCuboid(-4.9F, -8.2F, -4.1F, 5.0F, 1.0F, 7.0F, 0.0F, false);
        HEAD.setTextureOffset(5, 3).addCuboid(-0.5815F, -8.2F, 2.841F, 5.0F, 1.0F, 2.0F, 0.0F, false);
        HEAD.setTextureOffset(5, 3).addCuboid(-4.382F, -8.2F, 2.8021F, 5.0F, 1.0F, 2.0F, 0.0F, false);
        HEAD.setTextureOffset(5, 11).addCuboid(-3.0F, -7.5F, -2.75F, 6.0F, -1.0F, 6.0F, 1.0F, false);
        HEAD.setTextureOffset(5, 11).addCuboid(-2.5F, -7.75F, -1.75F, 5.0F, -1.0F, 5.0F, 1.0F, false);
        HEAD.setTextureOffset(10, 2).addCuboid(0.3859F, -7.917F, 3.9153F, 4.0F, 8.0F, 1.0F, 0.0F, false);
        HEAD.setTextureOffset(10, 2).addCuboid(-0.5141F, -7.917F, 3.9153F, 1.0F, 8.0F, 1.0F, 0.0F, false);
        HEAD.setTextureOffset(11, 2).addCuboid(-4.4141F, -7.917F, 3.9153F, 4.0F, 8.0F, 1.0F, 0.0F, false);
        HEAD.setTextureOffset(3, 3).addCuboid(-3.5F, 0.15F, -3.0F, 7.0F, -1.0F, 6.0F, 1.0F, false);

        LeftHelmetHorn6_r1 = new ModelPart(this);
        LeftHelmetHorn6_r1.setPivot(4.2672F, -7.475F, -4.0664F);
        HEAD.addChild(LeftHelmetHorn6_r1);
        setRotationAngle(LeftHelmetHorn6_r1, 0.0F, -0.6545F, 0.0F);
        LeftHelmetHorn6_r1.setTextureOffset(34, 56).addCuboid(-1.05F, -1.075F, -0.7F, 2.0F, 2.0F, 3.0F, -0.1F, false);

        LeftHelmetHorn5_r1 = new ModelPart(this);
        LeftHelmetHorn5_r1.setPivot(4.698F, -7.525F, -5.1575F);
        HEAD.addChild(LeftHelmetHorn5_r1);
        setRotationAngle(LeftHelmetHorn5_r1, 0.0F, -0.6109F, 0.0F);
        LeftHelmetHorn5_r1.setTextureOffset(36, 56).addCuboid(-0.75F, -1.075F, -0.2F, 2.0F, 2.0F, 1.0F, -0.2F, false);

        LeftHelmetHorn4_r1 = new ModelPart(this);
        LeftHelmetHorn4_r1.setPivot(7.2166F, -7.825F, -5.5363F);
        HEAD.addChild(LeftHelmetHorn4_r1);
        setRotationAngle(LeftHelmetHorn4_r1, 0.0F, -0.4014F, 0.0F);
        LeftHelmetHorn4_r1.setTextureOffset(34, 55).addCuboid(-2.95F, -0.775F, 0.2F, 2.0F, 2.0F, 2.0F, -0.3F, false);

        LeftHelmetHorn3_r1 = new ModelPart(this);
        LeftHelmetHorn3_r1.setPivot(7.4742F, -8.0283F, -6.143F);
        HEAD.addChild(LeftHelmetHorn3_r1);
        setRotationAngle(LeftHelmetHorn3_r1, 0.7854F, -0.4014F, 0.0F);
        LeftHelmetHorn3_r1.setTextureOffset(33, 59).addCuboid(-2.45F, 0.575F, 0.05F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        LeftHelmetHorn2_r1 = new ModelPart(this);
        LeftHelmetHorn2_r1.setPivot(8.4822F, -8.488F, -6.2144F);
        HEAD.addChild(LeftHelmetHorn2_r1);
        setRotationAngle(LeftHelmetHorn2_r1, 0.7854F, -0.4014F, 0.0F);
        LeftHelmetHorn2_r1.setTextureOffset(33, 59).addCuboid(-3.35F, 0.325F, 0.05F, 1.0F, 1.0F, 1.0F, -0.1F, false);

        LeftHelmetHorn1_r1 = new ModelPart(this);
        LeftHelmetHorn1_r1.setPivot(5.6148F, -9.584F, -7.3931F);
        HEAD.addChild(LeftHelmetHorn1_r1);
        setRotationAngle(LeftHelmetHorn1_r1, 0.7854F, -0.4014F, 0.0F);
        LeftHelmetHorn1_r1.setTextureOffset(33, 59).addCuboid(-0.25F, 0.375F, -0.75F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        RightHelmetHorn6_r1 = new ModelPart(this);
        RightHelmetHorn6_r1.setPivot(-4.2672F, -7.475F, -4.0664F);
        HEAD.addChild(RightHelmetHorn6_r1);
        setRotationAngle(RightHelmetHorn6_r1, 0.0F, 0.6545F, 0.0F);
        RightHelmetHorn6_r1.setTextureOffset(34, 56).addCuboid(-0.95F, -1.075F, -0.7F, 2.0F, 2.0F, 3.0F, -0.1F, true);

        RightHelmetHorn5_r1 = new ModelPart(this);
        RightHelmetHorn5_r1.setPivot(-4.698F, -7.525F, -5.1575F);
        HEAD.addChild(RightHelmetHorn5_r1);
        setRotationAngle(RightHelmetHorn5_r1, 0.0F, 0.6109F, 0.0F);
        RightHelmetHorn5_r1.setTextureOffset(36, 56).addCuboid(-1.25F, -1.075F, -0.2F, 2.0F, 2.0F, 1.0F, -0.2F, true);

        RightHelmetHorn4_r1 = new ModelPart(this);
        RightHelmetHorn4_r1.setPivot(-7.2166F, -7.825F, -5.5363F);
        HEAD.addChild(RightHelmetHorn4_r1);
        setRotationAngle(RightHelmetHorn4_r1, 0.0F, 0.4014F, 0.0F);
        RightHelmetHorn4_r1.setTextureOffset(34, 55).addCuboid(0.95F, -0.775F, 0.2F, 2.0F, 2.0F, 2.0F, -0.3F, true);

        RightHelmetHorn3_r1 = new ModelPart(this);
        RightHelmetHorn3_r1.setPivot(-7.4742F, -8.0283F, -6.143F);
        HEAD.addChild(RightHelmetHorn3_r1);
        setRotationAngle(RightHelmetHorn3_r1, 0.7854F, 0.4014F, 0.0F);
        RightHelmetHorn3_r1.setTextureOffset(33, 59).addCuboid(1.45F, 0.575F, 0.05F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        RightHelmetHorn2_r1 = new ModelPart(this);
        RightHelmetHorn2_r1.setPivot(-8.4822F, -8.488F, -6.2144F);
        HEAD.addChild(RightHelmetHorn2_r1);
        setRotationAngle(RightHelmetHorn2_r1, 0.7854F, 0.4014F, 0.0F);
        RightHelmetHorn2_r1.setTextureOffset(33, 59).addCuboid(2.35F, 0.325F, 0.05F, 1.0F, 1.0F, 1.0F, -0.1F, true);

        RightHelmetHorn1_r1 = new ModelPart(this);
        RightHelmetHorn1_r1.setPivot(-5.6148F, -9.584F, -7.3931F);
        HEAD.addChild(RightHelmetHorn1_r1);
        setRotationAngle(RightHelmetHorn1_r1, 0.7854F, 0.4014F, 0.0F);
        RightHelmetHorn1_r1.setTextureOffset(33, 59).addCuboid(-0.75F, 0.375F, -0.75F, 1.0F, 1.0F, 1.0F, -0.2F, true);

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
        Helmetrightside6_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(Helmetrightside6_r1);
        setRotationAngle(Helmetrightside6_r1, -0.0254F, 0.3482F, -0.0743F);
        Helmetrightside6_r1.setTextureOffset(13, 4).addCuboid(-5.5613F, 1.097F, -1.4512F, 1.0F, 4.0F, 3.0F, 0.0F, false);

        Helmetrightside5_r1 = new ModelPart(this);
        Helmetrightside5_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(Helmetrightside5_r1);
        setRotationAngle(Helmetrightside5_r1, 0.0F, 0.3491F, 0.0F);
        Helmetrightside5_r1.setTextureOffset(12, 4).addCuboid(-5.4712F, -0.5177F, -1.4512F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        Helmetrightside4_r1 = new ModelPart(this);
        Helmetrightside4_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(Helmetrightside4_r1);
        setRotationAngle(Helmetrightside4_r1, 0.0254F, 0.3482F, 0.0743F);
        Helmetrightside4_r1.setTextureOffset(12, 4).addCuboid(-5.494F, -2.1348F, -1.4512F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        Helmetrightside3_r1 = new ModelPart(this);
        Helmetrightside3_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(Helmetrightside3_r1);
        setRotationAngle(Helmetrightside3_r1, 0.0061F, -0.0871F, -0.0701F);
        Helmetrightside3_r1.setTextureOffset(11, 2).addCuboid(-5.6617F, 1.09F, -5.0031F, 1.0F, 4.0F, 6.0F, 0.0F, false);

        Helmetrightside2_r1 = new ModelPart(this);
        Helmetrightside2_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(Helmetrightside2_r1);
        setRotationAngle(Helmetrightside2_r1, 0.0F, -0.0873F, 0.0F);
        Helmetrightside2_r1.setTextureOffset(11, 3).addCuboid(-5.5719F, -0.5177F, -5.0031F, 1.0F, 2.0F, 6.0F, 0.0F, false);

        Helmetrightside1_r1 = new ModelPart(this);
        Helmetrightside1_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(Helmetrightside1_r1);
        setRotationAngle(Helmetrightside1_r1, -0.0061F, -0.0871F, 0.0701F);
        Helmetrightside1_r1.setTextureOffset(11, 3).addCuboid(-5.5944F, -2.1278F, -5.0031F, 1.0F, 2.0F, 6.0F, 0.0F, false);

        HelmetFaceguard8_r1 = new ModelPart(this);
        HelmetFaceguard8_r1.setPivot(-4.4376F, -4.9379F, -3.9241F);
        HEAD.addChild(HelmetFaceguard8_r1);
        setRotationAngle(HelmetFaceguard8_r1, 0.0873F, 0.2182F, 0.0F);
        HelmetFaceguard8_r1.setTextureOffset(14, 6).addCuboid(-0.3F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        HelmetFaceguard7_r1 = new ModelPart(this);
        HelmetFaceguard7_r1.setPivot(4.2831F, -4.9379F, -3.9241F);
        HEAD.addChild(HelmetFaceguard7_r1);
        setRotationAngle(HelmetFaceguard7_r1, 0.0873F, -0.2182F, 0.0F);
        HelmetFaceguard7_r1.setTextureOffset(14, 5).addCuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        HelmetFaceguard6_r1 = new ModelPart(this);
        HelmetFaceguard6_r1.setPivot(0.2043F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetFaceguard6_r1);
        setRotationAngle(HelmetFaceguard6_r1, -0.7734F, -1.2635F, 0.7974F);
        HelmetFaceguard6_r1.setTextureOffset(10, 3).addCuboid(-6.7971F, -1.067F, -1.3235F, 1.0F, 2.0F, 5.0F, 0.0F, false);

        HelmetFaceguard5_r1 = new ModelPart(this);
        HelmetFaceguard5_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetFaceguard5_r1);
        setRotationAngle(HelmetFaceguard5_r1, -0.7734F, 1.2635F, -0.7974F);
        HelmetFaceguard5_r1.setTextureOffset(10, 4).addCuboid(5.7573F, -1.0758F, -1.5074F, 1.0F, 2.0F, 5.0F, 0.0F, false);

        HelmetFaceguard4_r1 = new ModelPart(this);
        HelmetFaceguard4_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetFaceguard4_r1);
        setRotationAngle(HelmetFaceguard4_r1, -0.1561F, -1.3499F, 0.16F);
        HelmetFaceguard4_r1.setTextureOffset(12, 4).addCuboid(-6.5863F, 0.7132F, -1.4565F, 1.0F, 1.0F, 5.0F, 0.0F, false);

        HelmetFaceguard3_r1 = new ModelPart(this);
        HelmetFaceguard3_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetFaceguard3_r1);
        setRotationAngle(HelmetFaceguard3_r1, -0.1943F, 1.3484F, -0.1991F);
        HelmetFaceguard3_r1.setTextureOffset(12, 5).addCuboid(5.5644F, 0.7703F, -1.487F, 1.0F, 1.0F, 5.0F, 0.0F, false);

        HelmetFaceguard2_r1 = new ModelPart(this);
        HelmetFaceguard2_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetFaceguard2_r1);
        setRotationAngle(HelmetFaceguard2_r1, 2.8529F, -1.3419F, -2.858F);
        HelmetFaceguard2_r1.setTextureOffset(12, 3).addCuboid(-6.7133F, 1.0399F, -3.4878F, 1.0F, 4.0F, 5.0F, 0.0F, false);

        HelmetFaceguard1_r1 = new ModelPart(this);
        HelmetFaceguard1_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetFaceguard1_r1);
        setRotationAngle(HelmetFaceguard1_r1, 0.3048F, -1.3419F, -0.3125F);
        HelmetFaceguard1_r1.setTextureOffset(15, 3).addCuboid(-6.7293F, 1.0154F, -1.4565F, 1.0F, 4.0F, 5.0F, 0.0F, false);

        HelmetBlack2_r1 = new ModelPart(this);
        HelmetBlack2_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetBlack2_r1);
        setRotationAngle(HelmetBlack2_r1, 0.0F, -1.3526F, 0.0F);
        HelmetBlack2_r1.setTextureOffset(2, 47).addCuboid(-6.2611F, -0.4697F, -1.3565F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        HelmetBlack1_r1 = new ModelPart(this);
        HelmetBlack1_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetBlack1_r1);
        setRotationAngle(HelmetBlack1_r1, 0.0F, 1.3526F, 0.0F);
        HelmetBlack1_r1.setTextureOffset(2, 47).addCuboid(5.2537F, -0.4697F, -1.3897F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        BODY = new ModelPart(this);
        BODY.setPivot(0.0F, 0.0F, 0.0F);
        BODY.setTextureOffset(9, 8).addCuboid(-3.0F, 9.2F, -1.05F, 6.0F, 2.0F, 2.0F, 1.2F, false);
        BODY.setTextureOffset(7, 3).addCuboid(-3.5F, 0.8F, -1.6F, 7.0F, 7.0F, 3.0F, 1.1F, false);
        BODY.setTextureOffset(9, 7).addCuboid(-3.5F, 0.8F, -1.8F, 7.0F, 4.0F, -1.0F, 1.2F, false);
        BODY.setTextureOffset(37, 58).addCuboid(2.5F, 3.0F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        BODY.setTextureOffset(37, 58).addCuboid(0.5F, 3.0F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        BODY.setTextureOffset(37, 58).addCuboid(-1.5F, 3.0F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        BODY.setTextureOffset(37, 58).addCuboid(-3.5F, 3.0F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        RIGHTARM = new ModelPart(this);
        RIGHTARM.setPivot(-5.0F, 2.0F, 0.0F);
        RIGHTARM.setTextureOffset(7, 33).addCuboid(-3.0541F, 1.9548F, -2.0F, 4.0F, 2.0F, 4.0F, 0.4F, false);
        RIGHTARM.setTextureOffset(11, 10).addCuboid(-3.0541F, 4.4548F, -2.0F, 4.0F, 2.0F, 4.0F, 0.2F, false);
        RIGHTARM.setTextureOffset(35, 34).addCuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.1F, false);

        LEFTARM = new ModelPart(this);
        LEFTARM.setPivot(5.0F, 2.0F, 0.0F);
        LEFTARM.setTextureOffset(7, 33).addCuboid(-0.9459F, 1.9548F, -2.0F, 4.0F, 2.0F, 4.0F, 0.4F, true);
        LEFTARM.setTextureOffset(11, 10).addCuboid(-0.9459F, 4.4548F, -2.0F, 4.0F, 2.0F, 4.0F, 0.2F, true);
        LEFTARM.setTextureOffset(35, 34).addCuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.1F, true);

        RIGHTLEG = new ModelPart(this);
        RIGHTLEG.setPivot(-1.9F, 12.0F, 0.0F);
        RIGHTLEG.setTextureOffset(10, 34).addCuboid(-1.55F, 1.5F, -1.05F, 3.0F, 4.0F, 2.0F, 1.2F, true);
        RIGHTLEG.setTextureOffset(2, 53).addCuboid(-2.1F, 0.45F, -1.5F, 4.0F, -1.0F, 3.0F, 1.01F, true);
        RIGHTLEG.setTextureOffset(31, 35).addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.1F, false);
        RIGHTLEG.setTextureOffset(5, 31).addCuboid(-2.5F, 8.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
        RIGHTLEG.setTextureOffset(7, 34).addCuboid(-2.5F, 8.9F, -2.5F, 5.0F, 1.0F, 5.0F, -0.1F, false);
        RIGHTLEG.setTextureOffset(8, 33).addCuboid(-2.1F, 9.5F, -2.1F, 4.0F, 1.0F, 4.0F, 0.1F, false);
        RIGHTLEG.setTextureOffset(29, 56).addCuboid(-2.5F, 7.75F, -2.5F, 5.0F, 1.0F, 5.0F, -0.1F, false);

        RightLeg3_r1 = new ModelPart(this);
        RightLeg3_r1.setPivot(-2.1388F, 5.0397F, -0.25F);
        RIGHTLEG.addChild(RightLeg3_r1);
        setRotationAngle(RightLeg3_r1, 0.0F, 0.0F, -0.3927F);
        RightLeg3_r1.setTextureOffset(10, 34).addCuboid(0.0F, 0.1F, -0.8F, 0.0F, 0.0F, 2.0F, 1.2F, true);

        RightLeg1_r1 = new ModelPart(this);
        RightLeg1_r1.setPivot(-2.0707F, 2.5521F, -0.25F);
        RIGHTLEG.addChild(RightLeg1_r1);
        setRotationAngle(RightLeg1_r1, 0.0F, 0.0F, 0.192F);
        RightLeg1_r1.setTextureOffset(10, 34).addCuboid(0.0F, -1.0F, -0.8F, 0.0F, 2.0F, 2.0F, 1.2F, true);

        LEFTLEG = new ModelPart(this);
        LEFTLEG.setPivot(1.9F, 12.0F, 0.0F);
        LEFTLEG.setTextureOffset(10, 34).addCuboid(-1.45F, 1.5F, -1.05F, 3.0F, 4.0F, 2.0F, 1.2F, false);
        LEFTLEG.setTextureOffset(2, 53).addCuboid(-1.9F, 0.45F, -1.5F, 4.0F, -1.0F, 3.0F, 1.01F, false);
        LEFTLEG.setTextureOffset(31, 35).addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.1F, false);
        LEFTLEG.setTextureOffset(5, 31).addCuboid(-2.5F, 8.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, true);
        LEFTLEG.setTextureOffset(7, 34).addCuboid(-2.5F, 8.9F, -2.5F, 5.0F, 1.0F, 5.0F, -0.1F, true);
        LEFTLEG.setTextureOffset(8, 33).addCuboid(-2.1F, 9.5F, -2.1F, 4.0F, 1.0F, 4.0F, 0.1F, true);
        LEFTLEG.setTextureOffset(29, 56).addCuboid(-2.5F, 7.75F, -2.5F, 5.0F, 1.0F, 5.0F, -0.1F, true);

        LeftLeg3_r1 = new ModelPart(this);
        LeftLeg3_r1.setPivot(2.1388F, 5.0397F, -0.25F);
        LEFTLEG.addChild(LeftLeg3_r1);
        setRotationAngle(LeftLeg3_r1, 0.0F, 0.0F, 0.3927F);
        LeftLeg3_r1.setTextureOffset(10, 34).addCuboid(0.0F, 0.1F, -0.8F, 0.0F, 0.0F, 2.0F, 1.2F, false);

        LeftLeg1_r1 = new ModelPart(this);
        LeftLeg1_r1.setPivot(2.0707F, 2.5521F, -0.25F);
        LEFTLEG.addChild(LeftLeg1_r1);
        setRotationAngle(LeftLeg1_r1, 0.0F, 0.0F, -0.192F);
        LeftLeg1_r1.setTextureOffset(10, 34).addCuboid(0.0F, -1.0F, -0.8F, 0.0F, 2.0F, 2.0F, 1.2F, false);

        RIGHTFOOT = new ModelPart(this);
        RIGHTFOOT.setPivot(-1.9F, 12.0F, 0.0F);
        RIGHTFOOT.setTextureOffset(4, 58).addCuboid(-1.5F, 11.2F, -1.5F, 3.0F, 0.0F, 3.0F, 1.0F, true);
        RIGHTFOOT.setTextureOffset(4, 58).addCuboid(-1.5F, 11.5F, -3.15F, 3.0F, 0.0F, 0.0F, 0.7F, true);

        LEFTFOOT = new ModelPart(this);
        LEFTFOOT.setPivot(1.9F, 12.0F, 0.0F);
        LEFTFOOT.setTextureOffset(4, 58).addCuboid(-1.5F, 11.2F, -1.5F, 3.0F, 0.0F, 3.0F, 1.0F, false);
        LEFTFOOT.setTextureOffset(4, 58).addCuboid(-1.5F, 11.5F, -3.15F, 3.0F, 0.0F, 0.0F, 0.7F, false);

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
