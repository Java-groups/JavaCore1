package com.edu.hometask2.person;
import java.time.LocalDate;
import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public void input() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, input yor first name: ");
        firstName = sc.nextLine();

        System.out.println("Please, input yor first name: ");
        lastName = sc.nextLine();

        System.out.println("Please, input yor birth date: ");
        birthYear = sc.nextInt();


    }

    public void output() {
        System.out.println("First name: " + firstName + " Last name: " + lastName + " Age: " + getAge());

    }

    public void changeName(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }


}
