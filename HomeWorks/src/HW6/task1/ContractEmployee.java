package HW6.task1;

public class ContractEmployee extends Employee implements Payment {
	private double hourlyRate;
	private int hoursWorked;
	private String federalTaxIdmember;
	private double salary;

	public ContractEmployee(String employeeld, double hourlyRate, int hoursWorked, String federalTaxIdmember) {
		super(employeeld);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double calculatePay() {
		salary = hourlyRate * hoursWorked;
		return salary;
	}

	@Override
	public String toString() {
		return "Contract Employee: " + "\nSalary - " + calculatePay() + "\nFederal Tax Id Member - "
				+ federalTaxIdmember + "\n";
	}

}
