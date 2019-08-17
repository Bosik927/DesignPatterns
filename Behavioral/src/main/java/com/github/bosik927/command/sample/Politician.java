package com.github.bosik927.command.sample;

class Politician implements Command {

    public void execute() {
        System.out.println("take money from the rich, take votes from the poor");
    }
}