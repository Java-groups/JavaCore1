package edu.homeworks.hw6.secondPracticalTask;

abstract class Person {
    private String name;
    Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void print();

}
