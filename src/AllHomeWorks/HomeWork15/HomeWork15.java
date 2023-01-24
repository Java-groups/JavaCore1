package AllHomeWorks.HomeWork15;

import java.io.BufferedReader;

public class HomeWork15 {
    public static void doSelectTask(BufferedReader br) throws Exception {
        int x = -1;
        do {
            System.out.println();
            System.out.println("Please, put the number of task:");
            System.out.println("1. Task 1");
            System.out.println("2. Task2");

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
