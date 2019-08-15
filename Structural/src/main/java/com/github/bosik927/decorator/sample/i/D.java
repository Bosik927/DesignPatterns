package com.github.bosik927.decorator.sample.i;

public abstract class D implements I {

    private I core;

    public D(I inner) {
        core = inner;
    }

    public void doIt() {
        core.doIt();
    }
}