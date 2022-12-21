package com.softserve.hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    public static void main(String[] args) throws IOException {
        System.out.println("Input 1st person's info: ");
        Person person1 = new Person();
        person1.input();
        person1.output();
        person1.changeName("Taras", "Petrenko");

        System.out.println("Input 2nd person's info: ");
        Person person2 = new Person();
        person2.input();
        person2.output();

        System.out.println("Input 3rd person's info: ");
        Person person3 = new Person();
        person3.input();
        person3.output();

        System.out.println("Input 4th person's info: ");
        Person person4 = new Person();
        person4.input();
        person4.output();

        System.out.println("Input 5th person's info: ");
        Person person5 = new Person();
        person5.input();
        person5.output();
    }

    private String firstName;
    private String lastName;
    private int birthYear;

    public void Person() {}

    public void Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        return 2022 - getBirthYear();
    }

    public void input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input first name: ");
        setFirstName(bf.readLine());
        System.out.println("Input last name: ");
        setLastName(bf.readLine());
        System.out.println("Input birth year: ");
        setBirthYear(Integer.parseInt(bf.readLine()));
    }

    public void output() {
        System.out.println("Person's info \n" + "First name: " + getFirstName() + "\n" + "Last name: " + getLastName() + "\n" + "Age: " + getAge() + "\n");
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
        System.out.println("First name changed to:" + fn);
        System.out.println("Last name changed to:" + ln + "\n");
    }
}
