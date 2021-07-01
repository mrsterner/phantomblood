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
import org.jetbrains.annotations.Nullable;

public class KillerQueenIdleModel extends EntityModel<LivingEntity> {
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
	private final ModelPart leftarmtop;
	private final ModelPart leftarmbot;
	private final ModelPart rightarm;
	private final ModelPart rightarmtop;
	private final ModelPart rightarmdown;
	private final ModelPart head;
	private final ModelPart leftleg;
	private final ModelPart leftlegbot;
	private final ModelPart rightleg;
	private final ModelPart rightlegbot;
	private double yOffset;

	public KillerQueenIdleModel() {
		textureWidth = 128;
		textureHeight = 128;
		body = new ModelPart(this);
		body.setPivot(0.0F, -1.0F, 0.0F);
		setRotationAngle(body, -0.1745F, 0.0F, 0.0F);
		body.setTextureOffset(0, 23).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F, 0.0F, false);

		chest = new ModelPart(this);
		chest.setPivot(0.0F, 0.0F, 0.0F);
		body.addChild(chest);
		setRotationAngle(chest, -0.0873F, 0.0F, 0.0F);
		chest.setTextureOffset(52, 36).addCuboid(-3.5F, 0.2F, -2.5F, 7.0F, 4.0F, 1.0F, 0.0F, false);

