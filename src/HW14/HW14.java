package HW14;

import HW14.model.MyThread;
import HW14.model.ThreadForThirdTask;

public class HW14 extends Thread {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread(5, 150, "First thread");
        MyThread thread2 = new MyThread(5, 270, "Second thread");
        MyThread thread3 = new MyThread(5, 320, "Third thread");
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Start of second task");
        final  String t1 = "Lalala";
        final  String t2 = "Lululu";
         Thread thread = new Thread() {
            @Override
            public void run() {
                synchronized (t1) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (t2) {
                        System.out.println(this.getName());
                    }
                }
            }
        };
         Thread threadSecond = new Thread() {
            @Override
            public void run() {
                synchronized (t2) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                synchronized (t1) {
                    System.out.println(this.getName());
                }

            }
        };
        thread.start();
        threadSecond.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(thread.getName());
        System.out.println(thread.getState());
        System.out.println(threadSecond.getName());
        System.out.println(threadSecond.getState());
        System.out.println("Start of the third task");
        ThreadForThirdTask th1 = new ThreadForThirdTask("Thread 2");
        ThreadForThirdTask th2 = new ThreadForThirdTask("Thread 3");
        ThreadForThirdTask th3 = new ThreadForThirdTask(th1,th2);
        th3.start();
        try {
            th3.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
