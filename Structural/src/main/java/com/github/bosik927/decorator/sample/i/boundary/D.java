package com.github.bosik927.decorator.sample.i.boundary;

public abstract class D implements I {

    private I core;

    public D(I inner) {
        core = inner;
    }

    @Override
    public void doIt() {
        core.doIt();
    }
}