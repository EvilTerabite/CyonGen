package me.evilterabite.cyongen.gui.rankup;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class rankupPermissions implements Listener {
    @EventHandler
    void invClick(InventoryClickEvent e) {
        if(e.getView().getTitle().equalsIgnoreCase(ChatColor.AQUA + "Rank Up")) {
            e.setCancelled(true);
            ArrayList<Integer> cancelSlots = new ArrayList<>();
            ArrayList<Integer> confirmSlots = new ArrayList<>();
            cancelSlots.add(1);
            cancelSlots.add(2);
            cancelSlots.add(3);
            confirmSlots.add(5);
            confirmSlots.add(6);
            confirmSlots.add(7);
            Inventory inv = e.getInventory();
            String invTitle = e.getView().getTitle();
            final ItemStack clickedItem = e.getCurrentItem();
            if (clickedItem == null || clickedItem.getType() == Material.AIR) return;
            final Player p = (Player) e.getWhoClicked();
            if (cancelSlots.contains(e.getRawSlot())) {
                p.closeInventory();
            }
            if(confirmSlots.contains(e.getRawSlot())) {
                checkPlayerGroup.pGroup(p);
                p.closeInventory();
            }
        }
    }

}
