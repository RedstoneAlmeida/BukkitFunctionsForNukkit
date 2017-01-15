package bukkit.nukkit;

import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;

public class BNukkit extends PluginBase implements Listener{
  
  public static void createInventory(Player player, int size){
        createInventory(player, size, null);
  }

  public static void createInventory(Player player, int size, String name){
       if(name == null){
          return;
       }
  }

}
