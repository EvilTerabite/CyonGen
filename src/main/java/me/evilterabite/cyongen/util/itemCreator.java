package me.evilterabite.cyongen.util;

import org.bukkit.CropState;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.data.Ageable;
import org.bukkit.block.data.BlockData;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.Crops;
import org.bukkit.material.MaterialData;

import java.util.List;

public class itemCreator {

    public static ItemStack createItem(Material material, String name, List<String> lore) {
        ItemStack item = new ItemStack(material);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(name);
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        return item;
    }

    public static boolean isFullyGrown(Block block) {
        if(block.getBlockData() instanceof Ageable) {
            Ageable crop = (Ageable) block.getBlockData();
            System.out.println(crop.getAge() + "---" + crop.getMaximumAge());
            return (crop.getMaximumAge() == crop.getAge());
        }
        return false;
    }

    public static boolean isFullyGrownDep(Block block) {
        BlockState state = block.getState();
        MaterialData data = state.getData();

        if(!(data instanceof Crops))
            return false;

        return (((Crops) data).getState() == CropState.RIPE);
    }
}
