package edu.homeworks.hw6.secondPracticalTask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Cleaner("Stepan"));
        persons.add(new Teacher("Alex"));
        persons.add(new Student("Bob"));
        System.out.println(((Staff)persons.get(0)).salary());
        System.out.println(((Staff)persons.get(1)).salary());
        persons.get(0).print();
        persons.get(1).print();
        persons.get(2).print();

    }
}