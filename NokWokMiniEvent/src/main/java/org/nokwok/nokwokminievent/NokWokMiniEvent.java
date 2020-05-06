package org.nokwok.nokwokminievent;

import org.bukkit.plugin.java.JavaPlugin;
import org.nokwok.nokwokminievent.events.DamageEvent;

public final class NokWokMiniEvent extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Event plugin started successfully!");
        getServer().getPluginManager().registerEvents(new DamageEvent(), this);
        getServer().getPluginManager().registerEvents(new ChatEvent(), this);
    }

}
