package com.edu.hometask4.task3;

import java.util.Arrays;
import java.util.Scanner;

public class FiveInt {


    public static void input(int[] fiveInts, Scanner sc) throws Exception {
        System.out.println("Insert array elements:");
        /*Fill array*/
        for (int i = 0; i < fiveInts.length; i++) {
            fiveInts[i] = sc.nextInt(); //Fill array with numbers by typing
        }
    }

    public static void findPositSecPosNum(int[] fiveInts) {

        int tmp = 0;

        for (int i = 0; i < fiveInts.length; i++) {

            if (fiveInts[i] > 0) {
                tmp++;
                if (tmp == 2) {
                    System.out.println("Second positive number is " + fiveInts[i]);
                }
            }
        }
        if (tmp < 2) {
            System.out.println("Please input at least two positive" +
                    " numbers in the array");
        }
    }

    public static void findMinAndPosit(int[] fiveInts) {
        int min = fiveInts[0];
        int imin = 0;
        int i = 0;
        while (i < fiveInts.length) {
            if (fiveInts[i] < min) {
                min = fiveInts[i];
                imin = i;
            }
            i++;
        }
        System.out.println("Minimum number: " + min + ", its position in the array: " + (imin + 1));

    }

    public static void findEvenNumProduct(int[] fiveInts) {
        int product = 1;

        int i = 0;

        while (i < fiveInts.length) {
            if (fiveInts[i] % 2 == 0) {
                product *= fiveInts[i];

            }
            i++;
        }
        System.out.println("Product of the even numbers: " + product);
    }
}










