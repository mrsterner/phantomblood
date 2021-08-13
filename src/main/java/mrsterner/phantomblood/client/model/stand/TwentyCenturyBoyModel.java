package mrsterner.phantomblood.client.model.stand;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.NotNull;

public class TwentyCenturyBoyModel <T extends LivingEntity> extends BipedEntityModel<T> {
    private final ModelPart head;
    private final ModelPart head_r1;
    private final ModelPart head_r2;
    private final ModelPart head_r3;
    private final ModelPart head_r4;
    private final ModelPart bone2;
    private final ModelPart bone3;
    private final ModelPart bone4;
    private final ModelPart bone5;
    private final ModelPart bone6;
    private final ModelPart bone7;
    private final ModelPart bone;
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
    private final ModelPart arm;
    private final ModelPart cube_r1;
    private final ModelPart cube_r2;
    private final ModelPart hand;
    private final ModelPart bone8;
    private final ModelPart bone9;
    private final ModelPart cube_r3;
    private final ModelPart cube_r4;
    private final ModelPart bone10;
    private final ModelPart bone11;
    private final ModelPart cube_r5;
    private final ModelPart cube_r6;
    private final ModelPart bone12;
    private final ModelPart bone13;
    private final ModelPart cube_r7;
    private final ModelPart cube_r8;
    private final ModelPart bone14;
    private final ModelPart bone15;
    private final ModelPart cube_r9;
    private final ModelPart cube_r10;
    private final ModelPart rightArm;
    private final ModelPart shoulder_r5;
    private final ModelPart shoulder_r6;
    private final ModelPart shoulder_r7;
    private final ModelPart shoulder_r8;
    private final ModelPart arm3;
    private final ModelPart cube_r11;
    private final ModelPart cube_r12;
    private final ModelPart hand3;
    private final ModelPart bone24;
    private final ModelPart bone25;
    private final ModelPart cube_r13;
    private final ModelPart cube_r14;
    private final ModelPart bone26;
    private final ModelPart bone27;
    private final ModelPart cube_r15;
    private final ModelPart cube_r16;
    private final ModelPart bone28;
    private final ModelPart bone29;
    private final ModelPart cube_r17;
    private final ModelPart cube_r18;
    private final ModelPart bone30;
    private final ModelPart bone31;
    private final ModelPart cube_r19;
    private final ModelPart cube_r20;
    public TwentyCenturyBoyModel(ModelPart root) {
        super(root);
        head         =root.getChild("body");
        head_r1      =root.getChild("body");
        head_r2      =root.getChild("body");
        head_r3      =root.getChild("body");
        head_r4      =root.getChild("body");
        bone2        =root.getChild("body");
        bone3        =root.getChild("body");
        bone4        =root.getChild("body");
        bone5        =root.getChild("body");
        bone6        =root.getChild("body");
        bone7        =root.getChild("body");
        bone         =root.getChild("body");
        body         =root.getChild("body");
        torso_r1     =root.getChild("body");
        torso_r2     =root.getChild("body");
        torso_r3     =root.getChild("body");
        torso_r4     =root.getChild("body");
        lower        =root.getChild("body");
        upper        =root.getChild("body");
        leftArm      =root.getChild("body");
        shoulder_r1  =root.getChild("body");
        shoulder_r2  =root.getChild("body");
        shoulder_r3  =root.getChild("body");
        shoulder_r4  =root.getChild("body");
        arm          =root.getChild("body");
        cube_r1      =root.getChild("body");
        cube_r2      =root.getChild("body");
        hand         =root.getChild("body");
        bone8        =root.getChild("body");
        bone9        =root.getChild("body");
        cube_r3      =root.getChild("body");
        cube_r4      =root.getChild("body");
        bone10       =root.getChild("body");
        bone11       =root.getChild("body");
        cube_r5      =root.getChild("body");
        cube_r6      =root.getChild("body");
        bone12       =root.getChild("body");
        bone13       =root.getChild("body");
        cube_r7      =root.getChild("body");
        cube_r8      =root.getChild("body");
        bone14       =root.getChild("body");
        bone15       =root.getChild("body");
        cube_r9      =root.getChild("body");
        cube_r10     =root.getChild("body");
        rightArm     =root.getChild("body");
        shoulder_r5  =root.getChild("body");
        shoulder_r6  =root.getChild("body");
        shoulder_r7  =root.getChild("body");
        shoulder_r8  =root.getChild("body");
        arm3         =root.getChild("body");
        cube_r11     =root.getChild("body");
        cube_r12     =root.getChild("body");
        hand3        =root.getChild("body");
        bone24       =root.getChild("body");
        bone25       =root.getChild("body");
        cube_r13     =root.getChild("body");
        cube_r14     =root.getChild("body");
        bone26       =root.getChild("body");
        bone27       =root.getChild("body");
        cube_r15     =root.getChild("body");
        cube_r16     =root.getChild("body");
        bone28       =root.getChild("body");
        bone29       =root.getChild("body");
        cube_r17     =root.getChild("body");
        cube_r18     =root.getChild("body");
        bone30       =root.getChild("body");
        bone31       =root.getChild("body");
        cube_r19     =root.getChild("body");
        cube_r20     =root.getChild("body");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();

        ModelPartData body = modelPartData.addChild("body",
                ModelPartBuilder.create()
                        .uv(38, 23).cuboid(-4.0F, 0.0F, 2.5F, 8.0F, 6.0F, 1.0F)
                        .uv(27, 0).cuboid(-4.0F, -1.0F, -0.5F, 8.0F, 1.0F, 4.0F),
                ModelTransform.of(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F));
        body.addChild("torso_r1",
                ModelPartBuilder.create()
                        .uv(48, 10).cuboid(0.0F, 0.0F, 0.5F, 4.0F, 5.0F, 1.0F, new Dilation(-0.003F, -0.003F, -0.003F)),
                ModelTransform.of(-4.0F, 6.0F, 2.0F, 0.0F, 0.0F, -0.9163F));
        body.addChild("torso_r2",
                ModelPartBuilder.create()
                        .uv(48, 40).cuboid(-4.0F, 0.0F, 0.5F, 4.0F, 5.0F, 1.0F, new Dilation(-0.001F, -0.001F, -0.001F)),
                ModelTransform.of(4.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.9163F));
        body.addChild("torso_r3",
                ModelPartBuilder.create()
                        .uv(23, 18).cuboid(0.0F, 1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new Dilation(-0.006F, -0.006F, -0.006F)),
                ModelTransform.of(-2.5F, 6.5F, 2.5F, 0.0F, 0.0F, -0.4363F));
        body.addChild("torso_r4",
                ModelPartBuilder.create()
                        .uv(35, 5).cuboid(-2.0F, 2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(-0.005F, -0.005F, -0.005F))
                        .uv(0, 30).cuboid(-1.0F, 1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new Dilation(-0.004F, -0.004F, -0.004F)),
                ModelTransform.of(2.5F, 6.5F, 2.5F, 0.0F, 0.0F, 0.4363F));
        body.addChild("lower",
                ModelPartBuilder.create(),
                ModelTransform.of(0.0F, 7.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
        body.addChild("upper",
                ModelPartBuilder.create(),
                ModelTransform.of(0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F));
        ModelPartData leftArm = modelPartData.addChild("leftArm",
                ModelPartBuilder.create(),
                ModelTransform.of(4.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F));
        leftArm.addChild("shoulder_r1",
                ModelPartBuilder.create()
                        .uv(48, 47).cuboid(1.5F, 0.0F, 0.0F, 1.0F, 4.0F, 6.0F, new Dilation(-0.001F, -0.001F, -0.001F)),
                ModelTransform.of(4.0F, -3.0F, 0.0F, -0.5236F, 0.0F, 0.0F));
        leftArm.addChild("shoulder_r2",
                ModelPartBuilder.create()
                        .uv(29, 11).cuboid(-0.5F, 0.0F, 0.0F, 6.0F, 5.0F, 7.0F, new Dilation(-0.001F, -0.001F, -0.001F)),
                ModelTransform.of(0.0F, -4.0F, 0.0F, -0.5236F, 0.0F, 0.0F));
        leftArm.addChild("shoulder_r3",
                ModelPartBuilder.create()
                        .uv(45, 0).cuboid(0.5F, 0.0F, -6.0F, 1.0F, 4.0F, 6.0F),
                ModelTransform.of(5.0F, -3.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
        leftArm.addChild("shoulder_r4",
                ModelPartBuilder.create()
                        .uv(0, 30).cuboid(-0.5F, 0.0F, -7.0F, 6.0F, 5.0F, 7.0F),
                ModelTransform.of(0.0F, -4.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
        ModelPartData arm = leftArm.addChild("arm",
                ModelPartBuilder.create()
                        .uv(0, 46).cuboid(2.0F, 0.0F, 2.5F, 1.0F, 9.0F, 1.0F, new Dilation(-0.002F, -0.002F, -0.002F))
                        .cuboid(2.0F, 6.0F, 0.5F, 1.0F, 1.0F, 5.0F, new Dilation(-0.005F, -0.005F, -0.005F))
                        .cuboid(2.0F, 3.0F, 0.5F, 1.0F, 1.0F, 5.0F, new Dilation(-0.005F, -0.005F, -0.005F)),
                ModelTransform.of(2.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F));
        arm.addChild("cube_r1",
                ModelPartBuilder.create()
                        .uv(0, 46).cuboid(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.005F, -0.005F, -0.005F)),
                ModelTransform.of(2.5F, 9.0F, 2.5F, -0.7854F, 0.0F, 0.0F));
        arm.addChild("cube_r2",
                ModelPartBuilder.create()
                        .uv(0, 46).cuboid(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.005F, -0.005F, -0.005F)),
                ModelTransform.of(2.5F, 9.0F, 3.5F, 0.7854F, 0.0F, 0.0F));
        arm.addChild("hand",
                ModelPartBuilder.create(),
                ModelTransform.of(-6.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F));
        ModelPartData bone8 = arm.addChild("bone8",
                ModelPartBuilder.create()
                        .uv(0, 46).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.006F, -0.006F, -0.006F)),
                ModelTransform.of(3.0F, 4.0F, 0.5F, 0.0F, 0.7854F, 0.0F));
        ModelPartData bone9 = bone8.addChild("bone9",
                ModelPartBuilder.create()
                        .uv(0, 46).cuboid(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(-0.007F, -0.007F, -0.007F)),
                ModelTransform.of(0.0F, -1.0F, -1.0F, 0.0F, 0.7854F, 0.0F));
        bone9.addChild("cube_r3",
                ModelPartBuilder.create()
                        .uv(0, 46).cuboid(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F, -0.008F, -0.008F)),
                ModelTransform.of(0.0F, 1.0F, -3.0F, 0.7854F, 0.0F, 0.0F));
        bone9.addChild("cube_r4",
                ModelPartBuilder.create()
                        .uv(0, 46).cuboid(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F, -0.008F, -0.008F)),
                ModelTransform.of(0.0F, 0.0F, -3.0F, 0.7854F, 0.0F, 0.0F));
        ModelPartData bone10 = arm.addChild("bone10",
                ModelPartBuilder.create()
                        .uv(0, 46).cuboid(-1.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.006F, -0.006F, -0.006F)),
                ModelTransform.of(3.0F, 5.0F, 0.5F, 0.0F, 0.7854F, 0.0F));
        ModelPartData bone11 = bone10.addChild("bone11",
                ModelPartBuilder.create()
                        .uv(0, 46).cuboid(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(-0.007F, -0.007F, -0.007F)),
                ModelTransform.of(0.0F, 1.0F, -1.0F, 0.0F, 0.7854F, 0.0F));
        bone11.addChild("cube_r5",
                ModelPartBuilder.create()
                        .uv(0, 46).cuboid(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F, -0.008F, -0.008F)),
                ModelTransform.of(0.0F, 1.0F, -3.0F, 0.7854F, 0.0F, 0.0F));
        bone11.addChild("cube_r6",
                ModelPartBuilder.create()
                        .uv(0, 46).cuboid(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F, -0.008F, -0.008F)),
                ModelTransform.of(0.0F, 0.0F, -3.0F, 0.7854F, 0.0F, 0.0F));
        ModelPartData bone12 = arm.addChild("bone12",
                ModelPartBuilder.create()
                        .uv(0, 46).cuboid(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.006F, -0.006F, -0.006F)),
                ModelTransform.of(3.0F, 6.0F, 5.5F, 0.0F, -0.7854F, 0.0F));
        ModelPartData bone13 = bone12.addChild("bone13",
                ModelPartBuilder.create()
                        .uv(0, 46).cuboid(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(-0.007F, -0.007F, -0.007F)),
                ModelTransform.of(0.0F, 1.0F, 1.0F, 0.0F, -0.7854F, 0.0F));
        bone13.addChild("cube_r7",
                ModelPartBuilder.create()
                        .uv(0, 46).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F, -0.008F, -0.008F)),
                ModelTransform.of(0.0F, 0.0F, 3.0F, 0.7854F, 0.0F, 0.0F));
        bone13.addChild("cube_r8",
                ModelPartBuilder.create()
                        .uv(0, 46).cuboid(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F, -0.008F, -0.008F)),
                ModelTransform.of(0.0F, -1.0F, 3.0F, -0.7854F, 0.0F, 0.0F));
        ModelPartData bone14 = arm.addChild("bone14",
                ModelPartBuilder.create()
                        .uv(0, 46).cuboid(-1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.006F, -0.006F, -0.006F)),
                ModelTransform.of(3.0F, 6.0F, 5.5F, 0.0F, -0.7854F, 0.0F));
        ModelPartData bone15 = bone14.addChild("bone15",
                ModelPartBuilder.create()
                        .uv(0, 46).cuboid(-1.0F, -4.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(-0.007F, -0.007F, -0.007F)),
                ModelTransform.of(0.0F, 1.0F, 1.0F, 0.0F, -0.7854F, 0.0F));
        bone15.addChild("cube_r9",
                ModelPartBuilder.create()
                        .uv(0, 46).cuboid(-1.0F, -3.1213F, 1.1213F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F, -0.008F, -0.008F)),
                ModelTransform.of(0.0F, 0.0F, 3.0F, 0.7854F, 0.0F, 0.0F));
        bone15.addChild("cube_r10",
                ModelPartBuilder.create()
                        .uv(0, 46).cuboid(-1.0F, -2.1213F, -3.1213F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F, -0.008F, -0.008F)),
                ModelTransform.of(0.0F, -1.0F, 3.0F, -0.7854F, 0.0F, 0.0F));
        ModelPartData rightArm = modelPartData.addChild("rightArm",
                ModelPartBuilder.create(),
                ModelTransform.of(-4.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F));
        rightArm.addChild("shoulder_r5",
                ModelPartBuilder.create()
                        .uv(48, 47).mirrored(true).cuboid(-2.5F, 0.0F, 0.0F, 1.0F, 4.0F, 6.0F, new Dilation(-0.001F, -0.001F, -0.001F)),
                ModelTransform.of(-4.0F, -3.0F, 0.0F, -0.5236F, 0.0F, 0.0F));
        rightArm.addChild("shoulder_r6",
                ModelPartBuilder.create()
                        .uv(29, 11).mirrored(true).cuboid(-5.5F, 0.0F, 0.0F, 6.0F, 5.0F, 7.0F, new Dilation(-0.001F, -0.001F, -0.001F)),
                ModelTransform.of(0.0F, -4.0F, 0.0F, -0.5236F, 0.0F, 0.0F));
        rightArm.addChild("shoulder_r7",
                ModelPartBuilder.create()
                        .uv(45, 0).mirrored(true).cuboid(-1.5F, 0.0F, -6.0F, 1.0F, 4.0F, 6.0F),
                ModelTransform.of(-5.0F, -3.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
        rightArm.addChild("shoulder_r8",
                ModelPartBuilder.create()
                        .uv(0, 30).mirrored(true).cuboid(-5.5F, 0.0F, -7.0F, 6.0F, 5.0F, 7.0F),
                ModelTransform.of(0.0F, -4.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
        ModelPartData arm3 = rightArm.addChild("arm3",
                ModelPartBuilder.create()
                        .uv(0, 46).mirrored(true).cuboid(-3.0F, 0.0F, 2.5F, 1.0F, 9.0F, 1.0F, new Dilation(-0.002F, -0.002F, -0.002F))
                        .cuboid(-3.0F, 6.0F, 0.5F, 1.0F, 1.0F, 5.0F, new Dilation(-0.005F, -0.005F, -0.005F))
                        .cuboid(-3.0F, 3.0F, 0.5F, 1.0F, 1.0F, 5.0F, new Dilation(-0.005F, -0.005F, -0.005F)),
                ModelTransform.of(-2.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F));
        arm3.addChild("cube_r11",
                ModelPartBuilder.create()
                        .uv(0, 46).mirrored(true).cuboid(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.005F, -0.005F, -0.005F)),
                ModelTransform.of(-2.5F, 9.0F, 2.5F, -0.7854F, 0.0F, 0.0F));
        arm3.addChild("cube_r12",
                ModelPartBuilder.create()
                        .uv(0, 46).mirrored(true).cuboid(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.005F, -0.005F, -0.005F)),
                ModelTransform.of(-2.5F, 9.0F, 3.5F, 0.7854F, 0.0F, 0.0F));
        arm3.addChild("hand3",
                ModelPartBuilder.create(),
                ModelTransform.of(6.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F));
        ModelPartData bone24 = arm3.addChild("bone24",
                ModelPartBuilder.create()
                        .uv(0, 46).mirrored(true).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.006F, -0.006F, -0.006F)),
                ModelTransform.of(-3.0F, 4.0F, 0.5F, 0.0F, -0.7854F, 0.0F));
        ModelPartData bone25 = bone24.addChild("bone25",
                ModelPartBuilder.create()
                        .uv(0, 46).mirrored(true).cuboid(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(-0.007F, -0.007F, -0.007F)),
                ModelTransform.of(0.0F, -1.0F, -1.0F, 0.0F, -0.7854F, 0.0F));
        bone25.addChild("cube_r13",
                ModelPartBuilder.create()
                        .uv(0, 46).mirrored(true).cuboid(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F, -0.008F, -0.008F)),
                ModelTransform.of(0.0F, 1.0F, -3.0F, 0.7854F, 0.0F, 0.0F));
        bone25.addChild("cube_r14",
                ModelPartBuilder.create()
                        .uv(0, 46).mirrored(true).cuboid(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F, -0.008F, -0.008F)),
                ModelTransform.of(0.0F, 0.0F, -3.0F, 0.7854F, 0.0F, 0.0F));
        ModelPartData bone26 = arm3.addChild("bone26",
                ModelPartBuilder.create()
                        .uv(0, 46).mirrored(true).cuboid(0.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.006F, -0.006F, -0.006F)),
                ModelTransform.of(-3.0F, 5.0F, 0.5F, 0.0F, -0.7854F, 0.0F));
        ModelPartData bone27 = bone26.addChild("bone27",
                ModelPartBuilder.create()
                        .uv(0, 46).mirrored(true).cuboid(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(-0.007F, -0.007F, -0.007F)),
                ModelTransform.of(0.0F, 1.0F, -1.0F, 0.0F, -0.7854F, 0.0F));
        bone27.addChild("cube_r15",
                ModelPartBuilder.create()
                        .uv(0, 46).mirrored(true).cuboid(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F, -0.008F, -0.008F)),
                ModelTransform.of(0.0F, 1.0F, -3.0F, 0.7854F, 0.0F, 0.0F));
        bone27.addChild("cube_r16",
                ModelPartBuilder.create()
                        .uv(0, 46).mirrored(true).cuboid(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F, -0.008F, -0.008F)),
                ModelTransform.of(0.0F, 0.0F, -3.0F, 0.7854F, 0.0F, 0.0F));
        ModelPartData bone28 = arm3.addChild("bone28",
                ModelPartBuilder.create()
                        .uv(0, 46).mirrored(true).cuboid(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.006F, -0.006F, -0.006F)),
                ModelTransform.of(-3.0F, 6.0F, 5.5F, 0.0F, 0.7854F, 0.0F));
        ModelPartData bone29 = bone28.addChild("bone29",
                ModelPartBuilder.create()
                        .uv(0, 46).mirrored(true).cuboid(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(-0.007F, -0.007F, -0.007F)),
                ModelTransform.of(0.0F, 1.0F, 1.0F, 0.0F, 0.7854F, 0.0F));
        bone29.addChild("cube_r17",
                ModelPartBuilder.create()
                        .uv(0, 46).mirrored(true).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F, -0.008F, -0.008F)),
                ModelTransform.of(0.0F, 0.0F, 3.0F, 0.7854F, 0.0F, 0.0F));
        bone29.addChild("cube_r18",
                ModelPartBuilder.create()
                        .uv(0, 46).mirrored(true).cuboid(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F, -0.008F, -0.008F)),
                ModelTransform.of(0.0F, -1.0F, 3.0F, -0.7854F, 0.0F, 0.0F));
        ModelPartData bone30 = arm3.addChild("bone30",
                ModelPartBuilder.create()
                        .uv(0, 46).mirrored(true).cuboid(0.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.006F, -0.006F, -0.006F)),
                ModelTransform.of(-3.0F, 6.0F, 5.5F, 0.0F, 0.7854F, 0.0F));
        ModelPartData bone31 = bone30.addChild("bone31",
                ModelPartBuilder.create()
                        .uv(0, 46).mirrored(true).cuboid(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(-0.007F, -0.007F, -0.007F)),
                ModelTransform.of(0.0F, 1.0F, 1.0F, 0.0F, 0.7854F, 0.0F));
        bone31.addChild("cube_r19",
                ModelPartBuilder.create()
                        .uv(0, 46).mirrored(true).cuboid(0.0F, -3.1213F, 1.1213F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F, -0.008F, -0.008F)),
                ModelTransform.of(0.0F, 0.0F, 3.0F, 0.7854F, 0.0F, 0.0F));
        bone31.addChild("cube_r20",
                ModelPartBuilder.create()
                        .uv(0, 46).mirrored(true).cuboid(0.0F, -2.1213F, -3.1213F, 1.0F, 1.0F, 1.0F, new Dilation(-0.008F, -0.008F, -0.008F)),
                ModelTransform.of(0.0F, -1.0F, 3.0F, -0.7854F, 0.0F, 0.0F));
        ModelPartData head = modelPartData.addChild("head",
                ModelPartBuilder.create()
                        .cuboid(-4.5F, -9.0F, -4.5F, 9.0F, 9.0F, 9.0F)
                        .uv(20, 51).cuboid(2.0F, -9.5F, -4.0F, 1.0F, 1.0F, 4.0F)
                        .uv(14, 59).cuboid(0.5F, -5.0F, -5.0F, 2.0F, 2.0F, 1.0F, new Dilation(-0.001F, -0.001F, -0.001F))
                        .uv(14, 56).cuboid(-2.5F, -5.0F, -5.0F, 2.0F, 2.0F, 1.0F, new Dilation(-0.001F, -0.001F, -0.001F))
                        .uv(8, 59).cuboid(1.5F, -6.0F, -5.0F, 2.0F, 2.0F, 1.0F)
                        .uv(8, 56).cuboid(-3.5F, -6.0F, -5.0F, 2.0F, 2.0F, 1.0F)
                        .uv(20, 51).cuboid(-3.0F, -9.5F, -4.0F, 1.0F, 1.0F, 4.0F),
                ModelTransform.of(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F));
        head.addChild("head_r1",
                ModelPartBuilder.create()
                        .uv(20, 51).cuboid(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.001F, -0.001F, -0.001F)),
                ModelTransform.of(2.0F, -9.0F, -4.0F, 0.0F, -0.7854F, 0.0F));
        head.addChild("head_r2",
                ModelPartBuilder.create()
                        .uv(20, 51).cuboid(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.001F, -0.001F, -0.001F)),
                ModelTransform.of(3.0F, -9.0F, -4.0F, 0.0F, 0.7854F, 0.0F));
        head.addChild("head_r3",
                ModelPartBuilder.create()
                        .uv(20, 51).cuboid(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.001F, -0.001F, -0.001F)),
                ModelTransform.of(-2.0F, -9.0F, -4.0F, 0.0F, 0.7854F, 0.0F));
        head.addChild("head_r4",
                ModelPartBuilder.create()
                        .uv(20, 51).cuboid(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(-0.001F, -0.001F, -0.001F)),
                ModelTransform.of(-3.0F, -9.0F, -4.0F, 0.0F, -0.7854F, 0.0F));
        ModelPartData bone2 = head.addChild("bone2",
                ModelPartBuilder.create()
                        .uv(20, 42).cuboid(-1.0F, -7.0F, -0.5F, 2.0F, 8.0F, 1.0F, new Dilation(0.1F, 0.1F, 0.1F))
                        .uv(19, 18).cuboid(-0.5F, -12.0F, -0.5F, 1.0F, 5.0F, 1.0F, new Dilation(-0.003F, -0.003F, -0.003F)),
                ModelTransform.of(2.5F, -9.0F, -0.5F, 0.0F, 1.5708F, 0.0436F));
        bone2.addChild("bone3",
                ModelPartBuilder.create()
                        .uv(3, 34).cuboid(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(-0.002F, -0.002F, -0.002F)),
                ModelTransform.of(1.0F, -7.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
        bone2.addChild("bone4",
                ModelPartBuilder.create()
                        .uv(31, 5).cuboid(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(-0.001F, -0.001F, -0.001F)),
                ModelTransform.of(-1.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
        ModelPartData bone5 = head.addChild("bone5",
                ModelPartBuilder.create()
                        .cuboid(-1.0F, -7.0F, -0.5F, 2.0F, 8.0F, 1.0F, new Dilation(0.1F, 0.1F, 0.1F))
                        .uv(0, 18).cuboid(-0.5F, -12.0F, -0.5F, 1.0F, 5.0F, 1.0F, new Dilation(-0.003F, -0.003F, -0.003F)),
                ModelTransform.of(-2.5F, -9.0F, -0.5F, 0.0F, -1.5708F, -0.0436F));
        bone5.addChild("bone6",
                ModelPartBuilder.create()
                        .uv(27, 5).cuboid(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(-0.002F, -0.002F, -0.002F)),
                ModelTransform.of(-1.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
        bone5.addChild("bone7",
                ModelPartBuilder.create()
                        .uv(27, 0).cuboid(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(-0.001F, -0.001F, -0.001F)),
                ModelTransform.of(1.0F, -7.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
        head.addChild("bone",
                ModelPartBuilder.create(),
                ModelTransform.of(0.0F, -5.5F, -4.0F, 0.0F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData,128,128);

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
