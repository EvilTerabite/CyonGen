package me.evilterabite.cyongen.gui.rankup;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class removeItems {
    public static void remove(Inventory inv, int amount, ItemStack item) {
        for (ItemStack i : inv) {
            if (i == null || i.getType() == Material.AIR) continue;
            if (i.getItemMeta().getDisplayName().equalsIgnoreCase(item.getItemMeta().getDisplayName())) {
                if (i.getAmount() >= amount) {
                    i.setAmount(i.getAmount() - amount);
                }
            }
        }
    }
}
