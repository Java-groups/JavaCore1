package HW6.task2;

public class Bus extends GroundVehicle {
	private String route;

	public Bus(int passengers, String route) {
		super(passengers);
		this.route = route;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	@Override
	void drive() {
        System.out.println("The bus is driving to " + getRoute() + " with " + getPassengers() + "passangers.");

	}

}
