package org.noiprasit.norains;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class NoRainsCommand implements CommandExecutor {
	
	NoRains plugin;

	public NoRainsCommand(NoRains p) {
		this.plugin = p;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String sAlias,
			String[] args) {
		plugin.setLetItRain(true);
		return true;
	}

}
