package mrsterner.phantomblood.client.model.stand;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.NotNull;

public class KingCrimsonModel extends EntityModel<LivingEntity> {
    private final ModelPart head;
    private final ModelPart head_r1;
    private final ModelPart head_r2;
    private final ModelPart bone2;
    private final ModelPart bone;
    private final ModelPart body;
    private final ModelPart collarRight;
    private final ModelPart torso_r1;
    private final ModelPart bone6;
    private final ModelPart collarLeft;
    private final ModelPart torso_r2;
    private final ModelPart bone3;
    private final ModelPart bone4;
    private final ModelPart torso_r3;
    private final ModelPart lower;
    private final ModelPart belt_r1;
    private final ModelPart belt_r2;
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
    private final ModelPart arm2;
    private final ModelPart hand2;
    private final ModelPart hand_r2;
    private final ModelPart hand_r3;
    private final ModelPart punch;
    private final ModelPart leftPunch;
    private final ModelPart hand3;
    private final ModelPart hand4;
    private final ModelPart hand5;
    private final ModelPart hand6;
    private final ModelPart hand7;
    private final ModelPart rightPunch;
    private final ModelPart hand8;
    private final ModelPart hand9;
    private final ModelPart hand10;
    private final ModelPart hand11;
    private final ModelPart hand12;
    private final ModelPart punchBody;
    private final ModelPart lower2;
    private final ModelPart belt_r3;
    private final ModelPart belt_r4;
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
    private double yOffset;
    public KingCrimsonModel() {
        textureWidth = 128;
        textureHeight = 128;
        head = new ModelPart(this);
        head.setPivot(0.0F, -5.0F, 0.0F);
        head.setTextureOffset(1, 1).addCuboid(-3.5F, -7.0F, -4.0F, 7.0F, 7.0F, 7.0F, 0.0F, false);

        head_r1 = new ModelPart(this);
        head_r1.setPivot(-1.5F, -4.5F, -3.7F);
        head.addChild(head_r1);
        setRotationAngle(head_r1, 0.0F, 0.0F, 0.0873F);
        head_r1.setTextureOffset(1, 1).addCuboid(-1.0F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);

        head_r2 = new ModelPart(this);
        head_r2.setPivot(1.5F, -4.5F, -3.7F);
        head.addChild(head_r2);
        setRotationAngle(head_r2, 0.0F, 0.0F, -0.0873F);
        head_r2.setTextureOffset(1, 1).addCuboid(-1.0F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        bone2 = new ModelPart(this);
        bone2.setPivot(0.0F, -5.0F, -3.5F);
        head.addChild(bone2);
        setRotationAngle(bone2, -0.1745F, 0.0F, 0.0F);
        bone2.setTextureOffset(24, 15).addCuboid(-1.5F, -2.5F, -2.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
        bone2.setTextureOffset(22, 0).addCuboid(-1.5F, -2.5F, -1.0F, 3.0F, 3.0F, 2.0F, 0.2F, false);

        bone = new ModelPart(this);
        bone.setPivot(0.0F, -5.5F, -4.0F);
        head.addChild(bone);
        setRotationAngle(bone, 0.1309F, 0.0F, 0.0F);


        body = new ModelPart(this);
        body.setPivot(0.0F, -5.0F, 0.0F);
        setRotationAngle(body, 0.0F, -0.4363F, 0.0F);
        body.setTextureOffset(0, 15).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(0, 44).addCuboid(-3.5F, 0.5F, -2.5F, 7.0F, 4.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(22, 5).addCuboid(-1.5F, 4.5F, -2.25F, 3.0F, 2.0F, 1.0F, 0.0F, false);

        collarRight = new ModelPart(this);
        collarRight.setPivot(-5.0F, 2.5F, 0.0F);
        body.addChild(collarRight);


        torso_r1 = new ModelPart(this);
        torso_r1.setPivot(0.0F, -2.0F, 0.0F);
        collarRight.addChild(torso_r1);
        setRotationAngle(torso_r1, 0.0F, -0.3927F, 0.0F);
        torso_r1.setTextureOffset(0, 62).addCuboid(0.0F, -1.5F, -4.0F, 1.0F, 3.0F, 4.0F, 0.001F, false);

        bone6 = new ModelPart(this);
        bone6.setPivot(0.0F, -2.0F, 0.0F);
        collarRight.addChild(bone6);
        setRotationAngle(bone6, 0.0F, 0.3927F, 0.0F);
        bone6.setTextureOffset(0, 62).addCuboid(0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);

        collarLeft = new ModelPart(this);
        collarLeft.setPivot(5.0F, 2.5F, 0.0F);
        body.addChild(collarLeft);


        torso_r2 = new ModelPart(this);
        torso_r2.setPivot(0.0F, -2.0F, 0.0F);
        collarLeft.addChild(torso_r2);
        setRotationAngle(torso_r2, 0.0F, 0.3927F, 0.0F);
        torso_r2.setTextureOffset(0, 62).addCuboid(-1.0F, -1.5F, -4.0F, 1.0F, 3.0F, 4.0F, 0.001F, true);

        bone3 = new ModelPart(this);
        bone3.setPivot(0.0F, -2.0F, 0.0F);
        collarLeft.addChild(bone3);
        setRotationAngle(bone3, 0.0F, -0.3927F, 0.0F);
        bone3.setTextureOffset(0, 62).addCuboid(-1.0F, -1.5F, 0.0F, 1.0F, 3.0F, 4.0F, 0.0F, true);

        bone4 = new ModelPart(this);
        bone4.setPivot(0.0F, 0.0F, 4.0F);
        bone3.addChild(bone4);
        setRotationAngle(bone4, 0.0F, -1.1781F, 0.0F);
        bone4.setTextureOffset(0, 62).addCuboid(-1.0F, -1.5F, 0.0F, 1.0F, 3.0F, 7.0F, 0.001F, true);

        torso_r3 = new ModelPart(this);
        torso_r3.setPivot(0.0F, 0.0F, -4.0F);
        bone4.addChild(torso_r3);
        setRotationAngle(torso_r3, 0.0F, 0.0F, 0.5672F);
        torso_r3.setTextureOffset(0, 62).addCuboid(-1.0F, 1.5F, 4.0F, 1.0F, 3.0F, 7.0F, 0.001F, true);

        lower = new ModelPart(this);
        lower.setPivot(0.0F, 7.0F, 0.0F);
        body.addChild(lower);
        setRotationAngle(lower, 0.1309F, 0.0F, 0.0F);
        lower.setTextureOffset(20, 35).addCuboid(-3.5F, 0.0F, -2.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);

        belt_r1 = new ModelPart(this);
        belt_r1.setPivot(0.0F, 6.0F, -2.5F);
        lower.addChild(belt_r1);
        setRotationAngle(belt_r1, 0.0F, 0.0F, 0.2182F);
        belt_r1.setTextureOffset(50, 0).addCuboid(-5.5F, -3.0F, 0.0F, 5.0F, 1.0F, 5.0F, 0.1F, false);
        belt_r1.setTextureOffset(38, 30).addCuboid(-5.0F, -3.0F, 0.0F, 5.0F, 3.0F, 5.0F, 0.001F, false);

        belt_r2 = new ModelPart(this);
        belt_r2.setPivot(0.0F, 6.0F, -2.5F);
        lower.addChild(belt_r2);
        setRotationAngle(belt_r2, 0.0F, 0.0F, -0.2182F);
        belt_r2.setTextureOffset(0, 50).addCuboid(0.5F, -3.0F, 0.0F, 5.0F, 1.0F, 5.0F, 0.101F, false);
        belt_r2.setTextureOffset(49, 7).addCuboid(0.0F, -3.0F, 0.0F, 5.0F, 3.0F, 5.0F, 0.0F, false);

        right = new ModelPart(this);
        right.setPivot(-2.25F, 5.0F, 0.0F);
        lower.addChild(right);
        setRotationAngle(right, -0.5672F, 0.2618F, 0.1745F);
        right.setTextureOffset(30, 0).addCuboid(-2.75F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

        rightUpper_r1 = new ModelPart(this);
        rightUpper_r1.setPivot(-0.25F, 7.5F, -1.5F);
        right.addChild(rightUpper_r1);
        setRotationAngle(rightUpper_r1, -0.6545F, 0.0F, 0.0F);
        rightUpper_r1.setTextureOffset(0, 4).addCuboid(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        rightLower = new ModelPart(this);
        rightLower.setPivot(-0.25F, 6.5F, 0.0F);
        right.addChild(rightLower);
        setRotationAngle(rightLower, 0.7418F, 0.0F, 0.0F);
        rightLower.setTextureOffset(19, 21).addCuboid(-2.5F, -1.5F, -1.5F, 5.0F, 9.0F, 5.0F, -0.2F, false);

        left = new ModelPart(this);
        left.setPivot(2.0F, 5.0F, 0.0F);
        lower.addChild(left);
        setRotationAngle(left, -0.2182F, -0.1745F, -0.3927F);
        left.setTextureOffset(34, 12).addCuboid(-2.0F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

        leftUpper_r1 = new ModelPart(this);
        leftUpper_r1.setPivot(0.5F, 7.5F, -1.5F);
        left.addChild(leftUpper_r1);
        setRotationAngle(leftUpper_r1, -0.6545F, 0.0F, 0.0F);
        leftUpper_r1.setTextureOffset(0, 0).addCuboid(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        leftLower = new ModelPart(this);
        leftLower.setPivot(0.5F, 5.5F, 0.0F);
        left.addChild(leftLower);


        leftLower_r1 = new ModelPart(this);
        leftLower_r1.setPivot(0.0F, 0.0F, 0.0F);
        leftLower.addChild(leftLower_r1);
        setRotationAngle(leftLower_r1, 0.6109F, 0.0F, 0.0F);
        leftLower_r1.setTextureOffset(0, 30).addCuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, -0.2F, false);

        upper = new ModelPart(this);
        upper.setPivot(0.0F, 5.0F, 0.0F);
        body.addChild(upper);


        leftArm = new ModelPart(this);
        leftArm.setPivot(4.0F, -4.0F, 0.0F);
        upper.addChild(leftArm);
        setRotationAngle(leftArm, -0.5672F, 0.0F, 0.1309F);
        leftArm.setTextureOffset(49, 46).addCuboid(0.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);
        leftArm.setTextureOffset(16, 55).addCuboid(3.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
        leftArm.setTextureOffset(2, 57).addCuboid(0.5F, -2.5F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);

        arm = new ModelPart(this);
        arm.setPivot(2.0F, 2.0F, 0.0F);
        leftArm.addChild(arm);
        setRotationAngle(arm, 0.0F, 1.5272F, 0.0F);
        arm.setTextureOffset(54, 34).addCuboid(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

        hand = new ModelPart(this);
        hand.setPivot(-6.0F, 1.0F, 0.0F);
        arm.addChild(hand);


        hand_r1 = new ModelPart(this);
        hand_r1.setPivot(6.0F, 3.0F, 0.0F);
        hand.addChild(hand_r1);
        setRotationAngle(hand_r1, -1.0908F, 0.0F, 0.0F);
        hand_r1.setTextureOffset(17, 67).addCuboid(-2.0F, -2.5F, -2.0F, 4.0F, 1.0F, 4.0F, -0.2F, false);
        hand_r1.setTextureOffset(16, 43).addCuboid(-2.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        rightArm = new ModelPart(this);
        rightArm.setPivot(-4.0F, -4.0F, 0.0F);
        upper.addChild(rightArm);
        setRotationAngle(rightArm, -1.3963F, 0.3054F, 0.0F);
        rightArm.setTextureOffset(49, 19).addCuboid(-4.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);
        rightArm.setTextureOffset(42, 51).addCuboid(-4.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
        rightArm.setTextureOffset(2, 57).addCuboid(-3.5F, -2.5F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);

        arm2 = new ModelPart(this);
        arm2.setPivot(-2.0F, 2.0F, 0.0F);
        rightArm.addChild(arm2);
        setRotationAngle(arm2, 0.0F, -1.0908F, 0.0F);
        arm2.setTextureOffset(28, 51).addCuboid(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

        hand2 = new ModelPart(this);
        hand2.setPivot(0.0F, 4.75F, 0.0F);
        arm2.addChild(hand2);
        setRotationAngle(hand2, -0.6981F, 0.0F, 0.0F);


        hand_r2 = new ModelPart(this);
        hand_r2.setPivot(0.0F, -0.75F, 0.0F);
        hand2.addChild(hand_r2);
        setRotationAngle(hand_r2, -0.3927F, 0.0F, 0.0F);
        hand_r2.setTextureOffset(17, 67).addCuboid(-2.0F, -1.5F, -2.0F, 4.0F, 1.0F, 4.0F, -0.2F, false);

        hand_r3 = new ModelPart(this);
        hand_r3.setPivot(0.0F, -0.75F, 0.0F);
        hand2.addChild(hand_r3);
        setRotationAngle(hand_r3, -0.3927F, 0.0F, -0.0436F);
        hand_r3.setTextureOffset(38, 39).addCuboid(-2.0F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        punch = new ModelPart(this);
        punch.setPivot(0.0F, 24.0F, 0.0F);


        leftPunch = new ModelPart(this);
        leftPunch.setPivot(1.0F, -27.0F, 0.0F);
        punch.addChild(leftPunch);


        hand3 = new ModelPart(this);
        hand3.setPivot(-6.0F, 5.75F, 0.0F);
        leftPunch.addChild(hand3);
        setRotationAngle(hand3, -1.5708F, 0.0F, 0.0F);
        hand3.setTextureOffset(38, 39).addCuboid(-12.0F, -4.75F, -11.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        hand4 = new ModelPart(this);
        hand4.setPivot(-6.0F, 5.75F, 0.0F);
        leftPunch.addChild(hand4);
        setRotationAngle(hand4, -1.5708F, 0.0F, 0.0F);
        hand4.setTextureOffset(38, 39).addCuboid(-16.0F, -1.75F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        hand5 = new ModelPart(this);
        hand5.setPivot(-6.0F, 5.75F, 0.0F);
        leftPunch.addChild(hand5);
        setRotationAngle(hand5, -1.5708F, 0.0F, 0.0F);
        hand5.setTextureOffset(38, 39).addCuboid(-18.0F, 0.25F, -8.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        hand6 = new ModelPart(this);
        hand6.setPivot(-6.0F, 5.75F, 0.0F);
        leftPunch.addChild(hand6);
        setRotationAngle(hand6, -1.5708F, 0.0F, 0.0F);
        hand6.setTextureOffset(38, 39).addCuboid(-8.0F, 2.25F, -4.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        hand7 = new ModelPart(this);
        hand7.setPivot(-6.0F, 5.75F, 0.0F);
        leftPunch.addChild(hand7);
        setRotationAngle(hand7, -1.5708F, 0.0F, 0.0F);
        hand7.setTextureOffset(38, 39).addCuboid(-10.0F, -4.75F, 0.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        rightPunch = new ModelPart(this);
        rightPunch.setPivot(-1.0F, -27.0F, 0.0F);
        punch.addChild(rightPunch);


        hand8 = new ModelPart(this);
        hand8.setPivot(6.0F, 5.75F, 0.0F);
        rightPunch.addChild(hand8);
        setRotationAngle(hand8, -1.5708F, 0.0F, 0.0F);
        hand8.setTextureOffset(38, 39).addCuboid(8.0F, -4.75F, -11.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

        hand9 = new ModelPart(this);
        hand9.setPivot(6.0F, 5.75F, 0.0F);
        rightPunch.addChild(hand9);
        setRotationAngle(hand9, -1.5708F, 0.0F, 0.0F);
        hand9.setTextureOffset(38, 39).addCuboid(12.0F, -1.75F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

        hand10 = new ModelPart(this);
        hand10.setPivot(6.0F, 5.75F, 0.0F);
        rightPunch.addChild(hand10);
        setRotationAngle(hand10, -1.5708F, 0.0F, 0.0F);
        hand10.setTextureOffset(38, 39).addCuboid(14.0F, 0.25F, -8.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

        hand11 = new ModelPart(this);
        hand11.setPivot(6.0F, 5.75F, 0.0F);
        rightPunch.addChild(hand11);
        setRotationAngle(hand11, -1.5708F, 0.0F, 0.0F);
        hand11.setTextureOffset(38, 39).addCuboid(4.0F, 2.25F, -4.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

        hand12 = new ModelPart(this);
        hand12.setPivot(6.0F, 5.75F, 0.0F);
        rightPunch.addChild(hand12);
        setRotationAngle(hand12, -1.5708F, 0.0F, 0.0F);
        hand12.setTextureOffset(38, 39).addCuboid(6.0F, -4.75F, 0.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

        punchBody = new ModelPart(this);
        punchBody.setPivot(0.0F, -5.0F, 0.0F);
        setRotationAngle(punchBody, 0.0F, -0.0436F, 0.0F);
        punchBody.setTextureOffset(0, 15).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F, 0.0F, false);
        punchBody.setTextureOffset(0, 44).addCuboid(-3.5F, 0.5F, -2.5F, 7.0F, 4.0F, 1.0F, 0.0F, false);
        punchBody.setTextureOffset(22, 5).addCuboid(-1.5F, 4.5F, -2.25F, 3.0F, 2.0F, 1.0F, 0.0F, false);

        lower2 = new ModelPart(this);
        lower2.setPivot(0.0F, 7.0F, 0.0F);
        punchBody.addChild(lower2);
        setRotationAngle(lower2, 0.1309F, 0.0F, 0.0F);
        lower2.setTextureOffset(20, 35).addCuboid(-3.5F, 0.0F, -2.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);

        belt_r3 = new ModelPart(this);
        belt_r3.setPivot(0.0F, 6.0F, -2.5F);
        lower2.addChild(belt_r3);
        setRotationAngle(belt_r3, 0.0F, 0.0F, 0.2182F);
        belt_r3.setTextureOffset(50, 0).addCuboid(-5.5F, -3.0F, 0.0F, 5.0F, 1.0F, 5.0F, 0.1F, false);
        belt_r3.setTextureOffset(38, 30).addCuboid(-5.0F, -3.0F, 0.0F, 5.0F, 3.0F, 5.0F, 0.001F, false);

        belt_r4 = new ModelPart(this);
        belt_r4.setPivot(0.0F, 6.0F, -2.5F);
        lower2.addChild(belt_r4);
        setRotationAngle(belt_r4, 0.0F, 0.0F, -0.2182F);
        belt_r4.setTextureOffset(0, 50).addCuboid(0.5F, -3.0F, 0.0F, 5.0F, 1.0F, 5.0F, 0.101F, false);
        belt_r4.setTextureOffset(49, 7).addCuboid(0.0F, -3.0F, 0.0F, 5.0F, 3.0F, 5.0F, 0.0F, false);

        right2 = new ModelPart(this);
        right2.setPivot(-2.25F, 5.0F, 0.0F);
        lower2.addChild(right2);
        setRotationAngle(right2, -0.5672F, 0.2618F, 0.1745F);
        right2.setTextureOffset(30, 0).addCuboid(-2.75F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

        rightUpper_r2 = new ModelPart(this);
        rightUpper_r2.setPivot(-0.25F, 7.5F, -1.5F);
        right2.addChild(rightUpper_r2);
        setRotationAngle(rightUpper_r2, -0.6545F, 0.0F, 0.0F);
        rightUpper_r2.setTextureOffset(0, 4).addCuboid(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        rightLower2 = new ModelPart(this);
        rightLower2.setPivot(-0.25F, 6.5F, 0.0F);
        right2.addChild(rightLower2);
        setRotationAngle(rightLower2, 0.7418F, 0.0F, 0.0F);
        rightLower2.setTextureOffset(19, 21).addCuboid(-2.5F, -1.5F, -1.5F, 5.0F, 9.0F, 5.0F, -0.2F, false);

        left2 = new ModelPart(this);
        left2.setPivot(2.0F, 5.0F, 0.0F);
        lower2.addChild(left2);
        setRotationAngle(left2, -0.2182F, -0.1745F, -0.3927F);
        left2.setTextureOffset(34, 12).addCuboid(-2.0F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

        leftUpper_r2 = new ModelPart(this);
        leftUpper_r2.setPivot(0.5F, 7.5F, -1.5F);
        left2.addChild(leftUpper_r2);
        setRotationAngle(leftUpper_r2, -0.6545F, 0.0F, 0.0F);
        leftUpper_r2.setTextureOffset(0, 0).addCuboid(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        leftLower2 = new ModelPart(this);
        leftLower2.setPivot(0.5F, 5.5F, 0.0F);
        left2.addChild(leftLower2);


        leftLower_r2 = new ModelPart(this);
        leftLower_r2.setPivot(0.0F, 0.0F, 0.0F);
        leftLower2.addChild(leftLower_r2);
        setRotationAngle(leftLower_r2, 0.6109F, 0.0F, 0.0F);
        leftLower_r2.setTextureOffset(0, 30).addCuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, -0.2F, false);

        upper2 = new ModelPart(this);
        upper2.setPivot(0.0F, 5.0F, 0.0F);
        punchBody.addChild(upper2);


        leftArm2 = new ModelPart(this);
        leftArm2.setPivot(4.0F, -4.0F, 0.0F);
        upper2.addChild(leftArm2);
        setRotationAngle(leftArm2, -1.0472F, 0.0F, 0.1309F);
        leftArm2.setTextureOffset(49, 46).addCuboid(0.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);
        leftArm2.setTextureOffset(16, 55).addCuboid(3.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);

        rightArm2 = new ModelPart(this);
        rightArm2.setPivot(-4.0F, -4.0F, 0.0F);
        upper2.addChild(rightArm2);
        setRotationAngle(rightArm2, -1.3963F, 0.3054F, 0.0F);
        rightArm2.setTextureOffset(49, 19).addCuboid(-4.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);
        rightArm2.setTextureOffset(42, 51).addCuboid(-4.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
    }
    @Override
    public void setAngles(LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch){
        this.yOffset = (double) MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;
        this.head.pitch = headPitch * 0.017453292F;
        this.head.yaw = headYaw * 0.017453292F;
    }
    public void setAttackAngles(LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch){
        float power = 0.5F;
        float speed = 3.0F;
        this.yOffset = (double)MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;
        this.head.pitch = headPitch * 0.017453292F;
        this.head.yaw = headYaw * 0.017453292F;
        this.hand3.yaw = MathHelper.cos(speed * animationProgress) * 1.2F * power;
        this.hand4.yaw = MathHelper.cos(speed * animationProgress + 1.0471976F) * 1.4F * power;
        this.hand5.yaw = MathHelper.cos(speed * animationProgress + (float)2.0943951023931953D) * 1.6F * power;
        this.hand6.yaw = MathHelper.cos(speed * animationProgress + (float)2.6179938779914944D) * 1.3F * power;
        this.hand7.yaw = MathHelper.cos(speed * animationProgress + (float)3.141592653589793D) * 1.7F * power;
        this.hand8.yaw = MathHelper.cos(speed * animationProgress + (float)3.665191429188092D) * 1.2F * power;
        this.hand9.yaw = MathHelper.cos(speed * animationProgress + (float)6.283185307179586D) * 1.1F * power;
        this.hand10.yaw = MathHelper.cos(speed * animationProgress + (float)8.377580409572781D) * 1.4F * power;
        this.hand11.yaw = MathHelper.cos(speed * animationProgress + (float)10.471975511965978D) * 1.5F * power;
        this.hand12.yaw = MathHelper.cos(speed * animationProgress + (float)1.5707963267948966D) * 1.6F * power;
        float r = (float)Math.random();
        float offysin = MathHelper.sin(r * speed * animationProgress) * power - 0.25F;
        float offycos = MathHelper.cos(r * speed * animationProgress) * power - 0.25F;
        this.hand3.pivotZ = offysin;
        this.hand4.pivotZ = offycos;
        this.hand5.pivotZ = offysin;
        this.hand6.pivotZ = offycos;
        this.hand7.pivotZ = offysin;
        this.hand8.pivotZ = offycos;
        this.hand9.pivotZ = offysin;
        this.hand10.pivotZ = offycos;
        this.hand11.pivotZ = offysin;
        this.hand12.pivotZ = offycos;
    }
    @Override
    public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        matrixStack.translate(-0.45D, this.yOffset - 0.2D, 0.45D);
        this.head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void renderAttack(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        matrixStack.translate(0.0D, this.yOffset - 0.2D, -0.75D);
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        punchBody.render(matrixStack, buffer, packedLight, packedOverlay);
        matrixStack.translate(0.0D, -this.yOffset, 0.0D);
        punch.render(matrixStack, buffer, packedLight, packedOverlay);
        matrixStack.translate(0.0D, 0.2D, 0.75D);
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
