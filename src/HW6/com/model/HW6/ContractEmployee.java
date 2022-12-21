package HW6.com.model.HW6;

public class ContractEmployee extends Employee implements Payment{
    private double fixedPaid;
    private String federalTaxIdMember;


    public ContractEmployee(String employeeld, String name) {
        super(employeeld, name);
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "name=" + getName()+" " +
                "employeeld=" +getEmployeeId()+" "+
                "fixedPaid=" + fixedPaid +
                ", federalTaxIdMember='" + federalTaxIdMember + '\'' +
                ", averageMonthlyWage=" + getAverageMonthlyWage() +
                '}';
    }

    public ContractEmployee(String employeeld, String name, double fixedPaid, String federalTaxIdMember) {
        super(employeeld, name);
        this.fixedPaid = fixedPaid;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public double getFixedPaid() {
        return fixedPaid;
    }

    public void setFixedPaid(double fixedPaid) {
        this.fixedPaid = fixedPaid;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public void calculatePay() {
        setAverageMonthlyWage(getFixedPaid());
    }
}

