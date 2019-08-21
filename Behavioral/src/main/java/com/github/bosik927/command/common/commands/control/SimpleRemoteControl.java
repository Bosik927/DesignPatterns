package com.github.bosik927.command.common.commands.control;

import com.github.bosik927.command.common.commands.boundary.Command;

public class SimpleRemoteControl {

    private Command slot;  // only one button

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}