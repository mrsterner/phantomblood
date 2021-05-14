package mrsterner.phantomblood;

import moriyashiine.bewitchment.api.BewitchmentAPI;
import mrsterner.phantomblood.common.statuseffect.UrielEffect;
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
import mrsterner.phantomblood.common.statuseffect.StonemaskDeath;
import mrsterner.phantomblood.common.statuseffect.StonemaskEffect;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import software.bernie.geckolib3.GeckoLib;

public class PhantomBlood implements ModInitializer {

    public static final String MODID = "phantomblood";
    public static final ItemGroup PHANTOMBLOOD_GROUP = FabricItemGroupBuilder.build(new Identifier(MODID, MODID), () -> new ItemStack(PhantomBloodObjects.STONE_MASK_ITEM));

    public static final StatusEffect TIME_STOP = new StonemaskEffect();
    public static final StatusEffect STONE_MASK_DEATH = new StonemaskDeath();
    public static final StatusEffect URIEL_EFFECT = new UrielEffect();

    public static DefaultAttributeContainer.Builder createGenericEntityAttributes() {
        return PathAwareEntity.createMobAttributes().add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.80000000298023224D)
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 10.0D);
    }

    @Override
    public void onInitialize() {
        GeckoLib.initialize();
        PhantomBloodObjects.init();
        PhantomBloodEntities.init();
        PhantomBloodDeals.init();
        CommandRegistrationCallback.EVENT.register(PhantomBloodCommands::init);
        PhantomBloodCommands.registerArgumentTypes();
        Registry.register(Registry.STATUS_EFFECT, new Identifier("phantomblood", "timestopeffect"), TIME_STOP);
        Registry.register(Registry.STATUS_EFFECT, new Identifier("phantomblood", "stonemaskeffect"), STONE_MASK_DEATH);
        Registry.register(Registry.STATUS_EFFECT, new Identifier("phantomblood", "urieleffect"), URIEL_EFFECT);
        FabricDefaultAttributeRegistry.register(PhantomBloodObjects.THE_WORLD_ENTITY, createGenericEntityAttributes());

        ServerPlayerEvents.COPY_FROM.register((oldPlayer, newPlayer, alive) -> {
            ((AngelDealAccessor) newPlayer).getAngelDeals().addAll(((AngelDealAccessor) oldPlayer).getAngelDeals());
        });

        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            ItemStack eq = player.getEquippedStack(EquipmentSlot.CHEST);
            if (hand == Hand.MAIN_HAND && eq.getItem() == PhantomBloodObjects.VAMPIRE_JACKET && entity.isAlive() && BewitchmentAPI.isVampire(player, true) && player.getStackInHand(hand).isEmpty()) {
                ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 3));
            }
            return ActionResult.PASS;
        });
    }
}