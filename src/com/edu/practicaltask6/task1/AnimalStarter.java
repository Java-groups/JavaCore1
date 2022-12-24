package com.edu.practicaltask6.task1;


public class AnimalStarter {

    public static void main(String[] args) {
        Animal[] animals = new Animal[4];


        animals[0] = new Cat("Tom");
        animals[1] = new Cat("Kitty");
        animals[2] = new Dog("Stella");
        animals[3] = new Dog("Boy");

        for (int i = 0; i < animals.length; i++) {

            System.out.print(animals[i] + animals[i].voice() + animals[i].feed());
            System.out.println();

        }
    }
}
