package AllHomeWorks.HomeWork14;

import java.io.BufferedReader;

/**
 Cause a deadlock. Organize the expectations of ending a thread in main(),
 and make the end of the method main() in this thread.
 */

public class Task2 extends Thread {
    final static Object first = new Object();
    final static Object second = new Object();
    static Thread t1 = new Thread() {
        public void run() {
            synchronized (first) {
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                }
                synchronized (second) {
                    System.out.println("Success!");
                }
            }
        }
    };
    static Thread t2 = new Thread() {
        public void run() {
            synchronized (second) {
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                }
                synchronized (first) {
                    System.out.println("Success!");
                }
            }
        }
    };

    public static void doTask(BufferedReader br) throws Exception {
        t1.start();
        t2.start();
        try {
            Thread.sleep(20);
        } catch (Exception e) {}
        System.out.println(t1.getState()); // BLOCKED
        System.out.println(t2.getState()); // BLOCKED
    }
}
