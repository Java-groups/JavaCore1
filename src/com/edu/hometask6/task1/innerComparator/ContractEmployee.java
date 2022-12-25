package com.edu.hometask6.task1.innerComparator;

public class ContractEmployee extends Employee implements Payment {
    private int federalTaxIdMember;
    private String name;
    private int hourlyRate;
    private int hoursWorked;


    public ContractEmployee(int employeeId, int federalTaxIdMember, String name, int hourlyRate, int hoursWorked) {
        super(employeeId);
        this.federalTaxIdMember = federalTaxIdMember;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;

    }

    @Override
    public int calculatePay() {
        setAverageMonthSalary(hourlyRate * hoursWorked);
        return getAverageMonthSalary();

    }

    @Override
    public String toString() {
        return "ContractEmployee: averageMonthSalary: "+calculatePay()+
                "  federalTaxIdMember: " + federalTaxIdMember +
                ", name: " + name +
                ", hourlyRate:  " + hourlyRate +
                ", hoursWorked: " + hoursWorked;

    }
}
