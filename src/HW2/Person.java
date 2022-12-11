package HW2;

import java.util.Objects;
import java.util.Scanner;

public class Person {
    // three private fields: firstName, lastName and birthYear (the birthday year)
    private String firstName;
    private String lastName;
    private int birthYear;

    // default constructor and constructor with 2 parameters (first and last names)
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

    // getAge() - to calculate the age of person
    public int getAge(int birthYear) {
        return 2022 - birthYear;
    }

    // input() - to input information about person
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First name of the client: ");
        this.firstName = scanner.nextLine();
        System.out.print("Last name of the client: ");
        this.lastName = scanner.nextLine();
        System.out.print("Barth year of the client: ");
        this.birthYear = scanner.nextInt();
    }

    @Override
    public String toString() {
        return " Person {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear + '\'' +
                '}';
    }

    // output() - to output information about person
    public void output(Person idPerson) {
        System.out.println(idPerson);
    }

    // changeName(String fn, String ln) - to change the first name or/and last name
    public void changeName(String fn, String ln) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want change first name? (y / n): ");
        String answer = scanner.next();
        if (answer.equals("y")) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Input new first name: ");
            setFirstName(scanner1.nextLine());
        }
        System.out.print("Do you want change last name? (y / n): ");
        answer = scanner.next();
        if (answer.equals("y")) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Input new last name: ");
            setLastName(scanner2.nextLine());
        }
    }
}


