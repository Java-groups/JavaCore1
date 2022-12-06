package edu.homeworks.homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Numbers numbers = new Numbers();
        numbers.NumbersLessMore(input);
        numbers.NumberMinMax(input);
        numbers.HTTPErrors(input);

        Dog[] dog = new Dog[3];
        dog[0] = new Dog("Lucky",Breed.Harrier,7);
        dog[1] = new Dog("Rim",Breed.ChowChow,2);
        dog[2] = new Dog("Brownie",Breed.BeardedCollie,1);
        Dog.OldDog(dog);
        Dog.NameDog(dog);










    }
}