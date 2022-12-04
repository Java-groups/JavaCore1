package hw2;

public class Application {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.input();

        Person p2 = new Person("Freddie", "Mercury");

        Person p3 = new Person();
        p3.setFirstName("Brian");
        p3.setLastName("May");
        p3.setBirthYear(1947);

        Person p4 = new Person();
        p4.changeName("Roger", "Taylor");

        Person p5 = new Person("Adam", "Lambert");
    }
}