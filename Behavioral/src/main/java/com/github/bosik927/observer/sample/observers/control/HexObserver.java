package com.github.bosik927.observer.sample.observers.control;

import com.github.bosik927.observer.sample.observers.boundary.Observer;

public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public void update() {
        System.out.print(" " + Integer.toHexString(subject.getState()));
    }
}