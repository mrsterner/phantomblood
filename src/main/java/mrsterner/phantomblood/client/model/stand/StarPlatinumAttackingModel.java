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
    private final ModelPart Shape10;
    private final ModelPart Shape11;
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
    private final ModelPart left_hands;
    private final ModelPart handl1;
    private final ModelPart handl2;
    private final ModelPart handl3;
    private final ModelPart handl4;
    private final ModelPart handl5;
    private final ModelPart right_hands;
    private final ModelPart handr1;
    private final ModelPart handr2;
    private final ModelPart handr3;
    private final ModelPart handr4;
    private final ModelPart handr5;
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
    private double yOffset;
    public StarPlatinumAttackingModel() {
        textureWidth = 64;
        textureHeight = 128;
        body = new ModelPart(this);
        body.setPivot(0.0F, 0.0F, 0.0F);
        setRotationAngle(body, -0.0873F, 0.0F, 0.0F);
        body.setTextureOffset(16, 16).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F, 0.0F, false);

        Shape10 = new ModelPart(this);
        Shape10.setPivot(0.0F, 0.0F, 0.0F);
        body.addChild(Shape10);
        setRotationAngle(Shape10, -0.0873F, 0.0F, 0.0F);
        Shape10.setTextureOffset(35, 49).addCuboid(-3.5F, 0.2F, -2.5F, 7.0F, 4.0F, 1.0F, 0.0F, false);

        Shape11 = new ModelPart(this);
        Shape11.setPivot(0.0F, 0.0F, -2.3F);
        body.addChild(Shape11);
        setRotationAngle(Shape11, -0.0873F, 0.0F, 0.0F);
        Shape11.setTextureOffset(35, 56).addCuboid(-1.5F, 4.0F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

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
        setRotationAngle(cloth1, -0.1487F, 0.0F, 0.0F);
        cloth1.setTextureOffset(48, 67).addCuboid(-2.0F, 11.0F, -1.9F, 4.0F, 8.0F, 1.0F, 0.0F, false);

        cloth2 = new ModelPart(this);
        cloth2.setPivot(0.0F, 10.9128F, 0.9962F);
        body.addChild(cloth2);
        setRotationAngle(cloth2, 0.2861F, 0.0F, 0.0F);
        cloth2.setTextureOffset(48, 56).addCuboid(-2.5F, 0.0F, 1.0F, 5.0F, 9.0F, 1.0F, 0.0F, false);

        crotch = new ModelPart(this);
        crotch.setPivot(0.0F, 0.0F, 0.0F);
        body.addChild(crotch);
        setRotationAngle(crotch, 0.0349F, 0.0F, 0.0F);
        crotch.setTextureOffset(16, 82).addCuboid(-4.0F, 10.0F, -3.5F, 8.0F, 2.0F, 6.0F, 0.0F, false);

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
        setRotationAngle(scarf, 0.4072F, 0.0F, 0.0F);
        scarf.setTextureOffset(24, 35).addCuboid(-5.0F, -1.0F, -4.0F, 10.0F, 2.0F, 10.0F, 0.0F, false);

        scarf2 = new ModelPart(this);
        scarf2.setPivot(0.0F, 0.0F, 0.0F);
        body.addChild(scarf2);
        setRotationAngle(scarf2, 0.0726F, 0.0F, 0.0F);
        scarf2.setTextureOffset(28, 35).addCuboid(-4.5F, -1.0F, -4.5F, 9.0F, 3.0F, 9.0F, 0.0F, false);

        left_hands = new ModelPart(this);
        left_hands.setPivot(0.0F, 0.0F, 0.0F);


        handl1 = new ModelPart(this);
        handl1.setPivot(5.0F, 2.0F, 0.0F);
        left_hands.addChild(handl1);
        setRotationAngle(handl1, -1.5708F, 0.0F, 0.0F);
        handl1.setTextureOffset(48, 4).addCuboid(8.0F, 10.0F, 3.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        handl2 = new ModelPart(this);
        handl2.setPivot(0.0F, 0.0F, 0.0F);
        left_hands.addChild(handl2);
        setRotationAngle(handl2, -1.5708F, 0.0F, 0.0F);
        handl2.setTextureOffset(48, 4).addCuboid(9.0F, 3.0F, 0.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        handl3 = new ModelPart(this);
        handl3.setPivot(0.0F, 0.0F, 0.0F);
        left_hands.addChild(handl3);
        setRotationAngle(handl3, -1.5708F, 0.0F, 0.0F);
        handl3.setTextureOffset(48, 4).addCuboid(7.0F, -5.0F, 4.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        handl4 = new ModelPart(this);
        handl4.setPivot(0.0F, 0.0F, 0.0F);
        left_hands.addChild(handl4);
        setRotationAngle(handl4, -1.5708F, 0.0F, 0.0F);
        handl4.setTextureOffset(48, 4).addCuboid(15.0F, -11.0F, -1.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        handl5 = new ModelPart(this);
        handl5.setPivot(0.0F, 0.0F, 0.0F);
        left_hands.addChild(handl5);
        setRotationAngle(handl5, -1.5708F, 0.0F, 0.0F);
        handl5.setTextureOffset(48, 4).addCuboid(11.0F, -3.0F, -4.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        right_hands = new ModelPart(this);
        right_hands.setPivot(0.0F, 0.0F, 0.0F);


        handr1 = new ModelPart(this);
        handr1.setPivot(5.0F, 2.0F, 0.0F);
        right_hands.addChild(handr1);
        setRotationAngle(handr1, -1.5708F, 0.0F, 0.0F);
        handr1.setTextureOffset(48, 4).addCuboid(-14.0F, 11.0F, -1.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

        handr2 = new ModelPart(this);
        handr2.setPivot(0.0F, 0.0F, 0.0F);
        right_hands.addChild(handr2);
        setRotationAngle(handr2, -1.5708F, 0.0F, 0.0F);
        handr2.setTextureOffset(48, 4).addCuboid(-14.0F, -5.0F, -4.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

        handr3 = new ModelPart(this);
        handr3.setPivot(0.0F, 0.0F, 0.0F);
        right_hands.addChild(handr3);
        setRotationAngle(handr3, -1.5708F, 0.0F, 0.0F);
        handr3.setTextureOffset(48, 4).addCuboid(-17.0F, 8.0F, 1.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

        handr4 = new ModelPart(this);
        handr4.setPivot(0.0F, 0.0F, 0.0F);
        right_hands.addChild(handr4);
        setRotationAngle(handr4, -1.5708F, 0.0F, 0.0F);
        handr4.setTextureOffset(48, 4).addCuboid(-20.0F, -10.0F, 2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

        handr5 = new ModelPart(this);
        handr5.setPivot(0.0F, 0.0F, 0.0F);
        right_hands.addChild(handr5);
        setRotationAngle(handr5, -1.5708F, 0.0F, 0.0F);
        handr5.setTextureOffset(48, 4).addCuboid(-13.0F, 2.0F, 6.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

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
        leftleg.setPivot(2.0F, 11.0F, 0.0F);
        setRotationAngle(leftleg, -0.5494F, -0.3992F, -0.4341F);
        leftleg.setTextureOffset(21, 100).addCuboid(-2.0F, 0.0F, -3.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

        legdownl = new ModelPart(this);
        legdownl.setPivot(-0.8371F, -0.75F, -1.3178F);
        leftleg.addChild(legdownl);
        setRotationAngle(legdownl, 1.1107F, -0.1374F, 0.2004F);
        legdownl.setTextureOffset(0, 100).addCuboid(-0.5F, 3.5F, -7.0F, 5.0F, 9.0F, 5.0F, 0.0F, false);

        rightleg = new ModelPart(this);
        rightleg.setPivot(-2.0F, 11.0F, 0.0F);
        setRotationAngle(rightleg, -0.3635F, 0.2504F, 0.2482F);
        rightleg.setTextureOffset(21, 100).addCuboid(-3.0F, 0.0F, -3.5F, 5.0F, 7.0F, 5.0F, 0.0F, true);

        legdownr = new ModelPart(this);
        legdownr.setPivot(0.6913F, -0.6595F, 1.0427F);
        rightleg.addChild(legdownr);
        setRotationAngle(legdownr, 0.427F, 0.0728F, 0.0614F);
        legdownr.setTextureOffset(0, 100).addCuboid(-2.5F, 5.5F, -6.0F, 5.0F, 9.0F, 5.0F, 0.0F, true);
    }
    @Override
    public void setAngles(LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch){
        float power = 0.5F;
        float speed = 3.0F;
        this.yOffset = (double)MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;
        this.head.pitch = headPitch * 0.017453292F;
        this.head.yaw = headYaw * 0.017453292F;
        this.handl1.yaw = MathHelper.cos(speed * animationProgress) * 1.2F * power;
        this.handl2.yaw = MathHelper.cos(speed * animationProgress + 1.0471976F) * 1.4F * power;
        this.handl3.yaw = MathHelper.cos(speed * animationProgress + (float)2.0943951023931953D) * 1.6F * power;
        this.handl4.yaw = MathHelper.cos(speed * animationProgress + (float)2.6179938779914944D) * 1.3F * power;
        this.handl5.yaw = MathHelper.cos(speed * animationProgress + (float)3.141592653589793D) * 1.7F * power;
        this.handr1.yaw = MathHelper.cos(speed * animationProgress + (float)3.665191429188092D) * 1.2F * power;
        this.handr2.yaw = MathHelper.cos(speed * animationProgress + (float)6.283185307179586D) * 1.1F * power;
        this.handr3.yaw = MathHelper.cos(speed * animationProgress + (float)8.377580409572781D) * 1.4F * power;
        this.handr4.yaw = MathHelper.cos(speed * animationProgress + (float)10.471975511965978D) * 1.5F * power;
        this.handr5.yaw = MathHelper.cos(speed * animationProgress + (float)1.5707963267948966D) * 1.6F * power;
        this.left_hands.pitch = headPitch * 0.017453292F;
        this.left_hands.yaw = headYaw * 0.017453292F;
        this.right_hands.pitch = headPitch * 0.017453292F;
        this.right_hands.yaw = headYaw * 0.017453292F;
        float r = (float)Math.random();
        float offysin = MathHelper.sin(r * speed * animationProgress) * power - 0.25F;
        float offycos = MathHelper.cos(r * speed * animationProgress) * power - 0.25F;
        this.handl1.pivotZ = offysin;
        this.handl2.pivotZ = offycos;
        this.handl3.pivotZ = offysin;
        this.handl4.pivotZ = offycos;
        this.handl5.pivotZ = offysin;
        this.handr1.pivotZ = offycos;
        this.handr2.pivotZ = offysin;
        this.handr3.pivotZ = offycos;
        this.handr4.pivotZ = offysin;
        this.handr5.pivotZ = offycos;
        float offxl = r * MathHelper.sin(r * speed * animationProgress) * power + 0.2F;
        float offxr = r * MathHelper.sin(r * speed * animationProgress) * power - 0.2F;
        this.left_hands.pivotX = offxl;
        this.right_hands.pivotX = offxr;
    }
    @Override
    public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        matrixStack.translate(0.0D, this.yOffset, -0.75D);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
        rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
        matrixStack.translate(0.0D, -this.yOffset, 0.0D);

        right_hands.render(matrixStack, buffer, packedLight, packedOverlay);
        left_hands.render(matrixStack, buffer, packedLight, packedOverlay);
        matrixStack.translate(0.0D, 0.2D, 0.75D);
    }
    public void setRotationAngle(ModelPart bone, float x, float y, float z) {
        bone.pitch = x;
        bone.yaw = y;
        bone.roll = z;
    }
    public final void renderPunchyArms(@NotNull MatrixStack matrices, @NotNull VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        this.right_hands.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.left_hands.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }

}