package com.edu.hometask5;


public class BirdStarter {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Kiwi();

        for (int i = 0; i < birds.length; i++) {

            System.out.print(birds[i] + "    ");
            System.out.println(birds[i].fly());


        }
    }
}
