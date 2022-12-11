package HW2;

public class Main {


    public static void main(String[] args) {

        Person person1 = new Person();
        person1.input();
        Person person2 = new Person();
        person2.input();
        Person person3 = new Person();
        person3.input();
        Person person4 = new Person();
        person4.input();
        Person person5 = new Person();
        person5.input();

        person1.output(person1);
        person2.output(person2);
        person3.output(person3);
        person4.output(person4);
        person5.output(person5);

        person1.changeName(person1.getFirstName(), person1.getLastName());
        person1.output(person1);
    }
}
