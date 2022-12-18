package hw4;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chosenMonth = sc.nextInt();
        System.out.println("Number of days in month: " + getDaysInMonth(chosenMonth));
    }

    public static int getDaysInMonth(int monthIndex) {
        if (monthIndex < 0 || monthIndex > 12) {
            return 0;
        }
        int[] amountDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return amountDays[monthIndex - 1];
    }
}
