package edu.homeworks.homework3;

import java.util.*;

public class Dog {
    private String name;
    private Breed breed;
    private int age;


    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void OldDog(Dog[] dog){
        ArrayList<Integer> arrayMax = new ArrayList<>();
        for(int i=0;i<dog.length;i++){
            arrayMax.add(dog[i].getAge());
        }
        for(int j = 0;j< dog.length;j++){
            if(dog[j].getAge() == Collections.max(arrayMax))
            {
                System.out.println("Name = " + dog[j].getName());
                System.out.println("Breed = " + dog[j].getBreed());
            }
        }

    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dog otherDog = (Dog) obj;

        if(name != this.name) return false;

        return name.equals(otherDog.name);
    }

    public static void NameDog(Dog[] dog){
        for(int i=0;i< dog.length;i++){
            for(int j=0;j<dog.length;j++){
                if(dog[i].equals(dog[j]) && dog[i] != dog[j]){
                    System.out.println("There is a match in the names of dogs = " + dog[i].getName()+ " " +dog[j].getName());
                    break;
                }
            }
        }
    }

}


