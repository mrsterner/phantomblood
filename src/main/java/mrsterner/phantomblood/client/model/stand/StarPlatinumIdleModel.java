package mrsterner.phantomblood.client.model.stand;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.Nullable;

public class StarPlatinumIdleModel extends EntityModel<LivingEntity> {
    private final ModelPart body;
    private final ModelPart Shape11;
    private final ModelPart bodydown;
    private final ModelPart cloth1;
    private final ModelPart cloth2;
    private final ModelPart crotch;
    private final ModelPart leftarm;
    private final ModelPart handl;
    private final ModelPart armorl;
    private final ModelPart rightarm;
    private final ModelPart handr;
    private final ModelPart armorr;
    private final ModelPart scarf;
    private final ModelPart scarf2;
    private final ModelPart head;
    private final ModelPart hair1;
    private final ModelPart hair2;
    private final ModelPart hair3;
    private final ModelPart hair4;
    private final ModelPart hair5;
    private final ModelPart hair6;
    private final ModelPart hat;
    private final ModelPart leftleg;
    private final ModelPart legdownl;
    private final ModelPart rightleg;
    private final ModelPart legdownr;
    private final ModelPart hands;
    private double yOffset;
    private float off;
    public StarPlatinumIdleModel() {
        textureWidth = 64;
        textureHeight = 128;
        body = new ModelPart(this);
        body.setPivot(0.0F, 0.0F, 0.0F);
        body.setTextureOffset(16, 16).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F, 0.0F, false);

