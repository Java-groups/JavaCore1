package edu.homeworks.hw14.homeWork.Task1;

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new MyThread("Hello");
        Thread secondThread = new MyThread("Hi");
        Thread thirdThread = new MyThread("Bye");
        firstThread.start();
        secondThread.start();
        try{
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thirdThread.start();
    }
}
class MyThread extends Thread{
    String text;
    MyThread(String text){
        this.text = text;
    }
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(text);
        }
    }
}
