package mrsterner.phantomblood;

import com.williambl.haema.Vampirable;
import com.williambl.haema.VampireBloodManager;
import com.williambl.haema.api.BloodDrinkingEvents;
import moriyashiine.bewitchment.api.BewitchmentAPI;
import mrsterner.phantomblood.common.block.CoffinBlock;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.fabricmc.fabric.api.util.TriState;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.HungerManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import mrsterner.phantomblood.common.registry.*;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib3.GeckoLib;
import top.theillusivec4.somnus.api.PlayerSleepEvents;
import top.theillusivec4.somnus.api.WorldSleepEvents;

public class PhantomBlood implements ModInitializer {

    public static final String MODID = "phantomblood";
    public static final ItemGroup PHANTOMBLOOD_GROUP = FabricItemGroupBuilder.build(new Identifier(MODID, MODID), () -> new ItemStack(PBObjects.STONE_MASK_ITEM));
    public static boolean isHaemaLoaded;


    public static DefaultAttributeContainer.Builder createGenericEntityAttributes() {
        return PathAwareEntity.createMobAttributes().add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.80000000298023224D)
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 10.0D);
    }

    //addItemToInventoryAndConsume is copied from MoriyaShiine's Bewitchment 1.16.5
    public static void addItemToInventoryAndConsume(PlayerEntity player, Hand hand, ItemStack toAdd) {
        boolean shouldAdd = false;
        ItemStack stack = player.getStackInHand(hand);
        if (stack.getCount() == 1) {
            if (player.isCreative()) {
                shouldAdd = true;
            } else {
                player.setStackInHand(hand, toAdd);
            }
        } else {
            stack.decrement(1);
            shouldAdd = true;
        }
        if (shouldAdd) {
            if (!player.inventory.insertStack(toAdd)) {
                player.dropItem(toAdd, false, true);
            }
        }
    }

    @Override
    public void onInitialize() {
        UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            ItemStack eq = player.getEquippedStack(EquipmentSlot.FEET);
            LivingEntity livingEntity = (LivingEntity) (Object) entity;
            HungerManager var4 = player.getHungerManager();
            if (!world.isClient && ((Vampirable) player).isVampire() && player.isSneaking() && eq.getItem() == PBObjects.VAMPIRE_BOOTS) {
                ((VampireBloodManager) var4).feed(livingEntity, player);
                System.out.println("succ");
                return ActionResult.SUCCESS;
            }
            System.out.println("not");
            return ActionResult.PASS;
        });


        GeckoLib.initialize();
        PBObjects.init();
        PBStatusEffects.init();
        isHaemaLoaded = FabricLoader.getInstance().isModLoaded("haema");
        if (isHaemaLoaded) {
        }
        //Vampire Coat abilities, if ampoule is in off-hand, add blood ampoule on villager hit, otherwise, 10% chance to give blood directly to user
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            ItemStack eq = player.getEquippedStack(EquipmentSlot.CHEST);
            if (hand == Hand.MAIN_HAND && eq.getItem() == PBObjects.VAMPIRE_JACKET && entity.isAlive() && ((Vampirable) player).isVampire() && player.getStackInHand(hand).isEmpty()) {
                ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 3));
                //Inflict slowness on hit with empty hand
            }
            if (!world.isClient && eq.getItem() == PBObjects.VAMPIRE_JACKET && ((Vampirable) player).isVampire() && VampireBloodManager.Companion.getGoodBloodTag().contains(entity.getType())) {
                if (player.getOffHandStack().getItem() == PBObjects.AMPOULE) {
                    addItemToInventoryAndConsume(player, Hand.OFF_HAND, new ItemStack(PBObjects.BLOOD_AMPOULE));
                    return ActionResult.SUCCESS;
                    //Create blood ampoule
                }
                HungerManager var4 = player.getHungerManager();
                int t = MathHelper.nextInt(world.random, 1, 10);
                if (t == 1) {
                    ((VampireBloodManager) var4).addBlood(2F);
                    return ActionResult.SUCCESS;
                    //Randomly give blood on hit w/o ampoule
                }
            }
            return ActionResult.PASS;
        });
        WorldSleepEvents.WORLD_WAKE_TIME.register((world, newTime, curTime) -> {
            if (world.isDay()) {
                long time = curTime;
                while (time % 24000 < 13000) {
                    time++;
                }
                return time;
            }
            return newTime;
        });
        PlayerSleepEvents.CAN_SLEEP_NOW.register((player, pos) -> {
            if (player.world.getBlockState(pos).getBlock() instanceof CoffinBlock) {
                return player.world.isDay() ? TriState.TRUE : TriState.FALSE;
            }
            return TriState.DEFAULT;
        });
        PlayerSleepEvents.TRY_SLEEP.register((player, pos) -> {
            if (player.world.getBlockState(pos).getBlock() instanceof CoffinBlock && player.world.isNight()) {
                player.sendMessage(new TranslatableText("block.minecraft.bed.coffin"), true);
                return PlayerEntity.SleepFailureReason.OTHER_PROBLEM;
            }
            return null;
        });
    }
}