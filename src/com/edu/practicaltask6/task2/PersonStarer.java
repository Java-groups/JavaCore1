package com.edu.practicaltask6.task2;

public class PersonStarer {


    public static void main(String[] args) {

        Person[] persons = new Person[4];

        persons[0] = new Student("Dmytro");
        persons[1] = new Cleaner("Maria");
        persons[2] = new Teacher("Olga");
        persons[3] = new Student("Petro");

        for (int i = 0; i < persons.length; i++) {

            persons[i].print();

            if (persons[i] instanceof Staff) {
                ((Staff) persons[i]).salary();
            }
        }

    }
}

