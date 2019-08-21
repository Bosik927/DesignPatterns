package com.github.bosik927.bridge.common;

import com.github.bosik927.bridge.common.devices.boundary.Device;
import com.github.bosik927.bridge.common.devices.control.Radio;
import com.github.bosik927.bridge.common.devices.control.Tv;
import com.github.bosik927.bridge.common.remotes.control.AdvancedRemote;
import com.github.bosik927.bridge.common.remotes.control.BasicRemote;

public class Demo {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        System.out.println("Tests with basic remotes.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remotes.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}