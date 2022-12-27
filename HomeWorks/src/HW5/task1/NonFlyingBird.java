package HW5.task1;

public class NonFlyingBird extends Bird {

	public NonFlyingBird(Boolean feather, Boolean layEgg) {
		super(feather, layEgg);
	}

	@Override
	public String getSpecies() {
		return species;
	}

	@Override
	public Boolean getLayEgg() {
		return layEgg;
	}

	@Override
	public Boolean getFeather() {
		return feather;
	}

	@Override
	public String Fly() {
		return " can't fly.";
	}

}
