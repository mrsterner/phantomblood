package mrsterner.phantomblood.common.registry;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.minecraft.command.argument.ArgumentTypes;
import net.minecraft.command.argument.BlockPosArgumentType;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.command.argument.serialize.ConstantArgumentSerializer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Style;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
// getString(ctx, "string")
import static com.mojang.brigadier.arguments.StringArgumentType.getString;
// word()
import static com.mojang.brigadier.arguments.StringArgumentType.word;
// literal("foo")
import static net.minecraft.server.command.CommandManager.literal;
// argument("bar", word())
import static net.minecraft.server.command.CommandManager.argument;
// Import everything
import static net.minecraft.server.command.CommandManager.*;

public class PBCommands {
    public static void init(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated) {
        dispatcher.register(CommandManager.literal("stand").requires(source -> source.hasPermissionLevel(2))
        .then(CommandManager.literal("remove")
                .executes(context -> giveStatFeedback(context, context.getSource().getPlayer()))
            .then(CommandManager.argument("player", EntityArgumentType.player()).executes(context -> giveStatFeedback(context, EntityArgumentType.getPlayer(context, "player"))))));
    }
    private static class StandArgumentType implements ArgumentType<Stand> {

        @Override
        public Stand parse(StringReader reader) throws CommandSyntaxException {
            Identifier identifier = Identifier.fromCommandInput(reader);
            return null;
        }
        public static StandArgumentType stand() {
            return new StandArgumentType();
        }
    }
    public static void registerArgumentTypes() {
        ArgumentTypes.register("mrsterner.phantomblood:stand", StandArgumentType.class, new ConstantArgumentSerializer<>(StandArgumentType::stand));
    }

    private static int setStand(CommandContext<ServerCommandSource> context, int value, ServerPlayerEntity... players) throws CommandSyntaxException {
        System.out.println("Ey");
        return value;
    }

    private static int giveStatFeedback(CommandContext<ServerCommandSource> context, ServerPlayerEntity player) throws CommandSyntaxException {
        context.getSource().sendFeedback(new TranslatableText("command.phantomblood.remove", player.getDisplayName()).setStyle(Style.EMPTY.withBold(true)), false);
        StandUtils.setStand(player, Stand.NONE);
        giveSanityFeedback(context, player);
        return 0;
    }

    private static void giveSanityFeedback(CommandContext<ServerCommandSource> context, ServerPlayerEntity player) {
    }
}
