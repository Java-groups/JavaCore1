package PracticalTask10_StringRegex;

import java.util.Scanner;

public class Task1 {
    // Enter the two variables of type String.
    // Determine whether the first variable substring second.
    // For example, if you typed «IT» and «IT Academy» you must receive true.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first variable: ");
        String text1 = scanner.nextLine().trim().toLowerCase();
        System.out.print("Input second variable: ");
        String text2 = scanner.nextLine().trim().toLowerCase();
        String[] arrText2 = text2.split(" ");
        int count = 0;
        for (String text : arrText2) {
            if (text.equals(text1)) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("true - " + count + " times");
        } else {
            System.out.println("false");
        }
    }
}
