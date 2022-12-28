package HW6.task1;

public class SalariedEmployee extends Employee implements Payment {
	private double fixedMonthlyPayment;
	private String socialSecurityNumber;
	private double salary;

	public SalariedEmployee(String employeeld, double fixedMonthlyPayment, String socialSecurityNumber) {
		super(employeeld);
		this.fixedMonthlyPayment = fixedMonthlyPayment;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public double getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}

	public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double calculatePay() {
		salary = fixedMonthlyPayment;
		return salary;
	} 

	@Override
	public String toString() {
		return "Salaried Employee: " + "\nSalary - " + calculatePay()
				+ " \u20B4 \nSocial Security Number - " + socialSecurityNumber + "\n";
	}

}
