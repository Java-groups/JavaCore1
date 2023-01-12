
package HW11.task1;

public class Divide {
	private double a;
	private double b;
	private double d;

	public Divide(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public Divide() {

	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double div(double a, double b) {
		if (a > 0 && b > 0) {
			d = a / b;
		} else if (a < 0 || b < 0) {
			throw new IllegalArgumentException("You entered negative value!");
		} else if (b == 0) {
			throw new IllegalArgumentException("You can't divide by zero!");
		}
		return d;
	}

	@Override
	public String toString() {
		return "Division of '" + a + "' and '" + b + "' is '" + d + "'";
	}

}
