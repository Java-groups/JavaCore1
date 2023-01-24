package PracticalTask14_Thread;

public class Intervals implements Runnable {
    // Output text «I study Java» 10 times with the intervals of one second (Thread.sleep(1000);).

    @Override
    public void run() {

    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " times - " + " I study Java");
            Thread.sleep(1000);
        }
        System.out.println("11 times - it is a finish, but I'll be beak!");
    }
}
