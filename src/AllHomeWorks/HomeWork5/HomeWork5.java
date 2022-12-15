package AllHomeWorks.HomeWork5;

import AllHomeWorks.HomeWork5.Task1.Task1;
import AllHomeWorks.HomeWork5.Task2.Task2;

import java.io.BufferedReader;
import java.io.IOException;

public class HomeWork5 {   public static void doSelectTask(BufferedReader br) throws IOException {
    int x = -1;
    do {
        System.out.println();
        System.out.println("Please, put the number of task:");
        System.out.println("1. About bird");
        System.out.println("2. About Employee");

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
