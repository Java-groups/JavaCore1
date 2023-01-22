package hw14;

import java.util.concurrent.TimeUnit;

public class Task_1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Doing some work in thread " + Thread.currentThread().getName());
                sleep(2);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Doing some OTHER work in thread " + Thread.currentThread().getName());
                sleep(3);
            }
        });

        t1.start();
        t2.start();

        new Thread(() -> {
            try {
                System.out.println("Waiting for 2 threads to finish... ");
                t1.join();
                t2.join();
                System.out.println("Other 2 threads finished!");
                for (int i = 0; i < 5; i++) {
                    System.out.println("Doing some work in thread " + Thread.currentThread().getName());
                    sleep(1);
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

    private static void sleep(int sec) {
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