		chestbot = new ModelPart(this);
		chestbot.setPivot(0.0F, 0.0F, -2.3F);
		chest.addChild(chestbot);
		setRotationAngle(chestbot, -0.0437F, 0.0F, 0.0F);
		chestbot.setTextureOffset(0, 0).addCuboid(-1.5F, 4.0F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		bodybot = new ModelPart(this);
		bodybot.setPivot(0.0F, 0.0F, 0.0F);
		body.addChild(bodybot);
		setRotationAngle(bodybot, -0.0175F, 0.0F, 0.0F);
		bodybot.setTextureOffset(16, 45).addCuboid(-3.5F, 7.0F, -2.0F, 7.0F, 5.0F, 4.0F, 0.0F, false);

		cloth = new ModelPart(this);
		cloth.setPivot(0.0F, 0.0F, 0.0F);
		body.addChild(cloth);


		cloth1 = new ModelPart(this);
		cloth1.setPivot(0.0F, 0.0F, 0.0F);
		cloth.addChild(cloth1);
		setRotationAngle(cloth1, -0.1484F, 0.0F, 0.0F);
		cloth1.setTextureOffset(0, 4).addCuboid(-1.0F, 12.0F, -1.7F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		cloth2 = new ModelPart(this);
		cloth2.setPivot(0.0F, 10.0F, 1.0F);
		cloth.addChild(cloth2);
		setRotationAngle(cloth2, 0.5411F, 0.0F, 0.0F);
		cloth2.setTextureOffset(42, 30).addCuboid(-4.5F, 0.0F, 1.0F, 9.0F, 5.0F, 1.0F, 0.0F, false);

		cloth3 = new ModelPart(this);
		cloth3.setPivot(-3.0F, 11.0F, 1.0F);
		cloth.addChild(cloth3);
		setRotationAngle(cloth3, -0.0628F, 0.0873F, 1.1345F);
		cloth3.setTextureOffset(46, 49).addCuboid(-2.0F, -0.5F, -4.0F, 1.0F, 5.0F, 6.0F, 0.0F, false);

		cloth4 = new ModelPart(this);
		cloth4.setPivot(3.0F, 10.0F, 1.0F);
		cloth.addChild(cloth4);
		setRotationAngle(cloth4, -0.0628F, -0.0873F, -0.7854F);
		cloth4.setTextureOffset(32, 49).addCuboid(0.5F, 0.0F, -4.0F, 1.0F, 5.0F, 6.0F, 0.0F, false);

		cloth5 = new ModelPart(this);
		cloth5.setPivot(3.0F, 10.0F, 1.0F);
		cloth.addChild(cloth5);
		setRotationAngle(cloth5, -0.2374F, -0.0873F, -0.4363F);
		cloth5.setTextureOffset(0, 57).addCuboid(-3.5F, 0.0F, -4.0F, 5.0F, 5.0F, 1.0F, 0.0F, false);

		cloth6 = new ModelPart(this);
		cloth6.setPivot(-3.0F, 10.0F, 1.0F);
		cloth.addChild(cloth6);
		setRotationAngle(cloth6, -0.2374F, 0.0873F, 0.6981F);
		cloth6.setTextureOffset(40, 49).addCuboid(-1.5F, 0.0F, -4.0F, 5.0F, 5.0F, 1.0F, 0.0F, false);

		leftarm = new ModelPart(this);
		leftarm.setPivot(5.0F, 2.0F, 0.0F);
		body.addChild(leftarm);
		setRotationAngle(leftarm, -0.2618F, 0.0F, 0.0F);
		leftarm.setTextureOffset(0, 48).addCuboid(-1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);

		leftarmtop = new ModelPart(this);
		leftarmtop.setPivot(0.0F, 0.0F, 0.0F);
		leftarm.addChild(leftarmtop);
		setRotationAngle(leftarmtop, -0.6109F, 0.6109F, 0.2618F);
		leftarmtop.setTextureOffset(14, 53).addCuboid(0.0F, 1.0F, -0.5F, 3.0F, 6.0F, 4.0F, 0.0F, false);

		leftarmbot = new ModelPart(this);
		leftarmbot.setPivot(0.0F, 7.0F, 1.5F);
		leftarmtop.addChild(leftarmbot);
		setRotationAngle(leftarmbot, 0.1745F, 0.0873F, 0.6981F);
		leftarmbot.setTextureOffset(20, 15).addCuboid(0.0F, -4.0F, -6.5F, 3.0F, 4.0F, 8.0F, 0.0F, false);

		rightarm = new ModelPart(this);
		rightarm.setPivot(-6.0F, 2.0F, 0.5F);
		body.addChild(rightarm);
		setRotationAngle(rightarm, -0.6109F, 0.0F, 0.0F);
		rightarm.setTextureOffset(47, 0).addCuboid(-2.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);

		rightarmtop = new ModelPart(this);
		rightarmtop.setPivot(1.0F, 1.0F, -0.5F);
		rightarm.addChild(rightarmtop);
		setRotationAngle(rightarmtop, -0.2618F, -0.2618F, 0.1745F);
		rightarmtop.setTextureOffset(52, 9).addCuboid(-2.0F, 1.0F, -1.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);

		rightarmdown = new ModelPart(this);
		rightarmdown.setPivot(1.0F, 5.0F, -1.0F);
		rightarmtop.addChild(rightarmdown);
		setRotationAngle(rightarmdown, -0.9599F, -0.0873F, 0.0873F);
		rightarmdown.setTextureOffset(38, 23).addCuboid(-1.0F, -3.0F, 0.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);

		head = new ModelPart(this);
		head.setPivot(0.0F, -1.0F, 0.0F);
		head.setTextureOffset(0, 0).addCuboid(-3.5F, -7.0F, -4.0F, 7.0F, 7.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(55, 55).addCuboid(2.5F, -9.0F, -2.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(22, 0).addCuboid(-2.5F, -8.0F, -3.5F, 5.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(54, 44).addCuboid(-3.5F, -9.0F, -2.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);

		leftleg = new ModelPart(this);
		leftleg.setPivot(2.0F, 12.0F, -1.0F);
		setRotationAngle(leftleg, -0.288F, -0.4014F, -0.4363F);
		leftleg.setTextureOffset(37, 37).addCuboid(-2.0F, 0.0F, -3.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		leftlegbot = new ModelPart(this);
		leftlegbot.setPivot(1.2F, 10.25F, 1.2F);
		leftleg.addChild(leftlegbot);
		setRotationAngle(leftlegbot, 0.5934F, -0.0524F, 0.0262F);
		leftlegbot.setTextureOffset(34, 8).addCuboid(-2.7F, -4.5F, -2.2F, 4.0F, 9.0F, 5.0F, 0.0F, false);

		rightleg = new ModelPart(this);
		rightleg.setPivot(-2.0F, 10.0F, 0.0F);
		setRotationAngle(rightleg, -0.3665F, 0.3316F, 0.2443F);
		rightleg.setTextureOffset(0, 34).addCuboid(-3.0F, 1.0F, -3.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		rightlegbot = new ModelPart(this);
		rightlegbot.setPivot(0.0F, 9.5F, 1.5F);
		rightleg.addChild(rightlegbot);
		setRotationAngle(rightlegbot, 0.9425F, 0.2443F, 0.0611F);
		rightlegbot.setTextureOffset(24, 27).addCuboid(-2.0F, -4.5F, -2.5F, 4.0F, 9.0F, 5.0F, 0.0F, false);

	}

	public void setAngles(@Nullable LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		this.yOffset = (double)MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;
		this.head.pitch = headPitch * 0.017453292F;
		this.head.yaw = headYaw * 0.017453292F;
	}
	@Override
	public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		matrixStack.translate(-0.45D, this.yOffset - 0.2D, 0.75D);
		this.head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.rightleg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.leftleg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		matrixStack.translate(0.0D, -this.yOffset, 0.0D);
		matrixStack.translate(0.0D, -0.3D, -0.2D);
		matrixStack.scale(2.0F, 2.0F, 2.0F);
	}



public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
}


}