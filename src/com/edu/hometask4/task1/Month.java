package com.edu.hometask4.task1;

import java.util.Scanner;

public class Month {
    public static int inputMonthNumber(Scanner sc) throws Exception {
        System.out.println("Input the month number: ");
        return sc.nextInt();
    }

    public static void printDayQuantity(int month, int days[]) {
        for (int i = 0; i <= days.length; i++) {
            if (month == i) {
                System.out.println("This month has " + days[i - 1]);
            }
        }
    }
}

