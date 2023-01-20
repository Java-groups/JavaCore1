package edu.homeworks.hw14.practicalTask.Task1;

public class Main {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();


    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("I learn Java!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
