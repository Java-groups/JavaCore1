package HW2.com.test.model;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {


    public final int YEAR = LocalDate.now().getYear();
    private String firstName;
    private String lastName;
    private int birthYear;


    public Person() {
    }

    public Person(String firstName, String lastName) {
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

    public int getAge(){
        return YEAR - getBirthYear();
    }
    public void input(){
        System.out.println("Enter first name:");
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        this.firstName = name1;
        setFirstName(name1);
        System.out.println("Enter last name:");
        sc = new Scanner(System.in);
        String name2 = sc.next();
        this.lastName = name2;
        setLastName(name2);
        System.out.println("Enter year:");
        sc = new Scanner(System.in);
        int year = sc.nextInt();
        this.birthYear = year;
        setBirthYear(year);

    }
    public void output(){
        System.out.println("First name = "+ getFirstName() + " Last name = " + getLastName() + " Age = " + getAge());


    }
    public void changeName(String fn, String ln){
        setFirstName(fn);
        setLastName(ln);

    }



}
