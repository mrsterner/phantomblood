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
	private final ModelPart head2;
	private final ModelPart Shape13;
	private final ModelPart Shape14;
	private final ModelPart Shape45;
	private final ModelPart Shape59;
	private final ModelPart Shape62;
	private final ModelPart Shape63;
	private final ModelPart Shape64;
	private final ModelPart glass2;
	private final ModelPart Shape65;
	private final ModelPart bone2;
	private final ModelPart Shape66;
	private final ModelPart Shape67;
	private final ModelPart Shape68;
	private final ModelPart Shape69;
	private final ModelPart Shape70;
	private final ModelPart heart8;
	private final ModelPart Shape71;
	private final ModelPart Shape72;
	private final ModelPart body2;
	private final ModelPart bodydown2;
	private final ModelPart Shape73;
	private final ModelPart Shape74;
	private final ModelPart Shape75;
	private final ModelPart Shape76;
	private final ModelPart Shape77;
	private final ModelPart heart9;
	private final ModelPart Shape78;
	private final ModelPart Shape79;
	private final ModelPart heart10;
	private final ModelPart Shape80;
	private final ModelPart Shape81;
	private final ModelPart Shape82;
	private final ModelPart Shape83;
	private final ModelPart Shape84;
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
	private final ModelPart leftarm2;
	private final ModelPart rightarm2;
	private final ModelPart leftleg2;
	private final ModelPart heart11;
	private final ModelPart Shape107;
	private final ModelPart Shape108;
	private final ModelPart legdownl2;
	private final ModelPart rightleg2;
	private final ModelPart heart12;
	private final ModelPart Shape109;
	private final ModelPart Shape110;
	private final ModelPart legdownr2;
	private final ModelPart viewFirst;
	private final ModelPart left_hands_ro;
	private final ModelPart handl1;
	private final ModelPart armmiddle3;
	private final ModelPart heart13;
	private final ModelPart Shape111;
	private final ModelPart Shape112;
	private final ModelPart handl2;
	private final ModelPart armmiddle4;
	private final ModelPart heart14;
	private final ModelPart Shape113;
	private final ModelPart Shape114;
	private final ModelPart handl3;
	private final ModelPart armmiddle5;
	private final ModelPart heart15;
	private final ModelPart Shape115;
	private final ModelPart Shape116;
	private final ModelPart handl4;
	private final ModelPart armmiddle6;
	private final ModelPart heart16;
	private final ModelPart Shape117;
	private final ModelPart Shape118;
	private final ModelPart handl5;
	private final ModelPart armmiddle7;
	private final ModelPart heart17;
	private final ModelPart Shape119;
	private final ModelPart Shape120;
	private final ModelPart right_hands_ro;
	private final ModelPart handr1;
	private final ModelPart armmiddle8;
	private final ModelPart heart18;
	private final ModelPart Shape121;
	private final ModelPart Shape122;
	private final ModelPart handr2;
	private final ModelPart armmiddle9;
	private final ModelPart heart19;
	private final ModelPart Shape123;
	private final ModelPart Shape124;
	private final ModelPart handr3;
	private final ModelPart armmiddle10;
	private final ModelPart heart20;
	private final ModelPart Shape125;
	private final ModelPart Shape126;
	private final ModelPart handr4;
	private final ModelPart armmiddle11;
	private final ModelPart heart21;
	private final ModelPart Shape127;
	private final ModelPart Shape128;
	private final ModelPart handr5;
	private final ModelPart armmiddle12;
	private final ModelPart heart22;
	private final ModelPart Shape129;
	private final ModelPart Shape130;
	private final ModelPart healfist;
	private final ModelPart left_hands_ro2;
	private final ModelPart handl6;
	private final ModelPart armmiddle13;
	private final ModelPart heart23;
	private final ModelPart Shape131;
	private final ModelPart Shape132;
	private final ModelPart handl7;
	private final ModelPart armmiddle14;
	private final ModelPart heart24;
	private final ModelPart Shape133;
	private final ModelPart Shape134;
	private final ModelPart handl8;
	private final ModelPart armmiddle15;
	private final ModelPart heart25;
	private final ModelPart Shape135;
	private final ModelPart Shape136;
	private final ModelPart handl9;
	private final ModelPart armmiddle16;
	private final ModelPart heart26;
	private final ModelPart Shape137;
	private final ModelPart Shape138;
	private final ModelPart handl10;
	private final ModelPart armmiddle17;
	private final ModelPart heart27;
	private final ModelPart Shape139;
	private final ModelPart Shape140;
	private final ModelPart right_hands_ro2;
	private final ModelPart handr6;
	private final ModelPart armmiddle18;
	private final ModelPart heart28;
	private final ModelPart Shape141;
	private final ModelPart Shape142;
	private final ModelPart handr7;
	private final ModelPart armmiddle19;
	private final ModelPart heart29;
	private final ModelPart Shape143;
	private final ModelPart Shape144;
	private final ModelPart handr8;
	private final ModelPart armmiddle20;
	private final ModelPart heart30;
	private final ModelPart Shape145;
	private final ModelPart Shape146;
	private final ModelPart handr9;
	private final ModelPart armmiddle21;
	private final ModelPart heart31;
	private final ModelPart Shape147;
	private final ModelPart Shape148;
	private final ModelPart handr10;
	private final ModelPart armmiddle22;
	private final ModelPart heart32;
	private final ModelPart Shape149;
	private final ModelPart Shape150;
	private double yOffset;

	public CrazyDiamondModel(ModelPart root) {
		this.head = root.getChild("head");
		this.heart7 = this.head.getChild("heart7");
		this.body = root.getChild("body");
		this.heart = this.body.getChild("heart");
		this.Shape23 = this.heart.getChild("Shape23");
		this.Shape11 = this.heart.getChild("Shape11");
		this.Shape61 = this.heart7.getChild("Shape61");
		this.Shape60 = this.heart7.getChild("Shape60");
		this.glass = this.head.getChild("glass");
		this.Shape4 = this.glass.getChild("Shape4");
		this.bone = this.glass.getChild("bone");
		this.Shape16 = this.bone.getChild("Shape16");
		this.Shape18 = this.bone.getChild("Shape18");
		this.Shape17 = this.bone.getChild("Shape17");
		this.Shape15 = this.bone.getChild("Shape15");
		this.Shape3 = this.glass.getChild("Shape3");
		this.Shape8 = this.head.getChild("Shape8");
		this.Shape7 = this.head.getChild("Shape7");
		this.Shape46 = this.head.getChild("Shape46");
		this.Shape2 = this.head.getChild("Shape2");
		this.Shape5 = this.head.getChild("Shape5");
		this.Shape6 = this.head.getChild("Shape6");
		this.Shape1 = this.head.getChild("Shape1");
		this.rightleg = this.body.getChild("rightleg");
		this.legdownr = this.rightleg.getChild("legdownr");
		this.heart4 = this.rightleg.getChild("heart4");
		this.Shape28 = this.heart4.getChild("Shape28");
		this.Shape9 = this.heart4.getChild("Shape9");
		this.leftleg = this.body.getChild("leftleg");
		this.legdownl = this.leftleg.getChild("legdownl");
		this.heart3 = this.leftleg.getChild("heart3");
		this.Shape27 = this.heart3.getChild("Shape27");
		this.Shape26 = this.heart3.getChild("Shape26");
		this.rightarm = this.body.getChild("rightarm");
		this.rightarmdown = this.rightarm.getChild("rightarmdown");
		this.armmiddle2 = this.rightarmdown.getChild("armmiddle2");
		this.heart6 = this.armmiddle2.getChild("heart6");
		this.Shape33 = this.heart6.getChild("Shape33");
		this.Shape32 = this.heart6.getChild("Shape32");
		this.leftarm = this.body.getChild("leftarm");
		this.leftarmdown = this.leftarm.getChild("leftarmdown");
		this.armmiddle = this.leftarmdown.getChild("armmiddle");
		this.heart5 = this.armmiddle.getChild("heart5");
		this.Shape31 = this.heart5.getChild("Shape31");
		this.Shape30 = this.heart5.getChild("Shape30");
		this.Shape43 = this.body.getChild("Shape43");
		this.Shape44 = this.Shape43.getChild("Shape44");
		this.Shape47 = this.body.getChild("Shape47");
		this.Shape48 = this.Shape47.getChild("Shape48");
		this.Shape39 = this.body.getChild("Shape39");
		this.Shape42 = this.Shape39.getChild("Shape42");
		this.Shape41 = this.Shape39.getChild("Shape41");
		this.Shape40 = this.Shape39.getChild("Shape40");
		this.Shape49 = this.body.getChild("Shape49");
		this.Shape52 = this.Shape49.getChild("Shape52");
		this.Shape51 = this.Shape49.getChild("Shape51");
		this.Shape50 = this.Shape49.getChild("Shape50");
		this.Shape29 = this.body.getChild("Shape29");
		this.Shape38 = this.Shape29.getChild("Shape38");
		this.Shape37 = this.Shape29.getChild("Shape37");
		this.Shape36 = this.Shape29.getChild("Shape36");
		this.Shape35 = this.Shape29.getChild("Shape35");
		this.Shape34 = this.Shape29.getChild("Shape34");
		this.Shape53 = this.body.getChild("Shape53");
		this.Shape58 = this.Shape53.getChild("Shape58");
		this.Shape57 = this.Shape53.getChild("Shape57");
		this.Shape56 = this.Shape53.getChild("Shape56");
		this.Shape55 = this.Shape53.getChild("Shape55");
		this.Shape54 = this.Shape53.getChild("Shape54");
		this.Shape12 = this.body.getChild("Shape12");
		this.heart2 = this.body.getChild("heart2");
		this.Shape25 = this.heart2.getChild("Shape25");
		this.Shape24 = this.heart2.getChild("Shape24");

		this.Shape22 = this.body.getChild("Shape22");
		this.Shape21 = this.body.getChild("Shape21");
		this.Shape20 = this.body.getChild("Shape20");
		this.Shape19 = this.body.getChild("Shape19");
		this.Shape10 = this.body.getChild("Shape10");
		this.bodydown = this.body.getChild("bodydown");
		this.head2 = root.getChild("head2");
		this.heart8 = this.head2.getChild("heart8");
		this.Shape72 = this.heart8.getChild("Shape72");
		this.Shape71 = this.heart8.getChild("Shape71");
		this.glass2 = this.head2.getChild("glass2");
		this.Shape70 = this.glass2.getChild("Shape70");
		this.bone2 = this.glass2.getChild("bone2");
		this.Shape69 = this.bone2.getChild("Shape69");
		this.Shape68 = this.bone2.getChild("Shape68");
		this.Shape67 = this.bone2.getChild("Shape67");
		this.Shape66 = this.bone2.getChild("Shape66");
		this.Shape65 = this.glass2.getChild("Shape65");
		this.Shape64 = this.head2.getChild("Shape64");
		this.Shape63 = this.head2.getChild("Shape63");
		this.Shape62 = this.head2.getChild("Shape62");
		this.Shape59 = this.head2.getChild("Shape59");
		this.Shape45 = this.head2.getChild("Shape45");
		this.Shape14 = this.head2.getChild("Shape14");
		this.Shape13 = this.head2.getChild("Shape13");
		this.body2 = root.getChild("body2");
		this.rightleg2 = this.body2.getChild("rightleg2");
		this.legdownr2 = this.rightleg2.getChild("legdownr2");
		this.heart12 = this.rightleg2.getChild("heart12");
		this.Shape110 = this.heart12.getChild("Shape110");
		this.Shape109 = this.heart12.getChild("Shape109");
		this.leftleg2 = this.body2.getChild("leftleg2");
		this.legdownl2 = this.leftleg2.getChild("legdownl2");
		this.heart11 = this.leftleg2.getChild("heart11");
		this.Shape108 = this.heart11.getChild("Shape108");
		this.Shape107 = this.heart11.getChild("Shape107");
		this.rightarm2 = this.body2.getChild("rightarm2");
		this.leftarm2 = this.body2.getChild("leftarm2");
		this.Shape105 = this.body2.getChild("Shape105");
		this.Shape106 = this.Shape105.getChild("Shape106");
		this.Shape103 = this.body2.getChild("Shape103");
		this.Shape104 = this.Shape103.getChild("Shape104");
		this.Shape99 = this.body2.getChild("Shape99");
		this.Shape102 = this.Shape99.getChild("Shape102");
		this.Shape101 = this.Shape99.getChild("Shape101");
		this.Shape100 = this.Shape99.getChild("Shape100");
		this.Shape95 = this.body2.getChild("Shape95");
		this.Shape98 = this.Shape95.getChild("Shape98");
		this.Shape97 = this.Shape95.getChild("Shape97");
		this.Shape96 = this.Shape95.getChild("Shape96");
		this.Shape89 = this.body2.getChild("Shape89");
		this.Shape94 = this.Shape89.getChild("Shape94");
		this.Shape93 = this.Shape89.getChild("Shape93");
		this.Shape92 = this.Shape89.getChild("Shape92");
		this.Shape91 = this.Shape89.getChild("Shape91");
		this.Shape90 = this.Shape89.getChild("Shape90");
		this.Shape83 = this.body2.getChild("Shape83");
		this.Shape88 = this.Shape83.getChild("Shape88");
		this.Shape87 = this.Shape83.getChild("Shape87");
		this.Shape86 = this.Shape83.getChild("Shape86");
		this.Shape85 = this.Shape83.getChild("Shape85");
		this.Shape84 = this.Shape83.getChild("Shape84");
		this.Shape82 = this.body2.getChild("Shape82");
		this.heart10 = this.body2.getChild("heart10");
		this.Shape81 = this.heart10.getChild("Shape81");
		this.Shape80 = this.heart10.getChild("Shape80");
		this.heart9 = this.body2.getChild("heart9");
		this.Shape79 = this.heart9.getChild("Shape79");
		this.Shape78 = this.heart9.getChild("Shape78");
		this.Shape77 = this.body2.getChild("Shape77");
		this.Shape76 = this.body2.getChild("Shape76");
		this.Shape75 = this.body2.getChild("Shape75");
		this.Shape74 = this.body2.getChild("Shape74");
		this.Shape73 = this.body2.getChild("Shape73");
		this.bodydown2 = this.body2.getChild("bodydown2");
		this.viewFirst = root.getChild("viewFirst");
		this.right_hands_ro = this.viewFirst.getChild("right_hands_ro");
		this.handr5 = this.right_hands_ro.getChild("handr5");
		this.armmiddle12 = this.handr5.getChild("armmiddle12");
		this.heart22 = this.armmiddle12.getChild("heart22");
		this.Shape130 = this.heart22.getChild("Shape130");
		this.Shape129 = this.heart22.getChild("Shape129");
		this.handr4 = this.right_hands_ro.getChild("handr4");
		this.armmiddle11 = this.handr4.getChild("armmiddle11");
		this.heart21 = this.armmiddle11.getChild("heart21");
		this.Shape128 = this.heart21.getChild("Shape128");
		this.Shape127 = this.heart21.getChild("Shape127");
		this.handr3 = this.right_hands_ro.getChild("handr3");
		this.armmiddle10 = this.handr3.getChild("armmiddle10");
		this.heart20 = this.armmiddle10.getChild("heart20");
		this.Shape126 = this.heart20.getChild("Shape126");
		this.Shape125 = this.heart20.getChild("Shape125");
		this.handr2 = this.right_hands_ro.getChild("handr2");
		this.armmiddle9 = this.handr2.getChild("armmiddle9");
		this.heart19 = this.armmiddle9.getChild("heart19");
		this.Shape124 = this.heart19.getChild("Shape124");
		this.Shape123 = this.heart19.getChild("Shape123");
		this.handr1 = this.right_hands_ro.getChild("handr1");
		this.armmiddle8 = this.handr1.getChild("armmiddle8");
		this.heart18 = this.armmiddle8.getChild("heart18");
		this.Shape122 = this.heart18.getChild("Shape122");
		this.Shape121 = this.heart18.getChild("Shape121");
		this.left_hands_ro = this.viewFirst.getChild("left_hands_ro");
		this.handl5 = this.left_hands_ro.getChild("handl5");
		this.armmiddle7 = this.handl5.getChild("armmiddle7");
		this.heart17 = this.armmiddle7.getChild("heart17");
		this.Shape120 = this.heart17.getChild("Shape120");
		this.Shape119 = this.heart17.getChild("Shape119");
		this.handl4 = this.left_hands_ro.getChild("handl4");
		this.armmiddle6 = this.handl4.getChild("armmiddle6");
		this.heart16 = this.armmiddle6.getChild("heart16");
		this.Shape118 = this.heart16.getChild("Shape118");
		this.Shape117 = this.heart16.getChild("Shape117");
		this.handl3 = this.left_hands_ro.getChild("handl3");
		this.armmiddle5 = this.handl3.getChild("armmiddle5");
		this.heart15 = this.armmiddle5.getChild("heart15");
		this.Shape116 = this.heart15.getChild("Shape116");
		this.Shape115 = this.heart15.getChild("Shape115");
		this.handl2 = this.left_hands_ro.getChild("handl2");
		this.armmiddle4 = this.handl2.getChild("armmiddle4");
		this.heart14 = this.armmiddle4.getChild("heart14");
		this.Shape114 = this.heart14.getChild("Shape114");
		this.Shape113 = this.heart14.getChild("Shape113");
		this.handl1 = this.left_hands_ro.getChild("handl1");
		this.armmiddle3 = this.handl1.getChild("armmiddle3");
		this.heart13 = this.armmiddle3.getChild("heart13");
		this.Shape112 = this.heart13.getChild("Shape112");
		this.Shape111 = this.heart13.getChild("Shape111");
		this.healfist = root.getChild("healfist");
		this.right_hands_ro2 = this.healfist.getChild("right_hands_ro2");
		this.handr10 = this.right_hands_ro2.getChild("handr10");
		this.armmiddle22 = this.handr10.getChild("armmiddle22");
		this.heart32 = this.armmiddle22.getChild("heart32");
		this.Shape150 = this.heart32.getChild("Shape150");
		this.Shape149 = this.heart32.getChild("Shape149");
		this.handr9 = this.right_hands_ro2.getChild("handr9");
		this.armmiddle21 = this.handr9.getChild("armmiddle21");
		this.heart31 = this.armmiddle21.getChild("heart31");
		this.Shape148 = this.heart31.getChild("Shape148");
		this.Shape147 = this.heart31.getChild("Shape147");
		this.handr8 = this.right_hands_ro2.getChild("handr8");
		this.armmiddle20 = this.handr8.getChild("armmiddle20");
		this.heart30 = this.armmiddle20.getChild("heart30");
		this.Shape146 = this.heart30.getChild("Shape146");
		this.Shape145 = this.heart30.getChild("Shape145");
		this.handr7 = this.right_hands_ro2.getChild("handr7");
		this.armmiddle19 = this.handr7.getChild("armmiddle19");
		this.heart29 = this.armmiddle19.getChild("heart29");
		this.Shape144 = this.heart29.getChild("Shape144");
		this.Shape143 = this.heart29.getChild("Shape143");
		this.handr6 = this.right_hands_ro2.getChild("handr6");
		this.armmiddle18 = this.handr6.getChild("armmiddle18");
		this.heart28 = this.armmiddle18.getChild("heart28");
		this.Shape142 = this.heart28.getChild("Shape142");
		this.Shape141 = this.heart28.getChild("Shape141");
		this.left_hands_ro2 = this.healfist.getChild("left_hands_ro2");
		this.handl10 = this.left_hands_ro2.getChild("handl10");
		this.armmiddle17 = this.handl10.getChild("armmiddle17");
		this.heart27 = this.armmiddle17.getChild("heart27");
		this.Shape140 = this.heart27.getChild("Shape140");
		this.Shape139 = this.heart27.getChild("Shape139");
		this.handl9 = this.left_hands_ro2.getChild("handl9");
		this.armmiddle16 = this.handl9.getChild("armmiddle16");
		this.heart26 = this.armmiddle16.getChild("heart26");
		this.Shape138 = this.heart26.getChild("Shape138");
		this.Shape137 = this.heart26.getChild("Shape137");
		this.handl8 = this.left_hands_ro2.getChild("handl8");
		this.armmiddle15 = this.handl8.getChild("armmiddle15");
		this.heart25 = this.armmiddle15.getChild("heart25");
		this.Shape136 = this.heart25.getChild("Shape136");
		this.Shape135 = this.heart25.getChild("Shape135");
		this.handl7 = this.left_hands_ro2.getChild("handl7");
		this.armmiddle14 = this.handl7.getChild("armmiddle14");
		this.heart24 = this.armmiddle14.getChild("heart24");
		this.Shape134 = this.heart24.getChild("Shape134");
		this.Shape133 = this.heart24.getChild("Shape133");
		this.handl6 = this.left_hands_ro2.getChild("handl6");
		this.armmiddle13 = this.handl6.getChild("armmiddle13");
		this.heart23 = this.armmiddle13.getChild("heart23");
		this.Shape132 = this.heart23.getChild("Shape132");
		this.Shape131 = this.heart23.getChild("Shape131");

		setRotationAngle(head, 0.2618F, 0.0F, 0.0F);
		setRotationAngle(Shape1, 0.4014F, 0.0F, 0.0F);
		setRotationAngle(Shape6, 0.4887F, 0.6545F, 0.3491F);
		setRotationAngle(Shape5, 0.4887F, -0.6545F, -0.3491F);
		setRotationAngle(Shape2, 0.0524F, 0.0F, 0.0F);
		setRotationAngle(Shape46, 0.0524F, 0.0F, 0.0F);
		setRotationAngle(Shape7, 0.0524F, 0.0F, 0.0F);
		setRotationAngle(Shape8, 0.0524F, 0.0F, 0.0F);
		setRotationAngle(glass, 0.192F, 0.0F, 0.0F);

		setRotationAngle(Shape3, 0.0F, 1.0996F, 0.0F);

		setRotationAngle(Shape15, 0.0F, 1.1345F, 0.0F);
		setRotationAngle(Shape17, 0.0F, 1.1345F, 0.0F);
		setRotationAngle(Shape18, 0.0F, -1.1345F, 0.0F);
		setRotationAngle(Shape16, 0.0F, -1.1345F, 0.0F);
		setRotationAngle(Shape4, 0.0F, -1.0996F, 0.0F);

		setRotationAngle(Shape60, 0.0F, 0.0F, 0.7679F);

		setRotationAngle(Shape61, 0.0F, 0.0F, -0.7679F);

		setRotationAngle(body, 0.357F, -0.5369F, 0.0666F);
		setRotationAngle(Shape21, 0.0F, 0.0F, 1.1345F);
		setRotationAngle(Shape22, 0.0F, 0.0F, -1.1345F);

		setRotationAngle(Shape11, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(Shape23, 0.0F, 0.0F, -0.6981F);

		setRotationAngle(Shape24, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(Shape25, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(Shape53, 0.0F, 0.3316F, 0.2443F);
		setRotationAngle(Shape54, 0.5236F, -2.8623F, 0.0785F);
		setRotationAngle(Shape55, 0.5236F, -2.2864F, 0.0785F);
		setRotationAngle(Shape56, 0.5236F, 2.7314F, 0.0785F);
		setRotationAngle(Shape57, -0.5236F, 2.1031F, 0.0785F);
		setRotationAngle(Shape58, -0.5236F, 1.1781F, 0.0785F);
		setRotationAngle(Shape29, 0.0F, -0.3316F, -0.2443F);
		setRotationAngle(Shape34, 0.5236F, 2.8623F, -0.0785F);
		setRotationAngle(Shape35, 0.5236F, 2.2864F, -0.0785F);
		setRotationAngle(Shape36, 0.5236F, -2.7314F, -0.0785F);
		setRotationAngle(Shape37, -0.5236F, -2.1031F, -0.0785F);
		setRotationAngle(Shape38, -0.5236F, -1.1781F, -0.0785F);
		setRotationAngle(Shape49, 0.0F, 0.1047F, 0.7679F);
		setRotationAngle(Shape50, 0.0F, -2.8972F, 0.48F);
		setRotationAngle(Shape51, 0.1309F, 2.8274F, 0.5149F);
		setRotationAngle(Shape52, 0.1309F, 1.2043F, 0.5149F);
		setRotationAngle(Shape39, 0.0F, -0.1047F, -0.7679F);
		setRotationAngle(Shape40, 0.0F, 2.8972F, -0.48F);
		setRotationAngle(Shape41, 0.1309F, -2.8274F, -0.5149F);
		setRotationAngle(Shape42, 0.1309F, -1.2043F, -0.5149F);
		setRotationAngle(Shape47, -3.0128F, 0.3581F, 1.1229F);
		setRotationAngle(Shape48, -2.3845F, 0.4454F, 2.8159F);
		setRotationAngle(Shape43, -3.0128F, -0.3581F, -1.1229F);
		setRotationAngle(Shape44, -2.3845F, -0.4454F, -2.8159F);
		setRotationAngle(leftarm, 0.3994F, -0.0128F, -0.6976F);
		setRotationAngle(leftarmdown, -1.9469F, -0.0513F, 0.5751F);
		setRotationAngle(heart5, 0.0F, -1.5708F, 0.0F);

		setRotationAngle(Shape30, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(Shape31, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(rightarm, 0.3054F, 0.0F, 0.3054F);
		setRotationAngle(rightarmdown, -1.9433F, 0.2394F, -0.5035F);
		setRotationAngle(heart6, 0.0F, 1.5708F, 0.0F);

		setRotationAngle(Shape32, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(Shape33, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(leftleg, -0.2281F, -0.7232F, -0.4617F);

		setRotationAngle(Shape26, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(Shape27, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(legdownl, 0.3491F, -0.1745F, 0.0F);
		setRotationAngle(rightleg, -1.5272F, 0.3054F, 0.0F);
		setRotationAngle(heart4, 1.2654F, 0.0F, 0.0F);

		setRotationAngle(Shape9, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(Shape28, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(legdownr, 2.1817F, 0.0436F, 0.0F);
		setRotationAngle(head2, 0.2182F, 0.0F, 0.0F);
		setRotationAngle(Shape13, 0.4014F, 0.0F, 0.0F);
		setRotationAngle(Shape14, 0.4887F, 0.6545F, 0.3491F);
		setRotationAngle(Shape45, 0.4887F, -0.6545F, -0.3491F);
		setRotationAngle(Shape59, 0.0524F, 0.0F, 0.0F);
		setRotationAngle(Shape62, 0.0524F, 0.0F, 0.0F);
		setRotationAngle(Shape63, 0.0524F, 0.0F, 0.0F);
		setRotationAngle(Shape64, 0.0524F, 0.0F, 0.0F);
		setRotationAngle(glass2, 0.192F, 0.0F, 0.0F);

		setRotationAngle(Shape65, 0.0F, 1.0996F, 0.0F);

		setRotationAngle(Shape66, 0.0F, 1.1345F, 0.0F);
		setRotationAngle(Shape67, 0.0F, 1.1345F, 0.0F);
		setRotationAngle(Shape68, 0.0F, -1.1345F, 0.0F);
		setRotationAngle(Shape69, 0.0F, -1.1345F, 0.0F);
		setRotationAngle(Shape70, 0.0F, -1.0996F, 0.0F);

		setRotationAngle(Shape71, 0.0F, 0.0F, 0.7679F);
		setRotationAngle(Shape72, 0.0F, 0.0F, -0.7679F);
		setRotationAngle(body2, 0.1309F, 0.0F, 0.0F);
		setRotationAngle(Shape76, 0.0F, 0.0F, 1.1345F);
		setRotationAngle(Shape77, 0.0F, 0.0F, -1.1345F);

		setRotationAngle(Shape78, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(Shape79, 0.0F, 0.0F, -0.6981F);

		setRotationAngle(Shape80, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(Shape81, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(Shape83, 0.0F, 0.3316F, 0.2443F);
		setRotationAngle(Shape84, 0.5236F, -2.8623F, 0.0785F);
		setRotationAngle(Shape85, 0.5236F, -2.2864F, 0.0785F);
		setRotationAngle(Shape86, 0.5236F, 2.7314F, 0.0785F);
		setRotationAngle(Shape87, -0.5236F, 2.1031F, 0.0785F);
		setRotationAngle(Shape88, -0.5236F, 1.1781F, 0.0785F);
		setRotationAngle(Shape89, 0.0F, -0.3316F, -0.2443F);
		setRotationAngle(Shape90, 0.5236F, 2.8623F, -0.0785F);
		setRotationAngle(Shape91, 0.5236F, 2.2864F, -0.0785F);
		setRotationAngle(Shape92, 0.5236F, -2.7314F, -0.0785F);
		setRotationAngle(Shape93, -0.5236F, -2.1031F, -0.0785F);
		setRotationAngle(Shape94, -0.5236F, -1.1781F, -0.0785F);
		setRotationAngle(Shape95, 0.0F, 0.1047F, 0.7679F);
		setRotationAngle(Shape96, 0.0F, -2.8972F, 0.48F);
		setRotationAngle(Shape97, 0.1309F, 2.8274F, 0.5149F);
		setRotationAngle(Shape98, 0.1309F, 1.2043F, 0.5149F);
		setRotationAngle(Shape99, 0.0F, -0.1047F, -0.7679F);
		setRotationAngle(Shape100, 0.0F, 2.8972F, -0.48F);
		setRotationAngle(Shape101, 0.1309F, -2.8274F, -0.5149F);
		setRotationAngle(Shape102, 0.1309F, -1.2043F, -0.5149F);
		setRotationAngle(Shape103, -3.0128F, 0.3581F, 1.1229F);
		setRotationAngle(Shape104, -2.3845F, 0.4454F, 2.8159F);
		setRotationAngle(Shape105, -3.0128F, -0.3581F, -1.1229F);
		setRotationAngle(Shape106, -2.3845F, -0.4454F, -2.8159F);
		setRotationAngle(leftarm2, 0.3491F, 0.0F, -0.1745F);
		setRotationAngle(rightarm2, 0.211F, -0.056F, 0.2559F);
		setRotationAngle(leftleg2, -0.5587F, -0.195F, -0.2865F);

		setRotationAngle(Shape107, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(Shape108, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(legdownl2, 0.7418F, 0.0F, 0.0F);
		setRotationAngle(rightleg2, -0.4972F, 0.1268F, 0.3077F);

		setRotationAngle(Shape109, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(Shape110, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(legdownr2, 0.7418F, -0.1309F, -0.0873F);


		setRotationAngle(handl1, -1.5708F, 0.0F, 0.0F);
		setRotationAngle(heart13, 0.0F, -1.5708F, 0.0F);

		setRotationAngle(Shape111, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(Shape112, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(handl2, -1.5708F, 0.0F, 0.0F);
		setRotationAngle(heart14, 0.0F, -1.5708F, 0.0F);

		setRotationAngle(Shape113, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(Shape114, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(handl3, -1.5708F, 0.0F, 0.0F);
		setRotationAngle(heart15, 0.0F, -1.5708F, 0.0F);

		setRotationAngle(Shape115, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(Shape116, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(handl4, -1.5708F, 0.0F, 0.0F);
		setRotationAngle(heart16, 0.0F, -1.5708F, 0.0F);

		setRotationAngle(Shape117, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(Shape118, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(handl5, -1.5708F, 0.0F, 0.0F);
		setRotationAngle(heart17, 0.0F, -1.5708F, 0.0F);

		setRotationAngle(Shape119, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(Shape120, 0.0F, 0.0F, -0.6981F);

		setRotationAngle(handr1, -1.5708F, 0.0F, 0.0F);
		setRotationAngle(heart18, 0.0F, 1.5708F, 0.0F);

		setRotationAngle(Shape121, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(Shape122, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(handr2, -1.5708F, 0.0F, 0.0F);
		setRotationAngle(heart19, 0.0F, 1.5708F, 0.0F);

		setRotationAngle(Shape123, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(Shape124, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(handr3, -1.5708F, 0.0F, 0.0F);
		setRotationAngle(heart20, 0.0F, 1.5708F, 0.0F);

		setRotationAngle(Shape125, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(Shape126, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(handr4, -1.5708F, 0.0F, 0.0F);
		setRotationAngle(heart21, 0.0F, 1.5708F, 0.0F);

		setRotationAngle(Shape127, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(Shape128, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(handr5, -1.5708F, 0.0F, 0.0F);
		setRotationAngle(heart22, 0.0F, 1.5708F, 0.0F);

		setRotationAngle(Shape129, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(Shape130, 0.0F, 0.0F, 0.6981F);


		setRotationAngle(handl6, -1.5708F, 0.0F, 0.0F);
		setRotationAngle(heart23, 0.0F, -1.5708F, 0.0F);

		setRotationAngle(Shape131, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(Shape132, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(handl7, -1.5708F, 0.0F, 0.0F);
		setRotationAngle(heart24, 0.0F, -1.5708F, 0.0F);

		setRotationAngle(Shape133, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(Shape134, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(handl8, -1.5708F, 0.0F, 0.0F);
		setRotationAngle(heart25, 0.0F, -1.5708F, 0.0F);

		setRotationAngle(Shape135, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(Shape136, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(handl9, -1.5708F, 0.0F, 0.0F);
		setRotationAngle(heart26, 0.0F, -1.5708F, 0.0F);

		setRotationAngle(Shape137, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(Shape138, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(handl10, -1.5708F, 0.0F, 0.0F);
		setRotationAngle(heart27, 0.0F, -1.5708F, 0.0F);

		setRotationAngle(Shape139, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(Shape140, 0.0F, 0.0F, -0.6981F);

		setRotationAngle(handr6, -1.5708F, 0.0F, 0.0F);
		setRotationAngle(heart28, 0.0F, 1.5708F, 0.0F);

		setRotationAngle(Shape141, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(Shape142, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(handr7, -1.5708F, 0.0F, 0.0F);
		setRotationAngle(heart29, 0.0F, 1.5708F, 0.0F);

		setRotationAngle(Shape143, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(Shape144, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(handr8, -1.5708F, 0.0F, 0.0F);
		setRotationAngle(heart30, 0.0F, 1.5708F, 0.0F);

		setRotationAngle(Shape145, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(Shape146, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(handr9, -1.5708F, 0.0F, 0.0F);
		setRotationAngle(heart31, 0.0F, 1.5708F, 0.0F);

		setRotationAngle(Shape147, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(Shape148, 0.0F, 0.0F, 0.6981F);
		setRotationAngle(handr10, -1.5708F, 0.0F, 0.0F);
		setRotationAngle(heart32, 0.0F, 1.5708F, 0.0F);

		setRotationAngle(Shape149, 0.0F, 0.0F, -0.6981F);
		setRotationAngle(Shape150, 0.0F, 0.0F, 0.6981F);
	}



	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		/*
		ModelPartData modelPartData1 = modelPartData.addChild("head", ModelPartBuilder.create().uv(21,21).cuboid(-3.5F, -6.0F, -3.0F, 7.0F, 6.0F, 7.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData1.addChild("Shape1", ModelPartBuilder.create().uv(26,5).cuboid(-4.6F, -8.0F, 0.0F, 9.0F, 3.0F, 6.0F, new Dilation(0.01F)), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData1.addChild("Shape6", ModelPartBuilder.create().uv(65,68).cuboid(-3.0F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, new Dilation(0.02F)), ModelTransform.pivot(3.854F,-7.8722F,2.5976F));
		modelPartData1.addChild("Shape5", ModelPartBuilder.create().uv(0,68).cuboid(0.0F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, new Dilation(0.02F)), ModelTransform.pivot(-3.854F,-7.8722F,2.5976F));
		modelPartData1.addChild("Shape2", ModelPartBuilder.create().uv(0,0).cuboid(-4.5F, -7.2F, -1.7F, 9.0F, 4.0F, 7.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData1.addChild("Shape46", ModelPartBuilder.create().uv(22,14).cuboid(-4.5F, -4.2F, 3.3F, 9.0F, 1.0F, 2.0F), ModelTransform.pivot(0.0F,1.4F,0.0F));
		modelPartData1.addChild("Shape7", ModelPartBuilder.create().uv(62,17).cuboid(-4.5F, -6.2F, -1.7F, 1.0F, 3.0F, 7.0F), ModelTransform.pivot(0.3F,2.9432F,-0.7469F));
		modelPartData1.addChild("Shape8", ModelPartBuilder.create().uv(20,60).cuboid(3.5F, -6.2F, -1.7F, 1.0F, 3.0F, 7.0F), ModelTransform.pivot(-0.3F,2.9432F,-0.7469F));
		ModelPartData modelPartData2 = modelPartData1.addChild("glass", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-0.8F,0.1F));
		modelPartData2.addChild("Shape3", ModelPartBuilder.create().uv(58,38).cuboid(2.6251F, -6.9618F, -2.9109F, 3.0F, 2.0F, 6.0F), ModelTransform.pivot(0.0F,0.0F,1.0F));
		ModelPartData modelPartData3 = modelPartData2.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(1.5111F,-4.2251F,-2.5709F));
		modelPartData3.addChild("Shape15", ModelPartBuilder.create().uv(63,46).cuboid(-0.7F, 1.0F, -2.3F, 2.0F, 2.0F, 5.0F, new Dilation(-0.1F)), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData3.addChild("Shape17", ModelPartBuilder.create().uv(22,34).cuboid(0.3F, -1.0F, -2.4F, 1.0F, 3.0F, 1.0F, new Dilation(-0.11F)), ModelTransform.pivot(0.0606F,-0.1107F,0.5693F));
		modelPartData3.addChild("Shape18", ModelPartBuilder.create().uv(0,24).cuboid(-1.3F, -1.0F, -2.4F, 1.0F, 3.0F, 1.0F, new Dilation(-0.11F)), ModelTransform.pivot(-3.0829F,-0.1107F,0.5693F));
		modelPartData3.addChild("Shape16", ModelPartBuilder.create().uv(63,27).cuboid(-1.3F, 1.0F, -2.6F, 2.0F, 2.0F, 5.0F, new Dilation(-0.1F)), ModelTransform.pivot(-3.2942F,-0.0242F,0.1244F));
		modelPartData2.addChild("Shape4", ModelPartBuilder.create().uv(57,9).cuboid(-5.6251F, -6.9618F, -2.9109F, 3.0F, 2.0F, 6.0F), ModelTransform.pivot(0.0F,0.0F,1.0F));
		ModelPartData modelPartData4 = modelPartData1.addChild("heart7", ModelPartBuilder.create(), ModelTransform.pivot(-2.55F,5.5F,-0.8F));
		modelPartData4.addChild("Shape60", ModelPartBuilder.create(), ModelTransform.pivot(2.1717F,-5.3382F,-2.2F));
		modelPartData4.addChild("Shape61", ModelPartBuilder.create(), ModelTransform.pivot(2.9111F,-5.3333F,-2.2F));
		ModelPartData modelPartData5 = modelPartData.addChild("body", ModelPartBuilder.create().uv(0,11).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 6.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData5.addChild("bodydown", ModelPartBuilder.create().uv(44,29).cuboid(-3.5F, 7.0F, -1.6F, 7.0F, 4.0F, 5.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData5.addChild("Shape10", ModelPartBuilder.create().uv(25,0).cuboid(-3.5F, 0.2F, -2.9F, 7.0F, 4.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData5.addChild("Shape19", ModelPartBuilder.create().uv(63,53).cuboid(-3.0F, 0.2F, -3.9F, 6.0F, 1.0F, 2.0F), ModelTransform.pivot(0.0F,0.0F,6.6F));
		modelPartData5.addChild("Shape20", ModelPartBuilder.create().uv(64,63).cuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F), ModelTransform.pivot(0.0F,5.0F,6.6F));
		modelPartData5.addChild("Shape21", ModelPartBuilder.create().uv(41,0).cuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F), ModelTransform.pivot(-1.691F,3.0301F,6.5F));
		modelPartData5.addChild("Shape22", ModelPartBuilder.create().uv(28,17).cuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F), ModelTransform.pivot(1.691F,3.0301F,6.5F));
		ModelPartData modelPartData6 = modelPartData5.addChild("heart", ModelPartBuilder.create(), ModelTransform.pivot(-0.6F,6.1F,-2.0F));
		modelPartData6.addChild("Shape11", ModelPartBuilder.create().uv(0,74).cuboid(-1.3468F, -1.1286F, -0.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.01F)), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData6.addChild("Shape23", ModelPartBuilder.create().uv(20,73).cuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(1.2F,0.0F,0.0F));
		ModelPartData modelPartData7 = modelPartData5.addChild("heart2", ModelPartBuilder.create(), ModelTransform.pivot(-0.6F,9.9F,-2.3F));
		modelPartData7.addChild("Shape24", ModelPartBuilder.create().uv(12,68).cuboid(-1.3468F, -1.1286F, -0.5F, 3.0F, 2.0F, 2.0F, new Dilation(-0.19F)), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData7.addChild("Shape25", ModelPartBuilder.create().uv(15,24).cuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, new Dilation(-0.2F)), ModelTransform.pivot(1.2F,0.0F,0.0F));
		modelPartData5.addChild("Shape12", ModelPartBuilder.create().uv(0,34).cuboid(-4.0F, 10.0F, -2.4F, 8.0F, 2.0F, 6.0F), ModelTransform.pivot(0.0F,0.0F,0.3F));
		ModelPartData modelPartData8 = modelPartData5.addChild("Shape53", ModelPartBuilder.create().uv(69,7).cuboid(-4.75F, -18.3333F, 3.25F, 5.0F, 1.0F, 2.0F), ModelTransform.pivot(-6.55F,20.2333F,0.45F));
		modelPartData8.addChild("Shape54", ModelPartBuilder.create().uv(0,33).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F), ModelTransform.pivot(-4.6377F,-18.199F,3.453F));
		modelPartData8.addChild("Shape55", ModelPartBuilder.create().uv(27,70).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F), ModelTransform.pivot(-4.8679F,-19.0863F,2.2888F));
		modelPartData8.addChild("Shape56", ModelPartBuilder.create().uv(48,63).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F), ModelTransform.pivot(-5.9496F,-20.8982F,0.1061F));
		modelPartData8.addChild("Shape57", ModelPartBuilder.create().uv(15,57).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F), ModelTransform.pivot(-4.9121F,-20.9909F,-1.8343F));
		modelPartData8.addChild("Shape58", ModelPartBuilder.create().uv(35,48).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F), ModelTransform.pivot(-3.2972F,-19.3926F,-2.1498F));
		ModelPartData modelPartData9 = modelPartData5.addChild("Shape29", ModelPartBuilder.create().uv(69,7).cuboid(-0.25F, -18.3333F, 3.25F, 5.0F, 1.0F, 2.0F, true), ModelTransform.pivot(6.55F,20.2333F,0.45F));
		modelPartData9.addChild("Shape34", ModelPartBuilder.create().uv(0,33).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, true), ModelTransform.pivot(4.6377F,-18.199F,3.453F));
		modelPartData9.addChild("Shape35", ModelPartBuilder.create().uv(27,70).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, true), ModelTransform.pivot(4.8679F,-19.0863F,2.2888F));
		modelPartData9.addChild("Shape36", ModelPartBuilder.create().uv(48,63).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, true), ModelTransform.pivot(5.9496F,-20.8982F,0.1061F));
		modelPartData9.addChild("Shape37", ModelPartBuilder.create().uv(15,57).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, true), ModelTransform.pivot(4.9121F,-20.9909F,-1.8343F));
		modelPartData9.addChild("Shape38", ModelPartBuilder.create().uv(35,48).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, true), ModelTransform.pivot(3.2972F,-19.3926F,-2.1498F));
		ModelPartData modelPartData10 = modelPartData5.addChild("Shape49", ModelPartBuilder.create().uv(65,0).cuboid(-14.725F, -20.825F, 2.6F, 5.0F, 1.0F, 2.0F), ModelTransform.pivot(-8.675F,23.625F,-0.7F));
		modelPartData10.addChild("Shape50", ModelPartBuilder.create().uv(15,42).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F), ModelTransform.pivot(-15.2936F,-20.6847F,2.0575F));
		modelPartData10.addChild("Shape51", ModelPartBuilder.create().uv(0,11).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F), ModelTransform.pivot(-15.4301F,-20.8993F,-0.3314F));
		modelPartData10.addChild("Shape52", ModelPartBuilder.create().uv(22,34).cuboid(-3.1F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F), ModelTransform.pivot(-12.2338F,-19.6953F,-3.069F));
		ModelPartData modelPartData11 = modelPartData5.addChild("Shape39", ModelPartBuilder.create().uv(65,0).cuboid(9.725F, -20.825F, 2.6F, 5.0F, 1.0F, 2.0F, true), ModelTransform.pivot(8.675F,23.625F,-0.7F));
		modelPartData11.addChild("Shape40", ModelPartBuilder.create().uv(15,42).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F, true), ModelTransform.pivot(15.2936F,-20.6847F,2.0575F));
		modelPartData11.addChild("Shape41", ModelPartBuilder.create().uv(0,11).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, true), ModelTransform.pivot(15.4301F,-20.8993F,-0.3314F));
		modelPartData11.addChild("Shape42", ModelPartBuilder.create().uv(22,34).cuboid(2.1F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F, true), ModelTransform.pivot(12.2338F,-19.6953F,-3.069F));
		ModelPartData modelPartData12 = modelPartData5.addChild("Shape47", ModelPartBuilder.create().uv(20,70).cuboid(3.45F, -12.6F, 1.4F, 3.0F, 1.0F, 2.0F), ModelTransform.pivot(7.85F,-8.8F,6.7F));
		modelPartData12.addChild("Shape48", ModelPartBuilder.create().uv(0,0).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F), ModelTransform.pivot(3.4582F,-11.6401F,2.4486F));
		ModelPartData modelPartData13 = modelPartData5.addChild("Shape43", ModelPartBuilder.create().uv(20,70).cuboid(-6.45F, -12.6F, 1.4F, 3.0F, 1.0F, 2.0F, true), ModelTransform.pivot(-7.85F,-8.8F,6.7F));
		modelPartData13.addChild("Shape44", ModelPartBuilder.create().uv(0,0).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, true), ModelTransform.pivot(-3.4582F,-11.6401F,2.4486F));
		ModelPartData modelPartData14 = modelPartData5.addChild("leftarm", ModelPartBuilder.create().uv(50,0).cuboid(-1.0F, -2.0F, -2.0F, 5.0F, 4.0F, 5.0F).uv(52,63).cuboid(-0.8F, 1.8F, -1.55F, 4.0F, 4.0F, 4.0F), ModelTransform.pivot(5.0F,2.0F,-0.1F));
		ModelPartData modelPartData15 = modelPartData14.addChild("leftarmdown", ModelPartBuilder.create().uv(43,43).cuboid(-1.0F, 0.0F, -2.0F, 5.0F, 9.0F, 5.0F), ModelTransform.pivot(-0.3879F,5.8169F,0.2415F));
		ModelPartData modelPartData16 = modelPartData15.addChild("armmiddle", ModelPartBuilder.create().uv(55,57).cuboid(3.8F, -17.2F, -2.05F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F)), ModelTransform.pivot(-5.0F,16.4F,0.0F));
		ModelPartData modelPartData17 = modelPartData16.addChild("heart5", ModelPartBuilder.create(), ModelTransform.pivot(6.6F,-11.0F,-1.9F));
		modelPartData17.addChild("Shape30", ModelPartBuilder.create().uv(72,46).cuboid(5.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		modelPartData17.addChild("Shape31", ModelPartBuilder.create().uv(72,27).cuboid(-4.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		ModelPartData modelPartData18 = modelPartData5.addChild("rightarm", ModelPartBuilder.create().uv(0,24).cuboid(-4.0F, -2.0F, -2.0F, 5.0F, 4.0F, 5.0F).uv(36,63).cuboid(-3.2F, 1.8F, -1.55F, 4.0F, 4.0F, 4.0F), ModelTransform.pivot(-5.0F,2.0F,-0.1F));
		ModelPartData modelPartData19 = modelPartData18.addChild("rightarmdown", ModelPartBuilder.create().uv(42,14).cuboid(-4.0F, 1.0F, -2.0F, 5.0F, 9.0F, 5.0F), ModelTransform.pivot(-0.5615F,4.6989F,-0.187F));
		ModelPartData modelPartData20 = modelPartData19.addChild("armmiddle2", ModelPartBuilder.create().uv(35,57).cuboid(-8.8F, -17.2F, -2.05F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F)), ModelTransform.pivot(5.0F,17.4F,0.0F));
		ModelPartData modelPartData21 = modelPartData20.addChild("heart6", ModelPartBuilder.create(), ModelTransform.pivot(-6.6F,-11.0F,-1.9F));
		modelPartData21.addChild("Shape32", ModelPartBuilder.create().uv(12,72).cuboid(-8.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		modelPartData21.addChild("Shape33", ModelPartBuilder.create().uv(71,20).cuboid(1.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		ModelPartData modelPartData22 = modelPartData5.addChild("leftleg", ModelPartBuilder.create().uv(0,56).cuboid(-2.0F, 0.0F, -3.0F, 5.0F, 7.0F, 5.0F), ModelTransform.pivot(2.0F,12.0F,1.0F));
		ModelPartData modelPartData23 = modelPartData22.addChild("heart3", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F,12.0F,-1.0F));
		modelPartData23.addChild("Shape26", ModelPartBuilder.create().uv(71,17).cuboid(5.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		modelPartData23.addChild("Shape27", ModelPartBuilder.create().uv(53,71).cuboid(-4.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		modelPartData22.addChild("legdownl", ModelPartBuilder.create().uv(0,42).cuboid(-2.5F, -1.5F, -2.5F, 5.0F, 9.0F, 5.0F), ModelTransform.pivot(0.159F,7.7483F,1.0008F));
		ModelPartData modelPartData24 = modelPartData5.addChild("rightleg", ModelPartBuilder.create().uv(0,56).cuboid(-3.0F, 0.0F, -3.0F, 5.0F, 7.0F, 5.0F, true), ModelTransform.pivot(-2.0F,12.0F,1.0F));
		ModelPartData modelPartData25 = modelPartData24.addChild("heart4", ModelPartBuilder.create(), ModelTransform.pivot(-1.3914F,5.6025F,-0.3263F));
		modelPartData25.addChild("Shape9", ModelPartBuilder.create().uv(71,17).cuboid(-8.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(3.6F,-7.9F,-2.5F));
		modelPartData25.addChild("Shape28", ModelPartBuilder.create().uv(53,71).cuboid(1.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(2.4F,-7.9F,-2.5F));
		modelPartData24.addChild("legdownr", ModelPartBuilder.create().uv(0,42).cuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F, true), ModelTransform.pivot(-0.1399F,6.4114F,0.1706F));
		ModelPartData modelPartData26 = modelPartData.addChild("head2", ModelPartBuilder.create().uv(21,21).cuboid(-3.5F, -6.0F, -3.0F, 7.0F, 6.0F, 7.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData26.addChild("Shape13", ModelPartBuilder.create().uv(26,5).cuboid(-4.6F, -8.0F, 0.0F, 9.0F, 3.0F, 6.0F, new Dilation(0.01F)), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData26.addChild("Shape14", ModelPartBuilder.create().uv(65,68).cuboid(-3.0F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, new Dilation(0.02F)), ModelTransform.pivot(3.854F,-7.8722F,2.5976F));
		modelPartData26.addChild("Shape45", ModelPartBuilder.create().uv(0,68).cuboid(0.0F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, new Dilation(0.02F)), ModelTransform.pivot(-3.854F,-7.8722F,2.5976F));
		modelPartData26.addChild("Shape59", ModelPartBuilder.create().uv(0,0).cuboid(-4.5F, -7.2F, -1.7F, 9.0F, 4.0F, 7.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData26.addChild("Shape62", ModelPartBuilder.create().uv(22,14).cuboid(-4.5F, -4.2F, 3.3F, 9.0F, 1.0F, 2.0F), ModelTransform.pivot(0.0F,1.4F,0.0F));
		modelPartData26.addChild("Shape63", ModelPartBuilder.create().uv(62,17).cuboid(-4.5F, -6.2F, -1.7F, 1.0F, 3.0F, 7.0F), ModelTransform.pivot(0.3F,2.9432F,-0.7469F));
		modelPartData26.addChild("Shape64", ModelPartBuilder.create().uv(20,60).cuboid(3.5F, -6.2F, -1.7F, 1.0F, 3.0F, 7.0F), ModelTransform.pivot(-0.3F,2.9432F,-0.7469F));
		ModelPartData modelPartData27 = modelPartData26.addChild("glass2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-0.8F,0.1F));
		modelPartData27.addChild("Shape65", ModelPartBuilder.create().uv(58,38).cuboid(2.6251F, -6.9618F, -2.9109F, 3.0F, 2.0F, 6.0F), ModelTransform.pivot(0.0F,0.0F,1.0F));
		ModelPartData modelPartData28 = modelPartData27.addChild("bone2", ModelPartBuilder.create(), ModelTransform.pivot(1.5111F,-4.2251F,-2.5709F));
		modelPartData28.addChild("Shape66", ModelPartBuilder.create().uv(63,46).cuboid(-0.7F, 1.0F, -2.3F, 2.0F, 2.0F, 5.0F, new Dilation(-0.1F)), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData28.addChild("Shape67", ModelPartBuilder.create().uv(22,34).cuboid(0.3F, -1.0F, -2.4F, 1.0F, 3.0F, 1.0F, new Dilation(-0.11F)), ModelTransform.pivot(0.0606F,-0.1107F,0.5693F));
		modelPartData28.addChild("Shape68", ModelPartBuilder.create().uv(0,24).cuboid(-1.3F, -1.0F, -2.4F, 1.0F, 3.0F, 1.0F, new Dilation(-0.11F)), ModelTransform.pivot(-3.0829F,-0.1107F,0.5693F));
		modelPartData28.addChild("Shape69", ModelPartBuilder.create().uv(63,27).cuboid(-1.3F, 1.0F, -2.6F, 2.0F, 2.0F, 5.0F, new Dilation(-0.1F)), ModelTransform.pivot(-3.2942F,-0.0242F,0.1244F));
		modelPartData27.addChild("Shape70", ModelPartBuilder.create().uv(57,9).cuboid(-5.6251F, -6.9618F, -2.9109F, 3.0F, 2.0F, 6.0F), ModelTransform.pivot(0.0F,0.0F,1.0F));
		ModelPartData modelPartData29 = modelPartData26.addChild("heart8", ModelPartBuilder.create(), ModelTransform.pivot(-2.55F,5.5F,-0.8F));
		modelPartData29.addChild("Shape71", ModelPartBuilder.create().uv(40,17).cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F), ModelTransform.pivot(2.1717F,-5.3382F,-2.2F));
		modelPartData29.addChild("Shape72", ModelPartBuilder.create().uv(25,5).cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F), ModelTransform.pivot(2.9111F,-5.3333F,-2.2F));
		ModelPartData modelPartData30 = modelPartData.addChild("body2", ModelPartBuilder.create().uv(0,11).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 6.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData30.addChild("bodydown2", ModelPartBuilder.create().uv(44,29).cuboid(-3.5F, 7.0F, -1.6F, 7.0F, 4.0F, 5.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData30.addChild("Shape73", ModelPartBuilder.create().uv(25,0).cuboid(-3.5F, 0.2F, -2.9F, 7.0F, 4.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData30.addChild("Shape74", ModelPartBuilder.create().uv(63,53).cuboid(-3.0F, 0.2F, -3.9F, 6.0F, 1.0F, 2.0F), ModelTransform.pivot(0.0F,0.0F,6.6F));
		modelPartData30.addChild("Shape75", ModelPartBuilder.create().uv(64,63).cuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F), ModelTransform.pivot(0.0F,5.0F,6.6F));
		modelPartData30.addChild("Shape76", ModelPartBuilder.create().uv(41,0).cuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F), ModelTransform.pivot(-1.691F,3.0301F,6.5F));
		modelPartData30.addChild("Shape77", ModelPartBuilder.create().uv(28,17).cuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F), ModelTransform.pivot(1.691F,3.0301F,6.5F));
		ModelPartData modelPartData31 = modelPartData30.addChild("heart9", ModelPartBuilder.create(), ModelTransform.pivot(-0.6F,6.1F,-2.0F));
		modelPartData31.addChild("Shape78", ModelPartBuilder.create().uv(0,74).cuboid(-1.3468F, -1.1286F, -0.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.01F)), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData31.addChild("Shape79", ModelPartBuilder.create().uv(20,73).cuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(1.2F,0.0F,0.0F));
		ModelPartData modelPartData32 = modelPartData30.addChild("heart10", ModelPartBuilder.create(), ModelTransform.pivot(-0.6F,9.9F,-2.3F));
		modelPartData32.addChild("Shape80", ModelPartBuilder.create().uv(12,68).cuboid(-1.3468F, -1.1286F, -0.5F, 3.0F, 2.0F, 2.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		modelPartData32.addChild("Shape81", ModelPartBuilder.create().uv(15,24).cuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F), ModelTransform.pivot(1.2F,0.0F,0.0F));
		modelPartData30.addChild("Shape82", ModelPartBuilder.create().uv(0,34).cuboid(-4.0F, 10.0F, -2.4F, 8.0F, 2.0F, 6.0F), ModelTransform.pivot(0.0F,0.0F,0.3F));
		ModelPartData modelPartData33 = modelPartData30.addChild("Shape83", ModelPartBuilder.create().uv(69,7).cuboid(-4.75F, -18.3333F, 3.25F, 5.0F, 1.0F, 2.0F), ModelTransform.pivot(-6.55F,20.2333F,0.45F));
		modelPartData33.addChild("Shape84", ModelPartBuilder.create().uv(0,33).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F), ModelTransform.pivot(-4.6377F,-18.199F,3.453F));
		modelPartData33.addChild("Shape85", ModelPartBuilder.create().uv(27,70).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F), ModelTransform.pivot(-4.8679F,-19.0863F,2.2888F));
		modelPartData33.addChild("Shape86", ModelPartBuilder.create().uv(48,63).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F), ModelTransform.pivot(-5.9496F,-20.8982F,0.1061F));
		modelPartData33.addChild("Shape87", ModelPartBuilder.create().uv(15,57).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F), ModelTransform.pivot(-4.9121F,-20.9909F,-1.8343F));
		modelPartData33.addChild("Shape88", ModelPartBuilder.create().uv(35,48).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F), ModelTransform.pivot(-3.2972F,-19.3926F,-2.1498F));
		ModelPartData modelPartData34 = modelPartData30.addChild("Shape89", ModelPartBuilder.create().uv(69,7).cuboid(-0.25F, -18.3333F, 3.25F, 5.0F, 1.0F, 2.0F, true), ModelTransform.pivot(6.55F,20.2333F,0.45F));
		modelPartData34.addChild("Shape90", ModelPartBuilder.create().uv(0,33).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, true), ModelTransform.pivot(4.6377F,-18.199F,3.453F));
		modelPartData34.addChild("Shape91", ModelPartBuilder.create().uv(27,70).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, true), ModelTransform.pivot(4.8679F,-19.0863F,2.2888F));
		modelPartData34.addChild("Shape92", ModelPartBuilder.create().uv(48,63).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, true), ModelTransform.pivot(5.9496F,-20.8982F,0.1061F));
		modelPartData34.addChild("Shape93", ModelPartBuilder.create().uv(15,57).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, true), ModelTransform.pivot(4.9121F,-20.9909F,-1.8343F));
		modelPartData34.addChild("Shape94", ModelPartBuilder.create().uv(35,48).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, true), ModelTransform.pivot(3.2972F,-19.3926F,-2.1498F));
		ModelPartData modelPartData35 = modelPartData30.addChild("Shape95", ModelPartBuilder.create().uv(65,0).cuboid(-14.725F, -20.825F, 2.6F, 5.0F, 1.0F, 2.0F), ModelTransform.pivot(-8.675F,23.625F,-0.7F));
		modelPartData35.addChild("Shape96", ModelPartBuilder.create().uv(15,42).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F), ModelTransform.pivot(-15.2936F,-20.6847F,2.0575F));
		modelPartData35.addChild("Shape97", ModelPartBuilder.create().uv(0,11).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F), ModelTransform.pivot(-15.4301F,-20.8993F,-0.3314F));
		modelPartData35.addChild("Shape98", ModelPartBuilder.create().uv(22,34).cuboid(-3.1F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F), ModelTransform.pivot(-12.2338F,-19.6953F,-3.069F));
		ModelPartData modelPartData36 = modelPartData30.addChild("Shape99", ModelPartBuilder.create().uv(65,0).cuboid(9.725F, -20.825F, 2.6F, 5.0F, 1.0F, 2.0F, true), ModelTransform.pivot(8.675F,23.625F,-0.7F));
		modelPartData36.addChild("Shape100", ModelPartBuilder.create().uv(15,42).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F, true), ModelTransform.pivot(15.2936F,-20.6847F,2.0575F));
		modelPartData36.addChild("Shape101", ModelPartBuilder.create().uv(0,11).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, true), ModelTransform.pivot(15.4301F,-20.8993F,-0.3314F));
		modelPartData36.addChild("Shape102", ModelPartBuilder.create().uv(22,34).cuboid(2.1F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F, true), ModelTransform.pivot(12.2338F,-19.6953F,-3.069F));
		ModelPartData modelPartData37 = modelPartData30.addChild("Shape103", ModelPartBuilder.create().uv(20,70).cuboid(3.45F, -12.6F, 1.4F, 3.0F, 1.0F, 2.0F), ModelTransform.pivot(7.85F,-8.8F,6.7F));
		modelPartData37.addChild("Shape104", ModelPartBuilder.create().uv(0,0).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F), ModelTransform.pivot(3.4582F,-11.6401F,2.4486F));
		ModelPartData modelPartData38 = modelPartData30.addChild("Shape105", ModelPartBuilder.create().uv(20,70).cuboid(-6.45F, -12.6F, 1.4F, 3.0F, 1.0F, 2.0F, true), ModelTransform.pivot(-7.85F,-8.8F,6.7F));
		modelPartData38.addChild("Shape106", ModelPartBuilder.create().uv(0,0).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, true), ModelTransform.pivot(-3.4582F,-11.6401F,2.4486F));
		modelPartData30.addChild("leftarm2", ModelPartBuilder.create().uv(50,0).cuboid(-1.0F, -2.0F, -2.0F, 5.0F, 4.0F, 5.0F), ModelTransform.pivot(5.0F,2.0F,-0.1F));
		modelPartData30.addChild("rightarm2", ModelPartBuilder.create().uv(0,24).cuboid(-4.0F, -2.0F, -2.0F, 5.0F, 4.0F, 5.0F), ModelTransform.pivot(-5.0F,2.0F,-0.1F));
		ModelPartData modelPartData39 = modelPartData30.addChild("leftleg2", ModelPartBuilder.create().uv(0,56).cuboid(-2.0F, 0.0F, -3.0F, 5.0F, 7.0F, 5.0F), ModelTransform.pivot(2.0F,12.0F,1.0F));
		ModelPartData modelPartData40 = modelPartData39.addChild("heart11", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F,12.0F,-1.0F));
		modelPartData40.addChild("Shape107", ModelPartBuilder.create().uv(71,17).cuboid(5.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		modelPartData40.addChild("Shape108", ModelPartBuilder.create().uv(53,71).cuboid(-4.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		modelPartData39.addChild("legdownl2", ModelPartBuilder.create().uv(0,42).cuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F), ModelTransform.pivot(1.2618F,5.8899F,1.1453F));
		ModelPartData modelPartData41 = modelPartData30.addChild("rightleg2", ModelPartBuilder.create().uv(0,56).cuboid(-3.0F, 0.0F, -3.0F, 5.0F, 7.0F, 5.0F, true), ModelTransform.pivot(-2.0F,12.0F,1.0F));
		ModelPartData modelPartData42 = modelPartData41.addChild("heart12", ModelPartBuilder.create(), ModelTransform.pivot(2.0F,12.0F,-1.0F));
		modelPartData42.addChild("Shape109", ModelPartBuilder.create().uv(71,17).cuboid(-8.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		modelPartData42.addChild("Shape110", ModelPartBuilder.create().uv(53,71).cuboid(1.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		modelPartData41.addChild("legdownr2", ModelPartBuilder.create().uv(0,42).cuboid(-2.8F, -0.9F, -0.8F, 5.0F, 9.0F, 5.0F, true), ModelTransform.pivot(-0.2311F,7.3716F,-0.1109F));
		ModelPartData modelPartData43 = modelPartData.addChild("viewFirst", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,3.45F,0.2F));
		ModelPartData modelPartData44 = modelPartData43.addChild("left_hands_ro", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData45 = modelPartData44.addChild("handl1", ModelPartBuilder.create().uv(43,43).cuboid(15.5F, -2.35F, -1.5F, 5.0F, 9.0F, 5.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData46 = modelPartData45.addChild("armmiddle3", ModelPartBuilder.create().uv(55,57).cuboid(15.3F, -3.7F, -1.35F, 5.0F, 1.0F, 5.0F), ModelTransform.pivot(0.0F,0.55F,-0.2F));
		ModelPartData modelPartData47 = modelPartData46.addChild("heart13", ModelPartBuilder.create(), ModelTransform.pivot(10.7F,-5.6F,-5.0F));
		modelPartData47.addChild("Shape111", ModelPartBuilder.create().uv(72,46).cuboid(13.2893F, 6.8241F, -7.6F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		modelPartData47.addChild("Shape112", ModelPartBuilder.create().uv(72,27).cuboid(-6.7903F, 14.7947F, -7.6F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		ModelPartData modelPartData48 = modelPartData44.addChild("handl2", ModelPartBuilder.create().uv(43,43).cuboid(11.5F, -7.55F, -9.8F, 5.0F, 9.0F, 5.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData49 = modelPartData48.addChild("armmiddle4", ModelPartBuilder.create().uv(55,57).cuboid(11.3F, -8.9F, -9.65F, 5.0F, 1.0F, 5.0F), ModelTransform.pivot(0.0F,0.55F,-0.2F));
		ModelPartData modelPartData50 = modelPartData49.addChild("heart14", ModelPartBuilder.create(), ModelTransform.pivot(10.7F,-5.6F,-5.0F));
		modelPartData50.addChild("Shape113", ModelPartBuilder.create().uv(72,46).cuboid(3.5886F, 8.1758F, -3.6F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		modelPartData50.addChild("Shape114", ModelPartBuilder.create().uv(72,27).cuboid(-9.806F, 5.4761F, -3.6F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		ModelPartData modelPartData51 = modelPartData44.addChild("handl3", ModelPartBuilder.create().uv(43,43).cuboid(14.5F, -0.25F, 6.4F, 5.0F, 9.0F, 5.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData52 = modelPartData51.addChild("armmiddle5", ModelPartBuilder.create().uv(55,57).cuboid(14.3F, -1.6F, 6.55F, 5.0F, 1.0F, 5.0F), ModelTransform.pivot(0.0F,0.55F,-0.2F));
		ModelPartData modelPartData53 = modelPartData52.addChild("heart15", ModelPartBuilder.create(), ModelTransform.pivot(10.7F,-5.6F,-5.0F));
		modelPartData53.addChild("Shape115", ModelPartBuilder.create().uv(72,46).cuboid(20.6909F, 3.3548F, -6.6F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		modelPartData53.addChild("Shape116", ModelPartBuilder.create().uv(72,27).cuboid(-2.0884F, 21.4814F, -6.6F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		ModelPartData modelPartData54 = modelPartData44.addChild("handl4", ModelPartBuilder.create().uv(43,43).cuboid(18.9F, 3.95F, -10.4F, 5.0F, 9.0F, 5.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData55 = modelPartData54.addChild("armmiddle6", ModelPartBuilder.create().uv(55,57).cuboid(18.7F, 2.6F, -10.25F, 5.0F, 1.0F, 5.0F), ModelTransform.pivot(0.0F,0.55F,-0.2F));
		ModelPartData modelPartData56 = modelPartData55.addChild("heart16", ModelPartBuilder.create(), ModelTransform.pivot(10.7F,-5.6F,-5.0F));
		modelPartData56.addChild("Shape117", ModelPartBuilder.create().uv(72,46).cuboid(10.5211F, 17.371F, -11.0F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		modelPartData56.addChild("Shape118", ModelPartBuilder.create().uv(72,27).cuboid(-17.6577F, 13.9F, -11.0F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		ModelPartData modelPartData57 = modelPartData44.addChild("handl5", ModelPartBuilder.create().uv(43,43).cuboid(21.6F, -7.65F, 3.6F, 5.0F, 9.0F, 5.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData58 = modelPartData57.addChild("armmiddle7", ModelPartBuilder.create().uv(55,57).cuboid(21.4F, -9.0F, 3.75F, 5.0F, 1.0F, 5.0F), ModelTransform.pivot(0.0F,0.55F,-0.2F));
		ModelPartData modelPartData59 = modelPartData58.addChild("heart17", ModelPartBuilder.create(), ModelTransform.pivot(10.7F,-5.6F,-5.0F));
		modelPartData59.addChild("Shape119", ModelPartBuilder.create().uv(72,46).cuboid(13.7893F, -0.5141F, -13.7F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		modelPartData59.addChild("Shape120", ModelPartBuilder.create().uv(72,27).cuboid(0.5233F, 14.0129F, -13.7F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		ModelPartData modelPartData60 = modelPartData43.addChild("right_hands_ro", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData61 = modelPartData60.addChild("handr1", ModelPartBuilder.create().uv(43,43).cuboid(-26.6F, -0.95F, -1.5F, 5.0F, 9.0F, 5.0F, true), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData62 = modelPartData61.addChild("armmiddle8", ModelPartBuilder.create().uv(55,57).cuboid(-26.4F, -2.3F, -1.35F, 5.0F, 1.0F, 5.0F, true), ModelTransform.pivot(0.0F,0.55F,-0.2F));
		ModelPartData modelPartData63 = modelPartData62.addChild("heart18", ModelPartBuilder.create(), ModelTransform.pivot(-10.7F,-5.6F,-5.0F));
		modelPartData63.addChild("Shape121", ModelPartBuilder.create().uv(72,46).cuboid(-17.1892F, 7.8966F, -13.7F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		modelPartData63.addChild("Shape122", ModelPartBuilder.create().uv(72,27).cuboid(4.6902F, 15.8672F, -13.7F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		ModelPartData modelPartData64 = modelPartData60.addChild("handr2", ModelPartBuilder.create().uv(43,43).cuboid(-19.4F, 9.65F, -9.8F, 5.0F, 9.0F, 5.0F, true), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData65 = modelPartData64.addChild("armmiddle9", ModelPartBuilder.create().uv(55,57).cuboid(-19.2F, 8.3F, -9.65F, 5.0F, 1.0F, 5.0F, true), ModelTransform.pivot(0.0F,0.55F,-0.2F));
		ModelPartData modelPartData66 = modelPartData65.addChild("heart19", ModelPartBuilder.create(), ModelTransform.pivot(-10.7F,-5.6F,-5.0F));
		modelPartData66.addChild("Shape123", ModelPartBuilder.create().uv(72,46).cuboid(-17.6446F, 21.3518F, -6.5F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		modelPartData66.addChild("Shape124", ModelPartBuilder.create().uv(72,27).cuboid(17.862F, 18.6521F, -6.5F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		ModelPartData modelPartData67 = modelPartData60.addChild("handr3", ModelPartBuilder.create().uv(43,43).cuboid(-21.3F, -0.25F, 6.4F, 5.0F, 9.0F, 5.0F, true), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData68 = modelPartData67.addChild("armmiddle10", ModelPartBuilder.create().uv(55,57).cuboid(-21.1F, -1.6F, 6.55F, 5.0F, 1.0F, 5.0F, true), ModelTransform.pivot(0.0F,0.55F,-0.2F));
		ModelPartData modelPartData69 = modelPartData68.addChild("heart20", ModelPartBuilder.create(), ModelTransform.pivot(-10.7F,-5.6F,-5.0F));
		modelPartData69.addChild("Shape125", ModelPartBuilder.create().uv(72,46).cuboid(-23.6909F, 3.3548F, -8.4F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		modelPartData69.addChild("Shape126", ModelPartBuilder.create().uv(72,27).cuboid(-0.9116F, 21.4814F, -8.4F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		ModelPartData modelPartData70 = modelPartData60.addChild("handr4", ModelPartBuilder.create().uv(43,43).cuboid(-23.9F, -2.95F, -10.4F, 5.0F, 9.0F, 5.0F, true), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData71 = modelPartData70.addChild("armmiddle11", ModelPartBuilder.create().uv(55,57).cuboid(-23.7F, -4.3F, -10.25F, 5.0F, 1.0F, 5.0F, true), ModelTransform.pivot(0.0F,0.55F,-0.2F));
		ModelPartData modelPartData72 = modelPartData71.addChild("heart21", ModelPartBuilder.create(), ModelTransform.pivot(-10.7F,-5.6F,-5.0F));
		modelPartData72.addChild("Shape127", ModelPartBuilder.create().uv(72,46).cuboid(-9.0858F, 12.0853F, -11.0F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		modelPartData72.addChild("Shape128", ModelPartBuilder.create().uv(72,27).cuboid(10.2225F, 8.6143F, -11.0F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		ModelPartData modelPartData73 = modelPartData60.addChild("handr5", ModelPartBuilder.create().uv(43,43).cuboid(-17.2F, -7.65F, -0.5F, 5.0F, 9.0F, 5.0F, true), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData74 = modelPartData73.addChild("armmiddle12", ModelPartBuilder.create().uv(55,57).cuboid(-17.0F, -9.0F, -0.35F, 5.0F, 1.0F, 5.0F, true), ModelTransform.pivot(0.0F,0.55F,-0.2F));
		ModelPartData modelPartData75 = modelPartData74.addChild("heart22", ModelPartBuilder.create(), ModelTransform.pivot(-10.7F,-5.6F,-5.0F));
		modelPartData75.addChild("Shape129", ModelPartBuilder.create().uv(72,46).cuboid(-13.6486F, 2.1213F, -4.3F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		modelPartData75.addChild("Shape130", ModelPartBuilder.create().uv(72,27).cuboid(-0.3825F, 11.3774F, -4.3F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		ModelPartData modelPartData76 = modelPartData.addChild("healfist", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,24.0F,0.0F));
		ModelPartData modelPartData77 = modelPartData76.addChild("left_hands_ro2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-20.55F,0.2F));
		ModelPartData modelPartData78 = modelPartData77.addChild("handl6", ModelPartBuilder.create().uv(0,82).cuboid(15.5F, -2.35F, -1.5F, 5.0F, 9.0F, 5.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData79 = modelPartData78.addChild("armmiddle13", ModelPartBuilder.create().uv(55,57).cuboid(15.3F, -3.7F, -1.35F, 5.0F, 1.0F, 5.0F), ModelTransform.pivot(0.0F,0.55F,-0.2F));
		ModelPartData modelPartData80 = modelPartData79.addChild("heart23", ModelPartBuilder.create(), ModelTransform.pivot(10.7F,-5.6F,-5.0F));
		modelPartData80.addChild("Shape131", ModelPartBuilder.create().uv(72,46).cuboid(13.2893F, 6.8241F, -7.6F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		modelPartData80.addChild("Shape132", ModelPartBuilder.create().uv(72,27).cuboid(-6.7903F, 14.7947F, -7.6F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		ModelPartData modelPartData81 = modelPartData77.addChild("handl7", ModelPartBuilder.create().uv(0,82).cuboid(11.5F, -7.55F, -9.8F, 5.0F, 9.0F, 5.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData82 = modelPartData81.addChild("armmiddle14", ModelPartBuilder.create().uv(55,57).cuboid(11.3F, -8.9F, -9.65F, 5.0F, 1.0F, 5.0F), ModelTransform.pivot(0.0F,0.55F,-0.2F));
		ModelPartData modelPartData83 = modelPartData82.addChild("heart24", ModelPartBuilder.create(), ModelTransform.pivot(10.7F,-5.6F,-5.0F));
		modelPartData83.addChild("Shape133", ModelPartBuilder.create().uv(72,46).cuboid(3.5886F, 8.1758F, -3.6F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		modelPartData83.addChild("Shape134", ModelPartBuilder.create().uv(72,27).cuboid(-9.806F, 5.4761F, -3.6F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		ModelPartData modelPartData84 = modelPartData77.addChild("handl8", ModelPartBuilder.create().uv(0,82).cuboid(14.5F, 0.85F, 6.4F, 5.0F, 9.0F, 5.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData85 = modelPartData84.addChild("armmiddle15", ModelPartBuilder.create().uv(55,57).cuboid(14.3F, -1.6F, 6.55F, 5.0F, 1.0F, 5.0F), ModelTransform.pivot(0.0F,0.55F,-0.2F));
		ModelPartData modelPartData86 = modelPartData85.addChild("heart25", ModelPartBuilder.create(), ModelTransform.pivot(10.7F,-5.6F,-5.0F));
		modelPartData86.addChild("Shape135", ModelPartBuilder.create().uv(72,46).cuboid(20.6909F, 3.3548F, -6.6F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		modelPartData86.addChild("Shape136", ModelPartBuilder.create().uv(72,27).cuboid(-2.0884F, 21.4814F, -6.6F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		ModelPartData modelPartData87 = modelPartData77.addChild("handl9", ModelPartBuilder.create().uv(0,82).cuboid(18.9F, 3.95F, -10.4F, 5.0F, 9.0F, 5.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData88 = modelPartData87.addChild("armmiddle16", ModelPartBuilder.create().uv(55,57).cuboid(18.7F, 2.6F, -10.25F, 5.0F, 1.0F, 5.0F), ModelTransform.pivot(0.0F,0.55F,-0.2F));
		ModelPartData modelPartData89 = modelPartData88.addChild("heart26", ModelPartBuilder.create(), ModelTransform.pivot(10.7F,-5.6F,-5.0F));
		modelPartData89.addChild("Shape137", ModelPartBuilder.create().uv(72,46).cuboid(10.5211F, 17.371F, -11.0F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		modelPartData89.addChild("Shape138", ModelPartBuilder.create().uv(72,27).cuboid(-17.6577F, 13.9F, -11.0F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		ModelPartData modelPartData90 = modelPartData77.addChild("handl10", ModelPartBuilder.create().uv(0,82).cuboid(21.6F, -6.65F, 3.6F, 5.0F, 9.0F, 5.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData91 = modelPartData90.addChild("armmiddle17", ModelPartBuilder.create().uv(55,57).cuboid(21.4F, -9.0F, 3.75F, 5.0F, 1.0F, 5.0F), ModelTransform.pivot(0.0F,0.55F,-0.2F));
		ModelPartData modelPartData92 = modelPartData91.addChild("heart27", ModelPartBuilder.create(), ModelTransform.pivot(10.7F,-5.6F,-5.0F));
		modelPartData92.addChild("Shape139", ModelPartBuilder.create().uv(72,46).cuboid(13.7893F, -0.5141F, -13.7F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		modelPartData92.addChild("Shape140", ModelPartBuilder.create().uv(72,27).cuboid(0.5233F, 14.0129F, -13.7F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		ModelPartData modelPartData93 = modelPartData76.addChild("right_hands_ro2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-20.55F,0.2F));
		ModelPartData modelPartData94 = modelPartData93.addChild("handr6", ModelPartBuilder.create().uv(0,82).cuboid(-26.6F, -0.95F, -1.5F, 5.0F, 9.0F, 5.0F, true), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData95 = modelPartData94.addChild("armmiddle18", ModelPartBuilder.create().uv(55,57).cuboid(-26.4F, -2.3F, -1.35F, 5.0F, 1.0F, 5.0F, true), ModelTransform.pivot(0.0F,0.55F,-0.2F));
		ModelPartData modelPartData96 = modelPartData95.addChild("heart28", ModelPartBuilder.create(), ModelTransform.pivot(-10.7F,-5.6F,-5.0F));
		modelPartData96.addChild("Shape141", ModelPartBuilder.create().uv(72,46).cuboid(-17.1892F, 7.8966F, -13.7F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		modelPartData96.addChild("Shape142", ModelPartBuilder.create().uv(72,27).cuboid(4.6902F, 15.8672F, -13.7F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		ModelPartData modelPartData97 = modelPartData93.addChild("handr7", ModelPartBuilder.create().uv(0,82).cuboid(-19.4F, 9.65F, -9.8F, 5.0F, 9.0F, 5.0F, true), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData98 = modelPartData97.addChild("armmiddle19", ModelPartBuilder.create().uv(55,57).cuboid(-19.2F, 8.3F, -9.65F, 5.0F, 1.0F, 5.0F, true), ModelTransform.pivot(0.0F,0.55F,-0.2F));
		ModelPartData modelPartData99 = modelPartData98.addChild("heart29", ModelPartBuilder.create(), ModelTransform.pivot(-10.7F,-5.6F,-5.0F));
		modelPartData99.addChild("Shape143", ModelPartBuilder.create().uv(72,46).cuboid(-17.6446F, 21.3518F, -6.5F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		modelPartData99.addChild("Shape144", ModelPartBuilder.create().uv(72,27).cuboid(17.862F, 18.6521F, -6.5F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		ModelPartData modelPartData100 = modelPartData93.addChild("handr8", ModelPartBuilder.create().uv(0,82).cuboid(-21.3F, 0.75F, 6.4F, 5.0F, 9.0F, 5.0F, true), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData101 = modelPartData100.addChild("armmiddle20", ModelPartBuilder.create().uv(55,57).cuboid(-21.1F, -1.6F, 6.55F, 5.0F, 1.0F, 5.0F, true), ModelTransform.pivot(0.0F,0.55F,-0.2F));
		ModelPartData modelPartData102 = modelPartData101.addChild("heart30", ModelPartBuilder.create(), ModelTransform.pivot(-10.7F,-5.6F,-5.0F));
		modelPartData102.addChild("Shape145", ModelPartBuilder.create().uv(72,46).cuboid(-23.6909F, 3.3548F, -8.4F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		modelPartData102.addChild("Shape146", ModelPartBuilder.create().uv(72,27).cuboid(-0.9116F, 21.4814F, -8.4F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		ModelPartData modelPartData103 = modelPartData93.addChild("handr9", ModelPartBuilder.create().uv(0,82).cuboid(-23.9F, -1.95F, -10.4F, 5.0F, 9.0F, 5.0F, true), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData104 = modelPartData103.addChild("armmiddle21", ModelPartBuilder.create().uv(55,57).cuboid(-23.7F, -4.3F, -10.25F, 5.0F, 1.0F, 5.0F, true), ModelTransform.pivot(0.0F,0.55F,-0.2F));
		ModelPartData modelPartData105 = modelPartData104.addChild("heart31", ModelPartBuilder.create(), ModelTransform.pivot(-10.7F,-5.6F,-5.0F));
		modelPartData105.addChild("Shape147", ModelPartBuilder.create().uv(72,46).cuboid(-9.0858F, 12.0853F, -11.0F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		modelPartData105.addChild("Shape148", ModelPartBuilder.create().uv(72,27).cuboid(10.2225F, 8.6143F, -11.0F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		ModelPartData modelPartData106 = modelPartData93.addChild("handr10", ModelPartBuilder.create().uv(0,82).cuboid(-17.2F, -6.65F, -0.5F, 5.0F, 9.0F, 5.0F, true), ModelTransform.pivot(0.0F,0.0F,0.0F));
		ModelPartData modelPartData107 = modelPartData106.addChild("armmiddle22", ModelPartBuilder.create().uv(55,57).cuboid(-17.0F, -9.0F, -0.35F, 5.0F, 1.0F, 5.0F, true), ModelTransform.pivot(0.0F,0.55F,-0.2F));
		ModelPartData modelPartData108 = modelPartData107.addChild("heart32", ModelPartBuilder.create(), ModelTransform.pivot(-10.7F,-5.6F,-5.0F));
		modelPartData108.addChild("Shape149", ModelPartBuilder.create().uv(72,46).cuboid(-13.6486F, 2.1213F, -4.3F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(0.6F,-12.9F,-2.5F));
		modelPartData108.addChild("Shape150", ModelPartBuilder.create().uv(72,27).cuboid(-0.3825F, 11.3774F, -4.3F, 3.0F, 2.0F, 1.0F, true), ModelTransform.pivot(-0.6F,-12.9F,-2.5F));
		return TexturedModelData.of(modelData,128,128);
		 */


		ModelPartData body2 = modelPartData.addChild("body2",
				ModelPartBuilder.create()
						.uv(0, 11).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 6.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		body2.addChild("bodydown2",
				ModelPartBuilder.create()
						.uv(44, 29).cuboid(-3.5F, 7.0F, -1.6F, 7.0F, 4.0F, 5.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));
		body2.addChild("Shape73",
				ModelPartBuilder.create()
						.uv(25, 0).cuboid(-3.5F, 0.2F, -2.9F, 7.0F, 4.0F, 1.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));
		body2.addChild("Shape74",
				ModelPartBuilder.create()
						.uv(63, 53).cuboid(-3.0F, 0.2F, -3.9F, 6.0F, 1.0F, 2.0F),
				ModelTransform.of(0.0F, 0.0F, 6.6F, 0.0F, 0.0F, 0.0F));
		body2.addChild("Shape75",
				ModelPartBuilder.create()
						.uv(64, 63).cuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F),
				ModelTransform.of(0.0F, 5.0F, 6.6F, 0.0F, 0.0F, 0.0F));
		body2.addChild("Shape76",
				ModelPartBuilder.create()
						.uv(41, 0).cuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F),
				ModelTransform.of(-1.691F, 3.0301F, 6.5F, 0.0F, 0.0F, 1.1345F));
		body2.addChild("Shape77",
				ModelPartBuilder.create()
						.uv(28, 17).cuboid(-2.5F, -0.8F, -3.9F, 5.0F, 2.0F, 2.0F),
				ModelTransform.of(1.691F, 3.0301F, 6.5F, 0.0F, 0.0F, -1.1345F));
		ModelPartData heart9 = body2.addChild("heart9",
				ModelPartBuilder.create(),
				ModelTransform.of(-0.6F, 6.1F, -2.0F, 0.0F, 0.0F, 0.0F));
		heart9.addChild("Shape78",
				ModelPartBuilder.create()
						.uv(0, 74).cuboid(-1.3468F, -1.1286F, -0.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.01F, 0.01F, 0.01F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6981F));
		heart9.addChild("Shape79",
				ModelPartBuilder.create()
						.uv(20, 73).cuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F),
				ModelTransform.of(1.2F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6981F));
		ModelPartData heart10 = body2.addChild("heart10",
				ModelPartBuilder.create(),
				ModelTransform.of(-0.6F, 9.9F, -2.3F, 0.0F, 0.0F, 0.0F));
		heart10.addChild("Shape80",
				ModelPartBuilder.create()
						.uv(12, 68).cuboid(-1.3468F, -1.1286F, -0.5F, 3.0F, 2.0F, 2.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6981F));
		heart10.addChild("Shape81",
				ModelPartBuilder.create()
						.uv(15, 24).cuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(1.2F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6981F));
		body2.addChild("Shape82",
				ModelPartBuilder.create()
						.uv(0, 34).cuboid(-4.0F, 10.0F, -2.4F, 8.0F, 2.0F, 6.0F),
				ModelTransform.of(0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F));
		ModelPartData Shape83 = body2.addChild("Shape83",
				ModelPartBuilder.create()
						.uv(69, 7).cuboid(-4.75F, -18.3333F, 3.25F, 5.0F, 1.0F, 2.0F),
				ModelTransform.of(-6.55F, 20.2333F, 0.45F, 0.0F, 0.3316F, 0.2443F));
		Shape83.addChild("Shape84",
				ModelPartBuilder.create()
						.uv(0, 33).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F),
				ModelTransform.of(-4.6377F, -18.199F, 3.453F, 0.5236F, -2.8623F, 0.0785F));
		Shape83.addChild("Shape85",
				ModelPartBuilder.create()
						.uv(27, 70).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(-4.8679F, -19.0863F, 2.2888F, 0.5236F, -2.2864F, 0.0785F));
		Shape83.addChild("Shape86",
				ModelPartBuilder.create()
						.uv(48, 63).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(-5.9496F, -20.8982F, 0.1061F, 0.5236F, 2.7314F, 0.0785F));
		Shape83.addChild("Shape87",
				ModelPartBuilder.create()
						.uv(15, 57).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(-4.9121F, -20.9909F, -1.8343F, -0.5236F, 2.1031F, 0.0785F));
		Shape83.addChild("Shape88",
				ModelPartBuilder.create()
						.uv(35, 48).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(-3.2972F, -19.3926F, -2.1498F, -0.5236F, 1.1781F, 0.0785F));
		ModelPartData Shape89 = body2.addChild("Shape89",
				ModelPartBuilder.create()
						.uv(69, 7).mirrored(true).cuboid(-0.25F, -18.3333F, 3.25F, 5.0F, 1.0F, 2.0F),
				ModelTransform.of(6.55F, 20.2333F, 0.45F, 0.0F, -0.3316F, -0.2443F));
		Shape89.addChild("Shape90",
				ModelPartBuilder.create()
						.uv(0, 33).mirrored(true).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F),
				ModelTransform.of(4.6377F, -18.199F, 3.453F, 0.5236F, 2.8623F, -0.0785F));
		Shape89.addChild("Shape91",
				ModelPartBuilder.create()
						.uv(27, 70).mirrored(true).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(4.8679F, -19.0863F, 2.2888F, 0.5236F, 2.2864F, -0.0785F));
		Shape89.addChild("Shape92",
				ModelPartBuilder.create()
						.uv(48, 63).mirrored(true).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(5.9496F, -20.8982F, 0.1061F, 0.5236F, -2.7314F, -0.0785F));
		Shape89.addChild("Shape93",
				ModelPartBuilder.create()
						.uv(15, 57).mirrored(true).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(4.9121F, -20.9909F, -1.8343F, -0.5236F, -2.1031F, -0.0785F));
		Shape89.addChild("Shape94",
				ModelPartBuilder.create()
						.uv(35, 48).mirrored(true).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F),
				ModelTransform.of(3.2972F, -19.3926F, -2.1498F, -0.5236F, -1.1781F, -0.0785F));
		ModelPartData Shape95 = body2.addChild("Shape95",
				ModelPartBuilder.create()
						.uv(65, 0).cuboid(-14.725F, -20.825F, 2.6F, 5.0F, 1.0F, 2.0F),
				ModelTransform.of(-8.675F, 23.625F, -0.7F, 0.0F, 0.1047F, 0.7679F));
		Shape95.addChild("Shape96",
				ModelPartBuilder.create()
						.uv(15, 42).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F),
				ModelTransform.of(-15.2936F, -20.6847F, 2.0575F, 0.0F, -2.8972F, 0.48F));
		Shape95.addChild("Shape97",
				ModelPartBuilder.create()
						.uv(0, 11).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F),
				ModelTransform.of(-15.4301F, -20.8993F, -0.3314F, 0.1309F, 2.8274F, 0.5149F));
		Shape95.addChild("Shape98",
				ModelPartBuilder.create()
						.uv(22, 34).cuboid(-3.1F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F),
				ModelTransform.of(-12.2338F, -19.6953F, -3.069F, 0.1309F, 1.2043F, 0.5149F));
		ModelPartData Shape99 = body2.addChild("Shape99",
				ModelPartBuilder.create()
						.uv(65, 0).mirrored(true).cuboid(9.725F, -20.825F, 2.6F, 5.0F, 1.0F, 2.0F),
				ModelTransform.of(8.675F, 23.625F, -0.7F, 0.0F, -0.1047F, -0.7679F));
		Shape99.addChild("Shape100",
				ModelPartBuilder.create()
						.uv(15, 42).mirrored(true).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F),
				ModelTransform.of(15.2936F, -20.6847F, 2.0575F, 0.0F, 2.8972F, -0.48F));
		Shape99.addChild("Shape101",
				ModelPartBuilder.create()
						.uv(0, 11).mirrored(true).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F),
				ModelTransform.of(15.4301F, -20.8993F, -0.3314F, 0.1309F, -2.8274F, -0.5149F));
		Shape99.addChild("Shape102",
				ModelPartBuilder.create()
						.uv(22, 34).mirrored(true).cuboid(2.1F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F),
				ModelTransform.of(12.2338F, -19.6953F, -3.069F, 0.1309F, -1.2043F, -0.5149F));
		ModelPartData Shape103 = body2.addChild("Shape103",
				ModelPartBuilder.create()
						.uv(20, 70).cuboid(3.45F, -12.6F, 1.4F, 3.0F, 1.0F, 2.0F),
				ModelTransform.of(7.85F, -8.8F, 6.7F, -3.0128F, 0.3581F, 1.1229F));
		Shape103.addChild("Shape104",
				ModelPartBuilder.create()
						.cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F),
				ModelTransform.of(3.4582F, -11.6401F, 2.4486F, -2.3845F, 0.4454F, 2.8159F));
		ModelPartData Shape105 = body2.addChild("Shape105",
				ModelPartBuilder.create()
						.uv(20, 70).mirrored(true).cuboid(-6.45F, -12.6F, 1.4F, 3.0F, 1.0F, 2.0F),
				ModelTransform.of(-7.85F, -8.8F, 6.7F, -3.0128F, -0.3581F, -1.1229F));
		Shape105.addChild("Shape106",
				ModelPartBuilder.create()
						.mirrored(true).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F),
				ModelTransform.of(-3.4582F, -11.6401F, 2.4486F, -2.3845F, -0.4454F, -2.8159F));
		body2.addChild("leftarm2",
				ModelPartBuilder.create()
						.uv(50, 0).cuboid(-1.0F, -2.0F, -2.0F, 5.0F, 4.0F, 5.0F),
				ModelTransform.of(5.0F, 2.0F, -0.1F, 0.3491F, 0.0F, -0.1745F));
		body2.addChild("rightarm2",
				ModelPartBuilder.create()
						.uv(0, 24).cuboid(-4.0F, -2.0F, -2.0F, 5.0F, 4.0F, 5.0F),
				ModelTransform.of(-5.0F, 2.0F, -0.1F, 0.211F, -0.056F, 0.2559F));
		ModelPartData leftleg2 = body2.addChild("leftleg2",
				ModelPartBuilder.create()
						.uv(0, 56).cuboid(-2.0F, 0.0F, -3.0F, 5.0F, 7.0F, 5.0F),
				ModelTransform.of(2.0F, 12.0F, 1.0F, -0.5587F, -0.195F, -0.2865F));
		ModelPartData heart11 = leftleg2.addChild("heart11",
				ModelPartBuilder.create(),
				ModelTransform.of(-2.0F, 12.0F, -1.0F, 0.0F, 0.0F, 0.0F));
		heart11.addChild("Shape107",
				ModelPartBuilder.create()
						.uv(71, 17).cuboid(5.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart11.addChild("Shape108",
				ModelPartBuilder.create()
						.uv(53, 71).cuboid(-4.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		leftleg2.addChild("legdownl2",
				ModelPartBuilder.create()
						.uv(0, 42).cuboid(-2.5F, -0.5F, -2.5F, 5.0F, 9.0F, 5.0F),
				ModelTransform.of(1.2618F, 5.8899F, 1.1453F, 0.7418F, 0.0F, 0.0F));
		ModelPartData rightleg2 = body2.addChild("rightleg2",
				ModelPartBuilder.create()
						.uv(0, 56).mirrored(true).cuboid(-3.0F, 0.0F, -3.0F, 5.0F, 7.0F, 5.0F),
				ModelTransform.of(-2.0F, 12.0F, 1.0F, -0.4972F, 0.1268F, 0.3077F));
		ModelPartData heart12 = rightleg2.addChild("heart12",
				ModelPartBuilder.create(),
				ModelTransform.of(2.0F, 12.0F, -1.0F, 0.0F, 0.0F, 0.0F));
		heart12.addChild("Shape109",
				ModelPartBuilder.create()
						.uv(71, 17).mirrored(true).cuboid(-8.1717F, 3.0618F, -0.2F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart12.addChild("Shape110",
				ModelPartBuilder.create()
						.uv(53, 71).mirrored(true).cuboid(1.4947F, 6.1471F, -0.2F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		rightleg2.addChild("legdownr2",
				ModelPartBuilder.create()
						.uv(0, 42).mirrored(true).cuboid(-2.8F, -0.9F, -0.8F, 5.0F, 9.0F, 5.0F),
				ModelTransform.of(-0.2311F, 7.3716F, -0.1109F, 0.7418F, -0.1309F, -0.0873F));
		ModelPartData body = modelPartData.addChild("body",
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
		ModelPartData head2 = modelPartData.addChild("head2",
				ModelPartBuilder.create()
						.uv(21, 21).cuboid(-3.5F, -6.0F, -3.0F, 7.0F, 6.0F, 7.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, 0.0F));
		head2.addChild("Shape13",
				ModelPartBuilder.create()
						.uv(26, 5).cuboid(-4.6F, -8.0F, 0.0F, 9.0F, 3.0F, 6.0F, new Dilation(0.01F, 0.01F, 0.01F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.4014F, 0.0F, 0.0F));
		head2.addChild("Shape14",
				ModelPartBuilder.create()
						.uv(65, 68).cuboid(-3.0F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, new Dilation(0.02F, 0.02F, 0.02F)),
				ModelTransform.of(3.854F, -7.8722F, 2.5976F, 0.4887F, 0.6545F, 0.3491F));
		head2.addChild("Shape45",
				ModelPartBuilder.create()
						.uv(0, 68).cuboid(0.0F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, new Dilation(0.02F, 0.02F, 0.02F)),
				ModelTransform.of(-3.854F, -7.8722F, 2.5976F, 0.4887F, -0.6545F, -0.3491F));
		head2.addChild("Shape59",
				ModelPartBuilder.create()
						.cuboid(-4.5F, -7.2F, -1.7F, 9.0F, 4.0F, 7.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0524F, 0.0F, 0.0F));
		head2.addChild("Shape62",
				ModelPartBuilder.create()
						.uv(22, 14).cuboid(-4.5F, -4.2F, 3.3F, 9.0F, 1.0F, 2.0F),
				ModelTransform.of(0.0F, 1.4F, 0.0F, 0.0524F, 0.0F, 0.0F));
		head2.addChild("Shape63",
				ModelPartBuilder.create()
						.uv(62, 17).cuboid(-4.5F, -6.2F, -1.7F, 1.0F, 3.0F, 7.0F),
				ModelTransform.of(0.3F, 2.9432F, -0.7469F, 0.0524F, 0.0F, 0.0F));
		head2.addChild("Shape64",
				ModelPartBuilder.create()
						.uv(20, 60).cuboid(3.5F, -6.2F, -1.7F, 1.0F, 3.0F, 7.0F),
				ModelTransform.of(-0.3F, 2.9432F, -0.7469F, 0.0524F, 0.0F, 0.0F));
		ModelPartData glass2 = head2.addChild("glass2",
				ModelPartBuilder.create(),
				ModelTransform.of(0.0F, -0.8F, 0.1F, 0.192F, 0.0F, 0.0F));
		glass2.addChild("Shape65",
				ModelPartBuilder.create()
						.uv(58, 38).cuboid(2.6251F, -6.9618F, -2.9109F, 3.0F, 2.0F, 6.0F),
				ModelTransform.of(0.0F, 0.0F, 1.0F, 0.0F, 1.0996F, 0.0F));
		ModelPartData bone2 = glass2.addChild("bone2",
				ModelPartBuilder.create(),
				ModelTransform.of(1.5111F, -4.2251F, -2.5709F, 0.0F, 0.0F, 0.0F));
		bone2.addChild("Shape66",
				ModelPartBuilder.create()
						.uv(63, 46).cuboid(-0.7F, 1.0F, -2.3F, 2.0F, 2.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.1345F, 0.0F));
		bone2.addChild("Shape67",
				ModelPartBuilder.create()
						.uv(22, 34).cuboid(0.3F, -1.0F, -2.4F, 1.0F, 3.0F, 1.0F, new Dilation(-0.11F, -0.11F, -0.11F)),
				ModelTransform.of(0.0606F, -0.1107F, 0.5693F, 0.0F, 1.1345F, 0.0F));
		bone2.addChild("Shape68",
				ModelPartBuilder.create()
						.uv(0, 24).cuboid(-1.3F, -1.0F, -2.4F, 1.0F, 3.0F, 1.0F, new Dilation(-0.11F, -0.11F, -0.11F)),
				ModelTransform.of(-3.0829F, -0.1107F, 0.5693F, 0.0F, -1.1345F, 0.0F));
		bone2.addChild("Shape69",
				ModelPartBuilder.create()
						.uv(63, 27).cuboid(-1.3F, 1.0F, -2.6F, 2.0F, 2.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(-3.2942F, -0.0242F, 0.1244F, 0.0F, -1.1345F, 0.0F));
		glass2.addChild("Shape70",
				ModelPartBuilder.create()
						.uv(57, 9).cuboid(-5.6251F, -6.9618F, -2.9109F, 3.0F, 2.0F, 6.0F),
				ModelTransform.of(0.0F, 0.0F, 1.0F, 0.0F, -1.0996F, 0.0F));
		ModelPartData heart8 = head2.addChild("heart8",
				ModelPartBuilder.create(),
				ModelTransform.of(-2.55F, 5.5F, -0.8F, 0.0F, 0.0F, 0.0F));
		heart8.addChild("Shape71",
				ModelPartBuilder.create()
						.uv(40, 17).cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F),
				ModelTransform.of(2.1717F, -5.3382F, -2.2F, 0.0F, 0.0F, 0.7679F));
		heart8.addChild("Shape72",
				ModelPartBuilder.create()
						.uv(25, 5).cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F),
				ModelTransform.of(2.9111F, -5.3333F, -2.2F, 0.0F, 0.0F, -0.7679F));
		ModelPartData healfist = modelPartData.addChild("healfist",
				ModelPartBuilder.create(),
				ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.0F));
		ModelPartData left_hands_ro2 = healfist.addChild("left_hands_ro2",
				ModelPartBuilder.create(),
				ModelTransform.of(0.0F, -20.55F, 0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData handl6 = left_hands_ro2.addChild("handl6",
				ModelPartBuilder.create()
						.uv(0, 82).cuboid(15.5F, -2.35F, -1.5F, 5.0F, 9.0F, 5.0F, new Dilation(0.3F, 0.3F, 0.3F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle13 = handl6.addChild("armmiddle13",
				ModelPartBuilder.create()
						.uv(55, 57).cuboid(15.3F, -3.7F, -1.35F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart23 = armmiddle13.addChild("heart23",
				ModelPartBuilder.create(),
				ModelTransform.of(10.7F, -5.6F, -5.0F, 0.0F, -1.5708F, 0.0F));
		heart23.addChild("Shape131",
				ModelPartBuilder.create()
						.uv(72, 46).cuboid(13.2893F, 6.8241F, -7.6F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart23.addChild("Shape132",
				ModelPartBuilder.create()
						.uv(72, 27).cuboid(-6.7903F, 14.7947F, -7.6F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		ModelPartData handl7 = left_hands_ro2.addChild("handl7",
				ModelPartBuilder.create()
						.uv(0, 82).cuboid(11.5F, -7.55F, -9.8F, 5.0F, 9.0F, 5.0F, new Dilation(0.3F, 0.3F, 0.3F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle14 = handl7.addChild("armmiddle14",
				ModelPartBuilder.create()
						.uv(55, 57).cuboid(11.3F, -8.9F, -9.65F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart24 = armmiddle14.addChild("heart24",
				ModelPartBuilder.create(),
				ModelTransform.of(10.7F, -5.6F, -5.0F, 0.0F, -1.5708F, 0.0F));
		heart24.addChild("Shape133",
				ModelPartBuilder.create()
						.uv(72, 46).cuboid(3.5886F, 8.1758F, -3.6F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart24.addChild("Shape134",
				ModelPartBuilder.create()
						.uv(72, 27).cuboid(-9.806F, 5.4761F, -3.6F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		ModelPartData handl8 = left_hands_ro2.addChild("handl8",
				ModelPartBuilder.create()
						.uv(0, 82).cuboid(14.5F, 0.85F, 6.4F, 5.0F, 9.0F, 5.0F, new Dilation(0.3F, 0.3F, 0.3F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle15 = handl8.addChild("armmiddle15",
				ModelPartBuilder.create()
						.uv(55, 57).cuboid(14.3F, -1.6F, 6.55F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart25 = armmiddle15.addChild("heart25",
				ModelPartBuilder.create(),
				ModelTransform.of(10.7F, -5.6F, -5.0F, 0.0F, -1.5708F, 0.0F));
		heart25.addChild("Shape135",
				ModelPartBuilder.create()
						.uv(72, 46).cuboid(20.6909F, 3.3548F, -6.6F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart25.addChild("Shape136",
				ModelPartBuilder.create()
						.uv(72, 27).cuboid(-2.0884F, 21.4814F, -6.6F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		ModelPartData handl9 = left_hands_ro2.addChild("handl9",
				ModelPartBuilder.create()
						.uv(0, 82).cuboid(18.9F, 3.95F, -10.4F, 5.0F, 9.0F, 5.0F, new Dilation(0.3F, 0.3F, 0.3F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle16 = handl9.addChild("armmiddle16",
				ModelPartBuilder.create()
						.uv(55, 57).cuboid(18.7F, 2.6F, -10.25F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart26 = armmiddle16.addChild("heart26",
				ModelPartBuilder.create(),
				ModelTransform.of(10.7F, -5.6F, -5.0F, 0.0F, -1.5708F, 0.0F));
		heart26.addChild("Shape137",
				ModelPartBuilder.create()
						.uv(72, 46).cuboid(10.5211F, 17.371F, -11.0F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart26.addChild("Shape138",
				ModelPartBuilder.create()
						.uv(72, 27).cuboid(-17.6577F, 13.9F, -11.0F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		ModelPartData handl10 = left_hands_ro2.addChild("handl10",
				ModelPartBuilder.create()
						.uv(0, 82).cuboid(21.6F, -6.65F, 3.6F, 5.0F, 9.0F, 5.0F, new Dilation(0.3F, 0.3F, 0.3F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle17 = handl10.addChild("armmiddle17",
				ModelPartBuilder.create()
						.uv(55, 57).cuboid(21.4F, -9.0F, 3.75F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart27 = armmiddle17.addChild("heart27",
				ModelPartBuilder.create(),
				ModelTransform.of(10.7F, -5.6F, -5.0F, 0.0F, -1.5708F, 0.0F));
		heart27.addChild("Shape139",
				ModelPartBuilder.create()
						.uv(72, 46).cuboid(13.7893F, -0.5141F, -13.7F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart27.addChild("Shape140",
				ModelPartBuilder.create()
						.uv(72, 27).cuboid(0.5233F, 14.0129F, -13.7F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		ModelPartData right_hands_ro2 = healfist.addChild("right_hands_ro2",
				ModelPartBuilder.create(),
				ModelTransform.of(0.0F, -20.55F, 0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData handr6 = right_hands_ro2.addChild("handr6",
				ModelPartBuilder.create()
						.uv(0, 82).mirrored(true).cuboid(-26.6F, -0.95F, -1.5F, 5.0F, 9.0F, 5.0F, new Dilation(0.3F, 0.3F, 0.3F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle18 = handr6.addChild("armmiddle18",
				ModelPartBuilder.create()
						.uv(55, 57).mirrored(true).cuboid(-26.4F, -2.3F, -1.35F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart28 = armmiddle18.addChild("heart28",
				ModelPartBuilder.create(),
				ModelTransform.of(-10.7F, -5.6F, -5.0F, 0.0F, 1.5708F, 0.0F));
		heart28.addChild("Shape141",
				ModelPartBuilder.create()
						.uv(72, 46).mirrored(true).cuboid(-17.1892F, 7.8966F, -13.7F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart28.addChild("Shape142",
				ModelPartBuilder.create()
						.uv(72, 27).mirrored(true).cuboid(4.6902F, 15.8672F, -13.7F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		ModelPartData handr7 = right_hands_ro2.addChild("handr7",
				ModelPartBuilder.create()
						.uv(0, 82).mirrored(true).cuboid(-19.4F, 9.65F, -9.8F, 5.0F, 9.0F, 5.0F, new Dilation(0.3F, 0.3F, 0.3F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle19 = handr7.addChild("armmiddle19",
				ModelPartBuilder.create()
						.uv(55, 57).mirrored(true).cuboid(-19.2F, 8.3F, -9.65F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart29 = armmiddle19.addChild("heart29",
				ModelPartBuilder.create(),
				ModelTransform.of(-10.7F, -5.6F, -5.0F, 0.0F, 1.5708F, 0.0F));
		heart29.addChild("Shape143",
				ModelPartBuilder.create()
						.uv(72, 46).mirrored(true).cuboid(-17.6446F, 21.3518F, -6.5F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart29.addChild("Shape144",
				ModelPartBuilder.create()
						.uv(72, 27).mirrored(true).cuboid(17.862F, 18.6521F, -6.5F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		ModelPartData handr8 = right_hands_ro2.addChild("handr8",
				ModelPartBuilder.create()
						.uv(0, 82).mirrored(true).cuboid(-21.3F, 0.75F, 6.4F, 5.0F, 9.0F, 5.0F, new Dilation(0.3F, 0.3F, 0.3F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle20 = handr8.addChild("armmiddle20",
				ModelPartBuilder.create()
						.uv(55, 57).mirrored(true).cuboid(-21.1F, -1.6F, 6.55F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart30 = armmiddle20.addChild("heart30",
				ModelPartBuilder.create(),
				ModelTransform.of(-10.7F, -5.6F, -5.0F, 0.0F, 1.5708F, 0.0F));
		heart30.addChild("Shape145",
				ModelPartBuilder.create()
						.uv(72, 46).mirrored(true).cuboid(-23.6909F, 3.3548F, -8.4F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart30.addChild("Shape146",
				ModelPartBuilder.create()
						.uv(72, 27).mirrored(true).cuboid(-0.9116F, 21.4814F, -8.4F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		ModelPartData handr9 = right_hands_ro2.addChild("handr9",
				ModelPartBuilder.create()
						.uv(0, 82).mirrored(true).cuboid(-23.9F, -1.95F, -10.4F, 5.0F, 9.0F, 5.0F, new Dilation(0.3F, 0.3F, 0.3F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle21 = handr9.addChild("armmiddle21",
				ModelPartBuilder.create()
						.uv(55, 57).mirrored(true).cuboid(-23.7F, -4.3F, -10.25F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart31 = armmiddle21.addChild("heart31",
				ModelPartBuilder.create(),
				ModelTransform.of(-10.7F, -5.6F, -5.0F, 0.0F, 1.5708F, 0.0F));
		heart31.addChild("Shape147",
				ModelPartBuilder.create()
						.uv(72, 46).mirrored(true).cuboid(-9.0858F, 12.0853F, -11.0F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart31.addChild("Shape148",
				ModelPartBuilder.create()
						.uv(72, 27).mirrored(true).cuboid(10.2225F, 8.6143F, -11.0F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		ModelPartData handr10 = right_hands_ro2.addChild("handr10",
				ModelPartBuilder.create()
						.uv(0, 82).mirrored(true).cuboid(-17.2F, -6.65F, -0.5F, 5.0F, 9.0F, 5.0F, new Dilation(0.3F, 0.3F, 0.3F)),
				ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		ModelPartData armmiddle22 = handr10.addChild("armmiddle22",
				ModelPartBuilder.create()
						.uv(55, 57).mirrored(true).cuboid(-17.0F, -9.0F, -0.35F, 5.0F, 1.0F, 5.0F, new Dilation(-0.1F, -0.1F, -0.1F)),
				ModelTransform.of(0.0F, 0.55F, -0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData heart32 = armmiddle22.addChild("heart32",
				ModelPartBuilder.create(),
				ModelTransform.of(-10.7F, -5.6F, -5.0F, 0.0F, 1.5708F, 0.0F));
		heart32.addChild("Shape149",
				ModelPartBuilder.create()
						.uv(72, 46).mirrored(true).cuboid(-13.6486F, 2.1213F, -4.3F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart32.addChild("Shape150",
				ModelPartBuilder.create()
						.uv(72, 27).mirrored(true).cuboid(-0.3825F, 11.3774F, -4.3F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		ModelPartData head = modelPartData.addChild("head",
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
		ModelPartData viewFirst = modelPartData.addChild("viewFirst",
				ModelPartBuilder.create(),
				ModelTransform.of(0.0F, 3.45F, 0.2F, 0.0F, 0.0F, 0.0F));
		ModelPartData left_hands_ro = viewFirst.addChild("left_hands_ro",
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
		ModelPartData heart13 = armmiddle3.addChild("heart13",
				ModelPartBuilder.create(),
				ModelTransform.of(10.7F, -5.6F, -5.0F, 0.0F, -1.5708F, 0.0F));
		heart13.addChild("Shape111",
				ModelPartBuilder.create()
						.uv(72, 46).cuboid(13.2893F, 6.8241F, -7.6F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart13.addChild("Shape112",
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
		ModelPartData heart14 = armmiddle4.addChild("heart14",
				ModelPartBuilder.create(),
				ModelTransform.of(10.7F, -5.6F, -5.0F, 0.0F, -1.5708F, 0.0F));
		heart14.addChild("Shape113",
				ModelPartBuilder.create()
						.uv(72, 46).cuboid(3.5886F, 8.1758F, -3.6F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart14.addChild("Shape114",
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
		ModelPartData heart15 = armmiddle5.addChild("heart15",
				ModelPartBuilder.create(),
				ModelTransform.of(10.7F, -5.6F, -5.0F, 0.0F, -1.5708F, 0.0F));
		heart15.addChild("Shape115",
				ModelPartBuilder.create()
						.uv(72, 46).cuboid(20.6909F, 3.3548F, -6.6F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart15.addChild("Shape116",
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
		ModelPartData heart16 = armmiddle6.addChild("heart16",
				ModelPartBuilder.create(),
				ModelTransform.of(10.7F, -5.6F, -5.0F, 0.0F, -1.5708F, 0.0F));
		heart16.addChild("Shape117",
				ModelPartBuilder.create()
						.uv(72, 46).cuboid(10.5211F, 17.371F, -11.0F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart16.addChild("Shape118",
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
		ModelPartData heart17 = armmiddle7.addChild("heart17",
				ModelPartBuilder.create(),
				ModelTransform.of(10.7F, -5.6F, -5.0F, 0.0F, -1.5708F, 0.0F));
		heart17.addChild("Shape119",
				ModelPartBuilder.create()
						.uv(72, 46).cuboid(13.7893F, -0.5141F, -13.7F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));
		heart17.addChild("Shape120",
				ModelPartBuilder.create()
						.uv(72, 27).cuboid(0.5233F, 14.0129F, -13.7F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		ModelPartData right_hands_ro = viewFirst.addChild("right_hands_ro",
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
		ModelPartData heart18 = armmiddle8.addChild("heart18",
				ModelPartBuilder.create(),
				ModelTransform.of(-10.7F, -5.6F, -5.0F, 0.0F, 1.5708F, 0.0F));
		heart18.addChild("Shape121",
				ModelPartBuilder.create()
						.uv(72, 46).mirrored(true).cuboid(-17.1892F, 7.8966F, -13.7F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart18.addChild("Shape122",
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
		ModelPartData heart19 = armmiddle9.addChild("heart19",
				ModelPartBuilder.create(),
				ModelTransform.of(-10.7F, -5.6F, -5.0F, 0.0F, 1.5708F, 0.0F));
		heart19.addChild("Shape123",
				ModelPartBuilder.create()
						.uv(72, 46).mirrored(true).cuboid(-17.6446F, 21.3518F, -6.5F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart19.addChild("Shape124",
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
		ModelPartData heart20 = armmiddle10.addChild("heart20",
				ModelPartBuilder.create(),
				ModelTransform.of(-10.7F, -5.6F, -5.0F, 0.0F, 1.5708F, 0.0F));
		heart20.addChild("Shape125",
				ModelPartBuilder.create()
						.uv(72, 46).mirrored(true).cuboid(-23.6909F, 3.3548F, -8.4F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart20.addChild("Shape126",
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
		ModelPartData heart21 = armmiddle11.addChild("heart21",
				ModelPartBuilder.create(),
				ModelTransform.of(-10.7F, -5.6F, -5.0F, 0.0F, 1.5708F, 0.0F));
		heart21.addChild("Shape127",
				ModelPartBuilder.create()
						.uv(72, 46).mirrored(true).cuboid(-9.0858F, 12.0853F, -11.0F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart21.addChild("Shape128",
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
		ModelPartData heart22 = armmiddle12.addChild("heart22",
				ModelPartBuilder.create(),
				ModelTransform.of(-10.7F, -5.6F, -5.0F, 0.0F, 1.5708F, 0.0F));
		heart22.addChild("Shape129",
				ModelPartBuilder.create()
						.uv(72, 46).mirrored(true).cuboid(-13.6486F, 2.1213F, -4.3F, 3.0F, 2.0F, 1.0F, new Dilation(-0.19F, -0.19F, -0.19F)),
				ModelTransform.of(0.6F, -12.9F, -2.5F, 0.0F, 0.0F, -0.6981F));
		heart22.addChild("Shape130",
				ModelPartBuilder.create()
						.uv(72, 27).mirrored(true).cuboid(-0.3825F, 11.3774F, -4.3F, 3.0F, 2.0F, 1.0F, new Dilation(-0.2F, -0.2F, -0.2F)),
				ModelTransform.of(-0.6F, -12.9F, -2.5F, 0.0F, 0.0F, 0.6981F));

		return TexturedModelData.of(modelData,128,128);

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
		body2.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);

		matrixStack.translate(0.0D, -this.yOffset, 0.0D);
		viewFirst.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.translate(0.0D, 0.2D, 0.75D);
	}
	public void renderHeal(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		matrixStack.translate(0.0D, this.yOffset, -0.75D);
		body2.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);

		matrixStack.translate(0.0D, -this.yOffset, 0.0D);
		viewFirst.render(matrixStack, buffer, packedLight, packedOverlay);
		healfist.render(matrixStack, buffer, packedLight, packedOverlay);
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