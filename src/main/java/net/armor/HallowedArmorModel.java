package net.armor;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;

public class HallowedArmorModel extends EntityArmorModel {
    private final ModelPart HEAD;
    private final ModelPart HelmetLeftFeather1_r1;
    private final ModelPart HelmetLeftFeather2_r1;
    private final ModelPart HelmetLeftFeather3_r1;
    private final ModelPart HelmetLeftFeather4_r1;
    private final ModelPart HelmetLeftFeather5_r1;
    private final ModelPart HelmetLeftFeather6_r1;
    private final ModelPart HelmetRightFeather1_r1;
    private final ModelPart HelmetRightFeather2_r1;
    private final ModelPart HelmetRightFeather3_r1;
    private final ModelPart HelmetRightFeather4_r1;
    private final ModelPart HelmetRightFeather5_r1;
    private final ModelPart HelmetRightFeather6_r1;
    private final ModelPart HelmetRightTooth3_r1;
    private final ModelPart HelmetRightTooth2_r1;
    private final ModelPart HelmetRightTooth1_r1;
    private final ModelPart HelmetLeftTooth3_r1;
    private final ModelPart HelmetLeftTooth2_r1;
    private final ModelPart HelmetLeftTooth1_r1;
    private final ModelPart HelmetRightToothMount3_r1;
    private final ModelPart HelmetRightToothMount1_r1;
    private final ModelPart HelmetRightToothMount2_r1;
    private final ModelPart HelmetLeftToothMount3_r1;
    private final ModelPart HelmetLeftToothMount2_r1;
    private final ModelPart HelmetLeftToothMount1_r1;
    private final ModelPart HelmetLeftFeatherMount3_r1;
    private final ModelPart HelmetLeftFeatherMount2_r1;
    private final ModelPart HelmetLeftFeatherMount1_r1;
    private final ModelPart HelmetRightFeatherMount3_r1;
    private final ModelPart HelmetRightFeatherMount2_r1;
    private final ModelPart HelmetRightFeatherMount1_r1;
    private final ModelPart HelmetTop3_r1;
    private final ModelPart HelmetTop2_r1;
    private final ModelPart Helmetrightside6_r1;
    private final ModelPart Helmetrightside5_r1;
    private final ModelPart Helmetrightside4_r1;
    private final ModelPart Helmetrightside3_r1;
    private final ModelPart Helmetrightside2_r1;
    private final ModelPart Helmetrightside1_r1;
    private final ModelPart Helmetleftside6_r1;
    private final ModelPart Helmetleftside5_r1;
    private final ModelPart Helmetleftside4_r1;
    private final ModelPart Helmetleftside3_r1;
    private final ModelPart HelmetLeftside2_r1;
    private final ModelPart Helmetleftside1_r1;
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
    private final ModelPart LEFTLEG;


