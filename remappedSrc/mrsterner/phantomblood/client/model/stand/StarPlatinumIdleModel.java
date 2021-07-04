package mrsterner.phantomblood.client.model.stand;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.Nullable;

public class StarPlatinumIdleModel extends EntityModel<LivingEntity> {
    private final ModelPart body;
    private final ModelPart chest;
    private final ModelPart bodybot;
    private final ModelPart cloth1;
    private final ModelPart cloth2;
    private final ModelPart crotch;
    private final ModelPart leftarm;
    private final ModelPart lefthand;
    private final ModelPart armorl;
    private final ModelPart rightarm;
    private final ModelPart righthand;
    private final ModelPart armorr;
    private final ModelPart scarf;
    private final ModelPart scarf2;
    private final ModelPart chesttop;
    private final ModelPart head;
    private final ModelPart headband;
    private final ModelPart hair1;
    private final ModelPart hair2;
    private final ModelPart hair3;
    private final ModelPart hair4;
    private final ModelPart hair5;
    private final ModelPart hair6;
    private final ModelPart leftleg;
    private final ModelPart leftlegbot;
    private final ModelPart rightleg;
    private final ModelPart rightlegbot;
    private final ModelPart hands;
    private double yOffset;
    private float off;
    public StarPlatinumIdleModel() {
        textureWidth = 64;
        textureHeight = 128;
        body = new ModelPart(this);
        body.setPivot(0.0F, 0.0F, 0.0F);
        body.setTextureOffset(16, 16).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F, 0.0F, false);

