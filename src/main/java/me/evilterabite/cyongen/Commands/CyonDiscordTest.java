package me.evilterabite.cyongen.Commands;

import me.evilterabite.cyongen.util.logChannel;
import me.evilterabite.cyongen.util.messages;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CyonDiscordTest implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender.hasPermission("cyon.admin")) {
            logChannel.sendMessage("@Owner @CyonDev [CyonGen] Test successful! :heart_eyes:");
        }
        else {
            if(sender instanceof Player) {
                messages.get("noPermission",((Player) sender));
            }
        }
        return true;
    }
}
