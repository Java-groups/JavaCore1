package edu.homeworks.hw6.secondPracticalTask;

public class Teacher extends Staff{
    final String TYPE_PERSON = "Teacher";

    Teacher(String name) {
        super(name);

    }

    @Override
    public int salary() {
        return 2000;
    }
    @Override
    void print(){
        System.out.println("Type person = " + TYPE_PERSON +
                "\n Name = " + getName());
    }
}
