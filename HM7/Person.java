package HM7;

public abstract class Person {
    int age;
    FullName fullName;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    String info() {
       return  "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + age;
    }

    abstract String activity();
}
