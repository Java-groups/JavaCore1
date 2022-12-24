package com.edu.practicaltask6.task2;

public abstract class Person {
    private String name;

    public String getName() {
        return name;
    }

    public abstract void print();

    public Person(String name) {
        this.name = name;
    }
}
