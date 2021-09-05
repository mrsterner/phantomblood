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
import org.jetbrains.annotations.Nullable;
public class KillerQueenModel extends EntityModel<LivingEntity> {
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
	private final ModelPart head;
	private final ModelPart leftleg;
	private final ModelPart leftlegbot;
	private final ModelPart rightleg;
	private final ModelPart rightlegbot;
	private final ModelPart shoulders;
	private final ModelPart leftarm2;
	private final ModelPart rightarm2;
	private final ModelPart punch;
	private final ModelPart lefthands;
	private final ModelPart lefthand1;
	private final ModelPart lefthand2;
	private final ModelPart lefthand3;
	private final ModelPart lefthand4;
	private final ModelPart lefthand5;
	private final ModelPart righthands;
	private final ModelPart righthand1;
	private final ModelPart righthand2;
	private final ModelPart righthand3;
	private final ModelPart righthand4;
	private final ModelPart righthand5;
	private final ModelPart idelarms;
	private final ModelPart rightarm;
	private final ModelPart rightarmtop;
	private final ModelPart rightarmdown;
	private final ModelPart leftarm;
	private final ModelPart leftarmtop;
	private final ModelPart leftarmbot;
	private double yOffset;
	public KillerQueenModel(ModelPart root) {
		this.body = root.getChild("body");
		this.cloth = this.body.getChild("cloth");
		this.cloth6 = this.cloth.getChild("cloth6");
		this.cloth5 = this.cloth.getChild("cloth5");
		this.cloth4 = this.cloth.getChild("cloth4");
		this.cloth3 = this.cloth.getChild("cloth3");
		this.cloth2 = this.cloth.getChild("cloth2");
		this.cloth1 = this.cloth.getChild("cloth1");
		this.bodybot = this.body.getChild("bodybot");
		this.chest = this.body.getChild("chest");
		this.chestbot = this.chest.getChild("chestbot");
		this.head = root.getChild("head");
		this.leftleg = root.getChild("leftleg");
		this.leftlegbot = this.leftleg.getChild("leftlegbot");
		this.rightleg = root.getChild("rightleg");
		this.rightlegbot = this.rightleg.getChild("rightlegbot");
		this.shoulders = root.getChild("shoulders");
		this.rightarm2 = this.shoulders.getChild("rightarm2");
		this.idelarms = root.getChild("idelarms");
		this.leftarm = this.idelarms.getChild("leftarm");
		this.rightarm = this.idelarms.getChild("rightarm");
		this.rightarmtop = this.rightarm.getChild("rightarmtop");
		this.rightarmdown = this.rightarmtop.getChild("rightarmdown");
		this.leftarm2 = this.shoulders.getChild("leftarm2");
		this.leftarmtop = this.leftarm.getChild("leftarmtop");
		this.leftarmbot = this.leftarmtop.getChild("leftarmbot");
		this.punch = root.getChild("punch");
		this.righthands = this.punch.getChild("righthands");
		this.righthand5 = this.righthands.getChild("righthand5");
		this.righthand4 = this.righthands.getChild("righthand4");
		this.righthand3 = this.righthands.getChild("righthand3");
		this.righthand2 = this.righthands.getChild("righthand2");
		this.righthand1 = this.righthands.getChild("righthand1");
		this.lefthands = this.punch.getChild("lefthands");
		this.lefthand5 = this.lefthands.getChild("lefthand5");
		this.lefthand4 = this.lefthands.getChild("lefthand4");
		this.lefthand3 = this.lefthands.getChild("lefthand3");
		this.lefthand2 = this.lefthands.getChild("lefthand2");
		this.lefthand1 = this.lefthands.getChild("lefthand1");



		setRotationAngle(body, -0.1745F, 0.0F, 0.0F);
		setRotationAngle(chest, -0.0873F, 0.0F, 0.0F);
		setRotationAngle(chestbot, -0.0437F, 0.0F, 0.0F);
		setRotationAngle(bodybot, -0.0175F, 0.0F, 0.0F);

		setRotationAngle(cloth1, -0.1484F, 0.0F, 0.0F);
		setRotationAngle(cloth2, 0.5411F, 0.0F, 0.0F);

		setRotationAngle(cloth3, -0.0628F, 0.0873F, 1.1345F);
		setRotationAngle(cloth4, -0.0628F, -0.0873F, -0.7854F);
		setRotationAngle(cloth5, -0.2269F, -0.0873F, -0.4363F);
		setRotationAngle(cloth6, -0.2269F, 0.0873F, 0.48F);
		setRotationAngle(leftleg, -0.288F, -0.4014F, -0.4363F);
		setRotationAngle(leftlegbot, 0.5934F, -0.0524F, 0.0262F);
		setRotationAngle(rightleg, -0.3665F, 0.3316F, 0.2443F);
		setRotationAngle(rightlegbot, 0.9425F, 0.2443F, 0.0611F);

		setRotationAngle(leftarm2, -0.2618F, 0.0F, 0.0F);
		setRotationAngle(rightarm2, -0.6109F, 0.0F, 0.0F);


		setRotationAngle(lefthand1, -1.5708F, -1.5708F, 0.0F);
		setRotationAngle(lefthand2, -1.5708F, -1.5708F, 0.0F);
		setRotationAngle(lefthand3, -1.5708F, -1.5708F, 0.0F);
		setRotationAngle(lefthand4, -1.5708F, -1.5708F, 0.0F);
		setRotationAngle(lefthand5, -1.5708F, -1.5708F, 0.0F);

		setRotationAngle(righthand1, -1.5708F, 1.5708F, 0.0F);
		setRotationAngle(righthand2, -1.5708F, 1.5708F, 0.0F);
		setRotationAngle(righthand3, -1.5708F, 1.5708F, 0.0F);
		setRotationAngle(righthand4, -1.5708F, 1.5708F, 0.0F);
		setRotationAngle(righthand5, -1.5708F, 1.5708F, 0.0F);

		setRotationAngle(rightarm, -0.6109F, 0.0F, 0.0F);
		setRotationAngle(rightarmtop, -0.2618F, -0.2618F, 0.1745F);
		setRotationAngle(rightarmdown, -0.9599F, -0.0873F, 0.0873F);
		setRotationAngle(leftarm, -0.2618F, 0.0F, 0.0F);
		setRotationAngle(leftarmtop, -0.6109F, 0.6109F, 0.2618F);

	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();

		ModelPartData modelPartData1 = modelPartData.addChild("body", ModelPartBuilder.create().uv(0,23).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F), ModelTransform.pivot(0.0F,-1.0F,0.0F));
		ModelPartData modelPartData2 = modelPartData1.addChild("chest", ModelPartBuilder.create().uv(52,36).cuboid(-3.5F, 0.2F, -2.5F, 7.0F, 4.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData2.addChild("chestbot", ModelPartBuilder.create().uv(0,0).cuboid(-1.5F, 4.0F, 0.0F, 3.0F, 3.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,-2.3F));
		modelPartData1.addChild("bodybot", ModelPartBuilder.create().uv(16,45).cuboid(-3.5F, 7.0F, -2.0F, 7.0F, 5.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData3 = modelPartData1.addChild("cloth", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData3.addChild("cloth1", ModelPartBuilder.create().uv(0,4).cuboid(-1.0F, 11.0F, -1.9F, 2.0F, 3.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData3.addChild("cloth2", ModelPartBuilder.create().uv(42,30).cuboid(-4.5F, 0.0F, 1.0F, 9.0F, 5.0F, 1.0F), ModelTransform.pivot(0.0F,10.0F,1.0F));
		modelPartData3.addChild("cloth3", ModelPartBuilder.create().uv(46,49).cuboid(-2.0F, -0.5F, -4.0F, 1.0F, 5.0F, 6.0F), ModelTransform.pivot(-3.0F,11.0F,1.0F));
		modelPartData3.addChild("cloth4", ModelPartBuilder.create().uv(32,49).cuboid(0.5F, 0.0F, -4.0F, 1.0F, 5.0F, 6.0F), ModelTransform.pivot(3.0F,10.0F,1.0F));
		modelPartData3.addChild("cloth5", ModelPartBuilder.create().uv(0,57).cuboid(-3.5F, 0.0F, -3.9F, 5.0F, 5.0F, 1.0F), ModelTransform.pivot(3.0F,10.0F,1.0F));
		modelPartData3.addChild("cloth6", ModelPartBuilder.create().uv(40,49).cuboid(-1.5F, 0.0F, -4.0F, 5.0F, 5.0F, 1.0F), ModelTransform.pivot(-3.0F,10.0F,1.0F));
		modelPartData.addChild("head", ModelPartBuilder.create().uv(0,0).cuboid(-3.5F, -7.0F, -4.0F, 7.0F, 7.0F, 8.0F).uv(55,55).cuboid(2.5F, -9.0F, -2.5F, 1.0F, 2.0F, 5.0F).uv(22,0).cuboid(-2.5F, -8.0F, -3.5F, 5.0F, 1.0F, 7.0F).uv(54,44).cuboid(-3.5F, -9.0F, -2.5F, 1.0F, 2.0F, 5.0F), ModelTransform.pivot(0.0F,-1.0F,0.0F));
		ModelPartData modelPartData4 = modelPartData.addChild("leftleg", ModelPartBuilder.create().uv(37,37).cuboid(-2.0F, 0.0F, -3.5F, 5.0F, 7.0F, 5.0F), ModelTransform.pivot(2.0F,12.0F,-1.0F));
		modelPartData4.addChild("leftlegbot", ModelPartBuilder.create().uv(34,8).cuboid(-2.7F, -4.5F, -2.2F, 4.0F, 9.0F, 5.0F), ModelTransform.pivot(1.2F,10.25F,1.2F));
		ModelPartData modelPartData5 = modelPartData.addChild("rightleg", ModelPartBuilder.create().uv(0,34).cuboid(-3.0F, 1.0F, -3.5F, 5.0F, 7.0F, 5.0F), ModelTransform.pivot(-2.0F,10.0F,0.0F));
		modelPartData5.addChild("rightlegbot", ModelPartBuilder.create().uv(24,27).cuboid(-2.0F, -4.5F, -2.5F, 4.0F, 9.0F, 5.0F), ModelTransform.pivot(0.0F,9.5F,1.5F));
		ModelPartData modelPartData6 = modelPartData.addChild("shoulders", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,24.0F,0.0F));
		modelPartData6.addChild("leftarm2", ModelPartBuilder.create().uv(0,48).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 5.0F), ModelTransform.pivot(5.0F,-24.0F,0.0F));
		modelPartData6.addChild("rightarm2", ModelPartBuilder.create().uv(47,0).cuboid(-2.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F), ModelTransform.pivot(-6.0F,-24.0F,0.5F));
		ModelPartData modelPartData7 = modelPartData.addChild("punch", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,24.0F,0.0F));
		ModelPartData modelPartData8 = modelPartData7.addChild("lefthands", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-24.0F,0.0F));
		modelPartData8.addChild("lefthand1", ModelPartBuilder.create().uv(38,23).cuboid(-12.0F, 18.0F, -1.0F, 8.0F, 3.0F, 4.0F, true), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData8.addChild("lefthand2", ModelPartBuilder.create().uv(38,23).cuboid(-4.0F, 13.0F, 5.0F, 8.0F, 3.0F, 4.0F, true), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData8.addChild("lefthand3", ModelPartBuilder.create().uv(38,23).cuboid(0.0F, 13.0F, -8.0F, 8.0F, 3.0F, 4.0F, true), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData8.addChild("lefthand4", ModelPartBuilder.create().uv(38,23).cuboid(0.0F, 10.0F, -8.0F, 8.0F, 3.0F, 4.0F, true), ModelTransform.pivot(3.0F,6.0F,4.0F));
		modelPartData8.addChild("lefthand5", ModelPartBuilder.create().uv(38,23).cuboid(0.0F, 13.0F, -8.0F, 8.0F, 3.0F, 4.0F, true), ModelTransform.pivot(-2.0F,3.0F,-10.0F));
		ModelPartData modelPartData9 = modelPartData7.addChild("righthands", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-24.0F,0.0F));
		modelPartData9.addChild("righthand1", ModelPartBuilder.create().uv(38,23).cuboid(-8.0F, 19.0F, -1.0F, 8.0F, 3.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData9.addChild("righthand2", ModelPartBuilder.create().uv(38,23).cuboid(-3.0F, 12.0F, 5.0F, 8.0F, 3.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData9.addChild("righthand3", ModelPartBuilder.create().uv(38,23).cuboid(0.0F, 12.0F, -8.0F, 8.0F, 3.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData9.addChild("righthand4", ModelPartBuilder.create().uv(38,23).cuboid(4.0F, 10.0F, -8.0F, 8.0F, 3.0F, 4.0F), ModelTransform.pivot(-2.0F,6.0F,7.0F));
		modelPartData9.addChild("righthand5", ModelPartBuilder.create().uv(38,23).cuboid(0.0F, 12.0F, -8.0F, 8.0F, 3.0F, 4.0F), ModelTransform.pivot(-3.0F,4.0F,-5.0F));
		ModelPartData modelPartData10 = modelPartData.addChild("idelarms", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,24.0F,0.0F));
		ModelPartData modelPartData11 = modelPartData10.addChild("rightarm", ModelPartBuilder.create().uv(47,0).cuboid(-2.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F), ModelTransform.pivot(-6.0F,-23.0F,0.5F));
		ModelPartData modelPartData12 = modelPartData11.addChild("rightarmtop", ModelPartBuilder.create().uv(52,9).cuboid(-2.0F, 1.0F, -1.0F, 3.0F, 6.0F, 4.0F), ModelTransform.pivot(1.0F,1.0F,-0.5F));
		modelPartData12.addChild("rightarmdown", ModelPartBuilder.create().uv(38,23).cuboid(-1.0F, -3.0F, 0.0F, 8.0F, 3.0F, 4.0F), ModelTransform.pivot(1.0F,5.0F,-1.0F));
		ModelPartData modelPartData13 = modelPartData10.addChild("leftarm", ModelPartBuilder.create().uv(0,48).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 5.0F), ModelTransform.pivot(5.0F,-23.0F,0.0F));
		ModelPartData modelPartData14 = modelPartData13.addChild("leftarmtop", ModelPartBuilder.create().uv(14,53).cuboid(0.0F, 1.0F, -0.5F, 3.0F, 6.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData14.addChild("leftarmbot", ModelPartBuilder.create().uv(20,15).cuboid(0.0F, -4.0F, -6.5F, 3.0F, 4.0F, 8.0F), ModelTransform.pivot(0.0F,7.0F,1.5F));
		return TexturedModelData.of(modelData,128,128);
	}
	@Override
	public void setAngles(@Nullable LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		this.yOffset = (double)MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;
		this.head.pitch = headPitch * 0.017453292F;
		this.head.yaw = headYaw * 0.017453292F;
	}
	public void setAttackAngles(LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
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
	}
	@Override
	public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		matrixStack.translate(-0.45D, this.yOffset - 0.2D, 0.75D);
		this.head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.rightleg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.leftleg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.idelarms.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}
	public void renderAttack(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		matrixStack.translate(0.0D, this.yOffset, -0.75D);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.translate(0.0D, 1.5D, 0.0D);
		shoulders.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.translate(0.0D, -this.yOffset, 0.0D);
		righthands.render(matrixStack, buffer, packedLight, packedOverlay);
		lefthands.render(matrixStack, buffer, packedLight, packedOverlay);
	}
	public final void renderPunchyArms(@NotNull MatrixStack matrices, @NotNull VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
		this.righthands.render(matrices, vertices, light, overlay, red, green, blue, alpha);
		this.lefthands.render(matrices, vertices, light, overlay, red, green, blue, alpha);
	}
	public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
	}
}