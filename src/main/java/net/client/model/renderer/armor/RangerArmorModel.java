package net.client.model.renderer.armor;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;

public class RangerArmorModel extends RunecraftArmorModel{

    private final ModelPart HEAD;
    private final ModelPart Feather_r1;
    private final ModelPart Feather_r2;
    private final ModelPart Feather_r3;
    private final ModelPart Feather_r4;
    private final ModelPart Feather_r5;
    private final ModelPart Feather_r6;
    private final ModelPart FlatHat_r1;
    private final ModelPart FlatHat_r2;
    private final ModelPart FlatHat_r3;
    private final ModelPart FlatHat_r4;
    private final ModelPart SideHat_r1;
    private final ModelPart SideHat_r2;
    private final ModelPart SideHat_r3;
    private final ModelPart SideHat_r4;
    private final ModelPart SideHat_r5;
    private final ModelPart SideHat_r6;
    private final ModelPart SideHat_r7;
    private final ModelPart SideHat_r8;
    private final ModelPart SideHat_r9;
    private final ModelPart SideHat_r10;
    private final ModelPart SideHat_r11;
    private final ModelPart SideHat_r12;
    private final ModelPart SideHat_r13;
    private final ModelPart SideHat_r14;
    private final ModelPart SideHat_r15;
    private final ModelPart SideHat_r16;
    private final ModelPart SideHat_r17;
    private final ModelPart SideHat_r18;
    private final ModelPart TopHat_r1;
    private final ModelPart TopHat_r2;
    private final ModelPart TopHat_r3;
    private final ModelPart TopHat_r4;
    private final ModelPart TopHat_r5;
    private final ModelPart TopHat_r6;
    private final ModelPart TopHat_r7;
    private final ModelPart TopHat_r8;
    private final ModelPart TopHat_r9;
    private final ModelPart TopHat_r10;
    private final ModelPart TopHat_r11;
    private final ModelPart TopHat_r12;
    private final ModelPart TopHat_r13;
    private final ModelPart BODY;
    private final ModelPart Tunic5_r1;
    private final ModelPart Tunic4_r1;
    private final ModelPart RIGHTARM;
    private final ModelPart RightShoulder1_r1;
    private final ModelPart LEFTARM;
    private final ModelPart LeftShoulder2_r1;
    private final ModelPart RIGHTLEG;
    private final ModelPart RightLegKneecap_r1;
    private final ModelPart RightLegKneecap_r2;
    private final ModelPart LEFTLEG;
    private final ModelPart LeftLegKneecap_r1;
    private final ModelPart LeftLegKneecap_r2;
    private final ModelPart RIGHTFOOT;
    private final ModelPart RightBoot3_r1;
    private final ModelPart LEFTFOOT;
    private final ModelPart LeftBoot3_r1;

