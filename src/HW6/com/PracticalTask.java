package HW6.com;

import HW6.com.model.animal.Animal;
import HW6.com.model.animal.Cat;
import HW6.com.model.animal.Dog;
import HW6.com.model.person.*;

public class PracticalTask {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Dolly", 5);
        animals[1] = new Cat("Sarah", 9);
        animals[2] = new Dog("Archie", 4);
        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
            animals[i].feed();
            System.out.println();


        }
        Person[] personArray = new Person[5];
        personArray[0] = new Teacher("Tamara");
        personArray[1] = new Teacher("Tatyana");
        personArray[2] = new Cleaner("Bill Gates");
        personArray[3] = new Student("Ilon Mask");
        personArray[4] = new Student("Cat Afonya");
        for (Person person : personArray) {
            person.print();
            if (person instanceof Stuff) {
                ((Stuff) person).salary();
            }
        }
    }
}
