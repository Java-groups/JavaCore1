package HW3.com.model;

import HW3.com.model.Breed;

public class Dog {
    private String name;
    private int age;
    private String breed;

    public String getName() {
        return name;
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = String.valueOf(breed);
    }
}
