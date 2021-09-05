// Made with Model Converter by Globox_Z
// Generate all required imports
package mrsterner.phantomblood.client.model.stand;
import net.minecraft.client.model.*;
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
    private final ModelPart punchRight;
    private final ModelPart punchRight1;
    private final ModelPart punchRight2;
    private final ModelPart punchRight3;
    private final ModelPart punchRight4;
    private final ModelPart punchRight5;
    private final ModelPart punchLeft;
    private final ModelPart punchLeft1;
    private final ModelPart punchLeft2;
    private final ModelPart punchLeft3;
    private final ModelPart punchLeft4;
    private final ModelPart punchLeft5;
    private final ModelPart body2;
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
    public TheWorldModel(ModelPart root) {
        this.head = root.getChild("head");
        this.bone = this.head.getChild("bone");
        this.faceplate_r2 = this.bone.getChild("faceplate_r2");
        this.faceplate_r1 = this.bone.getChild("faceplate_r1");
        this.tube_r1 = this.head.getChild("tube_r1");
        this.helmTop_r1 = this.head.getChild("helmTop_r1");
        this.body = root.getChild("body");
        this.upper = this.body.getChild("upper");
        this.rightArm = this.upper.getChild("rightArm");
        this.arm2 = this.rightArm.getChild("arm2");
        this.hand2 = this.arm2.getChild("hand2");
        this.hand_r2 = this.hand2.getChild("hand_r2");
        this.arm_r1 = this.arm2.getChild("arm_r1");
        this.shoulder_r1 = this.rightArm.getChild("shoulder_r1");
        this.leftArm = this.upper.getChild("leftArm");
        this.arm = this.leftArm.getChild("arm");
        this.hand = this.arm.getChild("hand");
        this.hand_r1 = this.hand.getChild("hand_r1");
        this.lower = this.body.getChild("lower");
        this.left = this.lower.getChild("left");
        this.leftLower = this.left.getChild("leftLower");
        this.leftLower_r1 = this.leftLower.getChild("leftLower_r1");
        this.right = this.lower.getChild("right");
        this.rightLower = this.right.getChild("rightLower");
        this.rightUpper_r1 = this.right.getChild("rightUpper_r1");
        this.punchRight = root.getChild("punchRight");
        this.punchRight5 = this.punchRight.getChild("punchRight5");
        this.punchRight4 = this.punchRight.getChild("punchRight4");
        this.punchRight3 = this.punchRight.getChild("punchRight3");
        this.punchRight2 = this.punchRight.getChild("punchRight2");
        this.punchRight1 = this.punchRight.getChild("punchRight1");
        this.punchLeft = root.getChild("punchLeft");
        this.punchLeft5 = this.punchLeft.getChild("punchLeft5");
        this.punchLeft4 = this.punchLeft.getChild("punchLeft4");
        this.punchLeft3 = this.punchLeft.getChild("punchLeft3");
        this.punchLeft2 = this.punchLeft.getChild("punchLeft2");
        this.punchLeft1 = this.punchLeft.getChild("punchLeft1");
        this.body2 = root.getChild("body2");
        this.upper2 = this.body2.getChild("upper2");
        this.rightArm2 = this.upper2.getChild("rightArm2");
        this.leftArm2 = this.upper2.getChild("leftArm2");
        this.lower2 = this.body2.getChild("lower2");
        this.left2 = this.lower2.getChild("left2");
        this.leftLower2 = this.left2.getChild("leftLower2");
        this.leftLower_r2 = this.leftLower2.getChild("leftLower_r2");
        this.right2 = this.lower2.getChild("right2");
        this.rightLower2 = this.right2.getChild("rightLower2");
        setRotationAngle(helmTop_r1, 0.48F, 0.0F, 0.0F);
        setRotationAngle(tube_r1, -0.1745F, 0.0F, 0.0F);
        setRotationAngle(bone, 0.1309F, 0.0F, 0.0F);

        setRotationAngle(faceplate_r1, 0.0F, 0.2618F, 0.0F);
        setRotationAngle(faceplate_r2, 0.0F, -0.2618F, 0.0F);
        setRotationAngle(body, 0.2182F, -0.1745F, -0.3054F);
        setRotationAngle(lower, 0.1309F, 0.0F, 0.0F);

        setRotationAngle(right, -0.7854F, 0.1745F, 0.1745F);
        setRotationAngle(rightUpper_r1, -0.6545F, 0.0F, 0.0F);
        setRotationAngle(rightLower, 1.9635F, 0.0F, 0.0F);
        setRotationAngle(left, 0.0873F, -0.4363F, -0.3927F);

        setRotationAngle(leftLower_r1, 0.6109F, 0.0F, 0.0F);

        setRotationAngle(leftArm, 0.8727F, 0.0F, -0.4363F);

        setRotationAngle(hand_r1, -1.0908F, 0.0F, 0.0F);
        setRotationAngle(rightArm, -1.5708F, 0.2618F, 0.6981F);

        setRotationAngle(shoulder_r1, 0.0F, -0.0873F, 0.0F);

        setRotationAngle(arm_r1, 0.0F, -0.3054F, 0.0F);

        setRotationAngle(hand_r2, -0.3927F, -0.5672F, -0.0436F);


        setRotationAngle(body2, 0.1309F, 0.0F, 0.0F);
        setRotationAngle(lower2, 0.1309F, 0.0F, 0.0F);
        setRotationAngle(right2, -0.5672F, 0.1745F, 0.3927F);
        setRotationAngle(rightLower2, 1.0036F, 0.0F, 0.0F);
        setRotationAngle(left2, -0.5672F, -0.1745F, -0.3927F);

        setRotationAngle(leftLower_r2, 0.6109F, 0.0F, 0.0F);

        setRotationAngle(leftArm2, -1.1345F, 0.0F, -0.7418F);
        setRotationAngle(rightArm2, -1.1345F, 0.0F, 0.7418F);
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        /*
        setRotationAngle(helmTop_r1, 0.48F, 0.0F, 0.0F);
        setRotationAngle(tube_r1, -0.1745F, 0.0F, 0.0F);
        setRotationAngle(bone, 0.1309F, 0.0F, 0.0F);

        setRotationAngle(faceplate_r1, 0.0F, 0.2618F, 0.0F);
        setRotationAngle(faceplate_r2, 0.0F, -0.2618F, 0.0F);
        setRotationAngle(body, 0.2182F, -0.1745F, -0.3054F);
        setRotationAngle(lower, 0.1309F, 0.0F, 0.0F);

         */
        ModelPartData modelPartData1 = modelPartData.addChild("head", ModelPartBuilder.create().uv(0,13).cuboid(-3.5F, -12.0F, -4.0F, 7.0F, 7.0F, 8.0F).uv(2,1).cuboid(-4.0F, -12.1F, -3.5F, 8.0F, 4.0F, 8.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData1.addChild("helmTop_r1", ModelPartBuilder.create().uv(22,20).cuboid(-4.0F, -1.95F, -4.0F, 8.0F, 4.0F, 8.0F, new Dilation(0.1F)), ModelTransform.pivot(0.0F,-12.0F,0.0F));
        modelPartData1.addChild("tube_r1", ModelPartBuilder.create().uv(25,0).cuboid(-4.5F, -1.0F, -3.5F, 9.0F, 2.0F, 7.0F), ModelTransform.pivot(0.0F,-8.1F,1.5F));
        ModelPartData modelPartData2 = modelPartData1.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-10.5F,-4.0F));
        modelPartData2.addChild("faceplate_r1", ModelPartBuilder.create().uv(64,16).cuboid(-5.1F, -0.5F, 0.4F, 5.0F, 4.0F, 2.0F), ModelTransform.pivot(0.0F,-1.0F,-2.0F));
        modelPartData2.addChild("faceplate_r2", ModelPartBuilder.create().uv(54,26).cuboid(0.1F, -0.5F, 0.4F, 5.0F, 4.0F, 2.0F, new Dilation(0.001F)), ModelTransform.pivot(0.0F,-1.0F,-2.0F));
        ModelPartData modelPartData3 = modelPartData.addChild("body", ModelPartBuilder.create().uv(0,28).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F).uv(8,71).cuboid(-3.5F, 0.5F, -2.5F, 7.0F, 4.0F, 1.0F).uv(47,65).cuboid(-2.5F, 0.0F, 3.0F, 2.0F, 8.0F, 2.0F).uv(0,65).cuboid(0.5F, 0.0F, 3.0F, 2.0F, 8.0F, 2.0F).uv(20,46).cuboid(1.0F, -1.0F, -3.0F, 2.0F, 11.0F, 6.0F, new Dilation(-0.1F)).uv(38,40).cuboid(-3.0F, -1.0F, -3.0F, 2.0F, 11.0F, 6.0F, new Dilation(-0.1F)), ModelTransform.pivot(0.0F,-5.0F,0.0F));
        ModelPartData modelPartData4 = modelPartData3.addChild("lower", ModelPartBuilder.create().uv(46,18).cuboid(-3.5F, 0.0F, -2.0F, 7.0F, 4.0F, 4.0F).uv(27,9).cuboid(-4.0F, 2.5F, -3.5F, 8.0F, 2.0F, 7.0F).uv(66,53).cuboid(3.0F, 2.0F, -1.5F, 2.0F, 3.0F, 3.0F).uv(65,29).cuboid(-5.0F, 2.0F, -1.5F, 2.0F, 3.0F, 3.0F), ModelTransform.pivot(0.0F,7.0F,0.0F));
        ModelPartData modelPartData5 = modelPartData4.addChild("right", ModelPartBuilder.create().uv(48,32).cuboid(-2.75F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F), ModelTransform.pivot(-2.25F,5.0F,0.0F));
        modelPartData5.addChild("rightUpper_r1", ModelPartBuilder.create().uv(18,73).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F), ModelTransform.pivot(-0.25F,7.5F,-1.5F));
        modelPartData5.addChild("rightLower", ModelPartBuilder.create().uv(24,32).cuboid(-2.5F, -1.5F, -1.5F, 5.0F, 9.0F, 5.0F, new Dilation(-0.2F)), ModelTransform.pivot(-0.25F,6.5F,0.0F));
        ModelPartData modelPartData6 = modelPartData4.addChild("left", ModelPartBuilder.create().uv(52,4).cuboid(-2.0F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F), ModelTransform.pivot(2.0F,5.0F,0.0F));
        ModelPartData modelPartData7 = modelPartData6.addChild("leftLower", ModelPartBuilder.create(), ModelTransform.pivot(0.5F,5.5F,0.0F));
        modelPartData7.addChild("leftLower_r1", ModelPartBuilder.create().uv(0,39).cuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, new Dilation(-0.2F)), ModelTransform.pivot(0.0F,0.0F,0.0F));
        ModelPartData modelPartData8 = modelPartData3.addChild("upper", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,5.0F,0.0F));
        ModelPartData modelPartData9 = modelPartData8.addChild("leftArm", ModelPartBuilder.create().uv(31,58).cuboid(0.0F, -3.0F, -2.5F, 4.0F, 4.0F, 5.0F), ModelTransform.pivot(4.0F,-2.0F,0.0F));
        ModelPartData modelPartData10 = modelPartData9.addChild("arm", ModelPartBuilder.create().uv(12,63).cuboid(4.5F, -1.0F, -2.0F, 3.0F, 4.0F, 4.0F), ModelTransform.pivot(-4.0F,2.0F,0.0F));
        ModelPartData modelPartData11 = modelPartData10.addChild("hand", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData11.addChild("hand_r1", ModelPartBuilder.create().uv(50,53).cuboid(-2.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(6.0F,3.0F,0.0F));
        ModelPartData modelPartData12 = modelPartData8.addChild("rightArm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F,-3.0F,-1.0F));
        modelPartData12.addChild("shoulder_r1", ModelPartBuilder.create().uv(54,44).cuboid(-4.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F), ModelTransform.pivot(0.0F,-1.0F,0.0F));
        ModelPartData modelPartData13 = modelPartData12.addChild("arm2", ModelPartBuilder.create(), ModelTransform.pivot(4.0F,2.0F,0.0F));
        modelPartData13.addChild("arm_r1", ModelPartBuilder.create().uv(62,61).cuboid(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F), ModelTransform.pivot(-6.0F,-1.0F,0.0F));
        ModelPartData modelPartData14 = modelPartData13.addChild("hand2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData14.addChild("hand_r2", ModelPartBuilder.create().uv(0,53).cuboid(-2.0F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(-6.0F,3.0F,0.0F));
        ModelPartData modelPartData15 = modelPartData.addChild("punchRight", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-3.0F,0.0F));
        modelPartData15.addChild("punchRight1", ModelPartBuilder.create().uv(0,76).cuboid(11.0F, -34.0F, -3.0F, 4.0F, 4.0F, 8.0F), ModelTransform.pivot(0.0F,27.0F,0.0F));
        modelPartData15.addChild("punchRight2", ModelPartBuilder.create().uv(0,76).cuboid(10.0F, -30.0F, 4.0F, 4.0F, 4.0F, 8.0F), ModelTransform.pivot(0.0F,27.0F,0.0F));
        modelPartData15.addChild("punchRight3", ModelPartBuilder.create().uv(0,76).cuboid(13.0F, -26.0F, -3.0F, 4.0F, 4.0F, 8.0F), ModelTransform.pivot(0.0F,27.0F,0.0F));
        modelPartData15.addChild("punchRight4", ModelPartBuilder.create().uv(0,76).cuboid(15.0F, -30.0F, -10.0F, 4.0F, 4.0F, 8.0F), ModelTransform.pivot(0.0F,27.0F,0.0F));
        modelPartData15.addChild("punchRight5", ModelPartBuilder.create().uv(0,76).cuboid(11.0F, -24.0F, -8.0F, 4.0F, 4.0F, 8.0F), ModelTransform.pivot(0.0F,27.0F,0.0F));
        ModelPartData modelPartData16 = modelPartData.addChild("punchLeft", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-3.0F,0.0F));
        modelPartData16.addChild("punchLeft1", ModelPartBuilder.create().uv(24,76).cuboid(-14.0F, -7.0F, -4.0F, 4.0F, 4.0F, 8.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData16.addChild("punchLeft2", ModelPartBuilder.create().uv(24,76).cuboid(-14.0F, -28.0F, 1.0F, 4.0F, 4.0F, 8.0F), ModelTransform.pivot(0.0F,27.0F,0.0F));
        modelPartData16.addChild("punchLeft3", ModelPartBuilder.create().uv(24,76).cuboid(-18.0F, -31.0F, -8.0F, 4.0F, 4.0F, 8.0F), ModelTransform.pivot(0.0F,27.0F,0.0F));
        modelPartData16.addChild("punchLeft4", ModelPartBuilder.create().uv(24,76).cuboid(-15.0F, -24.0F, -8.0F, 4.0F, 4.0F, 8.0F), ModelTransform.pivot(0.0F,27.0F,0.0F));
        modelPartData16.addChild("punchLeft5", ModelPartBuilder.create().uv(24,76).cuboid(-20.0F, -28.0F, -13.0F, 4.0F, 4.0F, 8.0F), ModelTransform.pivot(0.0F,27.0F,0.0F));
        ModelPartData modelPartData17 = modelPartData.addChild("body2", ModelPartBuilder.create().uv(0,28).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F).uv(47,65).cuboid(-2.5F, 0.0F, 3.0F, 2.0F, 8.0F, 2.0F).uv(0,65).cuboid(0.5F, 0.0F, 3.0F, 2.0F, 8.0F, 2.0F).uv(20,46).cuboid(1.0F, -1.0F, -3.0F, 2.0F, 11.0F, 6.0F).uv(38,40).cuboid(-3.0F, -1.0F, -3.0F, 2.0F, 11.0F, 6.0F), ModelTransform.pivot(0.0F,-5.0F,0.0F));
        ModelPartData modelPartData18 = modelPartData17.addChild("lower2", ModelPartBuilder.create().uv(46,18).cuboid(-3.5F, 0.0F, -2.0F, 7.0F, 4.0F, 4.0F).uv(27,9).cuboid(-4.0F, 3.0F, -3.5F, 8.0F, 2.0F, 7.0F).uv(66,53).cuboid(3.0F, 2.0F, -1.5F, 2.0F, 3.0F, 3.0F).uv(65,29).cuboid(-5.0F, 2.0F, -1.5F, 2.0F, 3.0F, 3.0F), ModelTransform.pivot(0.0F,7.0F,0.0F));
        ModelPartData modelPartData19 = modelPartData18.addChild("right2", ModelPartBuilder.create().uv(48,32).cuboid(-2.75F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F), ModelTransform.pivot(-2.25F,5.0F,-1.0F));
        modelPartData19.addChild("rightLower2", ModelPartBuilder.create().uv(24,32).cuboid(-2.5F, -1.5F, -1.5F, 5.0F, 9.0F, 5.0F, new Dilation(-0.2F)), ModelTransform.pivot(-0.25F,6.5F,0.0F));
        ModelPartData modelPartData20 = modelPartData18.addChild("left2", ModelPartBuilder.create().uv(52,4).cuboid(-2.0F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F), ModelTransform.pivot(2.0F,5.0F,-1.0F));
        ModelPartData modelPartData21 = modelPartData20.addChild("leftLower2", ModelPartBuilder.create(), ModelTransform.pivot(0.5F,5.5F,0.0F));
        modelPartData21.addChild("leftLower_r2", ModelPartBuilder.create().uv(0,39).cuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, new Dilation(-0.2F)), ModelTransform.pivot(0.0F,0.0F,0.0F));
        ModelPartData modelPartData22 = modelPartData17.addChild("upper2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,5.0F,0.0F));
        modelPartData22.addChild("leftArm2", ModelPartBuilder.create().uv(31,58).cuboid(0.0F, -3.0F, -2.5F, 4.0F, 4.0F, 5.0F), ModelTransform.pivot(4.0F,-2.0F,0.0F));
        modelPartData22.addChild("rightArm2", ModelPartBuilder.create().uv(54,44).cuboid(-4.0F, -3.0F, -2.5F, 4.0F, 4.0F, 5.0F), ModelTransform.pivot(-4.0F,-2.0F,0.0F));

        return TexturedModelData.of(modelData,128,128);
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
        body2.render(matrixStack, buffer, packedLight, packedOverlay);
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