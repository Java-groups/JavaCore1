package HM6.HomeWorkTask1;

public class SalariedEmployee1 extends Employee1 implements Payment {
    int socialSecurityNumber;
    int hourlyRate;
    int numberOfHoursWorked;

    public SalariedEmployee1(String employeeId, String name, int hourlyRate, int numberOfHoursWorked) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public int calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }
}
