package edu.homeworks.hw7.task1;

abstract public class Person {
    FullName fullName;
    protected int age;


    public Person(FullName fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public String info(){
        return "First name:" + fullName.getFirstName() +
                "\n Last name: " + fullName.getLastName() +
                "\n Age: " + age;
    }
    abstract String activity();
}
