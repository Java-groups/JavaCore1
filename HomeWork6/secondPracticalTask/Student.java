package edu.homeworks.hw6.secondPracticalTask;

public class Student extends Person{


    final String TYPE_PERSON = "Student";
    Student(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("I'm " + TYPE_PERSON);

    }
}
