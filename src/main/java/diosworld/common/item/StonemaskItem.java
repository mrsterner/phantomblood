package diosworld.common.item;


import dev.emi.trinkets.api.SlotGroups;
import dev.emi.trinkets.api.Slots;
import dev.emi.trinkets.api.Trinket;
import dev.emi.trinkets.api.TrinketItem;
import diosworld.common.registry.DioObjects;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Wearable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class StonemaskItem extends TrinketItem implements IAnimatable, Wearable
{
    public AnimationFactory factory = new AnimationFactory(this);

    @Override
    public boolean canWearInSlot(String s, String s1) {
        return s.equals(SlotGroups.HEAD) && s1.equals(Slots.MASK);
    }

    public StonemaskItem(Settings properties)
    {
        super(properties);
    }

    private <P extends Item & IAnimatable> PlayState predicate(AnimationEvent<P> event)
    {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.stonemask.loop", true));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData data)
    {
        data.addAnimationController(new AnimationController(this, "controller", 20, this::predicate));
    }

    @Override
    public AnimationFactory getFactory()
    {
        return this.factory;
    }

    @Override
    public void render(String slot, MatrixStack matrixStack, VertexConsumerProvider vertexConsumer, int light, PlayerEntityModel<AbstractClientPlayerEntity> model, AbstractClientPlayerEntity player, float headYaw, float headPitch) {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        ItemStack stack = new ItemStack(DioObjects.STONE_MASK_ITEM);
        Trinket.translateToFace(matrixStack,model,player,headYaw,headPitch);
        matrixStack.scale(-0.35f,-0.35f,0.35f);
        matrixStack.translate(0,-0.1f,0.2f);
        itemRenderer.renderItem(stack, ModelTransformation.Mode.FIXED,light, OverlayTexture.DEFAULT_UV,matrixStack,vertexConsumer);

    }
}
