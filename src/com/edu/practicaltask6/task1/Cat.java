package com.edu.practicaltask6.task1;

public class Cat implements Animal{
 private String name;

    @Override
    public String toString() {
        return "Cat, I am " + getName()+ ", ";
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String voice() {
        return " I meow, ";
    }

    @Override
    public String feed() {
        return " I like milk";
    }
}
