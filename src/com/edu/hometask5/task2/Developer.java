package com.edu.hometask5.task2;

public class Developer extends Employee {
    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Developer__Name: %s, Age: %d, Salary: %.2f,__ %s", getName(), getAge(), getSalary(), position);

    }
}

