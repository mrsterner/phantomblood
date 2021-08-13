// Made with Model Converter by Globox_Z
// Generate all required imports
package mrsterner.phantomblood.client.model.stand;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public class StarPlatinumModel extends EntityModel<LivingEntity> {
    private final ModelPart body;
    private final ModelPart chest;
    private final ModelPart bodybot;
    private final ModelPart cloth1;
    private final ModelPart cloth2;
    private final ModelPart crotch;
    private final ModelPart scarf;
    private final ModelPart scarf2;
    private final ModelPart chesttop;
    private final ModelPart head;
    private final ModelPart headband;
    private final ModelPart hair1;
    private final ModelPart hair2;
    private final ModelPart hair3;
    private final ModelPart hair4;
    private final ModelPart hair5;
    private final ModelPart hair6;
    private final ModelPart leftleg;
    private final ModelPart leftlegbot;
    private final ModelPart rightleg;
    private final ModelPart rightlegbot;
    private final ModelPart hands;
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
    private final ModelPart rightarm;
    private final ModelPart righthand;
    private final ModelPart armorr;
    private final ModelPart leftarm;
    private final ModelPart lefthand;
    private final ModelPart armorl;
    private final ModelPart shoulder;
    private final ModelPart armorr2;
    private final ModelPart armorl2;
    private final ModelPart leftarm2;
    private final ModelPart rightarm2;
    private double yOffset;
    private float off;
    public StarPlatinumModel(ModelPart root) {
        this.body = root.getChild("body");
        this.chesttop = this.body.getChild("chesttop");
        this.scarf2 = this.body.getChild("scarf2");
        this.scarf = this.body.getChild("scarf");
        this.crotch = this.body.getChild("crotch");
        this.cloth2 = this.body.getChild("cloth2");
        this.cloth1 = this.body.getChild("cloth1");
        this.bodybot = this.body.getChild("bodybot");
        this.chest = this.body.getChild("chest");
        this.head = root.getChild("head");
        this.hair6 = this.head.getChild("hair6");
        this.hair5 = this.head.getChild("hair5");
        this.hair4 = this.head.getChild("hair4");
        this.hair3 = this.head.getChild("hair3");
        this.hair2 = this.head.getChild("hair2");
        this.hair1 = this.head.getChild("hair1");
        this.headband = this.head.getChild("headband");
        this.leftleg = root.getChild("leftleg");
        this.leftlegbot = this.leftleg.getChild("leftlegbot");
        this.rightleg = root.getChild("rightleg");
        this.rightlegbot = this.rightleg.getChild("rightlegbot");
        this.hands = root.getChild("hands");
        this.lefthands = root.getChild("lefthands");
        this.lefthand5 = this.lefthands.getChild("lefthand5");
        this.lefthand4 = this.lefthands.getChild("lefthand4");
        this.lefthand3 = this.lefthands.getChild("lefthand3");
        this.lefthand2 = this.lefthands.getChild("lefthand2");
        this.lefthand1 = this.lefthands.getChild("lefthand1");
        this.righthands = root.getChild("righthands");
        this.righthand5 = this.righthands.getChild("righthand5");
        this.righthand4 = this.righthands.getChild("righthand4");
        this.righthand3 = this.righthands.getChild("righthand3");
        this.righthand2 = this.righthands.getChild("righthand2");
        this.righthand1 = this.righthands.getChild("righthand1");
        this.idlearms = root.getChild("idlearms");
        this.leftarm = this.idlearms.getChild("leftarm");
        this.armorl = this.leftarm.getChild("armorl");
        this.lefthand = this.leftarm.getChild("lefthand");
        this.rightarm = this.idlearms.getChild("rightarm");
        this.armorr = this.rightarm.getChild("armorr");
        this.righthand = this.rightarm.getChild("righthand");
        this.shoulder = root.getChild("shoulder");
        this.rightarm2 = this.shoulder.getChild("rightarm2");
        this.leftarm2 = this.shoulder.getChild("leftarm2");
        this.armorl2 = this.shoulder.getChild("armorl2");
        this.armorr2 = this.shoulder.getChild("armorr2");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
/*
        setRotationAngle(chest, -0.0873F, 0.0F, 0.0F);
        setRotationAngle(bodybot, -0.0175F, 0.0F, 0.0F);
        setRotationAngle(cloth1, -0.0611F, 0.0F, 0.0F);
        setRotationAngle(cloth2, 0.4538F, 0.0F, 0.0F);
        setRotationAngle(crotch, 0.0349F, 0.0F, 0.0F);
        setRotationAngle(scarf, 0.576F, 0.0F, 0.0F);
        setRotationAngle(scarf2, 0.2443F, 0.0F, 0.0F);
        setRotationAngle(chesttop, -0.0873F, 0.0F, 0.0F);

 */
        ModelPartData modelPartData1 = modelPartData.addChild("body", ModelPartBuilder.create().uv(16,16).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData1.addChild("chest", ModelPartBuilder.create().uv(35,56).cuboid(-1.5F, 4.0F, 0.0F, 3.0F, 3.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,-2.3F));
        modelPartData1.addChild("bodybot", ModelPartBuilder.create().uv(19,66).cuboid(-3.5F, 7.0F, -2.0F, 7.0F, 4.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData1.addChild("cloth1", ModelPartBuilder.create().uv(48,67).cuboid(-2.0F, -1.5F, 0.5F, 4.0F, 8.0F, 1.0F), ModelTransform.pivot(0.0F,12.0F,-4.5F));
        modelPartData1.addChild("cloth2", ModelPartBuilder.create().uv(48,56).cuboid(-2.5F, 0.0F, 1.0F, 5.0F, 9.0F, 1.0F), ModelTransform.pivot(0.0F,11.0F,1.0F));
        modelPartData1.addChild("crotch", ModelPartBuilder.create().uv(16,82).cuboid(-4.0F, 10.0F, -3.5F, 8.0F, 2.0F, 6.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData1.addChild("scarf", ModelPartBuilder.create().uv(24,35).cuboid(-5.0F, -1.0F, -4.0F, 10.0F, 2.0F, 10.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData1.addChild("scarf2", ModelPartBuilder.create().uv(28,35).cuboid(-4.5F, -1.0F, -4.5F, 9.0F, 3.0F, 9.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData1.addChild("chesttop", ModelPartBuilder.create().uv(35,49).cuboid(-3.5F, 0.2F, -2.5F, 7.0F, 4.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        ModelPartData modelPartData2 = modelPartData.addChild("head", ModelPartBuilder.create().uv(0,0).cuboid(-3.5F, -6.0F, -4.0F, 7.0F, 6.0F, 8.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData2.addChild("headband", ModelPartBuilder.create().uv(0,118).cuboid(-4.0F, -6.5F, -4.5F, 8.0F, 2.0F, 8.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData2.addChild("hair1", ModelPartBuilder.create().uv(0,35).cuboid(-4.0F, -8.0F, 0.5F, 3.0F, 3.0F, 6.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData2.addChild("hair2", ModelPartBuilder.create().uv(0,49).cuboid(-3.9F, -8.3F, -2.5F, 8.0F, 4.0F, 8.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData2.addChild("hair3", ModelPartBuilder.create().uv(0,35).cuboid(-2.0F, -9.0F, 0.0F, 4.0F, 4.0F, 8.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData2.addChild("hair4", ModelPartBuilder.create().uv(0,49).cuboid(0.2F, -8.0F, 0.0F, 3.0F, 4.0F, 7.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData2.addChild("hair5", ModelPartBuilder.create().uv(0,49).cuboid(-3.2F, -8.0F, 0.0F, 2.0F, 4.0F, 7.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData2.addChild("hair6", ModelPartBuilder.create().uv(0,35).cuboid(1.0F, -8.0F, 0.5F, 3.0F, 3.0F, 6.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        ModelPartData modelPartData3 = modelPartData.addChild("leftleg", ModelPartBuilder.create().uv(21,100).cuboid(-2.0F, 0.0F, -3.5F, 5.0F, 7.0F, 5.0F), ModelTransform.pivot(2.0F,12.0F,1.0F));
        modelPartData3.addChild("leftlegbot", ModelPartBuilder.create().uv(0,100).cuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F), ModelTransform.pivot(0.4313F,5.9635F,-0.0644F));
        ModelPartData modelPartData4 = modelPartData.addChild("rightleg", ModelPartBuilder.create().uv(21,100).cuboid(-3.0F, 0.0F, -2.5F, 5.0F, 7.0F, 5.0F, true), ModelTransform.pivot(-2.0F,12.0F,0.0F));
        modelPartData4.addChild("rightlegbot", ModelPartBuilder.create().uv(0,100).cuboid(-4.1154F, -1.9128F, -2.5F, 5.0F, 9.0F, 5.0F, true), ModelTransform.pivot(1.6154F,6.7528F,1.5678F));
        modelPartData.addChild("hands", ModelPartBuilder.create().uv(48,4).cuboid(-8.0F, -19.0F, -2.0F, 4.0F, 8.0F, 4.0F, true).uv(48,4).cuboid(18.0F, -12.0F, -2.0F, 4.0F, 8.0F, 4.0F).uv(48,4).cuboid(-13.0F, -13.0F, 6.0F, 4.0F, 8.0F, 4.0F, true).uv(48,4).cuboid(24.0F, -20.0F, 4.0F, 4.0F, 8.0F, 4.0F).uv(48,4).cuboid(-8.0F, -19.0F, 12.0F, 4.0F, 8.0F, 4.0F, true).uv(48,4).cuboid(19.0F, -17.0F, 12.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(-7.0F,-4.0F,-8.0F));
        ModelPartData modelPartData5 = modelPartData.addChild("idlearms", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,24.0F,0.0F));
        ModelPartData modelPartData6 = modelPartData5.addChild("rightarm", ModelPartBuilder.create().uv(40,16).cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 4.0F, 5.0F, true).uv(46,103).cuboid(-2.5F, 2.0F, -1.5F, 3.0F, 3.0F, 4.0F, true), ModelTransform.pivot(-5.0F,-21.0F,0.0F));
        modelPartData6.addChild("righthand", ModelPartBuilder.create().uv(48,4).cuboid(-1.7F, -3.0F, -1.7F, 4.0F, 8.0F, 4.0F, true), ModelTransform.pivot(-1.3F,5.0F,0.2F));
        modelPartData6.addChild("armorr", ModelPartBuilder.create().uv(0,74).cuboid(-9.0F, -1.0F, -3.5F, 4.0F, 1.0F, 6.0F, true), ModelTransform.pivot(5.0F,-2.0F,1.0F));
        ModelPartData modelPartData7 = modelPartData5.addChild("leftarm", ModelPartBuilder.create().uv(40,16).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 5.0F).uv(46,103).cuboid(-1.0F, 2.0F, -1.5F, 3.0F, 3.0F, 4.0F), ModelTransform.pivot(5.0F,-21.0F,0.0F));
        modelPartData7.addChild("lefthand", ModelPartBuilder.create().uv(48,4).cuboid(-2.5F, -2.0F, -4.5F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(0.0F,8.0F,0.5F));
        modelPartData7.addChild("armorl", ModelPartBuilder.create().uv(0,74).cuboid(-2.0F, -0.5F, -3.4F, 4.0F, 1.0F, 6.0F), ModelTransform.pivot(2.0F,-2.5F,0.9F));
        ModelPartData modelPartData8 = modelPartData.addChild("shoulder", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,24.0F,0.0F));
        modelPartData8.addChild("armorr2", ModelPartBuilder.create().uv(0,74).cuboid(-9.0F, -1.0F, -3.5F, 4.0F, 1.0F, 6.0F, true), ModelTransform.pivot(0.0F,-24.0F,0.0F));
        modelPartData8.addChild("armorl2", ModelPartBuilder.create().uv(0,74).cuboid(5.0F, -1.0F, -3.5F, 4.0F, 1.0F, 6.0F), ModelTransform.pivot(0.0F,-24.0F,0.0F));
        modelPartData8.addChild("leftarm2", ModelPartBuilder.create().uv(40,16).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 5.0F), ModelTransform.pivot(5.0F,-22.0F,0.0F));
        modelPartData8.addChild("rightarm2", ModelPartBuilder.create().uv(40,16).cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 4.0F, 5.0F, true), ModelTransform.pivot(-5.0F,-22.0F,0.0F));
        ModelPartData modelPartData9 = modelPartData.addChild("lefthands", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData9.addChild("lefthand1", ModelPartBuilder.create().uv(48,4).cuboid(8.0F, 10.0F, 3.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(5.0F,2.0F,0.0F));
        modelPartData9.addChild("lefthand2", ModelPartBuilder.create().uv(48,4).cuboid(9.0F, 3.0F, 0.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData9.addChild("lefthand3", ModelPartBuilder.create().uv(48,4).cuboid(7.0F, -5.0F, 4.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData9.addChild("lefthand4", ModelPartBuilder.create().uv(48,4).cuboid(15.0F, -11.0F, -1.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData9.addChild("lefthand5", ModelPartBuilder.create().uv(48,4).cuboid(11.0F, -3.0F, -4.0F, 4.0F, 8.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        ModelPartData modelPartData10 = modelPartData.addChild("righthands", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData10.addChild("righthand1", ModelPartBuilder.create().uv(48,4).cuboid(-14.0F, 11.0F, -1.0F, 4.0F, 8.0F, 4.0F, true), ModelTransform.pivot(5.0F,2.0F,0.0F));
        modelPartData10.addChild("righthand2", ModelPartBuilder.create().uv(48,4).cuboid(-14.0F, -5.0F, -4.0F, 4.0F, 8.0F, 4.0F, true), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData10.addChild("righthand3", ModelPartBuilder.create().uv(48,4).cuboid(-17.0F, 8.0F, 1.0F, 4.0F, 8.0F, 4.0F, true), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData10.addChild("righthand4", ModelPartBuilder.create().uv(48,4).cuboid(-20.0F, -10.0F, 2.0F, 4.0F, 8.0F, 4.0F, true), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData10.addChild("righthand5", ModelPartBuilder.create().uv(48,4).cuboid(-13.0F, 2.0F, 6.0F, 4.0F, 8.0F, 4.0F, true), ModelTransform.pivot(0.0F,0.0F,0.0F));
        return TexturedModelData.of(modelData,64,64);
/*
        setRotationAngle(hair1, 0.6109F, -0.1571F, 0.0349F);
        setRotationAngle(hair2, 0.1222F, 0.0F, 0.0F);
        setRotationAngle(hair3, 0.576F, 0.0F, 0.0F);
        setRotationAngle(hair4, 0.4363F, 0.2269F, 0.2094F);
        setRotationAngle(hair5, 0.4363F, -0.2269F, -0.2094F);
        setRotationAngle(hair6, 0.6109F, 0.1396F, -0.0349F);
        setRotationAngle(leftleg, -0.0262F, -0.1396F, -0.1745F);
        setRotationAngle(leftlegbot, 0.5236F, 0.0F, 0.0F);
        setRotationAngle(rightleg, -0.1047F, 0.1745F, 0.1571F);
        setRotationAngle(rightlegbot, 0.9506F, 0.1601F, 0.1487F);
        setRotationAngle(hands, -1.5708F, 0.0F, 0.0F);
        setRotationAngle(rightarm, 0.1745F, 0.4363F, 0.5236F);
        setRotationAngle(righthand, -1.4835F, 0.0873F, -0.5236F);
        setRotationAngle(leftarm, 0.2618F, -0.0873F, -0.4363F);
        setRotationAngle(lefthand, -1.7453F, -0.2618F, 0.6981F);
        setRotationAngle(armorr2, 0.5236F, 0.0F, 0.0F);
        setRotationAngle(armorl2, 0.5236F, 0.0F, 0.0F);
        setRotationAngle(leftarm2, 0.5236F, 0.0F, 0.0F);
        setRotationAngle(rightarm2, 0.5236F, 0.0F, 0.0F);
        setRotationAngle(lefthand1, -1.5708F, 0.0F, 0.0F);
        setRotationAngle(lefthand2, -1.5708F, 0.0F, 0.0F);
        setRotationAngle(lefthand3, -1.5708F, 0.0F, 0.0F);
        setRotationAngle(lefthand4, -1.5708F, 0.0F, 0.0F);
        setRotationAngle(lefthand5, -1.5708F, 0.0F, 0.0F);
        setRotationAngle(righthand1, -1.5708F, 0.0F, 0.0F);
        setRotationAngle(righthand2, -1.5708F, 0.0F, 0.0F);
        setRotationAngle(righthand3, -1.5708F, 0.0F, 0.0F);
        setRotationAngle(righthand4, -1.5708F, 0.0F, 0.0F);
        setRotationAngle(righthand5, -1.5708F, 0.0F, 0.0F);

 */
    }
    @Override
    public void setAngles(@Nullable LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch){
        //previously the render function, render code was moved to a method below
        this.yOffset = (double)MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;
        this.head.pitch = headPitch * 0.017453292F;
        this.head.yaw = headYaw * 0.017453292F;
        this.off = 1F + MathHelper.cos((float) (0.15*animationProgress))/6;
    }
    public void setAttackAngles(LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch){
        float power = 0.5F;
        float speed = 3.0F;
        this.yOffset = (double)MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;
        this.head.pitch = headPitch * 0.017453292F;
        this.head.yaw = headYaw * 0.017453292F;
        this.lefthand1.yaw = MathHelper.cos(speed * animationProgress) * 1.2F * power;
        this.lefthand2.yaw = MathHelper.cos(speed * animationProgress + 1.0471976F) * 1.4F * power;
        this.lefthand3.yaw = MathHelper.cos(speed * animationProgress + (float)2.0943951023931953D) * 1.6F * power;
        this.lefthand4.yaw = MathHelper.cos(speed * animationProgress + (float)2.6179938779914944D) * 1.3F * power;
        this.lefthand5.yaw = MathHelper.cos(speed * animationProgress + (float)3.141592653589793D) * 1.7F * power;
        this.righthand1.yaw = MathHelper.cos(speed * animationProgress + (float)3.665191429188092D) * 1.2F * power;
        this.righthand2.yaw = MathHelper.cos(speed * animationProgress + (float)6.283185307179586D) * 1.1F * power;
        this.righthand3.yaw = MathHelper.cos(speed * animationProgress + (float)8.377580409572781D) * 1.4F * power;
        this.righthand4.yaw = MathHelper.cos(speed * animationProgress + (float)10.471975511965978D) * 1.5F * power;
        this.righthand5.yaw = MathHelper.cos(speed * animationProgress + (float)1.5707963267948966D) * 1.6F * power;
        //this.lefthands.pitch = headPitch * 0.017453292F;
        //this.lefthands.yaw = headYaw * 0.017453292F;
        //this.righthands.pitch = headPitch * 0.017453292F;
        //this.righthands.yaw = headYaw * 0.017453292F;
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
        //this.lefthands.pivotX = offxl;
        //this.righthands.pivotX = offxr;
    }
    @Override
    public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        matrixStack.translate(0, this.yOffset - 0.6D, 0.75D);
        this.head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightleg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftleg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        this.idlearms.render(matrixStack, buffer, packedLight, packedOverlay);
        matrixStack.translate(0.0D, -this.yOffset, 0.0D);
        matrixStack.translate(0.0D, -0.3D, -0.2D);
        this.hands.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, 0.5F*off);
    }
    public void renderAttack(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        matrixStack.translate(0.0D, this.yOffset, -0.75D);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
        rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
        //matrixStack.translate(0.0D, 1.5D, 0.0D);
        shoulder.render(matrixStack, buffer, packedLight, packedOverlay);
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
