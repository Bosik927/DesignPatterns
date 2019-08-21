package com.github.bosik927.command.common.commands.control;

import com.github.bosik927.command.common.commands.boundary.Command;
import com.github.bosik927.command.common.commands.entity.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}