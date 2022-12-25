package HM6.PracticalTask1;

public class Dog implements Animal{

    @Override
    public String voice() {
        return "I'm barking";
    }

    @Override
    public String feed() {
        return "I'm a dog, I eat Pedigree";
    }
}
