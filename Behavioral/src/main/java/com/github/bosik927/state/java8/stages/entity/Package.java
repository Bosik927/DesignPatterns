package com.github.bosik927.state.java8.stages.entity;

import com.github.bosik927.state.java8.stages.control.OrderedState;
import com.github.bosik927.state.java8.stages.boundary.PackageState;

public class Package {

    private PackageState state = new OrderedState();

    public PackageState getState() {
        return state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}