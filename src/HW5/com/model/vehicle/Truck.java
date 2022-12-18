package HW5.com.model.vehicle;

import HW5.com.model.vehicle.Car;

public class Truck extends Car {

    @Override
    public void run() {
        System.out.println("Running the truck");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the truck");
    }
}

