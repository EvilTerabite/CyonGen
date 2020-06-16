package me.evilterabite.cyongen.Commands;

import me.evilterabite.cyongen.CyonGen;
import me.evilterabite.cyongen.util.logChannel;
import me.evilterabite.cyongen.util.messages;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class cyonGenReload implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Plugin plugin  = CyonGen.getPlugin(CyonGen.class);
        if(sender.hasPermission("cyon.admin")) {
            plugin.reloadConfig();
            sender.sendMessage(ChatColor.GREEN + "[CyonGen] Reloaded!");
            System.out.println("[CyonGen] Reloaded!");
            logChannel.sendMessage("@Owner @CyonDev [CyonGen] Reloaded!");
        }
        else {
            if(sender instanceof Player) {
                messages.get("noPermission",((Player) sender));
            }
        }
        return true;
    }
}
