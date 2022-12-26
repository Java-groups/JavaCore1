package com.softserve.hw5_oop1;

import com.softserve.hw5_oop1.birds.flyingbirds.Eagle;
import com.softserve.hw5_oop1.birds.flyingbirds.FlyingBird;
import com.softserve.hw5_oop1.birds.flyingbirds.Swallow;
import com.softserve.hw5_oop1.birds.nonflyingbirds.Chicken;
import com.softserve.hw5_oop1.birds.nonflyingbirds.NonFlyingBird;
import com.softserve.hw5_oop1.birds.nonflyingbirds.Penguin;

public class Main {

    static final int BIRDS_QUANTITY = 6;

    public static void main(String[] args) {
        Bird[] birds = new Bird[BIRDS_QUANTITY];
        birds[0] = new FlyingBird(100, 5);
        birds[1] = new NonFlyingBird(200, 10);
        birds[2] = new Eagle(300, 1);
        birds[3] = new Swallow(400, 2);
        birds[4] = new Penguin(500, 3);
        birds[5] = new Chicken(600, 4);
        for (int i = 0; i < BIRDS_QUANTITY; i++) {
            birds[i].fly();
        }
    }
}
