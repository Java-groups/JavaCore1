package com.softserve.hw6_oop2;

public class SalariedEmployee extends Employee implements Payment {

    private double fixedMonthlyPayment;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String name, double fixedMonthlyPayment, String socialSecurityNumber) {
        super(name, employeeId);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "name='" + name + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", calculatePay='" + calculatePay() + '\'' +
                "} ";
    }
}
