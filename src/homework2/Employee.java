package homework2;

public class Employee {

	private static double salarySum = 0;
	private String name;
	private double rate;
	private double hours;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getSalary() {
		return rate*hours;
	}


	public double getBounus() {
		
		return getSalary()*0.1;
	}


	public Employee(String name, double rate, double hours) {

		this.name = name;
		this.rate = rate;
		this.hours = hours;
		salarySum += getSalary();

	}

	public Employee(String name) {

		this.name = name;	
		salarySum += getSalary();
		
	}

	public Employee() {

		salarySum += getSalary();

	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}

	public static double totalSum() {

		return salarySum;
	}

}
