package me.evilterabite.cyongen.Commands;

import me.evilterabite.cyongen.util.items.customItems;
import me.evilterabite.cyongen.util.logChannel;
import me.evilterabite.cyongen.util.permissionutil.cyonPlayer;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class giveshard implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("cyongen.admin")) {
            if (args.length > 0) {
                String ar = args[1];
                Player tP = Bukkit.getPlayerExact(args[0]);
                if (tP != null) {
                    Inventory tpInv = tP.getInventory();
                    if (cyonPlayer.isNumeric(args[2])) {
                        logChannel.sendMessage("Giveshard has given an item to " + tP.getName());
                        if (ar.equalsIgnoreCase("mineshard")) {
                            tpInv.addItem(customItems.getMineShard(Integer.parseInt(args[2])));
                            System.out.println("giveshard command executed successfully.");
                        }

                        if (ar.equalsIgnoreCase("farmshard")) {
                            tpInv.addItem(customItems.getFarmShard(Integer.parseInt(args[2])));
                            System.out.println("giveshard command executed successfully.");
                        }

                        if (ar.equalsIgnoreCase("mobshard")) {
                            tpInv.addItem(customItems.getMobShard(Integer.parseInt(args[2])));
                            System.out.println("giveshard command executed successfully.");
                        }

                        if (ar.equalsIgnoreCase("minefragment")) {
                            tpInv.addItem(customItems.getMineFragment(Integer.parseInt(args[2])));
                            System.out.println("giveshard command executed successfully.");
                        }

                        if (ar.equalsIgnoreCase("farmfragment")) {
                            tpInv.addItem(customItems.getFarmFragment(Integer.parseInt(args[2])));
                            System.out.println("giveshard command executed successfully.");
                        }

                        if (ar.equalsIgnoreCase("mobfragment")) {
                            tpInv.addItem(customItems.getMobFragment(Integer.parseInt(args[2])));
                            System.out.println("giveshard command executed successfully.");
                        }

                        if (ar.equalsIgnoreCase("eventfragment")) {
                            tpInv.addItem(customItems.getEventFragment(Integer.parseInt(args[2])));
                            System.out.println("giveshard command executed successfully.");
                        }

                        if (ar.equalsIgnoreCase("eventshard")) {
                            tpInv.addItem(customItems.getEventShard(Integer.parseInt(args[2])));
                            System.out.println("giveshard command executed successfully.");
                        }

                        if (ar.equalsIgnoreCase("starterfarmshard")) {
                            tpInv.addItem(customItems.getStarterFarmShard(Integer.parseInt(args[2])));
                            System.out.println("giveshard command executed successfully.");
                        }

                        if (ar.equalsIgnoreCase("startermineshard")) {
                            tpInv.addItem(customItems.getStarterMineShard(Integer.parseInt(args[2])));
                            System.out.println("giveshard command executed successfully.");
                        }

                        if (ar.equalsIgnoreCase("startermobshard")) {
                            tpInv.addItem(customItems.getStarterMobShard(Integer.parseInt(args[2])));
                            System.out.println("giveshard command executed successfully.");
                        }
                    } else {
                        sender.sendMessage("[CyonGen] Did not specify an amount!");
                    }
                } else {
                    sender.sendMessage("[CyonGen] Could not find player.");
                }
            } else {
                sender.sendMessage("[CyonGen] No argument specified! Usage /giveshard <type> <amount>");
            }
        }
        return true;
    }
}
