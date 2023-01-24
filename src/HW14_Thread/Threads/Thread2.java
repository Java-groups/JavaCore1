package HW14_Thread.Threads;

public class Thread2 extends Thread {
    private String massages2;

    public Thread2(String massages2) {
        this.massages2 = massages2;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(massages2);
        }
        Thread thread3 =new Thread3("Thread number three");
        thread3.start();
    }
}
