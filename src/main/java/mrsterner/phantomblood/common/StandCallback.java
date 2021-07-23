package mrsterner.phantomblood.common;

import mrsterner.phantomblood.common.item.KillerQueenTriggerItem;
import mrsterner.phantomblood.common.registry.PBObjects;
import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class StandCallback implements AttackEntityCallback, AttackBlockCallback {

    public static void init(){
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            if(StandUtils.getStand(player) == Stand.KILLER_QUEEN && hand == Hand.MAIN_HAND){
                if(!player.inventory.contains(new ItemStack(PBObjects.KILLER_QUEEN_TRIGGER))){
                    ItemStack trigger = new ItemStack(PBObjects.KILLER_QUEEN_TRIGGER);
                    KillerQueenTriggerItem.setData(trigger, KillerQueenTriggerItem.TYPE.ENTITY.getName(), entity.getUuid().toString(), 0, 0, 0);
                    if(player.getStackInHand(Hand.MAIN_HAND).isEmpty()){
                        player.setStackInHand(Hand.MAIN_HAND, trigger);
                    }else{
                        player.dropItem(trigger, false, true);
                    }
                }else{
                    PlayerInventory inventory = player.inventory;
                    List<ItemStack> mainInventory = inventory.main;
                    for(ItemStack trigger : mainInventory) {
                        if(trigger.getItem() == PBObjects.KILLER_QUEEN_TRIGGER) {
                            KillerQueenTriggerItem.setData(trigger, KillerQueenTriggerItem.TYPE.ENTITY.getName(), entity.getUuid().toString(), 0, 0, 0);
                            break;
                        }
                    }
                }
            }
            return ActionResult.PASS;
        });
        AttackBlockCallback.EVENT.register((player, world, hand, pos, direction) -> {
            if(StandUtils.getStand(player) == Stand.KILLER_QUEEN && hand == Hand.MAIN_HAND) {
                if(!player.inventory.contains(new ItemStack(PBObjects.KILLER_QUEEN_TRIGGER))){
                    ItemStack trigger = new ItemStack(PBObjects.KILLER_QUEEN_TRIGGER);
                    KillerQueenTriggerItem.setData(trigger, KillerQueenTriggerItem.TYPE.BLOCK.getName(),"empty",pos.getX(), pos.getY(), pos.getZ());
                    if(player.getStackInHand(Hand.MAIN_HAND).isEmpty()){
                        player.setStackInHand(Hand.MAIN_HAND, trigger);
                    }else{
                        player.dropItem(trigger, false, true);
                    }
                }else{
                    PlayerInventory inventory = player.inventory;
                    List<ItemStack> mainInventory = inventory.main;
                    for(ItemStack trigger : mainInventory) {
                        if(trigger.getItem() == PBObjects.KILLER_QUEEN_TRIGGER) {
                            System.out.println("Yee");
                            KillerQueenTriggerItem.setData(trigger, KillerQueenTriggerItem.TYPE.BLOCK.getName(),"empty",pos.getX(), pos.getY(), pos.getZ());
                            break;
                        }
                    }
                }
            }
            return ActionResult.PASS;
        });
    }

    @Override
    public ActionResult interact(PlayerEntity player, World world, Hand hand, Entity entity, @Nullable EntityHitResult hitResult) {
        return null;
    }

    @Override
    public ActionResult interact(PlayerEntity player, World world, Hand hand, BlockPos pos, Direction direction) {
        return null;
    }
}
