package diosworld;

import dev.emi.trinkets.api.SlotGroups;
import dev.emi.trinkets.api.Slots;
import dev.emi.trinkets.api.TrinketSlots;
import diosworld.client.renderer.armor.StonemaskRenderer;
import diosworld.common.item.StonemaskArmorItem;
import diosworld.common.registry.DioObjects;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;

public class Dio implements ModInitializer {

    public static final String MODID = "diosworld";
    public static final ItemGroup DIO_GROUP = FabricItemGroupBuilder.build(new Identifier(MODID, MODID), () -> new ItemStack(DioObjects.STONE_MASK_ITEM));

    @Override
    public void onInitialize() {
        TrinketSlots.addSlot(SlotGroups.HEAD, Slots.MASK, new Identifier("trinkets", "textures/item/empty_trinket_slot_mask.png"));
        GeckoLib.initialize();
        DioObjects.init();

        GeoArmorRenderer.registerArmorRenderer(StonemaskArmorItem.class, new StonemaskRenderer());

    }


}