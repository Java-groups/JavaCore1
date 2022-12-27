package HW5.task2;

public class Employee {
	private String name;
	private int age;
	private double salary;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String report() {
		return String.format("Name: %s, Age: %d, Salary: %.2f \u20B4", name, age, salary);
	}

}
