package edu.homeworks.hw4.Month;

import edu.homeworks.homework4.practicalTask.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Months {
    public int numberMonth;

    public int getNumberMonth() {
        return numberMonth;
    }

    public void setNumberMonth(int numberMonth) {
        this.numberMonth = numberMonth;
    }

    Months() {

    }


    public void outputMonth(Scanner input) {
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Enter number of month: ");
        numberMonth = input.nextInt();
        if(numberMonth<=month.length){
           for (int i = 0; i <= month.length; i++) {
               if (numberMonth == i) {
                   System.out.println("In this month " + month[i - 1] + " days");
               }
           }
       } else System.out.println("Your write number more or less 12");
    }
}

