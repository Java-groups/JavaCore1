package AllHomeWorks.HomeWork5Practical;

import AllHomeWorks.HomeWork5Practical.Task1.Task1;
import AllHomeWorks.HomeWork5Practical.Task2.Task2;

import java.io.BufferedReader;
import java.io.IOException;

public class HomeWork5Practical {
    public static void doSelectTask(BufferedReader br) throws IOException {
        int x = -1;
            do {
                System.out.println();
                System.out.println("Please, put the number of task:");
                System.out.println("1. Work with Lines.");
                System.out.println("2. About Car");

                try {
                    x = Integer.parseInt(br.readLine());
                } catch (NumberFormatException e) {

            }

            switch (x) {
                case 1 -> Task1.doTask(br);
                case 2 -> Task2.doTask(br);

                case 0 -> {
                }
                default -> System.out.println("Wrong task number selected.");
            }
        }
        while (x != 0);

    }

}
