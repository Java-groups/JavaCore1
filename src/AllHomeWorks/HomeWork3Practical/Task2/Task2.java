package AllHomeWorks.HomeWork3Practical.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void doTask() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = -1;
        do {
            System.out.println();
            System.out.println("Please, put the number Day of Week (1-7):");

            try {
                x = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {

            }

            switch (x) {
                case 1 -> System.out.println("Asia. Понеділок");
                case 2 -> System.out.println("Africa. Вівторок");
                case 3 -> System.out.println("Europe. Середа");
                case 4 -> System.out.println("Africa. Четвер");
                case 5 -> System.out.println("SouthAmerica. П'ятниця");
                case 6 -> System.out.println("Australia. Субота");
                case 7 -> System.out.println("Antarctica. Неділя");

                case 0 -> {
                }
                default -> System.out.println("Please input number from 1 to 7, or 0 - for exit:");
            }
        }
        while (x != 0);

    }
}


