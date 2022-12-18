package AllHomeWorks.HomeWork6.Task1;

public class SalariedEmployee extends Employee implements Payment{
    public double salary;
    public double hourlyRate;
    public double numberOfHoursWorked;

    protected String socialSecurityNumber;

    public SalariedEmployee(String name, double hourlyRate, double numberOfHoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }


    public double getHourlyRate() {
        return hourlyRate;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    @Override
    public double calculatePay() {
        salary = hourlyRate * numberOfHoursWorked;
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s, salary: %s", super.toString(), this.calculatePay());
    }
}
