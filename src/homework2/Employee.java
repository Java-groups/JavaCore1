package homework2;

public class Employee {

	private static double salarySum = 0;
	private String name;
	private double rate;
	private double hours;
	private double salary;
	private double bonus;

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
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBounus() {
		return bonus;
	}

	public void setBounus(double bonus) {
		this.bonus = bonus;
	}

	public Employee(String name, double rate, double hours) {

		this.name = name;
		this.rate = rate;
		this.hours = hours;
		this.salary = rate * hours;
		bonus = salary * 0.1;
		salary +=bonus;
		salarySum += salary;

	}

	public Employee(String name) {

		this.name = name;	
		this.salary = rate*hours;
		bonus = salary*0.1;
		salary +=bonus;
		salarySum +=salary;
		
	}

	public Employee() {

		this.salary = rate * hours;
		bonus = salary * 0.1;
		salary +=bonus;
		salarySum += salary;

	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}

	public static double totalSum() {

		return salarySum;
	}

}
