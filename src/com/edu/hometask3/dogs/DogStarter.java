package com.edu.hometask3.dogs;
public class DogStarter {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Minny", Breed.SHEPPERD, 43);

        Dog dog2 = new Dog("Boy", Breed.BOXER, 7);

        Dog dog3 = new Dog("Boy", Breed.TAXA, 5);

        if ((dog1.equalsForName(dog2)))
            System.out.println("Dog1 and Dog2 has the same names");
        if ((dog1.equalsForName(dog3)))
            System.out.println("Dog1 and Dog3 has the same names");
        if ((dog2.equalsForName(dog3)))
            System.out.println("Dog2 and Dog3 has the same names");


        if ((dog1.getAge() > dog2.getAge()) & (dog1.getAge() > dog3.getAge()))
            System.out.println("Dog " + dog1.getName() + " " + dog1.getBreed() + " is oldest");
        if ((dog2.getAge() > dog1.getAge()) & (dog2.getAge() > dog3.getAge()))
            System.out.println("Dog " + dog2.getName() + " " + dog2.getBreed() + " is oldest");
        if ((dog3.getAge() > dog1.getAge()) & (dog3.getAge() > dog2.getAge()))
            System.out.println("Dog " + dog3.getName() + " " + dog3.getBreed() + " is oldest");


    }

}


