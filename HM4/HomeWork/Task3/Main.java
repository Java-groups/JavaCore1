package HM4.HomeWork.Task3;

import java.util.Scanner;

//Task description
//        Enter 5 integer numbers. Find
//        position of second positive number;
//        minimum and its position in the array.
//        Count the product of all entered even numbers.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intNumberAmount = 5;
        int[] intNumbers = new int[intNumberAmount];

        for (int i = 0; i < intNumberAmount; i++) {
            System.out.println("Enter an integer number");
            intNumbers[i] = sc.nextInt();
        }

        //Position of the second positive number
        int intPosition = 0;
        int secondPositiveNum = 0;
        for (int i = 0; i < intNumberAmount; i++) {
            if (intNumbers[i] > 0) {
                secondPositiveNum++;
            }
            intPosition++;
            if (secondPositiveNum == 2) {
                System.out.println(intPosition + " is the position of the second positive number");
                break;}

            if ((secondPositiveNum != 2) && (i == (intNumberAmount - 1))) {
                System.out.println("There was no 2 positive numbers entered");
            }
        }

        //Minimum and its position in the array
        int position = 0;
        int minPosition = 0;
        int min = intNumbers[0];
        for (int i = 0; i < intNumberAmount - 1; i++) {
            if (min > intNumbers[i+1]) {
                min = intNumbers[i+1];
                minPosition = position + 1;
            }
            position++;
        }
        System.out.println(min + " is the minimum number and it has position " + (minPosition + 1) + " in the array");

        //Product of all entered even numbers
        int product = 1;
        int evenNumAmount = 0;
        for (int i = 0; i < intNumberAmount; i++) {
            if (intNumbers[i] % 2 == 0) {
                product *= intNumbers[i];
                evenNumAmount++;
            }
        }
        if (evenNumAmount == 0) {
            System.out.println("There was no even numbers entered");
        }
        else {System.out.println(product + " is the product of all entered even numbers");}
    }
}
