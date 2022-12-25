package hw6.task1;

public class ContractEmployee extends Employee implements Payment {
    private String name;

    private int federalTaxIdMember;
    private int fixedMonthlyPayment;

    public ContractEmployee(String employeeId, String name, int federalTaxIdMember, int fixedMonthlyPayment) {
        super(employeeId);
        this.name = name;
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }


    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "name='" + name + '\'' +
                ", federalTaxIdMember=" + federalTaxIdMember +
                ", fixedMonthlyPayment=" + fixedMonthlyPayment +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}
