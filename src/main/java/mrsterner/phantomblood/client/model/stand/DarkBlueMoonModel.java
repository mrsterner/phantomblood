// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports

	package mrsterner.phantomblood.client.model.stand;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.PiglinEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.NotNull;

public class DarkBlueMoonModel extends EntityModel<LivingEntity> {
	private final ModelPart head;
	private final ModelPart mask;
	private final ModelPart head_r1;
	private final ModelPart head_r2;
	private final ModelPart head_r3;
	private final ModelPart head_r4;
	private final ModelPart finBones;
	private final ModelPart fin2_r1;
	private final ModelPart fin2_r2;
	private final ModelPart fin1_r1;
	private final ModelPart finBone1;
	private final ModelPart bone3;
	private final ModelPart finBone2;
	private final ModelPart bone2;
	private final ModelPart finBone3;
	private final ModelPart bone4;
	private final ModelPart finBone4;
	private final ModelPart bone5;
	private final ModelPart body;
	private final ModelPart fin2_r3;
	private final ModelPart fin2_r4;
	private final ModelPart lower;
	private final ModelPart right;
	private final ModelPart rightKnee;
	private final ModelPart rightUpper_r1;
	private final ModelPart rightUpper_r2;
	private final ModelPart rightLower;
	private final ModelPart finBone10;
	private final ModelPart bone11;
	private final ModelPart left;
	private final ModelPart fin2_r5;
	private final ModelPart leftUpper_r1;
	private final ModelPart leftLower;
	private final ModelPart leftLower_r1;
	private final ModelPart rightKnee2;
	private final ModelPart rightUpper_r3;
	private final ModelPart rightUpper_r4;
	private final ModelPart finBone8;
	private final ModelPart bone9;
	private final ModelPart finBone9;
	private final ModelPart bone10;
	private final ModelPart finBone5;
	private final ModelPart bone6;
	private final ModelPart finBone6;
	private final ModelPart bone7;
	private final ModelPart finBone7;
	private final ModelPart bone8;
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
	private double yOffset;

