package mrsterner.phantomblood.mixin;

import com.williambl.haema.Vampirable;
import mrsterner.phantomblood.common.registry.PBObjects;
import mrsterner.phantomblood.common.registry.PBSoundEvents;
import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandMode;
import mrsterner.phantomblood.common.stand.StandUtils;
import mrsterner.phantomblood.common.timestop.TimeStopUtils;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;


@SuppressWarnings("ConstantConditions")
@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {

    @Shadow
    protected abstract float getSoundVolume();

    @Shadow
    protected abstract float getSoundPitch();

    @Shadow public abstract float getMovementSpeed();

    @Shadow public abstract boolean damage(DamageSource source, float amount);


    @Shadow public abstract Map<StatusEffect, StatusEffectInstance> getActiveStatusEffects();

    public LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(method = "tick", at = @At("TAIL"))
    private void tick(CallbackInfo callbackInfo) {
        if (!world.isClient) {
            LivingEntity livingEntity = (LivingEntity) (Object) this;
            ItemStack head = livingEntity.getEquippedStack(EquipmentSlot.HEAD);
                if (head.getItem() == PBObjects.BLOODY_STONE_MASK_ITEM && !((Vampirable) this).isVampire()) {

                    Vampirable.Companion.convert(((PlayerEntity) (Object) this));
                    world.playSound(null, getBlockPos(), PBSoundEvents.VAMPIRE, getSoundCategory(), getSoundVolume(), getSoundPitch());
                }
                if(head.getItem() == PBObjects.STONE_MASK_ITEM){
                    livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3,1));
                }

                if(livingEntity instanceof PlayerEntity){
                    PlayerEntity player = (PlayerEntity) (Object) this;
                    ItemStack hand = livingEntity.getStackInHand(Hand.MAIN_HAND);
                    if(StandUtils.getStand(player) == Stand.CRAZY_DIAMOND && StandUtils.getStandMode(player) == StandMode.HEALING){
                        if(!hand.isEmpty() && hand.getDamage()>0){
                            int result = hand.getDamage()-1;
                            int energy = StandUtils.getStandEnergy(player);
                            int energyForAbility = StandUtils.getStand(player).energyForAbility;
                            StandUtils.setStandEnergy(player, energy - energyForAbility);
                            hand.setDamage(Math.max(result, 0));
                            this.getServer().getPlayerManager().sendToAll(ServerPlayNetworking.createS2CPacket(new Identifier("phantomblood:stop_time"), PacketByteBufs.create().writeUuid(player.getUuid()).writeVarLong(20)));
                        }
                    }
                    if(StandUtils.getStand(player) == Stand.THE_SUN && StandUtils.isStandActive(player) && !player.isTouchingWaterOrRain()){
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 60));
                        player.setOnFireFor(2);
                    }
            }
        }
        if(world.isClient){
            if(TimeStopUtils.getTimeStoppedTicks(world) == 1){
                this.playSound(PBSoundEvents.THE_WORLD_END, this.getSoundVolume(),this.getSoundPitch());
            }
        }
    }
    @Inject(method = "travel", at = @At("TAIL"))
    private void darkBlueMoonTravel(Vec3d movementInput, CallbackInfo callbackInfo) {
        LivingEntity livingEntity = (LivingEntity) (Object) this;
        if(livingEntity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) (Object) this;
            if(StandUtils.isStandActive(player) && StandUtils.getStand(player) == Stand.DARK_BLUE_MOON){
                if(player.isTouchingWaterOrRain()){
                    float h = 3.0F;
                    float g = 0.02F;
                    g += (this.getMovementSpeed() - g) * h / 3.0F;
                    this.updateVelocity(g, movementInput);
                    this.move(MovementType.SELF, this.getVelocity());
                    float j = 0.96F;
                    Vec3d vec3d = this.getVelocity();
                    this.setVelocity(vec3d.multiply((double)j, 1.0D, (double)j));
                }else{
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 40, StandUtils.getStandMode(player) != StandMode.ATTACKING ? 1 : 2));
                }
            }
        }
    }

    @Inject(method = "tickStatusEffects", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;addParticle(Lnet/minecraft/particle/ParticleEffect;DDDDDD)V"), cancellable = true)
    private void darkBlueMoonEffect(CallbackInfo callbackInfo) {
        LivingEntity livingEntity = (LivingEntity) (Object) this;
        if(livingEntity instanceof PlayerEntity){
            PlayerEntity player = (PlayerEntity) (Object) this;
            if(StandUtils.isStandActive(player) && StandUtils.getStand(player) == Stand.DARK_BLUE_MOON && player.isTouchingWaterOrRain()){
                callbackInfo.cancel();
            }
            if(StandUtils.isStandActive(player) && StandUtils.getStand(player) == Stand.THE_SUN){
                callbackInfo.cancel();
            }
        }
    }
}