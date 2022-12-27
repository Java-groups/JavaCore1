package HW5.task1;

public class FlyingBird extends Bird {

	public FlyingBird(Boolean feather, Boolean layEgg) {
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
		return " can fly.";
	}

}
