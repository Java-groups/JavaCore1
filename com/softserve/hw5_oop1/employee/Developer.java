package com.softserve.hw5_oop1.employee;

public class Developer extends Employee {

    private final String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, Position: %s, Salary: \u20B4 %.2f.", name, age, position, salary);
    }
}
