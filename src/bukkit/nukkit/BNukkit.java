package bukkit.nukkit;

import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;

public class BNukkit extends PluginBase implements Listener{
  
  public static void createInventory(Player player, int type){
        createInventory(player, type, null);
  }

  public static void createInventory(Player player, int type, String name){
       if(name == null){
            return;
       }
       if(type == null){
            return;
       }
       if(player == null){
            return;
       }
  }

}
