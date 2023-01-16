package arthurmkrtchian.javaCore.HW06.OOP2.practicalTasks.practicalTask1;

public class Dog implements Animal{
    private String name;
    private int age;

    @Override
    public void voice() {
        System.out.printf("%s say \"auf auf..\"\n", name);
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void feed() {
        System.out.printf("Dog %s is eating...\n", name);
    }
}
