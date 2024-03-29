package com.github.bosik927.observer.secure.alarms.control;

import com.github.bosik927.observer.secure.alarms.boundary.AlarmListener;

public class Surveillance extends CheckList implements AlarmListener {

    public void alarm() {
        System.out.println("Surveillance - by the numbers:");
        byTheNumbers();
    }

    protected void isolate() {
        System.out.println("   train the cameras");
    }
}

