package mrsterner.phantomblood.common.entity;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class TheWorldModel extends EntityModel<Entity> {
    private final ModelPart head;
    private final ModelPart helmTop_r1;
    private final ModelPart tube_r1;
    private final ModelPart bone;
    private final ModelPart faceplate_r1;
    private final ModelPart faceplate_r2;
    private final ModelPart body;
    private final ModelPart lower;
    private final ModelPart right;
    private final ModelPart rightUpper_r1;
    private final ModelPart rightLower;
    private final ModelPart left;
    private final ModelPart leftLower;
    private final ModelPart leftLower_r1;
    private final ModelPart upper;
    private final ModelPart leftArm;
    private final ModelPart arm;
    private final ModelPart hand;
    private final ModelPart hand_r1;
    private final ModelPart rightArm;
    private final ModelPart shoulder_r1;
    private final ModelPart arm2;
    private final ModelPart arm_r1;
    private final ModelPart hand2;
    private final ModelPart hand_r2;
    public TheWorldModel() {
        textureWidth = 128;
        textureHeight = 128;
        head = new ModelPart(this);
        head.setPivot(0.0F, 0.0F, 0.0F);
        head.setTextureOffset(0, 13).addCuboid(-3.5F, -12.0F, -4.0F, 7.0F, 7.0F, 8.0F, 0.0F, false);
        head.setTextureOffset(2, 1).addCuboid(-4.0F, -12.1F, -3.5F, 8.0F, 4.0F, 8.0F, 0.0F, false);

        helmTop_r1 = new ModelPart(this);
        helmTop_r1.setPivot(0.0F, -12.0F, 0.0F);
        head.addChild(helmTop_r1);
        setRotationAngle(helmTop_r1, 0.48F, 0.0F, 0.0F);
        helmTop_r1.setTextureOffset(22, 20).addCuboid(-4.0F, -1.95F, -4.0F, 8.0F, 4.0F, 8.0F, 0.1F, false);

        tube_r1 = new ModelPart(this);
        tube_r1.setPivot(0.0F, -8.1F, 1.5F);
        head.addChild(tube_r1);
        setRotationAngle(tube_r1, -0.1745F, 0.0F, 0.0F);
        tube_r1.setTextureOffset(25, 0).addCuboid(-4.5F, -1.0F, -3.5F, 9.0F, 2.0F, 7.0F, 0.0F, false);

        bone = new ModelPart(this);
        bone.setPivot(0.0F, -10.5F, -4.0F);
        head.addChild(bone);
        setRotationAngle(bone, 0.1309F, 0.0F, 0.0F);


        faceplate_r1 = new ModelPart(this);
        faceplate_r1.setPivot(0.0F, -1.0F, -2.0F);
        bone.addChild(faceplate_r1);
        setRotationAngle(faceplate_r1, 0.0F, 0.2618F, 0.0F);
        faceplate_r1.setTextureOffset(64, 16).addCuboid(-5.1F, -0.5F, 0.4F, 5.0F, 4.0F, 2.0F, 0.0F, false);

        faceplate_r2 = new ModelPart(this);
        faceplate_r2.setPivot(0.0F, -1.0F, -2.0F);
        bone.addChild(faceplate_r2);
        setRotationAngle(faceplate_r2, 0.0F, -0.2618F, 0.0F);
        faceplate_r2.setTextureOffset(54, 26).addCuboid(0.1F, -0.5F, 0.4F, 5.0F, 4.0F, 2.0F, 0.001F, false);

        body = new ModelPart(this);
        body.setPivot(0.0F, -5.0F, 0.0F);
        setRotationAngle(body, 0.2182F, -0.1745F, -0.3054F);
        body.setTextureOffset(0, 28).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(8, 71).addCuboid(-3.5F, 0.5F, -2.5F, 7.0F, 4.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(47, 65).addCuboid(-2.5F, 0.0F, 3.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(0, 65).addCuboid(0.5F, 0.0F, 3.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(20, 46).addCuboid(1.0F, -1.0F, -3.0F, 2.0F, 11.0F, 6.0F, -0.1F, false);
        body.setTextureOffset(38, 40).addCuboid(-3.0F, -1.0F, -3.0F, 2.0F, 11.0F, 6.0F, -0.1F, false);

        lower = new ModelPart(this);
        lower.setPivot(0.0F, 7.0F, 0.0F);
        body.addChild(lower);
        setRotationAngle(lower, 0.1309F, 0.0F, 0.0F);
        lower.setTextureOffset(46, 18).addCuboid(-3.5F, 0.0F, -2.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);
        lower.setTextureOffset(27, 9).addCuboid(-4.0F, 2.5F, -3.5F, 8.0F, 2.0F, 7.0F, 0.0F, false);
        lower.setTextureOffset(66, 53).addCuboid(3.0F, 2.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
        lower.setTextureOffset(65, 29).addCuboid(-5.0F, 2.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);

        right = new ModelPart(this);
        right.setPivot(-2.25F, 5.0F, 0.0F);
        lower.addChild(right);
        setRotationAngle(right, -0.7854F, 0.1745F, 0.1745F);
        right.setTextureOffset(48, 32).addCuboid(-2.75F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

        rightUpper_r1 = new ModelPart(this);
        rightUpper_r1.setPivot(-0.25F, 7.5F, -1.5F);
        right.addChild(rightUpper_r1);
        setRotationAngle(rightUpper_r1, -0.6545F, 0.0F, 0.0F);
        rightUpper_r1.setTextureOffset(18, 73).addCuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        rightLower = new ModelPart(this);
        rightLower.setPivot(-0.25F, 6.5F, 0.0F);
        right.addChild(rightLower);
        setRotationAngle(rightLower, 1.9635F, 0.0F, 0.0F);
        rightLower.setTextureOffset(24, 32).addCuboid(-2.5F, -1.5F, -1.5F, 5.0F, 9.0F, 5.0F, -0.2F, false);

        left = new ModelPart(this);
        left.setPivot(2.0F, 5.0F, 0.0F);
        lower.addChild(left);
        setRotationAngle(left, 0.0873F, -0.4363F, -0.3927F);
        left.setTextureOffset(52, 4).addCuboid(-2.0F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

        leftLower = new ModelPart(this);
        leftLower.setPivot(0.5F, 5.5F, 0.0F);
        left.addChild(leftLower);


        leftLower_r1 = new ModelPart(this);
        leftLower_r1.setPivot(0.0F, 0.0F, 0.0F);
        leftLower.addChild(leftLower_r1);
        setRotationAngle(leftLower_r1, 0.6109F, 0.0F, 0.0F);
        leftLower_r1.setTextureOffset(0, 39).addCuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, -0.2F, false);

        upper = new ModelPart(this);
        upper.setPivot(0.0F, 5.0F, 0.0F);
        body.addChild(upper);


        leftArm = new ModelPart(this);
        leftArm.setPivot(4.0F, -2.0F, 0.0F);
        upper.addChild(leftArm);
        setRotationAngle(leftArm, 0.8727F, 0.0F, -0.4363F);
        leftArm.setTextureOffset(31, 58).addCuboid(0.0F, -3.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);

        arm = new ModelPart(this);
        arm.setPivot(-4.0F, 2.0F, 0.0F);
        leftArm.addChild(arm);
        arm.setTextureOffset(12, 63).addCuboid(4.5F, -1.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

        hand = new ModelPart(this);
        hand.setPivot(0.0F, 0.0F, 0.0F);
        arm.addChild(hand);


        hand_r1 = new ModelPart(this);
        hand_r1.setPivot(6.0F, 3.0F, 0.0F);
        hand.addChild(hand_r1);
        setRotationAngle(hand_r1, -1.0908F, 0.0F, 0.0F);
        hand_r1.setTextureOffset(50, 53).addCuboid(-2.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        rightArm = new ModelPart(this);
        rightArm.setPivot(-5.0F, -3.0F, -1.0F);
        upper.addChild(rightArm);
        setRotationAngle(rightArm, -1.5708F, 0.2618F, 0.6981F);


        shoulder_r1 = new ModelPart(this);
        shoulder_r1.setPivot(0.0F, -1.0F, 0.0F);
        rightArm.addChild(shoulder_r1);
        setRotationAngle(shoulder_r1, 0.0F, -0.0873F, 0.0F);
        shoulder_r1.setTextureOffset(54, 44).addCuboid(-4.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);

        arm2 = new ModelPart(this);
        arm2.setPivot(4.0F, 2.0F, 0.0F);
        rightArm.addChild(arm2);


        arm_r1 = new ModelPart(this);
        arm_r1.setPivot(-6.0F, -1.0F, 0.0F);
        arm2.addChild(arm_r1);
        setRotationAngle(arm_r1, 0.0F, -0.3054F, 0.0F);
        arm_r1.setTextureOffset(62, 61).addCuboid(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

        hand2 = new ModelPart(this);
        hand2.setPivot(0.0F, 0.0F, 0.0F);
        arm2.addChild(hand2);


        hand_r2 = new ModelPart(this);
        hand_r2.setPivot(-6.0F, 3.0F, 0.0F);
        hand2.addChild(hand_r2);
        setRotationAngle(hand_r2, -0.3927F, -0.5672F, -0.0436F);
        hand_r2.setTextureOffset(0, 53).addCuboid(-2.0F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
    }
    @Override
    public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }
    @Override
    public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){

        head.render(matrixStack, buffer, packedLight, packedOverlay);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
    }
    public void setRotationAngle(ModelPart bone, float x, float y, float z) {
        bone.pitch = x;
        bone.yaw = y;
        bone.roll = z;
    }

}