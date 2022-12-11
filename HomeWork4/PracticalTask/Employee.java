package edu.homeworks.homework4.practicalTask;

import java.util.Scanner;

public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    Employee(String name,int salary,int departmentNumber){
        this.name = name;
        this.salary = salary;
        this.departmentNumber = departmentNumber;
    }

    public static void outputDepNumber(Scanner input,Employee[] employee){
        int temp = input.nextInt();
        System.out.println("Enter department number : ");
        for (int i=0;i<employee.length;i++){
            employee[i].setDepartmentNumber(temp);
        }
    }
    public static void sortedEmployees(Employee[] employee){
        int tmp;
        for (int i = 0; i < employee.length - 1; i++) {
            for (int j = i + 1; j < employee.length; j++) {
                if (employee[i].getSalary() < employee[j].getSalary()) {
                    tmp = employee[i].getSalary();
                    employee[i].salary = employee[j].salary;
                    employee[j].salary = tmp;
                }
            }
        }
        System.out.println("Sorted list : ");
        for (int i=0;i<employee.length;i++){
            System.out.println(
                    "\n Name:" + employee[i].getName() +
                            "\n Salary:" + employee[i].getSalary() +
                            "\n Department Number:" + employee[i].getDepartmentNumber());
        }
    }
}
