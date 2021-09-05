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
	private final ModelPart head;
	private final ModelPart leftleg;
	private final ModelPart legdownl;
	private final ModelPart rightleg;
	private final ModelPart legdownr;
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
	private final ModelPart idlearms;
	private final ModelPart leftarm3;
	private final ModelPart la_up2;
	private final ModelPart la_down2;
	private final ModelPart rightarm3;
	private final ModelPart ra_up2;
	private final ModelPart ra_down2;
	private double yOffset;
	public KillerQueenModel(ModelPart root) {
		this.body = root.getChild("body");
		this.cloth = this.body.getChild("cloth");
		this.crotch = this.cloth.getChild("crotch");
		this.cloth6 = this.cloth.getChild("cloth6");
		this.cloth5 = this.cloth.getChild("cloth5");
		this.cloth4 = this.cloth.getChild("cloth4");
		this.cloth3 = this.cloth.getChild("cloth3");
		this.cloth2 = this.cloth.getChild("cloth2");
		this.cloth1 = this.cloth.getChild("cloth1");
		this.bodydown = this.body.getChild("bodydown");
		this.Shape11 = this.body.getChild("Shape11");
		this.Shape10 = this.body.getChild("Shape10");
		this.head = root.getChild("head");
		this.leftleg = root.getChild("leftleg");
		this.legdownl = this.leftleg.getChild("legdownl");
		this.rightleg = root.getChild("rightleg");
		this.legdownr = this.rightleg.getChild("legdownr");
		this.shoulders = root.getChild("shoulders");
		this.rightarm2 = this.shoulders.getChild("rightarm2");
		this.leftarm2 = this.shoulders.getChild("leftarm2");
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
		this.idlearms = root.getChild("idlearms");
		this.rightarm3 = this.idlearms.getChild("rightarm3");
		this.ra_up2 = this.rightarm3.getChild("ra_up2");
		this.ra_down2 = this.ra_up2.getChild("ra_down2");
		this.leftarm3 = this.idlearms.getChild("leftarm3");
		this.la_up2 = this.leftarm3.getChild("la_up2");
		this.la_down2 = this.la_up2.getChild("la_down2");

		setRotationAngle(body, -0.1746F, 0.0F, 0.0F);
		setRotationAngle(Shape10, -0.0873F, 0.0F, 0.0F);
		setRotationAngle(Shape11, -0.0873F, 0.0F, 0.0F);
		setRotationAngle(bodydown, -0.0175F, 0.0F, 0.0F);

		setRotationAngle(cloth1, -0.1487F, 0.0F, 0.0F);
		setRotationAngle(cloth2, 0.5479F, 0.0F, 0.0F);

		setRotationAngle(cloth3, -0.063F, 0.0873F, 1.1345F);
		setRotationAngle(cloth4, -0.063F, -0.0873F, -0.7854F);
		setRotationAngle(cloth5, -0.2375F, -0.0873F, -0.4363F);
		setRotationAngle(cloth6, -0.2375F, 0.0873F, 0.6981F);
		setRotationAngle(crotch, 0.0349F, 0.0F, 0.0F);
		setRotationAngle(leftleg, -0.2876F, -0.3992F, -0.4341F);
		setRotationAngle(legdownl, 0.5871F, -0.0501F, 0.0259F);
		setRotationAngle(rightleg, -0.3635F, 0.3377F, 0.2482F);
		setRotationAngle(legdownr, 0.9506F, 0.2473F, 0.0614F);

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
		setRotationAngle(idlearms, -0.1745F, 0.0F, 0.0F);

		setRotationAngle(leftarm3, -0.2618F, 0.0F, 0.0F);
		setRotationAngle(la_up2, -0.6109F, 0.6109F, 0.2618F);
		setRotationAngle(la_down2, 0.1745F, 0.0873F, 0.6981F);
		setRotationAngle(rightarm3, -0.6109F, 0.0F, 0.0F);
		setRotationAngle(ra_up2, -0.2618F, -0.2618F, 0.1745F);
		setRotationAngle(ra_down2, -0.9599F, -0.0873F, 0.0873F);

	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();

		ModelPartData modelPartData1 = modelPartData.addChild("body", ModelPartBuilder.create().uv(0,23).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F), ModelTransform.pivot(0.0F,-1.0F,0.0F));
		modelPartData1.addChild("Shape10", ModelPartBuilder.create().uv(52,36).cuboid(-3.5F, 0.2F, -2.5F, 7.0F, 4.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData1.addChild("Shape11", ModelPartBuilder.create().uv(0,0).cuboid(-1.5F, 4.0F, 0.0F, 3.0F, 3.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,-2.3F));
		modelPartData1.addChild("bodydown", ModelPartBuilder.create().uv(16,45).cuboid(-3.5F, 7.0F, -2.0F, 7.0F, 4.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData2 = modelPartData1.addChild("cloth", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData2.addChild("cloth1", ModelPartBuilder.create().uv(0,4).cuboid(-1.0F, 11.9723F, -1.6662F, 2.0F, 3.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData2.addChild("cloth2", ModelPartBuilder.create().uv(42,30).cuboid(-4.5F, 0.0F, 1.0F, 9.0F, 5.0F, 1.0F), ModelTransform.pivot(0.0F,9.9128F,0.9962F));
		modelPartData2.addChild("cloth3", ModelPartBuilder.create().uv(46,49).cuboid(-2.0F, -0.4128F, -4.0F, 1.0F, 5.0F, 6.0F), ModelTransform.pivot(-3.0F,10.9128F,0.9962F));
		modelPartData2.addChild("cloth4", ModelPartBuilder.create().uv(32,49).cuboid(0.5F, 0.0F, -4.0F, 1.0F, 5.0F, 6.0F), ModelTransform.pivot(3.0F,9.9128F,0.9962F));
		modelPartData2.addChild("cloth5", ModelPartBuilder.create().uv(0,57).cuboid(-3.5F, 0.0F, -4.0F, 5.0F, 5.0F, 1.0F), ModelTransform.pivot(3.0F,9.9128F,0.9962F));
		modelPartData2.addChild("cloth6", ModelPartBuilder.create().uv(40,49).cuboid(-1.5F, 0.0F, -4.0F, 5.0F, 5.0F, 1.0F), ModelTransform.pivot(-3.0F,9.9128F,0.9962F));
		modelPartData2.addChild("crotch", ModelPartBuilder.create().uv(0,15).cuboid(-4.0F, 10.0F, -3.5F, 8.0F, 2.0F, 6.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData.addChild("head", ModelPartBuilder.create().uv(0,0).cuboid(-3.5F, -7.0F, -4.0F, 7.0F, 7.0F, 8.0F).uv(55,55).cuboid(2.5F, -9.0F, -3.0F, 1.0F, 2.0F, 5.0F).uv(22,0).cuboid(-2.5F, -8.0F, -3.5F, 5.0F, 1.0F, 7.0F).uv(54,44).cuboid(-3.5F, -9.0F, -3.0F, 1.0F, 2.0F, 5.0F), ModelTransform.pivot(0.0F,-1.0F,0.0F));
		ModelPartData modelPartData3 = modelPartData.addChild("leftleg", ModelPartBuilder.create().uv(37,37).cuboid(-2.0F, 0.0F, -3.5F, 5.0F, 7.0F, 5.0F), ModelTransform.pivot(2.0F,12.0F,-1.0F));
		modelPartData3.addChild("legdownl", ModelPartBuilder.create().uv(34,8).cuboid(-2.6629F, -4.5F, -2.1822F, 4.0F, 9.0F, 5.0F), ModelTransform.pivot(1.1629F,10.25F,1.1822F));
		ModelPartData modelPartData4 = modelPartData.addChild("rightleg", ModelPartBuilder.create().uv(0,34).cuboid(-3.0F, 1.0F, -3.5F, 5.0F, 7.0F, 5.0F), ModelTransform.pivot(-2.0F,10.0F,0.0F));
		modelPartData4.addChild("legdownr", ModelPartBuilder.create().uv(24,27).cuboid(-1.6913F, -4.3405F, -2.5427F, 4.0F, 9.0F, 5.0F), ModelTransform.pivot(0.6913F,9.3405F,1.5427F));
		ModelPartData modelPartData5 = modelPartData.addChild("shoulders", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,24.0F,0.0F));
		modelPartData5.addChild("leftarm2", ModelPartBuilder.create().uv(0,48).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 5.0F), ModelTransform.pivot(5.0F,-24.0F,0.0F));
		modelPartData5.addChild("rightarm2", ModelPartBuilder.create().uv(47,0).cuboid(-2.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F), ModelTransform.pivot(-6.0F,-24.0F,0.5F));
		ModelPartData modelPartData6 = modelPartData.addChild("punch", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,24.0F,0.0F));
		ModelPartData modelPartData7 = modelPartData6.addChild("lefthands", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-24.0F,0.0F));
		modelPartData7.addChild("lefthand1", ModelPartBuilder.create().uv(38,23).cuboid(-12.0F, 18.0F, -1.0F, 8.0F, 3.0F, 4.0F, true), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData7.addChild("lefthand2", ModelPartBuilder.create().uv(38,23).cuboid(-4.0F, 13.0F, 5.0F, 8.0F, 3.0F, 4.0F, true), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData7.addChild("lefthand3", ModelPartBuilder.create().uv(38,23).cuboid(0.0F, 13.0F, -8.0F, 8.0F, 3.0F, 4.0F, true), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData7.addChild("lefthand4", ModelPartBuilder.create().uv(38,23).cuboid(0.0F, 10.0F, -8.0F, 8.0F, 3.0F, 4.0F, true), ModelTransform.pivot(3.0F,6.0F,4.0F));
		modelPartData7.addChild("lefthand5", ModelPartBuilder.create().uv(38,23).cuboid(0.0F, 13.0F, -8.0F, 8.0F, 3.0F, 4.0F, true), ModelTransform.pivot(-2.0F,3.0F,-10.0F));
		ModelPartData modelPartData8 = modelPartData6.addChild("righthands", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-24.0F,0.0F));
		modelPartData8.addChild("righthand1", ModelPartBuilder.create().uv(38,23).cuboid(-8.0F, 19.0F, -1.0F, 8.0F, 3.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData8.addChild("righthand2", ModelPartBuilder.create().uv(38,23).cuboid(-3.0F, 12.0F, 5.0F, 8.0F, 3.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData8.addChild("righthand3", ModelPartBuilder.create().uv(38,23).cuboid(0.0F, 12.0F, -8.0F, 8.0F, 3.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData8.addChild("righthand4", ModelPartBuilder.create().uv(38,23).cuboid(4.0F, 10.0F, -8.0F, 8.0F, 3.0F, 4.0F), ModelTransform.pivot(-2.0F,6.0F,7.0F));
		modelPartData8.addChild("righthand5", ModelPartBuilder.create().uv(38,23).cuboid(0.0F, 12.0F, -8.0F, 8.0F, 3.0F, 4.0F), ModelTransform.pivot(-3.0F,4.0F,-5.0F));
		ModelPartData modelPartData9 = modelPartData.addChild("idlearms", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,24.0F,-5.0F));
		ModelPartData modelPartData10 = modelPartData9.addChild("leftarm3", ModelPartBuilder.create().uv(0,48).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 5.0F), ModelTransform.pivot(5.0F,-23.0F,0.0F));
		ModelPartData modelPartData11 = modelPartData10.addChild("la_up2", ModelPartBuilder.create().uv(14,53).cuboid(0.0F, 1.0F, -0.5F, 3.0F, 6.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData11.addChild("la_down2", ModelPartBuilder.create().uv(20,15).cuboid(0.0F, -4.0F, -6.5F, 3.0F, 4.0F, 8.0F), ModelTransform.pivot(0.0F,7.0F,1.5F));
		ModelPartData modelPartData12 = modelPartData9.addChild("rightarm3", ModelPartBuilder.create().uv(47,0).cuboid(-2.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F), ModelTransform.pivot(-6.0F,-23.0F,0.5F));
		ModelPartData modelPartData13 = modelPartData12.addChild("ra_up2", ModelPartBuilder.create().uv(52,9).cuboid(-2.0F, 1.0F, -1.0F, 3.0F, 6.0F, 4.0F), ModelTransform.pivot(1.0F,1.0F,-0.5F));
		modelPartData13.addChild("ra_down2", ModelPartBuilder.create().uv(38,23).cuboid(-1.0F, -3.0F, 0.0F, 8.0F, 3.0F, 4.0F), ModelTransform.pivot(1.0F,5.0F,-1.0F));
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
		this.idlearms.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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