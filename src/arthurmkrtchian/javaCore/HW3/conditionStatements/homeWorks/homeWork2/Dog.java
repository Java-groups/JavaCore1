package arthurmkrtchian.javaCore.HW3.conditionStatements.homeWorks.homeWork2;

import java.util.Objects;

public class Dog {
    private String name;
    private int age;
    private Breed breed;


    public Dog(String name, int age, Breed breed) {
        this.name = name;
        setAge(age);
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    @Override                                 //Сгенерила IDEшка і начебто все зрозуміло тут.
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return name.equals(dog.name);
    }

    @Override   //Сгенерила IDEшка, але не все зрозуміло. Треба почитати ще про hashCode.
    public int hashCode() {
        return Objects.hash(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 20) {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Age can`t be bigger than 29 and less than 0\n" +
                    "Value setted to 0. To change it use setAge method.\n" +
                    "Bluey is the oldest dog ever verified: https://en.m.wikipedia.org/wiki/Bluey_(dog)");
            System.out.println("---------------------------------------------------------------------------------------");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }
}
