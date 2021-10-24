package com.company.myplugin.core;

public class ConfigManager 
{
	
	private static MyPlugin plugin;
	
	//---------------------------------------------------------------------\\
	
	public ConfigManager(MyPlugin plugin)
	{
		ConfigManager.plugin = plugin;
		
		plugin.getConfig().options().copyDefaults();
		plugin.saveDefaultConfig();
	}
	
	//---------------------------------------------------------------------\\
	
	/* Chat Settings - Toggles*/
	public static boolean useCustomPrefix() { return plugin.getConfig().getBoolean("chat-settings.toggles.use-custom-prefix"); }
	public static boolean sendNoPermissionCmd() { return plugin.getConfig().getBoolean("chat-settings.toggles.send-no-permission-cmd"); }
	public static boolean sendNoPermissionEvent() { return plugin.getConfig().getBoolean("chat-settings.toggles.send-no-permission-event"); }
	
	/* Chat Settings - Messages */
	public static String chatPrefix() { return plugin.getConfig().getString("chat-settings.messages.chat-prefix"); }
	public static String noPermissionCmd() { return plugin.getConfig().getString("chat-settings.messages.no-permission-cmd"); }
	public static String noPermissionEvent() { return plugin.getConfig().getString("chat-settings.messages.no-permission-event"); }
	
	//---------------------------------------------------------------------\\
	
	/* Utilities Settings */
	public static boolean debugMode() { return plugin.getConfig().getBoolean("utilities-settings.debug-mode"); }
	
	//---------------------------------------------------------------------\\
	
	/* Plug-in Settings */
	
	
}
