package com.github.bosik927.bridge.common.remotes.control;

import com.github.bosik927.bridge.common.devices.boundary.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}