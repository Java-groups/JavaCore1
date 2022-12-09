package AllHomeWorks.Homework4Practical;

import AllHomeWorks.Homework4Practical.Task1.Task1;
import AllHomeWorks.Homework4Practical.Task2.Task2;

import java.io.BufferedReader;
import java.io.IOException;

public class Homework4Practical {
    public static void doSelectTask(BufferedReader br) throws IOException {
        int x = -1;
        do {
            System.out.println();
            System.out.println("Please, put the number of task:");
            System.out.println("1. Array of 10 integers.");
            System.out.println("2. Employee");

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
