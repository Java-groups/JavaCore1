package AllHomeWorks.HomeWork10Practical;

import AllHomeWorks.HomeWork10Practical.Task1.Task1;
import AllHomeWorks.HomeWork10Practical.Task2.Task2;

import java.io.BufferedReader;
import java.io.IOException;

public class HomeWork10Practical {
    public static void doSelectTask(BufferedReader br) throws IOException {
        int x = -1;
        do {
            System.out.println();
            System.out.println("Please, put the number of task:");
            System.out.println("1. About Substring");
            System.out.println("2. About Surname");
//            System.out.println("3. About User name");

            try {
                x = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {

            }

            switch (x) {
                case 1 -> Task1.doTask(br);
                case 2 -> Task2.doTask(br);
//                case 3 -> Task3.doTask(br);

                case 0 -> {
                }
                default -> System.out.println("Wrong task number selected.");
            }
        }
        while (x != 0);

    }
}
