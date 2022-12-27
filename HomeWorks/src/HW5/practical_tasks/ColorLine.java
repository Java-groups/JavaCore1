package HW5.practical_tasks;

public class ColorLine extends Line {
    private String color;
    
	public ColorLine(Point point1, Point point2, String color) {
		super(point1, point2);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String print() {
		return String.format("Point 1 -> " + point1 + "\nPoint 2 -> " + point2 + "\nColor ->   " + color + "\n");
	}
	
	@Override
	public String toString() {
		return String.format("Point 1 -> " + point1 + "\nPoint 2 -> " + point2 + "\nColor ->   " + color + "\n");
	}

}
