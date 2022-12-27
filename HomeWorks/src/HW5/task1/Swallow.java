package HW5.task1;

public class Swallow extends FlyingBird {
	private String species = "Swallow";

	public Swallow(Boolean feather, Boolean layEgg) {
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
