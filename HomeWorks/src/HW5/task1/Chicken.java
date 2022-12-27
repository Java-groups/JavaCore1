package HW5.task1;

public class Chicken extends NonFlyingBird {
	public String species = "Chicken";

	public Chicken(Boolean feather, Boolean layEgg) {
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
