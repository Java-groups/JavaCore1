package com.edu.practicaltask6.task2;

public class Student extends Person {

    String TYPE_PERSON = "student";

    public Student(String name) {
        super(name);
        System.out.println(TYPE_PERSON + " " + getName());
    }

    @Override
    public void print() {

        System.out.println("I am a student " + getName());

    }
}
