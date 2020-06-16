package me.evilterabite.cyongen.util.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Objects;

public class customItems {

    public static ItemStack getStarterFarmShard(int amount) {
        ItemStack shard = new ItemStack(Material.GOLD_NUGGET, amount);
        ItemMeta shardMeta = shard.getItemMeta();
        shardMeta.setDisplayName(ChatColor.YELLOW + "[ST] Farm Shard");
        shard.setItemMeta(shardMeta);

        return shard;
    }
    public static ItemStack getStarterMineShard(int amount) {
        ItemStack shard = new ItemStack(Material.GOLD_NUGGET, amount);
        ItemMeta shardMeta = shard.getItemMeta();
        shardMeta.setDisplayName(ChatColor.YELLOW + "[ST] Mine Shard");
        shard.setItemMeta(shardMeta);

        return shard;
    }
    public static ItemStack getStarterMobShard(int amount) {
        ItemStack shard = new ItemStack(Material.GOLD_NUGGET, amount);
        ItemMeta shardMeta = shard.getItemMeta();
        shardMeta.setDisplayName(ChatColor.YELLOW + "[ST] Mob Shard");
        shard.setItemMeta(shardMeta);

        return shard;
    }

    public static ItemStack getMineFragment(int amount) {
       ItemStack mineFragment = new ItemStack(Material.PRISMARINE_SHARD, amount);
       ItemMeta mineFragmentMeta = mineFragment.getItemMeta();
       mineFragmentMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Mining Fragment");
       mineFragment.setItemMeta(mineFragmentMeta);

        return mineFragment;
    }

    public static ItemStack getMineShard(int amount) {
        ItemStack mineShard = new ItemStack(Material.PRISMARINE, amount);
        ItemMeta mineShardMeta = mineShard.getItemMeta();
        mineShardMeta.setDisplayName(ChatColor.GREEN + "Mining Shard");
        mineShard.setItemMeta(mineShardMeta);

        return mineShard;
    }

    public static ItemStack getFarmFragment(int amount) {
        ItemStack farmFragment = new ItemStack(Material.IRON_NUGGET, amount);
        ItemMeta farmFragmentMeta = farmFragment.getItemMeta();
        farmFragmentMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Farming Fragment");
        farmFragment.setItemMeta(farmFragmentMeta);

        return farmFragment;
    }
    public static ItemStack getFarmShard(int amount) {
        ItemStack farmShard = new ItemStack(Material.HAY_BLOCK, amount);
        ItemMeta farmShardMeta = farmShard.getItemMeta();
        farmShardMeta.setDisplayName(ChatColor.GREEN + "Farming Shard");
        farmShard.setItemMeta(farmShardMeta);

        return farmShard;
    }

    public static ItemStack getMobFragment(int amount) {
        ItemStack mobFragment = new ItemStack(Material.POPPED_CHORUS_FRUIT, amount);
        ItemMeta mobFragmentMeta = mobFragment.getItemMeta();
        mobFragmentMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Mob Fragment");
        mobFragment.setItemMeta(mobFragmentMeta);

        return mobFragment;
    }
    public static ItemStack getMobShard(int amount) {
        ItemStack mobShard = new ItemStack(Material.FIREWORK_STAR, amount);
        ItemMeta mobShardMeta = mobShard.getItemMeta();
        mobShardMeta.setDisplayName(ChatColor.GREEN + "Mob Shard");
        mobShard.setItemMeta(mobShardMeta);

        return mobShard;
    }

    public static ItemStack getEventFragment(int amount) {
        ItemStack eventFragment = new ItemStack(Material.QUARTZ, amount);
        ItemMeta eventFragmentMeta = eventFragment.getItemMeta();
        eventFragmentMeta.setDisplayName(ChatColor.AQUA + "Event Fragment");
        eventFragment.setItemMeta(eventFragmentMeta);

        return eventFragment;
    }

    public static ItemStack getEventShard(int amount) {
        ItemStack eventShard = new ItemStack(Material.SMOOTH_QUARTZ, amount);
        ItemMeta eventShardMeta = eventShard.getItemMeta();
        eventShardMeta.setDisplayName(ChatColor.GREEN + "Event Shard");
        eventShard.setItemMeta(eventShardMeta);

        return eventShard;
    }
}