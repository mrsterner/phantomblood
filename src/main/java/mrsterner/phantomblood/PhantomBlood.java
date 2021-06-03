package mrsterner.phantomblood;

import com.williambl.haema.Vampirable;
import com.williambl.haema.VampireBloodManager;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentFactoryRegistry;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentInitializer;
import dev.onyxstudios.cca.api.v3.world.WorldComponentFactoryRegistry;
import mrsterner.phantomblood.common.block.CoffinBlock;
import mrsterner.phantomblood.common.registry.PBUtil;
import mrsterner.phantomblood.stand.*;
import mrsterner.phantomblood.timestop.StoppedTimeDamageHandler;
import mrsterner.phantomblood.timestop.TimeStopComponent;
import mrsterner.phantomblood.timestop.TimeStopComponentImpl;
import nerdhub.cardinal.components.api.util.RespawnCopyStrategy;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.util.TriState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
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
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import software.bernie.geckolib3.GeckoLib;
import top.theillusivec4.somnus.api.PlayerSleepEvents;
import top.theillusivec4.somnus.api.WorldSleepEvents;
import dev.onyxstudios.cca.api.v3.world.WorldComponentInitializer;


public final class PhantomBlood implements ModInitializer, EntityComponentInitializer, WorldComponentInitializer  {

    public static final String MODID = "phantomblood";
    public static final ItemGroup PHANTOMBLOOD_GROUP = FabricItemGroupBuilder.build(new Identifier(MODID, MODID), () -> new ItemStack(PBObjects.STONE_MASK_ITEM));



    @Override
    public void onInitialize() {
        GeckoLib.initialize();
        PBObjects.init();
        PBStatusEffects.init();

        //Vampire Coat abilities, if ampoule is in off-hand, add blood ampoule on villager hit, otherwise, 10% chance to give blood directly to user
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            ItemStack chest = player.getEquippedStack(EquipmentSlot.CHEST);
            ItemStack feet = player.getEquippedStack(EquipmentSlot.FEET);
            if (hand == Hand.MAIN_HAND && chest.getItem() == PBObjects.VAMPIRE_BOOTS && entity.isAlive() && ((Vampirable) player).isVampire() && player.getStackInHand(hand).isEmpty()) {
                ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 100, 4));
                //Inflict slowness on hit with empty hand
            }
            if (!world.isClient && chest.getItem() == PBObjects.VAMPIRE_JACKET && ((Vampirable) player).isVampire() && VampireBloodManager.Companion.getGoodBloodTag().contains(entity.getType())) {
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

        //Somnus and Coffin code for sleep on the day
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

        ServerPlayNetworking.registerGlobalReceiver(new Identifier("phantomblood:use_ability"), (server, player, handler, buf, response) -> {
            StandUtils.getStand(player).handler.receive(server, player, handler, buf, response);
        });
        ServerPlayNetworking.registerGlobalReceiver(new Identifier("phantomblood:toggle_stand"), (server, player, handler, buf, response) -> {
            server.execute(() -> StandUtils.toggleStandActive(player));
        });
        ServerPlayNetworking.registerGlobalReceiver(new Identifier("phantomblood:change_stand_mode"), (server, player, handler, buf, response) -> {
            server.execute(() -> StandUtils.setToNextStandMode(player));
        });

        new StoppedTimeDamageHandler().registerCallbacks();
        ServerTickEvents.START_WORLD_TICK.register(world -> world.getPlayers().stream()
                .filter(it -> StandUtils.getStand(it) == Stand.THE_WORLD && StandUtils.isStandActive(it) && StandUtils.getStandMode(it) == StandMode.ATTACKING)
                .forEach(player -> {
                    int level = StandUtils.getStandLevel(player);
                    world.getOtherEntities(player, player.getBoundingBox().expand(2.0*MathHelper.sin(player.yaw), 0.0, 2.0*MathHelper.cos(player.yaw)))
                            .forEach(it -> it.damage(DamageSource.player(player), level == 0 ? 3.0f : 6.0f));
                })
        );
    }

    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerForPlayers(StandUserComponent.entityKey, StandUserComponentImpl::new, RespawnCopyStrategy.ALWAYS_COPY);
    }

    public void registerWorldComponentFactories(WorldComponentFactoryRegistry registry) {
        registry.register(TimeStopComponent.worldKey, TimeStopComponentImpl::new);
    }
}