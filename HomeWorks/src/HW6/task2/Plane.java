package HW6.task2;

public class Plane extends FlyingVehicle {
	private int maxDistance;

	public Plane(int passengers, int maxDistance) {
		super(passengers);
		this.maxDistance = maxDistance;
	}

	public int getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(int maxDistance) {
		this.maxDistance = maxDistance;
	}

	@Override
	void fly() {
		System.out.println("Plane maximum flying distace with " + getPassengers() + " passengers on board is "
				+ getMaxDistance() + " kilometers");
	}

	@Override
	void land() {
		System.out.println("Plane is landing...");
	}

}
