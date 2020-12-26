package com.portalthree.ultimatesimproved.Utils;

import org.bukkit.Effect;
import org.bukkit.entity.ArmorStand;
import org.bukkit.event.Listener;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.EulerAngle;



public class Animate extends BukkitRunnable implements Listener {

    ArmorStand s;
    public Animate(ArmorStand stand){
        s = stand;
    }

    @Override
    public void run() {
        EulerAngle oldRot = s.getHeadPose();
        EulerAngle newRot = oldRot.add(0, 0.1f, 0);
        s.setHeadPose(newRot);
        s.teleport(s.getLocation().add(0, 0.01, 0));
    }

}
