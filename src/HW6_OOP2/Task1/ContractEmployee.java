package HW6_OOP2.Task1;

import HW6_OOP2.Task1.Employee;

public class ContractEmployee extends Employee {

    private int federalTaxIdmember;
    private double hourlyRate; // стоимость одного часа
    private double numberOfHoursWorked; // количество рабочих часов

    public ContractEmployee(String employee, int federalTaxIdmember, double hourlyRate, double numberOfHoursWorked) {
        super(employee);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public int getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(int federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" + super.toString() +
                "federalTaxIdmember=" + federalTaxIdmember +
                ", hourlyRate=" + hourlyRate +
                ", numberOfHoursWorked=" + numberOfHoursWorked +
                '}';
    }

    // salary = hourly rate * number of hours worked

    @Override
    public void calculatePay() {
        setSalary(getHourlyRate() * getNumberOfHoursWorked());
    }

    void print() {
        System.out.println("Employee [" + getClass().getSimpleName() +
                " { name = " + getEmployee() +
                ", salary = " + getSalary() +
                ", federalTaxIdmember = " + getFederalTaxIdmember() +
                " } ]" );
    }
}
