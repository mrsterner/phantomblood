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
	private final ModelPart bone60;
	private final ModelPart bone61;
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
	private final ModelPart leftarmdown;
	private final ModelPart armmiddle;
	private final ModelPart heart5;
	private final ModelPart bone30;
	private final ModelPart bone31;
	private final ModelPart rightarm;
	private final ModelPart rightarmdown;
	private final ModelPart armmiddle2;
	private final ModelPart heart6;
	private final ModelPart bone32;
	private final ModelPart bone33;
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
	private double yOffset;

public CrazyDiamondIdleModel() {
	textureWidth = 128;
	textureHeight = 128;
	head = new ModelPart(this);
	head.setPivot(0.0F, 0.0F, 0.0F);
	setRotationAngle(head, 0.2618F, 0.0F, 0.0F);
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


	bone60 = new ModelPart(this);
	bone60.setPivot(2.1717F, -5.3382F, -2.2F);
	heart7.addChild(bone60);
	setRotationAngle(bone60, 0.0F, 0.0F, 0.7679F);


	bone61 = new ModelPart(this);
	bone61.setPivot(2.9111F, -5.3333F, -2.2F);
	heart7.addChild(bone61);
	setRotationAngle(bone61, 0.0F, 0.0F, -0.7679F);


	body = new ModelPart(this);
	body.setPivot(0.0F, 0.0F, 0.0F);
	setRotationAngle(body, 0.357F, -0.5369F, 0.0666F);
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


	bone30 = new ModelPart(this);
	bone30.setPivot(-0.6F, -12.9F, -2.5F);
	heart5.addChild(bone30);
	setRotationAngle(bone30, 0.0F, 0.0F, 0.6981F);
	bone30.setTextureOffset(72, 46).addCuboid(5.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F, -0.19F, false);

	bone31 = new ModelPart(this);
	bone31.setPivot(0.6F, -12.9F, -2.5F);
	heart5.addChild(bone31);
	setRotationAngle(bone31, 0.0F, 0.0F, -0.6981F);
	bone31.setTextureOffset(72, 27).addCuboid(-4.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F, -0.2F, false);

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


	bone32 = new ModelPart(this);
	bone32.setPivot(0.6F, -12.9F, -2.5F);
	heart6.addChild(bone32);
	setRotationAngle(bone32, 0.0F, 0.0F, -0.6981F);
	bone32.setTextureOffset(12, 72).addCuboid(-8.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F, -0.19F, false);

	bone33 = new ModelPart(this);
	bone33.setPivot(-0.6F, -12.9F, -2.5F);
	heart6.addChild(bone33);
	setRotationAngle(bone33, 0.0F, 0.0F, 0.6981F);
	bone33.setTextureOffset(71, 20).addCuboid(1.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F, -0.2F, false);

	leftleg = new ModelPart(this);
	leftleg.setPivot(2.0F, 12.0F, 1.0F);
	body.addChild(leftleg);
	setRotationAngle(leftleg, -0.2281F, -0.7232F, -0.4617F);
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


	bone9 = new ModelPart(this);
	bone9.setPivot(3.6F, -7.9F, -2.5F);
	heart4.addChild(bone9);
	setRotationAngle(bone9, 0.0F, 0.0F, -0.6981F);
	bone9.setTextureOffset(71, 17).addCuboid(-8.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F, -0.19F, true);

	bone28 = new ModelPart(this);
	bone28.setPivot(2.4F, -7.9F, -2.5F);
	heart4.addChild(bone28);
	setRotationAngle(bone28, 0.0F, 0.0F, 0.6981F);
	bone28.setTextureOffset(53, 71).addCuboid(1.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F, -0.2F, true);

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