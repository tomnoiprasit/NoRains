package org.noiprasit.norains;

import org.bukkit.plugin.java.JavaPlugin;

public final class NoRains extends JavaPlugin {
	
	private boolean bLetItRain = false;
	
	public void onEnable() {
		getCommand("norains").setExecutor(new NoRainsCommand(this));
		getServer().getPluginManager().registerEvents(new WeatherChangeListener(this), this);
	}
	
	public boolean getLetItRain() {
		return bLetItRain;
	}
	
	public void setLetItRain(boolean a) {
		bLetItRain = a;
	}
}
