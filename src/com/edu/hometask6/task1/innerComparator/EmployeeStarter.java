package com.edu.hometask6.task1.innerComparator;

import java.util.Arrays;

public class EmployeeStarter {
    public static void main(String[] args) {


        Employee[] employees = new Employee[3];
        employees[0] = new SalariedEmployee(21, 10, "Vardan", 3100);
        employees[1] = new ContractEmployee(20, 12, "Oleg", 15, 200);
        employees[2] = new ContractEmployee(23, 8, "Olga", 30, 180);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

        Arrays.sort(employees, Employee.getSalaryComparator());
        System.out.println();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}


