package me.evilterabite.cyongen.gui.levels;

import me.evilterabite.cyongen.CyonGen;
import me.evilterabite.cyongen.util.itemCreator;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.Configuration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.List;

public class levelsGUI implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            p.openInventory(inv);
        } else {
            System.out.println("Cannot be console... Come on now luke an dan.");
        }
        return true;
    }

    private final Inventory inv;

    public levelsGUI() {
        inv = Bukkit.createInventory(null, 27, "Island Levels");
        initializeItems();
    }

    public void initializeItems() {
        Configuration config = CyonGen.getPlugin(CyonGen.class).getConfig();
        List<String> levelOneLore = config.getStringList("levelOneLore");
        List<String> levelTwoLore = config.getStringList("levelTwoLore");
        List<String> levelThreeLore = config.getStringList("levelThreeLore");
        List<String> levelFourLore = config.getStringList("levelFourLore");
        List<String> levelFiveLore = config.getStringList("levelFiveLore");
        List<String> levelSixLore = config.getStringList("levelSixLore");
        List<String> levelSevenLore = config.getStringList("levelSevenLore");
        List<String> levelEightLore = config.getStringList("levelEightLore");
        List<String> levelNineLore = config.getStringList("levelNineLore");
        List<String> levelTenLore = config.getStringList("levelTenLore");
        List<String> levelElevenLore = config.getStringList("levelElevenLore");
        List<String> levelTwelveLore = config.getStringList("levelTwelveLore");
        List<String> levelThirteenLore = config.getStringList("levelThirteenLore");
        List<String> levelFourteenLore = config.getStringList("levelFourteenLore");
        List<String> levelFifteenLore = config.getStringList("levelFifteenLore");
        inv.addItem(itemCreator.createItem(Material.GOLD_NUGGET, "Level One", levelOneLore));
        inv.addItem(itemCreator.createItem(Material.GOLD_NUGGET, "Level Two", levelTwoLore));
        inv.addItem(itemCreator.createItem(Material.GOLD_NUGGET, "Level Three", levelThreeLore));
        inv.addItem(itemCreator.createItem(Material.GOLD_NUGGET, "Level Four", levelFourLore));
        inv.addItem(itemCreator.createItem(Material.GOLD_NUGGET, "Level Five", levelFiveLore));
        inv.addItem(itemCreator.createItem(Material.GOLD_NUGGET, "Level Six", levelSixLore));
        inv.addItem(itemCreator.createItem(Material.GOLD_NUGGET, "Level Seven", levelSevenLore));
        inv.addItem(itemCreator.createItem(Material.GOLD_NUGGET, "Level Eight", levelEightLore));
        inv.addItem(itemCreator.createItem(Material.GOLD_NUGGET, "Level Nine", levelNineLore));
        inv.addItem(itemCreator.createItem(Material.GOLD_BLOCK, "Level Ten", levelTenLore));
        inv.addItem(itemCreator.createItem(Material.GOLD_INGOT, "Level Eleven", levelElevenLore));
        inv.addItem(itemCreator.createItem(Material.GOLD_INGOT, "Level Twelve", levelTwelveLore));
        inv.addItem(itemCreator.createItem(Material.GOLD_INGOT, "Level Thirteen", levelThirteenLore));
        inv.addItem(itemCreator.createItem(Material.GOLD_INGOT, "Level Fourteen", levelFourteenLore));
        inv.addItem(itemCreator.createItem(Material.GOLD_BLOCK, "Level Fifteen", levelFifteenLore));
    }
}
