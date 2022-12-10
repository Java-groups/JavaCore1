package AllHomeWorks.Homework4.Task2;

import java.io.BufferedReader;
import java.io.IOException;

public class Task2 {
    public static void doTask(BufferedReader br) throws IOException {
        int[] numbersArray = new int[10];
        int Sum = 0;
        int product = 1;
        boolean numberPositive = true;
        int i = 0;


        for (i = 0; i < 10; i++) {
            System.out.println("Enter Number: " +i);
            numbersArray[i] = input(br);
        }
        for (i = 0; i < 10; i++) {
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

    public static int input(BufferedReader br) throws IOException {

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