    public RangerArmorModel(EquipmentSlot slot) {
        super(slot);

        textureWidth = 64;
        textureHeight = 64;

        HEAD = new ModelPart(this);
        HEAD.setPivot(0.0F, 0.0F, 0.0F);
        HEAD.setTextureOffset(11, 55).addCuboid(-1.5638F, -6.2F, 4.0095F, 1.0F, 0.0F, 1.0F, 0.9F, false);
        HEAD.setTextureOffset(11, 55).addCuboid(0.5638F, -6.2F, 4.0095F, 1.0F, 0.0F, 1.0F, 0.9F, true);
        HEAD.setTextureOffset(15, 14).addCuboid(-2.0F, -7.2F, 4.35F, 4.0F, -1.0F, 0.0F, 0.9F, true);
        HEAD.setTextureOffset(15, 14).addCuboid(0.5F, -7.2F, -5.65F, -1.0F, -1.0F, 2.0F, 0.9F, true);

        Feather_r1 = new ModelPart(this);
        Feather_r1.setPivot(1.9046F, -9.7639F, -0.8251F);
        HEAD.addChild(Feather_r1);
        setRotationAngle(Feather_r1, 0.0957F, 0.4072F, 0.07F);
        Feather_r1.setTextureOffset(6, 49).addCuboid(0.0F, 0.0F, -1.2F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        Feather_r1.setTextureOffset(4, 48).addCuboid(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);

        Feather_r2 = new ModelPart(this);
        Feather_r2.setPivot(2.2414F, -9.4803F, -1.2626F);
        HEAD.addChild(Feather_r2);
        setRotationAngle(Feather_r2, 0.8549F, 0.4072F, 0.07F);
        Feather_r2.setTextureOffset(4, 48).addCuboid(-0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 3.0F, 0.1F, false);

        Feather_r3 = new ModelPart(this);
        Feather_r3.setPivot(2.7342F, -10.9039F, 0.9086F);
        HEAD.addChild(Feather_r3);
        setRotationAngle(Feather_r3, 0.4186F, 0.4072F, 0.07F);
        Feather_r3.setTextureOffset(4, 48).addCuboid(0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.1F, false);

        Feather_r4 = new ModelPart(this);
        Feather_r4.setPivot(3.3987F, -11.2665F, 2.3867F);
        HEAD.addChild(Feather_r4);
        setRotationAngle(Feather_r4, 0.1568F, 0.4072F, 0.07F);
        Feather_r4.setTextureOffset(4, 48).addCuboid(0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.1F, false);

        Feather_r5 = new ModelPart(this);
        Feather_r5.setPivot(3.1347F, -10.8939F, 1.8366F);
        HEAD.addChild(Feather_r5);
        setRotationAngle(Feather_r5, -0.6723F, 0.4072F, 0.07F);
        Feather_r5.setTextureOffset(4, 48).addCuboid(0.0F, -0.7F, -0.7F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        Feather_r5.setTextureOffset(4, 48).addCuboid(0.0F, 0.3F, -1.6F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        Feather_r5.setTextureOffset(4, 48).addCuboid(0.0F, -0.2F, -1.2F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        Feather_r5.setTextureOffset(4, 48).addCuboid(0.0F, 0.9F, -1.9F, 0.0F, 1.0F, 1.0F, 0.0F, false);

        Feather_r6 = new ModelPart(this);
        Feather_r6.setPivot(2.0639F, -10.3912F, -0.5584F);
        HEAD.addChild(Feather_r6);
        setRotationAngle(Feather_r6, -0.1487F, 0.4072F, 0.07F);
        Feather_r6.setTextureOffset(4, 48).addCuboid(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);

        FlatHat_r1 = new ModelPart(this);
        FlatHat_r1.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(FlatHat_r1);
        setRotationAngle(FlatHat_r1, 0.0F, -0.7854F, 0.0F);
        FlatHat_r1.setTextureOffset(15, 14).addCuboid(4.6444F, 1.0806F, -0.4568F, 0.0F, -1.0F, 1.0F, 1.0F, true);
        FlatHat_r1.setTextureOffset(11, 55).addCuboid(-1.0821F, 1.4806F, 4.4024F, 3.0F, 1.0F, 1.0F, 0.4F, false);

        FlatHat_r2 = new ModelPart(this);
        FlatHat_r2.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(FlatHat_r2);
        setRotationAngle(FlatHat_r2, 0.0F, 0.3491F, 0.0F);
        FlatHat_r2.setTextureOffset(15, 14).addCuboid(2.5947F, 1.0806F, -3.8883F, 0.0F, -1.0F, 7.0F, 1.0F, true);
        FlatHat_r2.setTextureOffset(15, 14).addCuboid(3.3947F, 1.2806F, -7.0883F, -1.0F, -2.0F, 1.0F, 1.2F, true);

        FlatHat_r3 = new ModelPart(this);
        FlatHat_r3.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(FlatHat_r3);
        setRotationAngle(FlatHat_r3, 0.0F, 0.7854F, 0.0F);
        FlatHat_r3.setTextureOffset(15, 14).addCuboid(-4.6444F, 1.0806F, -0.4568F, 0.0F, -1.0F, 1.0F, 1.0F, false);
        FlatHat_r3.setTextureOffset(11, 55).addCuboid(-1.918F, 1.4806F, 4.4023F, 3.0F, 1.0F, 1.0F, 0.4F, true);

        FlatHat_r4 = new ModelPart(this);
        FlatHat_r4.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(FlatHat_r4);
        setRotationAngle(FlatHat_r4, 0.0F, -0.3491F, 0.0F);
        FlatHat_r4.setTextureOffset(15, 14).addCuboid(-2.5948F, 1.0806F, -3.8883F, 0.0F, -1.0F, 7.0F, 1.0F, false);
        FlatHat_r4.setTextureOffset(15, 14).addCuboid(-2.3948F, 1.2806F, -7.0883F, -1.0F, -2.0F, 1.0F, 1.2F, false);

        SideHat_r1 = new ModelPart(this);
        SideHat_r1.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(SideHat_r1);
        setRotationAngle(SideHat_r1, 0.0F, -0.3491F, 0.0F);
        SideHat_r1.setTextureOffset(11, 55).addCuboid(-3.3954F, 1.4806F, 4.2324F, 0.0F, 1.0F, 0.0F, 0.4F, true);

        SideHat_r2 = new ModelPart(this);
        SideHat_r2.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(SideHat_r2);
        setRotationAngle(SideHat_r2, -1.0908F, -0.3491F, 0.0F);
        SideHat_r2.setTextureOffset(11, 55).addCuboid(-3.3954F, 7.6118F, -3.2376F, 0.0F, 0.0F, 1.0F, 0.4F, true);

        SideHat_r3 = new ModelPart(this);
        SideHat_r3.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(SideHat_r3);
        setRotationAngle(SideHat_r3, -1.0908F, 0.3491F, 0.0F);
        SideHat_r3.setTextureOffset(11, 55).addCuboid(3.3954F, 7.6118F, -3.2376F, 0.0F, 0.0F, 1.0F, 0.4F, false);

        SideHat_r4 = new ModelPart(this);
        SideHat_r4.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(SideHat_r4);
        setRotationAngle(SideHat_r4, 0.1745F, 0.3491F, 0.0F);
        SideHat_r4.setTextureOffset(11, 55).addCuboid(3.3954F, 0.2566F, -7.7936F, 0.0F, 0.0F, 5.0F, 0.4F, false);
        SideHat_r4.setTextureOffset(11, 55).addCuboid(3.5954F, -1.7434F, -7.4936F, 0.0F, 2.0F, 5.0F, 0.1F, false);

        SideHat_r5 = new ModelPart(this);
        SideHat_r5.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(SideHat_r5);
        setRotationAngle(SideHat_r5, 0.7854F, -0.3491F, 0.0F);
        SideHat_r5.setTextureOffset(11, 55).addCuboid(-3.4954F, -5.6655F, -6.363F, 0.0F, 1.0F, 1.0F, 0.2F, true);

        SideHat_r6 = new ModelPart(this);
        SideHat_r6.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(SideHat_r6);
        setRotationAngle(SideHat_r6, 0.7854F, 0.3491F, 0.0F);
        SideHat_r6.setTextureOffset(11, 55).addCuboid(3.4954F, -5.6655F, -6.363F, 0.0F, 1.0F, 1.0F, 0.2F, false);

        SideHat_r7 = new ModelPart(this);
        SideHat_r7.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(SideHat_r7);
        setRotationAngle(SideHat_r7, 0.0F, 1.5708F, 0.0F);
        SideHat_r7.setTextureOffset(11, 55).addCuboid(-5.291F, -0.744F, -2.7084F, 0.0F, 3.0F, 3.0F, 0.1F, true);

        SideHat_r8 = new ModelPart(this);
        SideHat_r8.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(SideHat_r8);
        setRotationAngle(SideHat_r8, 0.0F, 0.7854F, 0.0F);
        SideHat_r8.setTextureOffset(11, 55).addCuboid(-5.6979F, -0.744F, -1.2738F, 0.0F, 2.0F, 3.0F, 0.1F, true);

        SideHat_r9 = new ModelPart(this);
        SideHat_r9.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(SideHat_r9);
        setRotationAngle(SideHat_r9, -0.1745F, -0.3491F, 0.0F);
        SideHat_r9.setTextureOffset(11, 55).addCuboid(-3.5954F, -1.5428F, 1.3565F, 0.0F, 3.0F, 3.0F, 0.1F, true);

        SideHat_r10 = new ModelPart(this);
        SideHat_r10.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(SideHat_r10);
        setRotationAngle(SideHat_r10, -0.1745F, 0.3491F, 0.0F);
        SideHat_r10.setTextureOffset(11, 55).addCuboid(3.5954F, -1.5428F, 1.3565F, 0.0F, 3.0F, 3.0F, 0.1F, false);

        SideHat_r11 = new ModelPart(this);
        SideHat_r11.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(SideHat_r11);
        setRotationAngle(SideHat_r11, 0.0F, 0.3491F, 0.0F);
        SideHat_r11.setTextureOffset(11, 55).addCuboid(3.5954F, -1.2997F, -2.5773F, 0.0F, 3.0F, 4.0F, 0.1F, false);
        SideHat_r11.setTextureOffset(11, 55).addCuboid(3.3954F, 0.6745F, -1.9821F, 0.0F, 0.0F, 1.0F, 0.4F, false);

        SideHat_r12 = new ModelPart(this);
        SideHat_r12.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(SideHat_r12);
        setRotationAngle(SideHat_r12, 0.0F, -0.7854F, 0.0F);
        SideHat_r12.setTextureOffset(11, 55).addCuboid(5.6978F, -0.744F, -1.2738F, 0.0F, 2.0F, 3.0F, 0.1F, false);

        SideHat_r13 = new ModelPart(this);
        SideHat_r13.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(SideHat_r13);
        setRotationAngle(SideHat_r13, 0.0F, -1.5708F, 0.0F);
        SideHat_r13.setTextureOffset(11, 55).addCuboid(5.291F, -0.744F, -2.7084F, 0.0F, 3.0F, 3.0F, 0.1F, false);

        SideHat_r14 = new ModelPart(this);
        SideHat_r14.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(SideHat_r14);
        setRotationAngle(SideHat_r14, 0.0F, -0.3491F, 0.0F);
        SideHat_r14.setTextureOffset(11, 55).addCuboid(-3.5954F, -1.2997F, -2.5773F, 0.0F, 3.0F, 4.0F, 0.1F, true);
        SideHat_r14.setTextureOffset(11, 55).addCuboid(-3.3954F, 0.6745F, -1.9821F, 0.0F, 0.0F, 1.0F, 0.4F, true);

        SideHat_r15 = new ModelPart(this);
        SideHat_r15.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(SideHat_r15);
        setRotationAngle(SideHat_r15, 0.1745F, -0.3491F, 0.0F);
        SideHat_r15.setTextureOffset(11, 55).addCuboid(-3.5954F, -1.7434F, -7.4936F, 0.0F, 2.0F, 5.0F, 0.1F, true);
        SideHat_r15.setTextureOffset(11, 55).addCuboid(-3.3954F, 0.2566F, -7.7936F, 0.0F, 0.0F, 5.0F, 0.4F, true);

        SideHat_r16 = new ModelPart(this);
        SideHat_r16.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(SideHat_r16);
        setRotationAngle(SideHat_r16, -0.1745F, -0.3491F, 0.0F);
        SideHat_r16.setTextureOffset(11, 55).addCuboid(-3.3954F, 0.7714F, -0.1256F, 0.0F, 1.0F, 4.0F, 0.4F, true);

        SideHat_r17 = new ModelPart(this);
        SideHat_r17.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(SideHat_r17);
        setRotationAngle(SideHat_r17, 0.0F, 0.3491F, 0.0F);
        SideHat_r17.setTextureOffset(11, 55).addCuboid(3.3954F, 1.4806F, 4.2324F, 0.0F, 1.0F, 0.0F, 0.4F, false);

        SideHat_r18 = new ModelPart(this);
        SideHat_r18.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(SideHat_r18);
        setRotationAngle(SideHat_r18, -0.1745F, 0.3491F, 0.0F);
        SideHat_r18.setTextureOffset(11, 55).addCuboid(3.3954F, 0.7714F, -0.1256F, 0.0F, 1.0F, 4.0F, 0.4F, false);

        TopHat_r1 = new ModelPart(this);
        TopHat_r1.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(TopHat_r1);
        setRotationAngle(TopHat_r1, 0.48F, -0.3491F, 0.0F);
        TopHat_r1.setTextureOffset(8, 53).addCuboid(-1.4557F, -2.4801F, -2.4663F, 0.0F, 3.0F, 5.0F, 0.4F, true);
        TopHat_r1.setTextureOffset(10, 54).addCuboid(-0.6557F, -2.4801F, -1.4663F, 0.0F, 3.0F, 4.0F, 0.4F, true);
        TopHat_r1.setTextureOffset(9, 59).addCuboid(0.1443F, -2.4801F, 0.5337F, 0.0F, 3.0F, 2.0F, 0.4F, true);

        TopHat_r2 = new ModelPart(this);
        TopHat_r2.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(TopHat_r2);
        setRotationAngle(TopHat_r2, 0.48F, 0.3491F, 0.0F);
        TopHat_r2.setTextureOffset(11, 55).addCuboid(-0.1443F, -2.4801F, 0.5337F, 0.0F, 3.0F, 2.0F, 0.4F, false);
        TopHat_r2.setTextureOffset(9, 54).addCuboid(0.6557F, -2.4801F, -1.4663F, 0.0F, 3.0F, 4.0F, 0.4F, false);
        TopHat_r2.setTextureOffset(9, 54).addCuboid(1.4557F, -2.4801F, -2.4663F, 0.0F, 3.0F, 5.0F, 0.4F, false);

        TopHat_r3 = new ModelPart(this);
        TopHat_r3.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(TopHat_r3);
        setRotationAngle(TopHat_r3, -0.5592F, -0.1832F, -0.8646F);
        TopHat_r3.setTextureOffset(9, 59).addCuboid(2.5126F, -2.5752F, -0.2765F, 0.0F, 0.0F, 1.0F, 0.4F, false);

        TopHat_r4 = new ModelPart(this);
        TopHat_r4.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(TopHat_r4);
        setRotationAngle(TopHat_r4, -0.5592F, 0.1832F, 0.8646F);
        TopHat_r4.setTextureOffset(9, 59).addCuboid(-2.5126F, -2.5752F, -0.2765F, 0.0F, 0.0F, 1.0F, 0.4F, true);

        TopHat_r5 = new ModelPart(this);
        TopHat_r5.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(TopHat_r5);
        setRotationAngle(TopHat_r5, -0.48F, -0.3491F, 0.0F);
        TopHat_r5.setTextureOffset(8, 54).addCuboid(-1.4557F, -3.6551F, -0.2765F, 2.0F, 3.0F, 3.0F, 0.4F, true);
        TopHat_r5.setTextureOffset(9, 59).addCuboid(1.3443F, -3.6551F, 0.7235F, 0.0F, 3.0F, 2.0F, 0.4F, true);

        TopHat_r6 = new ModelPart(this);
        TopHat_r6.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(TopHat_r6);
        setRotationAngle(TopHat_r6, -0.48F, 0.3491F, 0.0F);
        TopHat_r6.setTextureOffset(8, 54).addCuboid(-0.5443F, -3.6551F, -0.2765F, 2.0F, 3.0F, 3.0F, 0.4F, false);
        TopHat_r6.setTextureOffset(9, 59).addCuboid(-1.3443F, -3.6551F, 0.7235F, 0.0F, 3.0F, 2.0F, 0.4F, false);

        TopHat_r7 = new ModelPart(this);
        TopHat_r7.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(TopHat_r7);
        setRotationAngle(TopHat_r7, -2.7925F, -0.3491F, 0.0F);
        TopHat_r7.setTextureOffset(9, 59).addCuboid(1.3443F, 2.1011F, -2.8083F, 0.0F, 0.0F, 0.0F, 0.4F, true);

        TopHat_r8 = new ModelPart(this);
        TopHat_r8.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(TopHat_r8);
        setRotationAngle(TopHat_r8, -2.7925F, 0.3491F, 0.0F);
        TopHat_r8.setTextureOffset(9, 59).addCuboid(-1.3443F, 2.1011F, -2.8082F, 0.0F, 0.0F, 0.0F, 0.4F, false);

        TopHat_r9 = new ModelPart(this);
        TopHat_r9.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(TopHat_r9);
        setRotationAngle(TopHat_r9, -0.5436F, -0.2289F, -0.9405F);
        TopHat_r9.setTextureOffset(9, 59).addCuboid(2.3914F, -3.0197F, 0.7235F, 0.0F, 3.0F, 2.0F, 0.4F, false);

        TopHat_r10 = new ModelPart(this);
        TopHat_r10.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(TopHat_r10);
        setRotationAngle(TopHat_r10, -0.5436F, 0.2289F, 0.9405F);
        TopHat_r10.setTextureOffset(9, 59).addCuboid(-2.3915F, -3.0196F, 0.7235F, 0.0F, 3.0F, 2.0F, 0.4F, true);

        TopHat_r11 = new ModelPart(this);
        TopHat_r11.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(TopHat_r11);
        setRotationAngle(TopHat_r11, 0.0F, 0.3491F, 0.0F);
        TopHat_r11.setTextureOffset(9, 59).addCuboid(-0.5443F, -1.7546F, 3.243F, 2.0F, 2.0F, 1.0F, 0.4F, false);

        TopHat_r12 = new ModelPart(this);
        TopHat_r12.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(TopHat_r12);
        setRotationAngle(TopHat_r12, 0.0F, 0.0F, 0.0F);
        TopHat_r12.setTextureOffset(9, 59).addCuboid(0.0006F, -1.4546F, 3.986F, 0.0F, 2.0F, 0.0F, 0.7F, false);

        TopHat_r13 = new ModelPart(this);
        TopHat_r13.setPivot(0.0F, -8.1806F, 0.1676F);
        HEAD.addChild(TopHat_r13);
        setRotationAngle(TopHat_r13, 0.0F, -0.3491F, 0.0F);
        TopHat_r13.setTextureOffset(7, 58).addCuboid(-1.4557F, -1.7546F, 3.243F, 2.0F, 2.0F, 1.0F, 0.4F, true);

        BODY = new ModelPart(this);
        BODY.setPivot(0.0F, 0.0F, 0.0F);
        BODY.setTextureOffset(2, 11).addCuboid(-3.0F, 9.3F, -1.05F, 6.0F, 2.0F, 2.0F, 1.2F, false);
        BODY.setTextureOffset(2, 11).addCuboid(-3.0F, 13.7F, -1.05F, 1.0F, 0.0F, 2.0F, 1.2F, false);
        BODY.setTextureOffset(2, 11).addCuboid(2.0F, 13.7F, -1.05F, 1.0F, 0.0F, 2.0F, 1.2F, true);
        BODY.setTextureOffset(2, 14).addCuboid(-3.5F, 0.8F, -1.6F, 7.0F, 7.0F, 3.0F, 1.1F, false);
        BODY.setTextureOffset(3, 3).addCuboid(-3.5F, 0.8F, -1.8F, 7.0F, 4.0F, -1.0F, 1.2F, false);
        BODY.setTextureOffset(4, 41).addCuboid(-4.0F, 11.45F, -1.5F, 8.0F, -1.0F, 3.0F, 1.01F, false);

        Tunic5_r1 = new ModelPart(this);
        Tunic5_r1.setPivot(0.0F, 10.3129F, -0.3312F);
        BODY.addChild(Tunic5_r1);
        setRotationAngle(Tunic5_r1, 0.0F, 0.0F, 0.6109F);
        Tunic5_r1.setTextureOffset(2, 11).addCuboid(0.3906F, 1.9666F, -0.7187F, 0.0F, 3.0F, 2.0F, 1.1F, false);

        Tunic4_r1 = new ModelPart(this);
        Tunic4_r1.setPivot(0.0F, 10.3129F, -0.3312F);
        BODY.addChild(Tunic4_r1);
        setRotationAngle(Tunic4_r1, 0.0F, 0.0F, -0.6109F);
        Tunic4_r1.setTextureOffset(2, 11).addCuboid(-0.3906F, 1.9666F, -0.7187F, 0.0F, 3.0F, 2.0F, 1.1F, true);

        RIGHTARM = new ModelPart(this);
        RIGHTARM.setPivot(-5.0F, 2.0F, 0.0F);
        RIGHTARM.setTextureOffset(20, 11).addCuboid(-2.5F, -1.5F, -2.0F, 3.0F, 2.0F, 4.0F, 0.6F, true);

        RightShoulder1_r1 = new ModelPart(this);
        RightShoulder1_r1.setPivot(-1.325F, -0.2F, 0.0F);
        RIGHTARM.addChild(RightShoulder1_r1);
        setRotationAngle(RightShoulder1_r1, 0.0F, 0.0F, -0.5236F);
        RightShoulder1_r1.setTextureOffset(8, 29).addCuboid(-2.075F, -1.9F, -2.0F, 4.0F, 1.0F, 4.0F, 0.7F, true);

        LEFTARM = new ModelPart(this);
        LEFTARM.setPivot(5.0F, 2.0F, 0.0F);
        LEFTARM.setTextureOffset(20, 11).addCuboid(-0.5F, -1.5F, -2.0F, 3.0F, 2.0F, 4.0F, 0.6F, false);

        LeftShoulder2_r1 = new ModelPart(this);
        LeftShoulder2_r1.setPivot(1.325F, -0.2F, 0.0F);
        LEFTARM.addChild(LeftShoulder2_r1);
        setRotationAngle(LeftShoulder2_r1, 0.0F, 0.0F, 0.5236F);
        LeftShoulder2_r1.setTextureOffset(8, 28).addCuboid(-1.925F, -1.9F, -2.0F, 4.0F, 1.0F, 4.0F, 0.7F, false);

        RIGHTLEG = new ModelPart(this);
        RIGHTLEG.setPivot(-1.9F, 12.0F, 0.0F);
        RIGHTLEG.setTextureOffset(23, 6).addCuboid(-2.0F, 4.45F, -2.0F, 4.0F, 7.0F, 4.0F, 0.2F, false);
        RIGHTLEG.setTextureOffset(2, 36).addCuboid(-2.0F, -0.05F, -2.0F, 4.0F, 5.0F, 4.0F, 0.1F, false);
        RIGHTLEG.setTextureOffset(3, 40).addCuboid(-2.0F, 7.25F, -2.0F, 4.0F, 0.0F, 4.0F, 0.3F, false);

        RightLegKneecap_r1 = new ModelPart(this);
        RightLegKneecap_r1.setPivot(-0.1671F, 5.2061F, 5.5284F);
        RIGHTLEG.addChild(RightLegKneecap_r1);
        setRotationAngle(RightLegKneecap_r1, 0.1745F, 0.0F, 0.0F);
        RightLegKneecap_r1.setTextureOffset(4, 3).addCuboid(-0.5F, -0.1F, -6.9F, 1.0F, 0.0F, 0.0F, 0.9F, false);

        RightLegKneecap_r2 = new ModelPart(this);
        RightLegKneecap_r2.setPivot(-0.1671F, 4.9269F, -1.4F);
        RIGHTLEG.addChild(RightLegKneecap_r2);
        setRotationAngle(RightLegKneecap_r2, -0.1745F, 0.0F, 0.0F);
        RightLegKneecap_r2.setTextureOffset(4, 3).addCuboid(-0.5F, -0.1F, 0.1F, 1.0F, 0.0F, 0.0F, 0.9F, false);

        LEFTLEG = new ModelPart(this);
        LEFTLEG.setPivot(1.9F, 12.0F, 0.0F);
        LEFTLEG.setTextureOffset(23, 6).addCuboid(-2.0F, 4.45F, -2.0F, 4.0F, 7.0F, 4.0F, 0.2F, true);
        LEFTLEG.setTextureOffset(2, 36).addCuboid(-2.0F, -0.05F, -2.0F, 4.0F, 5.0F, 4.0F, 0.1F, true);
        LEFTLEG.setTextureOffset(3, 40).addCuboid(-2.0F, 7.25F, -2.0F, 4.0F, 0.0F, 4.0F, 0.3F, true);

        LeftLegKneecap_r1 = new ModelPart(this);
        LeftLegKneecap_r1.setPivot(0.1671F, 5.2061F, 5.5284F);
        LEFTLEG.addChild(LeftLegKneecap_r1);
        setRotationAngle(LeftLegKneecap_r1, 0.1745F, 0.0F, 0.0F);
        LeftLegKneecap_r1.setTextureOffset(4, 3).addCuboid(-0.5F, -0.1F, -6.9F, 1.0F, 0.0F, 0.0F, 0.9F, true);

        LeftLegKneecap_r2 = new ModelPart(this);
        LeftLegKneecap_r2.setPivot(0.1671F, 4.9269F, -1.4F);
        LEFTLEG.addChild(LeftLegKneecap_r2);
        setRotationAngle(LeftLegKneecap_r2, -0.1745F, 0.0F, 0.0F);
        LeftLegKneecap_r2.setTextureOffset(4, 3).addCuboid(-0.5F, -0.1F, 0.1F, 1.0F, 0.0F, 0.0F, 0.9F, true);

        RIGHTFOOT = new ModelPart(this);
        RIGHTFOOT.setPivot(-1.9F, 12.0F, 0.0F);
        RIGHTFOOT.setTextureOffset(7, 55).addCuboid(-1.5F, 10.2F, -1.5F, 3.0F, 1.0F, 3.0F, 1.0F, true);
        RIGHTFOOT.setTextureOffset(7, 55).addCuboid(-1.5F, 11.2F, -3.15F, 3.0F, 0.0F, 0.0F, 0.9F, true);
        RIGHTFOOT.setTextureOffset(7, 55).addCuboid(-2.0F, 9.8F, -2.0F, 4.0F, -1.0F, 4.0F, 0.7F, true);

        RightBoot3_r1 = new ModelPart(this);
        RightBoot3_r1.setPivot(0.0F, 11.0815F, -2.9549F);
        RIGHTFOOT.addChild(RightBoot3_r1);
        setRotationAngle(RightBoot3_r1, -1.3526F, 0.0F, 0.0F);
        RightBoot3_r1.setTextureOffset(7, 55).addCuboid(-1.5F, 0.1F, -0.2F, 3.0F, 0.0F, 0.0F, 0.8F, true);

        LEFTFOOT = new ModelPart(this);
        LEFTFOOT.setPivot(1.9F, 12.0F, 0.0F);
        LEFTFOOT.setTextureOffset(8, 56).addCuboid(-1.5F, 10.2F, -1.5F, 3.0F, 1.0F, 3.0F, 1.0F, false);
        LEFTFOOT.setTextureOffset(8, 56).addCuboid(-1.5F, 11.2F, -3.15F, 3.0F, 0.0F, 0.0F, 0.9F, false);
        LEFTFOOT.setTextureOffset(8, 56).addCuboid(-2.0F, 9.8F, -2.0F, 4.0F, -1.0F, 4.0F, 0.7F, false);

        LeftBoot3_r1 = new ModelPart(this);
        LeftBoot3_r1.setPivot(0.0F, 11.0815F, -2.9549F);
        LEFTFOOT.addChild(LeftBoot3_r1);
        setRotationAngle(LeftBoot3_r1, -1.3526F, 0.0F, 0.0F);
        LeftBoot3_r1.setTextureOffset(8, 56).addCuboid(-1.5F, 0.1F, -0.2F, 3.0F, 0.0F, 0.0F, 0.8F, false);

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