package com.edu.hometask6.task1.innerComparator;

import java.util.Comparator;

public abstract class Employee implements Comparable<Employee> {
    private int employeeId;
    private int averageMonthSalary;

    public int getAverageMonthSalary() {
        return averageMonthSalary;
    }

    public void setAverageMonthSalary(int averageMonthSalary) {
        this.averageMonthSalary = averageMonthSalary;
    }

    static SalaryComparator salaryComparator = new SalaryComparator();

    public Employee(int employeeId) {
        this.employeeId = employeeId;
    }

    public static SalaryComparator getSalaryComparator() {
        return salaryComparator;
    }


    @Override
    public int compareTo(Employee o) {
        return (o.getAverageMonthSalary() - this.getAverageMonthSalary());
    }


    static class SalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (o2.getAverageMonthSalary() - o1.getAverageMonthSalary());

        }
    }


}
