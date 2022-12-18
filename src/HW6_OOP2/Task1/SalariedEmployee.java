package HW6_OOP2.Task1;

public class SalariedEmployee extends Employee {

    private String socialSecurityNumber;
    private double fixedMonthlyPayment;

    public SalariedEmployee(String employee, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(employee);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public String getEmployee() {
        return super.getEmployee();
    }

    @Override
    public void setEmployee(String employee) {
        super.setEmployee(employee);
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + super.toString() +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", fixedMonthlyPayment=" + fixedMonthlyPayment +
                '}';
    }

    // salary = fixed monthly payment


    @Override
    public void calculatePay() {
        setSalary(fixedMonthlyPayment);
    }

    void print() {
        System.out.println("Employee [" + getClass().getSimpleName() +
                " { name = " + getEmployee() +
                ", salary = " + getSalary() +
                ", socialSecurityNumber = " + getSocialSecurityNumber() +
                " } ]" );
    }
}
