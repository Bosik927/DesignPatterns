package com.github.bosik927.state.java8;

import com.github.bosik927.state.java8.stages.entity.Package;

public class StateDemo {

    public static void main(String[] args) {
        Package pkg = new Package();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();
    }
}