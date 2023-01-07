package AllHomeWorks.HomeWork11Practical.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void doTask(BufferedReader br) throws IOException {

        try {
            ArrayList<Plant> plantList = new ArrayList<>(
                    Arrays.asList(
                            new Plant("Chamomile", "Yellow", 22),
                            new Plant("Rose", "Red", 24),
                            new Plant("Knapweed", "Blue", 43),
                            new Plant("Rose", "Violet", 34),
                            new Plant("Chamomile", "brown", 12)
                    )
            );

            for (Plant plant : plantList) {
                plant.info();
            }
        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + "\n");
        }
    }
}
