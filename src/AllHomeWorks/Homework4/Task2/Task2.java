package AllHomeWorks.Homework4.Task2;

import Helper.InputHelper;
import java.io.BufferedReader;
import java.io.IOException;

public class Task2 {
    public static void doTask(BufferedReader br) throws IOException {
        int size = 10;
        int[] numbersArray = new int[size];
        int Sum = 0;
        int product = 1;
        boolean numberPositive = true;
        int i = 0;


        for (i = 0; i < size; i++) {
            System.out.println("Enter Number: " +i);
            numbersArray[i] = InputHelper.inputInteger(br);
        }
        for (i = 0; i < size; i++) {
            if (i< 5) {
                if (numbersArray[i] < 1){
                    numberPositive = false;
                }
                if (numberPositive) {
                    Sum = Sum + numbersArray[i];
                }
            } else {
                product = product * numbersArray[i];
            }
        }


        System.out.println("******************************");
        if (numberPositive) {
            System.out.println("The sum of first 5 numbers = :" + Sum);
        } else {
            System.out.println("The product of last 5 numbers = :" + product);
        }

    }

}