        chest = new ModelPart(this);
        chest.setPivot(0.0F, 0.0F, -2.3F);
        body.addChild(chest);
        setRotationAngle(chest, -0.0873F, 0.0F, 0.0F);
        chest.setTextureOffset(35, 56).addCuboid(-1.5F, 4.0F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

        bodybot = new ModelPart(this);
        bodybot.setPivot(0.0F, 0.0F, 0.0F);
        body.addChild(bodybot);
        setRotationAngle(bodybot, -0.0175F, 0.0F, 0.0F);
        bodybot.setTextureOffset(19, 66).addCuboid(-3.5F, 7.0F, -2.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);

        cloth1 = new ModelPart(this);
        cloth1.setPivot(0.0F, 12.0F, -4.5F);
        body.addChild(cloth1);
        setRotationAngle(cloth1, -0.0611F, 0.0F, 0.0F);
        cloth1.setTextureOffset(48, 67).addCuboid(-2.0F, -1.5F, 0.5F, 4.0F, 8.0F, 1.0F, 0.0F, false);

        cloth2 = new ModelPart(this);
        cloth2.setPivot(0.0F, 11.0F, 1.0F);
        body.addChild(cloth2);
        setRotationAngle(cloth2, 0.4538F, 0.0F, 0.0F);
        cloth2.setTextureOffset(48, 56).addCuboid(-2.5F, 0.0F, 1.0F, 5.0F, 9.0F, 1.0F, 0.0F, false);

        crotch = new ModelPart(this);
        crotch.setPivot(0.0F, 0.0F, 0.0F);
        body.addChild(crotch);
        setRotationAngle(crotch, 0.0349F, 0.0F, 0.0F);
        crotch.setTextureOffset(16, 82).addCuboid(-4.0F, 10.0F, -3.5F, 8.0F, 2.0F, 6.0F, 0.0F, false);

        leftarm = new ModelPart(this);
        leftarm.setPivot(5.0F, 3.0F, 0.0F);
        body.addChild(leftarm);
        setRotationAngle(leftarm, 0.2618F, -0.0873F, -0.4363F);
        leftarm.setTextureOffset(40, 16).addCuboid(-1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);
        leftarm.setTextureOffset(46, 103).addCuboid(-1.0F, 2.0F, -1.5F, 3.0F, 3.0F, 4.0F, 0.0F, false);

        lefthand = new ModelPart(this);
        lefthand.setPivot(0.0F, 8.0F, 0.5F);
        leftarm.addChild(lefthand);
        setRotationAngle(lefthand, -1.7453F, -0.2618F, 0.6981F);
        lefthand.setTextureOffset(48, 4).addCuboid(-2.5F, -2.0F, -4.5F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        armorl = new ModelPart(this);
        armorl.setPivot(2.0F, -2.5F, 0.9F);
        leftarm.addChild(armorl);
        armorl.setTextureOffset(0, 74).addCuboid(-2.0F, -0.5F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);

        rightarm = new ModelPart(this);
        rightarm.setPivot(-5.0F, 3.0F, 0.0F);
        body.addChild(rightarm);
        setRotationAngle(rightarm, 0.1745F, 0.4363F, 0.5236F);
        rightarm.setTextureOffset(40, 16).addCuboid(-3.0F, -2.0F, -2.0F, 4.0F, 4.0F, 5.0F, 0.0F, true);
        rightarm.setTextureOffset(46, 103).addCuboid(-2.5F, 2.0F, -1.5F, 3.0F, 3.0F, 4.0F, 0.0F, true);

        righthand = new ModelPart(this);
        righthand.setPivot(-1.3F, 5.0F, 0.2F);
        rightarm.addChild(righthand);
        setRotationAngle(righthand, -1.4835F, 0.0873F, -0.5236F);
        righthand.setTextureOffset(48, 4).addCuboid(-1.7F, -3.0F, -1.7F, 4.0F, 8.0F, 4.0F, 0.0F, true);

        armorr = new ModelPart(this);
        armorr.setPivot(5.0F, -2.0F, 1.0F);
        rightarm.addChild(armorr);
        armorr.setTextureOffset(0, 74).addCuboid(-9.0F, -1.0F, -3.1F, 4.0F, 1.0F, 6.0F, 0.0F, true);

        scarf = new ModelPart(this);
        scarf.setPivot(0.0F, 0.0F, 0.0F);
        body.addChild(scarf);
        setRotationAngle(scarf, 0.576F, 0.0F, 0.0F);
        scarf.setTextureOffset(24, 35).addCuboid(-5.0F, -1.0F, -4.0F, 10.0F, 2.0F, 10.0F, 0.0F, false);

        scarf2 = new ModelPart(this);
        scarf2.setPivot(0.0F, 0.0F, 0.0F);
        body.addChild(scarf2);
        setRotationAngle(scarf2, 0.2443F, 0.0F, 0.0F);
        scarf2.setTextureOffset(28, 35).addCuboid(-4.5F, -1.0F, -4.5F, 9.0F, 3.0F, 9.0F, 0.0F, false);

        chesttop = new ModelPart(this);
        chesttop.setPivot(0.0F, 0.0F, 0.0F);
        body.addChild(chesttop);
        setRotationAngle(chesttop, -0.0873F, 0.0F, 0.0F);
        chesttop.setTextureOffset(35, 49).addCuboid(-3.5F, 0.2F, -2.5F, 7.0F, 4.0F, 1.0F, 0.0F, false);

        head = new ModelPart(this);
        head.setPivot(0.0F, 0.0F, 0.0F);
        head.setTextureOffset(0, 0).addCuboid(-3.5F, -6.0F, -4.0F, 7.0F, 6.0F, 8.0F, 0.0F, false);

        headband = new ModelPart(this);
        headband.setPivot(0.0F, 0.0F, 0.0F);
        head.addChild(headband);
        headband.setTextureOffset(0, 118).addCuboid(-4.0F, -6.5F, -4.5F, 8.0F, 2.0F, 8.0F, 0.0F, false);

        hair1 = new ModelPart(this);
        hair1.setPivot(0.0F, 0.0F, 0.0F);
        head.addChild(hair1);
        setRotationAngle(hair1, 0.6109F, -0.1571F, 0.0349F);
        hair1.setTextureOffset(0, 35).addCuboid(-4.0F, -8.0F, 0.5F, 3.0F, 3.0F, 6.0F, 0.0F, false);

        hair2 = new ModelPart(this);
        hair2.setPivot(0.0F, 0.0F, 0.0F);
        head.addChild(hair2);
        setRotationAngle(hair2, 0.1222F, 0.0F, 0.0F);
        hair2.setTextureOffset(0, 49).addCuboid(-3.9F, -8.3F, -2.5F, 8.0F, 4.0F, 8.0F, 0.0F, false);

        hair3 = new ModelPart(this);
        hair3.setPivot(0.0F, 0.0F, 0.0F);
        head.addChild(hair3);
        setRotationAngle(hair3, 0.576F, 0.0F, 0.0F);
        hair3.setTextureOffset(0, 35).addCuboid(-2.0F, -9.0F, 0.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

        hair4 = new ModelPart(this);
        hair4.setPivot(0.0F, 0.0F, 0.0F);
        head.addChild(hair4);
        setRotationAngle(hair4, 0.4363F, 0.2269F, 0.2094F);
        hair4.setTextureOffset(0, 49).addCuboid(0.2F, -8.0F, 0.0F, 3.0F, 4.0F, 7.0F, 0.0F, false);

        hair5 = new ModelPart(this);
        hair5.setPivot(0.0F, 0.0F, 0.0F);
        head.addChild(hair5);
        setRotationAngle(hair5, 0.4363F, -0.2269F, -0.2094F);
        hair5.setTextureOffset(0, 49).addCuboid(-3.2F, -8.0F, 0.0F, 2.0F, 4.0F, 7.0F, 0.0F, false);

        hair6 = new ModelPart(this);
        hair6.setPivot(0.0F, 0.0F, 0.0F);
        head.addChild(hair6);
        setRotationAngle(hair6, 0.6109F, 0.1396F, -0.0349F);
        hair6.setTextureOffset(0, 35).addCuboid(1.0F, -8.0F, 0.5F, 3.0F, 3.0F, 6.0F, 0.0F, false);

        leftleg = new ModelPart(this);
        leftleg.setPivot(2.0F, 12.0F, 1.0F);
        setRotationAngle(leftleg, -0.0262F, -0.1396F, -0.1745F);
        leftleg.setTextureOffset(21, 100).addCuboid(-2.0F, 0.0F, -3.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

        leftlegbot = new ModelPart(this);
        leftlegbot.setPivot(0.4313F, 5.9635F, -0.0644F);
        leftleg.addChild(leftlegbot);
        setRotationAngle(leftlegbot, 0.5236F, 0.0F, 0.0F);
        leftlegbot.setTextureOffset(0, 100).addCuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, 0.0F, false);

        rightleg = new ModelPart(this);
        rightleg.setPivot(-2.0F, 12.0F, 0.0F);
        setRotationAngle(rightleg, -0.1047F, 0.1745F, 0.1571F);
        rightleg.setTextureOffset(21, 100).addCuboid(-3.0F, 0.0F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, true);

        rightlegbot = new ModelPart(this);
        rightlegbot.setPivot(1.6154F, 6.7528F, 1.5678F);
        rightleg.addChild(rightlegbot);
        setRotationAngle(rightlegbot, 0.9506F, 0.1601F, 0.1487F);
        rightlegbot.setTextureOffset(0, 100).addCuboid(-4.1154F, -1.9128F, -2.5F, 5.0F, 9.0F, 5.0F, 0.0F, true);

        hands = new ModelPart(this);
        hands.setPivot(-7.0F, -4.0F, -8.0F);
        setRotationAngle(hands, -1.5708F, 0.0F, 0.0F);
        hands.setTextureOffset(48, 4).addCuboid(-8.0F, -19.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);
        hands.setTextureOffset(48, 4).addCuboid(18.0F, -12.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
        hands.setTextureOffset(48, 4).addCuboid(-13.0F, -13.0F, 6.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);
        hands.setTextureOffset(48, 4).addCuboid(24.0F, -20.0F, 4.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
        hands.setTextureOffset(48, 4).addCuboid(-8.0F, -19.0F, 12.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);
        hands.setTextureOffset(48, 4).addCuboid(19.0F, -17.0F, 12.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
    }
    @Override
    public void setAngles(@Nullable LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch){
        //previously the render function, render code was moved to a method below
        this.yOffset = (double)MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;
        this.head.pitch = headPitch * 0.017453292F;
        this.head.yaw = headYaw * 0.017453292F;

        this.off = 1F + MathHelper.cos((float) (0.15*animationProgress))/6;



    }
    @Override
    public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        matrixStack.translate(0, this.yOffset - 0.6D, 0.75D);
        this.head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightleg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftleg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        matrixStack.translate(0.0D, -this.yOffset, 0.0D);
        matrixStack.translate(0.0D, -0.3D, -0.2D);
        this.hands.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, 0.5F*off);

    }
    public void setRotationAngle(ModelPart bone, float x, float y, float z) {
        bone.pitch = x;
        bone.yaw = y;
        bone.roll = z;
    }

}
