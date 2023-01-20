package Lesson12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number ");
            int input1 = sc.nextInt();
            System.out.print("Enter second number ");
            int input2 = sc.nextInt();
            System.out.println(squareRectangle(input1, input2));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: negative value was input");
        } catch (InputMismatchException e) {
            System.out.println("Error: non-numeric value was input");
        }
        System.out.println("Done");
    }

    private static int squareRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Both values should be > 0 !");
        }
        return a * b;
    }
}
