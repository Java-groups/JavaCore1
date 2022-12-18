package hw4;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("[" + i + "]: ");
            numbers[i] = sc.nextInt();
        }

        int tmp = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (tmp == 0) {
                    tmp = numbers[i];
                } else {
                    System.out.println("Position of second positive number is " + ++i);
                    break;
                }
            }
        }

        int min = numbers[0];
        int imin = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                imin = i;
            }
        }
        System.out.print("Minimum number = " + min);
        System.out.println(" is in " + (imin + 1) + " position");

        int prod = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                prod *= numbers[i];
            }
        }
        System.out.print("The product of all entered even numbers is  " + prod);
    }
}




