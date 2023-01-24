package AllHomeWorks.HomeWork14;

import java.io.BufferedReader;

/**
 Create a thread «one», which would start the thread «two», which has to output
 its number («Thread number two») 3 times and create thread «three», which would
 to output message «Thread number three» 5 times.
 */

public class Task3 {
    public static void doTask(BufferedReader br) throws Exception {
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {}
                System.out.println("Thread number three");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {}
                System.out.println("Thread number two");
            }
            thread3.start();
        });

        Thread thread1 = new Thread(thread2::start);

        thread1.start();
    }
}
