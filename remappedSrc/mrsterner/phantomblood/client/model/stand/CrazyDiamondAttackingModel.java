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

public class CrazyDiamondAttackingModel extends EntityModel<LivingEntity> {
private final ModelPart head;
	private final ModelPart bone1;
	private final ModelPart bone6;
	private final ModelPart bone5;
	private final ModelPart bone2;
	private final ModelPart bone46;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart glass;
	private final ModelPart bone3;
	private final ModelPart bone;
	private final ModelPart bone15;
	private final ModelPart bone17;
	private final ModelPart bone18;
	private final ModelPart bone16;
	private final ModelPart bone4;
	private final ModelPart heart7;
	private final ModelPart body;
	private final ModelPart bodydown;
	private final ModelPart bone10;
	private final ModelPart bone19;
	private final ModelPart bone20;
	private final ModelPart bone21;
	private final ModelPart bone22;
	private final ModelPart heart;
	private final ModelPart bone11;
	private final ModelPart bone23;
	private final ModelPart heart2;
	private final ModelPart bone24;
	private final ModelPart bone25;
	private final ModelPart bone12;
	private final ModelPart bone53;
	private final ModelPart bone54;
	private final ModelPart bone55;
	private final ModelPart bone56;
	private final ModelPart bone57;
	private final ModelPart bone58;
	private final ModelPart bone29;
	private final ModelPart bone34;
	private final ModelPart bone35;
	private final ModelPart bone36;
	private final ModelPart bone37;
	private final ModelPart bone38;
	private final ModelPart bone49;
	private final ModelPart bone50;
	private final ModelPart bone51;
	private final ModelPart bone52;
	private final ModelPart bone39;
	private final ModelPart bone40;
	private final ModelPart bone41;
	private final ModelPart bone42;
	private final ModelPart bone47;
	private final ModelPart bone48;
	private final ModelPart bone43;
	private final ModelPart bone44;
	private final ModelPart leftarm;
	private final ModelPart rightarm;
	private final ModelPart leftleg;
	private final ModelPart heart3;
	private final ModelPart bone26;
	private final ModelPart bone27;
	private final ModelPart legdownl;
	private final ModelPart rightleg;
	private final ModelPart heart4;
	private final ModelPart bone9;
	private final ModelPart bone28;
	private final ModelPart legdownr;
	private final ModelPart viewFirst;
	private final ModelPart left_hands_ro;
	private final ModelPart handl1;
	private final ModelPart armmiddle;
	private final ModelPart heart5;
	private final ModelPart bone30;
	private final ModelPart bone31;
	private final ModelPart handl2;
	private final ModelPart armmiddle3;
	private final ModelPart heart8;
	private final ModelPart bone13;
	private final ModelPart bone14;
	private final ModelPart handl3;
	private final ModelPart armmiddle4;
	private final ModelPart heart9;
	private final ModelPart bone45;
	private final ModelPart bone59;
	private final ModelPart handl4;
	private final ModelPart armmiddle5;
	private final ModelPart heart10;
	private final ModelPart bone62;
	private final ModelPart bone63;
	private final ModelPart handl5;
	private final ModelPart armmiddle6;
	private final ModelPart heart11;
	private final ModelPart bone64;
	private final ModelPart bone65;
	private final ModelPart right_hands_ro;
	private final ModelPart handr1;
	private final ModelPart armmiddle7;
	private final ModelPart heart12;
	private final ModelPart bone66;
	private final ModelPart bone67;
	private final ModelPart handr2;
	private final ModelPart armmiddle8;
	private final ModelPart heart13;
	private final ModelPart bone68;
	private final ModelPart bone69;
	private final ModelPart handr3;
	private final ModelPart armmiddle9;
	private final ModelPart heart14;
	private final ModelPart bone70;
	private final ModelPart bone71;
	private final ModelPart handr4;
	private final ModelPart armmiddle10;
	private final ModelPart heart15;
	private final ModelPart bone72;
	private final ModelPart bone73;
	private final ModelPart handr5;
	private final ModelPart armmiddle11;
	private final ModelPart heart16;
	private final ModelPart bone74;
	private final ModelPart bone75;
	private double yOffset;

public CrazyDiamondAttackingModel() {
		textureWidth = 128;
		textureHeight = 128;
		head = new ModelPart(this);
		head.setPivot(0.0F, 0.0F, 0.0F);
		setRotationAngle(head, 0.2182F, 0.0F, 0.0F);
		head.setTextureOffset(21, 21).addCuboid(-3.5F, -6.0F, -3.0F, 7.0F, 6.0F, 7.0F, 0.0F, false);

		bone1 = new ModelPart(this);
		bone1.setPivot(0.0F, 0.0F, 0.0F);
		head.addChild(bone1);
		setRotationAngle(bone1, 0.4014F, 0.0F, 0.0F);
		bone1.setTextureOffset(26, 5).addCuboid(-4.6F, -8.0F, 0.0F, 9.0F, 3.0F, 6.0F, 0.01F, false);

		bone6 = new ModelPart(this);
		bone6.setPivot(3.854F, -7.8722F, 2.5976F);
		head.addChild(bone6);
		setRotationAngle(bone6, 0.4887F, 0.6545F, 0.3491F);
		bone6.setTextureOffset(65, 68).addCuboid(-3.0F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.02F, false);

		bone5 = new ModelPart(this);
		bone5.setPivot(-3.854F, -7.8722F, 2.5976F);
		head.addChild(bone5);
		setRotationAngle(bone5, 0.4887F, -0.6545F, -0.3491F);
		bone5.setTextureOffset(0, 68).addCuboid(0.0F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.02F, false);

		bone2 = new ModelPart(this);
		bone2.setPivot(0.0F, 0.0F, 0.0F);
		head.addChild(bone2);
		setRotationAngle(bone2, 0.0524F, 0.0F, 0.0F);
		bone2.setTextureOffset(0, 0).addCuboid(-4.5F, -7.2F, -1.7F, 9.0F, 4.0F, 7.0F, 0.0F, false);

		bone46 = new ModelPart(this);
		bone46.setPivot(0.0F, 1.4F, 0.0F);
		head.addChild(bone46);
		setRotationAngle(bone46, 0.0524F, 0.0F, 0.0F);
		bone46.setTextureOffset(22, 14).addCuboid(-4.5F, -4.2F, 3.3F, 9.0F, 1.0F, 2.0F, 0.0F, false);

		bone7 = new ModelPart(this);
		bone7.setPivot(0.3F, 2.9432F, -0.7469F);
		head.addChild(bone7);
		setRotationAngle(bone7, 0.0524F, 0.0F, 0.0F);
		bone7.setTextureOffset(62, 17).addCuboid(-4.5F, -6.2F, -1.7F, 1.0F, 3.0F, 7.0F, 0.0F, false);

		bone8 = new ModelPart(this);
		bone8.setPivot(-0.3F, 2.9432F, -0.7469F);
		head.addChild(bone8);
		setRotationAngle(bone8, 0.0524F, 0.0F, 0.0F);
		bone8.setTextureOffset(20, 60).addCuboid(3.5F, -6.2F, -1.7F, 1.0F, 3.0F, 7.0F, 0.0F, false);

		glass = new ModelPart(this);
		glass.setPivot(0.0F, -0.8F, 0.1F);
		head.addChild(glass);
		setRotationAngle(glass, 0.192F, 0.0F, 0.0F);
		

		bone3 = new ModelPart(this);
		bone3.setPivot(0.0F, 0.0F, 1.0F);
		glass.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 1.0996F, 0.0F);
		bone3.setTextureOffset(58, 38).addCuboid(2.6251F, -6.9618F, -2.9109F, 3.0F, 2.0F, 6.0F, 0.0F, false);

