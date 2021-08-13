package mrsterner.phantomblood.client.model.stand;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PurpleHazeModel extends EntityModel<LivingEntity> {
    private final ModelPart head;
    private final ModelPart bone;
    private final ModelPart head_r1;
    private final ModelPart head_r2;
    private final ModelPart head_r3;
    private final ModelPart head_r4;
    private final ModelPart head_r5;
    private final ModelPart head_r6;
    private final ModelPart bone4;
    private final ModelPart head_r7;
    private final ModelPart bone2;
    private final ModelPart bone3;
    private final ModelPart body;
    private final ModelPart torsoplate_r1;
    private final ModelPart spike;
    private final ModelPart spike2;
    private final ModelPart spike3;
    private final ModelPart lower;
    private final ModelPart belt_r1;
    private final ModelPart abs_r1;
    private final ModelPart right;
    private final ModelPart rightUpper_r1;
    private final ModelPart rightLower;
    private final ModelPart left;
    private final ModelPart leftUpper_r1;
    private final ModelPart leftLower;
    private final ModelPart leftLower_r1;
    private final ModelPart upper;
    private final ModelPart leftArm;
    private final ModelPart arm;
    private final ModelPart hand;
    private final ModelPart hand_r1;
    private final ModelPart rightArm;
    private final ModelPart shoulder_r1;
    private final ModelPart shoulder_r2;
    private final ModelPart arm2;
    private final ModelPart arm_r1;
    private final ModelPart hand2;
    private final ModelPart hand_r2;
    private final ModelPart glass;
    private final ModelPart bone5;
    private final ModelPart bone7;
    private final ModelPart bone8;
    private final ModelPart punch;
    private final ModelPart leftPunch;
    private final ModelPart hand3;
    private final ModelPart hand4;
    private final ModelPart hand5;
    private final ModelPart rightPunch;
    private final ModelPart hand6;
    private final ModelPart hand7;
    private final ModelPart hand8;
    private final ModelPart bodyPunch;
    private final ModelPart torsoplate_r2;
    private final ModelPart spike4;
    private final ModelPart spike5;
    private final ModelPart spike6;
    private final ModelPart lower2;
    private final ModelPart belt_r2;
    private final ModelPart abs_r2;
    private final ModelPart right2;
    private final ModelPart rightUpper_r2;
    private final ModelPart rightLower2;
    private final ModelPart left2;
    private final ModelPart leftUpper_r2;
    private final ModelPart leftLower2;
    private final ModelPart leftLower_r2;
    private final ModelPart upper2;
    private final ModelPart leftArm2;
    private final ModelPart rightArm2;
    private final ModelPart shoulder_r3;
    private final ModelPart shoulder_r4;
    private double yOffset;

    public PurpleHazeModel() {
        textureWidth = 128;
        textureHeight = 128;
        head = new ModelPart(this);
        head.setPivot(0.0F, -5.0F, 0.0F);
        setRotationAngle(head, 1.0036F, 0.0F, 0.0F);
        head.setTextureOffset(0, 0).addCuboid(-3.5F, -7.0F, -4.0F, 7.0F, 7.0F, 8.0F, 0.0F, false);

        bone = new ModelPart(this);
        bone.setPivot(0.0F, -6.5F, 0.0F);
        head.addChild(bone);
        bone.setTextureOffset(0, 15).addCuboid(-4.0F, -1.0F, -3.5F, 8.0F, 3.0F, 7.0F, 0.0F, false);
        bone.setTextureOffset(23, 15).addCuboid(-4.0F, -1.0F, 3.0F, 8.0F, 3.0F, 1.0F, -0.01F, false);
        bone.setTextureOffset(45, 21).addCuboid(-0.5F, -1.5F, -6.501F, 1.0F, 1.0F, 9.0F, 0.0F, false);
        bone.setTextureOffset(65, 35).addCuboid(-0.5F, -3.5F, -1.501F, 1.0F, 2.0F, 4.0F, 0.0F, false);
        bone.setTextureOffset(23, 19).addCuboid(-0.5F, -3.5F, -3.501F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        head_r1 = new ModelPart(this);
        head_r1.setPivot(-0.5F, -1.5F, -1.0F);
        bone.addChild(head_r1);
        setRotationAngle(head_r1, 0.0F, 0.0F, -0.5236F);
        head_r1.setTextureOffset(35, 31).addCuboid(-1.0F, 0.0F, -5.5F, 1.0F, 1.0F, 10.0F, 0.0F, false);

        head_r2 = new ModelPart(this);
        head_r2.setPivot(0.0F, -3.5F, -3.5F);
        bone.addChild(head_r2);
        setRotationAngle(head_r2, 0.3054F, 0.0F, 0.0F);
        head_r2.setTextureOffset(18, 36).addCuboid(-0.5F, 0.0F, -2.001F, 1.0F, 1.0F, 2.0F, -0.001F, false);

        head_r3 = new ModelPart(this);
        head_r3.setPivot(0.0F, -3.5F, -2.5F);
        bone.addChild(head_r3);
        setRotationAngle(head_r3, -0.6109F, 0.0F, 0.0F);
        head_r3.setTextureOffset(0, 0).addCuboid(-0.5F, 0.0F, -0.001F, 1.0F, 1.0F, 3.0F, -0.001F, false);

        head_r4 = new ModelPart(this);
        head_r4.setPivot(0.5F, -1.5F, -1.0F);
        bone.addChild(head_r4);
        setRotationAngle(head_r4, 0.0F, 0.0F, 0.5236F);
        head_r4.setTextureOffset(0, 36).addCuboid(0.0F, 0.0F, -5.5F, 1.0F, 1.0F, 10.0F, 0.0F, false);

        head_r5 = new ModelPart(this);
        head_r5.setPivot(4.0F, -1.5F, 4.0F);
        bone.addChild(head_r5);
        setRotationAngle(head_r5, 0.0F, 0.3054F, 0.0F);
        head_r5.setTextureOffset(40, 21).addCuboid(-4.0F, 0.5F, -1.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);

        head_r6 = new ModelPart(this);
        head_r6.setPivot(-4.0F, -1.5F, 4.0F);
        bone.addChild(head_r6);
        setRotationAngle(head_r6, 0.0F, -0.3054F, 0.0F);
        head_r6.setTextureOffset(32, 42).addCuboid(0.0F, 0.5F, -1.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);

        bone4 = new ModelPart(this);
        bone4.setPivot(0.0F, -3.5F, 2.5F);
        bone.addChild(bone4);
        setRotationAngle(bone4, -0.6981F, 0.0F, 0.0F);
        bone4.setTextureOffset(32, 64).addCuboid(-0.5F, 0.0F, -0.001F, 1.0F, 2.0F, 4.0F, -0.001F, false);

        head_r7 = new ModelPart(this);
        head_r7.setPivot(0.0F, 0.0F, 4.0F);
        bone4.addChild(head_r7);
        setRotationAngle(head_r7, -1.0036F, 0.0F, 0.0F);
        head_r7.setTextureOffset(22, 64).addCuboid(-0.5F, 0.0F, -0.001F, 1.0F, 2.0F, 4.0F, -0.001F, false);

        bone2 = new ModelPart(this);
        bone2.setPivot(4.0F, -0.5F, -3.5F);
        bone.addChild(bone2);
        setRotationAngle(bone2, 0.0F, 0.6109F, 0.0F);
        bone2.setTextureOffset(45, 0).addCuboid(-1.0F, 2.499F, -6.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
        bone2.setTextureOffset(39, 58).addCuboid(-2.0F, -0.499F, -6.0F, 2.0F, 3.0F, 6.0F, 0.0F, false);

        bone3 = new ModelPart(this);
        bone3.setPivot(-4.0F, -0.5F, -3.5F);
        bone.addChild(bone3);
        setRotationAngle(bone3, 0.0F, -0.6109F, 0.0F);
        bone3.setTextureOffset(0, 4).addCuboid(0.0F, 2.499F, -6.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
        bone3.setTextureOffset(56, 21).addCuboid(0.0F, -0.501F, -6.0F, 2.0F, 3.0F, 6.0F, 0.0F, false);

        body = new ModelPart(this);
        body.setPivot(0.0F, -5.0F, 0.0F);
        setRotationAngle(body, 0.5672F, 0.2618F, 0.0F);
        body.setTextureOffset(0, 25).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(61, 12).addCuboid(-3.5F, 0.5F, -2.5F, 7.0F, 4.0F, 1.0F, 0.0F, false);

        torsoplate_r1 = new ModelPart(this);
        torsoplate_r1.setPivot(0.0F, 5.0F, -1.9F);
        body.addChild(torsoplate_r1);
        setRotationAngle(torsoplate_r1, 0.0873F, 0.0F, 0.0F);
        torsoplate_r1.setTextureOffset(66, 8).addCuboid(-1.5F, -0.5F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);

        spike = new ModelPart(this);
        spike.setPivot(0.0F, 1.5F, 2.0F);
        body.addChild(spike);
        setRotationAngle(spike, 0.2182F, 0.0F, 0.0F);
        spike.setTextureOffset(22, 5).addCuboid(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 2.0F, -0.2F, false);
        spike.setTextureOffset(26, 5).addCuboid(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        spike.setTextureOffset(31, 0).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.2F, false);

        spike2 = new ModelPart(this);
        spike2.setPivot(0.0F, 3.5F, 0.0F);
        body.addChild(spike2);
        spike2.setTextureOffset(0, 18).addCuboid(-0.5F, -0.5F, 2.5F, 1.0F, 1.0F, 2.0F, -0.2F, false);
        spike2.setTextureOffset(20, 25).addCuboid(-0.5F, -0.5F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        spike2.setTextureOffset(20, 27).addCuboid(-0.5F, -0.5F, 1.5F, 1.0F, 1.0F, 1.0F, 0.2F, false);

        spike3 = new ModelPart(this);
        spike3.setPivot(0.0F, 5.5F, 2.0F);
        body.addChild(spike3);
        setRotationAngle(spike3, -0.2182F, 0.0F, 0.0F);
        spike3.setTextureOffset(0, 27).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.2F, false);
        spike3.setTextureOffset(0, 15).addCuboid(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 2.0F, -0.2F, false);
        spike3.setTextureOffset(0, 25).addCuboid(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        lower = new ModelPart(this);
        lower.setPivot(0.0F, 7.0F, 0.0F);
        body.addChild(lower);
        setRotationAngle(lower, -0.7418F, 0.0F, 0.0F);
        lower.setTextureOffset(47, 31).addCuboid(-3.5F, 0.0F, -2.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);
        lower.setTextureOffset(40, 14).addCuboid(-4.0F, 2.5F, -2.5F, 8.0F, 2.0F, 5.0F, 0.0F, false);

        belt_r1 = new ModelPart(this);
        belt_r1.setPivot(0.0F, 3.0F, 0.0F);
        lower.addChild(belt_r1);
        setRotationAngle(belt_r1, 0.3491F, 0.0F, 0.0F);
        belt_r1.setTextureOffset(29, 54).addCuboid(-3.5F, -0.5F, 2.0F, 7.0F, 9.0F, 1.0F, 0.0F, false);
        belt_r1.setTextureOffset(19, 34).addCuboid(-4.0F, -1.5F, -2.5F, 8.0F, 2.0F, 5.0F, 0.1F, false);

        abs_r1 = new ModelPart(this);
        abs_r1.setPivot(0.0F, 0.0F, 1.0F);
        lower.addChild(abs_r1);
        setRotationAngle(abs_r1, 0.1745F, 0.0F, 0.0F);
        abs_r1.setTextureOffset(52, 42).addCuboid(-3.5F, -2.0F, -3.0F, 7.0F, 2.0F, 3.0F, -0.01F, false);

        right = new ModelPart(this);
        right.setPivot(-2.25F, 5.0F, 0.0F);
        lower.addChild(right);
        setRotationAngle(right, -1.3526F, 0.2182F, 0.1745F);
        right.setTextureOffset(17, 42).addCuboid(-2.75F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

        rightUpper_r1 = new ModelPart(this);
        rightUpper_r1.setPivot(-0.25F, 7.5F, -1.5F);
        right.addChild(rightUpper_r1);
        setRotationAngle(rightUpper_r1, -0.6545F, 0.0F, 0.0F);
        rightUpper_r1.setTextureOffset(14, 63).addCuboid(-1.5F, -1.5F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);

        rightLower = new ModelPart(this);
        rightLower.setPivot(-0.25F, 6.5F, 0.0F);
        right.addChild(rightLower);
        setRotationAngle(rightLower, 1.5272F, 0.0F, 0.0F);
        rightLower.setTextureOffset(25, 20).addCuboid(-2.5F, -1.5F, -1.5F, 5.0F, 9.0F, 5.0F, -0.2F, false);

        left = new ModelPart(this);
        left.setPivot(2.0F, 5.0F, 0.0F);
        lower.addChild(left);
        setRotationAngle(left, -1.1345F, -0.1745F, -0.3927F);
        left.setTextureOffset(37, 42).addCuboid(-2.0F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

        leftUpper_r1 = new ModelPart(this);
        leftUpper_r1.setPivot(0.5F, 7.5F, -1.5F);
        left.addChild(leftUpper_r1);
        setRotationAngle(leftUpper_r1, -0.4363F, 0.0F, 0.0F);
        leftUpper_r1.setTextureOffset(22, 0).addCuboid(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);

        leftLower = new ModelPart(this);
        leftLower.setPivot(0.5F, 5.5F, 0.0F);
        left.addChild(leftLower);
        setRotationAngle(leftLower, 1.3963F, 0.0F, 0.0F);


        leftLower_r1 = new ModelPart(this);
        leftLower_r1.setPivot(0.0F, 0.0F, 0.0F);
        leftLower.addChild(leftLower_r1);
        setRotationAngle(leftLower_r1, 0.6109F, 0.0F, 0.0F);
        leftLower_r1.setTextureOffset(30, 0).addCuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, -0.2F, false);

        upper = new ModelPart(this);
        upper.setPivot(0.0F, 5.0F, 0.0F);
        body.addChild(upper);


        leftArm = new ModelPart(this);
        leftArm.setPivot(5.0F, -2.0F, -1.0F);
        upper.addChild(leftArm);
        setRotationAngle(leftArm, -1.309F, -0.6545F, 0.0F);
        leftArm.setTextureOffset(11, 54).addCuboid(-1.0F, -3.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);
        leftArm.setTextureOffset(0, 77).addCuboid(-0.5F, -3.5F, -3.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);

        arm = new ModelPart(this);
        arm.setPivot(1.0F, 1.0F, 0.0F);
        leftArm.addChild(arm);
        setRotationAngle(arm, 0.0F, 2.7925F, 0.0F);
        arm.setTextureOffset(0, 59).addCuboid(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

        hand = new ModelPart(this);
        hand.setPivot(-6.0F, 1.0F, 0.0F);
        arm.addChild(hand);


        hand_r1 = new ModelPart(this);
        hand_r1.setPivot(6.0F, 3.0F, 0.0F);
        hand.addChild(hand_r1);
        setRotationAngle(hand_r1, -1.0908F, 0.0F, 0.0F);
        hand_r1.setTextureOffset(4, 40).addCuboid(-1.0F, -3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        hand_r1.setTextureOffset(50, 0).addCuboid(-2.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        rightArm = new ModelPart(this);
        rightArm.setPivot(-4.0F, -2.0F, -2.0F);
        upper.addChild(rightArm);
        setRotationAngle(rightArm, -1.309F, 0.3491F, 0.0F);


        shoulder_r1 = new ModelPart(this);
        shoulder_r1.setPivot(-5.0F, -1.0F, 0.0F);
        rightArm.addChild(shoulder_r1);
        setRotationAngle(shoulder_r1, 0.0F, -0.0873F, 0.0F);
        shoulder_r1.setTextureOffset(0, 68).addCuboid(0.5F, -2.5F, -3.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);

        shoulder_r2 = new ModelPart(this);
        shoulder_r2.setPivot(0.0F, -1.0F, 0.0F);
        rightArm.addChild(shoulder_r2);
        setRotationAngle(shoulder_r2, 0.0F, -0.0873F, 0.0F);
        shoulder_r2.setTextureOffset(52, 49).addCuboid(-4.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);

        arm2 = new ModelPart(this);
        arm2.setPivot(4.0F, 2.0F, 0.0F);
        rightArm.addChild(arm2);


        arm_r1 = new ModelPart(this);
        arm_r1.setPivot(-6.0F, -1.0F, 0.0F);
        arm2.addChild(arm_r1);
        setRotationAngle(arm_r1, 0.0F, -0.3054F, 0.0F);
        arm_r1.setTextureOffset(55, 58).addCuboid(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

        hand2 = new ModelPart(this);
        hand2.setPivot(-6.0F, 3.75F, 0.0F);
        arm2.addChild(hand2);
        setRotationAngle(hand2, 0.0F, -0.6981F, -0.4363F);


        hand_r2 = new ModelPart(this);
        hand_r2.setPivot(0.0F, -0.75F, 0.0F);
        hand2.addChild(hand_r2);
        setRotationAngle(hand_r2, -0.3927F, -0.5672F, -0.0436F);
        hand_r2.setTextureOffset(4, 40).addCuboid(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        hand_r2.setTextureOffset(0, 47).addCuboid(-2.0F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        glass = new ModelPart(this);
        glass.setPivot(0.0F, -5.0F, 0.0F);
        setRotationAngle(glass, 1.0036F, 0.0F, 0.0F);


        bone5 = new ModelPart(this);
        bone5.setPivot(0.0F, -6.5F, 0.0F);
        glass.addChild(bone5);


        bone7 = new ModelPart(this);
        bone7.setPivot(4.0F, -0.5F, -3.5F);
        bone5.addChild(bone7);
        setRotationAngle(bone7, 0.0F, 0.6109F, 0.0F);
        bone7.setTextureOffset(0, 86).addCuboid(-1.5F, 1.501F, -5.5F, 1.0F, 4.0F, 5.0F, -0.1F, false);

        bone8 = new ModelPart(this);
        bone8.setPivot(-4.0F, -0.5F, -3.5F);
        bone5.addChild(bone8);
        setRotationAngle(bone8, 0.0F, -0.6109F, 0.0F);
        bone8.setTextureOffset(0, 86).addCuboid(0.5F, 1.499F, -5.5F, 1.0F, 4.0F, 5.0F, -0.1F, false);

        punch = new ModelPart(this);
        punch.setPivot(0.0F, 0.0F, 0.0F);


        leftPunch = new ModelPart(this);
        leftPunch.setPivot(0.0F, 0.0F, 0.0F);
        punch.addChild(leftPunch);


        hand3 = new ModelPart(this);
        hand3.setPivot(0.0F, 3.75F, -2.0F);
        leftPunch.addChild(hand3);
        setRotationAngle(hand3, -1.5708F, 0.0F, 0.0F);
        hand3.setTextureOffset(0, 47).addCuboid(-16.0F, -1.75F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        hand4 = new ModelPart(this);
        hand4.setPivot(0.0F, 3.75F, -2.0F);
        leftPunch.addChild(hand4);
        setRotationAngle(hand4, -1.5708F, 0.0F, 0.0F);
        hand4.setTextureOffset(0, 47).addCuboid(-20.0F, -1.75F, -8.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        hand5 = new ModelPart(this);
        hand5.setPivot(0.0F, 3.75F, -2.0F);
        leftPunch.addChild(hand5);
        setRotationAngle(hand5, -1.5708F, 0.0F, 0.0F);
        hand5.setTextureOffset(0, 47).addCuboid(-14.0F, -1.75F, -13.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        rightPunch = new ModelPart(this);
        rightPunch.setPivot(0.0F, 0.0F, 0.0F);
        punch.addChild(rightPunch);


        hand6 = new ModelPart(this);
        hand6.setPivot(0.0F, 3.75F, -2.0F);
        rightPunch.addChild(hand6);
        setRotationAngle(hand6, -1.5708F, 0.0F, 0.0F);
        hand6.setTextureOffset(0, 47).addCuboid(12.0F, -1.75F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

        hand7 = new ModelPart(this);
        hand7.setPivot(0.0F, 3.75F, -2.0F);
        rightPunch.addChild(hand7);
        setRotationAngle(hand7, -1.5708F, 0.0F, 0.0F);
        hand7.setTextureOffset(0, 47).addCuboid(16.0F, -1.75F, -8.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

        hand8 = new ModelPart(this);
        hand8.setPivot(0.0F, 3.75F, -2.0F);
        rightPunch.addChild(hand8);
        setRotationAngle(hand8, -1.5708F, 0.0F, 0.0F);
        hand8.setTextureOffset(0, 47).addCuboid(10.0F, -1.75F, -13.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

        bodyPunch = new ModelPart(this);
        bodyPunch.setPivot(0.0F, -5.0F, 0.0F);
        setRotationAngle(bodyPunch, 0.5672F, 0.2618F, 0.0F);
        bodyPunch.setTextureOffset(0, 25).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F, 0.0F, false);
        bodyPunch.setTextureOffset(61, 12).addCuboid(-3.5F, 0.5F, -2.5F, 7.0F, 4.0F, 1.0F, 0.0F, false);

        torsoplate_r2 = new ModelPart(this);
        torsoplate_r2.setPivot(0.0F, 5.0F, -1.9F);
        bodyPunch.addChild(torsoplate_r2);
        setRotationAngle(torsoplate_r2, 0.0873F, 0.0F, 0.0F);
        torsoplate_r2.setTextureOffset(66, 8).addCuboid(-1.5F, -0.5F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);

        spike4 = new ModelPart(this);
        spike4.setPivot(0.0F, 1.5F, 2.0F);
        bodyPunch.addChild(spike4);
        setRotationAngle(spike4, 0.2182F, 0.0F, 0.0F);
        spike4.setTextureOffset(22, 5).addCuboid(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 2.0F, -0.2F, false);
        spike4.setTextureOffset(26, 5).addCuboid(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        spike4.setTextureOffset(31, 0).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.2F, false);

        spike5 = new ModelPart(this);
        spike5.setPivot(0.0F, 3.5F, 0.0F);
        bodyPunch.addChild(spike5);
        spike5.setTextureOffset(0, 18).addCuboid(-0.5F, -0.5F, 2.5F, 1.0F, 1.0F, 2.0F, -0.2F, false);
        spike5.setTextureOffset(20, 25).addCuboid(-0.5F, -0.5F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        spike5.setTextureOffset(20, 27).addCuboid(-0.5F, -0.5F, 1.5F, 1.0F, 1.0F, 1.0F, 0.2F, false);

        spike6 = new ModelPart(this);
        spike6.setPivot(0.0F, 5.5F, 2.0F);
        bodyPunch.addChild(spike6);
        setRotationAngle(spike6, -0.2182F, 0.0F, 0.0F);
        spike6.setTextureOffset(0, 27).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.2F, false);
        spike6.setTextureOffset(0, 15).addCuboid(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 2.0F, -0.2F, false);
        spike6.setTextureOffset(0, 25).addCuboid(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        lower2 = new ModelPart(this);
        lower2.setPivot(0.0F, 7.0F, 0.0F);
        bodyPunch.addChild(lower2);
        setRotationAngle(lower2, -0.7418F, 0.0F, 0.0F);
        lower2.setTextureOffset(47, 31).addCuboid(-3.5F, 0.0F, -2.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);
        lower2.setTextureOffset(40, 14).addCuboid(-4.0F, 2.5F, -2.5F, 8.0F, 2.0F, 5.0F, 0.0F, false);

        belt_r2 = new ModelPart(this);
        belt_r2.setPivot(0.0F, 3.0F, 0.0F);
        lower2.addChild(belt_r2);
        setRotationAngle(belt_r2, 0.3491F, 0.0F, 0.0F);
        belt_r2.setTextureOffset(29, 54).addCuboid(-3.5F, -0.5F, 2.0F, 7.0F, 9.0F, 1.0F, 0.0F, false);
        belt_r2.setTextureOffset(19, 34).addCuboid(-4.0F, -1.5F, -2.5F, 8.0F, 2.0F, 5.0F, 0.1F, false);

        abs_r2 = new ModelPart(this);
        abs_r2.setPivot(0.0F, 0.0F, 1.0F);
        lower2.addChild(abs_r2);
        setRotationAngle(abs_r2, 0.1745F, 0.0F, 0.0F);
        abs_r2.setTextureOffset(52, 42).addCuboid(-3.5F, -2.0F, -3.0F, 7.0F, 2.0F, 3.0F, -0.01F, false);

        right2 = new ModelPart(this);
        right2.setPivot(-2.25F, 5.0F, 0.0F);
        lower2.addChild(right2);
        setRotationAngle(right2, -1.3526F, 0.2182F, 0.1745F);
        right2.setTextureOffset(17, 42).addCuboid(-2.75F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

        rightUpper_r2 = new ModelPart(this);
        rightUpper_r2.setPivot(-0.25F, 7.5F, -1.5F);
        right2.addChild(rightUpper_r2);
        setRotationAngle(rightUpper_r2, -0.6545F, 0.0F, 0.0F);
        rightUpper_r2.setTextureOffset(14, 63).addCuboid(-1.5F, -1.5F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);

        rightLower2 = new ModelPart(this);
        rightLower2.setPivot(-0.25F, 6.5F, 0.0F);
        right2.addChild(rightLower2);
        setRotationAngle(rightLower2, 1.5272F, 0.0F, 0.0F);
        rightLower2.setTextureOffset(25, 20).addCuboid(-2.5F, -1.5F, -1.5F, 5.0F, 9.0F, 5.0F, -0.2F, false);

        left2 = new ModelPart(this);
        left2.setPivot(2.0F, 5.0F, 0.0F);
        lower2.addChild(left2);
        setRotationAngle(left2, -1.1345F, -0.1745F, -0.3927F);
        left2.setTextureOffset(37, 42).addCuboid(-2.0F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

        leftUpper_r2 = new ModelPart(this);
        leftUpper_r2.setPivot(0.5F, 7.5F, -1.5F);
        left2.addChild(leftUpper_r2);
        setRotationAngle(leftUpper_r2, -0.4363F, 0.0F, 0.0F);
        leftUpper_r2.setTextureOffset(22, 0).addCuboid(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);

        leftLower2 = new ModelPart(this);
        leftLower2.setPivot(0.5F, 5.5F, 0.0F);
        left2.addChild(leftLower2);
        setRotationAngle(leftLower2, 1.3963F, 0.0F, 0.0F);


        leftLower_r2 = new ModelPart(this);
        leftLower_r2.setPivot(0.0F, 0.0F, 0.0F);
        leftLower2.addChild(leftLower_r2);
        setRotationAngle(leftLower_r2, 0.6109F, 0.0F, 0.0F);
        leftLower_r2.setTextureOffset(30, 0).addCuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, -0.2F, false);

        upper2 = new ModelPart(this);
        upper2.setPivot(0.0F, 5.0F, 0.0F);
        bodyPunch.addChild(upper2);


        leftArm2 = new ModelPart(this);
        leftArm2.setPivot(5.0F, -2.0F, -1.0F);
        upper2.addChild(leftArm2);
        setRotationAngle(leftArm2, -1.309F, -0.6545F, 0.0F);
        leftArm2.setTextureOffset(11, 54).addCuboid(-1.0F, -3.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);
        leftArm2.setTextureOffset(0, 77).addCuboid(-0.5F, -3.5F, -3.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);

        rightArm2 = new ModelPart(this);
        rightArm2.setPivot(-4.0F, -2.0F, -2.0F);
        upper2.addChild(rightArm2);
        setRotationAngle(rightArm2, -1.309F, 0.3491F, 0.0F);


        shoulder_r3 = new ModelPart(this);
        shoulder_r3.setPivot(-5.0F, -1.0F, 0.0F);
        rightArm2.addChild(shoulder_r3);
        setRotationAngle(shoulder_r3, 0.0F, -0.0873F, 0.0F);
        shoulder_r3.setTextureOffset(0, 68).addCuboid(0.5F, -2.5F, -3.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);

        shoulder_r4 = new ModelPart(this);
        shoulder_r4.setPivot(0.0F, -1.0F, 0.0F);
        rightArm2.addChild(shoulder_r4);
        setRotationAngle(shoulder_r4, 0.0F, -0.0873F, 0.0F);
        shoulder_r4.setTextureOffset(52, 49).addCuboid(-4.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);
  }
    @Override
    public void setAngles(LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch){
        this.yOffset = (double) MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;

    }
    public void setAttackAngles(LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch){
        float power = 0.5F;
        float speed = 3.0F;
        this.yOffset = (double)MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;
        this.hand3.yaw = MathHelper.cos(speed * animationProgress) * 1.2F * power;
        this.hand4.yaw = MathHelper.cos(speed * animationProgress + 1.0471976F) * 1.4F * power;
        this.hand5.yaw = MathHelper.cos(speed * animationProgress + (float)2.0943951023931953D) * 1.6F * power;
        this.hand6.yaw = MathHelper.cos(speed * animationProgress + (float)3.665191429188092D) * 1.2F * power;
        this.hand7.yaw = MathHelper.cos(speed * animationProgress + (float)6.283185307179586D) * 1.1F * power;
        this.hand8.yaw = MathHelper.cos(speed * animationProgress + (float)8.377580409572781D) * 1.4F * power;
        float r = (float)Math.random();
        float offysin = MathHelper.sin(r * speed * animationProgress) * power - 0.25F;
        float offycos = MathHelper.cos(r * speed * animationProgress) * power - 0.25F;
        this.hand3.pivotZ = offysin;
        this.hand4.pivotZ = offycos;
        this.hand5.pivotZ = offysin;
        this.hand6.pivotZ = offycos;
        this.hand7.pivotZ = offysin;
        this.hand8.pivotZ = offycos;
    }
    @Override
    public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        matrixStack.translate(-0.5D, this.yOffset - 0.2D, 0.5D);
        this.head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }
    public void renderGlass(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        //matrixStack.translate(-0.45D, this.yOffset - 0.2D, 0.45D);
        this.glass.render(matrixStack, buffer, packedLight, packedOverlay);
    }
    public void renderAttack(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        matrixStack.translate(0.0D, this.yOffset - 0.2D, -0.75D);
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        bodyPunch.render(matrixStack, buffer, packedLight, packedOverlay);
        matrixStack.translate(0.0D, -this.yOffset, 0.0D);
        punch.render(matrixStack, buffer, packedLight, packedOverlay);
    }
    public void renderAttackGlass(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        matrixStack.translate(0.0D, this.yOffset, 0.0D);
        this.glass.render(matrixStack, buffer, packedLight, packedOverlay);
    }
    public final void renderPunchyArms(@NotNull MatrixStack matrices, @NotNull VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        this.rightPunch.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.leftPunch.render(matrices, vertices, light, overlay, red, green, blue, alpha);

    }
    public void setRotationAngle(ModelPart bone, float x, float y, float z) {
        bone.pitch = x;
        bone.yaw = y;
        bone.roll = z;
    }

}
