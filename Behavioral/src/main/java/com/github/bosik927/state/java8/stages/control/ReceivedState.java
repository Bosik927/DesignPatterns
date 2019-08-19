package com.github.bosik927.state.java8.stages.control;

import com.github.bosik927.state.java8.stages.boundary.PackageState;
import com.github.bosik927.state.java8.stages.entity.Package;

public class ReceivedState implements PackageState {

    @Override
    public void next(Package pkg) {
        System.out.println("This package is already received by a client.");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package received.");
    }
}