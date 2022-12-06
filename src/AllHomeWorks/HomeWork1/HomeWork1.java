package AllHomeWorks.HomeWork1;

import java.io.BufferedReader;
import java.io.IOException;

public class HomeWork1 {
    public static void doSelectTask(BufferedReader br) throws IOException {
        int x = -1;
        do {
            System.out.println();
            System.out.println("Please, put the number of task:");
            System.out.println("1. Calculate an area and perimeter.");
            System.out.println("2. SoftCollection");
            System.out.println("3. Calculate how many phone calls cost.");

            try {
                x = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {

            }

            switch (x) {
                case 1 -> FlowerBedParametersTask.doTask(br);
                case 2 -> SoftCollectionTask.doTask(br);
                case 3 -> KyivStarTask.doTask(br);
                case 0 -> {
                }
                default -> System.out.println("Wrong task number selected.");
            }
        }
        while (x != 0);

    }
}