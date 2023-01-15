package com.edu.practicaltask11.Task2;


public class PlantStarter {
    public static void main(String[] args) {

        Plant[] plants = new Plant[5];

        try {
            plants[0] = new Plant("ruit", "ed", 10);

            System.out.println(plants[0]);

        } catch (TypeException | ColorException e) {
            System.err.println(e.getMessage() + "\n");
            e.printStackTrace();

        }
        try {
            plants[1] = new Plant("greenery", "yellow", 12);
            System.out.println(plants[1]);

        } catch (TypeException | ColorException e) {
            System.err.println(e.getMessage() + "\n");
            //e.printStackTrace();

        }
        try {
            plants[2] = new Plant("erry", "red", 1);
            System.out.println(plants[2]);

        } catch (TypeException | ColorException e) {
            System.err.println(e.getMessage() + "\n");
            // e.printStackTrace();

        }
        try {
            plants[3] = new Plant("erry", "red", 12);
            System.out.println(plants[3]);

        } catch (TypeException | ColorException e) {
            System.err.println(e.getMessage() + "\n");
            e.printStackTrace();

        }
        try {
            plants[4] = new Plant("berry", "red", 2);
            System.out.println(plants[4]);

        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + "\n");
            e.printStackTrace();

        }
        System.out.println("Plants over");

    }
}
