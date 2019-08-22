package com.github.bosik927.state.medium.state.control;

public class State {

    public void push(Button button) {
        button.setCurrent(OFF.instance());
        System.out.println("   turning OFF");
    }
}