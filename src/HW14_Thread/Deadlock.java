package HW14_Thread;

public class Deadlock extends Thread {
    static final String resource1 = "First my resource";
    static final String resource2 = "Second my resource";

    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Go - Thread 1 take resource 1");
                }
                try {
                    Thread.sleep(20);
                } catch (Exception e) {

                }
                synchronized (resource2) {
                    System.out.println("Go - Thread 1 take resource 2");
                }
            }
        };
        Thread thread2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Go - Thread 2 take resource 2");
                    synchronized (resource1) {
                        System.out.println("Go - Thread 2 take resource 1");
                    }
                }
            }
        };

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Good work");
    }
}
