package com.github.bosik927.observer.secure;

import com.github.bosik927.observer.secure.alarms.control.Gates;
import com.github.bosik927.observer.secure.alarms.control.Lighting;
import com.github.bosik927.observer.secure.alarms.control.SensorSystem;
import com.github.bosik927.observer.secure.alarms.control.Surveillance;

public class ObserverDemo {

    public static void main( String[] args ) {
        SensorSystem sensorSystem = new SensorSystem();
        sensorSystem.register(new Gates());
        sensorSystem.register(new Lighting());
        sensorSystem.register(new Surveillance());
        sensorSystem.soundTheAlarm();
    }
}