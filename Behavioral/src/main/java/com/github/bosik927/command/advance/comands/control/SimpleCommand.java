package com.github.bosik927.command.advance.comands.control;

public class SimpleCommand {

    private int state;

    public SimpleCommand(int state) {
        this.state = state;
    }

    public void add(Integer value) {
        state += value;
    }

    public void addTwoOperands(Integer firstValue, Integer secondValue) {
        state = state + firstValue + secondValue;
    }

    public int getState() {
        return state;
    }
}