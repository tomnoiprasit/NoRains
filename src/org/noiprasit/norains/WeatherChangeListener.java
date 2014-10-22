package org.noiprasit.norains;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class WeatherChangeListener implements Listener {
	NoRains plugin;
	
	public WeatherChangeListener(NoRains p) {
		this.plugin = p;
	}

	@EventHandler
	public void onWeatherChange(WeatherChangeEvent event) {
		if(event.toWeatherState()) {
			event.setCancelled(true);
		}
	}

}
