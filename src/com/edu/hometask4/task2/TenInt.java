package com.edu.hometask4.task2;

import java.util.Scanner;

public class TenInt {


    public void fillIntStore(int[] intStore, Scanner sc) throws Exception {
        System.out.println("Insert array elements:");


        /*Fill array*/
        for (int i = 0; i < intStore.length; i++) {
            intStore[i] = sc.nextInt(); //Fill array with numbers by typing
        }
    }

    public void sumAndProductFind(int[] filledArray) {
        int sum = 0;
        int negMunCount = 0;

        for (int i = 0; i < 5; i++) {
            if (filledArray[i] < 0) {

                negMunCount++;//Catch if at least one negative number exist.
                System.out.println("Does not have all positive numbers here," +
                        " can`t find out sum of the first five positive numbers.");
                break;
            }
        }
        /*Find the sum the firsts five number if condition that
         negative numbers does not exist - ok*/
        if (negMunCount == 0) {
            for (int i = 0; i < 5; i++) {
                sum += filledArray[i];
            }
            System.out.println("Sum = " + sum);
        }
        /*Find the product of the remaining fives numbers if
        condition that at least one negative number exist is - ok*/
        int product = 1;
        if (negMunCount != 0) {
            for (int i = 5; i < 10; i++) {
                if (filledArray[i] > 0) {
                    product = product * filledArray[i];
                }
            }
            System.out.println("Product of the remaining five numbers= " + product);
        }
    }
}
























