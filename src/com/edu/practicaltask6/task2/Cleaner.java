package com.edu.practicaltask6.task2;

public class Cleaner extends Staff {
    public final String TYPE_PERSON = "cleaner";

    public Cleaner(String name) {
        super(name);
        System.out.println(TYPE_PERSON + " " + getName());
    }


    @Override
    public void print() {
        System.out.print("I am a cleaner "+ getName()+" ");
    }

    @Override
    public void salary() {
        System.out.println("My salary is 1000");
    }

}
