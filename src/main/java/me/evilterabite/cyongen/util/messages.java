package me.evilterabite.cyongen.util;

import me.evilterabite.cyongen.CyonGen;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class messages {
    public static String prefix = "&7[&cCyonMC&7]&r";

    public static void get(String section, Player p){
        FileConfiguration config = CyonGen.getPlugin(CyonGen.class).getConfig();
        String str = config.getString(section.replace("%prefix%", prefix  ));
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', str));
    }

}
