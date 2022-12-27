package HW5.task1;

public class Penguin extends NonFlyingBird {
	public String species = "Penguin";

	public Penguin(Boolean feather, Boolean layEgg) {
		super(feather, layEgg);
	}

	@Override
	public String getSpecies() {
		return species;
	}

	@Override
	public String Fly() {
		return super.Fly();
	}

}
