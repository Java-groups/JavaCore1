package HW14_Thread.Threads;

public class Thread1 extends Thread {
    public Thread1() {
    }
    public void run() {
        Thread thread2 = new Thread2("Thread number two");
        thread2.start();
    }
}
