package AllHomeWorks.HomeWork14.Task1;

import java.io.BufferedReader;

/**
 * Run three threads and output there different messages for 5 times.
 * The third thread supposed to start after finishing working of the two previous threads.*/

public class Task1 {
    public static void doTask(BufferedReader br) throws Exception {

        Thread t1 = new MyThread(1, 100);
        Thread t2 = new MyThread(2, 250);
        Thread t3 = new MyThread(3, 250);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
        t3.join();
        System.out.println("Thread main");
    }
}


