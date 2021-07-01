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

public class KillerQueenAttackingModel extends EntityModel<LivingEntity> {
private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart chestbot;
	private final ModelPart bodybot;
	private final ModelPart cloth;
	private final ModelPart cloth1;
	private final ModelPart cloth2;
	private final ModelPart cloth3;
	private final ModelPart cloth4;
	private final ModelPart cloth5;
	private final ModelPart cloth6;
	private final ModelPart leftarm;
	private final ModelPart rightarm;
	private final ModelPart head;
	private final ModelPart leftleg;
	private final ModelPart leftlegbot;
	private final ModelPart rightleg;
	private final ModelPart rightlegbot;
	private final ModelPart righthands;
	private final ModelPart righthand1;
	private final ModelPart righthand2;
	private final ModelPart righthand3;
	private final ModelPart righthand4;
	private final ModelPart righthand5;
	private final ModelPart leftahands;
	private final ModelPart lefthand1;
	private final ModelPart lefthand2;
	private final ModelPart lefthand3;
	private final ModelPart lefthand4;
	private final ModelPart lefthand5;
	private double yOffset;
	private double zOffset;

public KillerQueenAttackingModel() {
	textureWidth = 128;
	textureHeight = 128;
	body = new ModelPart(this);
	body.setPivot(0.0F, -2.0F, 0.0F);
	setRotationAngle(body, 0.1745F, 0.0F, 0.0F);
	body.setTextureOffset(0, 23).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F, 0.0F, false);

	chest = new ModelPart(this);
	chest.setPivot(0.0F, 0.0F, 0.0F);
	body.addChild(chest);
	setRotationAngle(chest, -0.0873F, 0.0F, 0.0F);
	chest.setTextureOffset(52, 36).addCuboid(-3.5F, 0.5F, -2.5F, 7.0F, 4.0F, 1.0F, 0.0F, false);

