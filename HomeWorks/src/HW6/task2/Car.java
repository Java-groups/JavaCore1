package HW6.task2;

public class Car extends GroundVehicle {
	private String model;

	public Car(int passengers, String model) {
		super(passengers);
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	void drive() {
        System.out.println("The car " + model + " is driving...");
	}

}
