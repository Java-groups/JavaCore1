package HW14.PracticalTasks;

public class Main {
    public static void main(String[] args) {

//         task1
        for (int i = 0; i < 10; i++) {
            System.out.println("I study Java");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
            ;
        }
//        task2
        MyThread thread1 = new MyThread(5,2000,"Hello World");
        MyThread thread2 = new MyThread(5,3000,"Peace in the peace");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        ;
        System.out.println("My name is Serhii");

    }
}
