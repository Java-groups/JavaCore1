package AllHomeWorks.HomeWork6Practical.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void doTask(BufferedReader br) throws IOException {
        ArrayList<Animal> animalsList = new ArrayList<>(
                Arrays.asList(
                        new Cat(),
                        new Dog(),
                        new Cat(),
                        new Dog()
                )
        );

        for (Animal animal: animalsList) {
            System.out.println(animal.voice() +" " +animal.feed());
        }
    }
}
