package net.client.model.renderer.armor.model;

import net.client.model.renderer.armor.RunecraftArmorModel;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;

public class DragonArmorModel extends RunecraftArmorModel {

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
    private final ModelPart HelmetLeftTooth3_r2;
    private final ModelPart HelmetLeftTooth2_r2;
    private final ModelPart HelmetLeftTooth1_r2;
    private final ModelPart HelmetLeftTooth3_r3;
    private final ModelPart HelmetLeftTooth2_r3;
    private final ModelPart HelmetLeftTooth1_r3;
    private final ModelPart HelmetLeftToothMount3_r1;
    private final ModelPart HelmetLeftToothMount2_r1;
    private final ModelPart HelmetLeftToothMount1_r1;
    private final ModelPart HelmetRightTooth3_r1;
    private final ModelPart HelmetRightTooth2_r1;
    private final ModelPart HelmetRightTooth1_r1;
    private final ModelPart HelmetRightTooth3_r2;
    private final ModelPart HelmetRightTooth2_r2;
    private final ModelPart HelmetRightTooth1_r2;
    private final ModelPart HelmetRightTooth3_r3;
    private final ModelPart HelmetRightTooth2_r3;
    private final ModelPart HelmetRightTooth1_r3;
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
    private final ModelPart CenterCrest_r1;
    private final ModelPart CenterCrest_r2;
    private final ModelPart CenterCrest_r3;
    private final ModelPart CenterCrest_r4;
    private final ModelPart CenterCrest_r5;
    private final ModelPart CenterCrest_r6;
    private final ModelPart Crest_r1;
    private final ModelPart Crest_r2;
    private final ModelPart Crest_r3;
    private final ModelPart Crest_r4;
    private final ModelPart Crest_r5;
    private final ModelPart Crest_r6;
    private final ModelPart Crest_r7;
    private final ModelPart Crest_r8;
    private final ModelPart Crest_r9;
    private final ModelPart Crest_r10;
    private final ModelPart Crest_r11;
    private final ModelPart Crest_r12;
    private final ModelPart Crest_r13;
    private final ModelPart Crest_r14;
    private final ModelPart Crest_r15;
    private final ModelPart Crest_r16;
    private final ModelPart RIGHTARM;
    private final ModelPart LeftShoulderTooth3_r1;
    private final ModelPart LeftShoulderTooth2_r1;
    private final ModelPart RightShoulder_r1;
    private final ModelPart RightShoulder_r2;
    private final ModelPart RightShoulder_r3;
    private final ModelPart RightShoulder_r4;
    private final ModelPart RightShoulder_r5;
    private final ModelPart RightShoulder_r6;
    private final ModelPart LEFTARM;
    private final ModelPart LeftShoulderTooth3_r2;
    private final ModelPart LeftShoulderTooth2_r2;
    private final ModelPart LeftShoulder_r1;
    private final ModelPart LeftShoulder_r2;
    private final ModelPart LeftShoulder_r3;
    private final ModelPart LeftShoulder_r4;
    private final ModelPart LeftShoulder_r5;
    private final ModelPart LeftShoulder_r6;
    private final ModelPart RIGHTLEG;
    private final ModelPart RightLeg_r1;
    private final ModelPart RightLeg_r2;
    private final ModelPart RightLeg_r3;
    private final ModelPart RightLeg_r4;
    private final ModelPart RightLeg_r5;
    private final ModelPart RightLeg_r6;
    private final ModelPart RightLeg_r7;
    private final ModelPart RightLeg_r8;
    private final ModelPart RightLeg_r9;
    private final ModelPart RightLeg_r10;
    private final ModelPart RightLeg_r11;
    private final ModelPart RightLeg_r12;
    private final ModelPart LEFTLEG;
    private final ModelPart LeftLeg_r1;
    private final ModelPart LeftLeg_r2;
    private final ModelPart LeftLeg_r3;
    private final ModelPart LeftLeg_r4;
    private final ModelPart LeftLeg_r5;
    private final ModelPart LeftLeg_r6;
    private final ModelPart LeftLeg_r7;
    private final ModelPart LeftLeg_r8;
    private final ModelPart LeftLeg_r9;
    private final ModelPart LeftLeg_r10;
    private final ModelPart LeftLeg_r11;
    private final ModelPart LeftLeg_r12;
    private final ModelPart RIGHTFOOT;
    private final ModelPart RightBoot3_r1;
    private final ModelPart LEFTFOOT;
    private final ModelPart LeftBoot3_r1;

