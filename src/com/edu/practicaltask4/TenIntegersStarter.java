package com.edu.practicaltask4;


public class TenIntegersStarter {
    public static void main(String[] args) {
        int[] numbers = {-1, 1, -31, 1, -1, 1, -1, -108, 1, 1};

        int max = numbers[0];
        int imax = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
            imax = i;

        }
        System.out.println(max + " is max number(s) with index " + imax);
        int indexPositive = 0;
        int sumPositive = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                sumPositive = sumPositive + numbers[i];
                indexPositive++;

            }
        }
        System.out.println("Sum all positive numbers is " + sumPositive);

        int indexNegative = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                indexNegative++;
            }

        }
        System.out.println("Array has " + indexNegative + " negative number(s)");
        if (indexNegative > indexPositive) {
            System.out.println("Value of the negative numbers more then positive");
        }
        if (indexNegative < indexPositive) {
            System.out.println("Value of the positive numbers more then negative");
        }
        if (indexNegative == indexPositive) {
            System.out.println("Value of the positive and negative numbers is equal");

        }
    }
}






