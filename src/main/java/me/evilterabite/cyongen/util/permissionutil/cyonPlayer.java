package me.evilterabite.cyongen.util.permissionutil;

import me.evilterabite.cyongen.util.logChannel;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class cyonPlayer {


    public static void promote(Player player) {
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), (
                "lp user %username% promote islevels")
                .replace("%username%", player.getName())
        );
        Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&',
                "&3%player% &r&ajust ranked up!")
                .replace("%player%", player.getName())
        );
        logChannel.sendMessage(player.getDisplayName() + "just ranked up!");
    }

    public static void takeMoney(Player player, int amount) {
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), (
                "eco take %username% %amount%")
                .replace("%username%", player.getName())
                .replace("%amount%", String.valueOf(amount))
        );
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
