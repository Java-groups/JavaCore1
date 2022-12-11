package HW3;

public class Dog {

    public enum Breed {
        RETRIEVER, LABRADOR, BEAGLE, SHEPHERD, POODLE, BULLDOG
    }

    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog " + getName() + " [" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && name.equals(dog.name) && breed == dog.breed;
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog("Jesi", Breed.BULLDOG, 2);
        Dog dog2 = new Dog("Jesi", Breed.SHEPHERD, 3);
        Dog dog3 = new Dog("Toby", Breed.LABRADOR, 1);
        Dog dog4 = new Dog("Apollo", Breed.POODLE, 2);

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);

        if (dog1.name.equals(dog2.name) || dog1.name.equals(dog3.name) || dog1.name.equals(dog4.name) || dog2.name.equals(dog3.name) ||
        dog2.name.equals(dog4.name) || dog3.name.equals(dog4.name)){
            System.out.println("\nThere is two dogs with the same name");
        } else {
            System.out.println("\nТo two dogs have the same name");
        }
        int maxAge = 0;
        String nameMaxEge = null;
        if (maxAge < dog1.getAge()) {
            maxAge = dog1.getAge();
            nameMaxEge = dog1.getName();
        }
        if (maxAge < dog2.getAge()) {
            maxAge = dog2.getAge();
            nameMaxEge = dog2.getName();
        }
        if (maxAge < dog3.getAge()) {
            maxAge = dog3.getAge();
            nameMaxEge = dog3.getName();
        }
        if (maxAge < dog4.getAge()) {
            maxAge = dog4.getAge();
            nameMaxEge = dog4.getName();
        }

        System.out.println("\nSenior dog: \n name: " + nameMaxEge + "\n age: " +maxAge);
    }
}







