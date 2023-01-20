package edu.homeworks.hw14.homeWork.Task2;



public class Main {
    public static void main(String[] args){
        final String res1 = "First recource";
        final String res2 = "Second recource";
        Thread t1 = new Thread(() -> {
            synchronized (res1) {
                System.out.println("Thread 1 resource 1");
                synchronized (res2) {
                    System.out.println("Thread 1 resource 2");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (res2) {
                System.out.println("Thread 2 resource 2");
                synchronized (res1) {
                    System.out.println("Thread 2 resource 1");
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End");
    }
}

