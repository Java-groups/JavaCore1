package AllHomeWorks.HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {}
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge(){
        return (2022 - this.birthYear);
    }
    public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Firstname:");
        String firstName = "";
        firstName = br.readLine();

        while (firstName.isEmpty()) {
            System.out.println("Firstname cannot be empty. Enter Firstname:");
            firstName = br.readLine();
        }
        this.setFirstName(firstName);


        System.out.println("Enter LastName:");
        String lastName = "";
        lastName = br.readLine();

        while (lastName.isEmpty()){
            System.out.println("Lastname cannot be empty. Enter Lastname:");
            System.out.println("Enter LastName:");
            lastName = br.readLine();
        }
        this.setLastName(lastName);

        System.out.println("Enter BirthdayYear:");
        int birthYear = -1;
        try {
            birthYear = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {

        }

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        while (birthYear > currentYear || birthYear < 0) {
            System.out.println("Please input right year!");
            try {
                birthYear = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {

            }
        }
        this.setBirthYear(birthYear);
    }

    public void output() {
        System.out.println("Firstname: " + this.getFirstName());
        System.out.println("Lastname: " + this.getLastName());
        System.out.println("BirthYear: " + this.getBirthYear());
        System.out.println("Age: " + this.getAge());
    }

    public void changeName(String firstName, String lastName) {
        if (!(firstName.isEmpty())) {
            this.setFirstName(firstName);
        }
        if (!(lastName.isEmpty())) {
            this.setLastName(lastName);
        }
    }
}
