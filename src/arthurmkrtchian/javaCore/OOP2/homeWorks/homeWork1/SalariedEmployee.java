package arthurmkrtchian.javaCore.OOP2.homeWorks.homeWork1;

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


public class SalariedEmployee extends Employee implements Payment{
    private final int socialSecurityNumber;
    private double fixedPayment;

    public SalariedEmployee(String name, int socialSecurityNumber, double fixedPayment) {
        super(name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedPayment = fixedPayment;
    }

    @Override
    public double calculatePay() {
        return fixedPayment;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getFixedPayment() {
        return fixedPayment;
    }

    public void setFixedPayment(double fixedPayment) {
        this.fixedPayment = fixedPayment;
    }

    @Override
    public String toString() {
        return "SalariedEmployee { name: " + super.getName() +
                " | ID: " + getEmployeeId() +
                " | Social security number: " + socialSecurityNumber +
                " | Monthly wage: " + calculatePay()+ " }";
    }
}
