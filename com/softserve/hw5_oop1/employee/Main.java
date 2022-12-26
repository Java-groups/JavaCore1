package com.softserve.hw5_oop1.employee;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Taras", 32, 25000.003);
        Developer developer = new Developer("Roman", 37, 60000.005, "Expert");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
