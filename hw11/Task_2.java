package hw11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println(readNumber(1, 10));
            System.out.println(readNumber(10, 20));
            System.out.println(readNumber(20, 30));
            System.out.println(readNumber(30, 40));
            System.out.println(readNumber(40, 50));
            System.out.println(readNumber(50, 60));
            System.out.println(readNumber(70, 80));
            System.out.println(readNumber(90, 100));
            System.out.println(readNumber(100, 110));
            System.out.println(readNumber(110, 120));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: non-numeric value was input");
        }
    }

    private static int readNumber(int start, int end) {
        System.out.print("Enter a number ");
        int input = sc.nextInt();
        if (input >= start && input <= end) {
            return input;
        }
        throw new IllegalArgumentException(String.format("Number %d is out of range %d : %d", input, start, end));
    }
}
