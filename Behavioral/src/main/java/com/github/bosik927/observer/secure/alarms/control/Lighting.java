package com.github.bosik927.observer.secure.alarms.control;

import com.github.bosik927.observer.secure.alarms.boundary.AlarmListener;

public class Lighting implements AlarmListener {

    public void alarm() {
        System.out.println("lights up");
    }
}