package HM4.HomeWork.Task2;

import java.util.Arrays;
import java.util.Scanner;

//Task description
//Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.


public class Main {
    public static void main(String[] args) {

        //Entering numbers for the array
        Scanner sc = new Scanner(System.in);
        int[] intNumbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter an integer number");
            intNumbers[i] = sc.nextInt();
        }

        //whether the first 5 numbers are positive
        int firstElements = 5;
        int firstElementsAmount = 0;

        for (int i = 0; i < firstElements; i++) {
            if (intNumbers[i] > 0) {
                firstElementsAmount++;
            }
        }

        // Task implementation
        int intSum = 0;
        int intProduct = 1;

        if (firstElementsAmount == firstElements) {
            for (int i = 0; i < firstElements; i++) {
                if (intNumbers[i] > 0) {
                    intSum +=intNumbers[i];
                }
            }
            System.out.println("The sum of the first " + firstElements + " elements is " + intSum);
        }
        else {
            for (int i = firstElements - 1; i < intNumbers.length - 1; i++) {
                intProduct *= intNumbers[i];
            }
            System.out.println("The product of the last " + (intNumbers.length - firstElements) + " elements is " + intProduct);
        }
    }
}
