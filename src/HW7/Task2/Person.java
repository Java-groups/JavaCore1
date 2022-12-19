package HW7.Task2;

abstract public class Person  implements Cloneable{
    private FullName fullName;
    private int age;

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public String info() {return "First name " + fullName.getFirstName() + ", Last name " + fullName.getLastName() + ", Age " + age;}
    abstract public String activity();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
