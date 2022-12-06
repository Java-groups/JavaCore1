import java.util.Objects;

public class Dog {
    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    private String name;
    private int age;
    private Breed breed;

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;
        return name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, breed);
    }
}
