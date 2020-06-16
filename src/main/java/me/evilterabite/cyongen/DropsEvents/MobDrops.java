package me.evilterabite.cyongen.DropsEvents;

import me.evilterabite.cyongen.util.items.customItems;
import me.evilterabite.cyongen.util.rates;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;

public class MobDrops implements Listener {

    @EventHandler
    void mobKill(EntityDeathEvent e) {
        Entity mob = e.getEntity();
        double random = Math.random();
        if(e.getEntity().getKiller() != null) {
            if (random < rates.getMobRates(mob.getType())) {
                Player p = e.getEntity().getKiller();
                Collection cDrops = e.getDrops();
                cDrops.clear();
                Location cLoc = mob.getLocation();
                World cWorld = mob.getWorld();
                ItemStack mobFragment = customItems.getMobFragment(1);
                cWorld.dropItemNaturally(cLoc, mobFragment);
                p.sendMessage(ChatColor.BLUE + "You got a mob fragment!");
            }
        }
    }
}
