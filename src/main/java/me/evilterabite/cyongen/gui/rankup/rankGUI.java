package me.evilterabite.cyongen.gui.rankup;

import me.evilterabite.cyongen.CyonGen;
import me.evilterabite.cyongen.util.itemCreator;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import javax.security.auth.login.Configuration;
import java.util.ArrayList;
import java.util.List;

public class rankGUI {
    public static void openRankUpGUI(Player p) {
        FileConfiguration config = CyonGen.getPlugin(CyonGen.class).getConfig();
        Inventory inv = Bukkit.createInventory(null, 9, ChatColor.AQUA + "Rank Up");
        List<String> shardLore = new ArrayList<>();
        shardLore.add(ChatColor.translateAlternateColorCodes('&', "&aMake sure you have the required items!"));

        List<String> itemReqLore = new ArrayList<>();
        String level = checkPlayerGroup.getLevel(p);
        int mineAmount = config.getInt(level + ".Mine_Shard");
        int farmAmount = config.getInt(level + ".Farm_Shard");
        int mobAmount = config.getInt(level + ".Mob_Shard");
        int eventAmount = config.getInt(level + ".Event_Shard");
        int farmFragmentAmount = config.getInt(level + ".Farm_Fragment");
        int mobFragmentAmount = config.getInt(level + ".Mob_Fragment");
        int mineFragmentAmount = config.getInt(level + ".Mine_Fragment");
        int eventFragmentAmount = config.getInt(level + ".Event_Fragment");
        int starterFarmAmount = config.getInt(level + ".Starter_Farm_Shard");
        int starterMineAmount = config.getInt(level + ".Starter_Mine_Shard");
        int starterMobAmount = config.getInt(level + ".Starter_Mob_Shard");



        inv.setItem(0, itemCreator.createItem(Material.BLACK_STAINED_GLASS_PANE, "Nice try! you cannot click this!", shardLore));
        inv.setItem(1, itemCreator.createItem(Material.RED_CONCRETE, "CANCEL", shardLore));
        inv.setItem(2, itemCreator.createItem(Material.RED_CONCRETE, "CANCEL", shardLore));
        inv.setItem(3, itemCreator.createItem(Material.RED_CONCRETE, "CANCEL", shardLore));
        inv.setItem(4, itemCreator.createItem(Material.BLACK_STAINED_GLASS_PANE, "Items Required", itemReqLore));
        inv.setItem(5, itemCreator.createItem(Material.GREEN_CONCRETE, "CONFIRM", shardLore));
        inv.setItem(6, itemCreator.createItem(Material.GREEN_CONCRETE, "CONFIRM", shardLore));
        inv.setItem(7, itemCreator.createItem(Material.GREEN_CONCRETE, "CONFIRM", shardLore));
        inv.setItem(8, itemCreator.createItem(Material.BLACK_STAINED_GLASS_PANE, "Nice try! you cannot click this!", shardLore));
        p.openInventory(inv);
    }
}
