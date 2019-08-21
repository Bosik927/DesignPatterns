package com.github.bosik927.bridge.vehicle.vehicles.control;

import com.github.bosik927.bridge.vehicle.vehicles.boundary.Vehicle;

public class Car extends Vehicle {

    private static final int MIN_WORK_TIME = 10;

    @Override
    public void manufacture() {
        System.out.println("Manufactoring Car");
        workshops.forEach(workshop -> workshop.work(this));
        System.out.println("Done.");
        System.out.println();
    }

    @Override
    public int minWorkTime() {
        return MIN_WORK_TIME;
    }
}