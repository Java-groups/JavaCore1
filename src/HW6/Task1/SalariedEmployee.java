package HW6.Task1;

public class SalariedEmployee extends Employee implements Payment{
    private double hourlyRate;
    private double numbersOfHoursWorked;
    private String SSN;

    @Override
    public double calculatePay() {
        return setSalary(hourlyRate*numbersOfHoursWorked);
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getNumbersOfHoursWorked() {
        return numbersOfHoursWorked;
    }

    public void setNumbersOfHoursWorked(double numbersOfHoursWorked) {
        this.numbersOfHoursWorked = numbersOfHoursWorked;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public SalariedEmployee(double hourlyRate, double numbersOfHoursWorked, String SSN, String employeeld) {
        this.hourlyRate = hourlyRate;
        this.numbersOfHoursWorked = numbersOfHoursWorked;
        this.SSN = SSN;
        setEmployeeld(employeeld);
    }


    @Override
    public String toString() {
        return "SalariedEmployee { " +
                "Name: " + getEmployeeld() +
                ", ID: " +  getSSN()+ ", Salary: " + calculatePay() +
                '}';
    }
}
