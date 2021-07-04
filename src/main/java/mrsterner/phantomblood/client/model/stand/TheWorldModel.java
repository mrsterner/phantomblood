package mrsterner.phantomblood.client.model.stand;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TheWorldModel extends EntityModel<LivingEntity> {
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
    private final ModelPart punchLeft;
    private final ModelPart punchLeft1;
    private final ModelPart punchLeft2;
    private final ModelPart punchLeft3;
    private final ModelPart punchLeft4;
    private final ModelPart punchLeft5;
    private final ModelPart punchRight;
    private final ModelPart punchRight1;
    private final ModelPart punchRight2;
    private final ModelPart punchRight3;
    private final ModelPart punchRight4;
    private final ModelPart punchRight5;
    private final ModelPart bodyattack;
    private final ModelPart lower2;
    private final ModelPart right2;
    private final ModelPart rightLower2;
    private final ModelPart left2;
    private final ModelPart leftLower2;
    private final ModelPart leftLower_r2;
    private final ModelPart upper2;
    private final ModelPart leftArm2;
    private final ModelPart rightArm2;
    private double yOffset;

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

        punchLeft = new ModelPart(this);
        punchLeft.setPivot(0.0F, -3.0F, 0.0F);


        punchLeft1 = new ModelPart(this);
        punchLeft1.setPivot(0.0F, 0.0F, 0.0F);
        punchLeft.addChild(punchLeft1);
        punchLeft1.setTextureOffset(24, 76).addCuboid(-14.0F, -7.0F, -4.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

        punchLeft2 = new ModelPart(this);
        punchLeft2.setPivot(0.0F, 27.0F, 0.0F);
        punchLeft.addChild(punchLeft2);
        punchLeft2.setTextureOffset(24, 76).addCuboid(-14.0F, -28.0F, 1.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

        punchLeft3 = new ModelPart(this);
        punchLeft3.setPivot(0.0F, 27.0F, 0.0F);
        punchLeft.addChild(punchLeft3);
        punchLeft3.setTextureOffset(24, 76).addCuboid(-18.0F, -31.0F, -8.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

        punchLeft4 = new ModelPart(this);
        punchLeft4.setPivot(0.0F, 27.0F, 0.0F);
        punchLeft.addChild(punchLeft4);
        punchLeft4.setTextureOffset(24, 76).addCuboid(-15.0F, -24.0F, -8.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

        punchLeft5 = new ModelPart(this);
        punchLeft5.setPivot(0.0F, 27.0F, 0.0F);
        punchLeft.addChild(punchLeft5);
        punchLeft5.setTextureOffset(24, 76).addCuboid(-20.0F, -28.0F, -13.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

        punchRight = new ModelPart(this);
        punchRight.setPivot(0.0F, -3.0F, 0.0F);


        punchRight1 = new ModelPart(this);
        punchRight1.setPivot(0.0F, 27.0F, 0.0F);
        punchRight.addChild(punchRight1);
        punchRight1.setTextureOffset(0, 76).addCuboid(11.0F, -34.0F, -3.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

        punchRight2 = new ModelPart(this);
        punchRight2.setPivot(0.0F, 27.0F, 0.0F);
        punchRight.addChild(punchRight2);
        punchRight2.setTextureOffset(0, 76).addCuboid(10.0F, -30.0F, 4.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

        punchRight3 = new ModelPart(this);
        punchRight3.setPivot(0.0F, 27.0F, 0.0F);
        punchRight.addChild(punchRight3);
        punchRight3.setTextureOffset(0, 76).addCuboid(13.0F, -26.0F, -3.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

        punchRight4 = new ModelPart(this);
        punchRight4.setPivot(0.0F, 27.0F, 0.0F);
        punchRight.addChild(punchRight4);
        punchRight4.setTextureOffset(0, 76).addCuboid(15.0F, -30.0F, -10.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

        punchRight5 = new ModelPart(this);
        punchRight5.setPivot(0.0F, 27.0F, 0.0F);
        punchRight.addChild(punchRight5);
        punchRight5.setTextureOffset(0, 76).addCuboid(11.0F, -24.0F, -8.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

        bodyattack = new ModelPart(this);
        bodyattack.setPivot(0.0F, -5.0F, 0.0F);
        setRotationAngle(bodyattack, 0.1309F, 0.0F, 0.0F);
        bodyattack.setTextureOffset(0, 28).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F, 0.0F, false);
        bodyattack.setTextureOffset(47, 65).addCuboid(-2.5F, 0.0F, 3.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
        bodyattack.setTextureOffset(0, 65).addCuboid(0.5F, 0.0F, 3.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
        bodyattack.setTextureOffset(20, 46).addCuboid(1.0F, -1.0F, -3.0F, 2.0F, 11.0F, 6.0F, 0.0F, false);
        bodyattack.setTextureOffset(38, 40).addCuboid(-3.0F, -1.0F, -3.0F, 2.0F, 11.0F, 6.0F, 0.0F, false);

        lower2 = new ModelPart(this);
        lower2.setPivot(0.0F, 7.0F, 0.0F);
        bodyattack.addChild(lower2);
        setRotationAngle(lower2, 0.1309F, 0.0F, 0.0F);
        lower2.setTextureOffset(46, 18).addCuboid(-3.5F, 0.0F, -2.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);
        lower2.setTextureOffset(27, 9).addCuboid(-4.0F, 3.0F, -3.5F, 8.0F, 2.0F, 7.0F, 0.0F, false);
        lower2.setTextureOffset(66, 53).addCuboid(3.0F, 2.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
        lower2.setTextureOffset(65, 29).addCuboid(-5.0F, 2.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);

        right2 = new ModelPart(this);
        right2.setPivot(-2.25F, 5.0F, -1.0F);
        lower2.addChild(right2);
        setRotationAngle(right2, -0.5672F, 0.1745F, 0.3927F);
        right2.setTextureOffset(48, 32).addCuboid(-2.75F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

        rightLower2 = new ModelPart(this);
        rightLower2.setPivot(-0.25F, 6.5F, 0.0F);
        right2.addChild(rightLower2);
        setRotationAngle(rightLower2, 1.0036F, 0.0F, 0.0F);
        rightLower2.setTextureOffset(24, 32).addCuboid(-2.5F, -1.5F, -1.5F, 5.0F, 9.0F, 5.0F, -0.2F, false);

        left2 = new ModelPart(this);
        left2.setPivot(2.0F, 5.0F, -1.0F);
        lower2.addChild(left2);
        setRotationAngle(left2, -0.5672F, -0.1745F, -0.3927F);
        left2.setTextureOffset(52, 4).addCuboid(-2.0F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

        leftLower2 = new ModelPart(this);
        leftLower2.setPivot(0.5F, 5.5F, 0.0F);
        left2.addChild(leftLower2);


        leftLower_r2 = new ModelPart(this);
        leftLower_r2.setPivot(0.0F, 0.0F, 0.0F);
        leftLower2.addChild(leftLower_r2);
        setRotationAngle(leftLower_r2, 0.6109F, 0.0F, 0.0F);
        leftLower_r2.setTextureOffset(0, 39).addCuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, -0.2F, false);

        upper2 = new ModelPart(this);
        upper2.setPivot(0.0F, 5.0F, 0.0F);
        bodyattack.addChild(upper2);


        leftArm2 = new ModelPart(this);
        leftArm2.setPivot(4.0F, -2.0F, 0.0F);
        upper2.addChild(leftArm2);
        setRotationAngle(leftArm2, -1.1345F, 0.0F, -0.7418F);
        leftArm2.setTextureOffset(31, 58).addCuboid(0.0F, -3.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);

        rightArm2 = new ModelPart(this);
        rightArm2.setPivot(-4.0F, -2.0F, 0.0F);
        upper2.addChild(rightArm2);
        setRotationAngle(rightArm2, -1.1345F, 0.0F, 0.7418F);
        rightArm2.setTextureOffset(54, 44).addCuboid(-4.0F, -3.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);
    }


    public void setAngles(@Nullable LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        this.yOffset = (double)MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;
        this.head.pitch = headPitch * 0.017453292F;
        this.head.yaw = headYaw * 0.017453292F;
    }

    public void setAnglesAttack(LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        float power = 0.5F;
        float speed = 3.0F;
        this.yOffset = (double)MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;
        this.head.pitch = headPitch * 0.017453292F;
        this.head.yaw = headYaw * 0.017453292F;
        this.punchLeft1.yaw = MathHelper.cos(speed * animationProgress) * 1.2F * power;
        this.punchLeft2.yaw = MathHelper.cos(speed * animationProgress + 1.0471976F) * 1.4F * power;
        this.punchLeft3.yaw = MathHelper.cos(speed * animationProgress + (float)2.0943951023931953D) * 1.6F * power;
        this.punchLeft4.yaw = MathHelper.cos(speed * animationProgress + (float)2.6179938779914944D) * 1.3F * power;
        this.punchLeft5.yaw = MathHelper.cos(speed * animationProgress + (float)3.141592653589793D) * 1.7F * power;
        this.punchRight1.yaw = MathHelper.cos(speed * animationProgress + (float)3.665191429188092D) * 1.2F * power;
        this.punchRight2.yaw = MathHelper.cos(speed * animationProgress + (float)6.283185307179586D) * 1.1F * power;
        this.punchRight3.yaw = MathHelper.cos(speed * animationProgress + (float)8.377580409572781D) * 1.4F * power;
        this.punchRight4.yaw = MathHelper.cos(speed * animationProgress + (float)10.471975511965978D) * 1.5F * power;
        this.punchRight5.yaw = MathHelper.cos(speed * animationProgress + (float)1.5707963267948966D) * 1.6F * power;
        float r = (float)Math.random();
        float offysin = MathHelper.sin(r * speed * animationProgress) * power - 0.25F;
        float offycos = MathHelper.cos(r * speed * animationProgress) * power - 0.25F;
        this.punchLeft1.pivotZ = offysin;
        this.punchLeft2.pivotZ = offycos;
        this.punchLeft3.pivotZ = offysin;
        this.punchLeft4.pivotZ = offycos;
        this.punchLeft5.pivotZ = offysin;
        this.punchRight1.pivotZ = offycos;
        this.punchRight2.pivotZ = offysin;
        this.punchRight3.pivotZ = offycos;
        this.punchRight4.pivotZ = offysin;
        this.punchRight5.pivotZ = offycos;
    }


    @Override
    public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){

        matrixStack.translate(-0.45D, this.yOffset - 0.2D, 0.45D);
        this.head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        matrixStack.translate(0.0D, -this.yOffset, 0.0D);
        matrixStack.translate(0.0D, -0.3D, -0.2D);
        matrixStack.scale(2.0F, 2.0F, 2.0F);



    }
    public void renderAttack(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){

        matrixStack.translate(0.0D, this.yOffset - 0.2D, -0.75D);
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        bodyattack.render(matrixStack, buffer, packedLight, packedOverlay);
        matrixStack.translate(0.0D, -this.yOffset, 0.0D);
        punchRight.render(matrixStack, buffer, packedLight, packedOverlay);
        punchLeft.render(matrixStack, buffer, packedLight, packedOverlay);
        matrixStack.translate(0.0D, 0.2D, 0.75D);
    }

    public final void renderPunchyArms(@NotNull MatrixStack matrices, @NotNull VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        this.punchLeft.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.punchRight.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
    public void setRotationAngle(ModelPart bone, float x, float y, float z) {
        bone.pitch = x;
        bone.yaw = y;
        bone.roll = z;
    }

}