package com.edu.hometask6.task1.externalComparator;

public abstract class Employee {
    private int employeeId;
    private int averageMonthSalary;

    public Employee(int employeeId) {
        this.employeeId = employeeId;

    }

    public int getAverageMonthSalary() {
        return averageMonthSalary;
    }

    public void setAverageMonthSalary(int averageMonthSalary) {
        this.averageMonthSalary = averageMonthSalary;
    }



}
