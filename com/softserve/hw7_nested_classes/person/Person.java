package com.softserve.hw7_nested_classes.person;

public abstract class Person<A> {

    protected FullName fullName;
    protected int age;

    public Person(FullName fullName, int age) {}

    public String info (String firstName, String lastName, int age) {
        return "First name: <firstName>, Last name: <lastName>, Age: <age>";
    }

    abstract public A activity(String activity);
}
