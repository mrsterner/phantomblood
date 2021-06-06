// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports

	package mrsterner.phantomblood.client.model.stand;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class KillerQueenAttackingModel extends EntityModel<LivingEntity> {
private final ModelPart body;
	private final ModelPart Shape10;
	private final ModelPart Shape11;
	private final ModelPart bodydown;
	private final ModelPart cloth;
	private final ModelPart cloth1;
	private final ModelPart cloth2;
	private final ModelPart cloth3;
	private final ModelPart cloth4;
	private final ModelPart cloth5;
	private final ModelPart cloth6;
	private final ModelPart crotch;
	private final ModelPart leftarm;
	private final ModelPart rightarm;
	private final ModelPart head;
	private final ModelPart leftleg;
	private final ModelPart legdownl;
	private final ModelPart rightleg;
	private final ModelPart legdownr;
	private final ModelPart hands_r;
	private final ModelPart r_hand1;
	private final ModelPart r_hand2;
	private final ModelPart r_hand3;
	private final ModelPart r_hand4;
	private final ModelPart r_hand5;
	private final ModelPart hands_l;
	private final ModelPart l_hand1;
	private final ModelPart l_hand2;
	private final ModelPart l_hand3;
	private final ModelPart l_hand4;
	private final ModelPart l_hand5;
	private double yOffset;
	private double zOffset;

public KillerQueenAttackingModel() {
		textureWidth = 128;
		textureHeight = 128;
		body = new ModelPart(this);
		body.setPivot(0.0F, -2.0F, 0.0F);
		setRotationAngle(body, 0.1745F, 0.0F, 0.0F);
		body.setTextureOffset(0, 23).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F, 0.0F, false);

		Shape10 = new ModelPart(this);
		Shape10.setPivot(0.0F, 0.0F, 0.0F);
		body.addChild(Shape10);
		setRotationAngle(Shape10, -0.0873F, 0.0F, 0.0F);
		Shape10.setTextureOffset(52, 36).addCuboid(-3.5F, 0.2F, -2.5F, 7.0F, 4.0F, 1.0F, 0.0F, false);

		Shape11 = new ModelPart(this);
		Shape11.setPivot(0.0F, 0.0F, -2.3F);
		body.addChild(Shape11);
		setRotationAngle(Shape11, -0.0873F, 0.0F, 0.0F);
		Shape11.setTextureOffset(0, 0).addCuboid(-1.5F, 4.0F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		bodydown = new ModelPart(this);
		bodydown.setPivot(0.0F, 0.0F, 0.0F);
		body.addChild(bodydown);
		setRotationAngle(bodydown, -0.0175F, 0.0F, 0.0F);
		bodydown.setTextureOffset(16, 45).addCuboid(-3.5F, 7.0F, -2.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);

		cloth = new ModelPart(this);
		cloth.setPivot(0.0F, 0.0F, 0.0F);
		body.addChild(cloth);
		

		cloth1 = new ModelPart(this);
		cloth1.setPivot(0.0F, 12.2987F, -4.151F);
		cloth.addChild(cloth1);
		setRotationAngle(cloth1, -0.4978F, 0.0F, 0.0F);
		cloth1.setTextureOffset(0, 4).addCuboid(-1.0F, -2.5F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		cloth2 = new ModelPart(this);
		cloth2.setPivot(0.0F, 10.9128F, 0.9962F);
		cloth.addChild(cloth2);
		setRotationAngle(cloth2, 0.6352F, 0.0F, 0.0F);
		cloth2.setTextureOffset(42, 30).addCuboid(-4.5F, 0.0F, 1.0F, 9.0F, 5.0F, 1.0F, 0.0F, false);

		cloth3 = new ModelPart(this);
		cloth3.setPivot(-3.0F, 10.9128F, 0.9962F);
		cloth.addChild(cloth3);
		setRotationAngle(cloth3, -0.063F, 0.0873F, 0.6109F);
		cloth3.setTextureOffset(46, 49).addCuboid(-2.0F, -0.4128F, -4.0F, 1.0F, 5.0F, 6.0F, 0.0F, false);

		cloth4 = new ModelPart(this);
		cloth4.setPivot(3.0F, 9.9128F, 0.9962F);
		cloth.addChild(cloth4);
		setRotationAngle(cloth4, -0.063F, -0.0873F, -0.7854F);
		cloth4.setTextureOffset(32, 49).addCuboid(0.5F, 0.0F, -4.0F, 1.0F, 5.0F, 6.0F, 0.0F, false);

		cloth5 = new ModelPart(this);
		cloth5.setPivot(3.8146F, 11.6044F, 0.3294F);
		cloth.addChild(cloth5);
		setRotationAngle(cloth5, -0.5866F, -0.0873F, -0.4363F);
		cloth5.setTextureOffset(0, 57).addCuboid(-3.8146F, 0.0F, -4.0F, 5.0F, 5.0F, 1.0F, 0.0F, false);

		cloth6 = new ModelPart(this);
		cloth6.setPivot(-3.6516F, 10.6473F, 0.8066F);
		cloth.addChild(cloth6);
		setRotationAngle(cloth6, -0.412F, 0.1746F, 0.4363F);
		cloth6.setTextureOffset(40, 49).addCuboid(-0.5F, 0.0F, -4.0F, 5.0F, 5.0F, 1.0F, 0.0F, false);

		crotch = new ModelPart(this);
		crotch.setPivot(0.0F, 0.0F, 0.0F);
		cloth.addChild(crotch);
		setRotationAngle(crotch, 0.0349F, 0.0F, 0.0F);
		crotch.setTextureOffset(0, 15).addCuboid(-4.0F, 10.0F, -3.5F, 8.0F, 2.0F, 6.0F, 0.0F, false);

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
		setRotationAngle(leftleg, -0.2003F, -0.0502F, -0.2595F);
		leftleg.setTextureOffset(37, 37).addCuboid(-2.0F, -2.0F, -3.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		legdownl = new ModelPart(this);
		legdownl.setPivot(0.1482F, 6.2009F, -0.5752F);
		leftleg.addChild(legdownl);
		setRotationAngle(legdownl, 0.6109F, 0.0F, 0.0F);
		legdownl.setTextureOffset(34, 8).addCuboid(-1.6482F, -1.5F, -1.5F, 4.0F, 9.0F, 5.0F, 0.0F, false);

		rightleg = new ModelPart(this);
		rightleg.setPivot(-2.0F, 10.0F, 4.0F);
		setRotationAngle(rightleg, -0.538F, -0.0114F, 0.2482F);
		rightleg.setTextureOffset(0, 34).addCuboid(-3.0F, 0.0F, -3.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		legdownr = new ModelPart(this);
		legdownr.setPivot(0.2077F, 3.6937F, 3.8524F);
		rightleg.addChild(legdownr);
		setRotationAngle(legdownr, 0.7854F, 0.0F, 0.0F);
		legdownr.setTextureOffset(24, 27).addCuboid(-2.7077F, -1.5F, -7.5F, 4.0F, 9.0F, 5.0F, 0.0F, false);

		hands_r = new ModelPart(this);
		hands_r.setPivot(0.0F, 0.0F, 0.0F);
		

		r_hand1 = new ModelPart(this);
		r_hand1.setPivot(0.0F, 0.0F, 0.0F);
		hands_r.addChild(r_hand1);
		setRotationAngle(r_hand1, -1.5708F, 1.5708F, 0.0F);
		r_hand1.setTextureOffset(38, 23).addCuboid(-8.0F, 19.0F, -1.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);

		r_hand2 = new ModelPart(this);
		r_hand2.setPivot(0.0F, 0.0F, 0.0F);
		hands_r.addChild(r_hand2);
		setRotationAngle(r_hand2, -1.5708F, 1.5708F, 0.0F);
		r_hand2.setTextureOffset(38, 23).addCuboid(-3.0F, 12.0F, 5.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);

		r_hand3 = new ModelPart(this);
		r_hand3.setPivot(0.0F, 0.0F, 0.0F);
		hands_r.addChild(r_hand3);
		setRotationAngle(r_hand3, -1.5708F, 1.5708F, 0.0F);
		r_hand3.setTextureOffset(38, 23).addCuboid(0.0F, 12.0F, -8.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);

		r_hand4 = new ModelPart(this);
		r_hand4.setPivot(-2.0F, 6.0F, 7.0F);
		hands_r.addChild(r_hand4);
		setRotationAngle(r_hand4, -1.5708F, 1.5708F, 0.0F);
		r_hand4.setTextureOffset(38, 23).addCuboid(4.0F, 10.0F, -8.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);

		r_hand5 = new ModelPart(this);
		r_hand5.setPivot(-3.0F, 4.0F, -5.0F);
		hands_r.addChild(r_hand5);
		setRotationAngle(r_hand5, -1.5708F, 1.5708F, 0.0F);
		r_hand5.setTextureOffset(38, 23).addCuboid(0.0F, 12.0F, -8.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);

		hands_l = new ModelPart(this);
		hands_l.setPivot(0.0F, 0.0F, 0.0F);
		

		l_hand1 = new ModelPart(this);
		l_hand1.setPivot(0.0F, 0.0F, 0.0F);
		hands_l.addChild(l_hand1);
		setRotationAngle(l_hand1, -1.5708F, -1.5708F, 0.0F);
		l_hand1.setTextureOffset(38, 23).addCuboid(-12.0F, 18.0F, -1.0F, 8.0F, 3.0F, 4.0F, 0.0F, true);

		l_hand2 = new ModelPart(this);
		l_hand2.setPivot(0.0F, 0.0F, 0.0F);
		hands_l.addChild(l_hand2);
		setRotationAngle(l_hand2, -1.5708F, -1.5708F, 0.0F);
		l_hand2.setTextureOffset(38, 23).addCuboid(-4.0F, 13.0F, 5.0F, 8.0F, 3.0F, 4.0F, 0.0F, true);

		l_hand3 = new ModelPart(this);
		l_hand3.setPivot(0.0F, 0.0F, 0.0F);
		hands_l.addChild(l_hand3);
		setRotationAngle(l_hand3, -1.5708F, -1.5708F, 0.0F);
		l_hand3.setTextureOffset(38, 23).addCuboid(0.0F, 13.0F, -8.0F, 8.0F, 3.0F, 4.0F, 0.0F, true);

		l_hand4 = new ModelPart(this);
		l_hand4.setPivot(3.0F, 6.0F, 4.0F);
		hands_l.addChild(l_hand4);
		setRotationAngle(l_hand4, -1.5708F, -1.5708F, 0.0F);
		l_hand4.setTextureOffset(38, 23).addCuboid(0.0F, 10.0F, -8.0F, 8.0F, 3.0F, 4.0F, 0.0F, true);

		l_hand5 = new ModelPart(this);
		l_hand5.setPivot(-2.0F, 3.0F, -10.0F);
		hands_l.addChild(l_hand5);
		setRotationAngle(l_hand5, -1.5708F, -1.5708F, 0.0F);
		l_hand5.setTextureOffset(38, 23).addCuboid(0.0F, 13.0F, -8.0F, 8.0F, 3.0F, 4.0F, 0.0F, true);
}
@Override
public void setAngles(LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
	float power = 0.5F;
	float speed = 2.5F;
	l_hand1.yaw =-45 + MathHelper.cos(speed*animationProgress*1.5f) * 1.2F * power;
	l_hand2.yaw =-45 + MathHelper.cos(speed*animationProgress*1.5f+(float)Math.PI/3) * 1.4F * power;
	l_hand3.yaw =-45 + MathHelper.cos(speed*animationProgress*1.5f+(float)(2*Math.PI/3)) * 1.6F * power;
	l_hand4.yaw =-45 + MathHelper.cos(speed*animationProgress*1.5f+(float)(2.5*Math.PI/3)) * 1.3F * power;
	l_hand5.yaw =-45 + MathHelper.cos(speed*animationProgress*1.5f+(float)(3*Math.PI/3)) * 1.3F * power;
	r_hand1.yaw = 45 - MathHelper.cos(speed*animationProgress*1.5f+(float)(3.5*Math.PI/3)) * 1.2F * power;
	r_hand2.yaw = 45 - MathHelper.cos(speed*animationProgress*1.5f+(float)(6*Math.PI/3)) * 1.1F * power;
	r_hand3.yaw = 45 - MathHelper.cos(speed*animationProgress*1.5f+(float)(9*Math.PI/3)) * 1.2F * power;
	r_hand4.yaw = 45 - MathHelper.cos(speed*animationProgress*1.5f+(float)(10*Math.PI/3)) * 0.7F * power;
	r_hand5.yaw = 45 - MathHelper.cos(speed*animationProgress*1.5f+(float)(1.5*Math.PI/3) )* 1.6F * power;
	this.yOffset = (double)MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.05D;

	float r = (float)Math.random();
	float offxl = r * MathHelper.sin(r * speed * animationProgress) * power + 0.2F;
	float offxr = r * MathHelper.sin(r * speed * animationProgress) * power - 0.2F;

	hands_l.pitch = offxl * 0.017453292F;
	hands_l.yaw = offxl * 0.017453292F;
	hands_r.pitch = offxr * 0.017453292F;
	hands_r.yaw = offxr * 0.017453292F;
}



@Override
public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
	    matrixStack.translate(0.0D, this.yOffset, -0.75D);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.translate(0.0D, -this.yOffset, 0.0D);

		hands_r.render(matrixStack, buffer, packedLight, packedOverlay);
		hands_l.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.translate(0.0D, 0.2D, 0.75D);
}
public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
}
	public final void renderPunchyArms(@NotNull MatrixStack matrices, @NotNull VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
		this.hands_l.render(matrices, vertices, light, overlay, red, green, blue, alpha);
		this.hands_r.render(matrices, vertices, light, overlay, red, green, blue, alpha);
	}
	}