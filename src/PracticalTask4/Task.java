package PracticalTask4;

import java.util.Arrays;

public class Task {

    public static int maxNumbers(int[] num) {
        Arrays.sort(num);
        return num[num.length - 1];
    }

    public static int sumPositive(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                sum = num[i] + sum;
            }
        }
        return sum;
    }

    public static int quantityNegative(int[] num) {
        int quantity = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                //System.out.println(num[i]);
                quantity ++;
            }
        }
        return quantity;
    }


    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, -7, 8, 9, -1, 4, 5, -6};

        // Display the biggest of these numbers
        System.out.println("max = " + maxNumbers(numbers));

        // Display the sum of positive numbers in the array;
        System.out.println("Sum of positive numbers = " + sumPositive(numbers));

        // Display the amount of negative numbers in the array
        System.out.println("Amount of negative numbers in the array = " + quantityNegative(numbers));

        // What values there are more: negative or positive?
        String x = quantityNegative(numbers) < (numbers.length - quantityNegative(numbers)) ? "pozitiv big" : " negativ big";
        System.out.println(x);
    }
}
