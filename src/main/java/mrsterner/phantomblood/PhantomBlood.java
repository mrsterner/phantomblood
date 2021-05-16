package mrsterner.phantomblood;

import moriyashiine.bewitchment.api.BewitchmentAPI;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import mrsterner.phantomblood.common.entity.interfaces.AngelDealAccessor;
import mrsterner.phantomblood.common.registry.*;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.GeckoLib;

public class PhantomBlood implements ModInitializer {

    public static final String MODID = "phantomblood";
    public static final ItemGroup PHANTOMBLOOD_GROUP = FabricItemGroupBuilder.build(new Identifier(MODID, MODID), () -> new ItemStack(PBObjects.STONE_MASK_ITEM));


    public static DefaultAttributeContainer.Builder createGenericEntityAttributes() {
        return PathAwareEntity.createMobAttributes().add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.80000000298023224D)
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 10.0D);
    }

    @Override
    public void onInitialize() {
        GeckoLib.initialize();
        PBObjects.init();
        PBEntities.init();
        PBAngelDeals.init();
        CommandRegistrationCallback.EVENT.register(PBCommands::init);
        PBCommands.registerArgumentTypes();
        PBStatusEffects.init();

        ServerPlayerEvents.COPY_FROM.register((oldPlayer, newPlayer, alive) -> {
            ((AngelDealAccessor) newPlayer).getAngelDeals().addAll(((AngelDealAccessor) oldPlayer).getAngelDeals());
        });

        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            ItemStack eq = player.getEquippedStack(EquipmentSlot.CHEST);
            if (hand == Hand.MAIN_HAND && eq.getItem() == PBObjects.VAMPIRE_JACKET && entity.isAlive() && BewitchmentAPI.isVampire(player, true) && player.getStackInHand(hand).isEmpty()) {
                ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 3));
            }
            return ActionResult.PASS;
        });
    }
}