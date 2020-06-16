package me.evilterabite.cyongen.Commands;

import me.evilterabite.cyongen.util.permissionutil.coopPlayers;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class equalizePlayers implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender.hasPermission("cyon.admin")) {
            Player p = Bukkit.getPlayer(args[0]);
            coopPlayers.equalizeCoop(p);
        }
        return true;
    }
}
