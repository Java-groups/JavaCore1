package com.softserve.hw6_oop2;

public class ContractEmployee extends Employee implements Payment {

    private double hourlyRate;
    private double numberOfHoursWorked;
    private int federalTaxIdMember;

    public ContractEmployee(String employeeId, String name, double hourlyRate, double numberOfHoursWorked, int federalTaxIdMember) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "name='" + name + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", calculatePay='" + calculatePay() + '\'' +
                "} ";
    }
}
