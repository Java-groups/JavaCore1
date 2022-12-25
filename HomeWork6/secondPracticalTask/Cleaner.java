package edu.homeworks.hw6.secondPracticalTask;

public class Cleaner extends Staff{
    final String TYPE_PERSON = "Cleaner";
    Cleaner(String name) {
        super(name);
    }

    @Override
    public int salary() {
        return 1500;
    }
    @Override
    void print(){
        System.out.println("Type person = " + TYPE_PERSON +
                "\n Name = " + getName());
    }
}
