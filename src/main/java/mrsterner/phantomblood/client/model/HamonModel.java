package mrsterner.phantomblood.client.model;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.PiglinEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class HamonModel <T extends LivingEntity> extends BipedEntityModel<T> {
    private final ModelPart body;
    private final ModelPart head;
    private final ModelPart leftarm;
    private final ModelPart rightarm;
    private double yOffset;

    public HamonModel(ModelPart root) {
        super(root);
        this.body = root.getChild("body");
        this.head = this.body.getChild("head");
        this.rightarm = this.body.getChild("rightarm");
        this.leftarm = this.body.getChild("leftarm");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData modelPartData1 = modelPartData.addChild("body", ModelPartBuilder.create().uv(0,0).cuboid(-1.0F, -21.0F, 0.0F, 1.0F, 1.0F, 1.0F), ModelTransform.pivot(0.0F,24.0F,0.0F));
        modelPartData1.addChild("leftarm", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData1.addChild("rightarm", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData1.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
        return TexturedModelData.of(modelData,64,64);

    }
    public void setAngles(@Nullable T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        this.yOffset = (double)MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.05D;
        super.setAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
        copyRotation(rightarm, super.rightArm);
    }
    @Override
    public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        matrixStack.translate(-0.4D,1.4D,0D);
        this.rightarm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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