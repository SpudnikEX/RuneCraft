package net.armor;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;

public class HallowedArmorModel extends EntityArmorModel {
    private final ModelPart HEAD;
    //private final ModelPart RightWing_r1;
    //private final ModelPart LeftWing_r1;
    private final ModelPart BODY;
    private final ModelPart RIGHTARM;
    private final ModelPart LEFTARM;
    private final ModelPart RIGHTLEG;
    private final ModelPart LEFTLEG;

    private final ModelPart Front;
    private final ModelPart BottomFaceguardBar_r1;
    private final ModelPart TopFaceguardBar_r1;
    private final ModelPart LeftSide;
    private final ModelPart HelmetFaceGuard2_r1;
    private final ModelPart HelmetFaceGuard1_r1;
    private final ModelPart RightSide;
    private final ModelPart HelmetFaceGuard3_r1;
    private final ModelPart HelmetFaceGuard2_r2;
    private final ModelPart Back;
    private final ModelPart Top;
    private final ModelPart Bottom;
    private final ModelPart TasleMount;
    private final ModelPart Helmet2_r1;
    private final ModelPart Tasle;
    private final ModelPart Helmet5_r1;
    private final ModelPart Helmet4_r1;
    private final ModelPart Helmet3_r1;
    private final ModelPart Helmet1_r1;
    private final ModelPart FrontPlate;
    private final ModelPart BackPlate;


