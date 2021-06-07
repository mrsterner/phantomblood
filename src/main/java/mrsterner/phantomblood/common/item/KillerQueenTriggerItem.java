package mrsterner.phantomblood.common.item;

import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class KillerQueenTriggerItem extends Item {

    public KillerQueenTriggerItem(Settings settings) {
        super(settings);
    }

    public static CompoundTag getTagCompoundSafe(ItemStack stack) {
        return PhantomBlood.getTagCompoundSafe(stack);
    }

    public static void setData(ItemStack stack, String type, @Nullable String uuid, float x, float y, float z) {
        CompoundTag tag = new CompoundTag();
        tag.putString(TAG.TYPE.getName(), type);
        TYPE t =TYPE.getType(type);
        switch (t) {
            case BLOCK:
                tag.putDouble(TAG.POS_X.getName(), x);
                tag.putDouble(TAG.POS_Y.getName(), y);
                tag.putDouble(TAG.POS_Z.getName(), z);
                break;
            case ENTITY:
                tag.putString(TAG.UUID.getName(), uuid);
                break;
            default:
                break;
        }
        getTagCompoundSafe(stack).put(TAG.TAGs.getName(), tag);


    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        int energy = StandUtils.getStandEnergy(user);
        int energyForAbility = StandUtils.getStand(user).energyForAbility;
        if(energy >= energyForAbility){
            StandUtils.setStandEnergy(user, energy - energyForAbility);

            ItemStack stack = user.getStackInHand(hand);
            CompoundTag tag = getTagCompoundSafe(stack).getCompound(TAG.TAGs.getName());
            String type = tag.getString(TAG.TYPE.getName());
            TYPE t =TYPE.getType(type);
            if(t!=null){
                switch (t){
                    case BLOCK:
                        System.out.println("block");
                        BlockPos pos = new BlockPos(tag.getDouble(TAG.POS_X.getName()), tag.getDouble(TAG.POS_Y.getName()), tag.getDouble(TAG.POS_Z.getName()));
                        world.createExplosion(user,pos.getX(),pos.getY() + 1,pos.getZ(), 3f + StandUtils.getStandLevel(user), Explosion.DestructionType.NONE);
                        stack.decrement(1);
                        StandUtils.getStandEnergy(user);
                        break;
                    case ENTITY:
                        System.out.println("entity");
                        String uuid =tag.getString(TAG.UUID.getName());
                        List<Entity> entities = world.getEntitiesByClass(Entity.class, new Box(user.getBlockPos()).expand(128, 128, 128), null);
                        if(entities!=null) {
                            for(Entity entity : entities){
                                if(entity.getUuid().toString().equals(uuid)){
                                    entity.getEntityWorld().createExplosion(entity, entity.getX(), entity.getY(), entity.getZ(), 2f, Explosion.DestructionType.NONE);
                                    entity.damage(DamageSource.explosion(user), 20f + StandUtils.getStandLevel(user));
                                }
                            }
                        }
                        stack.decrement(1);
                        break;
                    default:
                        System.out.println("fail");
                        break;
                }


            }

            return super.use(world, user, hand);
        }
        return super.use(world, user, hand);

    }
    public static enum TAG {
        TAGs("nbts"),TYPE("type"),UUID("uuid"),POS_X("pos_x"),POS_Y("pos_y"),POS_Z("pos_z");
        TAG(String name){
            this.name =name;
        }
        private String name;
        public String getName() {
            return name;
        }
    }
    public static enum TYPE {
        ENTITY("entity"),BLOCK("block");
        TYPE(String name){
            this.name =name;
        }
        private String name;
        public String getName() {
            return name;
        }
        public static TYPE getType(String name) {
            for(TYPE type : values()) {
                if(type.getName().equals(name)) {
                    return type;
                }
            }
            return null;
        }
    }
}
