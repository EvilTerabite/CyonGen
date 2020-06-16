package me.evilterabite.cyongen.util.permissionutil;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class equalize {
    public static void all(){
        for(Player player : Bukkit.getOnlinePlayers()) {
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "equalizePlayers %player%"
                    .replace("%player%", player.getName()));
        }
    }
}
