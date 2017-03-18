package de.Aikonsukun.TradingChest;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class MainTradingChest extends JavaPlugin implements Listener{

	@Override
	public void onEnable() {
		System.out.println("[TradingChest 1.0] TradingChest is enabled");
		Bukkit.getPluginManager().registerEvents(this, this);
	}

}
