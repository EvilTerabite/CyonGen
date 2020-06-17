package me.evilterabite.cyongen.Commands;

import me.evilterabite.cyongen.gui.unlocks.unlocksGUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class unlocks implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            unlocksGUI.open((Player) sender);
        }
        return true;
    }
}
