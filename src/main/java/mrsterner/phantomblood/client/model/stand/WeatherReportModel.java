// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports

	package mrsterner.phantomblood.client.model.stand;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
	private final ModelPart leftUpperArm;
	private final ModelPart leftHand;
	private final ModelPart hand_r1;
	private final ModelPart rightArm;
	private final ModelPart shoulder_r1;
	private final ModelPart rightUpperArm;
	private final ModelPart arm_r1;
	private final ModelPart rightHand;
	private final ModelPart hand_r2;
	private final ModelPart upperAttack;
	private final ModelPart leftArm2;
	private final ModelPart rightArm2;
	private final ModelPart shoulder_r2;
	private final ModelPart rightPunch;
	private final ModelPart rightPunch1;
	private final ModelPart rightPunch1_r1;
	private final ModelPart rightPunch2;
	private final ModelPart rightPunch2_r1;
	private final ModelPart rightPunch3;
	private final ModelPart rightPunch3_r1;
	private final ModelPart rightPunch4;
	private final ModelPart rightPunch4_r1;
	private final ModelPart rightPunch5;
	private final ModelPart rightPunch5_r1;
	private final ModelPart leftPuch;
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
	private final ModelPart cloud;
	private final ModelPart cloud1;
	private final ModelPart cloud2;
	private final ModelPart cloud3;
	private final ModelPart cloud4;
	private final ModelPart cloud5;
	private final ModelPart cloud6;
	private final ModelPart cloud7;
	private final ModelPart cloud8;
	private final ModelPart cloud9;
	private final ModelPart cloud10;
	private final ModelPart cloud11;
	private double yOffset;

	public WeatherReportModel() {
		textureWidth = 128;
		textureHeight = 128;
		head = new ModelPart(this);
		head.setPivot(0.0F, -5.0F, 0.0F);
		setRotationAngle(head, -0.2182F, 0.0F, 0.2618F);
		head.setTextureOffset(0, 0).addCuboid(-3.5F, -7.0F, -4.0F, 7.0F, 7.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 56).addCuboid(3.0F, -4.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 56).addCuboid(-4.0F, -4.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addCuboid(-1.5F, -5.0F, -4.301F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(4, 60).addCuboid(-0.5F, -1.99F, -4.5F, 1.0F, 2.0F, 6.0F, 0.0F, false);

		head_r1 = new ModelPart(this);
		head_r1.setPivot(-1.5F, -6.0F, 0.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, -0.1745F);
		head_r1.setTextureOffset(0, 63).addCuboid(-0.5F, 1.5F, 3.501F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(30, 26).addCuboid(-0.5F, -1.5F, -4.5F, 1.0F, 3.0F, 9.0F, 0.0F, false);

		head_r2 = new ModelPart(this);
		head_r2.setPivot(1.5F, -6.0F, 0.0F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0F, 0.1745F);
		head_r2.setTextureOffset(0, 63).addCuboid(-0.5F, 1.5F, 3.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		head_r2.setTextureOffset(34, 10).addCuboid(-0.5F, -1.5F, -4.5F, 1.0F, 3.0F, 9.0F, 0.0F, false);

		horn = new ModelPart(this);
		horn.setPivot(-1.0F, -7.5F, 3.5F);
		head.addChild(horn);


		bone6 = new ModelPart(this);
		bone6.setPivot(3.9F, 0.0F, -3.0F);
		horn.addChild(bone6);


		horn_r1 = new ModelPart(this);
		horn_r1.setPivot(0.0F, 0.0F, 0.0F);
		bone6.addChild(horn_r1);
		setRotationAngle(horn_r1, 0.0F, 0.0F, 0.3491F);
		horn_r1.setTextureOffset(0, 60).addCuboid(-0.5F, -2.5F, -1.0F, 1.0F, 2.0F, 1.0F, -0.2F, false);
		horn_r1.setTextureOffset(0, 60).addCuboid(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone5 = new ModelPart(this);
		bone5.setPivot(-1.9F, 0.0F, -3.0F);
		horn.addChild(bone5);


		horn_r2 = new ModelPart(this);
		horn_r2.setPivot(0.0F, 0.0F, 0.0F);
		bone5.addChild(horn_r2);
		setRotationAngle(horn_r2, 0.0F, 0.0F, -0.3491F);
		horn_r2.setTextureOffset(0, 60).addCuboid(-0.5F, -2.5F, -1.0F, 1.0F, 2.0F, 1.0F, -0.2F, false);
		horn_r2.setTextureOffset(0, 60).addCuboid(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone2 = new ModelPart(this);
		bone2.setPivot(1.0F, 0.0F, -5.0F);
		horn.addChild(bone2);


		horn_r3 = new ModelPart(this);
		horn_r3.setPivot(0.0F, 0.0F, 0.0F);
		bone2.addChild(horn_r3);
		setRotationAngle(horn_r3, 0.0873F, 0.0F, 0.0F);
		horn_r3.setTextureOffset(0, 60).addCuboid(-0.5F, -3.5F, -1.5F, 1.0F, 3.0F, 1.0F, -0.1F, false);
		horn_r3.setTextureOffset(0, 60).addCuboid(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 1.0F, 0.1F, false);

		bone3 = new ModelPart(this);
		bone3.setPivot(2.0F, 0.0F, 0.0F);
		horn.addChild(bone3);


		horn_r4 = new ModelPart(this);
		horn_r4.setPivot(0.0F, 0.0F, 0.0F);
		bone3.addChild(horn_r4);
		setRotationAngle(horn_r4, -0.2618F, 0.0F, 0.0873F);
		horn_r4.setTextureOffset(0, 60).addCuboid(0.0F, -2.5F, -1.5F, 1.0F, 2.0F, 1.0F, -0.2F, false);
		horn_r4.setTextureOffset(0, 60).addCuboid(0.0F, -1.0F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone4 = new ModelPart(this);
		bone4.setPivot(0.0F, 0.0F, 0.0F);
		horn.addChild(bone4);


		horn_r5 = new ModelPart(this);
		horn_r5.setPivot(0.0F, 0.0F, 0.0F);
		bone4.addChild(horn_r5);
		setRotationAngle(horn_r5, -0.2618F, 0.0F, -0.0873F);
		horn_r5.setTextureOffset(0, 60).addCuboid(-1.0F, -2.5F, -1.5F, 1.0F, 2.0F, 1.0F, -0.2F, false);
		horn_r5.setTextureOffset(0, 60).addCuboid(-1.0F, -1.0F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone = new ModelPart(this);
		bone.setPivot(0.0F, -5.5F, -4.0F);
		head.addChild(bone);
		setRotationAngle(bone, 0.1309F, 0.0F, 0.0F);


		body = new ModelPart(this);
		body.setPivot(0.0F, -5.0F, 0.0F);
		setRotationAngle(body, 0.0F, 0.2618F, 0.0F);
		body.setTextureOffset(0, 15).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(54, 15).addCuboid(-3.5F, 0.5F, -2.5F, 7.0F, 4.0F, 1.0F, 0.0F, false);

		lower = new ModelPart(this);
		lower.setPivot(0.0F, 7.0F, 0.0F);
		body.addChild(lower);
		setRotationAngle(lower, 0.1309F, 0.0F, 0.0F);
		lower.setTextureOffset(41, 22).addCuboid(-3.5F, 0.0F, -2.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);
		lower.setTextureOffset(22, 0).addCuboid(-4.0F, 2.5F, -2.5F, 8.0F, 2.0F, 5.0F, 0.0F, false);

		right = new ModelPart(this);
		right.setPivot(-2.25F, 5.0F, 0.0F);
		lower.addChild(right);
		setRotationAngle(right, -0.7854F, 0.2182F, 0.1745F);
		right.setTextureOffset(20, 38).addCuboid(-2.75F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		rightUpper_r1 = new ModelPart(this);
		rightUpper_r1.setPivot(-0.25F, 7.5F, -1.5F);
		right.addChild(rightUpper_r1);
		setRotationAngle(rightUpper_r1, -0.6545F, 0.0F, 0.0F);
		rightUpper_r1.setTextureOffset(0, 4).addCuboid(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		rightLower = new ModelPart(this);
		rightLower.setPivot(-0.25F, 6.5F, 0.0F);
		right.addChild(rightLower);
		setRotationAngle(rightLower, 1.5272F, 0.0F, 0.0F);
		rightLower.setTextureOffset(19, 21).addCuboid(-2.5F, -1.5F, -1.5F, 5.0F, 9.0F, 5.0F, -0.2F, false);

		left = new ModelPart(this);
		left.setPivot(2.0F, 5.0F, 0.0F);
		lower.addChild(left);
		setRotationAngle(left, -0.2182F, -0.1745F, -0.3927F);
		left.setTextureOffset(40, 38).addCuboid(-2.0F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		leftUpper_r1 = new ModelPart(this);
		leftUpper_r1.setPivot(0.5F, 7.5F, -1.5F);
		left.addChild(leftUpper_r1);
		setRotationAngle(leftUpper_r1, -0.6545F, 0.0F, 0.0F);
		leftUpper_r1.setTextureOffset(0, 4).addCuboid(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		leftLower = new ModelPart(this);
		leftLower.setPivot(0.5F, 5.5F, 0.0F);
		left.addChild(leftLower);


		leftLower_r1 = new ModelPart(this);
		leftLower_r1.setPivot(0.0F, 0.0F, 0.0F);
		leftLower.addChild(leftLower_r1);
		setRotationAngle(leftLower_r1, 0.6109F, 0.0F, 0.0F);
		leftLower_r1.setTextureOffset(0, 30).addCuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, -0.2F, false);

		upper = new ModelPart(this);
		upper.setPivot(0.0F, 0.0F, 0.0F);


		leftArm = new ModelPart(this);
		leftArm.setPivot(5.0F, -3.0F, 3.0F);
		upper.addChild(leftArm);
		setRotationAngle(leftArm, 0.9163F, 1.0036F, -0.3927F);
		leftArm.setTextureOffset(34, 50).addCuboid(0.0F, -3.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);

		leftUpperArm = new ModelPart(this);
		leftUpperArm.setPivot(-4.0F, 2.0F, 0.0F);
		leftArm.addChild(leftUpperArm);
		leftUpperArm.setTextureOffset(52, 50).addCuboid(4.5F, -1.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		leftHand = new ModelPart(this);
		leftHand.setPivot(0.0F, 0.0F, 0.0F);
		leftUpperArm.addChild(leftHand);


		hand_r1 = new ModelPart(this);
		hand_r1.setPivot(6.0F, 3.0F, 0.0F);
		leftHand.addChild(hand_r1);
		setRotationAngle(hand_r1, -1.0908F, 0.0F, 0.0F);
		hand_r1.setTextureOffset(8, 26).addCuboid(-1.0F, -3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		hand_r1.setTextureOffset(45, 3).addCuboid(-2.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		rightArm = new ModelPart(this);
		rightArm.setPivot(-4.0F, -3.0F, -2.0F);
		upper.addChild(rightArm);
		setRotationAngle(rightArm, -1.1781F, 0.4363F, -0.3054F);


		shoulder_r1 = new ModelPart(this);
		shoulder_r1.setPivot(0.0F, -1.0F, 0.0F);
		rightArm.addChild(shoulder_r1);
		setRotationAngle(shoulder_r1, 0.0F, -0.0873F, 0.0F);
		shoulder_r1.setTextureOffset(16, 50).addCuboid(-4.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);

		rightUpperArm = new ModelPart(this);
		rightUpperArm.setPivot(4.0F, 2.0F, 0.0F);
		rightArm.addChild(rightUpperArm);


		arm_r1 = new ModelPart(this);
		arm_r1.setPivot(-6.0F, -1.0F, 0.0F);
		rightUpperArm.addChild(arm_r1);
		setRotationAngle(arm_r1, 0.0F, -0.3054F, 0.0F);
		arm_r1.setTextureOffset(50, 30).addCuboid(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		rightHand = new ModelPart(this);
		rightHand.setPivot(-6.0F, 3.75F, 0.0F);
		rightUpperArm.addChild(rightHand);
		setRotationAngle(rightHand, 0.0F, -0.6981F, -0.4363F);


		hand_r2 = new ModelPart(this);
		hand_r2.setPivot(0.0F, -0.75F, 0.0F);
		rightHand.addChild(hand_r2);
		setRotationAngle(hand_r2, -0.3927F, -0.5672F, -0.0436F);
		hand_r2.setTextureOffset(0, 26).addCuboid(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		hand_r2.setTextureOffset(0, 44).addCuboid(-2.0F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		upperAttack = new ModelPart(this);
		upperAttack.setPivot(0.0F, 0.0F, 0.0F);


		leftArm2 = new ModelPart(this);
		leftArm2.setPivot(4.0F, -2.0F, -3.0F);
		upperAttack.addChild(leftArm2);
		setRotationAngle(leftArm2, -1.4399F, -0.3927F, 0.1745F);
		leftArm2.setTextureOffset(34, 50).addCuboid(0.0F, -3.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);

		rightArm2 = new ModelPart(this);
		rightArm2.setPivot(-4.0F, -3.0F, -2.0F);
		upperAttack.addChild(rightArm2);
		setRotationAngle(rightArm2, -1.789F, 0.5236F, -0.3054F);


		shoulder_r2 = new ModelPart(this);
		shoulder_r2.setPivot(0.0F, -1.0F, 0.0F);
		rightArm2.addChild(shoulder_r2);
		setRotationAngle(shoulder_r2, 0.0F, -0.0873F, 0.0F);
		shoulder_r2.setTextureOffset(16, 50).addCuboid(-4.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);

		rightPunch = new ModelPart(this);
		rightPunch.setPivot(0.0F, 0.0F, 0.0F);


		rightPunch1 = new ModelPart(this);
		rightPunch1.setPivot(0.0F, 2.0F, -3.0F);
		rightPunch.addChild(rightPunch1);


		rightPunch1_r1 = new ModelPart(this);
		rightPunch1_r1.setPivot(-13.0F, 0.0F, -2.0F);
		rightPunch1.addChild(rightPunch1_r1);
		setRotationAngle(rightPunch1_r1, -1.5708F, 0.0F, 0.0F);
		rightPunch1_r1.setTextureOffset(0, 44).addCuboid(-2.0F, 2.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		rightPunch2 = new ModelPart(this);
		rightPunch2.setPivot(0.0F, 2.0F, -3.0F);
		rightPunch.addChild(rightPunch2);


		rightPunch2_r1 = new ModelPart(this);
		rightPunch2_r1.setPivot(-13.0F, 0.0F, -2.0F);
		rightPunch2.addChild(rightPunch2_r1);
		setRotationAngle(rightPunch2_r1, -1.5708F, 0.0F, 0.0F);
		rightPunch2_r1.setTextureOffset(0, 44).addCuboid(-7.0F, -9.0F, -10.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		rightPunch3 = new ModelPart(this);
		rightPunch3.setPivot(0.0F, 2.0F, -3.0F);
		rightPunch.addChild(rightPunch3);


		rightPunch3_r1 = new ModelPart(this);
		rightPunch3_r1.setPivot(-13.0F, 0.0F, -2.0F);
		rightPunch3.addChild(rightPunch3_r1);
		setRotationAngle(rightPunch3_r1, -1.5708F, 0.0F, 0.0F);
		rightPunch3_r1.setTextureOffset(0, 44).addCuboid(3.0F, -5.0F, -12.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		rightPunch4 = new ModelPart(this);
		rightPunch4.setPivot(0.0F, 2.0F, -3.0F);
		rightPunch.addChild(rightPunch4);


		rightPunch4_r1 = new ModelPart(this);
		rightPunch4_r1.setPivot(-13.0F, 0.0F, -2.0F);
		rightPunch4.addChild(rightPunch4_r1);
		setRotationAngle(rightPunch4_r1, -1.5708F, 0.0F, 0.0F);
		rightPunch4_r1.setTextureOffset(0, 44).addCuboid(1.0F, -13.0F, 2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		rightPunch5 = new ModelPart(this);
		rightPunch5.setPivot(0.0F, 2.0F, -3.0F);
		rightPunch.addChild(rightPunch5);


		rightPunch5_r1 = new ModelPart(this);
		rightPunch5_r1.setPivot(-13.0F, 0.0F, -2.0F);
		rightPunch5.addChild(rightPunch5_r1);
		setRotationAngle(rightPunch5_r1, -1.5708F, 0.0F, 0.0F);
		rightPunch5_r1.setTextureOffset(0, 44).addCuboid(-6.0F, -6.0F, 0.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		leftPuch = new ModelPart(this);
		leftPuch.setPivot(-5.0F, 0.0F, 0.0F);


		leftPunch1 = new ModelPart(this);
		leftPunch1.setPivot(5.0F, 2.0F, -3.0F);
		leftPuch.addChild(leftPunch1);


		leftPunch1_r1 = new ModelPart(this);
		leftPunch1_r1.setPivot(15.0F, 0.0F, 3.0F);
		leftPunch1.addChild(leftPunch1_r1);
		setRotationAngle(leftPunch1_r1, -1.5708F, 0.0F, 0.0F);
		leftPunch1_r1.setTextureOffset(45, 3).addCuboid(4.0F, -3.0F, -7.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		leftPunch2 = new ModelPart(this);
		leftPunch2.setPivot(5.0F, 2.0F, -3.0F);
		leftPuch.addChild(leftPunch2);


		leftPunch2_r1 = new ModelPart(this);
		leftPunch2_r1.setPivot(15.0F, 0.0F, 3.0F);
		leftPunch2.addChild(leftPunch2_r1);
		setRotationAngle(leftPunch2_r1, -1.5708F, 0.0F, 0.0F);
		leftPunch2_r1.setTextureOffset(45, 3).addCuboid(2.0F, -2.0F, 1.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		leftPunch3 = new ModelPart(this);
		leftPunch3.setPivot(5.0F, 2.0F, -3.0F);
		leftPuch.addChild(leftPunch3);


		leftPunch3_r1 = new ModelPart(this);
		leftPunch3_r1.setPivot(15.0F, 0.0F, 3.0F);
		leftPunch3.addChild(leftPunch3_r1);
		setRotationAngle(leftPunch3_r1, -1.5708F, 0.0F, 0.0F);
		leftPunch3_r1.setTextureOffset(45, 3).addCuboid(-5.0F, -8.0F, 2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		leftPunch4 = new ModelPart(this);
		leftPunch4.setPivot(5.0F, 2.0F, -3.0F);
		leftPuch.addChild(leftPunch4);


		leftPunch4_r1 = new ModelPart(this);
		leftPunch4_r1.setPivot(15.0F, 0.0F, 3.0F);
		leftPunch4.addChild(leftPunch4_r1);
		setRotationAngle(leftPunch4_r1, -1.5708F, 0.0F, 0.0F);
		leftPunch4_r1.setTextureOffset(45, 3).addCuboid(-2.0F, 7.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		leftPunch5 = new ModelPart(this);
		leftPunch5.setPivot(5.0F, 2.0F, -3.0F);
		leftPuch.addChild(leftPunch5);


		leftPunch5_r1 = new ModelPart(this);
		leftPunch5_r1.setPivot(15.0F, 0.0F, 3.0F);
		leftPunch5.addChild(leftPunch5_r1);
		setRotationAngle(leftPunch5_r1, -1.5708F, 0.0F, 0.0F);
		leftPunch5_r1.setTextureOffset(45, 3).addCuboid(-6.0F, 0.0F, -11.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		cloud = new ModelPart(this);
		cloud.setPivot(0.0F, 24.0F, 0.0F);


		cloud1 = new ModelPart(this);
		cloud1.setPivot(0.0F, -7.0F, 0.0F);
		cloud.addChild(cloud1);
		setRotationAngle(cloud1, 0.0F, -1.2217F, 0.0F);
		cloud1.setTextureOffset(19, 29).addCuboid(-4.0F, -7.0F, -22.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		cloud1.setTextureOffset(19, 28).addCuboid(-3.0F, -8.001F, -21.5F, 4.0F, 4.0F, 2.0F, 0.0F, false);
		cloud1.setTextureOffset(19, 30).addCuboid(-5.0F, -6.5F, -21.5F, 9.0F, 2.0F, 2.0F, 0.0F, false);

		cloud2 = new ModelPart(this);
		cloud2.setPivot(0.0F, -23.0F, 0.0F);
		cloud.addChild(cloud2);
		cloud2.setTextureOffset(19, 29).addCuboid(-4.0F, -7.0F, -22.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		cloud2.setTextureOffset(19, 28).addCuboid(-3.0F, -8.001F, -21.5F, 4.0F, 4.0F, 2.0F, 0.0F, false);
		cloud2.setTextureOffset(19, 30).addCuboid(-5.0F, -6.5F, -21.5F, 9.0F, 2.0F, 2.0F, 0.0F, false);

		cloud3 = new ModelPart(this);
		cloud3.setPivot(0.0F, -18.0F, 0.0F);
		cloud.addChild(cloud3);
		setRotationAngle(cloud3, 0.0F, 2.138F, 0.0F);
		cloud3.setTextureOffset(19, 29).addCuboid(-4.0F, -7.0F, -22.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		cloud3.setTextureOffset(19, 28).addCuboid(-3.0F, -8.001F, -21.5F, 4.0F, 4.0F, 2.0F, 0.0F, false);
		cloud3.setTextureOffset(19, 30).addCuboid(-5.0F, -6.5F, -21.5F, 9.0F, 2.0F, 2.0F, 0.0F, false);

		cloud4 = new ModelPart(this);
		cloud4.setPivot(0.0F, -18.0F, 0.0F);
		cloud.addChild(cloud4);
		setRotationAngle(cloud4, 0.0F, -0.7418F, 0.0F);
		cloud4.setTextureOffset(19, 27).addCuboid(-5.0F, -8.0F, -22.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);
		cloud4.setTextureOffset(19, 27).addCuboid(-4.0F, -9.001F, -21.5F, 5.0F, 5.0F, 3.0F, 0.0F, false);
		cloud4.setTextureOffset(20, 44).addCuboid(-7.0F, -7.5F, -21.5F, 11.0F, 3.0F, 3.0F, 0.0F, false);
		cloud4.setTextureOffset(20, 44).addCuboid(-8.0F, -7.0F, -21.0F, 13.0F, 2.0F, 2.0F, 0.0F, false);

		cloud5 = new ModelPart(this);
		cloud5.setPivot(0.0F, -12.0F, 0.0F);
		cloud.addChild(cloud5);
		setRotationAngle(cloud5, 0.0F, 0.829F, 0.0F);
		cloud5.setTextureOffset(19, 27).addCuboid(-5.0F, -8.0F, -16.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);
		cloud5.setTextureOffset(19, 28).addCuboid(-4.0F, -9.001F, -15.5F, 5.0F, 5.0F, 3.0F, 0.0F, false);
		cloud5.setTextureOffset(20, 44).addCuboid(-7.0F, -7.5F, -15.5F, 11.0F, 3.0F, 3.0F, 0.0F, false);
		cloud5.setTextureOffset(20, 44).addCuboid(-8.0F, -7.0F, -15.0F, 13.0F, 2.0F, 2.0F, 0.0F, false);

		cloud6 = new ModelPart(this);
		cloud6.setPivot(0.0F, -19.0F, 0.0F);
		cloud.addChild(cloud6);
		setRotationAngle(cloud6, 0.0F, 3.0543F, 0.0F);
		cloud6.setTextureOffset(19, 27).addCuboid(-5.0F, -8.0F, -13.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);
		cloud6.setTextureOffset(19, 28).addCuboid(-4.0F, -9.001F, -12.5F, 5.0F, 5.0F, 3.0F, 0.0F, false);
		cloud6.setTextureOffset(20, 44).addCuboid(-7.0F, -7.5F, -12.5F, 11.0F, 3.0F, 3.0F, 0.0F, false);
		cloud6.setTextureOffset(20, 44).addCuboid(-8.0F, -7.0F, -12.0F, 13.0F, 2.0F, 2.0F, 0.0F, false);

		cloud7 = new ModelPart(this);
		cloud7.setPivot(0.0F, -18.0F, 0.0F);
		cloud.addChild(cloud7);
		setRotationAngle(cloud7, 0.0F, -2.2253F, 0.0F);
		cloud7.setTextureOffset(19, 29).addCuboid(-4.0F, -7.0F, -22.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		cloud7.setTextureOffset(19, 28).addCuboid(-3.0F, -8.001F, -21.5F, 4.0F, 4.0F, 2.0F, 0.0F, false);
		cloud7.setTextureOffset(19, 30).addCuboid(-5.0F, -6.5F, -21.5F, 9.0F, 2.0F, 2.0F, 0.0F, false);

		cloud8 = new ModelPart(this);
		cloud8.setPivot(0.0F, -22.0F, 0.0F);
		cloud.addChild(cloud8);
		setRotationAngle(cloud8, 0.0F, -1.9635F, 0.0F);
		cloud8.setTextureOffset(19, 27).addCuboid(-5.0F, 5.0F, -16.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);
		cloud8.setTextureOffset(19, 28).addCuboid(-4.0F, 3.999F, -15.5F, 5.0F, 5.0F, 3.0F, 0.0F, false);
		cloud8.setTextureOffset(20, 44).addCuboid(-7.0F, 5.5F, -15.5F, 11.0F, 3.0F, 3.0F, 0.0F, false);
		cloud8.setTextureOffset(20, 44).addCuboid(-8.0F, 6.0F, -15.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cloud8.setTextureOffset(20, 44).addCuboid(4.0F, 6.0F, -15.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		cloud9 = new ModelPart(this);
		cloud9.setPivot(0.0F, -8.0F, 0.0F);
		cloud.addChild(cloud9);
		setRotationAngle(cloud9, 0.0F, 2.5744F, 0.0F);
		cloud9.setTextureOffset(19, 27).addCuboid(-5.0F, -8.0F, -22.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);
		cloud9.setTextureOffset(19, 28).addCuboid(-4.0F, -9.001F, -21.5F, 5.0F, 5.0F, 3.0F, 0.0F, false);
		cloud9.setTextureOffset(20, 44).addCuboid(-7.0F, -7.5F, -21.5F, 11.0F, 3.0F, 3.0F, 0.0F, false);
		cloud9.setTextureOffset(20, 44).addCuboid(-8.0F, -7.0F, -21.0F, 13.0F, 2.0F, 2.0F, 0.0F, false);

		cloud10 = new ModelPart(this);
		cloud10.setPivot(0.0F, -23.0F, 0.0F);
		cloud.addChild(cloud10);
		setRotationAngle(cloud10, 0.0F, 1.0908F, 0.0F);
		cloud10.setTextureOffset(19, 29).addCuboid(-4.0F, -7.0F, -22.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		cloud10.setTextureOffset(19, 28).addCuboid(-3.0F, -8.001F, -21.5F, 4.0F, 4.0F, 2.0F, 0.0F, false);
		cloud10.setTextureOffset(19, 30).addCuboid(-5.0F, -6.5F, -21.5F, 9.0F, 2.0F, 2.0F, 0.0F, false);

		cloud11 = new ModelPart(this);
		cloud11.setPivot(0.0F, -7.0F, 0.0F);
		cloud.addChild(cloud11);
		setRotationAngle(cloud11, 0.0F, -0.3927F, 0.0F);
		cloud11.setTextureOffset(19, 29).addCuboid(-4.0F, -7.0F, -13.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		cloud11.setTextureOffset(19, 28).addCuboid(-3.0F, -8.001F, -12.5F, 4.0F, 4.0F, 2.0F, 0.0F, false);
		cloud11.setTextureOffset(19, 30).addCuboid(-5.0F, -6.5F, -12.5F, 9.0F, 2.0F, 2.0F, 0.0F, false);
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
		this.rightPunch5.yaw =-45+ MathHelper.cos(speed * animationProgress + (float)1.5707963267948966D) * 1.6F * power;
		this.leftPuch.pitch = headPitch * 0.017453292F;
		this.leftPuch.yaw = headYaw * 0.017453292F;
		this.rightPunch.pitch = headPitch * 0.017453292F;
		this.rightPunch.yaw = headYaw * 0.017453292F;
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
		this.rightPunch5.pivotZ = offycos;
		float offxl = r * MathHelper.sin(r * speed * animationProgress) * power + 0.2F;
		float offxr = r * MathHelper.sin(r * speed * animationProgress) * power - 0.2F;
		this.leftPuch.pivotX = offxl;
		this.rightPunch.pivotX = offxr;
	}
	@Override
	public void setAngles(LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		this.yOffset = (double)MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;
		float speed = 0.002F;
		this.head.pitch = headPitch * 0.017453292F;
		this.head.yaw = headYaw * 0.017453292F;
		this.cloud1.yaw = 70F - animationProgress*speed*1.1F;
		this.cloud2.yaw = 50F - animationProgress*speed*0.9F;
		this.cloud3.yaw = -122.5F + animationProgress*speed*0.95F;
		this.cloud4.yaw = 42.5F - animationProgress*speed*0.85F;
		this.cloud5.yaw = -47.5F - animationProgress*speed*0.9F;
		this.cloud6.yaw = -175F + animationProgress*speed*1.05F;
		this.cloud7.yaw = 127.5F - animationProgress*speed*0.91F;
		this.cloud8.yaw = 112.5F + animationProgress*speed*1.08F;
		this.cloud9.yaw = -147.5F - animationProgress*speed*0.98F;
		this.cloud10.yaw = -62.6F + animationProgress*speed*1.11F;
		this.cloud11.yaw = 22.5F - animationProgress*speed*0.94F;
	}

	@Override
	public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		matrixStack.translate(-0.45D, this.yOffset - 0.2D, 0.75D);
		this.head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.upper.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);

	}
	public void renderCloud(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		this.cloud.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void renderAttack(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		matrixStack.translate(0.0D, this.yOffset, -0.75D);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		upperAttack.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.translate(-0.2D, -this.yOffset, 0);

		rightPunch.render(matrixStack, buffer, packedLight, packedOverlay);
		leftPuch.render(matrixStack, buffer, packedLight, packedOverlay);

	}

	public final void renderPunchyArms(@NotNull MatrixStack matrices, @NotNull VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
		this.leftPuch.render(matrices, vertices, light, overlay, red, green, blue, alpha);
		this.rightPunch.render(matrices, vertices, light, overlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelPart bone, float x, float y, float z) {
			bone.pitch = x;
			bone.yaw = y;
			bone.roll = z;
	}
}