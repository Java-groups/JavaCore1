package com.edu.hometask6.task1.externalComparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getAverageMonthSalary()-o1.getAverageMonthSalary();
    }
}
