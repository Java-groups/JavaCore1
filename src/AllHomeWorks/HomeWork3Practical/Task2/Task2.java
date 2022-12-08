package AllHomeWorks.HomeWork3Practical.Task2;

import java.io.BufferedReader;
import java.io.IOException;

public class Task2 {
    public static void doTask(BufferedReader br) throws IOException {
        int x = -1;
        do {
            System.out.println();
            System.out.println("Please, put the number Day of Week (1-7):");

            try {
                x = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {

            }

            switch (x) {
                case 1 -> System.out.println("Monday. Понеділок");
                case 2 -> System.out.println("Tuesday. Вівторок");
                case 3 -> System.out.println("Wednesday. Середа");
                case 4 -> System.out.println("Tuesday. Четвер");
                case 5 -> System.out.println("Friday. П'ятниця");
                case 6 -> System.out.println("Saturday. Субота");
                case 7 -> System.out.println("Sunday. Неділя");

                case 0 -> {
                }
                default -> System.out.println("Please input number from 1 to 7, or 0 - for exit:");
            }
        }
        while (x != 0);

    }
}


