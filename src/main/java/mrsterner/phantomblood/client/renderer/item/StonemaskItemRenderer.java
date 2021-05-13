package mrsterner.phantomblood.client.renderer.item;

import mrsterner.phantomblood.client.model.item.StonemaskItemModel;
import mrsterner.phantomblood.common.item.StonemaskItem;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import software.bernie.geckolib3.renderer.geo.GeoItemRenderer;

public class StonemaskItemRenderer extends GeoItemRenderer<StonemaskItem> {
    public StonemaskItemRenderer() {
        super(new StonemaskItemModel());
    }
}