		bone = new ModelPart(this);
		bone.setPivot(1.5111F, -4.2251F, -2.5709F);
		glass.addChild(bone);
		

		bone15 = new ModelPart(this);
		bone15.setPivot(0.0F, 0.0F, 0.0F);
		bone.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 1.1345F, 0.0F);
		bone15.setTextureOffset(63, 46).addCuboid(-0.7F, 1.0F, -2.3F, 2.0F, 2.0F, 5.0F, -0.1F, false);

		bone17 = new ModelPart(this);
		bone17.setPivot(0.0606F, -0.1107F, 0.5693F);
		bone.addChild(bone17);
		setRotationAngle(bone17, 0.0F, 1.1345F, 0.0F);
		bone17.setTextureOffset(22, 34).addCuboid(0.3F, -1.0F, -2.4F, 1.0F, 3.0F, 1.0F, -0.11F, false);

		bone18 = new ModelPart(this);
		bone18.setPivot(-3.0829F, -0.1107F, 0.5693F);
		bone.addChild(bone18);
		setRotationAngle(bone18, 0.0F, -1.1345F, 0.0F);
		bone18.setTextureOffset(0, 24).addCuboid(-1.3F, -1.0F, -2.4F, 1.0F, 3.0F, 1.0F, -0.11F, false);

		bone16 = new ModelPart(this);
		bone16.setPivot(-3.2942F, -0.0242F, 0.1244F);
		bone.addChild(bone16);
		setRotationAngle(bone16, 0.0F, -1.1345F, 0.0F);
		bone16.setTextureOffset(63, 27).addCuboid(-1.3F, 1.0F, -2.6F, 2.0F, 2.0F, 5.0F, -0.1F, false);

		bone4 = new ModelPart(this);
		bone4.setPivot(0.0F, 0.0F, 1.0F);
		glass.addChild(bone4);
		setRotationAngle(bone4, 0.0F, -1.0996F, 0.0F);
		bone4.setTextureOffset(57, 9).addCuboid(-5.6251F, -6.9618F, -2.9109F, 3.0F, 2.0F, 6.0F, 0.0F, false);

		heart7 = new ModelPart(this);
		heart7.setPivot(-2.55F, 5.5F, -0.8F);
		head.addChild(heart7);


		body = new ModelPart(this);
		body.setPivot(0.0F, 0.0F, 0.0F);
		setRotationAngle(body, 0.1309F, 0.0F, 0.0F);
		body.setTextureOffset(0, 11).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 6.0F, 0.0F, false);

		bodydown = new ModelPart(this);
		bodydown.setPivot(0.0F, 0.0F, 0.0F);
		body.addChild(bodydown);
		bodydown.setTextureOffset(44, 29).addCuboid(-3.5F, 7.0F, -1.6F, 7.0F, 4.0F, 5.0F, 0.0F, false);

		bone10 = new ModelPart(this);
		bone10.setPivot(0.0F, 0.0F, 0.0F);
		body.addChild(bone10);
		bone10.setTextureOffset(25, 0).addCuboid(-3.5F, 0.2F, -2.9F, 7.0F, 4.0F, 1.0F, 0.0F, false);

		bone19 = new ModelPart(this);
		bone19.setPivot(0.0F, 0.0F, 6.6F);
		body.addChild(bone19);
		bone19.setTextureOffset(63, 53).addCuboid(-3.0F, 0.2F, -3.9F, 6.0F, 1.0F, 2.0F, 0.0F, false);

		bone20 = new ModelPart(this);
		bone20.setPivot(0.0F, 5.0F, 6.6F);
		body.addChild(bone20);
		bone20.setTextureOffset(64, 63).addCuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		bone21 = new ModelPart(this);
		bone21.setPivot(-1.691F, 3.0301F, 6.5F);
		body.addChild(bone21);
		setRotationAngle(bone21, 0.0F, 0.0F, 1.1345F);
		bone21.setTextureOffset(41, 0).addCuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		bone22 = new ModelPart(this);
		bone22.setPivot(1.691F, 3.0301F, 6.5F);
		body.addChild(bone22);
		setRotationAngle(bone22, 0.0F, 0.0F, -1.1345F);
		bone22.setTextureOffset(28, 17).addCuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		heart = new ModelPart(this);
		heart.setPivot(-0.6F, 6.1F, -2.0F);
		body.addChild(heart);
		

		bone11 = new ModelPart(this);
		bone11.setPivot(0.0F, 0.0F, 0.0F);
		heart.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, 0.6981F);
		bone11.setTextureOffset(0, 74).addCuboid(-1.3468F, -1.1286F, -0.5F, 3.0F, 2.0F, 1.0F, 0.01F, false);

		bone23 = new ModelPart(this);
		bone23.setPivot(1.2F, 0.0F, 0.0F);
		heart.addChild(bone23);
		setRotationAngle(bone23, 0.0F, 0.0F, -0.6981F);
		bone23.setTextureOffset(20, 73).addCuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		heart2 = new ModelPart(this);
		heart2.setPivot(-0.6F, 9.9F, -2.3F);
		body.addChild(heart2);
		

		bone24 = new ModelPart(this);
		bone24.setPivot(0.0F, 0.0F, 0.0F);
		heart2.addChild(bone24);
		setRotationAngle(bone24, 0.0F, 0.0F, 0.6981F);
		bone24.setTextureOffset(12, 68).addCuboid(-1.3468F, -1.1286F, -0.5F, 3.0F, 2.0F, 2.0F, -0.19F, false);

		bone25 = new ModelPart(this);
		bone25.setPivot(1.2F, 0.0F, 0.0F);
		heart2.addChild(bone25);
		setRotationAngle(bone25, 0.0F, 0.0F, -0.6981F);
		bone25.setTextureOffset(15, 24).addCuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, -0.2F, false);

		bone12 = new ModelPart(this);
		bone12.setPivot(0.0F, 0.0F, 0.3F);
		body.addChild(bone12);
		bone12.setTextureOffset(0, 34).addCuboid(-4.0F, 10.0F, -2.4F, 8.0F, 2.0F, 6.0F, 0.0F, false);

		bone53 = new ModelPart(this);
		bone53.setPivot(-6.55F, 20.2333F, 0.45F);
		body.addChild(bone53);
		setRotationAngle(bone53, 0.0F, 0.3316F, 0.2443F);
		bone53.setTextureOffset(69, 7).addCuboid(-4.75F, -18.3333F, 3.25F, 5.0F, 1.0F, 2.0F, 0.0F, false);

		bone54 = new ModelPart(this);
		bone54.setPivot(-4.6377F, -18.199F, 3.453F);
		bone53.addChild(bone54);
		setRotationAngle(bone54, 0.5236F, -2.8623F, 0.0785F);
		bone54.setTextureOffset(0, 33).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		bone55 = new ModelPart(this);
		bone55.setPivot(-4.8679F, -19.0863F, 2.2888F);
		bone53.addChild(bone55);
		setRotationAngle(bone55, 0.5236F, -2.2864F, 0.0785F);
		bone55.setTextureOffset(27, 70).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		bone56 = new ModelPart(this);
		bone56.setPivot(-5.9496F, -20.8982F, 0.1061F);
		bone53.addChild(bone56);
		setRotationAngle(bone56, 0.5236F, 2.7314F, 0.0785F);
		bone56.setTextureOffset(48, 63).addCuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		bone57 = new ModelPart(this);
		bone57.setPivot(-4.9121F, -20.9909F, -1.8343F);
		bone53.addChild(bone57);
		setRotationAngle(bone57, -0.5236F, 2.1031F, 0.0785F);
		bone57.setTextureOffset(15, 57).addCuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		bone58 = new ModelPart(this);
		bone58.setPivot(-3.2972F, -19.3926F, -2.1498F);
		bone53.addChild(bone58);
		setRotationAngle(bone58, -0.5236F, 1.1781F, 0.0785F);
		bone58.setTextureOffset(35, 48).addCuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		bone29 = new ModelPart(this);
		bone29.setPivot(6.55F, 20.2333F, 0.45F);
		body.addChild(bone29);
		setRotationAngle(bone29, 0.0F, -0.3316F, -0.2443F);
		bone29.setTextureOffset(69, 7).addCuboid(-0.25F, -18.3333F, 3.25F, 5.0F, 1.0F, 2.0F, 0.0F, true);

		bone34 = new ModelPart(this);
		bone34.setPivot(4.6377F, -18.199F, 3.453F);
		bone29.addChild(bone34);
		setRotationAngle(bone34, 0.5236F, 2.8623F, -0.0785F);
		bone34.setTextureOffset(0, 33).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);

		bone35 = new ModelPart(this);
		bone35.setPivot(4.8679F, -19.0863F, 2.2888F);
		bone29.addChild(bone35);
		setRotationAngle(bone35, 0.5236F, 2.2864F, -0.0785F);
		bone35.setTextureOffset(27, 70).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, true);

		bone36 = new ModelPart(this);
		bone36.setPivot(5.9496F, -20.8982F, 0.1061F);
		bone29.addChild(bone36);
		setRotationAngle(bone36, 0.5236F, -2.7314F, -0.0785F);
		bone36.setTextureOffset(48, 63).addCuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, true);

		bone37 = new ModelPart(this);
		bone37.setPivot(4.9121F, -20.9909F, -1.8343F);
		bone29.addChild(bone37);
		setRotationAngle(bone37, -0.5236F, -2.1031F, -0.0785F);
		bone37.setTextureOffset(15, 57).addCuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, true);

		bone38 = new ModelPart(this);
		bone38.setPivot(3.2972F, -19.3926F, -2.1498F);
		bone29.addChild(bone38);
		setRotationAngle(bone38, -0.5236F, -1.1781F, -0.0785F);
		bone38.setTextureOffset(35, 48).addCuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, true);

		bone49 = new ModelPart(this);
		bone49.setPivot(-8.675F, 23.625F, -0.7F);
		body.addChild(bone49);
		setRotationAngle(bone49, 0.0F, 0.1047F, 0.7679F);
		bone49.setTextureOffset(65, 0).addCuboid(-14.725F, -20.825F, 2.6F, 5.0F, 1.0F, 2.0F, 0.0F, false);

		bone50 = new ModelPart(this);
		bone50.setPivot(-15.2936F, -20.6847F, 2.0575F);
		bone49.addChild(bone50);
		setRotationAngle(bone50, 0.0F, -2.8972F, 0.48F);
		bone50.setTextureOffset(15, 42).addCuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		bone51 = new ModelPart(this);
		bone51.setPivot(-15.4301F, -20.8993F, -0.3314F);
		bone49.addChild(bone51);
		setRotationAngle(bone51, 0.1309F, 2.8274F, 0.5149F);
		bone51.setTextureOffset(0, 11).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		bone52 = new ModelPart(this);
		bone52.setPivot(-12.2338F, -19.6953F, -3.069F);
		bone49.addChild(bone52);
		setRotationAngle(bone52, 0.1309F, 1.2043F, 0.5149F);
		bone52.setTextureOffset(22, 34).addCuboid(-3.1F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		bone39 = new ModelPart(this);
		bone39.setPivot(8.675F, 23.625F, -0.7F);
		body.addChild(bone39);
		setRotationAngle(bone39, 0.0F, -0.1047F, -0.7679F);
		bone39.setTextureOffset(65, 0).addCuboid(9.725F, -20.825F, 2.6F, 5.0F, 1.0F, 2.0F, 0.0F, true);

		bone40 = new ModelPart(this);
		bone40.setPivot(15.2936F, -20.6847F, 2.0575F);
		bone39.addChild(bone40);
		setRotationAngle(bone40, 0.0F, 2.8972F, -0.48F);
		bone40.setTextureOffset(15, 42).addCuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, true);

		bone41 = new ModelPart(this);
		bone41.setPivot(15.4301F, -20.8993F, -0.3314F);
		bone39.addChild(bone41);
		setRotationAngle(bone41, 0.1309F, -2.8274F, -0.5149F);
		bone41.setTextureOffset(0, 11).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);

		bone42 = new ModelPart(this);
		bone42.setPivot(12.2338F, -19.6953F, -3.069F);
		bone39.addChild(bone42);
		setRotationAngle(bone42, 0.1309F, -1.2043F, -0.5149F);
		bone42.setTextureOffset(22, 34).addCuboid(2.1F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, true);

		bone47 = new ModelPart(this);
		bone47.setPivot(7.85F, -8.8F, 6.7F);
		body.addChild(bone47);
		setRotationAngle(bone47, -3.0128F, 0.3581F, 1.1229F);
		bone47.setTextureOffset(20, 70).addCuboid(3.45F, -12.6F, 1.4F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		bone48 = new ModelPart(this);
		bone48.setPivot(3.4582F, -11.6401F, 2.4486F);
		bone47.addChild(bone48);
		setRotationAngle(bone48, -2.3845F, 0.4454F, 2.8159F);
		bone48.setTextureOffset(0, 0).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		bone43 = new ModelPart(this);
		bone43.setPivot(-7.85F, -8.8F, 6.7F);
		body.addChild(bone43);
		setRotationAngle(bone43, -3.0128F, -0.3581F, -1.1229F);
		bone43.setTextureOffset(20, 70).addCuboid(-6.45F, -12.6F, 1.4F, 3.0F, 1.0F, 2.0F, 0.0F, true);

		bone44 = new ModelPart(this);
		bone44.setPivot(-3.4582F, -11.6401F, 2.4486F);
		bone43.addChild(bone44);
		setRotationAngle(bone44, -2.3845F, -0.4454F, -2.8159F);
		bone44.setTextureOffset(0, 0).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);

		leftarm = new ModelPart(this);
		leftarm.setPivot(5.0F, 2.0F, -0.1F);
		body.addChild(leftarm);
		setRotationAngle(leftarm, 0.3491F, 0.0F, -0.1745F);
		leftarm.setTextureOffset(50, 0).addCuboid(-1.0F, -2.0F, -2.0F, 5.0F, 4.0F, 5.0F, 0.0F, false);

		rightarm = new ModelPart(this);
		rightarm.setPivot(-5.0F, 2.0F, -0.1F);
		body.addChild(rightarm);
		setRotationAngle(rightarm, 0.211F, -0.056F, 0.2559F);
		rightarm.setTextureOffset(0, 24).addCuboid(-4.0F, -2.0F, -2.0F, 5.0F, 4.0F, 5.0F, 0.0F, false);

		leftleg = new ModelPart(this);
		leftleg.setPivot(2.0F, 12.0F, 1.0F);
		body.addChild(leftleg);
		setRotationAngle(leftleg, -0.5587F, -0.195F, -0.2865F);
		leftleg.setTextureOffset(0, 56).addCuboid(-2.0F, 0.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		heart3 = new ModelPart(this);
		heart3.setPivot(-2.0F, 12.0F, -1.0F);
		leftleg.addChild(heart3);
		

		bone26 = new ModelPart(this);
		bone26.setPivot(-0.6F, -12.9F, -2.5F);
		heart3.addChild(bone26);
		setRotationAngle(bone26, 0.0F, 0.0F, 0.6981F);
		bone26.setTextureOffset(71, 17).addCuboid(5.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F, -0.19F, false);

		bone27 = new ModelPart(this);
		bone27.setPivot(0.6F, -12.9F, -2.5F);
		heart3.addChild(bone27);
		setRotationAngle(bone27, 0.0F, 0.0F, -0.6981F);
		bone27.setTextureOffset(53, 71).addCuboid(-4.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F, -0.2F, false);

		legdownl = new ModelPart(this);
		legdownl.setPivot(1.2618F, 5.8899F, 1.1453F);
		leftleg.addChild(legdownl);
		setRotationAngle(legdownl, 0.7418F, 0.0F, 0.0F);
		legdownl.setTextureOffset(0, 42).addCuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, 0.0F, false);

		rightleg = new ModelPart(this);
		rightleg.setPivot(-2.0F, 12.0F, 1.0F);
		body.addChild(rightleg);
		setRotationAngle(rightleg, -0.4972F, 0.1268F, 0.3077F);
		rightleg.setTextureOffset(0, 56).addCuboid(-3.0F, 0.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, true);

		heart4 = new ModelPart(this);
		heart4.setPivot(2.0F, 12.0F, -1.0F);
		rightleg.addChild(heart4);
		

		bone9 = new ModelPart(this);
		bone9.setPivot(0.6F, -12.9F, -2.5F);
		heart4.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, -0.6981F);
		bone9.setTextureOffset(71, 17).addCuboid(-8.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F, -0.19F, true);

		bone28 = new ModelPart(this);
		bone28.setPivot(-0.6F, -12.9F, -2.5F);
		heart4.addChild(bone28);
		setRotationAngle(bone28, 0.0F, 0.0F, 0.6981F);
		bone28.setTextureOffset(53, 71).addCuboid(1.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F, -0.2F, true);

		legdownr = new ModelPart(this);
		legdownr.setPivot(-0.2311F, 7.3716F, -0.1109F);
		rightleg.addChild(legdownr);
		setRotationAngle(legdownr, 0.7418F, -0.1309F, -0.0873F);
		legdownr.setTextureOffset(0, 42).addCuboid(-2.8F, -0.9F, -0.8F, 5.0F, 9.0F, 5.0F, 0.0F, true);

		viewFirst = new ModelPart(this);
		viewFirst.setPivot(0.0F, 3.45F, 0.2F);
		

		left_hands_ro = new ModelPart(this);
		left_hands_ro.setPivot(0.0F, 0.0F, 0.0F);
		viewFirst.addChild(left_hands_ro);
		

		handl1 = new ModelPart(this);
		handl1.setPivot(0.0F, 0.0F, 0.0F);
		left_hands_ro.addChild(handl1);
		setRotationAngle(handl1, -1.5708F, 0.0F, 0.0F);
		handl1.setTextureOffset(43, 43).addCuboid(15.5F, -2.35F, -1.5F, 5.0F, 9.0F, 5.0F, 0.0F, false);

		armmiddle = new ModelPart(this);
		armmiddle.setPivot(0.0F, 0.55F, -0.2F);
		handl1.addChild(armmiddle);
		armmiddle.setTextureOffset(55, 57).addCuboid(15.3F, -3.7F, -1.35F, 5.0F, 1.0F, 5.0F, -0.1F, false);

		heart5 = new ModelPart(this);
		heart5.setPivot(10.7F, -5.6F, -5.0F);
		armmiddle.addChild(heart5);
		setRotationAngle(heart5, 0.0F, -1.5708F, 0.0F);
		

		bone30 = new ModelPart(this);
		bone30.setPivot(-0.6F, -12.9F, -2.5F);
		heart5.addChild(bone30);
		setRotationAngle(bone30, 0.0F, 0.0F, 0.6981F);
		bone30.setTextureOffset(72, 46).addCuboid(13.2893F, 6.8241F, -7.6F, 3.0F, 2.0F, 1.0F, -0.19F, false);

		bone31 = new ModelPart(this);
		bone31.setPivot(0.6F, -12.9F, -2.5F);
		heart5.addChild(bone31);
		setRotationAngle(bone31, 0.0F, 0.0F, -0.6981F);
		bone31.setTextureOffset(72, 27).addCuboid(-6.7903F, 14.7947F, -7.6F, 3.0F, 2.0F, 1.0F, -0.2F, false);

		handl2 = new ModelPart(this);
		handl2.setPivot(0.0F, 0.0F, 0.0F);
		left_hands_ro.addChild(handl2);
		setRotationAngle(handl2, -1.5708F, 0.0F, 0.0F);
		handl2.setTextureOffset(43, 43).addCuboid(11.5F, -7.55F, -9.8F, 5.0F, 9.0F, 5.0F, 0.0F, false);

		armmiddle3 = new ModelPart(this);
		armmiddle3.setPivot(0.0F, 0.55F, -0.2F);
		handl2.addChild(armmiddle3);
		armmiddle3.setTextureOffset(55, 57).addCuboid(11.3F, -8.9F, -9.65F, 5.0F, 1.0F, 5.0F, -0.1F, false);

		heart8 = new ModelPart(this);
		heart8.setPivot(10.7F, -5.6F, -5.0F);
		armmiddle3.addChild(heart8);
		setRotationAngle(heart8, 0.0F, -1.5708F, 0.0F);
		

		bone13 = new ModelPart(this);
		bone13.setPivot(-0.6F, -12.9F, -2.5F);
		heart8.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, 0.6981F);
		bone13.setTextureOffset(72, 46).addCuboid(3.5886F, 8.1758F, -3.6F, 3.0F, 2.0F, 1.0F, -0.19F, false);

		bone14 = new ModelPart(this);
		bone14.setPivot(0.6F, -12.9F, -2.5F);
		heart8.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, -0.6981F);
		bone14.setTextureOffset(72, 27).addCuboid(-9.806F, 5.4761F, -3.6F, 3.0F, 2.0F, 1.0F, -0.2F, false);

		handl3 = new ModelPart(this);
		handl3.setPivot(0.0F, 0.0F, 0.0F);
		left_hands_ro.addChild(handl3);
		setRotationAngle(handl3, -1.5708F, 0.0F, 0.0F);
		handl3.setTextureOffset(43, 43).addCuboid(14.5F, -0.25F, 6.4F, 5.0F, 9.0F, 5.0F, 0.0F, false);

		armmiddle4 = new ModelPart(this);
		armmiddle4.setPivot(0.0F, 0.55F, -0.2F);
		handl3.addChild(armmiddle4);
		armmiddle4.setTextureOffset(55, 57).addCuboid(14.3F, -1.6F, 6.55F, 5.0F, 1.0F, 5.0F, -0.1F, false);

		heart9 = new ModelPart(this);
		heart9.setPivot(10.7F, -5.6F, -5.0F);
		armmiddle4.addChild(heart9);
		setRotationAngle(heart9, 0.0F, -1.5708F, 0.0F);
		

		bone45 = new ModelPart(this);
		bone45.setPivot(-0.6F, -12.9F, -2.5F);
		heart9.addChild(bone45);
		setRotationAngle(bone45, 0.0F, 0.0F, 0.6981F);
		bone45.setTextureOffset(72, 46).addCuboid(20.6909F, 3.3548F, -6.6F, 3.0F, 2.0F, 1.0F, -0.19F, false);

		bone59 = new ModelPart(this);
		bone59.setPivot(0.6F, -12.9F, -2.5F);
		heart9.addChild(bone59);
		setRotationAngle(bone59, 0.0F, 0.0F, -0.6981F);
		bone59.setTextureOffset(72, 27).addCuboid(-2.0884F, 21.4814F, -6.6F, 3.0F, 2.0F, 1.0F, -0.2F, false);

		handl4 = new ModelPart(this);
		handl4.setPivot(0.0F, 0.0F, 0.0F);
		left_hands_ro.addChild(handl4);
		setRotationAngle(handl4, -1.5708F, 0.0F, 0.0F);
		handl4.setTextureOffset(43, 43).addCuboid(18.9F, 3.95F, -10.4F, 5.0F, 9.0F, 5.0F, 0.0F, false);

		armmiddle5 = new ModelPart(this);
		armmiddle5.setPivot(0.0F, 0.55F, -0.2F);
		handl4.addChild(armmiddle5);
		armmiddle5.setTextureOffset(55, 57).addCuboid(18.7F, 2.6F, -10.25F, 5.0F, 1.0F, 5.0F, -0.1F, false);

		heart10 = new ModelPart(this);
		heart10.setPivot(10.7F, -5.6F, -5.0F);
		armmiddle5.addChild(heart10);
		setRotationAngle(heart10, 0.0F, -1.5708F, 0.0F);
		

		bone62 = new ModelPart(this);
		bone62.setPivot(-0.6F, -12.9F, -2.5F);
		heart10.addChild(bone62);
		setRotationAngle(bone62, 0.0F, 0.0F, 0.6981F);
		bone62.setTextureOffset(72, 46).addCuboid(10.5211F, 17.371F, -11.0F, 3.0F, 2.0F, 1.0F, -0.19F, false);

		bone63 = new ModelPart(this);
		bone63.setPivot(0.6F, -12.9F, -2.5F);
		heart10.addChild(bone63);
		setRotationAngle(bone63, 0.0F, 0.0F, -0.6981F);
		bone63.setTextureOffset(72, 27).addCuboid(-17.6577F, 13.9F, -11.0F, 3.0F, 2.0F, 1.0F, -0.2F, false);

		handl5 = new ModelPart(this);
		handl5.setPivot(0.0F, 0.0F, 0.0F);
		left_hands_ro.addChild(handl5);
		setRotationAngle(handl5, -1.5708F, 0.0F, 0.0F);
		handl5.setTextureOffset(43, 43).addCuboid(21.6F, -7.65F, 3.6F, 5.0F, 9.0F, 5.0F, 0.0F, false);

		armmiddle6 = new ModelPart(this);
		armmiddle6.setPivot(0.0F, 0.55F, -0.2F);
		handl5.addChild(armmiddle6);
		armmiddle6.setTextureOffset(55, 57).addCuboid(21.4F, -9.0F, 3.75F, 5.0F, 1.0F, 5.0F, -0.1F, false);

		heart11 = new ModelPart(this);
		heart11.setPivot(10.7F, -5.6F, -5.0F);
		armmiddle6.addChild(heart11);
		setRotationAngle(heart11, 0.0F, -1.5708F, 0.0F);
		

		bone64 = new ModelPart(this);
		bone64.setPivot(-0.6F, -12.9F, -2.5F);
		heart11.addChild(bone64);
		setRotationAngle(bone64, 0.0F, 0.0F, 0.6981F);
		bone64.setTextureOffset(72, 46).addCuboid(13.7893F, -0.5141F, -13.7F, 3.0F, 2.0F, 1.0F, -0.19F, false);

		bone65 = new ModelPart(this);
		bone65.setPivot(0.6F, -12.9F, -2.5F);
		heart11.addChild(bone65);
		setRotationAngle(bone65, 0.0F, 0.0F, -0.6981F);
		bone65.setTextureOffset(72, 27).addCuboid(0.5233F, 14.0129F, -13.7F, 3.0F, 2.0F, 1.0F, -0.2F, false);

		right_hands_ro = new ModelPart(this);
		right_hands_ro.setPivot(0.0F, 0.0F, 0.0F);
		viewFirst.addChild(right_hands_ro);
		

		handr1 = new ModelPart(this);
		handr1.setPivot(0.0F, 0.0F, 0.0F);
		right_hands_ro.addChild(handr1);
		setRotationAngle(handr1, -1.5708F, 0.0F, 0.0F);
		handr1.setTextureOffset(43, 43).addCuboid(-26.6F, -0.95F, -1.5F, 5.0F, 9.0F, 5.0F, 0.0F, true);

		armmiddle7 = new ModelPart(this);
		armmiddle7.setPivot(0.0F, 0.55F, -0.2F);
		handr1.addChild(armmiddle7);
		armmiddle7.setTextureOffset(55, 57).addCuboid(-26.4F, -2.3F, -1.35F, 5.0F, 1.0F, 5.0F, -0.1F, true);

		heart12 = new ModelPart(this);
		heart12.setPivot(-10.7F, -5.6F, -5.0F);
		armmiddle7.addChild(heart12);
		setRotationAngle(heart12, 0.0F, 1.5708F, 0.0F);
		

		bone66 = new ModelPart(this);
		bone66.setPivot(0.6F, -12.9F, -2.5F);
		heart12.addChild(bone66);
		setRotationAngle(bone66, 0.0F, 0.0F, -0.6981F);
		bone66.setTextureOffset(72, 46).addCuboid(-17.1892F, 7.8966F, -13.7F, 3.0F, 2.0F, 1.0F, -0.19F, true);

		bone67 = new ModelPart(this);
		bone67.setPivot(-0.6F, -12.9F, -2.5F);
		heart12.addChild(bone67);
		setRotationAngle(bone67, 0.0F, 0.0F, 0.6981F);
		bone67.setTextureOffset(72, 27).addCuboid(4.6902F, 15.8672F, -13.7F, 3.0F, 2.0F, 1.0F, -0.2F, true);

		handr2 = new ModelPart(this);
		handr2.setPivot(0.0F, 0.0F, 0.0F);
		right_hands_ro.addChild(handr2);
		setRotationAngle(handr2, -1.5708F, 0.0F, 0.0F);
		handr2.setTextureOffset(43, 43).addCuboid(-19.4F, 9.65F, -9.8F, 5.0F, 9.0F, 5.0F, 0.0F, true);

		armmiddle8 = new ModelPart(this);
		armmiddle8.setPivot(0.0F, 0.55F, -0.2F);
		handr2.addChild(armmiddle8);
		armmiddle8.setTextureOffset(55, 57).addCuboid(-19.2F, 8.3F, -9.65F, 5.0F, 1.0F, 5.0F, -0.1F, true);

		heart13 = new ModelPart(this);
		heart13.setPivot(-10.7F, -5.6F, -5.0F);
		armmiddle8.addChild(heart13);
		setRotationAngle(heart13, 0.0F, 1.5708F, 0.0F);
		

		bone68 = new ModelPart(this);
		bone68.setPivot(0.6F, -12.9F, -2.5F);
		heart13.addChild(bone68);
		setRotationAngle(bone68, 0.0F, 0.0F, -0.6981F);
		bone68.setTextureOffset(72, 46).addCuboid(-17.6446F, 21.3518F, -6.5F, 3.0F, 2.0F, 1.0F, -0.19F, true);

		bone69 = new ModelPart(this);
		bone69.setPivot(-0.6F, -12.9F, -2.5F);
		heart13.addChild(bone69);
		setRotationAngle(bone69, 0.0F, 0.0F, 0.6981F);
		bone69.setTextureOffset(72, 27).addCuboid(17.862F, 18.6521F, -6.5F, 3.0F, 2.0F, 1.0F, -0.2F, true);

		handr3 = new ModelPart(this);
		handr3.setPivot(0.0F, 0.0F, 0.0F);
		right_hands_ro.addChild(handr3);
		setRotationAngle(handr3, -1.5708F, 0.0F, 0.0F);
		handr3.setTextureOffset(43, 43).addCuboid(-21.3F, -0.25F, 6.4F, 5.0F, 9.0F, 5.0F, 0.0F, true);

		armmiddle9 = new ModelPart(this);
		armmiddle9.setPivot(0.0F, 0.55F, -0.2F);
		handr3.addChild(armmiddle9);
		armmiddle9.setTextureOffset(55, 57).addCuboid(-21.1F, -1.6F, 6.55F, 5.0F, 1.0F, 5.0F, -0.1F, true);

		heart14 = new ModelPart(this);
		heart14.setPivot(-10.7F, -5.6F, -5.0F);
		armmiddle9.addChild(heart14);
		setRotationAngle(heart14, 0.0F, 1.5708F, 0.0F);
		

		bone70 = new ModelPart(this);
		bone70.setPivot(0.6F, -12.9F, -2.5F);
		heart14.addChild(bone70);
		setRotationAngle(bone70, 0.0F, 0.0F, -0.6981F);
		bone70.setTextureOffset(72, 46).addCuboid(-23.6909F, 3.3548F, -8.4F, 3.0F, 2.0F, 1.0F, -0.19F, true);

		bone71 = new ModelPart(this);
		bone71.setPivot(-0.6F, -12.9F, -2.5F);
		heart14.addChild(bone71);
		setRotationAngle(bone71, 0.0F, 0.0F, 0.6981F);
		bone71.setTextureOffset(72, 27).addCuboid(-0.9116F, 21.4814F, -8.4F, 3.0F, 2.0F, 1.0F, -0.2F, true);

		handr4 = new ModelPart(this);
		handr4.setPivot(0.0F, 0.0F, 0.0F);
		right_hands_ro.addChild(handr4);
		setRotationAngle(handr4, -1.5708F, 0.0F, 0.0F);
		handr4.setTextureOffset(43, 43).addCuboid(-23.9F, -2.95F, -10.4F, 5.0F, 9.0F, 5.0F, 0.0F, true);

		armmiddle10 = new ModelPart(this);
		armmiddle10.setPivot(0.0F, 0.55F, -0.2F);
		handr4.addChild(armmiddle10);
		armmiddle10.setTextureOffset(55, 57).addCuboid(-23.7F, -4.3F, -10.25F, 5.0F, 1.0F, 5.0F, -0.1F, true);

		heart15 = new ModelPart(this);
		heart15.setPivot(-10.7F, -5.6F, -5.0F);
		armmiddle10.addChild(heart15);
		setRotationAngle(heart15, 0.0F, 1.5708F, 0.0F);
		

		bone72 = new ModelPart(this);
		bone72.setPivot(0.6F, -12.9F, -2.5F);
		heart15.addChild(bone72);
		setRotationAngle(bone72, 0.0F, 0.0F, -0.6981F);
		bone72.setTextureOffset(72, 46).addCuboid(-9.0858F, 12.0853F, -11.0F, 3.0F, 2.0F, 1.0F, -0.19F, true);

		bone73 = new ModelPart(this);
		bone73.setPivot(-0.6F, -12.9F, -2.5F);
		heart15.addChild(bone73);
		setRotationAngle(bone73, 0.0F, 0.0F, 0.6981F);
		bone73.setTextureOffset(72, 27).addCuboid(10.2225F, 8.6143F, -11.0F, 3.0F, 2.0F, 1.0F, -0.2F, true);

		handr5 = new ModelPart(this);
		handr5.setPivot(0.0F, 0.0F, 0.0F);
		right_hands_ro.addChild(handr5);
		setRotationAngle(handr5, -1.5708F, 0.0F, 0.0F);
		handr5.setTextureOffset(43, 43).addCuboid(-17.2F, -7.65F, -0.5F, 5.0F, 9.0F, 5.0F, 0.0F, true);

		armmiddle11 = new ModelPart(this);
		armmiddle11.setPivot(0.0F, 0.55F, -0.2F);
		handr5.addChild(armmiddle11);
		armmiddle11.setTextureOffset(55, 57).addCuboid(-17.0F, -9.0F, -0.35F, 5.0F, 1.0F, 5.0F, -0.1F, true);

		heart16 = new ModelPart(this);
		heart16.setPivot(-10.7F, -5.6F, -5.0F);
		armmiddle11.addChild(heart16);
		setRotationAngle(heart16, 0.0F, 1.5708F, 0.0F);
		

		bone74 = new ModelPart(this);
		bone74.setPivot(0.6F, -12.9F, -2.5F);
		heart16.addChild(bone74);
		setRotationAngle(bone74, 0.0F, 0.0F, -0.6981F);
		bone74.setTextureOffset(72, 46).addCuboid(-13.6486F, 2.1213F, -4.3F, 3.0F, 2.0F, 1.0F, -0.19F, true);

		bone75 = new ModelPart(this);
		bone75.setPivot(-0.6F, -12.9F, -2.5F);
		heart16.addChild(bone75);
		setRotationAngle(bone75, 0.0F, 0.0F, 0.6981F);
		bone75.setTextureOffset(72, 27).addCuboid(-0.3825F, 11.3774F, -4.3F, 3.0F, 2.0F, 1.0F, -0.2F, true);
}
@Override
public void setAngles(LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch){
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
@Override
public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){

	matrixStack.translate(0.0D, this.yOffset, -0.75D);
	body.render(matrixStack, buffer, packedLight, packedOverlay);
	head.render(matrixStack, buffer, packedLight, packedOverlay);

	matrixStack.translate(0.0D, -this.yOffset, 0.0D);
	viewFirst.render(matrixStack, buffer, packedLight, packedOverlay);
	matrixStack.translate(0.0D, 0.2D, 0.75D);
}
public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
}
	public final void renderPunchyArms(@NotNull MatrixStack matrices, @NotNull VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
		this.right_hands_ro.render(matrices, vertices, light, overlay, red, green, blue, alpha);
		this.left_hands_ro.render(matrices, vertices, light, overlay, red, green, blue, alpha);
	}

	}