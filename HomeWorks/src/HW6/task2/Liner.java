package HW6.task2;

public class Liner extends WaterVehicle {
	private int floors;

	public Liner(int passengers, int floors) {
		super(passengers);
		this.floors = floors;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	@Override
	void isSailing() {
		System.out.println("Liner with " + getFloors() + " is sailing with " + getPassengers() + " passengers.");
	}

}
