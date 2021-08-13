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
    public KingCrimsonModel(ModelPart root) {
        head               = root.getChild("body");
        head_r1            = root.getChild("body");
        head_r2            = root.getChild("body");
        bone2              = root.getChild("body");
        bone               = root.getChild("body");
        body               = root.getChild("body");
        collarRight        = root.getChild("body");
        torso_r1           = root.getChild("body");
        bone6              = root.getChild("body");
        collarLeft         = root.getChild("body");
        torso_r2           = root.getChild("body");
        bone3              = root.getChild("body");
        bone4              = root.getChild("body");
        torso_r3           = root.getChild("body");
        lower              = root.getChild("body");
        belt_r1            = root.getChild("body");
        belt_r2            = root.getChild("body");
        right              = root.getChild("body");
        rightUpper_r1      = root.getChild("body");
        rightLower         = root.getChild("body");
        left               = root.getChild("body");
        leftUpper_r1       = root.getChild("body");
        leftLower          = root.getChild("body");
        leftLower_r1       = root.getChild("body");
        upper              = root.getChild("body");
        leftArm            = root.getChild("body");
        arm                = root.getChild("body");
        hand               = root.getChild("body");
        hand_r1            = root.getChild("body");
        rightArm           = root.getChild("body");
        arm2               = root.getChild("body");
        hand2              = root.getChild("body");
        hand_r2            = root.getChild("body");
        hand_r3            = root.getChild("body");
        punch              = root.getChild("body");
        leftPunch          = root.getChild("body");
        hand3              = root.getChild("body");
        hand4              = root.getChild("body");
        hand5              = root.getChild("body");
        hand6              = root.getChild("body");
        hand7              = root.getChild("body");
        rightPunch         = root.getChild("body");
        hand8              = root.getChild("body");
        hand9              = root.getChild("body");
        hand10             = root.getChild("body");
        hand11             = root.getChild("body");
        hand12             = root.getChild("body");
        punchBody          = root.getChild("body");
        lower2             = root.getChild("body");
        belt_r3            = root.getChild("body");
        belt_r4            = root.getChild("body");
        right2             = root.getChild("body");
        rightUpper_r2      = root.getChild("body");
        rightLower2        = root.getChild("body");
        left2              = root.getChild("body");
        leftUpper_r2       = root.getChild("body");
        leftLower2         = root.getChild("body");
        leftLower_r2       = root.getChild("body");
        upper2             = root.getChild("body");
        leftArm2           = root.getChild("body");
        rightArm2          = root.getChild("body");
    }


    public static TexturedModelData getTexturedModelData() {
        ModelData data = new ModelData();
        ModelPartData root = data.getRoot();
        ModelPartData body = root.addChild("body",
                ModelPartBuilder.create()
                        .uv(0, 15).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F)
                        .uv(0, 44).cuboid(-3.5F, 0.5F, -2.5F, 7.0F, 4.0F, 1.0F)
                        .uv(22, 5).cuboid(-1.5F, 4.5F, -2.25F, 3.0F, 2.0F, 1.0F),
                ModelTransform.of(0.0F, -5.0F, 0.0F, 0.0F, -0.4363F, 0.0F));
        ModelPartData collarRight = body.addChild("collarRight",
                ModelPartBuilder.create(),
                ModelTransform.of(-5.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F));
        collarRight.addChild("torso_r1",
                ModelPartBuilder.create()
                        .uv(0, 62).cuboid(0.0F, -1.5F, -4.0F, 1.0F, 3.0F, 4.0F, new Dilation(0.001F, 0.001F, 0.001F)),
                ModelTransform.of(0.0F, -2.0F, 0.0F, 0.0F, -0.3927F, 0.0F));
        collarRight.addChild("bone6",
                ModelPartBuilder.create()
                        .uv(0, 62).cuboid(0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 4.0F),
                ModelTransform.of(0.0F, -2.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
        ModelPartData collarLeft = body.addChild("collarLeft",
                ModelPartBuilder.create(),
                ModelTransform.of(5.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F));
        collarLeft.addChild("torso_r2",
                ModelPartBuilder.create()
                        .uv(0, 62).mirrored(true).cuboid(-1.0F, -1.5F, -4.0F, 1.0F, 3.0F, 4.0F, new Dilation(0.001F, 0.001F, 0.001F)),
                ModelTransform.of(0.0F, -2.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
        ModelPartData bone3 = collarLeft.addChild("bone3",
                ModelPartBuilder.create()
                        .uv(0, 62).mirrored(true).cuboid(-1.0F, -1.5F, 0.0F, 1.0F, 3.0F, 4.0F),
                ModelTransform.of(0.0F, -2.0F, 0.0F, 0.0F, -0.3927F, 0.0F));
        ModelPartData bone4 = bone3.addChild("bone4",
                ModelPartBuilder.create()
                        .uv(0, 62).mirrored(true).cuboid(-1.0F, -1.5F, 0.0F, 1.0F, 3.0F, 7.0F, new Dilation(0.001F, 0.001F, 0.001F)),
                ModelTransform.of(0.0F, 0.0F, 4.0F, 0.0F, -1.1781F, 0.0F));
        bone4.addChild("torso_r3",
                ModelPartBuilder.create()
                        .uv(0, 62).mirrored(true).cuboid(-1.0F, 1.5F, 4.0F, 1.0F, 3.0F, 7.0F, new Dilation(0.001F, 0.001F, 0.001F)),
                ModelTransform.of(0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.5672F));
        ModelPartData lower = body.addChild("lower",
                ModelPartBuilder.create()
                        .uv(20, 35).cuboid(-3.5F, 0.0F, -2.0F, 7.0F, 4.0F, 4.0F),
                ModelTransform.of(0.0F, 7.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
        lower.addChild("belt_r1",
                ModelPartBuilder.create()
                        .uv(50, 0).cuboid(-5.5F, -3.0F, 0.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.1F, 0.1F, 0.1F))
                        .uv(38, 30).cuboid(-5.0F, -3.0F, 0.0F, 5.0F, 3.0F, 5.0F, new Dilation(0.001F, 0.001F, 0.001F)),
                ModelTransform.of(0.0F, 6.0F, -2.5F, 0.0F, 0.0F, 0.2182F));
        lower.addChild("belt_r2",
                ModelPartBuilder.create()
                        .uv(0, 50).cuboid(0.5F, -3.0F, 0.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.101F, 0.101F, 0.101F))
                        .uv(49, 7).cuboid(0.0F, -3.0F, 0.0F, 5.0F, 3.0F, 5.0F),
                ModelTransform.of(0.0F, 6.0F, -2.5F, 0.0F, 0.0F, -0.2182F));
        ModelPartData right = lower.addChild("right",
                ModelPartBuilder.create()
                        .uv(30, 0).cuboid(-2.75F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F),
                ModelTransform.of(-2.25F, 5.0F, 0.0F, -0.5672F, 0.2618F, 0.1745F));
        right.addChild("rightUpper_r1",
                ModelPartBuilder.create()
                        .uv(0, 4).cuboid(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 2.0F),
                ModelTransform.of(-0.25F, 7.5F, -1.5F, -0.6545F, 0.0F, 0.0F));
        right.addChild("rightLower",
                ModelPartBuilder.create()
                        .uv(19, 21).cuboid(-2.5F, -1.5F, -1.5F, 5.0F, 9.0F, 5.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
                ModelTransform.of(-0.25F, 6.5F, 0.0F, 0.7418F, 0.0F, 0.0F));
        ModelPartData left = lower.addChild("left",
                ModelPartBuilder.create()
                        .uv(34, 12).cuboid(-2.0F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F),
                ModelTransform.of(2.0F, 5.0F, 0.0F, -0.2182F, -0.1745F, -0.3927F));
        left.addChild("leftUpper_r1",
                ModelPartBuilder.create()
                        .cuboid(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 2.0F),
                ModelTransform.of(0.5F, 7.5F, -1.5F, -0.6545F, 0.0F, 0.0F));
        ModelPartData leftLower = left.addChild("leftLower",
                ModelPartBuilder.create(),
                ModelTransform.of(0.5F, 5.5F, 0.0F, 0.0F, 0.0F, 0.0F));
        leftLower.addChild("leftLower_r1",
                ModelPartBuilder.create()
                        .uv(0, 30).cuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
                ModelTransform.of(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
        ModelPartData upper = body.addChild("upper",
                ModelPartBuilder.create(),
                ModelTransform.of(0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F));
        ModelPartData leftArm = upper.addChild("leftArm",
                ModelPartBuilder.create()
                        .uv(49, 46).cuboid(0.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F)
                        .uv(16, 55).cuboid(3.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F)
                        .uv(2, 57).cuboid(0.5F, -2.5F, -2.0F, 3.0F, 1.0F, 4.0F),
                ModelTransform.of(4.0F, -4.0F, 0.0F, -0.5672F, 0.0F, 0.1309F));
        ModelPartData arm = leftArm.addChild("arm",
                ModelPartBuilder.create()
                        .uv(54, 34).cuboid(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F),
                ModelTransform.of(2.0F, 2.0F, 0.0F, 0.0F, 1.5272F, 0.0F));
        ModelPartData hand = arm.addChild("hand",
                ModelPartBuilder.create(),
                ModelTransform.of(-6.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F));
        hand.addChild("hand_r1",
                ModelPartBuilder.create()
                        .uv(17, 67).cuboid(-2.0F, -2.5F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(-0.2F, -0.2F, -0.2F))
                        .uv(16, 43).cuboid(-2.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F),
                ModelTransform.of(6.0F, 3.0F, 0.0F, -1.0908F, 0.0F, 0.0F));
        ModelPartData rightArm = upper.addChild("rightArm",
                ModelPartBuilder.create()
                        .uv(49, 19).cuboid(-4.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F)
                        .uv(42, 51).cuboid(-4.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F)
                        .uv(2, 57).cuboid(-3.5F, -2.5F, -2.0F, 3.0F, 1.0F, 4.0F),
                ModelTransform.of(-4.0F, -4.0F, 0.0F, -1.3963F, 0.3054F, 0.0F));
        ModelPartData arm2 = rightArm.addChild("arm2",
                ModelPartBuilder.create()
                        .uv(28, 51).cuboid(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F),
                ModelTransform.of(-2.0F, 2.0F, 0.0F, 0.0F, -1.0908F, 0.0F));
        ModelPartData hand2 = arm2.addChild("hand2",
                ModelPartBuilder.create(),
                ModelTransform.of(0.0F, 4.75F, 0.0F, -0.6981F, 0.0F, 0.0F));
        hand2.addChild("hand_r2",
                ModelPartBuilder.create()
                        .uv(17, 67).cuboid(-2.0F, -1.5F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
                ModelTransform.of(0.0F, -0.75F, 0.0F, -0.3927F, 0.0F, 0.0F));
        hand2.addChild("hand_r3",
                ModelPartBuilder.create()
                        .uv(38, 39).cuboid(-2.0F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F),
                ModelTransform.of(0.0F, -0.75F, 0.0F, -0.3927F, 0.0F, -0.0436F));
        ModelPartData punch = root.addChild("punch",
                ModelPartBuilder.create(),
                ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.0F));
        ModelPartData leftPunch = punch.addChild("leftPunch",
                ModelPartBuilder.create(),
                ModelTransform.of(1.0F, -27.0F, 0.0F, 0.0F, 0.0F, 0.0F));
        leftPunch.addChild("hand3",
                ModelPartBuilder.create()
                        .uv(38, 39).cuboid(-12.0F, -4.75F, -11.0F, 4.0F, 8.0F, 4.0F),
                ModelTransform.of(-6.0F, 5.75F, 0.0F, -1.5708F, 0.0F, 0.0F));
        leftPunch.addChild("hand4",
                ModelPartBuilder.create()
                        .uv(38, 39).cuboid(-16.0F, -1.75F, -2.0F, 4.0F, 8.0F, 4.0F),
                ModelTransform.of(-6.0F, 5.75F, 0.0F, -1.5708F, 0.0F, 0.0F));
        leftPunch.addChild("hand5",
                ModelPartBuilder.create()
                        .uv(38, 39).cuboid(-18.0F, 0.25F, -8.0F, 4.0F, 8.0F, 4.0F),
                ModelTransform.of(-6.0F, 5.75F, 0.0F, -1.5708F, 0.0F, 0.0F));
        leftPunch.addChild("hand6",
                ModelPartBuilder.create()
                        .uv(38, 39).cuboid(-8.0F, 2.25F, -4.0F, 4.0F, 8.0F, 4.0F),
                ModelTransform.of(-6.0F, 5.75F, 0.0F, -1.5708F, 0.0F, 0.0F));
        leftPunch.addChild("hand7",
                ModelPartBuilder.create()
                        .uv(38, 39).cuboid(-10.0F, -4.75F, 0.0F, 4.0F, 8.0F, 4.0F),
                ModelTransform.of(-6.0F, 5.75F, 0.0F, -1.5708F, 0.0F, 0.0F));
        ModelPartData rightPunch = punch.addChild("rightPunch",
                ModelPartBuilder.create(),
                ModelTransform.of(-1.0F, -27.0F, 0.0F, 0.0F, 0.0F, 0.0F));
        rightPunch.addChild("hand8",
                ModelPartBuilder.create()
                        .uv(38, 39).mirrored(true).cuboid(8.0F, -4.75F, -11.0F, 4.0F, 8.0F, 4.0F),
                ModelTransform.of(6.0F, 5.75F, 0.0F, -1.5708F, 0.0F, 0.0F));
        rightPunch.addChild("hand9",
                ModelPartBuilder.create()
                        .uv(38, 39).mirrored(true).cuboid(12.0F, -1.75F, -2.0F, 4.0F, 8.0F, 4.0F),
                ModelTransform.of(6.0F, 5.75F, 0.0F, -1.5708F, 0.0F, 0.0F));
        rightPunch.addChild("hand10",
                ModelPartBuilder.create()
                        .uv(38, 39).mirrored(true).cuboid(14.0F, 0.25F, -8.0F, 4.0F, 8.0F, 4.0F),
                ModelTransform.of(6.0F, 5.75F, 0.0F, -1.5708F, 0.0F, 0.0F));
        rightPunch.addChild("hand11",
                ModelPartBuilder.create()
                        .uv(38, 39).mirrored(true).cuboid(4.0F, 2.25F, -4.0F, 4.0F, 8.0F, 4.0F),
                ModelTransform.of(6.0F, 5.75F, 0.0F, -1.5708F, 0.0F, 0.0F));
        rightPunch.addChild("hand12",
                ModelPartBuilder.create()
                        .uv(38, 39).mirrored(true).cuboid(6.0F, -4.75F, 0.0F, 4.0F, 8.0F, 4.0F),
                ModelTransform.of(6.0F, 5.75F, 0.0F, -1.5708F, 0.0F, 0.0F));
        ModelPartData head = root.addChild("head",
                ModelPartBuilder.create()
                        .uv(1, 1).cuboid(-3.5F, -7.0F, -4.0F, 7.0F, 7.0F, 7.0F),
                ModelTransform.of(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F));
        head.addChild("head_r1",
                ModelPartBuilder.create()
                        .uv(1, 1).mirrored(true).cuboid(-1.0F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F),
                ModelTransform.of(-1.5F, -4.5F, -3.7F, 0.0F, 0.0F, 0.0873F));
        head.addChild("head_r2",
                ModelPartBuilder.create()
                        .uv(1, 1).cuboid(-1.0F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F),
                ModelTransform.of(1.5F, -4.5F, -3.7F, 0.0F, 0.0F, -0.0873F));
        head.addChild("bone2",
                ModelPartBuilder.create()
                        .uv(24, 15).cuboid(-1.5F, -2.5F, -2.0F, 3.0F, 3.0F, 2.0F)
                        .uv(22, 0).cuboid(-1.5F, -2.5F, -1.0F, 3.0F, 3.0F, 2.0F, new Dilation(0.2F, 0.2F, 0.2F)),
                ModelTransform.of(0.0F, -5.0F, -3.5F, -0.1745F, 0.0F, 0.0F));
        head.addChild("bone",
                ModelPartBuilder.create(),
                ModelTransform.of(0.0F, -5.5F, -4.0F, 0.1309F, 0.0F, 0.0F));
        ModelPartData punchBody = root.addChild("punchBody",
                ModelPartBuilder.create()
                        .uv(0, 15).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F)
                        .uv(0, 44).cuboid(-3.5F, 0.5F, -2.5F, 7.0F, 4.0F, 1.0F)
                        .uv(22, 5).cuboid(-1.5F, 4.5F, -2.25F, 3.0F, 2.0F, 1.0F),
                ModelTransform.of(0.0F, -5.0F, 0.0F, 0.0F, -0.0436F, 0.0F));
        ModelPartData lower2 = punchBody.addChild("lower2",
                ModelPartBuilder.create()
                        .uv(20, 35).cuboid(-3.5F, 0.0F, -2.0F, 7.0F, 4.0F, 4.0F),
                ModelTransform.of(0.0F, 7.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
        lower2.addChild("belt_r3",
                ModelPartBuilder.create()
                        .uv(50, 0).cuboid(-5.5F, -3.0F, 0.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.1F, 0.1F, 0.1F))
                        .uv(38, 30).cuboid(-5.0F, -3.0F, 0.0F, 5.0F, 3.0F, 5.0F, new Dilation(0.001F, 0.001F, 0.001F)),
                ModelTransform.of(0.0F, 6.0F, -2.5F, 0.0F, 0.0F, 0.2182F));
        lower2.addChild("belt_r4",
                ModelPartBuilder.create()
                        .uv(0, 50).cuboid(0.5F, -3.0F, 0.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.101F, 0.101F, 0.101F))
                        .uv(49, 7).cuboid(0.0F, -3.0F, 0.0F, 5.0F, 3.0F, 5.0F),
                ModelTransform.of(0.0F, 6.0F, -2.5F, 0.0F, 0.0F, -0.2182F));
        ModelPartData right2 = lower2.addChild("right2",
                ModelPartBuilder.create()
                        .uv(30, 0).cuboid(-2.75F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F),
                ModelTransform.of(-2.25F, 5.0F, 0.0F, -0.5672F, 0.2618F, 0.1745F));
        right2.addChild("rightUpper_r2",
                ModelPartBuilder.create()
                        .uv(0, 4).cuboid(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 2.0F),
                ModelTransform.of(-0.25F, 7.5F, -1.5F, -0.6545F, 0.0F, 0.0F));
        right2.addChild("rightLower2",
                ModelPartBuilder.create()
                        .uv(19, 21).cuboid(-2.5F, -1.5F, -1.5F, 5.0F, 9.0F, 5.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
                ModelTransform.of(-0.25F, 6.5F, 0.0F, 0.7418F, 0.0F, 0.0F));
        ModelPartData left2 = lower2.addChild("left2",
                ModelPartBuilder.create()
                        .uv(34, 12).cuboid(-2.0F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F),
                ModelTransform.of(2.0F, 5.0F, 0.0F, -0.2182F, -0.1745F, -0.3927F));
        left2.addChild("leftUpper_r2",
                ModelPartBuilder.create()
                        .cuboid(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 2.0F),
                ModelTransform.of(0.5F, 7.5F, -1.5F, -0.6545F, 0.0F, 0.0F));
        ModelPartData leftLower2 = left2.addChild("leftLower2",
                ModelPartBuilder.create(),
                ModelTransform.of(0.5F, 5.5F, 0.0F, 0.0F, 0.0F, 0.0F));
        leftLower2.addChild("leftLower_r2",
                ModelPartBuilder.create()
                        .uv(0, 30).cuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
                ModelTransform.of(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
        ModelPartData upper2 = punchBody.addChild("upper2",
                ModelPartBuilder.create(),
                ModelTransform.of(0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F));
        upper2.addChild("leftArm2",
                ModelPartBuilder.create()
                        .uv(49, 46).cuboid(0.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F)
                        .uv(16, 55).cuboid(3.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F),
                ModelTransform.of(4.0F, -4.0F, 0.0F, -1.0472F, 0.0F, 0.1309F));
        upper2.addChild("rightArm2",
                ModelPartBuilder.create()
                        .uv(49, 19).cuboid(-4.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F)
                        .uv(42, 51).cuboid(-4.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F),
                ModelTransform.of(-4.0F, -4.0F, 0.0F, -1.3963F, 0.3054F, 0.0F));
        return TexturedModelData.of(data, 128, 128);

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
