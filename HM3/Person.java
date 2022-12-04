import java.util.Scanner;

public class Person {
    String firstName, lastName;
    int birthYear;

    //Properties for access to the fields
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    //Constructors
    public Person () {}

    public Person (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Methods
    public int getAge() {
        return 2022 - birthYear;
    }

    public void input() {
        System.out.println("Please enter the Name");
        Scanner sc = new Scanner(System.in);
        firstName = sc.next();

        System.out.println("Please enter the Last Name");
        lastName = sc.next();

        System.out.println("Please enter your Birthday year");
        birthYear = sc.nextInt();
    }

    public void changeName(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

    public String output() {
        return firstName + " " + lastName + " is " + getAge() + " years old";
    }


    //method main
    public static void main(String[] args) {
        Person Person1 = new Person("Roman", "Kukliak");
        Person1.birthYear = 1992;

        Person Person2 = new Person("Oksana", "Bura");
        Person2.birthYear = 1995;

        Person Person3 = new Person("Bogdan", "Panasiuk");
        Person3.birthYear = 1997;

        Person Person4 = new Person();
        Person4.birthYear = 2000;
        Person4.firstName = "Oleg";
        Person4.lastName = "Korolyk";

        Person Person5 = new Person();
        Person5.birthYear = 1991;
        Person5.firstName = "Vasyl";
        Person5.lastName = "Burak";

        //General info about all persons
        System.out.println(Person1.output());
        System.out.println(Person2.output());
        System.out.println(Person3.output());
        System.out.println(Person4.output());
        System.out.println(Person5.output());
    }
}
