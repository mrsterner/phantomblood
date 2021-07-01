package mrsterner.phantomblood.client.model.stand;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.NotNull;

public class StarPlatinumAttackingModel extends EntityModel<LivingEntity> {
    private final ModelPart body;
    private final ModelPart chesttop;
    private final ModelPart chestbot;
    private final ModelPart armorl;
    private final ModelPart armorr;
    private final ModelPart bodydown;
    private final ModelPart cloth1;
    private final ModelPart cloth2;
    private final ModelPart crotch;
    private final ModelPart leftarm;
    private final ModelPart rightarm;
    private final ModelPart scarf;
    private final ModelPart scarf2;
    private final ModelPart lefthands;
    private final ModelPart lefthand1;
    private final ModelPart lefthand2;
    private final ModelPart lefthand3;
    private final ModelPart lefthand4;
    private final ModelPart lefthand5;
    private final ModelPart righthands;
    private final ModelPart righthand1;
    private final ModelPart righthand2;
    private final ModelPart righthand3;
    private final ModelPart righthand4;
    private final ModelPart righthand5;
    private final ModelPart head;
    private final ModelPart hair1;
    private final ModelPart hair2;
    private final ModelPart hair3;
    private final ModelPart hair4;
    private final ModelPart hair5;
    private final ModelPart hair6;
    private final ModelPart headband;
    private final ModelPart leftleg;
    private final ModelPart leftlegdown;
    private final ModelPart rightleg;
    private final ModelPart rightlegbot;
    private double yOffset;
    public StarPlatinumAttackingModel() {
        textureWidth = 64;
        textureHeight = 128;
        body = new ModelPart(this);
        body.setPivot(0.0F, 0.0F, 0.0F);
        setRotationAngle(body, -0.0873F, 0.0F, 0.0F);
        body.setTextureOffset(16, 16).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F, 0.0F, false);

        chesttop = new ModelPart(this);
        chesttop.setPivot(0.0F, 0.0F, 0.0F);
        body.addChild(chesttop);
        setRotationAngle(chesttop, -0.0873F, 0.0F, 0.0F);
        chesttop.setTextureOffset(35, 49).addCuboid(-3.5F, 0.2F, -2.5F, 7.0F, 4.0F, 1.0F, 0.0F, false);

