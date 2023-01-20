package edu.homeworks.hw14.practicalTask.Task2;

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new MyThread(5,2000,"Hello,world!");
        Thread secondThread = new MyThread(5,3000,"Peace in the peace");
        firstThread.start();
        secondThread.start();
        try{
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("My name Stepan");
    }
}
class MyThread extends Thread{
    int interval,time;
    String text;
    MyThread(int interval,int time,String text){
        this.interval =interval;
        this.time = time;
        this.text = text;
    }
    @Override
    public void run() {
        for(int i=0;i<interval;i++){
            System.out.println(text);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
