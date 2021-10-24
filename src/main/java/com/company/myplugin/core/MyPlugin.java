package com.company.myplugin.core;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin
{
	
	//---------------------------------------------------------------------\\
	/* Public Variables */
	
	public static String PLUGIN_NAME;
	public static String PLUGIN_VERSION;
	public static List<String> PLUGIN_AUTHORS;
	
	public static String PLUGIN_PREFIX;
	
	//---------------------------------------------------------------------\\
	/* Private Variables */
	
	private static MyPlugin plugin;
	
	//---------------------------------------------------------------------\\
	/* Required methods. */
	
	@Override
	public void onEnable()
	{
		MyPlugin.plugin = this; // <-- Instances the plug-in class.
		
		/* Gets essential values from plugin.yml */
		MyPlugin.PLUGIN_NAME = MyPlugin.getPluginName();
		MyPlugin.PLUGIN_VERSION = MyPlugin.getPluginVersion();
		MyPlugin.PLUGIN_AUTHORS = MyPlugin.getPluginAuthors();
		
		
		MyPlugin.PLUGIN_PREFIX = "&8[&f" + MyPlugin.PLUGIN_NAME + "&8] &f: &f"; // <-- Assigns the plug-in prefix.
		
		/* Enables all the plug-in managers. */
		new ConfigManager(this); // <-- Starts the configuration reader.
		
		/* Confirms that the plug-in successfully enabled.  */
		this.sendToConsole("&fStatus: &aEnabled");
		this.sendToConsole("&fVersion &av" + PLUGIN_VERSION);
		this.sendToConsole("&fAuthors: &a" + PLUGIN_AUTHORS);
	}
	
	@Override
	public void onDisable()
	{
		/* Confirms that the plug-in successfully disabled.  */
		this.sendToConsole("&fStatus: &cDisabled");
		this.sendToConsole("&fVersion &cv" + PLUGIN_VERSION);
		this.sendToConsole("&fAuthors: &c" + PLUGIN_AUTHORS);
	}
	
	//---------------------------------------------------------------------\\
	
	/* A getter method to grab the main plug-in class. */
	public static MyPlugin getPlugin()
	{
		return plugin;
	}
	
	//---------------------------------------------------------------------\\
	
	/* A getter method to grab the name of the plug-in. */
	public static String getPluginName()
	{
		PluginDescriptionFile pluginDescriptionFile = plugin.getDescription();
		String name = pluginDescriptionFile.getName();
		return name;
	}
	
	/* A getter method to grab the version of the plug-in. */
	public static String getPluginVersion()
	{
		PluginDescriptionFile pluginDescriptionFile = plugin.getDescription();
		String version = pluginDescriptionFile.getVersion();
		return version;
	}
	
	/* A getter method to grab the authors of the plug-in. */
	public static List<String> getPluginAuthors()
	{
		PluginDescriptionFile pluginDescriptionFile = plugin.getDescription();
		List<String> authors = pluginDescriptionFile.getAuthors();
		return authors;
	}
	
	//---------------------------------------------------------------------\\
	
	/* Sends a message to console with color codes enabled. */
	public void sendToConsole(String message)
	{
		this.getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', PLUGIN_PREFIX + message));
	}
	
	/* Sends a message to console only when debug is enabled. */
	public void sendDebug(String message)
	{
		if(ConfigManager.debugMode()) {
			this.getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', PLUGIN_PREFIX + "&eDEBUG &f: " + message));
		}
	}
	
	//---------------------------------------------------------------------\\
	
}
