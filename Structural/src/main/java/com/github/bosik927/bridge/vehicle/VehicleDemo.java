package com.github.bosik927.bridge.vehicle;

import com.github.bosik927.bridge.vehicle.vehicles.control.Bike;
import com.github.bosik927.bridge.vehicle.vehicles.control.Bus;
import com.github.bosik927.bridge.vehicle.vehicles.control.Car;
import com.github.bosik927.bridge.vehicle.vehicles.boundary.Vehicle;
import com.github.bosik927.bridge.vehicle.workshops.control.AssembleWorkShop;
import com.github.bosik927.bridge.vehicle.workshops.control.PaintWorkShop;
import com.github.bosik927.bridge.vehicle.workshops.control.ProduceWorkShop;
import com.github.bosik927.bridge.vehicle.workshops.control.RepairWorkShop;
import com.github.bosik927.bridge.vehicle.workshops.control.TestWorkShop;

public class VehicleDemo {

    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.joinWorkshop(new ProduceWorkShop());
        bike.joinWorkshop(new AssembleWorkShop());
        bike.joinWorkshop(new TestWorkShop());
        bike.manufacture();

        Vehicle car = new Car();
        car.joinWorkshop(new ProduceWorkShop());
        car.joinWorkshop(new AssembleWorkShop());
        car.joinWorkshop(new PaintWorkShop());
        car.joinWorkshop(new TestWorkShop());
        car.manufacture();

        Vehicle bus = new Bus();
        bus.joinWorkshop(new RepairWorkShop());
        bus.joinWorkshop(new AssembleWorkShop());
        bus.joinWorkshop(new TestWorkShop());
        bus.manufacture();
    }
}
