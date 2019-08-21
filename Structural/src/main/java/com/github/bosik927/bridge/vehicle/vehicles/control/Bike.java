package com.github.bosik927.bridge.vehicle.vehicles.control;

import com.github.bosik927.bridge.vehicle.vehicles.boundary.Vehicle;

public class Bike extends Vehicle {

    private static final int MIN_WORK_TIME = 5;

    @Override
    public void manufacture() {
        System.out.println("Manufactoring Bike...");
        workshops.forEach(workshop -> workshop.work(this));
        System.out.println("Done.");
        System.out.println();
    }

    @Override
    public int minWorkTime() {
        return MIN_WORK_TIME;
    }
}