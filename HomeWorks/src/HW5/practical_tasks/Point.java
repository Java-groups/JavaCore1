package HW5.practical_tasks;

public class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String print() {
		return String.format("(x = " + x + " y = " + y + ")");
	}
	
	@Override
	public String toString() {
		return String.format("(x = " + x + " y = " + y + ")");
	}

}
