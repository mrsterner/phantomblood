package mrsterner.phantomblood.client.model;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class HamonModel <T extends LivingEntity> extends BipedEntityModel<T> {
    private final ModelPart body;
    private final ModelPart right;
    private final ModelPart heat;
    private final ModelPart rightHeat;
    private double yOffset;
    public HamonModel() {
        super(1, 0, 64, 64);
        textureWidth = 64;
        textureHeight = 64;
        body = new ModelPart(this);
        body.setPivot(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(0, 0).addCuboid(-1.0F, -21.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        right = new ModelPart(this);
        right.setPivot(3.5F, -21.5F, 0.0F);
        body.addChild(right);
        right.setTextureOffset(0, 0).addCuboid(-0.5F, -2.5F, -2.5F, 5.0F, 12.0F, 5.0F, 0.0F, false);

        heat = new ModelPart(this);
        heat.setPivot(0.0F, 24.0F, 0.0F);
        heat.setTextureOffset(0, 0).addCuboid(-1.0F, -21.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.3F, false);

        rightHeat = new ModelPart(this);
        rightHeat.setPivot(3.5F, -21.5F, 0.0F);
        heat.addChild(right);
        rightHeat.setTextureOffset(0, 0).addCuboid(-0.5F, -2.5F, -2.5F, 5.0F, 12.0F, 5.0F, 0.3F, false);



    }
    public void setAngles(@Nullable T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        this.yOffset = (double)MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.05D;
        super.setAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
        copyRotation(right, super.rightArm);
    }
    @Override
    public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        matrixStack.translate(-0.4D,1.4D,0D);
        this.right.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }
    public void renderHeat(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        this.rightHeat.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }
    public void setRotationAngle(ModelPart bone, float x, float y, float z) {
        bone.pitch = x;
        bone.yaw = y;
        bone.roll = z;
    }
    private void copyRotation(ModelPart to, ModelPart from) {
        to.pitch = from.pitch;
        to.yaw = from.yaw;
        to.roll = from.roll;
    }
    public ModelPart getRightArm() {
        return this.rightArm;
    }
    public ModelPart getLeftArm() {
        return this.leftArm;
    }

}