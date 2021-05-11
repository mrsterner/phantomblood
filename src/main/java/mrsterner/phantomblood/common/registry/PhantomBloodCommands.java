package mrsterner.phantomblood.common.registry;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import net.minecraft.command.CommandSource;
import net.minecraft.command.argument.ArgumentTypes;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.command.argument.serialize.ConstantArgumentSerializer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import mrsterner.phantomblood.common.entity.interfaces.AngelDealAccessor;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("ConstantConditions")
public class PhantomBloodCommands {
    public static void init(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated) {
        dispatcher.register(CommandManager.literal("angeldeal").requires(serverCommandSource -> serverCommandSource.hasPermissionLevel(3)).then(CommandManager.literal("get").then(CommandManager.argument("player", EntityArgumentType.player()).executes(context -> {
            PlayerEntity player = EntityArgumentType.getPlayer(context, "player");
            AngelDealAccessor angelDealAccessor = (AngelDealAccessor) player;
            if (!angelDealAccessor.getAngelDeals().isEmpty()) {
                StringBuilder angelDeals = new StringBuilder();
                for (AngelDeal.Instance instance : angelDealAccessor.getAngelDeals()) {
                    angelDeals.append(PhantomBloodRegisters.ANGEL_DEALS.getId(instance.angelDeal).toString()).append(", ");
                }
                context.getSource().sendFeedback(new TranslatableText("commands.angeldeal.get.multiple", player.getEntityName(), angelDeals.delete(angelDeals.lastIndexOf(","), angelDeals.capacity())), false);
                return Command.SINGLE_SUCCESS;
            }
            throw AngelDealArgumentType.GET_NO_ANGEL_DEALS_EXCEPTION.create(player.getEntityName());
        }).then(CommandManager.argument("angel_deal", AngelDealArgumentType.angelDeal()).executes(context -> {
            PlayerEntity player = EntityArgumentType.getPlayer(context, "player");
            AngelDealAccessor angelDealAccessor = (AngelDealAccessor) player;
            AngelDeal angelDeal = AngelDealArgumentType.getAngelDeal(context, "angel_deal");
            if (angelDealAccessor.hasAngelDeal(angelDeal)) {
                int days = Math.round(angelDealAccessor.getAngelDeals().stream().filter(instance -> instance.angelDeal == angelDeal).findFirst().orElse(null).duration / 24000f);
                context.getSource().sendFeedback(new TranslatableText("commands.angeldeal.get.single", player.getEntityName(), days, PhantomBloodRegisters.ANGEL_DEALS.getId(angelDeal)), false);
                return Command.SINGLE_SUCCESS;
            }
            throw AngelDealArgumentType.GET_NO_ANGEL_DEAL_EXCEPTION.create(player.getEntityName());
        })))).then(CommandManager.literal("add").then(CommandManager.argument("player", EntityArgumentType.player()).then(CommandManager.argument("angeldeal", AngelDealArgumentType.angelDeal()).executes(context -> {
            PlayerEntity player = EntityArgumentType.getPlayer(context, "player");
            AngelDeal angelDeal = AngelDealArgumentType.getAngelDeal(context, "angeldeal");
            ((AngelDealAccessor) player).addAngelDeal(new AngelDeal.Instance(angelDeal, 168000, 0));
            context.getSource().sendFeedback(new TranslatableText("commands.angeldeal.add", player.getEntityName(), 7, PhantomBloodRegisters.ANGEL_DEALS.getId(angelDeal)), true);
            return Command.SINGLE_SUCCESS;
        }).then(CommandManager.argument("days", IntegerArgumentType.integer(1, 365)).executes(context -> {
            PlayerEntity player = EntityArgumentType.getPlayer(context, "player");
            AngelDeal angelDeal = AngelDealArgumentType.getAngelDeal(context, "angel_deal");
            int days = IntegerArgumentType.getInteger(context, "days");
            ((AngelDealAccessor) player).addAngelDeal(new AngelDeal.Instance(angelDeal, days * 24000, 0));
            context.getSource().sendFeedback(new TranslatableText("commands.angeldeal.add", player.getEntityName(), days, PhantomBloodRegisters.ANGEL_DEALS.getId(angelDeal)), true);
            return Command.SINGLE_SUCCESS;
        }))))).then(CommandManager.literal("remove").then(CommandManager.argument("player", EntityArgumentType.player()).then(CommandManager.argument("angeldeal", AngelDealArgumentType.angelDeal()).executes(context -> {
            PlayerEntity player = EntityArgumentType.getPlayer(context, "player");
            AngelDealAccessor angelDealAccessor = (AngelDealAccessor) player;
            AngelDeal angelDeal = AngelDealArgumentType.getAngelDeal(context, "angel_deal");
            if (angelDealAccessor.hasAngelDeal(angelDeal)) {
                angelDealAccessor.removeAngelDeal(angelDeal);
                context.getSource().sendFeedback(new TranslatableText("commands.angeldeal.remove", player.getEntityName(), PhantomBloodRegisters.ANGEL_DEALS.getId(angelDeal)), true);
                return Command.SINGLE_SUCCESS;
            }
            throw AngelDealArgumentType.REMOVE_NO_ANGEL_DEAL_EXCEPTION.create(player.getEntityName());
        })))).then(CommandManager.literal("clear").then(CommandManager.argument("player", EntityArgumentType.player()).executes(context -> {
            PlayerEntity player = EntityArgumentType.getPlayer(context, "player");
            AngelDealAccessor angelDealAccessor = (AngelDealAccessor) player;
            if (!angelDealAccessor.getAngelDeals().isEmpty()) {
                angelDealAccessor.getAngelDeals().clear();
                context.getSource().sendFeedback(new TranslatableText("commands.angeldeal.clear", player.getEntityName()), true);
                return Command.SINGLE_SUCCESS;
            }
            throw AngelDealArgumentType.CLEAR_NO_ANGEL_DEAL_EXCPETION.create(player.getEntityName());
        }))));
    }

