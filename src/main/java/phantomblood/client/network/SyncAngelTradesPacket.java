package phantomblood.client.network;

import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import phantomblood.PhantomBlood;
import phantomblood.common.entity.AngelEntity;
import phantomblood.common.entity.interfaces.AngelMerchant;

@SuppressWarnings("ConstantConditions")
public class SyncAngelTradesPacket {
    public static final Identifier ID = new Identifier(PhantomBlood.MODID, "sync_angel_trades");

    public static void send(PlayerEntity player, AngelMerchant merchant, int syncId) {
        PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
        buf.writeInt(syncId);
        AngelEntity.AngelTradeOffer.toPacket(merchant.getOffers(), buf);
        buf.writeInt(merchant.getAngelTrader().getEntityId());
        ServerPlayNetworking.send((ServerPlayerEntity) player, ID, buf);
    }

    //@Environment notoriously fails on this specific method even when it's empty so here we are
}