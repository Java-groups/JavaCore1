package HW14_Thread.Threads;

public class Thread3 extends Thread {
    private String massages3;

    public Thread3(String massages3) {
        this.massages3 = massages3;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(massages3);
        }
    }
}
