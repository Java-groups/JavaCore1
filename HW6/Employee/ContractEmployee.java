public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdMember;
    private int hourlyRate;
    private int workedHours;

    public ContractEmployee(String employeeId, String federalTaxIdMember, int hourlyRate, int workedHours) {
        super(employeeId);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
        this.setSalary();
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public void setSalary() {
        this.salary = this.getHourlyRate() * this.getWorkedHours();
    }

    @Override
    public int calculatePay() {
        return this.getSalary();
    }

    @Override
    public String toString() {
        return "Contract employee has ID # "
                +this.getEmployeeId()
                +", SSN is "
                +this.getFederalTaxIdMember()
                +", salary is "
                +this.calculatePay();
    }
}
