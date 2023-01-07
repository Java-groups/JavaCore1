package AllHomeWorks.HomeWork7;

public abstract class Person {
    private FullName fullName;
    private int age;

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public Person(FullName fullName, int age){
        this.fullName = fullName;
        this.age = age;

    }
    @Override
    public String toString() {
        return String.format("\nFirst name: %s, Last name: %s, Age: %d", getFullName().getFirstName(), getFullName().getLastName(), getAge());
    }

    public void info() {
        System.out.println(this);
    }
    public abstract String activity();
}
