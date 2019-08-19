package com.github.bosik927.observer.sample.observers;

import com.github.bosik927.observer.sample.Subject;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}