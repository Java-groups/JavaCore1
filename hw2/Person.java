package hm2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

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

    public Person() {

    }
    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }


    public int getAge(){
        return 2022 - this.birthYear;
    }

     public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your first name");
        this.firstName = br.readLine();
        System.out.println("enter your last name");
        this.lastName = br.readLine();
        System.out.println("enter your year of birth");
        this.birthYear = parseInt(br.readLine());
    }



    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public String changeName (String fn, String ln) {
        this.firstName = fn ;
        this.lastName = ln;
        return "name changed";


    }

}
