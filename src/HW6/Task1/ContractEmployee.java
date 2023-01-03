package HW6.Task1;

public class ContractEmployee extends Employee implements Payment {

    private int federalTaxIdMember;
    private int hourlyRate;
    private int workedHours;


    public ContractEmployee(int employeeId, int federalTaxIdMember, String name, int hourlyRate, int workedHours) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;

    }

    @Override
    public int calculatePay() {
        return workedHours * hourlyRate;
    }

    @Override
    public String toString() {
        return "ContractEmployee: averageMonthSalary: "+calculatePay()+
                "  federalTaxIdMember: " + federalTaxIdMember +
                ", name: " + getName() +
                ", hourlyRate:  " + hourlyRate +
                ", hoursWorked: " + workedHours;

    }


}
