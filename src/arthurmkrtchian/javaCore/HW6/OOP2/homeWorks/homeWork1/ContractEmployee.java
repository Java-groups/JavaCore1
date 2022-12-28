package arthurmkrtchian.javaCore.HW6.OOP2.homeWorks.homeWork1;


//        Create Payment interface with the method calculatePay(), the base class Employee
//        with a string variable employeeld. Create two classes SalariedEmployee and
//        ContractEmployee, which implement interface and are inherited from the base class.
//        Describe hourly paid workers in the relevant classes (one of the children),
//        and fixed paid workers (second child).
//        Describe the string variable socialSecurityNumber in the class SalariedEmployee .
//        Include a description of federalTaxIdmember in the class of ContractEmployee.
//        The calculation formula for the "time-worker“ is: the average monthly
//        salary = hourly rate * number of hours worked
//        For employees with a fixed payment the formula is: the average monthly salary = fixed monthly payment
//        Create an array of employees and add the employees with different form of payment.
//        Arrange the entire sequence of workers descending the average monthly wage.
//        Output the employee ID, name, and the average monthly wage for all elements of the list.


public class ContractEmployee extends Employee implements Payment{

    private final int federalTaxIdmember;
    private double rate;
    private int hours;

    public ContractEmployee(String name, int federalTaxIdmember, double rate, int hours) {
        super(name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public double calculatePay() {
        return rate*hours;
    }

    public int getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "ContractEmployee { name: " + super.getName() +
                " | ID: " + getEmployeeId() +
                " | Federal tax ID member:  " + federalTaxIdmember +
                " | Monthly wage: " + calculatePay()+ " }";
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
