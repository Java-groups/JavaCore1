package Lesson15;

import java.util.concurrent.TimeUnit;

public class Task_2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello, World");
                sleep(2);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Peace in the peace");
                sleep(3);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("My name is Anna!");
    }

    private static void sleep(int sec) {
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
