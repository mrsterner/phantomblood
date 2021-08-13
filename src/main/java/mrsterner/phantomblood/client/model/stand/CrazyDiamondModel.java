// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

package mrsterner.phantomblood.client.model.stand;

import net.minecraft.client.model.*;
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

	public CrazyDiamondModel(ModelPart root) {
		head    = root.getChild("body");
		Shape1  = root.getChild("body");
		Shape6 = root.getChild("body");
		Shape5  = root.getChild("body");
		Shape2  = root.getChild("body");
		Shape46 = root.getChild("body");
		Shape7  = root.getChild("body");
		Shape8  = root.getChild("body");
		glass   = root.getChild("body");
		Shape3  = root.getChild("body");
		bone    = root.getChild("body");
		Shape15 = root.getChild("body");
		Shape17 = root.getChild("body");
		Shape18 = root.getChild("body");
		Shape16 = root.getChild("body");
		Shape4  = root.getChild("body");
		heart7  = root.getChild("body");
		Shape60 = root.getChild("body");
		Shape61 = root.getChild("body");
		body    = root.getChild("body");
		bodydown= root.getChild("body");
		Shape10 = root.getChild("body");
		Shape19 = root.getChild("body");
		Shape20 = root.getChild("body");
		Shape21 = root.getChild("body");
		Shape22 = root.getChild("body");
		heart   = root.getChild("body");
		Shape11 = root.getChild("body");
		Shape23 = root.getChild("body");
		heart2  = root.getChild("body");
		Shape24 = root.getChild("body");
		Shape25 = root.getChild("body");
		Shape12 = root.getChild("body");
		Shape53 = root.getChild("body");
		Shape54 = root.getChild("body");
		Shape55 = root.getChild("body");
		Shape56 = root.getChild("body");
		Shape57 = root.getChild("body");
		Shape58 = root.getChild("body");
		Shape29 = root.getChild("body");
		Shape34 = root.getChild("body");
		Shape35 = root.getChild("body");
		Shape36 = root.getChild("body");
		Shape37 = root.getChild("body");
		Shape38 = root.getChild("body");
		Shape49 = root.getChild("body");
		Shape50 = root.getChild("body");
		Shape51 = root.getChild("body");
		Shape52 = root.getChild("body");
		Shape39 = root.getChild("body");
		Shape40 = root.getChild("body");
		Shape41 = root.getChild("body");
		Shape42 = root.getChild("body");
		Shape47 = root.getChild("body");
		Shape48 = root.getChild("body");
		Shape43 = root.getChild("body");
		Shape44 = root.getChild("body");
		leftarm = root.getChild("body");
		leftarmdown= root.getChild("body");
		armmiddle= root.getChild("body");
		heart5  = root.getChild("body");
		Shape30 = root.getChild("body");
		Shape31 = root.getChild("body");
		rightarm= root.getChild("body");
		rightarmdown= root.getChild("body");
		armmiddle2= root.getChild("body");
		heart6  = root.getChild("body");
		Shape32 = root.getChild("body");
		Shape33 = root.getChild("body");
		leftleg = root.getChild("body");
		heart3  = root.getChild("body");
		Shape26 = root.getChild("body");
		Shape27 = root.getChild("body");
		legdownl= root.getChild("body");
		rightleg= root.getChild("body");
		heart4  = root.getChild("body");
		Shape9  = root.getChild("body");
		Shape28 = root.getChild("body");
		legdownr= root.getChild("body");
		punch   = root.getChild("body");
		left_hands_ro= root.getChild("body");
		handl1  = root.getChild("body");
		armmiddle3= root.getChild("body");
		heart8  = root.getChild("body");
		Shape13 = root.getChild("body");
		Shape14 = root.getChild("body");
		handl2  = root.getChild("body");
		armmiddle4= root.getChild("body");
		heart9  = root.getChild("body");
		Shape45 = root.getChild("body");
		Shape59 = root.getChild("body");
		handl3  = root.getChild("body");
		armmiddle5= root.getChild("body");
		heart10 = root.getChild("body");
		Shape62 = root.getChild("body");
		Shape63 = root.getChild("body");
		handl4  = root.getChild("body");
		armmiddle6= root.getChild("body");
		heart11 = root.getChild("body");
		Shape64 = root.getChild("body");
		Shape65 = root.getChild("body");
		handl5  = root.getChild("body");
		armmiddle7= root.getChild("body");
		heart12 = root.getChild("body");
		Shape66 = root.getChild("body");
		Shape67 = root.getChild("body");
		right_hands_ro= root.getChild("body");
		handr1  = root.getChild("body");
		armmiddle8= root.getChild("body");
		heart13 = root.getChild("body");
		Shape68 = root.getChild("body");
		Shape69 = root.getChild("body");
		handr2  = root.getChild("body");
		armmiddle9= root.getChild("body");
		heart14 = root.getChild("body");
		Shape70 = root.getChild("body");
		Shape71 = root.getChild("body");
		handr3  = root.getChild("body");
		armmiddle10= root.getChild("body");
		heart15 = root.getChild("body");
		Shape72 = root.getChild("body");
		Shape73 = root.getChild("body");
		handr4  = root.getChild("body");
		armmiddle11= root.getChild("body");
		heart16 = root.getChild("body");
		Shape74 = root.getChild("body");
		Shape75 = root.getChild("body");
		handr5  = root.getChild("body");
		armmiddle12= root.getChild("body");
		heart17 = root.getChild("body");
		Shape76 = root.getChild("body");
		Shape77 = root.getChild("body");
		attackBody= root.getChild("body");
		bodydown2= root.getChild("body");
		Shape78 = root.getChild("body");
		Shape79 = root.getChild("body");
		Shape80 = root.getChild("body");
		Shape81 = root.getChild("body");
		Shape82 = root.getChild("body");
		heart18 = root.getChild("body");
		Shape83 = root.getChild("body");
		Shape84 = root.getChild("body");
		heart19 = root.getChild("body");
		Shape85 = root.getChild("body");
		Shape86 = root.getChild("body");
		Shape87 = root.getChild("body");
		Shape88 = root.getChild("body");
		Shape89 = root.getChild("body");
		Shape90 = root.getChild("body");
		Shape91 = root.getChild("body");
		Shape92 = root.getChild("body");
		Shape93 = root.getChild("body");
		Shape94 = root.getChild("body");
		Shape95 = root.getChild("body");
		Shape96 = root.getChild("body");
		Shape97 = root.getChild("body");
		Shape98 = root.getChild("body");
		Shape99 = root.getChild("body");
		Shape100= root.getChild("body");
		Shape101= root.getChild("body");
		Shape102= root.getChild("body");
		Shape103= root.getChild("body");
		Shape104= root.getChild("body");
		Shape105= root.getChild("body");
		Shape106= root.getChild("body");
		Shape107= root.getChild("body");
		Shape108= root.getChild("body");
		Shape109= root.getChild("body");
		Shape110= root.getChild("body");
		Shape111= root.getChild("body");
		leftarm2= root.getChild("body");
		rightarm2= root.getChild("body");
		leftleg2= root.getChild("body");
		heart20 = root.getChild("body");
		Shape112= root.getChild("body");
		Shape113= root.getChild("body");
		legdownl2= root.getChild("body");
		rightleg2= root.getChild("body");
		heart21 = root.getChild("body");
		Shape114= root.getChild("body");
		Shape115= root.getChild("body");
		legdownr2= root.getChild("body");
		heal    = root.getChild("body");
		left_hands_ro2= root.getChild("body");
		handl6  = root.getChild("body");
		armmiddle13= root.getChild("body");
		heart22 = root.getChild("body");
		Shape116= root.getChild("body");
		Shape117= root.getChild("body");
		handl7  = root.getChild("body");
		armmiddle14= root.getChild("body");
		heart23 = root.getChild("body");
		Shape118= root.getChild("body");
		Shape119= root.getChild("body");
		handl8  = root.getChild("body");
		armmiddle15= root.getChild("body");
		heart24 = root.getChild("body");
		Shape120= root.getChild("body");
		Shape121= root.getChild("body");
		handl9  = root.getChild("body");
		armmiddle16= root.getChild("body");
		heart25 = root.getChild("body");
		Shape122= root.getChild("body");
		Shape123= root.getChild("body");
		handl10 = root.getChild("body");
		armmiddle17= root.getChild("body");
		heart26 = root.getChild("body");
		Shape124= root.getChild("body");
		Shape125= root.getChild("body");
		right_hands_ro2= root.getChild("body");
		handr6  = root.getChild("body");
		armmiddle18= root.getChild("body");
		heart27 = root.getChild("body");
		Shape126= root.getChild("body");
		Shape127= root.getChild("body");
		handr7  = root.getChild("body");
		armmiddle19= root.getChild("body");
		heart28 = root.getChild("body");
		Shape128= root.getChild("body");
		Shape129= root.getChild("body");
		handr8  = root.getChild("body");
		armmiddle20= root.getChild("body");
		heart29 = root.getChild("body");
		Shape130= root.getChild("body");
		Shape131= root.getChild("body");
		handr9  = root.getChild("body");
		armmiddle21= root.getChild("body");
		heart30 = root.getChild("body");
		Shape132= root.getChild("body");
		Shape133= root.getChild("body");
		handr10 = root.getChild("body");
		armmiddle22= root.getChild("body");
		heart31 = root.getChild("body");
		Shape134= root.getChild("body");
		Shape135= root.getChild("body");
	}



	public static TexturedModelData getTexturedModelData() {
		ModelData data = new ModelData();
		ModelPartData root = data.getRoot();
		ModelPartData attackBody = root.addChild("attackBody",
				ModelPartBuilder.create()
						.uv(0, 11).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 6.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		attackBody.addChild("bodydown2",
				ModelPartBuilder.create()
						.uv(44, 29).cuboid(-3.5F, 7.0F, -1.6F, 7.0F, 4.0F, 5.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));
		attackBody.addChild("Shape78",
				ModelPartBuilder.create()
						.uv(25, 0).cuboid(-3.5F, 0.2F, -2.9F, 7.0F, 4.0F, 1.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));
		attackBody.addChild("Shape79",
				ModelPartBuilder.create()
						.uv(63, 53).cuboid(-3.0F, 0.2F, -3.9F, 6.0F, 1.0F, 2.0F),
				ModelTransform.of(0.0F, 0.0F, 6.6F, 0.0F, 0.0F, 0.0F));
		attackBody.addChild("Shape80",
				ModelPartBuilder.create()
						.uv(64, 63).cuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F),
				ModelTransform.of(0.0F, 5.0F, 6.6F, 0.0F, 0.0F, 0.0F));
		attackBody.addChild("Shape81",
				ModelPartBuilder.create()
						.uv(41, 0).cuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F),
				ModelTransform.of(-1.691F, 3.0301F, 6.5F, 0.0F, 0.0F, 1.1345F));
		attackBody.addChild("Shape82",
				ModelPartBuilder.create()
						.uv(28, 17).cuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F),
				ModelTransform.of(1.691F, 3.0301F, 6.5F, 0.0F, 0.0F, -1.1345F));
		ModelPartData heart18 = attackBody.addChild("heart18",
				ModelPartBuilder.create(),
				ModelTransform.of(-0.6F, 6.1F, -2.0F, 0.0F, 0.0F, 0.0F));
		heart18.addChild("Shape83",
				ModelPartBuilder.create()
						.uv(0, 74).cuboid(-1.3468F, -1.1286F, -0.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.01F, 0.01F, 0.01F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6981F));
		heart18.addChild("Shape84",
				ModelPartBuilder.create()
						.uv(20, 73).cuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F),
				ModelTransform.of(1.2F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6981F));
		ModelPartData heart19 = attackBody.addChild("heart19",
				ModelPartBuilder.create(),
				ModelTransform.of(-0.6F, 9.9F, -2.3F, 0.0F, 0.0F, 0.0F));
		heart19.addChild("Shape85",
				ModelPartBuilder.create()
						.uv(12, 68).cuboid(-1.3468F, -1.1286F, -0.5F, 3.0F, 2.0F, 2.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6981F));
		heart19.addChild("Shape86",
				ModelPartBuilder.create()
						.uv(15, 24).cuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(1.2F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6981F));
		attackBody.addChild("Shape87",
				ModelPartBuilder.create()
						.uv(0, 34).cuboid(-4.0F, 10.0F, -2.4F, 8.0F, 2.0F, 6.0F),
				ModelTransform.of(0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F));
		ModelPartData Shape88 = attackBody.addChild("Shape88",
				ModelPartBuilder.create()
						.uv(69, 7).cuboid(-4.75F, -18.3333F, 3.25F, 5.0F, 1.0F, 2.0F),
				ModelTransform.of(-6.55F, 20.2333F, 0.45F, 0.0F, 0.3316F, 0.2443F));
		Shape88.addChild("Shape89",
				ModelPartBuilder.create()
						.uv(0, 33).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F),
				ModelTransform.of(-4.6377F, -18.199F, 3.453F, 0.5236F, -2.8623F, 0.0785F));
		Shape88.addChild("Shape90",
				ModelPartBuilder.create()
						.uv(27, 70).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(-4.8679F, -19.0863F, 2.2888F, 0.5236F, -2.2864F, 0.0785F));
		Shape88.addChild("Shape91",
				ModelPartBuilder.create()
						.uv(48, 63).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(-5.9496F, -20.8982F, 0.1061F, 0.5236F, 2.7314F, 0.0785F));
		Shape88.addChild("Shape92",
				ModelPartBuilder.create()
						.uv(15, 57).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(-4.9121F, -20.9909F, -1.8343F, -0.5236F, 2.1031F, 0.0785F));
		Shape88.addChild("Shape93",
				ModelPartBuilder.create()
						.uv(35, 48).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(-3.2972F, -19.3926F, -2.1498F, -0.5236F, 1.1781F, 0.0785F));
		ModelPartData Shape94 = attackBody.addChild("Shape94",
				ModelPartBuilder.create()
						.uv(69, 7).mirrored(true).cuboid(-0.25F, -18.3333F, 3.25F, 5.0F, 1.0F, 2.0F),
				ModelTransform.of(6.55F, 20.2333F, 0.45F, 0.0F, -0.3316F, -0.2443F));
		Shape94.addChild("Shape95",
				ModelPartBuilder.create()
						.uv(0, 33).mirrored(true).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F),
				ModelTransform.of(4.6377F, -18.199F, 3.453F, 0.5236F, 2.8623F, -0.0785F));
		Shape94.addChild("Shape96",
				ModelPartBuilder.create()
						.uv(27, 70).mirrored(true).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(4.8679F, -19.0863F, 2.2888F, 0.5236F, 2.2864F, -0.0785F));
		Shape94.addChild("Shape97",
				ModelPartBuilder.create()
						.uv(48, 63).mirrored(true).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(5.9496F, -20.8982F, 0.1061F, 0.5236F, -2.7314F, -0.0785F));
		Shape94.addChild("Shape98",
				ModelPartBuilder.create()
						.uv(15, 57).mirrored(true).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(4.9121F, -20.9909F, -1.8343F, -0.5236F, -2.1031F, -0.0785F));
		Shape94.addChild("Shape99",
				ModelPartBuilder.create()
						.uv(35, 48).mirrored(true).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(3.2972F, -19.3926F, -2.1498F, -0.5236F, -1.1781F, -0.0785F));
		ModelPartData Shape100 = attackBody.addChild("Shape100",
				ModelPartBuilder.create()
						.uv(65, 0).cuboid(-14.725F, -20.825F, 2.6F, 5.0F, 1.0F, 2.0F),
				ModelTransform.of(-8.675F, 23.625F, -0.7F, 0.0F, 0.1047F, 0.7679F));
		Shape100.addChild("Shape101",
				ModelPartBuilder.create()
						.uv(15, 42).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F),
				ModelTransform.of(-15.2936F, -20.6847F, 2.0575F, 0.0F, -2.8972F, 0.48F));
		Shape100.addChild("Shape102",
				ModelPartBuilder.create()
						.uv(0, 11).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F),
				ModelTransform.of(-15.4301F, -20.8993F, -0.3314F, 0.1309F, 2.8274F, 0.5149F));
		Shape100.addChild("Shape103",
				ModelPartBuilder.create()
						.uv(22, 34).cuboid(-3.1F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F),
				ModelTransform.of(-12.2338F, -19.6953F, -3.069F, 0.1309F, 1.2043F, 0.5149F));
		ModelPartData Shape104 = attackBody.addChild("Shape104",
				ModelPartBuilder.create()
						.uv(65, 0).mirrored(true).cuboid(9.725F, -20.825F, 2.6F, 5.0F, 1.0F, 2.0F),
				ModelTransform.of(8.675F, 23.625F, -0.7F, 0.0F, -0.1047F, -0.7679F));
		Shape104.addChild("Shape105",
				ModelPartBuilder.create()
						.uv(15, 42).mirrored(true).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F),
				ModelTransform.of(15.2936F, -20.6847F, 2.0575F, 0.0F, 2.8972F, -0.48F));
		Shape104.addChild("Shape106",
				ModelPartBuilder.create()
						.uv(0, 11).mirrored(true).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F),
				ModelTransform.of(15.4301F, -20.8993F, -0.3314F, 0.1309F, -2.8274F, -0.5149F));
		Shape104.addChild("Shape107",
				ModelPartBuilder.create()
						.uv(22, 34).mirrored(true).cuboid(2.1F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F),
				ModelTransform.of(12.2338F, -19.6953F, -3.069F, 0.1309F, -1.2043F, -0.5149F));
		ModelPartData Shape108 = attackBody.addChild("Shape108",
				ModelPartBuilder.create()
						.uv(20, 70).cuboid(3.45F, -12.6F, 1.4F, 3.0F, 1.0F, 2.0F),
				ModelTransform.of(7.85F, -8.8F, 6.7F, -3.0128F, 0.3581F, 1.1229F));
		Shape108.addChild("Shape109",
				ModelPartBuilder.create()
						.cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F),
				ModelTransform.of(3.4582F, -11.6401F, 2.4486F, -2.3845F, 0.4454F, 2.8159F));
		ModelPartData Shape110 = attackBody.addChild("Shape110",
				ModelPartBuilder.create()
						.uv(20, 70).mirrored(true).cuboid(-6.45F, -12.6F, 1.4F, 3.0F, 1.0F, 2.0F),
				ModelTransform.of(-7.85F, -8.8F, 6.7F, -3.0128F, -0.3581F, -1.1229F));
		Shape110.addChild("Shape111",
				ModelPartBuilder.create()
						.mirrored(true).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F),
				ModelTransform.of(-3.4582F, -11.6401F, 2.4486F, -2.3845F, -0.4454F, -2.8159F));
		attackBody.addChild("leftarm2",
				ModelPartBuilder.create()
						.uv(50, 0).cuboid(-1.0F, -2.0F, -2.0F, 5.0F, 4.0F, 5.0F),
				ModelTransform.of(5.0F, 2.0F, -0.1F, 0.3491F, 0.0F, -0.1745F));
		attackBody.addChild("rightarm2",
				ModelPartBuilder.create()
						.uv(0, 24).cuboid(-4.0F, -2.0F, -2.0F, 5.0F, 4.0F, 5.0F),
				ModelTransform.of(-5.0F, 2.0F, -0.1F, 0.211F, -0.056F, 0.2559F));
		ModelPartData leftleg2 = attackBody.addChild("leftleg2",
				ModelPartBuilder.create()
						.uv(0, 56).cuboid(-2.0F, 0.0F, -3.0F, 5.0F, 7.0F, 5.0F),
				ModelTransform.of(2.0F, 12.0F, 1.0F, -0.5587F, -0.195F, -0.2865F));
		ModelPartData heart20 = leftleg2.addChild("heart20",
				ModelPartBuilder.create(),
				ModelTransform.of(-2.0F, 12.0F, -1.0F, 0.0F, 0.0F, 0.0F));
		heart20.addChild("Shape112",
				ModelPartBuilder.create()
						.uv(71, 17).cuboid(5.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart20.addChild("Shape113",
				ModelPartBuilder.create()
						.uv(53, 71).cuboid(-4.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		leftleg2.addChild("legdownl2",
				ModelPartBuilder.create()
						.uv(0, 42).cuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F),
				ModelTransform.of(1.2618F, 5.8899F, 1.1453F, 0.7418F, 0.0F, 0.0F));
		ModelPartData rightleg2 = attackBody.addChild("rightleg2",
				ModelPartBuilder.create()
						.uv(0, 56).mirrored(true).cuboid(-3.0F, 0.0F, -3.0F, 5.0F, 7.0F, 5.0F),
				ModelTransform.of(-2.0F, 12.0F, 1.0F, -0.4972F, 0.1268F, 0.3077F));
		ModelPartData heart21 = rightleg2.addChild("heart21",
				ModelPartBuilder.create(),
				ModelTransform.of(2.0F, 12.0F, -1.0F, 0.0F, 0.0F, 0.0F));
		heart21.addChild("Shape114",
				ModelPartBuilder.create()
						.uv(71, 17).mirrored(true).cuboid(-8.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart21.addChild("Shape115",
				ModelPartBuilder.create()
						.uv(53, 71).mirrored(true).cuboid(1.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		rightleg2.addChild("legdownr2",
				ModelPartBuilder.create()
						.uv(0, 42).mirrored(true).cuboid(-2.8F, -0.9F, -0.8F, 5.0F, 9.0F, 5.0F),
				ModelTransform.of(-0.2311F, 7.3716F, -0.1109F, 0.7418F, -0.1309F, -0.0873F));
		ModelPartData punch = root.addChild("punch",
				ModelPartBuilder.create(),
				ModelTransform.of(0.0F, 3.45F, 0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData left_hands_ro = punch.addChild("left_hands_ro",
				ModelPartBuilder.create(),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));
		ModelPartData handl1 = left_hands_ro.addChild("handl1",
				ModelPartBuilder.create()
						.uv(43, 43).cuboid(15.5F, -2.35F, -1.5F, 5.0F, 9.0F, 5.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle3 = handl1.addChild("armmiddle3",
				ModelPartBuilder.create()
						.uv(55, 57).cuboid(15.3F, -3.7F, -1.35F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart8 = armmiddle3.addChild("heart8",
				ModelPartBuilder.create(),
				ModelTransform.of(10.7F, -5.6F, -5.0F, 0.0F, -1.5708F, 0.0F));
		heart8.addChild("Shape13",
				ModelPartBuilder.create()
						.uv(72, 46).cuboid(13.2893F, 6.8241F, -7.6F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart8.addChild("Shape14",
				ModelPartBuilder.create()
						.uv(72, 27).cuboid(-6.7903F, 14.7947F, -7.6F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		ModelPartData handl2 = left_hands_ro.addChild("handl2",
				ModelPartBuilder.create()
						.uv(43, 43).cuboid(11.5F, -7.55F, -9.8F, 5.0F, 9.0F, 5.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle4 = handl2.addChild("armmiddle4",
				ModelPartBuilder.create()
						.uv(55, 57).cuboid(11.3F, -8.9F, -9.65F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart9 = armmiddle4.addChild("heart9",
				ModelPartBuilder.create(),
				ModelTransform.of(10.7F, -5.6F, -5.0F, 0.0F, -1.5708F, 0.0F));
		heart9.addChild("Shape45",
				ModelPartBuilder.create()
						.uv(72, 46).cuboid(3.5886F, 8.1758F, -3.6F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart9.addChild("Shape59",
				ModelPartBuilder.create()
						.uv(72, 27).cuboid(-9.806F, 5.4761F, -3.6F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		ModelPartData handl3 = left_hands_ro.addChild("handl3",
				ModelPartBuilder.create()
						.uv(43, 43).cuboid(14.5F, -0.25F, 6.4F, 5.0F, 9.0F, 5.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle5 = handl3.addChild("armmiddle5",
				ModelPartBuilder.create()
						.uv(55, 57).cuboid(14.3F, -1.6F, 6.55F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart10 = armmiddle5.addChild("heart10",
				ModelPartBuilder.create(),
				ModelTransform.of(10.7F, -5.6F, -5.0F, 0.0F, -1.5708F, 0.0F));
		heart10.addChild("Shape62",
				ModelPartBuilder.create()
						.uv(72, 46).cuboid(20.6909F, 3.3548F, -6.6F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart10.addChild("Shape63",
				ModelPartBuilder.create()
						.uv(72, 27).cuboid(-2.0884F, 21.4814F, -6.6F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		ModelPartData handl4 = left_hands_ro.addChild("handl4",
				ModelPartBuilder.create()
						.uv(43, 43).cuboid(18.9F, 3.95F, -10.4F, 5.0F, 9.0F, 5.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle6 = handl4.addChild("armmiddle6",
				ModelPartBuilder.create()
						.uv(55, 57).cuboid(18.7F, 2.6F, -10.25F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart11 = armmiddle6.addChild("heart11",
				ModelPartBuilder.create(),
				ModelTransform.of(10.7F, -5.6F, -5.0F, 0.0F, -1.5708F, 0.0F));
		heart11.addChild("Shape64",
				ModelPartBuilder.create()
						.uv(72, 46).cuboid(10.5211F, 17.371F, -11.0F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart11.addChild("Shape65",
				ModelPartBuilder.create()
						.uv(72, 27).cuboid(-17.6577F, 13.9F, -11.0F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		ModelPartData handl5 = left_hands_ro.addChild("handl5",
				ModelPartBuilder.create()
						.uv(43, 43).cuboid(21.6F, -7.65F, 3.6F, 5.0F, 9.0F, 5.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle7 = handl5.addChild("armmiddle7",
				ModelPartBuilder.create()
						.uv(55, 57).cuboid(21.4F, -9.0F, 3.75F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart12 = armmiddle7.addChild("heart12",
				ModelPartBuilder.create(),
				ModelTransform.of(10.7F, -5.6F, -5.0F, 0.0F, -1.5708F, 0.0F));
		heart12.addChild("Shape66",
				ModelPartBuilder.create()
						.uv(72, 46).cuboid(13.7893F, -0.5141F, -13.7F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart12.addChild("Shape67",
				ModelPartBuilder.create()
						.uv(72, 27).cuboid(0.5233F, 14.0129F, -13.7F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		ModelPartData right_hands_ro = punch.addChild("right_hands_ro",
				ModelPartBuilder.create(),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));
		ModelPartData handr1 = right_hands_ro.addChild("handr1",
				ModelPartBuilder.create()
						.uv(43, 43).mirrored(true).cuboid(-26.6F, -0.95F, -1.5F, 5.0F, 9.0F, 5.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle8 = handr1.addChild("armmiddle8",
				ModelPartBuilder.create()
						.uv(55, 57).mirrored(true).cuboid(-26.4F, -2.3F, -1.35F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart13 = armmiddle8.addChild("heart13",
				ModelPartBuilder.create(),
				ModelTransform.of(-10.7F, -5.6F, -5.0F, 0.0F, 1.5708F, 0.0F));
		heart13.addChild("Shape68",
				ModelPartBuilder.create()
						.uv(72, 46).mirrored(true).cuboid(-17.1892F, 7.8966F, -13.7F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart13.addChild("Shape69",
				ModelPartBuilder.create()
						.uv(72, 27).mirrored(true).cuboid(4.6902F, 15.8672F, -13.7F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		ModelPartData handr2 = right_hands_ro.addChild("handr2",
				ModelPartBuilder.create()
						.uv(43, 43).mirrored(true).cuboid(-19.4F, 9.65F, -9.8F, 5.0F, 9.0F, 5.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle9 = handr2.addChild("armmiddle9",
				ModelPartBuilder.create()
						.uv(55, 57).mirrored(true).cuboid(-19.2F, 8.3F, -9.65F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart14 = armmiddle9.addChild("heart14",
				ModelPartBuilder.create(),
				ModelTransform.of(-10.7F, -5.6F, -5.0F, 0.0F, 1.5708F, 0.0F));
		heart14.addChild("Shape70",
				ModelPartBuilder.create()
						.uv(72, 46).mirrored(true).cuboid(-17.6446F, 21.3518F, -6.5F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart14.addChild("Shape71",
				ModelPartBuilder.create()
						.uv(72, 27).mirrored(true).cuboid(17.862F, 18.6521F, -6.5F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		ModelPartData handr3 = right_hands_ro.addChild("handr3",
				ModelPartBuilder.create()
						.uv(43, 43).mirrored(true).cuboid(-21.3F, -0.25F, 6.4F, 5.0F, 9.0F, 5.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle10 = handr3.addChild("armmiddle10",
				ModelPartBuilder.create()
						.uv(55, 57).mirrored(true).cuboid(-21.1F, -1.6F, 6.55F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart15 = armmiddle10.addChild("heart15",
				ModelPartBuilder.create(),
				ModelTransform.of(-10.7F, -5.6F, -5.0F, 0.0F, 1.5708F, 0.0F));
		heart15.addChild("Shape72",
				ModelPartBuilder.create()
						.uv(72, 46).mirrored(true).cuboid(-23.6909F, 3.3548F, -8.4F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart15.addChild("Shape73",
				ModelPartBuilder.create()
						.uv(72, 27).mirrored(true).cuboid(-0.9116F, 21.4814F, -8.4F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		ModelPartData handr4 = right_hands_ro.addChild("handr4",
				ModelPartBuilder.create()
						.uv(43, 43).mirrored(true).cuboid(-23.9F, -2.95F, -10.4F, 5.0F, 9.0F, 5.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle11 = handr4.addChild("armmiddle11",
				ModelPartBuilder.create()
						.uv(55, 57).mirrored(true).cuboid(-23.7F, -4.3F, -10.25F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart16 = armmiddle11.addChild("heart16",
				ModelPartBuilder.create(),
				ModelTransform.of(-10.7F, -5.6F, -5.0F, 0.0F, 1.5708F, 0.0F));
		heart16.addChild("Shape74",
				ModelPartBuilder.create()
						.uv(72, 46).mirrored(true).cuboid(-9.0858F, 12.0853F, -11.0F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart16.addChild("Shape75",
				ModelPartBuilder.create()
						.uv(72, 27).mirrored(true).cuboid(10.2225F, 8.6143F, -11.0F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		ModelPartData handr5 = right_hands_ro.addChild("handr5",
				ModelPartBuilder.create()
						.uv(43, 43).mirrored(true).cuboid(-17.2F, -7.65F, -0.5F, 5.0F, 9.0F, 5.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle12 = handr5.addChild("armmiddle12",
				ModelPartBuilder.create()
						.uv(55, 57).mirrored(true).cuboid(-17.0F, -9.0F, -0.35F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart17 = armmiddle12.addChild("heart17",
				ModelPartBuilder.create(),
				ModelTransform.of(-10.7F, -5.6F, -5.0F, 0.0F, 1.5708F, 0.0F));
		heart17.addChild("Shape76",
				ModelPartBuilder.create()
						.uv(72, 46).mirrored(true).cuboid(-13.6486F, 2.1213F, -4.3F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart17.addChild("Shape77",
				ModelPartBuilder.create()
						.uv(72, 27).mirrored(true).cuboid(-0.3825F, 11.3774F, -4.3F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		ModelPartData body = root.addChild("body",
				ModelPartBuilder.create()
						.uv(0, 11).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 6.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.357F, -0.5369F, 0.0666F));
		body.addChild("bodydown",
				ModelPartBuilder.create()
						.uv(44, 29).cuboid(-3.5F, 7.0F, -1.6F, 7.0F, 4.0F, 5.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));
		body.addChild("Shape10",
				ModelPartBuilder.create()
						.uv(25, 0).cuboid(-3.5F, 0.2F, -2.9F, 7.0F, 4.0F, 1.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));
		body.addChild("Shape19",
				ModelPartBuilder.create()
						.uv(63, 53).cuboid(-3.0F, 0.2F, -3.9F, 6.0F, 1.0F, 2.0F),
				ModelTransform.of(0.0F, 0.0F, 6.6F, 0.0F, 0.0F, 0.0F));
		body.addChild("Shape20",
				ModelPartBuilder.create()
						.uv(64, 63).cuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F),
				ModelTransform.of(0.0F, 5.0F, 6.6F, 0.0F, 0.0F, 0.0F));
		body.addChild("Shape21",
				ModelPartBuilder.create()
						.uv(41, 0).cuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F),
				ModelTransform.of(-1.691F, 3.0301F, 6.5F, 0.0F, 0.0F, 1.1345F));
		body.addChild("Shape22",
				ModelPartBuilder.create()
						.uv(28, 17).cuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F),
				ModelTransform.of(1.691F, 3.0301F, 6.5F, 0.0F, 0.0F, -1.1345F));
		ModelPartData heart = body.addChild("heart",
				ModelPartBuilder.create(),
				ModelTransform.of(-0.6F, 6.1F, -2.0F, 0.0F, 0.0F, 0.0F));
		heart.addChild("Shape11",
				ModelPartBuilder.create()
						.uv(0, 74).cuboid(-1.3468F, -1.1286F, -0.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.01F, 0.01F, 0.01F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6981F));
		heart.addChild("Shape23",
				ModelPartBuilder.create()
						.uv(20, 73).cuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F),
				ModelTransform.of(1.2F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6981F));
		ModelPartData heart2 = body.addChild("heart2",
				ModelPartBuilder.create(),
				ModelTransform.of(-0.6F, 9.9F, -2.3F, 0.0F, 0.0F, 0.0F));
		heart2.addChild("Shape24",
				ModelPartBuilder.create()
						.uv(12, 68).cuboid(-1.3468F, -1.1286F, -0.5F, 3.0F, 2.0F, 2.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6981F));
		heart2.addChild("Shape25",
				ModelPartBuilder.create()
						.uv(15, 24).cuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(1.2F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6981F));
		body.addChild("Shape12",
				ModelPartBuilder.create()
						.uv(0, 34).cuboid(-4.0F, 10.0F, -2.4F, 8.0F, 2.0F, 6.0F),
				ModelTransform.of(0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F));
		ModelPartData Shape53 = body.addChild("Shape53",
				ModelPartBuilder.create()
						.uv(69, 7).cuboid(-4.75F, -18.3333F, 3.25F, 5.0F, 1.0F, 2.0F),
				ModelTransform.of(-6.55F, 20.2333F, 0.45F, 0.0F, 0.3316F, 0.2443F));
		Shape53.addChild("Shape54",
				ModelPartBuilder.create()
						.uv(0, 33).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F),
				ModelTransform.of(-4.6377F, -18.199F, 3.453F, 0.5236F, -2.8623F, 0.0785F));
		Shape53.addChild("Shape55",
				ModelPartBuilder.create()
						.uv(27, 70).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(-4.8679F, -19.0863F, 2.2888F, 0.5236F, -2.2864F, 0.0785F));
		Shape53.addChild("Shape56",
				ModelPartBuilder.create()
						.uv(48, 63).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(-5.9496F, -20.8982F, 0.1061F, 0.5236F, 2.7314F, 0.0785F));
		Shape53.addChild("Shape57",
				ModelPartBuilder.create()
						.uv(15, 57).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(-4.9121F, -20.9909F, -1.8343F, -0.5236F, 2.1031F, 0.0785F));
		Shape53.addChild("Shape58",
				ModelPartBuilder.create()
						.uv(35, 48).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(-3.2972F, -19.3926F, -2.1498F, -0.5236F, 1.1781F, 0.0785F));
		ModelPartData Shape29 = body.addChild("Shape29",
				ModelPartBuilder.create()
						.uv(69, 7).mirrored(true).cuboid(-0.25F, -18.3333F, 3.25F, 5.0F, 1.0F, 2.0F),
				ModelTransform.of(6.55F, 20.2333F, 0.45F, 0.0F, -0.3316F, -0.2443F));
		Shape29.addChild("Shape34",
				ModelPartBuilder.create()
						.uv(0, 33).mirrored(true).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F),
				ModelTransform.of(4.6377F, -18.199F, 3.453F, 0.5236F, 2.8623F, -0.0785F));
		Shape29.addChild("Shape35",
				ModelPartBuilder.create()
						.uv(27, 70).mirrored(true).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(4.8679F, -19.0863F, 2.2888F, 0.5236F, 2.2864F, -0.0785F));
		Shape29.addChild("Shape36",
				ModelPartBuilder.create()
						.uv(48, 63).mirrored(true).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(5.9496F, -20.8982F, 0.1061F, 0.5236F, -2.7314F, -0.0785F));
		Shape29.addChild("Shape37",
				ModelPartBuilder.create()
						.uv(15, 57).mirrored(true).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(4.9121F, -20.9909F, -1.8343F, -0.5236F, -2.1031F, -0.0785F));
		Shape29.addChild("Shape38",
				ModelPartBuilder.create()
						.uv(35, 48).mirrored(true).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(3.2972F, -19.3926F, -2.1498F, -0.5236F, -1.1781F, -0.0785F));
		ModelPartData Shape49 = body.addChild("Shape49",
				ModelPartBuilder.create()
						.uv(65, 0).cuboid(-14.725F, -20.825F, 2.6F, 5.0F, 1.0F, 2.0F),
				ModelTransform.of(-8.675F, 23.625F, -0.7F, 0.0F, 0.1047F, 0.7679F));
		Shape49.addChild("Shape50",
				ModelPartBuilder.create()
						.uv(15, 42).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F),
				ModelTransform.of(-15.2936F, -20.6847F, 2.0575F, 0.0F, -2.8972F, 0.48F));
		Shape49.addChild("Shape51",
				ModelPartBuilder.create()
						.uv(0, 11).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F),
				ModelTransform.of(-15.4301F, -20.8993F, -0.3314F, 0.1309F, 2.8274F, 0.5149F));
		Shape49.addChild("Shape52",
				ModelPartBuilder.create()
						.uv(22, 34).cuboid(-3.1F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F),
				ModelTransform.of(-12.2338F, -19.6953F, -3.069F, 0.1309F, 1.2043F, 0.5149F));
		ModelPartData Shape39 = body.addChild("Shape39",
				ModelPartBuilder.create()
						.uv(65, 0).mirrored(true).cuboid(9.725F, -20.825F, 2.6F, 5.0F, 1.0F, 2.0F),
				ModelTransform.of(8.675F, 23.625F, -0.7F, 0.0F, -0.1047F, -0.7679F));
		Shape39.addChild("Shape40",
				ModelPartBuilder.create()
						.uv(15, 42).mirrored(true).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F),
				ModelTransform.of(15.2936F, -20.6847F, 2.0575F, 0.0F, 2.8972F, -0.48F));
		Shape39.addChild("Shape41",
				ModelPartBuilder.create()
						.uv(0, 11).mirrored(true).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F),
				ModelTransform.of(15.4301F, -20.8993F, -0.3314F, 0.1309F, -2.8274F, -0.5149F));
		Shape39.addChild("Shape42",
				ModelPartBuilder.create()
						.uv(22, 34).mirrored(true).cuboid(2.1F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F),
				ModelTransform.of(12.2338F, -19.6953F, -3.069F, 0.1309F, -1.2043F, -0.5149F));
		ModelPartData Shape47 = body.addChild("Shape47",
				ModelPartBuilder.create()
						.uv(20, 70).cuboid(3.45F, -12.6F, 1.4F, 3.0F, 1.0F, 2.0F),
				ModelTransform.of(7.85F, -8.8F, 6.7F, -3.0128F, 0.3581F, 1.1229F));
		Shape47.addChild("Shape48",
				ModelPartBuilder.create()
						.cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F),
				ModelTransform.of(3.4582F, -11.6401F, 2.4486F, -2.3845F, 0.4454F, 2.8159F));
		ModelPartData Shape43 = body.addChild("Shape43",
				ModelPartBuilder.create()
						.uv(20, 70).mirrored(true).cuboid(-6.45F, -12.6F, 1.4F, 3.0F, 1.0F, 2.0F),
				ModelTransform.of(-7.85F, -8.8F, 6.7F, -3.0128F, -0.3581F, -1.1229F));
		Shape43.addChild("Shape44",
				ModelPartBuilder.create()
						.mirrored(true).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F),
				ModelTransform.of(-3.4582F, -11.6401F, 2.4486F, -2.3845F, -0.4454F, -2.8159F));
		ModelPartData leftarm = body.addChild("leftarm",
				ModelPartBuilder.create()
						.uv(50, 0).cuboid(-1.0F, -2.0F, -2.0F, 5.0F, 4.0F, 5.0F)
						.uv(52, 63).cuboid(-0.8F, 1.8F, -1.55F, 4.0F, 4.0F, 4.0F),
				ModelTransform.of(5.0F, 2.0F, -0.1F, 0.3994F, -0.0128F, -0.6976F));
		ModelPartData leftarmdown = leftarm.addChild("leftarmdown",
				ModelPartBuilder.create()
						.uv(43, 43).cuboid(-1.0F, 0.0F, -2.0F, 5.0F, 9.0F, 5.0F),
				ModelTransform.of(-0.3879F, 5.8169F, 0.2415F, -1.9469F, -0.0513F, 0.5751F));
		ModelPartData armmiddle = leftarmdown.addChild("armmiddle",
				ModelPartBuilder.create()
						.uv(55, 57).cuboid(3.8F, -17.2F, -2.05F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(-5.0F, 16.4F, 0.0F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart5 = armmiddle.addChild("heart5",
				ModelPartBuilder.create(),
				ModelTransform.of(6.6F, -11.0F, -1.9F, 0.0F, -1.5708F, 0.0F));
		heart5.addChild("Shape30",
				ModelPartBuilder.create()
						.uv(72, 46).cuboid(5.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart5.addChild("Shape31",
				ModelPartBuilder.create()
						.uv(72, 27).cuboid(-4.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		ModelPartData rightarm = body.addChild("rightarm",
				ModelPartBuilder.create()
						.uv(0, 24).cuboid(-4.0F, -2.0F, -2.0F, 5.0F, 4.0F, 5.0F)
						.uv(36, 63).cuboid(-3.2F, 1.8F, -1.55F, 4.0F, 4.0F, 4.0F),
				ModelTransform.of(-5.0F, 2.0F, -0.1F, 0.3054F, 0.0F, 0.3054F));
		ModelPartData rightarmdown = rightarm.addChild("rightarmdown",
				ModelPartBuilder.create()
						.uv(42, 14).cuboid(-4.0F, 1.0F, -2.0F, 5.0F, 9.0F, 5.0F),
				ModelTransform.of(-0.5615F, 4.6989F, -0.187F, -1.9433F, 0.2394F, -0.5035F));
		ModelPartData armmiddle2 = rightarmdown.addChild("armmiddle2",
				ModelPartBuilder.create()
						.uv(35, 57).cuboid(-8.8F, -17.2F, -2.05F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(5.0F, 17.4F, 0.0F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart6 = armmiddle2.addChild("heart6",
				ModelPartBuilder.create(),
				ModelTransform.of(-6.6F, -11.0F, -1.9F, 0.0F, 1.5708F, 0.0F));
		heart6.addChild("Shape32",
				ModelPartBuilder.create()
						.uv(12, 72).cuboid(-8.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart6.addChild("Shape33",
				ModelPartBuilder.create()
						.uv(71, 20).cuboid(1.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		ModelPartData leftleg = body.addChild("leftleg",
				ModelPartBuilder.create()
						.uv(0, 56).cuboid(-2.0F, 0.0F, -3.0F, 5.0F, 7.0F, 5.0F),
				ModelTransform.of(2.0F, 12.0F, 1.0F, -0.2281F, -0.7232F, -0.4617F));
		ModelPartData heart3 = leftleg.addChild("heart3",
				ModelPartBuilder.create(),
				ModelTransform.of(-2.0F, 12.0F, -1.0F, 0.0F, 0.0F, 0.0F));
		heart3.addChild("Shape26",
				ModelPartBuilder.create()
						.uv(71, 17).cuboid(5.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart3.addChild("Shape27",
				ModelPartBuilder.create()
						.uv(53, 71).cuboid(-4.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		leftleg.addChild("legdownl",
				ModelPartBuilder.create()
						.uv(0, 42).cuboid(-2.5F, -1.5F, -2.5F, 5.0F, 9.0F, 5.0F),
				ModelTransform.of(0.159F, 7.7483F, 1.0008F, 0.3491F, -0.1745F, 0.0F));
		ModelPartData rightleg = body.addChild("rightleg",
				ModelPartBuilder.create()
						.uv(0, 56).mirrored(true).cuboid(-3.0F, 0.0F, -3.0F, 5.0F, 7.0F, 5.0F),
				ModelTransform.of(-2.0F, 12.0F, 1.0F, -1.5272F, 0.3054F, 0.0F));
		ModelPartData heart4 = rightleg.addChild("heart4",
				ModelPartBuilder.create(),
				ModelTransform.of(-1.3914F, 5.6025F, -0.3263F, 1.2654F, 0.0F, 0.0F));
		heart4.addChild("Shape9",
				ModelPartBuilder.create()
						.uv(71, 17).mirrored(true).cuboid(-8.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(3.6F, -7.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart4.addChild("Shape28",
				ModelPartBuilder.create()
						.uv(53, 71).mirrored(true).cuboid(1.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(2.4F, -7.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		rightleg.addChild("legdownr",
				ModelPartBuilder.create()
						.uv(0, 42).mirrored(true).cuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F),
				ModelTransform.of(-0.1399F, 6.4114F, 0.1706F, 2.1817F, 0.0436F, 0.0F));
		ModelPartData head = root.addChild("head",
				ModelPartBuilder.create()
						.uv(21, 21).cuboid(-3.5F, -6.0F, -3.0F, 7.0F, 6.0F, 7.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
		head.addChild("Shape1",
				ModelPartBuilder.create()
						.uv(26, 5).cuboid(-4.6F, -8.0F, 0.0F, 9.0F, 3.0F, 6.0F, new Dilation(0.01F, 0.01F, 0.01F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.4014F, 0.0F, 0.0F));
		head.addChild("Shape6",
				ModelPartBuilder.create()
						.uv(65, 68).cuboid(-3.0F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, new Dilation(0.02F, 0.02F, 0.02F)),
				ModelTransform.of(3.854F, -7.8722F, 2.5976F, 0.4887F, 0.6545F, 0.3491F));
		head.addChild("Shape5",
				ModelPartBuilder.create()
						.uv(0, 68).cuboid(0.0F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, new Dilation(0.02F, 0.02F, 0.02F)),
				ModelTransform.of(-3.854F, -7.8722F, 2.5976F, 0.4887F, -0.6545F, -0.3491F));
		head.addChild("Shape2",
				ModelPartBuilder.create()
						.cuboid(-4.5F, -7.2F, -1.7F, 9.0F, 4.0F, 7.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0524F, 0.0F, 0.0F));
		head.addChild("Shape46",
				ModelPartBuilder.create()
						.uv(22, 14).cuboid(-4.5F, -4.2F, 3.3F, 9.0F, 1.0F, 2.0F),
				ModelTransform.of(0.0F, 1.4F, 0.0F, 0.0524F, 0.0F, 0.0F));
		head.addChild("Shape7",
				ModelPartBuilder.create()
						.uv(62, 17).cuboid(-4.5F, -6.2F, -1.7F, 1.0F, 3.0F, 7.0F),
				ModelTransform.of(0.3F, 2.9432F, -0.7469F, 0.0524F, 0.0F, 0.0F));
		head.addChild("Shape8",
				ModelPartBuilder.create()
						.uv(20, 60).cuboid(3.5F, -6.2F, -1.7F, 1.0F, 3.0F, 7.0F),
				ModelTransform.of(-0.3F, 2.9432F, -0.7469F, 0.0524F, 0.0F, 0.0F));
		ModelPartData glass = head.addChild("glass",
				ModelPartBuilder.create(),
				ModelTransform.of(0.0F, -0.8F, 0.1F, 0.192F, 0.0F, 0.0F));
		glass.addChild("Shape3",
				ModelPartBuilder.create()
						.uv(58, 38).cuboid(2.6251F, -6.9618F, -2.9109F, 3.0F, 2.0F, 6.0F),
				ModelTransform.of(0.0F, 0.0F, 1.0F, 0.0F, 1.0996F, 0.0F));
		ModelPartData bone = glass.addChild("bone",
				ModelPartBuilder.create(),
				ModelTransform.of(1.5111F, -4.2251F, -2.5709F, 0.0F, 0.0F, 0.0F));
		bone.addChild("Shape15",
				ModelPartBuilder.create()
						.uv(63, 46).cuboid(-0.7F, 1.0F, -2.3F, 2.0F, 2.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.1345F, 0.0F));
		bone.addChild("Shape17",
				ModelPartBuilder.create()
						.uv(22, 34).cuboid(0.3F, -1.0F, -2.4F, 1.0F, 3.0F, 1.0F, new Dilation(-0.11F, -0.11F, -0.11F)),
				ModelTransform.of(0.0606F, -0.1107F, 0.5693F, 0.0F, 1.1345F, 0.0F));
		bone.addChild("Shape18",
				ModelPartBuilder.create()
						.uv(0, 24).cuboid(-1.3F, -1.0F, -2.4F, 1.0F, 3.0F, 1.0F, new Dilation(-0.11F, -0.11F, -0.11F)),
				ModelTransform.of(-3.0829F, -0.1107F, 0.5693F, 0.0F, -1.1345F, 0.0F));
		bone.addChild("Shape16",
				ModelPartBuilder.create()
						.uv(63, 27).cuboid(-1.3F, 1.0F, -2.6F, 2.0F, 2.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(-3.2942F, -0.0242F, 0.1244F, 0.0F, -1.1345F, 0.0F));
		glass.addChild("Shape4",
				ModelPartBuilder.create()
						.uv(57, 9).cuboid(-5.6251F, -6.9618F, -2.9109F, 3.0F, 2.0F, 6.0F),
				ModelTransform.of(0.0F, 0.0F, 1.0F, 0.0F, -1.0996F, 0.0F));
		ModelPartData heart7 = head.addChild("heart7",
				ModelPartBuilder.create(),
				ModelTransform.of(-2.55F, 5.5F, -0.8F, 0.0F, 0.0F, 0.0F));
		heart7.addChild("Shape60",
				ModelPartBuilder.create(),
				ModelTransform.of(2.1717F, -5.3382F, -2.2F, 0.0F, 0.0F, 0.7679F));
		heart7.addChild("Shape61",
				ModelPartBuilder.create(),
				ModelTransform.of(2.9111F, -5.3333F, -2.2F, 0.0F, 0.0F, -0.7679F));
		ModelPartData heal = root.addChild("heal",
				ModelPartBuilder.create(),
				ModelTransform.of(0.0F, 3.45F, 0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData left_hands_ro2 = heal.addChild("left_hands_ro2",
				ModelPartBuilder.create(),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));
		ModelPartData handl6 = left_hands_ro2.addChild("handl6",
				ModelPartBuilder.create()
						.uv(43, 43).cuboid(15.5F, -2.35F, -1.5F, 5.0F, 9.0F, 5.0F)
						.uv(0, 82).cuboid(15.5F, -0.35F, -1.5F, 5.0F, 9.0F, 5.0F, new Dilation(0.3F, 0.3F, 0.3F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle13 = handl6.addChild("armmiddle13",
				ModelPartBuilder.create()
						.uv(55, 57).cuboid(15.3F, -3.7F, -1.35F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart22 = armmiddle13.addChild("heart22",
				ModelPartBuilder.create(),
				ModelTransform.of(10.7F, -5.6F, -5.0F, 0.0F, -1.5708F, 0.0F));
		heart22.addChild("Shape116",
				ModelPartBuilder.create()
						.uv(72, 46).cuboid(13.2893F, 6.8241F, -7.6F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart22.addChild("Shape117",
				ModelPartBuilder.create()
						.uv(72, 27).cuboid(-6.7903F, 14.7947F, -7.6F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		ModelPartData handl7 = left_hands_ro2.addChild("handl7",
				ModelPartBuilder.create()
						.uv(43, 43).cuboid(11.5F, -7.55F, -9.8F, 5.0F, 9.0F, 5.0F)
						.uv(0, 82).cuboid(11.5F, -7.55F, -9.8F, 5.0F, 9.0F, 5.0F, new Dilation(0.3F, 0.3F, 0.3F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle14 = handl7.addChild("armmiddle14",
				ModelPartBuilder.create()
						.uv(55, 57).cuboid(11.3F, -8.9F, -9.65F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart23 = armmiddle14.addChild("heart23",
				ModelPartBuilder.create(),
				ModelTransform.of(10.7F, -5.6F, -5.0F, 0.0F, -1.5708F, 0.0F));
		heart23.addChild("Shape118",
				ModelPartBuilder.create()
						.uv(72, 46).cuboid(3.5886F, 8.1758F, -3.6F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart23.addChild("Shape119",
				ModelPartBuilder.create()
						.uv(72, 27).cuboid(-9.806F, 5.4761F, -3.6F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		ModelPartData handl8 = left_hands_ro2.addChild("handl8",
				ModelPartBuilder.create()
						.uv(43, 43).cuboid(14.5F, -0.25F, 6.4F, 5.0F, 9.0F, 5.0F)
						.uv(0, 82).cuboid(14.5F, 0.85F, 6.4F, 5.0F, 9.0F, 5.0F, new Dilation(0.3F, 0.3F, 0.3F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle15 = handl8.addChild("armmiddle15",
				ModelPartBuilder.create()
						.uv(55, 57).cuboid(14.3F, -1.6F, 6.55F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart24 = armmiddle15.addChild("heart24",
				ModelPartBuilder.create(),
				ModelTransform.of(10.7F, -5.6F, -5.0F, 0.0F, -1.5708F, 0.0F));
		heart24.addChild("Shape120",
				ModelPartBuilder.create()
						.uv(72, 46).cuboid(20.6909F, 3.3548F, -6.6F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart24.addChild("Shape121",
				ModelPartBuilder.create()
						.uv(72, 27).cuboid(-2.0884F, 21.4814F, -6.6F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		ModelPartData handl9 = left_hands_ro2.addChild("handl9",
				ModelPartBuilder.create()
						.uv(43, 43).cuboid(18.9F, 3.95F, -10.4F, 5.0F, 9.0F, 5.0F)
						.uv(0, 82).cuboid(18.9F, 3.95F, -10.4F, 5.0F, 9.0F, 5.0F, new Dilation(0.3F, 0.3F, 0.3F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle16 = handl9.addChild("armmiddle16",
				ModelPartBuilder.create()
						.uv(55, 57).cuboid(18.7F, 2.6F, -10.25F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart25 = armmiddle16.addChild("heart25",
				ModelPartBuilder.create(),
				ModelTransform.of(10.7F, -5.6F, -5.0F, 0.0F, -1.5708F, 0.0F));
		heart25.addChild("Shape122",
				ModelPartBuilder.create()
						.uv(72, 46).cuboid(10.5211F, 17.371F, -11.0F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart25.addChild("Shape123",
				ModelPartBuilder.create()
						.uv(72, 27).cuboid(-17.6577F, 13.9F, -11.0F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		ModelPartData handl10 = left_hands_ro2.addChild("handl10",
				ModelPartBuilder.create()
						.uv(43, 43).cuboid(21.6F, -7.65F, 3.6F, 5.0F, 9.0F, 5.0F)
						.uv(0, 82).cuboid(21.6F, -6.65F, 3.6F, 5.0F, 9.0F, 5.0F, new Dilation(0.3F, 0.3F, 0.3F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle17 = handl10.addChild("armmiddle17",
				ModelPartBuilder.create()
						.uv(55, 57).cuboid(21.4F, -9.0F, 3.75F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart26 = armmiddle17.addChild("heart26",
				ModelPartBuilder.create(),
				ModelTransform.of(10.7F, -5.6F, -5.0F, 0.0F, -1.5708F, 0.0F));
		heart26.addChild("Shape124",
				ModelPartBuilder.create()
						.uv(72, 46).cuboid(13.7893F, -0.5141F, -13.7F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart26.addChild("Shape125",
				ModelPartBuilder.create()
						.uv(72, 27).cuboid(0.5233F, 14.0129F, -13.7F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		ModelPartData right_hands_ro2 = heal.addChild("right_hands_ro2",
				ModelPartBuilder.create(),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));
		ModelPartData handr6 = right_hands_ro2.addChild("handr6",
				ModelPartBuilder.create()
						.uv(43, 43).mirrored(true).cuboid(-26.6F, -0.95F, -1.5F, 5.0F, 9.0F, 5.0F)
						.uv(0, 82).cuboid(-26.6F, -0.95F, -1.5F, 5.0F, 9.0F, 5.0F, new Dilation(0.3F, 0.3F, 0.3F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle18 = handr6.addChild("armmiddle18",
				ModelPartBuilder.create()
						.uv(55, 57).mirrored(true).cuboid(-26.4F, -2.3F, -1.35F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart27 = armmiddle18.addChild("heart27",
				ModelPartBuilder.create(),
				ModelTransform.of(-10.7F, -5.6F, -5.0F, 0.0F, 1.5708F, 0.0F));
		heart27.addChild("Shape126",
				ModelPartBuilder.create()
						.uv(72, 46).mirrored(true).cuboid(-17.1892F, 7.8966F, -13.7F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart27.addChild("Shape127",
				ModelPartBuilder.create()
						.uv(72, 27).mirrored(true).cuboid(4.6902F, 15.8672F, -13.7F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		ModelPartData handr7 = right_hands_ro2.addChild("handr7",
				ModelPartBuilder.create()
						.uv(43, 43).mirrored(true).cuboid(-19.4F, 9.65F, -9.8F, 5.0F, 9.0F, 5.0F)
						.uv(0, 82).cuboid(-19.4F, 9.65F, -9.8F, 5.0F, 9.0F, 5.0F, new Dilation(0.3F, 0.3F, 0.3F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle19 = handr7.addChild("armmiddle19",
				ModelPartBuilder.create()
						.uv(55, 57).mirrored(true).cuboid(-19.2F, 8.3F, -9.65F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart28 = armmiddle19.addChild("heart28",
				ModelPartBuilder.create(),
				ModelTransform.of(-10.7F, -5.6F, -5.0F, 0.0F, 1.5708F, 0.0F));
		heart28.addChild("Shape128",
				ModelPartBuilder.create()
						.uv(72, 46).mirrored(true).cuboid(-17.6446F, 21.3518F, -6.5F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart28.addChild("Shape129",
				ModelPartBuilder.create()
						.uv(72, 27).mirrored(true).cuboid(17.862F, 18.6521F, -6.5F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		ModelPartData handr8 = right_hands_ro2.addChild("handr8",
				ModelPartBuilder.create()
						.uv(43, 43).mirrored(true).cuboid(-21.3F, -0.25F, 6.4F, 5.0F, 9.0F, 5.0F)
						.uv(0, 82).cuboid(-21.3F, 0.75F, 6.4F, 5.0F, 9.0F, 5.0F, new Dilation(0.3F, 0.3F, 0.3F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle20 = handr8.addChild("armmiddle20",
				ModelPartBuilder.create()
						.uv(55, 57).mirrored(true).cuboid(-21.1F, -1.6F, 6.55F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart29 = armmiddle20.addChild("heart29",
				ModelPartBuilder.create(),
				ModelTransform.of(-10.7F, -5.6F, -5.0F, 0.0F, 1.5708F, 0.0F));
		heart29.addChild("Shape130",
				ModelPartBuilder.create()
						.uv(72, 46).mirrored(true).cuboid(-23.6909F, 3.3548F, -8.4F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart29.addChild("Shape131",
				ModelPartBuilder.create()
						.uv(72, 27).mirrored(true).cuboid(-0.9116F, 21.4814F, -8.4F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		ModelPartData handr9 = right_hands_ro2.addChild("handr9",
				ModelPartBuilder.create()
						.uv(43, 43).mirrored(true).cuboid(-23.9F, -2.95F, -10.4F, 5.0F, 9.0F, 5.0F)
						.uv(0, 82).cuboid(-23.9F, -1.95F, -10.4F, 5.0F, 9.0F, 5.0F, new Dilation(0.3F, 0.3F, 0.3F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle21 = handr9.addChild("armmiddle21",
				ModelPartBuilder.create()
						.uv(55, 57).mirrored(true).cuboid(-23.7F, -4.3F, -10.25F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart30 = armmiddle21.addChild("heart30",
				ModelPartBuilder.create(),
				ModelTransform.of(-10.7F, -5.6F, -5.0F, 0.0F, 1.5708F, 0.0F));
		heart30.addChild("Shape132",
				ModelPartBuilder.create()
						.uv(72, 46).mirrored(true).cuboid(-9.0858F, 12.0853F, -11.0F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart30.addChild("Shape133",
				ModelPartBuilder.create()
						.uv(72, 27).mirrored(true).cuboid(10.2225F, 8.6143F, -11.0F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		ModelPartData handr10 = right_hands_ro2.addChild("handr10",
				ModelPartBuilder.create()
						.uv(43, 43).mirrored(true).cuboid(-17.2F, -7.65F, -0.5F, 5.0F, 9.0F, 5.0F)
						.uv(0, 82).cuboid(-17.2F, -6.65F, -0.5F, 5.0F, 9.0F, 5.0F, new Dilation(0.3F, 0.3F, 0.3F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle22 = handr10.addChild("armmiddle22",
				ModelPartBuilder.create()
						.uv(55, 57).mirrored(true).cuboid(-17.0F, -9.0F, -0.35F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart31 = armmiddle22.addChild("heart31",
				ModelPartBuilder.create(),
				ModelTransform.of(-10.7F, -5.6F, -5.0F, 0.0F, 1.5708F, 0.0F));
		heart31.addChild("Shape134",
				ModelPartBuilder.create()
						.uv(72, 46).mirrored(true).cuboid(-13.6486F, 2.1213F, -4.3F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart31.addChild("Shape135",
				ModelPartBuilder.create()
						.uv(72, 27).mirrored(true).cuboid(-0.3825F, 11.3774F, -4.3F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));

		return TexturedModelData.of(data, 128, 128);
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