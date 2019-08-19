package com.github.bosik927.observer.secure;

import com.github.bosik927.observer.secure.alarms.Gates;
import com.github.bosik927.observer.secure.alarms.Lighting;
import com.github.bosik927.observer.secure.alarms.Surveillance;

public class ObserverDemo {

    public static void main( String[] args ) {
        SensorSystem sensorSystem = new SensorSystem();
        sensorSystem.register(new Gates());
        sensorSystem.register(new Lighting());
        sensorSystem.register(new Surveillance());
        sensorSystem.soundTheAlarm();
    }
}
