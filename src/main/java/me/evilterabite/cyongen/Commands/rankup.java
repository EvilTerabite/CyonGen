package me.evilterabite.cyongen.Commands;
import me.evilterabite.cyongen.gui.rankup.rankGUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class rankup implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            rankGUI.openRankUpGUI(player);
        }
        return true;
    }
}
