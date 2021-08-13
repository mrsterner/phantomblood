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
public class TheSunModel extends EntityModel<LivingEntity> {
	private final ModelPart head;
	private final ModelPart heat;
	private final ModelPart heat2;
	private double yOffset;
	public TheSunModel(ModelPart root) {
		this.head = root.getChild("head");
		this.heat = root.getChild("heat");
		this.heat2 = root.getChild("heat2");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		modelPartData.addChild("head", ModelPartBuilder.create().uv(0,0).cuboid(-7.0F, -7.0F, -7.0F, 14.0F, 14.0F, 14.0F), ModelTransform.pivot(-3.5F,-12.0F,3.2F));
		modelPartData.addChild("heat", ModelPartBuilder.create().uv(0,0).cuboid(-7.0F, -7.0F, -7.0F, 14.0F, 14.0F, 14.0F, new Dilation(1.0F)), ModelTransform.pivot(-3.5F,-12.0F,3.2F));
		modelPartData.addChild("heat2", ModelPartBuilder.create().uv(0,0).cuboid(-7.0F, -7.0F, -7.0F, 14.0F, 14.0F, 14.0F, new Dilation(2.0F)), ModelTransform.pivot(-3.5F,-12.0F,3.2F));
		return TexturedModelData.of(modelData,64,64);
	}
	public void setAttackAngles(LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
	}
	@Override
	public void setAngles(LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		this.yOffset = (double)MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.05D;
		float speed = 0.002F;
		this.head.yaw = 70F - animationProgress*speed*1.3F;
		this.heat.yaw = 70F - animationProgress*speed*1.3F;
		this.heat2.yaw = 70F - animationProgress*speed*1.3F;
		this.head.roll = 70F - animationProgress*speed*1.2F;
		this.heat.roll = 70F - animationProgress*speed*1.2F;
		this.heat2.roll = 70F - animationProgress*speed*1.2F;
		this.head.pitch = 70F - animationProgress*speed*1.2F;
		this.heat.pitch = 70F - animationProgress*speed*1.2F;
		this.heat2.pitch = 70F - animationProgress*speed*1.2F;
	}
	@Override
	public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		matrixStack.translate(-0.45D, this.yOffset - 0.2D, 0.75D);
		this.head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}
	public void renderHeat(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		this.heat.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}
	public void renderHeat2(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		this.heat2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}
	public void renderAttack(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		matrixStack.translate(0.1D, this.yOffset - 1D, -0.1D);
		this.head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}
	public void renderHeatAttack(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		this.heat.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}
	public void renderHeat2Attack(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		this.heat2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}
	public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
	}
}