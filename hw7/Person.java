package hw7;

public abstract class Person {
    public FullName fullName;
    public int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return "First name: " + fullName.getFirstName() + ", " + "Last name: " + fullName.getLastName() + ", " + "Age: " + age;
    }

    public abstract String activity();
}
