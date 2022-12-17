package com.softserve.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Dog {

    public static void main(String[] args) throws IOException {
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setName();
        dog1.setAge();

        dog2.setName();
        dog2.setAge();

        dog3.setName();
        dog3.setAge();

        dog.compareDogNames();
        dog.oldestDogNameAndBreed();
    }

    private String name;
    private Breed breed;
    private int age;

    public Dog() {

    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(int age, String name, Breed breed) {
        this.age = age;
        this.breed = breed;
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

    public void compareDogNames() {
        Dog dog;

        Dog dog1 = new Dog(name);
        Dog dog2 = new Dog(name);
        Dog dog3 = new Dog(name);

        if (dog1.equals(dog2)) {
            dog = dog1;
            System.out.println(dog);
        }
        if (dog1.equals(dog3)) {
            dog = dog1;
            System.out.println(dog);
        }
        if (dog2.equals(dog3)) {
            dog = dog2;
            System.out.println(dog);
        }
    }

    public void oldestDogNameAndBreed() {
        Breed breed1 = Breed.JACK_RUSSELL;
        Breed breed2 = Breed.SAMOYED;
        Breed breed3 = Breed.WHITE_TERRIER;

        Dog dog1 = new Dog(age, name, breed1);
        Dog dog2 = new Dog(age, name, breed2);
        Dog dog3 = new Dog(age, name, breed3);

        maxAge(dog1, dog2, dog3);
        maxAge(dog2, dog1, dog3);
        maxAge(dog3, dog2, dog1);
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
        return "Dog " +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name) && breed == dog.breed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age);
    }
}
