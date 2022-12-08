package AllHomeWorks.HomeWork3;

import AllHomeWorks.HomeWork3.Dog.Task2;
import AllHomeWorks.HomeWork3.Task1.Task1;

import java.io.BufferedReader;
import java.io.IOException;

public class HomeWork3 {
    public static void doSelectTask(BufferedReader br) throws IOException {
        int x = -1;
        do {
            System.out.println();
            System.out.println("Please, put the number of task or 0 for exit:");
            System.out.println("1. Work with numbers and HTTP errors.");
            System.out.println("2. About dog");

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
