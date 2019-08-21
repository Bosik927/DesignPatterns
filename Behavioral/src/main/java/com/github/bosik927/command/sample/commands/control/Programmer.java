package com.github.bosik927.command.sample.commands.control;

import com.github.bosik927.command.sample.commands.boundary.Command;

public class Programmer implements Command {

    @Override
    public void execute() {
        System.out.println("sell the bugs, charge extra for the fixes");
    }
}