    public DragonArmorModel(EquipmentSlot slot) {
        super(slot);

        textureWidth = 64;
        textureHeight = 64;

        HEAD = new ModelPart(this);
        HEAD.setPivot(0.0F, 0.0F, 0.0F);
        HEAD.setTextureOffset(5, 5).addCuboid(0.0F, -8.2F, -4.1F, 5.0F, 1.0F, 7.0F, 0.0F, false);
        HEAD.setTextureOffset(6, 17).addCuboid(3.8F, -5.2F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        HEAD.setTextureOffset(5, 17).addCuboid(-5.6F, -5.2F, -3.2F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        HEAD.setTextureOffset(6, 5).addCuboid(-4.9F, -8.2F, -4.1F, 5.0F, 1.0F, 7.0F, 0.0F, false);
        HEAD.setTextureOffset(5, 3).addCuboid(0.0185F, -8.2F, 2.841F, 4.0F, 1.0F, 2.0F, 0.0F, false);
        HEAD.setTextureOffset(5, 3).addCuboid(-3.882F, -8.2F, 2.8021F, 4.0F, 1.0F, 2.0F, 0.0F, false);
        HEAD.setTextureOffset(10, 2).addCuboid(0.3859F, -7.917F, 3.9153F, 4.0F, 8.0F, 1.0F, 0.0F, false);
        HEAD.setTextureOffset(10, 2).addCuboid(-0.5141F, -7.917F, 3.9153F, 1.0F, 8.0F, 1.0F, 0.0F, false);
        HEAD.setTextureOffset(11, 2).addCuboid(-4.4141F, -7.917F, 3.9153F, 4.0F, 8.0F, 1.0F, 0.0F, false);
        HEAD.setTextureOffset(3, 3).addCuboid(-3.5F, 0.15F, -3.0F, 7.0F, -1.0F, 6.0F, 1.0F, false);
        HEAD.setTextureOffset(31, 44).addCuboid(-6.35F, -4.7F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        HEAD.setTextureOffset(31, 44).addCuboid(-7.25F, -4.7F, -2.5F, 1.0F, 1.0F, 1.0F, -0.1F, true);
        HEAD.setTextureOffset(31, 44).addCuboid(-7.95F, -4.7F, -2.5F, 1.0F, 1.0F, 1.0F, -0.2F, true);
        HEAD.setTextureOffset(31, 44).addCuboid(5.55F, -4.7F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        HEAD.setTextureOffset(31, 44).addCuboid(6.45F, -4.7F, -2.5F, 1.0F, 1.0F, 1.0F, -0.1F, false);
        HEAD.setTextureOffset(31, 44).addCuboid(7.15F, -4.7F, -2.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

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
        HelmetLeftFeather2_r1.setPivot(3.2657F, -8.0244F, 7.2419F);
        HEAD.addChild(HelmetLeftFeather2_r1);
        setRotationAngle(HelmetLeftFeather2_r1, -0.3316F, -0.2094F, 0.0F);
        HelmetLeftFeather2_r1.setTextureOffset(2, 57).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        HelmetLeftFeather1_r1 = new ModelPart(this);
        HelmetLeftFeather1_r1.setPivot(3.4636F, -8.2449F, 6.3107F);
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
        HelmetLeftFeatherMount1_r1.setPivot(4.0024F, -7.6026F, 3.7759F);
        HEAD.addChild(HelmetLeftFeatherMount1_r1);
        setRotationAngle(HelmetLeftFeatherMount1_r1, 0.3491F, -0.2094F, 0.0F);
        HelmetLeftFeatherMount1_r1.setTextureOffset(6, 17).addCuboid(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);

        HelmetRightFeather6_r1 = new ModelPart(this);
        HelmetRightFeather6_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetRightFeather6_r1);
        setRotationAngle(HelmetRightFeather6_r1, -1.0472F, 0.2094F, 0.0F);
        HelmetRightFeather6_r1.setTextureOffset(2, 59).addCuboid(-4.9171F, -1.7096F, 5.5174F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        HelmetRightFeather5_r1 = new ModelPart(this);
        HelmetRightFeather5_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetRightFeather5_r1);
        setRotationAngle(HelmetRightFeather5_r1, -0.5934F, 0.2094F, 0.0F);
        HelmetRightFeather5_r1.setTextureOffset(2, 57).addCuboid(-4.9171F, 0.7589F, 3.5061F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        HelmetRightFeather4_r1 = new ModelPart(this);
        HelmetRightFeather4_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetRightFeather4_r1);
        setRotationAngle(HelmetRightFeather4_r1, -0.8727F, 0.2094F, 0.0F);
        HelmetRightFeather4_r1.setTextureOffset(2, 59).addCuboid(-4.9171F, -3.3748F, 3.6716F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        HelmetRightFeather3_r1 = new ModelPart(this);
        HelmetRightFeather3_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetRightFeather3_r1);
        setRotationAngle(HelmetRightFeather3_r1, -0.4014F, 0.2094F, 0.0F);
        HelmetRightFeather3_r1.setTextureOffset(2, 57).addCuboid(-4.9171F, -1.4321F, 2.5856F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        HelmetRightFeather2_r1 = new ModelPart(this);
        HelmetRightFeather2_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetRightFeather2_r1);
        setRotationAngle(HelmetRightFeather2_r1, -0.3316F, 0.2094F, 0.0F);
        HelmetRightFeather2_r1.setTextureOffset(2, 57).addCuboid(-4.8062F, -4.6432F, 2.8545F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        HelmetRightFeather1_r1 = new ModelPart(this);
        HelmetRightFeather1_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetRightFeather1_r1);
        setRotationAngle(HelmetRightFeather1_r1, 0.2094F, 0.2094F, 0.0F);
        HelmetRightFeather1_r1.setTextureOffset(2, 57).addCuboid(-4.8062F, -2.4798F, 2.5526F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        HelmetRightFeatherMount2_r1 = new ModelPart(this);
        HelmetRightFeatherMount2_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetRightFeatherMount2_r1);
        setRotationAngle(HelmetRightFeatherMount2_r1, -0.2618F, 0.2094F, 0.0F);
        HelmetRightFeatherMount2_r1.setTextureOffset(5, 17).addCuboid(-5.4062F, -1.0903F, 0.6774F, 2.0F, 1.0F, 3.0F, 0.0F, false);

        HelmetRightFeatherMount3_r1 = new ModelPart(this);
        HelmetRightFeatherMount3_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetRightFeatherMount3_r1);
        setRotationAngle(HelmetRightFeatherMount3_r1, -0.4363F, 0.2094F, 0.0F);
        HelmetRightFeatherMount3_r1.setTextureOffset(5, 17).addCuboid(-5.4062F, 1.3008F, 1.2689F, 2.0F, 1.0F, 3.0F, 0.0F, false);

        HelmetRightFeatherMount1_r1 = new ModelPart(this);
        HelmetRightFeatherMount1_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetRightFeatherMount1_r1);
        setRotationAngle(HelmetRightFeatherMount1_r1, 0.3491F, 0.2094F, 0.0F);
        HelmetRightFeatherMount1_r1.setTextureOffset(5, 17).addCuboid(-5.3062F, -2.1392F, 1.393F, 2.0F, 1.0F, 3.0F, 0.0F, false);

        HelmetLeftTooth3_r1 = new ModelPart(this);
        HelmetLeftTooth3_r1.setPivot(5.6977F, -6.586F, 3.8574F);
        HEAD.addChild(HelmetLeftTooth3_r1);
        setRotationAngle(HelmetLeftTooth3_r1, -0.7137F, -0.3614F, -0.3876F);
        HelmetLeftTooth3_r1.setTextureOffset(30, 43).addCuboid(-0.2F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        HelmetLeftTooth2_r1 = new ModelPart(this);
        HelmetLeftTooth2_r1.setPivot(5.6977F, -6.586F, 3.8574F);
        HEAD.addChild(HelmetLeftTooth2_r1);
        setRotationAngle(HelmetLeftTooth2_r1, -0.7811F, -0.0924F, -0.0928F);
        HelmetLeftTooth2_r1.setTextureOffset(30, 43).addCuboid(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, -0.1F, false);

        HelmetLeftTooth1_r1 = new ModelPart(this);
        HelmetLeftTooth1_r1.setPivot(5.6977F, -6.586F, 3.8574F);
        HEAD.addChild(HelmetLeftTooth1_r1);
        setRotationAngle(HelmetLeftTooth1_r1, -0.7681F, 0.1841F, 0.1872F);
        HelmetLeftTooth1_r1.setTextureOffset(30, 43).addCuboid(-0.5F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        HelmetLeftTooth3_r2 = new ModelPart(this);
        HelmetLeftTooth3_r2.setPivot(5.0014F, -9.1382F, 0.8133F);
        HEAD.addChild(HelmetLeftTooth3_r2);
        setRotationAngle(HelmetLeftTooth3_r2, -0.1741F, -0.1321F, -0.6429F);
        HelmetLeftTooth3_r2.setTextureOffset(30, 43).addCuboid(-0.1F, -1.35F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        HelmetLeftTooth2_r2 = new ModelPart(this);
        HelmetLeftTooth2_r2.setPivot(5.0014F, -9.1382F, 0.8133F);
        HEAD.addChild(HelmetLeftTooth2_r2);
        setRotationAngle(HelmetLeftTooth2_r2, -0.211F, -0.056F, -0.2559F);
        HelmetLeftTooth2_r2.setTextureOffset(30, 43).addCuboid(-0.4F, -0.95F, -0.5F, 1.0F, 1.0F, 1.0F, -0.1F, false);

        HelmetLeftTooth1_r2 = new ModelPart(this);
        HelmetLeftTooth1_r2.setPivot(5.0014F, -9.1382F, 0.8133F);
        HEAD.addChild(HelmetLeftTooth1_r2);
        setRotationAngle(HelmetLeftTooth1_r2, -0.2164F, 0.0283F, 0.1278F);
        HelmetLeftTooth1_r2.setTextureOffset(30, 43).addCuboid(-0.5F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        HelmetLeftTooth3_r3 = new ModelPart(this);
        HelmetLeftTooth3_r3.setPivot(4.4701F, -9.9234F, -2.6778F);
        HEAD.addChild(HelmetLeftTooth3_r3);
        setRotationAngle(HelmetLeftTooth3_r3, -0.1682F, -0.1396F, -0.6863F);
        HelmetLeftTooth3_r3.setTextureOffset(30, 43).addCuboid(-0.1F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        HelmetLeftTooth2_r3 = new ModelPart(this);
        HelmetLeftTooth2_r3.setPivot(4.4701F, -9.9234F, -2.6778F);
        HEAD.addChild(HelmetLeftTooth2_r3);
        setRotationAngle(HelmetLeftTooth2_r3, -0.2084F, -0.0651F, -0.2986F);
        HelmetLeftTooth2_r3.setTextureOffset(30, 43).addCuboid(-0.4F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, -0.1F, false);

        HelmetLeftTooth1_r3 = new ModelPart(this);
        HelmetLeftTooth1_r3.setPivot(4.4701F, -9.9234F, -2.6778F);
        HEAD.addChild(HelmetLeftTooth1_r3);
        setRotationAngle(HelmetLeftTooth1_r3, -0.2174F, 0.0189F, 0.0852F);
        HelmetLeftTooth1_r3.setTextureOffset(30, 43).addCuboid(-0.5F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

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
        HelmetRightTooth3_r1.setPivot(-5.6977F, -6.586F, 3.8574F);
        HEAD.addChild(HelmetRightTooth3_r1);
        setRotationAngle(HelmetRightTooth3_r1, -0.7137F, 0.3614F, 0.3876F);
        HelmetRightTooth3_r1.setTextureOffset(30, 43).addCuboid(-0.8F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, true);

        HelmetRightTooth2_r1 = new ModelPart(this);
        HelmetRightTooth2_r1.setPivot(-5.6977F, -6.586F, 3.8574F);
        HEAD.addChild(HelmetRightTooth2_r1);
        setRotationAngle(HelmetRightTooth2_r1, -0.7811F, 0.0924F, 0.0928F);
        HelmetRightTooth2_r1.setTextureOffset(30, 43).addCuboid(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, -0.1F, true);

        HelmetRightTooth1_r1 = new ModelPart(this);
        HelmetRightTooth1_r1.setPivot(-5.6977F, -6.586F, 3.8574F);
        HEAD.addChild(HelmetRightTooth1_r1);
        setRotationAngle(HelmetRightTooth1_r1, -0.7681F, -0.1841F, -0.1872F);
        HelmetRightTooth1_r1.setTextureOffset(30, 43).addCuboid(-0.5F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        HelmetRightTooth3_r2 = new ModelPart(this);
        HelmetRightTooth3_r2.setPivot(-5.0014F, -9.1382F, 0.8133F);
        HEAD.addChild(HelmetRightTooth3_r2);
        setRotationAngle(HelmetRightTooth3_r2, -0.1741F, 0.1321F, 0.6429F);
        HelmetRightTooth3_r2.setTextureOffset(30, 43).addCuboid(-0.9F, -1.35F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, true);

        HelmetRightTooth2_r2 = new ModelPart(this);
        HelmetRightTooth2_r2.setPivot(-5.0014F, -9.1382F, 0.8133F);
        HEAD.addChild(HelmetRightTooth2_r2);
        setRotationAngle(HelmetRightTooth2_r2, -0.211F, 0.056F, 0.2559F);
        HelmetRightTooth2_r2.setTextureOffset(30, 43).addCuboid(-0.6F, -0.95F, -0.5F, 1.0F, 1.0F, 1.0F, -0.1F, true);

        HelmetRightTooth1_r2 = new ModelPart(this);
        HelmetRightTooth1_r2.setPivot(-5.0014F, -9.1382F, 0.8133F);
        HEAD.addChild(HelmetRightTooth1_r2);
        setRotationAngle(HelmetRightTooth1_r2, -0.2164F, -0.0283F, -0.1278F);
        HelmetRightTooth1_r2.setTextureOffset(30, 43).addCuboid(-0.5F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        HelmetRightTooth3_r3 = new ModelPart(this);
        HelmetRightTooth3_r3.setPivot(-4.4701F, -9.9234F, -2.6778F);
        HEAD.addChild(HelmetRightTooth3_r3);
        setRotationAngle(HelmetRightTooth3_r3, -0.1682F, 0.1396F, 0.6863F);
        HelmetRightTooth3_r3.setTextureOffset(30, 43).addCuboid(-0.9F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, true);

        HelmetRightTooth2_r3 = new ModelPart(this);
        HelmetRightTooth2_r3.setPivot(-4.4701F, -9.9234F, -2.6778F);
        HEAD.addChild(HelmetRightTooth2_r3);
        setRotationAngle(HelmetRightTooth2_r3, -0.2084F, 0.0651F, 0.2986F);
        HelmetRightTooth2_r3.setTextureOffset(30, 43).addCuboid(-0.6F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, -0.1F, true);

        HelmetRightTooth1_r3 = new ModelPart(this);
        HelmetRightTooth1_r3.setPivot(-4.4701F, -9.9234F, -2.6778F);
        HEAD.addChild(HelmetRightTooth1_r3);
        setRotationAngle(HelmetRightTooth1_r3, -0.2174F, -0.0189F, -0.0852F);
        HelmetRightTooth1_r3.setTextureOffset(30, 43).addCuboid(-0.5F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        HelmetRightToothMount3_r1 = new ModelPart(this);
        HelmetRightToothMount3_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetRightToothMount3_r1);
        setRotationAngle(HelmetRightToothMount3_r1, -0.7681F, -0.1841F, -0.1872F);
        HelmetRightToothMount3_r1.setTextureOffset(5, 3).addCuboid(-5.7574F, -3.4519F, -0.2159F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        HelmetRightToothMount2_r1 = new ModelPart(this);
        HelmetRightToothMount2_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetRightToothMount2_r1);
        setRotationAngle(HelmetRightToothMount2_r1, -0.2164F, -0.0283F, -0.1278F);
        HelmetRightToothMount2_r1.setTextureOffset(5, 3).addCuboid(-5.4966F, -3.7918F, -2.5092F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        HelmetRightToothMount1_r1 = new ModelPart(this);
        HelmetRightToothMount1_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetRightToothMount1_r1);
        setRotationAngle(HelmetRightToothMount1_r1, -0.2174F, -0.0189F, -0.0852F);
        HelmetRightToothMount1_r1.setTextureOffset(5, 3).addCuboid(-5.1408F, -3.6536F, -6.1092F, 2.0F, 4.0F, 2.0F, 0.0F, false);

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
        HelmetFaceguard8_r1.setPivot(0.3656F, -4.2536F, 2.7788F);
        HEAD.addChild(HelmetFaceguard8_r1);
        setRotationAngle(HelmetFaceguard8_r1, 0.2174F, 0.0189F, -0.0852F);
        HelmetFaceguard8_r1.setTextureOffset(5, 3).addCuboid(-5.1408F, -3.6536F, -6.8908F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        HelmetFaceguard7_r1 = new ModelPart(this);
        HelmetFaceguard7_r1.setPivot(3.9035F, -6.6154F, 7.4847F);
        HEAD.addChild(HelmetFaceguard7_r1);
        setRotationAngle(HelmetFaceguard7_r1, 0.2174F, -0.0189F, 0.0852F);
        HelmetFaceguard7_r1.setTextureOffset(5, 3).addCuboid(-1.0F, -2.0F, -12.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

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
        HelmetBlack2_r1.setTextureOffset(20, 14).addCuboid(-6.2611F, -0.4697F, -1.3565F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        HelmetBlack1_r1 = new ModelPart(this);
        HelmetBlack1_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetBlack1_r1);
        setRotationAngle(HelmetBlack1_r1, 0.0F, 1.3526F, 0.0F);
        HelmetBlack1_r1.setTextureOffset(20, 14).addCuboid(5.2537F, -0.4697F, -1.3897F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        HelmetTop5_r1 = new ModelPart(this);
        HelmetTop5_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetTop5_r1);
        setRotationAngle(HelmetTop5_r1, -3.1416F, 1.2392F, -3.1416F);
        HelmetTop5_r1.setTextureOffset(5, 3).addCuboid(-1.7243F, -2.7697F, -5.1398F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        HelmetTop4_r1 = new ModelPart(this);
        HelmetTop4_r1.setPivot(0.017F, -5.3303F, 1.4928F);
        HEAD.addChild(HelmetTop4_r1);
        setRotationAngle(HelmetTop4_r1, 0.0F, 1.1694F, 0.0F);
        HelmetTop4_r1.setTextureOffset(5, 3).addCuboid(-1.3404F, -2.7697F, 4.1758F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        BODY = new ModelPart(this);
        BODY.setPivot(0.0F, 0.0F, 0.0F);
        BODY.setTextureOffset(8, 4).addCuboid(-3.0F, 9.2F, -1.05F, 6.0F, 1.0F, 2.0F, 1.2F, false);
        BODY.setTextureOffset(7, 2).addCuboid(-3.5F, 0.8F, -1.6F, 7.0F, 7.0F, 3.0F, 1.1F, false);
        BODY.setTextureOffset(14, 5).addCuboid(-3.5F, 0.8F, -1.8F, 7.0F, 4.0F, -1.0F, 1.2F, false);
        BODY.setTextureOffset(5, 58).addCuboid(-0.4674F, 2.0285F, -3.55F, 1.0F, 2.0F, 1.0F, -0.1F, false);
        BODY.setTextureOffset(39, 34).addCuboid(-3.5F, 12.05F, -1.5F, 7.0F, -1.0F, 3.0F, 1.0F, false);

        CenterCrest_r1 = new ModelPart(this);
        CenterCrest_r1.setPivot(-2.7679F, 2.987F, -3.25F);
        BODY.addChild(CenterCrest_r1);
        setRotationAngle(CenterCrest_r1, 0.0F, 0.0F, 1.3526F);
        CenterCrest_r1.setTextureOffset(5, 58).addCuboid(-0.3F, -2.8F, -0.5F, 2.0F, 1.0F, 1.0F, -0.3F, false);
        CenterCrest_r1.setTextureOffset(5, 58).addCuboid(-0.3F, -2.8F, -0.5F, 3.0F, 1.0F, 1.0F, -0.3F, false);

        CenterCrest_r2 = new ModelPart(this);
        CenterCrest_r2.setPivot(2.813F, 2.9322F, -3.25F);
        BODY.addChild(CenterCrest_r2);
        setRotationAngle(CenterCrest_r2, 0.0F, 0.0F, -1.3526F);
        CenterCrest_r2.setTextureOffset(5, 58).addCuboid(-0.2F, -3.1F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, true);

        CenterCrest_r3 = new ModelPart(this);
        CenterCrest_r3.setPivot(2.801F, 2.9999F, -3.25F);
        BODY.addChild(CenterCrest_r3);
        setRotationAngle(CenterCrest_r3, 0.0F, 0.0F, 1.3526F);
        CenterCrest_r3.setTextureOffset(5, 58).addCuboid(-2.0F, 1.6F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, true);
        CenterCrest_r3.setTextureOffset(5, 58).addCuboid(-1.6F, 1.6F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, true);

        CenterCrest_r4 = new ModelPart(this);
        CenterCrest_r4.setPivot(2.8015F, 2.987F, -3.25F);
        BODY.addChild(CenterCrest_r4);
        setRotationAngle(CenterCrest_r4, 0.0F, 0.0F, -1.3526F);
        CenterCrest_r4.setTextureOffset(5, 58).addCuboid(-2.7F, -2.8F, -0.5F, 3.0F, 1.0F, 1.0F, -0.3F, true);

        CenterCrest_r5 = new ModelPart(this);
        CenterCrest_r5.setPivot(-2.7794F, 2.9322F, -3.25F);
        BODY.addChild(CenterCrest_r5);
        setRotationAngle(CenterCrest_r5, 0.0F, 0.0F, 1.3526F);
        CenterCrest_r5.setTextureOffset(5, 58).addCuboid(-0.8F, -3.1F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, false);

        CenterCrest_r6 = new ModelPart(this);
        CenterCrest_r6.setPivot(-2.7674F, 2.9999F, -3.25F);
        BODY.addChild(CenterCrest_r6);
        setRotationAngle(CenterCrest_r6, 0.0F, 0.0F, -1.3526F);
        CenterCrest_r6.setTextureOffset(5, 58).addCuboid(1.0F, 1.6F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        CenterCrest_r6.setTextureOffset(5, 58).addCuboid(0.6F, 1.6F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, false);

        Crest_r1 = new ModelPart(this);
        Crest_r1.setPivot(1.8266F, 3.6583F, -3.25F);
        BODY.addChild(Crest_r1);
        setRotationAngle(Crest_r1, 0.0F, 0.0F, 0.0873F);
        Crest_r1.setTextureOffset(5, 58).addCuboid(0.0983F, -1.5213F, -0.4F, 1.0F, 1.0F, 1.0F, -0.2F, true);
        Crest_r1.setTextureOffset(5, 58).addCuboid(-1.2017F, -1.8213F, -0.6F, 2.0F, 3.0F, 1.0F, -0.4F, true);

        Crest_r2 = new ModelPart(this);
        Crest_r2.setPivot(1.8266F, 3.6583F, -3.25F);
        BODY.addChild(Crest_r2);
        setRotationAngle(Crest_r2, 0.0F, 0.0F, -2.3562F);
        Crest_r2.setTextureOffset(5, 58).addCuboid(-0.788F, -2.4478F, -0.5F, 1.0F, 2.0F, 1.0F, -0.3F, true);

        Crest_r3 = new ModelPart(this);
        Crest_r3.setPivot(1.8266F, 3.6583F, -3.25F);
        BODY.addChild(Crest_r3);
        setRotationAngle(Crest_r3, 0.0F, 0.0F, 1.8762F);
        Crest_r3.setTextureOffset(5, 58).addCuboid(-0.2156F, -0.0618F, -0.5F, 2.0F, 1.0F, 1.0F, -0.3F, true);

        Crest_r4 = new ModelPart(this);
        Crest_r4.setPivot(1.8266F, 3.6583F, -3.25F);
        BODY.addChild(Crest_r4);
        setRotationAngle(Crest_r4, 0.0F, 0.0F, 1.4835F);
        Crest_r4.setTextureOffset(5, 58).addCuboid(-1.9433F, -0.0112F, -0.5F, 2.0F, 1.0F, 1.0F, -0.3F, true);

        Crest_r5 = new ModelPart(this);
        Crest_r5.setPivot(1.8266F, 3.6583F, -3.25F);
        BODY.addChild(Crest_r5);
        setRotationAngle(Crest_r5, 0.0F, 0.0F, -2.0071F);
        Crest_r5.setTextureOffset(5, 58).addCuboid(-1.5173F, -2.2882F, -0.5F, 1.0F, 2.0F, 1.0F, -0.3F, true);
        Crest_r5.setTextureOffset(5, 58).addCuboid(-1.0173F, -0.0882F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, true);
        Crest_r5.setTextureOffset(5, 58).addCuboid(-0.6173F, -0.0882F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, true);

        Crest_r6 = new ModelPart(this);
        Crest_r6.setPivot(1.8266F, 3.6583F, -3.25F);
        BODY.addChild(Crest_r6);
        setRotationAngle(Crest_r6, 0.0F, 0.0F, -0.6545F);
        Crest_r6.setTextureOffset(5, 58).addCuboid(-1.2579F, 0.1327F, -0.5F, 2.0F, 1.0F, 1.0F, -0.3F, true);

        Crest_r7 = new ModelPart(this);
        Crest_r7.setPivot(1.8266F, 3.6583F, -3.25F);
        BODY.addChild(Crest_r7);
        setRotationAngle(Crest_r7, 0.0F, 0.0F, -0.4363F);
        Crest_r7.setTextureOffset(5, 58).addCuboid(-0.0882F, -0.7827F, -0.5F, 2.0F, 1.0F, 1.0F, -0.3F, true);

        Crest_r8 = new ModelPart(this);
        Crest_r8.setPivot(1.8266F, 3.6583F, -3.25F);
        BODY.addChild(Crest_r8);
        setRotationAngle(Crest_r8, 0.0F, 0.0F, 0.3491F);
        Crest_r8.setTextureOffset(5, 58).addCuboid(-1.6188F, -1.8982F, -0.5F, 3.0F, 1.0F, 1.0F, -0.3F, true);

        Crest_r9 = new ModelPart(this);
        Crest_r9.setPivot(-1.7864F, 3.6583F, -3.25F);
        BODY.addChild(Crest_r9);
        setRotationAngle(Crest_r9, 0.0F, 0.0F, 1.9635F);
        Crest_r9.setTextureOffset(5, 58).addCuboid(0.0173F, -0.0882F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        Crest_r9.setTextureOffset(5, 58).addCuboid(0.5173F, -2.2882F, -0.5F, 1.0F, 2.0F, 1.0F, -0.3F, false);
        Crest_r9.setTextureOffset(5, 58).addCuboid(-0.3827F, -0.0882F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, false);

        Crest_r10 = new ModelPart(this);
        Crest_r10.setPivot(-1.7864F, 3.6583F, -3.25F);
        BODY.addChild(Crest_r10);
        setRotationAngle(Crest_r10, 0.0F, 0.0F, 2.3126F);
        Crest_r10.setTextureOffset(5, 58).addCuboid(-0.212F, -2.4478F, -0.5F, 1.0F, 2.0F, 1.0F, -0.3F, false);

        Crest_r11 = new ModelPart(this);
        Crest_r11.setPivot(-1.7864F, 3.6583F, -3.25F);
        BODY.addChild(Crest_r11);
        setRotationAngle(Crest_r11, 0.0F, 0.0F, -0.1309F);
        Crest_r11.setTextureOffset(5, 58).addCuboid(-0.7983F, -1.8213F, -0.6F, 2.0F, 3.0F, 1.0F, -0.4F, false);
        Crest_r11.setTextureOffset(5, 58).addCuboid(-1.0983F, -1.5213F, -0.4F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        Crest_r12 = new ModelPart(this);
        Crest_r12.setPivot(-1.7864F, 3.6583F, -3.25F);
        BODY.addChild(Crest_r12);
        setRotationAngle(Crest_r12, 0.0F, 0.0F, 0.6109F);
        Crest_r12.setTextureOffset(5, 58).addCuboid(-0.7421F, 0.1327F, -0.5F, 2.0F, 1.0F, 1.0F, -0.3F, false);

        Crest_r13 = new ModelPart(this);
        Crest_r13.setPivot(-1.7864F, 3.6583F, -3.25F);
        BODY.addChild(Crest_r13);
        setRotationAngle(Crest_r13, 0.0F, 0.0F, 0.3927F);
        Crest_r13.setTextureOffset(5, 58).addCuboid(-1.9118F, -0.7827F, -0.5F, 2.0F, 1.0F, 1.0F, -0.3F, false);

        Crest_r14 = new ModelPart(this);
        Crest_r14.setPivot(-1.7864F, 3.6583F, -3.25F);
        BODY.addChild(Crest_r14);
        setRotationAngle(Crest_r14, 0.0F, 0.0F, -1.9199F);
        Crest_r14.setTextureOffset(5, 58).addCuboid(-1.7844F, -0.0618F, -0.5F, 2.0F, 1.0F, 1.0F, -0.3F, false);

        Crest_r15 = new ModelPart(this);
        Crest_r15.setPivot(-1.7864F, 3.6583F, -3.25F);
        BODY.addChild(Crest_r15);
        setRotationAngle(Crest_r15, 0.0F, 0.0F, -1.5272F);
        Crest_r15.setTextureOffset(5, 58).addCuboid(-0.0567F, -0.0112F, -0.5F, 2.0F, 1.0F, 1.0F, -0.3F, false);

        Crest_r16 = new ModelPart(this);
        Crest_r16.setPivot(-1.7864F, 3.6583F, -3.25F);
        BODY.addChild(Crest_r16);
        setRotationAngle(Crest_r16, 0.0F, 0.0F, -0.3927F);
        Crest_r16.setTextureOffset(5, 58).addCuboid(-1.3812F, -1.8982F, -0.5F, 3.0F, 1.0F, 1.0F, -0.3F, false);

        RIGHTARM = new ModelPart(this);
        RIGHTARM.setPivot(-5.0F, 2.0F, 0.0F);
        RIGHTARM.setTextureOffset(2, 16).addCuboid(-3.0F, -1.3F, -2.0F, 3.0F, 2.0F, 4.0F, 1.3F, false);
        RIGHTARM.setTextureOffset(12, 3).addCuboid(-3.0041F, 1.9548F, -2.0F, 4.0F, 3.0F, 4.0F, 0.2F, false);
        RIGHTARM.setTextureOffset(12, 3).addCuboid(-3.0041F, 6.3548F, -2.0F, 4.0F, 3.0F, 4.0F, 0.2F, false);
        RIGHTARM.setTextureOffset(42, 32).addCuboid(-3.0541F, 5.1548F, -2.0F, 4.0F, 1.0F, 4.0F, 0.1F, false);
        RIGHTARM.setTextureOffset(31, 44).addCuboid(-4.1F, -3.55F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        LeftShoulderTooth3_r1 = new ModelPart(this);
        LeftShoulderTooth3_r1.setPivot(-3.0F, -2.85F, 0.0F);
        RIGHTARM.addChild(LeftShoulderTooth3_r1);
        setRotationAngle(LeftShoulderTooth3_r1, 0.0F, 0.0F, 0.3491F);
        LeftShoulderTooth3_r1.setTextureOffset(31, 44).addCuboid(-1.4F, -1.9F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, true);

        LeftShoulderTooth2_r1 = new ModelPart(this);
        LeftShoulderTooth2_r1.setPivot(-3.0F, -2.85F, 0.0F);
        RIGHTARM.addChild(LeftShoulderTooth2_r1);
        setRotationAngle(LeftShoulderTooth2_r1, 0.0F, 0.0F, 0.2793F);
        LeftShoulderTooth2_r1.setTextureOffset(31, 44).addCuboid(-1.3F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, -0.1F, true);

        RightShoulder_r1 = new ModelPart(this);
        RightShoulder_r1.setPivot(-1.4715F, 1.443F, 0.0F);
        RIGHTARM.addChild(RightShoulder_r1);
        setRotationAngle(RightShoulder_r1, 0.0F, 0.0F, 1.1781F);
        RightShoulder_r1.setTextureOffset(2, 16).addCuboid(0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 1.2F, false);

        RightShoulder_r2 = new ModelPart(this);
        RightShoulder_r2.setPivot(-0.9388F, -2.0367F, 0.0F);
        RIGHTARM.addChild(RightShoulder_r2);
        setRotationAngle(RightShoulder_r2, 0.0F, 0.0F, -1.3526F);
        RightShoulder_r2.setTextureOffset(2, 16).addCuboid(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 5.0F, 0.7F, false);

        RightShoulder_r3 = new ModelPart(this);
        RightShoulder_r3.setPivot(-3.0572F, -2.1292F, 0.0F);
        RIGHTARM.addChild(RightShoulder_r3);
        setRotationAngle(RightShoulder_r3, 0.0F, 0.0F, 1.4399F);
        RightShoulder_r3.setTextureOffset(2, 16).addCuboid(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 5.0F, 0.7F, false);

        RightShoulder_r4 = new ModelPart(this);
        RightShoulder_r4.setPivot(0.4021F, 2.6981F, 0.0F);
        RIGHTARM.addChild(RightShoulder_r4);
        setRotationAngle(RightShoulder_r4, 0.0F, 0.0F, 0.1309F);
        RightShoulder_r4.setTextureOffset(2, 16).addCuboid(-4.7F, -4.0F, -2.5F, 0.0F, 1.0F, 5.0F, 0.7F, false);

        RightShoulder_r5 = new ModelPart(this);
        RightShoulder_r5.setPivot(-2.7153F, 3.6943F, 0.0F);
        RIGHTARM.addChild(RightShoulder_r5);
        setRotationAngle(RightShoulder_r5, 0.0F, 0.0F, -0.1309F);
        RightShoulder_r5.setTextureOffset(2, 16).addCuboid(-0.2F, -3.0F, -2.0F, 0.0F, 0.0F, 4.0F, 1.2F, false);

        RightShoulder_r6 = new ModelPart(this);
        RightShoulder_r6.setPivot(-2.6015F, 1.2964F, 0.0F);
        RIGHTARM.addChild(RightShoulder_r6);
        setRotationAngle(RightShoulder_r6, 0.0F, 0.0F, -1.1781F);
        RightShoulder_r6.setTextureOffset(2, 16).addCuboid(-0.2F, -0.1F, -2.0F, 0.0F, 0.0F, 4.0F, 1.2F, false);

        LEFTARM = new ModelPart(this);
        LEFTARM.setPivot(5.0F, 2.0F, 0.0F);
        LEFTARM.setTextureOffset(2, 16).addCuboid(0.0F, -1.3F, -2.0F, 3.0F, 2.0F, 4.0F, 1.3F, true);
        LEFTARM.setTextureOffset(12, 3).addCuboid(-0.9959F, 6.3548F, -2.0F, 4.0F, 3.0F, 4.0F, 0.2F, true);
        LEFTARM.setTextureOffset(12, 3).addCuboid(-0.9959F, 1.9548F, -2.0F, 4.0F, 3.0F, 4.0F, 0.2F, true);
        LEFTARM.setTextureOffset(42, 32).addCuboid(-0.9459F, 5.1548F, -2.0F, 4.0F, 1.0F, 4.0F, 0.1F, true);
        LEFTARM.setTextureOffset(31, 44).addCuboid(3.1F, -3.55F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        LeftShoulderTooth3_r2 = new ModelPart(this);
        LeftShoulderTooth3_r2.setPivot(3.0F, -2.85F, 0.0F);
        LEFTARM.addChild(LeftShoulderTooth3_r2);
        setRotationAngle(LeftShoulderTooth3_r2, 0.0F, 0.0F, -0.3491F);
        LeftShoulderTooth3_r2.setTextureOffset(31, 44).addCuboid(0.4F, -1.9F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        LeftShoulderTooth2_r2 = new ModelPart(this);
        LeftShoulderTooth2_r2.setPivot(3.0F, -2.85F, 0.0F);
        LEFTARM.addChild(LeftShoulderTooth2_r2);
        setRotationAngle(LeftShoulderTooth2_r2, 0.0F, 0.0F, -0.2793F);
        LeftShoulderTooth2_r2.setTextureOffset(31, 44).addCuboid(0.3F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, -0.1F, false);

        LeftShoulder_r1 = new ModelPart(this);
        LeftShoulder_r1.setPivot(1.4715F, 1.443F, 0.0F);
        LEFTARM.addChild(LeftShoulder_r1);
        setRotationAngle(LeftShoulder_r1, 0.0F, 0.0F, -1.1781F);
        LeftShoulder_r1.setTextureOffset(2, 16).addCuboid(0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 1.2F, true);

        LeftShoulder_r2 = new ModelPart(this);
        LeftShoulder_r2.setPivot(0.9388F, -2.0367F, 0.0F);
        LEFTARM.addChild(LeftShoulder_r2);
        setRotationAngle(LeftShoulder_r2, 0.0F, 0.0F, 1.3526F);
        LeftShoulder_r2.setTextureOffset(2, 16).addCuboid(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 5.0F, 0.7F, true);

        LeftShoulder_r3 = new ModelPart(this);
        LeftShoulder_r3.setPivot(3.0572F, -2.1292F, 0.0F);
        LEFTARM.addChild(LeftShoulder_r3);
        setRotationAngle(LeftShoulder_r3, 0.0F, 0.0F, -1.4399F);
        LeftShoulder_r3.setTextureOffset(2, 16).addCuboid(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 5.0F, 0.7F, true);

        LeftShoulder_r4 = new ModelPart(this);
        LeftShoulder_r4.setPivot(-0.4021F, 2.6981F, 0.0F);
        LEFTARM.addChild(LeftShoulder_r4);
        setRotationAngle(LeftShoulder_r4, 0.0F, 0.0F, -0.1309F);
        LeftShoulder_r4.setTextureOffset(2, 16).addCuboid(4.7F, -4.0F, -2.5F, 0.0F, 1.0F, 5.0F, 0.7F, true);

        LeftShoulder_r5 = new ModelPart(this);
        LeftShoulder_r5.setPivot(2.7153F, 3.6943F, 0.0F);
        LEFTARM.addChild(LeftShoulder_r5);
        setRotationAngle(LeftShoulder_r5, 0.0F, 0.0F, 0.1309F);
        LeftShoulder_r5.setTextureOffset(2, 16).addCuboid(0.2F, -3.0F, -2.0F, 0.0F, 0.0F, 4.0F, 1.2F, true);

        LeftShoulder_r6 = new ModelPart(this);
        LeftShoulder_r6.setPivot(2.6015F, 1.2964F, 0.0F);
        LEFTARM.addChild(LeftShoulder_r6);
        setRotationAngle(LeftShoulder_r6, 0.0F, 0.0F, 1.1781F);
        LeftShoulder_r6.setTextureOffset(2, 16).addCuboid(0.2F, -0.1F, -2.0F, 0.0F, 0.0F, 4.0F, 1.2F, true);

        RIGHTLEG = new ModelPart(this);
        RIGHTLEG.setPivot(-1.9F, 12.0F, 0.0F);
        RIGHTLEG.setTextureOffset(4, 17).addCuboid(-1.5F, 5.2F, -1.5F, 3.0F, 0.0F, 3.0F, 0.7F, true);
        RIGHTLEG.setTextureOffset(13, 4).addCuboid(-2.0F, 6.0F, -2.0F, 4.0F, 0.0F, 4.0F, 0.7F, true);
        RIGHTLEG.setTextureOffset(43, 31).addCuboid(-1.6F, 0.75F, -1.5F, 3.0F, -1.0F, 3.0F, 0.8F, true);

        RightLeg_r1 = new ModelPart(this);
        RightLeg_r1.setPivot(-4.6837F, -3.789F, 0.0F);
        RIGHTLEG.addChild(RightLeg_r1);
        setRotationAngle(RightLeg_r1, 0.0F, 0.0F, -0.1309F);
        RightLeg_r1.setTextureOffset(16, 6).addCuboid(5.7F, 5.6F, -1.5F, 0.0F, 0.0F, 3.0F, 0.6F, true);

        RightLeg_r2 = new ModelPart(this);
        RightLeg_r2.setPivot(-1.5F, -2.0F, 0.0F);
        RIGHTLEG.addChild(RightLeg_r2);
        setRotationAngle(RightLeg_r2, 0.0F, 0.0F, 0.1309F);
        RightLeg_r2.setTextureOffset(16, 6).addCuboid(3.7F, 3.6F, -1.5F, 0.0F, 2.0F, 3.0F, 0.6F, true);

        RightLeg_r3 = new ModelPart(this);
        RightLeg_r3.setPivot(-1.5F, -4.63F, -1.8503F);
        RIGHTLEG.addChild(RightLeg_r3);
        setRotationAngle(RightLeg_r3, 0.0873F, 0.0F, 0.0F);
        RightLeg_r3.setTextureOffset(16, 6).addCuboid(0.55F, 5.9F, 3.1F, 2.0F, 0.0F, 0.0F, 0.6F, true);

        RightLeg_r4 = new ModelPart(this);
        RightLeg_r4.setPivot(-1.5F, -2.0F, 0.0F);
        RIGHTLEG.addChild(RightLeg_r4);
        setRotationAngle(RightLeg_r4, -0.0873F, 0.0F, 0.0F);
        RightLeg_r4.setTextureOffset(16, 6).addCuboid(0.55F, 3.9F, 2.1F, 2.0F, 2.0F, 0.0F, 0.6F, true);

        RightLeg_r5 = new ModelPart(this);
        RightLeg_r5.setPivot(-0.1947F, -4.8072F, 0.0F);
        RIGHTLEG.addChild(RightLeg_r5);
        setRotationAngle(RightLeg_r5, 0.0F, 0.0F, 0.1309F);
        RightLeg_r5.setTextureOffset(16, 6).addCuboid(-0.8F, 6.0F, -1.5F, 0.0F, 0.0F, 3.0F, 0.6F, true);

        RightLeg_r6 = new ModelPart(this);
        RightLeg_r6.setPivot(-1.5F, -2.0F, 0.0F);
        RIGHTLEG.addChild(RightLeg_r6);
        setRotationAngle(RightLeg_r6, 0.0F, 0.0F, -0.1309F);
        RightLeg_r6.setTextureOffset(16, 6).addCuboid(-0.8F, 4.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.6F, true);

        RightLeg_r7 = new ModelPart(this);
        RightLeg_r7.setPivot(-1.5F, -4.7172F, 0.8541F);
        RIGHTLEG.addChild(RightLeg_r7);
        setRotationAngle(RightLeg_r7, -0.0873F, 0.0F, 0.0F);
        RightLeg_r7.setTextureOffset(16, 6).addCuboid(0.55F, 5.9F, -2.1F, 2.0F, 0.0F, 0.0F, 0.6F, true);

        RightLeg_r8 = new ModelPart(this);
        RightLeg_r8.setPivot(-1.5F, -2.0F, 0.0F);
        RIGHTLEG.addChild(RightLeg_r8);
        setRotationAngle(RightLeg_r8, 0.0873F, 0.0F, 0.0F);
        RightLeg_r8.setTextureOffset(16, 6).addCuboid(0.55F, 3.9F, -2.1F, 2.0F, 2.0F, 0.0F, 0.6F, true);

        RightLeg_r9 = new ModelPart(this);
        RightLeg_r9.setPivot(-1.5F, 2.5F, 0.0F);
        RIGHTLEG.addChild(RightLeg_r9);
        setRotationAngle(RightLeg_r9, 0.0F, 0.0F, 0.1309F);
        RightLeg_r9.setTextureOffset(16, 6).addCuboid(3.7F, 3.6F, -1.5F, 0.0F, 2.0F, 3.0F, 0.8F, true);

        RightLeg_r10 = new ModelPart(this);
        RightLeg_r10.setPivot(-1.5F, 2.5F, 0.0F);
        RIGHTLEG.addChild(RightLeg_r10);
        setRotationAngle(RightLeg_r10, -0.0873F, 0.0F, 0.0F);
        RightLeg_r10.setTextureOffset(16, 6).addCuboid(0.55F, 3.9F, 2.1F, 2.0F, 2.0F, 0.0F, 0.8F, true);

        RightLeg_r11 = new ModelPart(this);
        RightLeg_r11.setPivot(-1.5F, 2.5F, 0.0F);
        RIGHTLEG.addChild(RightLeg_r11);
        setRotationAngle(RightLeg_r11, 0.0873F, 0.0F, 0.0F);
        RightLeg_r11.setTextureOffset(16, 6).addCuboid(0.55F, 3.9F, -2.1F, 2.0F, 2.0F, 0.0F, 0.8F, true);

        RightLeg_r12 = new ModelPart(this);
        RightLeg_r12.setPivot(-1.5F, 2.5F, 0.0F);
        RIGHTLEG.addChild(RightLeg_r12);
        setRotationAngle(RightLeg_r12, 0.0F, 0.0F, -0.1309F);
        RightLeg_r12.setTextureOffset(16, 6).addCuboid(-0.8F, 4.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.8F, true);

        LEFTLEG = new ModelPart(this);
        LEFTLEG.setPivot(1.9F, 12.0F, 0.0F);
        LEFTLEG.setTextureOffset(4, 17).addCuboid(-1.5F, 5.2F, -1.5F, 3.0F, 0.0F, 3.0F, 0.7F, false);
        LEFTLEG.setTextureOffset(13, 4).addCuboid(-2.0F, 6.0F, -2.0F, 4.0F, 0.0F, 4.0F, 0.7F, false);
        LEFTLEG.setTextureOffset(43, 31).addCuboid(-1.4F, 0.75F, -1.5F, 3.0F, -1.0F, 3.0F, 0.8F, false);

        LeftLeg_r1 = new ModelPart(this);
        LeftLeg_r1.setPivot(4.6837F, -3.789F, 0.0F);
        LEFTLEG.addChild(LeftLeg_r1);
        setRotationAngle(LeftLeg_r1, 0.0F, 0.0F, 0.1309F);
        LeftLeg_r1.setTextureOffset(16, 6).addCuboid(-5.7F, 5.6F, -1.5F, 0.0F, 0.0F, 3.0F, 0.6F, false);

        LeftLeg_r2 = new ModelPart(this);
        LeftLeg_r2.setPivot(1.5F, -2.0F, 0.0F);
        LEFTLEG.addChild(LeftLeg_r2);
        setRotationAngle(LeftLeg_r2, 0.0F, 0.0F, -0.1309F);
        LeftLeg_r2.setTextureOffset(16, 6).addCuboid(-3.7F, 3.6F, -1.5F, 0.0F, 2.0F, 3.0F, 0.6F, false);

        LeftLeg_r3 = new ModelPart(this);
        LeftLeg_r3.setPivot(1.5F, -4.63F, -1.8503F);
        LEFTLEG.addChild(LeftLeg_r3);
        setRotationAngle(LeftLeg_r3, 0.0873F, 0.0F, 0.0F);
        LeftLeg_r3.setTextureOffset(16, 6).addCuboid(-2.55F, 5.9F, 3.1F, 2.0F, 0.0F, 0.0F, 0.6F, false);

        LeftLeg_r4 = new ModelPart(this);
        LeftLeg_r4.setPivot(1.5F, -2.0F, 0.0F);
        LEFTLEG.addChild(LeftLeg_r4);
        setRotationAngle(LeftLeg_r4, -0.0873F, 0.0F, 0.0F);
        LeftLeg_r4.setTextureOffset(16, 6).addCuboid(-2.55F, 3.9F, 2.1F, 2.0F, 2.0F, 0.0F, 0.6F, false);

        LeftLeg_r5 = new ModelPart(this);
        LeftLeg_r5.setPivot(0.1947F, -4.8072F, 0.0F);
        LEFTLEG.addChild(LeftLeg_r5);
        setRotationAngle(LeftLeg_r5, 0.0F, 0.0F, -0.1309F);
        LeftLeg_r5.setTextureOffset(16, 6).addCuboid(0.8F, 6.0F, -1.5F, 0.0F, 0.0F, 3.0F, 0.6F, false);

        LeftLeg_r6 = new ModelPart(this);
        LeftLeg_r6.setPivot(1.5F, -2.0F, 0.0F);
        LEFTLEG.addChild(LeftLeg_r6);
        setRotationAngle(LeftLeg_r6, 0.0F, 0.0F, 0.1309F);
        LeftLeg_r6.setTextureOffset(16, 6).addCuboid(0.8F, 4.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.6F, false);

        LeftLeg_r7 = new ModelPart(this);
        LeftLeg_r7.setPivot(1.5F, -4.7172F, 0.8541F);
        LEFTLEG.addChild(LeftLeg_r7);
        setRotationAngle(LeftLeg_r7, -0.0873F, 0.0F, 0.0F);
        LeftLeg_r7.setTextureOffset(16, 6).addCuboid(-2.55F, 5.9F, -2.1F, 2.0F, 0.0F, 0.0F, 0.6F, false);

        LeftLeg_r8 = new ModelPart(this);
        LeftLeg_r8.setPivot(1.5F, -2.0F, 0.0F);
        LEFTLEG.addChild(LeftLeg_r8);
        setRotationAngle(LeftLeg_r8, 0.0873F, 0.0F, 0.0F);
        LeftLeg_r8.setTextureOffset(16, 6).addCuboid(-2.55F, 3.9F, -2.1F, 2.0F, 2.0F, 0.0F, 0.6F, false);

        LeftLeg_r9 = new ModelPart(this);
        LeftLeg_r9.setPivot(1.5F, 2.5F, 0.0F);
        LEFTLEG.addChild(LeftLeg_r9);
        setRotationAngle(LeftLeg_r9, 0.0F, 0.0F, -0.1309F);
        LeftLeg_r9.setTextureOffset(16, 6).addCuboid(-3.7F, 3.6F, -1.5F, 0.0F, 2.0F, 3.0F, 0.8F, false);

        LeftLeg_r10 = new ModelPart(this);
        LeftLeg_r10.setPivot(1.5F, 2.5F, 0.0F);
        LEFTLEG.addChild(LeftLeg_r10);
        setRotationAngle(LeftLeg_r10, -0.0873F, 0.0F, 0.0F);
        LeftLeg_r10.setTextureOffset(16, 6).addCuboid(-2.55F, 3.9F, 2.1F, 2.0F, 2.0F, 0.0F, 0.8F, false);

        LeftLeg_r11 = new ModelPart(this);
        LeftLeg_r11.setPivot(1.5F, 2.5F, 0.0F);
        LEFTLEG.addChild(LeftLeg_r11);
        setRotationAngle(LeftLeg_r11, 0.0873F, 0.0F, 0.0F);
        LeftLeg_r11.setTextureOffset(16, 6).addCuboid(-2.55F, 3.9F, -2.1F, 2.0F, 2.0F, 0.0F, 0.8F, false);

        LeftLeg_r12 = new ModelPart(this);
        LeftLeg_r12.setPivot(1.5F, 2.5F, 0.0F);
        LEFTLEG.addChild(LeftLeg_r12);
        setRotationAngle(LeftLeg_r12, 0.0F, 0.0F, 0.1309F);
        LeftLeg_r12.setTextureOffset(16, 6).addCuboid(0.8F, 4.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.8F, false);

        RIGHTFOOT = new ModelPart(this);
        RIGHTFOOT.setPivot(-1.9F, 12.0F, 0.0F);
        RIGHTFOOT.setTextureOffset(3, 42).addCuboid(-1.5F, 10.2F, -1.5F, 3.0F, 1.0F, 3.0F, 1.0F, true);
        RIGHTFOOT.setTextureOffset(5, 44).addCuboid(-1.5F, 11.2F, -3.15F, 3.0F, 0.0F, 0.0F, 0.9F, true);
        RIGHTFOOT.setTextureOffset(2, 27).addCuboid(-2.0F, 9.8F, -2.0F, 4.0F, -1.0F, 4.0F, 0.7F, true);
        RIGHTFOOT.setTextureOffset(31, 44).addCuboid(-0.3F, 9.8F, -4.15F, 1.0F, 1.0F, 1.0F, -0.2F, true);
        RIGHTFOOT.setTextureOffset(31, 44).addCuboid(-0.3F, 9.5F, -4.15F, 1.0F, 1.0F, 1.0F, -0.3F, true);
        RIGHTFOOT.setTextureOffset(31, 44).addCuboid(-0.3F, 9.2F, -4.15F, 1.0F, 1.0F, 1.0F, -0.4F, true);

        RightBoot3_r1 = new ModelPart(this);
        RightBoot3_r1.setPivot(0.0F, 11.0815F, -2.9549F);
        RIGHTFOOT.addChild(RightBoot3_r1);
        setRotationAngle(RightBoot3_r1, -1.3526F, 0.0F, 0.0F);
        RightBoot3_r1.setTextureOffset(5, 44).addCuboid(-1.5F, 0.1F, -0.2F, 3.0F, 0.0F, 0.0F, 0.8F, true);

        LEFTFOOT = new ModelPart(this);
        LEFTFOOT.setPivot(1.9F, 12.0F, 0.0F);
        LEFTFOOT.setTextureOffset(3, 42).addCuboid(-1.5F, 10.2F, -1.5F, 3.0F, 1.0F, 3.0F, 1.0F, false);
        LEFTFOOT.setTextureOffset(5, 44).addCuboid(-1.5F, 11.2F, -3.15F, 3.0F, 0.0F, 0.0F, 0.9F, false);
        LEFTFOOT.setTextureOffset(2, 27).addCuboid(-2.0F, 9.8F, -2.0F, 4.0F, -1.0F, 4.0F, 0.7F, false);
        LEFTFOOT.setTextureOffset(31, 44).addCuboid(-0.7F, 9.8F, -4.15F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        LEFTFOOT.setTextureOffset(31, 44).addCuboid(-0.7F, 9.5F, -4.15F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        LEFTFOOT.setTextureOffset(31, 44).addCuboid(-0.7F, 9.2F, -4.15F, 1.0F, 1.0F, 1.0F, -0.4F, false);

        LeftBoot3_r1 = new ModelPart(this);
        LeftBoot3_r1.setPivot(0.0F, 11.0815F, -2.9549F);
        LEFTFOOT.addChild(LeftBoot3_r1);
        setRotationAngle(LeftBoot3_r1, -1.3526F, 0.0F, 0.0F);
        LeftBoot3_r1.setTextureOffset(5, 44).addCuboid(-1.5F, 0.1F, -0.2F, 3.0F, 0.0F, 0.0F, 0.8F, false);

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