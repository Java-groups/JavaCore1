package com.edu.practicaltask6.task2;

public class Teacher extends Staff {

    final String TYPE_PERSON = "teacher";

    public Teacher(String name) {
        super(name);
        System.out.println(TYPE_PERSON + " " + getName());
    }

    @Override
    public void print() {
        System.out.print("I am a teacher " + getName() + " ");

    }

    @Override
    public void salary() {
        System.out.println("My salary is 3000");
    }
}
