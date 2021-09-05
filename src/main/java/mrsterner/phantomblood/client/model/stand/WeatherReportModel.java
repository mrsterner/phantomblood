// Made with Model Converter by Globox_Z
// Generate all required imports
// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
package mrsterner.phantomblood.client.model.stand;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.NotNull;
public class WeatherReportModel extends EntityModel<LivingEntity> {
	private final ModelPart head;
	private final ModelPart head_r1;
	private final ModelPart head_r2;
	private final ModelPart horn;
	private final ModelPart bone6;
	private final ModelPart horn_r1;
	private final ModelPart bone5;
	private final ModelPart horn_r2;
	private final ModelPart bone2;
	private final ModelPart horn_r3;
	private final ModelPart bone3;
	private final ModelPart horn_r4;
	private final ModelPart bone4;
	private final ModelPart horn_r5;
	private final ModelPart bone;
	private final ModelPart body;
	private final ModelPart lower;
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
	private final ModelPart arm2;
	private final ModelPart arm_r1;
	private final ModelPart hand2;
	private final ModelPart hand_r2;
	private final ModelPart punch;
	private final ModelPart punchleft;
	private final ModelPart leftPunch1;
	private final ModelPart leftPunch1_r1;
	private final ModelPart leftPunch2;
	private final ModelPart leftPunch2_r1;
	private final ModelPart leftPunch3;
	private final ModelPart leftPunch3_r1;
	private final ModelPart leftPunch4;
	private final ModelPart leftPunch4_r1;
	private final ModelPart leftPunch5;
	private final ModelPart leftPunch5_r1;
	private final ModelPart punchright;
	private final ModelPart rightPunch1;
	private final ModelPart rightPunch1_r1;
	private final ModelPart rightPunch2;
	private final ModelPart rightPunch2_r1;
	private final ModelPart rightPunch3;
	private final ModelPart rightPunch3_r1;
	private final ModelPart rightPunch4;
	private final ModelPart rightPunch4_r1;
	private final ModelPart rightPunch6;
	private final ModelPart rightPunch5_r1;
	private final ModelPart hover;
	private final ModelPart hoverleft;
	private final ModelPart leftPunchh1;
	private final ModelPart leftPunch1_r2;
	private final ModelPart leftPunchh2;
	private final ModelPart leftPunch1_r3;
	private final ModelPart leftPunchh4;
	private final ModelPart leftPunch1_r4;
	private final ModelPart leftPunchh3;
	private final ModelPart leftPunch1_r5;
	private final ModelPart leftPunchh5;
	private final ModelPart leftPunch1_r6;
	private final ModelPart hoverright;
	private final ModelPart rightPunchh1;
	private final ModelPart rightPunch1_r2;
	private final ModelPart rightPunchh2;
	private final ModelPart rightPunch1_r3;
	private final ModelPart rightPunchh3;
	private final ModelPart rightPunch1_r4;
	private final ModelPart rightPunchh4;
	private final ModelPart rightPunch1_r5;
	private final ModelPart rightPunchh5;
	private final ModelPart rightPunch1_r6;
	private double yOffset;
	private float off;
	public WeatherReportModel(ModelPart root) {
		this.head = root.getChild("head");
		this.bone = this.head.getChild("bone");
		this.horn = this.head.getChild("horn");
		this.bone4 = this.horn.getChild("bone4");
		this.horn_r5 = this.bone4.getChild("horn_r5");
		this.bone3 = this.horn.getChild("bone3");
		this.horn_r4 = this.bone3.getChild("horn_r4");
		this.bone2 = this.horn.getChild("bone2");
		this.horn_r3 = this.bone2.getChild("horn_r3");
		this.bone5 = this.horn.getChild("bone5");
		this.horn_r2 = this.bone5.getChild("horn_r2");
		this.bone6 = this.horn.getChild("bone6");
		this.horn_r1 = this.bone6.getChild("horn_r1");
		this.head_r2 = this.head.getChild("head_r2");
		this.head_r1 = this.head.getChild("head_r1");
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
		this.leftUpper_r1 = this.left.getChild("leftUpper_r1");
		this.right = this.lower.getChild("right");
		this.rightLower = this.right.getChild("rightLower");
		this.rightUpper_r1 = this.right.getChild("rightUpper_r1");
		this.punch = root.getChild("punch");
		this.punchright = this.punch.getChild("punchright");
		this.rightPunch6 = this.punchright.getChild("rightPunch6");
		this.rightPunch5_r1 = this.rightPunch6.getChild("rightPunch5_r1");
		this.rightPunch4 = this.punchright.getChild("rightPunch4");
		this.rightPunch4_r1 = this.rightPunch4.getChild("rightPunch4_r1");
		this.rightPunch3 = this.punchright.getChild("rightPunch3");
		this.rightPunch3_r1 = this.rightPunch3.getChild("rightPunch3_r1");
		this.rightPunch2 = this.punchright.getChild("rightPunch2");
		this.rightPunch2_r1 = this.rightPunch2.getChild("rightPunch2_r1");
		this.rightPunch1 = this.punchright.getChild("rightPunch1");
		this.rightPunch1_r1 = this.rightPunch1.getChild("rightPunch1_r1");
		this.punchleft = this.punch.getChild("punchleft");
		this.leftPunch5 = this.punchleft.getChild("leftPunch5");
		this.leftPunch5_r1 = this.leftPunch5.getChild("leftPunch5_r1");
		this.leftPunch4 = this.punchleft.getChild("leftPunch4");
		this.leftPunch4_r1 = this.leftPunch4.getChild("leftPunch4_r1");
		this.leftPunch3 = this.punchleft.getChild("leftPunch3");
		this.leftPunch3_r1 = this.leftPunch3.getChild("leftPunch3_r1");
		this.leftPunch2 = this.punchleft.getChild("leftPunch2");
		this.leftPunch2_r1 = this.leftPunch2.getChild("leftPunch2_r1");
		this.leftPunch1 = this.punchleft.getChild("leftPunch1");
		this.leftPunch1_r1 = this.leftPunch1.getChild("leftPunch1_r1");
		this.hover = root.getChild("hover");
		this.hoverright = this.hover.getChild("hoverright");
		this.rightPunchh5 = this.hoverright.getChild("rightPunchh5");
		this.rightPunch1_r6 = this.rightPunchh5.getChild("rightPunch1_r6");
		this.rightPunchh4 = this.hoverright.getChild("rightPunchh4");
		this.rightPunch1_r5 = this.rightPunchh4.getChild("rightPunch1_r5");
		this.rightPunchh3 = this.hoverright.getChild("rightPunchh3");
		this.rightPunch1_r4 = this.rightPunchh3.getChild("rightPunch1_r4");
		this.rightPunchh2 = this.hoverright.getChild("rightPunchh2");
		this.rightPunch1_r3 = this.rightPunchh2.getChild("rightPunch1_r3");
		this.rightPunchh1 = this.hoverright.getChild("rightPunchh1");
		this.rightPunch1_r2 = this.rightPunchh1.getChild("rightPunch1_r2");
		this.hoverleft = this.hover.getChild("hoverleft");
		this.leftPunchh5 = this.hoverleft.getChild("leftPunchh5");
		this.leftPunch1_r6 = this.leftPunchh5.getChild("leftPunch1_r6");
		this.leftPunchh3 = this.hoverleft.getChild("leftPunchh3");
		this.leftPunch1_r5 = this.leftPunchh3.getChild("leftPunch1_r5");
		this.leftPunchh4 = this.hoverleft.getChild("leftPunchh4");
		this.leftPunch1_r4 = this.leftPunchh4.getChild("leftPunch1_r4");
		this.leftPunchh2 = this.hoverleft.getChild("leftPunchh2");
		this.leftPunch1_r3 = this.leftPunchh2.getChild("leftPunch1_r3");
		this.leftPunchh1 = this.hoverleft.getChild("leftPunchh1");
		this.leftPunch1_r2 = this.leftPunchh1.getChild("leftPunch1_r2");
		setRotationAngle(head, -0.2182F, 0.0F, 0.2618F);
		setRotationAngle(head_r1, 0.0F, 0.0F, -0.1745F);
		setRotationAngle(head_r2, 0.0F, 0.0F, 0.1745F);


		setRotationAngle(horn_r1, 0.0F, 0.0F, 0.3491F);

		setRotationAngle(horn_r2, 0.0F, 0.0F, -0.3491F);

		setRotationAngle(horn_r3, 0.0873F, 0.0F, 0.0F);

		setRotationAngle(horn_r4, -0.2618F, 0.0F, 0.0873F);
		setRotationAngle(horn_r5, -0.2618F, 0.0F, -0.0873F);
		setRotationAngle(bone, 0.1309F, 0.0F, 0.0F);

		setRotationAngle(body, 0.0F, 0.2618F, 0.0F);
		setRotationAngle(lower, 0.1309F, 0.0F, 0.0F);
		setRotationAngle(right, -0.7854F, 0.2182F, 0.1745F);
		setRotationAngle(rightUpper_r1, -0.6545F, 0.0F, 0.0F);
		setRotationAngle(rightLower, 1.5272F, 0.0F, 0.0F);
		setRotationAngle(left, -0.2182F, -0.1745F, -0.3927F);
		setRotationAngle(leftUpper_r1, -0.6545F, 0.0F, 0.0F);

		setRotationAngle(leftLower_r1, 0.6109F, 0.0F, 0.0F);

		setRotationAngle(leftArm, 0.9163F, 1.0036F, -0.3927F);

		setRotationAngle(hand_r1, -1.0908F, 0.0F, 0.0F);
		setRotationAngle(rightArm, -1.1781F, 0.4363F, -0.3054F);

		setRotationAngle(shoulder_r1, 0.0F, -0.0873F, 0.0F);

		setRotationAngle(arm_r1, 0.0F, -0.3054F, 0.0F);
		setRotationAngle(hand2, 0.0F, -0.6981F, -0.4363F);

		setRotationAngle(hand_r2, -0.3927F, -0.5672F, -0.0436F);



		setRotationAngle(leftPunch1_r1, -1.5708F, 0.0F, 0.0F);

		setRotationAngle(leftPunch2_r1, -1.5708F, 0.0F, 0.0F);

		setRotationAngle(leftPunch3_r1, -1.5708F, 0.0F, 0.0F);

		setRotationAngle(leftPunch4_r1, -1.5708F, 0.0F, 0.0F);

		setRotationAngle(leftPunch5_r1, -1.5708F, 0.0F, 0.0F);


		setRotationAngle(rightPunch1_r1, -1.5708F, 0.0F, 0.0F);

		setRotationAngle(rightPunch2_r1, -1.5708F, 0.0F, 0.0F);

		setRotationAngle(rightPunch3_r1, -1.5708F, 0.0F, 0.0F);

		setRotationAngle(rightPunch4_r1, -1.5708F, 0.0F, 0.0F);

		setRotationAngle(rightPunch5_r1, -1.5708F, 0.0F, 0.0F);



		setRotationAngle(leftPunch1_r2, -1.5708F, 0.0F, 0.0F);

		setRotationAngle(leftPunch1_r3, -1.5708F, 0.0F, 0.0F);

		setRotationAngle(leftPunch1_r4, -1.5708F, 0.0F, 0.0F);

		setRotationAngle(leftPunch1_r5, -1.5708F, 0.0F, 0.0F);

		setRotationAngle(leftPunch1_r6, -1.5708F, 0.0F, 0.0F);


		setRotationAngle(rightPunch1_r2, -1.5708F, 0.0F, 0.0F);

		setRotationAngle(rightPunch1_r3, -1.5708F, 0.0F, 0.0F);

		setRotationAngle(rightPunch1_r4, -1.5708F, 0.0F, 0.0F);

		setRotationAngle(rightPunch1_r5, -1.5708F, 0.0F, 0.0F);

		setRotationAngle(rightPunch1_r6, -1.5708F, 0.0F, 0.0F);
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();

		ModelPartData modelPartData1 = modelPartData.addChild("head", ModelPartBuilder.create().uv(0,0).cuboid(-3.5F, -7.0F, -4.0F, 7.0F, 7.0F, 8.0F).uv(0,56).cuboid(3.0F, -4.0F, 0.0F, 1.0F, 2.0F, 2.0F).uv(0,56).cuboid(-4.0F, -4.0F, 0.0F, 1.0F, 2.0F, 2.0F).uv(0,0).cuboid(-1.5F, -5.0F, -4.301F, 3.0F, 3.0F, 1.0F).uv(4,60).cuboid(-0.5F, -2.5F, -4.5F, 1.0F, 3.0F, 6.0F), ModelTransform.pivot(0.0F,-5.0F,0.0F));
		modelPartData1.addChild("head_r1", ModelPartBuilder.create().uv(0,63).cuboid(-0.5F, 1.5F, 3.501F, 1.0F, 5.0F, 1.0F).uv(30,26).cuboid(-0.5F, -1.5F, -4.5F, 1.0F, 3.0F, 9.0F), ModelTransform.pivot(-1.5F,-6.0F,0.0F));
		modelPartData1.addChild("head_r2", ModelPartBuilder.create().uv(0,63).cuboid(-0.5F, 1.5F, 3.5F, 1.0F, 5.0F, 1.0F).uv(34,10).cuboid(-0.5F, -1.5F, -4.5F, 1.0F, 3.0F, 9.0F), ModelTransform.pivot(1.5F,-6.0F,0.0F));
		ModelPartData modelPartData2 = modelPartData1.addChild("horn", ModelPartBuilder.create(), ModelTransform.pivot(-1.0F,-7.5F,3.5F));
		ModelPartData modelPartData3 = modelPartData2.addChild("bone6", ModelPartBuilder.create(), ModelTransform.pivot(3.9F,0.0F,-3.0F));
		modelPartData3.addChild("horn_r1", ModelPartBuilder.create().uv(0,60).cuboid(-0.5F, -2.5F, -1.0F, 1.0F, 2.0F, 1.0F, new Dilation(-0.2F)).uv(0,60).cuboid(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData4 = modelPartData2.addChild("bone5", ModelPartBuilder.create(), ModelTransform.pivot(-1.9F,0.0F,-3.0F));
		modelPartData4.addChild("horn_r2", ModelPartBuilder.create().uv(0,60).cuboid(-0.5F, -2.5F, -1.0F, 1.0F, 2.0F, 1.0F, new Dilation(-0.2F)).uv(0,60).cuboid(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData5 = modelPartData2.addChild("bone2", ModelPartBuilder.create(), ModelTransform.pivot(1.0F,0.0F,-5.0F));
		modelPartData5.addChild("horn_r3", ModelPartBuilder.create().uv(0,60).cuboid(-0.5F, -3.5F, -1.5F, 1.0F, 3.0F, 1.0F, new Dilation(-0.1F)).uv(0,60).cuboid(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.1F)), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData6 = modelPartData2.addChild("bone3", ModelPartBuilder.create(), ModelTransform.pivot(2.0F,0.0F,0.0F));
		modelPartData6.addChild("horn_r4", ModelPartBuilder.create().uv(0,60).cuboid(0.0F, -2.5F, -1.5F, 1.0F, 2.0F, 1.0F, new Dilation(-0.2F)).uv(0,60).cuboid(0.0F, -1.0F, -1.5F, 1.0F, 2.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData7 = modelPartData2.addChild("bone4", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData7.addChild("horn_r5", ModelPartBuilder.create().uv(0,60).cuboid(-1.0F, -2.5F, -1.5F, 1.0F, 2.0F, 1.0F, new Dilation(-0.2F)).uv(0,60).cuboid(-1.0F, -1.0F, -1.5F, 1.0F, 2.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData1.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-5.5F,-4.0F));
		ModelPartData modelPartData8 = modelPartData.addChild("body", ModelPartBuilder.create().uv(0,15).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F).uv(54,15).cuboid(-3.5F, 0.5F, -2.5F, 7.0F, 4.0F, 1.0F), ModelTransform.pivot(0.0F,-5.0F,0.0F));
		ModelPartData modelPartData9 = modelPartData8.addChild("lower", ModelPartBuilder.create().uv(41,22).cuboid(-3.5F, 0.0F, -2.0F, 7.0F, 4.0F, 4.0F).uv(22,0).cuboid(-4.0F, 2.5F, -2.5F, 8.0F, 2.0F, 5.0F), ModelTransform.pivot(0.0F,7.0F,0.0F));
		ModelPartData modelPartData10 = modelPartData9.addChild("right", ModelPartBuilder.create().uv(20,38).cuboid(-2.75F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F), ModelTransform.pivot(-2.25F,5.0F,0.0F));
		modelPartData10.addChild("rightUpper_r1", ModelPartBuilder.create().uv(0,4).cuboid(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 2.0F), ModelTransform.pivot(-0.25F,7.5F,-1.5F));
		modelPartData10.addChild("rightLower", ModelPartBuilder.create().uv(19,21).cuboid(-2.5F, -1.5F, -1.5F, 5.0F, 9.0F, 5.0F, new Dilation(-0.2F)), ModelTransform.pivot(-0.25F,6.5F,0.0F));
		ModelPartData modelPartData11 = modelPartData9.addChild("left", ModelPartBuilder.create().uv(40,38).cuboid(-2.0F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F), ModelTransform.pivot(2.0F,5.0F,0.0F));
		modelPartData11.addChild("leftUpper_r1", ModelPartBuilder.create().uv(0,4).cuboid(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 2.0F), ModelTransform.pivot(0.5F,7.5F,-1.5F));
		ModelPartData modelPartData12 = modelPartData11.addChild("leftLower", ModelPartBuilder.create(), ModelTransform.pivot(0.5F,5.5F,0.0F));
		modelPartData12.addChild("leftLower_r1", ModelPartBuilder.create().uv(0,30).cuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, new Dilation(-0.2F)), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData13 = modelPartData8.addChild("upper", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,5.0F,0.0F));
		ModelPartData modelPartData14 = modelPartData13.addChild("leftArm", ModelPartBuilder.create().uv(34,50).cuboid(0.0F, -3.0F, -2.5F, 4.0F, 4.0F, 5.0F), ModelTransform.pivot(5.0F,-3.0F,3.0F));
		ModelPartData modelPartData15 = modelPartData14.addChild("arm", ModelPartBuilder.create().uv(52,50).cuboid(4.5F, -1.0F, -2.0F, 3.0F, 4.0F, 4.0F), ModelTransform.pivot(-4.0F,2.0F,0.0F));
		ModelPartData modelPartData16 = modelPartData15.addChild("hand", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData16.addChild("hand_r1", ModelPartBuilder.create().uv(8,26).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 1.0F, 2.0F).uv(45,3).cuboid(-2.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(6.0F,3.0F,0.0F));
		ModelPartData modelPartData17 = modelPartData13.addChild("rightArm", ModelPartBuilder.create(), ModelTransform.pivot(-4.0F,-3.0F,-2.0F));
		modelPartData17.addChild("shoulder_r1", ModelPartBuilder.create().uv(16,50).cuboid(-4.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F), ModelTransform.pivot(0.0F,-1.0F,0.0F));
		ModelPartData modelPartData18 = modelPartData17.addChild("arm2", ModelPartBuilder.create(), ModelTransform.pivot(4.0F,2.0F,0.0F));
		modelPartData18.addChild("arm_r1", ModelPartBuilder.create().uv(50,30).cuboid(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F), ModelTransform.pivot(-6.0F,-1.0F,0.0F));
		ModelPartData modelPartData19 = modelPartData18.addChild("hand2", ModelPartBuilder.create(), ModelTransform.pivot(-6.0F,3.75F,0.0F));
		modelPartData19.addChild("hand_r2", ModelPartBuilder.create().uv(0,26).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F).uv(0,44).cuboid(-2.0F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(0.0F,-0.75F,0.0F));
		ModelPartData modelPartData20 = modelPartData.addChild("punch", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,4.0F,3.0F));
		ModelPartData modelPartData21 = modelPartData20.addChild("punchleft", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData22 = modelPartData21.addChild("leftPunch1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-2.0F,0.0F));
		modelPartData22.addChild("leftPunch1_r1", ModelPartBuilder.create().uv(45,3).cuboid(4.0F, -3.0F, -7.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(20.0F,0.0F,0.0F));
		ModelPartData modelPartData23 = modelPartData21.addChild("leftPunch2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-2.0F,0.0F));
		modelPartData23.addChild("leftPunch2_r1", ModelPartBuilder.create().uv(45,3).cuboid(2.0F, -2.0F, 4.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(20.0F,0.0F,0.0F));
		ModelPartData modelPartData24 = modelPartData21.addChild("leftPunch3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-2.0F,0.0F));
		modelPartData24.addChild("leftPunch3_r1", ModelPartBuilder.create().uv(45,3).cuboid(-5.0F, -8.0F, 2.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(20.0F,0.0F,0.0F));
		ModelPartData modelPartData25 = modelPartData21.addChild("leftPunch4", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-2.0F,0.0F));
		modelPartData25.addChild("leftPunch4_r1", ModelPartBuilder.create().uv(45,3).cuboid(-2.0F, 7.0F, -2.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(20.0F,0.0F,0.0F));
		ModelPartData modelPartData26 = modelPartData21.addChild("leftPunch5", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-2.0F,0.0F));
		modelPartData26.addChild("leftPunch5_r1", ModelPartBuilder.create().uv(45,3).cuboid(-6.0F, 0.0F, -11.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(20.0F,0.0F,0.0F));
		ModelPartData modelPartData27 = modelPartData20.addChild("punchright", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData28 = modelPartData27.addChild("rightPunch1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-2.0F,-5.0F));
		modelPartData28.addChild("rightPunch1_r1", ModelPartBuilder.create().uv(0,44).cuboid(-7.0F, -9.0F, -10.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(-16.0F,0.0F,0.0F));
		ModelPartData modelPartData29 = modelPartData27.addChild("rightPunch2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-2.0F,-5.0F));
		modelPartData29.addChild("rightPunch2_r1", ModelPartBuilder.create().uv(0,44).cuboid(3.0F, -5.0F, -12.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(-16.0F,0.0F,0.0F));
		ModelPartData modelPartData30 = modelPartData27.addChild("rightPunch3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-2.0F,-5.0F));
		modelPartData30.addChild("rightPunch3_r1", ModelPartBuilder.create().uv(0,44).cuboid(1.0F, -13.0F, 2.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(-16.0F,0.0F,0.0F));
		ModelPartData modelPartData31 = modelPartData27.addChild("rightPunch4", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-2.0F,-5.0F));
		modelPartData31.addChild("rightPunch4_r1", ModelPartBuilder.create().uv(0,44).cuboid(-8.0F, -6.0F, 4.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(-16.0F,0.0F,0.0F));
		ModelPartData modelPartData32 = modelPartData27.addChild("rightPunch6", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-2.0F,-5.0F));
		modelPartData32.addChild("rightPunch5_r1", ModelPartBuilder.create().uv(0,44).cuboid(-2.0F, 2.0F, -2.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(-16.0F,0.0F,0.0F));
		ModelPartData modelPartData33 = modelPartData.addChild("hover", ModelPartBuilder.create(), ModelTransform.pivot(20.0F,4.0F,3.0F));
		ModelPartData modelPartData34 = modelPartData33.addChild("hoverleft", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData35 = modelPartData34.addChild("leftPunchh1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-2.0F,0.0F));
		modelPartData35.addChild("leftPunch1_r2", ModelPartBuilder.create().uv(45,3).cuboid(4.0F, -3.0F, -7.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData36 = modelPartData34.addChild("leftPunchh2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-2.0F,0.0F));
		modelPartData36.addChild("leftPunch1_r3", ModelPartBuilder.create().uv(45,3).cuboid(2.0F, -2.0F, 4.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData37 = modelPartData34.addChild("leftPunchh4", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-2.0F,0.0F));
		modelPartData37.addChild("leftPunch1_r4", ModelPartBuilder.create().uv(45,3).cuboid(-2.0F, 7.0F, -2.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData38 = modelPartData34.addChild("leftPunchh3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-2.0F,0.0F));
		modelPartData38.addChild("leftPunch1_r5", ModelPartBuilder.create().uv(45,3).cuboid(-5.0F, -8.0F, 2.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData39 = modelPartData34.addChild("leftPunchh5", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-2.0F,0.0F));
		modelPartData39.addChild("leftPunch1_r6", ModelPartBuilder.create().uv(45,3).cuboid(-6.0F, 0.0F, -11.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData40 = modelPartData33.addChild("hoverright", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData41 = modelPartData40.addChild("rightPunchh1", ModelPartBuilder.create(), ModelTransform.pivot(-36.0F,-2.0F,-5.0F));
		modelPartData41.addChild("rightPunch1_r2", ModelPartBuilder.create().uv(0,44).cuboid(-7.0F, -9.0F, -10.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData42 = modelPartData40.addChild("rightPunchh2", ModelPartBuilder.create(), ModelTransform.pivot(-36.0F,-2.0F,-5.0F));
		modelPartData42.addChild("rightPunch1_r3", ModelPartBuilder.create().uv(0,44).cuboid(3.0F, -5.0F, -12.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData43 = modelPartData40.addChild("rightPunchh3", ModelPartBuilder.create(), ModelTransform.pivot(-36.0F,-2.0F,-5.0F));
		modelPartData43.addChild("rightPunch1_r4", ModelPartBuilder.create().uv(0,44).cuboid(1.0F, -13.0F, 2.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData44 = modelPartData40.addChild("rightPunchh4", ModelPartBuilder.create(), ModelTransform.pivot(-36.0F,-2.0F,-5.0F));
		modelPartData44.addChild("rightPunch1_r5", ModelPartBuilder.create().uv(0,44).cuboid(-8.0F, -6.0F, 4.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData45 = modelPartData40.addChild("rightPunchh5", ModelPartBuilder.create(), ModelTransform.pivot(-36.0F,-2.0F,-5.0F));
		modelPartData45.addChild("rightPunch1_r6", ModelPartBuilder.create().uv(0,44).cuboid(-2.0F, 2.0F, -2.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		return TexturedModelData.of(modelData,128,128);
	}
	public void setAttackAngles(LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		this.yOffset = (double)MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;
		this.head.roll = 0F;
		this.head.pitch = headPitch * 0.017453292F;
		this.head.yaw = headYaw * 0.017453292F;
		float power = 0.5F;
		float speed = 2.5F;
		this.leftPunch1.yaw =45- MathHelper.cos(speed * animationProgress) * 1.2F * power;
		this.leftPunch2.yaw =45- MathHelper.cos(speed * animationProgress + 1.0471976F) * 1.4F * power;
		this.leftPunch3.yaw =45- MathHelper.cos(speed * animationProgress + (float)2.0943951023931953D) * 1.6F * power;
		this.leftPunch4.yaw =45- MathHelper.cos(speed * animationProgress + (float)2.6179938779914944D) * 1.3F * power;
		this.leftPunch5.yaw =45- MathHelper.cos(speed * animationProgress + (float)3.141592653589793D) * 1.7F * power;
		this.rightPunch1.yaw =-45+ MathHelper.cos(speed * animationProgress + (float)3.665191429188092D) * 1.2F * power;
		this.rightPunch2.yaw =-45+ MathHelper.cos(speed * animationProgress + (float)6.283185307179586D) * 1.1F * power;
		this.rightPunch3.yaw =-45+ MathHelper.cos(speed * animationProgress + (float)8.377580409572781D) * 1.4F * power;
		this.rightPunch4.yaw =-45+ MathHelper.cos(speed * animationProgress + (float)10.471975511965978D) * 1.5F * power;
		this.rightPunch6.yaw =-45+ MathHelper.cos(speed * animationProgress + (float)1.5707963267948966D) * 1.6F * power;
		float r = (float)Math.random();
		float offysin = MathHelper.sin(r * speed * animationProgress) * power - 0.25F;
		float offycos = MathHelper.cos(r * speed * animationProgress) * power - 0.25F;
		this.leftPunch1.pivotZ = offysin;
		this.leftPunch2.pivotZ = offycos;
		this.leftPunch3.pivotZ = offysin;
		this.leftPunch4.pivotZ = offycos;
		this.leftPunch5.pivotZ = offysin;
		this.rightPunch1.pivotZ = offycos;
		this.rightPunch2.pivotZ = offysin;
		this.rightPunch3.pivotZ = offycos;
		this.rightPunch4.pivotZ = offysin;
		this.rightPunch6.pivotZ = offycos;
	}
	@Override
	public void setAngles(LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		this.yOffset = (double)MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;
		float speed = 0.002F;
		this.head.pitch = headPitch * 0.017453292F;
		this.head.yaw = headYaw * 0.017453292F;
		this.off = 1F + MathHelper.cos((float) (0.15*animationProgress))/6;
	}
	@Override
	public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		matrixStack.translate(-0.45D, this.yOffset - 0.2D, 0.75D);
		this.head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.hover.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, 0.2F*off);

	}
	public void renderAttack(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		matrixStack.translate(0.0D, this.yOffset, -0.75D);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.translate(-0.2D, -this.yOffset, 0);
		punchleft.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, 0.5F * alpha);
		punchright.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, 0.5F *alpha);
	}
	public final void renderPunchyArms(@NotNull MatrixStack matrices, @NotNull VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
		this.punchleft.render(matrices, vertices, light, overlay, red, green, blue, alpha);
		this.punchright.render(matrices, vertices, light, overlay, red, green, blue, alpha);
	}
	public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
	}
}