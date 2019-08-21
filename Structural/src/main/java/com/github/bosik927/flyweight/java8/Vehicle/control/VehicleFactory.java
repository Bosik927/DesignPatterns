package com.github.bosik927.flyweight.java8.Vehicle.control;

import com.github.bosik927.flyweight.java8.Vehicle.entity.Car;
import com.github.bosik927.flyweight.java8.Vehicle.entity.Engine;
import com.github.bosik927.flyweight.java8.Vehicle.boundary.Vehicle;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    private static Map<Color, Vehicle> vehiclesCache = new HashMap<>();

    public static Vehicle createVehicle(Color color) {
       return vehiclesCache.computeIfAbsent(color, newColor -> {
            Engine newEngine = new Engine();
            return new Car(newEngine, newColor);
        });
    }
}
