package com.github.bosik927.bridge.vehicle.vehicles.boundary;

import com.github.bosik927.bridge.vehicle.workshops.boundary.WorkShop;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

    protected List<WorkShop> workshops = new ArrayList<>();

    public Vehicle() {
        super();
    }

    public void joinWorkshop(WorkShop workshop) {
        workshops.add(workshop);
    }

    public abstract void manufacture();

    public abstract int minWorkTime();
}