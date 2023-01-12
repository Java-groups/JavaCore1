package HW11.practical_tasks.task1;

public class Rectangle {
	private int a;
	private int b;

	public Rectangle(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Rectangle() {

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int squareRectangle(int a, int b) {
		int square = 0;
		if (a > 0 && b > 0) {
			square = a * b;
		} else if (a < 0 || b < 0) {
			throw new IllegalArgumentException("You entered negative value!");
		} 
		return square;
	}

	@Override
	public String toString() {
		return "Rectangle (" + a + "," + b + ")";
	}

}
