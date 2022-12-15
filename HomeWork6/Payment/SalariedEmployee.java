package edu.homeworks.hw6.Payment;

public class SalariedEmployee extends Employee implements Payment{
    protected int hourlySalary;
    protected int hoursWorked;

    protected int socialSecurityNumber;

    public int getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(int hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public SalariedEmployee(String name,int socialSecurityNumber, int hoursWorked, int hourlySalary,int employeeID) {
        super(name);
        setEmployeeID(employeeID);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlySalary = hourlySalary;
        this.hoursWorked = hoursWorked;

    }

    @Override
    public int calculatePay() {
        salary = hoursWorked*hourlySalary;
        return salary;
    }
    @Override
    public String toString(){
        return "Name = " + name +
                "\n Social Security Number = " + socialSecurityNumber +
                "\n Horly Salary = " + hourlySalary +
                "\n Hours Worked = " + hoursWorked +
                "\n Salary = " + calculatePay();
    }
}
