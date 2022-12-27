package com.softserve.hw7_nested_classes.person;

public abstract class Person {

    protected FullName fullName;
    protected int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return String.format("First name: %s, Last name: %s, Age: %d", fullName.getFirstName(), fullName.getLastName(), age);
    }

    abstract public String activity();
}
