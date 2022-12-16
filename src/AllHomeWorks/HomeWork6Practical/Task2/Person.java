package AllHomeWorks.HomeWork6Practical.Task2;

public abstract class Person {
    protected String name;

    public Person (String name){
        this.name = name;
    }

    public void print() {
        System.out.println("I am a Person.");
    }
}