	public DarkBlueMoonModel() {
		textureWidth = 128;
		textureHeight = 128;
		head = new ModelPart(this);
		head.setPivot(0.0F, -5.0F, 0.0F);
		head.setTextureOffset(1, 1).addCuboid(-3.5F, -7.0F, -3.8F, 7.0F, 7.0F, 7.0F, 0.0F, false);

		mask = new ModelPart(this);
		mask.setPivot(0.0F, 0.0F, 0.0F);
		head.addChild(mask);
		mask.setTextureOffset(80, 9).addCuboid(2.65F, -4.0F, -4.2F, 1.0F, 1.0F, 2.0F, 0.101F, false);
		mask.setTextureOffset(72, 6).addCuboid(-0.5F, -5.5F, -4.2F, 1.0F, 4.0F, 2.0F, 0.05F, false);
		mask.setTextureOffset(72, 20).addCuboid(-3.65F, -4.0F, -4.2F, 1.0F, 1.0F, 2.0F, 0.101F, false);
		mask.setTextureOffset(69, 52).addCuboid(-2.5F, -4.0F, -4.2F, 5.0F, 1.0F, 1.0F, 0.045F, false);

		head_r1 = new ModelPart(this);
		head_r1.setPivot(0.0F, -5.55F, -4.25F);
		mask.addChild(head_r1);
		setRotationAngle(head_r1, -0.1309F, 0.0F, 0.0F);
		head_r1.setTextureOffset(71, 40).addCuboid(-2.5F, -2.05F, 0.05F, 5.0F, 2.0F, 1.0F, 0.0505F, false);

		head_r2 = new ModelPart(this);
		head_r2.setPivot(0.0F, -1.45F, -4.25F);
		mask.addChild(head_r2);
		setRotationAngle(head_r2, 0.1309F, 0.0F, 0.0F);
		head_r2.setTextureOffset(71, 24).addCuboid(-2.5F, 0.05F, 0.05F, 5.0F, 2.0F, 1.0F, 0.0501F, false);

		head_r3 = new ModelPart(this);
		head_r3.setPivot(-4.0F, -4.1F, -4.3F);
		mask.addChild(head_r3);
		setRotationAngle(head_r3, -0.1309F, 0.0F, 0.0F);
		head_r3.setTextureOffset(72, 15).addCuboid(0.35F, -3.1F, 0.1F, 1.0F, 3.0F, 2.0F, 0.1F, false);
		head_r3.setTextureOffset(80, 9).addCuboid(6.65F, -3.1F, 0.1F, 1.0F, 3.0F, 2.0F, 0.1F, false);

		head_r4 = new ModelPart(this);
		head_r4.setPivot(-4.0F, -2.9F, -4.3F);
		mask.addChild(head_r4);
		setRotationAngle(head_r4, 0.1309F, 0.0F, 0.0F);
		head_r4.setTextureOffset(72, 20).addCuboid(0.35F, 0.1F, 0.1F, 1.0F, 3.0F, 2.0F, 0.1F, false);
		head_r4.setTextureOffset(80, 10).addCuboid(6.65F, 0.1F, 0.1F, 1.0F, 3.0F, 2.0F, 0.1F, false);

		finBones = new ModelPart(this);
		finBones.setPivot(0.0F, -4.0F, 2.5F);
		head.addChild(finBones);


		fin2_r1 = new ModelPart(this);
		fin2_r1.setPivot(-3.0F, -3.0F, 0.5F);
		finBones.addChild(fin2_r1);
		setRotationAngle(fin2_r1, -2.0071F, 0.0F, 0.0F);
		fin2_r1.setTextureOffset(24, 63).addCuboid(3.0F, -6.0F, 1.0F, 0.0F, 5.0F, 7.0F, 0.0F, false);

		fin2_r2 = new ModelPart(this);
		fin2_r2.setPivot(-3.0F, -3.0F, 0.5F);
		finBones.addChild(fin2_r2);
		setRotationAngle(fin2_r2, -1.309F, 0.0F, 0.0F);
		fin2_r2.setTextureOffset(41, 59).addCuboid(3.0F, -4.0F, -2.0F, 0.0F, 5.0F, 7.0F, 0.0F, false);

		fin1_r1 = new ModelPart(this);
		fin1_r1.setPivot(-3.0F, -3.0F, 0.5F);
		finBones.addChild(fin1_r1);
		setRotationAngle(fin1_r1, -0.2182F, 0.0F, 0.0F);
		fin1_r1.setTextureOffset(18, 59).addCuboid(3.0F, -4.0F, -4.0F, 0.0F, 5.0F, 6.0F, 0.0F, false);

		finBone1 = new ModelPart(this);
		finBone1.setPivot(0.0F, -3.0F, -0.5F);
		finBones.addChild(finBone1);
		setRotationAngle(finBone1, -0.6109F, 0.0F, 0.0F);
		finBone1.setTextureOffset(33, 65).addCuboid(-0.5F, -3.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bone3 = new ModelPart(this);
		bone3.setPivot(0.0F, -3.0F, 0.0F);
		finBone1.addChild(bone3);
		setRotationAngle(bone3, -0.4363F, 0.0F, 0.0F);
		bone3.setTextureOffset(37, 67).addCuboid(-0.5F, -1.9F, 0.0F, 1.0F, 2.0F, 1.0F, -0.1F, false);

		finBone2 = new ModelPart(this);
		finBone2.setPivot(0.0F, -3.0F, -4.5F);
		finBones.addChild(finBone2);
		setRotationAngle(finBone2, -0.1745F, 0.0F, 0.0F);
		finBone2.setTextureOffset(33, 65).addCuboid(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		finBone2.setTextureOffset(33, 65).addCuboid(-0.5F, -3.1F, 0.0F, 1.0F, 2.0F, 1.0F, -0.1F, false);

		bone2 = new ModelPart(this);
		bone2.setPivot(0.0F, -3.0F, 0.0F);
		finBone2.addChild(bone2);
		setRotationAngle(bone2, -0.4363F, 0.0F, 0.0F);
		bone2.setTextureOffset(37, 67).addCuboid(-0.5F, -1.9F, 0.0F, 1.0F, 2.0F, 1.0F, -0.15F, false);

		finBone3 = new ModelPart(this);
		finBone3.setPivot(0.0F, 0.0F, 0.5F);
		finBones.addChild(finBone3);
		setRotationAngle(finBone3, -1.5708F, 0.0F, 0.0F);
		finBone3.setTextureOffset(33, 65).addCuboid(-0.5F, -3.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bone4 = new ModelPart(this);
		bone4.setPivot(0.0F, -3.0F, 0.0F);
		finBone3.addChild(bone4);
		setRotationAngle(bone4, -0.4363F, 0.0F, 0.0F);
		bone4.setTextureOffset(37, 67).addCuboid(-0.5F, -1.9F, 0.0F, 1.0F, 2.0F, 1.0F, -0.1F, false);

		finBone4 = new ModelPart(this);
		finBone4.setPivot(0.0F, -1.0F, -2.5F);
		finBones.addChild(finBone4);
		setRotationAngle(finBone4, -1.9199F, 0.0F, 0.0F);
		finBone4.setTextureOffset(33, 65).addCuboid(-0.5F, -6.0F, 3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bone5 = new ModelPart(this);
		bone5.setPivot(0.0F, -6.0F, 0.0F);
		finBone4.addChild(bone5);
		setRotationAngle(bone5, -0.4363F, 0.0F, 0.0F);
		bone5.setTextureOffset(37, 67).addCuboid(-0.5F, -3.1F, 2.7189F, 1.0F, 2.0F, 1.0F, -0.1F, false);

		body = new ModelPart(this);
		body.setPivot(0.0F, -5.0F, 0.0F);
		setRotationAngle(body, -0.3927F, 0.2618F, 0.0F);
		body.setTextureOffset(0, 15).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(54, 15).addCuboid(-3.5F, 0.5F, -2.5F, 7.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(59, 22).addCuboid(-1.5F, 4.5F, -2.25F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		fin2_r3 = new ModelPart(this);
		fin2_r3.setPivot(-3.0F, 2.0F, 2.0F);
		body.addChild(fin2_r3);
		setRotationAngle(fin2_r3, -1.9635F, 0.0F, 0.0F);
		fin2_r3.setTextureOffset(41, 69).addCuboid(3.0F, -5.7F, 1.5F, 0.0F, 5.0F, 7.0F, 0.0F, false);

		fin2_r4 = new ModelPart(this);
		fin2_r4.setPivot(-3.0F, 2.0F, 2.0F);
		body.addChild(fin2_r4);
		setRotationAngle(fin2_r4, -1.7453F, 0.0F, 0.0F);
		fin2_r4.setTextureOffset(41, 64).addCuboid(3.0F, -4.7F, -2.0F, 0.0F, 5.0F, 7.0F, 0.0F, false);

		lower = new ModelPart(this);
		lower.setPivot(0.0F, 7.0F, 0.0F);
		body.addChild(lower);
		setRotationAngle(lower, 0.1309F, 0.0F, 0.0F);
		lower.setTextureOffset(41, 22).addCuboid(-3.5F, 0.0F, -2.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);
		lower.setTextureOffset(22, 0).addCuboid(-4.0F, 2.5F, -2.5F, 8.0F, 2.0F, 5.0F, 0.0F, false);
		lower.setTextureOffset(0, 69).addCuboid(3.0F, 1.5F, -2.0F, 2.0F, 4.0F, 4.0F, 0.1F, false);
		lower.setTextureOffset(0, 69).addCuboid(-5.0F, 1.5F, -2.0F, 2.0F, 4.0F, 4.0F, 0.1F, false);

		right = new ModelPart(this);
		right.setPivot(-2.25F, 5.0F, 0.0F);
		lower.addChild(right);
		setRotationAngle(right, -1.309F, 0.2182F, 0.1745F);
		right.setTextureOffset(20, 38).addCuboid(-2.75F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		rightKnee = new ModelPart(this);
		rightKnee.setPivot(-0.25F, 7.75F, -1.5F);
		right.addChild(rightKnee);


		rightUpper_r1 = new ModelPart(this);
		rightUpper_r1.setPivot(0.0F, 0.45F, -0.5F);
		rightKnee.addChild(rightUpper_r1);
		setRotationAngle(rightUpper_r1, -0.8727F, 0.0F, 0.0F);
		rightUpper_r1.setTextureOffset(55, 64).addCuboid(-2.0F, -2.0F, -2.0F, 4.0F, 2.0F, 2.0F, 0.001F, false);

		rightUpper_r2 = new ModelPart(this);
		rightUpper_r2.setPivot(0.0F, 0.45F, -0.5F);
		rightKnee.addChild(rightUpper_r2);
		setRotationAngle(rightUpper_r2, -0.2618F, 0.0F, 0.0F);
		rightUpper_r2.setTextureOffset(54, 60).addCuboid(-2.0F, -2.0F, 0.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);

		rightLower = new ModelPart(this);
		rightLower.setPivot(-0.25F, 6.5F, 0.0F);
		right.addChild(rightLower);
		setRotationAngle(rightLower, 1.9199F, 0.0F, 0.0F);
		rightLower.setTextureOffset(19, 21).addCuboid(-2.5F, -1.5F, -1.5F, 5.0F, 9.0F, 5.0F, -0.2F, false);

		finBone10 = new ModelPart(this);
		finBone10.setPivot(2.25F, -10.0F, 2.0F);
		right.addChild(finBone10);
		setRotationAngle(finBone10, -2.0071F, 0.0F, 0.0F);
		finBone10.setTextureOffset(33, 65).addCuboid(-3.0873F, -5.7202F, 9.5819F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		finBone10.setTextureOffset(33, 65).addCuboid(-3.0873F, -6.8202F, 9.5819F, 1.0F, 2.0F, 1.0F, -0.1F, false);

		bone11 = new ModelPart(this);
		bone11.setPivot(0.0F, -12.0F, -3.0F);
		finBone10.addChild(bone11);
		setRotationAngle(bone11, -0.4363F, 0.0F, 0.0F);
		bone11.setTextureOffset(37, 67).addCuboid(-3.0873F, -2.4322F, 13.6345F, 1.0F, 2.0F, 1.0F, -0.15F, false);

		left = new ModelPart(this);
		left.setPivot(2.0F, 5.0F, 0.0F);
		lower.addChild(left);
		setRotationAngle(left, 0.4363F, -0.1745F, -0.3927F);
		left.setTextureOffset(40, 38).addCuboid(-2.0F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		fin2_r5 = new ModelPart(this);
		fin2_r5.setPivot(-2.0F, 1.0F, 2.0F);
		left.addChild(fin2_r5);
		setRotationAngle(fin2_r5, -2.2253F, -0.0436F, 0.0F);
		fin2_r5.setTextureOffset(41, 74).addCuboid(3.0F, -3.7F, -2.0F, 0.0F, 5.0F, 7.0F, 0.0F, false);

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

		rightKnee2 = new ModelPart(this);
		rightKnee2.setPivot(-4.5F, 6.75F, -2.5F);
		left.addChild(rightKnee2);
		setRotationAngle(rightKnee2, -0.48F, 0.0F, 0.0F);


		rightUpper_r3 = new ModelPart(this);
		rightUpper_r3.setPivot(5.0F, 0.45F, -0.5F);
		rightKnee2.addChild(rightUpper_r3);
		setRotationAngle(rightUpper_r3, -0.8727F, 0.0F, 0.0F);
		rightUpper_r3.setTextureOffset(55, 64).addCuboid(-2.0F, -2.0F, -2.0F, 4.0F, 2.0F, 2.0F, 0.001F, false);

		rightUpper_r4 = new ModelPart(this);
		rightUpper_r4.setPivot(5.0F, 0.45F, -0.5F);
		rightKnee2.addChild(rightUpper_r4);
		setRotationAngle(rightUpper_r4, -0.2618F, 0.0F, 0.0F);
		rightUpper_r4.setTextureOffset(54, 60).addCuboid(-2.0F, -2.0F, 0.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);

		finBone8 = new ModelPart(this);
		finBone8.setPivot(-2.0F, -10.0F, 2.0F);
		left.addChild(finBone8);
		setRotationAngle(finBone8, -2.0071F, 0.0F, 0.0F);
		finBone8.setTextureOffset(33, 65).addCuboid(2.323F, -5.7579F, 8.7289F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		finBone8.setTextureOffset(33, 65).addCuboid(2.323F, -6.8579F, 8.7289F, 1.0F, 2.0F, 1.0F, -0.1F, false);

		bone9 = new ModelPart(this);
		bone9.setPivot(0.0F, -12.0F, -3.0F);
		finBone8.addChild(bone9);
		setRotationAngle(bone9, -0.4363F, 0.0F, 0.0F);
		bone9.setTextureOffset(37, 67).addCuboid(2.323F, -2.1058F, 12.8454F, 1.0F, 2.0F, 1.0F, -0.15F, false);

		finBone9 = new ModelPart(this);
		finBone9.setPivot(-2.0F, -10.0F, 2.0F);
		left.addChild(finBone9);
		setRotationAngle(finBone9, -2.0071F, 0.0F, 0.0F);
		finBone9.setTextureOffset(33, 65).addCuboid(2.2925F, -5.8581F, 12.0438F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		finBone9.setTextureOffset(33, 65).addCuboid(2.2925F, -6.9581F, 12.0438F, 1.0F, 2.0F, 1.0F, -0.1F, false);

		bone10 = new ModelPart(this);
		bone10.setPivot(0.0F, -12.0F, -3.0F);
		finBone9.addChild(bone10);
		setRotationAngle(bone10, -0.4363F, 0.0F, 0.0F);
		bone10.setTextureOffset(37, 67).addCuboid(2.2925F, -3.5977F, 15.8074F, 1.0F, 2.0F, 1.0F, -0.15F, false);

		finBone5 = new ModelPart(this);
		finBone5.setPivot(0.0F, -2.0F, 2.0F);
		body.addChild(finBone5);
		setRotationAngle(finBone5, -1.789F, 0.0F, 0.0F);
		finBone5.setTextureOffset(33, 65).addCuboid(-0.5F, -3.4095F, 1.8357F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		finBone5.setTextureOffset(33, 65).addCuboid(-0.5F, -4.5095F, 1.8357F, 1.0F, 2.0F, 1.0F, -0.1F, false);

		bone6 = new ModelPart(this);
		bone6.setPivot(0.0F, -12.0F, -3.0F);
		finBone5.addChild(bone6);
		setRotationAngle(bone6, -0.4363F, 0.0F, 0.0F);
		bone6.setTextureOffset(37, 67).addCuboid(-0.5F, 2.9357F, 7.5905F, 1.0F, 2.0F, 1.0F, -0.15F, false);

		finBone6 = new ModelPart(this);
		finBone6.setPivot(0.0F, 2.0F, 2.0F);
		body.addChild(finBone6);
		setRotationAngle(finBone6, -2.0071F, 0.0F, 0.0F);
		finBone6.setTextureOffset(33, 65).addCuboid(-0.5F, -3.4095F, 1.8357F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		finBone6.setTextureOffset(33, 65).addCuboid(-0.5F, -4.5095F, 1.8357F, 1.0F, 2.0F, 1.0F, -0.1F, false);

		bone7 = new ModelPart(this);
		bone7.setPivot(0.0F, -12.0F, -3.0F);
		finBone6.addChild(bone7);
		setRotationAngle(bone7, -0.4363F, 0.0F, 0.0F);
		bone7.setTextureOffset(37, 67).addCuboid(-0.5F, 2.9357F, 7.5905F, 1.0F, 2.0F, 1.0F, -0.15F, false);

		finBone7 = new ModelPart(this);
		finBone7.setPivot(0.0F, 5.0F, 2.0F);
		body.addChild(finBone7);
		setRotationAngle(finBone7, -2.3126F, 0.0F, 0.0F);
		finBone7.setTextureOffset(33, 65).addCuboid(-0.5F, -3.4095F, 1.8357F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		finBone7.setTextureOffset(33, 65).addCuboid(-0.5F, -4.5095F, 1.8357F, 1.0F, 2.0F, 1.0F, -0.1F, false);

		bone8 = new ModelPart(this);
		bone8.setPivot(0.0F, -12.0F, -3.0F);
		finBone7.addChild(bone8);
		setRotationAngle(bone8, -0.4363F, 0.0F, 0.0F);
		bone8.setTextureOffset(37, 67).addCuboid(-0.5F, 2.9357F, 7.5905F, 1.0F, 2.0F, 1.0F, -0.15F, false);

		upper = new ModelPart(this);
		upper.setPivot(0.0F, 0.0F, 0.0F);


		leftArm = new ModelPart(this);
		leftArm.setPivot(4.0F, -1.0F, -1.0F);
		upper.addChild(leftArm);
		setRotationAngle(leftArm, -1.1345F, 0.5236F, -0.9163F);
		leftArm.setTextureOffset(34, 50).addCuboid(0.0F, -3.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);

		leftUpperArm = new ModelPart(this);
		leftUpperArm.setPivot(2.0F, 0.5F, 0.5F);
		leftArm.addChild(leftUpperArm);
		leftUpperArm.setTextureOffset(52, 50).addCuboid(-1.5F, 0.5F, -2.5F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		leftHand = new ModelPart(this);
		leftHand.setPivot(-6.0F, 1.5F, -0.5F);
		leftUpperArm.addChild(leftHand);


		hand_r1 = new ModelPart(this);
		hand_r1.setPivot(6.0F, 3.0F, 0.0F);
		leftHand.addChild(hand_r1);
		setRotationAngle(hand_r1, -1.0908F, 0.0F, 0.0F);
		hand_r1.setTextureOffset(45, 3).addCuboid(-2.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		rightArm = new ModelPart(this);
		rightArm.setPivot(-4.0F, -3.0F, -2.0F);
		upper.addChild(rightArm);
		setRotationAngle(rightArm, -1.4835F, 0.0436F, 0.2618F);


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
	}

	@Override
	public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		matrixStack.translate(-0.45D, this.yOffset - 0.2D, 0.75D);
		this.head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.upper.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);

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