package com.edu.practicaltask6.task1;

public class Dog implements Animal{
  private String name;

    @Override
    public String toString() {
        return  "Dog, I am "+ getName()+ ", ";

    }

    public String getName() {
        return name;
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String voice() {
        return " I bark, ";
    }

    @Override
    public String feed() {
        return " I like chicken";
    }
}