        chestbot = new ModelPart(this);
        chestbot.setPivot(0.0F, 0.0F, -2.3F);
        body.addChild(chestbot);
        setRotationAngle(chestbot, -0.0873F, 0.0F, 0.0F);
        chestbot.setTextureOffset(35, 56).addCuboid(-1.5F, 4.0F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

        armorl = new ModelPart(this);
        armorl.setPivot(0.0F, 0.0F, 0.0F);
        body.addChild(armorl);
        setRotationAngle(armorl, 0.5236F, 0.0F, 0.0F);
        armorl.setTextureOffset(0, 74).addCuboid(5.0F, -1.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);

        armorr = new ModelPart(this);
        armorr.setPivot(0.0F, 0.0F, 0.0F);
        body.addChild(armorr);
        setRotationAngle(armorr, 0.5236F, 0.0F, 0.0F);
        armorr.setTextureOffset(0, 74).addCuboid(-9.0F, -1.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, true);

        bodydown = new ModelPart(this);
        bodydown.setPivot(0.0F, 0.0F, 0.0F);
        body.addChild(bodydown);
        setRotationAngle(bodydown, -0.0175F, 0.0F, 0.0F);
        bodydown.setTextureOffset(19, 66).addCuboid(-3.5F, 7.0F, -2.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);

        cloth1 = new ModelPart(this);
        cloth1.setPivot(0.0F, 0.0F, 0.0F);
        body.addChild(cloth1);
        setRotationAngle(cloth1, -0.1484F, 0.0F, 0.0F);
        cloth1.setTextureOffset(48, 67).addCuboid(-2.0F, 11.0F, -1.9F, 4.0F, 8.0F, 1.0F, 0.0F, false);

        cloth2 = new ModelPart(this);
        cloth2.setPivot(0.0F, 11.0F, 1.0F);
        body.addChild(cloth2);
        setRotationAngle(cloth2, 0.2793F, 0.0F, 0.0F);
        cloth2.setTextureOffset(48, 56).addCuboid(-2.5F, 0.0F, 1.0F, 5.0F, 9.0F, 1.0F, 0.0F, false);

        crotch = new ModelPart(this);
        crotch.setPivot(0.0F, 0.0F, 0.0F);
        body.addChild(crotch);
        setRotationAngle(crotch, 0.0349F, 0.0F, 0.0F);
        crotch.setTextureOffset(16, 82).addCuboid(-4.0F, 9.5F, -3.5F, 8.0F, 2.0F, 6.0F, 0.0F, false);

        leftarm = new ModelPart(this);
        leftarm.setPivot(5.0F, 2.0F, 0.0F);
        body.addChild(leftarm);
        setRotationAngle(leftarm, 0.5236F, 0.0F, 0.0F);
        leftarm.setTextureOffset(40, 16).addCuboid(-1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);

        rightarm = new ModelPart(this);
        rightarm.setPivot(-5.0F, 2.0F, 0.0F);
        body.addChild(rightarm);
        setRotationAngle(rightarm, 0.5236F, 0.0F, 0.0F);
        rightarm.setTextureOffset(40, 16).addCuboid(-3.0F, -2.0F, -2.0F, 4.0F, 4.0F, 5.0F, 0.0F, true);

        scarf = new ModelPart(this);
        scarf.setPivot(0.0F, 0.0F, 0.0F);
        body.addChild(scarf);
        setRotationAngle(scarf, 0.4014F, 0.0F, 0.0F);
        scarf.setTextureOffset(24, 35).addCuboid(-5.0F, -1.0F, -4.0F, 10.0F, 2.0F, 10.0F, 0.0F, false);

        scarf2 = new ModelPart(this);
        scarf2.setPivot(0.0F, 0.0F, 0.0F);
        body.addChild(scarf2);
        setRotationAngle(scarf2, 0.0698F, 0.0F, 0.0F);
        scarf2.setTextureOffset(28, 35).addCuboid(-4.5F, -1.0F, -4.5F, 9.0F, 3.0F, 9.0F, 0.0F, false);

        lefthands = new ModelPart(this);
        lefthands.setPivot(0.0F, 0.0F, 0.0F);


        lefthand1 = new ModelPart(this);
        lefthand1.setPivot(5.0F, 2.0F, 0.0F);
        lefthands.addChild(lefthand1);
        setRotationAngle(lefthand1, -1.5708F, 0.0F, 0.0F);
        lefthand1.setTextureOffset(48, 4).addCuboid(8.0F, 10.0F, 3.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        lefthand2 = new ModelPart(this);
        lefthand2.setPivot(0.0F, 0.0F, 0.0F);
        lefthands.addChild(lefthand2);
        setRotationAngle(lefthand2, -1.5708F, 0.0F, 0.0F);
        lefthand2.setTextureOffset(48, 4).addCuboid(9.0F, 3.0F, 0.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        lefthand3 = new ModelPart(this);
        lefthand3.setPivot(0.0F, 0.0F, 0.0F);
        lefthands.addChild(lefthand3);
        setRotationAngle(lefthand3, -1.5708F, 0.0F, 0.0F);
        lefthand3.setTextureOffset(48, 4).addCuboid(7.0F, -5.0F, 4.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        lefthand4 = new ModelPart(this);
        lefthand4.setPivot(0.0F, 0.0F, 0.0F);
        lefthands.addChild(lefthand4);
        setRotationAngle(lefthand4, -1.5708F, 0.0F, 0.0F);
        lefthand4.setTextureOffset(48, 4).addCuboid(15.0F, -11.0F, -1.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        lefthand5 = new ModelPart(this);
        lefthand5.setPivot(0.0F, 0.0F, 0.0F);
        lefthands.addChild(lefthand5);
        setRotationAngle(lefthand5, -1.5708F, 0.0F, 0.0F);
        lefthand5.setTextureOffset(48, 4).addCuboid(11.0F, -3.0F, -4.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        righthands = new ModelPart(this);
        righthands.setPivot(0.0F, 0.0F, 0.0F);


        righthand1 = new ModelPart(this);
        righthand1.setPivot(5.0F, 2.0F, 0.0F);
        righthands.addChild(righthand1);
        setRotationAngle(righthand1, -1.5708F, 0.0F, 0.0F);
        righthand1.setTextureOffset(48, 4).addCuboid(-14.0F, 11.0F, -1.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

        righthand2 = new ModelPart(this);
        righthand2.setPivot(0.0F, 0.0F, 0.0F);
        righthands.addChild(righthand2);
        setRotationAngle(righthand2, -1.5708F, 0.0F, 0.0F);
        righthand2.setTextureOffset(48, 4).addCuboid(-14.0F, -5.0F, -4.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

        righthand3 = new ModelPart(this);
        righthand3.setPivot(0.0F, 0.0F, 0.0F);
        righthands.addChild(righthand3);
        setRotationAngle(righthand3, -1.5708F, 0.0F, 0.0F);
        righthand3.setTextureOffset(48, 4).addCuboid(-17.0F, 8.0F, 1.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

        righthand4 = new ModelPart(this);
        righthand4.setPivot(0.0F, 0.0F, 0.0F);
        righthands.addChild(righthand4);
        setRotationAngle(righthand4, -1.5708F, 0.0F, 0.0F);
        righthand4.setTextureOffset(48, 4).addCuboid(-20.0F, -10.0F, 2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

        righthand5 = new ModelPart(this);
        righthand5.setPivot(0.0F, 0.0F, 0.0F);
        righthands.addChild(righthand5);
        setRotationAngle(righthand5, -1.5708F, 0.0F, 0.0F);
        righthand5.setTextureOffset(48, 4).addCuboid(-13.0F, 2.0F, 6.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

        head = new ModelPart(this);
        head.setPivot(0.0F, 0.0F, 0.0F);
        head.setTextureOffset(0, 0).addCuboid(-3.5F, -6.0F, -4.0F, 7.0F, 6.0F, 8.0F, 0.0F, false);

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

        headband = new ModelPart(this);
        headband.setPivot(0.0F, 0.0F, 0.0F);
        head.addChild(headband);
        headband.setTextureOffset(0, 118).addCuboid(-4.0F, -6.5F, -4.5F, 8.0F, 2.0F, 8.0F, 0.0F, false);

        leftleg = new ModelPart(this);
        leftleg.setPivot(2.0F, 11.0F, 0.0F);
        setRotationAngle(leftleg, -0.5411F, -0.4014F, -0.4363F);
        leftleg.setTextureOffset(21, 100).addCuboid(-2.0F, 1.0F, -3.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

        leftlegdown = new ModelPart(this);
        leftlegdown.setPivot(-1.0F, -0.75F, -1.0F);
        leftleg.addChild(leftlegdown);
        setRotationAngle(leftlegdown, 1.117F, -0.1396F, 0.2007F);
        leftlegdown.setTextureOffset(0, 100).addCuboid(0.8F, 2.5F, -9.0F, 5.0F, 9.0F, 5.0F, 0.0F, false);

        rightleg = new ModelPart(this);
        rightleg.setPivot(-2.0F, 11.0F, 0.0F);
        setRotationAngle(rightleg, -0.3665F, 0.2443F, 0.2443F);
        rightleg.setTextureOffset(21, 100).addCuboid(-3.0F, 0.0F, -3.5F, 5.0F, 7.0F, 5.0F, 0.0F, true);

        rightlegbot = new ModelPart(this);
        rightlegbot.setPivot(0.5F, -1.0F, 1.0F);
        rightleg.addChild(rightlegbot);
        setRotationAngle(rightlegbot, 0.4363F, 0.0698F, 0.0698F);
        rightlegbot.setTextureOffset(0, 100).addCuboid(-2.5F, 6.0F, -7.0F, 5.0F, 9.0F, 5.0F, 0.0F, true);
    }
    @Override
    public void setAngles(LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch){
        float power = 0.5F;
        float speed = 3.0F;
        this.yOffset = (double)MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;
        this.head.pitch = headPitch * 0.017453292F;
        this.head.yaw = headYaw * 0.017453292F;
        this.lefthand1.yaw = MathHelper.cos(speed * animationProgress) * 1.2F * power;
        this.lefthand2.yaw = MathHelper.cos(speed * animationProgress + 1.0471976F) * 1.4F * power;
        this.lefthand3.yaw = MathHelper.cos(speed * animationProgress + (float)2.0943951023931953D) * 1.6F * power;
        this.lefthand4.yaw = MathHelper.cos(speed * animationProgress + (float)2.6179938779914944D) * 1.3F * power;
        this.lefthand5.yaw = MathHelper.cos(speed * animationProgress + (float)3.141592653589793D) * 1.7F * power;
        this.righthand1.yaw = MathHelper.cos(speed * animationProgress + (float)3.665191429188092D) * 1.2F * power;
        this.righthand2.yaw = MathHelper.cos(speed * animationProgress + (float)6.283185307179586D) * 1.1F * power;
        this.righthand3.yaw = MathHelper.cos(speed * animationProgress + (float)8.377580409572781D) * 1.4F * power;
        this.righthand4.yaw = MathHelper.cos(speed * animationProgress + (float)10.471975511965978D) * 1.5F * power;
        this.righthand5.yaw = MathHelper.cos(speed * animationProgress + (float)1.5707963267948966D) * 1.6F * power;
        this.lefthands.pitch = headPitch * 0.017453292F;
        this.lefthands.yaw = headYaw * 0.017453292F;
        this.righthands.pitch = headPitch * 0.017453292F;
        this.righthands.yaw = headYaw * 0.017453292F;
        float r = (float)Math.random();
        float offysin = MathHelper.sin(r * speed * animationProgress) * power - 0.25F;
        float offycos = MathHelper.cos(r * speed * animationProgress) * power - 0.25F;
        this.lefthand1.pivotZ = offysin;
        this.lefthand2.pivotZ = offycos;
        this.lefthand3.pivotZ = offysin;
        this.lefthand4.pivotZ = offycos;
        this.lefthand5.pivotZ = offysin;
        this.righthand1.pivotZ = offycos;
        this.righthand2.pivotZ = offysin;
        this.righthand3.pivotZ = offycos;
        this.righthand4.pivotZ = offysin;
        this.righthand5.pivotZ = offycos;
        float offxl = r * MathHelper.sin(r * speed * animationProgress) * power + 0.2F;
        float offxr = r * MathHelper.sin(r * speed * animationProgress) * power - 0.2F;
        this.lefthands.pivotX = offxl;
        this.righthands.pivotX = offxr;
    }
    @Override
    public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        matrixStack.translate(0.0D, this.yOffset, -0.75D);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
        rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
        matrixStack.translate(0.0D, -this.yOffset, 0.0D);

        righthands.render(matrixStack, buffer, packedLight, packedOverlay);
        lefthands.render(matrixStack, buffer, packedLight, packedOverlay);
        matrixStack.translate(0.0D, 0.2D, 0.75D);
    }
    public void setRotationAngle(ModelPart bone, float x, float y, float z) {
        bone.pitch = x;
        bone.yaw = y;
        bone.roll = z;
    }
    public final void renderPunchyArms(@NotNull MatrixStack matrices, @NotNull VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        this.righthands.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.lefthands.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }

}