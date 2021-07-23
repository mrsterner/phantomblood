package mrsterner.phantomblood.common;

import com.williambl.haema.Vampirable;
import com.williambl.haema.VampireBloodManager;
import mrsterner.phantomblood.common.block.CoffinBlock;
import mrsterner.phantomblood.common.item.KillerQueenTriggerItem;
import mrsterner.phantomblood.common.registry.PBObjects;
import mrsterner.phantomblood.common.registry.PBUtil;
import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.util.TriState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.HungerManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import top.theillusivec4.somnus.api.PlayerSleepEvents;
import top.theillusivec4.somnus.api.WorldSleepEvents;

import java.util.List;

public class VampireCallback extends WorldSleepEvents implements AttackEntityCallback {

    public static void init(){
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            ItemStack chest = player.getEquippedStack(EquipmentSlot.CHEST);
            if (hand == Hand.MAIN_HAND && chest.getItem() == PBObjects.VAMPIRE_BOOTS && entity.isAlive() && ((Vampirable) player).isVampire() && player.getStackInHand(hand).isEmpty()) {
                ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 100, 4));
                //Inflict slowness on hit with empty hand
            }
            if (!world.isClient && chest.getItem() == PBObjects.VAMPIRE_JACKET || chest.getItem() == PBObjects.VAMPIRE_JACKET_F && ((Vampirable) player).isVampire() && VampireBloodManager.Companion.getGoodBloodTag().contains(entity.getType())) {
                if (player.getOffHandStack().getItem() == PBObjects.AMPOULE) {
                    PBUtil.addItemToInventoryAndConsume(player, Hand.OFF_HAND, new ItemStack(PBObjects.BLOOD_AMPOULE));
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

    @Override
    public ActionResult interact(PlayerEntity player, World world, Hand hand, Entity entity, @Nullable EntityHitResult hitResult) {
        return null;
    }
}
