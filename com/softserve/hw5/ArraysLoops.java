package com.softserve.hw5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraysLoops {

    int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int monthNumber;
    private int[] tenNumbers = new int[10];
    private int[] secondPositive = new int[5];

    public static void main(String[] args) throws IOException {
        ArraysLoops al = new ArraysLoops();
//        al.daysInMonth();
//        al.tenNumbers();
        al.secondPositive();
    }

    public void daysInMonth() throws IOException {
        System.out.println("Input month number: ");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        monthNumber = Integer.parseInt(input.readLine());
        monthNumber--;
        System.out.println("Number of days of the month is: " + daysInMonth[monthNumber]);
    }

    public void tenNumbers() throws IOException {
        System.out.println("Input 10 numbers: ");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            tenNumbers[i] = Integer.parseInt(input.readLine());
        }

        int sum = 0;
        int multiply = 1;

        for (int i = 0; i < 5; i++) {
        if (tenNumbers[i] > 0) {
                sum += tenNumbers[i];
            }
        }

        if (sum > 0) {
            System.out.println("5 first added numbers: " + sum);
        } else {
                for (int i = 5; i < 10; i++) {
                    multiply *= tenNumbers[i];
                }
            System.out.println("5 last multiplied numbers: " + multiply);
        }
    }

    public void secondPositive() throws IOException {

        System.out.println("Input 5 numbers: ");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            secondPositive[i] = Integer.parseInt(input.readLine());
        }

        int i = 0;
        int loop = 0;
        int min = 0;
        int arrayMin = secondPositive[0];
        int evenNumb = 1;
        while (i < secondPositive.length) {
            if (secondPositive[i] > 0) {
                loop++;
            }
            if (loop == 2) {
                System.out.println("The second posivite number is: " + secondPositive[i]);
            }

            if (secondPositive[i] < min) {
                arrayMin = secondPositive[i];
                min = i;
            }
            if (secondPositive[i] % 2 == 0) {
                evenNumb *= secondPositive[i];
            }
            i++;
        }
        System.out.println("The product of even numbers is: " + evenNumb);
        System.out.println("The min element is: " + arrayMin + " and it's position is: " + ++min);
    }
}
