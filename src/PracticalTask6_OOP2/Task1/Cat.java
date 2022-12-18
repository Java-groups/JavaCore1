package PracticalTask6_OOP2.Task1;

public class Cat implements Animal {

    private String nameCat;
    private String breedCat;
    private int ageCat;

    public Cat(String name, String breed, int age) {
        this.nameCat = name;
        this.breedCat = breed;
        this.ageCat = age;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public String getBreedCat() {
        return breedCat;
    }

    public void setBreedCat(String breedCat) {
        this.breedCat = breedCat;
    }

    public int getAgeCat() {
        return ageCat;
    }

    public void setAgeCat(int ageCat) {
        this.ageCat = ageCat;
    }

    @Override
    public void voice() {
        System.out.println("Cat " + getNameCat() + " breed " + getBreedCat() + " says meow, meow, meow");
    }

    @Override
    public void feed() {
        System.out.println("After 2 years our cat" + getNameCat() + " will be " + (getAgeCat() + 2) + " years old");
    }
}
