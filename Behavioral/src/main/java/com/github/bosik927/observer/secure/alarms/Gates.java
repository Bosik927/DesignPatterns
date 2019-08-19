package com.github.bosik927.observer.secure.alarms;

public class Gates implements AlarmListener {

    public void alarm() {
        System.out.println("gates close");
    }
}