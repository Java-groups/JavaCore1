package hw2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person();
        p1.input(sc);
        p1.output();

        Person p2 = new Person("Freddie", "Mercury");

        Person p3 = new Person();
        p3.setFirstName("Brian");
        p3.setLastName("May");
        p3.setBirthYear(1947);

        Person p4 = new Person();
        p4.changeName("Roger", "Taylor");

        Person p5 = new Person("Adam", "Lambert");
    }
}