package me.evilterabite.cyongen.gui.shardcraft;

import me.evilterabite.cyongen.util.items.customItems;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class shardcraftRecipies implements Listener {
    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        if(e.getView().getTitle().equalsIgnoreCase("Shard Crafting")) {
            ArrayList<Integer> slotList = new ArrayList<>();
            slotList.add(0);
            slotList.add(1);
            slotList.add(2);
            slotList.add(3);
            slotList.add(5);
            slotList.add(6);
            slotList.add(7);
            slotList.add(8);
            Inventory inv = e.getInventory();
            String invTitle = e.getView().getTitle();
            final ItemStack clickedItem = e.getCurrentItem();
            if (clickedItem == null || clickedItem.getType() == Material.AIR) return;
            final Player p = (Player) e.getWhoClicked();
            if(slotList.contains(e.getRawSlot())) {
                e.setCancelled(true);
            }
            if(e.getRawSlot() == 8) {
                if (inv.getItem(4) != null || inv.getItem(4).getType() != Material.AIR) {
                    if (inv.getItem(4).getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "Event Fragment")) {
                        if (inv.getItem(4).getAmount() >= 9) {
                            int current = inv.getItem(4).getAmount();
                            inv.getItem(4).setAmount(current - 9);
                            p.getInventory().addItem(customItems.getEventShard(1));
                        }
                    }
                }
                else {
                    return;
                }
                if(e.getRawSlot() == 8) {
                    if (inv.getItem(4) != null || inv.getItem(4).getType() != Material.AIR) {
                        if (inv.getItem(4).getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Mob Fragment")) {
                            if (inv.getItem(4).getAmount() >= 9) {
                                int current = inv.getItem(4).getAmount();
                                inv.getItem(4).setAmount(current - 9);
                                p.getInventory().addItem(customItems.getMobShard(1));
                            }
                        }
                    }
                    else{
                        return;
                    }
                }


                if(e.getRawSlot() == 8) {
                    if (inv.getItem(4) != null || inv.getItem(4).getType() != Material.AIR) {
                        if (inv.getItem(4).getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Mining Fragment")) {
                            if (inv.getItem(4).getAmount() >= 9) {
                                int current = inv.getItem(4).getAmount();
                                inv.getItem(4).setAmount(current - 9);
                                p.getInventory().addItem(customItems.getMineShard(1));
                            }
                        }
                    }
                    else{
                        return;
                    }
                }

                if(e.getRawSlot() == 8) {
                    if (inv.getItem(4) != null || inv.getItem(4).getType() != Material.AIR) {
                        if (inv.getItem(4).getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Farming Fragment")) {
                            if (inv.getItem(4).getAmount() >= 9) {
                                int current = inv.getItem(4).getAmount();
                                inv.getItem(4).setAmount(current - 9);
                                p.getInventory().addItem(customItems.getFarmShard(1));
                            }
                        }
                    }
                }


                else {
                    p.sendMessage("There has to be something in the crafting center.");
                    return;
                }
            }
        }

    }

}
