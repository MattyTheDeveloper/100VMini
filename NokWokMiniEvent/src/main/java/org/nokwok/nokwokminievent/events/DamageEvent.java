package org.nokwok.nokwokminievent.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class DamageEvent implements Listener {
    public void onDamage(EntityDamageByEntityEvent e){
        if (e.getEntity() instanceof Player){
            if (e.getDamager() instanceof Player){
                Player p = (Player) e.getEntity();
                Player damager = (Player) e.getDamager();
                if (!p.getDisplayName().equals("MiniMuka")){
                    e.setCancelled(true);
                    damager.sendMessage(ChatColor.RED + "You can only hit MiniMuka!");
                }
                if (!damager.getDisplayName().equals("MiniMuka")){
                    e.setCancelled(true);
                    damager.sendMessage(ChatColor.RED + "You can only hit MiniMuka!");
                }
            }
        }
    }
    }


