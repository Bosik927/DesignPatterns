package com.github.bosik927.observer.sample.observers;

import com.github.bosik927.observer.sample.Subject;

public class OctObserver extends Observer {

    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public void update() {
        System.out.print(" " + Integer.toOctalString(subject.getState()));
    }
}