package com.github.bosik927.state.medium;

public class State {

    public void push(Button button) {
        button.setCurrent(OFF.instance());
        System.out.println("   turning OFF");
    }
}