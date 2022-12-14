package edu.homeworks.hw5.task1;
public class Main {
    public static void main(String[] args) {
        Birds[] birds = new Birds[4];
        birds[0] = new Eagle("yes","yes");
        birds[1] = new Smallow("yes","yes");
        birds[2] = new Chicken("yes","no");
        birds[3] = new Penguin("yes","no");

        for (int i = 0;i< birds.length;i++) {
            System.out.println("Feather = " + birds[i].getFeather() +
                    "\nLayegg" + birds[i].getLayEgg() +
                    "\nFly" + birds[i].Fly());

        }

    }
}