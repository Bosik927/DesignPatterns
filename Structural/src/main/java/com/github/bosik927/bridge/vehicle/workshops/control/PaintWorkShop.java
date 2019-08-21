package com.github.bosik927.bridge.vehicle.workshops.control;

import com.github.bosik927.bridge.vehicle.vehicles.boundary.Vehicle;
import com.github.bosik927.bridge.vehicle.workshops.boundary.WorkShop;

import java.util.concurrent.TimeUnit;

import static com.github.bosik927.bridge.vehicle.workshops.entity.WorkShopConstants.WORK_STATEMENT_PATTERN;

public class PaintWorkShop extends WorkShop {

    public PaintWorkShop() {
        super();
    }

    @Override
    public void work(Vehicle vehicle) {
        System.out.print("Painting... ");
        long timeToTake = 100 * vehicle.minWorkTime();
        try {
            TimeUnit.MILLISECONDS.sleep(timeToTake);
        } catch (InterruptedException exp) {
            // nothing to do for now.
        }
        System.out.printf(WORK_STATEMENT_PATTERN, timeToTake);
    }
}