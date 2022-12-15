package HW6.PracticalTasks.Task1;

public class Dog implements Animal{
    @Override
    public String voise() {
        return "woof";
    }

    @Override
    public String feed() {
        return "woof-woof";
    }
}
