package com.softserve.hw4.dog.model;

import java.util.Objects;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog() {

    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age, Breed breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
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
