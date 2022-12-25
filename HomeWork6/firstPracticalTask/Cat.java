package edu.homeworks.hw6.firstPracticalTask;

public class Cat implements Animal{


    private String name;
    private int age;
    Cat(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public void voice() {
        System.out.println("Mew");
    }

    @Override
    public void feed() {
        System.out.println("Fish");

    }
}
