package com.edu.practicaltask4;

import java.util.Scanner;

public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;

    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }


    public static int inputDepartment(Scanner sc) throws Exception {

        System.out.println("Input the department number: ");
        int index = sc.nextInt();
        return index;
    }

    public static void listEmployeesSameDep(int index, Employee[] employees) {

        for (int i = 0; i < employees.length; i++) {

            int tmp;
            for (i = 0; i < employees.length - 1; i++) {
                for (int j = i + 1; j < employees.length; j++) {
                    if (employees[i].getSalary() < employees[j].getSalary()) {
                        tmp = employees[i].getSalary();
                        employees[i].salary = employees[j].salary;
                        employees[j].salary = tmp;
                    }
                }
            }
            System.out.println("list of the employees sorted by salary: ");
            for (i = 0; i < employees.length; i++) {
                if (employees[i].getDepartmentNumber() == index) {

                    System.out.println(
                            " Salary: " + employees[i].getSalary() +
                                    " Name: " + employees[i].getName() +
                                    " Department Number: " + employees[i].getDepartmentNumber());
                }
            }
        }
    }
}
