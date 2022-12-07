package AllHomeWorks.HomeWork3.Dog;

import java.io.BufferedReader;
import java.io.IOException;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog(){}

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
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

    public enum Breed {
        Terrier,
        Bulldog,
        Beagle
    }

    public void input(BufferedReader br) throws IOException {
        System.out.println("Enter Name:");
        String name = "";
        name = br.readLine();

        while (name.isEmpty()) {
            System.out.println("Name cannot be empty. Enter Name:");
            name = br.readLine();
        }
        this.setName(name);


        System.out.println("Change Breed:");
        int x = -1;

        do {
            System.out.println();
            System.out.println("Please, put the number of breed:");
            System.out.println("1. Terrier");
            System.out.println("2. Bulldog");
            System.out.println("3. Beagle");

            try {
                x = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {

            }

            switch (x) {
                case 1 -> setBreed(Breed.Terrier);
                case 2 -> setBreed(Breed.Bulldog);
                case 3 -> setBreed(Breed.Beagle);
                default -> System.out.println("Wrong task number selected.");
            }
        } while (x < 1 || x > 3);



        System.out.println("Enter Age:");
        int age = -1;
        try {
            age = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
        }
        while (age < 0) {
            System.out.println("Please input right age!");
            try {
                age = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
            }
        }
        this.setAge(age);
    }
}
