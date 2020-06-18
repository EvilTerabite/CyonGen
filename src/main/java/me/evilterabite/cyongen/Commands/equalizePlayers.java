package me.evilterabite.cyongen.Commands;

import me.evilterabite.cyongen.util.permissionutil.coopPlayers;
import me.evilterabite.cyongen.util.permissionutil.equalize;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class equalizePlayers implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender.hasPermission("cyon.admin")) {
            if(args.length != 0) {
                Player p = Bukkit.getPlayer(args[0]);
                coopPlayers.equalizeCoop(p);
            }
            else {
                equalize.all();
            }
        }
        return true;
    }
}
