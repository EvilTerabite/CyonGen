package me.evilterabite.cyongen;
import com.songoda.skyblock.api.SkyBlockAPI;
import com.songoda.skyblock.api.island.IslandManager;
import me.evilterabite.cyongen.Commands.*;
import me.evilterabite.cyongen.DropsEvents.FarmDrops.cropDrops;
import me.evilterabite.cyongen.DropsEvents.FarmDrops.ripeCropDrops;
import me.evilterabite.cyongen.events.*;
import me.evilterabite.cyongen.DropsEvents.MobDrops;
import me.evilterabite.cyongen.events.fabledskyblockevents.playerJoinIsland;
import me.evilterabite.cyongen.events.fabledskyblockevents.playerLeaveIsland;
import me.evilterabite.cyongen.gui.levels.inventoryPermissions;
import me.evilterabite.cyongen.gui.levels.levelsGUI;
import me.evilterabite.cyongen.gui.rankup.rankupPermissions;
import me.evilterabite.cyongen.gui.shardcraft.shardcraftRecipies;
import me.evilterabite.cyongen.gui.unlocks.unlocksGUI;
import me.evilterabite.cyongen.util.logChannel;
import me.evilterabite.cyongen.util.permissionutil.equalize;
import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.permission.Permission;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.logging.Logger;


public final class CyonGen extends JavaPlugin {


    private static final Logger log = Logger.getLogger("Minecraft");
    private static Economy econ = null;
    private static Permission perms = null;
    private static Chat chat = null;

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        //VaultAPI
        if(getConfig().getString("unlock-key").equals("842H7240BFMP724kjwrf9274Fg02jw848")) {
            if (!setupEconomy()) {
                System.out.println("[CyonGen x VaultAPI] No economy plugin found. Disabling Plugin.");
                getServer().getPluginManager().disablePlugin(this);
                return;
            }

            //Getting the events
            PluginManager pm = getServer().getPluginManager();

            //Events
            pm.registerEvents(new generatorPlace(), this);
            pm.registerEvents(new onCobbleBreak(), this);
            pm.registerEvents(new genBlockTopPlace(), this);
            pm.registerEvents(new inventoryPermissions(), this);
            pm.registerEvents(new shardcraftRecipies(), this);
            pm.registerEvents(new disableShardPlacement(), this);
            //pm.registerEvents(new endstoneRename(), this);
            pm.registerEvents(new rankupPermissions(), this);
            pm.registerEvents(new playerJoinIsland(), this);
            pm.registerEvents(new playerLeaveIsland(), this);
            pm.registerEvents(new cropDrops(), this);
            pm.registerEvents(new ripeCropDrops(), this);
            pm.registerEvents(new MobDrops(), this);
            pm.registerEvents(new unlocksGUI(), this);

            //Commands
            getCommand("shardCraft").setExecutor(new shardcraft());
            getCommand("rankup").setExecutor(new rankup());
            getCommand("giveshard").setExecutor(new giveshard());
            getCommand("levelsGUI").setExecutor(new levelsGUI());
            getCommand("equalizePlayers").setExecutor(new equalizePlayers());
            getCommand("cyonGenReload").setExecutor(new cyonGenReload());
            getCommand("CyonDiscordTest").setExecutor(new CyonDiscordTest());
            getCommand("CyonInfo").setExecutor(new CyonInfo());
            getCommand("unlocks").setExecutor(new unlocks());


            //equalizeScheduler
            new BukkitRunnable() {
                @Override
                public void run() {
                    logChannel.sendMessage("[CyonGen] All users have been equalized to the island leaders.");
                    equalize.all();
                }
            }.runTaskTimer(this, 20 * 10, 20 * getConfig().getInt("equalizeTime")); //Delays in ticks
        }
        else {
            Bukkit.getLogger().severe("[CyonGen] Unlock key incorrect. Disabling plugin.");
            onDisable();
        }
    }


    public static Economy getEconomy() {
        return econ;
    }


    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }

    public static IslandManager islandManager() {
        return SkyBlockAPI.getIslandManager();
    }

    @Override
    public void onDisable(){
        Bukkit.getLogger().info(ChatColor.RED + "---[CyonGen Disabled]---");
    }
}


