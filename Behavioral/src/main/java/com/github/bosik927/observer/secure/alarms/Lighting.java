package com.github.bosik927.observer.secure.alarms;

public class Lighting implements AlarmListener {

    public void alarm() {
        System.out.println("lights up");
    }
}