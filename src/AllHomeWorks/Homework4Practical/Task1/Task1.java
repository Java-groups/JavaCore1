package AllHomeWorks.Homework4Practical.Task1;

import Helper.InputHelper;

import java.io.BufferedReader;
import java.io.IOException;

public class Task1 {
    public static void doTask(BufferedReader br) throws IOException {
        int[] numbersArray = new int[10];
        int numberMax = 0;
        int Sum = 0;
        int countPos = 0;
        int countNeg = 0;

        for (int i = 0; i < 10; i++){
            numbersArray[i] = InputHelper.inputInteger(br);
            if (numbersArray[i] > 0){
                countPos++;
                Sum = Sum + numbersArray[i];
            } else if (numbersArray[i] < 0){
                countNeg++;
            }

            if ((numberMax == 0) || (numbersArray[i] > numberMax)) {
                numberMax = numbersArray[i];
            }

        }

        if (countPos > countNeg){
            System.out.println("The positive elements are more!");
        }else if (countPos < countNeg){
            System.out.println("The negative elements are more!");
        }else {
            System.out.println("Even quantity of positive and negative elements!");
        }

        System.out.println("******************************");
        System.out.println("The biggest element is " + numberMax);
        System.out.println("The sum of positive numbers = :" + Sum);
        System.out.println("The amount of negative element is " + countNeg);


    }
    public static int input(BufferedReader br) throws IOException {
        System.out.println("Enter Number:");
        int number = 0;
        boolean enteredFloat = false;

        try {
            number = Integer.parseInt(br.readLine());
            enteredFloat = true;
        } catch (NumberFormatException e) {

        }

        while (!enteredFloat) {
            System.out.println("Please input number!");
            try {
                number = Integer.parseInt(br.readLine());
                enteredFloat = true;
            } catch (NumberFormatException e) {

            }
        }
        return number;
    }

}
