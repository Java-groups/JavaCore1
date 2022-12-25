package HM6.PracticalTask1;

public class Cat implements Animal{

    @Override
    public String voice() {
        return "I say Mew and purr";
    }

    public String feed() {
        return "I'm a cat, I eat Whiskas";
    }
}
