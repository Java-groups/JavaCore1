package hw4;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("[" + i + "]: ");
            numbers[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                sum +=numbers[i];
            }else{
                sum = -1;
                break;
            }
        }
        if (sum > 0) {
            System.out.println("Sum of first five numbers = " + sum);
        } else {
            int prod = 1;
            for (int i = 5; i < numbers.length - 1 ; i++) {
                prod *= numbers[i];
            }
            System.out.println("Product of last five numbers = " + prod);
        }
    }
}
