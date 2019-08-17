package com.github.bosik927.command.common.stereo;

import com.github.bosik927.command.common.Command;

public class StereoOffCommand implements Command {

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }
}