package com.blendycat.playerweather;

import org.bukkit.ChatColor;
import org.bukkit.WeatherType;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class CommandSetWeather implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(command.getName().equalsIgnoreCase("setweather") 
				&& sender instanceof Player){
			Player player = (Player) sender;
			if(player.hasPermission("PlayerWeather.setweather")){
				if(args.length==1 && (args[0].equalsIgnoreCase("clear") 
						|| args[0].equalsIgnoreCase("rain") 
						|| args[0].equalsIgnoreCase("reset"))){
					if(args[0].equalsIgnoreCase("clear"))
						player.setPlayerWeather(WeatherType.CLEAR);
					else if(args[0].equalsIgnoreCase("rain"))
						player.setPlayerWeather(WeatherType.DOWNFALL);
					else
						player.resetPlayerWeather();
				}else player.sendMessage(ChatColor.RED + "Invalid arguments! /setweather <Type>");
			}else player.sendMessage(ChatColor.RED + "No permission!");
			return true;
		}
		return false;
	}
	
}