    public static void registerArgumentTypes() {
        ArgumentTypes.register("mrsterner.phantomblood:angel_deal", AngelDealArgumentType.class, new ConstantArgumentSerializer<>(AngelDealArgumentType::angelDeal));
    }


    private static class AngelDealArgumentType implements ArgumentType<AngelDeal> {
        public static final DynamicCommandExceptionType INVALID_ANGEL_DEAL_EXCEPTION = new DynamicCommandExceptionType(object -> new TranslatableText("commands.angeldeal.not_found", object));
        public static final DynamicCommandExceptionType GET_NO_ANGEL_DEALS_EXCEPTION = new DynamicCommandExceptionType(object -> new TranslatableText("commands.angeldeal.get.no_angeldeals", object));
        public static final DynamicCommandExceptionType GET_NO_ANGEL_DEAL_EXCEPTION = new DynamicCommandExceptionType(object -> new TranslatableText("commands.angeldeal.get.no_angeldeal", object));
        public static final DynamicCommandExceptionType REMOVE_NO_ANGEL_DEAL_EXCEPTION = new DynamicCommandExceptionType(object -> new TranslatableText("commands.angeldeal.remove.no_angeldeal", object));
        public static final DynamicCommandExceptionType CLEAR_NO_ANGEL_DEAL_EXCPETION = new DynamicCommandExceptionType(object -> new TranslatableText("commands.angeldeal.clear.no_angeldeals", object));

        public static AngelDealArgumentType angelDeal() {
            return new AngelDealArgumentType();
        }

        public static AngelDeal getAngelDeal(CommandContext<ServerCommandSource> commandContext, String string) {
            return commandContext.getArgument(string, AngelDeal.class);
        }

        @Override
        public AngelDeal parse(StringReader reader) throws CommandSyntaxException {
            Identifier identifier = Identifier.fromCommandInput(reader);
            return PhantomBloodRegisters.ANGEL_DEALS.getOrEmpty(identifier).orElseThrow(() -> INVALID_ANGEL_DEAL_EXCEPTION.create(identifier));
        }

        @Override
        public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder) {
            return CommandSource.suggestIdentifiers(PhantomBloodRegisters.ANGEL_DEALS.getIds(), builder);
        }
    }


}