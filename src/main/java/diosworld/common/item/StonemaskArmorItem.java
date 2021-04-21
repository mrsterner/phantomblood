package diosworld.common.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.item.GeoArmorItem;

//This is an example of animated armor. Make sure to read the comments thoroughly and also check out PotatoArmorRenderer.
public class StonemaskArmorItem extends GeoArmorItem implements IAnimatable{
    private AnimationFactory factory = new AnimationFactory(this);

    public StonemaskArmorItem(ArmorMaterial materialIn, EquipmentSlot slot, Item.Settings builder) {
        super(materialIn, slot, builder);
    }
    private <P extends IAnimatable> PlayState predicate(AnimationEvent<P> event)
    {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("stonemask.animation.loop", true));
        return PlayState.CONTINUE;
    }
    // All you need to do here is add your animation controllers to the
    // AnimationData
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

}
