package com.github.bosik927.command.common;

import com.github.bosik927.command.common.light.Light;
import com.github.bosik927.command.common.light.LightOnCommand;
import com.github.bosik927.command.common.stereo.Stereo;
import com.github.bosik927.command.common.stereo.StereoOffCommand;
import com.github.bosik927.command.common.stereo.StereoOnWithCDCommand;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        Stereo stereo = new Stereo();


        remote.setCommand(new LightOnCommand(light));
        remote.buttonWasPressed();
        remote.setCommand(new StereoOnWithCDCommand(stereo));
        remote.buttonWasPressed();
        remote.setCommand(new StereoOffCommand(stereo));
        remote.buttonWasPressed();
    }
}