package HW6.task2;

public class Helicopter extends FlyingVehicle {
	private int weight;
	private int maxHeigth;

	public Helicopter(int passengers, int weight, int maxHeigth) {
		super(passengers);
		this.weight = weight;
		this.maxHeigth = maxHeigth;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMaxHeigth() {
		return maxHeigth;
	}

	public void setMaxHeigth(int maxHeigth) {
		this.maxHeigth = maxHeigth;
	}

	@Override
	void fly() {
        System.out.println("Helicopter is flying up. It can transport a " + getWeight() + "weight up to " + getMaxHeigth() + "km above the ground!");

	}

	@Override
	void land() {
        System.out.println("Helicopter is landing...");
	}

}
