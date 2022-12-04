package hw2;

import java.util.Scanner;

public class Person {
    private static final int CURRENT_YEAR = 2022;
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person () {}
    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        return CURRENT_YEAR - birthYear;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("First name: ");
        this.firstName = sc.nextLine();
        System.out.print("Last name: ");
        this.lastName = sc.nextLine();
        System.out.print("Birthday year: ");
        this.birthYear = sc.nextInt();
    }

    public void output() {
        System.out.print("Person information: " + firstName + " " + lastName + ", age " + getAge());
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

}
