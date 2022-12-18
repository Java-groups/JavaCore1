package Lesson7.practical1;

public class Cat implements Animals {
    @Override
    public void voice() {
        System.out.println("The cat says: meow");
    }

    @Override
    public void feed() {
        System.out.println("Fish");
    }
}
