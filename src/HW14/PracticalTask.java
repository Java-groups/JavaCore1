package HW14;

import HW14.model.MyThread;
import HW14.model.practicalThread;

public class PracticalTask {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start of the first practical task");
        practicalThread thread1 = new practicalThread();
        thread1.start();
        System.out.println("Start of the second practical task");
        MyThread threadOne = new MyThread(5, 2000, "Hello World");
        MyThread threadTwo = new MyThread(5, 3000, "Peace in the peace");
        threadOne.start();
        threadTwo.start();
        try {
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hi, my name is Polina");

    }
}


