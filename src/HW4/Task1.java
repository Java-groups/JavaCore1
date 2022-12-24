package HW4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of month");
        int numberOfMonth = Integer.parseInt(sc.nextLine());
        System.out.println("Number of days in month: " + getDaysInMonth(numberOfMonth));
    }

    public static int getDaysInMonth(int numberOfMonth) {
        if (numberOfMonth < 0 || numberOfMonth > 12) {
            return 0;
        }
        int[] amountDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return amountDays[numberOfMonth - 1];
    }
}