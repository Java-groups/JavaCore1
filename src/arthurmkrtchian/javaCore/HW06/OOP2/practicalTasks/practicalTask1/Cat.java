package arthurmkrtchian.javaCore.HW06.OOP2.practicalTasks.practicalTask1;

public class Cat implements Animal{

    private String name;
    private int age;

    @Override
    public void voice() {
        System.out.printf("%s say \"mew mew...\"\n", name);
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void feed() {
        System.out.printf("Cat %s is eating...\n", name);
    }
}
