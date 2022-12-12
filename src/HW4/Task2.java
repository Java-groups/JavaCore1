package HW4;

import java.io.BufferedReader;
import java.util.Scanner;

public class Task2 {
    public static final int qty = 10;
    public static final int firstRow = 5;

    public static void inputAndCalculation() {
        int countPositive = 0;
        int sumPositive = 0;
        int multiplication = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input " + qty + " number type integer");
        int[] number = new int[qty];
        for (int i = 0; i < number.length; i++) {
            System.out.print("Number " + i + " : ");
            number[i] = scanner.nextInt();
            if (number[i] > 0 && i < firstRow) {
                countPositive++;
                sumPositive = sumPositive + number[i];
            } else if (i >= firstRow) {
                multiplication = multiplication * number[i];
            }
        }
        if (firstRow == countPositive) {
            System.out.println("sum = " + sumPositive);
        } else {
            System.out.println("mult = " + multiplication);
        }
    }

    public static void main(String[] args) {
        inputAndCalculation();
    }
}
