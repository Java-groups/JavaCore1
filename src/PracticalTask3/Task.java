package PracticalTask3;

// Enter three numbers. Find out how many of them are odd

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input three integer numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        if (number1 % 2 == 0) {
            System.out.println("Number " + number1 + " even");
        }
        if (number2 % 2 == 0) {
            System.out.println("Number " + number2 + " even");
        }
        if (number3 % 2 == 0) {
            System.out.println("Number " + number3 + " even");
        }
    }
}
