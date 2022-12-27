package HW5.task1;

public class Eagle extends FlyingBird {
	private String species = "Eagle";

	public Eagle(Boolean feather, Boolean layEgg) {
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
