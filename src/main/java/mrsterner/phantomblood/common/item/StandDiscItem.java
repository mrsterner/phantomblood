package mrsterner.phantomblood.common.item;

import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class StandDiscItem extends Item {
    public StandDiscItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        String s = this.asItem().toString();
        switch (s){
            case "the_world_disc":
                StandUtils.setStand(user, Stand.THE_WORLD);
                break;
            case "star_platinum_disc":
                StandUtils.setStand(user, Stand.STAR_PLATINUM);
                break;
            case "killer_queen_disc":
                StandUtils.setStand(user, Stand.KILLER_QUEEN);
                break;
            default:
        }
        return super.use(world, user, hand);
    }
    @Environment(EnvType.CLIENT)
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        String s = this.asItem().toString();
        switch (s){
            case "the_world_disc":
                tooltip.add(new TranslatableText("tooltip.phantomblood.the_world_disc").formatted(Formatting.GOLD));
                break;
            case "star_platinum_disc":
                tooltip.add(new TranslatableText("tooltip.phantomblood.star_platinum_disc").formatted(Formatting.GOLD));
                break;
            case "killer_queen_disc":
                tooltip.add(new TranslatableText("tooltip.phantomblood.killer_queen_disc").formatted(Formatting.GOLD));
                break;
            default:
    }
}}
