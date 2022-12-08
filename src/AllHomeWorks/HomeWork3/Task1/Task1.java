package AllHomeWorks.HomeWork3.Task1;

import AllHomeWorks.HomeWork3.Task1.Part1.Part1;
import AllHomeWorks.HomeWork3.Task1.Part2.Part2;
import AllHomeWorks.HomeWork3.Task1.Part3.Part3;

import java.io.BufferedReader;
import java.io.IOException;

public class Task1 {
    public static void doTask(BufferedReader br) throws IOException {
        int x = -1;
        do {
            System.out.println();
            System.out.println("Please, put the number of task or 0 for exit:");
            System.out.println("1. Float numbers.");
            System.out.println("2. Integer numbers");
            System.out.println("3. HTTP Errors");

            try {
                x = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {

            }

            switch (x) {
                case 1 -> Part1.doTask(br);
                case 2 -> Part2.doTask(br);
                case 3 -> Part3.doTask(br);

                case 0 -> {
                }
                default -> System.out.println("Wrong task number selected.");
            }
        }
        while (x != 0);

    }
}
