package com.edu.practicaltask2.realisation;

import com.edu.practicaltask2.employee.Employee;

public class EmployeeCreation {
    public static void main(String[] args) {

        Employee s1 = new Employee();
        s1.setName("Vlad");
        s1.setRate(1);
        s1.setHours(8);
        System.out.println(s1);
        System.out.println("Vlad`s salary is " + s1.getSalary() + ", bonus is " + s1.getBonus());
        System.out.println();

        Employee s2 = new Employee("Olena", 5);
        s2.setHours(8);
        System.out.println(s2);
        System.out.println("Olena`s salary is " + s2.getSalary() + ", bonus is " + s2.getBonus());
        System.out.println();

        Employee s3 = new Employee("Petro", 5, 5);
        System.out.println(s3);
        System.out.println("Petro`s salary is " + s3.getSalary() + ", bonus is " + s3.getBonus());
        System.out.println();

        System.out.println("All employees total salary is " + ((s1.getTotalSum() + s2.getTotalSum() + s3.getTotalSum())));

    }

}
