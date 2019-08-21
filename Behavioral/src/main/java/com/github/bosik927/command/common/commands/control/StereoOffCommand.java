package com.github.bosik927.command.common.commands.control;

import com.github.bosik927.command.common.commands.boundary.Command;
import com.github.bosik927.command.common.commands.entity.Stereo;

public class StereoOffCommand implements Command {

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}