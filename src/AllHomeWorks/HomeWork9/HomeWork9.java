package AllHomeWorks.HomeWork9;

import AllHomeWorks.HomeWork9.Task2.Task2;

import java.io.BufferedReader;
import java.io.IOException;

public class HomeWork9 {
    public static void doSelectTask(BufferedReader br) throws IOException {
        int x = -1;
        do {
            System.out.println();
            System.out.println("Please, put the number of task:");
            System.out.println("2. About PersonMap");

            try {
                x = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {

            }

            switch (x) {
                case 2 -> Task2.doTask(br);

                case 0 -> {
                }
                default -> System.out.println("Wrong task number selected.");
            }
        }
        while (x != 0);

    }

}