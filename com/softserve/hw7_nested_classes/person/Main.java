package com.softserve.hw7_nested_classes.person;

public class Main {
    public static void main(String[] args) {
        FullName fullName = new FullName("Petro", "Petrenko");
        FullName fullName1 = new FullName("Bohdan", "Petrenko");
        Student student = new Student(fullName, 35, 1);
        Student student1 = new Student(fullName1, 37, 2);
        System.out.println(student.info());
        System.out.println(student.activity());
        System.out.println(student1.info());
        System.out.println(student1.activity());
    }
}
