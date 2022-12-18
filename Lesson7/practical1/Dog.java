package Lesson7.practical1;

public class Dog implements Animals{
    @Override
    public void voice() {
        System.out.println("The dog says: bark");
    }

    @Override
    public void feed() {
        System.out.println("Meat");
    }
}
