package phantomblood;


import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.PathAwareEntity;
import phantomblood.common.StonemaskDeath;
import phantomblood.common.StonemaskEffect;
import phantomblood.common.registry.PhantomBloodObjects;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import software.bernie.geckolib3.GeckoLib;

public class PhantomBlood implements ModInitializer {

    public static final String MODID = "phantomblood";
    public static final ItemGroup DIO_GROUP = FabricItemGroupBuilder.build(new Identifier(MODID, MODID), () -> new ItemStack(PhantomBloodObjects.STONE_MASK_ITEM));

    public static final StatusEffect STONE_MASK_VAMP = new StonemaskEffect();
    public static final StatusEffect STONE_MASK_DEATH = new StonemaskDeath();

    public static void registerRenderLayers() {
        RenderLayer cutout = RenderLayer.getCutout();
    }

    public static DefaultAttributeContainer.Builder createGenericEntityAttributes() {
        return PathAwareEntity.createMobAttributes().add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.80000000298023224D)
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 10.0D);
    }

    @Override
    public void onInitialize() {


        GeckoLib.initialize();
        PhantomBloodObjects.init();
        Registry.register(Registry.STATUS_EFFECT, new Identifier("phantomblood", "timestopeffect"), STONE_MASK_VAMP);
        Registry.register(Registry.STATUS_EFFECT, new Identifier("phantomblood", "stonemaskeffect"), STONE_MASK_DEATH);
        FabricDefaultAttributeRegistry.register(PhantomBloodObjects.THE_WORLD_ENTITY, createGenericEntityAttributes());

    }


}