package me.evilterabite.cyongen.util.permissionutil;

import me.evilterabite.cyongen.CyonGen;
import me.evilterabite.cyongen.gui.rankup.removeItems;
import me.evilterabite.cyongen.util.items.customItems;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.Configuration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class promotionSequence {

    public static void promote(Player p, String level, String promoteTo) {
        Inventory pInv = p.getInventory();
        Economy econ = CyonGen.getEconomy();
        double pBal = econ.getBalance(p);
        Plugin plugin = CyonGen.getPlugin(CyonGen.class);
        Configuration config = plugin.getConfig();
        ItemStack mineShard = customItems.getMineShard(1);
        ItemStack farmShard = customItems.getFarmShard(1);
        ItemStack mobShard = customItems.getMobShard(1);
        ItemStack eventShard = customItems.getEventShard(1);
        ItemStack mineFragment = customItems.getMineFragment(1);
        ItemStack farmFragment = customItems.getFarmFragment(1);
        ItemStack mobFragment = customItems.getMobFragment(1);
        ItemStack eventFragment = customItems.getEventFragment(1);
        ItemStack starterMineShard = customItems.getStarterMineShard(1);
        ItemStack starterFarmShard = customItems.getStarterFarmShard(1);
        ItemStack starterMobShard = customItems.getStarterMobShard(1);

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
        if (getPromotionRequirements(pInv, level)) {
            if (pBal >= config.getInt(level + ".Money")) {
                coopPlayers.equalizeCoop(p);
                cyonPlayer.promote(p);
                cyonPlayer.takeMoney(p, config.getInt(level + ".Money"));
                removeItems.remove(pInv, mineAmount, mineShard);
                removeItems.remove(pInv, farmAmount, farmShard);
                removeItems.remove(pInv, mobAmount, mobShard);
                removeItems.remove(pInv, eventAmount, eventShard);
                removeItems.remove(pInv, farmFragmentAmount, farmFragment);
                removeItems.remove(pInv, mineFragmentAmount, mineFragment);
                removeItems.remove(pInv, mobFragmentAmount, mobFragment);
                removeItems.remove(pInv, eventFragmentAmount, eventFragment);
                removeItems.remove(pInv, starterFarmAmount, starterFarmShard);
                removeItems.remove(pInv, starterMineAmount, starterMineShard);
                removeItems.remove(pInv, starterMobAmount, starterMobShard);
                Bukkit.broadcastMessage(ChatColor.GOLD + "Congrats to %player% they just ranked up to level %level%"
                .replace("%player%", p.getName())
                .replace("%level%", promoteTo));
            } else {
                p.sendMessage(ChatColor.RED + "You do not have enough money to Rankup.");
            }
        }
        else {
            p.sendMessage("This message has not been configured yet. messages.yml has returned error 404");
        }
    }


    public static Boolean getPromotionRequirements(Inventory pInv, String level){
        Plugin plugin = CyonGen.getPlugin(CyonGen.class);
        Configuration config = plugin.getConfig();

        ItemStack mineShard = customItems.getMineShard(1);
        ItemStack farmShard = customItems.getFarmShard(1);
        ItemStack mobShard = customItems.getMobShard(1);
        ItemStack eventShard = customItems.getEventShard(1);
        ItemStack mineFragment = customItems.getMineFragment(1);
        ItemStack farmFragment = customItems.getFarmFragment(1);
        ItemStack mobFragment = customItems.getMobFragment(1);
        ItemStack eventFragment = customItems.getEventFragment(1);
        ItemStack starterMineShard = customItems.getStarterMineShard(1);
        ItemStack starterFarmShard = customItems.getStarterFarmShard(1);
        ItemStack starterMobShard = customItems.getStarterMobShard(1);


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

        if (pInv.containsAtLeast(mineShard, mineAmount) || mineAmount == 0) {
            if (pInv.containsAtLeast(farmShard, farmAmount) || farmAmount == 0) {
                if (pInv.containsAtLeast(mobShard, mobAmount) || mobAmount == 0) {
                    if (pInv.containsAtLeast(eventShard, eventAmount) || eventAmount == 0) {
                        if (pInv.containsAtLeast(mineFragment, mineFragmentAmount) || mineFragmentAmount == 0) {
                            if (pInv.containsAtLeast(farmFragment, farmFragmentAmount) || farmFragmentAmount == 0) {
                                if(pInv.containsAtLeast(eventFragment, eventFragmentAmount) || eventFragmentAmount == 0) {
                                    if (pInv.containsAtLeast(mobFragment, mobFragmentAmount) || mobFragmentAmount == 0) {
                                        if (pInv.containsAtLeast(starterFarmShard, starterFarmAmount) || starterFarmAmount == 0) {
                                            if (pInv.containsAtLeast(starterMineShard, starterMineAmount) || starterMineAmount == 0) {
                                                return pInv.containsAtLeast(starterMobShard, starterMobAmount) || starterMobAmount == 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
