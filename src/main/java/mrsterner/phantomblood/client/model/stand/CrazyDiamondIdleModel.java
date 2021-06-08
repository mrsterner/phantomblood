// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports

package mrsterner.phantomblood.client.model.stand;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.Nullable;

public class CrazyDiamondIdleModel extends EntityModel<LivingEntity> {
private final ModelPart head;
	private final ModelPart Shape1;
	private final ModelPart Shape6;
	private final ModelPart Shape5;
	private final ModelPart Shape2;
	private final ModelPart Shape46;
	private final ModelPart Shape7;
	private final ModelPart Shape8;
	private final ModelPart glass;
	private final ModelPart Shape3;
	private final ModelPart bone;
	private final ModelPart Shape15;
	private final ModelPart Shape17;
	private final ModelPart Shape18;
	private final ModelPart Shape16;
	private final ModelPart Shape4;
	private final ModelPart heart7;
	private final ModelPart Shape60;
	private final ModelPart Shape61;
	private final ModelPart body;
	private final ModelPart bodydown;
	private final ModelPart Shape10;
	private final ModelPart Shape19;
	private final ModelPart Shape20;
	private final ModelPart Shape21;
	private final ModelPart Shape22;
	private final ModelPart heart;
	private final ModelPart Shape11;
	private final ModelPart Shape23;
	private final ModelPart heart2;
	private final ModelPart Shape24;
	private final ModelPart Shape25;
	private final ModelPart Shape12;
	private final ModelPart Shape53;
	private final ModelPart Shape54;
	private final ModelPart Shape55;
	private final ModelPart Shape56;
	private final ModelPart Shape57;
	private final ModelPart Shape58;
	private final ModelPart Shape29;
	private final ModelPart Shape34;
	private final ModelPart Shape35;
	private final ModelPart Shape36;
	private final ModelPart Shape37;
	private final ModelPart Shape38;
	private final ModelPart Shape49;
	private final ModelPart Shape50;
	private final ModelPart Shape51;
	private final ModelPart Shape52;
	private final ModelPart Shape39;
	private final ModelPart Shape40;
	private final ModelPart Shape41;
	private final ModelPart Shape42;
	private final ModelPart Shape47;
	private final ModelPart Shape48;
	private final ModelPart Shape43;
	private final ModelPart Shape44;
	private final ModelPart leftarm;
	private final ModelPart leftarmdown;
	private final ModelPart armmiddle;
	private final ModelPart heart5;
	private final ModelPart Shape30;
	private final ModelPart Shape31;
	private final ModelPart rightarm;
	private final ModelPart rightarmdown;
	private final ModelPart armmiddle2;
	private final ModelPart heart6;
	private final ModelPart Shape32;
	private final ModelPart Shape33;
	private final ModelPart leftleg;
	private final ModelPart heart3;
	private final ModelPart Shape26;
	private final ModelPart Shape27;
	private final ModelPart legdownl;
	private final ModelPart rightleg;
	private final ModelPart heart4;
	private final ModelPart Shape9;
	private final ModelPart Shape28;
	private final ModelPart legdownr;
	private double yOffset;

public CrazyDiamondIdleModel() {
		textureWidth = 128;
		textureHeight = 128;
		head = new ModelPart(this);
		head.setPivot(0.0F, 0.0F, 0.0F);
		setRotationAngle(head, 0.2618F, 0.0F, 0.0F);
		head.setTextureOffset(21, 21).addCuboid(-3.5F, -6.0F, -3.0F, 7.0F, 6.0F, 7.0F, 0.0F, false);

		Shape1 = new ModelPart(this);
		Shape1.setPivot(0.0F, 0.0F, 0.0F);
		head.addChild(Shape1);
		setRotationAngle(Shape1, 0.4014F, 0.0F, 0.0F);
		Shape1.setTextureOffset(26, 5).addCuboid(-4.6F, -8.0F, 0.0F, 9.0F, 3.0F, 6.0F, 0.01F, false);

		Shape6 = new ModelPart(this);
		Shape6.setPivot(3.854F, -7.8722F, 2.5976F);
		head.addChild(Shape6);
		setRotationAngle(Shape6, 0.4887F, 0.6545F, 0.3491F);
		Shape6.setTextureOffset(65, 68).addCuboid(-3.0F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.02F, false);

		Shape5 = new ModelPart(this);
		Shape5.setPivot(-3.854F, -7.8722F, 2.5976F);
		head.addChild(Shape5);
		setRotationAngle(Shape5, 0.4887F, -0.6545F, -0.3491F);
		Shape5.setTextureOffset(0, 68).addCuboid(0.0F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.02F, false);

		Shape2 = new ModelPart(this);
		Shape2.setPivot(0.0F, 0.0F, 0.0F);
		head.addChild(Shape2);
		setRotationAngle(Shape2, 0.0524F, 0.0F, 0.0F);
		Shape2.setTextureOffset(0, 0).addCuboid(-4.5F, -7.2F, -1.7F, 9.0F, 4.0F, 7.0F, 0.0F, false);

		Shape46 = new ModelPart(this);
		Shape46.setPivot(0.0F, 1.4F, 0.0F);
		head.addChild(Shape46);
		setRotationAngle(Shape46, 0.0524F, 0.0F, 0.0F);
		Shape46.setTextureOffset(22, 14).addCuboid(-4.5F, -4.2F, 3.3F, 9.0F, 1.0F, 2.0F, 0.0F, false);

		Shape7 = new ModelPart(this);
		Shape7.setPivot(0.3F, 2.9432F, -0.7469F);
		head.addChild(Shape7);
		setRotationAngle(Shape7, 0.0524F, 0.0F, 0.0F);
		Shape7.setTextureOffset(62, 17).addCuboid(-4.5F, -6.2F, -1.7F, 1.0F, 3.0F, 7.0F, 0.0F, false);

		Shape8 = new ModelPart(this);
		Shape8.setPivot(-0.3F, 2.9432F, -0.7469F);
		head.addChild(Shape8);
		setRotationAngle(Shape8, 0.0524F, 0.0F, 0.0F);
		Shape8.setTextureOffset(20, 60).addCuboid(3.5F, -6.2F, -1.7F, 1.0F, 3.0F, 7.0F, 0.0F, false);

		glass = new ModelPart(this);
		glass.setPivot(0.0F, -0.8F, 0.1F);
		head.addChild(glass);
		setRotationAngle(glass, 0.192F, 0.0F, 0.0F);
		

		Shape3 = new ModelPart(this);
		Shape3.setPivot(0.0F, 0.0F, 1.0F);
		glass.addChild(Shape3);
		setRotationAngle(Shape3, 0.0F, 1.0996F, 0.0F);
		Shape3.setTextureOffset(58, 38).addCuboid(2.6251F, -6.9618F, -2.9109F, 3.0F, 2.0F, 6.0F, 0.0F, false);

		bone = new ModelPart(this);
		bone.setPivot(1.5111F, -4.2251F, -2.5709F);
		glass.addChild(bone);
		

		Shape15 = new ModelPart(this);
		Shape15.setPivot(0.0F, 0.0F, 0.0F);
		bone.addChild(Shape15);
		setRotationAngle(Shape15, 0.0F, 1.1345F, 0.0F);
		Shape15.setTextureOffset(63, 46).addCuboid(-0.7F, 1.0F, -2.3F, 2.0F, 2.0F, 5.0F, -0.1F, false);

		Shape17 = new ModelPart(this);
		Shape17.setPivot(0.0606F, -0.1107F, 0.5693F);
		bone.addChild(Shape17);
		setRotationAngle(Shape17, 0.0F, 1.1345F, 0.0F);
		Shape17.setTextureOffset(22, 34).addCuboid(0.3F, -1.0F, -2.4F, 1.0F, 3.0F, 1.0F, -0.11F, false);

		Shape18 = new ModelPart(this);
		Shape18.setPivot(-3.0829F, -0.1107F, 0.5693F);
		bone.addChild(Shape18);
		setRotationAngle(Shape18, 0.0F, -1.1345F, 0.0F);
		Shape18.setTextureOffset(0, 24).addCuboid(-1.3F, -1.0F, -2.4F, 1.0F, 3.0F, 1.0F, -0.11F, false);

		Shape16 = new ModelPart(this);
		Shape16.setPivot(-3.2942F, -0.0242F, 0.1244F);
		bone.addChild(Shape16);
		setRotationAngle(Shape16, 0.0F, -1.1345F, 0.0F);
		Shape16.setTextureOffset(63, 27).addCuboid(-1.3F, 1.0F, -2.6F, 2.0F, 2.0F, 5.0F, -0.1F, false);

		Shape4 = new ModelPart(this);
		Shape4.setPivot(0.0F, 0.0F, 1.0F);
		glass.addChild(Shape4);
		setRotationAngle(Shape4, 0.0F, -1.0996F, 0.0F);
		Shape4.setTextureOffset(57, 9).addCuboid(-5.6251F, -6.9618F, -2.9109F, 3.0F, 2.0F, 6.0F, 0.0F, false);

		heart7 = new ModelPart(this);
		heart7.setPivot(-2.55F, 5.5F, -0.8F);
		head.addChild(heart7);
		

		Shape60 = new ModelPart(this);
		Shape60.setPivot(2.1717F, -5.3382F, -2.2F);
		heart7.addChild(Shape60);
		setRotationAngle(Shape60, 0.0F, 0.0F, 0.7679F);
		Shape60.setTextureOffset(40, 17).addCuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		Shape61 = new ModelPart(this);
		Shape61.setPivot(2.9111F, -5.3333F, -2.2F);
		heart7.addChild(Shape61);
		setRotationAngle(Shape61, 0.0F, 0.0F, -0.7679F);
		Shape61.setTextureOffset(25, 5).addCuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		body = new ModelPart(this);
		body.setPivot(0.0F, 0.0F, 0.0F);
		setRotationAngle(body, 0.357F, -0.5369F, 0.0666F);
		body.setTextureOffset(0, 11).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 6.0F, 0.0F, false);

