package hw14;

public class Task_2 {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> getLocks(lock1, lock2));
        Thread t2 = new Thread(() -> getLocks(lock2, lock1));

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Done successfully!");
    }

    private static void getLocks(Object l1, Object l2) {
        System.out.println(Thread.currentThread().getName() + "Trying to get lock " + l1);
        synchronized (l1) {
            System.out.println(Thread.currentThread().getName() + "Trying to get lock " + l2);
            synchronized (l2) {
                System.out.println(Thread.currentThread().getName() + "Got 2 locks!");
            }
        }
    }
}
