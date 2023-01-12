package HW11.practical_tasks.task2;

public class Plant {
	private int size;
	private Color color;
	private Type type;

	public Plant(String type, String color, int size) throws ColorException, TypeException {
		Color c = Color.fromValue(color);
		Type t = Type.fromValue(type);
		this.size = size;
		this.type = t;
		this.color = c;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "\nPlant: \nType: " + type + ";\nColor: " + color + ";\nSize: " + size + ";\n";
	}

}
