package HM3.HomeWork.Task2;

public class Dog {
    String name;
    int age;
    String breed;

    public enum Breed {
        poodle, labrador, retriever, bulldog, shepherd
    }

    Breed breed1;

    Dog(String name, Breed breed1, int age) {
        this.name = name;
        this.age = age;
        this.breed = String.valueOf(breed1);
    }
}
