package com.github.bosik927.bridge.vehicle.workshops.control;

import com.github.bosik927.bridge.vehicle.vehicles.boundary.Vehicle;
import com.github.bosik927.bridge.vehicle.workshops.boundary.WorkShop;

import java.util.concurrent.TimeUnit;

import static com.github.bosik927.bridge.vehicle.workshops.entity.WorkShopConstants.WORK_STATEMENT_PATTERN;

public class RepairWorkShop extends WorkShop {

    public RepairWorkShop() {
        super();
    }

    @Override
    public void work(Vehicle vehicle) {
        System.out.print("Repairing... ");
        long timeToTake = 150 * vehicle.minWorkTime();
        try {
            TimeUnit.MILLISECONDS.sleep(timeToTake);
        } catch (InterruptedException exp) {
            // nothing to do for now.
        }
        System.out.printf(WORK_STATEMENT_PATTERN, timeToTake);
    }
}