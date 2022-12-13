package AllHomeWorks.HomeWork5.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void doTask(BufferedReader br) throws IOException {
        ArrayList<Bird> birdsList = new ArrayList<>(
                Arrays.asList(
                        new Eagle("Lay eggs", "Yes", "Golden Eagle"),
                        new Swallow("Lay eggs", "Yes", "Bahama Swallow"),
                        new Penguin("Lay eggs", "Yes", "King Penguin"),
                        new Chicken("Lay eggs", "No", "Small Chicken")
                )
        );

        for (Bird bird: birdsList){
            bird.fly();
        }
    }
}

