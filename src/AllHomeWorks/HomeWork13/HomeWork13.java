package AllHomeWorks.HomeWork13;

import AllHomeWorks.HomeWork13.Task1.Task1;

import java.io.BufferedReader;

public class HomeWork13 {
    public static void doSelectTask(BufferedReader br) throws Exception {
        int x = -1;
        do {
            System.out.println();
            System.out.println("Please, put the number of task:");
            System.out.println("1. About Product");

            try {
                x = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {

            }

            switch (x) {
                case 1 -> Task1.doTask(br);

                case 0 -> {
                }
                default -> System.out.println("Wrong task number selected.");
            }
        }
        while (x != 0);

    }
}
