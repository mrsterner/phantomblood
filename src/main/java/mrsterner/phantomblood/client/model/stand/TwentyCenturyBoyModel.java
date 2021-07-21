package mrsterner.phantomblood.client.model.stand;

import net.minecraft.client.model.ModelPart;
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
    public TwentyCenturyBoyModel() {
        super(1, 0, 64, 64);
        textureWidth = 64;
        textureHeight = 64;
        head = new ModelPart(this);
        head.setPivot(0.0F, -5.0F, 0.0F);
        head.setTextureOffset(0, 0).addCuboid(-4.5F, -9.0F, -4.5F, 9.0F, 9.0F, 9.0F, 0.0F, false);
        head.setTextureOffset(20, 51).addCuboid(2.0F, -9.5F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        head.setTextureOffset(14, 59).addCuboid(0.5F, -5.0F, -5.0F, 2.0F, 2.0F, 1.0F, -0.001F, false);
        head.setTextureOffset(14, 56).addCuboid(-2.5F, -5.0F, -5.0F, 2.0F, 2.0F, 1.0F, -0.001F, false);
        head.setTextureOffset(8, 59).addCuboid(1.5F, -6.0F, -5.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(8, 56).addCuboid(-3.5F, -6.0F, -5.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(20, 51).addCuboid(-3.0F, -9.5F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        head_r1 = new ModelPart(this);
        head_r1.setPivot(2.0F, -9.0F, -4.0F);
        head.addChild(head_r1);
        setRotationAngle(head_r1, 0.0F, -0.7854F, 0.0F);
        head_r1.setTextureOffset(20, 51).addCuboid(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, -0.001F, false);

        head_r2 = new ModelPart(this);
        head_r2.setPivot(3.0F, -9.0F, -4.0F);
        head.addChild(head_r2);
        setRotationAngle(head_r2, 0.0F, 0.7854F, 0.0F);
        head_r2.setTextureOffset(20, 51).addCuboid(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, -0.001F, false);

        head_r3 = new ModelPart(this);
        head_r3.setPivot(-2.0F, -9.0F, -4.0F);
        head.addChild(head_r3);
        setRotationAngle(head_r3, 0.0F, 0.7854F, 0.0F);
        head_r3.setTextureOffset(20, 51).addCuboid(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, -0.001F, false);

        head_r4 = new ModelPart(this);
        head_r4.setPivot(-3.0F, -9.0F, -4.0F);
        head.addChild(head_r4);
        setRotationAngle(head_r4, 0.0F, -0.7854F, 0.0F);
        head_r4.setTextureOffset(20, 51).addCuboid(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, -0.001F, false);

        bone2 = new ModelPart(this);
        bone2.setPivot(2.5F, -9.0F, -0.5F);
        head.addChild(bone2);
        setRotationAngle(bone2, 0.0F, 1.5708F, 0.0436F);
        bone2.setTextureOffset(20, 42).addCuboid(-1.0F, -7.0F, -0.5F, 2.0F, 8.0F, 1.0F, 0.1F, false);
        bone2.setTextureOffset(19, 18).addCuboid(-0.5F, -12.0F, -0.5F, 1.0F, 5.0F, 1.0F, -0.003F, false);

        bone3 = new ModelPart(this);
        bone3.setPivot(1.0F, -7.0F, 0.0F);
        bone2.addChild(bone3);
        setRotationAngle(bone3, 0.0F, 0.0F, -0.2618F);
        bone3.setTextureOffset(3, 34).addCuboid(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.002F, false);

        bone4 = new ModelPart(this);
        bone4.setPivot(-1.0F, -7.0F, 0.0F);
        bone2.addChild(bone4);
        setRotationAngle(bone4, 0.0F, 0.0F, 0.2618F);
        bone4.setTextureOffset(31, 5).addCuboid(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.001F, false);

        bone5 = new ModelPart(this);
        bone5.setPivot(-2.5F, -9.0F, -0.5F);
        head.addChild(bone5);
        setRotationAngle(bone5, 0.0F, -1.5708F, -0.0436F);
        bone5.setTextureOffset(0, 0).addCuboid(-1.0F, -7.0F, -0.5F, 2.0F, 8.0F, 1.0F, 0.1F, false);
        bone5.setTextureOffset(0, 18).addCuboid(-0.5F, -12.0F, -0.5F, 1.0F, 5.0F, 1.0F, -0.003F, false);

        bone6 = new ModelPart(this);
        bone6.setPivot(-1.0F, -7.0F, 0.0F);
        bone5.addChild(bone6);
        setRotationAngle(bone6, 0.0F, 0.0F, 0.2618F);
        bone6.setTextureOffset(27, 5).addCuboid(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.002F, false);

        bone7 = new ModelPart(this);
        bone7.setPivot(1.0F, -7.0F, 0.0F);
        bone5.addChild(bone7);
        setRotationAngle(bone7, 0.0F, 0.0F, -0.2618F);
        bone7.setTextureOffset(27, 0).addCuboid(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.001F, false);

        bone = new ModelPart(this);
        bone.setPivot(0.0F, -5.5F, -4.0F);
        head.addChild(bone);


        body = new ModelPart(this);
        body.setPivot(0.0F, -5.0F, 0.0F);
        body.setTextureOffset(38, 23).addCuboid(-4.0F, 0.0F, 2.5F, 8.0F, 6.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(27, 0).addCuboid(-4.0F, -1.0F, -0.5F, 8.0F, 1.0F, 4.0F, 0.0F, false);

        torso_r1 = new ModelPart(this);
        torso_r1.setPivot(-4.0F, 6.0F, 2.0F);
        body.addChild(torso_r1);
        setRotationAngle(torso_r1, 0.0F, 0.0F, -0.9163F);
        torso_r1.setTextureOffset(48, 10).addCuboid(0.0F, 0.0F, 0.5F, 4.0F, 5.0F, 1.0F, -0.003F, false);

        torso_r2 = new ModelPart(this);
        torso_r2.setPivot(4.0F, 6.0F, 2.0F);
        body.addChild(torso_r2);
        setRotationAngle(torso_r2, 0.0F, 0.0F, 0.9163F);
        torso_r2.setTextureOffset(48, 40).addCuboid(-4.0F, 0.0F, 0.5F, 4.0F, 5.0F, 1.0F, -0.001F, false);

        torso_r3 = new ModelPart(this);
        torso_r3.setPivot(-2.5F, 6.5F, 2.5F);
        body.addChild(torso_r3);
        setRotationAngle(torso_r3, 0.0F, 0.0F, -0.4363F);
        torso_r3.setTextureOffset(23, 18).addCuboid(0.0F, 1.0F, 0.0F, 1.0F, 4.0F, 1.0F, -0.006F, false);

        torso_r4 = new ModelPart(this);
        torso_r4.setPivot(2.5F, 6.5F, 2.5F);
        body.addChild(torso_r4);
        setRotationAngle(torso_r4, 0.0F, 0.0F, 0.4363F);
        torso_r4.setTextureOffset(35, 5).addCuboid(-2.0F, 2.0F, 0.0F, 1.0F, 2.0F, 1.0F, -0.005F, false);
        torso_r4.setTextureOffset(0, 30).addCuboid(-1.0F, 1.0F, 0.0F, 1.0F, 4.0F, 1.0F, -0.004F, false);

        lower = new ModelPart(this);
        lower.setPivot(0.0F, 7.0F, 0.0F);
        body.addChild(lower);
        setRotationAngle(lower, 0.1309F, 0.0F, 0.0F);


        upper = new ModelPart(this);
        upper.setPivot(0.0F, 5.0F, 0.0F);
        body.addChild(upper);


        leftArm = new ModelPart(this);
        leftArm.setPivot(4.0F, -3.0F, 0.0F);


        shoulder_r1 = new ModelPart(this);
        shoulder_r1.setPivot(4.0F, -3.0F, 0.0F);
        leftArm.addChild(shoulder_r1);
        setRotationAngle(shoulder_r1, -0.5236F, 0.0F, 0.0F);
        shoulder_r1.setTextureOffset(48, 47).addCuboid(1.5F, 0.0F, 0.0F, 1.0F, 4.0F, 6.0F, -0.001F, false);

        shoulder_r2 = new ModelPart(this);
        shoulder_r2.setPivot(0.0F, -4.0F, 0.0F);
        leftArm.addChild(shoulder_r2);
        setRotationAngle(shoulder_r2, -0.5236F, 0.0F, 0.0F);
        shoulder_r2.setTextureOffset(29, 11).addCuboid(-0.5F, 0.0F, 0.0F, 6.0F, 5.0F, 7.0F, -0.001F, false);

        shoulder_r3 = new ModelPart(this);
        shoulder_r3.setPivot(5.0F, -3.0F, 0.0F);
        leftArm.addChild(shoulder_r3);
        setRotationAngle(shoulder_r3, 0.5236F, 0.0F, 0.0F);
        shoulder_r3.setTextureOffset(45, 0).addCuboid(0.5F, 0.0F, -6.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);

        shoulder_r4 = new ModelPart(this);
        shoulder_r4.setPivot(0.0F, -4.0F, 0.0F);
        leftArm.addChild(shoulder_r4);
        setRotationAngle(shoulder_r4, 0.5236F, 0.0F, 0.0F);
        shoulder_r4.setTextureOffset(0, 30).addCuboid(-0.5F, 0.0F, -7.0F, 6.0F, 5.0F, 7.0F, 0.0F, false);

        arm = new ModelPart(this);
        arm.setPivot(2.0F, 0.0F, -3.0F);
        leftArm.addChild(arm);
        arm.setTextureOffset(0, 46).addCuboid(2.0F, 0.0F, 2.5F, 1.0F, 9.0F, 1.0F, -0.002F, false);
        arm.setTextureOffset(0, 46).addCuboid(2.0F, 6.0F, 0.5F, 1.0F, 1.0F, 5.0F, -0.005F, false);
        arm.setTextureOffset(0, 46).addCuboid(2.0F, 3.0F, 0.5F, 1.0F, 1.0F, 5.0F, -0.005F, false);

        cube_r1 = new ModelPart(this);
        cube_r1.setPivot(2.5F, 9.0F, 2.5F);
        arm.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
        cube_r1.setTextureOffset(0, 46).addCuboid(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, -0.005F, false);

        cube_r2 = new ModelPart(this);
        cube_r2.setPivot(2.5F, 9.0F, 3.5F);
        arm.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.7854F, 0.0F, 0.0F);
        cube_r2.setTextureOffset(0, 46).addCuboid(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, -0.005F, false);

        hand = new ModelPart(this);
        hand.setPivot(-6.0F, 1.0F, 0.0F);
        arm.addChild(hand);


        bone8 = new ModelPart(this);
        bone8.setPivot(3.0F, 4.0F, 0.5F);
        arm.addChild(bone8);
        setRotationAngle(bone8, 0.0F, 0.7854F, 0.0F);
        bone8.setTextureOffset(0, 46).addCuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, -0.006F, false);

        bone9 = new ModelPart(this);
        bone9.setPivot(0.0F, -1.0F, -1.0F);
        bone8.addChild(bone9);
        setRotationAngle(bone9, 0.0F, 0.7854F, 0.0F);
        bone9.setTextureOffset(0, 46).addCuboid(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, -0.007F, false);

        cube_r3 = new ModelPart(this);
        cube_r3.setPivot(0.0F, 1.0F, -3.0F);
        bone9.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.7854F, 0.0F, 0.0F);
        cube_r3.setTextureOffset(0, 46).addCuboid(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, -0.008F, false);

        cube_r4 = new ModelPart(this);
        cube_r4.setPivot(0.0F, 0.0F, -3.0F);
        bone9.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.7854F, 0.0F, 0.0F);
        cube_r4.setTextureOffset(0, 46).addCuboid(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, -0.008F, false);

        bone10 = new ModelPart(this);
        bone10.setPivot(3.0F, 5.0F, 0.5F);
        arm.addChild(bone10);
        setRotationAngle(bone10, 0.0F, 0.7854F, 0.0F);
        bone10.setTextureOffset(0, 46).addCuboid(-1.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, -0.006F, false);

        bone11 = new ModelPart(this);
        bone11.setPivot(0.0F, 1.0F, -1.0F);
        bone10.addChild(bone11);
        setRotationAngle(bone11, 0.0F, 0.7854F, 0.0F);
        bone11.setTextureOffset(0, 46).addCuboid(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, -0.007F, false);

        cube_r5 = new ModelPart(this);
        cube_r5.setPivot(0.0F, 1.0F, -3.0F);
        bone11.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.7854F, 0.0F, 0.0F);
        cube_r5.setTextureOffset(0, 46).addCuboid(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, -0.008F, false);

        cube_r6 = new ModelPart(this);
        cube_r6.setPivot(0.0F, 0.0F, -3.0F);
        bone11.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.7854F, 0.0F, 0.0F);
        cube_r6.setTextureOffset(0, 46).addCuboid(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, -0.008F, false);

        bone12 = new ModelPart(this);
        bone12.setPivot(3.0F, 6.0F, 5.5F);
        arm.addChild(bone12);
        setRotationAngle(bone12, 0.0F, -0.7854F, 0.0F);
        bone12.setTextureOffset(0, 46).addCuboid(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, -0.006F, false);

        bone13 = new ModelPart(this);
        bone13.setPivot(0.0F, 1.0F, 1.0F);
        bone12.addChild(bone13);
        setRotationAngle(bone13, 0.0F, -0.7854F, 0.0F);
        bone13.setTextureOffset(0, 46).addCuboid(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, -0.007F, false);

        cube_r7 = new ModelPart(this);
        cube_r7.setPivot(0.0F, 0.0F, 3.0F);
        bone13.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.7854F, 0.0F, 0.0F);
        cube_r7.setTextureOffset(0, 46).addCuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, -0.008F, false);

        cube_r8 = new ModelPart(this);
        cube_r8.setPivot(0.0F, -1.0F, 3.0F);
        bone13.addChild(cube_r8);
        setRotationAngle(cube_r8, -0.7854F, 0.0F, 0.0F);
        cube_r8.setTextureOffset(0, 46).addCuboid(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, -0.008F, false);

        bone14 = new ModelPart(this);
        bone14.setPivot(3.0F, 6.0F, 5.5F);
        arm.addChild(bone14);
        setRotationAngle(bone14, 0.0F, -0.7854F, 0.0F);
        bone14.setTextureOffset(0, 46).addCuboid(-1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, -0.006F, false);

        bone15 = new ModelPart(this);
        bone15.setPivot(0.0F, 1.0F, 1.0F);
        bone14.addChild(bone15);
        setRotationAngle(bone15, 0.0F, -0.7854F, 0.0F);
        bone15.setTextureOffset(0, 46).addCuboid(-1.0F, -4.0F, 0.0F, 1.0F, 1.0F, 3.0F, -0.007F, false);

        cube_r9 = new ModelPart(this);
        cube_r9.setPivot(0.0F, 0.0F, 3.0F);
        bone15.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.7854F, 0.0F, 0.0F);
        cube_r9.setTextureOffset(0, 46).addCuboid(-1.0F, -3.1213F, 1.1213F, 1.0F, 1.0F, 1.0F, -0.008F, false);

        cube_r10 = new ModelPart(this);
        cube_r10.setPivot(0.0F, -1.0F, 3.0F);
        bone15.addChild(cube_r10);
        setRotationAngle(cube_r10, -0.7854F, 0.0F, 0.0F);
        cube_r10.setTextureOffset(0, 46).addCuboid(-1.0F, -2.1213F, -3.1213F, 1.0F, 1.0F, 1.0F, -0.008F, false);

        rightArm = new ModelPart(this);
        rightArm.setPivot(-4.0F, -3.0F, 0.0F);


        shoulder_r5 = new ModelPart(this);
        shoulder_r5.setPivot(-4.0F, -3.0F, 0.0F);
        rightArm.addChild(shoulder_r5);
        setRotationAngle(shoulder_r5, -0.5236F, 0.0F, 0.0F);
        shoulder_r5.setTextureOffset(48, 47).addCuboid(-2.5F, 0.0F, 0.0F, 1.0F, 4.0F, 6.0F, -0.001F, true);

        shoulder_r6 = new ModelPart(this);
        shoulder_r6.setPivot(0.0F, -4.0F, 0.0F);
        rightArm.addChild(shoulder_r6);
        setRotationAngle(shoulder_r6, -0.5236F, 0.0F, 0.0F);
        shoulder_r6.setTextureOffset(29, 11).addCuboid(-5.5F, 0.0F, 0.0F, 6.0F, 5.0F, 7.0F, -0.001F, true);

        shoulder_r7 = new ModelPart(this);
        shoulder_r7.setPivot(-5.0F, -3.0F, 0.0F);
        rightArm.addChild(shoulder_r7);
        setRotationAngle(shoulder_r7, 0.5236F, 0.0F, 0.0F);
        shoulder_r7.setTextureOffset(45, 0).addCuboid(-1.5F, 0.0F, -6.0F, 1.0F, 4.0F, 6.0F, 0.0F, true);

        shoulder_r8 = new ModelPart(this);
        shoulder_r8.setPivot(0.0F, -4.0F, 0.0F);
        rightArm.addChild(shoulder_r8);
        setRotationAngle(shoulder_r8, 0.5236F, 0.0F, 0.0F);
        shoulder_r8.setTextureOffset(0, 30).addCuboid(-5.5F, 0.0F, -7.0F, 6.0F, 5.0F, 7.0F, 0.0F, true);

        arm3 = new ModelPart(this);
        arm3.setPivot(-2.0F, 0.0F, -3.0F);
        rightArm.addChild(arm3);
        arm3.setTextureOffset(0, 46).addCuboid(-3.0F, 0.0F, 2.5F, 1.0F, 9.0F, 1.0F, -0.002F, true);
        arm3.setTextureOffset(0, 46).addCuboid(-3.0F, 6.0F, 0.5F, 1.0F, 1.0F, 5.0F, -0.005F, true);
        arm3.setTextureOffset(0, 46).addCuboid(-3.0F, 3.0F, 0.5F, 1.0F, 1.0F, 5.0F, -0.005F, true);

        cube_r11 = new ModelPart(this);
        cube_r11.setPivot(-2.5F, 9.0F, 2.5F);
        arm3.addChild(cube_r11);
        setRotationAngle(cube_r11, -0.7854F, 0.0F, 0.0F);
        cube_r11.setTextureOffset(0, 46).addCuboid(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, -0.005F, true);

        cube_r12 = new ModelPart(this);
        cube_r12.setPivot(-2.5F, 9.0F, 3.5F);
        arm3.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.7854F, 0.0F, 0.0F);
        cube_r12.setTextureOffset(0, 46).addCuboid(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, -0.005F, true);

        hand3 = new ModelPart(this);
        hand3.setPivot(6.0F, 1.0F, 0.0F);
        arm3.addChild(hand3);


        bone24 = new ModelPart(this);
        bone24.setPivot(-3.0F, 4.0F, 0.5F);
        arm3.addChild(bone24);
        setRotationAngle(bone24, 0.0F, -0.7854F, 0.0F);
        bone24.setTextureOffset(0, 46).addCuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, -0.006F, true);

        bone25 = new ModelPart(this);
        bone25.setPivot(0.0F, -1.0F, -1.0F);
        bone24.addChild(bone25);
        setRotationAngle(bone25, 0.0F, -0.7854F, 0.0F);
        bone25.setTextureOffset(0, 46).addCuboid(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, -0.007F, true);

        cube_r13 = new ModelPart(this);
        cube_r13.setPivot(0.0F, 1.0F, -3.0F);
        bone25.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.7854F, 0.0F, 0.0F);
        cube_r13.setTextureOffset(0, 46).addCuboid(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, -0.008F, true);

        cube_r14 = new ModelPart(this);
        cube_r14.setPivot(0.0F, 0.0F, -3.0F);
        bone25.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.7854F, 0.0F, 0.0F);
        cube_r14.setTextureOffset(0, 46).addCuboid(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, -0.008F, true);

        bone26 = new ModelPart(this);
        bone26.setPivot(-3.0F, 5.0F, 0.5F);
        arm3.addChild(bone26);
        setRotationAngle(bone26, 0.0F, -0.7854F, 0.0F);
        bone26.setTextureOffset(0, 46).addCuboid(0.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, -0.006F, true);

        bone27 = new ModelPart(this);
        bone27.setPivot(0.0F, 1.0F, -1.0F);
        bone26.addChild(bone27);
        setRotationAngle(bone27, 0.0F, -0.7854F, 0.0F);
        bone27.setTextureOffset(0, 46).addCuboid(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, -0.007F, true);

        cube_r15 = new ModelPart(this);
        cube_r15.setPivot(0.0F, 1.0F, -3.0F);
        bone27.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.7854F, 0.0F, 0.0F);
        cube_r15.setTextureOffset(0, 46).addCuboid(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, -0.008F, true);

        cube_r16 = new ModelPart(this);
        cube_r16.setPivot(0.0F, 0.0F, -3.0F);
        bone27.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.7854F, 0.0F, 0.0F);
        cube_r16.setTextureOffset(0, 46).addCuboid(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, -0.008F, true);

        bone28 = new ModelPart(this);
        bone28.setPivot(-3.0F, 6.0F, 5.5F);
        arm3.addChild(bone28);
        setRotationAngle(bone28, 0.0F, 0.7854F, 0.0F);
        bone28.setTextureOffset(0, 46).addCuboid(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, -0.006F, true);

        bone29 = new ModelPart(this);
        bone29.setPivot(0.0F, 1.0F, 1.0F);
        bone28.addChild(bone29);
        setRotationAngle(bone29, 0.0F, 0.7854F, 0.0F);
        bone29.setTextureOffset(0, 46).addCuboid(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, -0.007F, true);

        cube_r17 = new ModelPart(this);
        cube_r17.setPivot(0.0F, 0.0F, 3.0F);
        bone29.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.7854F, 0.0F, 0.0F);
        cube_r17.setTextureOffset(0, 46).addCuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, -0.008F, true);

        cube_r18 = new ModelPart(this);
        cube_r18.setPivot(0.0F, -1.0F, 3.0F);
        bone29.addChild(cube_r18);
        setRotationAngle(cube_r18, -0.7854F, 0.0F, 0.0F);
        cube_r18.setTextureOffset(0, 46).addCuboid(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, -0.008F, true);

        bone30 = new ModelPart(this);
        bone30.setPivot(-3.0F, 6.0F, 5.5F);
        arm3.addChild(bone30);
        setRotationAngle(bone30, 0.0F, 0.7854F, 0.0F);
        bone30.setTextureOffset(0, 46).addCuboid(0.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, -0.006F, true);

        bone31 = new ModelPart(this);
        bone31.setPivot(0.0F, 1.0F, 1.0F);
        bone30.addChild(bone31);
        setRotationAngle(bone31, 0.0F, 0.7854F, 0.0F);
        bone31.setTextureOffset(0, 46).addCuboid(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 3.0F, -0.007F, true);

        cube_r19 = new ModelPart(this);
        cube_r19.setPivot(0.0F, 0.0F, 3.0F);
        bone31.addChild(cube_r19);
        setRotationAngle(cube_r19, 0.7854F, 0.0F, 0.0F);
        cube_r19.setTextureOffset(0, 46).addCuboid(0.0F, -3.1213F, 1.1213F, 1.0F, 1.0F, 1.0F, -0.008F, true);

        cube_r20 = new ModelPart(this);
        cube_r20.setPivot(0.0F, -1.0F, 3.0F);
        bone31.addChild(cube_r20);
        setRotationAngle(cube_r20, -0.7854F, 0.0F, 0.0F);
        cube_r20.setTextureOffset(0, 46).addCuboid(0.0F, -2.1213F, -3.1213F, 1.0F, 1.0F, 1.0F, -0.008F, true);
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
