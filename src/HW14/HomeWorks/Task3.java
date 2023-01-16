package HW14.HomeWorks;

public class Task3 {
    public static void main(String[] args) {
        AnotherThread thread2 = new AnotherThread("Thread number two");
        AnotherThread thread3 = new AnotherThread("Thread number three");
        AnotherThread thread = new AnotherThread(thread2,thread3);
        thread.start();
        try {
            thread.join();
        }catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
