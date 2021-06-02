package mrsterner.phantomblood.common.entity;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class TheWorldAttackModel extends EntityModel<Entity> {
    private final ModelPart head;
    private final ModelPart helmTop_r1;
    private final ModelPart tube_r1;
    private final ModelPart faceplate;
    private final ModelPart faceplater_r1;
    private final ModelPart faceplatel_r1;
    private final ModelPart body;
    private final ModelPart lower;
    private final ModelPart right;
    private final ModelPart rightLower;
    private final ModelPart left;
    private final ModelPart leftLower;
    private final ModelPart leftLower_r1;
    private final ModelPart upper;
    private final ModelPart leftArm;
    private final ModelPart rightArm;
    private final ModelPart punchRight;
    private final ModelPart punchRight1;
    private final ModelPart punchRight2;
    private final ModelPart punchRight3;
    private final ModelPart punchRight4;
    private final ModelPart punchRight5;
    private final ModelPart punchLeft;
    private final ModelPart punchLeft1;
    private final ModelPart punchLeft2;
    private final ModelPart punchLeft3;
    private final ModelPart punchLeft4;
    private final ModelPart punchLeft5;
    public TheWorldAttackModel() {
        textureWidth = 128;
        textureHeight = 128;
        head = new ModelPart(this);
        head.setPivot(0.0F, 0.0F, 0.0F);
        head.setTextureOffset(0, 13).addCuboid(-3.5F, -12.0F, -4.0F, 7.0F, 7.0F, 8.0F, 0.0F, false);
        head.setTextureOffset(0, 0).addCuboid(-4.0F, -12.1F, -4.5F, 8.0F, 4.0F, 9.0F, 0.0F, false);

        helmTop_r1 = new ModelPart(this);
        helmTop_r1.setPivot(0.0F, -12.0F, 0.0F);
        head.addChild(helmTop_r1);
        setRotationAngle(helmTop_r1, 0.48F, 0.0F, 0.0F);
        helmTop_r1.setTextureOffset(22, 20).addCuboid(-4.0F, -2.1F, -4.0F, 8.0F, 4.0F, 8.0F, 0.1F, false);

        tube_r1 = new ModelPart(this);
        tube_r1.setPivot(0.0F, -8.1F, 1.5F);
        head.addChild(tube_r1);
        setRotationAngle(tube_r1, -0.1745F, 0.0F, 0.0F);
        tube_r1.setTextureOffset(25, 0).addCuboid(-4.5F, -1.0F, -3.5F, 9.0F, 2.0F, 7.0F, 0.0F, false);

        faceplate = new ModelPart(this);
        faceplate.setPivot(0.0F, -10.5F, -4.0F);
        head.addChild(faceplate);
        setRotationAngle(faceplate, 0.1309F, 0.0F, 0.0F);


        faceplater_r1 = new ModelPart(this);
        faceplater_r1.setPivot(0.0F, -1.0F, -2.0F);
        faceplate.addChild(faceplater_r1);
        setRotationAngle(faceplater_r1, 0.0F, 0.2618F, 0.0F);
        faceplater_r1.setTextureOffset(64, 16).addCuboid(-5.0F, -0.5F, 0.0F, 5.0F, 4.0F, 2.0F, 0.0F, false);

        faceplatel_r1 = new ModelPart(this);
        faceplatel_r1.setPivot(0.0F, -1.0F, -2.0F);
        faceplate.addChild(faceplatel_r1);
        setRotationAngle(faceplatel_r1, 0.0F, -0.2618F, 0.0F);
        faceplatel_r1.setTextureOffset(54, 26).addCuboid(0.0F, -0.5F, 0.0F, 5.0F, 4.0F, 2.0F, 0.001F, false);

        body = new ModelPart(this);
        body.setPivot(0.0F, -5.0F, 0.0F);
        setRotationAngle(body, 0.1309F, 0.0F, 0.0F);
        body.setTextureOffset(0, 28).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(47, 65).addCuboid(-2.5F, 0.0F, 3.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(0, 65).addCuboid(0.5F, 0.0F, 3.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(20, 46).addCuboid(1.0F, -1.0F, -3.0F, 2.0F, 11.0F, 6.0F, 0.0F, false);
        body.setTextureOffset(38, 40).addCuboid(-3.0F, -1.0F, -3.0F, 2.0F, 11.0F, 6.0F, 0.0F, false);

        lower = new ModelPart(this);
        lower.setPivot(0.0F, 7.0F, 0.0F);
        body.addChild(lower);
        setRotationAngle(lower, 0.1309F, 0.0F, 0.0F);
        lower.setTextureOffset(46, 18).addCuboid(-3.5F, 0.0F, -2.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);
        lower.setTextureOffset(27, 9).addCuboid(-4.0F, 3.0F, -3.5F, 8.0F, 2.0F, 7.0F, 0.0F, false);
        lower.setTextureOffset(66, 53).addCuboid(3.0F, 2.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
        lower.setTextureOffset(65, 29).addCuboid(-5.0F, 2.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);

        right = new ModelPart(this);
        right.setPivot(-2.25F, 5.0F, -1.0F);
        lower.addChild(right);
        setRotationAngle(right, -0.5672F, 0.1745F, 0.3927F);
        right.setTextureOffset(48, 32).addCuboid(-2.75F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

        rightLower = new ModelPart(this);
        rightLower.setPivot(-0.25F, 6.5F, 0.0F);
        right.addChild(rightLower);
        setRotationAngle(rightLower, 1.0036F, 0.0F, 0.0F);
        rightLower.setTextureOffset(24, 32).addCuboid(-2.5F, -1.5F, -1.5F, 5.0F, 9.0F, 5.0F, -0.2F, false);

        left = new ModelPart(this);
        left.setPivot(2.0F, 5.0F, -1.0F);
        lower.addChild(left);
        setRotationAngle(left, -0.5672F, -0.1745F, -0.3927F);
        left.setTextureOffset(52, 4).addCuboid(-2.0F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

        leftLower = new ModelPart(this);
        leftLower.setPivot(0.5F, 5.5F, 0.0F);
        left.addChild(leftLower);


        leftLower_r1 = new ModelPart(this);
        leftLower_r1.setPivot(0.0F, 0.0F, 0.0F);
        leftLower.addChild(leftLower_r1);
        setRotationAngle(leftLower_r1, 0.6109F, 0.0F, 0.0F);
        leftLower_r1.setTextureOffset(0, 39).addCuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, -0.2F, false);

        upper = new ModelPart(this);
        upper.setPivot(0.0F, 5.0F, 0.0F);
        body.addChild(upper);


        leftArm = new ModelPart(this);
        leftArm.setPivot(4.0F, -2.0F, 0.0F);
        upper.addChild(leftArm);
        setRotationAngle(leftArm, -1.1345F, 0.0F, -0.7418F);
        leftArm.setTextureOffset(31, 58).addCuboid(0.0F, -3.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);

        rightArm = new ModelPart(this);
        rightArm.setPivot(-4.0F, -2.0F, 0.0F);
        upper.addChild(rightArm);
        setRotationAngle(rightArm, -1.1345F, 0.0F, 0.7418F);
        rightArm.setTextureOffset(54, 44).addCuboid(-4.0F, -3.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);

        punchRight = new ModelPart(this);
        punchRight.setPivot(0.0F, -3.0F, 0.0F);


        punchRight1 = new ModelPart(this);
        punchRight1.setPivot(0.0F, 27.0F, 0.0F);
        punchRight.addChild(punchRight1);
        punchRight1.setTextureOffset(0, 76).addCuboid(11.0F, -34.0F, -3.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

        punchRight2 = new ModelPart(this);
        punchRight2.setPivot(0.0F, 27.0F, 0.0F);
        punchRight.addChild(punchRight2);
        punchRight2.setTextureOffset(0, 76).addCuboid(10.0F, -30.0F, 4.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

        punchRight3 = new ModelPart(this);
        punchRight3.setPivot(0.0F, 27.0F, 0.0F);
        punchRight.addChild(punchRight3);
        punchRight3.setTextureOffset(0, 76).addCuboid(13.0F, -26.0F, -3.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

        punchRight4 = new ModelPart(this);
        punchRight4.setPivot(0.0F, 27.0F, 0.0F);
        punchRight.addChild(punchRight4);
        punchRight4.setTextureOffset(0, 76).addCuboid(15.0F, -30.0F, -10.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

        punchRight5 = new ModelPart(this);
        punchRight5.setPivot(0.0F, 27.0F, 0.0F);
        punchRight.addChild(punchRight5);
        punchRight5.setTextureOffset(0, 76).addCuboid(11.0F, -24.0F, -8.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

        punchLeft = new ModelPart(this);
        punchLeft.setPivot(0.0F, 24.0F, 0.0F);


        punchLeft1 = new ModelPart(this);
        punchLeft1.setPivot(0.0F, -27.0F, 0.0F);
        punchLeft.addChild(punchLeft1);
        punchLeft1.setTextureOffset(24, 76).addCuboid(-14.0F, -7.0F, -4.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

        punchLeft2 = new ModelPart(this);
        punchLeft2.setPivot(0.0F, 0.0F, 0.0F);
        punchLeft.addChild(punchLeft2);
        punchLeft2.setTextureOffset(24, 76).addCuboid(-14.0F, -28.0F, 1.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

        punchLeft3 = new ModelPart(this);
        punchLeft3.setPivot(0.0F, 0.0F, 0.0F);
        punchLeft.addChild(punchLeft3);
        punchLeft3.setTextureOffset(24, 76).addCuboid(-18.0F, -31.0F, -8.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

        punchLeft4 = new ModelPart(this);
        punchLeft4.setPivot(0.0F, 0.0F, 0.0F);
        punchLeft.addChild(punchLeft4);
        punchLeft4.setTextureOffset(24, 76).addCuboid(-15.0F, -24.0F, -8.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

        punchLeft5 = new ModelPart(this);
        punchLeft5.setPivot(0.0F, 0.0F, 0.0F);
        punchLeft.addChild(punchLeft5);
        punchLeft5.setTextureOffset(24, 76).addCuboid(-20.0F, -28.0F, -13.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);
    }
    @Override
    public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }
    @Override
    public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){

        head.render(matrixStack, buffer, packedLight, packedOverlay);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        punchRight.render(matrixStack, buffer, packedLight, packedOverlay);
        punchLeft.render(matrixStack, buffer, packedLight, packedOverlay);
    }
    public void setRotationAngle(ModelPart bone, float x, float y, float z) {
        bone.pitch = x;
        bone.yaw = y;
        bone.roll = z;
    }

}