		bodydown = new ModelPart(this);
		bodydown.setPivot(0.0F, 0.0F, 0.0F);
		body.addChild(bodydown);
		bodydown.setTextureOffset(44, 29).addCuboid(-3.5F, 7.0F, -1.6F, 7.0F, 4.0F, 5.0F, 0.0F, false);

		Shape10 = new ModelPart(this);
		Shape10.setPivot(0.0F, 0.0F, 0.0F);
		body.addChild(Shape10);
		Shape10.setTextureOffset(25, 0).addCuboid(-3.5F, 0.2F, -2.9F, 7.0F, 4.0F, 1.0F, 0.0F, false);

		Shape19 = new ModelPart(this);
		Shape19.setPivot(0.0F, 0.0F, 6.6F);
		body.addChild(Shape19);
		Shape19.setTextureOffset(63, 53).addCuboid(-3.0F, 0.2F, -3.9F, 6.0F, 1.0F, 2.0F, 0.0F, false);

		Shape20 = new ModelPart(this);
		Shape20.setPivot(0.0F, 5.0F, 6.6F);
		body.addChild(Shape20);
		Shape20.setTextureOffset(64, 63).addCuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		Shape21 = new ModelPart(this);
		Shape21.setPivot(-1.691F, 3.0301F, 6.5F);
		body.addChild(Shape21);
		setRotationAngle(Shape21, 0.0F, 0.0F, 1.1345F);
		Shape21.setTextureOffset(41, 0).addCuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		Shape22 = new ModelPart(this);
		Shape22.setPivot(1.691F, 3.0301F, 6.5F);
		body.addChild(Shape22);
		setRotationAngle(Shape22, 0.0F, 0.0F, -1.1345F);
		Shape22.setTextureOffset(28, 17).addCuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		heart = new ModelPart(this);
		heart.setPivot(-0.6F, 6.1F, -2.0F);
		body.addChild(heart);
		

