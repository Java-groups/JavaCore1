package com.softserve.hw3.dog;

import com.softserve.hw3.dog.model.Breed;
import com.softserve.hw3.dog.model.Dog;
import com.softserve.hw3.dog.service.DogService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DogMain {
    static final int DOGS_QUANTITY = 3;

    public static void main(String[] args) throws IOException {
        Dog[] dogs = new Dog[DOGS_QUANTITY];
        for(int i = 0; i < DOGS_QUANTITY; i++) {
            System.out.println("Input " + (1+i) + " dog");
            dogs[i] = new Dog(readName(), readAge(), readBreed());
        }
        DogService ds = new DogService();
        boolean equalDogNameFlag = ds.compareDogNames(dogs);
        if (!equalDogNameFlag) {
            System.out.println("There are no same dog names");
        } else {
            System.out.println("There are same dog names");
        }
        Dog oldestDog = ds.oldestDogNameAndBreed(dogs);
        System.out.printf("Oldest dog name '%s' and breed '%s' ", oldestDog.getName(), oldestDog.getBreed());
    }

    public static String readName() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input dog's name: ");
        return bf.readLine();
    }

    public static int readAge() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input dog's age: ");
        return Integer.parseInt(bf.readLine());
    }

    public static Breed readBreed() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input dog's breed: ");
        return Breed.valueOf(bf.readLine().toUpperCase());
    }
}
