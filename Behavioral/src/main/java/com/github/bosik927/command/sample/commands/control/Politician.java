package com.github.bosik927.command.sample.commands.control;

import com.github.bosik927.command.sample.commands.boundary.Command;

public class Politician implements Command {

    @Override
    public void execute() {
        System.out.println("take money from the rich, take votes from the poor");
    }
}