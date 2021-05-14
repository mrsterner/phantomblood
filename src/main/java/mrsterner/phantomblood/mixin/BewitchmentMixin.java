package mrsterner.phantomblood.mixin;

import moriyashiine.bewitchment.api.event.BloodSuckEvents;
import moriyashiine.bewitchment.api.interfaces.entity.BloodAccessor;
import moriyashiine.bewitchment.common.Bewitchment;
import moriyashiine.bewitchment.common.registry.BWTags;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import mrsterner.phantomblood.common.registry.PBObjects;


@Mixin(Bewitchment.class)
public abstract class BewitchmentMixin implements ModInitializer {

    /*  This gives 0 blood when succing, dont implement.
        @ModifyArg(method = "lambda$onInitialize$5", at = @At(value = "INVOKE", target = "Lmoriyashiine/bewitchment/api/interfaces/entity/BloodAccessor;fillBlood(IZ)Z"), index = 0, remap = false)
            private static int injected(int x){
                return 0;
        }
     */
    //REMEBER TO CHECK BITCODE IF BEWITCHMNET UPDATES THE CODE. View -> Show Bitcode, and look for which placement the lambda function UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) has.
    @SuppressWarnings("UnresolvedMixinReference")
    @Inject(method = "lambda$onInitialize$6", at = @At(value = "INVOKE", target = "Lmoriyashiine/bewitchment/api/interfaces/entity/BloodAccessor;fillBlood(IZ)Z"), remap = false)
    private static void inject(PlayerEntity player, World world, Hand hand, Entity entity, EntityHitResult hitresult, CallbackInfoReturnable<Float> cir) {
        int toGive = BWTags.HAS_BLOOD.contains(entity.getType()) ? 5 : entity instanceof AnimalEntity ? 1 : 0;
        toGive = BloodSuckEvents.BLOOD_AMOUNT.invoker().onBloodSuck(player, (LivingEntity) entity, toGive);
        BloodAccessor playerBlood = (BloodAccessor) player;


        ItemStack eq = player.getEquippedStack(EquipmentSlot.HEAD);
        if (eq.getItem() == PBObjects.VAMPIRE_HAT) {
            System.out.println("Mixin!");
            playerBlood.fillBlood(toGive, false);
        }
    }
}

