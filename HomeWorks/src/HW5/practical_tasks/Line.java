package HW5.practical_tasks;

public class Line {
	Point point1;
	Point point2;

	public Line(Point point1, Point point2) {
		this.point1 = point1;
		this.point2 = point2;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint1() {
		return point1;
	}

	public Point getPoint2() {
		return point2;
	}
	
	public String print() {
		return String.format("Point 1 -> " + point1 + "\nPoint 2 -> " + point2 + "\n");
	}
	
	@Override
	public String toString() {
		return String.format("Point 1 -> " + point1 + "\nPoint 2 -> " + point2 + "\n");
	}

}
