package me.evilterabite.cyongen.util;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class itemRemoval {
    public static int removeItems(Inventory inventory, Material type, int amount) {

        if(type == null || inventory == null)
            return -1;
        if (amount <= 0)
            return -1;

        if (amount == Integer.MAX_VALUE) {
            inventory.remove(type);
            return 0;
        }

        inventory.removeItem(new ItemStack(type,amount));
        return 0;
    }
}
