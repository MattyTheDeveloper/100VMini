package org.nokwok.nokwokminievent.events;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener {
    public void onChat(AsyncPlayerChatEvent e){
        if (!e.getPlayer().hasPermission("nokwok.chatcolor")) {
            String message = e.getMessage();
            ChatColor.stripColor(message);
        }
    }

}
