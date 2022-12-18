package PracticalTask6_OOP2.Task1;

public class MainAnimal {

    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        animals[0] = new Cat("Murka", "British Shorthair", 3);
        animals[1] = new Dog("Jessi", "German Shepherd", 4);

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
            System.out.println();
        }
    }
}
