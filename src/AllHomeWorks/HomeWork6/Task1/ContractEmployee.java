package AllHomeWorks.HomeWork6.Task1;

public class ContractEmployee extends Employee implements Payment{

    public double salary;
    protected  String federalTaxIdMember;

    public ContractEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    @Override
    public double calculatePay() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s, salary: %s", super.toString(), this.calculatePay());
    }
}
