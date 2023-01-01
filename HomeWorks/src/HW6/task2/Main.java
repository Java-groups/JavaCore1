package HW6.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
        
		List<Passengers> vehicles = new ArrayList<>();

		vehicles.add(new Liner(2500, 5));
		vehicles.add(new Boat(34, 2500));
		vehicles.add(new Plane(300, 7600));
		vehicles.add(new Helicopter(8, 600, 3600));
		vehicles.add(new Bus(36, "Kyiv"));
		vehicles.add(new Motorcycle(1, 280));
		vehicles.add(new Car(3, "Maserati Quattroporte"));

		for (int i = 0; i < vehicles.size(); i++) {
			if (vehicles.get(i) instanceof WaterVehicle) {
				((WaterVehicle) vehicles.get(i)).isSailing();
			} else if (vehicles.get(i) instanceof FlyingVehicle) {
				((FlyingVehicle) vehicles.get(i)).fly();
				((FlyingVehicle) vehicles.get(i)).land();
			} else {
				((GroundVehicle) vehicles.get(i)).drive();
			}
		}
	}
}
