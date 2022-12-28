package HW6.task2;

public class Boat extends WaterVehicle {
	private int volume;

	public Boat(int passengers, int volume) {
		super(passengers);
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	void isSailing() {
		System.out.println("Boat volume is " + getVolume() + ", and it's sailing...");
	}

}
