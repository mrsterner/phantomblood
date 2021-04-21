package diosworld;

import dev.emi.trinkets.api.SlotGroups;
import dev.emi.trinkets.api.Slots;
import dev.emi.trinkets.api.TrinketSlots;
import diosworld.client.renderer.armor.StonemaskArmorRenderer;
import diosworld.common.item.StonemaskArmorItem;
import diosworld.common.registry.DioObjects;
import moriyashiine.bewitchment.common.registry.BWObjects;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.example.EntityUtils;
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

        GeoArmorRenderer.registerArmorRenderer(StonemaskArmorItem.class, new StonemaskArmorRenderer());

    }


}