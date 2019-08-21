package com.github.bosik927.command.advance2.commands.control;

import com.github.bosik927.command.advance2.commands.boundary.Command;

import java.util.Stack;

public class CommandHistory {

    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}