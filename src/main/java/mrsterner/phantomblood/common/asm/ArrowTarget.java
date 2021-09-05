package mrsterner.phantomblood.common.asm;

import mrsterner.phantomblood.common.item.ArrowHeadItem;
import mrsterner.phantomblood.mixin.EnchantmentTargetMixin;
import net.minecraft.item.Item;

public class ArrowTarget extends EnchantmentTargetMixin {
    @Override
    public boolean isAcceptableItem(Item item) {
        return item instanceof ArrowHeadItem;
    }
}