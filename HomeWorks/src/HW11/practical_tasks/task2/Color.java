package HW11.practical_tasks.task2;

public enum Color {
	RED("Red"), GREEN("Green"), YELLOW("Yellow"), ORANGE("Orange"), LIGHT_GREEN("Light green"), PURPLE("Purple");

	private final String color;

	Color(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public static Color fromValue(String givenColor) throws ColorException {
		for (Color color : values()) {
			if (color.color.equals(givenColor)) {
				return color;
			}
		}
		throw new ColorException("You are trying to input wrong color!");
	}
}
