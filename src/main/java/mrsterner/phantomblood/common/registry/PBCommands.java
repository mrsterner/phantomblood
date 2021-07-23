package mrsterner.phantomblood.common.registry;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder;
import net.minecraft.command.CommandSource;
import net.minecraft.command.argument.ArgumentTypes;
import net.minecraft.command.argument.serialize.ConstantArgumentSerializer;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Style;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.concurrent.CompletableFuture;

public class PBCommands {
    public static class StandArgumentType implements ArgumentType<Stand> {

        @Override
        public Stand parse(StringReader reader) throws CommandSyntaxException {
            Identifier identifier = Identifier.fromCommandInput(reader);
            return null;
        }
        public static StandArgumentType stand() {
            return new StandArgumentType();
        }
        public static Stand getStand(CommandContext<ServerCommandSource> commandContext, String string) {
            return commandContext.getArgument(string, Stand.class);
        }
        @Override
        public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder) {
            return CommandSource.suggestIdentifiers(STAND.getIds(), builder);
        }
    }
    public static void init() {
        ArgumentTypes.register("mrsterner.phantomblood:stand", StandArgumentType.class, new ConstantArgumentSerializer<>(StandArgumentType::stand));
    }
    public static int setStand(CommandContext<ServerCommandSource> context, ServerPlayerEntity player, Stand stand) throws CommandSyntaxException {
        context.getSource().sendFeedback(new TranslatableText("command.phantomblood.setstand."+stand, player.getDisplayName()).setStyle(Style.EMPTY.withBold(true)), false);
        StandUtils.setStand(player, stand);
        StandUtils.setStandLevel(player, 1);
        return 0;
    }
    public static int removeStand(CommandContext<ServerCommandSource> context, ServerPlayerEntity player) throws CommandSyntaxException {
        context.getSource().sendFeedback(new TranslatableText("command.phantomblood.removestand", player.getDisplayName()).setStyle(Style.EMPTY.withBold(true)), false);
        StandUtils.setStand(player, Stand.NONE);
        StandUtils.setStandLevel(player, 0);
        return 0;
    }
    public static int hamon(CommandContext<ServerCommandSource> context, ServerPlayerEntity player) throws CommandSyntaxException {
        context.getSource().sendFeedback(new TranslatableText("command.phantomblood.removestand", player.getDisplayName()).setStyle(Style.EMPTY.withBold(true)), false);
        if(StandUtils.getStand(player) == Stand.HAMON){
            StandUtils.setStand(player, Stand.NONE);
        }else{
            StandUtils.setStand(player, Stand.HAMON);
        }
        StandUtils.setStandLevel(player, 0);

        return 0;
    }


    public static final Registry<Stand> STAND = FabricRegistryBuilder.createSimple(Stand.class, new Identifier(PhantomBlood.MODID, "stand")).buildAndRegister();
}
