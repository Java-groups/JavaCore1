package HW7_innerClasses;

import static java.lang.System.*;

abstract public class Person implements Cloneable {
    private int age;
    private FullName fullName;

    public Person(int age, FullName fullName) {
        this.age = age;
        this.fullName = fullName;
    }
    public String info() {
        String text = "First name: " + this.fullName.getFirstName() + ", Last name: " + this.fullName.getLastname() + ", Age: " + this.age;
        return (text);

    }

    abstract public String activity();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person copyOfPerson = (Person) super.clone();
        copyOfPerson.fullName = (FullName)copyOfPerson.fullName.clone();
        return copyOfPerson;
    }

    @Override
    public String toString() {
        return " age= " + age + fullName ;
    }
}
