package com.github.bosik927.command.common.commands.control;

import com.github.bosik927.command.common.commands.boundary.Command;
import com.github.bosik927.command.common.commands.entity.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}