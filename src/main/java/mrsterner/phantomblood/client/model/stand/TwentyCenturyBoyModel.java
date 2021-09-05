package mrsterner.phantomblood.client.model.stand;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.NotNull;

public class TwentyCenturyBoyModel extends EntityModel<LivingEntity> {
    private final ModelPart head;
    private final ModelPart head_r1;
    private final ModelPart head_r2;
    private final ModelPart head_r3;
    private final ModelPart head_r4;
    private final ModelPart earL;
    private final ModelPart earL2;
    private final ModelPart earL3;
    private final ModelPart earR;
    private final ModelPart earR2;
    private final ModelPart earR3;
    private final ModelPart body;
    private final ModelPart torso_r1;
    private final ModelPart torso_r2;
    private final ModelPart torso_r3;
    private final ModelPart torso_r4;
    private final ModelPart lower;
    private final ModelPart upper;
    private final ModelPart leftArm;
    private final ModelPart shoulder_r1;
    private final ModelPart shoulder_r2;
    private final ModelPart shoulder_r3;
    private final ModelPart shoulder_r4;
    private final ModelPart armLeft;
    private final ModelPart cube_r1;
    private final ModelPart cube_r2;
    private final ModelPart hookFUL;
    private final ModelPart bone9;
    private final ModelPart cube_r3;
    private final ModelPart cube_r4;
    private final ModelPart hookFDL;
    private final ModelPart bone11;
    private final ModelPart cube_r5;
    private final ModelPart cube_r6;
    private final ModelPart hookBDL;
    private final ModelPart bone13;
    private final ModelPart cube_r7;
    private final ModelPart cube_r8;
    private final ModelPart hookBUL;
    private final ModelPart bone15;
    private final ModelPart cube_r9;
    private final ModelPart cube_r10;
    private final ModelPart rightArm;
    private final ModelPart shoulder_r5;
    private final ModelPart shoulder_r6;
    private final ModelPart shoulder_r7;
    private final ModelPart shoulder_r8;
    private final ModelPart armRight;
    private final ModelPart cube_r11;
    private final ModelPart cube_r12;
    private final ModelPart hookFDR;
    private final ModelPart bone2;
    private final ModelPart bone3;
    private final ModelPart bone4;
    private final ModelPart hookFUR;
    private final ModelPart bone6;
    private final ModelPart bone7;
    private final ModelPart bone8;
    private final ModelPart hookBDR;
    private final ModelPart bone10;
    private final ModelPart bone14;
    private final ModelPart bone16;
    private final ModelPart cube_r13;
    private final ModelPart hookBUR;
    private final ModelPart bone18;
    private final ModelPart bone19;
    private final ModelPart bone20;
    private final ModelPart cube_r14;
    public TwentyCenturyBoyModel(ModelPart root) {
        this.head = root.getChild("head");
        this.earR = this.head.getChild("earR");
        this.earR3 = this.earR.getChild("earR3");
        this.earR2 = this.earR.getChild("earR2");
        this.earL = this.head.getChild("earL");
        this.earL3 = this.earL.getChild("earL3");
        this.earL2 = this.earL.getChild("earL2");
        this.head_r4 = this.head.getChild("head_r4");
        this.head_r3 = this.head.getChild("head_r3");
        this.head_r2 = this.head.getChild("head_r2");
        this.head_r1 = this.head.getChild("head_r1");
        this.body = root.getChild("body");
        this.upper = this.body.getChild("upper");
        this.lower = this.body.getChild("lower");
        this.torso_r4 = this.body.getChild("torso_r4");
        this.torso_r3 = this.body.getChild("torso_r3");
        this.torso_r2 = this.body.getChild("torso_r2");
        this.torso_r1 = this.body.getChild("torso_r1");
        this.leftArm = root.getChild("leftArm");
        this.armLeft = this.leftArm.getChild("armLeft");
        this.hookBUL = this.armLeft.getChild("hookBUL");
        this.bone15 = this.hookBUL.getChild("bone15");
        this.cube_r10 = this.bone15.getChild("cube_r10");
        this.cube_r9 = this.bone15.getChild("cube_r9");
        this.hookBDL = this.armLeft.getChild("hookBDL");
        this.bone13 = this.hookBDL.getChild("bone13");
        this.cube_r8 = this.bone13.getChild("cube_r8");
        this.cube_r7 = this.bone13.getChild("cube_r7");
        this.hookFDL = this.armLeft.getChild("hookFDL");
        this.bone11 = this.hookFDL.getChild("bone11");
        this.cube_r6 = this.bone11.getChild("cube_r6");
        this.cube_r5 = this.bone11.getChild("cube_r5");
        this.hookFUL = this.armLeft.getChild("hookFUL");
        this.bone9 = this.hookFUL.getChild("bone9");
        this.cube_r4 = this.bone9.getChild("cube_r4");
        this.cube_r3 = this.bone9.getChild("cube_r3");
        this.cube_r2 = this.armLeft.getChild("cube_r2");
        this.cube_r1 = this.armLeft.getChild("cube_r1");
        this.shoulder_r4 = this.leftArm.getChild("shoulder_r4");
        this.shoulder_r3 = this.leftArm.getChild("shoulder_r3");
        this.shoulder_r2 = this.leftArm.getChild("shoulder_r2");
        this.shoulder_r1 = this.leftArm.getChild("shoulder_r1");
        this.rightArm = root.getChild("rightArm");
        this.armRight = this.rightArm.getChild("armRight");
        this.hookBUR = this.armRight.getChild("hookBUR");
        this.bone18 = this.hookBUR.getChild("bone18");
        this.bone20 = this.bone18.getChild("bone20");
        this.cube_r14 = this.bone20.getChild("cube_r14");
        this.bone19 = this.bone18.getChild("bone19");
        this.hookBDR = this.armRight.getChild("hookBDR");
        this.bone10 = this.hookBDR.getChild("bone10");
        this.bone16 = this.bone10.getChild("bone16");
        this.cube_r13 = this.bone16.getChild("cube_r13");
        this.bone14 = this.bone10.getChild("bone14");
        this.hookFUR = this.armRight.getChild("hookFUR");
        this.bone6 = this.hookFUR.getChild("bone6");
        this.bone8 = this.bone6.getChild("bone8");
        this.bone7 = this.bone6.getChild("bone7");
        this.hookFDR = this.armRight.getChild("hookFDR");
        this.bone2 = this.hookFDR.getChild("bone2");
        this.bone4 = this.bone2.getChild("bone4");
        this.bone3 = this.bone2.getChild("bone3");
        this.cube_r12 = this.armRight.getChild("cube_r12");
        this.cube_r11 = this.armRight.getChild("cube_r11");
        this.shoulder_r8 = this.rightArm.getChild("shoulder_r8");
        this.shoulder_r7 = this.rightArm.getChild("shoulder_r7");
        this.shoulder_r6 = this.rightArm.getChild("shoulder_r6");
        this.shoulder_r5 = this.rightArm.getChild("shoulder_r5");
        setRotationAngle(head_r1, 0.0F, -0.7854F, 0.0F);
        setRotationAngle(head_r2, 0.0F, 0.7854F, 0.0F);
        setRotationAngle(head_r3, 0.0F, 0.7854F, 0.0F);
        setRotationAngle(head_r4, 0.0F, -0.7854F, 0.0F);
        setRotationAngle(earL, 0.0F, 1.5708F, 0.0436F);
        setRotationAngle(earL2, 0.0F, 0.0F, -0.2618F);

        setRotationAngle(torso_r1, 0.0F, 0.0F, -0.9163F);
        setRotationAngle(torso_r2, 0.0F, 0.0F, 0.9163F);
        setRotationAngle(torso_r3, 0.0F, 0.0F, -0.4363F);
        setRotationAngle(torso_r4, 0.0F, 0.0F, 0.4363F);
        setRotationAngle(lower, 0.1309F, 0.0F, 0.0F);



        setRotationAngle(shoulder_r1, -0.5236F, 0.0F, 0.0F);
        setRotationAngle(shoulder_r2, -0.5236F, 0.0F, 0.0F);
        setRotationAngle(shoulder_r3, 0.5236F, 0.0F, 0.0F);
        setRotationAngle(shoulder_r4, 0.5236F, 0.0F, 0.0F);
        setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
        setRotationAngle(cube_r2, 0.7854F, 0.0F, 0.0F);
        setRotationAngle(hookFUL, 0.0F, 0.7854F, 0.0F);
        setRotationAngle(bone9, 0.0F, 0.7854F, 0.0F);
        setRotationAngle(cube_r3, 0.7854F, 0.0F, 0.0F);
        setRotationAngle(cube_r4, 0.7854F, 0.0F, 0.0F);
        setRotationAngle(hookFDL, 0.0F, 0.7854F, 0.0F);
        setRotationAngle(bone11, 0.0F, 0.7854F, 0.0F);
        setRotationAngle(cube_r5, 0.7854F, 0.0F, 0.0F);
        setRotationAngle(cube_r6, 0.7854F, 0.0F, 0.0F);
        setRotationAngle(hookBDL, 0.0F, -0.7854F, 0.0F);
        setRotationAngle(bone13, 0.0F, -0.7854F, 0.0F);
        setRotationAngle(cube_r7, 0.7854F, 0.0F, 0.0F);
        setRotationAngle(cube_r8, -0.7854F, 0.0F, 0.0F);
        setRotationAngle(hookBUL, 0.0F, -0.7854F, 0.0F);
        setRotationAngle(bone15, 0.0F, -0.7854F, 0.0F);
        setRotationAngle(cube_r9, 0.7854F, 0.0F, 0.0F);
        setRotationAngle(cube_r10, -0.7854F, 0.0F, 0.0F);

        setRotationAngle(shoulder_r5, -0.5236F, 0.0F, 0.0F);
        setRotationAngle(shoulder_r6, -0.5236F, 0.0F, 0.0F);
        setRotationAngle(shoulder_r7, 0.5236F, 0.0F, 0.0F);
        setRotationAngle(shoulder_r8, 0.5236F, 0.0F, 0.0F);
        setRotationAngle(cube_r11, -0.7854F, 0.0F, 0.0F);
        setRotationAngle(cube_r12, 0.7854F, 0.0F, 0.0F);
        setRotationAngle(hookFDR, 0.0F, -0.7854F, 0.0F);
        setRotationAngle(bone2, 0.0F, -0.7854F, 0.0F);
        setRotationAngle(bone3, 0.7854F, 0.0F, 0.0F);
        setRotationAngle(bone4, -0.7854F, 0.0F, 0.0F);
        setRotationAngle(hookFUR, 0.0F, -0.7854F, 0.0F);
        setRotationAngle(bone6, 0.0F, -0.7854F, 0.0F);
        setRotationAngle(bone7, 0.7854F, 0.0F, 0.0F);
        setRotationAngle(bone8, -0.7854F, 0.0F, 0.0F);
        setRotationAngle(hookBDR, 0.0F, 0.7854F, 0.0F);
        setRotationAngle(bone10, 0.0F, 0.7854F, 0.0F);
        setRotationAngle(bone14, -0.7854F, 0.0F, 0.0F);

        setRotationAngle(cube_r13, 0.7854F, 0.0F, 0.0F);
        setRotationAngle(hookBUR, 0.0F, 0.7854F, 0.0F);
        setRotationAngle(bone18, 0.0F, 0.7854F, 0.0F);
        setRotationAngle(bone19, -0.7854F, 0.0F, 0.0F);

        setRotationAngle(cube_r14, 0.7854F, 0.0F, 0.0F);
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();

        ModelPartData modelPartData1 = modelPartData.addChild("head", ModelPartBuilder.create().uv(0,0).cuboid(-4.5F, -9.0F, -4.5F, 9.0F, 9.0F, 9.0F).uv(20,51).cuboid(2.0F, -9.5F, -4.0F, 1.0F, 1.0F, 4.0F).uv(14,59).cuboid(0.5F, -5.0F, -5.0F, 2.0F, 2.0F, 1.0F, new Dilation(-0.001F)).uv(14,56).cuboid(-2.5F, -5.0F, -5.0F, 2.0F, 2.0F, 1.0F, new Dilation(-0.001F)).uv(8,59).cuboid(1.5F, -6.0F, -5.0F, 2.0F, 2.0F, 1.0F).uv(8,56).cuboid(-3.5F, -6.0F, -5.0F, 2.0F, 2.0F, 1.0F).uv(20,51).cuboid(-3.0F, -9.5F, -4.0F, 1.0F, 1.0F, 4.0F), ModelTransform.pivot(0.0F,-5.0F,0.0F));
        modelPartData1.addChild("head_r1", ModelPartBuilder.create().uv(20,51).cuboid(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.001F)), ModelTransform.pivot(2.0F,-9.0F,-4.0F));
        modelPartData1.addChild("head_r2", ModelPartBuilder.create().uv(20,51).cuboid(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.001F)), ModelTransform.pivot(3.0F,-9.0F,-4.0F));
        modelPartData1.addChild("head_r3", ModelPartBuilder.create().uv(20,51).cuboid(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.001F)), ModelTransform.pivot(-2.0F,-9.0F,-4.0F));
        modelPartData1.addChild("head_r4", ModelPartBuilder.create().uv(20,51).cuboid(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.001F)), ModelTransform.pivot(-3.0F,-9.0F,-4.0F));
        ModelPartData modelPartData2 = modelPartData1.addChild("earL", ModelPartBuilder.create().uv(20,42).cuboid(-1.0F, -7.0F, -0.5F, 2.0F, 8.0F, 1.0F, new Dilation(0.1F)).uv(19,18).cuboid(-0.5F, -12.0F, -0.5F, 1.0F, 5.0F, 1.0F, new Dilation(-0.003F)), ModelTransform.pivot(2.5F,-9.0F,-0.5F));
        modelPartData2.addChild("earL2", ModelPartBuilder.create().uv(3,34).cuboid(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(-0.002F)), ModelTransform.pivot(1.0F,-7.0F,0.0F));
        modelPartData2.addChild("earL3", ModelPartBuilder.create().uv(31,5).cuboid(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(-0.001F)), ModelTransform.pivot(-1.0F,-7.0F,0.0F));
        ModelPartData modelPartData3 = modelPartData1.addChild("earR", ModelPartBuilder.create().uv(0,0).cuboid(-1.0F, -7.0F, -0.5F, 2.0F, 8.0F, 1.0F, new Dilation(0.1F)).uv(0,18).cuboid(-0.5F, -12.0F, -0.5F, 1.0F, 5.0F, 1.0F, new Dilation(-0.003F)), ModelTransform.pivot(-2.5F,-9.0F,-0.5F));
        modelPartData3.addChild("earR2", ModelPartBuilder.create().uv(27,5).cuboid(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(-0.002F)), ModelTransform.pivot(-1.0F,-7.0F,0.0F));
        modelPartData3.addChild("earR3", ModelPartBuilder.create().uv(27,0).cuboid(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(-0.001F)), ModelTransform.pivot(1.0F,-7.0F,0.0F));
        ModelPartData modelPartData4 = modelPartData.addChild("body", ModelPartBuilder.create().uv(38,23).cuboid(-4.0F, 0.0F, 2.5F, 8.0F, 6.0F, 1.0F).uv(27,0).cuboid(-4.0F, -1.0F, -0.5F, 8.0F, 1.0F, 4.0F), ModelTransform.pivot(0.0F,-5.0F,0.0F));
        modelPartData4.addChild("torso_r1", ModelPartBuilder.create().uv(48,10).cuboid(0.0F, 0.0F, 0.5F, 4.0F, 5.0F, 1.0F, new Dilation(-0.003F)), ModelTransform.pivot(-4.0F,6.0F,2.0F));
        modelPartData4.addChild("torso_r2", ModelPartBuilder.create().uv(48,40).cuboid(-4.0F, 0.0F, 0.5F, 4.0F, 5.0F, 1.0F, new Dilation(-0.001F)), ModelTransform.pivot(4.0F,6.0F,2.0F));
        modelPartData4.addChild("torso_r3", ModelPartBuilder.create().uv(23,18).cuboid(0.0F, 1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new Dilation(-0.006F)), ModelTransform.pivot(-2.5F,6.5F,2.5F));
        modelPartData4.addChild("torso_r4", ModelPartBuilder.create().uv(35,5).cuboid(-2.0F, 2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(-0.005F)).uv(0,30).cuboid(-1.0F, 1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new Dilation(-0.004F)), ModelTransform.pivot(2.5F,6.5F,2.5F));
        modelPartData4.addChild("lower", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,7.0F,0.0F));
        modelPartData4.addChild("upper", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,5.0F,0.0F));
        ModelPartData modelPartData5 = modelPartData.addChild("leftArm", ModelPartBuilder.create(), ModelTransform.pivot(4.0F,-3.0F,0.0F));
        modelPartData5.addChild("shoulder_r1", ModelPartBuilder.create().uv(48,47).cuboid(1.5F, 0.0F, 0.0F, 1.0F, 4.0F, 6.0F, new Dilation(-0.001F)), ModelTransform.pivot(4.0F,-3.0F,0.0F));
        modelPartData5.addChild("shoulder_r2", ModelPartBuilder.create().uv(29,11).cuboid(-0.5F, 0.0F, 0.0F, 6.0F, 5.0F, 7.0F, new Dilation(-0.001F)), ModelTransform.pivot(0.0F,-4.0F,0.0F));
        modelPartData5.addChild("shoulder_r3", ModelPartBuilder.create().uv(45,0).cuboid(0.5F, 0.0F, -6.0F, 1.0F, 4.0F, 6.0F), ModelTransform.pivot(5.0F,-3.0F,0.0F));
        modelPartData5.addChild("shoulder_r4", ModelPartBuilder.create().uv(0,30).cuboid(-0.5F, 0.0F, -7.0F, 6.0F, 5.0F, 7.0F), ModelTransform.pivot(0.0F,-4.0F,0.0F));
        ModelPartData modelPartData6 = modelPartData5.addChild("armLeft", ModelPartBuilder.create().uv(0,46).cuboid(2.0F, 0.0F, 2.5F, 1.0F, 9.0F, 1.0F, new Dilation(-0.002F)).uv(0,46).cuboid(2.0F, 6.0F, 0.5F, 1.0F, 1.0F, 5.0F, new Dilation(-0.005F)).uv(0,46).cuboid(2.0F, 3.0F, 0.5F, 1.0F, 1.0F, 5.0F, new Dilation(-0.005F)), ModelTransform.pivot(2.0F,0.0F,-3.0F));
        modelPartData6.addChild("cube_r1", ModelPartBuilder.create().uv(0,46).cuboid(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.005F)), ModelTransform.pivot(2.5F,9.0F,2.5F));
        modelPartData6.addChild("cube_r2", ModelPartBuilder.create().uv(0,46).cuboid(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.005F)), ModelTransform.pivot(2.5F,9.0F,3.5F));
        ModelPartData modelPartData7 = modelPartData6.addChild("hookFUL", ModelPartBuilder.create().uv(0,46).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.006F)), ModelTransform.pivot(3.0F,4.0F,0.5F));
        ModelPartData modelPartData8 = modelPartData7.addChild("bone9", ModelPartBuilder.create().uv(0,46).cuboid(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(-0.007F)), ModelTransform.pivot(0.0F,-1.0F,-1.0F));
        modelPartData8.addChild("cube_r3", ModelPartBuilder.create().uv(0,46).cuboid(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F)), ModelTransform.pivot(0.0F,1.0F,-3.0F));
        modelPartData8.addChild("cube_r4", ModelPartBuilder.create().uv(0,46).cuboid(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F)), ModelTransform.pivot(0.0F,0.0F,-3.0F));
        ModelPartData modelPartData9 = modelPartData6.addChild("hookFDL", ModelPartBuilder.create().uv(0,46).cuboid(-1.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.006F)), ModelTransform.pivot(3.0F,5.0F,0.5F));
        ModelPartData modelPartData10 = modelPartData9.addChild("bone11", ModelPartBuilder.create().uv(0,46).cuboid(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(-0.007F)), ModelTransform.pivot(0.0F,1.0F,-1.0F));
        modelPartData10.addChild("cube_r5", ModelPartBuilder.create().uv(0,46).cuboid(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F)), ModelTransform.pivot(0.0F,1.0F,-3.0F));
        modelPartData10.addChild("cube_r6", ModelPartBuilder.create().uv(0,46).cuboid(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F)), ModelTransform.pivot(0.0F,0.0F,-3.0F));
        ModelPartData modelPartData11 = modelPartData6.addChild("hookBDL", ModelPartBuilder.create().uv(0,46).cuboid(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.006F)), ModelTransform.pivot(3.0F,6.0F,5.5F));
        ModelPartData modelPartData12 = modelPartData11.addChild("bone13", ModelPartBuilder.create().uv(0,46).cuboid(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(-0.007F)), ModelTransform.pivot(0.0F,1.0F,1.0F));
        modelPartData12.addChild("cube_r7", ModelPartBuilder.create().uv(0,46).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F)), ModelTransform.pivot(0.0F,0.0F,3.0F));
        modelPartData12.addChild("cube_r8", ModelPartBuilder.create().uv(0,46).cuboid(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F)), ModelTransform.pivot(0.0F,-1.0F,3.0F));
        ModelPartData modelPartData13 = modelPartData6.addChild("hookBUL", ModelPartBuilder.create().uv(0,46).cuboid(-1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.006F)), ModelTransform.pivot(3.0F,6.0F,5.5F));
        ModelPartData modelPartData14 = modelPartData13.addChild("bone15", ModelPartBuilder.create().uv(0,46).cuboid(-1.0F, -4.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(-0.007F)), ModelTransform.pivot(0.0F,1.0F,1.0F));
        modelPartData14.addChild("cube_r9", ModelPartBuilder.create().uv(0,46).cuboid(-1.0F, -3.1213F, 1.1213F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F)), ModelTransform.pivot(0.0F,0.0F,3.0F));
        modelPartData14.addChild("cube_r10", ModelPartBuilder.create().uv(0,46).cuboid(-1.0F, -2.1213F, -3.1213F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F)), ModelTransform.pivot(0.0F,-1.0F,3.0F));
        ModelPartData modelPartData15 = modelPartData.addChild("rightArm", ModelPartBuilder.create(), ModelTransform.pivot(-13.0F,24.0F,0.0F));
        modelPartData15.addChild("shoulder_r5", ModelPartBuilder.create().uv(48,47).cuboid(-5.5F, 0.0F, 0.0F, 1.0F, 4.0F, 6.0F, new Dilation(-0.001F)), ModelTransform.pivot(8.0F,-30.0F,0.0F));
        modelPartData15.addChild("shoulder_r6", ModelPartBuilder.create().uv(29,11).cuboid(-0.5F, 0.0F, 0.0F, 6.0F, 5.0F, 7.0F, new Dilation(-0.001F)), ModelTransform.pivot(4.0F,-31.0F,0.0F));
        modelPartData15.addChild("shoulder_r7", ModelPartBuilder.create().uv(45,0).cuboid(-6.5F, 0.0F, -6.0F, 1.0F, 4.0F, 6.0F), ModelTransform.pivot(9.0F,-30.0F,0.0F));
        modelPartData15.addChild("shoulder_r8", ModelPartBuilder.create().uv(0,30).cuboid(-0.5F, 0.0F, -7.0F, 6.0F, 5.0F, 7.0F), ModelTransform.pivot(4.0F,-31.0F,0.0F));
        ModelPartData modelPartData16 = modelPartData15.addChild("armRight", ModelPartBuilder.create().uv(0,46).cuboid(21.0F, -27.0F, -0.5F, 1.0F, 9.0F, 1.0F, new Dilation(-0.002F)).uv(0,46).cuboid(21.0F, -21.0F, -2.5F, 1.0F, 1.0F, 5.0F, new Dilation(-0.005F)).uv(0,46).cuboid(21.0F, -24.0F, -2.5F, 1.0F, 1.0F, 5.0F, new Dilation(-0.005F)), ModelTransform.pivot(-17.0F,0.0F,0.0F));
        modelPartData16.addChild("cube_r11", ModelPartBuilder.create().uv(0,46).cuboid(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.005F)), ModelTransform.pivot(21.5F,-18.0F,-0.5F));
        modelPartData16.addChild("cube_r12", ModelPartBuilder.create().uv(0,46).cuboid(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.005F)), ModelTransform.pivot(21.5F,-18.0F,0.5F));
        ModelPartData modelPartData17 = modelPartData16.addChild("hookFDR", ModelPartBuilder.create().uv(0,46).cuboid(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.006F)), ModelTransform.pivot(21.0F,-21.0F,-2.5F));
        ModelPartData modelPartData18 = modelPartData17.addChild("bone2", ModelPartBuilder.create().uv(0,46).cuboid(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(-0.007F)), ModelTransform.pivot(0.0F,0.0F,-1.0F));
        modelPartData18.addChild("bone3", ModelPartBuilder.create().uv(0,46).cuboid(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F)), ModelTransform.pivot(0.0F,0.0F,-3.0F));
        modelPartData18.addChild("bone4", ModelPartBuilder.create().uv(0,46).cuboid(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F)), ModelTransform.pivot(0.0F,1.0F,-3.0F));
        ModelPartData modelPartData19 = modelPartData16.addChild("hookFUR", ModelPartBuilder.create().uv(0,46).cuboid(0.0F, -3.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.006F)), ModelTransform.pivot(21.0F,-21.0F,-2.5F));
        ModelPartData modelPartData20 = modelPartData19.addChild("bone6", ModelPartBuilder.create().uv(0,46).cuboid(0.0F, -3.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(-0.007F)), ModelTransform.pivot(0.0F,0.0F,-1.0F));
        modelPartData20.addChild("bone7", ModelPartBuilder.create().uv(0,46).cuboid(0.0F, -2.1213F, 2.1213F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F)), ModelTransform.pivot(0.0F,0.0F,-3.0F));
        modelPartData20.addChild("bone8", ModelPartBuilder.create().uv(0,46).cuboid(0.0F, -3.1213F, -2.1213F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F)), ModelTransform.pivot(0.0F,1.0F,-3.0F));
        ModelPartData modelPartData21 = modelPartData16.addChild("hookBDR", ModelPartBuilder.create().uv(0,46).cuboid(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.006F)), ModelTransform.pivot(21.0F,-21.0F,2.5F));
        ModelPartData modelPartData22 = modelPartData21.addChild("bone10", ModelPartBuilder.create().uv(0,46).cuboid(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(-0.007F)), ModelTransform.pivot(0.0F,0.0F,1.0F));
        modelPartData22.addChild("bone14", ModelPartBuilder.create().uv(0,46).cuboid(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F)), ModelTransform.pivot(0.0F,0.0F,3.0F));
        ModelPartData modelPartData23 = modelPartData22.addChild("bone16", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData23.addChild("cube_r13", ModelPartBuilder.create().uv(0,46).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F)), ModelTransform.pivot(0.0F,1.0F,3.0F));
        ModelPartData modelPartData24 = modelPartData16.addChild("hookBUR", ModelPartBuilder.create().uv(0,46).cuboid(0.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.006F)), ModelTransform.pivot(21.0F,-21.0F,2.5F));
        ModelPartData modelPartData25 = modelPartData24.addChild("bone18", ModelPartBuilder.create().uv(0,46).cuboid(0.0F, -3.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(-0.007F)), ModelTransform.pivot(0.0F,0.0F,1.0F));
        modelPartData25.addChild("bone19", ModelPartBuilder.create().uv(0,46).cuboid(0.0F, -2.1213F, -3.1213F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F)), ModelTransform.pivot(0.0F,0.0F,3.0F));
        ModelPartData modelPartData26 = modelPartData25.addChild("bone20", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData26.addChild("cube_r14", ModelPartBuilder.create().uv(0,46).cuboid(0.0F, -3.1213F, 1.1213F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F)), ModelTransform.pivot(0.0F,1.0F,3.0F));

        return TexturedModelData.of(modelData,64,64);

    }
    @Override
    public void setAngles(LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch){
        //this.yOffset = (double) MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;
        //this.head.pitch = headPitch * 0.017453292F;
        //this.head.yaw = headYaw * 0.017453292F;
        //copyRotation(leftArm, super.leftArm);
        //copyRotation(rightArm, super.rightArm);
    }

    @Override
    public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        matrixStack.translate(0.0D, 0.34D, 0.0D);
        this.head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }
    public void renderBody(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        matrixStack.translate(0.0D, 0.34D, 0.0D);
        this.body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void renderLeft(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        matrixStack.translate(-0.34D, 0.1D, 0.0D);
        this.leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }
    public void renderRight(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        matrixStack.translate(0.34D, 0.1D, 0.0D);
        this.rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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



    public void setRotationAngle(ModelPart bone, float x, float y, float z) {
        bone.pitch = x;
        bone.yaw = y;
        bone.roll = z;
    }

}
