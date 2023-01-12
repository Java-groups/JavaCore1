package HW11.practical_tasks.task2;

public class Plant {
	private static int size;
	private static Color color;
	private static Type type;

	public Plant(String type, String color, int size) throws ColorException, TypeException {
		Color c = Color.fromValue(color);
		Type t = Type.fromValue(type);
		Plant.size = size;
		Plant.type = t;
		Plant.color = c;
	}

	public static int getSize() {
		return size;
	}

	public static void setSize(int size) {
		Plant.size = size;
	}

	public static Color getColor() {
		return color;
	}

	public static void setColor(Color color) {
		Plant.color = color;
	}

	public static Type getType() {
		return type;
	}

	public static void setType(Type type) {
		Plant.type = type;
	}

	@Override
	public String toString() {
		return "\nPlant: \nType: " + getType() + ";\nColor: " + getColor() + ";\nSize: " + getSize() + ";\n";
	}

}
