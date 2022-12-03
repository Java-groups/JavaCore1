import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.YearMonth;

import static java.lang.Integer.parseInt;

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

    int getAge() {
        return YearMonth.now().getYear() - birthYear;
    }

    void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter first name: ");
        this.firstName = br.readLine();
        System.out.print("Please enter last name: ");
        this.lastName = br.readLine();
        System.out.print("Please enter birth year: ");
        this.birthYear = parseInt(br.readLine());
    }

    String output() {
        return "First name: " + firstName
                + "\nLast name: " + lastName
                + "\nBirth year: " + birthYear;
    }

    void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
