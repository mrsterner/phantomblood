package mrsterner.phantomblood.common.callback;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import mrsterner.phantomblood.common.stand.Stand;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.minecraft.command.EntitySelector;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;

import static mrsterner.phantomblood.common.registry.PBCommands.*;
import static mrsterner.phantomblood.common.registry.PBCommands.setStand;
import static net.minecraft.server.command.CommandManager.argument;

public class CommandCallback implements CommandRegistrationCallback {
    public static void init(){
        CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
            LiteralCommandNode<ServerCommandSource> phantombloodNode = CommandManager
                    .literal("phantomblood").requires(source -> source.hasPermissionLevel(2)).build();
            LiteralCommandNode<ServerCommandSource> standNode = CommandManager
                    .literal("stand").build();
            LiteralCommandNode<ServerCommandSource> removeNode = CommandManager
                    .literal("remove")
                    .executes(context -> removeStand(context, context.getSource().getPlayer())).build();
            LiteralCommandNode<ServerCommandSource> setNode = CommandManager
                    .literal("set").build();
            LiteralCommandNode<ServerCommandSource> setHamonNode = CommandManager
                    .literal("hamon")
                    .executes(context -> hamon(context, context.getSource().getPlayer())).build();
            ArgumentCommandNode<ServerCommandSource, EntitySelector> hamonNode =
                    argument("player", EntityArgumentType.player())
                            .executes(context -> hamon(context, EntityArgumentType.getPlayer(context, "player"))).build();
            ArgumentCommandNode<ServerCommandSource, EntitySelector> playerRemoveNode =
                    argument("player", EntityArgumentType.player())
                            .executes(context -> removeStand(context, EntityArgumentType.getPlayer(context, "player"))).build();
            ArgumentCommandNode<ServerCommandSource, EntitySelector> playerSetNode =
                    argument("player", EntityArgumentType.player()).build();
            LiteralCommandNode<ServerCommandSource> setTheWorld = CommandManager.literal("the_world").executes(context -> setStand(context, EntityArgumentType.getPlayer(context, "player"), Stand.THE_WORLD)).build();
            LiteralCommandNode<ServerCommandSource> setTheSun = CommandManager.literal("the_sun").executes(context -> setStand(context, EntityArgumentType.getPlayer(context, "player"), Stand.THE_SUN)).build();
            LiteralCommandNode<ServerCommandSource> setStarsPlatinum = CommandManager.literal("star_platinum").executes(context -> setStand(context, EntityArgumentType.getPlayer(context, "player"), Stand.STAR_PLATINUM)).build();
            LiteralCommandNode<ServerCommandSource> setWeatherReport = CommandManager.literal("weather_report").executes(context -> setStand(context, EntityArgumentType.getPlayer(context, "player"), Stand.WEATHER_REPORT)).build();
            LiteralCommandNode<ServerCommandSource> setKillerQueen = CommandManager.literal("killer_queen").executes(context -> setStand(context, EntityArgumentType.getPlayer(context, "player"), Stand.KILLER_QUEEN)).build();
            LiteralCommandNode<ServerCommandSource> setDarkBlueMoon = CommandManager.literal("dark_blue_moon").executes(context -> setStand(context, EntityArgumentType.getPlayer(context, "player"), Stand.DARK_BLUE_MOON)).build();
            LiteralCommandNode<ServerCommandSource> setCrazyDiamond = CommandManager.literal("crazy_diamond").executes(context -> setStand(context, EntityArgumentType.getPlayer(context, "player"), Stand.CRAZY_DIAMOND)).build();
            LiteralCommandNode<ServerCommandSource> setKingCrimson = CommandManager.literal("king_crimson").executes(context -> setStand(context, EntityArgumentType.getPlayer(context, "player"), Stand.KING_CRIMSON)).build();
            LiteralCommandNode<ServerCommandSource> setPurpleHaze = CommandManager.literal("purple_haze").executes(context -> setStand(context, EntityArgumentType.getPlayer(context, "player"), Stand.PURPLE_HAZE)).build();
            LiteralCommandNode<ServerCommandSource> setTwentyCenturyBoy = CommandManager.literal("20th_century_boy").executes(context -> setStand(context, EntityArgumentType.getPlayer(context, "player"), Stand.TWENTY_CENTURY_BOY)).build();
            LiteralCommandNode<ServerCommandSource> setHierophantGreen = CommandManager.literal("hierophant_green").executes(context -> setStand(context, EntityArgumentType.getPlayer(context, "player"), Stand.HIEROPHANT_GREEN)).build();
            LiteralCommandNode<ServerCommandSource> setAnubis = CommandManager.literal("anubis").executes(context -> setStand(context, EntityArgumentType.getPlayer(context, "player"), Stand.ANUBIS)).build();



            dispatcher.getRoot().addChild(phantombloodNode);
            phantombloodNode.addChild(standNode);
            phantombloodNode.addChild(setHamonNode);
            setHamonNode.addChild(hamonNode);
            standNode.addChild(removeNode);
            standNode.addChild(setNode);
            removeNode.addChild(playerRemoveNode);
            setNode.addChild(playerSetNode);
            playerSetNode.addChild(setTheWorld);
            playerSetNode.addChild(setTheSun);
            playerSetNode.addChild(setStarsPlatinum);
            playerSetNode.addChild(setWeatherReport);
            playerSetNode.addChild(setKillerQueen);
            playerSetNode.addChild(setDarkBlueMoon);
            playerSetNode.addChild(setCrazyDiamond);
            playerSetNode.addChild(setKingCrimson);
            playerSetNode.addChild(setPurpleHaze);
            playerSetNode.addChild(setTwentyCenturyBoy);
            playerSetNode.addChild(setHierophantGreen);
            playerSetNode.addChild(setAnubis);
        });
    }
    @Override
    public void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated) {

        }

}
