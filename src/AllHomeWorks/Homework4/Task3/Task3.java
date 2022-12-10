package AllHomeWorks.Homework4.Task3;

import Helper.InputHelper;

import java.io.BufferedReader;
import java.io.IOException;

public class Task3 {
    public static void doTask(BufferedReader br) throws IOException {
        int size = 5;
        int[] numbersArray = new int[size];
        int numberMin = 0;
        int positiveCount = 0;
        int position = 0;
        int i;
        int numberProduct = 1;
        boolean numberPosition = false;
        boolean numberEven = true;


        for (i = 0; i < size; i++) {
            System.out.println("Enter Number: " + i);
            numbersArray[i] = InputHelper.inputInteger(br);
        }

        for (i = 0; i < size; i++) {
            int x = numbersArray[i];

            if (x > 0) {
                positiveCount++;
            }
            if (positiveCount == 2) {
                numberPosition = true;
            }

            if (numbersArray[i] < numberMin){
                numberMin = numbersArray[i];
                position = i;
            }

            if (numbersArray[i]%2 == 0){
                numberProduct = numberProduct * numbersArray[i];
                numberEven = true;
            } else {
                numberEven = false;
            }
        }


        System.out.println("******************************");
        if (numberPosition) {
            System.out.println("1. Position of second positive number - " + i);
        } else {
            System.out.println("1. There are no second positive number");
        }
        System.out.println("2. Minimum number of array = " + numberMin + ". It`s position is " +position);
        if (numberEven) {
            System.out.println("3. Product all even numbers = " + numberProduct);
        } else {
            System.out.println("3. There are no even numbers!");

        }

    }

}
