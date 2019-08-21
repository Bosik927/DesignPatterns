package com.github.bosik927.command.sample;

import com.github.bosik927.command.sample.commands.boundary.Command;
import com.github.bosik927.command.sample.commands.control.DomesticEngineer;
import com.github.bosik927.command.sample.commands.control.Politician;
import com.github.bosik927.command.sample.commands.control.Programmer;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {

    public static void main(String[] args) {
        List queue = produceRequests();
        workOffRequests(queue);
    }

    private static List produceRequests() {
        List<Command> queue = new ArrayList<>();
        queue.add(new DomesticEngineer());
        queue.add(new Politician());
        queue.add(new Programmer());
        return queue;
    }

    private static void workOffRequests(List queue) {
        for (Object command : queue) {
            ((Command) command).execute();
        }
    }

}