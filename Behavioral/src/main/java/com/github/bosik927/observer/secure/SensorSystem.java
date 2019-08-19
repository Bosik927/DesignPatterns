package com.github.bosik927.observer.secure;

import com.github.bosik927.observer.secure.alarms.AlarmListener;

import java.util.Enumeration;
import java.util.Vector;

class SensorSystem {

    private Vector<AlarmListener> listeners = new Vector<>();

    public void register(AlarmListener alarmListener) {
        listeners.addElement(alarmListener);
    }

    public void soundTheAlarm() {
        for (Enumeration<AlarmListener> e = listeners.elements(); e.hasMoreElements();) {
            (e.nextElement()).alarm();
        }
    }
}

