package com.edu.hometask6.task1.externalComparator;

public class SalariedEmployee extends Employee implements Payment {
    private int socialSecurityNumber;
    private String name;
    private int fixedMonthlyPayment;


    public SalariedEmployee(int employeeId, int socialSecurityNumber, String name, int fixedMonthlyPayment) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public int calculatePay() {
        setAverageMonthSalary(fixedMonthlyPayment);
        return getAverageMonthSalary();

    }

    @Override
    public String toString() {
        return "SalariedEmployee: averageMonthSalary: " + calculatePay()
                + ",   socialSecurityNumber:  " +  socialSecurityNumber
                + ",   name: " + name;

    }
}
