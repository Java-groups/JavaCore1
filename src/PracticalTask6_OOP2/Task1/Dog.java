package PracticalTask6_OOP2.Task1;

public class Dog implements Animal {
private String nameDog;
private String breedDog;
private int ageDog;

    public Dog(String name, String breed, int age) {
        this.nameDog = name;
        this.breedDog = breed;
        this.ageDog = age;
    }

    public String getNameDog() {
        return nameDog;
    }

    public void setNameDog(String nameDog) {
        this.nameDog = nameDog;
    }

    public String getBreedDog() {
        return breedDog;
    }

    public void setBreedDog(String breedDog) {
        this.breedDog = breedDog;
    }

    public int getAgeDog() {
        return ageDog;
    }

    public void setAgeDog(int ageDog) {
        this.ageDog = ageDog;
    }

    @Override
    public void voice() {
        System.out.println("Dog " + getNameDog() + " breed " + getBreedDog() + " says woof woof woof");
    }

    @Override
    public void feed() {
        System.out.println("After 5 years our dog" + getNameDog() + " will be " + (getAgeDog() + 5) + " years old");
    }
}