    public HallowedArmorModel(EquipmentSlot slot) {
        super(slot);

        textureWidth = 64;
        textureHeight = 64;

        HEAD = new ModelPart(this);
        HEAD.setPivot(0.0F, 0.0F, 0.0F);
        HEAD.setTextureOffset(3, 3).addCuboid(-3.5F, 0.15F, -3.0F, 7.0F, -1.0F, 6.0F, 1.0F, false);
        HEAD.setTextureOffset(10, 2).addCuboid(-0.6141F, -7.917F, 3.9153F, 5.0F, 8.0F, 1.0F, 0.0F, false);
        HEAD.setTextureOffset(11, 2).addCuboid(-4.3141F, -7.917F, 3.9153F, 5.0F, 8.0F, 1.0F, 0.0F, false);
        HEAD.setTextureOffset(5, 3).addCuboid(0.0F, -8.2F, -4.0F, 5.0F, 1.0F, 7.0F, 0.0F, false);
        HEAD.setTextureOffset(5, 3).addCuboid(3.8F, -5.2F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        HEAD.setTextureOffset(5, 3).addCuboid(-5.6F, -5.2F, -4.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        HEAD.setTextureOffset(5, 3).addCuboid(-4.9F, -8.2F, -4.0F, 5.0F, 1.0F, 7.0F, 0.0F, false);
        HEAD.setTextureOffset(5, 3).addCuboid(-0.7815F, -8.2F, 2.841F, 5.0F, 1.0F, 2.0F, 0.0F, false);
        HEAD.setTextureOffset(5, 3).addCuboid(-3.982F, -8.2F, 2.8021F, 4.0F, 1.0F, 2.0F, 0.0F, false);
        HEAD.setTextureOffset(31, 44).addCuboid(5.8F, -4.7F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        HEAD.setTextureOffset(30, 43).addCuboid(-6.6F, -4.7F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        HelmetLeftFeather1_r1 = new ModelPart(this);
        HelmetLeftFeather1_r1.setPivot(0.0F, 24.0F, 0.0F);
        HEAD.addChild(HelmetLeftFeather1_r1);
        setRotationAngle(HelmetLeftFeather1_r1, 0.2094F, -0.2094F, 0.0F);
        HelmetLeftFeather1_r1.setTextureOffset(2, 57).addCuboid(4.2F, -31.2F, 10.1F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        HelmetLeftFeather2_r1 = new ModelPart(this);
        HelmetLeftFeather2_r1.setPivot(3.254F, 15.4925F, -15.309F);
        HEAD.addChild(HelmetLeftFeather2_r1);
        setRotationAngle(HelmetLeftFeather2_r1, -0.3316F, -0.2094F, 0.0F);
        HelmetLeftFeather2_r1.setTextureOffset(2, 57).addCuboid(4.2F, -30.2F, 12.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        HelmetLeftFeather3_r1 = new ModelPart(this);
        HelmetLeftFeather3_r1.setPivot(0.0F, 28.0F, 0.0F);
        HEAD.addChild(HelmetLeftFeather3_r1);
        setRotationAngle(HelmetLeftFeather3_r1, -0.4014F, -0.2094F, 0.0F);
        HelmetLeftFeather3_r1.setTextureOffset(2, 57).addCuboid(4.3F, -32.7F, -9.1F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        HelmetLeftFeather4_r1 = new ModelPart(this);
        HelmetLeftFeather4_r1.setPivot(4.9359F, 4.7954F, -23.2214F);
        HEAD.addChild(HelmetLeftFeather4_r1);
        setRotationAngle(HelmetLeftFeather4_r1, -0.8727F, -0.2094F, 0.0F);
        HelmetLeftFeather4_r1.setTextureOffset(2, 59).addCuboid(4.3F, -29.2F, 12.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        HelmetLeftFeather5_r1 = new ModelPart(this);
        HelmetLeftFeather5_r1.setPivot(0.0F, 31.0F, 0.0F);
        HEAD.addChild(HelmetLeftFeather5_r1);
        setRotationAngle(HelmetLeftFeather5_r1, -0.5934F, -0.2094F, 0.0F);
        HelmetLeftFeather5_r1.setTextureOffset(2, 57).addCuboid(4.2F, -30.6F, -14.8F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        HelmetLeftFeather6_r1 = new ModelPart(this);
        HelmetLeftFeather6_r1.setPivot(5.1436F, 2.8102F, -24.1988F);
        HEAD.addChild(HelmetLeftFeather6_r1);
        setRotationAngle(HelmetLeftFeather6_r1, -1.0472F, -0.2094F, 0.0F);
        HelmetLeftFeather6_r1.setTextureOffset(2, 59).addCuboid(4.2F, -29.2F, 12.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        HelmetRightFeather1_r1 = new ModelPart(this);
        HelmetRightFeather1_r1.setPivot(-9.2807F, 23.7752F, 3.4732F);
        HEAD.addChild(HelmetRightFeather1_r1);
        setRotationAngle(HelmetRightFeather1_r1, 0.2094F, 0.2094F, 0.0F);
        HelmetRightFeather1_r1.setTextureOffset(2, 57).addCuboid(4.7F, -30.95F, 8.6F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        HelmetRightFeather2_r1 = new ModelPart(this);
        HelmetRightFeather2_r1.setPivot(-12.5341F, 16.3125F, -11.8329F);
        HEAD.addChild(HelmetRightFeather2_r1);
        setRotationAngle(HelmetRightFeather2_r1, -0.3316F, 0.2094F, 0.0F);
        HelmetRightFeather2_r1.setTextureOffset(2, 57).addCuboid(4.7F, -30.2F, 10.6F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        HelmetRightFeather3_r1 = new ModelPart(this);
        HelmetRightFeather3_r1.setPivot(-10.2516F, 26.6616F, -0.5612F);
        HEAD.addChild(HelmetRightFeather3_r1);
        setRotationAngle(HelmetRightFeather3_r1, -0.4014F, 0.2094F, 0.0F);
        HelmetRightFeather3_r1.setTextureOffset(2, 57).addCuboid(4.7F, -32.5F, -6.1F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        HelmetRightFeather4_r1 = new ModelPart(this);
        HelmetRightFeather4_r1.setPivot(-14.6296F, 4.8133F, -21.1579F);
        HEAD.addChild(HelmetRightFeather4_r1);
        setRotationAngle(HelmetRightFeather4_r1, -0.8727F, 0.2094F, 0.0F);
        HelmetRightFeather4_r1.setTextureOffset(2, 59).addCuboid(4.7F, -29.2F, 12.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        HelmetRightFeather5_r1 = new ModelPart(this);
        HelmetRightFeather5_r1.setPivot(-0.8057F, 24.605F, -1.3333F);
        HEAD.addChild(HelmetRightFeather5_r1);
        setRotationAngle(HelmetRightFeather5_r1, -0.5934F, 0.2094F, 0.0F);
        HelmetRightFeather5_r1.setTextureOffset(2, 57).addCuboid(-4.7F, -25.7F, -10.8F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        HelmetRightFeather6_r1 = new ModelPart(this);
        HelmetRightFeather6_r1.setPivot(-7.6881F, 2.7143F, -24.5735F);
        HEAD.addChild(HelmetRightFeather6_r1);
        setRotationAngle(HelmetRightFeather6_r1, -1.0472F, 0.2094F, 0.0F);
        HelmetRightFeather6_r1.setTextureOffset(2, 59).addCuboid(-2.8F, -29.2F, 12.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        HelmetRightTooth3_r1 = new ModelPart(this);
        HelmetRightTooth3_r1.setPivot(2.3922F, 11.2597F, -23.1807F);
        HEAD.addChild(HelmetRightTooth3_r1);
        setRotationAngle(HelmetRightTooth3_r1, -0.7681F, -0.1841F, -0.1872F);
        HelmetRightTooth3_r1.setTextureOffset(30, 43).addCuboid(0.0F, -33.25F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        HelmetRightTooth2_r1 = new ModelPart(this);
        HelmetRightTooth2_r1.setPivot(-0.2309F, 21.4243F, -10.5936F);
        HEAD.addChild(HelmetRightTooth2_r1);
        setRotationAngle(HelmetRightTooth2_r1, -0.2164F, -0.0283F, -0.1278F);
        HelmetRightTooth2_r1.setTextureOffset(30, 43).addCuboid(-1.0F, -33.25F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        HelmetRightTooth1_r1 = new ModelPart(this);
        HelmetRightTooth1_r1.setPivot(-1.018F, 21.591F, -10.1184F);
        HEAD.addChild(HelmetRightTooth1_r1);
        setRotationAngle(HelmetRightTooth1_r1, -0.2174F, -0.0189F, -0.0852F);
        HelmetRightTooth1_r1.setTextureOffset(30, 43).addCuboid(-1.0F, -33.25F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        HelmetLeftTooth3_r1 = new ModelPart(this);
        HelmetLeftTooth3_r1.setPivot(-6.4182F, 11.936F, -22.4428F);
        HEAD.addChild(HelmetLeftTooth3_r1);
        setRotationAngle(HelmetLeftTooth3_r1, -0.7681F, 0.1841F, 0.1872F);
        HelmetLeftTooth3_r1.setTextureOffset(30, 43).addCuboid(3.0F, -34.25F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        HelmetLeftTooth2_r1 = new ModelPart(this);
        HelmetLeftTooth2_r1.setPivot(-3.8654F, 21.8825F, -10.6952F);
        HEAD.addChild(HelmetLeftTooth2_r1);
        setRotationAngle(HelmetLeftTooth2_r1, -0.2164F, 0.0283F, 0.1278F);
        HelmetLeftTooth2_r1.setTextureOffset(30, 43).addCuboid(4.0F, -34.25F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        HelmetLeftTooth1_r1 = new ModelPart(this);
        HelmetLeftTooth1_r1.setPivot(-2.8672F, 21.2591F, -10.0449F);
        HEAD.addChild(HelmetLeftTooth1_r1);
        setRotationAngle(HelmetLeftTooth1_r1, -0.2174F, 0.0189F, 0.0852F);
        HelmetLeftTooth1_r1.setTextureOffset(30, 43).addCuboid(4.0F, -33.25F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        HelmetRightToothMount3_r1 = new ModelPart(this);
        HelmetRightToothMount3_r1.setPivot(0.0F, 24.0F, 0.0F);
        HEAD.addChild(HelmetRightToothMount3_r1);
        setRotationAngle(HelmetRightToothMount3_r1, -0.7681F, -0.1841F, -0.1872F);
        HelmetRightToothMount3_r1.setTextureOffset(5, 3).addCuboid(-0.1F, -24.5F, -19.9F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        HelmetRightToothMount1_r1 = new ModelPart(this);
        HelmetRightToothMount1_r1.setPivot(0.0F, 24.0F, 0.0F);
        HEAD.addChild(HelmetRightToothMount1_r1);
        setRotationAngle(HelmetRightToothMount1_r1, -0.2174F, -0.0189F, -0.0852F);
        HelmetRightToothMount1_r1.setTextureOffset(5, 3).addCuboid(-2.5F, -32.5F, -10.9F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        HelmetRightToothMount2_r1 = new ModelPart(this);
        HelmetRightToothMount2_r1.setPivot(0.0F, 24.0F, 0.0F);
        HEAD.addChild(HelmetRightToothMount2_r1);
        setRotationAngle(HelmetRightToothMount2_r1, -0.2164F, -0.0283F, -0.1278F);
        HelmetRightToothMount2_r1.setTextureOffset(5, 3).addCuboid(-1.7F, -32.5F, -7.4F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        HelmetLeftToothMount3_r1 = new ModelPart(this);
        HelmetLeftToothMount3_r1.setPivot(0.0F, 24.0F, 0.0F);
        HEAD.addChild(HelmetLeftToothMount3_r1);
        setRotationAngle(HelmetLeftToothMount3_r1, -0.7681F, 0.1841F, 0.1872F);
        HelmetLeftToothMount3_r1.setTextureOffset(5, 3).addCuboid(-1.8F, -24.5F, -19.9F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        HelmetLeftToothMount2_r1 = new ModelPart(this);
        HelmetLeftToothMount2_r1.setPivot(0.0F, 24.0F, 0.0F);
        HEAD.addChild(HelmetLeftToothMount2_r1);
        setRotationAngle(HelmetLeftToothMount2_r1, -0.2164F, 0.0283F, 0.1278F);
        HelmetLeftToothMount2_r1.setTextureOffset(5, 3).addCuboid(-0.3F, -32.5F, -7.4F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        HelmetLeftToothMount1_r1 = new ModelPart(this);
        HelmetLeftToothMount1_r1.setPivot(0.0F, 24.0F, 0.0F);
        HEAD.addChild(HelmetLeftToothMount1_r1);
        setRotationAngle(HelmetLeftToothMount1_r1, -0.2174F, 0.0189F, 0.0852F);
        HelmetLeftToothMount1_r1.setTextureOffset(5, 3).addCuboid(0.6F, -32.5F, -10.9F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        HelmetLeftFeatherMount3_r1 = new ModelPart(this);
        HelmetLeftFeatherMount3_r1.setPivot(0.0F, 24.0F, 0.0F);
        HEAD.addChild(HelmetLeftFeatherMount3_r1);
        setRotationAngle(HelmetLeftFeatherMount3_r1, -0.4363F, -0.2094F, 0.0F);
        HelmetLeftFeatherMount3_r1.setTextureOffset(5, 3).addCuboid(3.7F, -26.2F, -9.3F, 2.0F, 1.0F, 3.0F, 0.0F, false);

        HelmetLeftFeatherMount2_r1 = new ModelPart(this);
        HelmetLeftFeatherMount2_r1.setPivot(0.0F, 24.0F, 0.0F);
        HEAD.addChild(HelmetLeftFeatherMount2_r1);
        setRotationAngle(HelmetLeftFeatherMount2_r1, -0.2618F, -0.2094F, 0.0F);
        HelmetLeftFeatherMount2_r1.setTextureOffset(5, 3).addCuboid(3.8F, -29.8F, -5.9F, 2.0F, 1.0F, 3.0F, 0.0F, false);

        HelmetLeftFeatherMount1_r1 = new ModelPart(this);
        HelmetLeftFeatherMount1_r1.setPivot(0.0F, 24.0F, 0.0F);
        HEAD.addChild(HelmetLeftFeatherMount1_r1);
        setRotationAngle(HelmetLeftFeatherMount1_r1, 0.3491F, -0.2094F, 0.0F);
        HelmetLeftFeatherMount1_r1.setTextureOffset(5, 3).addCuboid(3.7F, -29.5F, 12.1F, 2.0F, 1.0F, 3.0F, 0.0F, false);

        HelmetRightFeatherMount3_r1 = new ModelPart(this);
        HelmetRightFeatherMount3_r1.setPivot(0.0F, 24.0F, 0.0F);
        HEAD.addChild(HelmetRightFeatherMount3_r1);
        setRotationAngle(HelmetRightFeatherMount3_r1, -0.4363F, 0.2094F, 0.0F);
        HelmetRightFeatherMount3_r1.setTextureOffset(5, 3).addCuboid(-5.7F, -25.9F, -9.8F, 2.0F, 1.0F, 3.0F, 0.0F, false);

        HelmetRightFeatherMount2_r1 = new ModelPart(this);
        HelmetRightFeatherMount2_r1.setPivot(0.0F, 24.0F, 0.0F);
        HEAD.addChild(HelmetRightFeatherMount2_r1);
        setRotationAngle(HelmetRightFeatherMount2_r1, -0.2618F, 0.2094F, 0.0F);
        HelmetRightFeatherMount2_r1.setTextureOffset(5, 3).addCuboid(-5.7F, -29.8F, -5.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);

        HelmetRightFeatherMount1_r1 = new ModelPart(this);
        HelmetRightFeatherMount1_r1.setPivot(0.0F, 24.0F, 0.0F);
        HEAD.addChild(HelmetRightFeatherMount1_r1);
        setRotationAngle(HelmetRightFeatherMount1_r1, 0.3491F, 0.2094F, 0.0F);
        HelmetRightFeatherMount1_r1.setTextureOffset(5, 3).addCuboid(-5.6F, -29.2F, 12.8F, 2.0F, 1.0F, 3.0F, 0.0F, false);

        HelmetTop3_r1 = new ModelPart(this);
        HelmetTop3_r1.setPivot(-5.0337F, 24.0F, -4.1458F);
        HEAD.addChild(HelmetTop3_r1);
        setRotationAngle(HelmetTop3_r1, -3.1416F, 1.2392F, -3.1416F);
        HelmetTop3_r1.setTextureOffset(5, 3).addCuboid(-8.8F, -32.2F, -2.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        HelmetTop2_r1 = new ModelPart(this);
        HelmetTop2_r1.setPivot(-0.0263F, 24.0F, -0.0026F);
        HEAD.addChild(HelmetTop2_r1);
        setRotationAngle(HelmetTop2_r1, 0.0F, 1.1694F, 0.0F);
        HelmetTop2_r1.setTextureOffset(5, 3).addCuboid(-2.8F, -32.2F, 4.8F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        Helmetrightside6_r1 = new ModelPart(this);
        Helmetrightside6_r1.setPivot(-0.0283F, -0.4548F, -0.0351F);
        HEAD.addChild(Helmetrightside6_r1);
        setRotationAngle(Helmetrightside6_r1, -0.0254F, 0.3482F, -0.0743F);
        Helmetrightside6_r1.setTextureOffset(13, 4).addCuboid(-5.7F, -3.8F, 0.0F, 1.0F, 4.0F, 3.0F, 0.0F, false);

        Helmetrightside5_r1 = new ModelPart(this);
        Helmetrightside5_r1.setPivot(-0.2644F, -0.048F, 0.0508F);
        HEAD.addChild(Helmetrightside5_r1);
        setRotationAngle(Helmetrightside5_r1, 0.0F, 0.3491F, 0.0F);
        Helmetrightside5_r1.setTextureOffset(12, 4).addCuboid(-5.7F, -5.8F, 0.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        Helmetrightside4_r1 = new ModelPart(this);
        Helmetrightside4_r1.setPivot(-0.6576F, 0.3355F, 0.1939F);
        HEAD.addChild(Helmetrightside4_r1);
        setRotationAngle(Helmetrightside4_r1, 0.0254F, 0.3482F, 0.0743F);
        Helmetrightside4_r1.setTextureOffset(12, 4).addCuboid(-5.7F, -7.8F, 0.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        Helmetrightside3_r1 = new ModelPart(this);
        Helmetrightside3_r1.setPivot(0.081F, 0.5776F, 0.1904F);
        HEAD.addChild(Helmetrightside3_r1);
        setRotationAngle(Helmetrightside3_r1, 0.0061F, -0.0871F, -0.0701F);
        Helmetrightside3_r1.setTextureOffset(10, 2).addCuboid(-5.2F, -4.8F, -3.7F, 1.0F, 4.0F, 6.0F, 0.0F, false);

        Helmetrightside2_r1 = new ModelPart(this);
        Helmetrightside2_r1.setPivot(-0.24F, -0.448F, 0.1623F);
        HEAD.addChild(Helmetrightside2_r1);
        setRotationAngle(Helmetrightside2_r1, 0.0F, -0.0873F, 0.0F);
        Helmetrightside2_r1.setTextureOffset(10, 3).addCuboid(-5.2F, -5.4F, -3.7F, 1.0F, 2.0F, 6.0F, 0.0F, false);

        Helmetrightside1_r1 = new ModelPart(this);
        Helmetrightside1_r1.setPivot(-0.6556F, 0.3006F, 0.1259F);
        HEAD.addChild(Helmetrightside1_r1);
        setRotationAngle(Helmetrightside1_r1, -0.0061F, -0.0871F, 0.0701F);
        Helmetrightside1_r1.setTextureOffset(10, 3).addCuboid(-5.2F, -7.8F, -3.7F, 1.0F, 2.0F, 6.0F, 0.0F, false);

        Helmetleftside6_r1 = new ModelPart(this);
        Helmetleftside6_r1.setPivot(0.3897F, -0.5141F, -0.8895F);
        HEAD.addChild(Helmetleftside6_r1);
        setRotationAngle(Helmetleftside6_r1, -0.0254F, -0.3482F, 0.0743F);
        Helmetleftside6_r1.setTextureOffset(12, 4).addCuboid(4.7F, -3.8F, 0.9F, 1.0F, 4.0F, 3.0F, 0.0F, false);

        Helmetleftside5_r1 = new ModelPart(this);
        Helmetleftside5_r1.setPivot(0.6257F, -0.1072F, -0.8036F);
        HEAD.addChild(Helmetleftside5_r1);
        setRotationAngle(Helmetleftside5_r1, 0.0F, -0.3491F, 0.0F);
        Helmetleftside5_r1.setTextureOffset(13, 5).addCuboid(4.7F, -5.8F, 0.9F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        Helmetleftside4_r1 = new ModelPart(this);
        Helmetleftside4_r1.setPivot(1.019F, 0.2763F, -0.6604F);
        HEAD.addChild(Helmetleftside4_r1);
        setRotationAngle(Helmetleftside4_r1, 0.0254F, -0.3482F, -0.0743F);
        Helmetleftside4_r1.setTextureOffset(12, 5).addCuboid(4.7F, -7.8F, 0.9F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        Helmetleftside3_r1 = new ModelPart(this);
        Helmetleftside3_r1.setPivot(0.3263F, -0.2588F, 0.1508F);
        HEAD.addChild(Helmetleftside3_r1);
        setRotationAngle(Helmetleftside3_r1, 0.0061F, 0.0871F, 0.0701F);
        Helmetleftside3_r1.setTextureOffset(9, 2).addCuboid(3.9F, -4.0F, -3.7F, 1.0F, 4.0F, 6.0F, 0.0F, false);

        HelmetLeftside2_r1 = new ModelPart(this);
        HelmetLeftside2_r1.setPivot(0.2935F, -0.1072F, 0.1536F);
        HEAD.addChild(HelmetLeftside2_r1);
        setRotationAngle(HelmetLeftside2_r1, 0.0F, 0.0873F, 0.0F);
        HelmetLeftside2_r1.setTextureOffset(9, 3).addCuboid(4.2F, -5.8F, -3.7F, 1.0F, 2.0F, 6.0F, 0.0F, false);

        Helmetleftside1_r1 = new ModelPart(this);
        Helmetleftside1_r1.setPivot(0.7092F, 0.2414F, 0.1173F);
        HEAD.addChild(Helmetleftside1_r1);
        setRotationAngle(Helmetleftside1_r1, -0.0061F, 0.0871F, -0.0701F);
        Helmetleftside1_r1.setTextureOffset(8, 3).addCuboid(4.2F, -7.8F, -3.7F, 1.0F, 2.0F, 6.0F, 0.0F, false);

        HelmetFaceguard8_r1 = new ModelPart(this);
        HelmetFaceguard8_r1.setPivot(0.3184F, 23.3018F, 2.2818F);
        HEAD.addChild(HelmetFaceguard8_r1);
        setRotationAngle(HelmetFaceguard8_r1, 0.0873F, 0.2182F, 0.0F);
        HelmetFaceguard8_r1.setTextureOffset(14, 6).addCuboid(-3.8F, -29.75F, -5.1F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        HelmetFaceguard7_r1 = new ModelPart(this);
        HelmetFaceguard7_r1.setPivot(-0.4728F, 23.3018F, 2.2818F);
        HEAD.addChild(HelmetFaceguard7_r1);
        setRotationAngle(HelmetFaceguard7_r1, 0.0873F, -0.2182F, 0.0F);
        HelmetFaceguard7_r1.setTextureOffset(14, 5).addCuboid(2.8F, -29.75F, -5.1F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        HelmetFaceguard6_r1 = new ModelPart(this);
        HelmetFaceguard6_r1.setPivot(-0.0286F, -0.1879F, 0.0235F);
        HEAD.addChild(HelmetFaceguard6_r1);
        setRotationAngle(HelmetFaceguard6_r1, -0.7734F, -1.2635F, 0.7974F);
        HelmetFaceguard6_r1.setTextureOffset(10, 3).addCuboid(-6.5F, -6.4F, -1.05F, 1.0F, 2.0F, 5.0F, 0.0F, false);

        HelmetFaceguard5_r1 = new ModelPart(this);
        HelmetFaceguard5_r1.setPivot(-0.0282F, -0.1879F, 0.0451F);
        HEAD.addChild(HelmetFaceguard5_r1);
        setRotationAngle(HelmetFaceguard5_r1, -0.7734F, 1.2635F, -0.7974F);
        HelmetFaceguard5_r1.setTextureOffset(10, 4).addCuboid(5.5F, -6.4F, -1.15F, 1.0F, 2.0F, 5.0F, 0.0F, false);

        HelmetFaceguard4_r1 = new ModelPart(this);
        HelmetFaceguard4_r1.setPivot(1.9049F, 0.2276F, -0.6479F);
        HEAD.addChild(HelmetFaceguard4_r1);
        setRotationAngle(HelmetFaceguard4_r1, -0.1561F, -1.3499F, 0.16F);
        HelmetFaceguard4_r1.setTextureOffset(10, 4).addCuboid(-5.1F, -4.9F, 0.85F, 1.0F, 1.0F, 5.0F, 0.0F, false);

        HelmetFaceguard3_r1 = new ModelPart(this);
        HelmetFaceguard3_r1.setPivot(-0.9191F, 0.1709F, -0.4621F);
        HEAD.addChild(HelmetFaceguard3_r1);
        setRotationAngle(HelmetFaceguard3_r1, -0.1943F, 1.3484F, -0.1991F);
        HelmetFaceguard3_r1.setTextureOffset(10, 5).addCuboid(4.1F, -4.8F, -0.15F, 1.0F, 1.0F, 5.0F, 0.0F, false);

        HelmetFaceguard2_r1 = new ModelPart(this);
        HelmetFaceguard2_r1.setPivot(-0.054F, 0.0182F, -0.0157F);
        HEAD.addChild(HelmetFaceguard2_r1);
        setRotationAngle(HelmetFaceguard2_r1, 2.8529F, -1.3419F, -2.858F);
        HelmetFaceguard2_r1.setTextureOffset(10, 3).addCuboid(-4.92F, -4.2F, -3.95F, 1.0F, 4.0F, 5.0F, 0.0F, false);

        HelmetFaceguard1_r1 = new ModelPart(this);
        HelmetFaceguard1_r1.setPivot(0.0F, 0.0F, 0.0F);
        HEAD.addChild(HelmetFaceguard1_r1);
        setRotationAngle(HelmetFaceguard1_r1, 0.3048F, -1.3419F, -0.3125F);
        HelmetFaceguard1_r1.setTextureOffset(10, 3).addCuboid(-4.9F, -4.2F, -1.15F, 1.0F, 4.0F, 5.0F, 0.0F, false);

        HelmetBlack2_r1 = new ModelPart(this);
        HelmetBlack2_r1.setPivot(0.0F, 0.0F, 0.0F);
        HEAD.addChild(HelmetBlack2_r1);
        setRotationAngle(HelmetBlack2_r1, 0.0F, -1.3526F, 0.0F);
        HelmetBlack2_r1.setTextureOffset(20, 14).addCuboid(-4.8F, -5.8F, -1.05F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        HelmetBlack1_r1 = new ModelPart(this);
        HelmetBlack1_r1.setPivot(0.0F, 0.0F, 0.0F);
        HEAD.addChild(HelmetBlack1_r1);
        setRotationAngle(HelmetBlack1_r1, 0.0F, 1.3526F, 0.0F);
        HelmetBlack1_r1.setTextureOffset(20, 14).addCuboid(3.8F, -5.8F, -1.05F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        BODY = new ModelPart(this);
        BODY.setPivot(0.0F, 0.0F, 0.0F);
        BODY.setTextureOffset(21, 29).addCuboid(-3.5F, 0.5F, -2.0F, 7.0F, 4.0F, -1.0F, 1.01F, false);
        BODY.setTextureOffset(21, 34).addCuboid(-3.5F, 3.9F, -1.5F, 7.0F, 4.0F, -1.0F, 1.01F, false);
        BODY.setTextureOffset(21, 38).addCuboid(-3.5F, 8.5F, -1.35F, 7.0F, 3.0F, -1.0F, 1.01F, false);
        BODY.setTextureOffset(6, 4).addCuboid(-4.0F, 0.6F, -1.4F, 8.0F, 5.0F, 3.0F, 1.01F, false);
        BODY.setTextureOffset(7, 6).addCuboid(-3.5F, 7.6F, -0.6F, 7.0F, 3.0F, 2.0F, 1.01F, false);
        BODY.setTextureOffset(2, 48).addCuboid(-4.0F, 12.65F, -1.5F, 8.0F, -1.0F, 3.0F, 1.01F, false);

        RIGHTARM = new ModelPart(this);
        RIGHTARM.setPivot(-5.0F, 2.0F, 0.0F);
        RIGHTARM.setTextureOffset(2, 16).addCuboid(-3.0F, -1.3F, -2.0F, 4.0F, 2.0F, 4.0F, 1.0F, false);
        RIGHTARM.setTextureOffset(30, 43).addCuboid(-3.5F, -3.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        LEFTARM = new ModelPart(this);
        LEFTARM.setPivot(5.0F, 2.0F, 0.0F);
        LEFTARM.setTextureOffset(2, 16).addCuboid(-1.0F, -1.3F, -2.0F, 4.0F, 2.0F, 4.0F, 1.0F, false);
        LEFTARM.setTextureOffset(31, 44).addCuboid(2.5F, -3.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        RIGHTLEG = new ModelPart(this);
        RIGHTLEG.setPivot(-1.9F, 12.0F, 0.0F);
        RIGHTLEG.setTextureOffset(10, 2).addCuboid(-1.5F, 0.9F, -0.65F, 3.0F, 10.0F, 2.0F, 1.0F, false);
        RIGHTLEG.setTextureOffset(11, 4).addCuboid(-1.5F, 0.9F, -1.35F, 3.0F, 10.0F, -1.0F, 1.0F, false);
        RIGHTLEG.setTextureOffset(4, 19).addCuboid(-1.55F, 5.0F, -1.5F, 1.0F, 0.0F, 3.0F, 1.0F, false);
        RIGHTLEG.setTextureOffset(5, 19).addCuboid(0.55F, 5.0F, -1.5F, 1.0F, 0.0F, 3.0F, 1.0F, false);
        RIGHTLEG.setTextureOffset(2, 42).addCuboid(-2.0F, 10.6F, -1.5F, 4.0F, 1.0F, 3.0F, 1.0F, false);
        RIGHTLEG.setTextureOffset(3, 42).addCuboid(-1.5F, 10.6F, -3.0F, 3.0F, 1.0F, 3.0F, 1.0F, false);
        RIGHTLEG.setTextureOffset(31, 44).addCuboid(-0.5F, 8.6F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        LEFTLEG = new ModelPart(this);
        LEFTLEG.setPivot(1.9F, 12.0F, 0.0F);
        LEFTLEG.setTextureOffset(13, 2).addCuboid(-1.55F, 0.9F, -0.65F, 3.0F, 10.0F, 2.0F, 1.0F, false);
        LEFTLEG.setTextureOffset(16, 4).addCuboid(-1.55F, 0.9F, -1.35F, 3.0F, 10.0F, -1.0F, 1.0F, false);
        LEFTLEG.setTextureOffset(8, 18).addCuboid(0.55F, 5.0F, -1.5F, 1.0F, 0.0F, 3.0F, 1.0F, false);
        LEFTLEG.setTextureOffset(8, 18).addCuboid(-1.65F, 5.0F, -1.5F, 1.0F, 0.0F, 3.0F, 1.0F, false);
        LEFTLEG.setTextureOffset(2, 42).addCuboid(-2.05F, 10.6F, -1.5F, 4.0F, 1.0F, 3.0F, 1.0F, false);
        LEFTLEG.setTextureOffset(3, 42).addCuboid(-1.55F, 10.6F, -3.0F, 3.0F, 1.0F, 3.0F, 1.0F, false);
        LEFTLEG.setTextureOffset(31, 44).addCuboid(-0.5F, 8.6F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
    }
    @Override
    public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){

        head = HEAD;
        body = BODY;
        leftArm = LEFTARM;
        rightArm = RIGHTARM;
        leftLeg = LEFTLEG;
        rightLeg = RIGHTLEG;

        head.visible = slot == EquipmentSlot.HEAD;
        body.visible = slot == EquipmentSlot.CHEST;
        leftArm.visible = slot == EquipmentSlot.CHEST;
        rightArm.visible = slot == EquipmentSlot.CHEST;
        leftLeg.visible = slot == EquipmentSlot.LEGS;
        rightLeg.visible = slot == EquipmentSlot.LEGS;

        HEAD.render(matrixStack, buffer, packedLight, packedOverlay);
        BODY.render(matrixStack, buffer, packedLight, packedOverlay);
        RIGHTARM.render(matrixStack, buffer, packedLight, packedOverlay);
        LEFTARM.render(matrixStack, buffer, packedLight, packedOverlay);
        RIGHTLEG.render(matrixStack, buffer, packedLight, packedOverlay);
        LEFTLEG.render(matrixStack, buffer, packedLight, packedOverlay);
    }
}
