package HW6.Task1;

public class SalariedEmployee extends Employee implements Payment {

    private  int socialSecurityNumber;

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    private int fixedMonthlyPayment;


    public SalariedEmployee(int employeeId, int socialSecurityNumber, String name, int fixedMonthlyPayment) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;

    }

    @Override
    public String toString() {
        return "SalariedEmployee: averageMonthSalary: " + calculatePay()
                + ",   socialSecurityNumber:  " +  socialSecurityNumber
                + ",   name: " + getName();

    }
}
