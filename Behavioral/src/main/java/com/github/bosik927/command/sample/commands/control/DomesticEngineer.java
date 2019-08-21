package com.github.bosik927.command.sample.commands.control;

import com.github.bosik927.command.sample.commands.boundary.Command;

public class DomesticEngineer implements Command {

    @Override
    public void execute() {
        System.out.println("take out the trash");
    }
}

