package AllHomeWorks.HomeWork1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork1 {
    public static void doSelectTask() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x;
        do {
            System.out.println();
            System.out.println("Please, put the number of task:");
            System.out.println("1. Calculate an area and perimeter.");
            System.out.println("2. SoftCollection");
            System.out.println("3. Calculate how many phone calls cost.");
            x = Integer.parseInt(br.readLine());

            switch (x) {
                case 1 -> FlowerBedParametersTask.doTask();
                case 2 -> SoftCollectionTask.doTask();
                case 3 -> KyivStarTask.doTask();
                case 0 -> {
                }
                default -> System.out.println("Wrong task number selected.");
            }
        }
        while (x != 0);

    }
}