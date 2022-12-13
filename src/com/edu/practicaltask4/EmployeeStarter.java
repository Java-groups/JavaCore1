package com.edu.practicaltask4;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeStarter {


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Igor", 1, 120);
        employees[1] = new Employee("Oleg", 2, 200);
        employees[2] = new Employee("Olga", 3, 190);
        employees[3] = new Employee("Viktoria", 1, 400);
        employees[4] = new Employee("Petro", 1, 300);

        Employee.listEmployeesSameDep(Employee.inputDepartment(sc), employees);
      
    }

}
