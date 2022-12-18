package PracticalTask6_OOP2.Task2;

abstract public class Staff extends Person {

    public Staff(String name) {
        super(name);
    }

    abstract double salary();

    @Override
    void print() {
        System.out.println("I am " + getClass().getSimpleName() + ". My name is " + getName() + ".");
    }
}
