package com.edu.hometask3.dogs;

public class DogStarter {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Boy", Breed.SHEPPERD, 8);

        Dog dog2 = new Dog("Rolf", Breed.BOXER, 3);

        Dog dog3 = new Dog("Minny", Breed.TAXA, 5);

        if ((dog1.equals(dog2))) {
            System.out.println("Dog1 and Dog2 has the same names");
            if ((dog1.equals(dog3))) {
                System.out.println("Dog1 and Dog3 has the same names");
                if ((dog2.equals(dog3))) {
                    System.out.println("Dog2 and Dog3 has the same names");
                }
            }


        }
    }
}
// System.out.println(dog1.equals(dog2));