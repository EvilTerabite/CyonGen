package me.evilterabite.cyongen.util;

import me.evilterabite.cyongen.CyonGen;
import org.bukkit.Bukkit;

public class logChannel {
    public static void sendMessage(String string) {
        String logChannel = CyonGen.getPlugin(CyonGen.class).getConfig().getString("discordLogChannel");
        assert logChannel != null;
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), (
                "discord broadcast #%logChannel% %string%"
                        .replace("%logChannel%", logChannel)
                        .replace("%string%", string)));
    }
}
