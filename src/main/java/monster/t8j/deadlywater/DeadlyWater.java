package monster.t8j.deadlywater;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class DeadlyWater extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("DeadlyWater enabled");
        getServer().getPluginManager().registerEvents(this,this);
    }
    @EventHandler
    public void dangerWater(PlayerMoveEvent event) {
        Material mat = event.getPlayer().getLocation().getBlock().getType();
        if (mat == Material.WATER) {
                Player player = event.getPlayer();
                player.setHealth(0);

        }
    }
}
