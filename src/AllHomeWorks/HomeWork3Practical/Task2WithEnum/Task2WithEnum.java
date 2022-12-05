package AllHomeWorks.HomeWork3Practical.Task2WithEnum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2WithEnum {
    public static void doTask() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = -1;
        WeekDay selectedWeekDay = null;

        do {
            System.out.println();
            System.out.println("Please, put the number Day of Week (1-7):");

            try {
                x = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {

            }

            switch (x) {
                case 1 -> selectedWeekDay = WeekDay.Monday;
                case 2 -> selectedWeekDay = WeekDay.Tuesday;
                case 3 -> selectedWeekDay = WeekDay.Wednesday;
                case 4 -> selectedWeekDay = WeekDay.Thursday;
                case 5 -> selectedWeekDay = WeekDay.Friday;
                case 6 -> selectedWeekDay = WeekDay.Saturday;
                case 7 -> selectedWeekDay = WeekDay.Sunday;

                case 0 -> {
                    return;
                }
                default -> System.out.println("Please input number from 1 to 7, or 0 - for exit:");
            }
        } while (x <1 || x>7);
        System.out.println(selectedWeekDay.getEn() + ". "+selectedWeekDay.getUa());

    }
}