        Shape11 = new ModelPart(this);
        Shape11.setPivot(0.0F, 0.0F, -2.3F);
        body.addChild(Shape11);
        setRotationAngle(Shape11, -0.0873F, 0.0F, 0.0F);
        Shape11.setTextureOffset(35, 56).addCuboid(-1.5F, 4.0F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

        bodydown = new ModelPart(this);
        bodydown.setPivot(0.0F, 0.0F, 0.0F);
        body.addChild(bodydown);
        setRotationAngle(bodydown, -0.0175F, 0.0F, 0.0F);
        bodydown.setTextureOffset(19, 66).addCuboid(-3.5F, 7.0F, -2.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);

        cloth1 = new ModelPart(this);
        cloth1.setPivot(0.0F, 11.8157F, -4.3943F);
        body.addChild(cloth1);
        setRotationAngle(cloth1, -0.0614F, 0.0F, 0.0F);
        cloth1.setTextureOffset(48, 67).addCuboid(-2.0F, -1.2338F, 0.4723F, 4.0F, 8.0F, 1.0F, 0.0F, false);

        cloth2 = new ModelPart(this);
        cloth2.setPivot(0.0F, 10.9128F, 0.9962F);
        body.addChild(cloth2);
        setRotationAngle(cloth2, 0.4606F, 0.0F, 0.0F);
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

        handl = new ModelPart(this);
        handl.setPivot(0.2142F, 7.7366F, 0.4486F);
        leftarm.addChild(handl);
        setRotationAngle(handl, -1.7453F, -0.2618F, 0.6981F);
        handl.setTextureOffset(48, 4).addCuboid(-2.0F, -2.0F, -4.4052F, 4.0F, 8.0F, 4.0F, 0.0F, false);

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

        handr = new ModelPart(this);
        handr.setPivot(-1.3226F, 5.0458F, 0.1748F);
        rightarm.addChild(handr);
        setRotationAngle(handr, -1.4835F, 0.0873F, -0.5236F);
        handr.setTextureOffset(48, 4).addCuboid(-2.0F, -3.0864F, -1.6742F, 4.0F, 8.0F, 4.0F, 0.0F, true);

        armorr = new ModelPart(this);
        armorr.setPivot(5.0F, -2.0F, 1.0F);
        rightarm.addChild(armorr);
        armorr.setTextureOffset(0, 74).addCuboid(-9.0F, -1.0F, -3.1F, 4.0F, 1.0F, 6.0F, 0.0F, true);

        scarf = new ModelPart(this);
        scarf.setPivot(0.0F, 0.0F, 0.0F);
        body.addChild(scarf);
        setRotationAngle(scarf, 0.5817F, 0.0F, 0.0F);
        scarf.setTextureOffset(24, 35).addCuboid(-5.0F, -1.0F, -4.0F, 10.0F, 2.0F, 10.0F, 0.0F, false);

        scarf2 = new ModelPart(this);
        scarf2.setPivot(0.0F, 0.0F, 0.0F);
        body.addChild(scarf2);
        setRotationAngle(scarf2, 0.2471F, 0.0F, 0.0F);
        scarf2.setTextureOffset(28, 35).addCuboid(-4.5F, -1.0F, -4.5F, 9.0F, 3.0F, 9.0F, 0.0F, false);

        head = new ModelPart(this);
        head.setPivot(0.0F, 0.0F, 0.0F);
        head.setTextureOffset(0, 0).addCuboid(-3.5F, -6.0F, -4.0F, 7.0F, 6.0F, 8.0F, 0.0F, false);

        hair1 = new ModelPart(this);
        hair1.setPivot(0.0F, 0.0F, 0.0F);
        head.addChild(hair1);
        setRotationAngle(hair1, 0.6093F, -0.1487F, 0.0349F);
        hair1.setTextureOffset(0, 35).addCuboid(-4.0F, -8.0F, 0.5F, 3.0F, 3.0F, 6.0F, 0.0F, false);

        hair2 = new ModelPart(this);
        hair2.setPivot(0.0F, 0.0F, 0.0F);
        head.addChild(hair2);
        setRotationAngle(hair2, 0.1267F, 0.0F, 0.0F);
        hair2.setTextureOffset(0, 49).addCuboid(-3.9F, -8.3F, -2.5F, 8.0F, 4.0F, 8.0F, 0.0F, false);

        hair3 = new ModelPart(this);
        hair3.setPivot(0.0F, 0.0F, 0.0F);
        head.addChild(hair3);
        setRotationAngle(hair3, 0.5729F, 0.0F, 0.0F);
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

        hat = new ModelPart(this);
        hat.setPivot(0.0F, 0.0F, 0.0F);
        head.addChild(hat);
        hat.setTextureOffset(0, 118).addCuboid(-4.0F, -6.5F, -4.5F, 8.0F, 2.0F, 8.0F, 0.0F, false);

        leftleg = new ModelPart(this);
        leftleg.setPivot(2.0F, 12.0F, 1.0F);
        setRotationAngle(leftleg, -0.0258F, -0.1374F, -0.1723F);
        leftleg.setTextureOffset(21, 100).addCuboid(-2.0F, 0.0F, -3.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

        legdownl = new ModelPart(this);
        legdownl.setPivot(0.4313F, 5.9635F, -0.0644F);
        leftleg.addChild(legdownl);
        setRotationAngle(legdownl, 0.5236F, 0.0F, 0.0F);
        legdownl.setTextureOffset(0, 100).addCuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, 0.0F, false);

        rightleg = new ModelPart(this);
        rightleg.setPivot(-2.0F, 12.0F, 0.0F);
        setRotationAngle(rightleg, -0.1017F, 0.1631F, 0.1609F);
        rightleg.setTextureOffset(21, 100).addCuboid(-3.0F, 0.0F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, true);

        legdownr = new ModelPart(this);
        legdownr.setPivot(1.6154F, 6.7528F, 1.5678F);
        rightleg.addChild(legdownr);
        setRotationAngle(legdownr, 0.9506F, 0.1601F, 0.1487F);
        legdownr.setTextureOffset(0, 100).addCuboid(-4.1154F, -1.9128F, -2.5F, 5.0F, 9.0F, 5.0F, 0.0F, true);

        hands = new ModelPart(this);
        hands.setPivot(-7.0F, -4.0F, -8.0F);
        setRotationAngle(hands, -1.5708F, 0.0F, 0.0F);
        hands.setTextureOffset(48, 4).addCuboid(-8.3226F, -19.0405F, -1.4994F, 4.0F, 8.0F, 4.0F, 0.0F, true);
        hands.setTextureOffset(48, 4).addCuboid(18.3226F, -12.0405F, -1.4994F, 4.0F, 8.0F, 4.0F, 0.0F, false);
        hands.setTextureOffset(48, 4).addCuboid(-13.3226F, -13.0405F, 6.5006F, 4.0F, 8.0F, 4.0F, 0.0F, true);
        hands.setTextureOffset(48, 4).addCuboid(24.3226F, -20.0405F, 4.5006F, 4.0F, 8.0F, 4.0F, 0.0F, false);
        hands.setTextureOffset(48, 4).addCuboid(-8.3226F, -19.0405F, 11.5006F, 4.0F, 8.0F, 4.0F, 0.0F, true);
        hands.setTextureOffset(48, 4).addCuboid(18.3226F, -17.0405F, 11.5006F, 4.0F, 8.0F, 4.0F, 0.0F, false);
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
