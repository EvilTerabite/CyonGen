package me.evilterabite.cyongen.gui.rankup;

import me.evilterabite.cyongen.util.permissionutil.promotionSequence;
import org.bukkit.entity.Player;

public class checkPlayerGroup {
    public static void pGroup(Player player) {
        if (player.hasPermission("group.levelone")) {
            promotionSequence.promote(player, "LevelOne", "2");
        } else if (player.hasPermission("group.leveltwo")) {
            promotionSequence.promote(player, "LevelTwo", "3");
        } else if (player.hasPermission("group.levelthree")) {
            promotionSequence.promote(player, "LevelThree", "4");
        } else if (player.hasPermission("group.levelfour")) {
            promotionSequence.promote(player, "LevelFour", "5");
        } else if (player.hasPermission("group.levelfive")) {
            promotionSequence.promote(player, "LevelFive", "6");
        } else if (player.hasPermission("group.levelsix")) {
            promotionSequence.promote(player, "LevelSix", "7");
        } else if (player.hasPermission("group.levelseven")) {
            promotionSequence.promote(player, "LevelSeven", "8");
        } else if (player.hasPermission("group.leveleight")) {
            promotionSequence.promote(player, "LevelEight", "9");
        } else if (player.hasPermission("group.levelnine")) {
            promotionSequence.promote(player, "LevelNine", "10");
        } else if (player.hasPermission("group.levelten")) {
            promotionSequence.promote(player, "LevelTen", "11");
        } else if (player.hasPermission("group.leveleleven")) {
            promotionSequence.promote(player, "LevelEleven", "12");
        } else if (player.hasPermission("group.leveltwelve")) {
            promotionSequence.promote(player, "LevelTwelve", "13");
        } else if (player.hasPermission("group.levelthirteen")) {
            promotionSequence.promote(player, "LevelThirteen", "14");
        } else if (player.hasPermission("group.levelfourteen")) {
            promotionSequence.promote(player, "LevelFourteen", "15");
        } else if (player.hasPermission("group.levelfifteen")) {
            player.sendMessage("You are already at the highest level.");
        } else {
            player.sendMessage("[CyonGen] You started your skyblock journey at Level 1! CyonMC wishes you luck!");
            promotionSequence.promote(player, "LevelZero", "1");
        }
    }
    public static String getLevel(Player player) {
        if (player.hasPermission("group.levelone")) {
            return "LevelOne";
        } else if (player.hasPermission("group.leveltwo")) {
            return "LevelTwo";
        } else if (player.hasPermission("group.levelthree")) {
            return "LevelThree";
        } else if (player.hasPermission("group.levelfour")) {
            return "LevelFour";
        } else if (player.hasPermission("group.levelfive")) {
            return "LevelFive";
        } else if (player.hasPermission("group.levelsix")) {
            return "LevelSix";
        } else if (player.hasPermission("group.levelseven")) {
            return "LevelSeven";
        } else if (player.hasPermission("group.leveleight")) {
            return "LevelEight";
        } else if (player.hasPermission("group.levelnine")) {
            return "LevelNine";
        } else if (player.hasPermission("group.levelten")) {
            return "LevelTen";
        } else if (player.hasPermission("group.leveleleven")) {
            return "LevelEleven";
        } else if (player.hasPermission("group.leveltwelve")) {
            return "LevelTwelve";
        } else if (player.hasPermission("group.levelthirteen")) {
            return "LevelThirteen";
        } else if (player.hasPermission("group.levelfourteen")) {
            return "LevelFourteen";
        } else if (player.hasPermission("group.levelfifteen")) {
            return "LevelFifteen";
        } else {
            return "LevelZero";
        }
    }



}
