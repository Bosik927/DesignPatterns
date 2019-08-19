package com.github.bosik927.state.java8.stages.control;

import com.github.bosik927.state.java8.stages.boundary.PackageState;
import com.github.bosik927.state.java8.stages.entity.Package;

public class OrderedState implements PackageState {

    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void prev(Package pkg) {
        System.out.println("The package is in its root state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Package ordered, not delivered to the office yet.");
    }
}