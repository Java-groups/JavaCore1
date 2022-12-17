package HW6.Task1;

public class ContractEmployee extends Employee implements Payment{
    private double fixedMonthlyPayment;
    private String EIN;

    @Override
    public double calculatePay() {
        setSalary(fixedMonthlyPayment);
        return getSalary();
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public String getEIN() {
        return EIN;
    }

    public void setEIN(String EIN) {
        this.EIN = EIN;
    }

    public ContractEmployee(double fixedMonthlyPayment, String EIN, String employeeld) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.EIN = EIN;
        setEmployeeld(employeeld);
    }

    @Override
    public String toString() {
        return "ContractEmployee { " +
                "Name: " + getEmployeeld() +
                ", ID: " +  getEIN()+ ", Salary: " + calculatePay() +
                '}';
    }

//    @Override
//    public void  setSalary(double salary) {
//        this.setSalary(fixedMonthlyPayment);
//    }
}
