package com.softserve.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dog {

    public static void main(String[] args) throws IOException {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        dog1.setName();
        dog1.setAge();
        dog1.checkDogNames();
        dog1.oldestDogNameAndBreed();

        dog2.setName();
        dog2.setAge();
        dog2.checkDogNames();
        dog2.oldestDogNameAndBreed();

        dog3.setName();
        dog3.setAge();
        dog3.checkDogNames();
        dog3.oldestDogNameAndBreed();
    }

    private String name;
    private String breed;
    private int age;
    private int i = 1;

    public void Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {

    }

    public Dog(String name) {
    }

    public Dog(int age) {
    }

    public enum Breed {
        JACK_RUSSELL, WHITE_TERRIER, SAMOYED;
    }


    public void setName() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input dog's name: ");
        name = bf.readLine();
    }

    public void setAge() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input dog's age: ");
        age = Integer.parseInt(bf.readLine());
    }

    public void checkDogNames() {
        Dog dog1 = new Dog(name);
        Dog dog2 = new Dog(name);
        Dog dog3 = new Dog(name);
        if (dog1.equals(dog2) || dog1.equals(dog3) || dog2.equals(dog3)) {
            System.out.println("There is 2 same dog's names: " + name);
        }
    }

    public void oldestDogNameAndBreed() {
        Dog dog1 = new Dog(age);
        Dog dog2 = new Dog(age);
        Dog dog3 = new Dog(age);
        maxAge(dog1, dog2, dog3);
        maxAge(dog2, dog3, dog1);
        maxAge(dog3, dog1, dog2);
    }

    public void maxAge(Dog dog1, Dog dog2, Dog dog3) {
        Dog dog;

        if (dog1.age > dog2.age && dog1.age > dog3.age) {
            dog = dog1;
            System.out.println(dog);
        }
    }

    @Override
    public String toString() {
        return "Dog" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age;
    }
}
