package AllHomeWorks.Homework4.Task1;

import Helper.InputHelper;

import java.io.BufferedReader;
import java.io.IOException;

public class Task1 {
    public static void doTask(BufferedReader br) throws IOException {
        int monthNumber = -1;

        do {
            monthNumber = inputMonthNumber(br);

            if (monthNumber == 0) {
                return;
            } else {
                for (Months month : Months.values()) {
                    if (month.getMonthNumber() == monthNumber) {
                        System.out.println(month.getMonth() + " has - " + month.getDay());
                        break;
                    }
                }
            }
        }  while (monthNumber > 12 || monthNumber < 0) ;

    }
    public static int inputMonthNumber(BufferedReader br) throws IOException {
        System.out.println("---------------------------------------------");
        System.out.println("Enter Number of Month:");
        int monthNumber = -1;
        try {
            monthNumber = InputHelper.inputInteger(br);
        } catch (NumberFormatException ignored) {}
        while (monthNumber <= 0) {
            System.out.println("Incorrect Value!");
            System.out.println("Please input Number of Month:");
            try {
                monthNumber = InputHelper.inputInteger(br);

            } catch (NumberFormatException ignored) {}
        }
        return monthNumber;

    }
}
