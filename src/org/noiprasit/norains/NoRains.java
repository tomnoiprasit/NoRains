package org.noiprasit.norains;

import org.bukkit.plugin.java.JavaPlugin;

public final class NoRains extends JavaPlugin {
	
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new WeatherChangeListener(this), this);
	}
}
