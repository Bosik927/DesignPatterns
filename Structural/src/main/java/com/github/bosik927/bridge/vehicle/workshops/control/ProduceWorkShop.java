package com.github.bosik927.bridge.vehicle.workshops.control;

import com.github.bosik927.bridge.vehicle.vehicles.boundary.Vehicle;
import com.github.bosik927.bridge.vehicle.workshops.boundary.WorkShop;

import java.util.concurrent.TimeUnit;

public class ProduceWorkShop extends WorkShop {

    public ProduceWorkShop() {
        super();
    }

    @Override
    public void work(Vehicle vehicle) {
        System.out.print("Producing... ");
        long timeToTake = 300 * vehicle.minWorkTime();
        try {
            TimeUnit.MILLISECONDS.sleep(timeToTake);
        } catch (InterruptedException exp) {
            // nothing to do for now.
        }
        System.out.printf("(Time taken: %d millis), Done.\n", timeToTake);
    }
}