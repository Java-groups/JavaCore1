package edu.homeworks.hw6.Payment;

public class ContractEmployee extends Employee implements Payment{
    protected int federalTaxIdmember;
    protected int fixedSalary;


    public ContractEmployee(String name,int federalTaxIdmember,int fixedSalary,int employeeID) {
        super(name);
        setEmployeeID(employeeID);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedSalary = fixedSalary;
    }


    @Override
    public int calculatePay() {
        salary = fixedSalary;
        return salary;
    }

    @Override
    public String toString(){
        return "Name = " + name +
                "\n Federal tax ID member" + federalTaxIdmember +
                "\n Salary = " + calculatePay();
    }
}
