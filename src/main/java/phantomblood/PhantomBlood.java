package phantomblood;

import moriyashiine.bewitchment.api.BewitchmentAPI;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import phantomblood.common.registry.PhantomBloodDeals;
import phantomblood.common.registry.PhantomBloodEntities;
import phantomblood.common.registry.PhantomBloodRegisters;
import phantomblood.common.statuseffect.StonemaskDeath;
import phantomblood.common.statuseffect.StonemaskEffect;
import phantomblood.common.registry.PhantomBloodObjects;
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
        Registry.register(Registry.STATUS_EFFECT, new Identifier("phantomblood", "timestopeffect"), TIME_STOP);
        Registry.register(Registry.STATUS_EFFECT, new Identifier("phantomblood", "stonemaskeffect"), STONE_MASK_DEATH);
        FabricDefaultAttributeRegistry.register(PhantomBloodObjects.THE_WORLD_ENTITY, createGenericEntityAttributes());


        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            ItemStack eq = player.getEquippedStack(EquipmentSlot.CHEST);
            if (hand == Hand.MAIN_HAND && eq.getItem() == PhantomBloodObjects.VAMPIRE_JACKET && entity.isAlive() && BewitchmentAPI.isVampire(player, true) && player.getStackInHand(hand).isEmpty()) {
                ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 3));
            }
            return ActionResult.PASS;
        });
    }
}