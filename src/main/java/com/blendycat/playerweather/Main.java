package com.blendycat.playerweather;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	@Override
	public void onEnable(){
		getLogger().info("PlayerWeather has been enabled!");
		getCommand("setweather").setExecutor(new CommandSetWeather());
	}
	
	@Override
	public void onDisable(){
		getLogger().info("PlayerWeather has been disabled!");
	}
}
