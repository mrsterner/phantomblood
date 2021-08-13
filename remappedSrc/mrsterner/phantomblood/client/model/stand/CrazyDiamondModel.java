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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CrazyDiamondModel extends EntityModel<LivingEntity> {
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
	private final ModelPart punch;
	private final ModelPart left_hands_ro;
	private final ModelPart handl1;
	private final ModelPart armmiddle3;
	private final ModelPart heart8;
	private final ModelPart Shape13;
	private final ModelPart Shape14;
	private final ModelPart handl2;
	private final ModelPart armmiddle4;
	private final ModelPart heart9;
	private final ModelPart Shape45;
	private final ModelPart Shape59;
	private final ModelPart handl3;
	private final ModelPart armmiddle5;
	private final ModelPart heart10;
	private final ModelPart Shape62;
	private final ModelPart Shape63;
	private final ModelPart handl4;
	private final ModelPart armmiddle6;
	private final ModelPart heart11;
	private final ModelPart Shape64;
	private final ModelPart Shape65;
	private final ModelPart handl5;
	private final ModelPart armmiddle7;
	private final ModelPart heart12;
	private final ModelPart Shape66;
	private final ModelPart Shape67;
	private final ModelPart right_hands_ro;
	private final ModelPart handr1;
	private final ModelPart armmiddle8;
	private final ModelPart heart13;
	private final ModelPart Shape68;
	private final ModelPart Shape69;
	private final ModelPart handr2;
	private final ModelPart armmiddle9;
	private final ModelPart heart14;
	private final ModelPart Shape70;
	private final ModelPart Shape71;
	private final ModelPart handr3;
	private final ModelPart armmiddle10;
	private final ModelPart heart15;
	private final ModelPart Shape72;
	private final ModelPart Shape73;
	private final ModelPart handr4;
	private final ModelPart armmiddle11;
	private final ModelPart heart16;
	private final ModelPart Shape74;
	private final ModelPart Shape75;
	private final ModelPart handr5;
	private final ModelPart armmiddle12;
	private final ModelPart heart17;
	private final ModelPart Shape76;
	private final ModelPart Shape77;
	private final ModelPart attackBody;
	private final ModelPart bodydown2;
	private final ModelPart Shape78;
	private final ModelPart Shape79;
	private final ModelPart Shape80;
	private final ModelPart Shape81;
	private final ModelPart Shape82;
	private final ModelPart heart18;
	private final ModelPart Shape83;
	private final ModelPart Shape84;
	private final ModelPart heart19;
	private final ModelPart Shape85;
	private final ModelPart Shape86;
	private final ModelPart Shape87;
	private final ModelPart Shape88;
	private final ModelPart Shape89;
	private final ModelPart Shape90;
	private final ModelPart Shape91;
	private final ModelPart Shape92;
	private final ModelPart Shape93;
	private final ModelPart Shape94;
	private final ModelPart Shape95;
	private final ModelPart Shape96;
	private final ModelPart Shape97;
	private final ModelPart Shape98;
	private final ModelPart Shape99;
	private final ModelPart Shape100;
	private final ModelPart Shape101;
	private final ModelPart Shape102;
	private final ModelPart Shape103;
	private final ModelPart Shape104;
	private final ModelPart Shape105;
	private final ModelPart Shape106;
	private final ModelPart Shape107;
	private final ModelPart Shape108;
	private final ModelPart Shape109;
	private final ModelPart Shape110;
	private final ModelPart Shape111;
	private final ModelPart leftarm2;
	private final ModelPart rightarm2;
	private final ModelPart leftleg2;
	private final ModelPart heart20;
	private final ModelPart Shape112;
	private final ModelPart Shape113;
	private final ModelPart legdownl2;
	private final ModelPart rightleg2;
	private final ModelPart heart21;
	private final ModelPart Shape114;
	private final ModelPart Shape115;
	private final ModelPart legdownr2;
	private final ModelPart heal;
	private final ModelPart left_hands_ro2;
	private final ModelPart handl6;
	private final ModelPart armmiddle13;
	private final ModelPart heart22;
	private final ModelPart Shape116;
	private final ModelPart Shape117;
	private final ModelPart handl7;
	private final ModelPart armmiddle14;
	private final ModelPart heart23;
	private final ModelPart Shape118;
	private final ModelPart Shape119;
	private final ModelPart handl8;
	private final ModelPart armmiddle15;
	private final ModelPart heart24;
	private final ModelPart Shape120;
	private final ModelPart Shape121;
	private final ModelPart handl9;
	private final ModelPart armmiddle16;
	private final ModelPart heart25;
	private final ModelPart Shape122;
	private final ModelPart Shape123;
	private final ModelPart handl10;
	private final ModelPart armmiddle17;
	private final ModelPart heart26;
	private final ModelPart Shape124;
	private final ModelPart Shape125;
	private final ModelPart right_hands_ro2;
	private final ModelPart handr6;
	private final ModelPart armmiddle18;
	private final ModelPart heart27;
	private final ModelPart Shape126;
	private final ModelPart Shape127;
	private final ModelPart handr7;
	private final ModelPart armmiddle19;
	private final ModelPart heart28;
	private final ModelPart Shape128;
	private final ModelPart Shape129;
	private final ModelPart handr8;
	private final ModelPart armmiddle20;
	private final ModelPart heart29;
	private final ModelPart Shape130;
	private final ModelPart Shape131;
	private final ModelPart handr9;
	private final ModelPart armmiddle21;
	private final ModelPart heart30;
	private final ModelPart Shape132;
	private final ModelPart Shape133;
	private final ModelPart handr10;
	private final ModelPart armmiddle22;
	private final ModelPart heart31;
	private final ModelPart Shape134;
	private final ModelPart Shape135;
	private double yOffset;

public CrazyDiamondModel() {
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


	Shape61 = new ModelPart(this);
	Shape61.setPivot(2.9111F, -5.3333F, -2.2F);
	heart7.addChild(Shape61);
	setRotationAngle(Shape61, 0.0F, 0.0F, -0.7679F);


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

	punch = new ModelPart(this);
	punch.setPivot(0.0F, 3.45F, 0.2F);


	left_hands_ro = new ModelPart(this);
	left_hands_ro.setPivot(0.0F, 0.0F, 0.0F);
	punch.addChild(left_hands_ro);


	handl1 = new ModelPart(this);
	handl1.setPivot(0.0F, 0.0F, 0.0F);
	left_hands_ro.addChild(handl1);
	setRotationAngle(handl1, -1.5708F, 0.0F, 0.0F);
	handl1.setTextureOffset(43, 43).addCuboid(15.5F, -2.35F, -1.5F, 5.0F, 9.0F, 5.0F, 0.0F, false);

	armmiddle3 = new ModelPart(this);
	armmiddle3.setPivot(0.0F, 0.55F, -0.2F);
	handl1.addChild(armmiddle3);
	armmiddle3.setTextureOffset(55, 57).addCuboid(15.3F, -3.7F, -1.35F, 5.0F, 1.0F, 5.0F, -0.1F, false);

	heart8 = new ModelPart(this);
	heart8.setPivot(10.7F, -5.6F, -5.0F);
	armmiddle3.addChild(heart8);
	setRotationAngle(heart8, 0.0F, -1.5708F, 0.0F);


	Shape13 = new ModelPart(this);
	Shape13.setPivot(-0.6F, -12.9F, -2.5F);
	heart8.addChild(Shape13);
	setRotationAngle(Shape13, 0.0F, 0.0F, 0.6981F);
	Shape13.setTextureOffset(72, 46).addCuboid(13.2893F, 6.8241F, -7.6F, 3.0F, 2.0F, 1.0F, -0.19F, false);

	Shape14 = new ModelPart(this);
	Shape14.setPivot(0.6F, -12.9F, -2.5F);
	heart8.addChild(Shape14);
	setRotationAngle(Shape14, 0.0F, 0.0F, -0.6981F);
	Shape14.setTextureOffset(72, 27).addCuboid(-6.7903F, 14.7947F, -7.6F, 3.0F, 2.0F, 1.0F, -0.2F, false);

	handl2 = new ModelPart(this);
	handl2.setPivot(0.0F, 0.0F, 0.0F);
	left_hands_ro.addChild(handl2);
	setRotationAngle(handl2, -1.5708F, 0.0F, 0.0F);
	handl2.setTextureOffset(43, 43).addCuboid(11.5F, -7.55F, -9.8F, 5.0F, 9.0F, 5.0F, 0.0F, false);

	armmiddle4 = new ModelPart(this);
	armmiddle4.setPivot(0.0F, 0.55F, -0.2F);
	handl2.addChild(armmiddle4);
	armmiddle4.setTextureOffset(55, 57).addCuboid(11.3F, -8.9F, -9.65F, 5.0F, 1.0F, 5.0F, -0.1F, false);

	heart9 = new ModelPart(this);
	heart9.setPivot(10.7F, -5.6F, -5.0F);
	armmiddle4.addChild(heart9);
	setRotationAngle(heart9, 0.0F, -1.5708F, 0.0F);


	Shape45 = new ModelPart(this);
	Shape45.setPivot(-0.6F, -12.9F, -2.5F);
	heart9.addChild(Shape45);
	setRotationAngle(Shape45, 0.0F, 0.0F, 0.6981F);
	Shape45.setTextureOffset(72, 46).addCuboid(3.5886F, 8.1758F, -3.6F, 3.0F, 2.0F, 1.0F, -0.19F, false);

	Shape59 = new ModelPart(this);
	Shape59.setPivot(0.6F, -12.9F, -2.5F);
	heart9.addChild(Shape59);
	setRotationAngle(Shape59, 0.0F, 0.0F, -0.6981F);
	Shape59.setTextureOffset(72, 27).addCuboid(-9.806F, 5.4761F, -3.6F, 3.0F, 2.0F, 1.0F, -0.2F, false);

	handl3 = new ModelPart(this);
	handl3.setPivot(0.0F, 0.0F, 0.0F);
	left_hands_ro.addChild(handl3);
	setRotationAngle(handl3, -1.5708F, 0.0F, 0.0F);
	handl3.setTextureOffset(43, 43).addCuboid(14.5F, -0.25F, 6.4F, 5.0F, 9.0F, 5.0F, 0.0F, false);

	armmiddle5 = new ModelPart(this);
	armmiddle5.setPivot(0.0F, 0.55F, -0.2F);
	handl3.addChild(armmiddle5);
	armmiddle5.setTextureOffset(55, 57).addCuboid(14.3F, -1.6F, 6.55F, 5.0F, 1.0F, 5.0F, -0.1F, false);

	heart10 = new ModelPart(this);
	heart10.setPivot(10.7F, -5.6F, -5.0F);
	armmiddle5.addChild(heart10);
	setRotationAngle(heart10, 0.0F, -1.5708F, 0.0F);


	Shape62 = new ModelPart(this);
	Shape62.setPivot(-0.6F, -12.9F, -2.5F);
	heart10.addChild(Shape62);
	setRotationAngle(Shape62, 0.0F, 0.0F, 0.6981F);
	Shape62.setTextureOffset(72, 46).addCuboid(20.6909F, 3.3548F, -6.6F, 3.0F, 2.0F, 1.0F, -0.19F, false);

	Shape63 = new ModelPart(this);
	Shape63.setPivot(0.6F, -12.9F, -2.5F);
	heart10.addChild(Shape63);
	setRotationAngle(Shape63, 0.0F, 0.0F, -0.6981F);
	Shape63.setTextureOffset(72, 27).addCuboid(-2.0884F, 21.4814F, -6.6F, 3.0F, 2.0F, 1.0F, -0.2F, false);

	handl4 = new ModelPart(this);
	handl4.setPivot(0.0F, 0.0F, 0.0F);
	left_hands_ro.addChild(handl4);
	setRotationAngle(handl4, -1.5708F, 0.0F, 0.0F);
	handl4.setTextureOffset(43, 43).addCuboid(18.9F, 3.95F, -10.4F, 5.0F, 9.0F, 5.0F, 0.0F, false);

	armmiddle6 = new ModelPart(this);
	armmiddle6.setPivot(0.0F, 0.55F, -0.2F);
	handl4.addChild(armmiddle6);
	armmiddle6.setTextureOffset(55, 57).addCuboid(18.7F, 2.6F, -10.25F, 5.0F, 1.0F, 5.0F, -0.1F, false);

	heart11 = new ModelPart(this);
	heart11.setPivot(10.7F, -5.6F, -5.0F);
	armmiddle6.addChild(heart11);
	setRotationAngle(heart11, 0.0F, -1.5708F, 0.0F);


	Shape64 = new ModelPart(this);
	Shape64.setPivot(-0.6F, -12.9F, -2.5F);
	heart11.addChild(Shape64);
	setRotationAngle(Shape64, 0.0F, 0.0F, 0.6981F);
	Shape64.setTextureOffset(72, 46).addCuboid(10.5211F, 17.371F, -11.0F, 3.0F, 2.0F, 1.0F, -0.19F, false);

	Shape65 = new ModelPart(this);
	Shape65.setPivot(0.6F, -12.9F, -2.5F);
	heart11.addChild(Shape65);
	setRotationAngle(Shape65, 0.0F, 0.0F, -0.6981F);
	Shape65.setTextureOffset(72, 27).addCuboid(-17.6577F, 13.9F, -11.0F, 3.0F, 2.0F, 1.0F, -0.2F, false);

	handl5 = new ModelPart(this);
	handl5.setPivot(0.0F, 0.0F, 0.0F);
	left_hands_ro.addChild(handl5);
	setRotationAngle(handl5, -1.5708F, 0.0F, 0.0F);
	handl5.setTextureOffset(43, 43).addCuboid(21.6F, -7.65F, 3.6F, 5.0F, 9.0F, 5.0F, 0.0F, false);

	armmiddle7 = new ModelPart(this);
	armmiddle7.setPivot(0.0F, 0.55F, -0.2F);
	handl5.addChild(armmiddle7);
	armmiddle7.setTextureOffset(55, 57).addCuboid(21.4F, -9.0F, 3.75F, 5.0F, 1.0F, 5.0F, -0.1F, false);

	heart12 = new ModelPart(this);
	heart12.setPivot(10.7F, -5.6F, -5.0F);
	armmiddle7.addChild(heart12);
	setRotationAngle(heart12, 0.0F, -1.5708F, 0.0F);


	Shape66 = new ModelPart(this);
	Shape66.setPivot(-0.6F, -12.9F, -2.5F);
	heart12.addChild(Shape66);
	setRotationAngle(Shape66, 0.0F, 0.0F, 0.6981F);
	Shape66.setTextureOffset(72, 46).addCuboid(13.7893F, -0.5141F, -13.7F, 3.0F, 2.0F, 1.0F, -0.19F, false);

	Shape67 = new ModelPart(this);
	Shape67.setPivot(0.6F, -12.9F, -2.5F);
	heart12.addChild(Shape67);
	setRotationAngle(Shape67, 0.0F, 0.0F, -0.6981F);
	Shape67.setTextureOffset(72, 27).addCuboid(0.5233F, 14.0129F, -13.7F, 3.0F, 2.0F, 1.0F, -0.2F, false);

	right_hands_ro = new ModelPart(this);
	right_hands_ro.setPivot(0.0F, 0.0F, 0.0F);
	punch.addChild(right_hands_ro);


	handr1 = new ModelPart(this);
	handr1.setPivot(0.0F, 0.0F, 0.0F);
	right_hands_ro.addChild(handr1);
	setRotationAngle(handr1, -1.5708F, 0.0F, 0.0F);
	handr1.setTextureOffset(43, 43).addCuboid(-26.6F, -0.95F, -1.5F, 5.0F, 9.0F, 5.0F, 0.0F, true);

	armmiddle8 = new ModelPart(this);
	armmiddle8.setPivot(0.0F, 0.55F, -0.2F);
	handr1.addChild(armmiddle8);
	armmiddle8.setTextureOffset(55, 57).addCuboid(-26.4F, -2.3F, -1.35F, 5.0F, 1.0F, 5.0F, -0.1F, true);

	heart13 = new ModelPart(this);
	heart13.setPivot(-10.7F, -5.6F, -5.0F);
	armmiddle8.addChild(heart13);
	setRotationAngle(heart13, 0.0F, 1.5708F, 0.0F);


	Shape68 = new ModelPart(this);
	Shape68.setPivot(0.6F, -12.9F, -2.5F);
	heart13.addChild(Shape68);
	setRotationAngle(Shape68, 0.0F, 0.0F, -0.6981F);
	Shape68.setTextureOffset(72, 46).addCuboid(-17.1892F, 7.8966F, -13.7F, 3.0F, 2.0F, 1.0F, -0.19F, true);

	Shape69 = new ModelPart(this);
	Shape69.setPivot(-0.6F, -12.9F, -2.5F);
	heart13.addChild(Shape69);
	setRotationAngle(Shape69, 0.0F, 0.0F, 0.6981F);
	Shape69.setTextureOffset(72, 27).addCuboid(4.6902F, 15.8672F, -13.7F, 3.0F, 2.0F, 1.0F, -0.2F, true);

	handr2 = new ModelPart(this);
	handr2.setPivot(0.0F, 0.0F, 0.0F);
	right_hands_ro.addChild(handr2);
	setRotationAngle(handr2, -1.5708F, 0.0F, 0.0F);
	handr2.setTextureOffset(43, 43).addCuboid(-19.4F, 9.65F, -9.8F, 5.0F, 9.0F, 5.0F, 0.0F, true);

	armmiddle9 = new ModelPart(this);
	armmiddle9.setPivot(0.0F, 0.55F, -0.2F);
	handr2.addChild(armmiddle9);
	armmiddle9.setTextureOffset(55, 57).addCuboid(-19.2F, 8.3F, -9.65F, 5.0F, 1.0F, 5.0F, -0.1F, true);

	heart14 = new ModelPart(this);
	heart14.setPivot(-10.7F, -5.6F, -5.0F);
	armmiddle9.addChild(heart14);
	setRotationAngle(heart14, 0.0F, 1.5708F, 0.0F);


	Shape70 = new ModelPart(this);
	Shape70.setPivot(0.6F, -12.9F, -2.5F);
	heart14.addChild(Shape70);
	setRotationAngle(Shape70, 0.0F, 0.0F, -0.6981F);
	Shape70.setTextureOffset(72, 46).addCuboid(-17.6446F, 21.3518F, -6.5F, 3.0F, 2.0F, 1.0F, -0.19F, true);

	Shape71 = new ModelPart(this);
	Shape71.setPivot(-0.6F, -12.9F, -2.5F);
	heart14.addChild(Shape71);
	setRotationAngle(Shape71, 0.0F, 0.0F, 0.6981F);
	Shape71.setTextureOffset(72, 27).addCuboid(17.862F, 18.6521F, -6.5F, 3.0F, 2.0F, 1.0F, -0.2F, true);

	handr3 = new ModelPart(this);
	handr3.setPivot(0.0F, 0.0F, 0.0F);
	right_hands_ro.addChild(handr3);
	setRotationAngle(handr3, -1.5708F, 0.0F, 0.0F);
	handr3.setTextureOffset(43, 43).addCuboid(-21.3F, -0.25F, 6.4F, 5.0F, 9.0F, 5.0F, 0.0F, true);

	armmiddle10 = new ModelPart(this);
	armmiddle10.setPivot(0.0F, 0.55F, -0.2F);
	handr3.addChild(armmiddle10);
	armmiddle10.setTextureOffset(55, 57).addCuboid(-21.1F, -1.6F, 6.55F, 5.0F, 1.0F, 5.0F, -0.1F, true);

	heart15 = new ModelPart(this);
	heart15.setPivot(-10.7F, -5.6F, -5.0F);
	armmiddle10.addChild(heart15);
	setRotationAngle(heart15, 0.0F, 1.5708F, 0.0F);


	Shape72 = new ModelPart(this);
	Shape72.setPivot(0.6F, -12.9F, -2.5F);
	heart15.addChild(Shape72);
	setRotationAngle(Shape72, 0.0F, 0.0F, -0.6981F);
	Shape72.setTextureOffset(72, 46).addCuboid(-23.6909F, 3.3548F, -8.4F, 3.0F, 2.0F, 1.0F, -0.19F, true);

	Shape73 = new ModelPart(this);
	Shape73.setPivot(-0.6F, -12.9F, -2.5F);
	heart15.addChild(Shape73);
	setRotationAngle(Shape73, 0.0F, 0.0F, 0.6981F);
	Shape73.setTextureOffset(72, 27).addCuboid(-0.9116F, 21.4814F, -8.4F, 3.0F, 2.0F, 1.0F, -0.2F, true);

	handr4 = new ModelPart(this);
	handr4.setPivot(0.0F, 0.0F, 0.0F);
	right_hands_ro.addChild(handr4);
	setRotationAngle(handr4, -1.5708F, 0.0F, 0.0F);
	handr4.setTextureOffset(43, 43).addCuboid(-23.9F, -2.95F, -10.4F, 5.0F, 9.0F, 5.0F, 0.0F, true);

	armmiddle11 = new ModelPart(this);
	armmiddle11.setPivot(0.0F, 0.55F, -0.2F);
	handr4.addChild(armmiddle11);
	armmiddle11.setTextureOffset(55, 57).addCuboid(-23.7F, -4.3F, -10.25F, 5.0F, 1.0F, 5.0F, -0.1F, true);

	heart16 = new ModelPart(this);
	heart16.setPivot(-10.7F, -5.6F, -5.0F);
	armmiddle11.addChild(heart16);
	setRotationAngle(heart16, 0.0F, 1.5708F, 0.0F);


	Shape74 = new ModelPart(this);
	Shape74.setPivot(0.6F, -12.9F, -2.5F);
	heart16.addChild(Shape74);
	setRotationAngle(Shape74, 0.0F, 0.0F, -0.6981F);
	Shape74.setTextureOffset(72, 46).addCuboid(-9.0858F, 12.0853F, -11.0F, 3.0F, 2.0F, 1.0F, -0.19F, true);

	Shape75 = new ModelPart(this);
	Shape75.setPivot(-0.6F, -12.9F, -2.5F);
	heart16.addChild(Shape75);
	setRotationAngle(Shape75, 0.0F, 0.0F, 0.6981F);
	Shape75.setTextureOffset(72, 27).addCuboid(10.2225F, 8.6143F, -11.0F, 3.0F, 2.0F, 1.0F, -0.2F, true);

	handr5 = new ModelPart(this);
	handr5.setPivot(0.0F, 0.0F, 0.0F);
	right_hands_ro.addChild(handr5);
	setRotationAngle(handr5, -1.5708F, 0.0F, 0.0F);
	handr5.setTextureOffset(43, 43).addCuboid(-17.2F, -7.65F, -0.5F, 5.0F, 9.0F, 5.0F, 0.0F, true);

	armmiddle12 = new ModelPart(this);
	armmiddle12.setPivot(0.0F, 0.55F, -0.2F);
	handr5.addChild(armmiddle12);
	armmiddle12.setTextureOffset(55, 57).addCuboid(-17.0F, -9.0F, -0.35F, 5.0F, 1.0F, 5.0F, -0.1F, true);

	heart17 = new ModelPart(this);
	heart17.setPivot(-10.7F, -5.6F, -5.0F);
	armmiddle12.addChild(heart17);
	setRotationAngle(heart17, 0.0F, 1.5708F, 0.0F);


	Shape76 = new ModelPart(this);
	Shape76.setPivot(0.6F, -12.9F, -2.5F);
	heart17.addChild(Shape76);
	setRotationAngle(Shape76, 0.0F, 0.0F, -0.6981F);
	Shape76.setTextureOffset(72, 46).addCuboid(-13.6486F, 2.1213F, -4.3F, 3.0F, 2.0F, 1.0F, -0.19F, true);

	Shape77 = new ModelPart(this);
	Shape77.setPivot(-0.6F, -12.9F, -2.5F);
	heart17.addChild(Shape77);
	setRotationAngle(Shape77, 0.0F, 0.0F, 0.6981F);
	Shape77.setTextureOffset(72, 27).addCuboid(-0.3825F, 11.3774F, -4.3F, 3.0F, 2.0F, 1.0F, -0.2F, true);

	attackBody = new ModelPart(this);
	attackBody.setPivot(0.0F, 0.0F, 0.0F);
	setRotationAngle(attackBody, 0.1309F, 0.0F, 0.0F);
	attackBody.setTextureOffset(0, 11).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 6.0F, 0.0F, false);

	bodydown2 = new ModelPart(this);
	bodydown2.setPivot(0.0F, 0.0F, 0.0F);
	attackBody.addChild(bodydown2);
	bodydown2.setTextureOffset(44, 29).addCuboid(-3.5F, 7.0F, -1.6F, 7.0F, 4.0F, 5.0F, 0.0F, false);

	Shape78 = new ModelPart(this);
	Shape78.setPivot(0.0F, 0.0F, 0.0F);
	attackBody.addChild(Shape78);
	Shape78.setTextureOffset(25, 0).addCuboid(-3.5F, 0.2F, -2.9F, 7.0F, 4.0F, 1.0F, 0.0F, false);

	Shape79 = new ModelPart(this);
	Shape79.setPivot(0.0F, 0.0F, 6.6F);
	attackBody.addChild(Shape79);
	Shape79.setTextureOffset(63, 53).addCuboid(-3.0F, 0.2F, -3.9F, 6.0F, 1.0F, 2.0F, 0.0F, false);

	Shape80 = new ModelPart(this);
	Shape80.setPivot(0.0F, 5.0F, 6.6F);
	attackBody.addChild(Shape80);
	Shape80.setTextureOffset(64, 63).addCuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F, 0.0F, false);

	Shape81 = new ModelPart(this);
	Shape81.setPivot(-1.691F, 3.0301F, 6.5F);
	attackBody.addChild(Shape81);
	setRotationAngle(Shape81, 0.0F, 0.0F, 1.1345F);
	Shape81.setTextureOffset(41, 0).addCuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F, 0.0F, false);

	Shape82 = new ModelPart(this);
	Shape82.setPivot(1.691F, 3.0301F, 6.5F);
	attackBody.addChild(Shape82);
	setRotationAngle(Shape82, 0.0F, 0.0F, -1.1345F);
	Shape82.setTextureOffset(28, 17).addCuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F, 0.0F, false);

	heart18 = new ModelPart(this);
	heart18.setPivot(-0.6F, 6.1F, -2.0F);
	attackBody.addChild(heart18);


	Shape83 = new ModelPart(this);
	Shape83.setPivot(0.0F, 0.0F, 0.0F);
	heart18.addChild(Shape83);
	setRotationAngle(Shape83, 0.0F, 0.0F, 0.6981F);
	Shape83.setTextureOffset(0, 74).addCuboid(-1.3468F, -1.1286F, -0.5F, 3.0F, 2.0F, 1.0F, 0.01F, false);

	Shape84 = new ModelPart(this);
	Shape84.setPivot(1.2F, 0.0F, 0.0F);
	heart18.addChild(Shape84);
	setRotationAngle(Shape84, 0.0F, 0.0F, -0.6981F);
	Shape84.setTextureOffset(20, 73).addCuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);

	heart19 = new ModelPart(this);
	heart19.setPivot(-0.6F, 9.9F, -2.3F);
	attackBody.addChild(heart19);


	Shape85 = new ModelPart(this);
	Shape85.setPivot(0.0F, 0.0F, 0.0F);
	heart19.addChild(Shape85);
	setRotationAngle(Shape85, 0.0F, 0.0F, 0.6981F);
	Shape85.setTextureOffset(12, 68).addCuboid(-1.3468F, -1.1286F, -0.5F, 3.0F, 2.0F, 2.0F, -0.19F, false);

	Shape86 = new ModelPart(this);
	Shape86.setPivot(1.2F, 0.0F, 0.0F);
	heart19.addChild(Shape86);
	setRotationAngle(Shape86, 0.0F, 0.0F, -0.6981F);
	Shape86.setTextureOffset(15, 24).addCuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, -0.2F, false);

	Shape87 = new ModelPart(this);
	Shape87.setPivot(0.0F, 0.0F, 0.3F);
	attackBody.addChild(Shape87);
	Shape87.setTextureOffset(0, 34).addCuboid(-4.0F, 10.0F, -2.4F, 8.0F, 2.0F, 6.0F, 0.0F, false);

	Shape88 = new ModelPart(this);
	Shape88.setPivot(-6.55F, 20.2333F, 0.45F);
	attackBody.addChild(Shape88);
	setRotationAngle(Shape88, 0.0F, 0.3316F, 0.2443F);
	Shape88.setTextureOffset(69, 7).addCuboid(-4.75F, -18.3333F, 3.25F, 5.0F, 1.0F, 2.0F, 0.0F, false);

	Shape89 = new ModelPart(this);
	Shape89.setPivot(-4.6377F, -18.199F, 3.453F);
	Shape88.addChild(Shape89);
	setRotationAngle(Shape89, 0.5236F, -2.8623F, 0.0785F);
	Shape89.setTextureOffset(0, 33).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

	Shape90 = new ModelPart(this);
	Shape90.setPivot(-4.8679F, -19.0863F, 2.2888F);
	Shape88.addChild(Shape90);
	setRotationAngle(Shape90, 0.5236F, -2.2864F, 0.0785F);
	Shape90.setTextureOffset(27, 70).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

	Shape91 = new ModelPart(this);
	Shape91.setPivot(-5.9496F, -20.8982F, 0.1061F);
	Shape88.addChild(Shape91);
	setRotationAngle(Shape91, 0.5236F, 2.7314F, 0.0785F);
	Shape91.setTextureOffset(48, 63).addCuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

	Shape92 = new ModelPart(this);
	Shape92.setPivot(-4.9121F, -20.9909F, -1.8343F);
	Shape88.addChild(Shape92);
	setRotationAngle(Shape92, -0.5236F, 2.1031F, 0.0785F);
	Shape92.setTextureOffset(15, 57).addCuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

	Shape93 = new ModelPart(this);
	Shape93.setPivot(-3.2972F, -19.3926F, -2.1498F);
	Shape88.addChild(Shape93);
	setRotationAngle(Shape93, -0.5236F, 1.1781F, 0.0785F);
	Shape93.setTextureOffset(35, 48).addCuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

	Shape94 = new ModelPart(this);
	Shape94.setPivot(6.55F, 20.2333F, 0.45F);
	attackBody.addChild(Shape94);
	setRotationAngle(Shape94, 0.0F, -0.3316F, -0.2443F);
	Shape94.setTextureOffset(69, 7).addCuboid(-0.25F, -18.3333F, 3.25F, 5.0F, 1.0F, 2.0F, 0.0F, true);

	Shape95 = new ModelPart(this);
	Shape95.setPivot(4.6377F, -18.199F, 3.453F);
	Shape94.addChild(Shape95);
	setRotationAngle(Shape95, 0.5236F, 2.8623F, -0.0785F);
	Shape95.setTextureOffset(0, 33).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);

	Shape96 = new ModelPart(this);
	Shape96.setPivot(4.8679F, -19.0863F, 2.2888F);
	Shape94.addChild(Shape96);
	setRotationAngle(Shape96, 0.5236F, 2.2864F, -0.0785F);
	Shape96.setTextureOffset(27, 70).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, true);

	Shape97 = new ModelPart(this);
	Shape97.setPivot(5.9496F, -20.8982F, 0.1061F);
	Shape94.addChild(Shape97);
	setRotationAngle(Shape97, 0.5236F, -2.7314F, -0.0785F);
	Shape97.setTextureOffset(48, 63).addCuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, true);

	Shape98 = new ModelPart(this);
	Shape98.setPivot(4.9121F, -20.9909F, -1.8343F);
	Shape94.addChild(Shape98);
	setRotationAngle(Shape98, -0.5236F, -2.1031F, -0.0785F);
	Shape98.setTextureOffset(15, 57).addCuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, true);

	Shape99 = new ModelPart(this);
	Shape99.setPivot(3.2972F, -19.3926F, -2.1498F);
	Shape94.addChild(Shape99);
	setRotationAngle(Shape99, -0.5236F, -1.1781F, -0.0785F);
	Shape99.setTextureOffset(35, 48).addCuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, true);

	Shape100 = new ModelPart(this);
	Shape100.setPivot(-8.675F, 23.625F, -0.7F);
	attackBody.addChild(Shape100);
	setRotationAngle(Shape100, 0.0F, 0.1047F, 0.7679F);
	Shape100.setTextureOffset(65, 0).addCuboid(-14.725F, -20.825F, 2.6F, 5.0F, 1.0F, 2.0F, 0.0F, false);

	Shape101 = new ModelPart(this);
	Shape101.setPivot(-15.2936F, -20.6847F, 2.0575F);
	Shape100.addChild(Shape101);
	setRotationAngle(Shape101, 0.0F, -2.8972F, 0.48F);
	Shape101.setTextureOffset(15, 42).addCuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);

	Shape102 = new ModelPart(this);
	Shape102.setPivot(-15.4301F, -20.8993F, -0.3314F);
	Shape100.addChild(Shape102);
	setRotationAngle(Shape102, 0.1309F, 2.8274F, 0.5149F);
	Shape102.setTextureOffset(0, 11).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

	Shape103 = new ModelPart(this);
	Shape103.setPivot(-12.2338F, -19.6953F, -3.069F);
	Shape100.addChild(Shape103);
	setRotationAngle(Shape103, 0.1309F, 1.2043F, 0.5149F);
	Shape103.setTextureOffset(22, 34).addCuboid(-3.1F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);

	Shape104 = new ModelPart(this);
	Shape104.setPivot(8.675F, 23.625F, -0.7F);
	attackBody.addChild(Shape104);
	setRotationAngle(Shape104, 0.0F, -0.1047F, -0.7679F);
	Shape104.setTextureOffset(65, 0).addCuboid(9.725F, -20.825F, 2.6F, 5.0F, 1.0F, 2.0F, 0.0F, true);

	Shape105 = new ModelPart(this);
	Shape105.setPivot(15.2936F, -20.6847F, 2.0575F);
	Shape104.addChild(Shape105);
	setRotationAngle(Shape105, 0.0F, 2.8972F, -0.48F);
	Shape105.setTextureOffset(15, 42).addCuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, true);

	Shape106 = new ModelPart(this);
	Shape106.setPivot(15.4301F, -20.8993F, -0.3314F);
	Shape104.addChild(Shape106);
	setRotationAngle(Shape106, 0.1309F, -2.8274F, -0.5149F);
	Shape106.setTextureOffset(0, 11).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);

	Shape107 = new ModelPart(this);
	Shape107.setPivot(12.2338F, -19.6953F, -3.069F);
	Shape104.addChild(Shape107);
	setRotationAngle(Shape107, 0.1309F, -1.2043F, -0.5149F);
	Shape107.setTextureOffset(22, 34).addCuboid(2.1F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, true);

	Shape108 = new ModelPart(this);
	Shape108.setPivot(7.85F, -8.8F, 6.7F);
	attackBody.addChild(Shape108);
	setRotationAngle(Shape108, -3.0128F, 0.3581F, 1.1229F);
	Shape108.setTextureOffset(20, 70).addCuboid(3.45F, -12.6F, 1.4F, 3.0F, 1.0F, 2.0F, 0.0F, false);

	Shape109 = new ModelPart(this);
	Shape109.setPivot(3.4582F, -11.6401F, 2.4486F);
	Shape108.addChild(Shape109);
	setRotationAngle(Shape109, -2.3845F, 0.4454F, 2.8159F);
	Shape109.setTextureOffset(0, 0).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

	Shape110 = new ModelPart(this);
	Shape110.setPivot(-7.85F, -8.8F, 6.7F);
	attackBody.addChild(Shape110);
	setRotationAngle(Shape110, -3.0128F, -0.3581F, -1.1229F);
	Shape110.setTextureOffset(20, 70).addCuboid(-6.45F, -12.6F, 1.4F, 3.0F, 1.0F, 2.0F, 0.0F, true);

	Shape111 = new ModelPart(this);
	Shape111.setPivot(-3.4582F, -11.6401F, 2.4486F);
	Shape110.addChild(Shape111);
	setRotationAngle(Shape111, -2.3845F, -0.4454F, -2.8159F);
	Shape111.setTextureOffset(0, 0).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);

	leftarm2 = new ModelPart(this);
	leftarm2.setPivot(5.0F, 2.0F, -0.1F);
	attackBody.addChild(leftarm2);
	setRotationAngle(leftarm2, 0.3491F, 0.0F, -0.1745F);
	leftarm2.setTextureOffset(50, 0).addCuboid(-1.0F, -2.0F, -2.0F, 5.0F, 4.0F, 5.0F, 0.0F, false);

	rightarm2 = new ModelPart(this);
	rightarm2.setPivot(-5.0F, 2.0F, -0.1F);
	attackBody.addChild(rightarm2);
	setRotationAngle(rightarm2, 0.211F, -0.056F, 0.2559F);
	rightarm2.setTextureOffset(0, 24).addCuboid(-4.0F, -2.0F, -2.0F, 5.0F, 4.0F, 5.0F, 0.0F, false);

	leftleg2 = new ModelPart(this);
	leftleg2.setPivot(2.0F, 12.0F, 1.0F);
	attackBody.addChild(leftleg2);
	setRotationAngle(leftleg2, -0.5587F, -0.195F, -0.2865F);
	leftleg2.setTextureOffset(0, 56).addCuboid(-2.0F, 0.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);

	heart20 = new ModelPart(this);
	heart20.setPivot(-2.0F, 12.0F, -1.0F);
	leftleg2.addChild(heart20);


	Shape112 = new ModelPart(this);
	Shape112.setPivot(-0.6F, -12.9F, -2.5F);
	heart20.addChild(Shape112);
	setRotationAngle(Shape112, 0.0F, 0.0F, 0.6981F);
	Shape112.setTextureOffset(71, 17).addCuboid(5.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F, -0.19F, false);

	Shape113 = new ModelPart(this);
	Shape113.setPivot(0.6F, -12.9F, -2.5F);
	heart20.addChild(Shape113);
	setRotationAngle(Shape113, 0.0F, 0.0F, -0.6981F);
	Shape113.setTextureOffset(53, 71).addCuboid(-4.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F, -0.2F, false);

	legdownl2 = new ModelPart(this);
	legdownl2.setPivot(1.2618F, 5.8899F, 1.1453F);
	leftleg2.addChild(legdownl2);
	setRotationAngle(legdownl2, 0.7418F, 0.0F, 0.0F);
	legdownl2.setTextureOffset(0, 42).addCuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, 0.0F, false);

	rightleg2 = new ModelPart(this);
	rightleg2.setPivot(-2.0F, 12.0F, 1.0F);
	attackBody.addChild(rightleg2);
	setRotationAngle(rightleg2, -0.4972F, 0.1268F, 0.3077F);
	rightleg2.setTextureOffset(0, 56).addCuboid(-3.0F, 0.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, true);

	heart21 = new ModelPart(this);
	heart21.setPivot(2.0F, 12.0F, -1.0F);
	rightleg2.addChild(heart21);


	Shape114 = new ModelPart(this);
	Shape114.setPivot(0.6F, -12.9F, -2.5F);
	heart21.addChild(Shape114);
	setRotationAngle(Shape114, 0.0F, 0.0F, -0.6981F);
	Shape114.setTextureOffset(71, 17).addCuboid(-8.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F, -0.19F, true);

	Shape115 = new ModelPart(this);
	Shape115.setPivot(-0.6F, -12.9F, -2.5F);
	heart21.addChild(Shape115);
	setRotationAngle(Shape115, 0.0F, 0.0F, 0.6981F);
	Shape115.setTextureOffset(53, 71).addCuboid(1.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F, -0.2F, true);

	legdownr2 = new ModelPart(this);
	legdownr2.setPivot(-0.2311F, 7.3716F, -0.1109F);
	rightleg2.addChild(legdownr2);
	setRotationAngle(legdownr2, 0.7418F, -0.1309F, -0.0873F);
	legdownr2.setTextureOffset(0, 42).addCuboid(-2.8F, -0.9F, -0.8F, 5.0F, 9.0F, 5.0F, 0.0F, true);

	heal = new ModelPart(this);
	heal.setPivot(0.0F, 3.45F, 0.2F);


	left_hands_ro2 = new ModelPart(this);
	left_hands_ro2.setPivot(0.0F, 0.0F, 0.0F);
	heal.addChild(left_hands_ro2);


	handl6 = new ModelPart(this);
	handl6.setPivot(0.0F, 0.0F, 0.0F);
	left_hands_ro2.addChild(handl6);
	setRotationAngle(handl6, -1.5708F, 0.0F, 0.0F);
	handl6.setTextureOffset(43, 43).addCuboid(15.5F, -2.35F, -1.5F, 5.0F, 9.0F, 5.0F, 0.0F, false);
	handl6.setTextureOffset(0, 82).addCuboid(15.5F, -0.35F, -1.5F, 5.0F, 9.0F, 5.0F, 0.3F, false);

	armmiddle13 = new ModelPart(this);
	armmiddle13.setPivot(0.0F, 0.55F, -0.2F);
	handl6.addChild(armmiddle13);
	armmiddle13.setTextureOffset(55, 57).addCuboid(15.3F, -3.7F, -1.35F, 5.0F, 1.0F, 5.0F, -0.1F, false);

	heart22 = new ModelPart(this);
	heart22.setPivot(10.7F, -5.6F, -5.0F);
	armmiddle13.addChild(heart22);
	setRotationAngle(heart22, 0.0F, -1.5708F, 0.0F);


	Shape116 = new ModelPart(this);
	Shape116.setPivot(-0.6F, -12.9F, -2.5F);
	heart22.addChild(Shape116);
	setRotationAngle(Shape116, 0.0F, 0.0F, 0.6981F);
	Shape116.setTextureOffset(72, 46).addCuboid(13.2893F, 6.8241F, -7.6F, 3.0F, 2.0F, 1.0F, -0.19F, false);

	Shape117 = new ModelPart(this);
	Shape117.setPivot(0.6F, -12.9F, -2.5F);
	heart22.addChild(Shape117);
	setRotationAngle(Shape117, 0.0F, 0.0F, -0.6981F);
	Shape117.setTextureOffset(72, 27).addCuboid(-6.7903F, 14.7947F, -7.6F, 3.0F, 2.0F, 1.0F, -0.2F, false);

	handl7 = new ModelPart(this);
	handl7.setPivot(0.0F, 0.0F, 0.0F);
	left_hands_ro2.addChild(handl7);
	setRotationAngle(handl7, -1.5708F, 0.0F, 0.0F);
	handl7.setTextureOffset(43, 43).addCuboid(11.5F, -7.55F, -9.8F, 5.0F, 9.0F, 5.0F, 0.0F, false);
	handl7.setTextureOffset(0, 82).addCuboid(11.5F, -7.55F, -9.8F, 5.0F, 9.0F, 5.0F, 0.3F, false);

	armmiddle14 = new ModelPart(this);
	armmiddle14.setPivot(0.0F, 0.55F, -0.2F);
	handl7.addChild(armmiddle14);
	armmiddle14.setTextureOffset(55, 57).addCuboid(11.3F, -8.9F, -9.65F, 5.0F, 1.0F, 5.0F, -0.1F, false);

	heart23 = new ModelPart(this);
	heart23.setPivot(10.7F, -5.6F, -5.0F);
	armmiddle14.addChild(heart23);
	setRotationAngle(heart23, 0.0F, -1.5708F, 0.0F);


	Shape118 = new ModelPart(this);
	Shape118.setPivot(-0.6F, -12.9F, -2.5F);
	heart23.addChild(Shape118);
	setRotationAngle(Shape118, 0.0F, 0.0F, 0.6981F);
	Shape118.setTextureOffset(72, 46).addCuboid(3.5886F, 8.1758F, -3.6F, 3.0F, 2.0F, 1.0F, -0.19F, false);

	Shape119 = new ModelPart(this);
	Shape119.setPivot(0.6F, -12.9F, -2.5F);
	heart23.addChild(Shape119);
	setRotationAngle(Shape119, 0.0F, 0.0F, -0.6981F);
	Shape119.setTextureOffset(72, 27).addCuboid(-9.806F, 5.4761F, -3.6F, 3.0F, 2.0F, 1.0F, -0.2F, false);

	handl8 = new ModelPart(this);
	handl8.setPivot(0.0F, 0.0F, 0.0F);
	left_hands_ro2.addChild(handl8);
	setRotationAngle(handl8, -1.5708F, 0.0F, 0.0F);
	handl8.setTextureOffset(43, 43).addCuboid(14.5F, -0.25F, 6.4F, 5.0F, 9.0F, 5.0F, 0.0F, false);
	handl8.setTextureOffset(0, 82).addCuboid(14.5F, 0.85F, 6.4F, 5.0F, 9.0F, 5.0F, 0.3F, false);

	armmiddle15 = new ModelPart(this);
	armmiddle15.setPivot(0.0F, 0.55F, -0.2F);
	handl8.addChild(armmiddle15);
	armmiddle15.setTextureOffset(55, 57).addCuboid(14.3F, -1.6F, 6.55F, 5.0F, 1.0F, 5.0F, -0.1F, false);

	heart24 = new ModelPart(this);
	heart24.setPivot(10.7F, -5.6F, -5.0F);
	armmiddle15.addChild(heart24);
	setRotationAngle(heart24, 0.0F, -1.5708F, 0.0F);


	Shape120 = new ModelPart(this);
	Shape120.setPivot(-0.6F, -12.9F, -2.5F);
	heart24.addChild(Shape120);
	setRotationAngle(Shape120, 0.0F, 0.0F, 0.6981F);
	Shape120.setTextureOffset(72, 46).addCuboid(20.6909F, 3.3548F, -6.6F, 3.0F, 2.0F, 1.0F, -0.19F, false);

	Shape121 = new ModelPart(this);
	Shape121.setPivot(0.6F, -12.9F, -2.5F);
	heart24.addChild(Shape121);
	setRotationAngle(Shape121, 0.0F, 0.0F, -0.6981F);
	Shape121.setTextureOffset(72, 27).addCuboid(-2.0884F, 21.4814F, -6.6F, 3.0F, 2.0F, 1.0F, -0.2F, false);

	handl9 = new ModelPart(this);
	handl9.setPivot(0.0F, 0.0F, 0.0F);
	left_hands_ro2.addChild(handl9);
	setRotationAngle(handl9, -1.5708F, 0.0F, 0.0F);
	handl9.setTextureOffset(43, 43).addCuboid(18.9F, 3.95F, -10.4F, 5.0F, 9.0F, 5.0F, 0.0F, false);
	handl9.setTextureOffset(0, 82).addCuboid(18.9F, 3.95F, -10.4F, 5.0F, 9.0F, 5.0F, 0.3F, false);

	armmiddle16 = new ModelPart(this);
	armmiddle16.setPivot(0.0F, 0.55F, -0.2F);
	handl9.addChild(armmiddle16);
	armmiddle16.setTextureOffset(55, 57).addCuboid(18.7F, 2.6F, -10.25F, 5.0F, 1.0F, 5.0F, -0.1F, false);

	heart25 = new ModelPart(this);
	heart25.setPivot(10.7F, -5.6F, -5.0F);
	armmiddle16.addChild(heart25);
	setRotationAngle(heart25, 0.0F, -1.5708F, 0.0F);


	Shape122 = new ModelPart(this);
	Shape122.setPivot(-0.6F, -12.9F, -2.5F);
	heart25.addChild(Shape122);
	setRotationAngle(Shape122, 0.0F, 0.0F, 0.6981F);
	Shape122.setTextureOffset(72, 46).addCuboid(10.5211F, 17.371F, -11.0F, 3.0F, 2.0F, 1.0F, -0.19F, false);

	Shape123 = new ModelPart(this);
	Shape123.setPivot(0.6F, -12.9F, -2.5F);
	heart25.addChild(Shape123);
	setRotationAngle(Shape123, 0.0F, 0.0F, -0.6981F);
	Shape123.setTextureOffset(72, 27).addCuboid(-17.6577F, 13.9F, -11.0F, 3.0F, 2.0F, 1.0F, -0.2F, false);

	handl10 = new ModelPart(this);
	handl10.setPivot(0.0F, 0.0F, 0.0F);
	left_hands_ro2.addChild(handl10);
	setRotationAngle(handl10, -1.5708F, 0.0F, 0.0F);
	handl10.setTextureOffset(43, 43).addCuboid(21.6F, -7.65F, 3.6F, 5.0F, 9.0F, 5.0F, 0.0F, false);
	handl10.setTextureOffset(0, 82).addCuboid(21.6F, -6.65F, 3.6F, 5.0F, 9.0F, 5.0F, 0.3F, false);

	armmiddle17 = new ModelPart(this);
	armmiddle17.setPivot(0.0F, 0.55F, -0.2F);
	handl10.addChild(armmiddle17);
	armmiddle17.setTextureOffset(55, 57).addCuboid(21.4F, -9.0F, 3.75F, 5.0F, 1.0F, 5.0F, -0.1F, false);

	heart26 = new ModelPart(this);
	heart26.setPivot(10.7F, -5.6F, -5.0F);
	armmiddle17.addChild(heart26);
	setRotationAngle(heart26, 0.0F, -1.5708F, 0.0F);


	Shape124 = new ModelPart(this);
	Shape124.setPivot(-0.6F, -12.9F, -2.5F);
	heart26.addChild(Shape124);
	setRotationAngle(Shape124, 0.0F, 0.0F, 0.6981F);
	Shape124.setTextureOffset(72, 46).addCuboid(13.7893F, -0.5141F, -13.7F, 3.0F, 2.0F, 1.0F, -0.19F, false);

	Shape125 = new ModelPart(this);
	Shape125.setPivot(0.6F, -12.9F, -2.5F);
	heart26.addChild(Shape125);
	setRotationAngle(Shape125, 0.0F, 0.0F, -0.6981F);
	Shape125.setTextureOffset(72, 27).addCuboid(0.5233F, 14.0129F, -13.7F, 3.0F, 2.0F, 1.0F, -0.2F, false);

	right_hands_ro2 = new ModelPart(this);
	right_hands_ro2.setPivot(0.0F, 0.0F, 0.0F);
	heal.addChild(right_hands_ro2);


	handr6 = new ModelPart(this);
	handr6.setPivot(0.0F, 0.0F, 0.0F);
	right_hands_ro2.addChild(handr6);
	setRotationAngle(handr6, -1.5708F, 0.0F, 0.0F);
	handr6.setTextureOffset(43, 43).addCuboid(-26.6F, -0.95F, -1.5F, 5.0F, 9.0F, 5.0F, 0.0F, true);
	handr6.setTextureOffset(0, 82).addCuboid(-26.6F, -0.95F, -1.5F, 5.0F, 9.0F, 5.0F, 0.3F, true);

	armmiddle18 = new ModelPart(this);
	armmiddle18.setPivot(0.0F, 0.55F, -0.2F);
	handr6.addChild(armmiddle18);
	armmiddle18.setTextureOffset(55, 57).addCuboid(-26.4F, -2.3F, -1.35F, 5.0F, 1.0F, 5.0F, -0.1F, true);

	heart27 = new ModelPart(this);
	heart27.setPivot(-10.7F, -5.6F, -5.0F);
	armmiddle18.addChild(heart27);
	setRotationAngle(heart27, 0.0F, 1.5708F, 0.0F);


	Shape126 = new ModelPart(this);
	Shape126.setPivot(0.6F, -12.9F, -2.5F);
	heart27.addChild(Shape126);
	setRotationAngle(Shape126, 0.0F, 0.0F, -0.6981F);
	Shape126.setTextureOffset(72, 46).addCuboid(-17.1892F, 7.8966F, -13.7F, 3.0F, 2.0F, 1.0F, -0.19F, true);

	Shape127 = new ModelPart(this);
	Shape127.setPivot(-0.6F, -12.9F, -2.5F);
	heart27.addChild(Shape127);
	setRotationAngle(Shape127, 0.0F, 0.0F, 0.6981F);
	Shape127.setTextureOffset(72, 27).addCuboid(4.6902F, 15.8672F, -13.7F, 3.0F, 2.0F, 1.0F, -0.2F, true);

	handr7 = new ModelPart(this);
	handr7.setPivot(0.0F, 0.0F, 0.0F);
	right_hands_ro2.addChild(handr7);
	setRotationAngle(handr7, -1.5708F, 0.0F, 0.0F);
	handr7.setTextureOffset(43, 43).addCuboid(-19.4F, 9.65F, -9.8F, 5.0F, 9.0F, 5.0F, 0.0F, true);
	handr7.setTextureOffset(0, 82).addCuboid(-19.4F, 9.65F, -9.8F, 5.0F, 9.0F, 5.0F, 0.3F, true);

	armmiddle19 = new ModelPart(this);
	armmiddle19.setPivot(0.0F, 0.55F, -0.2F);
	handr7.addChild(armmiddle19);
	armmiddle19.setTextureOffset(55, 57).addCuboid(-19.2F, 8.3F, -9.65F, 5.0F, 1.0F, 5.0F, -0.1F, true);

	heart28 = new ModelPart(this);
	heart28.setPivot(-10.7F, -5.6F, -5.0F);
	armmiddle19.addChild(heart28);
	setRotationAngle(heart28, 0.0F, 1.5708F, 0.0F);


	Shape128 = new ModelPart(this);
	Shape128.setPivot(0.6F, -12.9F, -2.5F);
	heart28.addChild(Shape128);
	setRotationAngle(Shape128, 0.0F, 0.0F, -0.6981F);
	Shape128.setTextureOffset(72, 46).addCuboid(-17.6446F, 21.3518F, -6.5F, 3.0F, 2.0F, 1.0F, -0.19F, true);

	Shape129 = new ModelPart(this);
	Shape129.setPivot(-0.6F, -12.9F, -2.5F);
	heart28.addChild(Shape129);
	setRotationAngle(Shape129, 0.0F, 0.0F, 0.6981F);
	Shape129.setTextureOffset(72, 27).addCuboid(17.862F, 18.6521F, -6.5F, 3.0F, 2.0F, 1.0F, -0.2F, true);

	handr8 = new ModelPart(this);
	handr8.setPivot(0.0F, 0.0F, 0.0F);
	right_hands_ro2.addChild(handr8);
	setRotationAngle(handr8, -1.5708F, 0.0F, 0.0F);
	handr8.setTextureOffset(43, 43).addCuboid(-21.3F, -0.25F, 6.4F, 5.0F, 9.0F, 5.0F, 0.0F, true);
	handr8.setTextureOffset(0, 82).addCuboid(-21.3F, 0.75F, 6.4F, 5.0F, 9.0F, 5.0F, 0.3F, true);

	armmiddle20 = new ModelPart(this);
	armmiddle20.setPivot(0.0F, 0.55F, -0.2F);
	handr8.addChild(armmiddle20);
	armmiddle20.setTextureOffset(55, 57).addCuboid(-21.1F, -1.6F, 6.55F, 5.0F, 1.0F, 5.0F, -0.1F, true);

	heart29 = new ModelPart(this);
	heart29.setPivot(-10.7F, -5.6F, -5.0F);
	armmiddle20.addChild(heart29);
	setRotationAngle(heart29, 0.0F, 1.5708F, 0.0F);


	Shape130 = new ModelPart(this);
	Shape130.setPivot(0.6F, -12.9F, -2.5F);
	heart29.addChild(Shape130);
	setRotationAngle(Shape130, 0.0F, 0.0F, -0.6981F);
	Shape130.setTextureOffset(72, 46).addCuboid(-23.6909F, 3.3548F, -8.4F, 3.0F, 2.0F, 1.0F, -0.19F, true);

	Shape131 = new ModelPart(this);
	Shape131.setPivot(-0.6F, -12.9F, -2.5F);
	heart29.addChild(Shape131);
	setRotationAngle(Shape131, 0.0F, 0.0F, 0.6981F);
	Shape131.setTextureOffset(72, 27).addCuboid(-0.9116F, 21.4814F, -8.4F, 3.0F, 2.0F, 1.0F, -0.2F, true);

	handr9 = new ModelPart(this);
	handr9.setPivot(0.0F, 0.0F, 0.0F);
	right_hands_ro2.addChild(handr9);
	setRotationAngle(handr9, -1.5708F, 0.0F, 0.0F);
	handr9.setTextureOffset(43, 43).addCuboid(-23.9F, -2.95F, -10.4F, 5.0F, 9.0F, 5.0F, 0.0F, true);
	handr9.setTextureOffset(0, 82).addCuboid(-23.9F, -1.95F, -10.4F, 5.0F, 9.0F, 5.0F, 0.3F, true);

	armmiddle21 = new ModelPart(this);
	armmiddle21.setPivot(0.0F, 0.55F, -0.2F);
	handr9.addChild(armmiddle21);
	armmiddle21.setTextureOffset(55, 57).addCuboid(-23.7F, -4.3F, -10.25F, 5.0F, 1.0F, 5.0F, -0.1F, true);

	heart30 = new ModelPart(this);
	heart30.setPivot(-10.7F, -5.6F, -5.0F);
	armmiddle21.addChild(heart30);
	setRotationAngle(heart30, 0.0F, 1.5708F, 0.0F);


	Shape132 = new ModelPart(this);
	Shape132.setPivot(0.6F, -12.9F, -2.5F);
	heart30.addChild(Shape132);
	setRotationAngle(Shape132, 0.0F, 0.0F, -0.6981F);
	Shape132.setTextureOffset(72, 46).addCuboid(-9.0858F, 12.0853F, -11.0F, 3.0F, 2.0F, 1.0F, -0.19F, true);

	Shape133 = new ModelPart(this);
	Shape133.setPivot(-0.6F, -12.9F, -2.5F);
	heart30.addChild(Shape133);
	setRotationAngle(Shape133, 0.0F, 0.0F, 0.6981F);
	Shape133.setTextureOffset(72, 27).addCuboid(10.2225F, 8.6143F, -11.0F, 3.0F, 2.0F, 1.0F, -0.2F, true);

	handr10 = new ModelPart(this);
	handr10.setPivot(0.0F, 0.0F, 0.0F);
	right_hands_ro2.addChild(handr10);
	setRotationAngle(handr10, -1.5708F, 0.0F, 0.0F);
	handr10.setTextureOffset(43, 43).addCuboid(-17.2F, -7.65F, -0.5F, 5.0F, 9.0F, 5.0F, 0.0F, true);
	handr10.setTextureOffset(0, 82).addCuboid(-17.2F, -6.65F, -0.5F, 5.0F, 9.0F, 5.0F, 0.3F, true);

	armmiddle22 = new ModelPart(this);
	armmiddle22.setPivot(0.0F, 0.55F, -0.2F);
	handr10.addChild(armmiddle22);
	armmiddle22.setTextureOffset(55, 57).addCuboid(-17.0F, -9.0F, -0.35F, 5.0F, 1.0F, 5.0F, -0.1F, true);

	heart31 = new ModelPart(this);
	heart31.setPivot(-10.7F, -5.6F, -5.0F);
	armmiddle22.addChild(heart31);
	setRotationAngle(heart31, 0.0F, 1.5708F, 0.0F);


	Shape134 = new ModelPart(this);
	Shape134.setPivot(0.6F, -12.9F, -2.5F);
	heart31.addChild(Shape134);
	setRotationAngle(Shape134, 0.0F, 0.0F, -0.6981F);
	Shape134.setTextureOffset(72, 46).addCuboid(-13.6486F, 2.1213F, -4.3F, 3.0F, 2.0F, 1.0F, -0.19F, true);

	Shape135 = new ModelPart(this);
	Shape135.setPivot(-0.6F, -12.9F, -2.5F);
	heart31.addChild(Shape135);
	setRotationAngle(Shape135, 0.0F, 0.0F, 0.6981F);
	Shape135.setTextureOffset(72, 27).addCuboid(-0.3825F, 11.3774F, -4.3F, 3.0F, 2.0F, 1.0F, -0.2F, true);
}
	@Override
	public void setAngles(@Nullable LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		this.yOffset = (double) MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;
		this.head.pitch = headPitch * 0.017453292F;
		this.head.yaw = headYaw * 0.017453292F;
}
	public void setAttackAngles(@Nullable LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		float power = 0.5F;
		float speed = 3.0F;
		this.yOffset = (double)MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;
		this.head.pitch = headPitch * 0.017453292F;
		this.head.yaw = headYaw * 0.017453292F;
		this.handl1.yaw = MathHelper.cos(speed * animationProgress) * 1.2F * power;
		this.handl2.yaw = MathHelper.cos(speed * animationProgress + 1.0471976F) * 1.4F * power;
		this.handl3.yaw = MathHelper.cos(speed * animationProgress + (float)2.0943951023931953D) * 1.6F * power;
		this.handl4.yaw = MathHelper.cos(speed * animationProgress + (float)2.6179938779914944D) * 1.3F * power;
		this.handl5.yaw = MathHelper.cos(speed * animationProgress + (float)3.141592653589793D) * 1.7F * power;
		this.handr1.yaw = MathHelper.cos(speed * animationProgress + (float)3.665191429188092D) * 1.2F * power;
		this.handr2.yaw = MathHelper.cos(speed * animationProgress + (float)6.283185307179586D) * 1.1F * power;
		this.handr3.yaw = MathHelper.cos(speed * animationProgress + (float)8.377580409572781D) * 1.4F * power;
		this.handr4.yaw = MathHelper.cos(speed * animationProgress + (float)10.471975511965978D) * 1.5F * power;
		this.handr5.yaw = MathHelper.cos(speed * animationProgress + (float)1.5707963267948966D) * 1.6F * power;
		this.left_hands_ro.pitch = headPitch * 0.017453292F;
		this.left_hands_ro.yaw = headYaw * 0.017453292F;
		this.right_hands_ro.pitch = headPitch * 0.017453292F;
		this.right_hands_ro.yaw = headYaw * 0.017453292F;
		float r = (float)Math.random();
		float offysin = MathHelper.sin(r * speed * animationProgress) * power - 0.25F;
		float offycos = MathHelper.cos(r * speed * animationProgress) * power - 0.25F;
		this.handl1.pivotZ = offysin;
		this.handl2.pivotZ = offycos;
		this.handl3.pivotZ = offysin;
		this.handl4.pivotZ = offycos;
		this.handl5.pivotZ = offysin;
		this.handr1.pivotZ = offycos;
		this.handr2.pivotZ = offysin;
		this.handr3.pivotZ = offycos;
		this.handr4.pivotZ = offysin;
		this.handr5.pivotZ = offycos;
		float offxl = r * MathHelper.sin(r * speed * animationProgress) * power + 0.2F;
		float offxr = r * MathHelper.sin(r * speed * animationProgress) * power - 0.2F;
		this.left_hands_ro.pivotX = offxl;
		this.right_hands_ro.pivotX = offxr;
	}
	public void setHealingAngles(@Nullable LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		float power = 0.5F;
		float speed = 3.0F;
		this.yOffset = (double)MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;
		this.head.pitch = headPitch * 0.017453292F;
		this.head.yaw = headYaw * 0.017453292F;
		this.handl6.yaw = MathHelper.cos(speed * animationProgress) * 1.2F * power;
		this.handl7.yaw = MathHelper.cos(speed * animationProgress + 1.0471976F) * 1.4F * power;
		this.handl8.yaw = MathHelper.cos(speed * animationProgress + (float)2.0943951023931953D) * 1.6F * power;
		this.handl9.yaw = MathHelper.cos(speed * animationProgress + (float)2.6179938779914944D) * 1.3F * power;
		this.handl10.yaw = MathHelper.cos(speed * animationProgress + (float)3.141592653589793D) * 1.7F * power;
		this.handr6.yaw = MathHelper.cos(speed * animationProgress + (float)3.665191429188092D) * 1.2F * power;
		this.handr7.yaw = MathHelper.cos(speed * animationProgress + (float)6.283185307179586D) * 1.1F * power;
		this.handr8.yaw = MathHelper.cos(speed * animationProgress + (float)8.377580409572781D) * 1.4F * power;
		this.handr9.yaw = MathHelper.cos(speed * animationProgress + (float)10.471975511965978D) * 1.5F * power;
		this.handr10.yaw = MathHelper.cos(speed * animationProgress + (float)1.5707963267948966D) * 1.6F * power;
		this.left_hands_ro2.pitch = headPitch * 0.017453292F;
		this.left_hands_ro2.yaw = headYaw * 0.017453292F;
		this.right_hands_ro2.pitch = headPitch * 0.017453292F;
		this.right_hands_ro2.yaw = headYaw * 0.017453292F;
		float r = (float)Math.random();
		float offysin = MathHelper.sin(r * speed * animationProgress) * power - 0.25F;
		float offycos = MathHelper.cos(r * speed * animationProgress) * power - 0.25F;
		this.handl6.pivotZ = offysin;
		this.handl7.pivotZ = offycos;
		this.handl8.pivotZ = offysin;
		this.handl9.pivotZ = offycos;
		this.handl10.pivotZ = offysin;
		this.handr6.pivotZ = offycos;
		this.handr7.pivotZ = offysin;
		this.handr8.pivotZ = offycos;
		this.handr9.pivotZ = offysin;
		this.handr10.pivotZ = offycos;
		float offxl = r * MathHelper.sin(r * speed * animationProgress) * power + 0.2F;
		float offxr = r * MathHelper.sin(r * speed * animationProgress) * power - 0.2F;
		this.left_hands_ro2.pivotX = offxl;
		this.right_hands_ro2.pivotX = offxr;
	}
	@Override
	public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		matrixStack.translate(-0.45D, this.yOffset - 0.2D, 0.75D);
		this.head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		this.body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		matrixStack.translate(0.0D, -this.yOffset, 0.0D);
	}

	public void renderAttack(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		matrixStack.translate(0.0D, this.yOffset, -0.75D);
		attackBody.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);

		matrixStack.translate(0.0D, -this.yOffset, 0.0D);
		punch.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.translate(0.0D, 0.2D, 0.75D);
	}
	public void renderHeal(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		matrixStack.translate(0.0D, this.yOffset, -0.75D);
		attackBody.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);

		matrixStack.translate(0.0D, -this.yOffset, 0.0D);
		heal.render(matrixStack, buffer, packedLight, packedOverlay);
	}
	public final void renderPunchyArms(@NotNull MatrixStack matrices, @NotNull VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
		this.right_hands_ro.render(matrices, vertices, light, overlay, red, green, blue, alpha);
		this.left_hands_ro.render(matrices, vertices, light, overlay, red, green, blue, alpha);
	}
	public final void renderPunchyArmsHeal(@NotNull MatrixStack matrices, @NotNull VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
		this.right_hands_ro2.render(matrices, vertices, light, overlay, red, green, blue, alpha);
		this.left_hands_ro2.render(matrices, vertices, light, overlay, red, green, blue, alpha);
	}
	public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
}

	}