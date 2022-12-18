package Lesson7.practical2;

public abstract class Staff extends Person {
    @Override
    public void print() {
        System.out.println("I am a staff");
    }

    public abstract int salary();
}
