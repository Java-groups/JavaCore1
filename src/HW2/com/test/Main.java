package HW2.com.test;

import HW2.com.test.model.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("name1", "name");
        Person person2 = new Person("name2", "name2");
        Person person3 = new Person("name3", "name3");
        Person person4 = new Person("name4", "name4");
        Person person5 = new Person("name", "name");
        person1.input();
        person1.output();
        person2.input();
        person2.output();
        person4.changeName("Admin", "Admin");
        person4.output();
        person5.input();
        person5.output();



    }
}
