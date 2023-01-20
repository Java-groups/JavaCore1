package edu.homeworks.hw14.homeWork.Task3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
    }
}
class MyThread extends Thread{
    @Override
    public void run(){
        Runnable secondRunnable = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<3;i++){
                    System.out.println("second");
                }
            }
        };
        Runnable thirdRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++){
                    System.out.println("third");
                }
            }
        };
        Thread second = new Thread(secondRunnable);
        Thread third = new Thread(thirdRunnable);
        try {
            second.start();
            second.join();
            third.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}