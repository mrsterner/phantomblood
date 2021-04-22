package diosworld;


import diosworld.common.StonemaskDeath;
import diosworld.common.StonemaskEffect;
import diosworld.common.registry.DioObjects;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import software.bernie.geckolib3.GeckoLib;

public class Dio implements ModInitializer {

    public static final String MODID = "diosworld";
    public static final ItemGroup DIO_GROUP = FabricItemGroupBuilder.build(new Identifier(MODID, MODID), () -> new ItemStack(DioObjects.STONE_MASK_ITEM));

    public static final StatusEffect STONE_MASK_VAMP = new StonemaskEffect();
    public static final StatusEffect STONE_MASK_DEATH = new StonemaskDeath();

    public static void registerRenderLayers() {
        RenderLayer cutout = RenderLayer.getCutout();
    }

    @Override
    public void onInitialize() {


        GeckoLib.initialize();
        DioObjects.init();
        Registry.register(Registry.STATUS_EFFECT, new Identifier("diosworld", "stoneeffect"), STONE_MASK_VAMP);
        Registry.register(Registry.STATUS_EFFECT, new Identifier("diosworld", "stonedeath"), STONE_MASK_DEATH);

    }


}