package com.softserve.hw7_nested_classes.person;

public class Student extends Person {

    private int course;

    public Student(FullName fullname, int age, int course) {
        super(fullname, age);
        this.course = course;
    }

    @Override
    public String info() {
        return String.format( "%s, Course: %d", super.info(), course);
    }

    @Override
    public String activity() {
        return "I study at university";
    }
}
