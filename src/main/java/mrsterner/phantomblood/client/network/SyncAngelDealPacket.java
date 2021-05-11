package mrsterner.phantomblood.client.network;

import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.util.NbtType;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.entity.interfaces.AngelDealAccessor;
import mrsterner.phantomblood.common.registry.AngelDeal;
import mrsterner.phantomblood.common.registry.PhantomBloodRegisters;

@SuppressWarnings("ConstantConditions")
public class SyncAngelDealPacket {
    public static final Identifier ID = new Identifier(PhantomBlood.MODID, "sync_contracts");

    public static void send(PlayerEntity player) {
        PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
        CompoundTag angelDeals = new CompoundTag();
        angelDeals.put("AngelDeals", ((AngelDealAccessor) player).toTagAngelDeal());
        buf.writeCompoundTag(angelDeals);
        ServerPlayNetworking.send((ServerPlayerEntity) player, ID, buf);
    }

    public static void handle(MinecraftClient client, ClientPlayNetworkHandler network, PacketByteBuf buf, PacketSender sender) {
        CompoundTag angelDealsTag = buf.readCompoundTag();
        client.execute(() -> {
            if (client.player != null) {
                ((AngelDealAccessor) client.player).getAngelDeals().clear();
                ListTag angelDeals = angelDealsTag.getList("AngelDeals", NbtType.COMPOUND);
                for (int i = 0; i < angelDeals.size(); i++) {
                    CompoundTag angelDeal = angelDeals.getCompound(i);
                    ((AngelDealAccessor) client.player).addAngelDeal(new AngelDeal.Instance(PhantomBloodRegisters.ANGEL_DEALS.get(new Identifier(angelDeal.getString("AngelDeal"))), angelDeal.getInt("Duration"), angelDeal.getInt("Cost")));
                }
            }
        });
    }
}