package me.evilterabite.cyongen.gui.unlocks;

import me.evilterabite.cyongen.CyonGen;
import me.evilterabite.cyongen.util.itemCreator;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.Configuration;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import java.util.List;

public class unlocksGUI implements Listener {

    public static void open(Player player){
        Inventory inv = Bukkit.createInventory(null, 27, ChatColor.GOLD + "Unlocks");

        Configuration config = CyonGen.getPlugin(CyonGen.class).getConfig();
        List<String> levelOneLore = config.getStringList("levelOneUnlocks");
        List<String> levelTwoLore = config.getStringList("levelTwoLoreUnlocks");
        List<String> levelThreeLore = config.getStringList("levelThreeUnlocks");
        List<String> levelFourLore = config.getStringList("levelFourUnlocks");
        List<String> levelFiveLore = config.getStringList("levelFiveUnlocks");
        List<String> levelSixLore = config.getStringList("levelSixUnlocks");
        List<String> levelSevenLore = config.getStringList("levelSevenUnlocks");
        List<String> levelEightLore = config.getStringList("levelEightUnlocks");
        List<String> levelNineLore = config.getStringList("levelNineUnlocks");
        List<String> levelTenLore = config.getStringList("levelTenUnlocks");
        List<String> levelElevenLore = config.getStringList("levelElevenUnlocks");
        List<String> levelTwelveLore = config.getStringList("levelTwelveUnlocks");
        List<String> levelThirteenLore = config.getStringList("levelThirteenUnlocks");
        List<String> levelFourteenLore = config.getStringList("levelFourteenUnlocks");
        List<String> levelFifteenLore = config.getStringList("levelFifteenUnlocks");
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

        player.openInventory(inv);
    }


    @EventHandler
    void onInvClick(InventoryClickEvent e) {
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.GOLD + "Unlocks")) {
            e.setCancelled(true);
        }
    }
}
