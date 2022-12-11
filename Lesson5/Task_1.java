package Lesson5;

public class Task_1 {
    public static void main(String[] args) {
        int[] numbers = {7, 9, 3, 1, 8, -11, 67, 8, -47, 55};
        int max = numbers[0];
        int sum = 0;
        int amountNegative = 0, amountPositive = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] > 0) {
                sum += numbers[i];
                amountPositive++;
            }
        }
        for (int el : numbers) {
            if (el < 0) {
                amountNegative++;
            }
        }
        if (amountNegative > amountPositive) {
            System.out.println("There are more negative numbers");
        } else if (amountPositive > amountNegative) {
            System.out.println("There are more positive numbers");
        } else {
            System.out.println("There are same amount of positive and negative numbers");
        }

        System.out.println("Maximum = " + max);
        System.out.println("Sum of positive numbers = " + sum);
        System.out.println("Amount of negative numbers = " + amountNegative);

    }
}


