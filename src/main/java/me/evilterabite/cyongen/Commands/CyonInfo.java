package me.evilterabite.cyongen.Commands;

import me.evilterabite.cyongen.CyonGen;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

public class CyonInfo implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        FileConfiguration config = CyonGen.getPlugin(CyonGen.class).getConfig();
        String helpUrl = config.getString("ItemTPVideoURL");
        String ratesUrl = config.getString("RatesInfoURL");
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7---&bCyonInfo&7---"));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cItemTP Help: %url%".replace("%url%", helpUrl)));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cSkyblock Rates and Info: %url%".replace("%url%", ratesUrl)));
        return true;
    }
}
