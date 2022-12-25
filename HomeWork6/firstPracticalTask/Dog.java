package edu.homeworks.hw6.firstPracticalTask;

public class Dog implements Animal{

    private String name;
    private int age;
    Dog(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public void voice() {
        System.out.println("Bar");
    }

    @Override
    public void feed() {
        System.out.println("Meat");
    }
}
