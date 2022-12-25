package HM6.HomeWorkTask1;

public class ContractEmployee1 extends Employee1 implements Payment{
    int federalTaxIdMember;
    int fixedMonthlyPayment;

    ContractEmployee1(String employeeId, String name, int fixedMonthlyPayment) {
        super(employeeId, name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;
    }
}
