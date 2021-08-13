// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports

	package mrsterner.phantomblood.client.model.stand;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.NotNull;

public class HierophantGreenModel extends EntityModel<LivingEntity> {
	private final ModelPart head;
	private final ModelPart hat;
	private final ModelPart hat_part_3;
	private final ModelPart body;
	private final ModelPart Shape1;
	private final ModelPart Shape2;
	private final ModelPart bodydown;
	private final ModelPart crotch;
	private final ModelPart part1;
	private final ModelPart part1_1;
	private final ModelPart part1_2;
	private final ModelPart part1_4;
	private final ModelPart part2;
	private final ModelPart part1_3;
	private final ModelPart part1_5;
	private final ModelPart part1_6;
	private final ModelPart part3;
	private final ModelPart part4;
	private final ModelPart part5;
	private final ModelPart part6;
	private final ModelPart part6_1;
	private final ModelPart part6_2;
	private final ModelPart leftarm;
	private final ModelPart leftarmd;
	private final ModelPart rightarm;
	private final ModelPart rightarmd;
	private final ModelPart leftleg;
	private final ModelPart legdownl;
	private final ModelPart rightleg;
	private final ModelPart legdownr;
	private final ModelPart extra;
	private final ModelPart bodyFloat;
	private final ModelPart Shape3;
	private final ModelPart Shape4;
	private final ModelPart bodydown2;
	private final ModelPart crotch2;
	private final ModelPart part7;
	private final ModelPart part1_7;
	private final ModelPart part1_8;
	private final ModelPart part1_9;
	private final ModelPart part8;
	private final ModelPart part1_10;
	private final ModelPart part1_11;
	private final ModelPart part1_12;
	private final ModelPart part9;
	private final ModelPart part10;
	private final ModelPart part11;
	private final ModelPart part12;
	private final ModelPart part6_3;
	private final ModelPart part6_4;
	private final ModelPart rightarm2;
	private final ModelPart rightarmd2;
	private final ModelPart leftarm2;
	private final ModelPart leftarmd2;
	private final ModelPart leftleg2;
	private final ModelPart legdownl2;
	private final ModelPart rightleg2;
	private final ModelPart legdownr2;
	private final ModelPart strips;
	private final ModelPart strip1;
	private final ModelPart strip2;
	private final ModelPart strip3;
	private final ModelPart strip4;
	private final ModelPart strip5;
	private final ModelPart strip6;
	private final ModelPart strip7;
	private final ModelPart strip8;
	private final ModelPart strip9;
	private final ModelPart strip10;
	private final ModelPart strip11;
	private final ModelPart head2;
	private final ModelPart hat2;
	private final ModelPart hat_part_2;
	private double yOffset;
	public HierophantGreenModel() {
		textureWidth = 64;
		textureHeight = 128;
		head = new ModelPart(this);
		head.setPivot(0.0F, 0.0F, -1.0F);
		head.setTextureOffset(0, 0).addCuboid(-3.0F, -5.8F, -2.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		hat = new ModelPart(this);
		hat.setPivot(0.0F, 24.0F, 1.0F);
		head.addChild(hat);
		hat.setTextureOffset(35, 114).addCuboid(-3.5F, -30.0F, -3.5F, 7.0F, 7.0F, 7.0F, 0.0F, false);
		hat.setTextureOffset(28, 0).addCuboid(-4.0F, -28.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		hat.setTextureOffset(28, 0).addCuboid(3.0F, -28.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		hat.setTextureOffset(28, 5).addCuboid(-1.5F, -30.5F, -2.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		hat_part_3 = new ModelPart(this);
		hat_part_3.setPivot(2.0F, -27.0F, -5.0F);
		hat.addChild(hat_part_3);
		setRotationAngle(hat_part_3, -0.1745F, 0.0F, 0.0F);
		hat_part_3.setTextureOffset(54, 107).addCuboid(-3.5F, 0.5F, 1.5F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		body = new ModelPart(this);
		body.setPivot(0.0F, 0.0F, 0.0F);
		setRotationAngle(body, 0.1745F, 0.1745F, 0.0F);
		body.setTextureOffset(16, 16).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 6.0F, 4.0F, 0.0F, false);

		Shape1 = new ModelPart(this);
		Shape1.setPivot(0.0F, 0.0F, -2.3F);
		body.addChild(Shape1);
		Shape1.setTextureOffset(35, 56).addCuboid(-1.5F, 4.0F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		Shape2 = new ModelPart(this);
		Shape2.setPivot(0.1307F, -2.2291F, -3.4244F);
		body.addChild(Shape2);
		setRotationAngle(Shape2, -0.0873F, 0.0F, 0.0F);
		Shape2.setTextureOffset(54, 30).addCuboid(-1.5F, 4.0F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		bodydown = new ModelPart(this);
		bodydown.setPivot(0.0F, 0.0F, 0.0F);
		body.addChild(bodydown);
		setRotationAngle(bodydown, -0.0175F, 0.0F, 0.0F);
		bodydown.setTextureOffset(19, 66).addCuboid(-3.5F, 6.0246F, -1.6873F, 7.0F, 5.0F, 4.0F, 0.0F, false);

		crotch = new ModelPart(this);
		crotch.setPivot(0.0F, 0.0F, 0.0F);
		body.addChild(crotch);
		setRotationAngle(crotch, 0.0349F, 0.0F, 0.0F);
		crotch.setTextureOffset(16, 82).addCuboid(-4.0F, 7.5F, -2.8764F, 8.0F, 2.0F, 6.0F, 0.0F, false);

		part1 = new ModelPart(this);
		part1.setPivot(0.0F, -0.5208F, -2.9544F);
		body.addChild(part1);
		setRotationAngle(part1, 0.0F, 0.0F, -0.7854F);


		part1_1 = new ModelPart(this);
		part1_1.setPivot(-3.9035F, -2.0107F, 2.8264F);
		part1.addChild(part1_1);
		setRotationAngle(part1_1, 0.0F, 0.0F, -0.3491F);
		part1_1.setTextureOffset(48, 54).addCuboid(-0.5F, -3.0F, -3.0F, 1.0F, 6.0F, 6.0F, 0.0F, false);

		part1_2 = new ModelPart(this);
		part1_2.setPivot(-5.2936F, -2.0295F, 2.5669F);
		part1.addChild(part1_2);
		setRotationAngle(part1_2, 0.0F, 0.0F, -0.6109F);
		part1_2.setTextureOffset(48, 54).addCuboid(-0.5F, -3.0F, -3.0F, 1.0F, 7.0F, 6.0F, 0.0F, false);

		part1_4 = new ModelPart(this);
		part1_4.setPivot(-3.2071F, -2.7071F, 3.0F);
		part1.addChild(part1_4);
		setRotationAngle(part1_4, 0.0F, 0.0F, -0.2618F);
		part1_4.setTextureOffset(48, 69).addCuboid(-2.2784F, -2.1619F, -2.5456F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		part2 = new ModelPart(this);
		part2.setPivot(0.0F, -0.5208F, -2.9544F);
		body.addChild(part2);
		setRotationAngle(part2, 0.0F, 0.0F, 0.7854F);


		part1_3 = new ModelPart(this);
		part1_3.setPivot(3.9035F, -2.0107F, 2.8264F);
		part2.addChild(part1_3);
		setRotationAngle(part1_3, 0.0F, 0.0F, 0.3491F);
		part1_3.setTextureOffset(48, 54).addCuboid(-0.5F, -3.0F, -3.0F, 1.0F, 6.0F, 6.0F, 0.0F, false);

		part1_5 = new ModelPart(this);
		part1_5.setPivot(5.2936F, -2.0295F, 2.5669F);
		part2.addChild(part1_5);
		setRotationAngle(part1_5, 0.0F, 0.0F, 0.6109F);
		part1_5.setTextureOffset(48, 54).addCuboid(-0.5F, -3.0F, -3.0F, 1.0F, 7.0F, 6.0F, 0.0F, false);

		part1_6 = new ModelPart(this);
		part1_6.setPivot(3.2071F, -2.7071F, 3.0F);
		part2.addChild(part1_6);
		setRotationAngle(part1_6, 0.0F, 0.0F, 0.2618F);
		part1_6.setTextureOffset(48, 69).addCuboid(1.2784F, -2.1619F, -2.5456F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		part3 = new ModelPart(this);
		part3.setPivot(2.0872F, 4.8422F, -1.8075F);
		body.addChild(part3);
		part3.setTextureOffset(35, 62).addCuboid(-3.5F, -2.0F, 4.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		part4 = new ModelPart(this);
		part4.setPivot(-1.9052F, 4.7968F, 2.3473F);
		body.addChild(part4);
		setRotationAngle(part4, 0.0F, 0.0F, -0.5236F);
		part4.setTextureOffset(48, 79).addCuboid(-2.5F, -1.0F, -3.5473F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		part5 = new ModelPart(this);
		part5.setPivot(1.9052F, 4.7968F, 2.3473F);
		body.addChild(part5);
		setRotationAngle(part5, 0.0F, 0.0F, 0.5236F);
		part5.setTextureOffset(48, 79).addCuboid(-1.5F, -1.0F, -3.5473F, 4.0F, 2.0F, 4.0F, 0.0F, true);

		part6 = new ModelPart(this);
		part6.setPivot(0.0F, -1.9696F, 0.3472F);
		body.addChild(part6);
		part6.setTextureOffset(0, 64).addCuboid(-2.0F, 2.9696F, 1.6528F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		part6_1 = new ModelPart(this);
		part6_1.setPivot(-4.1129F, 4.4536F, -3.5367F);
		part6.addChild(part6_1);
		setRotationAngle(part6_1, 0.0F, 0.0F, -0.7854F);
		part6_1.setTextureOffset(0, 74).addCuboid(2.0F, -2.0F, 0.0F, 1.0F, 3.0F, 6.0F, 0.0F, true);

		part6_2 = new ModelPart(this);
		part6_2.setPivot(4.1129F, 4.4536F, -3.5367F);
		part6.addChild(part6_2);
		setRotationAngle(part6_2, 0.0F, 0.0F, 0.7854F);
		part6_2.setTextureOffset(0, 74).addCuboid(-3.0F, -2.0F, 0.0F, 1.0F, 3.0F, 6.0F, 0.0F, true);

		leftarm = new ModelPart(this);
		leftarm.setPivot(0.0F, 6.0F, 0.0F);
		setRotationAngle(leftarm, -0.0873F, 0.0F, -0.9599F);
		leftarm.setTextureOffset(40, 16).addCuboid(3.0F, 1.0872F, -1.9962F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		leftarmd = new ModelPart(this);
		leftarmd.setPivot(2.6753F, 5.2814F, -3.4392F);
		leftarm.addChild(leftarmd);
		setRotationAngle(leftarmd, 2.0071F, 3.0543F, -1.6581F);
		leftarmd.setTextureOffset(48, 4).addCuboid(-2.0F, -3.5F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);

		rightarm = new ModelPart(this);
		rightarm.setPivot(0.0F, 4.0F, 0.0F);
		setRotationAngle(rightarm, -0.7854F, 0.0F, 1.309F);
		rightarm.setTextureOffset(40, 16).addCuboid(-4.1335F, 1.8434F, 1.2756F, 4.0F, 6.0F, 4.0F, 0.0F, true);

		rightarmd = new ModelPart(this);
		rightarmd.setPivot(-1.6845F, 7.7366F, 2.1856F);
		rightarm.addChild(rightarmd);
		setRotationAngle(rightarmd, -2.0944F, 0.2618F, -0.2618F);
		rightarmd.setTextureOffset(48, 4).addCuboid(-2.3983F, -2.8966F, -1.1802F, 4.0F, 7.0F, 4.0F, 0.0F, true);

		leftleg = new ModelPart(this);
		leftleg.setPivot(2.0F, 10.0F, 0.0F);
		setRotationAngle(leftleg, -0.5494F, -0.3992F, -0.4341F);
		leftleg.setTextureOffset(21, 100).addCuboid(-2.0F, 0.0F, -3.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		legdownl = new ModelPart(this);
		legdownl.setPivot(1.8266F, 3.8994F, 3.2559F);
		leftleg.addChild(legdownl);
		setRotationAngle(legdownl, 1.8088F, -0.1374F, -0.4105F);
		legdownl.setTextureOffset(0, 100).addCuboid(-4.5885F, -4.6434F, -2.9332F, 4.0F, 9.0F, 5.0F, 0.0F, false);

		rightleg = new ModelPart(this);
		rightleg.setPivot(-2.0F, 10.0F, 2.0F);
		setRotationAngle(rightleg, -0.2762F, 0.2504F, 0.1609F);
		rightleg.setTextureOffset(21, 100).addCuboid(-3.0F, 0.0F, -3.5F, 5.0F, 7.0F, 5.0F, 0.0F, true);

		legdownr = new ModelPart(this);
		legdownr.setPivot(-0.9457F, 10.0163F, 1.7692F);
		rightleg.addChild(legdownr);
		setRotationAngle(legdownr, 0.6015F, 0.0728F, 0.0614F);
		legdownr.setTextureOffset(0, 100).addCuboid(-1.5F, -4.5F, -2.5F, 4.0F, 9.0F, 5.0F, 0.0F, true);

		extra = new ModelPart(this);
		extra.setPivot(-0.6176F, 4.3949F, -4.7861F);
		setRotationAngle(extra, 0.4363F, 0.0F, 0.349F);
		extra.setTextureOffset(0, 36).addCuboid(-5.2887F, -1.5893F, -1.4862F, 10.0F, 3.0F, 3.0F, 0.0F, false);
		extra.setTextureOffset(0, 44).addCuboid(-4.7113F, -0.4107F, -0.5139F, 10.0F, 1.0F, 1.0F, 0.0F, false);

		bodyFloat = new ModelPart(this);
		bodyFloat.setPivot(0.0F, 0.0F, 0.0F);
		setRotationAngle(bodyFloat, 1.3963F, 0.0F, 0.2618F);
		bodyFloat.setTextureOffset(16, 16).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 6.0F, 4.0F, 0.0F, false);

		Shape3 = new ModelPart(this);
		Shape3.setPivot(0.0F, 0.0F, -2.3F);
		bodyFloat.addChild(Shape3);
		Shape3.setTextureOffset(35, 56).addCuboid(-1.5F, 4.0F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		Shape4 = new ModelPart(this);
		Shape4.setPivot(0.1307F, -2.2291F, -3.4244F);
		bodyFloat.addChild(Shape4);
		setRotationAngle(Shape4, -0.0873F, 0.0F, 0.0F);
		Shape4.setTextureOffset(54, 30).addCuboid(-1.5F, 4.0F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		bodydown2 = new ModelPart(this);
		bodydown2.setPivot(0.0F, 0.0F, 0.0F);
		bodyFloat.addChild(bodydown2);
		setRotationAngle(bodydown2, -0.0175F, 0.0F, 0.0F);
		bodydown2.setTextureOffset(19, 66).addCuboid(-3.5F, 6.0246F, -1.6873F, 7.0F, 5.0F, 4.0F, 0.0F, false);

		crotch2 = new ModelPart(this);
		crotch2.setPivot(0.0F, 0.0F, 0.0F);
		bodyFloat.addChild(crotch2);
		setRotationAngle(crotch2, 0.0349F, 0.0F, 0.0F);
		crotch2.setTextureOffset(16, 82).addCuboid(-4.0F, 7.5F, -2.8764F, 8.0F, 2.0F, 6.0F, 0.0F, false);

		part7 = new ModelPart(this);
		part7.setPivot(0.0F, -0.5208F, -2.9544F);
		bodyFloat.addChild(part7);
		setRotationAngle(part7, 0.0F, 0.0F, -0.7854F);


		part1_7 = new ModelPart(this);
		part1_7.setPivot(-3.9035F, -2.0107F, 2.8264F);
		part7.addChild(part1_7);
		setRotationAngle(part1_7, 0.0F, 0.0F, -0.3491F);
		part1_7.setTextureOffset(48, 54).addCuboid(-0.5F, -3.0F, -3.0F, 1.0F, 6.0F, 6.0F, 0.0F, false);

		part1_8 = new ModelPart(this);
		part1_8.setPivot(-5.2936F, -2.0295F, 2.5669F);
		part7.addChild(part1_8);
		setRotationAngle(part1_8, 0.0F, 0.0F, -0.6109F);
		part1_8.setTextureOffset(48, 54).addCuboid(-0.5F, -3.0F, -3.0F, 1.0F, 7.0F, 6.0F, 0.0F, false);

		part1_9 = new ModelPart(this);
		part1_9.setPivot(-3.2071F, -2.7071F, 3.0F);
		part7.addChild(part1_9);
		setRotationAngle(part1_9, 0.0F, 0.0F, -0.2618F);
		part1_9.setTextureOffset(48, 69).addCuboid(-2.2784F, -2.1619F, -2.5456F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		part8 = new ModelPart(this);
		part8.setPivot(0.0F, -0.5208F, -2.9544F);
		bodyFloat.addChild(part8);
		setRotationAngle(part8, 0.0F, 0.0F, 0.7854F);


		part1_10 = new ModelPart(this);
		part1_10.setPivot(3.9035F, -2.0107F, 2.8264F);
		part8.addChild(part1_10);
		setRotationAngle(part1_10, 0.0F, 0.0F, 0.3491F);
		part1_10.setTextureOffset(48, 54).addCuboid(-0.5F, -3.0F, -3.0F, 1.0F, 6.0F, 6.0F, 0.0F, false);

		part1_11 = new ModelPart(this);
		part1_11.setPivot(5.2936F, -2.0295F, 2.5669F);
		part8.addChild(part1_11);
		setRotationAngle(part1_11, 0.0F, 0.0F, 0.6109F);
		part1_11.setTextureOffset(48, 54).addCuboid(-0.5F, -3.0F, -3.0F, 1.0F, 7.0F, 6.0F, 0.0F, false);

		part1_12 = new ModelPart(this);
		part1_12.setPivot(3.2071F, -2.7071F, 3.0F);
		part8.addChild(part1_12);
		setRotationAngle(part1_12, 0.0F, 0.0F, 0.2618F);
		part1_12.setTextureOffset(48, 69).addCuboid(1.2784F, -2.1619F, -2.5456F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		part9 = new ModelPart(this);
		part9.setPivot(2.0872F, 4.8422F, -1.8075F);
		bodyFloat.addChild(part9);
		part9.setTextureOffset(35, 62).addCuboid(-3.5F, -2.0F, 4.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		part10 = new ModelPart(this);
		part10.setPivot(-1.9052F, 4.7968F, 2.3473F);
		bodyFloat.addChild(part10);
		setRotationAngle(part10, 0.0F, 0.0F, -0.5236F);
		part10.setTextureOffset(48, 79).addCuboid(-2.5F, -1.0F, -3.5473F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		part11 = new ModelPart(this);
		part11.setPivot(1.9052F, 4.7968F, 2.3473F);
		bodyFloat.addChild(part11);
		setRotationAngle(part11, 0.0F, 0.0F, 0.5236F);
		part11.setTextureOffset(48, 79).addCuboid(-1.5F, -1.0F, -3.5473F, 4.0F, 2.0F, 4.0F, 0.0F, true);

		part12 = new ModelPart(this);
		part12.setPivot(0.0F, -1.9696F, 0.3472F);
		bodyFloat.addChild(part12);
		part12.setTextureOffset(0, 64).addCuboid(-2.0F, 2.9696F, 1.6528F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		part6_3 = new ModelPart(this);
		part6_3.setPivot(-4.1129F, 4.4536F, -3.5367F);
		part12.addChild(part6_3);
		setRotationAngle(part6_3, 0.0F, 0.0F, -0.7854F);
		part6_3.setTextureOffset(0, 74).addCuboid(2.0F, -2.0F, 0.0F, 1.0F, 3.0F, 6.0F, 0.0F, true);

		part6_4 = new ModelPart(this);
		part6_4.setPivot(4.1129F, 4.4536F, -3.5367F);
		part12.addChild(part6_4);
		setRotationAngle(part6_4, 0.0F, 0.0F, 0.7854F);
		part6_4.setTextureOffset(0, 74).addCuboid(-3.0F, -2.0F, 0.0F, 1.0F, 3.0F, 6.0F, 0.0F, true);

		rightarm2 = new ModelPart(this);
		rightarm2.setPivot(4.0667F, 4.2177F, 1.4699F);
		bodyFloat.addChild(rightarm2);
		setRotationAngle(rightarm2, 0.0F, -0.7854F, -1.6581F);
		rightarm2.setTextureOffset(40, 16).addCuboid(-2.9332F, -0.5783F, -1.8622F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		rightarmd2 = new ModelPart(this);
		rightarmd2.setPivot(-0.0667F, 5.0783F, -0.1378F);
		rightarm2.addChild(rightarmd2);
		setRotationAngle(rightarmd2, 0.0F, -0.4363F, 0.2618F);
		rightarmd2.setTextureOffset(48, 4).addCuboid(-2.5F, 0.0F, -1.5F, 4.0F, 7.0F, 4.0F, 0.0F, false);

		leftarm2 = new ModelPart(this);
		leftarm2.setPivot(-4.0667F, 4.2177F, 1.4699F);
		bodyFloat.addChild(leftarm2);
		setRotationAngle(leftarm2, 0.0F, 1.3963F, 1.6581F);
		leftarm2.setTextureOffset(40, 16).addCuboid(-1.0668F, -0.5783F, -1.8622F, 4.0F, 6.0F, 4.0F, 0.0F, true);

		leftarmd2 = new ModelPart(this);
		leftarmd2.setPivot(0.0667F, 5.0783F, -0.1378F);
		leftarm2.addChild(leftarmd2);
		setRotationAngle(leftarmd2, 0.0F, 0.6981F, -0.3491F);
		leftarmd2.setTextureOffset(48, 4).addCuboid(-1.5F, 0.0F, -1.5F, 4.0F, 7.0F, 4.0F, 0.0F, true);

		leftleg2 = new ModelPart(this);
		leftleg2.setPivot(-2.0F, 10.0F, 1.0F);
		bodyFloat.addChild(leftleg2);
		setRotationAngle(leftleg2, 0.0F, 0.0F, -0.0873F);
		leftleg2.setTextureOffset(21, 100).addCuboid(-3.0F, 0.0F, -3.5F, 5.0F, 7.0F, 5.0F, 0.0F, true);

		legdownl2 = new ModelPart(this);
		legdownl2.setPivot(0.0F, 7.0F, -0.5F);
		leftleg2.addChild(legdownl2);
		legdownl2.setTextureOffset(0, 100).addCuboid(-2.0F, -0.5F, -2.5F, 4.0F, 9.0F, 5.0F, 0.0F, true);

		rightleg2 = new ModelPart(this);
		rightleg2.setPivot(2.0F, 10.0F, 1.0F);
		bodyFloat.addChild(rightleg2);
		setRotationAngle(rightleg2, -1.309F, 0.2618F, 0.0F);
		rightleg2.setTextureOffset(21, 100).addCuboid(-2.0F, 0.0F, -3.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		legdownr2 = new ModelPart(this);
		legdownr2.setPivot(0.0F, 7.0F, -0.5F);
		rightleg2.addChild(legdownr2);
		setRotationAngle(legdownr2, 2.1817F, 0.0F, 0.0F);
		legdownr2.setTextureOffset(0, 100).addCuboid(-2.2F, -0.5F, -2.5F, 4.0F, 9.0F, 5.0F, 0.0F, false);

		strips = new ModelPart(this);
		strips.setPivot(-2.0F, 5.0F, 25.0F);
		setRotationAngle(strips, 0.0873F, 0.0F, 0.0F);


		strip1 = new ModelPart(this);
		strip1.setPivot(2.0F, 1.0F, 1.0F);
		strips.addChild(strip1);
		strip1.setTextureOffset(44, 36).addCuboid(-3.0F, -3.0F, -1.0F, 3.0F, 3.0F, 7.0F, 0.0F, false);

		strip2 = new ModelPart(this);
		strip2.setPivot(-1.0F, -2.0F, 7.0F);
		strip1.addChild(strip2);
		setRotationAngle(strip2, 0.3491F, 0.5236F, -0.1745F);
		strip2.setTextureOffset(2, 48).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);

		strip3 = new ModelPart(this);
		strip3.setPivot(1.0F, 0.0F, 11.0F);
		strip2.addChild(strip3);
		setRotationAngle(strip3, 0.3491F, 0.8727F, 0.6109F);
		strip3.setTextureOffset(2, 48).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);

		strip4 = new ModelPart(this);
		strip4.setPivot(1.3493F, -0.2779F, 10.1046F);
		strip3.addChild(strip4);
		setRotationAngle(strip4, 0.3491F, 1.4835F, 0.6981F);
		strip4.setTextureOffset(2, 48).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);

		strip5 = new ModelPart(this);
		strip5.setPivot(1.1632F, 1.1236F, 11.0628F);
		strip4.addChild(strip5);
		setRotationAngle(strip5, 0.3491F, 1.4835F, 0.6981F);
		strip5.setTextureOffset(2, 48).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);

		strip6 = new ModelPart(this);
		strip6.setPivot(1.8064F, 0.502F, 11.423F);
		strip5.addChild(strip6);
		setRotationAngle(strip6, 0.3491F, 1.4835F, 0.6981F);
		strip6.setTextureOffset(2, 48).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);

		strip7 = new ModelPart(this);
		strip7.setPivot(-0.3493F, -0.2217F, 10.7624F);
		strip6.addChild(strip7);
		setRotationAngle(strip7, 0.3491F, -1.309F, 0.6981F);
		strip7.setTextureOffset(2, 48).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);

		strip8 = new ModelPart(this);
		strip8.setPivot(-0.2159F, 0.0822F, 11.4868F);
		strip7.addChild(strip8);
		setRotationAngle(strip8, -0.4363F, -0.6109F, 0.6981F);
		strip8.setTextureOffset(2, 48).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);

		strip9 = new ModelPart(this);
		strip9.setPivot(-0.5709F, 0.8538F, 10.9519F);
		strip8.addChild(strip9);
		setRotationAngle(strip9, -0.4363F, -0.6109F, 0.6981F);
		strip9.setTextureOffset(2, 48).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);

		strip10 = new ModelPart(this);
		strip10.setPivot(0.2116F, -0.0739F, 11.2227F);
		strip9.addChild(strip10);
		setRotationAngle(strip10, -0.6981F, -0.7854F, -0.3491F);
		strip10.setTextureOffset(2, 48).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);

		strip11 = new ModelPart(this);
		strip11.setPivot(-0.2968F, 1.3778F, 10.9551F);
		strip10.addChild(strip11);
		setRotationAngle(strip11, -0.6981F, -1.7453F, -2.0944F);
		strip11.setTextureOffset(2, 48).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);

		head2 = new ModelPart(this);
		head2.setPivot(0.0F, 0.0F, -1.0F);
		head2.setTextureOffset(0, 0).addCuboid(-3.0F, -5.8F, -2.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		hat2 = new ModelPart(this);
		hat2.setPivot(0.0F, 24.0F, 1.0F);
		head2.addChild(hat2);
		hat2.setTextureOffset(35, 114).addCuboid(-3.5F, -30.0F, -3.5F, 7.0F, 7.0F, 7.0F, 0.0F, false);
		hat2.setTextureOffset(28, 0).addCuboid(-4.0F, -28.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		hat2.setTextureOffset(28, 0).addCuboid(3.0F, -28.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		hat2.setTextureOffset(28, 5).addCuboid(-1.5F, -30.5F, -2.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		hat_part_2 = new ModelPart(this);
		hat_part_2.setPivot(2.0F, -27.0F, -5.0F);
		hat2.addChild(hat_part_2);
		setRotationAngle(hat_part_2, -0.1745F, 0.0F, 0.0F);
		hat_part_2.setTextureOffset(54, 107).addCuboid(-3.5F, 0.5F, 1.5F, 3.0F, 3.0F, 2.0F, 0.0F, false);
	}
	@Override
	public void setAngles(LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch){
		this.yOffset = (double)MathHelper.cos((float)(0.1D * (double)animationProgress)) * 0.1D;
		this.head.roll = 0F;
		this.head.pitch = headPitch * 0.017453292F;
		this.head.yaw = headYaw * 0.017453292F;
	}
	@Override
	public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		matrixStack.translate(0.65D, this.yOffset - 0.3D, 0.75D);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
	}
	public void renderExtra(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		extra.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void renderAttack(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		matrixStack.translate(0.65D, this.yOffset - 0.8D, -0.75D);
		bodyFloat.render(matrixStack, buffer, packedLight, packedOverlay);
		strips.render(matrixStack, buffer, packedLight, packedOverlay);
		head2.render(matrixStack, buffer, packedLight, packedOverlay);
	}
	public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
	}

}