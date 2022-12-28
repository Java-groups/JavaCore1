package HW6.task1;

public class Employee implements Payment {
	private String employeeld;

	public Employee(String employeeld) {
		this.employeeld = employeeld;
	}

	public String getEmployeeld() {
		return employeeld;
	}

	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}

	@Override
	public double calculatePay() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "Employee: " + employeeld;
	}

} 