    public HallowedArmorModel(EquipmentSlot slot) {
        super(slot);

        textureWidth = 64;
        textureHeight = 64;

        HEAD = new ModelPart(this);
        HEAD.setPivot(0.0F, 20.8889F, 0.0F);
        HEAD.setTextureOffset(32, 0).addCuboid(-4.0F, -28.8889F, -4.0F, 8.0F, 8.0F, 8.0F, 1.5F, false);

        Front = new ModelPart(this);
        Front.setPivot(0.0F, -24.8476F, -4.5562F);
        HEAD.addChild(Front);
        Front.setTextureOffset(64, 4).addCuboid(-3.0F, -1.0412F, 0.5562F, -1.0F, 2.0F, -1.0F, 1.0F, false);
        Front.setTextureOffset(64, 4).addCuboid(-0.75F, -1.0412F, 0.5562F, -1.0F, 2.0F, -1.0F, 1.0F, false);
        Front.setTextureOffset(64, 4).addCuboid(1.75F, -1.0412F, 0.5562F, -1.0F, 2.0F, -1.0F, 1.0F, false);
        Front.setTextureOffset(64, 4).addCuboid(4.0F, -1.0412F, 0.5562F, -1.0F, 2.0F, -1.0F, 1.0F, false);
        Front.setTextureOffset(56, 0).addCuboid(-3.0F, -2.5412F, 1.0562F, 6.0F, 5.0F, -2.0F, 1.0F, false);
        Front.setTextureOffset(43, 5).addCuboid(-3.0F, -3.0412F, 0.5562F, 6.0F, 0.0F, -1.0F, 1.0F, false);
        Front.setTextureOffset(43, 6).addCuboid(-3.0F, 2.9588F, 0.5562F, 6.0F, 0.0F, -1.0F, 1.0F, false);

        BottomFaceguardBar_r1 = new ModelPart(this);
        BottomFaceguardBar_r1.setPivot(0.0F, 2.3277F, -0.0567F);
        Front.addChild(BottomFaceguardBar_r1);
        setRotationAngle(BottomFaceguardBar_r1, -0.0175F, 0.0F, 0.0F);
        BottomFaceguardBar_r1.setTextureOffset(39, 3).addCuboid(-4.0F, 0.5F, 0.5F, 8.0F, -1.0F, -1.0F, 1.0F, false);

        TopFaceguardBar_r1 = new ModelPart(this);
        TopFaceguardBar_r1.setPivot(0.0F, -2.1825F, -0.3382F);
        Front.addChild(TopFaceguardBar_r1);
        setRotationAngle(TopFaceguardBar_r1, -0.5934F, 0.0F, 0.0F);
        TopFaceguardBar_r1.setTextureOffset(39, 2).addCuboid(-4.0F, 0.5F, 0.5F, 8.0F, -1.0F, -1.0F, 1.0F, false);

        LeftSide = new ModelPart(this);
        LeftSide.setPivot(4.4375F, -24.3285F, -1.6195F);
        HEAD.addChild(LeftSide);
        LeftSide.setTextureOffset(20, 21).addCuboid(0.3125F, -3.5603F, -1.8805F, -1.0F, 6.0F, 7.0F, 1.0F, false);

        HelmetFaceGuard2_r1 = new ModelPart(this);
        HelmetFaceGuard2_r1.setPivot(0.0625F, 2.0453F, -0.8973F);
        LeftSide.addChild(HelmetFaceGuard2_r1);
        setRotationAngle(HelmetFaceGuard2_r1, -0.0175F, 0.0F, 0.0F);
        HelmetFaceGuard2_r1.setTextureOffset(19, 1).addCuboid(0.5F, 0.3F, -1.6F, -1.0F, -1.0F, 4.0F, 1.0F, false);

        HelmetFaceGuard1_r1 = new ModelPart(this);
        HelmetFaceGuard1_r1.setPivot(0.0625F, -1.8799F, -1.4193F);
        LeftSide.addChild(HelmetFaceGuard1_r1);
        setRotationAngle(HelmetFaceGuard1_r1, -0.6109F, 0.0F, 0.0F);
        HelmetFaceGuard1_r1.setTextureOffset(17, 0).addCuboid(0.5F, 0.9F, -1.5F, -1.0F, -1.0F, 6.0F, 1.0F, false);

        RightSide = new ModelPart(this);
        RightSide.setPivot(-4.4375F, -23.9893F, -1.7331F);
        HEAD.addChild(RightSide);
        RightSide.setTextureOffset(33, 21).addCuboid(0.6875F, -3.8996F, -1.7669F, -1.0F, 6.0F, 7.0F, 1.0F, false);

        HelmetFaceGuard3_r1 = new ModelPart(this);
        HelmetFaceGuard3_r1.setPivot(-0.0625F, 1.513F, -0.3802F);
        RightSide.addChild(HelmetFaceGuard3_r1);
        setRotationAngle(HelmetFaceGuard3_r1, -0.0175F, 0.0F, 0.0F);
        HelmetFaceGuard3_r1.setTextureOffset(19, 1).addCuboid(0.5F, 0.5F, -2.0F, -1.0F, -1.0F, 4.0F, 1.0F, false);

        HelmetFaceGuard2_r2 = new ModelPart(this);
        HelmetFaceGuard2_r2.setPivot(-0.0625F, -1.0311F, -0.3064F);
        RightSide.addChild(HelmetFaceGuard2_r2);
        setRotationAngle(HelmetFaceGuard2_r2, -0.6109F, 0.0F, 0.0F);
        HelmetFaceGuard2_r2.setTextureOffset(17, 0).addCuboid(0.5F, 0.5F, -3.0F, -1.0F, -1.0F, 6.0F, 1.0F, false);

        Back = new ModelPart(this);
        Back.setPivot(0.0F, -24.8889F, 4.5F);
        HEAD.addChild(Back);
        Back.setTextureOffset(26, 29).addCuboid(-3.5F, -3.0F, 0.5F, 7.0F, 6.0F, -1.0F, 1.0F, false);

        Top = new ModelPart(this);
        Top.setPivot(0.0F, -29.0139F, 0.5625F);
        HEAD.addChild(Top);
        Top.setTextureOffset(19, 28).addCuboid(-3.5F, 0.875F, -4.0625F, 7.0F, -1.0F, 7.0F, 1.0F, false);
        Top.setTextureOffset(19, 28).addCuboid(-3.0F, 0.625F, -3.3125F, 6.0F, -1.0F, 6.0F, 1.0F, false);
        Top.setTextureOffset(19, 28).addCuboid(-2.5F, 0.375F, -2.3125F, 5.0F, -1.0F, 5.0F, 1.0F, false);

        Bottom = new ModelPart(this);
        Bottom.setPivot(0.0F, -21.1389F, 0.0F);
        HEAD.addChild(Bottom);
        Bottom.setTextureOffset(19, 31).addCuboid(-3.5F, 0.5F, -3.5F, 7.0F, -1.0F, 7.0F, 1.0F, false);

        TasleMount = new ModelPart(this);
        TasleMount.setPivot(0.0F, -29.4262F, 4.61F);
        HEAD.addChild(TasleMount);
        TasleMount.setTextureOffset(58, 19).addCuboid(-0.5F, 0.2873F, -0.36F, 1.0F, 0.0F, 0.0F, 1.0F, false);
        TasleMount.setTextureOffset(54, 18).addCuboid(-0.5F, 0.5373F, -5.36F, 1.0F, -1.0F, 4.0F, 1.0F, false);

        Helmet2_r1 = new ModelPart(this);
        Helmet2_r1.setPivot(0.0F, -0.7873F, 0.11F);
        TasleMount.addChild(Helmet2_r1);
        setRotationAngle(Helmet2_r1, 0.5236F, 0.0F, 0.0F);
        Helmet2_r1.setTextureOffset(58, 21).addCuboid(-0.5F, 1.0F, 0.25F, 1.0F, -1.0F, 0.0F, 1.0F, false);

        Tasle = new ModelPart(this);
        Tasle.setPivot(0.0F, -30.1048F, 7.8851F);
        HEAD.addChild(Tasle);
        Tasle.setTextureOffset(61, 9).addCuboid(0.0F, -1.7238F, -0.6755F, 0.0F, -1.0F, 1.0F, 1.0F, false);

        Helmet5_r1 = new ModelPart(this);
        Helmet5_r1.setPivot(0.0F, 3.1645F, 0.9209F);
        Tasle.addChild(Helmet5_r1);
        setRotationAngle(Helmet5_r1, 2.3562F, 0.0F, 0.0F);
        Helmet5_r1.setTextureOffset(60, 12).addCuboid(0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, false);

        Helmet4_r1 = new ModelPart(this);
        Helmet4_r1.setPivot(0.0F, 1.5307F, 0.7882F);
        Tasle.addChild(Helmet4_r1);
        setRotationAngle(Helmet4_r1, 1.2654F, 0.0F, 0.0F);
        Helmet4_r1.setTextureOffset(60, 11).addCuboid(0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 1.0F, 1.0F, false);

        Helmet3_r1 = new ModelPart(this);
        Helmet3_r1.setPivot(0.0F, -1.1714F, 1.0246F);
        Tasle.addChild(Helmet3_r1);
        setRotationAngle(Helmet3_r1, 1.7017F, 0.0F, 0.0F);
        Helmet3_r1.setTextureOffset(59, 11).addCuboid(0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 1.0F, 1.0F, false);

        Helmet1_r1 = new ModelPart(this);
        Helmet1_r1.setPivot(0.0F, -1.8F, -2.0582F);
        Tasle.addChild(Helmet1_r1);
        setRotationAngle(Helmet1_r1, 1.1781F, 0.0F, 0.0F);
        Helmet1_r1.setTextureOffset(60, 8).addCuboid(0.0F, 1.0F, -1.0F, 0.0F, -1.0F, 1.0F, 1.0F, false);

        BODY = new ModelPart(this);
        BODY.setPivot(0.0F, 0.0F, 20.25F);
        BODY.setTextureOffset(22, 46).addCuboid(-4.0F, 12.65F, -21.75F, 8.0F, -1.0F, 3.0F, 1.01F, false);

        FrontPlate = new ModelPart(this);
        FrontPlate.setPivot(0.0F, 24.0F, 0.0F);
        BODY.addChild(FrontPlate);
        FrontPlate.setTextureOffset(0, 62).addCuboid(-3.5F, -15.5F, -21.6F, 7.0F, 3.0F, -1.0F, 1.01F, false);
        FrontPlate.setTextureOffset(28, 34).addCuboid(-3.5F, -23.5F, -22.25F, 7.0F, 4.0F, -1.0F, 1.01F, false);
        FrontPlate.setTextureOffset(0, 50).addCuboid(-3.5F, -20.1F, -21.75F, 7.0F, 4.0F, -1.0F, 1.01F, false);

        BackPlate = new ModelPart(this);
        BackPlate.setPivot(0.0F, 24.0F, 0.0F);
        BODY.addChild(BackPlate);
        BackPlate.setTextureOffset(18, 28).addCuboid(-4.0F, -23.4F, -21.65F, 8.0F, 5.0F, 3.0F, 1.01F, false);
        BackPlate.setTextureOffset(18, 28).addCuboid(-3.5F, -16.4F, -20.85F, 7.0F, 3.0F, 2.0F, 1.01F, false);

        RIGHTARM = new ModelPart(this);
        RIGHTARM.setPivot(-5.0F, 2.0F, 0.0F);
        RIGHTARM.setTextureOffset(48, 28).addCuboid(-3.0F, -1.3F, -2.0F, 4.0F, 2.0F, 4.0F, 1.0F, false);
        RIGHTARM.setTextureOffset(2, 37).addCuboid(-2.5F, -1.25F, -1.5F, 3.0F, 10.0F, 3.0F, 1.0F, false);

        LEFTARM = new ModelPart(this);
        LEFTARM.setPivot(5.0F, 2.0F, 0.0F);
        LEFTARM.setTextureOffset(48, 28).addCuboid(-1.0F, -1.3F, -2.0F, 4.0F, 2.0F, 4.0F, 1.0F, false);
        LEFTARM.setTextureOffset(2, 36).addCuboid(-0.5F, -1.25F, -1.5F, 3.0F, 10.0F, 3.0F, 1.0F, true);

        RIGHTLEG = new ModelPart(this);
        RIGHTLEG.setPivot(-1.4F, 9.5F, 1.25F);
        RIGHTLEG.setTextureOffset(24, 29).addCuboid(-2.0F, 3.4F, -1.9F, 3.0F, 10.0F, 2.0F, 1.0F, false);
        RIGHTLEG.setTextureOffset(20, 29).addCuboid(-2.0F, 3.4F, -2.6F, 3.0F, 10.0F, -1.0F, 1.0F, false);
        RIGHTLEG.setTextureOffset(53, 46).addCuboid(-2.05F, 7.5F, -2.75F, 1.0F, 0.0F, 3.0F, 1.0F, false);
        RIGHTLEG.setTextureOffset(53, 46).addCuboid(0.05F, 7.5F, -2.75F, 1.0F, 0.0F, 3.0F, 1.0F, false);
        RIGHTLEG.setTextureOffset(50, 59).addCuboid(-2.5F, 13.1F, -2.75F, 4.0F, 1.0F, 3.0F, 1.0F, false);
        RIGHTLEG.setTextureOffset(54, 59).addCuboid(-2.0F, 13.1F, -4.25F, 3.0F, 1.0F, 3.0F, 1.0F, false);

        LEFTLEG = new ModelPart(this);
        LEFTLEG.setPivot(1.9F, 12.0F, 0.0F);
        LEFTLEG.setTextureOffset(34, 28).addCuboid(-1.55F, 0.9F, -0.65F, 3.0F, 10.0F, 2.0F, 1.0F, false);
        LEFTLEG.setTextureOffset(37, 29).addCuboid(-1.55F, 0.9F, -1.35F, 3.0F, 10.0F, -1.0F, 1.0F, false);
        LEFTLEG.setTextureOffset(53, 46).addCuboid(0.55F, 5.0F, -1.5F, 1.0F, 0.0F, 3.0F, 1.0F, false);
        LEFTLEG.setTextureOffset(53, 46).addCuboid(-1.65F, 5.0F, -1.5F, 1.0F, 0.0F, 3.0F, 1.0F, false);
        LEFTLEG.setTextureOffset(50, 59).addCuboid(-2.05F, 10.6F, -1.5F, 4.0F, 1.0F, 3.0F, 1.0F, false);
        LEFTLEG.setTextureOffset(54, 59).addCuboid(-1.55F, 10.6F, -3.0F, 3.0F, 1.0F, 3.0F, 1.0F, false);

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
