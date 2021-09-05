package mrsterner.phantomblood.client.model.stand;

import net.minecraft.client.model.*;
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
    private final ModelPart collar;
    private final ModelPart collarRight;
    private final ModelPart bone3;
    private final ModelPart collarLeft;
    private final ModelPart bone7;
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
    private final ModelPart collar2;
    private final ModelPart torso_r1;
    private final ModelPart torso_r2;
    private final ModelPart collarRight2;
    private final ModelPart bone4;
    private final ModelPart collarLeft2;
    private final ModelPart bone5;
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
    public KingCrimsonModel(ModelPart root) {
        this.head = root.getChild("head");
        this.bone = this.head.getChild("bone");
        this.bone2 = this.head.getChild("bone2");
        this.head_r2 = this.head.getChild("head_r2");
        this.head_r1 = this.head.getChild("head_r1");
        this.body = root.getChild("body");
        this.upper = this.body.getChild("upper");
        this.rightArm = this.upper.getChild("rightArm");
        this.arm2 = this.rightArm.getChild("arm2");
        this.hand2 = this.arm2.getChild("hand2");
        this.hand_r3 = this.hand2.getChild("hand_r3");
        this.hand_r2 = this.hand2.getChild("hand_r2");
        this.leftArm = this.upper.getChild("leftArm");
        this.arm = this.leftArm.getChild("arm");
        this.hand = this.arm.getChild("hand");
        this.hand_r1 = this.hand.getChild("hand_r1");
        this.lower = this.body.getChild("lower");
        this.left = this.lower.getChild("left");
        this.leftLower = this.left.getChild("leftLower");
        this.leftLower_r1 = this.leftLower.getChild("leftLower_r1");
        this.leftUpper_r1 = this.left.getChild("leftUpper_r1");
        this.right = this.lower.getChild("right");
        this.rightLower = this.right.getChild("rightLower");
        this.rightUpper_r1 = this.right.getChild("rightUpper_r1");
        this.belt_r2 = this.lower.getChild("belt_r2");
        this.belt_r1 = this.lower.getChild("belt_r1");
        this.collar = this.body.getChild("collar");
        this.collarLeft = this.collar.getChild("collarLeft");
        this.bone7 = this.collarLeft.getChild("bone7");
        this.collarRight = this.collar.getChild("collarRight");
        this.bone3 = this.collarRight.getChild("bone3");
        this.punch = root.getChild("punch");
        this.rightPunch = this.punch.getChild("rightPunch");
        this.hand12 = this.rightPunch.getChild("hand12");
        this.hand11 = this.rightPunch.getChild("hand11");
        this.hand10 = this.rightPunch.getChild("hand10");
        this.hand9 = this.rightPunch.getChild("hand9");
        this.hand8 = this.rightPunch.getChild("hand8");
        this.leftPunch = this.punch.getChild("leftPunch");
        this.hand7 = this.leftPunch.getChild("hand7");
        this.hand6 = this.leftPunch.getChild("hand6");
        this.hand5 = this.leftPunch.getChild("hand5");
        this.hand4 = this.leftPunch.getChild("hand4");
        this.hand3 = this.leftPunch.getChild("hand3");
        this.punchBody = root.getChild("punchBody");
        this.upper2 = this.punchBody.getChild("upper2");
        this.rightArm2 = this.upper2.getChild("rightArm2");
        this.leftArm2 = this.upper2.getChild("leftArm2");
        this.lower2 = this.punchBody.getChild("lower2");
        this.left2 = this.lower2.getChild("left2");
        this.leftLower2 = this.left2.getChild("leftLower2");
        this.leftLower_r2 = this.leftLower2.getChild("leftLower_r2");
        this.leftUpper_r2 = this.left2.getChild("leftUpper_r2");
        this.right2 = this.lower2.getChild("right2");
        this.rightLower2 = this.right2.getChild("rightLower2");
        this.rightUpper_r2 = this.right2.getChild("rightUpper_r2");
        this.belt_r4 = this.lower2.getChild("belt_r4");
        this.belt_r3 = this.lower2.getChild("belt_r3");
        this.collar2 = this.punchBody.getChild("collar2");
        this.collarLeft2 = this.collar2.getChild("collarLeft2");
        this.bone5 = this.collarLeft2.getChild("bone5");
        this.collarRight2 = this.collar2.getChild("collarRight2");
        this.bone4 = this.collarRight2.getChild("bone4");
        this.torso_r2 = this.collar2.getChild("torso_r2");
        this.torso_r1 = this.collar2.getChild("torso_r1");

        setRotationAngle(head_r1, 0.0F, 0.0F, 0.0436F);
        setRotationAngle(head_r2, 0.0F, 0.0F, -0.0436F);
        setRotationAngle(bone2, -0.1745F, 0.0F, 0.0F);
        setRotationAngle(bone, 0.1309F, 0.0F, 0.0F);

        setRotationAngle(body, 0.0F, -0.4363F, 0.0F);
        setRotationAngle(collarRight, 0.0F, 0.3927F, 0.0F);
        setRotationAngle(bone3, 0.0F, -0.7854F, 0.0F);
        setRotationAngle(collarLeft, 0.0F, -0.3927F, 0.0F);
        setRotationAngle(bone7, 0.0F, 0.7854F, 0.0F);

        setRotationAngle(lower, 0.1309F, 0.0F, 0.0F);
        setRotationAngle(belt_r1, 0.0F, 0.0F, 0.2182F);
        setRotationAngle(belt_r2, 0.0F, 0.0F, -0.2182F);
        setRotationAngle(right, -0.5672F, 0.2618F, 0.1745F);
        setRotationAngle(rightUpper_r1, -0.6545F, 0.0F, 0.0F);
        setRotationAngle(rightLower, 0.7418F, 0.0F, 0.0F);
        setRotationAngle(left, -0.2182F, -0.1745F, -0.3927F);
        setRotationAngle(leftUpper_r1, -0.6545F, 0.0F, 0.0F);

        setRotationAngle(leftLower_r1, 0.6109F, 0.0F, 0.0F);

        setRotationAngle(leftArm, -0.5672F, 0.0F, 0.1309F);
        setRotationAngle(arm, 0.0F, 1.5272F, 0.0F);

        setRotationAngle(hand_r1, -1.0908F, 0.0F, 0.0F);
        setRotationAngle(rightArm, -1.3963F, 0.3054F, 0.0F);
        setRotationAngle(arm2, 0.0F, -1.0908F, 0.0F);
        setRotationAngle(hand2, -0.6981F, 0.0F, 0.0F);

        setRotationAngle(hand_r2, -0.3927F, 0.0F, 0.0F);
        setRotationAngle(hand_r3, -0.3927F, 0.0F, -0.0436F);


        setRotationAngle(hand3, -1.5708F, 0.0F, 0.0F);
        setRotationAngle(hand4, -1.5708F, 0.0F, 0.0F);
        setRotationAngle(hand5, -1.5708F, 0.0F, 0.0F);
        setRotationAngle(hand6, -1.5708F, 0.0F, 0.0F);
        setRotationAngle(hand7, -1.5708F, 0.0F, 0.0F);

        setRotationAngle(hand8, -1.5708F, 0.0F, 0.0F);
        setRotationAngle(hand9, -1.5708F, 0.0F, 0.0F);
        setRotationAngle(hand10, -1.5708F, 0.0F, 0.0F);
        setRotationAngle(hand11, -1.5708F, 0.0F, 0.0F);
        setRotationAngle(hand12, -1.5708F, 0.0F, 0.0F);
        setRotationAngle(punchBody, 0.0F, -0.0436F, 0.0F);

        setRotationAngle(torso_r1, -0.5236F, 0.0F, 0.0F);
        setRotationAngle(torso_r2, 0.0F, -1.5708F, 0.0F);
        setRotationAngle(collarRight2, 0.0F, 0.3927F, 0.0F);
        setRotationAngle(bone4, 0.0F, -0.7854F, 0.0F);
        setRotationAngle(collarLeft2, 0.0F, -0.3927F, 0.0F);
        setRotationAngle(bone5, 0.0F, 0.7854F, 0.0F);
        setRotationAngle(lower2, 0.1309F, 0.0F, 0.0F);
        setRotationAngle(belt_r3, 0.0F, 0.0F, 0.2182F);
        setRotationAngle(belt_r4, 0.0F, 0.0F, -0.2182F);
        setRotationAngle(right2, -0.5672F, 0.2618F, 0.1745F);
        setRotationAngle(rightUpper_r2, -0.6545F, 0.0F, 0.0F);
        setRotationAngle(rightLower2, 0.7418F, 0.0F, 0.0F);
        setRotationAngle(left2, -0.2182F, -0.1745F, -0.3927F);
        setRotationAngle(leftUpper_r2, -0.6545F, 0.0F, 0.0F);

        setRotationAngle(leftLower_r2, 0.6109F, 0.0F, 0.0F);

        setRotationAngle(leftArm2, -1.0472F, 0.0F, 0.1309F);
        setRotationAngle(rightArm2, -1.3963F, 0.3054F, 0.0F);
    }


    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData modelPartData1 = modelPartData.addChild("head", ModelPartBuilder.create().uv(1,1).cuboid(-3.5F, -7.0F, -4.0F, 7.0F, 7.0F, 7.0F), ModelTransform.pivot(0.0F,-5.0F,0.0F));
        modelPartData1.addChild("head_r1", ModelPartBuilder.create().uv(1,1).cuboid(-1.0F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, true), ModelTransform.pivot(-1.5F,-4.5F,-3.7F));
        modelPartData1.addChild("head_r2", ModelPartBuilder.create().uv(1,1).cuboid(-1.0F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F), ModelTransform.pivot(1.5F,-4.5F,-3.7F));
        modelPartData1.addChild("bone2", ModelPartBuilder.create().uv(24,15).cuboid(-1.5F, -2.5F, -2.0F, 3.0F, 3.0F, 2.0F).uv(22,0).cuboid(-1.5F, -2.5F, -1.0F, 3.0F, 3.0F, 2.0F, new Dilation(0.2F)), ModelTransform.pivot(0.0F,-5.0F,-3.5F));
        modelPartData1.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-5.5F,-4.0F));
        ModelPartData modelPartData2 = modelPartData.addChild("body", ModelPartBuilder.create().uv(0,15).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F).uv(0,44).cuboid(-3.5F, 0.5F, -2.5F, 7.0F, 4.0F, 1.0F).uv(22,5).cuboid(-1.5F, 4.5F, -2.25F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(0.0F,-5.0F,0.0F));
        ModelPartData modelPartData3 = modelPartData2.addChild("collar", ModelPartBuilder.create().uv(19,74).cuboid(-3.5F, -4.5F, 3.0F, 7.0F, 3.0F, 1.0F, new Dilation(0.001F)), ModelTransform.pivot(0.0F,3.5F,0.0F));
        ModelPartData modelPartData4 = modelPartData3.addChild("collarRight", ModelPartBuilder.create().uv(28,62).cuboid(0.0F, 0.0F, -4.0F, 1.0F, 3.0F, 4.0F, true), ModelTransform.pivot(-3.5F,-4.5F,4.0F));
        modelPartData4.addChild("bone3", ModelPartBuilder.create().uv(28,62).cuboid(0.0F, 0.0F, -4.0F, 1.0F, 3.0F, 4.0F, true), ModelTransform.pivot(0.0F,0.0F,-4.0F));
        ModelPartData modelPartData5 = modelPartData3.addChild("collarLeft", ModelPartBuilder.create().uv(0,62).cuboid(-1.0F, 0.0F, -4.0F, 1.0F, 3.0F, 4.0F, true), ModelTransform.pivot(3.5F,-4.5F,4.0F));
        modelPartData5.addChild("bone7", ModelPartBuilder.create().uv(37,65).cuboid(-1.0F, 0.0F, -4.0F, 1.0F, 3.0F, 4.0F, true), ModelTransform.pivot(0.0F,0.0F,-4.0F));
        ModelPartData modelPartData6 = modelPartData2.addChild("lower", ModelPartBuilder.create().uv(20,35).cuboid(-3.5F, 0.0F, -2.0F, 7.0F, 4.0F, 4.0F), ModelTransform.pivot(0.0F,7.0F,0.0F));
        modelPartData6.addChild("belt_r1", ModelPartBuilder.create().uv(50,0).cuboid(-5.5F, -3.0F, 0.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.1F)).uv(38,30).cuboid(-5.0F, -3.0F, 0.0F, 5.0F, 3.0F, 5.0F, new Dilation(0.001F)), ModelTransform.pivot(0.0F,6.0F,-2.5F));
        modelPartData6.addChild("belt_r2", ModelPartBuilder.create().uv(0,50).cuboid(0.5F, -3.0F, 0.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.101F)).uv(49,7).cuboid(0.0F, -3.0F, 0.0F, 5.0F, 3.0F, 5.0F), ModelTransform.pivot(0.0F,6.0F,-2.5F));
        ModelPartData modelPartData7 = modelPartData6.addChild("right", ModelPartBuilder.create().uv(30,0).cuboid(-2.75F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F), ModelTransform.pivot(-2.25F,5.0F,0.0F));
        modelPartData7.addChild("rightUpper_r1", ModelPartBuilder.create().uv(0,4).cuboid(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 2.0F), ModelTransform.pivot(-0.25F,7.5F,-1.5F));
        modelPartData7.addChild("rightLower", ModelPartBuilder.create().uv(19,21).cuboid(-2.5F, -1.5F, -1.5F, 5.0F, 9.0F, 5.0F, new Dilation(-0.2F)), ModelTransform.pivot(-0.25F,6.5F,0.0F));
        ModelPartData modelPartData8 = modelPartData6.addChild("left", ModelPartBuilder.create().uv(34,12).cuboid(-2.0F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F), ModelTransform.pivot(2.0F,5.0F,0.0F));
        modelPartData8.addChild("leftUpper_r1", ModelPartBuilder.create().uv(0,0).cuboid(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 2.0F), ModelTransform.pivot(0.5F,7.5F,-1.5F));
        ModelPartData modelPartData9 = modelPartData8.addChild("leftLower", ModelPartBuilder.create(), ModelTransform.pivot(0.5F,5.5F,0.0F));
        modelPartData9.addChild("leftLower_r1", ModelPartBuilder.create().uv(0,30).cuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, new Dilation(-0.2F)), ModelTransform.pivot(0.0F,0.0F,0.0F));
        ModelPartData modelPartData10 = modelPartData2.addChild("upper", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,5.0F,0.0F));
        ModelPartData modelPartData11 = modelPartData10.addChild("leftArm", ModelPartBuilder.create().uv(49,46).cuboid(0.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F).uv(16,55).cuboid(3.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F).uv(2,57).cuboid(0.5F, -2.5F, -2.0F, 3.0F, 1.0F, 4.0F), ModelTransform.pivot(4.0F,-4.0F,0.0F));
        ModelPartData modelPartData12 = modelPartData11.addChild("arm", ModelPartBuilder.create().uv(54,34).cuboid(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F), ModelTransform.pivot(2.0F,2.0F,0.0F));
        ModelPartData modelPartData13 = modelPartData12.addChild("hand", ModelPartBuilder.create(), ModelTransform.pivot(-6.0F,1.0F,0.0F));
        modelPartData13.addChild("hand_r1", ModelPartBuilder.create().uv(17,67).cuboid(-2.0F, -2.5F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(-0.2F)).uv(16,43).cuboid(-2.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(6.0F,3.0F,0.0F));
        ModelPartData modelPartData14 = modelPartData10.addChild("rightArm", ModelPartBuilder.create().uv(49,19).cuboid(-4.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F).uv(42,51).cuboid(-4.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F).uv(2,57).cuboid(-3.5F, -2.5F, -2.0F, 3.0F, 1.0F, 4.0F), ModelTransform.pivot(-4.0F,-4.0F,0.0F));
        ModelPartData modelPartData15 = modelPartData14.addChild("arm2", ModelPartBuilder.create().uv(28,51).cuboid(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F), ModelTransform.pivot(-2.0F,2.0F,0.0F));
        ModelPartData modelPartData16 = modelPartData15.addChild("hand2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,4.75F,0.0F));
        modelPartData16.addChild("hand_r2", ModelPartBuilder.create().uv(17,67).cuboid(-2.0F, -1.5F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(-0.2F)), ModelTransform.pivot(0.0F,-0.75F,0.0F));
        modelPartData16.addChild("hand_r3", ModelPartBuilder.create().uv(38,39).cuboid(-2.0F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(0.0F,-0.75F,0.0F));
        ModelPartData modelPartData17 = modelPartData.addChild("punch", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,24.0F,0.0F));
        ModelPartData modelPartData18 = modelPartData17.addChild("leftPunch", ModelPartBuilder.create(), ModelTransform.pivot(1.0F,-27.0F,0.0F));
        modelPartData18.addChild("hand3", ModelPartBuilder.create().uv(38,39).cuboid(-12.0F, -4.75F, -11.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(-6.0F,5.75F,0.0F));
        modelPartData18.addChild("hand4", ModelPartBuilder.create().uv(38,39).cuboid(-16.0F, -1.75F, -2.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(-6.0F,5.75F,0.0F));
        modelPartData18.addChild("hand5", ModelPartBuilder.create().uv(38,39).cuboid(-18.0F, 0.25F, -8.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(-6.0F,5.75F,0.0F));
        modelPartData18.addChild("hand6", ModelPartBuilder.create().uv(38,39).cuboid(-8.0F, 2.25F, -4.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(-6.0F,5.75F,0.0F));
        modelPartData18.addChild("hand7", ModelPartBuilder.create().uv(38,39).cuboid(-10.0F, -4.75F, 0.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(-6.0F,5.75F,0.0F));
        ModelPartData modelPartData19 = modelPartData17.addChild("rightPunch", ModelPartBuilder.create(), ModelTransform.pivot(-1.0F,-27.0F,0.0F));
        modelPartData19.addChild("hand8", ModelPartBuilder.create().uv(38,39).cuboid(8.0F, -4.75F, -11.0F, 4.0F, 8.0F, 4.0F, true), ModelTransform.pivot(6.0F,5.75F,0.0F));
        modelPartData19.addChild("hand9", ModelPartBuilder.create().uv(38,39).cuboid(12.0F, -1.75F, -2.0F, 4.0F, 8.0F, 4.0F, true), ModelTransform.pivot(6.0F,5.75F,0.0F));
        modelPartData19.addChild("hand10", ModelPartBuilder.create().uv(38,39).cuboid(14.0F, 0.25F, -8.0F, 4.0F, 8.0F, 4.0F, true), ModelTransform.pivot(6.0F,5.75F,0.0F));
        modelPartData19.addChild("hand11", ModelPartBuilder.create().uv(38,39).cuboid(4.0F, 2.25F, -4.0F, 4.0F, 8.0F, 4.0F, true), ModelTransform.pivot(6.0F,5.75F,0.0F));
        modelPartData19.addChild("hand12", ModelPartBuilder.create().uv(38,39).cuboid(6.0F, -4.75F, 0.0F, 4.0F, 8.0F, 4.0F, true), ModelTransform.pivot(6.0F,5.75F,0.0F));
        ModelPartData modelPartData20 = modelPartData.addChild("punchBody", ModelPartBuilder.create().uv(0,15).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F).uv(0,44).cuboid(-3.5F, 0.5F, -2.5F, 7.0F, 4.0F, 1.0F).uv(22,5).cuboid(-1.5F, 4.5F, -2.25F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(0.0F,-5.0F,0.0F));
        ModelPartData modelPartData21 = modelPartData20.addChild("collar2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,3.5F,0.0F));
        modelPartData21.addChild("torso_r1", ModelPartBuilder.create().uv(3,74).cuboid(-7.5F, -4.7321F, -2.0F, 7.0F, 3.0F, 1.0F, true), ModelTransform.pivot(4.0F,0.5F,2.0F));
        modelPartData21.addChild("torso_r2", ModelPartBuilder.create().uv(0,62).cuboid(3.0F, -3.5F, 1.5F, 1.0F, 3.0F, 7.0F, true), ModelTransform.pivot(5.0F,-3.0F,0.0F));
        ModelPartData modelPartData22 = modelPartData21.addChild("collarRight2", ModelPartBuilder.create().uv(28,62).cuboid(0.0F, -2.0F, -4.0F, 1.0F, 3.0F, 4.0F, true), ModelTransform.pivot(-3.5F,-4.5F,4.0F));
        modelPartData22.addChild("bone4", ModelPartBuilder.create().uv(28,62).cuboid(0.0F, -2.0F, -4.0F, 1.0F, 3.0F, 4.0F, true), ModelTransform.pivot(0.0F,0.0F,-4.0F));
        ModelPartData modelPartData23 = modelPartData21.addChild("collarLeft2", ModelPartBuilder.create().uv(0,62).cuboid(-1.0F, -2.0F, -4.0F, 1.0F, 3.0F, 4.0F, true), ModelTransform.pivot(3.5F,-4.5F,4.0F));
        modelPartData23.addChild("bone5", ModelPartBuilder.create().uv(0,62).cuboid(-1.0F, -2.0F, -4.0F, 1.0F, 3.0F, 4.0F, true), ModelTransform.pivot(0.0F,0.0F,-4.0F));
        ModelPartData modelPartData24 = modelPartData20.addChild("lower2", ModelPartBuilder.create().uv(20,35).cuboid(-3.5F, 0.0F, -2.0F, 7.0F, 4.0F, 4.0F), ModelTransform.pivot(0.0F,7.0F,0.0F));
        modelPartData24.addChild("belt_r3", ModelPartBuilder.create().uv(50,0).cuboid(-5.5F, -3.0F, 0.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.1F)).uv(38,30).cuboid(-5.0F, -3.0F, 0.0F, 5.0F, 3.0F, 5.0F, new Dilation(0.001F)), ModelTransform.pivot(0.0F,6.0F,-2.5F));
        modelPartData24.addChild("belt_r4", ModelPartBuilder.create().uv(0,50).cuboid(0.5F, -3.0F, 0.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.101F)).uv(49,7).cuboid(0.0F, -3.0F, 0.0F, 5.0F, 3.0F, 5.0F), ModelTransform.pivot(0.0F,6.0F,-2.5F));
        ModelPartData modelPartData25 = modelPartData24.addChild("right2", ModelPartBuilder.create().uv(30,0).cuboid(-2.75F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F), ModelTransform.pivot(-2.25F,5.0F,0.0F));
        modelPartData25.addChild("rightUpper_r2", ModelPartBuilder.create().uv(0,4).cuboid(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 2.0F), ModelTransform.pivot(-0.25F,7.5F,-1.5F));
        modelPartData25.addChild("rightLower2", ModelPartBuilder.create().uv(19,21).cuboid(-2.5F, -1.5F, -1.5F, 5.0F, 9.0F, 5.0F, new Dilation(-0.2F)), ModelTransform.pivot(-0.25F,6.5F,0.0F));
        ModelPartData modelPartData26 = modelPartData24.addChild("left2", ModelPartBuilder.create().uv(34,12).cuboid(-2.0F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F), ModelTransform.pivot(2.0F,5.0F,0.0F));
        modelPartData26.addChild("leftUpper_r2", ModelPartBuilder.create().uv(0,0).cuboid(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 2.0F), ModelTransform.pivot(0.5F,7.5F,-1.5F));
        ModelPartData modelPartData27 = modelPartData26.addChild("leftLower2", ModelPartBuilder.create(), ModelTransform.pivot(0.5F,5.5F,0.0F));
        modelPartData27.addChild("leftLower_r2", ModelPartBuilder.create().uv(0,30).cuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, new Dilation(-0.2F)), ModelTransform.pivot(0.0F,0.0F,0.0F));
        ModelPartData modelPartData28 = modelPartData20.addChild("upper2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,5.0F,0.0F));
        modelPartData28.addChild("leftArm2", ModelPartBuilder.create().uv(49,46).cuboid(0.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F).uv(16,55).cuboid(3.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F), ModelTransform.pivot(4.0F,-4.0F,0.0F));
        modelPartData28.addChild("rightArm2", ModelPartBuilder.create().uv(49,19).cuboid(-4.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F).uv(42,51).cuboid(-4.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F), ModelTransform.pivot(-4.0F,-4.0F,0.0F));
        return TexturedModelData.of(modelData,128,128);

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