	chestbot = new ModelPart(this);
	chestbot.setPivot(0.0F, 0.0F, -2.3F);
	body.addChild(chestbot);
	setRotationAngle(chestbot, -0.0873F, 0.0F, 0.0F);
	chestbot.setTextureOffset(0, 0).addCuboid(-1.5F, 4.0F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

	bodybot = new ModelPart(this);
	bodybot.setPivot(0.0F, 0.0F, 0.0F);
	body.addChild(bodybot);
	setRotationAngle(bodybot, -0.0175F, 0.0F, 0.0F);
	bodybot.setTextureOffset(16, 45).addCuboid(-3.5F, 7.0F, -2.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);

	cloth = new ModelPart(this);
	cloth.setPivot(0.0F, 0.0F, 0.0F);
	body.addChild(cloth);


	cloth1 = new ModelPart(this);
	cloth1.setPivot(0.0F, 12.0F, -4.0F);
	cloth.addChild(cloth1);
	setRotationAngle(cloth1, -0.4887F, 0.0F, 0.0F);
	cloth1.setTextureOffset(0, 4).addCuboid(-1.0F, -2.5F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

	cloth2 = new ModelPart(this);
	cloth2.setPivot(0.0F, 12.5F, 1.5F);
	cloth.addChild(cloth2);
	setRotationAngle(cloth2, 0.4102F, 0.0F, 0.0F);
	cloth2.setTextureOffset(42, 30).addCuboid(-4.5F, -2.0F, 1.5F, 9.0F, 5.0F, 1.0F, 0.0F, false);

	cloth3 = new ModelPart(this);
	cloth3.setPivot(-3.0F, 11.0F, 1.0F);
	cloth.addChild(cloth3);
	setRotationAngle(cloth3, -0.0611F, 0.0873F, 0.6109F);
	cloth3.setTextureOffset(46, 49).addCuboid(-2.0F, -0.5F, -4.0F, 1.0F, 5.0F, 6.0F, 0.0F, false);

	cloth4 = new ModelPart(this);
	cloth4.setPivot(3.0F, 10.0F, 1.0F);
	cloth.addChild(cloth4);
	setRotationAngle(cloth4, -0.0611F, -0.0873F, -0.7854F);
	cloth4.setTextureOffset(32, 49).addCuboid(0.5F, 0.0F, -4.0F, 1.0F, 5.0F, 6.0F, 0.0F, false);

	cloth5 = new ModelPart(this);
	cloth5.setPivot(4.0F, 12.0F, 0.3F);
	cloth.addChild(cloth5);
	setRotationAngle(cloth5, -0.576F, -0.0873F, -0.4363F);
	cloth5.setTextureOffset(0, 57).addCuboid(-4.0F, -0.5F, -3.8F, 5.0F, 5.0F, 1.0F, 0.0F, false);

	cloth6 = new ModelPart(this);
	cloth6.setPivot(-3.7F, 11.0F, 0.8F);
	cloth.addChild(cloth6);
	setRotationAngle(cloth6, -0.4189F, 0.1745F, 0.4363F);
	cloth6.setTextureOffset(40, 49).addCuboid(-0.3F, 0.0F, -4.0F, 5.0F, 5.0F, 1.0F, 0.0F, false);

	leftarm = new ModelPart(this);
	leftarm.setPivot(5.0F, 2.0F, 0.0F);
	body.addChild(leftarm);
	setRotationAngle(leftarm, -0.2618F, 0.0F, 0.0F);
	leftarm.setTextureOffset(0, 48).addCuboid(-1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);

	rightarm = new ModelPart(this);
	rightarm.setPivot(-6.0F, 2.0F, 0.5F);
	body.addChild(rightarm);
	setRotationAngle(rightarm, -0.6109F, 0.0F, 0.0F);
	rightarm.setTextureOffset(47, 0).addCuboid(-2.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);

	head = new ModelPart(this);
	head.setPivot(0.0F, -1.0F, 0.0F);
	head.setTextureOffset(0, 0).addCuboid(-3.5F, -7.0F, -4.0F, 7.0F, 7.0F, 8.0F, 0.0F, false);
	head.setTextureOffset(55, 55).addCuboid(2.5F, -9.0F, -3.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);
	head.setTextureOffset(22, 0).addCuboid(-2.5F, -8.0F, -3.5F, 5.0F, 1.0F, 7.0F, 0.0F, false);
	head.setTextureOffset(54, 44).addCuboid(-3.5F, -9.0F, -3.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);

	leftleg = new ModelPart(this);
	leftleg.setPivot(2.0F, 11.0F, 3.0F);
	setRotationAngle(leftleg, -0.192F, -0.0524F, -0.2618F);
	leftleg.setTextureOffset(37, 37).addCuboid(-2.0F, -2.0F, -3.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

	leftlegbot = new ModelPart(this);
	leftlegbot.setPivot(0.0F, 6.0F, -1.0F);
	leftleg.addChild(leftlegbot);
	setRotationAngle(leftlegbot, 0.6109F, 0.0F, 0.0F);
	leftlegbot.setTextureOffset(34, 8).addCuboid(-1.5F, -1.5F, -1.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);

	rightleg = new ModelPart(this);
	rightleg.setPivot(-2.0F, 10.0F, 4.0F);
	setRotationAngle(rightleg, -0.5411F, -0.0087F, 0.2443F);
	rightleg.setTextureOffset(0, 34).addCuboid(-3.0F, 0.0F, -3.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

	rightlegbot = new ModelPart(this);
	rightlegbot.setPivot(0.2077F, 3.6937F, 3.8524F);
	rightleg.addChild(rightlegbot);
	setRotationAngle(rightlegbot, 0.7854F, 0.0F, 0.0F);
	rightlegbot.setTextureOffset(24, 27).addCuboid(-2.7077F, -1.6937F, -7.3524F, 4.0F, 9.0F, 5.0F, 0.0F, false);

	righthands = new ModelPart(this);
	righthands.setPivot(0.0F, 0.0F, 0.0F);


	righthand1 = new ModelPart(this);
	righthand1.setPivot(0.0F, 0.0F, 0.0F);
	righthands.addChild(righthand1);
	setRotationAngle(righthand1, -1.5708F, 1.5708F, 0.0F);
	righthand1.setTextureOffset(38, 23).addCuboid(-8.0F, 19.0F, -1.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);

	righthand2 = new ModelPart(this);
	righthand2.setPivot(0.0F, 0.0F, 0.0F);
	righthands.addChild(righthand2);
	setRotationAngle(righthand2, -1.5708F, 1.5708F, 0.0F);
	righthand2.setTextureOffset(38, 23).addCuboid(-3.0F, 12.0F, 5.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);

	righthand3 = new ModelPart(this);
	righthand3.setPivot(0.0F, 0.0F, 0.0F);
	righthands.addChild(righthand3);
	setRotationAngle(righthand3, -1.5708F, 1.5708F, 0.0F);
	righthand3.setTextureOffset(38, 23).addCuboid(0.0F, 12.0F, -8.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);

	righthand4 = new ModelPart(this);
	righthand4.setPivot(-2.0F, 6.0F, 7.0F);
	righthands.addChild(righthand4);
	setRotationAngle(righthand4, -1.5708F, 1.5708F, 0.0F);
	righthand4.setTextureOffset(38, 23).addCuboid(4.0F, 10.0F, -8.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);

	righthand5 = new ModelPart(this);
	righthand5.setPivot(-3.0F, 4.0F, -5.0F);
	righthands.addChild(righthand5);
	setRotationAngle(righthand5, -1.5708F, 1.5708F, 0.0F);
	righthand5.setTextureOffset(38, 23).addCuboid(0.0F, 12.0F, -8.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);

	leftahands = new ModelPart(this);
	leftahands.setPivot(0.0F, 0.0F, 0.0F);


	lefthand1 = new ModelPart(this);
	lefthand1.setPivot(0.0F, 0.0F, 0.0F);
	leftahands.addChild(lefthand1);
	setRotationAngle(lefthand1, -1.5708F, -1.5708F, 0.0F);
	lefthand1.setTextureOffset(38, 23).addCuboid(-12.0F, 18.0F, -1.0F, 8.0F, 3.0F, 4.0F, 0.0F, true);

	lefthand2 = new ModelPart(this);
	lefthand2.setPivot(0.0F, 0.0F, 0.0F);
	leftahands.addChild(lefthand2);
	setRotationAngle(lefthand2, -1.5708F, -1.5708F, 0.0F);
	lefthand2.setTextureOffset(38, 23).addCuboid(-4.0F, 13.0F, 5.0F, 8.0F, 3.0F, 4.0F, 0.0F, true);

	lefthand3 = new ModelPart(this);
	lefthand3.setPivot(0.0F, 0.0F, 0.0F);
	leftahands.addChild(lefthand3);
	setRotationAngle(lefthand3, -1.5708F, -1.5708F, 0.0F);
	lefthand3.setTextureOffset(38, 23).addCuboid(0.0F, 13.0F, -8.0F, 8.0F, 3.0F, 4.0F, 0.0F, true);

	lefthand4 = new ModelPart(this);
	lefthand4.setPivot(3.0F, 6.0F, 4.0F);
	leftahands.addChild(lefthand4);
	setRotationAngle(lefthand4, -1.5708F, -1.5708F, 0.0F);
	lefthand4.setTextureOffset(38, 23).addCuboid(0.0F, 10.0F, -8.0F, 8.0F, 3.0F, 4.0F, 0.0F, true);

	lefthand5 = new ModelPart(this);
	lefthand5.setPivot(-2.0F, 3.0F, -10.0F);
	leftahands.addChild(lefthand5);
	setRotationAngle(lefthand5, -1.5708F, -1.5708F, 0.0F);
	lefthand5.setTextureOffset(38, 23).addCuboid(0.0F, 13.0F, -8.0F, 8.0F, 3.0F, 4.0F, 0.0F, true);

}
@Override
public void setAngles(LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
	float power = 0.5F;
	float speed = 2.5F;
	this.yOffset = (double)MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;
	this.head.pitch = headPitch * 0.017453292F;
	this.head.yaw = headYaw * 0.017453292F;
	this.lefthand1.yaw =-45+ MathHelper.cos(speed * animationProgress) * 1.2F * power;
	this.lefthand2.yaw =-45+ MathHelper.cos(speed * animationProgress + 1.0471976F) * 1.4F * power;
	this.lefthand3.yaw =-45+ MathHelper.cos(speed * animationProgress + (float)2.0943951023931953D) * 1.6F * power;
	this.lefthand4.yaw =-45+ MathHelper.cos(speed * animationProgress + (float)2.6179938779914944D) * 1.3F * power;
	this.lefthand5.yaw =-45+ MathHelper.cos(speed * animationProgress + (float)3.141592653589793D) * 1.7F * power;
	this.righthand1.yaw =45- MathHelper.cos(speed * animationProgress + (float)3.665191429188092D) * 1.2F * power;
	this.righthand2.yaw =45- MathHelper.cos(speed * animationProgress + (float)6.283185307179586D) * 1.1F * power;
	this.righthand3.yaw =45- MathHelper.cos(speed * animationProgress + (float)8.377580409572781D) * 1.4F * power;
	this.righthand4.yaw =45- MathHelper.cos(speed * animationProgress + (float)10.471975511965978D) * 1.5F * power;
	this.righthand5.yaw =45- MathHelper.cos(speed * animationProgress + (float)1.5707963267948966D) * 1.6F * power;
	this.leftahands.pitch = headPitch * 0.017453292F;
	this.leftahands.yaw = headYaw * 0.017453292F;
	this.righthands.pitch = headPitch * 0.017453292F;
	this.righthands.yaw = headYaw * 0.017453292F;
	float r = (float)Math.random();
	float offysin = MathHelper.sin(r * speed * animationProgress) * power - 0.25F;
	float offycos = MathHelper.cos(r * speed * animationProgress) * power - 0.25F;
	this.lefthand1.pivotZ = offysin;
	this.lefthand2.pivotZ = offycos;
	this.lefthand3.pivotZ = offysin;
	this.lefthand4.pivotZ = offycos;
	this.lefthand5.pivotZ = offysin;
	this.righthand1.pivotZ = offycos;
	this.righthand2.pivotZ = offysin;
	this.righthand3.pivotZ = offycos;
	this.righthand4.pivotZ = offysin;
	this.righthand5.pivotZ = offycos;
	float offxl = r * MathHelper.sin(r * speed * animationProgress) * power + 0.2F;
	float offxr = r * MathHelper.sin(r * speed * animationProgress) * power - 0.2F;
	this.leftahands.pivotX = offxl;
	this.righthands.pivotX = offxr;
}



@Override
public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
	    matrixStack.translate(0.0D, this.yOffset, -0.75D);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.translate(0.0D, -this.yOffset, 0.0D);

		righthands.render(matrixStack, buffer, packedLight, packedOverlay);
		leftahands.render(matrixStack, buffer, packedLight, packedOverlay);
}
public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
}
	public final void renderPunchyArms(@NotNull MatrixStack matrices, @NotNull VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
		this.leftahands.render(matrices, vertices, light, overlay, red, green, blue, alpha);
		this.righthands.render(matrices, vertices, light, overlay, red, green, blue, alpha);
	}
	}