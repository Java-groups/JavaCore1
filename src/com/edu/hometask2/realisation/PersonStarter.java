package com.edu.hometask2.realisation;

import com.edu.hometask2.person.Person;

public class PersonStarter {
    public static void main(String[] args) throws Exception {

        Person person1 = new Person();
        person1.input();
        person1.output();
        System.out.println();

        Person person2 = new Person("Olena", "Kravec");
        person2.setBirthYear(2001);
        person2.output();
        System.out.println();

        Person person3 = new Person("Victor", "Kozak");
        person3.setBirthYear(1967);
        person3.output();
        System.out.println();

        Person person4 = new Person();
        person4.input();
        person4.output();
        person4.changeName("Sergiy", "Vasyl`ev");
        person4.output();
        System.out.println();

        Person person5 = new Person("Olga", "Trymbach");
        person5.setBirthYear(1990);
        person5.output();
        System.out.println();


    }
}
