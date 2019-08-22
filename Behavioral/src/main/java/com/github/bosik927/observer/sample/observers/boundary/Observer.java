package com.github.bosik927.observer.sample.observers.boundary;

import com.github.bosik927.observer.sample.observers.control.Subject;

public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}