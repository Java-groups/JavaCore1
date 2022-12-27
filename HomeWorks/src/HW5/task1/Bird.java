package HW5.task1;

public abstract class Bird {
	Boolean feather;
	Boolean layEgg;
	String species;

	public Bird(Boolean feather, Boolean layEgg) {
		this.feather = feather;
		this.layEgg = layEgg;
	}

	public String getSpecies() {
		return species;
	}

	public void setFeather(Boolean feather) {
		this.feather = feather;
	}

	public void setLayEgg(Boolean layEgg) {
		this.layEgg = layEgg;
	}

	public Boolean getFeather() {
		return feather;
	}

	public Boolean getLayEgg() {
		return layEgg;
	}

	public abstract String Fly();

	@Override
	public String toString() {
		return "Bird " + getSpecies();
	}

}