		Shape11 = new ModelPart(this);
		Shape11.setPivot(0.0F, 0.0F, 0.0F);
		heart.addChild(Shape11);
		setRotationAngle(Shape11, 0.0F, 0.0F, 0.6981F);
		Shape11.setTextureOffset(0, 74).addCuboid(-1.3468F, -1.1286F, -0.5F, 3.0F, 2.0F, 1.0F, 0.01F, false);

		Shape23 = new ModelPart(this);
		Shape23.setPivot(1.2F, 0.0F, 0.0F);
		heart.addChild(Shape23);
		setRotationAngle(Shape23, 0.0F, 0.0F, -0.6981F);
		Shape23.setTextureOffset(20, 73).addCuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		heart2 = new ModelPart(this);
		heart2.setPivot(-0.6F, 9.9F, -2.3F);
		body.addChild(heart2);
		

		Shape24 = new ModelPart(this);
		Shape24.setPivot(0.0F, 0.0F, 0.0F);
		heart2.addChild(Shape24);
		setRotationAngle(Shape24, 0.0F, 0.0F, 0.6981F);
		Shape24.setTextureOffset(12, 68).addCuboid(-1.3468F, -1.1286F, -0.5F, 3.0F, 2.0F, 2.0F, -0.19F, false);

		Shape25 = new ModelPart(this);
		Shape25.setPivot(1.2F, 0.0F, 0.0F);
		heart2.addChild(Shape25);
		setRotationAngle(Shape25, 0.0F, 0.0F, -0.6981F);
		Shape25.setTextureOffset(15, 24).addCuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, -0.2F, false);

		Shape12 = new ModelPart(this);
		Shape12.setPivot(0.0F, 0.0F, 0.3F);
		body.addChild(Shape12);
		Shape12.setTextureOffset(0, 34).addCuboid(-4.0F, 10.0F, -2.4F, 8.0F, 2.0F, 6.0F, 0.0F, false);

		Shape53 = new ModelPart(this);
		Shape53.setPivot(-6.55F, 20.2333F, 0.45F);
		body.addChild(Shape53);
		setRotationAngle(Shape53, 0.0F, 0.3316F, 0.2443F);
		Shape53.setTextureOffset(69, 7).addCuboid(-4.75F, -18.3333F, 3.25F, 5.0F, 1.0F, 2.0F, 0.0F, false);

		Shape54 = new ModelPart(this);
		Shape54.setPivot(-4.6377F, -18.199F, 3.453F);
		Shape53.addChild(Shape54);
		setRotationAngle(Shape54, 0.5236F, -2.8623F, 0.0785F);
		Shape54.setTextureOffset(0, 33).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		Shape55 = new ModelPart(this);
		Shape55.setPivot(-4.8679F, -19.0863F, 2.2888F);
		Shape53.addChild(Shape55);
		setRotationAngle(Shape55, 0.5236F, -2.2864F, 0.0785F);
		Shape55.setTextureOffset(27, 70).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		Shape56 = new ModelPart(this);
		Shape56.setPivot(-5.9496F, -20.8982F, 0.1061F);
		Shape53.addChild(Shape56);
		setRotationAngle(Shape56, 0.5236F, 2.7314F, 0.0785F);
		Shape56.setTextureOffset(48, 63).addCuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		Shape57 = new ModelPart(this);
		Shape57.setPivot(-4.9121F, -20.9909F, -1.8343F);
		Shape53.addChild(Shape57);
		setRotationAngle(Shape57, -0.5236F, 2.1031F, 0.0785F);
		Shape57.setTextureOffset(15, 57).addCuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		Shape58 = new ModelPart(this);
		Shape58.setPivot(-3.2972F, -19.3926F, -2.1498F);
		Shape53.addChild(Shape58);
		setRotationAngle(Shape58, -0.5236F, 1.1781F, 0.0785F);
		Shape58.setTextureOffset(35, 48).addCuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		Shape29 = new ModelPart(this);
		Shape29.setPivot(6.55F, 20.2333F, 0.45F);
		body.addChild(Shape29);
		setRotationAngle(Shape29, 0.0F, -0.3316F, -0.2443F);
		Shape29.setTextureOffset(69, 7).addCuboid(-0.25F, -18.3333F, 3.25F, 5.0F, 1.0F, 2.0F, 0.0F, true);

		Shape34 = new ModelPart(this);
		Shape34.setPivot(4.6377F, -18.199F, 3.453F);
		Shape29.addChild(Shape34);
		setRotationAngle(Shape34, 0.5236F, 2.8623F, -0.0785F);
		Shape34.setTextureOffset(0, 33).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);

		Shape35 = new ModelPart(this);
		Shape35.setPivot(4.8679F, -19.0863F, 2.2888F);
		Shape29.addChild(Shape35);
		setRotationAngle(Shape35, 0.5236F, 2.2864F, -0.0785F);
		Shape35.setTextureOffset(27, 70).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, true);

		Shape36 = new ModelPart(this);
		Shape36.setPivot(5.9496F, -20.8982F, 0.1061F);
		Shape29.addChild(Shape36);
		setRotationAngle(Shape36, 0.5236F, -2.7314F, -0.0785F);
		Shape36.setTextureOffset(48, 63).addCuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, true);

		Shape37 = new ModelPart(this);
		Shape37.setPivot(4.9121F, -20.9909F, -1.8343F);
		Shape29.addChild(Shape37);
		setRotationAngle(Shape37, -0.5236F, -2.1031F, -0.0785F);
		Shape37.setTextureOffset(15, 57).addCuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, true);

		Shape38 = new ModelPart(this);
		Shape38.setPivot(3.2972F, -19.3926F, -2.1498F);
		Shape29.addChild(Shape38);
		setRotationAngle(Shape38, -0.5236F, -1.1781F, -0.0785F);
		Shape38.setTextureOffset(35, 48).addCuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, true);

		Shape49 = new ModelPart(this);
		Shape49.setPivot(-8.675F, 23.625F, -0.7F);
		body.addChild(Shape49);
		setRotationAngle(Shape49, 0.0F, 0.1047F, 0.7679F);
		Shape49.setTextureOffset(65, 0).addCuboid(-14.725F, -20.825F, 2.6F, 5.0F, 1.0F, 2.0F, 0.0F, false);

		Shape50 = new ModelPart(this);
		Shape50.setPivot(-15.2936F, -20.6847F, 2.0575F);
		Shape49.addChild(Shape50);
		setRotationAngle(Shape50, 0.0F, -2.8972F, 0.48F);
		Shape50.setTextureOffset(15, 42).addCuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		Shape51 = new ModelPart(this);
		Shape51.setPivot(-15.4301F, -20.8993F, -0.3314F);
		Shape49.addChild(Shape51);
		setRotationAngle(Shape51, 0.1309F, 2.8274F, 0.5149F);
		Shape51.setTextureOffset(0, 11).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		Shape52 = new ModelPart(this);
		Shape52.setPivot(-12.2338F, -19.6953F, -3.069F);
		Shape49.addChild(Shape52);
		setRotationAngle(Shape52, 0.1309F, 1.2043F, 0.5149F);
		Shape52.setTextureOffset(22, 34).addCuboid(-3.1F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		Shape39 = new ModelPart(this);
		Shape39.setPivot(8.675F, 23.625F, -0.7F);
		body.addChild(Shape39);
		setRotationAngle(Shape39, 0.0F, -0.1047F, -0.7679F);
		Shape39.setTextureOffset(65, 0).addCuboid(9.725F, -20.825F, 2.6F, 5.0F, 1.0F, 2.0F, 0.0F, true);

		Shape40 = new ModelPart(this);
		Shape40.setPivot(15.2936F, -20.6847F, 2.0575F);
		Shape39.addChild(Shape40);
		setRotationAngle(Shape40, 0.0F, 2.8972F, -0.48F);
		Shape40.setTextureOffset(15, 42).addCuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, true);

		Shape41 = new ModelPart(this);
		Shape41.setPivot(15.4301F, -20.8993F, -0.3314F);
		Shape39.addChild(Shape41);
		setRotationAngle(Shape41, 0.1309F, -2.8274F, -0.5149F);
		Shape41.setTextureOffset(0, 11).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);

		Shape42 = new ModelPart(this);
		Shape42.setPivot(12.2338F, -19.6953F, -3.069F);
		Shape39.addChild(Shape42);
		setRotationAngle(Shape42, 0.1309F, -1.2043F, -0.5149F);
		Shape42.setTextureOffset(22, 34).addCuboid(2.1F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, true);

		Shape47 = new ModelPart(this);
		Shape47.setPivot(7.85F, -8.8F, 6.7F);
		body.addChild(Shape47);
		setRotationAngle(Shape47, -3.0128F, 0.3581F, 1.1229F);
		Shape47.setTextureOffset(20, 70).addCuboid(3.45F, -12.6F, 1.4F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		Shape48 = new ModelPart(this);
		Shape48.setPivot(3.4582F, -11.6401F, 2.4486F);
		Shape47.addChild(Shape48);
		setRotationAngle(Shape48, -2.3845F, 0.4454F, 2.8159F);
		Shape48.setTextureOffset(0, 0).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		Shape43 = new ModelPart(this);
		Shape43.setPivot(-7.85F, -8.8F, 6.7F);
		body.addChild(Shape43);
		setRotationAngle(Shape43, -3.0128F, -0.3581F, -1.1229F);
		Shape43.setTextureOffset(20, 70).addCuboid(-6.45F, -12.6F, 1.4F, 3.0F, 1.0F, 2.0F, 0.0F, true);

		Shape44 = new ModelPart(this);
		Shape44.setPivot(-3.4582F, -11.6401F, 2.4486F);
		Shape43.addChild(Shape44);
		setRotationAngle(Shape44, -2.3845F, -0.4454F, -2.8159F);
		Shape44.setTextureOffset(0, 0).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);

		leftarm = new ModelPart(this);
		leftarm.setPivot(5.0F, 2.0F, -0.1F);
		body.addChild(leftarm);
		setRotationAngle(leftarm, 0.3994F, -0.0128F, -0.6976F);
		leftarm.setTextureOffset(50, 0).addCuboid(-1.0F, -2.0F, -2.0F, 5.0F, 4.0F, 5.0F, 0.0F, false);
		leftarm.setTextureOffset(52, 63).addCuboid(-0.8F, 1.8F, -1.55F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		leftarmdown = new ModelPart(this);
		leftarmdown.setPivot(-0.3879F, 5.8169F, 0.2415F);
		leftarm.addChild(leftarmdown);
		setRotationAngle(leftarmdown, -1.9469F, -0.0513F, 0.5751F);
		leftarmdown.setTextureOffset(43, 43).addCuboid(-1.0F, 0.0F, -2.0F, 5.0F, 9.0F, 5.0F, 0.0F, false);

		armmiddle = new ModelPart(this);
		armmiddle.setPivot(-5.0F, 16.4F, 0.0F);
		leftarmdown.addChild(armmiddle);
		armmiddle.setTextureOffset(55, 57).addCuboid(3.8F, -17.2F, -2.05F, 5.0F, 1.0F, 5.0F, -0.1F, false);

		heart5 = new ModelPart(this);
		heart5.setPivot(6.6F, -11.0F, -1.9F);
		armmiddle.addChild(heart5);
		setRotationAngle(heart5, 0.0F, -1.5708F, 0.0F);
		

		Shape30 = new ModelPart(this);
		Shape30.setPivot(-0.6F, -12.9F, -2.5F);
		heart5.addChild(Shape30);
		setRotationAngle(Shape30, 0.0F, 0.0F, 0.6981F);
		Shape30.setTextureOffset(72, 46).addCuboid(5.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F, -0.19F, false);

		Shape31 = new ModelPart(this);
		Shape31.setPivot(0.6F, -12.9F, -2.5F);
		heart5.addChild(Shape31);
		setRotationAngle(Shape31, 0.0F, 0.0F, -0.6981F);
		Shape31.setTextureOffset(72, 27).addCuboid(-4.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F, -0.2F, false);

		rightarm = new ModelPart(this);
		rightarm.setPivot(-5.0F, 2.0F, -0.1F);
		body.addChild(rightarm);
		setRotationAngle(rightarm, 0.3054F, 0.0F, 0.3054F);
		rightarm.setTextureOffset(0, 24).addCuboid(-4.0F, -2.0F, -2.0F, 5.0F, 4.0F, 5.0F, 0.0F, false);
		rightarm.setTextureOffset(36, 63).addCuboid(-3.2F, 1.8F, -1.55F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		rightarmdown = new ModelPart(this);
		rightarmdown.setPivot(-0.5615F, 4.6989F, -0.187F);
		rightarm.addChild(rightarmdown);
		setRotationAngle(rightarmdown, -1.9433F, 0.2394F, -0.5035F);
		rightarmdown.setTextureOffset(42, 14).addCuboid(-4.0F, 1.0F, -2.0F, 5.0F, 9.0F, 5.0F, 0.0F, false);

		armmiddle2 = new ModelPart(this);
		armmiddle2.setPivot(5.0F, 17.4F, 0.0F);
		rightarmdown.addChild(armmiddle2);
		armmiddle2.setTextureOffset(35, 57).addCuboid(-8.8F, -17.2F, -2.05F, 5.0F, 1.0F, 5.0F, -0.1F, false);

		heart6 = new ModelPart(this);
		heart6.setPivot(-6.6F, -11.0F, -1.9F);
		armmiddle2.addChild(heart6);
		setRotationAngle(heart6, 0.0F, 1.5708F, 0.0F);
		

		Shape32 = new ModelPart(this);
		Shape32.setPivot(0.6F, -12.9F, -2.5F);
		heart6.addChild(Shape32);
		setRotationAngle(Shape32, 0.0F, 0.0F, -0.6981F);
		Shape32.setTextureOffset(12, 72).addCuboid(-8.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F, -0.19F, false);

		Shape33 = new ModelPart(this);
		Shape33.setPivot(-0.6F, -12.9F, -2.5F);
		heart6.addChild(Shape33);
		setRotationAngle(Shape33, 0.0F, 0.0F, 0.6981F);
		Shape33.setTextureOffset(71, 20).addCuboid(1.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F, -0.2F, false);

		leftleg = new ModelPart(this);
		leftleg.setPivot(2.0F, 12.0F, 1.0F);
		body.addChild(leftleg);
		setRotationAngle(leftleg, -0.2281F, -0.7232F, -0.4617F);
		leftleg.setTextureOffset(0, 56).addCuboid(-2.0F, 0.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		heart3 = new ModelPart(this);
		heart3.setPivot(-2.0F, 12.0F, -1.0F);
		leftleg.addChild(heart3);
		

		Shape26 = new ModelPart(this);
		Shape26.setPivot(-0.6F, -12.9F, -2.5F);
		heart3.addChild(Shape26);
		setRotationAngle(Shape26, 0.0F, 0.0F, 0.6981F);
		Shape26.setTextureOffset(71, 17).addCuboid(5.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F, -0.19F, false);

		Shape27 = new ModelPart(this);
		Shape27.setPivot(0.6F, -12.9F, -2.5F);
		heart3.addChild(Shape27);
		setRotationAngle(Shape27, 0.0F, 0.0F, -0.6981F);
		Shape27.setTextureOffset(53, 71).addCuboid(-4.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F, -0.2F, false);

		legdownl = new ModelPart(this);
		legdownl.setPivot(0.159F, 7.7483F, 1.0008F);
		leftleg.addChild(legdownl);
		setRotationAngle(legdownl, 0.3491F, -0.1745F, 0.0F);
		legdownl.setTextureOffset(0, 42).addCuboid(-2.5F, -1.5F, -2.5F, 5.0F, 9.0F, 5.0F, 0.0F, false);

		rightleg = new ModelPart(this);
		rightleg.setPivot(-2.0F, 12.0F, 1.0F);
		body.addChild(rightleg);
		setRotationAngle(rightleg, -1.5272F, 0.3054F, 0.0F);
		rightleg.setTextureOffset(0, 56).addCuboid(-3.0F, 0.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, true);

		heart4 = new ModelPart(this);
		heart4.setPivot(-1.3914F, 5.6025F, -0.3263F);
		rightleg.addChild(heart4);
		setRotationAngle(heart4, 1.2654F, 0.0F, 0.0F);
		

		Shape9 = new ModelPart(this);
		Shape9.setPivot(3.6F, -7.9F, -2.5F);
		heart4.addChild(Shape9);
		setRotationAngle(Shape9, 0.0F, 0.0F, -0.6981F);
		Shape9.setTextureOffset(71, 17).addCuboid(-8.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F, -0.19F, true);

		Shape28 = new ModelPart(this);
		Shape28.setPivot(2.4F, -7.9F, -2.5F);
		heart4.addChild(Shape28);
		setRotationAngle(Shape28, 0.0F, 0.0F, 0.6981F);
		Shape28.setTextureOffset(53, 71).addCuboid(1.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F, -0.2F, true);

		legdownr = new ModelPart(this);
		legdownr.setPivot(-0.1399F, 6.4114F, 0.1706F);
		rightleg.addChild(legdownr);
		setRotationAngle(legdownr, 2.1817F, 0.0436F, 0.0F);
		legdownr.setTextureOffset(0, 42).addCuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, 0.0F, true);
}
@Override
public void setAngles(@Nullable LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
	this.yOffset = (double) MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;
	this.head.pitch = headPitch * 0.017453292F;
	this.head.yaw = headYaw * 0.017453292F;
}
@Override
public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
	matrixStack.translate(-0.45D, this.yOffset - 0.2D, 0.75D);
	this.head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	this.body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	matrixStack.translate(0.0D, -this.yOffset, 0.0D);
}
public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
}

	}