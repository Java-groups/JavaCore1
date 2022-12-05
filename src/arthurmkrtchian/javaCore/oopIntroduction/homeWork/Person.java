package arthurmkrtchian.javaCore.oopIntroduction.homeWork;


//        Create Console Application and add class Person to the project.
//          Class Person should consist of
//              - three private fields: firstName, lastName and birthYear (the birthday year)
//              - properties for access to these fields
//              - default constructor and constructor with 2 parameters (first and last names)
//              - methods:
//                  • getAge() - to calculate the age of person
//                  • input() - to input information about person
//                  • output() - to output information about person
//                  • changeName(String fn, String ln) - to change the first name or/and last name
//          In the method main() create 5 objects of Person type and input information about them.

//          WARNING! Class methods are not tested for 100% percent yet


import java.time.Year;
import java.util.Scanner;

public class Person {
    Scanner console = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int birthYear = -1;

    public int getAge(){
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }

    public void input(){

        if (firstName == null && lastName == null){
            System.out.println("--------------------- User data entry ---------------------");
            System.out.print("Enter first name: ");
            setFirstName(console.nextLine());

            System.out.print("Enter last name: ");
            setLastName(console.nextLine());

            System.out.print("Enter birth year: ");
            setBirthYear(console.nextInt());
            if (getAge() > 100){
                    System.out.println("Are you seriously? Is that person still alive?");
            }
            System.out.println("-----------------------------------------------------------");

            // Here we can also check input for integer by using method nextLine() instead of nextInt() and try to parse value to int.
            // Also it would be better to check input for adequacy

        } else{
            System.out.println("This object already contain first and last name. \nUse \"changeName()\" method to update it.");
        }
    }

    public void output(){
        System.out.println("\n--------------------- Person ---------------------");
        System.out.printf("Person first name is: %s\n", getFirstName());
        System.out.printf("Person first name is: %s\n", getLastName());

        if (getBirthYear() == 0){
            System.out.printf("Can`t calculate %s`s age. There is no information about person birth year.", getFirstName());
        } else {
            System.out.printf("Person first name is: %s\n", getAge());
        }

        System.out.println("--------------------------------------------------\n");
    }

    public void changeName(String firstName, String lastName){
        boolean isUpdated = false;
        if (firstName.length() > 2 && !firstName.equals(getFirstName())){
            setFirstName(firstName);
            isUpdated = true;
        }
        if (lastName.length() > 2 && !lastName.equals(getLastName())){
            setLastName(lastName);
            isUpdated = true;
        }
        if (isUpdated){
            System.out.println("The information updated successfully");
        } else {
            System.out.println("Incorrect input. Please check:\n\t- names must contains 3 or more characters;\n\t- values you try to input are different from the current values.\n");
        }
    }

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
        if (this.birthYear == -1){
            System.out.println("Field is empty. Please use \"setBirthYear()\" method to define it.");
            return birthYear;
        }
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
