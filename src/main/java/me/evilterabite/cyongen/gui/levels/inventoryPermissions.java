package me.evilterabite.cyongen.gui.levels;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.ItemStack;

public class inventoryPermissions implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        if(e.getView().getTitle().equalsIgnoreCase("Island Levels")) {
            e.setCancelled(true);
        }

    }

    @EventHandler
    public void onInventoryDrag(InventoryDragEvent e) {
        if(e.getView().getTitle().equalsIgnoreCase("Island Levels")) {
            e.setCancelled(true);
        }
    }
}
