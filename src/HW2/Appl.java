package HW2;

import java.io.IOException;

public class Appl {

    public static void main(String[] args) throws IOException {

        Person person1 = new Person();
        person1.input();
        person1.output();
        System.out.println();

        Person person2 = new Person();
        person2.setFirstName("Kateryna");
        person2.setLastName("Petrova");
        person2.setBirthYear(1947);
        person2.output();
        System.out.println();

        Person person3 = new Person();
        person3.input();
        person3.output();
        System.out.println();

        Person person4 = new Person("Nikita", "Biluk");
        person4.setBirthYear(1997);
      //  person4.output();
        System.out.println(person4);

        Person person5 = new Person();
        person5.input();
        person5.output();
        System.out.println();
        person5.changeName("Dmytro", "Harmash");
        person5.output();

    }
}
